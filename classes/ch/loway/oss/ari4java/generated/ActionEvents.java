package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:03 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionEvents {

// void eventWebsocket @NotNull String @NotNull AriCallback<Message> callback
/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void eventWebsocket(@NotNull String app, @NotNull AriCallback<Message> callback);



// java.util.concurrent.CompletionStage<Void> userEvent @NotNull String @NotNull String @Nullable String @Nullable Map<String,String>
/**********************************************************
 * Generate a user event.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> userEvent(@NotNull String eventName, @NotNull String application, @Nullable String source, @Nullable Map<String,String> variables);



// void eventWebsocket @NotNull String @Nullable boolean @NotNull AriCallback<Message> callback
/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void eventWebsocket(@NotNull String app, @Nullable boolean subscribeAll, @NotNull AriCallback<Message> callback);


}
;
