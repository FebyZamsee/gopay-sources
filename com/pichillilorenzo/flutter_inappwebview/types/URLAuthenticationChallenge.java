package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.HashMap;
import java.util.Map;

public class URLAuthenticationChallenge {
    private URLProtectionSpace protectionSpace;

    public URLAuthenticationChallenge(URLProtectionSpace uRLProtectionSpace) {
        this.protectionSpace = uRLProtectionSpace;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("protectionSpace", this.protectionSpace.toMap());
        return hashMap;
    }

    public URLProtectionSpace getProtectionSpace() {
        return this.protectionSpace;
    }

    public void setProtectionSpace(URLProtectionSpace uRLProtectionSpace) {
        this.protectionSpace = uRLProtectionSpace;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.protectionSpace.equals(((URLAuthenticationChallenge) obj).protectionSpace);
    }

    public int hashCode() {
        return this.protectionSpace.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLAuthenticationChallenge{protectionSpace=");
        sb.append(this.protectionSpace);
        sb.append('}');
        return sb.toString();
    }
}
