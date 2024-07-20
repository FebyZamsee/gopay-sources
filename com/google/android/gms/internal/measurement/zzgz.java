package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

public final /* synthetic */ class zzgz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private /* synthetic */ zzgw zza;

    public /* synthetic */ zzgz(zzgw zzgw) {
        this.zza = zzgw;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zza(sharedPreferences, str);
    }
}
