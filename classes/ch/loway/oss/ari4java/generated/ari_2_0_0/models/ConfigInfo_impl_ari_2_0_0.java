package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:18 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Info about Asterisk configuration
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class ConfigInfo_impl_ari_2_0_0 implements ConfigInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Default language for media playback.  */
  private @NotNull String default_language;
 public @NotNull String getDefault_language() {
   return default_language;
 }

 @JsonDeserialize( as=String.class )
 public void setDefault_language(@NotNull String val ) {
   default_language = val;
 }

  /**  Maximum number of simultaneous channels.  */
  private @Nullable int max_channels;
 public @Nullable int getMax_channels() {
   return max_channels;
 }

 @JsonDeserialize( as=int.class )
 public void setMax_channels(@Nullable int val ) {
   max_channels = val;
 }

  /**  Maximum load avg on system.  */
  private @Nullable double max_load;
 public @Nullable double getMax_load() {
   return max_load;
 }

 @JsonDeserialize( as=double.class )
 public void setMax_load(@Nullable double val ) {
   max_load = val;
 }

  /**  Maximum number of open file handles (files, sockets).  */
  private @Nullable int max_open_files;
 public @Nullable int getMax_open_files() {
   return max_open_files;
 }

 @JsonDeserialize( as=int.class )
 public void setMax_open_files(@Nullable int val ) {
   max_open_files = val;
 }

  /**  Asterisk system name.  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**  Effective user/group id for running Asterisk.  */
  private @NotNull SetId setid;
 public @NotNull SetId getSetid() {
   return setid;
 }

 @JsonDeserialize( as=SetId_impl_ari_2_0_0.class )
 public void setSetid(@NotNull SetId val ) {
   setid = val;
 }

/** No missing signatures from interface */
}

