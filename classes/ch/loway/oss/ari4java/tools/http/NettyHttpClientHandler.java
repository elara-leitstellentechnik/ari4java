package ch.loway.oss.ari4java.tools.http;

import ch.loway.oss.ari4java.tools.http.NettyHttpClient.HttpPipeliningRequest;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;

import java.nio.charset.StandardCharsets;
import java.util.Queue;

/**
 * HttpClientHandler handles the asynchronous response from the remote
 * HTTP server.
 *
 * @author mwalton
 *
 */

@ChannelHandler.Sharable
public class NettyHttpClientHandler extends SimpleChannelInboundHandler<Object> {
	private final Queue<HttpPipeliningRequest> queue;

	public NettyHttpClientHandler(Queue<HttpPipeliningRequest> queue) {
		this.queue = queue;
	}

	@Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        Channel ch = ctx.channel();
		HttpPipeliningRequest pipeliningRequest;
		synchronized (queue) {
			pipeliningRequest = queue.poll();
		}
		if (pipeliningRequest != null && msg instanceof FullHttpResponse) {
			FullHttpResponse response = (FullHttpResponse) msg;
			String responseText = response.content().toString(StandardCharsets.UTF_8);
			HttpResponseStatus responseStatus = response.status();
			NettyHttpClient.handleRespSuccess(ch, pipeliningRequest, responseText, responseStatus);
		} else {
            // TODO: what?
            if ( msg != null ) {
                System.out.println( "Unknown object:" + msg);
            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}

