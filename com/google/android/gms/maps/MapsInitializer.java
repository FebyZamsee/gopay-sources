package com.google.android.gms.maps;

import android.content.Context;

public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static int initialize(Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, (Renderer) null, (OnMapsSdkInitializedCallback) null);
        }
        return initialize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[Catch:{ RemoteException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e A[SYNTHETIC, Splitter:B:30:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int initialize(android.content.Context r5, com.google.android.gms.maps.MapsInitializer.Renderer r6, com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch:{ all -> 0x0061 }
            boolean r1 = zzb     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            if (r7 == 0) goto L_0x0014
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = zzc     // Catch:{ all -> 0x0061 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0061 }
        L_0x0014:
            monitor-exit(r0)
            return r2
        L_0x0016:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcc.zza(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x005c }
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch:{ RemoteException -> 0x0055 }
            r3 = 1
            zzb = r3     // Catch:{ all -> 0x0061 }
            r4 = 2
            if (r6 == 0) goto L_0x0038
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x0039
            if (r6 != r3) goto L_0x0038
            r3 = 2
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            int r6 = r1.zzd()     // Catch:{ RemoteException -> 0x004b }
            if (r6 != r4) goto L_0x0043
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch:{ RemoteException -> 0x004b }
            zzc = r6     // Catch:{ RemoteException -> 0x004b }
        L_0x0043:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch:{ RemoteException -> 0x004b }
            r1.zzl(r5, r3)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r7 == 0) goto L_0x0053
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = zzc     // Catch:{ all -> 0x0061 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0061 }
        L_0x0053:
            monitor-exit(r0)
            return r2
        L_0x0055:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x0061 }
            r6.<init>(r5)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ all -> 0x0061 }
        L_0x005c:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return r5
        L_0x0061:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
