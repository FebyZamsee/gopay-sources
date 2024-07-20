package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public final class AFe1tSDK extends AFd1bSDK<String> {
    private final Map<String, Object> AFLogger;

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return false;
    }

    public AFe1tSDK(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        super(AFd1kSDK.MONITORSDK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, String.valueOf(map.hashCode()));
        this.AFLogger = new HashMap(map);
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        return this.afDebugLog.AFInAppEventType(this.AFLogger);
    }
}
