package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:03:00 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Notification that a channel has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelCreated_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ChannelCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
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

