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
 * Endpoint state changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class EndpointStateChange_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements EndpointStateChange, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull Endpoint endpoint;
 public @NotNull Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_1_5_0.class )
 public void setEndpoint(@NotNull Endpoint val ) {
   endpoint = val;
 }

/** No missing signatures from interface */
}

