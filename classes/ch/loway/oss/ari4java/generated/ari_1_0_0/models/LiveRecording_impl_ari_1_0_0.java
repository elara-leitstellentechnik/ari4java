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
 * A recording that is in progress
 * 
 * Defined in file: recordings.json
 * Generated by: Model
 *********************************************************/

public class LiveRecording_impl_ari_1_0_0 implements LiveRecording, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Cause for recording failure if failed  */
  private @Nullable String cause;
 public @Nullable String getCause() {
   return cause;
 }

 @JsonDeserialize( as=String.class )
 public void setCause(@Nullable String val ) {
   cause = val;
 }

  /**    */
  private @NotNull String format;
 public @NotNull String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(@NotNull String val ) {
   format = val;
 }

  /**  Base name for the recording  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**    */
  private @NotNull String state;
 public @NotNull String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(@NotNull String val ) {
   state = val;
 }

/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getTarget_uri(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable int getDuration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable int getTalking_duration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable int getSilence_duration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTarget_uri(@NotNull String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDuration(@Nullable int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTalking_duration(@Nullable int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setSilence_duration(@Nullable int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

