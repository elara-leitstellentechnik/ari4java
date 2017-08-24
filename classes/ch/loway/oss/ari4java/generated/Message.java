package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:05:00 CEST 2017
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


public interface Message {

// void setAsterisk_id String
/**********************************************************
 * The unique ID for the Asterisk instance that raised this event.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public void setAsterisk_id(String val );



// String getType
/**********************************************************
 * Indicates the type of this message.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getType();



// String getAsterisk_id
/**********************************************************
 * The unique ID for the Asterisk instance that raised this event.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public String getAsterisk_id();



// void setType String
/**********************************************************
 * Indicates the type of this message.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setType(String val );


}
;
