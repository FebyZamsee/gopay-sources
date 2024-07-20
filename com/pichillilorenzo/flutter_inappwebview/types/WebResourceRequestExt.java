package com.pichillilorenzo.flutter_inappwebview.types;

import android.os.Build;
import android.webkit.WebResourceRequest;
import androidx.webkit.WebResourceRequestCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.common.internal.ImagesContract;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;

public class WebResourceRequestExt {
    private boolean hasGesture;
    private Map<String, String> headers;
    private boolean isForMainFrame;
    private boolean isRedirect;
    private String method;
    private String url;

    public WebResourceRequestExt(String str, Map<String, String> map, boolean z, boolean z2, boolean z3, String str2) {
        this.url = str;
        this.headers = map;
        this.isRedirect = z;
        this.hasGesture = z2;
        this.isForMainFrame = z3;
        this.method = str2;
    }

    public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest webResourceRequest) {
        boolean z;
        boolean isRedirect2;
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT)) {
            isRedirect2 = WebResourceRequestCompat.isRedirect(webResourceRequest);
        } else if (Build.VERSION.SDK_INT >= 24) {
            isRedirect2 = webResourceRequest.isRedirect();
        } else {
            z = false;
            return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), z, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
        }
        z = isRedirect2;
        return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), z, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, this.url);
        hashMap.put("headers", this.headers);
        hashMap.put("isRedirect", Boolean.valueOf(this.isRedirect));
        hashMap.put("hasGesture", Boolean.valueOf(this.hasGesture));
        hashMap.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        hashMap.put(Constants.METHOD, this.method);
        return hashMap;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setRedirect(boolean z) {
        this.isRedirect = z;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public void setHasGesture(boolean z) {
        this.hasGesture = z;
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public void setForMainFrame(boolean z) {
        this.isForMainFrame = z;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt) obj;
        if (this.isRedirect != webResourceRequestExt.isRedirect || this.hasGesture != webResourceRequestExt.hasGesture || this.isForMainFrame != webResourceRequestExt.isForMainFrame || !this.url.equals(webResourceRequestExt.url)) {
            return false;
        }
        Map<String, String> map = this.headers;
        if (map == null ? webResourceRequestExt.headers != null : !map.equals(webResourceRequestExt.headers)) {
            return false;
        }
        String str = this.method;
        String str2 = webResourceRequestExt.method;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode();
        Map<String, String> map = this.headers;
        int i = 0;
        int hashCode2 = map != null ? map.hashCode() : 0;
        boolean z = this.isRedirect;
        boolean z2 = this.hasGesture;
        boolean z3 = this.isForMainFrame;
        String str = this.method;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebResourceRequestExt{url=");
        sb.append(this.url);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", isRedirect=");
        sb.append(this.isRedirect);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", method='");
        sb.append(this.method);
        sb.append("'}");
        return sb.toString();
    }
}
