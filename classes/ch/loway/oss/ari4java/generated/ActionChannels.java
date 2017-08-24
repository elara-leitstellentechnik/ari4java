package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:45:33 CEST 2017
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

// void setChannelVar @NotNull String @NotNull String @Nullable String
/**********************************************************
 * Set the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setChannelVar(@NotNull String channelId, @NotNull String variable, @Nullable String value) throws RestException;



// void originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public void originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator, @NotNull AriCallback<Channel> callback);



// LiveRecording record @NotNull String @NotNull String @NotNull String @Nullable int @Nullable int @Nullable String @Nullable boolean @Nullable String
/**********************************************************
 * Start a recording.
 * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that's what you want.
 * 
 * @since ari_0_0_1
 *********************************************************/
public LiveRecording record(@NotNull String channelId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn) throws RestException;



// void create @NotNull String @NotNull String @Nullable String @Nullable String @Nullable String @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public void create(@NotNull String endpoint, @NotNull String app, @Nullable String appArgs, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats, @NotNull AriCallback<Channel> callback);



// Channel get @NotNull String
/**********************************************************
 * Channel details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel get(@NotNull String channelId) throws RestException;



// void stopSilence @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopSilence(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// void continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int
/**********************************************************
 * Exit application; continue execution in the dialplan.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority) throws RestException;



// void unhold @NotNull String
/**********************************************************
 * Remove a channel from hold.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unhold(@NotNull String channelId) throws RestException;



// void continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public void continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority, @Nullable String label, @NotNull AriCallback<Void> callback);



// void hold @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hold(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// void snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @Nullable String snoopId, @NotNull AriCallback<Channel> callback);



// Channel originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public Channel originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats) throws RestException;



// void answer @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void answer(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// Channel originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_10_0
 *********************************************************/
public Channel originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats) throws RestException;



// void originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @NotNull AriCallback<Channel> callback);



