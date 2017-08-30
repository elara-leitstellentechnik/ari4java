package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:18 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * A key/value pair that makes up part of a configuration object.
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class ConfigTuple_impl_ari_1_9_0 implements ConfigTuple, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A configuration object attribute.  */
  private @NotNull String attribute;
 public @NotNull String getAttribute() {
   return attribute;
 }

 @JsonDeserialize( as=String.class )
 public void setAttribute(@NotNull String val ) {
   attribute = val;
 }

  /**  The value for the attribute.  */
  private @NotNull String value;
 public @NotNull String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(@NotNull String val ) {
   value = val;
 }

/** No missing signatures from interface */
}

