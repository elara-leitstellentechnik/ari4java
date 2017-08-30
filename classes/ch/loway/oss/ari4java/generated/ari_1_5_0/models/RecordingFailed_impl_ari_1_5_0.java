package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

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
 * Event showing failure of a recording operation.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class RecordingFailed_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements RecordingFailed, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Recording control object  */
  private @NotNull LiveRecording recording;
 public @NotNull LiveRecording getRecording() {
   return recording;
 }

 @JsonDeserialize( as=LiveRecording_impl_ari_1_5_0.class )
 public void setRecording(@NotNull LiveRecording val ) {
   recording = val;
 }

/** No missing signatures from interface */
}

