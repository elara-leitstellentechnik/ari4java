package ch.loway.oss.ari4java.generated.ari_1_6_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:36 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_6_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionDeviceStates_impl_ari_1_6_0 extends BaseAriAction  implements ActionDeviceStates {
/**********************************************************
 * Device states
 * 
 * List all ARI controlled device states.
 *********************************************************/
private void buildList() {
reset();
url = "/deviceStates";
method = "GET";
}

@Override
public List<DeviceState> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<DeviceState_impl_ari_1_6_0>>() {} ); 
}

@Override
public void list(@NotNull AriCallback<List<DeviceState>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<DeviceState_impl_ari_1_6_0>>() {});
}

/**********************************************************
 * Device state
 * 
 * Retrieve the current state of a device.
 *********************************************************/
private void buildGet(@NotNull String deviceName) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "GET";
}

@Override
public DeviceState get(@NotNull String deviceName) throws RestException {
buildGet(deviceName);
String json = httpActionSync();
return deserializeJson( json, DeviceState_impl_ari_1_6_0.class ); 
}

@Override
public void get(@NotNull String deviceName, @NotNull AriCallback<DeviceState> callback) {
buildGet(deviceName);
httpActionAsync(callback, DeviceState_impl_ari_1_6_0.class);
}

/**********************************************************
 * Device state
 * 
 * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
 *********************************************************/
private void buildUpdate(@NotNull String deviceName, @NotNull String deviceState) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "PUT";
lParamQuery.add( HttpParam.build( "deviceState", deviceState) );
lE.add( HttpResponse.build( 404, "Device name is missing") );
lE.add( HttpResponse.build( 409, "Uncontrolled device specified") );
}

@Override
public void update(@NotNull String deviceName, @NotNull String deviceState) throws RestException {
buildUpdate(deviceName, deviceState);
String json = httpActionSync();
}

@Override
public void update(@NotNull String deviceName, @NotNull String deviceState, @NotNull AriCallback<Void> callback) {
buildUpdate(deviceName, deviceState);
httpActionAsync(callback);
}

/**********************************************************
 * Device state
 * 
 * Destroy a device-state controlled by ARI.
 *********************************************************/
private void buildDelete(@NotNull String deviceName) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Device name is missing") );
lE.add( HttpResponse.build( 409, "Uncontrolled device specified") );
}

@Override
public void delete(@NotNull String deviceName) throws RestException {
buildDelete(deviceName);
String json = httpActionSync();
}

@Override
public void delete(@NotNull String deviceName, @NotNull AriCallback<Void> callback) {
buildDelete(deviceName);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

