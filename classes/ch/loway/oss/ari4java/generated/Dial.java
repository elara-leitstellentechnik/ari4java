package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
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


public interface Dial {

// @Nullable String getForward
/**********************************************************
 * Forwarding target requested by the original dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @Nullable String getForward();



// @NotNull String getDialstatus
/**********************************************************
 * Current status of the dialing attempt to the peer.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @NotNull String getDialstatus();



// void setCaller @Nullable Channel
/**********************************************************
 * The calling channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setCaller(@Nullable Channel val );



// void setPeer @NotNull Channel
/**********************************************************
 * The dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setPeer(@NotNull Channel val );



// void setForward @Nullable String
/**********************************************************
 * Forwarding target requested by the original dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setForward(@Nullable String val );



// void setForwarded @Nullable Channel
/**********************************************************
 * Channel that the caller has been forwarded to.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setForwarded(@Nullable Channel val );



// void setDialstatus @NotNull String
/**********************************************************
 * Current status of the dialing attempt to the peer.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setDialstatus(@NotNull String val );



// @Nullable Channel getForwarded
/**********************************************************
 * Channel that the caller has been forwarded to.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @Nullable Channel getForwarded();



// @NotNull Channel getPeer
/**********************************************************
 * The dialed channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @NotNull Channel getPeer();



// void setDialstring @Nullable String
/**********************************************************
 * The dial string for calling the peer channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setDialstring(@Nullable String val );



// @Nullable Channel getCaller
/**********************************************************
 * The calling channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @Nullable Channel getCaller();



// @Nullable String getDialstring
/**********************************************************
 * The dial string for calling the peer channel.
 * 
 * @since ari_1_0_0
 *********************************************************/
 public @Nullable String getDialstring();


}
;
