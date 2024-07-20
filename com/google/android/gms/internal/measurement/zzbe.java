package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class zzbe {
    private static zzaf zza(zzaf zzaf, zzh zzh, zzal zzal, Boolean bool, Boolean bool2) {
        zzaf zzaf2 = new zzaf();
        Iterator<Integer> zzg = zzaf.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzaf.zzc(intValue)) {
                zzaq zza = zzal.zza(zzh, (List<zzaq>) Arrays.asList(new zzaq[]{zzaf.zza(intValue), new zzai(Double.valueOf((double) intValue)), zzaf}));
                if (zza.zzd().equals(bool)) {
                    return zzaf2;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzaf2.zzb(intValue, zza);
                }
            }
        }
        return zzaf2;
    }

    private static zzaf zza(zzaf zzaf, zzh zzh, zzal zzal) {
        return zza(zzaf, zzh, zzal, (Boolean) null, (Boolean) null);
    }

    /* JADX WARNING: type inference failed for: r0v92, types: [com.google.android.gms.internal.measurement.zzaq] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e5, code lost:
        if (r7.zzc(r3) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e7, code lost:
        r1 = r7.zza(r3);
        r7.zzb(r3, (com.google.android.gms.internal.measurement.zzaq) null);
        r2 = (r0 - 1) - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f6, code lost:
        if (r7.zzc(r2) == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f8, code lost:
        r7.zzb(r3, r7.zza(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ff, code lost:
        r7.zzb(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0202, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0205, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        return zza(r24, r25, r26, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zzc("slice", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0221, code lost:
        if (r26.isEmpty() == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0227, code lost:
        return r24.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0228, code lost:
        r3 = (double) r24.zzb();
        r5 = com.google.android.gms.internal.measurement.zzg.zza(r2.zza(r0.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0247, code lost:
        if (r5 >= 0.0d) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0249, code lost:
        r5 = java.lang.Math.max(r5 + r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024f, code lost:
        r5 = java.lang.Math.min(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0258, code lost:
        if (r26.size() != 2) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x025a, code lost:
        r0 = com.google.android.gms.internal.measurement.zzg.zza(r2.zza(r0.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0275, code lost:
        if (r0 >= 0.0d) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0277, code lost:
        r3 = java.lang.Math.max(r3 + r0, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027d, code lost:
        r3 = java.lang.Math.min(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        r0 = new com.google.android.gms.internal.measurement.zzaf();
        r1 = (int) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        if (((double) r1) >= r3) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028c, code lost:
        r0.zza(r7.zza(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0296, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0297, code lost:
        r7 = r24;
        com.google.android.gms.internal.measurement.zzg.zza("shift", 0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a3, code lost:
        if (r24.zzb() != 0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a7, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a8, code lost:
        r0 = r7.zza(0);
        r7.zzb(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02af, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b0, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zza("every", 1, r0);
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzar) == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02cd, code lost:
        if (r24.zzb() == 0) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e3, code lost:
        if (zza(r7, r2, (com.google.android.gms.internal.measurement.zzar) r0, false, 1).zzb() == r24.zzb()) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e7, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ea, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f0, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f1, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zzc("sort", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0300, code lost:
        if (r24.zzb() < 2) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0302, code lost:
        r1 = r24.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x030a, code lost:
        if (r26.isEmpty() != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030c, code lost:
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0319, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzal) == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031b, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0326, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0327, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0328, code lost:
        java.util.Collections.sort(r1, new com.google.android.gms.internal.measurement.zzbh(r3, r2));
        r24.zzj();
        r0 = r1.iterator();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033c, code lost:
        if (r0.hasNext() == false) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033e, code lost:
        r7.zzb(r3, r0.next());
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034a, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x034b, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zza("some", 1, r0);
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0362, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzal) == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0368, code lost:
        if (r24.zzb() == 0) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036a, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzal) r0;
        r1 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0374, code lost:
        if (r1.hasNext() == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0376, code lost:
        r3 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0384, code lost:
        if (r7.zzc(r3) == false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b0, code lost:
        if (r0.zza(r2, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzaq[]{r7.zza(r3), new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r3)), r7})).zzd().booleanValue() == false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b4, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03b7, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03bd, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03be, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c8, code lost:
        if (r26.isEmpty() != false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ca, code lost:
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d2, code lost:
        if (r0.hasNext() == false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d4, code lost:
        r7.zza(r2.zza(r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f0, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r24.zzb()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f1, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zzc("join", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ff, code lost:
        if (r24.zzb() != 0) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0403, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0408, code lost:
        if (r26.isEmpty() != false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x040a, code lost:
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0417, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) != false) goto L_0x0423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x041b, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzax) == false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x041e, code lost:
        r0 = r0.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0423, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0426, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0431, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r7.zzb(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0432, code lost:
        r7 = r24;
        com.google.android.gms.internal.measurement.zzg.zza("pop", 0, r26);
        r0 = r24.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043e, code lost:
        if (r0 != 0) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0442, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0443, code lost:
        r0 = r0 - 1;
        r1 = r7.zza(r0);
        r7.zzb(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x044d, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zza("map", 1, r0);
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0464, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzar) == false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x046a, code lost:
        if (r24.zzb() != 0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0471, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0478, code lost:
        return zza(r7, r2, (com.google.android.gms.internal.measurement.zzar) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x047e, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x047f, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0489, code lost:
        if (r26.isEmpty() != false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x048b, code lost:
        r1 = new com.google.android.gms.internal.measurement.zzaf();
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0498, code lost:
        if (r0.hasNext() == false) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049a, code lost:
        r3 = r2.zza(r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04a6, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzaj) != false) goto L_0x04ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04a8, code lost:
        r1.zza(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b3, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04b4, code lost:
        r0 = r1.zzb();
        r2 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04c0, code lost:
        if (r2.hasNext() == false) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04c2, code lost:
        r3 = r2.next();
        r1.zzb(r3.intValue() + r0, r7.zza(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d9, code lost:
        r24.zzj();
        r0 = r1.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e4, code lost:
        if (r0.hasNext() == false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e6, code lost:
        r2 = r0.next();
        r7.zzb(r2.intValue(), r1.zza(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x050a, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r24.zzb()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x050b, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zzc("lastIndexOf", 2, r0);
        r1 = com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051b, code lost:
        if (r26.isEmpty() != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x051d, code lost:
        r1 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0528, code lost:
        r5 = (double) (r24.zzb() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0533, code lost:
        if (r26.size() <= 1) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0535, code lost:
        r0 = r2.zza(r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x054b, code lost:
        if (java.lang.Double.isNaN(r0.zze().doubleValue()) == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x054d, code lost:
        r2 = (double) (r24.zzb() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0554, code lost:
        r2 = com.google.android.gms.internal.measurement.zzg.zza(r0.zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0560, code lost:
        r5 = r2;
        r2 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0565, code lost:
        if (r5 >= 0.0d) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0567, code lost:
        r5 = r5 + ((double) r24.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x056e, code lost:
        r2 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0572, code lost:
        if (r5 >= r2) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x057d, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x057e, code lost:
        r0 = (int) java.lang.Math.min((double) r24.zzb(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0588, code lost:
        if (r0 < 0) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x058e, code lost:
        if (r7.zzc(r0) == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0598, code lost:
        if (com.google.android.gms.internal.measurement.zzg.zza(r7.zza(r0), r1) == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05a4, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05a5, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05b1, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05b2, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zza(r21, 1, r0);
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05cb, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzar) == false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05d1, code lost:
        if (r24.zza() != 0) goto L_0x05d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05d5, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05d6, code lost:
        zza(r7, r2, (com.google.android.gms.internal.measurement.zzar) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05dd, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05e3, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05e4, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05ee, code lost:
        if (r26.isEmpty() == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05f5, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05f6, code lost:
        r3 = (int) com.google.android.gms.internal.measurement.zzg.zza(r2.zza(r0.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x060e, code lost:
        if (r3 >= 0) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0610, code lost:
        r3 = java.lang.Math.max(0, r3 + r24.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x061e, code lost:
        if (r3 <= r24.zzb()) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0620, code lost:
        r3 = r24.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0624, code lost:
        r1 = r24.zzb();
        r4 = new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0632, code lost:
        if (r26.size() <= 1) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0634, code lost:
        r5 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.zzg.zza(r2.zza(r0.get(1)).zze().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0650, code lost:
        if (r5 <= 0) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0652, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0659, code lost:
        if (r6 >= java.lang.Math.min(r1, r3 + r5)) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x065b, code lost:
        r4.zza(r7.zza(r3));
        r7.zzb(r3);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066d, code lost:
        if (r26.size() <= 2) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x066f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0674, code lost:
        if (r1 >= r26.size()) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0676, code lost:
        r6 = r2.zza(r0.get(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0039, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0682, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzaj) != false) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0684, code lost:
        r7.zza((r3 + r1) - 2, r6);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0694, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0695, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0696, code lost:
        if (r3 >= r1) goto L_0x06a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0698, code lost:
        r4.zza(r7.zza(r3));
        r7.zzb(r3, (com.google.android.gms.internal.measurement.zzaq) null);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06a6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06b2, code lost:
        return zza(r24, r25, r26, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06b3, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zza(r22, 1, r0);
        r0 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06ce, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzar) == false) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06d4, code lost:
        if (r24.zza() != 0) goto L_0x06dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06db, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06dc, code lost:
        r1 = (com.google.android.gms.internal.measurement.zzaf) r24.zzc();
        r0 = zza(r7, r2, (com.google.android.gms.internal.measurement.zzar) r0, (java.lang.Boolean) null, 1);
        r2 = new com.google.android.gms.internal.measurement.zzaf();
        r0 = r0.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06f6, code lost:
        if (r0.hasNext() == false) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06f8, code lost:
        r2.zza(r1.zza(r0.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x070a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0710, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0711, code lost:
        r7 = r24;
        r2 = r25;
        r0 = r26;
        r1 = (com.google.android.gms.internal.measurement.zzaf) r24.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0721, code lost:
        if (r26.isEmpty() != false) goto L_0x0772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0723, code lost:
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x072b, code lost:
        if (r0.hasNext() == false) goto L_0x0772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x072d, code lost:
        r3 = r2.zza(r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0739, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzaj) != false) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x073b, code lost:
        r4 = r1.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0741, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzaf) == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0743, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzaf) r3;
        r5 = r3.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x074d, code lost:
        if (r5.hasNext() == false) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x074f, code lost:
        r6 = r5.next();
        r1.zzb(r6.intValue() + r4, r3.zza(r6.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0766, code lost:
        r1.zzb(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0771, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0772, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0773, code lost:
        r7 = r24;
        com.google.android.gms.internal.measurement.zzg.zza(r4, 0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0784, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r24.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0121, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0122, code lost:
        r21 = "forEach";
        r22 = "filter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        switch(r0) {
            case 0: goto L_0x0773;
            case 1: goto L_0x0711;
            case 2: goto L_0x06b3;
            case 3: goto L_0x06a7;
            case 4: goto L_0x05e4;
            case 5: goto L_0x05b2;
            case 6: goto L_0x050b;
            case 7: goto L_0x047f;
            case 8: goto L_0x044d;
            case 9: goto L_0x0432;
            case 10: goto L_0x03f1;
            case 11: goto L_0x03be;
            case 12: goto L_0x034b;
            case 13: goto L_0x02f1;
            case 14: goto L_0x02b0;
            case 15: goto L_0x0297;
            case 16: goto L_0x0212;
            case 17: goto L_0x0206;
            case 18: goto L_0x01ce;
            case 19: goto L_0x0135;
            default: goto L_0x012d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0134, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0135, code lost:
        r0 = r26;
        com.google.android.gms.internal.measurement.zzg.zzc("indexOf", 2, r0);
        r1 = com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        if (r26.isEmpty() != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0143, code lost:
        r2 = r25;
        r1 = r2.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0158, code lost:
        if (r26.size() <= 1) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015a, code lost:
        r2 = com.google.android.gms.internal.measurement.zzg.zza(r2.zza(r0.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0177, code lost:
        if (r2 < ((double) r24.zzb())) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0182, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0187, code lost:
        if (r2 >= 0.0d) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0189, code lost:
        r2 = r2 + ((double) r24.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r2 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0192, code lost:
        r0 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019a, code lost:
        if (r0.hasNext() == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
        r4 = r0.next().intValue();
        r5 = (double) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a9, code lost:
        if (r5 < r2) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b5, code lost:
        if (com.google.android.gms.internal.measurement.zzg.zza(r24.zza(r4), r1) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c0, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c1, code lost:
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cd, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ce, code lost:
        r7 = r24;
        com.google.android.gms.internal.measurement.zzg.zza("reverse", 0, r26);
        r0 = r24.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01da, code lost:
        if (r0 == 0) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01dc, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01df, code lost:
        if (r3 >= (r0 / 2)) goto L_0x0205;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r23, com.google.android.gms.internal.measurement.zzaf r24, com.google.android.gms.internal.measurement.zzh r25, java.util.List<com.google.android.gms.internal.measurement.zzaq> r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r23.hashCode()
            int r4 = r23.hashCode()
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.String r7 = "indexOf"
            java.lang.String r8 = "reverse"
            java.lang.String r9 = "slice"
            java.lang.String r10 = "shift"
            java.lang.String r11 = "every"
            java.lang.String r12 = "sort"
            java.lang.String r13 = "some"
            java.lang.String r14 = "join"
            java.lang.String r15 = "pop"
            java.lang.String r5 = "map"
            r16 = r6
            java.lang.String r6 = "lastIndexOf"
            java.lang.String r1 = "forEach"
            java.lang.String r2 = "filter"
            java.lang.String r3 = "toString"
            r17 = -1
            r18 = r3
            switch(r4) {
                case -1776922004: goto L_0x0116;
                case -1354795244: goto L_0x0108;
                case -1274492040: goto L_0x00fc;
                case -934873754: goto L_0x00ee;
                case -895859076: goto L_0x00e2;
                case -678635926: goto L_0x00d8;
                case -467511597: goto L_0x00ce;
                case -277637751: goto L_0x00c2;
                case 107868: goto L_0x00b7;
                case 111185: goto L_0x00ad;
                case 3267882: goto L_0x00a3;
                case 3452698: goto L_0x0097;
                case 3536116: goto L_0x008c;
                case 3536286: goto L_0x0081;
                case 96891675: goto L_0x0076;
                case 109407362: goto L_0x006b;
                case 109526418: goto L_0x0060;
                case 965561430: goto L_0x0053;
                case 1099846370: goto L_0x0048;
                case 1943291465: goto L_0x003d;
                default: goto L_0x0039;
            }
        L_0x0039:
            r4 = r18
            goto L_0x0121
        L_0x003d:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r0 = 19
            goto L_0x00f9
        L_0x0048:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            r0 = 18
            goto L_0x00f9
        L_0x0053:
            java.lang.String r4 = "reduceRight"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x005c
            goto L_0x0039
        L_0x005c:
            r0 = 17
            goto L_0x00f9
        L_0x0060:
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0067
            goto L_0x0039
        L_0x0067:
            r0 = 16
            goto L_0x00f9
        L_0x006b:
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0072
            goto L_0x0039
        L_0x0072:
            r0 = 15
            goto L_0x00f9
        L_0x0076:
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x007d
            goto L_0x0039
        L_0x007d:
            r0 = 14
            goto L_0x00f9
        L_0x0081:
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0088
            goto L_0x0039
        L_0x0088:
            r0 = 13
            goto L_0x00f9
        L_0x008c:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0093
            goto L_0x0039
        L_0x0093:
            r0 = 12
            goto L_0x00f9
        L_0x0097:
            java.lang.String r4 = "push"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0039
        L_0x00a0:
            r0 = 11
            goto L_0x00f9
        L_0x00a3:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00aa
            goto L_0x0039
        L_0x00aa:
            r0 = 10
            goto L_0x00f9
        L_0x00ad:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x00b4
            goto L_0x0039
        L_0x00b4:
            r0 = 9
            goto L_0x00f9
        L_0x00b7:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00bf
            goto L_0x0039
        L_0x00bf:
            r0 = 8
            goto L_0x00f9
        L_0x00c2:
            java.lang.String r4 = "unshift"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00cc
            goto L_0x0039
        L_0x00cc:
            r0 = 7
            goto L_0x00f9
        L_0x00ce:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00d6
            goto L_0x0039
        L_0x00d6:
            r0 = 6
            goto L_0x00f9
        L_0x00d8:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e0
            goto L_0x0039
        L_0x00e0:
            r0 = 5
            goto L_0x00f9
        L_0x00e2:
            java.lang.String r4 = "splice"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ec
            goto L_0x0039
        L_0x00ec:
            r0 = 4
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r4 = "reduce"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00f8
            goto L_0x0039
        L_0x00f8:
            r0 = 3
        L_0x00f9:
            r4 = r18
            goto L_0x0122
        L_0x00fc:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0104
            goto L_0x0039
        L_0x0104:
            r4 = r18
            r0 = 2
            goto L_0x0122
        L_0x0108:
            java.lang.String r4 = "concat"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0112
            goto L_0x0039
        L_0x0112:
            r4 = r18
            r0 = 1
            goto L_0x0122
        L_0x0116:
            r4 = r18
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r0 = 0
            goto L_0x0122
        L_0x0121:
            r0 = -1
        L_0x0122:
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r3 = "Callback should be a method"
            r21 = r1
            r22 = r2
            switch(r0) {
                case 0: goto L_0x0773;
                case 1: goto L_0x0711;
                case 2: goto L_0x06b3;
                case 3: goto L_0x06a7;
                case 4: goto L_0x05e4;
                case 5: goto L_0x05b2;
                case 6: goto L_0x050b;
                case 7: goto L_0x047f;
                case 8: goto L_0x044d;
                case 9: goto L_0x0432;
                case 10: goto L_0x03f1;
                case 11: goto L_0x03be;
                case 12: goto L_0x034b;
                case 13: goto L_0x02f1;
                case 14: goto L_0x02b0;
                case 15: goto L_0x0297;
                case 16: goto L_0x0212;
                case 17: goto L_0x0206;
                case 18: goto L_0x01ce;
                case 19: goto L_0x0135;
                default: goto L_0x012d;
            }
        L_0x012d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0135:
            r0 = r26
            r1 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r7, r1, r0)
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzc
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x0151
            r2 = 0
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            r2 = r25
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            goto L_0x0153
        L_0x0151:
            r2 = r25
        L_0x0153:
            int r3 = r26.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0190
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.Double r0 = r0.zze()
            double r2 = r0.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.zzg.zza((double) r2)
            int r0 = r24.zzb()
            double r4 = (double) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0183
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            return r0
        L_0x0183:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0192
            int r0 = r24.zzb()
            double r4 = (double) r0
            double r2 = r2 + r4
            goto L_0x0192
        L_0x0190:
            r2 = 0
        L_0x0192:
            java.util.Iterator r0 = r24.zzg()
        L_0x0196:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01c4
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            double r5 = (double) r4
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x01c1
            r7 = r24
            com.google.android.gms.internal.measurement.zzaq r4 = r7.zza((int) r4)
            boolean r4 = com.google.android.gms.internal.measurement.zzg.zza(r4, r1)
            if (r4 == 0) goto L_0x0196
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            return r0
        L_0x01c1:
            r7 = r24
            goto L_0x0196
        L_0x01c4:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            return r0
        L_0x01ce:
            r7 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r8, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            int r0 = r24.zzb()
            if (r0 == 0) goto L_0x0205
            r3 = 0
        L_0x01dd:
            int r1 = r0 / 2
            if (r3 >= r1) goto L_0x0205
            boolean r1 = r7.zzc((int) r3)
            if (r1 == 0) goto L_0x0202
            com.google.android.gms.internal.measurement.zzaq r1 = r7.zza((int) r3)
            r2 = 0
            r7.zzb(r3, r2)
            int r2 = r0 + -1
            int r2 = r2 - r3
            boolean r4 = r7.zzc((int) r2)
            if (r4 == 0) goto L_0x01ff
            com.google.android.gms.internal.measurement.zzaq r4 = r7.zza((int) r2)
            r7.zzb(r3, r4)
        L_0x01ff:
            r7.zzb(r2, r1)
        L_0x0202:
            int r3 = r3 + 1
            goto L_0x01dd
        L_0x0205:
            return r7
        L_0x0206:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzaq r0 = zza((com.google.android.gms.internal.measurement.zzaf) r7, (com.google.android.gms.internal.measurement.zzh) r2, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0, (boolean) r1)
            return r0
        L_0x0212:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 0
            r3 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r9, r3, r0)
            boolean r3 = r26.isEmpty()
            if (r3 == 0) goto L_0x0228
            com.google.android.gms.internal.measurement.zzaq r0 = r24.zzc()
            return r0
        L_0x0228:
            int r3 = r24.zzb()
            double r3 = (double) r3
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r5 = r1.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzg.zza((double) r5)
            r8 = 0
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x024f
            double r5 = r5 + r3
            double r5 = java.lang.Math.max(r5, r8)
            goto L_0x0253
        L_0x024f:
            double r5 = java.lang.Math.min(r5, r3)
        L_0x0253:
            int r1 = r26.size()
            r8 = 2
            if (r1 != r8) goto L_0x0281
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.Double r0 = r0.zze()
            double r0 = r0.doubleValue()
            double r0 = com.google.android.gms.internal.measurement.zzg.zza((double) r0)
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x027d
            double r3 = r3 + r0
            double r3 = java.lang.Math.max(r3, r8)
            goto L_0x0281
        L_0x027d:
            double r3 = java.lang.Math.min(r3, r0)
        L_0x0281:
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            int r1 = (int) r5
        L_0x0287:
            double r5 = (double) r1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0296
            com.google.android.gms.internal.measurement.zzaq r2 = r7.zza((int) r1)
            r0.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            int r1 = r1 + 1
            goto L_0x0287
        L_0x0296:
            return r0
        L_0x0297:
            r7 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r10, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            int r0 = r24.zzb()
            if (r0 != 0) goto L_0x02a8
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            return r0
        L_0x02a8:
            com.google.android.gms.internal.measurement.zzaq r0 = r7.zza((int) r1)
            r7.zzb((int) r1)
            return r0
        L_0x02b0:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 0
            r4 = 1
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r11, (int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.zzar
            if (r4 == 0) goto L_0x02eb
            int r3 = r24.zzb()
            if (r3 == 0) goto L_0x02e8
            com.google.android.gms.internal.measurement.zzar r0 = (com.google.android.gms.internal.measurement.zzar) r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = r16
            com.google.android.gms.internal.measurement.zzaf r0 = zza(r7, r2, r0, r1, r4)
            int r0 = r0.zzb()
            int r1 = r24.zzb()
            if (r0 == r1) goto L_0x02e8
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzi
            return r0
        L_0x02e8:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzh
            return r0
        L_0x02eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x02f1:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zzc(r12, r1, r0)
            int r1 = r24.zzb()
            r3 = 2
            if (r1 < r3) goto L_0x034a
            java.util.List r1 = r24.zzi()
            boolean r3 = r26.isEmpty()
            if (r3 != 0) goto L_0x0327
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.measurement.zzal
            if (r3 == 0) goto L_0x031f
            r3 = r0
            com.google.android.gms.internal.measurement.zzal r3 = (com.google.android.gms.internal.measurement.zzal) r3
            goto L_0x0328
        L_0x031f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x0327:
            r3 = 0
        L_0x0328:
            com.google.android.gms.internal.measurement.zzbh r0 = new com.google.android.gms.internal.measurement.zzbh
            r0.<init>(r3, r2)
            java.util.Collections.sort(r1, r0)
            r24.zzj()
            java.util.Iterator r0 = r1.iterator()
            r3 = 0
        L_0x0338:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x034a
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            r7.zzb(r3, r1)
            r1 = 1
            int r3 = r3 + r1
            goto L_0x0338
        L_0x034a:
            return r7
        L_0x034b:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r13, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzal
            if (r1 == 0) goto L_0x03b8
            int r1 = r24.zzb()
            if (r1 == 0) goto L_0x03b5
            com.google.android.gms.internal.measurement.zzal r0 = (com.google.android.gms.internal.measurement.zzal) r0
            java.util.Iterator r1 = r24.zzg()
        L_0x0370:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03b5
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r7.zzc((int) r3)
            if (r4 == 0) goto L_0x0370
            r4 = 3
            com.google.android.gms.internal.measurement.zzaq[] r4 = new com.google.android.gms.internal.measurement.zzaq[r4]
            com.google.android.gms.internal.measurement.zzaq r5 = r7.zza((int) r3)
            r6 = 0
            r4[r6] = r5
            com.google.android.gms.internal.measurement.zzai r5 = new com.google.android.gms.internal.measurement.zzai
            double r8 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
            r5.<init>(r3)
            r3 = 1
            r4[r3] = r5
            r3 = 2
            r4[r3] = r7
            java.util.List r3 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.zzaq r3 = r0.zza((com.google.android.gms.internal.measurement.zzh) r2, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r3)
            java.lang.Boolean r3 = r3.zzd()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0370
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzh
            return r0
        L_0x03b5:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzi
            return r0
        L_0x03b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x03be:
            r7 = r24
            r2 = r25
            r0 = r26
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x03e2
            java.util.Iterator r0 = r26.iterator()
        L_0x03ce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03e2
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            r7.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            goto L_0x03ce
        L_0x03e2:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            int r1 = r24.zzb()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x03f1:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zzc(r14, r1, r0)
            int r1 = r24.zzb()
            if (r1 != 0) goto L_0x0404
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzj
            return r0
        L_0x0404:
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x0426
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r1 != 0) goto L_0x0423
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzax
            if (r1 == 0) goto L_0x041e
            goto L_0x0423
        L_0x041e:
            java.lang.String r0 = r0.zzf()
            goto L_0x0428
        L_0x0423:
            java.lang.String r0 = ""
            goto L_0x0428
        L_0x0426:
            java.lang.String r0 = ","
        L_0x0428:
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r7.zzb((java.lang.String) r0)
            r1.<init>(r0)
            return r1
        L_0x0432:
            r7 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r15, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            int r0 = r24.zzb()
            if (r0 != 0) goto L_0x0443
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            return r0
        L_0x0443:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.zzaq r1 = r7.zza((int) r0)
            r7.zzb((int) r0)
            return r1
        L_0x044d:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 0
            r4 = 1
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzar
            if (r1 == 0) goto L_0x0479
            int r1 = r24.zzb()
            if (r1 != 0) goto L_0x0472
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            return r0
        L_0x0472:
            com.google.android.gms.internal.measurement.zzar r0 = (com.google.android.gms.internal.measurement.zzar) r0
            com.google.android.gms.internal.measurement.zzaf r0 = zza(r7, r2, r0)
            return r0
        L_0x0479:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x047f:
            r7 = r24
            r2 = r25
            r0 = r26
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x04fc
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            r1.<init>()
            java.util.Iterator r0 = r26.iterator()
        L_0x0494:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04b4
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r4 != 0) goto L_0x04ac
            r1.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            goto L_0x0494
        L_0x04ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x04b4:
            int r0 = r1.zzb()
            java.util.Iterator r2 = r24.zzg()
        L_0x04bc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d9
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r0
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.zzaq r3 = r7.zza((int) r3)
            r1.zzb(r4, r3)
            goto L_0x04bc
        L_0x04d9:
            r24.zzj()
            java.util.Iterator r0 = r1.zzg()
        L_0x04e0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04fc
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.zzaq r2 = r1.zza((int) r2)
            r7.zzb(r3, r2)
            goto L_0x04e0
        L_0x04fc:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            int r1 = r24.zzb()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x050b:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r6, r1, r0)
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzc
            boolean r3 = r26.isEmpty()
            if (r3 != 0) goto L_0x0528
            r3 = 0
            java.lang.Object r1 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r1)
        L_0x0528:
            int r3 = r24.zzb()
            r4 = 1
            int r3 = r3 - r4
            double r5 = (double) r3
            int r3 = r26.size()
            if (r3 <= r4) goto L_0x056e
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            java.lang.Double r2 = r0.zze()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x0554
            int r0 = r24.zzb()
            int r0 = r0 - r4
            double r2 = (double) r0
            goto L_0x0560
        L_0x0554:
            java.lang.Double r0 = r0.zze()
            double r2 = r0.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.zzg.zza((double) r2)
        L_0x0560:
            r5 = r2
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0570
            int r0 = r24.zzb()
            double r8 = (double) r0
            double r5 = r5 + r8
            goto L_0x0570
        L_0x056e:
            r2 = 0
        L_0x0570:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x057e
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            return r0
        L_0x057e:
            int r0 = r24.zzb()
            double r2 = (double) r0
            double r2 = java.lang.Math.min(r2, r5)
            int r0 = (int) r2
        L_0x0588:
            if (r0 < 0) goto L_0x05a8
            boolean r2 = r7.zzc((int) r0)
            if (r2 == 0) goto L_0x05a5
            com.google.android.gms.internal.measurement.zzaq r2 = r7.zza((int) r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzg.zza(r2, r1)
            if (r2 == 0) goto L_0x05a5
            com.google.android.gms.internal.measurement.zzai r1 = new com.google.android.gms.internal.measurement.zzai
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            return r1
        L_0x05a5:
            int r0 = r0 + -1
            goto L_0x0588
        L_0x05a8:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            return r0
        L_0x05b2:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = r21
            r4 = 1
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r1, (int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzar
            if (r1 == 0) goto L_0x05de
            int r1 = r24.zza()
            if (r1 != 0) goto L_0x05d6
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            return r0
        L_0x05d6:
            com.google.android.gms.internal.measurement.zzar r0 = (com.google.android.gms.internal.measurement.zzar) r0
            zza(r7, r2, r0)
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.zzc
            return r0
        L_0x05de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x05e4:
            r7 = r24
            r2 = r25
            r0 = r26
            boolean r1 = r26.isEmpty()
            if (r1 == 0) goto L_0x05f6
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            return r0
        L_0x05f6:
            r1 = 0
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            java.lang.Double r3 = r3.zze()
            double r3 = r3.doubleValue()
            double r3 = com.google.android.gms.internal.measurement.zzg.zza((double) r3)
            int r3 = (int) r3
            if (r3 >= 0) goto L_0x061a
            int r4 = r24.zzb()
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r1, r3)
            goto L_0x0624
        L_0x061a:
            int r1 = r24.zzb()
            if (r3 <= r1) goto L_0x0624
            int r3 = r24.zzb()
        L_0x0624:
            int r1 = r24.zzb()
            com.google.android.gms.internal.measurement.zzaf r4 = new com.google.android.gms.internal.measurement.zzaf
            r4.<init>()
            int r5 = r26.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0696
            java.lang.Object r5 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzaq r5 = (com.google.android.gms.internal.measurement.zzaq) r5
            com.google.android.gms.internal.measurement.zzaq r5 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r5)
            java.lang.Double r5 = r5.zze()
            double r5 = r5.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzg.zza((double) r5)
            int r5 = (int) r5
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            if (r5 <= 0) goto L_0x0668
            r6 = r3
        L_0x0653:
            int r8 = r3 + r5
            int r8 = java.lang.Math.min(r1, r8)
            if (r6 >= r8) goto L_0x0668
            com.google.android.gms.internal.measurement.zzaq r8 = r7.zza((int) r3)
            r4.zza((com.google.android.gms.internal.measurement.zzaq) r8)
            r7.zzb((int) r3)
            int r6 = r6 + 1
            goto L_0x0653
        L_0x0668:
            int r1 = r26.size()
            r5 = 2
            if (r1 <= r5) goto L_0x0695
            r1 = 2
        L_0x0670:
            int r6 = r26.size()
            if (r1 >= r6) goto L_0x0695
            java.lang.Object r6 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r6 = (com.google.android.gms.internal.measurement.zzaq) r6
            com.google.android.gms.internal.measurement.zzaq r6 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r6)
            boolean r8 = r6 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r8 != 0) goto L_0x068d
            int r8 = r3 + r1
            int r8 = r8 - r5
            r7.zza((int) r8, (com.google.android.gms.internal.measurement.zzaq) r6)
            int r1 = r1 + 1
            goto L_0x0670
        L_0x068d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0695:
            return r4
        L_0x0696:
            if (r3 >= r1) goto L_0x06a6
            com.google.android.gms.internal.measurement.zzaq r0 = r7.zza((int) r3)
            r4.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            r0 = 0
            r7.zzb(r3, r0)
            int r3 = r3 + 1
            goto L_0x0696
        L_0x06a6:
            return r4
        L_0x06a7:
            r7 = r24
            r2 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzaq r0 = zza((com.google.android.gms.internal.measurement.zzaf) r7, (com.google.android.gms.internal.measurement.zzh) r2, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0, (boolean) r1)
            return r0
        L_0x06b3:
            r7 = r24
            r2 = r25
            r0 = r26
            r4 = r16
            r5 = r22
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzar
            if (r1 == 0) goto L_0x070b
            int r1 = r24.zza()
            if (r1 != 0) goto L_0x06dc
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            return r0
        L_0x06dc:
            com.google.android.gms.internal.measurement.zzaq r1 = r24.zzc()
            com.google.android.gms.internal.measurement.zzaf r1 = (com.google.android.gms.internal.measurement.zzaf) r1
            com.google.android.gms.internal.measurement.zzar r0 = (com.google.android.gms.internal.measurement.zzar) r0
            r3 = 0
            com.google.android.gms.internal.measurement.zzaf r0 = zza(r7, r2, r0, r3, r4)
            com.google.android.gms.internal.measurement.zzaf r2 = new com.google.android.gms.internal.measurement.zzaf
            r2.<init>()
            java.util.Iterator r0 = r0.zzg()
        L_0x06f2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x070a
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.zzaq r3 = r1.zza((int) r3)
            r2.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            goto L_0x06f2
        L_0x070a:
            return r2
        L_0x070b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x0711:
            r7 = r24
            r2 = r25
            r0 = r26
            com.google.android.gms.internal.measurement.zzaq r1 = r24.zzc()
            com.google.android.gms.internal.measurement.zzaf r1 = (com.google.android.gms.internal.measurement.zzaf) r1
            boolean r3 = r26.isEmpty()
            if (r3 != 0) goto L_0x0772
            java.util.Iterator r0 = r26.iterator()
        L_0x0727:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0772
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r2.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r4 != 0) goto L_0x076a
            int r4 = r1.zzb()
            boolean r5 = r3 instanceof com.google.android.gms.internal.measurement.zzaf
            if (r5 == 0) goto L_0x0766
            com.google.android.gms.internal.measurement.zzaf r3 = (com.google.android.gms.internal.measurement.zzaf) r3
            java.util.Iterator r5 = r3.zzg()
        L_0x0749:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0727
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            int r7 = r7 + r4
            int r6 = r6.intValue()
            com.google.android.gms.internal.measurement.zzaq r6 = r3.zza((int) r6)
            r1.zzb(r7, r6)
            goto L_0x0749
        L_0x0766:
            r1.zzb(r4, r3)
            goto L_0x0727
        L_0x076a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x0772:
            return r1
        L_0x0773:
            r7 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r4, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r0)
            com.google.android.gms.internal.measurement.zzas r0 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r24.toString()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbe.zza(java.lang.String, com.google.android.gms.internal.measurement.zzaf, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.zzaq zza(com.google.android.gms.internal.measurement.zzaf r9, com.google.android.gms.internal.measurement.zzh r10, java.util.List<com.google.android.gms.internal.measurement.zzaq> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.zzg.zzb((java.lang.String) r0, (int) r1, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r11)
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r10.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzal
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzaq r11 = (com.google.android.gms.internal.measurement.zzaq) r11
            com.google.android.gms.internal.measurement.zzaq r11 = r10.zza((com.google.android.gms.internal.measurement.zzaq) r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.zzb()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.zzal r3 = (com.google.android.gms.internal.measurement.zzal) r3
            int r4 = r9.zzb()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            if (r12 == 0) goto L_0x004d
            int r4 = r4 - r1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r12 == 0) goto L_0x0052
            r12 = 1
            goto L_0x0053
        L_0x0052:
            r12 = -1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzaq r11 = r9.zza((int) r5)
            goto L_0x0095
        L_0x005a:
            int r6 = r4 - r5
            int r6 = r6 * r12
            if (r6 < 0) goto L_0x0097
            boolean r6 = r9.zzc((int) r5)
            if (r6 == 0) goto L_0x0095
            r6 = 4
            com.google.android.gms.internal.measurement.zzaq[] r6 = new com.google.android.gms.internal.measurement.zzaq[r6]
            r6[r0] = r11
            com.google.android.gms.internal.measurement.zzaq r11 = r9.zza((int) r5)
            r6[r1] = r11
            com.google.android.gms.internal.measurement.zzai r11 = new com.google.android.gms.internal.measurement.zzai
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r6[r2] = r11
            r11 = 3
            r6[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.zzaq r11 = r3.zza((com.google.android.gms.internal.measurement.zzh) r10, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r11)
            boolean r6 = r11 instanceof com.google.android.gms.internal.measurement.zzaj
            if (r6 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r12
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbe.zza(com.google.android.gms.internal.measurement.zzaf, com.google.android.gms.internal.measurement.zzh, java.util.List, boolean):com.google.android.gms.internal.measurement.zzaq");
    }
}
