package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzgt extends zzgn<Double> {
    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Double zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + zzb + ": " + valueOf);
        return null;
    }

    zzgt(zzgv zzgv, String str, Double d, boolean z) {
        super(zzgv, str, d);
    }
}
