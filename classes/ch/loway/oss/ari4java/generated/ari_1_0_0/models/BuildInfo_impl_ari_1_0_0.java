package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:02:58 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Info about how Asterisk was built
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class BuildInfo_impl_ari_1_0_0 implements BuildInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Date and time when Asterisk was built.  */
  private @NotNull String date;
 public @NotNull String getDate() {
   return date;
 }

 @JsonDeserialize( as=String.class )
 public void setDate(@NotNull String val ) {
   date = val;
 }

  /**  Kernel version Asterisk was built on.  */
  private @NotNull String kernel;
 public @NotNull String getKernel() {
   return kernel;
 }

 @JsonDeserialize( as=String.class )
 public void setKernel(@NotNull String val ) {
   kernel = val;
 }

  /**  Machine architecture (x86_64, i686, ppc, etc.)  */
  private @NotNull String machine;
 public @NotNull String getMachine() {
   return machine;
 }

 @JsonDeserialize( as=String.class )
 public void setMachine(@NotNull String val ) {
   machine = val;
 }

  /**  Compile time options, or empty string if default.  */
  private @NotNull String options;
 public @NotNull String getOptions() {
   return options;
 }

 @JsonDeserialize( as=String.class )
 public void setOptions(@NotNull String val ) {
   options = val;
 }

  /**  OS Asterisk was built on.  */
  private @NotNull String os;
 public @NotNull String getOs() {
   return os;
 }

 @JsonDeserialize( as=String.class )
 public void setOs(@NotNull String val ) {
   os = val;
 }

  /**  Username that build Asterisk  */
  private @NotNull String user;
 public @NotNull String getUser() {
   return user;
 }

 @JsonDeserialize( as=String.class )
 public void setUser(@NotNull String val ) {
   user = val;
 }

/** No missing signatures from interface */
}

