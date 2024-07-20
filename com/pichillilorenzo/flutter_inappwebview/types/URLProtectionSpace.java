package com.pichillilorenzo.flutter_inappwebview.types;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import java.util.HashMap;
import java.util.Map;

public class URLProtectionSpace {
    private String host;
    private Long id;
    private int port;
    private String protocol;
    private String realm;
    private SslCertificate sslCertificate;
    private SslError sslError;

    public URLProtectionSpace(String str, String str2, String str3, int i, SslCertificate sslCertificate2, SslError sslError2) {
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i;
        this.sslCertificate = sslCertificate2;
        this.sslError = sslError2;
    }

    public URLProtectionSpace(Long l, String str, String str2, String str3, int i) {
        this.id = l;
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, this.host);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, this.protocol);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, this.realm);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(this.port));
        hashMap.put("sslCertificate", SslCertificateExt.toMap(this.sslCertificate));
        hashMap.put("sslError", SslErrorExt.toMap(this.sslError));
        hashMap.put("authenticationMethod", (Object) null);
        hashMap.put("distinguishedNames", (Object) null);
        hashMap.put("receivesCredentialSecurely", (Object) null);
        hashMap.put("isProxy", (Object) null);
        hashMap.put("proxyType", (Object) null);
        return hashMap;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public String getRealm() {
        return this.realm;
    }

    public void setRealm(String str) {
        this.realm = str;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public SslCertificate getSslCertificate() {
        return this.sslCertificate;
    }

    public void setSslCertificate(SslCertificate sslCertificate2) {
        this.sslCertificate = sslCertificate2;
    }

    public SslError getSslError() {
        return this.sslError;
    }

    public void setSslError(SslError sslError2) {
        this.sslError = sslError2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLProtectionSpace uRLProtectionSpace = (URLProtectionSpace) obj;
        if (this.port != uRLProtectionSpace.port || !this.host.equals(uRLProtectionSpace.host) || !this.protocol.equals(uRLProtectionSpace.protocol)) {
            return false;
        }
        String str = this.realm;
        if (str == null ? uRLProtectionSpace.realm != null : !str.equals(uRLProtectionSpace.realm)) {
            return false;
        }
        SslCertificate sslCertificate2 = this.sslCertificate;
        if (sslCertificate2 == null ? uRLProtectionSpace.sslCertificate != null : !sslCertificate2.equals(uRLProtectionSpace.sslCertificate)) {
            return false;
        }
        SslError sslError2 = this.sslError;
        SslError sslError3 = uRLProtectionSpace.sslError;
        if (sslError2 != null) {
            return sslError2.equals(sslError3);
        }
        if (sslError3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.host.hashCode();
        int hashCode2 = this.protocol.hashCode();
        String str = this.realm;
        int i = 0;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int i2 = this.port;
        SslCertificate sslCertificate2 = this.sslCertificate;
        int hashCode4 = sslCertificate2 != null ? sslCertificate2.hashCode() : 0;
        SslError sslError2 = this.sslError;
        if (sslError2 != null) {
            i = sslError2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + hashCode4) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLProtectionSpace{host='");
        sb.append(this.host);
        sb.append("', protocol='");
        sb.append(this.protocol);
        sb.append("', realm='");
        sb.append(this.realm);
        sb.append("', port=");
        sb.append(this.port);
        sb.append(", sslCertificate=");
        sb.append(this.sslCertificate);
        sb.append(", sslError=");
        sb.append(this.sslError);
        sb.append('}');
        return sb.toString();
    }
}
