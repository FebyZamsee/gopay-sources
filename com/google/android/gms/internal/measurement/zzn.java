package com.google.android.gms.internal.measurement;

public final class zzn extends zzap {
    private final zzac zza;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r17, com.google.android.gms.internal.measurement.zzh r18, java.util.List<com.google.android.gms.internal.measurement.zzaq> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r17.hashCode()
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0051;
                case 45521504: goto L_0x0048;
                case 146575578: goto L_0x003f;
                case 700587132: goto L_0x0036;
                case 920706790: goto L_0x002d;
                case 1570616835: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x005a
        L_0x0024:
            boolean r4 = r1.equals(r8)
            if (r4 != 0) goto L_0x002b
            goto L_0x005a
        L_0x002b:
            r4 = 5
            goto L_0x005b
        L_0x002d:
            boolean r4 = r1.equals(r9)
            if (r4 != 0) goto L_0x0034
            goto L_0x005a
        L_0x0034:
            r4 = 4
            goto L_0x005b
        L_0x0036:
            boolean r4 = r1.equals(r10)
            if (r4 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            r4 = 3
            goto L_0x005b
        L_0x003f:
            boolean r4 = r1.equals(r11)
            if (r4 != 0) goto L_0x0046
            goto L_0x005a
        L_0x0046:
            r4 = 2
            goto L_0x005b
        L_0x0048:
            boolean r4 = r1.equals(r12)
            if (r4 != 0) goto L_0x004f
            goto L_0x005a
        L_0x004f:
            r4 = 1
            goto L_0x005b
        L_0x0051:
            boolean r4 = r1.equals(r13)
            if (r4 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r4 = 0
            goto L_0x005b
        L_0x005a:
            r4 = -1
        L_0x005b:
            if (r4 == 0) goto L_0x013d
            if (r4 == r15) goto L_0x0125
            if (r4 == r14) goto L_0x0105
            if (r4 == r7) goto L_0x00d2
            if (r4 == r6) goto L_0x00a9
            r6 = 5
            if (r4 == r6) goto L_0x006d
            com.google.android.gms.internal.measurement.zzaq r1 = super.zza(r17, r18, r19)
            return r1
        L_0x006d:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r8, (int) r15, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            com.google.android.gms.internal.measurement.zzaq r2 = zzc
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00a1
            com.google.android.gms.internal.measurement.zzaq r2 = zzd
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00a1
            com.google.android.gms.internal.measurement.zzac r2 = r0.zza
            com.google.android.gms.internal.measurement.zzad r2 = r2.zzb()
            java.lang.String r3 = r1.zzf()
            r2.zzb(r3)
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.zzf()
            r2.<init>(r1)
            return r2
        L_0x00a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r9, (int) r14, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r2 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            com.google.android.gms.internal.measurement.zzac r3 = r0.zza
            com.google.android.gms.internal.measurement.zzad r3 = r3.zzb()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzg.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            r3.zza(r1, r4)
            return r2
        L_0x00d2:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r10, (int) r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            com.google.android.gms.internal.measurement.zzac r1 = r0.zza
            com.google.android.gms.internal.measurement.zzad r1 = r1.zzb()
            java.util.Map r1 = r1.zzc()
            com.google.android.gms.internal.measurement.zzap r2 = new com.google.android.gms.internal.measurement.zzap
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ec:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0104
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzaq r5 = com.google.android.gms.internal.measurement.zzj.zza((java.lang.Object) r5)
            r2.zza(r4, r5)
            goto L_0x00ec
        L_0x0104:
            return r2
        L_0x0105:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r11, (int) r15, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
            com.google.android.gms.internal.measurement.zzac r2 = r0.zza
            com.google.android.gms.internal.measurement.zzad r2 = r2.zzb()
            java.lang.Object r1 = r2.zza(r1)
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzj.zza((java.lang.Object) r1)
            return r1
        L_0x0125:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r12, (int) r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            com.google.android.gms.internal.measurement.zzac r1 = r0.zza
            com.google.android.gms.internal.measurement.zzad r1 = r1.zzb()
            com.google.android.gms.internal.measurement.zzai r2 = new com.google.android.gms.internal.measurement.zzai
            long r3 = r1.zza()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x013d:
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r13, (int) r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            com.google.android.gms.internal.measurement.zzac r1 = r0.zza
            com.google.android.gms.internal.measurement.zzad r1 = r1.zzb()
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.zzb()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzn.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    public zzn(zzac zzac) {
        this.zza = zzac;
    }
}
