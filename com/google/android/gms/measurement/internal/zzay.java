package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzih;
import java.util.EnumMap;
import java.util.Map;

public final class zzay {
    public static final zzay zza = new zzay((Boolean) null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzih.zza, Boolean> zzf;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        int i;
        int i2;
        Boolean bool = this.zzd;
        if (bool == null) {
            i = 3;
        } else {
            i = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.zze;
        if (str == null) {
            i2 = 17;
        } else {
            i2 = str.hashCode();
        }
        return this.zzc.hashCode() + (i * 29) + (i2 * 137);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.zzf.entrySet()) {
            Boolean bool = (Boolean) next.getValue();
            if (bool != null) {
                bundle.putString(((zzih.zza) next.getKey()).zze, zzih.zza(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.zzd;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public static zzay zza(Bundle bundle, int i) {
        Boolean bool = null;
        if (bundle == null) {
            return new zzay((Boolean) null, i);
        }
        EnumMap enumMap = new EnumMap(zzih.zza.class);
        for (zzih.zza zza2 : zzig.DMA.zza()) {
            enumMap.put(zza2, zzih.zzb(bundle.getString(zza2.zze)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new zzay((EnumMap<zzih.zza, Boolean>) enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public static zzay zza(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzih.zza.class);
        zzih.zza[] zza2 = zzig.DMA.zza();
        int length = zza2.length;
        int i = 0;
        int i2 = 1;
        while (i < length) {
            enumMap.put(zza2[i], zzih.zza(split[i2].charAt(0)));
            i++;
            i2++;
        }
        return new zzay((EnumMap<zzih.zza, Boolean>) enumMap, parseInt);
    }

    public static Boolean zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return zzih.zzb(bundle.getString("ad_personalization"));
    }

    public final Boolean zzc() {
        return this.zzf.get(zzih.zza.AD_USER_DATA);
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzih.zza zza2 : zzig.DMA.zza()) {
            sb.append(":");
            sb.append(zzih.zza(this.zzf.get(zza2)));
        }
        return sb.toString();
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzih.zza(this.zzb));
        for (zzih.zza zza2 : zzig.DMA.zza()) {
            sb.append(",");
            sb.append(zza2.zze);
            sb.append("=");
            Boolean bool = this.zzf.get(zza2);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    zzay(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    private zzay(EnumMap<zzih.zza, Boolean> enumMap, int i) {
        this(enumMap, i, (Boolean) null, (String) null);
    }

    zzay(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzih.zza, Boolean> enumMap = new EnumMap<>(zzih.zza.class);
        this.zzf = enumMap;
        enumMap.put(zzih.zza.AD_USER_DATA, bool);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzay(EnumMap<zzih.zza, Boolean> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzih.zza, Boolean> enumMap2 = new EnumMap<>(zzih.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzay = (zzay) obj;
        if (this.zzc.equalsIgnoreCase(zzay.zzc) && zzax.zza(this.zzd, zzay.zzd)) {
            return zzax.zza(this.zze, zzay.zze);
        }
        return false;
    }

    public final boolean zzg() {
        for (Boolean bool : this.zzf.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }
}
