package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:18 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * User-generated event with additional user-defined fields in the object.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelUserevent_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ChannelUserevent, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A bridge that is signaled with the user event.  */
  private @Nullable Bridge bridge;
 public @Nullable Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_2_0_0.class )
 public void setBridge(@Nullable Bridge val ) {
   bridge = val;
 }

  /**  A channel that is signaled with the user event.  */
  private @Nullable Channel channel;
 public @Nullable Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_2_0_0.class )
 public void setChannel(@Nullable Channel val ) {
   channel = val;
 }

  /**  A endpoint that is signaled with the user event.  */
  private @Nullable Endpoint endpoint;
 public @Nullable Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_2_0_0.class )
 public void setEndpoint(@Nullable Endpoint val ) {
   endpoint = val;
 }

  /**  The name of the user event.  */
  private @NotNull String eventname;
 public @NotNull String getEventname() {
   return eventname;
 }

 @JsonDeserialize( as=String.class )
 public void setEventname(@NotNull String val ) {
   eventname = val;
 }

  /**  Custom Userevent data  */
  private @NotNull Map<String,String> userevent;
 public @NotNull Map<String,String> getUserevent() {
   return userevent;
 }

 @JsonDeserialize( keyAs=String.class, contentAs=String.class )
 public void setUserevent(@NotNull Map<String,String> val ) {
   userevent = val;
 }

/** No missing signatures from interface */
}

