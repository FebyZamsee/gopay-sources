package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;

public abstract class AFg1xSDK extends AFg1uSDK {
    public AFg1xSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    protected static boolean values(Context context) {
        if (AFa1dSDK.valueOf().AFInAppEventType(AFa1dSDK.AFInAppEventParameterName(context), false) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
