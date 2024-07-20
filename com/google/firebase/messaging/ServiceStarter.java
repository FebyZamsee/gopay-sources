package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStarter {
    private static ServiceStarter instance;
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private Boolean hasWakeLockPermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    static ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    private ServiceStarter() {
    }

    /* access modifiers changed from: package-private */
    public Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    public int startMessagingService(Context context, Intent intent) {
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }

    private int doStartService(Context context, Intent intent) {
        ComponentName componentName;
        String resolveServiceClassName = resolveServiceClassName(context, intent);
        if (resolveServiceClassName != null) {
            intent.setClassName(context.getPackageName(), resolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentName = WakeLockHolder.startWakefulService(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            return componentName == null ? 404 : -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException unused2) {
            return 402;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String resolveServiceClassName(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.firebaseMessagingServiceClassName     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return r0
        L_0x0007:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x005d }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x005d }
            r0 = 0
            if (r5 == 0) goto L_0x005b
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x0018
            goto L_0x005b
        L_0x0018:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x005d }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x005d }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x005d }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x002b
            goto L_0x0055
        L_0x002b:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x005d }
            r0.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x005d }
            r0.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x005d }
            r3.firebaseMessagingServiceClassName = r4     // Catch:{ all -> 0x005d }
            goto L_0x0051
        L_0x004d:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x005d }
            r3.firebaseMessagingServiceClassName = r4     // Catch:{ all -> 0x005d }
        L_0x0051:
            java.lang.String r4 = r3.firebaseMessagingServiceClassName     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return r4
        L_0x0055:
            java.lang.String r4 = r5.packageName     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return r0
        L_0x005b:
            monitor-exit(r3)
            return r0
        L_0x005d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.ServiceStarter.resolveServiceClassName(android.content.Context, android.content.Intent):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }
}
