package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Info about Asterisk status
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class StatusInfo_impl_ari_1_0_0 implements StatusInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Time when Asterisk was last reloaded.  */
  private @NotNull Date last_reload_time;
 public @NotNull Date getLast_reload_time() {
   return last_reload_time;
 }

 @JsonDeserialize( as=Date.class )
 public void setLast_reload_time(@NotNull Date val ) {
   last_reload_time = val;
 }

  /**  Time when Asterisk was started.  */
  private @NotNull Date startup_time;
 public @NotNull Date getStartup_time() {
   return startup_time;
 }

 @JsonDeserialize( as=Date.class )
 public void setStartup_time(@NotNull Date val ) {
   startup_time = val;
 }

/** No missing signatures from interface */
}

