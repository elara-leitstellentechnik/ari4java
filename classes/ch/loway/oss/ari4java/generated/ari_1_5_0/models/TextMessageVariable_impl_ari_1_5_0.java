package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:17 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * A key/value pair variable in a text message.
 * 
 * Defined in file: endpoints.json
 * Generated by: Model
 *********************************************************/

public class TextMessageVariable_impl_ari_1_5_0 implements TextMessageVariable, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A unique key identifying the variable.  */
  private @NotNull String key;
 public @NotNull String getKey() {
   return key;
 }

 @JsonDeserialize( as=String.class )
 public void setKey(@NotNull String val ) {
   key = val;
 }

  /**  The value of the variable.  */
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

