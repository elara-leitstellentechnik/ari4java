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
 * Represents the state of a device.
 * 
 * Defined in file: deviceStates.json
 * Generated by: Model
 *********************************************************/

public class DeviceState_impl_ari_1_0_0 implements DeviceState, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Name of the device.  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**  Device's state  */
  private @NotNull String state;
 public @NotNull String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(@NotNull String val ) {
   state = val;
 }

/** No missing signatures from interface */
}

