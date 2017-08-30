package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Details of an Asterisk module
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class Module_impl_ari_1_10_0 implements Module, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The description of this module  */
  private @NotNull String description;
 public @NotNull String getDescription() {
   return description;
 }

 @JsonDeserialize( as=String.class )
 public void setDescription(@NotNull String val ) {
   description = val;
 }

  /**  The name of this module  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**  The running status of this module  */
  private @NotNull String status;
 public @NotNull String getStatus() {
   return status;
 }

 @JsonDeserialize( as=String.class )
 public void setStatus(@NotNull String val ) {
   status = val;
 }

  /**  The support state of this module  */
  private @NotNull String support_level;
 public @NotNull String getSupport_level() {
   return support_level;
 }

 @JsonDeserialize( as=String.class )
 public void setSupport_level(@NotNull String val ) {
   support_level = val;
 }

  /**  The number of times this module is being used  */
  private @NotNull int use_count;
 public @NotNull int getUse_count() {
   return use_count;
 }

 @JsonDeserialize( as=int.class )
 public void setUse_count(@NotNull int val ) {
   use_count = val;
 }

/** No missing signatures from interface */
}

