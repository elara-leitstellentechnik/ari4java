package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ActionBridges {

// void play String String String int int AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void play(String bridgeId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback);



// Playback play String String String int int
/**********************************************************
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since: ari_0_0_1
 *********************************************************/
public Playback play(String bridgeId, String media, String lang, int offsetms, int skipms) throws RestException;



// void create String String AriCallback<Bridge> callback
/**********************************************************
 * 
 * 
 * @since: ari_1_0_0
 *********************************************************/
public void create(String type, String name, AriCallback<Bridge> callback);



// void addChannel String String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void addChannel(String bridgeId, String channel, String role, AriCallback<Void> callback);



// void create String AriCallback<Bridge> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void create(String type, AriCallback<Bridge> callback);



// List<? extends Bridge> list
/**********************************************************
 * List all active bridges in Asterisk.
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public List<? extends Bridge> list() throws RestException;



// void get String AriCallback<Bridge> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void get(String bridgeId, AriCallback<Bridge> callback);



// void stopMoh String
/**********************************************************
 * Stop playing music on hold to a bridge.
 * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void stopMoh(String bridgeId) throws RestException;



// Bridge get String
/**********************************************************
 * Get bridge details.
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public Bridge get(String bridgeId) throws RestException;



// void removeChannel String String
/**********************************************************
 * Remove a channel from a bridge.
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void removeChannel(String bridgeId, String channel) throws RestException;



// void addChannel String String String
/**********************************************************
 * Add a channel to a bridge.
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void addChannel(String bridgeId, String channel, String role) throws RestException;



// void removeChannel String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void removeChannel(String bridgeId, String channel, AriCallback<Void> callback);



// void startMoh String String
/**********************************************************
 * Play music on hold to a bridge or change the MOH class that is playing.
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void startMoh(String bridgeId, String mohClass) throws RestException;



// void stopMoh String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void stopMoh(String bridgeId, AriCallback<Void> callback);



// void startMoh String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void startMoh(String bridgeId, String mohClass, AriCallback<Void> callback);



// void destroy String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void destroy(String bridgeId, AriCallback<Void> callback);



// Bridge create String String
/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since: ari_1_0_0
 *********************************************************/
public Bridge create(String type, String name) throws RestException;



// LiveRecording record String String String int int String boolean String
/**********************************************************
 * Start a recording.
 * This records the mixed audio from all channels participating in this bridge.
 * 
 * @since: ari_0_0_1
 *********************************************************/
public LiveRecording record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) throws RestException;



// void destroy String
/**********************************************************
 * Shut down a bridge.
 * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void destroy(String bridgeId) throws RestException;



// void list AriCallback<List<? extends Bridge>> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void list(AriCallback<List<? extends Bridge>> callback);



// Bridge create String
/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since: ari_0_0_1
 *********************************************************/
public Bridge create(String type) throws RestException;



// void record String String String int int String boolean String AriCallback<LiveRecording> callback
/**********************************************************
 * 
 * 
 * @since: ari_0_0_1
 *********************************************************/
public void record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn, AriCallback<LiveRecording> callback);


}
;