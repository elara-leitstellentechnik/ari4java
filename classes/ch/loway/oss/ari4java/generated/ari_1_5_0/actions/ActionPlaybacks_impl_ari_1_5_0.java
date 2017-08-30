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


public class ActionPlaybacks_impl_ari_1_5_0 extends BaseAriAction  implements ActionPlaybacks {
/**********************************************************
 * Control object for a playback operation.
 * 
 * Get a playback's details.
 *********************************************************/
private void buildGet(@NotNull String playbackId) {
reset();
url = "/playbacks/" + playbackId + "";
method = "GET";
lE.add( HttpResponse.build( 404, "The playback cannot be found") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Playback> get(@NotNull String playbackId) {
buildGet(playbackId);
de.elara.common.utils.concurrent.SafeCompletableFuture<Playback> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Playback_impl_ari_1_5_0.class);
return future;
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Stop a playback.
 *********************************************************/
private void buildStop(@NotNull String playbackId) {
reset();
url = "/playbacks/" + playbackId + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "The playback cannot be found") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> stop(@NotNull String playbackId) {
buildStop(playbackId);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Control a playback.
 *********************************************************/
private void buildControl(@NotNull String playbackId, @NotNull String operation) {
reset();
url = "/playbacks/" + playbackId + "/control";
method = "POST";
lParamQuery.add( HttpParam.build( "operation", operation) );
lE.add( HttpResponse.build( 400, "The provided operation parameter was invalid") );
lE.add( HttpResponse.build( 404, "The playback cannot be found") );
lE.add( HttpResponse.build( 409, "The operation cannot be performed in the playback's current state") );
}

@Override
public de.elara.common.utils.concurrent.SafeCompletionStage<Void> control(@NotNull String playbackId, @NotNull String operation) {
buildControl(playbackId, operation);
de.elara.common.utils.concurrent.SafeCompletableFuture<Void> future = new de.elara.common.utils.concurrent.SafeCompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/** No missing signatures from interface */
};

