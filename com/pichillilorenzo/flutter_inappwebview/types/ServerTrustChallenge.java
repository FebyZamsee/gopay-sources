package com.pichillilorenzo.flutter_inappwebview.types;

public class ServerTrustChallenge extends URLAuthenticationChallenge {
    public ServerTrustChallenge(URLProtectionSpace uRLProtectionSpace) {
        super(uRLProtectionSpace);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerTrustChallenge{} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
