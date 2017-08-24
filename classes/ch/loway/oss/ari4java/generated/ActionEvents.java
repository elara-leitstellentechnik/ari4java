package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:05:00 CEST 2017
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

// void userEvent @NotNull String @NotNull String @Nullable String @Nullable Map<String,String>
/**********************************************************
 * Generate a user event.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void userEvent(@NotNull String eventName, @NotNull String application, @Nullable String source, @Nullable Map<String,String> variables) throws RestException;



// void userEvent @NotNull String @NotNull String @Nullable String @Nullable Map<String,String> @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void userEvent(@NotNull String eventName, @NotNull String application, @Nullable String source, @Nullable Map<String,String> variables, @NotNull AriCallback<Void> callback);



// Message eventWebsocket @NotNull String @Nullable boolean
/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public Message eventWebsocket(@NotNull String app, @Nullable boolean subscribeAll) throws RestException;



// Message eventWebsocket @NotNull String
/**********************************************************
 * WebSocket connection for events.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Message eventWebsocket(@NotNull String app) throws RestException;



// void eventWebsocket @NotNull String @NotNull AriCallback<Message> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void eventWebsocket(@NotNull String app, @NotNull AriCallback<Message> callback);



// void eventWebsocket @NotNull String @Nullable boolean @NotNull AriCallback<Message> callback
/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void eventWebsocket(@NotNull String app, @Nullable boolean subscribeAll, @NotNull AriCallback<Message> callback);


}
;
