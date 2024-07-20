package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;

public final class AFe1pSDK extends AFd1jSDK<AFe1rSDK> {
    public final AFe1qSDK AFLogger;
    private final AFe1lSDK AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    public AFf1eSDK afDebugLog;
    public AFe1rSDK afErrorLog = null;
    private final AFc1hSDK afErrorLogForExcManagerOnly;
    private final AFc1vSDK afInfoLog;
    private final AFe1mSDK afRDLog;
    private final AFe1hSDK afWarnLog;
    private final AFe1kSDK getLevel;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final long AFInAppEventType() {
        return 1500;
    }

    public AFe1pSDK(AFe1mSDK aFe1mSDK, AFc1vSDK aFc1vSDK, AFe1hSDK aFe1hSDK, AFe1kSDK aFe1kSDK, AFc1hSDK aFc1hSDK, AFe1lSDK aFe1lSDK, String str, AFe1qSDK aFe1qSDK) {
        super(AFd1kSDK.RC_CDN, new AFd1kSDK[0], "UpdateRemoteConfiguration");
        this.afRDLog = aFe1mSDK;
        this.afInfoLog = aFc1vSDK;
        this.afWarnLog = aFe1hSDK;
        this.getLevel = aFe1kSDK;
        this.afErrorLogForExcManagerOnly = aFc1hSDK;
        this.AFLogger$LogLevel = aFe1lSDK;
        this.AFVersionDeclaration = str;
        this.AFLogger = aFe1qSDK;
    }

