package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import o.AppCompatImageButton;

public final class zzad {
    private static final AppCompatImageButton<String> zza = AppCompatImageButton.asInterface("_syn", "_err", "_el");
    private String zzb;
    private long zzc;
    private Map<String, Object> zzd;

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        long j = this.zzc;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final long zza() {
        return this.zzc;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new zzad(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final Object zza(String str) {
        if (this.zzd.containsKey(str)) {
            return this.zzd.get(str);
        }
        return null;
    }

    public static Object zza(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            return (!(obj instanceof String) && obj != null) ? obj : obj2;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        return obj instanceof String ? obj2.toString() : obj2;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String toString() {
        String str = this.zzb;
        long j = this.zzc;
        String valueOf = String.valueOf(this.zzd);
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + valueOf + "}";
    }

    public final Map<String, Object> zzc() {
        return this.zzd;
    }

    public zzad(String str, long j, Map<String, Object> map) {
        this.zzb = str;
        this.zzc = j;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zza(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
            return;
        }
        this.zzd.put(str, zza(str, this.zzd.get(str), obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzad = (zzad) obj;
        if (this.zzc == zzad.zzc && this.zzb.equals(zzad.zzb)) {
            return this.zzd.equals(zzad.zzd);
        }
        return false;
    }
}