// void startMoh @NotNull String @Nullable String
/**********************************************************
 * Play music on hold to a channel.
 * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startMoh(@NotNull String channelId, @Nullable String mohClass) throws RestException;



// void redirect @NotNull String @NotNull String
/**********************************************************
 * Redirect the channel to a different location.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void redirect(@NotNull String channelId, @NotNull String endpoint) throws RestException;



// void stopMoh @NotNull String
/**********************************************************
 * Stop playing music on hold to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopMoh(@NotNull String channelId) throws RestException;



// void originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public void originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats, @NotNull AriCallback<Channel> callback);



// Playback play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
public Playback play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) throws RestException;



// void hangup @NotNull String @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hangup(@NotNull String channelId, @Nullable String reason, @NotNull AriCallback<Void> callback);



// void ring @NotNull String
/**********************************************************
 * Indicate ringing to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ring(@NotNull String channelId) throws RestException;



// void snoopChannelWithId @NotNull String @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void snoopChannelWithId(@NotNull String channelId, @NotNull String snoopId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @NotNull AriCallback<Channel> callback);



// void sendDTMF @NotNull String @Nullable String @Nullable int @Nullable int @Nullable int @Nullable int @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void sendDTMF(@NotNull String channelId, @Nullable String dtmf, @Nullable int before, @Nullable int between, @Nullable int duration, @Nullable int after, @NotNull AriCallback<Void> callback);



// void list @NotNull AriCallback<List<Channel>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(@NotNull AriCallback<List<Channel>> callback);



// void ringStop @NotNull String
/**********************************************************
 * Stop ringing indication on a channel if locally generated.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ringStop(@NotNull String channelId) throws RestException;



// void originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public void originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @NotNull AriCallback<Channel> callback);



// void get @NotNull String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(@NotNull String channelId, @NotNull AriCallback<Channel> callback);



// Playback playWithId @NotNull String @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int
/**********************************************************
 * Start playback of media and specify the playbackId.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback playWithId(@NotNull String channelId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms) throws RestException;



// void hangup @NotNull String @Nullable String
/**********************************************************
 * Delete (i.e. hangup) a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hangup(@NotNull String channelId, @Nullable String reason) throws RestException;



// Channel originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout) throws RestException;



// void play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int @NotNull AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @NotNull AriCallback<Playback> callback);



// void play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int @Nullable String @NotNull AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId, @NotNull AriCallback<Playback> callback);



// Channel snoopChannelWithId @NotNull String @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel snoopChannelWithId(@NotNull String channelId, @NotNull String snoopId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs) throws RestException;



// Variable getChannelVar @NotNull String @NotNull String
/**********************************************************
 * Get the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Variable getChannelVar(@NotNull String channelId, @NotNull String variable) throws RestException;



// void startSilence @NotNull String
/**********************************************************
 * Play silence to a channel.
 * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startSilence(@NotNull String channelId) throws RestException;



// void stopMoh @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopMoh(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// void startMoh @NotNull String @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startMoh(@NotNull String channelId, @Nullable String mohClass, @NotNull AriCallback<Void> callback);



// void unmute @NotNull String @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(@NotNull String channelId, @Nullable String direction, @NotNull AriCallback<Void> callback);



// void ring @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ring(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// Channel snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs) throws RestException;



// List<Channel> list
/**********************************************************
 * List all active channels in Asterisk.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Channel> list() throws RestException;



// void ringStop @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ringStop(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// void getChannelVar @NotNull String @NotNull String @NotNull AriCallback<Variable> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getChannelVar(@NotNull String channelId, @NotNull String variable, @NotNull AriCallback<Variable> callback);



// void dial @NotNull String @Nullable String @Nullable int @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public void dial(@NotNull String channelId, @Nullable String caller, @Nullable int timeout, @NotNull AriCallback<Void> callback);



// Channel create @NotNull String @NotNull String @Nullable String @Nullable String @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public Channel create(@NotNull String endpoint, @NotNull String app, @Nullable String appArgs, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats) throws RestException;



// void originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @NotNull AriCallback<Channel> callback);



// void originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public void originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator, @Nullable String formats, @NotNull AriCallback<Channel> callback);



// void redirect @NotNull String @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void redirect(@NotNull String channelId, @NotNull String endpoint, @NotNull AriCallback<Void> callback);



// void continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int @Nullable String
/**********************************************************
 * Exit application; continue execution in the dialplan.
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public void continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority, @Nullable String label) throws RestException;



// void startSilence @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startSilence(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// void snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @NotNull AriCallback<Channel> callback);



// void hold @NotNull String
/**********************************************************
 * Hold a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hold(@NotNull String channelId) throws RestException;



// Channel originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId) throws RestException;



// void setChannelVar @NotNull String @NotNull String @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setChannelVar(@NotNull String channelId, @NotNull String variable, @Nullable String value, @NotNull AriCallback<Void> callback);



// void answer @NotNull String
/**********************************************************
 * Answer a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void answer(@NotNull String channelId) throws RestException;



// void mute @NotNull String @Nullable String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(@NotNull String channelId, @Nullable String direction, @NotNull AriCallback<Void> callback);



// void stopSilence @NotNull String
/**********************************************************
 * Stop playing silence to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopSilence(@NotNull String channelId) throws RestException;



// void mute @NotNull String @Nullable String
/**********************************************************
 * Mute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(@NotNull String channelId, @Nullable String direction) throws RestException;



// void unmute @NotNull String @Nullable String
/**********************************************************
 * Unmute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(@NotNull String channelId, @Nullable String direction) throws RestException;



// void continueInDialplan @NotNull String @Nullable String @Nullable String @Nullable int @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void continueInDialplan(@NotNull String channelId, @Nullable String context, @Nullable String extension, @Nullable int priority, @NotNull AriCallback<Void> callback);



// Channel snoopChannel @NotNull String @Nullable String @Nullable String @NotNull String @Nullable String @Nullable String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel snoopChannel(@NotNull String channelId, @Nullable String spy, @Nullable String whisper, @NotNull String app, @Nullable String appArgs, @Nullable String snoopId) throws RestException;



// void unhold @NotNull String @NotNull AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unhold(@NotNull String channelId, @NotNull AriCallback<Void> callback);



// Channel originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public Channel originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId, @Nullable String originator) throws RestException;



// void record @NotNull String @NotNull String @NotNull String @Nullable int @Nullable int @Nullable String @Nullable boolean @Nullable String @NotNull AriCallback<LiveRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void record(@NotNull String channelId, @NotNull String name, @NotNull String format, @Nullable int maxDurationSeconds, @Nullable int maxSilenceSeconds, @Nullable String ifExists, @Nullable boolean beep, @Nullable String terminateOn, @NotNull AriCallback<LiveRecording> callback);



// Channel originate @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel originate(@NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String channelId, @Nullable String otherChannelId) throws RestException;



// Playback play @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int @Nullable String
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback play(@NotNull String channelId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @Nullable String playbackId) throws RestException;



// Channel originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @Nullable String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_7_0
 *********************************************************/
public Channel originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String label, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @Nullable String originator) throws RestException;



// void playWithId @NotNull String @NotNull String @NotNull String @Nullable String @Nullable int @Nullable int @NotNull AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void playWithId(@NotNull String channelId, @NotNull String playbackId, @NotNull String media, @Nullable String lang, @Nullable int offsetms, @Nullable int skipms, @NotNull AriCallback<Playback> callback);



// void sendDTMF @NotNull String @Nullable String @Nullable int @Nullable int @Nullable int @Nullable int
/**********************************************************
 * Send provided DTMF to a given channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void sendDTMF(@NotNull String channelId, @Nullable String dtmf, @Nullable int before, @Nullable int between, @Nullable int duration, @Nullable int after) throws RestException;



// void dial @NotNull String @Nullable String @Nullable int
/**********************************************************
 * Dial a created channel.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public void dial(@NotNull String channelId, @Nullable String caller, @Nullable int timeout) throws RestException;



// void originateWithId @NotNull String @NotNull String @Nullable String @Nullable String @Nullable long @Nullable String @Nullable String @Nullable String @Nullable int @Nullable Map<String,String> @Nullable String @NotNull AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void originateWithId(@NotNull String channelId, @NotNull String endpoint, @Nullable String extension, @Nullable String context, @Nullable long priority, @Nullable String app, @Nullable String appArgs, @Nullable String callerId, @Nullable int timeout, @Nullable Map<String,String> variables, @Nullable String otherChannelId, @NotNull AriCallback<Channel> callback);


}
;
