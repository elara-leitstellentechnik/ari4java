package ch.loway.oss.ari4java.generated.ari_1_0_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:04 CEST 2017
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
import ch.loway.oss.ari4java.generated.ari_1_0_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionChannels_impl_ari_1_0_0 extends BaseAriAction  implements ActionChannels {
/**********************************************************
 * Active channels
 * 
 * List all active channels in Asterisk.
 *********************************************************/
private void buildList() {
reset();
url = "/channels";
method = "GET";
}

@Override
public java.util.concurrent.CompletionStage<List<Channel>> list() {
buildList();
java.util.concurrent.CompletableFuture<List<Channel>> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<Channel_impl_ari_1_0_0>>() {});
return future;
}

/**********************************************************
 * Active channels
 * 
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 *********************************************************/
private void buildOriginate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout) {
reset();
url = "/channels";
method = "POST";
lParamQuery.add( HttpParam.build( "endpoint", endpoint) );
lParamQuery.add( HttpParam.build( "extension", extension) );
lParamQuery.add( HttpParam.build( "context", context) );
lParamQuery.add( HttpParam.build( "priority", priority) );
lParamQuery.add( HttpParam.build( "app", app) );
lParamQuery.add( HttpParam.build( "appArgs", appArgs) );
lParamQuery.add( HttpParam.build( "callerId", callerId) );
lParamQuery.add( HttpParam.build( "timeout", timeout) );
lE.add( HttpResponse.build( 400, "Invalid parameters for originating a channel.") );
}

