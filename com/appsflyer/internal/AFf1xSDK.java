package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class AFf1xSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public long AFInAppEventType = 0;
    public final AFb1aSDK AFKeystoreWrapper;
    public long AFLogger = 0;
    public long AFLogger$LogLevel = 0;
    public final long[] afDebugLog = new long[2];
    public final long[] afErrorLog = new long[2];
    public final long[] afInfoLog = new long[2];
    public long afRDLog = 0;
    public long afWarnLog;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    public AFf1xSDK(AFb1aSDK aFb1aSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.values = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap3;
        this.AFKeystoreWrapper = aFb1aSDK;
        concurrentHashMap.putAll(AFInAppEventParameterName("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventParameterName("ddl"));
        concurrentHashMap3.putAll(AFInAppEventParameterName("gcd"));
        this.afWarnLog = aFb1aSDK.values("prev_session_dur", 0);
    }

    public final void AFInAppEventType() {
        this.afRDLog = System.currentTimeMillis();
        if (values()) {
            long j = this.AFInAppEventType;
            if (j != 0) {
                this.valueOf.put("init_to_fg", Long.valueOf(this.afRDLog - j));
                this.AFKeystoreWrapper.AFKeystoreWrapper("first_launch", new JSONObject(this.valueOf).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFInAppEventParameterName(AFf1zSDK aFf1zSDK) {
        if (values()) {
            this.valueOf.put("start_with", aFf1zSDK.toString());
            this.AFKeystoreWrapper.AFKeystoreWrapper("first_launch", new JSONObject(this.valueOf).toString());
        }
    }

    public final void AFInAppEventType(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.AFLogger = currentTimeMillis;
        if (i == 1) {
            long j = this.afRDLog;
            if (j != 0) {
                this.valueOf.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFKeystoreWrapper.AFKeystoreWrapper("first_launch", new JSONObject(this.valueOf).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFKeystoreWrapper(DeepLinkResult deepLinkResult, long j) {
        this.values.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.values.put("timeout_value", Long.valueOf(j));
        this.AFKeystoreWrapper.AFKeystoreWrapper("ddl", new JSONObject(this.values).toString());
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.AFLogger$LogLevel;
        if (j != 0) {
            this.AFInAppEventParameterName.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventParameterName.put("retries", Integer.valueOf(i));
        this.AFKeystoreWrapper.AFKeystoreWrapper("gcd", new JSONObject(this.AFInAppEventParameterName).toString());
    }

    private Map<String, Object> AFInAppEventParameterName(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFInAppEventParameterName2 = this.AFKeystoreWrapper.AFInAppEventParameterName(str, (String) null);
        if (AFInAppEventParameterName2 == null) {
            return emptyMap;
        }
        try {
            return AFa1tSDK.AFKeystoreWrapper(new JSONObject(AFInAppEventParameterName2));
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            return emptyMap;
        }
    }

    public final boolean values() {
        return this.AFKeystoreWrapper.AFInAppEventType("appsFlyerCount", 0) == 0;
    }
}
