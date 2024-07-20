package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzds extends zzdp implements List, RandomAccess {
    private static final zzdv zza = new zzdq(zzdt.zza, 0);

    zzds() {
    }

    static zzds zzi(Object[] objArr, int i) {
        if (i == 0) {
            return zzdt.zza;
        }
        return new zzdt(objArr, i);
    }

    public static zzds zzj(Collection collection) {
        if (collection instanceof zzdp) {
            zzds zzd = ((zzdp) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i = 0;
        while (i < length) {
            if (array2[i] != null) {
                i++;
            } else {
                throw new NullPointerException("at index " + i);
            }
        }
        return zzi(array2, length);
    }

    public static zzds zzk() {
        return zzdt.zza;
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != r5) goto L_0x0004
            goto L_0x0059
        L_0x0004:
            boolean r1 = r6 instanceof java.util.List
            if (r1 != 0) goto L_0x0009
            goto L_0x005a
        L_0x0009:
            java.util.List r6 = (java.util.List) r6
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 == r2) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L_0x002f
            r2 = 0
        L_0x001b:
            if (r2 >= r1) goto L_0x0059
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = com.google.android.gms.internal.location.zzdl.zza(r3, r4)
            if (r3 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x002f:
            java.util.Iterator r1 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x0037:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0053
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0044
            goto L_0x005a
        L_0x0044:
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.next()
            boolean r2 = com.google.android.gms.internal.location.zzdl.zza(r2, r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0053:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzds.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Deprecated
    public final zzds zzd() {
        return this;
    }

    public final zzdu zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzds subList(int i, int i2) {
        zzdm.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzdt.zza;
        }
        return new zzdr(this, i, i3);
    }

    /* renamed from: zzl */
    public final zzdv listIterator(int i) {
        zzdm.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzdq(this, i);
    }
}
