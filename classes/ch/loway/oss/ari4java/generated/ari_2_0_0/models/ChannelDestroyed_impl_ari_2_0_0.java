package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:35 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Notification that a channel has been destroyed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelDestroyed_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ChannelDestroyed, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Integer representation of the cause of the hangup  */
  private @NotNull int cause;
 public @NotNull int getCause() {
   return cause;
 }

 @JsonDeserialize( as=int.class )
 public void setCause(@NotNull int val ) {
   cause = val;
 }

  /**  Text representation of the cause of the hangup  */
  private @NotNull String cause_txt;
 public @NotNull String getCause_txt() {
   return cause_txt;
 }

 @JsonDeserialize( as=String.class )
 public void setCause_txt(@NotNull String val ) {
   cause_txt = val;
 }

  /**    */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_2_0_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

