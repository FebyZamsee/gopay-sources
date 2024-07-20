package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        String zzd = zzd();
        StringBuilder sb = new StringBuilder();
        sb.append(zzc);
        sb.append("\t");
        sb.append(zza);
        sb.append("\t");
        sb.append(zzb);
        sb.append(zzd);
        return sb.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    public abstract String zzd();
}
