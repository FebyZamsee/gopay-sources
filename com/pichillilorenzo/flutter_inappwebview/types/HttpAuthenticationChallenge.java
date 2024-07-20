package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class HttpAuthenticationChallenge extends URLAuthenticationChallenge {
    private int previousFailureCount;
    URLCredential proposedCredential;

    public HttpAuthenticationChallenge(URLProtectionSpace uRLProtectionSpace, int i, URLCredential uRLCredential) {
        super(uRLProtectionSpace);
        this.previousFailureCount = i;
        this.proposedCredential = uRLCredential;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("previousFailureCount", Integer.valueOf(this.previousFailureCount));
        URLCredential uRLCredential = this.proposedCredential;
        map.put("proposedCredential", uRLCredential != null ? uRLCredential.toMap() : null);
        map.put("failureResponse", (Object) null);
        map.put("error", (Object) null);
        return map;
    }

    public int getPreviousFailureCount() {
        return this.previousFailureCount;
    }

    public void setPreviousFailureCount(int i) {
        this.previousFailureCount = i;
    }

    public URLCredential getProposedCredential() {
        return this.proposedCredential;
    }

    public void setProposedCredential(URLCredential uRLCredential) {
        this.proposedCredential = uRLCredential;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        HttpAuthenticationChallenge httpAuthenticationChallenge = (HttpAuthenticationChallenge) obj;
        if (this.previousFailureCount != httpAuthenticationChallenge.previousFailureCount) {
            return false;
        }
        URLCredential uRLCredential = this.proposedCredential;
        URLCredential uRLCredential2 = httpAuthenticationChallenge.proposedCredential;
        if (uRLCredential != null) {
            return uRLCredential.equals(uRLCredential2);
        }
        if (uRLCredential2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.previousFailureCount;
        URLCredential uRLCredential = this.proposedCredential;
        return (((hashCode * 31) + i) * 31) + (uRLCredential != null ? uRLCredential.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpAuthenticationChallenge{previousFailureCount=");
        sb.append(this.previousFailureCount);
        sb.append(", proposedCredential=");
        sb.append(this.proposedCredential);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
