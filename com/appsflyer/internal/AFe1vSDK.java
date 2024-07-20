package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

public final class AFe1vSDK extends AFd1bSDK<String> {
    private final AFf1rSDK AFLogger;

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        String encodeToString = Base64.encodeToString(this.AFLogger.values(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        this.afRDLog.valueOf(this.AFLogger.afErrorLog, encodeToString);
        return this.afDebugLog.values(this.AFLogger);
    }

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return this.AFLogger.AFInAppEventParameterName;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AFe1vSDK(com.appsflyer.internal.AFf1rSDK r8, com.appsflyer.internal.AFc1pSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFd1kSDK r0 = r8.afRDLog
            if (r0 == 0) goto L_0x0007
            com.appsflyer.internal.AFd1kSDK r0 = r8.afRDLog
            goto L_0x0009
        L_0x0007:
            com.appsflyer.internal.AFd1kSDK r0 = com.appsflyer.internal.AFd1kSDK.CACHED_EVENT
        L_0x0009:
            r2 = r0
            r0 = 1
            com.appsflyer.internal.AFd1kSDK[] r3 = new com.appsflyer.internal.AFd1kSDK[r0]
            r0 = 0
            com.appsflyer.internal.AFd1kSDK r1 = com.appsflyer.internal.AFd1kSDK.RC_CDN
            r3[r0] = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.valueOf
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = AFInAppEventType(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.valueOf
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.AFLogger = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1vSDK.<init>(com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFc1pSDK):void");
    }

    private static String AFInAppEventType(AFf1rSDK aFf1rSDK) {
        try {
            return new URL(aFf1rSDK.afErrorLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
