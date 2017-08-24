package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:03:00 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * The merging of media from one or more channels.
 * 
 * Everyone on the bridge receives the same audio.
 * 
 * Defined in file: bridges.json
 * Generated by: Model
 *********************************************************/

public class Bridge_impl_ari_2_0_0 implements Bridge, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Bridging class  */
  private @NotNull String bridge_class;
 public @NotNull String getBridge_class() {
   return bridge_class;
 }

 @JsonDeserialize( as=String.class )
 public void setBridge_class(@NotNull String val ) {
   bridge_class = val;
 }

  /**  Type of bridge technology  */
  private @NotNull String bridge_type;
 public @NotNull String getBridge_type() {
   return bridge_type;
 }

 @JsonDeserialize( as=String.class )
 public void setBridge_type(@NotNull String val ) {
   bridge_type = val;
 }

  /**  Ids of channels participating in this bridge  */
  private @NotNull List<String> channels;
 public @NotNull List<String> getChannels() {
   return channels;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setChannels(@NotNull List<String> val ) {
   channels = val;
 }

  /**  Entity that created the bridge  */
  private @NotNull String creator;
 public @NotNull String getCreator() {
   return creator;
 }

 @JsonDeserialize( as=String.class )
 public void setCreator(@NotNull String val ) {
   creator = val;
 }

  /**  Unique identifier for this bridge  */
  private @NotNull String id;
 public @NotNull String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(@NotNull String val ) {
   id = val;
 }

  /**  Name the creator gave the bridge  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**  Name of the current bridging technology  */
  private @NotNull String technology;
 public @NotNull String getTechnology() {
   return technology;
 }

 @JsonDeserialize( as=String.class )
 public void setTechnology(@NotNull String val ) {
   technology = val;
 }

  /**  The video mode the bridge is using. One of 'none', 'talker', or 'single'.  */
  private @Nullable String video_mode;
 public @Nullable String getVideo_mode() {
   return video_mode;
 }

 @JsonDeserialize( as=String.class )
 public void setVideo_mode(@Nullable String val ) {
   video_mode = val;
 }

  /**  The ID of the channel that is the source of video in this bridge, if one exists.  */
  private @Nullable String video_source_id;
 public @Nullable String getVideo_source_id() {
   return video_source_id;
 }

 @JsonDeserialize( as=String.class )
 public void setVideo_source_id(@Nullable String val ) {
   video_source_id = val;
 }

/** No missing signatures from interface */
}

