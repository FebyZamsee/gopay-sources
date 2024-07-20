package com.appsflyer.internal;

import android.net.Uri;
import androidx.work.WorkRequest;
import com.appsflyer.AFLogger;

public final class AFd1dSDK extends AFd1jSDK<Boolean> {
    private static volatile boolean afDebugLog = false;
    private Boolean AFLogger;
    private final AFc1pSDK afErrorLog;
    private final AFd1mSDK afInfoLog;
    private final AFb1xSDK afRDLog;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final long AFInAppEventType() {
        return WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    }

    public AFd1dSDK(AFc1pSDK aFc1pSDK) {
        super(AFd1kSDK.LOAD_CACHE, new AFd1kSDK[0], "LoadCachedRequests");
        this.afRDLog = aFc1pSDK.onInstallConversionDataLoadedNative();
        this.afInfoLog = aFc1pSDK.getLevel();
        this.afErrorLog = aFc1pSDK;
    }

    public static boolean afDebugLog() {
        return afDebugLog;
    }

    public final AFd1sSDK valueOf() throws Exception {
        for (AFb1wSDK next : this.afRDLog.valueOf()) {
            StringBuilder sb = new StringBuilder("CACHE: resending request: ");
            sb.append(next.values);
            AFLogger.afInfoLog(sb.toString());
            try {
                AFf1rSDK aFf1rSDK = new AFf1rSDK(valueOf(next), next.AFInAppEventParameterName(), next.AFInAppEventParameterName, next.AFInAppEventType);
                AFd1mSDK aFd1mSDK = this.afInfoLog;
                aFd1mSDK.AFKeystoreWrapper.execute(new Runnable(new AFe1vSDK(aFf1rSDK, this.afErrorLog)) {
                    private /* synthetic */ AFd1jSDK AFInAppEventType;

                    {
                        this.AFInAppEventType = r2;
                    }

                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r6 = this;
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r0 = r0.afInfoLog
                            monitor-enter(r0)
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.Set<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afDebugLog     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                            if (r1 == 0) goto L_0x0026
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                            java.lang.String r2 = "QUEUE: tried to add already running task: "
                            r1.<init>(r2)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r1.append(r2)     // Catch:{ all -> 0x0193 }
                            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0193 }
                            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0193 }
                            monitor-exit(r0)
                            return
                        L_0x0026:
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afInfoLog     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                            if (r1 != 0) goto L_0x017e
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.AFLogger     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                            if (r1 == 0) goto L_0x0040
                            goto L_0x017e
                        L_0x0040:
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            java.util.Set<com.appsflyer.internal.AFd1kSDK> r3 = r2.AFKeystoreWrapper     // Catch:{ all -> 0x0193 }
                            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0193 }
                        L_0x004a:
                            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0193 }
                            if (r4 == 0) goto L_0x0064
                            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1kSDK r4 = (com.appsflyer.internal.AFd1kSDK) r4     // Catch:{ all -> 0x0193 }
                            java.util.Set<com.appsflyer.internal.AFd1kSDK> r5 = r1.afRDLog     // Catch:{ all -> 0x0193 }
                            boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x0193 }
                            if (r5 == 0) goto L_0x004a
                            java.util.Set<com.appsflyer.internal.AFd1kSDK> r5 = r2.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r5.add(r4)     // Catch:{ all -> 0x0193 }
                            goto L_0x004a
                        L_0x0064:
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.valueOf((com.appsflyer.internal.AFd1jSDK<?>) r2)     // Catch:{ all -> 0x0193 }
                            if (r1 == 0) goto L_0x0079
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afInfoLog     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.add(r2)     // Catch:{ all -> 0x0193 }
                            goto L_0x009d
                        L_0x0079:
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.AFLogger     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            boolean r1 = r1.add(r2)     // Catch:{ all -> 0x0193 }
                            if (r1 == 0) goto L_0x009d
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                            java.lang.String r3 = "QUEUE: new task was blocked: "
                            r2.<init>(r3)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r3 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r2.append(r3)     // Catch:{ all -> 0x0193 }
                            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0193 }
                            com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r2.AFKeystoreWrapper()     // Catch:{ all -> 0x0193 }
                        L_0x009d:
                            if (r1 == 0) goto L_0x00b2
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afInfoLog     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1mSDK r3 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.List<com.appsflyer.internal.AFd1jSDK<?>> r3 = r3.afErrorLog     // Catch:{ all -> 0x0193 }
                            r2.addAll(r3)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                            java.util.List<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afErrorLog     // Catch:{ all -> 0x0193 }
                            r2.clear()     // Catch:{ all -> 0x0193 }
                            goto L_0x00c5
                        L_0x00b2:
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                            java.lang.String r3 = "QUEUE: task not added, it's already in the queue: "
                            r2.<init>(r3)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r3 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r2.append(r3)     // Catch:{ all -> 0x0193 }
                            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0193 }
                            com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0193 }
                        L_0x00c5:
                            monitor-exit(r0)
                            if (r1 == 0) goto L_0x016a
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.Set<com.appsflyer.internal.AFd1kSDK> r0 = r0.afRDLog
                            com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                            com.appsflyer.internal.AFd1kSDK r1 = r1.valueOf
                            r0.add(r1)
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            java.lang.String r1 = "QUEUE: new task added: "
                            r0.<init>(r1)
                            com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            com.appsflyer.AFLogger.afDebugLog(r0)
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.List<com.appsflyer.internal.AFd1nSDK> r0 = r0.valueOf
                            java.util.Iterator r0 = r0.iterator()
                        L_0x00ee:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L_0x00fb
                            java.lang.Object r1 = r0.next()
                            com.appsflyer.internal.AFd1nSDK r1 = (com.appsflyer.internal.AFd1nSDK) r1
                            goto L_0x00ee
                        L_0x00fb:
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.concurrent.ExecutorService r1 = r0.AFInAppEventType
                            com.appsflyer.internal.AFd1mSDK$1 r2 = new com.appsflyer.internal.AFd1mSDK$1
                            r2.<init>()
                            r1.submit(r2)
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r0.afInfoLog
                            monitor-enter(r1)
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r2 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                            int r2 = r2.size()     // Catch:{ all -> 0x0167 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                            int r3 = r3.size()     // Catch:{ all -> 0x0167 }
                            int r2 = r2 + r3
                            int r2 = r2 + -40
                        L_0x011b:
                            if (r2 <= 0) goto L_0x0165
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0167 }
                            r3 = r3 ^ 1
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r4 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0167 }
                            r4 = r4 ^ 1
                            if (r4 == 0) goto L_0x0153
                            if (r3 == 0) goto L_0x0153
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                            java.lang.Object r3 = r3.first()     // Catch:{ all -> 0x0167 }
                            com.appsflyer.internal.AFd1jSDK r3 = (com.appsflyer.internal.AFd1jSDK) r3     // Catch:{ all -> 0x0167 }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r4 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                            java.lang.Object r4 = r4.first()     // Catch:{ all -> 0x0167 }
                            com.appsflyer.internal.AFd1jSDK r4 = (com.appsflyer.internal.AFd1jSDK) r4     // Catch:{ all -> 0x0167 }
                            int r3 = r3.compareTo(r4)     // Catch:{ all -> 0x0167 }
                            if (r3 <= 0) goto L_0x014d
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                            r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                            goto L_0x0162
                        L_0x014d:
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                            r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                            goto L_0x0162
                        L_0x0153:
                            if (r4 == 0) goto L_0x015b
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                            r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                            goto L_0x0162
                        L_0x015b:
                            if (r3 == 0) goto L_0x0162
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                            r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                        L_0x0162:
                            int r2 = r2 + -1
                            goto L_0x011b
                        L_0x0165:
                            monitor-exit(r1)
                            return
                        L_0x0167:
                            r0 = move-exception
                            monitor-exit(r1)
                            throw r0
                        L_0x016a:
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            java.lang.String r1 = "QUEUE: tried to add already pending task: "
                            r0.<init>(r1)
                            com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            com.appsflyer.AFLogger.afWarnLog(r0)
                            return
                        L_0x017e:
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                            java.lang.String r2 = "QUEUE: tried to add already scheduled task: "
                            r1.<init>(r2)     // Catch:{ all -> 0x0193 }
                            com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                            r1.append(r2)     // Catch:{ all -> 0x0193 }
                            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0193 }
                            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0193 }
                            monitor-exit(r0)
                            return
                        L_0x0193:
                            r1 = move-exception
                            monitor-exit(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.AnonymousClass5.run():void");
                    }
                });
            } catch (Exception e) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e);
            }
        }
        this.AFLogger = Boolean.TRUE;
        afDebugLog = true;
        return AFd1sSDK.SUCCESS;
    }

    private static String valueOf(AFb1wSDK aFb1wSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1wSDK.AFInAppEventParameterName, 10);
        String str = aFb1wSDK.values;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
