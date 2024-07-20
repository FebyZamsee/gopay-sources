package com.pichillilorenzo.flutter_inappwebview.types;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;

public class ProxyRuleExt {
    private String schemeFilter;
    private String url;

    public ProxyRuleExt(String str, String str2) {
        this.schemeFilter = str;
        this.url = str2;
    }

    public static ProxyRuleExt fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new ProxyRuleExt(map.get("schemeFilter"), map.get(ImagesContract.URL));
    }

    public Map<String, String> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, this.url);
        hashMap.put("schemeFilter", this.schemeFilter);
        return hashMap;
    }

    public String getSchemeFilter() {
        return this.schemeFilter;
    }

    public void setSchemeFilter(String str) {
        this.schemeFilter = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyRuleExt proxyRuleExt = (ProxyRuleExt) obj;
        String str = this.schemeFilter;
        if (str == null ? proxyRuleExt.schemeFilter == null : str.equals(proxyRuleExt.schemeFilter)) {
            return this.url.equals(proxyRuleExt.url);
        }
        return false;
    }

    public int hashCode() {
        String str = this.schemeFilter;
        return ((str != null ? str.hashCode() : 0) * 31) + this.url.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProxyRuleExt{schemeFilter='");
        sb.append(this.schemeFilter);
        sb.append("', url='");
        sb.append(this.url);
        sb.append("'}");
        return sb.toString();
    }
}