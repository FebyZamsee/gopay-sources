package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

public final class AFg1tSDK extends AFg1zSDK {
    private final AFc1pSDK AFInAppEventType;

    public AFg1tSDK(Runnable runnable, AFc1pSDK aFc1pSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = aFc1pSDK;
    }

    public final void valueOf(Context context) {
        valueOf(context, new AFb1gSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
                if (r3 != null) goto L_0x00d3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
                if (r3 == null) goto L_0x00d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
                r3.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
                r0 = r11.valueOf.getPackageManager().resolveContentProvider(r11.AFInAppEventParameterName, 128).packageName;
                r11.values.valueOf.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFa1bSDK.AFKeystoreWrapper(r11.valueOf, r0)));
                r11.values.valueOf.put("api_ver_name", com.appsflyer.internal.AFa1bSDK.values(r11.valueOf, r0));
                r11.values.AFInAppEventType();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
                return r11.values.valueOf;
             */
            /* renamed from: AFInAppEventType */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.Map<java.lang.String, java.lang.Object> valueOf() {
                /*
                    r11 = this;
                    java.lang.String r0 = "instant"
                    java.lang.String r1 = "FEATURE_NOT_SUPPORTED"
                    java.lang.String r2 = "response"
                    r3 = 0
                    android.content.Context r4 = r11.valueOf     // Catch:{ Exception -> 0x00c2 }
                    android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r6 = "content://"
                    r4.<init>(r6)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r6 = r11.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    r4.append(r6)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c2 }
                    android.net.Uri r6 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00c2 }
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00c2 }
                    if (r3 == 0) goto L_0x00b4
                    boolean r4 = r3.moveToFirst()     // Catch:{ Exception -> 0x00c2 }
                    if (r4 == 0) goto L_0x00ac
                    com.appsflyer.internal.AFg1tSDK r4 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.valueOf     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "OK"
                    r4.put(r2, r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "referrer"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "click_ts"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_begin_ts"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_end_ts"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "organic_keywords"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "attr_type"
                    com.appsflyer.internal.AFg1tSDK r5 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r5.valueOf     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r4, r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x00c2 }
                    r4.<init>()     // Catch:{ Exception -> 0x00c2 }
                    int r5 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x00c2 }
                    r6 = -1
                    if (r5 == r6) goto L_0x008d
                    java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00c2 }
                    if (r5 == 0) goto L_0x008d
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00c2 }
                    r4.put(r0, r5)     // Catch:{ Exception -> 0x00c2 }
                L_0x008d:
                    java.lang.String r0 = "click_server_ts"
                    valueOf(r0, r4, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r0 = "install_begin_server_ts"
                    valueOf(r0, r4, r3)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r0 = "install_version"
                    AFKeystoreWrapper(r0, r4, r3)     // Catch:{ Exception -> 0x00c2 }
                    boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x00c2 }
                    if (r0 != 0) goto L_0x00bd
                    com.appsflyer.internal.AFg1tSDK r0 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "custom"
                    r0.put(r5, r4)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00ac:
                    com.appsflyer.internal.AFg1tSDK r0 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf     // Catch:{ Exception -> 0x00c2 }
                    r0.put(r2, r1)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00b4:
                    com.appsflyer.internal.AFg1tSDK r0 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "SERVICE_UNAVAILABLE"
                    r0.put(r2, r4)     // Catch:{ Exception -> 0x00c2 }
                L_0x00bd:
                    if (r3 == 0) goto L_0x00d6
                    goto L_0x00d3
                L_0x00c0:
                    r0 = move-exception
                    goto L_0x0112
                L_0x00c2:
                    r0 = move-exception
                    com.appsflyer.internal.AFg1tSDK r4 = com.appsflyer.internal.AFg1tSDK.this     // Catch:{ all -> 0x00c0 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.valueOf     // Catch:{ all -> 0x00c0 }
                    r4.put(r2, r1)     // Catch:{ all -> 0x00c0 }
                    java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00c0 }
                    com.appsflyer.AFLogger.afErrorLog(r1, r0)     // Catch:{ all -> 0x00c0 }
                    if (r3 == 0) goto L_0x00d6
                L_0x00d3:
                    r3.close()
                L_0x00d6:
                    android.content.Context r0 = r11.valueOf
                    android.content.pm.PackageManager r0 = r0.getPackageManager()
                    java.lang.String r1 = r11.AFInAppEventParameterName
                    r2 = 128(0x80, float:1.794E-43)
                    android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r2)
                    java.lang.String r0 = r0.packageName
                    com.appsflyer.internal.AFg1tSDK r1 = com.appsflyer.internal.AFg1tSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.valueOf
                    android.content.Context r2 = r11.valueOf
                    long r2 = com.appsflyer.internal.AFa1bSDK.AFKeystoreWrapper(r2, r0)
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.String r3 = "api_ver"
                    r1.put(r3, r2)
                    com.appsflyer.internal.AFg1tSDK r1 = com.appsflyer.internal.AFg1tSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.valueOf
                    android.content.Context r2 = r11.valueOf
                    java.lang.String r0 = com.appsflyer.internal.AFa1bSDK.values((android.content.Context) r2, (java.lang.String) r0)
                    java.lang.String r2 = "api_ver_name"
                    r1.put(r2, r0)
                    com.appsflyer.internal.AFg1tSDK r0 = com.appsflyer.internal.AFg1tSDK.this
                    r0.AFInAppEventType()
                    com.appsflyer.internal.AFg1tSDK r0 = com.appsflyer.internal.AFg1tSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf
                    return r0
                L_0x0112:
                    if (r3 == 0) goto L_0x0117
                    r3.close()
                L_0x0117:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1tSDK.AnonymousClass2.valueOf():java.util.Map");
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1) {
                    long j = cursor.getLong(columnIndex);
                    if (j != 0) {
                        map.put(str, Long.valueOf(j));
                    }
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                    map.put(str, string);
                }
            }
        });
    }
}
