package ch.loway.oss.ari4java.tools;

import java.util.List;

/**
 * Interface to pluggable HTTP client implementation
 *
 * @author mwalton
 *
 */
public interface HttpClient {
	void httpActionAsync(String uri, String method, List<HttpParam> parametersQuery, List<HttpParam> parametersBody, List<HttpResponse> errors, HttpResponseHandler responseHandler) throws RestException;
}
