package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

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
 * Notification that a device state has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class DeviceStateChanged_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements DeviceStateChanged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Device state object  */
  private @NotNull DeviceState device_state;
 public @NotNull DeviceState getDevice_state() {
   return device_state;
 }

 @JsonDeserialize( as=DeviceState_impl_ari_2_0_0.class )
 public void setDevice_state(@NotNull DeviceState val ) {
   device_state = val;
 }

/** No missing signatures from interface */
}

