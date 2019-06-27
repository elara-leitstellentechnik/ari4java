package ch.loway.oss.ari4java.tools.http;

import ch.loway.oss.ari4java.tools.HttpClient;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import ch.loway.oss.ari4java.tools.HttpResponseHandler;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.WsClient;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * HTTP and WebSocket client implementation based on netty.io.
 *
 * Threading is handled by NioEventLoopGroup, which selects on multiple
 * sockets and provides threads to handle the events on the sockets.
 *
 * Requires netty-all-4.0.12.Final.jar
 *
 * @author mwalton
 *
 */
public class NettyHttpClient implements HttpClient, WsClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(NettyHttpClient.class);

    public static final int MAX_HTTP_REQUEST_KB = 16 * 1024;

	private ChannelFuture persistentChannelFuture;
	private final LinkedList<HttpPipeliningRequest> queue = new LinkedList<>();

    private Bootstrap bootStrap;
    private URI baseUri;
    private EventLoopGroup group;
    private EventLoopGroup shutDownGroup;
    private String username;
    private String password;

    private HttpResponseHandler wsCallback;
    private WsClientConnection wsClientConnection;
    private ChannelFuture wsChannelFuture;
    private ScheduledFuture<?> wsPingTimer = null;
    private NettyWSClientHandler wsHandler;
    private ChannelFutureListener wsFuture;

    public NettyHttpClient() {
        group = new NioEventLoopGroup();
        shutDownGroup = new NioEventLoopGroup();
    }

    public void initialize(String baseUrl, String username, String password) throws URISyntaxException {
        this.username = username;
        this.password = password;
        baseUri = new URI(baseUrl);
        String protocol = baseUri.getScheme();
        if (!"http".equals(protocol)) {
            throw new IllegalArgumentException("Unsupported protocol: " + protocol);
        }
        // Bootstrap is the factory for HTTP connections
        bootStrap = new Bootstrap();
        bootStrap.group(group);
        bootStrap.channel(NioSocketChannel.class);
        bootStrap.handler(new ChannelInitializer<SocketChannel>() {

            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast("http-codec", new HttpClientCodec());
                pipeline.addLast("aggregator", new HttpObjectAggregator( MAX_HTTP_REQUEST_KB * 1024));
                pipeline.addLast("http-handler", new NettyHttpClientHandler(queue));
            }
        });
    }

    public void destroy() {
        // use a different event group to execute the shutdown to avoid deadlocks
        shutDownGroup.schedule(new Runnable() {
            @Override
            public void run() {
                if (wsClientConnection != null) {
                    try {
                        wsClientConnection.disconnect();
                    } catch (RestException e) {
                        // not bubbling exception up, just ignoring
                    }
                }
                if (group != null && !group.isShuttingDown()) {
                    group.shutdownGracefully(5, 10, TimeUnit.SECONDS).addListener(future -> {
                        shutDownGroup.shutdownGracefully(5, 10, TimeUnit.SECONDS);
                        shutDownGroup = null;
                    }).syncUninterruptibly();
                    group = null;
                }
            }
        }, 250L, TimeUnit.MILLISECONDS);
    }

    private String buildURL(String path, List<HttpParam> parametersQuery, boolean withAddress) throws UnsupportedEncodingException {
        StringBuilder uriBuilder = new StringBuilder();
        if (withAddress) {
            uriBuilder.append(baseUri);
        } else {
            uriBuilder.append(baseUri.getPath());
        }
        uriBuilder.append("ari");
        uriBuilder.append(path);
        uriBuilder.append("?api_key=");
        uriBuilder.append(URLEncoder.encode(username, "UTF-8"));
        uriBuilder.append(":");
        uriBuilder.append(URLEncoder.encode(password, "UTF-8"));
        if (parametersQuery != null) {
            for (HttpParam hp : parametersQuery) {
                if (hp.value != null && !hp.value.isEmpty()) {
                    uriBuilder.append("&");
                    uriBuilder.append(hp.name);
                    uriBuilder.append("=");
                    uriBuilder.append(URLEncoder.encode(hp.value, "UTF-8"));
                }
            }
        }
        return uriBuilder.toString();
    }

    // Factory for WS handshakes
    private WebSocketClientHandshaker getWsHandshake(String path, List<HttpParam> parametersQuery) throws UnsupportedEncodingException {
        String url = buildURL(path, parametersQuery, true);
        try {
            if (url.regionMatches(true, 0, "http", 0, 4)) {
                // http(s):// -> ws(s)://
                url = "ws" + url.substring(4);
            }
            URI uri = new URI(url);
            return WebSocketClientHandshakerFactory.newHandshaker(
                    uri, WebSocketVersion.V13, null, false, null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Build the HTTP request based on the given parameters
    private HttpRequest buildRequest(String host, String path, String method, List<HttpParam> parametersQuery, List<HttpParam> parametersBody) throws UnsupportedEncodingException {
        String url = buildURL(path, parametersQuery, false);
        FullHttpRequest request = new DefaultFullHttpRequest(
                HttpVersion.HTTP_1_1, HttpMethod.valueOf(method), url);
        //System.out.println(request.getUri());
        if (parametersBody != null && !parametersBody.isEmpty()) {
            String vars = makeBodyVariables(parametersBody);
            ByteBuf bbuf = Unpooled.copiedBuffer(vars, StandardCharsets.UTF_8);

            request.headers().add(HttpHeaderNames.CONTENT_TYPE, "application/json");
            request.headers().set(HttpHeaderNames.CONTENT_LENGTH, bbuf.readableBytes());
            request.content().clear().writeBytes(bbuf);
        }
        request.headers().set(HttpHeaderNames.HOST, host);
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        return request;
    }

    private String makeBodyVariables(List<HttpParam> variables) {
        StringBuilder varBuilder = new StringBuilder();
        varBuilder.append("{").append("\"variables\": {");
        Iterator<HttpParam> entryIterator = variables.iterator();
        while(entryIterator.hasNext()) {
            HttpParam param = entryIterator.next();
            varBuilder.append("\"").append(param.name).append("\"").append(": ").append("\"").append(param.value).append("\"");
            if (entryIterator.hasNext()) {
                varBuilder.append(",");
            }
        }
        varBuilder.append("}}");

        return varBuilder.toString();
    }

    private static RestException makeException(HttpResponseStatus status, String response, List<HttpResponse> errors) {

        if (status == null ) {
            return new RestException("Shutdown: " + response, false);
        }

        for (HttpResponse hr : errors) {
            if (hr.code == status.code()) {
                return new RestException(hr.description, false);
            }
        }
        return new RestException(response, false);
    }

	static class HttpPipeliningRequest {
		final HttpRequest request;
		final List<HttpResponse> errors;
		final HttpResponseHandler responseHandler;
		boolean retry;

		HttpPipeliningRequest(HttpRequest request, List<HttpResponse> errors, HttpResponseHandler responseHandler) {
			this.request = request;
			this.errors = errors;
			this.responseHandler = responseHandler;
		}
	}

    // Asynchronous HTTP action, response is passed to HttpResponseHandler
    @Override
    public void httpActionAsync(String uri, String method, List<HttpParam> parametersQuery, List<HttpParam> parametersBody,
		    final List<HttpResponse> errors, final HttpResponseHandler responseHandler)
            throws RestException {
	    final HttpRequest request;
	    try {
		    request = buildRequest(baseUri.getHost(), uri, method, parametersQuery, parametersBody);
	    } catch (UnsupportedEncodingException e) {
		    throw new RestException(e);
	    }
	    final HttpPipeliningRequest pipeliningRequest = new HttpPipeliningRequest(request, errors, responseHandler);
	    httpActionAsyncImpl(pipeliningRequest);
    }

	private void httpActionAsyncImpl(HttpPipeliningRequest pipeliningRequest) {
		final ChannelFuture cf;
		synchronized (queue) {
			if (persistentChannelFuture != null) {
				cf = persistentChannelFuture;
			} else {
				// Get future channel
				cf = bootStrap.connect(baseUri.getHost(), baseUri.getPort());
				persistentChannelFuture = cf;

				cf.addListener((ChannelFutureListener) future -> {
					if (future.isSuccess()) {
						Channel ch = future.channel();
						log(ch, "connected", null);

						ch.closeFuture().addListener((ChannelFutureListener) closeFuture -> {
							log(ch, "disconnected", null);
							synchronized (queue) {
								assert persistentChannelFuture == cf;
								persistentChannelFuture = null;

								ArrayList<HttpPipeliningRequest> unansweredRequests = new ArrayList<>(queue);
								queue.clear();

								// retry once
								for (HttpPipeliningRequest unansweredRequest : unansweredRequests) {
									if (unansweredRequest.retry) {
										unansweredRequest.responseHandler.onFailure(closeFuture.cause());
									} else {
										unansweredRequest.retry = true;
										httpActionAsyncImpl(unansweredRequest);
									}
								}
							}
						});
					} else {
						synchronized (queue) {
							assert persistentChannelFuture == cf;
							persistentChannelFuture = null;
							assert queue.isEmpty();
						}
					}
				});
			}
		}

		cf.addListener((ChannelFutureListener) future -> {
			if (future.isSuccess()) {
				Channel ch = future.channel();
				synchronized (queue) {
					if (persistentChannelFuture != cf) {
						// channel is closed already -> use new channel
						httpActionAsyncImpl(pipeliningRequest);
					} else {
						log(ch, "send", pipeliningRequest);
						queue.add(pipeliningRequest);
						pipeliningRequest.responseHandler.onChReadyToWrite();
						ch.writeAndFlush(pipeliningRequest.request);
					}
				}
			} else {
				pipeliningRequest.responseHandler.onFailure(future.cause());
			}
		});
	}

	private static void log(Channel ch, String s, HttpPipeliningRequest pipeliningRequest) {
		if (LOGGER.isTraceEnabled()) {
			String reqString = pipeliningRequest == null
					? ""
					: " " + pipeliningRequest.hashCode() + (pipeliningRequest.retry ? "!" : "") + " " + pipeliningRequest.request.method() + " " + pipeliningRequest.request.uri();
			LOGGER.trace(ch + " " + s + reqString);
		}
	}

	static void handleRespSuccess(Channel ch, HttpPipeliningRequest pipeliningRequest, String responseText, HttpResponseStatus responseStatus) {
		log(ch, "recv", pipeliningRequest);
		pipeliningRequest.responseHandler.onResponseReceived();
		if (httpResponseOkay(responseStatus)) {
			pipeliningRequest.responseHandler.onSuccess(responseText);
		} else {
			pipeliningRequest.responseHandler.onFailure(makeException(responseStatus, responseText, pipeliningRequest.errors));
		}
	}
	// WsClient implementation - connect to WebSocket server

    @Override
    public WsClientConnection connect(final HttpResponseHandler callback, final String url, final List<HttpParam> lParamQuery) throws RestException {

        this.wsCallback = callback;
        try {
            this.wsHandler = new NettyWSClientHandler(getWsHandshake(url, lParamQuery), callback);
        } catch (UnsupportedEncodingException e) {
            throw new RestException(e);
        }

        Bootstrap wsBootStrap = new Bootstrap();
        wsBootStrap.group(group);
        wsBootStrap.channel(NioSocketChannel.class);
        wsBootStrap.handler(new ChannelInitializer<SocketChannel>() {

            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                pipeline.addLast("http-codec", new HttpClientCodec());
                pipeline.addLast("aggregator", new HttpObjectAggregator(MAX_HTTP_REQUEST_KB * 1024));
                pipeline.addLast("ws-handler", wsHandler);
            }
        });

        wsChannelFuture = wsBootStrap.connect(baseUri.getHost(), baseUri.getPort());
        wsFuture = new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    wsHandler.handshakeFuture().addListener(new ChannelFutureListener() {
                        @Override
                        public void operationComplete(ChannelFuture future) throws Exception {
                            if (future.isSuccess()) {
                                callback.onChReadyToWrite();
	                            callback.onSuccess(null);
                            } else {
	                            callback.onFailure(future.cause());
                            }
                        }
                    });
                } else {
	                callback.onFailure(future.cause());
                }
            }
        };
        wsChannelFuture.addListener(wsFuture);

        // start a ws ping schedule
        startPing();

        // Provide disconnection handle to client
        return createWsClientConnection();
    }

    private void startPing() {
        if (wsPingTimer == null) {
            wsPingTimer = group.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    if (System.currentTimeMillis() - wsCallback.getLastResponseTime() > 15000) {
                        if (!wsChannelFuture.isCancelled() && wsChannelFuture.channel() != null) {
                            WebSocketFrame frame = new PingWebSocketFrame(Unpooled.wrappedBuffer("ari4j".getBytes( StandardCharsets.UTF_8 )));
                            wsChannelFuture.channel().writeAndFlush(frame);
                        }
                    }
                }
            }, 5, 5, TimeUnit.MINUTES);
        }
    }

    private WsClientConnection createWsClientConnection() {
        if (this.wsClientConnection == null) {
            this.wsClientConnection = new WsClientConnection() {

                @Override
                public void disconnect() throws RestException {
                    wsHandler.setShuttingDown(true);
                    Channel ch = wsChannelFuture.channel();
                    if (ch != null) {
                        // NettyWSClientHandler will close the connection when the server
                        // responds to the CloseWebSocketFrame.
                        ch.writeAndFlush(new CloseWebSocketFrame());
                        // if the server is no longer there then close any way
                        ch.close();
                    }
                    wsChannelFuture.removeListener(wsFuture);
                }
            };
        }
        return this.wsClientConnection;
    }

    /**
     * Checks if a response is okay.
     * All 2XX responses are supposed to be okay.
     *
     * @param status
     * @return whether it is a 2XX code or not (error!)
     */
    private static boolean httpResponseOkay(HttpResponseStatus status) {

        if (HttpResponseStatus.OK.equals(status)
                || HttpResponseStatus.NO_CONTENT.equals(status)
                || HttpResponseStatus.ACCEPTED.equals(status)
                || HttpResponseStatus.CREATED.equals(status)) {
            return true;
        } else {
            return false;
        }

    }
}
