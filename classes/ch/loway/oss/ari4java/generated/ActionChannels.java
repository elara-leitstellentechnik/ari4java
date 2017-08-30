package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:03 CEST 2017
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


public interface ActionChannels {

// java.util.concurrent.CompletionStage<List<Channel>> list
/**********************************************************
 * List all active channels in Asterisk.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<List<Channel>> list();



// java.util.concurrent.CompletionStage<Channel> originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout);



// java.util.concurrent.CompletionStage<Channel> get @NotNull String
/**********************************************************
 * Channel details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> get(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> hangup @NotNull String @Nullable String
/**********************************************************
 * Delete (i.e. hangup) a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> hangup(@NotNull String channelId, @Nullable String reason);



// java.util.concurrent.CompletionStage<Void> continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int
/**********************************************************
 * Exit application; continue execution in the dialplan.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority);



// java.util.concurrent.CompletionStage<Void> answer @NotNull String
/**********************************************************
 * Answer a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> answer(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> ring @NotNull String
/**********************************************************
 * Indicate ringing to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> ring(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> ringStop @NotNull String
/**********************************************************
 * Stop ringing indication on a channel if locally generated.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> ringStop(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> sendDTMF @NotNull String @Nullable String @Nullable int @Nullable int @Nullable int @Nullable int
/**********************************************************
 * Send provided DTMF to a given channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> sendDTMF(@NotNull String channelId, @Nullable String dtmf, @Nullable int before, @Nullable int between, @Nullable int duration, @Nullable int after);



// java.util.concurrent.CompletionStage<Void> mute @NotNull String @Nullable String
/**********************************************************
 * Mute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> mute(@NotNull String channelId, @Nullable String direction);



// java.util.concurrent.CompletionStage<Void> unmute @NotNull String @Nullable String
/**********************************************************
 * Unmute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> unmute(@NotNull String channelId, @Nullable String direction);



// java.util.concurrent.CompletionStage<Void> hold @NotNull String
/**********************************************************
 * Hold a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> hold(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> unhold @NotNull String
/**********************************************************
 * Remove a channel from hold.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> unhold(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> startMoh @NotNull String @Nullable String
/**********************************************************
 * Play music on hold to a channel.
 * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> startMoh(@NotNull String channelId, @Nullable String mohClass);



// java.util.concurrent.CompletionStage<Void> stopMoh @NotNull String
/**********************************************************
 * Stop playing music on hold to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> stopMoh(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> startSilence @NotNull String
/**********************************************************
 * Play silence to a channel.
 * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> startSilence(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Void> stopSilence @NotNull String
/**********************************************************
 * Stop playing silence to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> stopSilence(@NotNull String channelId);



// java.util.concurrent.CompletionStage<Playback> play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms);



// java.util.concurrent.CompletionStage<LiveRecording> record @NotNull String @NotNull String @NotNull String @Nullable int @Nullable int @Nullable String @Nullable boolean @Nullable String
/**********************************************************
 * Start a recording.
 * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that's what you want.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<LiveRecording> record(@NotNull String channelId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn);



// java.util.concurrent.CompletionStage<Variable> getChannelVar @NotNull String @NotNull String
/**********************************************************
 * Get the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Variable> getChannelVar(@NotNull String channelId, @NotNull String variable);



// java.util.concurrent.CompletionStage<Void> setChannelVar @NotNull String @NotNull String @Nullable String
/**********************************************************
 * Set the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> setChannelVar(@NotNull String channelId, @NotNull String variable, @Nullable String value);



// java.util.concurrent.CompletionStage<Channel> snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs);



// java.util.concurrent.CompletionStage<Channel> originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId);



// java.util.concurrent.CompletionStage<Channel> originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId);



// java.util.concurrent.CompletionStage<Playback> play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int @Nullable String
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId);



// java.util.concurrent.CompletionStage<Playback> playWithId @NotNull String @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int
/**********************************************************
 * Start playback of media and specify the playbackId.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Playback> playWithId(@NotNull String channelId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms);



// java.util.concurrent.CompletionStage<Channel> snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @Nullable String snoopId);



// java.util.concurrent.CompletionStage<Channel> snoopChannelWithId @NotNull String @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> snoopChannelWithId(@NotNull String channelId, @NotNull String snoopId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs);



// java.util.concurrent.CompletionStage<Channel> originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator);



// java.util.concurrent.CompletionStage<Channel> originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator);



// java.util.concurrent.CompletionStage<Void> continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int @Nullable String
/**********************************************************
 * Exit application; continue execution in the dialplan.
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority, @Nullable String label);



// java.util.concurrent.CompletionStage<Void> redirect @NotNull String @NotNull String
/**********************************************************
 * Redirect the channel to a different location.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> redirect(@NotNull String channelId, @NotNull String endpoint);



// java.util.concurrent.CompletionStage<Channel> originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats);



// java.util.concurrent.CompletionStage<Channel> create @NotNull String @NotNull String @Nullable String @Nullable String @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> create(@NotNull String endpoint, @NotNull String app, @Nullable String appArgs, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats);



// java.util.concurrent.CompletionStage<Channel> originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Channel> originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats);



// java.util.concurrent.CompletionStage<Void> dial @NotNull String @Nullable String @Nullable int
/**********************************************************
 * Dial a created channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<Void> dial(@NotNull String channelId, @Nullable String caller, @Nullable int timeout);


}
;
