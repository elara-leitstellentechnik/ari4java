package ch.loway.oss.ari4java.generated.ari_2_0_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:05 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_2_0_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionApplications_impl_ari_2_0_0 extends BaseAriAction  implements ActionApplications {
/**********************************************************
 * Stasis applications
 * 
 * List all applications.
 *********************************************************/
private void buildList() {
reset();
url = "/applications";
method = "GET";
}

@Override
public java.util.concurrent.CompletionStage<List<Application>> list() {
buildList();
java.util.concurrent.CompletableFuture<List<Application>> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<Application_impl_ari_2_0_0>>() {});
return future;
}

/**********************************************************
 * Stasis application
 * 
 * Get details of an application.
 *********************************************************/
private void buildGet(@NotNull String applicationName) {
reset();
url = "/applications/" + applicationName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Application does not exist.") );
}

@Override
public java.util.concurrent.CompletionStage<Application> get(@NotNull String applicationName) {
buildGet(applicationName);
java.util.concurrent.CompletableFuture<Application> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Application_impl_ari_2_0_0.class);
return future;
}

/**********************************************************
 * Stasis application
 * 
 * Subscribe an application to a event source.
 * Returns the state of the application after the subscriptions have changed
 *********************************************************/
private void buildSubscribe(@NotNull String applicationName, @NotNull String eventSource) {
reset();
url = "/applications/" + applicationName + "/subscription";
method = "POST";
lParamQuery.add( HttpParam.build( "eventSource", eventSource) );
lE.add( HttpResponse.build( 400, "Missing parameter.") );
lE.add( HttpResponse.build( 404, "Application does not exist.") );
lE.add( HttpResponse.build( 422, "Event source does not exist.") );
}

@Override
public java.util.concurrent.CompletionStage<Application> subscribe(@NotNull String applicationName, @NotNull String eventSource) {
buildSubscribe(applicationName, eventSource);
java.util.concurrent.CompletableFuture<Application> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Application_impl_ari_2_0_0.class);
return future;
}

/**********************************************************
 * Stasis application
 * 
 * Unsubscribe an application from an event source.
 * Returns the state of the application after the subscriptions have changed
 *********************************************************/
private void buildUnsubscribe(@NotNull String applicationName, @NotNull String eventSource) {
reset();
url = "/applications/" + applicationName + "/subscription";
method = "DELETE";
lParamQuery.add( HttpParam.build( "eventSource", eventSource) );
lE.add( HttpResponse.build( 400, "Missing parameter; event source scheme not recognized.") );
lE.add( HttpResponse.build( 404, "Application does not exist.") );
lE.add( HttpResponse.build( 409, "Application not subscribed to event source.") );
lE.add( HttpResponse.build( 422, "Event source does not exist.") );
}

@Override
public java.util.concurrent.CompletionStage<Application> unsubscribe(@NotNull String applicationName, @NotNull String eventSource) {
buildUnsubscribe(applicationName, eventSource);
java.util.concurrent.CompletableFuture<Application> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Application_impl_ari_2_0_0.class);
return future;
}

/** No missing signatures from interface */
};

