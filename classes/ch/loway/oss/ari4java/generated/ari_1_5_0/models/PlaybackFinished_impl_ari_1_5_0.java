package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

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
 * Event showing the completion of a media playback operation.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class PlaybackFinished_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements PlaybackFinished, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Playback control object  */
  private @NotNull Playback playback;
 public @NotNull Playback getPlayback() {
   return playback;
 }

 @JsonDeserialize( as=Playback_impl_ari_1_5_0.class )
 public void setPlayback(@NotNull Playback val ) {
   playback = val;
 }

/** No missing signatures from interface */
}

