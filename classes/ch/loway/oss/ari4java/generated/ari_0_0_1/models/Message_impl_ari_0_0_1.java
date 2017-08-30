package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:03 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Base type for errors and events
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/
 @JsonTypeInfo(       use = JsonTypeInfo.Id.NAME,       include = JsonTypeInfo.As.PROPERTY,       property = "type") 
  @JsonSubTypes({  @Type(value = MissingParams_impl_ari_0_0_1.class, name = "MissingParams")
, @Type(value = Event_impl_ari_0_0_1.class, name = "Event")
, @Type(value = DeviceStateChanged_impl_ari_0_0_1.class, name = "DeviceStateChanged")
, @Type(value = PlaybackStarted_impl_ari_0_0_1.class, name = "PlaybackStarted")
, @Type(value = PlaybackFinished_impl_ari_0_0_1.class, name = "PlaybackFinished")
, @Type(value = RecordingStarted_impl_ari_0_0_1.class, name = "RecordingStarted")
, @Type(value = RecordingFinished_impl_ari_0_0_1.class, name = "RecordingFinished")
, @Type(value = RecordingFailed_impl_ari_0_0_1.class, name = "RecordingFailed")
, @Type(value = ApplicationReplaced_impl_ari_0_0_1.class, name = "ApplicationReplaced")
, @Type(value = BridgeCreated_impl_ari_0_0_1.class, name = "BridgeCreated")
, @Type(value = BridgeDestroyed_impl_ari_0_0_1.class, name = "BridgeDestroyed")
, @Type(value = BridgeMerged_impl_ari_0_0_1.class, name = "BridgeMerged")
, @Type(value = ChannelCreated_impl_ari_0_0_1.class, name = "ChannelCreated")
, @Type(value = ChannelDestroyed_impl_ari_0_0_1.class, name = "ChannelDestroyed")
, @Type(value = ChannelEnteredBridge_impl_ari_0_0_1.class, name = "ChannelEnteredBridge")
, @Type(value = ChannelLeftBridge_impl_ari_0_0_1.class, name = "ChannelLeftBridge")
, @Type(value = ChannelStateChange_impl_ari_0_0_1.class, name = "ChannelStateChange")
, @Type(value = ChannelDtmfReceived_impl_ari_0_0_1.class, name = "ChannelDtmfReceived")
, @Type(value = ChannelDialplan_impl_ari_0_0_1.class, name = "ChannelDialplan")
, @Type(value = ChannelCallerId_impl_ari_0_0_1.class, name = "ChannelCallerId")
, @Type(value = ChannelUserevent_impl_ari_0_0_1.class, name = "ChannelUserevent")
, @Type(value = ChannelHangupRequest_impl_ari_0_0_1.class, name = "ChannelHangupRequest")
, @Type(value = ChannelVarset_impl_ari_0_0_1.class, name = "ChannelVarset")
, @Type(value = EndpointStateChange_impl_ari_0_0_1.class, name = "EndpointStateChange")
, @Type(value = StasisEnd_impl_ari_0_0_1.class, name = "StasisEnd")
, @Type(value = StasisStart_impl_ari_0_0_1.class, name = "StasisStart")
 })  


public class Message_impl_ari_0_0_1 implements Message, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Indicates the type of this message.  */
  private @Nullable String type;
 public @Nullable String getType() {
   return type;
 }

 @JsonDeserialize( as=String.class )
 public void setType(@Nullable String val ) {
   type = val;
 }

/**********************************************************
 * The unique ID for the Asterisk instance that raised this event.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public @Nullable String getAsterisk_id(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * The unique ID for the Asterisk instance that raised this event.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public void setAsterisk_id(@Nullable String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

