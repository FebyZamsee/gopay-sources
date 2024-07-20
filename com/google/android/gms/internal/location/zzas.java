package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzas implements zzcs {
    private ListenerHolder zza;

    zzas(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final ListenerHolder zza() {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        return listenerHolder;
    }

    public final void zzb() {
    }

    public final void zzc(ListenerHolder listenerHolder) {
        synchronized (this) {
            ListenerHolder listenerHolder2 = this.zza;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zza = listenerHolder;
            }
        }
    }
}
