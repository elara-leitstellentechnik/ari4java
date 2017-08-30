package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Notification that one bridge has merged into another.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeMerged_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements BridgeMerged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull Bridge bridge;
 public @NotNull Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setBridge(@NotNull Bridge val ) {
   bridge = val;
 }

  /**    */
  private @NotNull Bridge bridge_from;
 public @NotNull Bridge getBridge_from() {
   return bridge_from;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setBridge_from(@NotNull Bridge val ) {
   bridge_from = val;
 }

/** No missing signatures from interface */
}

