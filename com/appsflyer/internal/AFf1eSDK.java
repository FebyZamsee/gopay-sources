package com.appsflyer.internal;

public final class AFf1eSDK {
    public final String AFInAppEventParameterName;
    public final long AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final Throwable afErrorLog;
    public final AFf1fSDK afInfoLog;
    public final String afRDLog;
    public final long valueOf;
    public final String values;

    public AFf1eSDK(String str, String str2, long j, long j2, int i, AFf1fSDK aFf1fSDK, String str3, Throwable th) {
        this.values = str;
        this.AFInAppEventParameterName = str2;
        this.valueOf = j;
        this.AFInAppEventType = j2;
        this.AFKeystoreWrapper = i;
        this.afInfoLog = aFf1fSDK;
        this.afRDLog = str3;
        this.afErrorLog = th;
    }
}
