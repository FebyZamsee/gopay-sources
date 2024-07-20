package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1dSDK;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    private static final AppsFlyerProperties AFInAppEventParameterName = new AppsFlyerProperties();
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    public String AFInAppEventType;
    private boolean AFKeystoreWrapper = false;
    private final Map<String, Object> valueOf = new HashMap();
    public boolean values;

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return AFInAppEventParameterName;
    }

    public void remove(String str) {
        synchronized (this) {
            this.valueOf.remove(str);
        }
    }

    public void set(String str, String str2) {
        synchronized (this) {
            this.valueOf.put(str, str2);
        }
    }

    public void set(String str, String[] strArr) {
        synchronized (this) {
            this.valueOf.put(str, strArr);
        }
    }

    public void set(String str, int i) {
        synchronized (this) {
            this.valueOf.put(str, Integer.toString(i));
        }
    }

    public void set(String str, long j) {
        synchronized (this) {
            this.valueOf.put(str, Long.toString(j));
        }
    }

    public void set(String str, boolean z) {
        synchronized (this) {
            this.valueOf.put(str, Boolean.toString(z));
        }
    }

    public void setCustomData(String str) {
        synchronized (this) {
            this.valueOf.put(ADDITIONAL_CUSTOM_DATA, str);
        }
    }

    public void setUserEmails(String str) {
        synchronized (this) {
            this.valueOf.put(USER_EMAILS, str);
        }
    }

    public String getString(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.valueOf.get(str);
        }
        return str2;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.parseInt(string);
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.parseLong(string);
    }

    public Object getObject(String str) {
        Object obj;
        synchronized (this) {
            obj = this.valueOf.get(str);
        }
        return obj;
    }

    public final boolean AFKeystoreWrapper() {
        return this.values;
    }

    public String getReferrer(Context context) {
        String str = this.AFInAppEventType;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AFa1dSDK.AFInAppEventParameterName(context).getString("referrer", (String) null);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public void saveProperties(SharedPreferences sharedPreferences) {
        synchronized (this) {
            this.valueOf.remove("AppsFlyerKey");
            sharedPreferences.edit().putString("savedProperties", new JSONObject(this.valueOf).toString()).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadProperties(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.values()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            android.content.SharedPreferences r6 = com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName((android.content.Context) r6)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "savedProperties"
            r1 = 0
            java.lang.String r0 = r6.getString(r0, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = "Loading properties.."
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x007c }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0061 }
            java.util.Iterator r0 = r1.keys()     // Catch:{ JSONException -> 0x0061 }
        L_0x0024:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0061 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0061 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.valueOf     // Catch:{ JSONException -> 0x0061 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ JSONException -> 0x0061 }
            if (r3 != 0) goto L_0x0024
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.valueOf     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r4 = r1.getString(r2)     // Catch:{ JSONException -> 0x0061 }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0024
        L_0x0042:
            java.lang.String r0 = "AppsFlyerKey"
            java.lang.String r1 = "custom_host"
            java.lang.String r2 = "custom_host_prefix"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}     // Catch:{ JSONException -> 0x0061 }
            r1 = 0
        L_0x004d:
            r2 = 3
            if (r1 >= r2) goto L_0x005a
            r2 = r0[r1]     // Catch:{ JSONException -> 0x0061 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.valueOf     // Catch:{ JSONException -> 0x0061 }
            r3.remove(r2)     // Catch:{ JSONException -> 0x0061 }
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005a:
            r5.saveProperties(r6)     // Catch:{ JSONException -> 0x0061 }
            r6 = 1
            r5.AFKeystoreWrapper = r6     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r6 = move-exception
            java.lang.String r0 = "Failed loading properties"
            com.appsflyer.AFLogger.afErrorLog(r0, r6)     // Catch:{ all -> 0x007c }
        L_0x0067:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "Done loading properties: "
            r6.<init>(r0)     // Catch:{ all -> 0x007c }
            boolean r0 = r5.AFKeystoreWrapper     // Catch:{ all -> 0x007c }
            r6.append(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007c }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r5)
            return
        L_0x007c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerProperties.loadProperties(android.content.Context):void");
    }

    private boolean values() {
        return this.AFKeystoreWrapper;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        
        private final int AFKeystoreWrapper;

        private EmailsCryptType(int i) {
            this.AFKeystoreWrapper = i;
        }

        public final int getValue() {
            return this.AFKeystoreWrapper;
        }
    }

    public boolean isEnableLog() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel()) > AFLogger.LogLevel.NONE.getLevel();
    }
}
