package foundation.omni;

/**
 * Omni Protocol parameters for Bitcoin MainNet
 */
public class OmniTestNetParams extends OmniNetworkParameters {
    /* TestNet not supported yet */
    public static synchronized OmniMainNetParams get() {
        throw new UnsupportedOperationException();
    }
}
