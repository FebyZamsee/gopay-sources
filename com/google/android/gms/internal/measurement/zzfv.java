package com.google.android.gms.internal.measurement;

import android.content.Context;
import o.createBorderlessButtonColorStateList;
import o.onDrawableLoadedFromResources;

final class zzfv extends zzgu {
    private final Context zza;
    private final createBorderlessButtonColorStateList<onDrawableLoadedFromResources<zzgh>> zzb;

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        createBorderlessButtonColorStateList<onDrawableLoadedFromResources<zzgh>> createborderlessbuttoncolorstatelist = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (createborderlessbuttoncolorstatelist == null ? 0 : createborderlessbuttoncolorstatelist.hashCode());
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final createBorderlessButtonColorStateList<onDrawableLoadedFromResources<zzgh>> zzb() {
        return this.zzb;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }

    zzfv(Context context, createBorderlessButtonColorStateList<onDrawableLoadedFromResources<zzgh>> createborderlessbuttoncolorstatelist) {
        if (context != null) {
            this.zza = context;
            this.zzb = createborderlessbuttoncolorstatelist;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof com.google.android.gms.internal.measurement.zzgu
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.measurement.zzgu r4 = (com.google.android.gms.internal.measurement.zzgu) r4
            android.content.Context r1 = r3.zza
            android.content.Context r2 = r4.zza()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            o.createBorderlessButtonColorStateList<o.onDrawableLoadedFromResources<com.google.android.gms.internal.measurement.zzgh>> r1 = r3.zzb
            if (r1 != 0) goto L_0x0021
            o.createBorderlessButtonColorStateList r4 = r4.zzb()
            if (r4 != 0) goto L_0x002c
            goto L_0x002b
        L_0x0021:
            o.createBorderlessButtonColorStateList r4 = r4.zzb()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x002c
        L_0x002b:
            return r0
        L_0x002c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfv.equals(java.lang.Object):boolean");
    }
}
