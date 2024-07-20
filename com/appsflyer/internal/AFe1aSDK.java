package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class AFe1aSDK extends AFd1bSDK<Map<String, Object>> {
    private static final List<String> AFLogger = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    private Map<String, Object> AFLogger$LogLevel;
    private final AFb1aSDK AFVersionDeclaration;
    private final AFc1vSDK afErrorLogForExcManagerOnly;
    private final AFf1xSDK afWarnLog;
    private final AFc1hSDK getLevel;
    private String onAppOpenAttributionNative;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    public final boolean afErrorLog() {
        return false;
    }

    public AFe1aSDK(AFc1pSDK aFc1pSDK) {
        super(AFd1kSDK.GCDSDK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, "GCD-FETCH");
        this.getLevel = aFc1pSDK.AFInAppEventType();
        this.AFVersionDeclaration = aFc1pSDK.afErrorLog();
        this.afWarnLog = aFc1pSDK.afDebugLog();
        this.afErrorLogForExcManagerOnly = aFc1pSDK.AFKeystoreWrapper();
        this.AFKeystoreWrapper.add(AFd1kSDK.CONVERSION);
        this.AFKeystoreWrapper.add(AFd1kSDK.LAUNCH);
    }

    public final void values() {
        super.values();
        Map<String, Object> map = this.AFLogger$LogLevel;
        String str = this.onAppOpenAttributionNative;
        if (map != null) {
            AFe1cSDK.AFKeystoreWrapper(map);
        } else if (str == null || str.isEmpty()) {
            AFe1cSDK.AFInAppEventParameterName("Unknown error");
        } else {
            AFe1cSDK.AFInAppEventParameterName(str);
        }
    }

    public final AFc1eSDK<Map<String, Object>> values(String str) {
        String str2;
        String values = AFa1dSDK.values(this.AFVersionDeclaration, this.afErrorLogForExcManagerOnly.AFInAppEventType());
        if (values != null && !values.trim().isEmpty()) {
            if (!AFLogger.contains(values.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(values));
                AFc1eSDK<Map<String, Object>> values2 = this.getLevel.values(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(values2.AFInAppEventType.valueOf);
                AFb1tSDK.AFInAppEventParameterName(sb.toString());
                return values2;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[]{values}));
        }
        str2 = "";
        AFc1eSDK<Map<String, Object>> values22 = this.getLevel.values(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(values22.AFInAppEventType.valueOf);
        AFb1tSDK.AFInAppEventParameterName(sb2.toString());
        return values22;
    }

    public final AFd1sSDK valueOf() throws Exception {
        AFd1sSDK aFd1sSDK;
        AFd1sSDK aFd1sSDK2;
        if (!this.afErrorLog.values()) {
            AFd1sSDK aFd1sSDK3 = AFd1sSDK.FAILURE;
            int i = 0;
            while (i <= 2) {
                boolean z = i >= 2;
                this.afWarnLog.AFLogger$LogLevel = System.currentTimeMillis();
                try {
                    aFd1sSDK = super.valueOf();
                    AFd1tSDK<Result> aFd1tSDK = this.afInfoLog;
                    if (aFd1tSDK != null) {
                        int statusCode = aFd1tSDK.getStatusCode();
                        boolean z2 = statusCode == 403 || statusCode >= 500;
                        if (aFd1tSDK.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) aFd1tSDK.getBody();
                            int statusCode2 = aFd1tSDK.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.AFVersionDeclaration.AFInAppEventType("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", new Object[]{map.get("af_siteid")}));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.AFVersionDeclaration.AFKeystoreWrapper("attributionId", new JSONObject(map).toString());
                            if (!this.AFVersionDeclaration.values("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.AFLogger$LogLevel = map;
                            aFd1sSDK2 = AFd1sSDK.SUCCESS;
                        } else if (z || !z2) {
                            this.onAppOpenAttributionNative = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFd1sSDK2 = AFd1sSDK.FAILURE;
                        }
                        this.afWarnLog.AFKeystoreWrapper(i);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFd1sSDK2;
                    }
                } catch (AFd1eSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.onAppOpenAttributionNative = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                    aFd1sSDK = AFd1sSDK.FAILURE;
                    if (z) {
                        this.onAppOpenAttributionNative = e2.getMessage();
                        throw e2;
                    }
                } catch (Throwable th) {
                    this.afWarnLog.AFKeystoreWrapper(i);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                    throw th;
                }
                aFd1sSDK3 = aFd1sSDK;
                this.afWarnLog.AFKeystoreWrapper(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                i++;
            }
            return aFd1sSDK3;
        }
        AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
        this.onAppOpenAttributionNative = "'isStopTracking' enabled";
        throw new AFd1iSDK();
    }
}
