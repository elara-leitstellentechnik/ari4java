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


public interface BridgeAttendedTransfer {

// @NotNull Channel getTransferer_first_leg
/**********************************************************
 * First leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull Channel getTransferer_first_leg();



// @NotNull Channel getTransferer_second_leg
/**********************************************************
 * Second leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull Channel getTransferer_second_leg();



// @Nullable Channel getReplace_channel
/**********************************************************
 * The channel that is replacing transferer_first_leg in the swap
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getReplace_channel();



// @Nullable Channel getTransferee
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getTransferee();



// @Nullable Channel getTransfer_target
/**********************************************************
 * The channel that is being transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getTransfer_target();



// @NotNull String getResult
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getResult();



// @NotNull boolean getIs_external
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull boolean getIs_external();



// @Nullable Bridge getTransferer_first_leg_bridge
/**********************************************************
 * Bridge the transferer first leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Bridge getTransferer_first_leg_bridge();



// @Nullable Bridge getTransferer_second_leg_bridge
/**********************************************************
 * Bridge the transferer second leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Bridge getTransferer_second_leg_bridge();



// @NotNull String getDestination_type
/**********************************************************
 * How the transfer was accomplished
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @NotNull String getDestination_type();



// @Nullable String getDestination_bridge
/**********************************************************
 * Bridge that survived the merge result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable String getDestination_bridge();



// @Nullable String getDestination_application
/**********************************************************
 * Application that has been transferred into
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable String getDestination_application();



// @Nullable Channel getDestination_link_first_leg
/**********************************************************
 * First leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getDestination_link_first_leg();



// @Nullable Channel getDestination_link_second_leg
/**********************************************************
 * Second leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getDestination_link_second_leg();



// @Nullable Channel getDestination_threeway_channel
/**********************************************************
 * Transferer channel that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Channel getDestination_threeway_channel();



// @Nullable Bridge getDestination_threeway_bridge
/**********************************************************
 * Bridge that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public @Nullable Bridge getDestination_threeway_bridge();



// void setTransferer_first_leg @NotNull Channel
/**********************************************************
 * First leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_first_leg(@NotNull Channel val );



// void setTransferer_second_leg @NotNull Channel
/**********************************************************
 * Second leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_second_leg(@NotNull Channel val );



// void setReplace_channel @Nullable Channel
/**********************************************************
 * The channel that is replacing transferer_first_leg in the swap
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setReplace_channel(@Nullable Channel val );



// void setTransferee @Nullable Channel
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferee(@Nullable Channel val );



// void setTransfer_target @Nullable Channel
/**********************************************************
 * The channel that is being transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransfer_target(@Nullable Channel val );



// void setResult @NotNull String
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setResult(@NotNull String val );



// void setIs_external @NotNull boolean
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setIs_external(@NotNull boolean val );



// void setTransferer_first_leg_bridge @Nullable Bridge
/**********************************************************
 * Bridge the transferer first leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_first_leg_bridge(@Nullable Bridge val );



// void setTransferer_second_leg_bridge @Nullable Bridge
/**********************************************************
 * Bridge the transferer second leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_second_leg_bridge(@Nullable Bridge val );



// void setDestination_type @NotNull String
/**********************************************************
 * How the transfer was accomplished
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_type(@NotNull String val );



// void setDestination_bridge @Nullable String
/**********************************************************
 * Bridge that survived the merge result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_bridge(@Nullable String val );



// void setDestination_application @Nullable String
/**********************************************************
 * Application that has been transferred into
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_application(@Nullable String val );



// void setDestination_link_first_leg @Nullable Channel
/**********************************************************
 * First leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_link_first_leg(@Nullable Channel val );



// void setDestination_link_second_leg @Nullable Channel
/**********************************************************
 * Second leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_link_second_leg(@Nullable Channel val );



// void setDestination_threeway_channel @Nullable Channel
/**********************************************************
 * Transferer channel that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_threeway_channel(@Nullable Channel val );



// void setDestination_threeway_bridge @Nullable Bridge
/**********************************************************
 * Bridge that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_threeway_bridge(@Nullable Bridge val );


}
;
