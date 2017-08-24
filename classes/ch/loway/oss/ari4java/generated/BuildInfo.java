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


public interface BuildInfo {

// void setUser @NotNull String
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUser(@NotNull String val );



// @NotNull String getDate
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getDate();



// void setDate @NotNull String
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDate(@NotNull String val );



// void setOs @NotNull String
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOs(@NotNull String val );



// @NotNull String getOptions
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getOptions();



// void setKernel @NotNull String
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setKernel(@NotNull String val );



// @NotNull String getKernel
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getKernel();



// @NotNull String getMachine
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getMachine();



// void setMachine @NotNull String
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMachine(@NotNull String val );



// @NotNull String getOs
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getOs();



// @NotNull String getUser
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getUser();



// void setOptions @NotNull String
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOptions(@NotNull String val );


}
;
