package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

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
 * Notification that another WebSocket has taken over for an application.
 * 
 * An application may only be subscribed to by a single WebSocket at a time. If multiple WebSockets attempt to subscribe to the same application, the newer WebSocket wins, and the older one receives this event.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ApplicationReplaced_impl_ari_1_9_0 extends Event_impl_ari_1_9_0 implements ApplicationReplaced, java.io.Serializable {
private static final long serialVersionUID = 1L;
/** No missing signatures from interface */
}

