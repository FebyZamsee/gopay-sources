package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

public final class AFa1fSDK {
    static String AFInAppEventParameterName;
    static Boolean AFInAppEventType;

    public static AFa1eSDK AFInAppEventParameterName(ContentResolver contentResolver) {
        String str;
        if (!AFInAppEventType() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFa1eSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new AFa1eSDK(str, Boolean.TRUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.AFa1eSDK AFInAppEventParameterName(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = AFInAppEventParameterName
            r2 = 1
            if (r1 == 0) goto L_0x000b
            r3 = 1
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = 0
            if (r3 == 0) goto L_0x0010
            goto L_0x0049
        L_0x0010:
            java.lang.Boolean r1 = AFInAppEventType
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0026
        L_0x001a:
            java.lang.Boolean r1 = AFInAppEventType
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x004c
        L_0x0026:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch:{ all -> 0x0043 }
            r1.<init>(r5)     // Catch:{ all -> 0x0043 }
            boolean r5 = r0.isEnableLog()     // Catch:{ all -> 0x0043 }
            r1.setLogging(r5)     // Catch:{ all -> 0x0043 }
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x004c
            java.lang.String r0 = r5.getId()     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r5 = r5.getLat()     // Catch:{ all -> 0x0041 }
            goto L_0x004e
        L_0x0041:
            r1 = r0
            goto L_0x0044
        L_0x0043:
            r1 = r4
        L_0x0044:
            java.lang.String r5 = "No OAID library"
            com.appsflyer.AFLogger.afDebugLog(r5)
        L_0x0049:
            r0 = r1
            r5 = r4
            goto L_0x004e
        L_0x004c:
            r5 = r4
            r0 = r5
        L_0x004e:
            if (r0 == 0) goto L_0x005c
            com.appsflyer.internal.AFa1eSDK r1 = new com.appsflyer.internal.AFa1eSDK
            r1.<init>(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r1.AFInAppEventParameterName = r5
            return r1
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1fSDK.AFInAppEventParameterName(android.content.Context):com.appsflyer.internal.AFa1eSDK");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r8.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[SYNTHETIC, Splitter:B:33:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.AFa1eSDK AFKeystoreWrapper(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "advertiserIdEnabled"
            java.lang.String r1 = "advertiserId"
            boolean r2 = AFInAppEventType()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = "Trying to fetch GAID.."
            com.appsflyer.AFLogger.afInfoLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ all -> 0x001f }
            int r4 = r4.isGooglePlayServicesAvailable(r12)     // Catch:{ all -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r4 = move-exception
            java.lang.String r5 = "isGooglePlayServicesAvailable error"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r5, r4)
            r4 = -1
        L_0x0026:
            r5 = 0
            r6 = 1
            java.lang.String r7 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.Class.forName(r7)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r12)     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0054
            java.lang.String r8 = r7.getId()     // Catch:{ all -> 0x0061 }
            boolean r7 = r7.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0052 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0052 }
            if (r8 == 0) goto L_0x0047
            int r7 = r8.length()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x004c
        L_0x0047:
            java.lang.String r7 = "emptyOrNull |"
            r2.append(r7)     // Catch:{ all -> 0x004f }
        L_0x004c:
            r9 = 1
            goto L_0x00fb
        L_0x004f:
            r7 = move-exception
            r9 = 1
            goto L_0x0064
        L_0x0052:
            r7 = move-exception
            goto L_0x0063
        L_0x0054:
            java.lang.String r7 = "gpsAdInfo-null |"
            r2.append(r7)     // Catch:{ all -> 0x0061 }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = "GpsAdIndo is null"
            r7.<init>(r8)     // Catch:{ all -> 0x0061 }
            throw r7     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r7 = move-exception
            r8 = r3
        L_0x0063:
            r9 = 0
        L_0x0064:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Google Play Services is missing "
            r10.<init>(r11)
            java.lang.String r11 = r7.getMessage()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.appsflyer.AFLogger.afErrorLog(r10, r7)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r2.append(r7)
            java.lang.String r7 = " |"
            r2.append(r7)
            java.lang.String r10 = "WARNING: Google Play Services is missing."
            com.appsflyer.AFLogger.afInfoLog(r10)
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r11 = "enableGpsFallback"
            boolean r10 = r10.getBoolean(r11, r6)
            if (r10 == 0) goto L_0x00fb
            com.appsflyer.internal.AFa1iSDK$AFa1xSDK r3 = com.appsflyer.internal.AFa1iSDK.valueOf(r12)     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = r3.AFInAppEventParameterName     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.AFInAppEventParameterName()     // Catch:{ all -> 0x00b6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00b6 }
            if (r8 == 0) goto L_0x00b0
            int r10 = r8.length()     // Catch:{ all -> 0x00b6 }
            if (r10 != 0) goto L_0x00fb
        L_0x00b0:
            java.lang.String r10 = "emptyOrNull (bypass) |"
            r2.append(r10)     // Catch:{ all -> 0x00b6 }
            goto L_0x00fb
        L_0x00b6:
            r3 = move-exception
            java.lang.String r8 = r3.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r8, r3, r6, r5, r5)
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            r2.append(r7)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r5.getString(r1)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = r5.getString(r0)
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            java.lang.String r7 = r3.getLocalizedMessage()
            if (r7 == 0) goto L_0x00ee
            java.lang.String r3 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.afInfoLog(r3)
            goto L_0x00f5
        L_0x00ee:
            java.lang.String r3 = r3.toString()
            com.appsflyer.AFLogger.afInfoLog(r3)
        L_0x00f5:
            r3 = r5 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x00fb:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r5 = "android.app.ReceiverRestrictedContext"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x0129
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r12.getString(r1)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r12 = r12.getString(r0)
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            r12 = r12 ^ r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            java.lang.String r12 = "context = android.app.ReceiverRestrictedContext |"
            r2.append(r12)
        L_0x0129:
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x0148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r4 = ": "
            r12.append(r4)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "gaidError"
            r13.put(r2, r12)
        L_0x0148:
            if (r8 == 0) goto L_0x017b
            if (r3 == 0) goto L_0x017b
            r13.put(r1, r8)
            boolean r12 = r3.booleanValue()
            r12 = r12 ^ r6
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.put(r0, r12)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            r12.set((java.lang.String) r1, (java.lang.String) r8)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r1 = r3.booleanValue()
            r1 = r1 ^ r6
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.set((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r12 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "isGaidWithGps"
            r13.put(r0, r12)
        L_0x017b:
            com.appsflyer.internal.AFa1eSDK r12 = new com.appsflyer.internal.AFa1eSDK
            r12.<init>(r8, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1fSDK.AFKeystoreWrapper(android.content.Context, java.util.Map):com.appsflyer.internal.AFa1eSDK");
    }

    private static boolean AFInAppEventType() {
        Boolean bool = AFInAppEventType;
        return bool == null || bool.booleanValue();
    }
}
