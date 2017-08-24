package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Notification that a channel has entered a Stasis application.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class StasisStart_impl_ari_1_0_0 extends Event_impl_ari_1_0_0 implements StasisStart, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Arguments to the application  */
  private @NotNull List<String> args;
 public @NotNull List<String> getArgs() {
   return args;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setArgs(@NotNull List<String> val ) {
   args = val;
 }

  /**    */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_0_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setReplace_channel(@Nullable Channel val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getReplace_channel(){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

