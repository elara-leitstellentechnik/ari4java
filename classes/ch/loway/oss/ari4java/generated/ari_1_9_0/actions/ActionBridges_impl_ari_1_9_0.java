package ch.loway.oss.ari4java.generated.ari_1_9_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:05 CEST 2017
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
import ch.loway.oss.ari4java.generated.ari_1_9_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionBridges_impl_ari_1_9_0 extends BaseAriAction  implements ActionBridges {
/**********************************************************
 * Active bridges
 * 
 * List all active bridges in Asterisk.
 *********************************************************/
private void buildList() {
reset();
url = "/bridges";
method = "GET";
}

@Override
public java.util.concurrent.CompletionStage<List<Bridge>> list() {
buildList();
java.util.concurrent.CompletableFuture<List<Bridge>> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<Bridge_impl_ari_1_9_0>>() {});
return future;
}

/**********************************************************
 * Active bridges
 * 
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 *********************************************************/
private void buildCreate(@Nullable String type, @Nullable String bridgeId, @Nullable String name) {
reset();
url = "/bridges";
method = "POST";
lParamQuery.add( HttpParam.build( "type", type) );
lParamQuery.add( HttpParam.build( "bridgeId", bridgeId) );
lParamQuery.add( HttpParam.build( "name", name) );
}

@Override
public java.util.concurrent.CompletionStage<Bridge> create(@Nullable String type, @Nullable String bridgeId, @Nullable String name) {
buildCreate(type, bridgeId, name);
java.util.concurrent.CompletableFuture<Bridge> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Bridge_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Individual bridge
 * 
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 *********************************************************/
private void buildCreateWithId(@Nullable String type, @NotNull String bridgeId, @Nullable String name) {
reset();
url = "/bridges/" + bridgeId + "";
method = "POST";
lParamQuery.add( HttpParam.build( "type", type) );
lParamQuery.add( HttpParam.build( "name", name) );
}

@Override
public java.util.concurrent.CompletionStage<Bridge> createWithId(@Nullable String type, @NotNull String bridgeId, @Nullable String name) {
buildCreateWithId(type, bridgeId, name);
java.util.concurrent.CompletableFuture<Bridge> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Bridge_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Individual bridge
 * 
 * Get bridge details.
 *********************************************************/
private void buildGet(@NotNull String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public java.util.concurrent.CompletionStage<Bridge> get(@NotNull String bridgeId) {
buildGet(bridgeId);
java.util.concurrent.CompletableFuture<Bridge> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Bridge_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Individual bridge
 * 
 * Shut down a bridge.
 * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
 *********************************************************/
private void buildDestroy(@NotNull String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public java.util.concurrent.CompletionStage<Void> destroy(@NotNull String bridgeId) {
buildDestroy(bridgeId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Add a channel to a bridge
 * 
 * Add a channel to a bridge.
 *********************************************************/
private void buildAddChannel(@NotNull String bridgeId, @NotNull String channel, @Nullable String role) {
reset();
url = "/bridges/" + bridgeId + "/addChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lParamQuery.add( HttpParam.build( "role", role) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application; Channel currently recording") );
lE.add( HttpResponse.build( 422, "Channel not in Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> addChannel(@NotNull String bridgeId, @NotNull String channel, @Nullable String role) {
buildAddChannel(bridgeId, channel, role);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Play music on hold to a bridge or change the MOH class that is playing.
 *********************************************************/
private void buildStartMoh(@NotNull String bridgeId, @Nullable String mohClass) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "POST";
lParamQuery.add( HttpParam.build( "mohClass", mohClass) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> startMoh(@NotNull String bridgeId, @Nullable String mohClass) {
buildStartMoh(bridgeId, mohClass);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Stop playing music on hold to a bridge.
 * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
 *********************************************************/
private void buildStopMoh(@NotNull String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> stopMoh(@NotNull String bridgeId) {
buildStopMoh(bridgeId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play media to the participants of a bridge
 * 
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlay(@NotNull String bridgeId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId) {
reset();
url = "/bridges/" + bridgeId + "/play";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lParamQuery.add( HttpParam.build( "playbackId", playbackId) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String bridgeId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId) {
buildPlay(bridgeId, media, lang, offsetms, skipms, playbackId);
java.util.concurrent.CompletableFuture<Playback> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Playback_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Play media to a bridge
 * 
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlayWithId(@NotNull String bridgeId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) {
reset();
url = "/bridges/" + bridgeId + "/play/" + playbackId + "";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Playback> playWithId(@NotNull String bridgeId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) {
buildPlayWithId(bridgeId, playbackId, media, lang, offsetms, skipms);
java.util.concurrent.CompletableFuture<Playback> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Playback_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Record audio on a bridge
 * 
 * Start a recording.
 * This records the mixed audio from all channels participating in this bridge.
 *********************************************************/
private void buildRecord(@NotNull String bridgeId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn) {
reset();
url = "/bridges/" + bridgeId + "/record";
method = "POST";
lParamQuery.add( HttpParam.build( "name", name) );
lParamQuery.add( HttpParam.build( "format", format) );
lParamQuery.add( HttpParam.build( "maxDurationSeconds", maxDurationSeconds) );
lParamQuery.add( HttpParam.build( "maxSilenceSeconds", maxSilenceSeconds) );
lParamQuery.add( HttpParam.build( "ifExists", ifExists) );
lParamQuery.add( HttpParam.build( "beep", beep) );
lParamQuery.add( HttpParam.build( "terminateOn", terminateOn) );
lE.add( HttpResponse.build( 400, "Invalid parameters") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge is not in a Stasis application; A recording with the same name already exists on the system and can not be overwritten because it is in progress or ifExists=fail") );
lE.add( HttpResponse.build( 422, "The format specified is unknown on this system") );
}

@Override
public java.util.concurrent.CompletionStage<LiveRecording> record(@NotNull String bridgeId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn) {
buildRecord(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
java.util.concurrent.CompletableFuture<LiveRecording> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), LiveRecording_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Remove a channel from a bridge
 * 
 * Remove a channel from a bridge.
 *********************************************************/
private void buildRemoveChannel(@NotNull String bridgeId, @NotNull String channel) {
reset();
url = "/bridges/" + bridgeId + "/removeChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
lE.add( HttpResponse.build( 422, "Channel not in this bridge") );
}

@Override
public java.util.concurrent.CompletionStage<Void> removeChannel(@NotNull String bridgeId, @NotNull String channel) {
buildRemoveChannel(bridgeId, channel);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Bridge> create(@Nullable String type){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String bridgeId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_0_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Bridge> create(@Nullable String type, @Nullable String name){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Bridge> create_or_update_with_id(@Nullable String type, @NotNull String bridgeId, @Nullable String name){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
 * 
 * 
 * @since ari_2_0_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> setVideoSource(@NotNull String bridgeId, @NotNull String channelId){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.
 * 
 * 
 * @since ari_2_0_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> clearVideoSource(@NotNull String bridgeId){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

