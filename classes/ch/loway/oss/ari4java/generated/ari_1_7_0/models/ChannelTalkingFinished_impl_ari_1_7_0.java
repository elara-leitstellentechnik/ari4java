package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:04 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Talking is no longer detected on the channel.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelTalkingFinished_impl_ari_1_7_0 extends Event_impl_ari_1_7_0 implements ChannelTalkingFinished, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which talking completed.  */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_7_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

  /**  The length of time, in milliseconds, that talking was detected on the channel  */
  private @NotNull int duration;
 public @NotNull int getDuration() {
   return duration;
 }

 @JsonDeserialize( as=int.class )
 public void setDuration(@NotNull int val ) {
   duration = val;
 }

/** No missing signatures from interface */
}

