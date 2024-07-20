package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1iSDK {
    public static final AFa1wSDK AFa1wSDK = new AFa1wSDK((DefaultConstructorMarker) null);
    public static String values = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    public byte[] AFInAppEventType;
    public Map<String, String> AFKeystoreWrapper;
    public int valueOf;

    public AFc1iSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = map;
        this.valueOf = i;
    }

    public static final class AFa1wSDK {
        public /* synthetic */ AFa1wSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1wSDK() {
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.net.HttpURLConnection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01dc, code lost:
        if (r9 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean valueOf() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "\n\ttook "
            java.lang.String r3 = "[Exception Manager]: "
            java.lang.String r4 = "] "
            java.lang.String r5 = "HTTP: ["
            java.lang.String r6 = ""
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 0
            r10 = 0
            java.lang.String r0 = values     // Catch:{ all -> 0x025a }
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x025a }
            com.appsflyer.AppsFlyerLib r12 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ all -> 0x025a }
            java.lang.String r12 = r12.getHostPrefix()     // Catch:{ all -> 0x025a }
            r11[r10] = r12     // Catch:{ all -> 0x025a }
            com.appsflyer.internal.AFa1dSDK r12 = com.appsflyer.internal.AFa1dSDK.valueOf()     // Catch:{ all -> 0x025a }
            java.lang.String r12 = r12.getHostName()     // Catch:{ all -> 0x025a }
            r13 = 1
            r11[r13] = r12     // Catch:{ all -> 0x025a }
            java.lang.String r0 = java.lang.String.format(r0, r11)     // Catch:{ all -> 0x025a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)     // Catch:{ all -> 0x025a }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch:{ all -> 0x025a }
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x025a }
            r11.<init>(r0)     // Catch:{ all -> 0x025a }
            java.net.URLConnection r0 = r11.openConnection()     // Catch:{ all -> 0x025a }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ all -> 0x025a }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ all -> 0x025a }
            if (r0 == 0) goto L_0x0252
            r11 = r0
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x025a }
            java.lang.String r0 = "POST"
            r11.setRequestMethod(r0)     // Catch:{ all -> 0x024f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            r12.<init>()     // Catch:{ all -> 0x024f }
            java.lang.String r14 = r11.getRequestMethod()     // Catch:{ all -> 0x024f }
            r12.append(r14)     // Catch:{ all -> 0x024f }
            r14 = 58
            r12.append(r14)     // Catch:{ all -> 0x024f }
            java.net.URL r14 = r11.getURL()     // Catch:{ all -> 0x024f }
            r12.append(r14)     // Catch:{ all -> 0x024f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x024f }
            r0.<init>(r12)     // Catch:{ all -> 0x024f }
            java.lang.String r12 = "\n length: "
            r0.append(r12)     // Catch:{ all -> 0x024f }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x024f }
            byte[] r14 = r1.AFInAppEventType     // Catch:{ all -> 0x024f }
            java.nio.charset.Charset r15 = o.cancelAuthentication.onTransact     // Catch:{ all -> 0x024f }
            r12.<init>(r14, r15)     // Catch:{ all -> 0x024f }
            int r12 = r12.length()     // Catch:{ all -> 0x024f }
            r0.append(r12)     // Catch:{ all -> 0x024f }
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x024f }
            if (r12 == 0) goto L_0x00ba
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x024f }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x024f }
        L_0x0091:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x024f }
            if (r14 == 0) goto L_0x00ba
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x024f }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x024f }
            java.lang.String r15 = "\n "
            r0.append(r15)     // Catch:{ all -> 0x024f }
            java.lang.Object r15 = r14.getKey()     // Catch:{ all -> 0x024f }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x024f }
            r0.append(r15)     // Catch:{ all -> 0x024f }
            java.lang.String r15 = ": "
            r0.append(r15)     // Catch:{ all -> 0x024f }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x024f }
            r0.append(r14)     // Catch:{ all -> 0x024f }
            goto L_0x0091
        L_0x00ba:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            r12.<init>(r5)     // Catch:{ all -> 0x024f }
            int r14 = r11.hashCode()     // Catch:{ all -> 0x024f }
            r12.append(r14)     // Catch:{ all -> 0x024f }
            r12.append(r4)     // Catch:{ all -> 0x024f }
            r12.append(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x024f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x024f }
            com.appsflyer.AFLogger.afRDLog(r0)     // Catch:{ all -> 0x024f }
            r11.setInstanceFollowRedirects(r10)     // Catch:{ all -> 0x024f }
            r11.setUseCaches(r10)     // Catch:{ all -> 0x024f }
            int r0 = r1.valueOf     // Catch:{ all -> 0x024f }
            r11.setReadTimeout(r0)     // Catch:{ all -> 0x024f }
            int r0 = r1.valueOf     // Catch:{ all -> 0x024f }
            r11.setConnectTimeout(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = "Content-Type"
            java.lang.String r12 = "application/json"
            r11.addRequestProperty(r0, r12)     // Catch:{ all -> 0x024f }
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x011d
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x024f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x024f }
        L_0x0101:
            boolean r12 = r0.hasNext()     // Catch:{ all -> 0x024f }
            if (r12 == 0) goto L_0x011d
            java.lang.Object r12 = r0.next()     // Catch:{ all -> 0x024f }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x024f }
            java.lang.Object r14 = r12.getKey()     // Catch:{ all -> 0x024f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x024f }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x024f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x024f }
            r11.addRequestProperty(r14, r12)     // Catch:{ all -> 0x024f }
            goto L_0x0101
        L_0x011d:
            r11.setDoOutput(r13)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = "Content-Length"
            byte[] r12 = r1.AFInAppEventType     // Catch:{ all -> 0x024f }
            int r12 = r12.length     // Catch:{ all -> 0x024f }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x024f }
            r11.setRequestProperty(r0, r12)     // Catch:{ all -> 0x024f }
            java.io.OutputStream r0 = r11.getOutputStream()     // Catch:{ all -> 0x024d }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)     // Catch:{ all -> 0x024d }
            boolean r12 = r0 instanceof java.io.BufferedOutputStream     // Catch:{ all -> 0x024d }
            r13 = 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x013c
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0     // Catch:{ all -> 0x024d }
            goto L_0x0142
        L_0x013c:
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x024d }
            r12.<init>(r0, r13)     // Catch:{ all -> 0x024d }
            r0 = r12
        L_0x0142:
            byte[] r12 = r1.AFInAppEventType     // Catch:{ all -> 0x024d }
            r0.write(r12)     // Catch:{ all -> 0x024d }
            r0.close()     // Catch:{ all -> 0x024f }
            boolean r0 = com.appsflyer.internal.AFc1kSDK.valueOf((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x0155
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ all -> 0x024f }
            goto L_0x0159
        L_0x0155:
            java.io.InputStream r0 = r11.getErrorStream()     // Catch:{ all -> 0x024f }
        L_0x0159:
            if (r0 == 0) goto L_0x01e8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)     // Catch:{ all -> 0x024f }
            java.nio.charset.Charset r12 = o.cancelAuthentication.onTransact     // Catch:{ all -> 0x024f }
            java.io.InputStreamReader r14 = new java.io.InputStreamReader     // Catch:{ all -> 0x024f }
            r14.<init>(r0, r12)     // Catch:{ all -> 0x024f }
            java.io.Reader r14 = (java.io.Reader) r14     // Catch:{ all -> 0x024f }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x024f }
            r0.<init>(r14, r13)     // Catch:{ all -> 0x024f }
            r12 = r0
            java.io.Reader r12 = (java.io.Reader) r12     // Catch:{ all -> 0x024f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)     // Catch:{ all -> 0x024f }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x024f }
            r14.<init>()     // Catch:{ all -> 0x024f }
            o.isLayoutRtl$onTransact r15 = new o.isLayoutRtl$onTransact     // Catch:{ all -> 0x024f }
            r15.<init>(r14)     // Catch:{ all -> 0x024f }
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15     // Catch:{ all -> 0x024f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)     // Catch:{ all -> 0x024f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r6)     // Catch:{ all -> 0x024f }
            boolean r10 = r12 instanceof java.io.BufferedReader     // Catch:{ all -> 0x024f }
            if (r10 == 0) goto L_0x018b
            java.io.BufferedReader r12 = (java.io.BufferedReader) r12     // Catch:{ all -> 0x024f }
            goto L_0x0191
        L_0x018b:
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ all -> 0x024f }
            r10.<init>(r12, r13)     // Catch:{ all -> 0x024f }
            r12 = r10
        L_0x0191:
            java.io.Closeable r12 = (java.io.Closeable) r12     // Catch:{ all -> 0x024f }
            r10 = r12
            java.io.BufferedReader r10 = (java.io.BufferedReader) r10     // Catch:{ all -> 0x01df }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)     // Catch:{ all -> 0x01df }
            o.ViewUtils r13 = new o.ViewUtils     // Catch:{ all -> 0x01df }
            r13.<init>(r10)     // Catch:{ all -> 0x01df }
            kotlin.sequences.Sequence r13 = (kotlin.sequences.Sequence) r13     // Catch:{ all -> 0x01df }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r6)     // Catch:{ all -> 0x01df }
            o.connectViewModel r10 = new o.connectViewModel     // Catch:{ all -> 0x01df }
            r10.<init>(r13)     // Catch:{ all -> 0x01df }
            kotlin.sequences.Sequence r10 = (kotlin.sequences.Sequence) r10     // Catch:{ all -> 0x01df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x01df }
        L_0x01ae:
            boolean r13 = r10.hasNext()     // Catch:{ all -> 0x01df }
            if (r13 == 0) goto L_0x01bc
            java.lang.Object r13 = r10.next()     // Catch:{ all -> 0x01df }
            r15.invoke(r13)     // Catch:{ all -> 0x01df }
            goto L_0x01ae
        L_0x01bc:
            kotlin.Unit r10 = kotlin.Unit.asInterface     // Catch:{ all -> 0x01df }
            o.setOnBackInvokedDispatcher.asInterface((java.io.Closeable) r12, (java.lang.Throwable) r9)     // Catch:{ all -> 0x024f }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x024f }
            r16 = r14
            java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x024f }
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 63
            java.lang.String r9 = o.Toolbar.ExpandedActionViewMenuPresenter.asInterface(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x024f }
            r0.close()     // Catch:{ all -> 0x024f }
            if (r9 != 0) goto L_0x01e9
            goto L_0x01e8
        L_0x01df:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r10 = r0
            o.setOnBackInvokedDispatcher.asInterface((java.io.Closeable) r12, (java.lang.Throwable) r9)     // Catch:{ all -> 0x024f }
            throw r10     // Catch:{ all -> 0x024f }
        L_0x01e8:
            r9 = r6
        L_0x01e9:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            java.lang.String r10 = "response code:"
            r0.<init>(r10)     // Catch:{ all -> 0x024f }
            int r10 = r11.getResponseCode()     // Catch:{ all -> 0x024f }
            r0.append(r10)     // Catch:{ all -> 0x024f }
            r10 = 32
            r0.append(r10)     // Catch:{ all -> 0x024f }
            java.lang.String r10 = r11.getResponseMessage()     // Catch:{ all -> 0x024f }
            r0.append(r10)     // Catch:{ all -> 0x024f }
            java.lang.String r10 = "\n\tbody:"
            r0.append(r10)     // Catch:{ all -> 0x024f }
            r0.append(r9)     // Catch:{ all -> 0x024f }
            r0.append(r2)     // Catch:{ all -> 0x024f }
            long r12 = r12 - r7
            r0.append(r12)     // Catch:{ all -> 0x024f }
            java.lang.String r9 = "ms"
            r0.append(r9)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x024f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            r9.<init>(r5)     // Catch:{ all -> 0x024f }
            int r10 = r11.hashCode()     // Catch:{ all -> 0x024f }
            r9.append(r10)     // Catch:{ all -> 0x024f }
            r9.append(r4)     // Catch:{ all -> 0x024f }
            r9.append(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x024f }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x024f }
            com.appsflyer.AFLogger.afRDLog(r0)     // Catch:{ all -> 0x024f }
            boolean r10 = com.appsflyer.internal.AFc1kSDK.valueOf((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x024f }
            if (r11 == 0) goto L_0x02ae
            r11.disconnect()
            goto L_0x02ae
        L_0x024d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x024f }
        L_0x024f:
            r0 = move-exception
            r9 = r11
            goto L_0x025b
        L_0x0252:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x025a }
            java.lang.String r10 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r0.<init>(r10)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
        L_0x025b:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            java.lang.String r13 = "error: "
            r12.<init>(r13)     // Catch:{ all -> 0x02af }
            r12.append(r0)     // Catch:{ all -> 0x02af }
            r12.append(r2)     // Catch:{ all -> 0x02af }
            long r10 = r10 - r7
            r12.append(r10)     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "ms\n\t"
            r12.append(r2)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02af }
            r12.append(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            r2.<init>(r5)     // Catch:{ all -> 0x02af }
            if (r9 == 0) goto L_0x028c
            int r5 = r9.hashCode()     // Catch:{ all -> 0x02af }
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            r2.append(r5)     // Catch:{ all -> 0x02af }
            r2.append(r4)     // Catch:{ all -> 0x02af }
            r2.append(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02af }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x02af }
            com.appsflyer.AFLogger.afRDLog(r0)     // Catch:{ all -> 0x02af }
            if (r9 == 0) goto L_0x02ad
            r9.disconnect()
        L_0x02ad:
            r10 = 0
        L_0x02ae:
            return r10
        L_0x02af:
            r0 = move-exception
            if (r9 == 0) goto L_0x02b5
            r9.disconnect()
        L_0x02b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1iSDK.valueOf():boolean");
    }
}
