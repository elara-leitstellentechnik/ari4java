
package ch.loway.oss.ari4java;

import ch.loway.oss.ari4java.generated.AriBuilder;
import ch.loway.oss.ari4java.generated.ari_1_10_0.AriBuilder_impl_ari_1_10_0;
import ch.loway.oss.ari4java.generated.ari_1_10_1.AriBuilder_impl_ari_1_10_1;
import ch.loway.oss.ari4java.generated.ari_1_5_0.AriBuilder_impl_ari_1_5_0;
import ch.loway.oss.ari4java.generated.ari_1_6_0.AriBuilder_impl_ari_1_6_0;
import ch.loway.oss.ari4java.generated.ari_1_7_0.AriBuilder_impl_ari_1_7_0;
import ch.loway.oss.ari4java.generated.ari_1_8_0.AriBuilder_impl_ari_1_8_0;
import ch.loway.oss.ari4java.generated.ari_1_9_0.AriBuilder_impl_ari_1_9_0;
import ch.loway.oss.ari4java.generated.ari_2_0_0.AriBuilder_impl_ari_2_0_0;
import ch.loway.oss.ari4java.generated.ari_3_0_0.AriBuilder_impl_ari_3_0_0;
import ch.loway.oss.ari4java.generated.ari_4_0_0.AriBuilder_impl_ari_4_0_0;
import ch.loway.oss.ari4java.generated.ari_4_0_1.AriBuilder_impl_ari_4_0_1;
import ch.loway.oss.ari4java.generated.ari_4_0_2.AriBuilder_impl_ari_4_0_2;
import ch.loway.oss.ari4java.tools.ARIException;

/**
 * The version of ARI to be used.
 *
 * @author lenz
 */
public enum AriVersion {


    /** Asterisk 13.0.0 */
    ARI_1_5_0 ( "1.5.0", new AriBuilder_impl_ari_1_5_0() ),
    /** Asterisk 13.1.0 */
    ARI_1_6_0 ( "1.6.0", new AriBuilder_impl_ari_1_6_0() ),
    /** Asterisk 13.2.0 */
    ARI_1_7_0 ( "1.7.0", new AriBuilder_impl_ari_1_7_0() ),
    /** Asterisk 13.5.0 */
    ARI_1_8_0 ( "1.8.0", new AriBuilder_impl_ari_1_8_0() ),
    /** Asterisk 13.7.0 */
    ARI_1_9_0 ( "1.9.0", new AriBuilder_impl_ari_1_9_0() ),
    /** Asterisk 13.24.1 */
    ARI_1_10_0 ( "1.10.0", new AriBuilder_impl_ari_1_10_0() ),
    /** Asterisk 13.26.0 */
    ARI_1_10_1 ( "1.10.1", new AriBuilder_impl_ari_1_10_1() ),
    /** Asterisk 14.2.1 */
    ARI_2_0_0 ( "2.0.0", new AriBuilder_impl_ari_2_0_0() ),
    /** Asterisk 15.1.4 */
    ARI_3_0_0 ( "3.0.0", new AriBuilder_impl_ari_3_0_0() ),
    /** Asterisk 16.1.1 */
    ARI_4_0_0 ( "4.0.0", new AriBuilder_impl_ari_4_0_0() ),
    /** Asterisk 16.3.0 */
    ARI_4_0_1 ( "4.0.1", new AriBuilder_impl_ari_4_0_1() ),
    /** Asterisk 16.4.0--16.6.0 */
    ARI_4_0_2 ( "4.0.2", new AriBuilder_impl_ari_4_0_2() ),

    IM_FEELING_LUCKY ( "", null );

    final AriBuilder builder;
    final String versionString;

    private AriVersion( String myVersion, AriBuilder ab ) {
        versionString = myVersion;
        builder = ab;
    }

    /**
     * You cannot get a builder for IM_FEELING_LUCKY or similar.
     * If you try to do this, it s a logical error and you get an exception.
     *
     * @return the builder object
     * @throws IllegalArgumentException
     */

    public AriBuilder builder() {
        if ( builder == null ) {
            throw new IllegalArgumentException("This version has no builder. Library error for :" + this.name());
        } else {
            return builder;
        }
    }

    /**
     * Return the correct version object from the signature string.
     * 
     * @param version
     * @return the inferred version.
     * @throws ARIException
     */

    public static AriVersion fromVersionString( String version ) throws ARIException {

	    AriVersion[] versions = AriVersion.values();

	    // find exact match
	    for (AriVersion av : versions) {
		    if ( av.builder != null ) {
			    if (av.versionString.equalsIgnoreCase(version) ) {
				    return av;
			    }
		    }
	    }

	    // find lower version that is compatible
	    int dot = version.lastIndexOf('.');
	    if (dot > 0) {
		    String majorDotBreaking = version.substring(0, dot + 1);
		    int nonBreaking = Integer.valueOf(version.substring(dot + 1));

		    for (int i = versions.length; i-- >= 0; ) {
			    AriVersion av = versions[i];
			    if ( av.builder != null ) {
				    if (av.versionString.startsWith(majorDotBreaking)) {
					    int avNonBreaking = Integer.valueOf(av.versionString.substring(dot + 1));
					    if (avNonBreaking < nonBreaking) {
						    return av;
					    }
				    }
			    }
		    }
	    }

	    throw new ARIException("Unknown ARI Version object for " + version);
    }


}

