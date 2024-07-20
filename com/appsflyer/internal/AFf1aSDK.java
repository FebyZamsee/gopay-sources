package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

public final class AFf1aSDK extends AFg1uSDK {
    private final AFc1pSDK AFInAppEventParameterName;
    final ProviderInfo AFInAppEventType;

    public AFf1aSDK(ProviderInfo providerInfo, Runnable runnable, AFc1pSDK aFc1pSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFInAppEventParameterName = aFc1pSDK;
        this.AFInAppEventType = providerInfo;
    }

    public final void valueOf(final Context context) {
        this.AFInAppEventParameterName.valueOf().execute(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0088;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0088;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0088;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
                r0.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
                r0.release();
             */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r9 = this;
                    com.appsflyer.internal.AFf1aSDK r0 = com.appsflyer.internal.AFf1aSDK.this
                    long r1 = java.lang.System.currentTimeMillis()
                    r0.afDebugLog = r1
                    com.appsflyer.internal.AFg1uSDK$AFa1xSDK r1 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.STARTED
                    r0.AFLogger = r1
                    com.appsflyer.internal.AFg1uSDK$2 r1 = new com.appsflyer.internal.AFg1uSDK$2
                    r1.<init>()
                    r0.addObserver(r1)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "content://"
                    r0.<init>(r1)
                    com.appsflyer.internal.AFf1aSDK r1 = com.appsflyer.internal.AFf1aSDK.this
                    android.content.pm.ProviderInfo r1 = r1.AFInAppEventType
                    java.lang.String r1 = r1.authority
                    r0.append(r1)
                    java.lang.String r1 = "/transaction_id"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    android.content.Context r0 = r2
                    android.content.ContentProviderClient r0 = com.appsflyer.internal.AFf1aSDK.AFKeystoreWrapper(r0, r2)
                    if (r0 == 0) goto L_0x0099
                    r7 = 0
                    r8 = 24
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    java.lang.String r3 = "app_id="
                    r1.<init>(r3)     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    android.content.Context r3 = r2     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    java.lang.String r3 = r3.getPackageName()     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    r1.append(r3)     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    r3 = 0
                    java.lang.String r4 = r1.toString()     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    r5 = 0
                    r6 = 0
                    r1 = r0
                    android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ DeadObjectException -> 0x007a, RemoteException -> 0x006f, all -> 0x0064 }
                    int r2 = android.os.Build.VERSION.SDK_INT
                    if (r2 < r8) goto L_0x0060
                    r0.close()
                    goto L_0x009a
                L_0x0060:
                    r0.release()
                    goto L_0x009a
                L_0x0064:
                    r1 = move-exception
                    java.lang.String r2 = "[Preinstall]: Error to get data from providerClient "
                    com.appsflyer.AFLogger.afErrorLog(r2, r1, r7)     // Catch:{ all -> 0x008c }
                    int r1 = android.os.Build.VERSION.SDK_INT
                    if (r1 < r8) goto L_0x0088
                    goto L_0x0084
                L_0x006f:
                    r1 = move-exception
                    java.lang.String r2 = "[Preinstall]: Failed to query unstable content providerClient"
                    com.appsflyer.AFLogger.afErrorLog(r2, r1, r7)     // Catch:{ all -> 0x008c }
                    int r1 = android.os.Build.VERSION.SDK_INT
                    if (r1 < r8) goto L_0x0088
                    goto L_0x0084
                L_0x007a:
                    r1 = move-exception
                    java.lang.String r2 = "[Preinstall]: Failed to acquire unstable content providerClient"
                    com.appsflyer.AFLogger.afErrorLog(r2, r1, r7)     // Catch:{ all -> 0x008c }
                    int r1 = android.os.Build.VERSION.SDK_INT
                    if (r1 < r8) goto L_0x0088
                L_0x0084:
                    r0.close()
                    goto L_0x0099
                L_0x0088:
                    r0.release()
                    goto L_0x0099
                L_0x008c:
                    r1 = move-exception
                    int r2 = android.os.Build.VERSION.SDK_INT
                    if (r2 < r8) goto L_0x0095
                    r0.close()
                    goto L_0x0098
                L_0x0095:
                    r0.release()
                L_0x0098:
                    throw r1
                L_0x0099:
                    r1 = 0
                L_0x009a:
                    java.lang.String r0 = "response"
                    if (r1 == 0) goto L_0x00e1
                    java.lang.String r2 = "transaction_id"
                    int r2 = r1.getColumnIndex(r2)
                    r3 = -1
                    if (r2 != r3) goto L_0x00b6
                    java.lang.String r2 = "[Preinstall]: Wrong column name"
                    com.appsflyer.AFLogger.afWarnLog(r2)
                    com.appsflyer.internal.AFf1aSDK r2 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r2.valueOf
                    java.lang.String r3 = "FEATURE_NOT_SUPPORTED"
                    r2.put(r0, r3)
                    goto L_0x00dd
                L_0x00b6:
                    com.appsflyer.internal.AFf1aSDK r3 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.valueOf
                    java.lang.String r4 = "OK"
                    r3.put(r0, r4)
                    boolean r0 = r1.moveToFirst()
                    if (r0 == 0) goto L_0x00dd
                    java.lang.String r0 = r1.getString(r2)
                    r1.close()
                    if (r0 == 0) goto L_0x00dd
                    boolean r2 = r0.isEmpty()
                    if (r2 != 0) goto L_0x00dd
                    com.appsflyer.internal.AFf1aSDK r2 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r2.valueOf
                    java.lang.String r3 = "referrer"
                    r2.put(r3, r0)
                L_0x00dd:
                    r1.close()
                    goto L_0x00ef
                L_0x00e1:
                    java.lang.String r1 = "[Preinstall]: ContentProvider query failed, got null Cursor"
                    com.appsflyer.AFLogger.afWarnLog(r1)
                    com.appsflyer.internal.AFf1aSDK r1 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.valueOf
                    java.lang.String r2 = "SERVICE_UNAVAILABLE"
                    r1.put(r0, r2)
                L_0x00ef:
                    com.appsflyer.internal.AFf1aSDK r0 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf
                    android.content.Context r1 = r2
                    com.appsflyer.internal.AFf1aSDK r2 = com.appsflyer.internal.AFf1aSDK.this
                    android.content.pm.ProviderInfo r2 = r2.AFInAppEventType
                    java.lang.String r2 = r2.packageName
                    long r1 = com.appsflyer.internal.AFa1bSDK.AFKeystoreWrapper(r1, r2)
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.lang.String r2 = "api_ver"
                    r0.put(r2, r1)
                    com.appsflyer.internal.AFf1aSDK r0 = com.appsflyer.internal.AFf1aSDK.this
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf
                    android.content.Context r1 = r2
                    com.appsflyer.internal.AFf1aSDK r2 = com.appsflyer.internal.AFf1aSDK.this
                    android.content.pm.ProviderInfo r2 = r2.AFInAppEventType
                    java.lang.String r2 = r2.packageName
                    java.lang.String r1 = com.appsflyer.internal.AFa1bSDK.values((android.content.Context) r1, (java.lang.String) r2)
                    java.lang.String r2 = "api_ver_name"
                    r0.put(r2, r1)
                    com.appsflyer.internal.AFf1aSDK r0 = com.appsflyer.internal.AFf1aSDK.this
                    r0.AFInAppEventType()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1aSDK.AnonymousClass3.run():void");
            }
        });
    }

    public static ContentProviderClient AFKeystoreWrapper(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }
}
