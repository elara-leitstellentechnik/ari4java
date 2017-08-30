package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:03 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * A specific communication connection between Asterisk and an Endpoint.
 * 
 * Defined in file: channels.json
 * Generated by: Model
 *********************************************************/

public class Channel_impl_ari_1_5_0 implements Channel, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private @NotNull String accountcode;
 public @NotNull String getAccountcode() {
   return accountcode;
 }

 @JsonDeserialize( as=String.class )
 public void setAccountcode(@NotNull String val ) {
   accountcode = val;
 }

  /**    */
  private @NotNull CallerID caller;
 public @NotNull CallerID getCaller() {
   return caller;
 }

 @JsonDeserialize( as=CallerID_impl_ari_1_5_0.class )
 public void setCaller(@NotNull CallerID val ) {
   caller = val;
 }

  /**    */
  private @NotNull CallerID connected;
 public @NotNull CallerID getConnected() {
   return connected;
 }

 @JsonDeserialize( as=CallerID_impl_ari_1_5_0.class )
 public void setConnected(@NotNull CallerID val ) {
   connected = val;
 }

  /**  Timestamp when channel was created  */
  private @NotNull Date creationtime;
 public @NotNull Date getCreationtime() {
   return creationtime;
 }

 @JsonDeserialize( as=Date.class )
 public void setCreationtime(@NotNull Date val ) {
   creationtime = val;
 }

  /**  Current location in the dialplan  */
  private @NotNull DialplanCEP dialplan;
 public @NotNull DialplanCEP getDialplan() {
   return dialplan;
 }

 @JsonDeserialize( as=DialplanCEP_impl_ari_1_5_0.class )
 public void setDialplan(@NotNull DialplanCEP val ) {
   dialplan = val;
 }

  /**  Unique identifier of the channel.

This is the same as the Uniqueid field in AMI.  */
  private @NotNull String id;
 public @NotNull String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(@NotNull String val ) {
   id = val;
 }

  /**  Name of the channel (i.e. SIP/foo-0000a7e3)  */
  private @NotNull String name;
 public @NotNull String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(@NotNull String val ) {
   name = val;
 }

  /**    */
  private @NotNull String state;
 public @NotNull String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(@NotNull String val ) {
   state = val;
 }

/**********************************************************
 * The default spoken language
 * 
 * @since ari_1_7_0
 *********************************************************/
 public @NotNull String getLanguage(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * The default spoken language
 * 
 * @since ari_1_7_0
 *********************************************************/
 public void setLanguage(@NotNull String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Channel variables
 * 
 * @since ari_2_0_0
 *********************************************************/
 public @Nullable String getChannelvars(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Channel variables
 * 
 * @since ari_2_0_0
 *********************************************************/
 public void setChannelvars(@Nullable String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

