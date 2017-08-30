package ch.loway.oss.ari4java.generated.ari_1_5_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:18 CEST 2017
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
import ch.loway.oss.ari4java.generated.ari_1_5_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionDeviceStates_impl_ari_1_5_0 extends BaseAriAction  implements ActionDeviceStates {
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
public de.elara.common.utils.concurrent.SafeCompletionStage<List<DeviceState>> list() {
buildList();
de.elara.common.utils.concurrent.SafeCompletableFuture<List<DeviceState>> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<DeviceState_impl_ari_1_5_0>>() {});
return future;
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
public de.elara.common.utils.concurrent.SafeCompletionStage<DeviceState> get(@NotNull String deviceName) {
buildGet(deviceName);
de.elara.common.utils.concurrent.SafeCompletableFuture<DeviceState> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), DeviceState_impl_ari_1_5_0.class);
return future;
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
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> update(@NotNull String deviceName, @NotNull String deviceState) {
buildUpdate(deviceName, deviceState);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
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
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> delete(@NotNull String deviceName) {
buildDelete(deviceName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/** No missing signatures from interface */
};

