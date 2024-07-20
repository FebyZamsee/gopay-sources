package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class AFb1ySDK implements AFb1xSDK {
    private final AFc1tSDK AFKeystoreWrapper;

    public AFb1ySDK(AFc1tSDK aFc1tSDK) {
        this.AFKeystoreWrapper = aFc1tSDK;
    }

    public final List<AFb1wSDK> valueOf() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFKeystoreWrapper.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return arrayList;
            }
            for (File file2 : listFiles) {
                StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                sb.append(file2.getName());
                AFLogger.afInfoLog(sb.toString());
                arrayList.add(AFKeystoreWrapper(file2));
            }
            return arrayList;
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[SYNTHETIC, Splitter:B:18:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[SYNTHETIC, Splitter:B:26:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.appsflyer.internal.AFb1wSDK AFKeystoreWrapper(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            long r3 = r5.length()     // Catch:{ Exception -> 0x002f }
            int r4 = (int) r3     // Catch:{ Exception -> 0x002f }
            char[] r3 = new char[r4]     // Catch:{ Exception -> 0x002f }
            r2.read(r3)     // Catch:{ Exception -> 0x002f }
            com.appsflyer.internal.AFb1wSDK r4 = new com.appsflyer.internal.AFb1wSDK     // Catch:{ Exception -> 0x002f }
            r4.<init>(r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x002f }
            r4.AFInAppEventParameterName = r5     // Catch:{ Exception -> 0x002f }
            r2.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L_0x002e:
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x0035
        L_0x0031:
            r5 = move-exception
            goto L_0x0047
        L_0x0033:
            r5 = move-exception
            r2 = r1
        L_0x0035:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L_0x0044:
            return r1
        L_0x0045:
            r5 = move-exception
            r1 = r2
        L_0x0047:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L_0x0051:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1ySDK.AFKeystoreWrapper(java.io.File):com.appsflyer.internal.AFb1wSDK");
    }

    public final void AFKeystoreWrapper() {
        try {
            if (!new File(this.AFKeystoreWrapper.AFInAppEventType.getFilesDir(), "AFRequestCache").exists()) {
                new File(this.AFKeystoreWrapper.AFInAppEventType.getFilesDir(), "AFRequestCache").mkdir();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9 A[SYNTHETIC, Splitter:B:32:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6 A[SYNTHETIC, Splitter:B:40:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String AFInAppEventType(com.appsflyer.internal.AFb1wSDK r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AFRequestCache"
            java.lang.String r1 = "could not close cache writer"
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            com.appsflyer.internal.AFc1tSDK r4 = r7.AFKeystoreWrapper     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            android.content.Context r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            if (r4 != 0) goto L_0x001c
            r3.mkdir()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            return r2
        L_0x001c:
            java.io.File[] r3 = r3.listFiles()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            if (r3 == 0) goto L_0x002d
            int r3 = r3.length     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 40
            if (r3 <= r4) goto L_0x002d
            java.lang.String r8 = "CACHE: reached cache limit, not caching request"
            com.appsflyer.AFLogger.afInfoLog(r8)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            return r2
        L_0x002d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r4 = "CACHE: caching request with URL: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r4 = r8.values     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r3.append(r4)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            com.appsflyer.internal.AFc1tSDK r6 = r7.AFKeystoreWrapper     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            android.content.Context r6 = r6.AFInAppEventType     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r5.<init>(r6, r0)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4.<init>(r5, r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4.createNewFile()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r5 = 1
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4.<init>(r0, r5)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r0 = "version="
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r0 = r8.AFKeystoreWrapper     // Catch:{ Exception -> 0x00cc }
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
            r0 = 10
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r5 = "url="
            r4.write(r5)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r5 = r8.values     // Catch:{ Exception -> 0x00cc }
            r4.write(r5)     // Catch:{ Exception -> 0x00cc }
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r5 = "data="
            r4.write(r5)     // Catch:{ Exception -> 0x00cc }
            byte[] r5 = r8.AFInAppEventParameterName()     // Catch:{ Exception -> 0x00cc }
            r6 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)     // Catch:{ Exception -> 0x00cc }
            r4.write(r5)     // Catch:{ Exception -> 0x00cc }
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
            com.appsflyer.internal.AFd1kSDK r8 = r8.AFInAppEventType     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00b3
            java.lang.String r5 = "type="
            r4.write(r5)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r8 = r8.name()     // Catch:{ Exception -> 0x00cc }
            r4.write(r8)     // Catch:{ Exception -> 0x00cc }
            r4.write(r0)     // Catch:{ Exception -> 0x00cc }
        L_0x00b3:
            r4.flush()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r8 = "CACHE: done, cacheKey: "
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r8 = r8.concat(r0)     // Catch:{ Exception -> 0x00cc }
            com.appsflyer.AFLogger.afInfoLog(r8)     // Catch:{ Exception -> 0x00cc }
            r4.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r8 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r1, r8)
        L_0x00cb:
            return r3
        L_0x00cc:
            r8 = move-exception
            goto L_0x00d2
        L_0x00ce:
            r8 = move-exception
            goto L_0x00e4
        L_0x00d0:
            r8 = move-exception
            r4 = r2
        L_0x00d2:
            java.lang.String r0 = "CACHE: Could not cache request"
            com.appsflyer.AFLogger.afErrorLog(r0, r8)     // Catch:{ all -> 0x00e2 }
            if (r4 == 0) goto L_0x00e1
            r4.close()     // Catch:{ IOException -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r8 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r1, r8)
        L_0x00e1:
            return r2
        L_0x00e2:
            r8 = move-exception
            r2 = r4
        L_0x00e4:
            if (r2 == 0) goto L_0x00ee
            r2.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r1, r0)
        L_0x00ee:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1ySDK.AFInAppEventType(com.appsflyer.internal.AFb1wSDK):java.lang.String");
    }

    public final boolean AFInAppEventParameterName(String str) {
        File file = new File(new File(this.AFKeystoreWrapper.AFInAppEventType.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e);
            return false;
        }
    }

    public final void AFInAppEventParameterName() {
        try {
            File file = new File(this.AFKeystoreWrapper.AFInAppEventType.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                    sb2.append(file2.getName());
                    sb2.append(" from cache");
                    AFLogger.afInfoLog(sb2.toString());
                    file2.delete();
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}
