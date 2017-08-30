package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

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
 * Notification that the source of video in a bridge has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeVideoSourceChanged_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements BridgeVideoSourceChanged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull Bridge bridge;
 public @NotNull Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_2_0_0.class )
 public void setBridge(@NotNull Bridge val ) {
   bridge = val;
 }

  /**    */
  private @Nullable String old_video_source_id;
 public @Nullable String getOld_video_source_id() {
   return old_video_source_id;
 }

 @JsonDeserialize( as=String.class )
 public void setOld_video_source_id(@Nullable String val ) {
   old_video_source_id = val;
 }

/** No missing signatures from interface */
}

