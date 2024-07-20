package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {
    private static final zzak zza = new zzae(zzai.zza, 0);

    zzag() {
    }

    static zzag zzi(Object[] objArr, int i) {
        if (i == 0) {
            return zzai.zza;
        }
        return new zzai(objArr, i);
    }

    public static zzag zzk(Collection collection) {
        if (collection instanceof zzac) {
            zzag zzd = ((zzac) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzah.zza(array2, length);
        return zzi(array2, length);
    }

    public static zzag zzl() {
        return zzai.zza;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.zza(objArr, 2);
        return zzi(objArr, 2);
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
            boolean r3 = com.google.android.gms.internal.common.zzr.zza(r3, r4)
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
            boolean r2 = com.google.android.gms.internal.common.zzr.zza(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzag.equals(java.lang.Object):boolean");
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
    public final zzag zzd() {
        return this;
    }

    public final zzaj zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzag subList(int i, int i2) {
        zzs.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzai.zza;
        }
        return new zzaf(this, i, i3);
    }

    /* renamed from: zzo */
    public final zzak listIterator(int i) {
        zzs.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzae(this, i);
    }

    public static zzag zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzad zzad = new zzad(4);
        zzad.zzb(next);
        zzad.zzc(it);
        zzad.zzc = true;
        return zzi(zzad.zza, zzad.zzb);
    }
}
