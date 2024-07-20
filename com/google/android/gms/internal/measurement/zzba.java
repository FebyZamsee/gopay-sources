package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzba extends zzay {
    public final zzaq zza(String str, zzh zzh, List<zzaq> list) {
        boolean z;
        boolean z2;
        zzg.zza(zzg.zza(str), 2, list);
        zzaq zza = zzh.zza(list.get(0));
        zzaq zza2 = zzh.zza(list.get(1));
        switch (zzbd.zza[zzg.zza(str).ordinal()]) {
            case 1:
                z = zza(zza, zza2);
                break;
            case 2:
                z = zzb(zza2, zza);
                break;
            case 3:
                z = zzc(zza2, zza);
                break;
            case 4:
                z = zzg.zza(zza, zza2);
                break;
            case 5:
                z2 = zzg.zza(zza, zza2);
                break;
            case 6:
                z = zzb(zza, zza2);
                break;
            case 7:
                z = zzc(zza, zza2);
                break;
            case 8:
                z2 = zza(zza, zza2);
                break;
            default:
                return super.zza(str);
        }
        z = !z2;
        return z ? zzaq.zzh : zzaq.zzi;
    }

    public zzba() {
        this.zza.add(zzbv.EQUALS);
        this.zza.add(zzbv.GREATER_THAN);
        this.zza.add(zzbv.GREATER_THAN_EQUALS);
        this.zza.add(zzbv.IDENTITY_EQUALS);
        this.zza.add(zzbv.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbv.LESS_THAN);
        this.zza.add(zzbv.LESS_THAN_EQUALS);
        this.zza.add(zzbv.NOT_EQUALS);
    }

    private static boolean zza(zzaq zzaq, zzaq zzaq2) {
        zzaq zzaq3;
        zzaq zzas;
        while (!zzaq.getClass().equals(zzaq2.getClass())) {
            if (((zzaq instanceof zzax) || (zzaq instanceof zzao)) && ((zzaq2 instanceof zzax) || (zzaq2 instanceof zzao))) {
                return true;
            }
            boolean z = zzaq instanceof zzai;
            if (!z || !(zzaq2 instanceof zzas)) {
                boolean z2 = zzaq instanceof zzas;
                if (z2 && (zzaq2 instanceof zzai)) {
                    zzaq3 = new zzai(zzaq.zze());
                } else if (zzaq instanceof zzag) {
                    zzaq3 = new zzai(zzaq.zze());
                } else if (zzaq2 instanceof zzag) {
                    zzas = new zzai(zzaq2.zze());
                } else if ((z2 || z) && (zzaq2 instanceof zzak)) {
                    zzas = new zzas(zzaq2.zzf());
                } else if (!(zzaq instanceof zzak) || (!(zzaq2 instanceof zzas) && !(zzaq2 instanceof zzai))) {
                    return false;
                } else {
                    zzaq3 = new zzas(zzaq.zzf());
                }
                zzaq = zzaq3;
            } else {
                zzas = new zzai(zzaq2.zze());
            }
            zzaq2 = zzas;
        }
        if ((zzaq instanceof zzax) || (zzaq instanceof zzao)) {
            return true;
        }
        if (zzaq instanceof zzai) {
            return !Double.isNaN(zzaq.zze().doubleValue()) && !Double.isNaN(zzaq2.zze().doubleValue()) && zzaq.zze().doubleValue() == zzaq2.zze().doubleValue();
        }
        if (zzaq instanceof zzas) {
            return zzaq.zzf().equals(zzaq2.zzf());
        }
        if (zzaq instanceof zzag) {
            return zzaq.zzd().equals(zzaq2.zzd());
        }
        return zzaq == zzaq2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzb(com.google.android.gms.internal.measurement.zzaq r8, com.google.android.gms.internal.measurement.zzaq r9) {
        /*
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzak
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.measurement.zzas r0 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r8 = r8.zzf()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzak
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.internal.measurement.zzas r0 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r9 = r9.zzf()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzas
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzas
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.zzf()
            java.lang.String r9 = r9.zzf()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.zze()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.zze()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006c
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006c
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
        L_0x005e:
            if (r0 != 0) goto L_0x0065
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            return r2
        L_0x0065:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006c
            return r1
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzba.zzb(com.google.android.gms.internal.measurement.zzaq, com.google.android.gms.internal.measurement.zzaq):boolean");
    }

    private static boolean zzc(zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof zzak) {
            zzaq = new zzas(zzaq.zzf());
        }
        if (zzaq2 instanceof zzak) {
            zzaq2 = new zzas(zzaq2.zzf());
        }
        return (((zzaq instanceof zzas) && (zzaq2 instanceof zzas)) || (!Double.isNaN(zzaq.zze().doubleValue()) && !Double.isNaN(zzaq2.zze().doubleValue()))) && !zzb(zzaq2, zzaq);
    }
}
