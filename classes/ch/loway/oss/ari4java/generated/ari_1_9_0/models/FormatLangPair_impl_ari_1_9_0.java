package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

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
 * Identifies the format and language of a sound file
 * 
 * Defined in file: sounds.json
 * Generated by: Model
 *********************************************************/

public class FormatLangPair_impl_ari_1_9_0 implements FormatLangPair, java.io.Serializable {
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
  private @NotNull String language;
 public @NotNull String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(@NotNull String val ) {
   language = val;
 }

/** No missing signatures from interface */
}

