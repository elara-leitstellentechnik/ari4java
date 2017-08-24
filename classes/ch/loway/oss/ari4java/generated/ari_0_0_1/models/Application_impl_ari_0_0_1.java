package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Details of a Stasis application
 * 
 * Defined in file: applications.json
 * Generated by: Model
 *********************************************************/

public class Application_impl_ari_0_0_1 implements Application, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Id's for bridges subscribed to.  */
  private @NotNull List<String> bridge_ids;
 public @NotNull List<String> getBridge_ids() {
   return bridge_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setBridge_ids(@NotNull List<String> val ) {
   bridge_ids = val;
 }

  /**  Id's for channels subscribed to.  */
  private @NotNull List<String> channel_ids;
 public @NotNull List<String> getChannel_ids() {
   return channel_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setChannel_ids(@NotNull List<String> val ) {
   channel_ids = val;
 }

  /**  Names of the devices subscribed to.  */
  private @NotNull List<String> device_names;
 public @NotNull List<String> getDevice_names() {
   return device_names;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setDevice_names(@NotNull List<String> val ) {
   device_names = val;
 }

  /**  {tech}/{resource} for endpoints subscribed to.  */
  private @NotNull List<String> endpoint_ids;
 public @NotNull List<String> getEndpoint_ids() {
   return endpoint_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setEndpoint_ids(@NotNull List<String> val ) {
   endpoint_ids = val;
 }

  /**  Name of this application  */
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

