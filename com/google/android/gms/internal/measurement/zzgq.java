package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzgq extends zzgn<Boolean> {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfr.zzb.matcher(str).matches()) {
                return true;
            }
            if (zzfr.zzc.matcher(str).matches()) {
                return false;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb + ": " + valueOf);
        return null;
    }

    zzgq(zzgv zzgv, String str, Boolean bool, boolean z) {
        super(zzgv, str, bool);
    }
}
