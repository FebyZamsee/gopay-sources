package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

public final class AFe1dSDK extends AFd1jSDK<Void> {
    private final AFd1tSDK<String> AFLogger;
    private final AFb1aSDK afErrorLog;
    private final Throwable afRDLog;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final long AFInAppEventType() {
        return 1000;
    }

    public AFe1dSDK(AFe1ySDK aFe1ySDK, AFb1aSDK aFb1aSDK) {
        super(AFd1kSDK.GCDSDK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, "GCD-CHECK");
        this.afRDLog = aFe1ySDK.afInfoLog();
        this.AFLogger = aFe1ySDK.afInfoLog;
        this.afErrorLog = aFb1aSDK;
    }

    public final AFd1sSDK valueOf() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afErrorLog.AFInAppEventType("appsFlyerCount", 0))));
        long values = this.afErrorLog.values("appsflyerConversionDataCacheExpiration", 0);
        if (values != 0 && System.currentTimeMillis() - values > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afErrorLog.values("sixtyDayConversionData", true);
            this.afErrorLog.AFKeystoreWrapper("attributionId", (String) null);
            this.afErrorLog.AFInAppEventType("appsflyerConversionDataCacheExpiration", 0);
        }
        Map<String, Object> afErrorLog2 = afErrorLog();
        if (afErrorLog2 != null) {
            try {
                if (!afErrorLog2.containsKey("is_first_launch")) {
                    afErrorLog2.put("is_first_launch", Boolean.FALSE);
                }
                AFe1cSDK.AFKeystoreWrapper(afErrorLog2);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFd1sSDK.SUCCESS;
        }
        try {
            if (this.afRDLog != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(this.afRDLog.getMessage());
                AFe1cSDK.AFInAppEventParameterName(sb2.toString());
                return AFd1sSDK.SUCCESS;
            }
            AFd1tSDK<String> aFd1tSDK = this.AFLogger;
            if (aFd1tSDK != null && !aFd1tSDK.isSuccessful()) {
                StringBuilder sb3 = new StringBuilder("Launch status code: ");
                sb3.append(this.AFLogger.getStatusCode());
                AFe1cSDK.AFInAppEventParameterName(sb3.toString());
                return AFd1sSDK.SUCCESS;
            }
            return AFd1sSDK.FAILURE;
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb4.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb4.toString(), e2);
        }
    }

    private Map<String, Object> afErrorLog() {
        String AFInAppEventParameterName = this.afErrorLog.AFInAppEventParameterName("attributionId", (String) null);
        if (AFInAppEventParameterName == null) {
            return null;
        }
        try {
            new AFc1aSDK();
            return AFc1aSDK.AFInAppEventType(AFInAppEventParameterName);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }
}
