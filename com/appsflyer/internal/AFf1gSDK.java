package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFf1gSDK {
    public final AFf1hSDK AFInAppEventParameterName;
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    public final AFf1jSDK valueOf;
    public final String values;

    public AFf1gSDK(String str) throws JSONException {
        AFf1jSDK aFf1jSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.values = string;
                this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
                this.AFInAppEventType = str;
                if (string.startsWith("default")) {
                    aFf1jSDK = AFf1jSDK.DEFAULT;
                } else {
                    aFf1jSDK = AFf1jSDK.CUSTOM;
                }
                this.valueOf = aFf1jSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                this.AFInAppEventParameterName = optJSONObject != null ? new AFf1hSDK(optJSONObject) : null;
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        } else {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1gSDK aFf1gSDK = (AFf1gSDK) obj;
        if (this.AFKeystoreWrapper == aFf1gSDK.AFKeystoreWrapper && this.values.equals(aFf1gSDK.values)) {
            return this.AFInAppEventType.equals(aFf1gSDK.AFInAppEventType);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.AFKeystoreWrapper ? 1 : 0) * true) + this.values.hashCode()) * 31) + this.AFInAppEventType.hashCode();
        AFf1hSDK aFf1hSDK = this.AFInAppEventParameterName;
        return aFf1hSDK != null ? (hashCode * 31) + aFf1hSDK.hashCode() : hashCode;
    }
}
