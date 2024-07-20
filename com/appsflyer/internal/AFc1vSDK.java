package com.appsflyer.internal;

import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

public final class AFc1vSDK {
    private static String AFInAppEventType = "248";
    public final AFc1tSDK AFInAppEventParameterName;
    private Bundle AFKeystoreWrapper = null;
    public final AFb1aSDK values;

    public AFc1vSDK(AFc1tSDK aFc1tSDK, AFb1aSDK aFb1aSDK) {
        this.AFInAppEventParameterName = aFc1tSDK;
        this.values = aFb1aSDK;
    }

    public static String valueOf() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final String values(String str) {
        Object obj;
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = this.AFInAppEventParameterName.AFInAppEventType.getPackageManager().getApplicationInfo(this.AFInAppEventParameterName.AFInAppEventType.getPackageName(), 128).metaData;
            }
            Bundle bundle = this.AFKeystoreWrapper;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final boolean AFInAppEventParameterName(String str) {
        String values2 = values(str);
        if (values2 != null) {
            return Boolean.parseBoolean(values2);
        }
        return false;
    }

    public static String AFKeystoreWrapper() {
        StringBuilder sb = new StringBuilder("version: 6.11.1 (build ");
        sb.append(AFInAppEventType);
        sb.append(")");
        return sb.toString();
    }

    public final String AFInAppEventType() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = values("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }
}
