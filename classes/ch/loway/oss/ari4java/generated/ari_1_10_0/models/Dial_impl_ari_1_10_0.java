package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Dialing state has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class Dial_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements Dial, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The calling channel.  */
  private @Nullable Channel caller;
 public @Nullable Channel getCaller() {
   return caller;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setCaller(@Nullable Channel val ) {
   caller = val;
 }

  /**  Current status of the dialing attempt to the peer.  */
  private @NotNull String dialstatus;
 public @NotNull String getDialstatus() {
   return dialstatus;
 }

 @JsonDeserialize( as=String.class )
 public void setDialstatus(@NotNull String val ) {
   dialstatus = val;
 }

  /**  The dial string for calling the peer channel.  */
  private @Nullable String dialstring;
 public @Nullable String getDialstring() {
   return dialstring;
 }

 @JsonDeserialize( as=String.class )
 public void setDialstring(@Nullable String val ) {
   dialstring = val;
 }

  /**  Forwarding target requested by the original dialed channel.  */
  private @Nullable String forward;
 public @Nullable String getForward() {
   return forward;
 }

 @JsonDeserialize( as=String.class )
 public void setForward(@Nullable String val ) {
   forward = val;
 }

  /**  Channel that the caller has been forwarded to.  */
  private @Nullable Channel forwarded;
 public @Nullable Channel getForwarded() {
   return forwarded;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setForwarded(@Nullable Channel val ) {
   forwarded = val;
 }

  /**  The dialed channel.  */
  private @NotNull Channel peer;
 public @NotNull Channel getPeer() {
   return peer;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setPeer(@NotNull Channel val ) {
   peer = val;
 }

/** No missing signatures from interface */
}

