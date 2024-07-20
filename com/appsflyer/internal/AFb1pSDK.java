package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

public final class AFb1pSDK {
    static JSONObject valueOf(String str) {
        JSONObject AFKeystoreWrapper = AFa1tSDK.AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                boolean optBoolean = AFKeystoreWrapper.optBoolean("monitor", false);
                AFb1uSDK afErrorLogForExcManagerOnly = AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly();
                if (!optBoolean || z) {
                    afErrorLogForExcManagerOnly.AFInAppEventType();
                    afErrorLogForExcManagerOnly.values();
                } else {
                    afErrorLogForExcManagerOnly.AFInAppEventParameterName();
                }
                if (AFKeystoreWrapper.has("ol_id")) {
                    String optString = AFKeystoreWrapper.optString("ol_scheme", (String) null);
                    String optString2 = AFKeystoreWrapper.optString("ol_domain", (String) null);
                    String optString3 = AFKeystoreWrapper.optString("ol_ver", (String) null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType();
                AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().values();
            }
        }
        return AFKeystoreWrapper;
    }
}
