package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:02:58 CEST 2017
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


public interface ChannelDestroyed {

// @NotNull int getCause
/**********************************************************
 * Integer representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull int getCause();



// @NotNull Channel getChannel
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull Channel getChannel();



// void setCause_txt @NotNull String
/**********************************************************
 * Text representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause_txt(@NotNull String val );



// void setChannel @NotNull Channel
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(@NotNull Channel val );



// @NotNull String getCause_txt
/**********************************************************
 * Text representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getCause_txt();



// void setCause @NotNull int
/**********************************************************
 * Integer representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause(@NotNull int val );


}
;
