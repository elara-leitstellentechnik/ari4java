package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:16 CEST 2017
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


public interface ActionAsterisk {

// de.elara.common.utils.concurrent.SafeCompletionStage<AsteriskInfo> getInfo @Nullable String
/**********************************************************
 * Gets Asterisk system information.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<AsteriskInfo> getInfo(@Nullable String only);



// de.elara.common.utils.concurrent.SafeCompletionStage<Variable> getGlobalVar @NotNull String
/**********************************************************
 * Get the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Variable> getGlobalVar(@NotNull String variable);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> setGlobalVar @NotNull String @Nullable String
/**********************************************************
 * Set the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> setGlobalVar(@NotNull String variable, @Nullable String value);



// de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> getObject @NotNull String @NotNull String @NotNull String
/**********************************************************
 * Retrieve a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> getObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id);



// de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> updateObject @NotNull String @NotNull String @NotNull String @Nullable Map<String,String>
/**********************************************************
 * Create or update a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<ConfigTuple>> updateObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id, @Nullable Map<String,String> fields);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteObject @NotNull String @NotNull String @NotNull String
/**********************************************************
 * Delete a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteObject(@NotNull String configClass, @NotNull String objectType, @NotNull String id);



// de.elara.common.utils.concurrent.SafeCompletionStage<List<Module>> listModules
/**********************************************************
 * List Asterisk modules.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<Module>> listModules();



// de.elara.common.utils.concurrent.SafeCompletionStage<Module> getModule @NotNull String
/**********************************************************
 * Get Asterisk module information.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Module> getModule(@NotNull String moduleName);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> loadModule @NotNull String
/**********************************************************
 * Load an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> loadModule(@NotNull String moduleName);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> unloadModule @NotNull String
/**********************************************************
 * Unload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> unloadModule(@NotNull String moduleName);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> reloadModule @NotNull String
/**********************************************************
 * Reload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> reloadModule(@NotNull String moduleName);



// de.elara.common.utils.concurrent.SafeCompletionStage<List<LogChannel>> listLogChannels
/**********************************************************
 * Gets Asterisk log channel information.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<LogChannel>> listLogChannels();



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> addLog @NotNull String @NotNull String
/**********************************************************
 * Adds a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> addLog(@NotNull String logChannelName, @NotNull String configuration);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteLog @NotNull String
/**********************************************************
 * Deletes a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> deleteLog(@NotNull String logChannelName);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> rotateLog @NotNull String
/**********************************************************
 * Rotates a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> rotateLog(@NotNull String logChannelName);


}
;
