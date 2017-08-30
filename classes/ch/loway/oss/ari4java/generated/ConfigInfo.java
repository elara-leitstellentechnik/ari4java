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


public interface ConfigInfo {

// @NotNull String getName
/**********************************************************
 * Asterisk system name.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getName();



// @NotNull String getDefault_language
/**********************************************************
 * Default language for media playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getDefault_language();



// @Nullable int getMax_channels
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable int getMax_channels();



// @Nullable int getMax_open_files
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable int getMax_open_files();



// @Nullable double getMax_load
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @Nullable double getMax_load();



// @NotNull SetId getSetid
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull SetId getSetid();



// void setName @NotNull String
/**********************************************************
 * Asterisk system name.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(@NotNull String val );



// void setDefault_language @NotNull String
/**********************************************************
 * Default language for media playback.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDefault_language(@NotNull String val );



// void setMax_channels @Nullable int
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_channels(@Nullable int val );



// void setMax_open_files @Nullable int
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_open_files(@Nullable int val );



// void setMax_load @Nullable double
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMax_load(@Nullable double val );



// void setSetid @NotNull SetId
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setSetid(@NotNull SetId val );


}
;
