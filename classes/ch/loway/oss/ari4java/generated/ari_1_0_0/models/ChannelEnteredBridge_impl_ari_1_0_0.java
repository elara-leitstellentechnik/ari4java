package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * Notification that a channel has entered a bridge.
 * 
 * Defined in file: events.json
 *********************************************************/

public class ChannelEnteredBridge_impl_ari_1_0_0 extends Event_impl_ari_1_0_0 implements ChannelEnteredBridge, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_0_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_0_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}
