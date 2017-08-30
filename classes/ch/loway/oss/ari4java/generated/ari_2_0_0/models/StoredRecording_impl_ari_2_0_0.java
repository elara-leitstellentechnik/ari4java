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
 * A past recording that may be played back.
 * 
 * Defined in file: recordings.json
 * Generated by: Model
 *********************************************************/

public class StoredRecording_impl_ari_2_0_0 implements StoredRecording, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull String format;
 public @NotNull String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(@NotNull String val ) {
   format = val;
 }

  /**    */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

/** No missing signatures from interface */
}

