package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:17 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Talking was detected on the channel.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelTalkingStarted_impl_ari_1_6_0 extends Event_impl_ari_1_6_0 implements ChannelTalkingStarted, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which talking started.  */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_6_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

