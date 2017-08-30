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


public interface Application {

// @NotNull String getName
/**********************************************************
 * Name of this application
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getName();



// @NotNull List<String> getChannel_ids
/**********************************************************
 * Id's for channels subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull List<String> getChannel_ids();



// @NotNull List<String> getBridge_ids
/**********************************************************
 * Id's for bridges subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull List<String> getBridge_ids();



// @NotNull List<String> getEndpoint_ids
/**********************************************************
 * {tech}/{resource} for endpoints subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull List<String> getEndpoint_ids();



// @NotNull List<String> getDevice_names
/**********************************************************
 * Names of the devices subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull List<String> getDevice_names();



// void setName @NotNull String
/**********************************************************
 * Name of this application
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(@NotNull String val );



// void setChannel_ids @NotNull List<String>
/**********************************************************
 * Id's for channels subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel_ids(@NotNull List<String> val );



// void setBridge_ids @NotNull List<String>
/**********************************************************
 * Id's for bridges subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setBridge_ids(@NotNull List<String> val );



// void setEndpoint_ids @NotNull List<String>
/**********************************************************
 * {tech}/{resource} for endpoints subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setEndpoint_ids(@NotNull List<String> val );



// void setDevice_names @NotNull List<String>
/**********************************************************
 * Names of the devices subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDevice_names(@NotNull List<String> val );


}
;
