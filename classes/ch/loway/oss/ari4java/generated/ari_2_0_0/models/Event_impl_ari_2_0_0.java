package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:04 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Base type for asynchronous events from Asterisk.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class Event_impl_ari_2_0_0 extends Message_impl_ari_2_0_0 implements Event, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Name of the application receiving the event.  */
  private @NotNull String application;
 public @NotNull String getApplication() {
   return application;
 }

 @JsonDeserialize( as=String.class )
 public void setApplication(@NotNull String val ) {
   application = val;
 }

  /**  Time at which this event was created.  */
  private @Nullable Date timestamp;
 public @Nullable Date getTimestamp() {
   return timestamp;
 }

 @JsonDeserialize( as=Date.class )
 public void setTimestamp(@Nullable Date val ) {
   timestamp = val;
 }

/** No missing signatures from interface */
}

