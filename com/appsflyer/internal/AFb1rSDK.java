package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

public final class AFb1rSDK {
    private static String valueOf;

    public static String valueOf(WeakReference<Context> weakReference) {
        synchronized (AFb1rSDK.class) {
            if (weakReference.get() == null) {
                String str = valueOf;
                return str;
            }
            if (valueOf == null) {
                String str2 = null;
                if (weakReference.get() != null) {
                    str2 = AFa1dSDK.AFInAppEventParameterName(weakReference.get()).getString("AF_INSTALLATION", (String) null);
                }
                if (str2 != null) {
                    valueOf = str2;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            valueOf = sb.toString();
                        } else {
                            valueOf = values(file);
                            file.delete();
                        }
                        String str3 = valueOf;
                        SharedPreferences.Editor edit = AFa1dSDK.AFInAppEventParameterName(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str3);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (valueOf != null) {
                    AppsFlyerProperties.getInstance().set("uid", valueOf);
                }
            }
            String str4 = valueOf;
            return str4;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[SYNTHETIC, Splitter:B:30:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.io.File r6) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0029 }
            java.lang.String r3 = "r"
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x0029 }
            long r3 = r2.length()     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            int r6 = (int) r3     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r2.readFully(r1)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x003b
        L_0x001b:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L_0x003b
        L_0x0020:
            r6 = move-exception
            goto L_0x004b
        L_0x0022:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x002b
        L_0x0027:
            r6 = move-exception
            goto L_0x004a
        L_0x0029:
            r6 = move-exception
            r2 = r1
        L_0x002b:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r3, r6)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L_0x003a:
            r1 = r2
        L_0x003b:
            if (r1 != 0) goto L_0x0040
            r6 = 0
            byte[] r1 = new byte[r6]
        L_0x0040:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r6.<init>(r1, r0)
            return r6
        L_0x004a:
            r2 = r1
        L_0x004b:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L_0x0055:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.values(java.io.File):java.lang.String");
    }
}
