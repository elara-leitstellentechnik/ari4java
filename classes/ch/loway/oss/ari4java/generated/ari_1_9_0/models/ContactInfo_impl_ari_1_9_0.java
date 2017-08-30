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
 * Detailed information about a contact on an endpoint.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ContactInfo_impl_ari_1_9_0 implements ContactInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The Address of Record this contact belongs to.  */
  private @NotNull String aor;
 public @NotNull String getAor() {
   return aor;
 }

 @JsonDeserialize( as=String.class )
 public void setAor(@NotNull String val ) {
   aor = val;
 }

  /**  The current status of the contact.  */
  private @NotNull String contact_status;
 public @NotNull String getContact_status() {
   return contact_status;
 }

 @JsonDeserialize( as=String.class )
 public void setContact_status(@NotNull String val ) {
   contact_status = val;
 }

  /**  Current round trip time, in microseconds, for the contact.  */
  private @Nullable String roundtrip_usec;
 public @Nullable String getRoundtrip_usec() {
   return roundtrip_usec;
 }

 @JsonDeserialize( as=String.class )
 public void setRoundtrip_usec(@Nullable String val ) {
   roundtrip_usec = val;
 }

  /**  The location of the contact.  */
  private @NotNull String uri;
 public @NotNull String getUri() {
   return uri;
 }

 @JsonDeserialize( as=String.class )
 public void setUri(@NotNull String val ) {
   uri = val;
 }

/** No missing signatures from interface */
}

