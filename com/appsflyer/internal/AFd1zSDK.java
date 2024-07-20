package com.appsflyer.internal;

public final class AFd1zSDK {
    private final int values;

    public AFd1zSDK(int i) {
        this.values = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0146 A[Catch:{ Exception -> 0x01dc, all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.AFd1tSDK<java.lang.String> AFInAppEventParameterName(com.appsflyer.internal.AFd1vSDK r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r2 = "ms"
            java.lang.String r3 = "\n took "
            java.lang.String r4 = "] "
            java.lang.String r5 = "HTTP: ["
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 0
            byte[] r0 = r21.values()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.<init>()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r12 = r1.values     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r12 = r1.valueOf     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            byte[] r11 = r21.values()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            if (r11 == 0) goto L_0x0051
            boolean r12 = r21.AFInAppEventType()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            if (r12 == 0) goto L_0x003f
            java.lang.String r11 = "<encrypted>"
            goto L_0x0049
        L_0x003f:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.nio.charset.Charset r13 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r12.<init>(r11, r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11 = r12
        L_0x0049:
            java.lang.String r12 = "\n payload: "
            r10.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r10.append(r11)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
        L_0x0051:
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.AFInAppEventType     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
        L_0x005b:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            if (r12 == 0) goto L_0x008e
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r13 = "\n "
            r10.append(r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r10.append(r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r13 = ": "
            r10.append(r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r10.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            goto L_0x005b
        L_0x0084:
            r9 = 0
            r11 = r20
            goto L_0x0232
        L_0x0089:
            r9 = 0
            r11 = r20
            goto L_0x01ee
        L_0x008e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.<init>(r5)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            int r12 = r21.hashCode()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.append(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.append(r4)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r11.append(r10)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            com.appsflyer.AFLogger.afDebugLog(r10)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.net.URL r10 = new java.net.URL     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r11 = r1.valueOf     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.net.URLConnection r10 = r10.openConnection()     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.Object r10 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r10)     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.net.URLConnection r10 = (java.net.URLConnection) r10     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Exception -> 0x01eb, all -> 0x01e8 }
            java.lang.String r11 = r1.values     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
            r10.setRequestMethod(r11)     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
            boolean r11 = r21.valueOf()     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
            if (r11 == 0) goto L_0x00c8
            r10.setUseCaches(r8)     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
        L_0x00c8:
            boolean r11 = r21.AFKeystoreWrapper()     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
            if (r11 != 0) goto L_0x00d1
            r10.setInstanceFollowRedirects(r8)     // Catch:{ Exception -> 0x01e3, all -> 0x01de }
        L_0x00d1:
            r11 = r20
            int r12 = r11.values     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r13 = r1.afRDLog     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r14 = -1
            if (r13 == r14) goto L_0x00db
            r12 = r13
        L_0x00db:
            r10.setConnectTimeout(r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r10.setReadTimeout(r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            boolean r12 = r21.AFInAppEventType()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            if (r12 == 0) goto L_0x00ea
            java.lang.String r12 = "application/octet-stream"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r12 = "application/json"
        L_0x00ec:
            java.lang.String r13 = "Content-Type"
            r10.addRequestProperty(r13, r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.AFInAppEventType     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.Set r12 = r12.entrySet()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
        L_0x00fb:
            boolean r13 = r12.hasNext()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            if (r13 == 0) goto L_0x0117
            java.lang.Object r13 = r12.next()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.Object r14 = r13.getKey()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r10.setRequestProperty(r14, r13)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            goto L_0x00fb
        L_0x0117:
            r12 = 1
            if (r0 == 0) goto L_0x014a
            r10.setDoOutput(r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.<init>()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r14 = r0.length     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = "Content-Length"
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r10.setRequestProperty(r14, r13)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0142 }
            java.io.OutputStream r14 = r10.getOutputStream()     // Catch:{ all -> 0x0142 }
            r13.<init>(r14)     // Catch:{ all -> 0x0142 }
            r13.write(r0)     // Catch:{ all -> 0x013f }
            r13.close()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            goto L_0x014a
        L_0x013f:
            r0 = move-exception
            r9 = r13
            goto L_0x0144
        L_0x0142:
            r0 = move-exception
            r9 = 0
        L_0x0144:
            if (r9 == 0) goto L_0x0149
            r9.close()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
        L_0x0149:
            throw r0     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
        L_0x014a:
            int r0 = r10.getResponseCode()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r0 = r0 / 100
            r13 = 2
            if (r0 != r13) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r12 = 0
        L_0x0155:
            boolean r0 = r21.AFInAppEventParameterName()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = AFKeystoreWrapper(r10, r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            goto L_0x0162
        L_0x0160:
            java.lang.String r0 = ""
        L_0x0162:
            r15 = r0
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            com.appsflyer.internal.AFd1ySDK r0 = new com.appsflyer.internal.AFd1ySDK     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            long r13 = r13 - r6
            r0.<init>(r13)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = "response code:"
            r13.<init>(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r14 = r10.getResponseCode()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = " "
            r13.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = r10.getResponseMessage()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r14 = "\n body:"
            r13.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r15)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r3)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            long r8 = r0.valueOf     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r13.append(r2)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r8 = r13.toString()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r9.<init>(r5)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r13 = r21.hashCode()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r9.append(r13)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r9.append(r4)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r9.append(r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            com.appsflyer.AFLogger.afDebugLog(r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            java.util.Map r9 = r10.getHeaderFields()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r8.<init>(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r9 = 0
            r8.remove(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            com.appsflyer.internal.AFd1tSDK r9 = new com.appsflyer.internal.AFd1tSDK     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            int r16 = r10.getResponseCode()     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            r14 = r9
            r17 = r12
            r18 = r8
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01dc, all -> 0x01da }
            if (r10 == 0) goto L_0x01d9
            r10.disconnect()
        L_0x01d9:
            return r9
        L_0x01da:
            r0 = move-exception
            goto L_0x01e1
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e6
        L_0x01de:
            r0 = move-exception
            r11 = r20
        L_0x01e1:
            r9 = r10
            goto L_0x0232
        L_0x01e3:
            r0 = move-exception
            r11 = r20
        L_0x01e6:
            r9 = r10
            goto L_0x01ee
        L_0x01e8:
            r0 = move-exception
            goto L_0x0084
        L_0x01eb:
            r0 = move-exception
            goto L_0x0089
        L_0x01ee:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0231 }
            com.appsflyer.internal.AFd1ySDK r8 = new com.appsflyer.internal.AFd1ySDK     // Catch:{ all -> 0x0231 }
            long r12 = r12 - r6
            r8.<init>(r12)     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            java.lang.String r7 = "error: "
            r6.<init>(r7)     // Catch:{ all -> 0x0231 }
            r6.append(r0)     // Catch:{ all -> 0x0231 }
            r6.append(r3)     // Catch:{ all -> 0x0231 }
            long r12 = r8.valueOf     // Catch:{ all -> 0x0231 }
            r6.append(r12)     // Catch:{ all -> 0x0231 }
            r6.append(r2)     // Catch:{ all -> 0x0231 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0231 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0231 }
            r3.<init>(r5)     // Catch:{ all -> 0x0231 }
            int r1 = r21.hashCode()     // Catch:{ all -> 0x0231 }
            r3.append(r1)     // Catch:{ all -> 0x0231 }
            r3.append(r4)     // Catch:{ all -> 0x0231 }
            r3.append(r2)     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0231 }
            r2 = 0
            com.appsflyer.AFLogger.afErrorLog(r1, r0, r2, r2)     // Catch:{ all -> 0x0231 }
            com.appsflyer.internal.components.network.http.exceptions.HttpException r1 = new com.appsflyer.internal.components.network.http.exceptions.HttpException     // Catch:{ all -> 0x0231 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0231 }
            throw r1     // Catch:{ all -> 0x0231 }
        L_0x0231:
            r0 = move-exception
        L_0x0232:
            if (r9 == 0) goto L_0x0237
            r9.disconnect()
        L_0x0237:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1zSDK.AFInAppEventParameterName(com.appsflyer.internal.AFd1vSDK):com.appsflyer.internal.AFd1tSDK");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.net.HttpURLConnection r3, boolean r4) throws java.io.IOException {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0008
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ all -> 0x0049 }
            goto L_0x000c
        L_0x0008:
            java.io.InputStream r3 = r3.getErrorStream()     // Catch:{ all -> 0x0049 }
        L_0x000c:
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = ""
            return r3
        L_0x0011:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0049 }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x0049 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0049 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            r3.<init>(r1)     // Catch:{ all -> 0x0044 }
            r0 = 1
        L_0x0025:
            java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0037
            if (r0 != 0) goto L_0x0032
            r0 = 10
            r4.append(r0)     // Catch:{ all -> 0x0042 }
        L_0x0032:
            r4.append(r2)     // Catch:{ all -> 0x0042 }
            r0 = 0
            goto L_0x0025
        L_0x0037:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0042 }
            r1.close()
            r3.close()
            return r4
        L_0x0042:
            r4 = move-exception
            goto L_0x0047
        L_0x0044:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x0047:
            r0 = r1
            goto L_0x004c
        L_0x0049:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            r0.close()
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            r3.close()
        L_0x0056:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1zSDK.AFKeystoreWrapper(java.net.HttpURLConnection, boolean):java.lang.String");
    }
}
