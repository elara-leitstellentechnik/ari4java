package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * DTMF received on a channel.
 * 
 * This event is sent when the DTMF ends. There is no notification about the start of DTMF
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelDtmfReceived_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements ChannelDtmfReceived, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which DTMF was received  */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

  /**  DTMF digit received (0-9, A-E, # or *)  */
  private @NotNull String digit;
 public @NotNull String getDigit() {
   return digit;
 }

 @JsonDeserialize( as=String.class )
 public void setDigit(@NotNull String val ) {
   digit = val;
 }

  /**  Number of milliseconds DTMF was received  */
  private @NotNull int duration_ms;
 public @NotNull int getDuration_ms() {
   return duration_ms;
 }

 @JsonDeserialize( as=int.class )
 public void setDuration_ms(@NotNull int val ) {
   duration_ms = val;
 }

/** No missing signatures from interface */
}

