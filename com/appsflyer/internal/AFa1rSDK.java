package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public abstract class AFa1rSDK {
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    String AFLogger;
    private byte[] AFLogger$LogLevel;
    public int afDebugLog;
    public String afErrorLog;
    String afInfoLog;
    private final boolean afRDLog;
    public String valueOf;
    String values;

    public abstract AFd1kSDK AFKeystoreWrapper();

    public boolean AFLogger() {
        return true;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return false;
    }

    public AFa1rSDK() {
        this((String) null, (String) null, (Boolean) null);
    }

    public AFa1rSDK(String str, String str2, Boolean bool) {
        this.AFInAppEventType = new HashMap();
        this.afInfoLog = str;
        this.afErrorLog = str2;
        this.afRDLog = bool != null ? bool.booleanValue() : true;
    }

    public AFa1rSDK AFInAppEventParameterName(String str) {
        this.afErrorLog = str;
        return this;
    }

    public final boolean valueOf() {
        return this.afInfoLog == null && this.valueOf == null;
    }

    public final AFa1rSDK values(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventType.putAll(map);
        }
        return this;
    }

    public final AFa1rSDK values(String str, Object obj) {
        synchronized (this.AFInAppEventType) {
            this.AFInAppEventType.put(str, obj);
        }
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final AFa1rSDK AFInAppEventType(int i) {
        this.afDebugLog = i;
        synchronized (this.AFInAppEventType) {
            if (this.AFInAppEventType.containsKey("counter")) {
                this.AFInAppEventType.put("counter", Integer.toString(i));
            }
            if (this.AFInAppEventType.containsKey("launch_counter")) {
                this.AFInAppEventType.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final AFa1rSDK AFInAppEventType(byte[] bArr) {
        this.AFLogger$LogLevel = bArr;
        return this;
    }

    public final byte[] values() {
        return this.AFLogger$LogLevel;
    }

    public final boolean AFInAppEventParameterName() {
        return this.afRDLog;
    }

    protected static String AFKeystoreWrapper(String str) {
        String AFInAppEventType2 = AFa1dSDK.valueOf().values().AFKeystoreWrapper().AFInAppEventType();
        return AFInAppEventType2 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventType2).build().toString() : str;
    }

    public static boolean AFInAppEventParameterName(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        int i2 = i + 1;
        if (i2 > 0) {
            return ((int) ((Math.random() * ((double) (i2 - 1))) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
