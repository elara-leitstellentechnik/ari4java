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


public interface ActionApplications {

// de.elara.common.utils.concurrent.SafeCompletionStage<List<Application>> list
/**********************************************************
 * List all applications.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<List<Application>> list();



// de.elara.common.utils.concurrent.SafeCompletionStage<Application> get @NotNull String
/**********************************************************
 * Get details of an application.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Application> get(@NotNull String applicationName);



// de.elara.common.utils.concurrent.SafeCompletionStage<Application> subscribe @NotNull String @NotNull String
/**********************************************************
 * Subscribe an application to a event source.
 * Returns the state of the application after the subscriptions have changed
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Application> subscribe(@NotNull String applicationName, @NotNull String eventSource);



// de.elara.common.utils.concurrent.SafeCompletionStage<Application> unsubscribe @NotNull String @NotNull String
/**********************************************************
 * Unsubscribe an application from an event source.
 * Returns the state of the application after the subscriptions have changed
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Application> unsubscribe(@NotNull String applicationName, @NotNull String eventSource);


}
;
