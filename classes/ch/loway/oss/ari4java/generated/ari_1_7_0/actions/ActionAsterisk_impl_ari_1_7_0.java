package ch.loway.oss.ari4java.generated.ari_1_7_0.actions;

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
import ch.loway.oss.ari4java.generated.ari_1_7_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionAsterisk_impl_ari_1_7_0 extends BaseAriAction  implements ActionAsterisk {
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
httpActionAsync(callbackOnceFuture(future), AsteriskInfo_impl_ari_1_7_0.class);
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
httpActionAsync(callbackOnceFuture(future), Variable_impl_ari_1_7_0.class);
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

/**********************************************************
 * Retrieve a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> getObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create or update a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> updateObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id, @Nullable Map<String,String> fields){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Delete a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * List Asterisk modules.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<Module>> listModules(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Get Asterisk module information.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Module> getModule(@NotNull String moduleName){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Load an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> loadModule(@NotNull String moduleName){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Unload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> unloadModule(@NotNull String moduleName){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Reload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> reloadModule(@NotNull String moduleName){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Gets Asterisk log channel information.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<LogChannel>> listLogChannels(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Adds a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> addLog(@NotNull String logChannelName, @NotNull String configuration){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Deletes a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteLog(@NotNull String logChannelName){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Rotates a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> rotateLog(@NotNull String logChannelName){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

