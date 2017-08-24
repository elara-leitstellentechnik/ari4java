package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 17:02:59 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Dialplan location (context/extension/priority)
 * 
 * Defined in file: channels.json
 * Generated by: Model
 *********************************************************/

public class DialplanCEP_impl_ari_1_9_0 implements DialplanCEP, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Context in the dialplan  */
  private @NotNull String context;
 public @NotNull String getContext() {
   return context;
 }

 @JsonDeserialize( as=String.class )
 public void setContext(@NotNull String val ) {
   context = val;
 }

  /**  Extension in the dialplan  */
  private @NotNull String exten;
 public @NotNull String getExten() {
   return exten;
 }

 @JsonDeserialize( as=String.class )
 public void setExten(@NotNull String val ) {
   exten = val;
 }

  /**  Priority in the dialplan  */
  private @NotNull long priority;
 public @NotNull long getPriority() {
   return priority;
 }

 @JsonDeserialize( as=long.class )
 public void setPriority(@NotNull long val ) {
   priority = val;
 }

/** No missing signatures from interface */
}

