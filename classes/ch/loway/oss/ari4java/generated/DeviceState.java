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


public interface DeviceState extends EventSource  {

// void setState @NotNull String
/**********************************************************
 * Device's state
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setState(@NotNull String val );



// @NotNull String getName
/**********************************************************
 * Name of the device.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getName();



// void setName @NotNull String
/**********************************************************
 * Name of the device.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(@NotNull String val );



// @NotNull String getState
/**********************************************************
 * Device's state
 * 
 * @since ari_0_0_1
 *********************************************************/
 public @NotNull String getState();


}
;
