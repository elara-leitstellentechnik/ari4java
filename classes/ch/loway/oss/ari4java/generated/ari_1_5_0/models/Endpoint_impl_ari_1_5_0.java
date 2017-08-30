package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

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
 * An external device that may offer/accept calls to/from Asterisk.
 * 
 * Unlike most resources, which have a single unique identifier, an endpoint is uniquely identified by the technology/resource pair.
 * 
 * Defined in file: endpoints.json
 * Generated by: Model
 *********************************************************/

public class Endpoint_impl_ari_1_5_0 implements Endpoint, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Id's of channels associated with this endpoint  */
  private @NotNull List<String> channel_ids;
 public @NotNull List<String> getChannel_ids() {
   return channel_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setChannel_ids(@NotNull List<String> val ) {
   channel_ids = val;
 }

  /**  Identifier of the endpoint, specific to the given technology.  */
  private @NotNull String resource;
 public @NotNull String getResource() {
   return resource;
 }

 @JsonDeserialize( as=String.class )
 public void setResource(@NotNull String val ) {
   resource = val;
 }

  /**  Endpoint's state  */
  private @Nullable String state;
 public @Nullable String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(@Nullable String val ) {
   state = val;
 }

  /**  Technology of the endpoint  */
  private @NotNull String technology;
 public @NotNull String getTechnology() {
   return technology;
 }

 @JsonDeserialize( as=String.class )
 public void setTechnology(@NotNull String val ) {
   technology = val;
 }

/** No missing signatures from interface */
}

