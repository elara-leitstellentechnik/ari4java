package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

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
 * Notification that a channel has entered a bridge.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelEnteredBridge_impl_ari_1_0_0 extends Event_impl_ari_1_0_0 implements ChannelEnteredBridge, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull Bridge bridge;
 public @NotNull Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_0_0.class )
 public void setBridge(@NotNull Bridge val ) {
   bridge = val;
 }

  /**    */
  private @Nullable Channel channel;
 public @Nullable Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_0_0.class )
 public void setChannel(@Nullable Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

