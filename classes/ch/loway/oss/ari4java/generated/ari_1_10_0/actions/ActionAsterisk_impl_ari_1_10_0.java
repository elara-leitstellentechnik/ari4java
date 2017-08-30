package ch.loway.oss.ari4java.generated.ari_1_10_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:19 CEST 2017
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
import ch.loway.oss.ari4java.generated.ari_1_10_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionAsterisk_impl_ari_1_10_0 extends BaseAriAction  implements ActionAsterisk {
/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Retrieve a dynamic configuration object.
 *********************************************************/
private void buildGetObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "GET";
lE.add( HttpResponse.build( 404, "{configClass|objectType|id} not found") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> getObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id) {
buildGetObject(configClass, objectType, id);
de.elara.common.utils.concurrent.SafeCompletableFuture<List<ConfigTuple>> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<ConfigTuple_impl_ari_1_10_0>>() {});
return future;
}

/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Create or update a dynamic configuration object.
 *********************************************************/
private void buildUpdateObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id, @Nullable Map<String,String> fields) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "PUT";
lParamBody.addAll( HttpParam.build( "fields", fields) );
lE.add( HttpResponse.build( 400, "Bad request body") );
lE.add( HttpResponse.build( 403, "Could not create or update object") );
lE.add( HttpResponse.build( 404, "{configClass|objectType} not found") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> updateObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id, @Nullable Map<String,String> fields) {
buildUpdateObject(configClass, objectType, id, fields);
de.elara.common.utils.concurrent.SafeCompletableFuture<List<ConfigTuple>> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<ConfigTuple_impl_ari_1_10_0>>() {});
return future;
}

/**********************************************************
 * Asterisk dynamic configuration
 * 
 * Delete a dynamic configuration object.
 *********************************************************/
private void buildDeleteObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id) {
reset();
url = "/asterisk/config/dynamic/" + configClass + "/" + objectType + "/" + id + "";
method = "DELETE";
lE.add( HttpResponse.build( 403, "Could not delete object") );
lE.add( HttpResponse.build( 404, "{configClass|objectType|id} not found") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id) {
buildDeleteObject(configClass, objectType, id);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk system information (similar to core show settings)
 * 
 * Gets Asterisk system information.
 *********************************************************/
private void buildGetInfo(@Nullable String only) {
reset();
url = "/asterisk/info";
method = "GET";
lParamQuery.add( HttpParam.build( "only", only) );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<AsteriskInfo> getInfo(@Nullable String only) {
buildGetInfo(only);
de.elara.common.utils.concurrent.SafeCompletableFuture<AsteriskInfo> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), AsteriskInfo_impl_ari_1_10_0.class);
return future;
}

/**********************************************************
 * Asterisk log channels
 * 
 * Gets Asterisk log channel information.
 *********************************************************/
private void buildListLogChannels() {
reset();
url = "/asterisk/logging";
method = "GET";
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<List<LogChannel>> listLogChannels() {
buildListLogChannels();
de.elara.common.utils.concurrent.SafeCompletableFuture<List<LogChannel>> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<LogChannel_impl_ari_1_10_0>>() {});
return future;
}

/**********************************************************
 * Asterisk log channel
 * 
 * Adds a log channel.
 *********************************************************/
private void buildAddLog(@NotNull String logChannelName, @NotNull String configuration) {
reset();
url = "/asterisk/logging/" + logChannelName + "";
method = "POST";
lParamQuery.add( HttpParam.build( "configuration", configuration) );
lE.add( HttpResponse.build( 400, "Bad request body") );
lE.add( HttpResponse.build( 409, "Log channel could not be created.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> addLog(@NotNull String logChannelName, @NotNull String configuration) {
buildAddLog(logChannelName, configuration);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk log channel
 * 
 * Deletes a log channel.
 *********************************************************/
private void buildDeleteLog(@NotNull String logChannelName) {
reset();
url = "/asterisk/logging/" + logChannelName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Log channel does not exist.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteLog(@NotNull String logChannelName) {
buildDeleteLog(logChannelName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk log channel
 * 
 * Rotates a log channel.
 *********************************************************/
private void buildRotateLog(@NotNull String logChannelName) {
reset();
url = "/asterisk/logging/" + logChannelName + "/rotate";
method = "PUT";
lE.add( HttpResponse.build( 404, "Log channel does not exist.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> rotateLog(@NotNull String logChannelName) {
buildRotateLog(logChannelName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk modules
 * 
 * List Asterisk modules.
 *********************************************************/
private void buildListModules() {
reset();
url = "/asterisk/modules";
method = "GET";
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<List<Module>> listModules() {
buildListModules();
de.elara.common.utils.concurrent.SafeCompletableFuture<List<Module>> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<Module_impl_ari_1_10_0>>() {});
return future;
}

/**********************************************************
 * Asterisk module
 * 
 * Get Asterisk module information.
 *********************************************************/
private void buildGetModule(@NotNull String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Module could not be found in running modules.") );
lE.add( HttpResponse.build( 409, "Module information could not be retrieved.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Module> getModule(@NotNull String moduleName) {
buildGetModule(moduleName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Module> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Module_impl_ari_1_10_0.class);
return future;
}

/**********************************************************
 * Asterisk module
 * 
 * Load an Asterisk module.
 *********************************************************/
private void buildLoadModule(@NotNull String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "POST";
lE.add( HttpResponse.build( 409, "Module could not be loaded.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> loadModule(@NotNull String moduleName) {
buildLoadModule(moduleName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk module
 * 
 * Unload an Asterisk module.
 *********************************************************/
private void buildUnloadModule(@NotNull String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Module not found in running modules.") );
lE.add( HttpResponse.build( 409, "Module could not be unloaded.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> unloadModule(@NotNull String moduleName) {
buildUnloadModule(moduleName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Asterisk module
 * 
 * Reload an Asterisk module.
 *********************************************************/
private void buildReloadModule(@NotNull String moduleName) {
reset();
url = "/asterisk/modules/" + moduleName + "";
method = "PUT";
lE.add( HttpResponse.build( 404, "Module not found in running modules.") );
lE.add( HttpResponse.build( 409, "Module could not be reloaded.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> reloadModule(@NotNull String moduleName) {
buildReloadModule(moduleName);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Global variables
 * 
 * Get the value of a global variable.
 *********************************************************/
private void buildGetGlobalVar(@NotNull String variable) {
reset();
url = "/asterisk/variable";
method = "GET";
lParamQuery.add( HttpParam.build( "variable", variable) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Variable> getGlobalVar(@NotNull String variable) {
buildGetGlobalVar(variable);
de.elara.common.utils.concurrent.SafeCompletableFuture<Variable> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Variable_impl_ari_1_10_0.class);
return future;
}

/**********************************************************
 * Global variables
 * 
 * Set the value of a global variable.
 *********************************************************/
private void buildSetGlobalVar(@NotNull String variable, @Nullable String value) {
reset();
url = "/asterisk/variable";
method = "POST";
lParamQuery.add( HttpParam.build( "variable", variable) );
lParamQuery.add( HttpParam.build( "value", value) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> setGlobalVar(@NotNull String variable, @Nullable String value) {
buildSetGlobalVar(variable, value);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/** No missing signatures from interface */
};

