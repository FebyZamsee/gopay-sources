package com.appsflyer.internal;

import androidx.webkit.ProxyConfig;
import com.appsflyer.AFLogger;

public final class AFb1tSDK {
    private static String AFInAppEventType;
    private static String values;

    static void values(String str) {
        AFInAppEventType = str;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
                }
            }
            values = sb.toString();
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFInAppEventType == null) {
            values(AFa1dSDK.valueOf().values().AppsFlyer2dXConversionCallback().valueOf);
        }
        String str2 = AFInAppEventType;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, values));
        }
    }
}
