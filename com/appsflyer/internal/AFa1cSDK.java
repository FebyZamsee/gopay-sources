package com.appsflyer.internal;

@Deprecated
public final class AFa1cSDK {
    private final AFf1sSDK AFInAppEventParameterName;
    private final AFb1uSDK values;

    public AFa1cSDK(AFf1sSDK aFf1sSDK, AFb1uSDK aFb1uSDK) {
        this.AFInAppEventParameterName = aFf1sSDK;
        this.values = aFb1uSDK;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection AFKeystoreWrapper(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = ""
            com.appsflyer.internal.AFf1sSDK r0 = r1.AFInAppEventParameterName
            java.lang.String r3 = r0.afErrorLog
            com.appsflyer.internal.AFf1sSDK r0 = r1.AFInAppEventParameterName
            java.util.Map r0 = r0.AFInAppEventType()
            org.json.JSONObject r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName(r0)
            java.lang.String r0 = r0.toString()
            com.appsflyer.internal.AFf1sSDK r4 = r1.AFInAppEventParameterName
            boolean r4 = r4.afWarnLog()
            com.appsflyer.internal.AFf1sSDK r5 = r1.AFInAppEventParameterName
            boolean r5 = r5.AFLogger$LogLevel()
            com.appsflyer.internal.AFf1sSDK r6 = r1.AFInAppEventParameterName
            boolean r6 = r6.getLevel()
            com.appsflyer.internal.AFf1sSDK r7 = r1.AFInAppEventParameterName
            boolean r7 = r7.AFInAppEventParameterName()
            java.nio.charset.Charset r8 = java.nio.charset.Charset.defaultCharset()
            byte[] r8 = r0.getBytes(r8)
            r9 = 0
            if (r4 == 0) goto L_0x003a
            return r9
        L_0x003a:
            r4 = 0
            r10 = 1
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x019f }
            r11.<init>(r3)     // Catch:{ all -> 0x019f }
            if (r6 == 0) goto L_0x0084
            com.appsflyer.internal.AFb1uSDK r12 = r1.values     // Catch:{ all -> 0x019f }
            java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x019f }
            r12.valueOf(r13, r0)     // Catch:{ all -> 0x019f }
            java.nio.charset.Charset r12 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x019f }
            byte[] r12 = r0.getBytes(r12)     // Catch:{ all -> 0x019f }
            int r12 = r12.length     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            java.lang.String r14 = "call = "
            r13.<init>(r14)     // Catch:{ all -> 0x019f }
            r13.append(r11)     // Catch:{ all -> 0x019f }
            java.lang.String r14 = "; size = "
            r13.append(r14)     // Catch:{ all -> 0x019f }
            r13.append(r12)     // Catch:{ all -> 0x019f }
            java.lang.String r14 = " byte"
            r13.append(r14)     // Catch:{ all -> 0x019f }
            if (r12 <= r10) goto L_0x0071
            java.lang.String r12 = "s"
            goto L_0x0072
        L_0x0071:
            r12 = r2
        L_0x0072:
            r13.append(r12)     // Catch:{ all -> 0x019f }
            java.lang.String r12 = "; body = "
            r13.append(r12)     // Catch:{ all -> 0x019f }
            r13.append(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x019f }
            com.appsflyer.internal.AFb1tSDK.AFInAppEventParameterName(r0)     // Catch:{ all -> 0x019f }
        L_0x0084:
            java.lang.String r0 = "AppsFlyer"
            int r0 = r0.hashCode()     // Catch:{ all -> 0x019f }
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x019f }
            java.net.URLConnection r0 = r11.openConnection()     // Catch:{ all -> 0x019f }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ all -> 0x019f }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ all -> 0x019f }
            r12 = r0
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x019f }
            r0 = 30000(0x7530, float:4.2039E-41)
            r12.setReadTimeout(r0)     // Catch:{ all -> 0x019c }
            r12.setConnectTimeout(r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ all -> 0x019c }
            r12.setDoInput(r10)     // Catch:{ all -> 0x019c }
            r12.setDoOutput(r10)     // Catch:{ all -> 0x019c }
            if (r7 == 0) goto L_0x00b2
            java.lang.String r0 = "application/octet-stream"
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r0 = "application/json"
        L_0x00b4:
            java.lang.String r13 = "Content-Type"
            r12.setRequestProperty(r13, r0)     // Catch:{ all -> 0x019c }
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x019c }
            if (r7 == 0) goto L_0x0174
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x016b }
            r7[r4] = r20     // Catch:{ all -> 0x016b }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x016b }
            r14 = 598080568(0x23a5fc38, float:1.7996155E-17)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x016b }
            java.lang.Object r13 = r13.get(r15)     // Catch:{ all -> 0x016b }
            r15 = -1
            if (r13 != 0) goto L_0x010a
            long r17 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x016b }
            int r13 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            int r13 = r13 + 21945
            char r13 = (char) r13     // Catch:{ all -> 0x016b }
            r17 = 48
            char r17 = android.text.AndroidCharacter.getMirror(r17)     // Catch:{ all -> 0x016b }
            int r15 = 84 - r17
            float r16 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x016b }
            r17 = 0
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            int r9 = 37 - r16
            java.lang.Object r9 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r13, r15, r9)     // Catch:{ all -> 0x016b }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x016b }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x016b }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r13[r4] = r15     // Catch:{ all -> 0x016b }
            java.lang.String r15 = "values"
            java.lang.reflect.Method r13 = r9.getMethod(r15, r13)     // Catch:{ all -> 0x016b }
            java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x016b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x016b }
            r9.put(r14, r13)     // Catch:{ all -> 0x016b }
        L_0x010a:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch:{ all -> 0x016b }
            r9 = 0
            java.lang.Object r7 = r13.invoke(r9, r7)     // Catch:{ all -> 0x016b }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ all -> 0x0162 }
            r9[r4] = r8     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0162 }
            r13 = -495006491(0xffffffffe27ecce5, float:-1.1750593E21)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0162 }
            java.lang.Object r8 = r8.get(r14)     // Catch:{ all -> 0x0162 }
            if (r8 != 0) goto L_0x0158
            long r14 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x0162 }
            r16 = -1
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            int r8 = r8 + 21945
            char r8 = (char) r8     // Catch:{ all -> 0x0162 }
            int r14 = android.view.MotionEvent.axisFromString(r2)     // Catch:{ all -> 0x0162 }
            int r14 = r14 + 37
            int r15 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x0162 }
            int r15 = r15 >> 16
            int r15 = 37 - r15
            java.lang.Object r8 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r8, r14, r15)     // Catch:{ all -> 0x0162 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0162 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0162 }
            java.lang.Class<byte[]> r15 = byte[].class
            r14[r4] = r15     // Catch:{ all -> 0x0162 }
            java.lang.String r15 = "valueOf"
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r15, r14)     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0162 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0162 }
            r14.put(r13, r8)     // Catch:{ all -> 0x0162 }
        L_0x0158:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x0162 }
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ all -> 0x0162 }
            r8 = r7
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0162 }
            goto L_0x0174
        L_0x0162:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x016a
            throw r4     // Catch:{ all -> 0x019c }
        L_0x016a:
            throw r0     // Catch:{ all -> 0x019c }
        L_0x016b:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x0173
            throw r4     // Catch:{ all -> 0x019c }
        L_0x0173:
            throw r0     // Catch:{ all -> 0x019c }
        L_0x0174:
            r0.write(r8)     // Catch:{ all -> 0x019c }
            r0.close()     // Catch:{ all -> 0x019c }
            r12.connect()     // Catch:{ all -> 0x019c }
            int r0 = r12.getResponseCode()     // Catch:{ all -> 0x019c }
            if (r5 == 0) goto L_0x0187
            java.lang.String r2 = com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper((java.net.HttpURLConnection) r12)     // Catch:{ all -> 0x019c }
        L_0x0187:
            if (r6 == 0) goto L_0x0192
            com.appsflyer.internal.AFb1uSDK r5 = r1.values     // Catch:{ all -> 0x019c }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x019c }
            r5.AFInAppEventType(r6, r0, r2)     // Catch:{ all -> 0x019c }
        L_0x0192:
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x01ae
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x019c }
            goto L_0x01af
        L_0x019c:
            r0 = move-exception
            r9 = r12
            goto L_0x01a0
        L_0x019f:
            r0 = move-exception
        L_0x01a0:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.afErrorLog(r3, r0)
            r12 = r9
        L_0x01ae:
            r4 = 1
        L_0x01af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connection "
            r0.<init>(r3)
            if (r4 == 0) goto L_0x01bb
            java.lang.String r3 = "error"
            goto L_0x01bd
        L_0x01bb:
            java.lang.String r3 = "call succeeded"
        L_0x01bd:
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1cSDK.AFKeystoreWrapper(java.lang.String):java.net.HttpURLConnection");
    }
}
