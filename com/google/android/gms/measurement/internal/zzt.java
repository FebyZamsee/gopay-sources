package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class zzt extends zzmo {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzv = new zzv(this, this.zza);
        this.zzc.put(num, zzv);
        return zzv;
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0300 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfi.zzc> zza(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.zzfi.zze> r54, java.util.List<com.google.android.gms.internal.measurement.zzfi.zzn> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            r52 = this;
            r10 = r52
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r53)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r54)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r55)
            r0 = r53
            r10.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.zzb = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r10.zzc = r0
            r0 = r56
            r10.zzd = r0
            r0 = r57
            r10.zze = r0
            java.util.Iterator r0 = r54.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1
            java.lang.String r1 = r1.zzg()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = com.google.android.gms.internal.measurement.zzob.zza()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.zzaf r0 = r52.zze()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbg
            boolean r0 = r0.zzf(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = com.google.android.gms.internal.measurement.zzob.zza()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzaf r0 = r52.zze()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbf
            boolean r0 = r0.zzf(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.zzao r2 = r52.zzh()
            java.lang.String r3 = r10.zza
            r2.zzak()
            r2.zzt()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.e_()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.zza(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.zzao r0 = r52.zzh()
            java.lang.String r2 = r10.zza
            java.util.Map r0 = r0.zzk(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzao r2 = r52.zzh()
            java.lang.String r3 = r10.zza
            java.util.Map r15 = r2.zzj(r3)
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x039f
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = r10.zza
            com.google.android.gms.measurement.internal.zzao r3 = r52.zzh()
            java.lang.String r4 = r10.zza
            java.util.Map r3 = r3.zzl(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01f8
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0107:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f8
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            com.google.android.gms.internal.measurement.zzfi$zzl r6 = (com.google.android.gms.internal.measurement.zzfi.zzl) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r3.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01e9
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0135
            goto L_0x01e9
        L_0x0135:
            com.google.android.gms.measurement.internal.zzmz r8 = r52.g_()
            java.util.List r9 = r6.zzi()
            java.util.List r8 = r8.zza((java.util.List<java.lang.Long>) r9, (java.util.List<java.lang.Integer>) r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0107
            com.google.android.gms.internal.measurement.zzix$zzb r9 = r6.zzby()
            r16 = r9
            com.google.android.gms.internal.measurement.zzix$zzb r16 = (com.google.android.gms.internal.measurement.zzix.zzb) r16
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzl.zza) r9
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r9 = r9.zzb()
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r8 = r9.zzb(r8)
            com.google.android.gms.measurement.internal.zzmz r9 = r52.g_()
            java.util.List r11 = r6.zzk()
            java.util.List r9 = r9.zza((java.util.List<java.lang.Long>) r11, (java.util.List<java.lang.Integer>) r7)
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r11 = r8.zzd()
            r11.zzd(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r11 = r6.zzh()
            java.util.Iterator r11 = r11.iterator()
        L_0x0179:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x019e
            java.lang.Object r16 = r11.next()
            r12 = r16
            com.google.android.gms.internal.measurement.zzfi$zzd r12 = (com.google.android.gms.internal.measurement.zzfi.zzd) r12
            int r16 = r12.zza()
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x019a
            r9.add(r12)
        L_0x019a:
            r3 = r17
            r12 = 1
            goto L_0x0179
        L_0x019e:
            r17 = r3
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r3 = r8.zza()
            r3.zza(r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r6 = r6.zzj()
            java.util.Iterator r6 = r6.iterator()
        L_0x01b4:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01d2
            java.lang.Object r9 = r6.next()
            com.google.android.gms.internal.measurement.zzfi$zzm r9 = (com.google.android.gms.internal.measurement.zzfi.zzm) r9
            int r11 = r9.zzb()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 != 0) goto L_0x01b4
            r3.add(r9)
            goto L_0x01b4
        L_0x01d2:
            com.google.android.gms.internal.measurement.zzfi$zzl$zza r6 = r8.zzc()
            r6.zzc(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.internal.measurement.zzkj r5 = r8.zzab()
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5
            com.google.android.gms.internal.measurement.zzfi$zzl r5 = (com.google.android.gms.internal.measurement.zzfi.zzl) r5
            r1.put(r3, r5)
            goto L_0x01f2
        L_0x01e9:
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.put(r3, r6)
        L_0x01f2:
            r3 = r17
            r11 = 0
            r12 = 1
            goto L_0x0107
        L_0x01f8:
            r11 = r1
            goto L_0x01fb
        L_0x01fa:
            r11 = r15
        L_0x01fb:
            java.util.Iterator r12 = r2.iterator()
        L_0x01ff:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x039f
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r16 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzfi$zzl r1 = (com.google.android.gms.internal.measurement.zzfi.zzl) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            if (r1 == 0) goto L_0x0267
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x0231
            goto L_0x0267
        L_0x0231:
            java.util.List r2 = r1.zzh()
            java.util.Iterator r2 = r2.iterator()
        L_0x0239:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0267
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzd r3 = (com.google.android.gms.internal.measurement.zzfi.zzd) r3
            boolean r4 = r3.zzf()
            if (r4 == 0) goto L_0x0239
            int r4 = r3.zza()
            boolean r8 = r3.zze()
            if (r8 == 0) goto L_0x025e
            long r8 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x025f
        L_0x025e:
            r3 = 0
        L_0x025f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.put(r4, r3)
            goto L_0x0239
        L_0x0267:
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            if (r1 == 0) goto L_0x02b4
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x0275
            goto L_0x02b4
        L_0x0275:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x027d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02b4
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzm r3 = (com.google.android.gms.internal.measurement.zzfi.zzm) r3
            boolean r4 = r3.zzf()
            if (r4 == 0) goto L_0x02b1
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x02b1
            int r4 = r3.zzb()
            int r9 = r3.zza()
            r17 = 1
            int r9 = r9 + -1
            long r18 = r3.zza((int) r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            r8.put(r3, r4)
            goto L_0x027d
        L_0x02b1:
            r17 = 1
            goto L_0x027d
        L_0x02b4:
            r17 = 1
            if (r1 == 0) goto L_0x0305
            r2 = 0
        L_0x02b9:
            int r3 = r1.zzd()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x0305
            java.util.List r3 = r1.zzk()
            boolean r3 = com.google.android.gms.measurement.internal.zzmz.zza((java.util.List<java.lang.Long>) r3, (int) r2)
            if (r3 == 0) goto L_0x02f4
            com.google.android.gms.measurement.internal.zzfr r3 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzp()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r18 = r11
            java.lang.String r11 = "Filter already evaluated. audience ID, filter ID"
            r3.zza(r11, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.zzi()
            boolean r3 = com.google.android.gms.measurement.internal.zzmz.zza((java.util.List<java.lang.Long>) r3, (int) r2)
            if (r3 == 0) goto L_0x02f6
            r5.set(r2)
            r3 = 1
            goto L_0x02f7
        L_0x02f4:
            r18 = r11
        L_0x02f6:
            r3 = 0
        L_0x02f7:
            if (r3 != 0) goto L_0x0300
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x0300:
            int r2 = r2 + 1
            r11 = r18
            goto L_0x02b9
        L_0x0305:
            r18 = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            com.google.android.gms.internal.measurement.zzfi$zzl r4 = (com.google.android.gms.internal.measurement.zzfi.zzl) r4
            if (r14 == 0) goto L_0x0382
            if (r13 == 0) goto L_0x0382
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0382
            java.lang.Long r2 = r10.zze
            if (r2 == 0) goto L_0x0382
            java.lang.Long r2 = r10.zzd
            if (r2 != 0) goto L_0x032b
            goto L_0x0382
        L_0x032b:
            java.util.Iterator r1 = r1.iterator()
        L_0x032f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0382
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzew$zzb r2 = (com.google.android.gms.internal.measurement.zzew.zzb) r2
            int r3 = r2.zzb()
            java.lang.Long r9 = r10.zze
            long r19 = r9.longValue()
            r21 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r21
            boolean r2 = r2.zzi()
            if (r2 == 0) goto L_0x0357
            java.lang.Long r2 = r10.zzd
            long r19 = r2.longValue()
            long r19 = r19 / r21
        L_0x0357:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x036c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r19)
            r7.put(r2, r9)
        L_0x036c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x032f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            r8.put(r2, r3)
            goto L_0x032f
        L_0x0382:
            com.google.android.gms.measurement.internal.zzv r11 = new com.google.android.gms.measurement.internal.zzv
            java.lang.String r3 = r10.zza
            r9 = 0
            r1 = r11
            r2 = r52
            r57 = r12
            r12 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzv> r1 = r10.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.put(r2, r11)
            r12 = r57
            r11 = r18
            goto L_0x01ff
        L_0x039f:
            r12 = 0
            r17 = 1
            boolean r0 = r54.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x0513
            com.google.android.gms.measurement.internal.zzx r0 = new com.google.android.gms.measurement.internal.zzx
            r0.<init>(r10)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.util.Iterator r3 = r54.iterator()
        L_0x03b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0513
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzfi$zze r5 = r0.zza(r5, r4)
            if (r5 == 0) goto L_0x03b8
            com.google.android.gms.measurement.internal.zzao r6 = r52.zzh()
            java.lang.String r7 = r10.zza
            java.lang.String r8 = r5.zzg()
            java.lang.String r9 = r4.zzg()
            com.google.android.gms.measurement.internal.zzbc r9 = r6.zzd(r7, r9)
            if (r9 != 0) goto L_0x041b
            com.google.android.gms.measurement.internal.zzfr r9 = r6.zzj()
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzu()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)
            com.google.android.gms.measurement.internal.zzfq r6 = r6.zzi()
            java.lang.String r6 = r6.zza((java.lang.String) r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.zza(r8, r11, r6)
            java.lang.String r20 = r4.zzg()
            com.google.android.gms.measurement.internal.zzbc r6 = new com.google.android.gms.measurement.internal.zzbc
            r18 = r6
            r21 = 1
            r23 = 1
            r25 = 1
            long r27 = r4.zzd()
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r19 = r7
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r31, r32, r33, r34)
            goto L_0x0450
        L_0x041b:
            com.google.android.gms.measurement.internal.zzbc r6 = new com.google.android.gms.measurement.internal.zzbc
            r35 = r6
            java.lang.String r4 = r9.zza
            r36 = r4
            java.lang.String r4 = r9.zzb
            r37 = r4
            long r7 = r9.zzc
            r13 = 1
            long r38 = r7 + r13
            long r7 = r9.zzd
            long r40 = r7 + r13
            long r7 = r9.zze
            long r42 = r7 + r13
            long r7 = r9.zzf
            r44 = r7
            long r7 = r9.zzg
            r46 = r7
            java.lang.Long r4 = r9.zzh
            r48 = r4
            java.lang.Long r4 = r9.zzi
            r49 = r4
            java.lang.Long r4 = r9.zzj
            r50 = r4
            java.lang.Boolean r4 = r9.zzk
            r51 = r4
            r35.<init>(r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)
        L_0x0450:
            com.google.android.gms.measurement.internal.zzao r4 = r52.zzh()
            r4.zza((com.google.android.gms.measurement.internal.zzbc) r6)
            long r7 = r6.zzc
            java.lang.String r4 = r5.zzg()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0472
            com.google.android.gms.measurement.internal.zzao r9 = r52.zzh()
            java.lang.String r11 = r10.zza
            java.util.Map r9 = r9.zzf(r11, r4)
            r2.put(r4, r9)
        L_0x0472:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x047a:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x03b8
            java.lang.Object r11 = r4.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.util.Set<java.lang.Integer> r13 = r10.zzb
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x04a6
            com.google.android.gms.measurement.internal.zzfr r13 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r13 = r13.zzp()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.zza(r1, r11)
            goto L_0x047a
        L_0x04a6:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Object r13 = r9.get(r13)
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
            r14 = 1
        L_0x04b5:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0501
            java.lang.Object r14 = r13.next()
            com.google.android.gms.internal.measurement.zzew$zzb r14 = (com.google.android.gms.internal.measurement.zzew.zzb) r14
            com.google.android.gms.measurement.internal.zzz r15 = new com.google.android.gms.measurement.internal.zzz
            java.lang.String r12 = r10.zza
            r15.<init>(r10, r12, r11, r14)
            java.lang.Long r12 = r10.zzd
            r57 = r0
            java.lang.Long r0 = r10.zze
            int r14 = r14.zzb()
            boolean r25 = r10.zza(r11, r14)
            r18 = r15
            r19 = r12
            r20 = r0
            r21 = r5
            r22 = r7
            r24 = r6
            boolean r14 = r18.zza(r19, r20, r21, r22, r24, r25)
            if (r14 == 0) goto L_0x04f7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.measurement.internal.zzv r0 = r10.zza(r0)
            r0.zza((com.google.android.gms.measurement.internal.zzac) r15)
            r0 = r57
            r12 = 0
            goto L_0x04b5
        L_0x04f7:
            java.util.Set<java.lang.Integer> r0 = r10.zzb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.add(r12)
            goto L_0x0503
        L_0x0501:
            r57 = r0
        L_0x0503:
            if (r14 != 0) goto L_0x050e
            java.util.Set<java.lang.Integer> r0 = r10.zzb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x050e:
            r0 = r57
            r12 = 0
            goto L_0x047a
        L_0x0513:
            boolean r0 = r55.isEmpty()
            if (r0 != 0) goto L_0x0657
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.util.Iterator r2 = r55.iterator()
        L_0x0522:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0657
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfi$zzn r3 = (com.google.android.gms.internal.measurement.zzfi.zzn) r3
            java.lang.String r4 = r3.zzg()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x0547
            com.google.android.gms.measurement.internal.zzao r5 = r52.zzh()
            java.lang.String r6 = r10.zza
            java.util.Map r5 = r5.zzg(r6, r4)
            r0.put(r4, r5)
        L_0x0547:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x054f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0522
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.zzb
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x057b
            com.google.android.gms.measurement.internal.zzfr r3 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzp()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.zza(r1, r4)
            goto L_0x0522
        L_0x057b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x058a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x064a
            java.lang.Object r8 = r7.next()
            com.google.android.gms.internal.measurement.zzew$zze r8 = (com.google.android.gms.internal.measurement.zzew.zze) r8
            com.google.android.gms.measurement.internal.zzfr r9 = r52.zzj()
            r11 = 2
            boolean r9 = r9.zza((int) r11)
            if (r9 == 0) goto L_0x05e3
            com.google.android.gms.measurement.internal.zzfr r9 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()
            boolean r11 = r8.zzi()
            if (r11 == 0) goto L_0x05b8
            int r11 = r8.zza()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x05b9
        L_0x05b8:
            r11 = 0
        L_0x05b9:
            com.google.android.gms.measurement.internal.zzfq r12 = r52.zzi()
            java.lang.String r13 = r8.zze()
            java.lang.String r12 = r12.zzc(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.zza(r14, r13, r11, r12)
            com.google.android.gms.measurement.internal.zzfr r9 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()
            com.google.android.gms.measurement.internal.zzmz r11 = r52.g_()
            java.lang.String r11 = r11.zza((com.google.android.gms.internal.measurement.zzew.zze) r8)
            java.lang.String r12 = "Filter definition"
            r9.zza(r12, r11)
        L_0x05e3:
            boolean r9 = r8.zzi()
            if (r9 == 0) goto L_0x0622
            int r9 = r8.zza()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05f2
            goto L_0x0622
        L_0x05f2:
            com.google.android.gms.measurement.internal.zzab r9 = new com.google.android.gms.measurement.internal.zzab
            java.lang.String r11 = r10.zza
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.zzd
            java.lang.Long r12 = r10.zze
            int r8 = r8.zza()
            boolean r8 = r10.zza(r6, r8)
            boolean r8 = r9.zza(r11, r12, r3, r8)
            if (r8 == 0) goto L_0x0618
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.measurement.internal.zzv r11 = r10.zza(r11)
            r11.zza((com.google.android.gms.measurement.internal.zzac) r9)
            goto L_0x058a
        L_0x0618:
            java.util.Set<java.lang.Integer> r7 = r10.zzb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x064a
        L_0x0622:
            com.google.android.gms.measurement.internal.zzfr r7 = r52.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzu()
            java.lang.String r9 = r10.zza
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)
            boolean r11 = r8.zzi()
            if (r11 == 0) goto L_0x063f
            int r8 = r8.zza()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0640
        L_0x063f:
            r8 = 0
        L_0x0640:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.zza(r11, r9, r8)
            r8 = 0
        L_0x064a:
            if (r8 != 0) goto L_0x054f
            java.util.Set<java.lang.Integer> r7 = r10.zzb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x054f
        L_0x0657:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzv> r0 = r10.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.zzb
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x066b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06fe
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzv> r3 = r10.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.zzv r3 = (com.google.android.gms.measurement.internal.zzv) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.measurement.zzfi$zzc r3 = r3.zza((int) r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.zzao r4 = r52.zzh()
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzfi$zzl r3 = r3.zzd()
            r4.zzak()
            r4.zzt()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r3 = r3.zzbv()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.e_()     // Catch:{ SQLiteException -> 0x06e9 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06e7 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x066b
            com.google.android.gms.measurement.internal.zzfr r0 = r4.zzj()     // Catch:{ SQLiteException -> 0x06e7 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteException -> 0x06e7 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ SQLiteException -> 0x06e7 }
            r0.zza(r3, r6)     // Catch:{ SQLiteException -> 0x06e7 }
            goto L_0x066b
        L_0x06e7:
            r0 = move-exception
            goto L_0x06eb
        L_0x06e9:
            r0 = move-exception
            r8 = 0
        L_0x06eb:
            com.google.android.gms.measurement.internal.zzfr r3 = r4.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.zza(r5, r4, r0)
            goto L_0x066b
        L_0x06fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    zzt(zzmp zzmp) {
        super(zzmp);
    }

    private final boolean zza(int i, int i2) {
        zzv zzv = this.zzc.get(Integer.valueOf(i));
        if (zzv == null) {
            return false;
        }
        return zzv.zzd.get(i2);
    }
}