@Override
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout) {
buildOriginate(endpoint, extension, context, priority, app, appArgs, callerId, timeout);
java.util.concurrent.CompletableFuture<Channel> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Channel_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Active channel
 * 
 * Channel details.
 *********************************************************/
private void buildGet(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Channel not found") );
}

@Override
public java.util.concurrent.CompletionStage<Channel> get(@NotNull String channelId) {
buildGet(channelId);
java.util.concurrent.CompletableFuture<Channel> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Channel_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Active channel
 * 
 * Delete (i.e. hangup) a channel.
 *********************************************************/
private void buildHangup(@NotNull String channelId, @Nullable String reason) {
reset();
url = "/channels/" + channelId + "";
method = "DELETE";
lParamQuery.add( HttpParam.build( "reason", reason) );
lE.add( HttpResponse.build( 400, "Invalid reason for hangup provided") );
lE.add( HttpResponse.build( 404, "Channel not found") );
}

@Override
public java.util.concurrent.CompletionStage<Void> hangup(@NotNull String channelId, @Nullable String reason) {
buildHangup(channelId, reason);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Answer a channel
 * 
 * Answer a channel.
 *********************************************************/
private void buildAnswer(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/answer";
method = "POST";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> answer(@NotNull String channelId) {
buildAnswer(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Exit application; continue execution in the dialplan
 * 
 * Exit application; continue execution in the dialplan.
 *********************************************************/
private void buildContinueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority) {
reset();
url = "/channels/" + channelId + "/continue";
method = "POST";
lParamQuery.add( HttpParam.build( "context", context) );
lParamQuery.add( HttpParam.build( "extension", extension) );
lParamQuery.add( HttpParam.build( "priority", priority) );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority) {
buildContinueInDialplan(channelId, context, extension, priority);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Send DTMF to a channel
 * 
 * Send provided DTMF to a given channel.
 *********************************************************/
private void buildSendDTMF(@NotNull String channelId, @Nullable String dtmf, @Nullable int before, @Nullable int between, @Nullable int duration, @Nullable int after) {
reset();
url = "/channels/" + channelId + "/dtmf";
method = "POST";
lParamQuery.add( HttpParam.build( "dtmf", dtmf) );
lParamQuery.add( HttpParam.build( "before", before) );
lParamQuery.add( HttpParam.build( "between", between) );
lParamQuery.add( HttpParam.build( "duration", duration) );
lParamQuery.add( HttpParam.build( "after", after) );
lE.add( HttpResponse.build( 400, "DTMF is required") );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> sendDTMF(@NotNull String channelId, @Nullable String dtmf, @Nullable int before, @Nullable int between, @Nullable int duration, @Nullable int after) {
buildSendDTMF(channelId, dtmf, before, between, duration, after);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Put a channel on hold
 * 
 * Hold a channel.
 *********************************************************/
private void buildHold(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/hold";
method = "POST";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> hold(@NotNull String channelId) {
buildHold(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Put a channel on hold
 * 
 * Remove a channel from hold.
 *********************************************************/
private void buildUnhold(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/hold";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> unhold(@NotNull String channelId) {
buildUnhold(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play music on hold to a channel
 * 
 * Play music on hold to a channel.
 * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
 *********************************************************/
private void buildStartMoh(@NotNull String channelId, @Nullable String mohClass) {
reset();
url = "/channels/" + channelId + "/moh";
method = "POST";
lParamQuery.add( HttpParam.build( "mohClass", mohClass) );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> startMoh(@NotNull String channelId, @Nullable String mohClass) {
buildStartMoh(channelId, mohClass);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play music on hold to a channel
 * 
 * Stop playing music on hold to a channel.
 *********************************************************/
private void buildStopMoh(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/moh";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> stopMoh(@NotNull String channelId) {
buildStopMoh(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Mute a channel
 * 
 * Mute a channel.
 *********************************************************/
private void buildMute(@NotNull String channelId, @Nullable String direction) {
reset();
url = "/channels/" + channelId + "/mute";
method = "POST";
lParamQuery.add( HttpParam.build( "direction", direction) );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> mute(@NotNull String channelId, @Nullable String direction) {
buildMute(channelId, direction);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Mute a channel
 * 
 * Unmute a channel.
 *********************************************************/
private void buildUnmute(@NotNull String channelId, @Nullable String direction) {
reset();
url = "/channels/" + channelId + "/mute";
method = "DELETE";
lParamQuery.add( HttpParam.build( "direction", direction) );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> unmute(@NotNull String channelId, @Nullable String direction) {
buildUnmute(channelId, direction);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play media to a channel
 * 
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlay(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) {
reset();
url = "/channels/" + channelId + "/play";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) {
buildPlay(channelId, media, lang, offsetms, skipms);
java.util.concurrent.CompletableFuture<Playback> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Playback_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Record audio from a channel
 * 
 * Start a recording.
 * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that's what you want.
 *********************************************************/
private void buildRecord(@NotNull String channelId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn) {
reset();
url = "/channels/" + channelId + "/record";
method = "POST";
lParamQuery.add( HttpParam.build( "name", name) );
lParamQuery.add( HttpParam.build( "format", format) );
lParamQuery.add( HttpParam.build( "maxDurationSeconds", maxDurationSeconds) );
lParamQuery.add( HttpParam.build( "maxSilenceSeconds", maxSilenceSeconds) );
lParamQuery.add( HttpParam.build( "ifExists", ifExists) );
lParamQuery.add( HttpParam.build( "beep", beep) );
lParamQuery.add( HttpParam.build( "terminateOn", terminateOn) );
lE.add( HttpResponse.build( 400, "Invalid parameters") );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel is not in a Stasis application; the channel is currently bridged with other hcannels; A recording with the same name already exists on the system and can not be overwritten because it is in progress or ifExists=fail") );
lE.add( HttpResponse.build( 422, "The format specified is unknown on this system") );
}

@Override
public java.util.concurrent.CompletionStage<LiveRecording> record(@NotNull String channelId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn) {
buildRecord(channelId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
java.util.concurrent.CompletableFuture<LiveRecording> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), LiveRecording_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Send a ringing indication to a channel
 * 
 * Indicate ringing to a channel.
 *********************************************************/
private void buildRing(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/ring";
method = "POST";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> ring(@NotNull String channelId) {
buildRing(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Send a ringing indication to a channel
 * 
 * Stop ringing indication on a channel if locally generated.
 *********************************************************/
private void buildRingStop(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/ring";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> ringStop(@NotNull String channelId) {
buildRingStop(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play silence to a channel
 * 
 * Play silence to a channel.
 * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
 *********************************************************/
private void buildStartSilence(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/silence";
method = "POST";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> startSilence(@NotNull String channelId) {
buildStartSilence(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Play silence to a channel
 * 
 * Stop playing silence to a channel.
 *********************************************************/
private void buildStopSilence(@NotNull String channelId) {
reset();
url = "/channels/" + channelId + "/silence";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> stopSilence(@NotNull String channelId) {
buildStopSilence(channelId);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Snoop (spy/whisper) on a channel
 * 
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 *********************************************************/
private void buildSnoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs) {
reset();
url = "/channels/" + channelId + "/snoop";
method = "POST";
lParamQuery.add( HttpParam.build( "spy", spy) );
lParamQuery.add( HttpParam.build( "whisper", whisper) );
lParamQuery.add( HttpParam.build( "app", app) );
lParamQuery.add( HttpParam.build( "appArgs", appArgs) );
lE.add( HttpResponse.build( 400, "Invalid parameters") );
lE.add( HttpResponse.build( 404, "Channel not found") );
}

@Override
public java.util.concurrent.CompletionStage<Channel> snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs) {
buildSnoopChannel(channelId, spy, whisper, app, appArgs);
java.util.concurrent.CompletableFuture<Channel> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Channel_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Variables on a channel
 * 
 * Get the value of a channel variable or function.
 *********************************************************/
private void buildGetChannelVar(@NotNull String channelId, @NotNull String variable) {
reset();
url = "/channels/" + channelId + "/variable";
method = "GET";
lParamQuery.add( HttpParam.build( "variable", variable) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Variable> getChannelVar(@NotNull String channelId, @NotNull String variable) {
buildGetChannelVar(channelId, variable);
java.util.concurrent.CompletableFuture<Variable> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Variable_impl_ari_1_0_0.class);
return future;
}

/**********************************************************
 * Variables on a channel
 * 
 * Set the value of a channel variable or function.
 *********************************************************/
private void buildSetChannelVar(@NotNull String channelId, @NotNull String variable, @Nullable String value) {
reset();
url = "/channels/" + channelId + "/variable";
method = "POST";
lParamQuery.add( HttpParam.build( "variable", variable) );
lParamQuery.add( HttpParam.build( "value", value) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
lE.add( HttpResponse.build( 404, "Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in a Stasis application") );
}

@Override
public java.util.concurrent.CompletionStage<Void> setChannelVar(@NotNull String channelId, @NotNull String variable, @Nullable String value) {
buildSetChannelVar(channelId, variable, value);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media and specify the playbackId.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> playWithId(@NotNull String channelId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @Nullable String snoopId){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> snoopChannelWithId(@NotNull String channelId, @NotNull String snoopId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Exit application{
  throw new UnsupportedOperationException("Method availble from ...");
}; continue execution in the dialplan.
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority, @Nullable String label){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Redirect the channel to a different location.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> redirect(@NotNull String channelId, @NotNull String endpoint){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> create(@NotNull String endpoint, @NotNull String app, @Nullable String appArgs, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Dial a created channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> dial(@NotNull String channelId, @Nullable String caller, @Nullable int timeout){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

