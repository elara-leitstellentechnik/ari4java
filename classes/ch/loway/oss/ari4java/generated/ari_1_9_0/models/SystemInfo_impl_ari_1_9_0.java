package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:04 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Info about Asterisk
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class SystemInfo_impl_ari_1_9_0 implements SystemInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull String entity_id;
 public @NotNull String getEntity_id() {
   return entity_id;
 }

 @JsonDeserialize( as=String.class )
 public void setEntity_id(@NotNull String val ) {
   entity_id = val;
 }

  /**  Asterisk version.  */
  private @NotNull String version;
 public @NotNull String getVersion() {
   return version;
 }

 @JsonDeserialize( as=String.class )
 public void setVersion(@NotNull String val ) {
   version = val;
 }

/** No missing signatures from interface */
}

