package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

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
 * Channel variable changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelVarset_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements ChannelVarset, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel on which the variable was set.

If missing, the variable is a global variable.  */
  private @Nullable Channel channel;
 public @Nullable Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_0_0_1.class )
 public void setChannel(@Nullable Channel val ) {
   channel = val;
 }

  /**  The new value of the variable.  */
  private @NotNull String value;
 public @NotNull String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(@NotNull String val ) {
   value = val;
 }

  /**  The variable that changed.  */
  private @NotNull String variable;
 public @NotNull String getVariable() {
   return variable;
 }

 @JsonDeserialize( as=String.class )
 public void setVariable(@NotNull String val ) {
   variable = val;
 }

/** No missing signatures from interface */
}

