package com.google.android.gms.internal.measurement;

final class zziy implements zzkk {
    private static final zziy zza = new zziy();

    public static zziy zza() {
        return zza;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzkh zza(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.zzix> r0 = com.google.android.gms.internal.measurement.zzix.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x0035
            java.lang.Class<com.google.android.gms.internal.measurement.zzix> r0 = com.google.android.gms.internal.measurement.zzix.class
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x001c }
            com.google.android.gms.internal.measurement.zzix r0 = com.google.android.gms.internal.measurement.zzix.zza(r0)     // Catch:{ Exception -> 0x001c }
            int r1 = com.google.android.gms.internal.measurement.zzix.zze.zzc     // Catch:{ Exception -> 0x001c }
            r2 = 0
            java.lang.Object r0 = r0.zza((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x001c }
            com.google.android.gms.internal.measurement.zzkh r0 = (com.google.android.gms.internal.measurement.zzkh) r0     // Catch:{ Exception -> 0x001c }
            return r0
        L_0x001c:
            r0 = move-exception
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to get message info for "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r0)
            throw r4
        L_0x0035:
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported message type: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziy.zza(java.lang.Class):com.google.android.gms.internal.measurement.zzkh");
    }

    private zziy() {
    }

    public final boolean zzb(Class<?> cls) {
        return zzix.class.isAssignableFrom(cls);
    }
}
