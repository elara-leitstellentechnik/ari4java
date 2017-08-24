package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:03:00 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Notification that an attended transfer has occurred.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeAttendedTransfer_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements BridgeAttendedTransfer, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Application that has been transferred into  */
  private @Nullable String destination_application;
 public @Nullable String getDestination_application() {
   return destination_application;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_application(@Nullable String val ) {
   destination_application = val;
 }

  /**  Bridge that survived the merge result  */
  private @Nullable String destination_bridge;
 public @Nullable String getDestination_bridge() {
   return destination_bridge;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_bridge(@Nullable String val ) {
   destination_bridge = val;
 }

  /**  First leg of a link transfer result  */
  private @Nullable Channel destination_link_first_leg;
 public @Nullable Channel getDestination_link_first_leg() {
   return destination_link_first_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setDestination_link_first_leg(@Nullable Channel val ) {
   destination_link_first_leg = val;
 }

  /**  Second leg of a link transfer result  */
  private @Nullable Channel destination_link_second_leg;
 public @Nullable Channel getDestination_link_second_leg() {
   return destination_link_second_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setDestination_link_second_leg(@Nullable Channel val ) {
   destination_link_second_leg = val;
 }

  /**  Bridge that survived the threeway result  */
  private @Nullable Bridge destination_threeway_bridge;
 public @Nullable Bridge getDestination_threeway_bridge() {
   return destination_threeway_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setDestination_threeway_bridge(@Nullable Bridge val ) {
   destination_threeway_bridge = val;
 }

  /**  Transferer channel that survived the threeway result  */
  private @Nullable Channel destination_threeway_channel;
 public @Nullable Channel getDestination_threeway_channel() {
   return destination_threeway_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setDestination_threeway_channel(@Nullable Channel val ) {
   destination_threeway_channel = val;
 }

  /**  How the transfer was accomplished  */
  private @NotNull String destination_type;
 public @NotNull String getDestination_type() {
   return destination_type;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_type(@NotNull String val ) {
   destination_type = val;
 }

  /**  Whether the transfer was externally initiated or not  */
  private @NotNull boolean is_external;
 public @NotNull boolean getIs_external() {
   return is_external;
 }

 @JsonDeserialize( as=boolean.class )
 public void setIs_external(@NotNull boolean val ) {
   is_external = val;
 }

  /**  The channel that is replacing transferer_first_leg in the swap  */
  private @Nullable Channel replace_channel;
 public @Nullable Channel getReplace_channel() {
   return replace_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setReplace_channel(@Nullable Channel val ) {
   replace_channel = val;
 }

  /**  The result of the transfer attempt  */
  private @NotNull String result;
 public @NotNull String getResult() {
   return result;
 }

 @JsonDeserialize( as=String.class )
 public void setResult(@NotNull String val ) {
   result = val;
 }

  /**  The channel that is being transferred to  */
  private @Nullable Channel transfer_target;
 public @Nullable Channel getTransfer_target() {
   return transfer_target;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setTransfer_target(@Nullable Channel val ) {
   transfer_target = val;
 }

  /**  The channel that is being transferred  */
  private @Nullable Channel transferee;
 public @Nullable Channel getTransferee() {
   return transferee;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setTransferee(@Nullable Channel val ) {
   transferee = val;
 }

  /**  First leg of the transferer  */
  private @NotNull Channel transferer_first_leg;
 public @NotNull Channel getTransferer_first_leg() {
   return transferer_first_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setTransferer_first_leg(@NotNull Channel val ) {
   transferer_first_leg = val;
 }

  /**  Bridge the transferer first leg is in  */
  private @Nullable Bridge transferer_first_leg_bridge;
 public @Nullable Bridge getTransferer_first_leg_bridge() {
   return transferer_first_leg_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setTransferer_first_leg_bridge(@Nullable Bridge val ) {
   transferer_first_leg_bridge = val;
 }

  /**  Second leg of the transferer  */
  private @NotNull Channel transferer_second_leg;
 public @NotNull Channel getTransferer_second_leg() {
   return transferer_second_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_10_0.class )
 public void setTransferer_second_leg(@NotNull Channel val ) {
   transferer_second_leg = val;
 }

  /**  Bridge the transferer second leg is in  */
  private @Nullable Bridge transferer_second_leg_bridge;
 public @Nullable Bridge getTransferer_second_leg_bridge() {
   return transferer_second_leg_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setTransferer_second_leg_bridge(@Nullable Bridge val ) {
   transferer_second_leg_bridge = val;
 }

/** No missing signatures from interface */
}

