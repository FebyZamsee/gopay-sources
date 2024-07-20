package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

public final class AFe1lSDK {
    private static final long AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24);
    private final AFc1vSDK AFInAppEventParameterName;
    private final AFe1kSDK values;

    public AFe1lSDK(AFc1vSDK aFc1vSDK, AFe1kSDK aFe1kSDK) {
        this.AFInAppEventParameterName = aFc1vSDK;
        this.values = aFe1kSDK;
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.values("com.appsflyer.rc.sandbox"));
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.values("com.appsflyer.rc.staging"));
    }

    public final long valueOf() {
        String values2 = this.AFInAppEventParameterName.values("com.appsflyer.rc.cache.max-age-fallback");
        if (values2 == null) {
            return AFKeystoreWrapper;
        }
        try {
            return Long.parseLong(values2);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return AFKeystoreWrapper;
        }
    }

    public final boolean AFKeystoreWrapper() {
        if (this.values.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        if (System.currentTimeMillis() - this.values.AFInAppEventType > TimeUnit.SECONDS.toMillis(this.values.values)) {
            return true;
        }
        return false;
    }
}
