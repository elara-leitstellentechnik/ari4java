package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

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
 * Notification that a blind transfer has occurred.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeBlindTransfer_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements BridgeBlindTransfer, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The bridge being transferred  */
  private @Nullable Bridge bridge;
 public @Nullable Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_5_0.class )
 public void setBridge(@Nullable Bridge val ) {
   bridge = val;
 }

  /**  The channel performing the blind transfer  */
  private @NotNull Channel channel;
 public @NotNull Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_5_0.class )
 public void setChannel(@NotNull Channel val ) {
   channel = val;
 }

  /**  The context transferred to  */
  private @NotNull String context;
 public @NotNull String getContext() {
   return context;
 }

 @JsonDeserialize( as=String.class )
 public void setContext(@NotNull String val ) {
   context = val;
 }

  /**  The extension transferred to  */
  private @NotNull String exten;
 public @NotNull String getExten() {
   return exten;
 }

 @JsonDeserialize( as=String.class )
 public void setExten(@NotNull String val ) {
   exten = val;
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

  /**  The channel that is replacing transferer when the transferee(s) can not be transferred directly  */
  private @Nullable Channel replace_channel;
 public @Nullable Channel getReplace_channel() {
   return replace_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_5_0.class )
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

  /**  The channel that is being transferred  */
  private @Nullable Channel transferee;
 public @Nullable Channel getTransferee() {
   return transferee;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_5_0.class )
 public void setTransferee(@Nullable Channel val ) {
   transferee = val;
 }

/** No missing signatures from interface */
}

