package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:16 CEST 2017
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


public interface ChannelHangupRequest {

// @Nullable int getCause
/**********************************************************
 * Integer representation of the cause of the hangup.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable int getCause();



// @Nullable boolean getSoft
/**********************************************************
 * Whether the hangup request was a soft hangup request.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable boolean getSoft();



// @NotNull Channel getChannel
/**********************************************************
 * The channel on which the hangup was requested.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull Channel getChannel();



// void setCause @Nullable int
/**********************************************************
 * Integer representation of the cause of the hangup.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause(@Nullable int val );



// void setSoft @Nullable boolean
/**********************************************************
 * Whether the hangup request was a soft hangup request.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setSoft(@Nullable boolean val );



// void setChannel @NotNull Channel
/**********************************************************
 * The channel on which the hangup was requested.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(@NotNull Channel val );


}
;
