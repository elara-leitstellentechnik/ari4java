package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:02:57 CEST 2017
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


public interface ChannelUserevent {

// void setUserevent @NotNull Map<String,String>
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUserevent(@NotNull Map<String,String> val );



// void setEndpoint @Nullable Endpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setEndpoint(@Nullable Endpoint val );



// void setEventname @NotNull String
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setEventname(@NotNull String val );



// void setChannel @Nullable Channel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(@Nullable Channel val );



// void setBridge @Nullable Bridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBridge(@Nullable Bridge val );



// @Nullable Bridge getBridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Bridge getBridge();



// @NotNull Map<String,String> getUserevent
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull Map<String,String> getUserevent();



// @NotNull String getEventname
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getEventname();



// @Nullable Endpoint getEndpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Endpoint getEndpoint();



// @Nullable Channel getChannel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable Channel getChannel();


}
;
