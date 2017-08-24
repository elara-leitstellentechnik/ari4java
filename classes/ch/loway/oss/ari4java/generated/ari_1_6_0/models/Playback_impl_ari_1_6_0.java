package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

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
 * Object representing the playback of media to a channel
 * 
 * Defined in file: playbacks.json
 * Generated by: Model
 *********************************************************/

public class Playback_impl_ari_1_6_0 implements Playback, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  ID for this playback operation  */
  private @NotNull String id;
 public @NotNull String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(@NotNull String val ) {
   id = val;
 }

  /**  For media types that support multiple languages, the language requested for playback.  */
  private @Nullable String language;
 public @Nullable String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(@Nullable String val ) {
   language = val;
 }

  /**  URI for the media to play back.  */
  private @NotNull String media_uri;
 public @NotNull String getMedia_uri() {
   return media_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setMedia_uri(@NotNull String val ) {
   media_uri = val;
 }

  /**  Current state of the playback operation.  */
  private @NotNull String state;
 public @NotNull String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(@NotNull String val ) {
   state = val;
 }

  /**  URI for the channel or bridge to play the media on  */
  private @NotNull String target_uri;
 public @NotNull String getTarget_uri() {
   return target_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setTarget_uri(@NotNull String val ) {
   target_uri = val;
 }

/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_1_10_0
 *********************************************************/
 public void setNext_media_uri(@Nullable String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_1_10_0
 *********************************************************/
 public @Nullable String getNext_media_uri(){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

