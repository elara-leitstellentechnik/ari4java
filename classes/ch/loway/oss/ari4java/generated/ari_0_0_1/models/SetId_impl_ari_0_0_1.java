package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:39:17 CEST 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**********************************************************
 * Effective user/group id
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class SetId_impl_ari_0_0_1 implements SetId, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Effective group id.  */
  private @NotNull String group;
 public @NotNull String getGroup() {
   return group;
 }

 @JsonDeserialize( as=String.class )
 public void setGroup(@NotNull String val ) {
   group = val;
 }

  /**  Effective user id.  */
  private @NotNull String user;
 public @NotNull String getUser() {
   return user;
 }

 @JsonDeserialize( as=String.class )
 public void setUser(@NotNull String val ) {
   user = val;
 }

/** No missing signatures from interface */
}

