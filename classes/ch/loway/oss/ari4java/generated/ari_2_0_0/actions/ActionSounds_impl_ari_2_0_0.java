package ch.loway.oss.ari4java.generated.ari_2_0_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 30 12:35:05 CEST 2017
// ----------------------------------------------------

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_2_0_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionSounds_impl_ari_2_0_0 extends BaseAriAction  implements ActionSounds {
/**********************************************************
 * Sounds
 * 
 * List all sounds.
 *********************************************************/
private void buildList(@Nullable String lang, @Nullable String format) {
reset();
url = "/sounds";
method = "GET";
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "format", format) );
}

@Override
public java.util.concurrent.CompletionStage<List<Sound>> list(@Nullable String lang, @Nullable String format) {
buildList(lang, format);
java.util.concurrent.CompletableFuture<List<Sound>> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), new TypeReference<List<Sound_impl_ari_2_0_0>>() {});
return future;
}

/**********************************************************
 * Individual sound
 * 
 * Get a sound's details.
 *********************************************************/
private void buildGet(@NotNull String soundId) {
reset();
url = "/sounds/" + soundId + "";
method = "GET";
}

@Override
public java.util.concurrent.CompletionStage<Sound> get(@NotNull String soundId) {
buildGet(soundId);
java.util.concurrent.CompletableFuture<Sound> future = new java.util.concurrent.CompletableFuture<>();
httpActionAsync(callbackOnceFuture(future), Sound_impl_ari_2_0_0.class);
return future;
}

/** No missing signatures from interface */
};

