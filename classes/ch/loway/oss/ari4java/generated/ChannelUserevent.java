package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Aug 24 16:02:41 CEST 2017
// ----------------------------------------------------

import java.util.Map;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ChannelUserevent {

// String getEventname
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getEventname();



// void setEventname String
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setEventname(String val );



// void setUserevent Map<String,String>
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUserevent(Map<String,String> val );



// Endpoint getEndpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Endpoint getEndpoint();



// Channel getChannel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );



// void setBridge Bridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBridge(Bridge val );



// Map<String,String> getUserevent
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Map<String,String> getUserevent();



// Bridge getBridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getBridge();



// void setEndpoint Endpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setEndpoint(Endpoint val );


}
;
