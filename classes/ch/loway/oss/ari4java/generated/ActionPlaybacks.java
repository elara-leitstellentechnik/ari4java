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


public interface ActionPlaybacks {

// de.elara.common.utils.concurrent.SafeCompletionStage<Playback> get @NotNull String
/**********************************************************
 * Get a playback's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Playback> get(@NotNull String playbackId);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> stop @NotNull String
/**********************************************************
 * Stop a playback.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> stop(@NotNull String playbackId);



// de.elara.common.utils.concurrent.SafeCompletionStage<Void> control @NotNull String @NotNull String
/**********************************************************
 * Control a playback.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> control(@NotNull String playbackId, @NotNull String operation);


}
;
