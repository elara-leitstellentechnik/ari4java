package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:34 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Notification that a bridge has been destroyed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeDestroyed_impl_ari_1_8_0 extends Event_impl_ari_1_8_0 implements BridgeDestroyed, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull Bridge bridge;
 public @NotNull Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_8_0.class )
 public void setBridge(@NotNull Bridge val ) {
   bridge = val;
 }

/** No missing signatures from interface */
}

