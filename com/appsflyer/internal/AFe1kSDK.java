package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

public final class AFe1kSDK {
    public AFf1gSDK AFInAppEventParameterName = AFKeystoreWrapper();
    public long AFInAppEventType;
    public final AFb1aSDK valueOf;
    public long values;

    public AFe1kSDK(AFb1aSDK aFb1aSDK) {
        this.valueOf = aFb1aSDK;
        this.AFInAppEventType = aFb1aSDK.values("af_rc_timestamp", 0);
        this.values = aFb1aSDK.values("af_rc_max_age", 0);
    }

    private AFf1gSDK AFKeystoreWrapper() {
        String AFInAppEventParameterName2 = this.valueOf.AFInAppEventParameterName("af_remote_config", (String) null);
        if (AFInAppEventParameterName2 == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFf1gSDK(new String(Base64.decode(AFInAppEventParameterName2, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
