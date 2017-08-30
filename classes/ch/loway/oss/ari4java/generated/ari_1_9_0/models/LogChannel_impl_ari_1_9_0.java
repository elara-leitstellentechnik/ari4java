package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

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
 * Details of an Asterisk log channel
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class LogChannel_impl_ari_1_9_0 implements LogChannel, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The log channel path  */
  private @NotNull String channel;
 public @NotNull String getChannel() {
   return channel;
 }

 @JsonDeserialize( as=String.class )
 public void setChannel(@NotNull String val ) {
   channel = val;
 }

  /**  The various log levels  */
  private @NotNull String configuration;
 public @NotNull String getConfiguration() {
   return configuration;
 }

 @JsonDeserialize( as=String.class )
 public void setConfiguration(@NotNull String val ) {
   configuration = val;
 }

  /**  Whether or not a log type is enabled  */
  private @NotNull String status;
 public @NotNull String getStatus() {
   return status;
 }

 @JsonDeserialize( as=String.class )
 public void setStatus(@NotNull String val ) {
   status = val;
 }

  /**  Types of logs for the log channel  */
  private @NotNull String type;
 public @NotNull String getType() {
   return type;
 }

 @JsonDeserialize( as=String.class )
 public void setType(@NotNull String val ) {
   type = val;
 }

/** No missing signatures from interface */
}

