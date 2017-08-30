package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:17 CEST 2017
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


public interface LogChannel {

// @NotNull String getChannel
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getChannel();



// @NotNull String getType
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getType();



// @NotNull String getStatus
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getStatus();



// @NotNull String getConfiguration
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getConfiguration();



// void setChannel @NotNull String
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setChannel(@NotNull String val );



// void setType @NotNull String
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setType(@NotNull String val );



// void setStatus @NotNull String
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setStatus(@NotNull String val );



// void setConfiguration @NotNull String
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setConfiguration(@NotNull String val );


}
;
