package ch.loway.oss.ari4java.tools.http;

import ch.loway.oss.ari4java.tools.HttpResponseHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;

import java.nio.charset.StandardCharsets;

/**
 * NettyWSClientHandler handles the transactions with the remote
 * WebSocket, forwarding to the client HttpResponseHandler interface.
 *
 * @author mwalton
 *
 */
@ChannelHandler.Sharable
public class NettyWSClientHandler extends SimpleChannelInboundHandler<Object> {
    
    final WebSocketClientHandshaker handshaker;
    private ChannelPromise handshakeFuture;
    final HttpResponseHandler wsCallback;
    private boolean shuttingDown = false;

    public NettyWSClientHandler(WebSocketClientHandshaker handshaker, HttpResponseHandler wsCallback) {
        this.handshaker = handshaker;
        this.wsCallback = wsCallback;
    }

    public ChannelFuture handshakeFuture() {
        return handshakeFuture;
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        handshakeFuture = ctx.newPromise();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        handshaker.handshake(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        if (!shuttingDown) {
            wsCallback.onDisconnect();
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        Channel ch = ctx.channel();
        
        if (!handshaker.isHandshakeComplete()) {
            handshaker.finishHandshake(ch, (FullHttpResponse) msg);
            handshakeFuture.setSuccess();
            return;
        }
        
        if (msg instanceof FullHttpResponse) {
            FullHttpResponse response = (FullHttpResponse) msg;
            String error = "Unexpected FullHttpResponse (getStatus=" + response.getStatus() + ", content=" + response.content().toString(StandardCharsets.UTF_8) + ')';
            System.err.println(error);
            throw new Exception(error);
        }

        // call this so we can set the last received time
        wsCallback.onResponseReceived();
        
        WebSocketFrame frame = (WebSocketFrame) msg;
        if (frame instanceof TextWebSocketFrame) {
            TextWebSocketFrame textFrame = (TextWebSocketFrame) frame;
            wsCallback.onSuccess(textFrame.text());
        } else if (frame instanceof CloseWebSocketFrame) {
            ch.close();
            if (!shuttingDown) {
                wsCallback.onDisconnect();
            }
        }
        
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if (!shuttingDown)
            return;
        cause.printStackTrace();
        if (!handshakeFuture.isDone()) {
            handshakeFuture.setFailure(cause);
        }
        ctx.close();
        wsCallback.onFailure(cause);
    }

    public boolean isShuttingDown() {
        return shuttingDown;
    }

    public void setShuttingDown(boolean shuttingDown) {
        this.shuttingDown = shuttingDown;
    }
}

