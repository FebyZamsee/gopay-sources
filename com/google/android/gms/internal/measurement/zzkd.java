package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzkd<K, V> extends LinkedHashMap<K, V> {
    private static final zzkd<?, ?> zza;
    private boolean zzb = true;

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zziz.zza((byte[]) obj);
        }
        if (!(obj instanceof zzjc)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return i;
    }

    public static <K, V> zzkd<K, V> zza() {
        return zza;
    }

    public final zzkd<K, V> zzb() {
        return isEmpty() ? new zzkd<>() : new zzkd<>(this);
    }

    public final V put(K k, V v) {
        zze();
        zziz.zza(k);
        zziz.zza(v);
        return super.put(k, v);
    }

    public final V remove(Object obj) {
        zze();
        return super.remove(obj);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    static {
        zzkd<?, ?> zzkd = new zzkd<>();
        zza = zzkd;
        zzkd.zzb = false;
    }

    private zzkd() {
    }

    private zzkd(Map<K, V> map) {
        super(map);
    }

    public final void clear() {
        zze();
        super.clear();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zza(zzkd<K, V> zzkd) {
        zze();
        if (!zzkd.isEmpty()) {
            putAll(zzkd);
        }
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (Object next : map.keySet()) {
            zziz.zza(next);
            zziz.zza(map.get(next));
        }
        super.putAll(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0015
            goto L_0x0057
        L_0x0015:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0034
            goto L_0x0057
        L_0x0034:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0055
        L_0x0051:
            boolean r3 = r4.equals(r3)
        L_0x0055:
            if (r3 != 0) goto L_0x001d
        L_0x0057:
            r7 = 0
            goto L_0x005a
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkd.equals(java.lang.Object):boolean");
    }

    public final boolean zzd() {
        return this.zzb;
    }
}