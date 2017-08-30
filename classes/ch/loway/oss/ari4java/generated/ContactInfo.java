package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:17 CEST 2017
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


public interface ContactInfo {

// @NotNull String getUri
/**********************************************************
 * The location of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getUri();



// @NotNull String getContact_status
/**********************************************************
 * The current status of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getContact_status();



// @NotNull String getAor
/**********************************************************
 * The Address of Record this contact belongs to.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @NotNull String getAor();



// @Nullable String getRoundtrip_usec
/**********************************************************
 * Current round trip time, in microseconds, for the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public @Nullable String getRoundtrip_usec();



// void setUri @NotNull String
/**********************************************************
 * The location of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setUri(@NotNull String val );



// void setContact_status @NotNull String
/**********************************************************
 * The current status of the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setContact_status(@NotNull String val );



// void setAor @NotNull String
/**********************************************************
 * The Address of Record this contact belongs to.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setAor(@NotNull String val );



// void setRoundtrip_usec @Nullable String
/**********************************************************
 * Current round trip time, in microseconds, for the contact.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setRoundtrip_usec(@Nullable String val );


}
;
