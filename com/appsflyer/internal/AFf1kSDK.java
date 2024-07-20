package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class AFf1kSDK {
    public final long AFInAppEventParameterName;
    public final int AFKeystoreWrapper;
    public final int valueOf;
    public final String values;

    public AFf1kSDK(String str, int i, int i2, long j) {
        this.values = str;
        this.valueOf = i;
        this.AFKeystoreWrapper = i2;
        this.AFInAppEventParameterName = j;
    }

    public final String values() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.values);
            jSONObject.put("min", this.valueOf);
            jSONObject.put("expire", this.AFKeystoreWrapper);
            jSONObject.put("ttl", this.AFInAppEventParameterName);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.values;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.valueOf) * 31) + this.AFKeystoreWrapper) * 31) + ((int) this.AFInAppEventParameterName);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1kSDK aFf1kSDK = (AFf1kSDK) obj;
        if (this.valueOf == aFf1kSDK.valueOf && this.AFKeystoreWrapper == aFf1kSDK.AFKeystoreWrapper && this.AFInAppEventParameterName == aFf1kSDK.AFInAppEventParameterName && (str = this.values) != null && str.equals(aFf1kSDK.values)) {
            return true;
        }
        return false;
    }
}
