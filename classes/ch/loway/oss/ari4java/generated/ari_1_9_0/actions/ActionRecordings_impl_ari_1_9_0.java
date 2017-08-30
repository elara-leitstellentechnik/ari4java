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


public class ActionRecordings_impl_ari_1_9_0 extends BaseAriAction  implements ActionRecordings {
/**********************************************************
 * A recording that is in progress
 * 
 * List live recordings.
 *********************************************************/
private void buildGetLive(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Recording not found") );
}

@Override
public java.util.concurrent.CompletionStage<LiveRecording> getLive(@NotNull String recordingName) {
buildGetLive(recordingName);
java.util.concurrent.CompletableFuture<LiveRecording> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), LiveRecording_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * A recording that is in progress
 * 
 * Stop a live recording and discard it.
 *********************************************************/
private void buildCancel(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Recording not found") );
}

@Override
public java.util.concurrent.CompletionStage<Void> cancel(@NotNull String recordingName) {
buildCancel(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * 
 * 
 * Mute a live recording.
 * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
 *********************************************************/
private void buildMute(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "/mute";
method = "POST";
lE.add( HttpResponse.build( 404, "Recording not found") );
lE.add( HttpResponse.build( 409, "Recording not in session") );
}

@Override
public java.util.concurrent.CompletionStage<Void> mute(@NotNull String recordingName) {
buildMute(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * 
 * 
 * Unmute a live recording.
 *********************************************************/
private void buildUnmute(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "/mute";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Recording not found") );
lE.add( HttpResponse.build( 409, "Recording not in session") );
}

@Override
public java.util.concurrent.CompletionStage<Void> unmute(@NotNull String recordingName) {
buildUnmute(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * 
 * 
 * Pause a live recording.
 * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
 *********************************************************/
private void buildPause(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "/pause";
method = "POST";
lE.add( HttpResponse.build( 404, "Recording not found") );
lE.add( HttpResponse.build( 409, "Recording not in session") );
}

@Override
public java.util.concurrent.CompletionStage<Void> pause(@NotNull String recordingName) {
buildPause(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * 
 * 
 * Unpause a live recording.
 *********************************************************/
private void buildUnpause(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "/pause";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Recording not found") );
lE.add( HttpResponse.build( 409, "Recording not in session") );
}

@Override
public java.util.concurrent.CompletionStage<Void> unpause(@NotNull String recordingName) {
buildUnpause(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * 
 * 
 * Stop a live recording and store it.
 *********************************************************/
private void buildStop(@NotNull String recordingName) {
reset();
url = "/recordings/live/" + recordingName + "/stop";
method = "POST";
lE.add( HttpResponse.build( 404, "Recording not found") );
}

@Override
public java.util.concurrent.CompletionStage<Void> stop(@NotNull String recordingName) {
buildStop(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Recordings
 * 
 * List recordings that are complete.
 *********************************************************/
private void buildListStored() {
reset();
url = "/recordings/stored";
method = "GET";
}

@Override
public java.util.concurrent.CompletionStage<List<StoredRecording>> listStored() {
buildListStored();
java.util.concurrent.CompletableFuture<List<StoredRecording>> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<StoredRecording_impl_ari_1_9_0>>() {});
return future;
}

/**********************************************************
 * Individual recording
 * 
 * Get a stored recording's details.
 *********************************************************/
private void buildGetStored(@NotNull String recordingName) {
reset();
url = "/recordings/stored/" + recordingName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Recording not found") );
}

@Override
public java.util.concurrent.CompletionStage<StoredRecording> getStored(@NotNull String recordingName) {
buildGetStored(recordingName);
java.util.concurrent.CompletableFuture<StoredRecording> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), StoredRecording_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Individual recording
 * 
 * Delete a stored recording.
 *********************************************************/
private void buildDeleteStored(@NotNull String recordingName) {
reset();
url = "/recordings/stored/" + recordingName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Recording not found") );
}

@Override
public java.util.concurrent.CompletionStage<Void> deleteStored(@NotNull String recordingName) {
buildDeleteStored(recordingName);
java.util.concurrent.CompletableFuture<Void> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future));
return future;
}

/**********************************************************
 * Copy an individual recording
 * 
 * Copy a stored recording.
 *********************************************************/
private void buildCopyStored(@NotNull String recordingName, @NotNull String destinationRecordingName) {
reset();
url = "/recordings/stored/" + recordingName + "/copy";
method = "POST";
lParamQuery.add( HttpParam.build( "destinationRecordingName", destinationRecordingName) );
lE.add( HttpResponse.build( 404, "Recording not found") );
lE.add( HttpResponse.build( 409, "A recording with the same name already exists on the system") );
}

@Override
public java.util.concurrent.CompletionStage<StoredRecording> copyStored(@NotNull String recordingName, @NotNull String destinationRecordingName) {
buildCopyStored(recordingName, destinationRecordingName);
java.util.concurrent.CompletableFuture<StoredRecording> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), StoredRecording_impl_ari_1_9_0.class);
return future;
}

/**********************************************************
 * Get the file associated with the stored recording.
 * 
 * 
 * @since ari_1_10_0
 *********************************************************/
public java.util.concurrent.CompletionStage<byte[]> getStoredFile(@NotNull String recordingName){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

