package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

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
 * A media file that may be played back.
 * 
 * Defined in file: sounds.json
 * Generated by: Model
 *********************************************************/

public class Sound_impl_ari_1_8_0 implements Sound, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The formats and languages in which this sound is available.  */
  private @NotNull List<FormatLangPair> formats;
 public @NotNull List<FormatLangPair> getFormats() {
   return formats;
 }

 @JsonDeserialize( contentAs=FormatLangPair_impl_ari_1_8_0.class )
 public void setFormats(@NotNull List<FormatLangPair> val ) {
   formats = val;
 }

  /**  Sound's identifier.  */
  private @NotNull String id;
 public @NotNull String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(@NotNull String val ) {
   id = val;
 }

  /**  Text description of the sound, usually the words spoken.  */
  private @Nullable String text;
 public @Nullable String getText() {
   return text;
 }

 @JsonDeserialize( as=String.class )
 public void setText(@Nullable String val ) {
   text = val;
 }

/** No missing signatures from interface */
}

