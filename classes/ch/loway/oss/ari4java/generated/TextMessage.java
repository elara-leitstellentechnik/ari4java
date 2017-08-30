package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:03 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface TextMessage {

// @NotNull String getFrom
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getFrom();



// @NotNull String getTo
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getTo();



// @NotNull String getBody
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getBody();



// @Nullable List<TextMessageVariable> getVariables
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable List<TextMessageVariable> getVariables();



// void setFrom @NotNull String
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setFrom(@NotNull String val );



// void setTo @NotNull String
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTo(@NotNull String val );



// void setBody @NotNull String
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBody(@NotNull String val );



// void setVariables @Nullable List<TextMessageVariable>
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setVariables(@Nullable List<TextMessageVariable> val );


}
;
