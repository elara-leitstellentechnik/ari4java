package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

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
 * A text message.
 * 
 * Defined in file: endpoints.json
 * Generated by: Model
 *********************************************************/

public class TextMessage_impl_ari_2_0_0 implements TextMessage, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The text of the message.  */
  private @NotNull String body;
 public @NotNull String getBody() {
   return body;
 }

 @JsonDeserialize( as=String.class )
 public void setBody(@NotNull String val ) {
   body = val;
 }

  /**  A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.  */
  private @NotNull String from;
 public @NotNull String getFrom() {
   return from;
 }

 @JsonDeserialize( as=String.class )
 public void setFrom(@NotNull String val ) {
   from = val;
 }

  /**  A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.  */
  private @NotNull String to;
 public @NotNull String getTo() {
   return to;
 }

 @JsonDeserialize( as=String.class )
 public void setTo(@NotNull String val ) {
   to = val;
 }

  /**  Technology specific key/value pairs associated with the message.  */
  private @Nullable List<TextMessageVariable> variables;
 public @Nullable List<TextMessageVariable> getVariables() {
   return variables;
 }

 @JsonDeserialize( contentAs=TextMessageVariable_impl_ari_2_0_0.class )
 public void setVariables(@Nullable List<TextMessageVariable> val ) {
   variables = val;
 }

/** No missing signatures from interface */
}

