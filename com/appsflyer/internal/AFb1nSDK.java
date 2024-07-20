package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1nSDK {
    public static Intent AFKeystoreWrapper;
    public Map<String, String> AFInAppEventParameterName;
    public List<List<String>> AFInAppEventType = new ArrayList();
    public final List<String> afDebugLog = new ArrayList();
    private final AFc1pSDK afErrorLog;
    public String[] afInfoLog;
    public long afRDLog;
    public String valueOf;
    public DeepLinkListener values;

    public AFb1nSDK(AFc1pSDK aFc1pSDK) {
        this.afErrorLog = aFc1pSDK;
    }

    public final void values(Map<String, Object> map, Intent intent, Context context) {
        AFc1wSDK aFc1wSDK = (AFc1wSDK) this.afErrorLog;
        if (context != null) {
            AFc1tSDK aFc1tSDK = aFc1wSDK.AFKeystoreWrapper;
            if (context != null) {
                aFc1tSDK.AFInAppEventType = context.getApplicationContext();
            }
        }
        if (!AFKeystoreWrapper(intent, context, map) && this.values != null && this.afErrorLog.AFKeystoreWrapper().values.AFInAppEventType("appsFlyerCount", 0) == 0 && !this.afErrorLog.afErrorLog().values("ddl_sent")) {
            AFb1hSDK aFb1hSDK = new AFb1hSDK(this.afErrorLog);
            AFd1mSDK level = this.afErrorLog.getLevel();
            level.AFKeystoreWrapper.execute(new Runnable(new AFe1zSDK(aFb1hSDK)) {
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
                        int r3 = r3.AFInAppEventType(r4)     // Catch:{ all -> 0x0167 }
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
        }
        this.afErrorLog.afErrorLog().values("ddl_sent", true);
    }

    public final void AFKeystoreWrapper(Context context, Map<String, Object> map, Uri uri) {
        AFe1xSDK aFe1xSDK = new AFe1xSDK(context, map, uri, this.afDebugLog);
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFd1mSDK level = this.afErrorLog.getLevel();
        level.AFKeystoreWrapper.execute(new Runnable(aFe1xSDK) {
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
                    int r3 = r3.AFInAppEventType(r4)     // Catch:{ all -> 0x0167 }
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
        AFKeystoreWrapper = null;
    }

    private Uri AFInAppEventParameterName(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFKeystoreWrapper(String str, DeepLinkResult.Error error) {
        if (this.values != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult((DeepLink) null, error));
            return;
        }
        valueOf(str);
    }

    public final void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.values != null) {
            try {
                DeepLink AFKeystoreWrapper2 = DeepLink.AFKeystoreWrapper(map);
                AFKeystoreWrapper2.AFKeystoreWrapper.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(AFKeystoreWrapper2, (DeepLinkResult.Error) null);
            } catch (JSONException e) {
                AFLogger.afErrorLog("[DDL] Error occurred", e, true);
                deepLinkResult = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.UNEXPECTED);
            } catch (Throwable th) {
                AFInAppEventParameterName(new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null));
                throw th;
            }
            AFInAppEventParameterName(deepLinkResult);
            return;
        }
        valueOf(map);
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (this.values != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.afDebugLog(sb.toString());
            try {
                this.values.onDeepLinking(deepLinkResult);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        } else {
            AFLogger.afDebugLog("[DDL] skipping, no callback registered");
        }
    }

    private static void valueOf(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void valueOf(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean AFKeystoreWrapper(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            r1 = 0
            if (r9 == 0) goto L_0x0014
            java.lang.String r2 = r9.getAction()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0014
            android.net.Uri r2 = r9.getData()
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            android.content.Intent r3 = AFKeystoreWrapper
            if (r3 == 0) goto L_0x0028
            java.lang.String r4 = r3.getAction()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0028
            android.net.Uri r0 = r3.getData()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            if (r9 != 0) goto L_0x0031
            java.lang.String r3 = "Could not extract deeplink from null intent"
            com.appsflyer.AFLogger.afDebugLog(r3)
            goto L_0x0094
        L_0x0031:
            android.os.Bundle r3 = r9.getExtras()
            java.util.List<java.util.List<java.lang.String>> r4 = r8.AFInAppEventType
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0094
            if (r3 != 0) goto L_0x0040
            goto L_0x0094
        L_0x0040:
            java.util.List<java.util.List<java.lang.String>> r4 = r8.AFInAppEventType
            java.util.Iterator r4 = r4.iterator()
        L_0x0046:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r4.next()
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0055
            goto L_0x0070
        L_0x0055:
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0070
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r3.getString(r7)
            if (r7 == 0) goto L_0x0070
            android.net.Uri r6 = r8.AFInAppEventParameterName(r7, r6)
            goto L_0x0071
        L_0x0070:
            r6 = r1
        L_0x0071:
            if (r6 == 0) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Found deeplink in push payload at "
            r1.<init>(r3)
            java.lang.String r3 = r5.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            java.util.Map r1 = com.appsflyer.internal.AFa1dSDK.AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r11)
            java.util.List<java.util.List<java.lang.String>> r3 = r8.AFInAppEventType
            java.lang.String r4 = "payloadKey"
            r1.put(r4, r3)
            r1 = r6
        L_0x0094:
            r3 = 1
            java.lang.String r4 = " w/af_consumed"
            r5 = 0
            java.lang.String r6 = "af_consumed"
            if (r2 == 0) goto L_0x00c6
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x00ad
            long r0 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r0)
            r8.AFKeystoreWrapper((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r2)
            return r3
        L_0x00ad:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r2.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00c6:
            if (r0 == 0) goto L_0x00f6
            android.content.Intent r9 = AFKeystoreWrapper
            boolean r9 = r9.hasExtra(r6)
            if (r9 != 0) goto L_0x00dd
            android.content.Intent r9 = AFKeystoreWrapper
            long r1 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r1)
            r8.AFKeystoreWrapper((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r0)
            return r3
        L_0x00dd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed trampoline deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r0.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00f6:
            if (r1 == 0) goto L_0x0122
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x0109
            long r4 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r4)
            r8.AFKeystoreWrapper((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r1)
            return r3
        L_0x0109:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link from push: "
            r9.<init>(r10)
            java.lang.String r10 = r1.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x0122:
            java.lang.String r9 = "No deep link detected"
            com.appsflyer.AFLogger.afDebugLog(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1nSDK.AFKeystoreWrapper(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }
}
