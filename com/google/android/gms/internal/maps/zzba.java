package com.google.android.gms.internal.maps;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class zzba extends zzaw implements Set {
    private transient zzaz zza;

    zzba() {
    }

    static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return BasicMeasure.EXACTLY;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    @SafeVarargs
    public static zzba zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = {"ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT"};
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        return zzk(6, objArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: zzd */
    public abstract zzbf iterator();

    public final zzaz zzg() {
        zzaz zzaz = this.zza;
        if (zzaz != null) {
            return zzaz;
        }
        zzaz zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    /* access modifiers changed from: package-private */
    public zzaz zzh() {
        Object[] array = toArray();
        int i = zzaz.zzd;
        return zzaz.zzg(array, array.length);
    }

    /* access modifiers changed from: package-private */
    public boolean zzj() {
        return false;
    }

    private static zzba zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzbd.zza;
        }
        if (i != 1) {
            int zzf = zzf(i);
            Object[] objArr2 = new Object[zzf];
            int i2 = zzf - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int zza2 = zzav.zza(hashCode);
                    while (true) {
                        int i6 = zza2 & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            zza2++;
                        } else {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException("at index " + i3);
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzbe(obj3);
            }
            if (zzf(i5) < zzf / 2) {
                return zzk(i5, objArr);
            }
            if (i5 < 4) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new zzbd(objArr, i4, objArr2, i2, i5);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzbe(obj4);
    }
}
