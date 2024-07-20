package com.appsflyer.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1mSDK {
    public static final String AFInAppEventParameterName;
    public static final String AFKeystoreWrapper;
    public static String AFLogger;
    public static String AFLogger$LogLevel;
    public static final AFa1xSDK AFa1xSDK = new AFa1xSDK((DefaultConstructorMarker) null);
    public static final String afDebugLog;
    public static String afErrorLog;
    public static final String afInfoLog;
    public static String afRDLog;
    private static final String afWarnLog;
    public static String getLevel;
    public static final String values = "https://%sadrevenue.%s/api/v2/generic/v6.11.1/android?app_id=";
    public final AFc1pSDK AFInAppEventType;
    public final AFg1qSDK valueOf;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AFg1mSDK(AFc1pSDK aFc1pSDK) {
        this(aFc1pSDK, (AFg1qSDK) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
    }

    private AFg1mSDK(AFc1pSDK aFc1pSDK, AFg1qSDK aFg1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        this.AFInAppEventType = aFc1pSDK;
        this.valueOf = aFg1qSDK;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AFg1mSDK(AFc1pSDK aFc1pSDK, AFg1qSDK aFg1qSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, (i & 2) != 0 ? new AFg1jSDK() : aFg1qSDK);
    }

    public static final class AFa1xSDK {
        public /* synthetic */ AFa1xSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1xSDK() {
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AFa1dSDK.AFKeystoreWrapper);
        sb.append("/androidevent?app_id=");
        String obj = sb.toString();
        afWarnLog = obj;
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(obj);
        AFInAppEventParameterName = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(obj);
        AFKeystoreWrapper = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(obj);
        afInfoLog = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(obj);
        afDebugLog = sb5.toString();
    }

    public static String AFInAppEventParameterName(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(!z ? "&buildnumber=6.11.1" : "");
        return sb.toString();
    }
}
