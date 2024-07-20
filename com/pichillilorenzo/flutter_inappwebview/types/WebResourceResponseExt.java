package com.pichillilorenzo.flutter_inappwebview.types;

import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WebResourceResponseExt {
    private String contentEncoding;
    private String contentType;
    private byte[] data;
    private Map<String, String> headers;
    private String reasonPhrase;
    private Integer statusCode;

    public WebResourceResponseExt(String str, String str2, Integer num, String str3, Map<String, String> map, byte[] bArr) {
        this.contentType = str;
        this.contentEncoding = str2;
        this.statusCode = num;
        this.reasonPhrase = str3;
        this.headers = map;
        this.data = bArr;
    }

    public static WebResourceResponseExt fromWebResourceResponse(WebResourceResponse webResourceResponse) {
        int statusCode2 = webResourceResponse.getStatusCode();
        return new WebResourceResponseExt(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), Integer.valueOf(statusCode2), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), Util.readAllBytes(webResourceResponse.getData()));
    }

    public static WebResourceResponseExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebResourceResponseExt((String) map.get("contentType"), (String) map.get("contentEncoding"), (Integer) map.get("statusCode"), (String) map.get("reasonPhrase"), (Map) map.get("headers"), (byte[]) map.get("data"));
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("contentType", this.contentType);
        hashMap.put("contentEncoding", this.contentEncoding);
        hashMap.put("statusCode", this.statusCode);
        hashMap.put("reasonPhrase", this.reasonPhrase);
        hashMap.put("headers", this.headers);
        hashMap.put("data", this.data);
        return hashMap;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public void setReasonPhrase(String str) {
        this.reasonPhrase = str;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceResponseExt webResourceResponseExt = (WebResourceResponseExt) obj;
        String str = this.contentType;
        if (str == null ? webResourceResponseExt.contentType != null : !str.equals(webResourceResponseExt.contentType)) {
            return false;
        }
        String str2 = this.contentEncoding;
        if (str2 == null ? webResourceResponseExt.contentEncoding != null : !str2.equals(webResourceResponseExt.contentEncoding)) {
            return false;
        }
        Integer num = this.statusCode;
        if (num == null ? webResourceResponseExt.statusCode != null : !num.equals(webResourceResponseExt.statusCode)) {
            return false;
        }
        String str3 = this.reasonPhrase;
        if (str3 == null ? webResourceResponseExt.reasonPhrase != null : !str3.equals(webResourceResponseExt.reasonPhrase)) {
            return false;
        }
        Map<String, String> map = this.headers;
        if (map == null ? webResourceResponseExt.headers == null : map.equals(webResourceResponseExt.headers)) {
            return Arrays.equals(this.data, webResourceResponseExt.data);
        }
        return false;
    }

    public int hashCode() {
        String str = this.contentType;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.contentEncoding;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.statusCode;
        int hashCode3 = num != null ? num.hashCode() : 0;
        String str3 = this.reasonPhrase;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        Map<String, String> map = this.headers;
        if (map != null) {
            i = map.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebResourceResponseExt{contentType='");
        sb.append(this.contentType);
        sb.append("', contentEncoding='");
        sb.append(this.contentEncoding);
        sb.append("', statusCode=");
        sb.append(this.statusCode);
        sb.append(", reasonPhrase='");
        sb.append(this.reasonPhrase);
        sb.append("', headers=");
        sb.append(this.headers);
        sb.append(", data=");
        sb.append(Arrays.toString(this.data));
        sb.append('}');
        return sb.toString();
    }
}
