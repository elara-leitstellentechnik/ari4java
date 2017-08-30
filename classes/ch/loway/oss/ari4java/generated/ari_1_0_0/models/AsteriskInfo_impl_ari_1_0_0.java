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
 * Asterisk system information
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class AsteriskInfo_impl_ari_1_0_0 implements AsteriskInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Info about how Asterisk was built  */
  private @Nullable BuildInfo build;
 public @Nullable BuildInfo getBuild() {
   return build;
 }

 @JsonDeserialize( as=BuildInfo_impl_ari_1_0_0.class )
 public void setBuild(@Nullable BuildInfo val ) {
   build = val;
 }

  /**  Info about Asterisk configuration  */
  private @Nullable ConfigInfo config;
 public @Nullable ConfigInfo getConfig() {
   return config;
 }

 @JsonDeserialize( as=ConfigInfo_impl_ari_1_0_0.class )
 public void setConfig(@Nullable ConfigInfo val ) {
   config = val;
 }

  /**  Info about Asterisk status  */
  private @Nullable StatusInfo status;
 public @Nullable StatusInfo getStatus() {
   return status;
 }

 @JsonDeserialize( as=StatusInfo_impl_ari_1_0_0.class )
 public void setStatus(@Nullable StatusInfo val ) {
   status = val;
 }

  /**  Info about the system running Asterisk  */
  private @Nullable SystemInfo system;
 public @Nullable SystemInfo getSystem() {
   return system;
 }

 @JsonDeserialize( as=SystemInfo_impl_ari_1_0_0.class )
 public void setSystem(@Nullable SystemInfo val ) {
   system = val;
 }

/** No missing signatures from interface */
}

