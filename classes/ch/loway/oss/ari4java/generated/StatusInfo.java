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


public interface StatusInfo {

// @NotNull Date getLast_reload_time
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull Date getLast_reload_time();



// @NotNull Date getStartup_time
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull Date getStartup_time();



// void setStartup_time @NotNull Date
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setStartup_time(@NotNull Date val );



// void setLast_reload_time @NotNull Date
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setLast_reload_time(@NotNull Date val );


}
;
