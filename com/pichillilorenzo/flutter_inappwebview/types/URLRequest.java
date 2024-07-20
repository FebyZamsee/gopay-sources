package com.pichillilorenzo.flutter_inappwebview.types;

import com.google.android.gms.common.internal.ImagesContract;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class URLRequest {
    private byte[] body;
    private Map<String, String> headers;
    private String method;
    private String url;

    public URLRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
        this.url = str;
        this.method = str2;
        this.body = bArr;
        this.headers = map;
    }

    public static URLRequest fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get(ImagesContract.URL);
        if (str == null) {
            str = "about:blank";
        }
        return new URLRequest(str, (String) map.get(Constants.METHOD), (byte[]) map.get("body"), (Map) map.get("headers"));
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, this.url);
        hashMap.put(Constants.METHOD, this.method);
        hashMap.put("headers", this.headers);
        hashMap.put("body", this.body);
        hashMap.put("allowsCellularAccess", (Object) null);
        hashMap.put("allowsConstrainedNetworkAccess", (Object) null);
        hashMap.put("allowsExpensiveNetworkAccess", (Object) null);
        hashMap.put("cachePolicy", (Object) null);
        hashMap.put("httpShouldHandleCookies", (Object) null);
        hashMap.put("httpShouldUsePipelining", (Object) null);
        hashMap.put("networkServiceType", (Object) null);
        hashMap.put("timeoutInterval", (Object) null);
        hashMap.put("mainDocumentURL", (Object) null);
        hashMap.put("assumesHTTP3Capable", (Object) null);
        hashMap.put("attribution", (Object) null);
        return hashMap;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public byte[] getBody() {
        return this.body;
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLRequest uRLRequest = (URLRequest) obj;
        String str = this.url;
        if (str == null ? uRLRequest.url != null : !str.equals(uRLRequest.url)) {
            return false;
        }
        String str2 = this.method;
        if (str2 == null ? uRLRequest.method != null : !str2.equals(uRLRequest.method)) {
            return false;
        }
        if (!Arrays.equals(this.body, uRLRequest.body)) {
            return false;
        }
        Map<String, String> map = this.headers;
        Map<String, String> map2 = uRLRequest.headers;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.method;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.body);
        Map<String, String> map = this.headers;
        if (map != null) {
            i = map.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLRequest{url='");
        sb.append(this.url);
        sb.append("', method='");
        sb.append(this.method);
        sb.append("', body=");
        sb.append(Arrays.toString(this.body));
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append('}');
        return sb.toString();
    }
}
