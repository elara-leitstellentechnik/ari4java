package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

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
 * Caller identification
 * 
 * Defined in file: channels.json
 * Generated by: Model
 *********************************************************/

public class CallerID_impl_ari_1_8_0 implements CallerID, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**    */
  private @NotNull String number;
 public @NotNull String getNumber() {
   return number;
 }

 @JsonDeserialize( as=String.class )
 public void setNumber(@NotNull String val ) {
   number = val;
 }

/** No missing signatures from interface */
}

