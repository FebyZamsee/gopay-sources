package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzjp implements zznf {
    private final /* synthetic */ zziq zza;

    zzjp(zziq zziq) {
        this.zza = zziq;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zza("auto", str2, bundle, str);
        } else {
            this.zza.zzb("auto", str2, bundle);
        }
    }
}
