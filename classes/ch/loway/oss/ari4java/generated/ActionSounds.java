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


public interface ActionSounds {

// java.util.concurrent.CompletionStage<List<Sound>> list @Nullable String @Nullable String
/**********************************************************
 * List all sounds.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<List<Sound>> list(@Nullable String lang, @Nullable String format);



// java.util.concurrent.CompletionStage<Sound> get @NotNull String
/**********************************************************
 * Get a sound's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public java.util.concurrent.CompletionStage<Sound> get(@NotNull String soundId);


}
;
