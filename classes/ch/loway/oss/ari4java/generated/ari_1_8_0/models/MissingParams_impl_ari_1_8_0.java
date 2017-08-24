package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:34 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Error event sent when required params are missing.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class MissingParams_impl_ari_1_8_0 extends Message_impl_ari_1_8_0 implements MissingParams, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A list of the missing parameters  */
  private @NotNull List<String> params;
 public @NotNull List<String> getParams() {
   return params;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setParams(@NotNull List<String> val ) {
   params = val;
 }

/** No missing signatures from interface */
}

