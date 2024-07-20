package com.google.android.gms.internal.measurement;

import java.util.Map;

final class zzjm<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzjj> zza;

    public final zzjj zza() {
        return this.zza.getValue();
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzjj.zza();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzkj) {
            return this.zza.getValue().zza((zzkj) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private zzjm(Map.Entry<K, zzjj> entry) {
        this.zza = entry;
    }
}
