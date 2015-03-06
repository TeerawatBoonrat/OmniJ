package com.msgilligan.bitcoin.rpc;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Utility class with default connection information for Bitcoin/Mastercoin JSON-RPC
 */
public class RPCURI {
    public static final String rpcproto = "http";
    public static final String rpcssl = "https";
    public static final String rpchost = "127.0.0.1";
    public static final String rpcfile = "/";
    public static final String stableMscRpcHost = "core.stage.merchantcoin.net";

    public static final int RPCPORT_MAINNET = 8332;
    public static final int RPCPORT_TESTNET = 18332;
    public static final int RPCPORT_REGTEST = 18332;

    public static URI getDefaultMainNetURI() {
        try {
            return new URI(rpcproto, null, rpchost, RPCPORT_MAINNET, rpcfile, null, null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static URI getDefaultTestNetURL() {
        try {
            return new URI(rpcproto, null, rpchost, RPCPORT_TESTNET, rpcfile, null, null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static URI getDefaultRegTestURL() {
        try {
            return new URI(rpcproto, null, rpchost, RPCPORT_REGTEST, rpcfile, null, null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static URI getStablePublicMainNetURL() {
        try {
            return new URI(rpcssl, null, stableMscRpcHost, RPCPORT_MAINNET, rpcfile, null, null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

}