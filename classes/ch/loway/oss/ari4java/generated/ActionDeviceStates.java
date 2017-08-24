package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionDeviceStates {

// void update @NotNull String @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void update(@NotNull String deviceName, @NotNull String deviceState, @NotNull AriCallback<Void> callback);



// void update @NotNull String @NotNull String
/**********************************************************
 * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void update(@NotNull String deviceName, @NotNull String deviceState) throws RestException;



// DeviceState get @NotNull String
/**********************************************************
 * Retrieve the current state of a device.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public DeviceState get(@NotNull String deviceName) throws RestException;



// List<DeviceState> list
/**********************************************************
 * List all ARI controlled device states.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<DeviceState> list() throws RestException;



// void get @NotNull String @NotNull AriCallback<DeviceState> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(@NotNull String deviceName, @NotNull AriCallback<DeviceState> callback);



// void delete @NotNull String
/**********************************************************
 * Destroy a device-state controlled by ARI.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void delete(@NotNull String deviceName) throws RestException;



// void list @NotNull AriCallback<List<DeviceState>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(@NotNull AriCallback<List<DeviceState>> callback);



// void delete @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void delete(@NotNull String deviceName, @NotNull AriCallback<Void> callback);


}
;
