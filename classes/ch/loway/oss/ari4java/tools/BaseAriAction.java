package ch.loway.oss.ari4java.tools;

import de.elara.common.lang.concurrent.SafeCompletableFuture;

import ch.loway.oss.ari4java.generated.Message;
import ch.loway.oss.ari4java.tools.WsClient.WsClientConnection;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Base functionality for ARI actions
 *
 * Provides asynchronous and synchronous methods for forwarding requests to the
 * HTTP or WebSocket server.
 *
 * Provides serialize/deserialize interface for JSON encoded objects
 *
 * @author lenz
 * @author mwalton
 */
public class BaseAriAction {

    // Shared ObjectMapper
    private static final ObjectMapper mapper = new ObjectMapper();

	private HttpClient httpClient;
    private WsClient wsClient;
    protected List<HttpParam> lParamQuery;
    protected List<HttpParam> lParamBody;
    protected List<HttpResponse> lE;
    protected String url;
    protected String method;
    protected boolean wsUpgrade = false;
    protected WsClientConnection wsConnection;
    private List<BaseAriAction> liveActionList;

    /**
     * Reset contents in preparation for new RPC
     */
    protected synchronized void reset() {
        lParamQuery = new ArrayList<HttpParam>();
        lParamBody = new ArrayList<HttpParam>();
        lE = new ArrayList<HttpResponse>();
        url = null;
        wsUpgrade = false;
    }

    protected static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e); // cannot happen!
        }
    }

    /**
     * Initiate asynchronous HTTP or WebSocket interaction with server
     *
     * @param asyncHandler
     */
    private synchronized void httpActionAsync(AriAsyncHandler<?> asyncHandler) {
	    if (wsUpgrade) {
	        // Websocket connection
	        if (wsClient == null) {
	            asyncHandler.getCallback().onFailure(new RestException("WebSocket client implementation not set"));
	            return;
	        }
	        if (wsConnection != null) {
	            asyncHandler.getCallback().onFailure(new RestException("This action is already connected to a WebSocket"));
	            return;
	        }
	        try {
	            wsConnection = wsClient.connect(asyncHandler, this.url, this.lParamQuery);
	            liveActionList.add(this);
	        } catch (RestException e) {
	            asyncHandler.getCallback().onFailure(e);
	        }
	    } else if (httpClient == null) {
	        asyncHandler.getCallback().onFailure(new RestException("HTTP client implementation not set"));
	    } else {
	        try {
	            httpClient.httpActionAsync(this.url, this.method, this.lParamQuery, this.lParamBody, this.lE, asyncHandler);
	        } catch (RestException e) {
	            asyncHandler.getCallback().onFailure(e);
	        }
	    }
    }

    // Different styled asynchronous methods
    protected void httpActionAsync(AriCallback<Void> callback) {
        httpActionAsync(new AriAsyncHandler<Void>(callback, Void.class));
    }

    protected <S, T extends S> void httpActionAsync(AriCallback<S> callback, Class<T> klazz) {
        httpActionAsync(new AriAsyncHandler<T>(callback, klazz));
    }

    protected <A, C extends A> void httpActionAsync(
            AriCallback<List<A>> callback, TypeReference<List<C>> klazzType) {
        httpActionAsync(new AriAsyncHandler(callback, klazzType));
    }

    protected <S> AriCallback<S> callbackOnceFuture(final SafeCompletableFuture<S> future) {
        return new AriCallback<S>() {
            @Override
            public void onSuccess(S result) {
                if(!future.complete(result))
                    throw new IllegalStateException();
            }

            @Override
            public void onFailure(RestException e) {
                if(!future.completeExceptionallyHandled(e))
                    throw new IllegalStateException();
            }
        };
    }

    /**
     * Deserialize a type
     *
     * @param json
     * @param klazz
     * @return Deserialized type
     */
    public static <T> T deserializeJson(String json, Class<T> klazz) throws RestException {

        try {
            return mapper.readValue(json, klazz);
        } catch (IOException e) {
            e.printStackTrace(System.err);
            throw new RestException("Decoding JSON: " + e.getMessage());
        }
    }

    /**
     * Deserialize a list
     *
     * @param json
     * @param klazzType
     * @return Deserialized list
     */
    public static <T> T deserializeJson(String json, TypeReference<T> klazzType) throws RestException {

        try {
            return mapper.readValue(json, klazzType);
        } catch (IOException e) {
            throw new RestException("Decoding JSON list: " + e.toString());
        }

    }

    /**
     * Deserialize an object as a list of interface. Class erasure in Java plain
     * sucks, I tell ya.
     *
     * In theory we should be safe given the condition that A extends C. I hope
     * at least. This is bug #17 - Avoid Lists of ? extends something
     *
     * @param <A> The abstract type for members of the list.
     * @param <C> The concrete type for members of the list.
     * @param json Data in
     * @param refConcreteType The reference concrete type, should be a List&lt;C&gt;
     * @return a list of A's
     * @throws RestException
     */
    public static <A, C extends A> List<A> deserializeJsonAsAbstractList(String json, TypeReference<List<C>> refConcreteType) throws RestException {

        try {
            List<C> lC = mapper.readValue(json, refConcreteType);
            List<A> lA = (List<A>) lC;
            return lA;
        } catch (IOException e) {
            throw new RestException("Decoding JSON list: " + e.toString());
        }

    }

    /**
     * Deserialize the event.
     *
     * @param json
     * @param klazz
     * @return The event deserialized.
     * @throws RestException
     */
    public static Message deserializeEvent(String json, Class<?> klazz) throws RestException {
        try {
            return (Message) mapper.readValue(json, klazz);
        } catch (IOException e) {
            e.printStackTrace(System.err);
            throw new RestException("Decoding JSON event: " + e.toString());
        }
    }

    /**
     * Close the WebSocket connection
     *
     * @throws RestException
     */
    public synchronized void disconnectWs() throws RestException {
        if (wsConnection != null) {
            liveActionList.remove(this);
            wsConnection.disconnect();
        }
        wsConnection = null;
    }

    public synchronized void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public synchronized void setWsClient(WsClient wsClient) {
        this.wsClient = wsClient;
    }

    public synchronized void setLiveActionList(List<BaseAriAction> liveActionList) {
        this.liveActionList = liveActionList;
    }
}

//

