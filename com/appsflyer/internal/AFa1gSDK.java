package com.appsflyer.internal;

import android.net.NetworkInfo;

public final class AFa1gSDK {
    private static boolean values(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    static final class AFa1wSDK {
        final String AFInAppEventType;
        final String AFKeystoreWrapper;
        final String valueOf;

        AFa1wSDK(String str, String str2, String str3) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventType = str2;
            this.valueOf = str3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (1 != r6.getType()) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = "WIFI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r6.getType() != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r0 = "MOBILE";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.AFa1gSDK.AFa1wSDK AFInAppEventType(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "unknown"
            r1 = 0
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r10.getSystemService(r2)     // Catch:{ all -> 0x005e }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0037
            android.net.Network[] r3 = r2.getAllNetworks()     // Catch:{ all -> 0x005e }
            int r4 = r3.length     // Catch:{ all -> 0x005e }
            r5 = 0
        L_0x0013:
            if (r5 >= r4) goto L_0x0037
            r6 = r3[r5]     // Catch:{ all -> 0x005e }
            android.net.NetworkInfo r6 = r2.getNetworkInfo(r6)     // Catch:{ all -> 0x005e }
            boolean r7 = values(r6)     // Catch:{ all -> 0x005e }
            if (r7 == 0) goto L_0x0034
            int r2 = r6.getType()     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r3 != r2) goto L_0x002b
            java.lang.String r0 = "WIFI"
            goto L_0x0037
        L_0x002b:
            int r2 = r6.getType()     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = "MOBILE"
            goto L_0x0037
        L_0x0034:
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0037:
            java.lang.String r2 = "phone"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch:{ all -> 0x005e }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r10.getSimOperatorName()     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r10.getNetworkOperatorName()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x004f
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0068
        L_0x004f:
            r3 = 2
            int r10 = r10.getPhoneType()     // Catch:{ all -> 0x0059 }
            if (r3 != r10) goto L_0x0068
            java.lang.String r1 = "CDMA"
            goto L_0x0068
        L_0x0059:
            r10 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x0060
        L_0x005e:
            r10 = move-exception
            r2 = r1
        L_0x0060:
            java.lang.String r3 = "Exception while collecting network info. "
            com.appsflyer.AFLogger.afErrorLog(r3, r10)
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x0068:
            com.appsflyer.internal.AFa1gSDK$AFa1wSDK r10 = new com.appsflyer.internal.AFa1gSDK$AFa1wSDK
            r10.<init>(r0, r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1gSDK.AFInAppEventType(android.content.Context):com.appsflyer.internal.AFa1gSDK$AFa1wSDK");
    }
}
