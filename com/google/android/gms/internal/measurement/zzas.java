package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class zzas implements zzaq, Iterable<zzaq> {
    /* access modifiers changed from: private */
    public final String zza;

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a0, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a1, code lost:
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("indexOf", 2, r1);
        r2 = r22.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01af, code lost:
        if (r25.size() > 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b1, code lost:
        r3 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ba, code lost:
        r4 = r24;
        r3 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d0, code lost:
        if (r25.size() >= 2) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d2, code lost:
        r4 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d5, code lost:
        r4 = r4.zza(r1.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fb, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r2.indexOf(r3, (int) com.google.android.gms.internal.measurement.zzg.zza(r4))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01fc, code lost:
        r0 = r22;
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("replace", 2, r1);
        r2 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
        r3 = com.google.android.gms.internal.measurement.zzaq.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0212, code lost:
        if (r25.isEmpty() != false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0214, code lost:
        r2 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0228, code lost:
        if (r25.size() <= 1) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022a, code lost:
        r3 = r4.zza(r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0234, code lost:
        r1 = r0.zza;
        r5 = r1.indexOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023a, code lost:
        if (r5 >= 0) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023f, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzal) == false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0241, code lost:
        r8 = 0;
        r3 = ((com.google.android.gms.internal.measurement.zzal) r3).zza(r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzaq[]{new com.google.android.gms.internal.measurement.zzas(r2), new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r5)), r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0267, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0290, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r1.substring(r8, r5) + r3.zzf() + r1.substring(r5 + r2.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0291, code lost:
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("substring", 2, r1);
        r2 = r22.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a1, code lost:
        if (r25.isEmpty() != false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a3, code lost:
        r3 = (int) com.google.android.gms.internal.measurement.zzg.zza(r4.zza(r1.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02bc, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c2, code lost:
        if (r25.size() <= 1) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c4, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.zzg.zza(r4.zza(r1.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02dc, code lost:
        r1 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e0, code lost:
        r3 = java.lang.Math.min(java.lang.Math.max(r3, 0), r2.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x030a, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.substring(java.lang.Math.min(r3, r1), java.lang.Math.max(r3, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030b, code lost:
        r0 = r22;
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("split", 2, r1);
        r2 = r0.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x031b, code lost:
        if (r2.length() != 0) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0328, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0329, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0333, code lost:
        if (r25.isEmpty() == false) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0335, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x033a, code lost:
        r3 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034d, code lost:
        if (r25.size() <= 1) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034f, code lost:
        r6 = com.google.android.gms.internal.measurement.zzg.zzc(r4.zza(r1.get(1)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0366, code lost:
        r6 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036d, code lost:
        if (r6 != 0) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0374, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0375, code lost:
        r1 = r2.split(java.util.regex.Pattern.quote(r3), ((int) r6) + 1);
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0385, code lost:
        if (r3.isEmpty() == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0388, code lost:
        if (r1.length <= 0) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x038a, code lost:
        r14 = r1[0].isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0399, code lost:
        if (r1[r1.length - 1].isEmpty() == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x039b, code lost:
        r2 = r1.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039e, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a3, code lost:
        if (((long) r1.length) <= r6) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a5, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a7, code lost:
        if (r14 >= r2) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03a9, code lost:
        r5.add(new com.google.android.gms.internal.measurement.zzas(r1[r14]));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03bb, code lost:
        return new com.google.android.gms.internal.measurement.zzaf((java.util.List<com.google.android.gms.internal.measurement.zzaq>) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bc, code lost:
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("slice", 2, r1);
        r2 = r22.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03cc, code lost:
        if (r25.isEmpty() != false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ce, code lost:
        r5 = r4.zza(r1.get(0)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e2, code lost:
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e4, code lost:
        r5 = com.google.android.gms.internal.measurement.zzg.zza(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ec, code lost:
        if (r5 >= 0.0d) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ee, code lost:
        r5 = java.lang.Math.max(((double) r2.length()) + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f9, code lost:
        r5 = java.lang.Math.min(r5, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0402, code lost:
        r3 = (int) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0408, code lost:
        if (r25.size() <= 1) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x040a, code lost:
        r4 = r4.zza(r1.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x041d, code lost:
        r4 = (double) r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0422, code lost:
        r4 = com.google.android.gms.internal.measurement.zzg.zza(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x042a, code lost:
        if (r4 >= 0.0d) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x042c, code lost:
        r4 = java.lang.Math.max(((double) r2.length()) + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0437, code lost:
        r4 = java.lang.Math.min(r4, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0451, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.substring(r3, java.lang.Math.max(0, ((int) r4) - r3) + r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0452, code lost:
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("match", 1, r1);
        r2 = r22.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0462, code lost:
        if (r25.size() > 0) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0464, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0467, code lost:
        r1 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0476, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0482, code lost:
        if (r1.find() == false) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0498, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(new com.google.android.gms.internal.measurement.zzas(r1.group()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x049b, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x049c, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r5, 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04af, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r22.zza.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04b0, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r5, 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04c5, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r22.zza.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c6, code lost:
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("lastIndexOf", 2, r1);
        r2 = r22.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04d6, code lost:
        if (r25.size() > 0) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04d8, code lost:
        r3 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04df, code lost:
        r3 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04f3, code lost:
        if (r25.size() >= 2) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04f5, code lost:
        r4 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04f8, code lost:
        r4 = r4.zza(r1.get(1)).zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x050f, code lost:
        if (java.lang.Double.isNaN(r4) == false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0511, code lost:
        r4 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0514, code lost:
        r4 = com.google.android.gms.internal.measurement.zzg.zza(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0527, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r2.lastIndexOf(r3, (int) r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0528, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r14, 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x053b, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r22.zza.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x053c, code lost:
        r0 = r22;
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc("search", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x054b, code lost:
        if (r25.isEmpty() != false) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x054d, code lost:
        r1 = r4.zza(r1.get(0)).zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x055c, code lost:
        r1 = com.google.android.gms.internal.measurement.zzaq.zzc.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0562, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0570, code lost:
        if (r1.find() == false) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0580, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r1.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x058c, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x058d, code lost:
        com.google.android.gms.internal.measurement.zzg.zza(r17, 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05a4, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r22.zza.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05a5, code lost:
        r0 = r22;
        r4 = r24;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05af, code lost:
        if (r25.isEmpty() == false) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05b1, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05b2, code lost:
        r3 = new java.lang.StringBuilder(r0.zza);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05be, code lost:
        if (r14 >= r25.size()) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05c0, code lost:
        r3.append(r4.zza(r1.get(r14)).zzf());
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05dd, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05de, code lost:
        r0 = r22;
        r4 = r24;
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zzc(r6, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05ec, code lost:
        if (r25.isEmpty() != false) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05ee, code lost:
        r14 = (int) com.google.android.gms.internal.measurement.zzg.zza(r4.zza(r1.get(0)).zze().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0607, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0608, code lost:
        r1 = r0.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x060a, code lost:
        if (r14 < 0) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0610, code lost:
        if (r14 < r1.length()) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0620, code lost:
        return new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(r1.charAt(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0623, code lost:
        return com.google.android.gms.internal.measurement.zzaq.zzj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0624, code lost:
        com.google.android.gms.internal.measurement.zzg.zza("toLocaleLowerCase", 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0638, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r22.zza.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0639, code lost:
        r0 = r22;
        com.google.android.gms.internal.measurement.zzg.zza(r7, 0, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0641, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0642, code lost:
        r1 = r25;
        com.google.android.gms.internal.measurement.zzg.zza(r18, 1, r1);
        r2 = r22.zza;
        r1 = r24.zza(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0665, code lost:
        if ("length".equals(r1.zzf()) == false) goto L_0x066a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0669, code lost:
        return com.google.android.gms.internal.measurement.zzag.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x066a, code lost:
        r3 = r1.zze().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0678, code lost:
        if (r3 != java.lang.Math.floor(r3)) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x067a, code lost:
        r1 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x067b, code lost:
        if (r1 < 0) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0681, code lost:
        if (r1 >= r2.length()) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0685, code lost:
        return com.google.android.gms.internal.measurement.zzag.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0688, code lost:
        return com.google.android.gms.internal.measurement.zzag.zzi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r3 = r18;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0148, code lost:
        r6 = r16;
        r3 = r18;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018f, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0190, code lost:
        r17 = "toLowerCase";
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0194, code lost:
        switch(r1) {
            case 0: goto L_0x0642;
            case 1: goto L_0x0639;
            case 2: goto L_0x0624;
            case 3: goto L_0x05de;
            case 4: goto L_0x05a5;
            case 5: goto L_0x058d;
            case 6: goto L_0x053c;
            case 7: goto L_0x0528;
            case 8: goto L_0x04c6;
            case 9: goto L_0x04b0;
            case 10: goto L_0x049c;
            case 11: goto L_0x0452;
            case 12: goto L_0x03bc;
            case 13: goto L_0x030b;
            case 14: goto L_0x0291;
            case 15: goto L_0x01fc;
            case 16: goto L_0x01a1;
            default: goto L_0x0197;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0197, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r23, com.google.android.gms.internal.measurement.zzh r24, java.util.List<com.google.android.gms.internal.measurement.zzaq> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r8 = "replace"
            java.lang.String r9 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "match"
            java.lang.String r13 = "lastIndexOf"
            java.lang.String r14 = "toLocaleUpperCase"
            java.lang.String r15 = "search"
            java.lang.String r2 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            java.lang.String r3 = "toString"
            r16 = r4
            java.lang.String r4 = "indexOf"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r14
            java.lang.String r14 = "toUpperCase"
            r19 = r14
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00a4
            r5 = r19
            boolean r19 = r5.equals(r1)
            r14 = r18
            if (r19 != 0) goto L_0x00a8
            boolean r18 = r14.equals(r1)
            if (r18 != 0) goto L_0x00a8
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x00a1
            goto L_0x00ac
        L_0x00a1:
            r17 = 0
            goto L_0x00ae
        L_0x00a4:
            r14 = r18
            r5 = r19
        L_0x00a8:
            r18 = r6
            r6 = r17
        L_0x00ac:
            r17 = 1
        L_0x00ae:
            if (r17 == 0) goto L_0x0689
            r23.hashCode()
            int r17 = r23.hashCode()
            r20 = -1
            r21 = r3
            switch(r17) {
                case -1789698943: goto L_0x017d;
                case -1776922004: goto L_0x016e;
                case -1464939364: goto L_0x015e;
                case -1361633751: goto L_0x014f;
                case -1354795244: goto L_0x013f;
                case -1137582698: goto L_0x0136;
                case -906336856: goto L_0x012d;
                case -726908483: goto L_0x0124;
                case -467511597: goto L_0x011a;
                case -399551817: goto L_0x0110;
                case 3568674: goto L_0x0106;
                case 103668165: goto L_0x00fc;
                case 109526418: goto L_0x00f2;
                case 109648666: goto L_0x00e7;
                case 530542161: goto L_0x00dc;
                case 1094496948: goto L_0x00d1;
                case 1943291465: goto L_0x00c6;
                default: goto L_0x00be;
            }
        L_0x00be:
            r6 = r16
        L_0x00c0:
            r3 = r18
            r7 = r21
            goto L_0x018f
        L_0x00c6:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00cd
            goto L_0x00be
        L_0x00cd:
            r1 = 16
            goto L_0x0148
        L_0x00d1:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x00d8
            goto L_0x00be
        L_0x00d8:
            r1 = 15
            goto L_0x0148
        L_0x00dc:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00be
        L_0x00e3:
            r1 = 14
            goto L_0x0148
        L_0x00e7:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x00ee
            goto L_0x00be
        L_0x00ee:
            r1 = 13
            goto L_0x0148
        L_0x00f2:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x00f9
            goto L_0x00be
        L_0x00f9:
            r1 = 12
            goto L_0x0148
        L_0x00fc:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0103
            goto L_0x00be
        L_0x0103:
            r1 = 11
            goto L_0x0148
        L_0x0106:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x010d
            goto L_0x00be
        L_0x010d:
            r1 = 10
            goto L_0x0148
        L_0x0110:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0117
            goto L_0x00be
        L_0x0117:
            r1 = 9
            goto L_0x0148
        L_0x011a:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0121
            goto L_0x00be
        L_0x0121:
            r1 = 8
            goto L_0x0148
        L_0x0124:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x012b
            goto L_0x00be
        L_0x012b:
            r1 = 7
            goto L_0x0148
        L_0x012d:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0134
            goto L_0x00be
        L_0x0134:
            r1 = 6
            goto L_0x0148
        L_0x0136:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013d
            goto L_0x00be
        L_0x013d:
            r1 = 5
            goto L_0x0148
        L_0x013f:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0147
            goto L_0x00be
        L_0x0147:
            r1 = 4
        L_0x0148:
            r6 = r16
            r3 = r18
            r7 = r21
            goto L_0x0190
        L_0x014f:
            r6 = r16
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0158
            goto L_0x0166
        L_0x0158:
            r3 = r18
            r7 = r21
            r1 = 3
            goto L_0x0190
        L_0x015e:
            r6 = r16
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0168
        L_0x0166:
            goto L_0x00c0
        L_0x0168:
            r3 = r18
            r7 = r21
            r1 = 2
            goto L_0x0190
        L_0x016e:
            r6 = r16
            r7 = r21
            boolean r1 = r1.equals(r7)
            r3 = r18
            if (r1 != 0) goto L_0x017b
            goto L_0x018f
        L_0x017b:
            r1 = 1
            goto L_0x0190
        L_0x017d:
            r6 = r16
            r3 = r18
            r7 = r21
            boolean r1 = r1.equals(r3)
            r17 = r2
            if (r1 != 0) goto L_0x018d
            r1 = -1
            goto L_0x0194
        L_0x018d:
            r1 = 0
            goto L_0x0194
        L_0x018f:
            r1 = -1
        L_0x0190:
            r17 = r2
            r18 = r3
        L_0x0194:
            switch(r1) {
                case 0: goto L_0x0642;
                case 1: goto L_0x0639;
                case 2: goto L_0x0624;
                case 3: goto L_0x05de;
                case 4: goto L_0x05a5;
                case 5: goto L_0x058d;
                case 6: goto L_0x053c;
                case 7: goto L_0x0528;
                case 8: goto L_0x04c6;
                case 9: goto L_0x04b0;
                case 10: goto L_0x049c;
                case 11: goto L_0x0452;
                case 12: goto L_0x03bc;
                case 13: goto L_0x030b;
                case 14: goto L_0x0291;
                case 15: goto L_0x01fc;
                case 16: goto L_0x01a1;
                default: goto L_0x0197;
            }
        L_0x0197:
            r0 = r22
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x01a1:
            r1 = r25
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.zzc(r4, r2, r1)
            r0 = r22
            java.lang.String r2 = r0.zza
            int r3 = r25.size()
            if (r3 > 0) goto L_0x01ba
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r3 = r3.zzf()
            r4 = r24
            goto L_0x01cb
        L_0x01ba:
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            r4 = r24
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            java.lang.String r3 = r3.zzf()
        L_0x01cb:
            int r5 = r25.size()
            r6 = 2
            if (r5 >= r6) goto L_0x01d5
            r4 = 0
            goto L_0x01e8
        L_0x01d5:
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r4 = r1.doubleValue()
        L_0x01e8:
            double r4 = com.google.android.gms.internal.measurement.zzg.zza((double) r4)
            com.google.android.gms.internal.measurement.zzai r1 = new com.google.android.gms.internal.measurement.zzai
            int r4 = (int) r4
            int r2 = r2.indexOf(r3, r4)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            return r1
        L_0x01fc:
            r2 = 2
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r8, r2, r1)
            com.google.android.gms.internal.measurement.zzaq r2 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r2 = r2.zzf()
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.zzc
            boolean r5 = r25.isEmpty()
            if (r5 != 0) goto L_0x0234
            r5 = 0
            java.lang.Object r2 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.String r2 = r2.zzf()
            int r5 = r25.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0234
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
        L_0x0234:
            java.lang.String r1 = r0.zza
            int r5 = r1.indexOf(r2)
            if (r5 >= 0) goto L_0x023d
            return r0
        L_0x023d:
            boolean r6 = r3 instanceof com.google.android.gms.internal.measurement.zzal
            if (r6 == 0) goto L_0x0267
            com.google.android.gms.internal.measurement.zzal r3 = (com.google.android.gms.internal.measurement.zzal) r3
            r6 = 3
            com.google.android.gms.internal.measurement.zzaq[] r6 = new com.google.android.gms.internal.measurement.zzaq[r6]
            com.google.android.gms.internal.measurement.zzas r7 = new com.google.android.gms.internal.measurement.zzas
            r7.<init>(r2)
            r8 = 0
            r6[r8] = r7
            double r9 = (double) r5
            com.google.android.gms.internal.measurement.zzai r7 = new com.google.android.gms.internal.measurement.zzai
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r7.<init>(r9)
            r9 = 1
            r6[r9] = r7
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.zzaq r3 = r3.zza((com.google.android.gms.internal.measurement.zzh) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r6)
            goto L_0x0268
        L_0x0267:
            r8 = 0
        L_0x0268:
            java.lang.String r4 = r1.substring(r8, r5)
            java.lang.String r3 = r3.zzf()
            int r2 = r2.length()
            int r5 = r5 + r2
            java.lang.String r1 = r1.substring(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r3)
            r2.append(r1)
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r1
        L_0x0291:
            r2 = 2
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r9, r2, r1)
            java.lang.String r2 = r0.zza
            boolean r3 = r25.isEmpty()
            if (r3 != 0) goto L_0x02bc
            r3 = 0
            java.lang.Object r5 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r5 = (com.google.android.gms.internal.measurement.zzaq) r5
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r5)
            java.lang.Double r3 = r3.zze()
            double r5 = r3.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzg.zza((double) r5)
            int r3 = (int) r5
            goto L_0x02bd
        L_0x02bc:
            r3 = 0
        L_0x02bd:
            int r5 = r25.size()
            r6 = 1
            if (r5 <= r6) goto L_0x02dc
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r4 = r1.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.zzg.zza((double) r4)
            int r1 = (int) r4
            goto L_0x02e0
        L_0x02dc:
            int r1 = r2.length()
        L_0x02e0:
            r4 = 0
            int r3 = java.lang.Math.max(r3, r4)
            int r5 = r2.length()
            int r3 = java.lang.Math.min(r3, r5)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r2.length()
            int r1 = java.lang.Math.min(r1, r4)
            com.google.android.gms.internal.measurement.zzas r4 = new com.google.android.gms.internal.measurement.zzas
            int r5 = java.lang.Math.min(r3, r1)
            int r1 = java.lang.Math.max(r3, r1)
            java.lang.String r1 = r2.substring(r5, r1)
            r4.<init>(r1)
            return r4
        L_0x030b:
            r2 = 2
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r10, r2, r1)
            java.lang.String r2 = r0.zza
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0329
            r3 = 1
            com.google.android.gms.internal.measurement.zzaq[] r1 = new com.google.android.gms.internal.measurement.zzaq[r3]
            r3 = 0
            r1[r3] = r0
            com.google.android.gms.internal.measurement.zzaf r2 = new com.google.android.gms.internal.measurement.zzaf
            r2.<init>((com.google.android.gms.internal.measurement.zzaq[]) r1)
            return r2
        L_0x0329:
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r25.isEmpty()
            if (r6 == 0) goto L_0x033a
            r5.add(r0)
            goto L_0x03b6
        L_0x033a:
            java.lang.Object r6 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r6 = (com.google.android.gms.internal.measurement.zzaq) r6
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r6)
            java.lang.String r3 = r3.zzf()
            int r6 = r25.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0366
            java.lang.Object r1 = r1.get(r7)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r6 = r1.doubleValue()
            long r6 = com.google.android.gms.internal.measurement.zzg.zzc(r6)
            goto L_0x0369
        L_0x0366:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0369:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0375
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            r1.<init>()
            return r1
        L_0x0375:
            java.lang.String r1 = java.util.regex.Pattern.quote(r3)
            int r4 = (int) r6
            r8 = 1
            int r4 = r4 + r8
            java.lang.String[] r1 = r2.split(r1, r4)
            int r2 = r1.length
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x039e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x039e
            r3 = 0
            r3 = r1[r3]
            boolean r14 = r3.isEmpty()
            int r3 = r1.length
            int r3 = r3 - r8
            r3 = r1[r3]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x039f
            int r2 = r1.length
            int r2 = r2 - r8
            goto L_0x039f
        L_0x039e:
            r14 = 0
        L_0x039f:
            int r3 = r1.length
            long r3 = (long) r3
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x03a7
            int r2 = r2 + -1
        L_0x03a7:
            if (r14 >= r2) goto L_0x03b6
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            r4 = r1[r14]
            r3.<init>(r4)
            r5.add(r3)
            int r14 = r14 + 1
            goto L_0x03a7
        L_0x03b6:
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            r1.<init>((java.util.List<com.google.android.gms.internal.measurement.zzaq>) r5)
            return r1
        L_0x03bc:
            r2 = 2
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r11, r2, r1)
            java.lang.String r2 = r0.zza
            boolean r3 = r25.isEmpty()
            if (r3 != 0) goto L_0x03e2
            r3 = 0
            java.lang.Object r5 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r5 = (com.google.android.gms.internal.measurement.zzaq) r5
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r5)
            java.lang.Double r3 = r3.zze()
            double r5 = r3.doubleValue()
            goto L_0x03e4
        L_0x03e2:
            r5 = 0
        L_0x03e4:
            double r5 = com.google.android.gms.internal.measurement.zzg.zza((double) r5)
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x03f9
            int r3 = r2.length()
            double r9 = (double) r3
            double r9 = r9 + r5
            double r5 = java.lang.Math.max(r9, r7)
            goto L_0x0402
        L_0x03f9:
            int r3 = r2.length()
            double r7 = (double) r3
            double r5 = java.lang.Math.min(r5, r7)
        L_0x0402:
            int r3 = (int) r5
            int r5 = r25.size()
            r6 = 1
            if (r5 <= r6) goto L_0x041d
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r4 = r1.doubleValue()
            goto L_0x0422
        L_0x041d:
            int r1 = r2.length()
            double r4 = (double) r1
        L_0x0422:
            double r4 = com.google.android.gms.internal.measurement.zzg.zza((double) r4)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0437
            int r1 = r2.length()
            double r8 = (double) r1
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x0440
        L_0x0437:
            int r1 = r2.length()
            double r6 = (double) r1
            double r4 = java.lang.Math.min(r4, r6)
        L_0x0440:
            int r1 = (int) r4
            int r1 = r1 - r3
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            com.google.android.gms.internal.measurement.zzas r4 = new com.google.android.gms.internal.measurement.zzas
            int r1 = r1 + r3
            java.lang.String r1 = r2.substring(r3, r1)
            r4.<init>(r1)
            return r4
        L_0x0452:
            r2 = 1
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r12, r2, r1)
            java.lang.String r2 = r0.zza
            int r3 = r25.size()
            if (r3 > 0) goto L_0x0467
            java.lang.String r1 = ""
            goto L_0x0476
        L_0x0467:
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
        L_0x0476:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0499
            r2 = 1
            com.google.android.gms.internal.measurement.zzaq[] r2 = new com.google.android.gms.internal.measurement.zzaq[r2]
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.group()
            r3.<init>(r1)
            r4 = 0
            r2[r4] = r3
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            r1.<init>((com.google.android.gms.internal.measurement.zzaq[]) r2)
            return r1
        L_0x0499:
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzd
            return r1
        L_0x049c:
            r4 = 0
            r0 = r22
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.trim()
            r2.<init>(r1)
            return r2
        L_0x04b0:
            r4 = 0
            r0 = r22
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r5, (int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r3)
            r2.<init>(r1)
            return r2
        L_0x04c6:
            r2 = 2
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r13, r2, r1)
            java.lang.String r2 = r0.zza
            int r3 = r25.size()
            if (r3 > 0) goto L_0x04df
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r3 = r3.zzf()
            goto L_0x04ee
        L_0x04df:
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r3)
            java.lang.String r3 = r3.zzf()
        L_0x04ee:
            int r5 = r25.size()
            r6 = 2
            if (r5 >= r6) goto L_0x04f8
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x050b
        L_0x04f8:
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r4 = r1.doubleValue()
        L_0x050b:
            boolean r1 = java.lang.Double.isNaN(r4)
            if (r1 == 0) goto L_0x0514
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0518
        L_0x0514:
            double r4 = com.google.android.gms.internal.measurement.zzg.zza((double) r4)
        L_0x0518:
            com.google.android.gms.internal.measurement.zzai r1 = new com.google.android.gms.internal.measurement.zzai
            int r4 = (int) r4
            int r2 = r2.lastIndexOf(r3, r4)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            return r1
        L_0x0528:
            r2 = 0
            r0 = r22
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r14, (int) r2, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.toUpperCase()
            r2.<init>(r1)
            return r2
        L_0x053c:
            r2 = 0
            r3 = 1
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r15, r3, r1)
            boolean r3 = r25.isEmpty()
            if (r3 != 0) goto L_0x055c
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r1 = r1.zzf()
            goto L_0x0562
        L_0x055c:
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzc
            java.lang.String r1 = r1.zzf()
        L_0x0562:
            java.lang.String r2 = r0.zza
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0581
            com.google.android.gms.internal.measurement.zzai r2 = new com.google.android.gms.internal.measurement.zzai
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x0581:
            com.google.android.gms.internal.measurement.zzai r1 = new com.google.android.gms.internal.measurement.zzai
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            return r1
        L_0x058d:
            r3 = 0
            r0 = r22
            r1 = r25
            r2 = r17
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r2, (int) r3, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            r2.<init>(r1)
            return r2
        L_0x05a5:
            r0 = r22
            r4 = r24
            r1 = r25
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L_0x05b2
            return r0
        L_0x05b2:
            java.lang.String r2 = r0.zza
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r14 = 0
        L_0x05ba:
            int r2 = r25.size()
            if (r14 >= r2) goto L_0x05d4
            java.lang.Object r2 = r1.get(r14)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            com.google.android.gms.internal.measurement.zzaq r2 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r2)
            java.lang.String r2 = r2.zzf()
            r3.append(r2)
            int r14 = r14 + 1
            goto L_0x05ba
        L_0x05d4:
            com.google.android.gms.internal.measurement.zzas r1 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            return r1
        L_0x05de:
            r2 = 1
            r0 = r22
            r4 = r24
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zzc(r6, r2, r1)
            boolean r2 = r25.isEmpty()
            if (r2 != 0) goto L_0x0607
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.Double r1 = r1.zze()
            double r1 = r1.doubleValue()
            double r1 = com.google.android.gms.internal.measurement.zzg.zza((double) r1)
            int r14 = (int) r1
            goto L_0x0608
        L_0x0607:
            r14 = 0
        L_0x0608:
            java.lang.String r1 = r0.zza
            if (r14 < 0) goto L_0x0621
            int r2 = r1.length()
            if (r14 < r2) goto L_0x0613
            goto L_0x0621
        L_0x0613:
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            char r1 = r1.charAt(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            return r2
        L_0x0621:
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzaq.zzj
            return r1
        L_0x0624:
            r3 = 0
            r1 = r25
            r2 = r0
            r0 = r22
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r2, (int) r3, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r1 = r0.zza
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r1 = r1.toLowerCase()
            r2.<init>(r1)
            return r2
        L_0x0639:
            r3 = 0
            r0 = r22
            r1 = r25
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r7, (int) r3, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            return r0
        L_0x0642:
            r3 = 0
            r5 = 1
            r0 = r22
            r4 = r24
            r1 = r25
            r2 = r18
            com.google.android.gms.internal.measurement.zzg.zza((java.lang.String) r2, (int) r5, (java.util.List<com.google.android.gms.internal.measurement.zzaq>) r1)
            java.lang.String r2 = r0.zza
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzaq r1 = (com.google.android.gms.internal.measurement.zzaq) r1
            com.google.android.gms.internal.measurement.zzaq r1 = r4.zza((com.google.android.gms.internal.measurement.zzaq) r1)
            java.lang.String r3 = r1.zzf()
            java.lang.String r4 = "length"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x066a
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzag.zzh
            return r1
        L_0x066a:
            java.lang.Double r1 = r1.zze()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0686
            int r1 = (int) r3
            if (r1 < 0) goto L_0x0686
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x0686
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzag.zzh
            return r1
        L_0x0686:
            com.google.android.gms.internal.measurement.zzaq r1 = com.google.android.gms.internal.measurement.zzag.zzi
            return r1
        L_0x0689:
            r2 = 1
            r0 = r22
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "%s is not a String function"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String zzf() {
        return this.zza;
    }

    public final String toString() {
        String str = this.zza;
        return "\"" + str + "\"";
    }

    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        return this.zza.equals(((zzas) obj).zza);
    }
}
