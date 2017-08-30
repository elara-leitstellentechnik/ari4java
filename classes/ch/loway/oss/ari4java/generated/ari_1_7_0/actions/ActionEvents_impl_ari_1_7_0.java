package ch.loway.oss.ari4java.generated.ari_1_7_0.actions;

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
import ch.loway.oss.ari4java.generated.ari_1_7_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionEvents_impl_ari_1_7_0 extends BaseAriAction  implements ActionEvents {
/**********************************************************
 * Events from Asterisk to applications
 * 
 * WebSocket connection for events.
 *********************************************************/
private void buildEventWebsocket(@NotNull String app) {
reset();
url = "/events";
method = "GET";
lParamQuery.add( HttpParam.build( "app", app) );
wsUpgrade = true;
}

@Override
public void eventWebsocket(@NotNull String app, @NotNull AriCallback<Message> callback) {
buildEventWebsocket(app);
httpActionAsync(callback, Message_impl_ari_1_7_0.class);
}

/**********************************************************
 * Stasis application user events
 * 
 * Generate a user event.
 *********************************************************/
private void buildUserEvent(@NotNull String eventName, @NotNull String application, @Nullable String source, @Nullable Map<String,String> variables) {
reset();
url = "/events/user/" + eventName + "";
method = "POST";
lParamQuery.add( HttpParam.build( "application", application) );
lParamQuery.add( HttpParam.build( "source", source) );
lParamBody.addAll( HttpParam.build( "variables", variables) );
lE.add( HttpResponse.build( 404, "Application does not exist.") );
lE.add( HttpResponse.build( 422, "Event source not found.") );
lE.add( HttpResponse.build( 400, "Invalid even tsource URI or userevent data.") );
}

@Override
public java.util.concurrent.CompletionStage<Void> userEvent(@NotNull String eventName, @NotNull String application, @Nullable String source, @Nullable Map<String,String> variables) {
buildUserEvent(eventName, application, source, variables);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void eventWebsocket(@NotNull String app, @Nullable boolean subscribeAll, @NotNull AriCallback<Message> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