    public final AFd1sSDK valueOf() throws Exception {
        try {
            AFe1rSDK afErrorLog2 = afErrorLog();
            this.afErrorLog = afErrorLog2;
            if (afErrorLog2 == AFe1rSDK.FAILURE) {
                return AFd1sSDK.FAILURE;
            }
            return AFd1sSDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.afErrorLog = AFe1rSDK.FAILURE;
            return AFd1sSDK.TIMEOUT;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054 A[SYNTHETIC, Splitter:B:12:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.appsflyer.internal.AFe1rSDK afErrorLog() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            r16 = this;
            r10 = r16
            java.lang.String r0 = " seconds"
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r10.AFVersionDeclaration
            com.appsflyer.internal.AFe1hSDK r2 = r10.afWarnLog
            java.lang.String r2 = r2.valueOf
            r3 = 2
            java.lang.String r4 = "CFG: Dev key is not set, SDK is not started."
            r12 = 1
            r13 = 0
            if (r2 == 0) goto L_0x0046
            java.lang.String r5 = r2.trim()
            int r5 = r5.length()
            if (r5 == 0) goto L_0x0046
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "CFG: Can't create CDN token, domain or version is not provided."
            com.appsflyer.AFLogger.afWarnLog(r1)
            goto L_0x0049
        L_0x0027:
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "appsflyersdk.com"
            r5[r13] = r6
            r5[r12] = r1
            com.appsflyer.internal.AFc1vSDK r1 = r10.afInfoLog
            com.appsflyer.internal.AFc1tSDK r1 = r1.AFInAppEventParameterName
            android.content.Context r1 = r1.AFInAppEventType
            java.lang.String r1 = r1.getPackageName()
            r5[r3] = r1
            java.lang.String r1 = com.appsflyer.internal.AFa1aSDK.AFInAppEventType((java.lang.String[]) r5)
            java.lang.String r1 = com.appsflyer.internal.AFa1aSDK.valueOf(r1, r2)
            r14 = r1
            goto L_0x004a
        L_0x0046:
            com.appsflyer.AFLogger.afWarnLog(r4)
        L_0x0049:
            r14 = 0
        L_0x004a:
            if (r14 != 0) goto L_0x0054
            java.lang.String r0 = "CFG: can't create CDN token, skipping fetch config"
            com.appsflyer.AFLogger.afRDLog(r0)
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE
            return r0
        L_0x0054:
            com.appsflyer.internal.AFe1lSDK r1 = r10.AFLogger$LogLevel     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            boolean r1 = r1.AFKeystoreWrapper()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            if (r1 == 0) goto L_0x0154
            java.lang.String r1 = "CFG: Cached config is expired, updating..."
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1lSDK r1 = r10.AFLogger$LogLevel     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            boolean r1 = r1.values()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1lSDK r2 = r10.AFLogger$LogLevel     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            boolean r2 = r2.AFInAppEventType()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFc1hSDK r5 = r10.afErrorLogForExcManagerOnly     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r6 = 1500(0x5dc, float:2.102E-42)
            com.appsflyer.internal.AFc1eSDK r1 = r5.AFInAppEventType((boolean) r1, (boolean) r2, (java.lang.String) r14, (int) r6)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFd1tSDK r15 = r1.valueOf()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            boolean r1 = r15.isSuccessful()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            if (r1 == 0) goto L_0x0132
            java.lang.Object r1 = r15.getBody()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFf1gSDK r1 = (com.appsflyer.internal.AFf1gSDK) r1     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r2 = "x-amz-meta-af-auth-v1"
            java.lang.String r2 = r15.AFInAppEventParameterName(r2)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r5 = "CF-Cache-Status"
            java.lang.String r6 = r15.AFInAppEventParameterName(r5)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1hSDK r5 = r10.afWarnLog     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r5 = r5.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            if (r5 == 0) goto L_0x012c
            java.lang.String r7 = r5.trim()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            int r7 = r7.length()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            if (r7 != 0) goto L_0x00a3
            goto L_0x012c
        L_0x00a3:
            com.appsflyer.internal.AFe1mSDK r4 = r10.afRDLog     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFf1dSDK r2 = r4.AFKeystoreWrapper(r1, r2, r14, r5)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            boolean r4 = r2.values()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            if (r4 == 0) goto L_0x011a
            com.appsflyer.internal.AFe1lSDK r4 = r10.AFLogger$LogLevel     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            long r4 = r4.valueOf()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r11 = "CFG: using max-age fallback: "
            r7.<init>(r11)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r7.append(r4)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r7.append(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.AFLogger.afRDLog(r7)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1kSDK r7 = r10.getLevel     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r11 = r1.AFInAppEventType     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            byte[] r3 = r11.getBytes(r3)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r11 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r11)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFb1aSDK r11 = r7.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r10 = "af_remote_config"
            r11.AFKeystoreWrapper(r10, r3)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFb1aSDK r3 = r7.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r10 = "af_rc_timestamp"
            r3.AFInAppEventType((java.lang.String) r10, (long) r12)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFb1aSDK r3 = r7.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r10 = "af_rc_max_age"
            r3.AFInAppEventType((java.lang.String) r10, (long) r4)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r7.AFInAppEventParameterName = r1     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r7.AFInAppEventType = r12     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r7.values = r4     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r3 = "CFG: Config successfully updated, timeToLive: "
            r1.<init>(r3)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r1.append(r4)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r1.append(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFf1fSDK r5 = r2.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r1 = r16
            r2 = r14
            r3 = r8
            r7 = r15
            r1.AFInAppEventParameterName(r2, r3, r5, r6, r7)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.SUCCESS     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            return r0
        L_0x011a:
            com.appsflyer.internal.AFf1fSDK r5 = r2.valueOf     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r1 = r16
            r2 = r14
            r3 = r8
            r7 = r15
            r1.AFInAppEventParameterName(r2, r3, r5, r6, r7)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r0 = "CFG: fetched config is not valid (MITM?) refuse to use it."
            com.appsflyer.AFLogger.afWarnLog(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            return r0
        L_0x012c:
            com.appsflyer.AFLogger.afWarnLog(r4)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            return r0
        L_0x0132:
            r5 = 0
            r6 = 0
            r1 = r16
            r2 = r14
            r3 = r8
            r7 = r15
            r1.AFInAppEventParameterName(r2, r3, r5, r6, r7)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r1 = "CFG: failed to fetch remote config from CDN with status code: "
            r0.<init>(r1)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            int r1 = r15.getStatusCode()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            r0.append(r1)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.AFLogger.afWarnLog(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            return r0
        L_0x0154:
            java.lang.String r0 = "CFG: active config is valid, skipping fetch"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.USE_CACHED     // Catch:{ IOException -> 0x0193, all -> 0x015c }
            return r0
        L_0x015c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CFG: failed to update remote config: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r3 = 0
            com.appsflyer.AFLogger.afErrorLog(r1, r0, r2, r3, r3)
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r1 = r16
            r2 = r14
            r3 = r8
            r8 = r10
            r9 = r0
            r1.AFInAppEventParameterName(r2, r3, r5, r6, r7, r8, r9)
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.InterruptedException
            if (r1 != 0) goto L_0x018c
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE
            return r0
        L_0x018c:
            java.lang.Throwable r0 = r0.getCause()
            java.lang.InterruptedException r0 = (java.lang.InterruptedException) r0
            throw r0
        L_0x0193:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CFG: failed to fetch remote config: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r3 = 0
            com.appsflyer.AFLogger.afErrorLog(r1, r0, r2, r3, r3)
            boolean r1 = r0 instanceof com.appsflyer.internal.components.network.http.exceptions.ParsingException
            if (r1 == 0) goto L_0x01b8
            r1 = r0
            com.appsflyer.internal.components.network.http.exceptions.ParsingException r1 = (com.appsflyer.internal.components.network.http.exceptions.ParsingException) r1
            com.appsflyer.internal.AFd1tSDK r1 = r1.getRawResponse()
            r5 = r1
            goto L_0x01b9
        L_0x01b8:
            r5 = 0
        L_0x01b9:
            r6 = 0
            r7 = 0
            r10 = 0
            r1 = r16
            r2 = r14
            r3 = r8
            r8 = r10
            r9 = r0
            r1.AFInAppEventParameterName(r2, r3, r5, r6, r7, r8, r9)
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.io.InterruptedIOException
            if (r1 != 0) goto L_0x01d0
            com.appsflyer.internal.AFe1rSDK r0 = com.appsflyer.internal.AFe1rSDK.FAILURE
            return r0
        L_0x01d0:
            java.lang.Throwable r0 = r0.getCause()
            java.io.InterruptedIOException r0 = (java.io.InterruptedIOException) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1pSDK.afErrorLog():com.appsflyer.internal.AFe1rSDK");
    }

    private void AFInAppEventParameterName(String str, long j, AFf1fSDK aFf1fSDK, String str2, AFd1tSDK<AFf1gSDK> aFd1tSDK) {
        AFInAppEventParameterName(str, j, aFd1tSDK, aFd1tSDK != null ? aFd1tSDK.getBody() : null, aFf1fSDK, str2 == null ? null : str2, (Throwable) null);
    }

    private void AFInAppEventParameterName(String str, long j, AFd1tSDK<?> aFd1tSDK, AFf1gSDK aFf1gSDK, AFf1fSDK aFf1fSDK, String str2, Throwable th) {
        int i;
        long j2;
        Throwable th2;
        long j3;
        String str3;
        AFd1tSDK<?> aFd1tSDK2 = aFd1tSDK;
        AFf1gSDK aFf1gSDK2 = aFf1gSDK;
        Throwable th3 = th;
        if (aFd1tSDK2 != null) {
            j2 = aFd1tSDK2.AFInAppEventType.valueOf;
            i = aFd1tSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        if (th3 instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th3).getMetrics().valueOf;
        } else {
            th2 = th3;
            j3 = j2;
        }
        if (aFf1gSDK2 != null) {
            str3 = aFf1gSDK2.values;
        } else {
            str3 = null;
        }
        this.afDebugLog = new AFf1eSDK(str3, str, j3, System.currentTimeMillis() - j, i, aFf1fSDK, str2, th2);
    }
}
