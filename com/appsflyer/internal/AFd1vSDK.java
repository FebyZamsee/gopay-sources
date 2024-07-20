package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

public class AFd1vSDK {
    public boolean AFInAppEventParameterName;
    final Map<String, String> AFInAppEventType;
    public boolean AFKeystoreWrapper;
    private final byte[] afDebugLog;
    private boolean afErrorLog;
    private final boolean afInfoLog;
    public int afRDLog;
    public final String valueOf;
    final String values;

    public AFd1vSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this.afErrorLog = true;
        this.AFKeystoreWrapper = false;
        this.AFInAppEventParameterName = true;
        this.afRDLog = -1;
        this.valueOf = str;
        this.afDebugLog = bArr;
        this.values = str2;
        this.AFInAppEventType = map;
        this.afInfoLog = z;
    }

    public AFd1vSDK(String str, String str2) {
        this(str, (byte[]) null, str2, new HashMap(), false);
    }

    public final byte[] values() {
        return this.afDebugLog;
    }

    public final boolean AFInAppEventType() {
        return this.afInfoLog;
    }

    public final boolean AFInAppEventParameterName() {
        return this.afErrorLog;
    }

    public final boolean valueOf() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }
}
