package com.google.android.gms.common.wrappers;

import android.content.Context;

public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInstantApp(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004b }
            android.content.Context r2 = zza     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0017
            java.lang.Boolean r3 = zzb     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0017
            if (r2 != r1) goto L_0x0017
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x0017:
            r2 = 0
            zzb = r2     // Catch:{ all -> 0x004b }
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x002f
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004b }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004b }
            zzb = r4     // Catch:{ all -> 0x004b }
            goto L_0x0041
        L_0x002f:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003d }
            zzb = r4     // Catch:{ ClassNotFoundException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
            zzb = r4     // Catch:{ all -> 0x004b }
        L_0x0041:
            zza = r1     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = zzb     // Catch:{ all -> 0x004b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.wrappers.InstantApps.isInstantApp(android.content.Context):boolean");
    }
}
