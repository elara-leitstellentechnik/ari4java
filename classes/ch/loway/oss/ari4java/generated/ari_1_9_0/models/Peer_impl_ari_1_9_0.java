package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:02:59 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Detailed information about a remote peer that communicates with Asterisk.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class Peer_impl_ari_1_9_0 implements Peer, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The IP address of the peer.  */
  private @Nullable String address;
 public @Nullable String getAddress() {
   return address;
 }

 @JsonDeserialize( as=String.class )
 public void setAddress(@Nullable String val ) {
   address = val;
 }

  /**  An optional reason associated with the change in peer_status.  */
  private @Nullable String cause;
 public @Nullable String getCause() {
   return cause;
 }

 @JsonDeserialize( as=String.class )
 public void setCause(@Nullable String val ) {
   cause = val;
 }

  /**  The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.  */
  private @NotNull String peer_status;
 public @NotNull String getPeer_status() {
   return peer_status;
 }

 @JsonDeserialize( as=String.class )
 public void setPeer_status(@NotNull String val ) {
   peer_status = val;
 }

  /**  The port of the peer.  */
  private @Nullable String port;
 public @Nullable String getPort() {
   return port;
 }

 @JsonDeserialize( as=String.class )
 public void setPort(@Nullable String val ) {
   port = val;
 }

  /**  The last known time the peer was contacted.  */
  private @Nullable String time;
 public @Nullable String getTime() {
   return time;
 }

 @JsonDeserialize( as=String.class )
 public void setTime(@Nullable String val ) {
   time = val;
 }

/** No missing signatures from interface */
}

