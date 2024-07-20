package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

final class zzgc implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzfx zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzfy zzf;

    public zzgc(zzfy zzfy, String str, URL url, byte[] bArr, Map<String, String> map, zzfx zzfx) {
        this.zzf = zzfy;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfx);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzfx;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef A[SYNTHETIC, Splitter:B:49:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d A[SYNTHETIC, Splitter:B:62:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzfy r1 = r14.zzf
            r1.zzr()
            r1 = 0
            r2 = 0
            java.net.URL r3 = r14.zza     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            com.google.android.gms.internal.measurement.zzcd r4 = com.google.android.gms.internal.measurement.zzcd.zza()     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            java.lang.String r5 = "client-measurement"
            java.net.URLConnection r3 = r4.zza(r3, r5)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            if (r4 == 0) goto L_0x00dd
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            r3.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            r4 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r4)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.zze     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            if (r5 == 0) goto L_0x0059
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
        L_0x003d:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r3.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            goto L_0x003d
        L_0x0059:
            byte[] r5 = r14.zzb     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            if (r5 == 0) goto L_0x009e
            com.google.android.gms.measurement.internal.zzfy r5 = r14.zzf     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            com.google.android.gms.measurement.internal.zzmz r5 = r5.g_()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            byte[] r6 = r14.zzb     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            byte[] r5 = r5.zzb((byte[]) r6)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            com.google.android.gms.measurement.internal.zzfy r6 = r14.zzf     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            com.google.android.gms.measurement.internal.zzfr r6 = r6.zzj()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r6.zza(r7, r8)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r3.setDoOutput(r4)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r4, r6)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            int r4 = r5.length     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r3.connect()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            r4.write(r5)     // Catch:{ IOException -> 0x009b, all -> 0x0099 }
            r4.close()     // Catch:{ IOException -> 0x009b, all -> 0x0099 }
            goto L_0x009e
        L_0x0099:
            r5 = move-exception
            goto L_0x00e9
        L_0x009b:
            r5 = move-exception
            goto L_0x0127
        L_0x009e:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00da, all -> 0x00d7 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00d1, all -> 0x00cd }
            com.google.android.gms.measurement.internal.zzfy r1 = r14.zzf     // Catch:{ IOException -> 0x00cb, all -> 0x00c7 }
            byte[] r10 = com.google.android.gms.measurement.internal.zzfy.zza(r3)     // Catch:{ IOException -> 0x00cb, all -> 0x00c7 }
            if (r3 == 0) goto L_0x00b1
            r3.disconnect()
        L_0x00b1:
            com.google.android.gms.measurement.internal.zzfy r0 = r14.zzf
            com.google.android.gms.measurement.internal.zzgy r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzga r1 = new com.google.android.gms.measurement.internal.zzga
            java.lang.String r6 = r14.zzd
            com.google.android.gms.measurement.internal.zzfx r7 = r14.zzc
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.zzb((java.lang.Runnable) r1)
            return
        L_0x00c7:
            r1 = move-exception
            r9 = r8
            r12 = r11
            goto L_0x00ed
        L_0x00cb:
            r1 = move-exception
            goto L_0x00d3
        L_0x00cd:
            r1 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x00ed
        L_0x00d1:
            r1 = move-exception
            r11 = r2
        L_0x00d3:
            r10 = r1
            r9 = r8
            r12 = r11
            goto L_0x012b
        L_0x00d7:
            r4 = move-exception
            r5 = r4
            goto L_0x00e8
        L_0x00da:
            r4 = move-exception
            r5 = r4
            goto L_0x0126
        L_0x00dd:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
            throw r3     // Catch:{ IOException -> 0x0123, all -> 0x00e5 }
        L_0x00e5:
            r3 = move-exception
            r5 = r3
            r3 = r2
        L_0x00e8:
            r4 = r2
        L_0x00e9:
            r12 = r2
            r2 = r4
            r1 = r5
            r9 = 0
        L_0x00ed:
            if (r2 == 0) goto L_0x0107
            r2.close()     // Catch:{ IOException -> 0x00f3 }
            goto L_0x0107
        L_0x00f3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfy r4 = r14.zzf
            com.google.android.gms.measurement.internal.zzfr r4 = r4.zzj()
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()
            java.lang.String r5 = r14.zzd
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)
            r4.zza(r0, r5, r2)
        L_0x0107:
            if (r3 == 0) goto L_0x010c
            r3.disconnect()
        L_0x010c:
            com.google.android.gms.measurement.internal.zzfy r0 = r14.zzf
            com.google.android.gms.measurement.internal.zzgy r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzga r2 = new com.google.android.gms.measurement.internal.zzga
            java.lang.String r7 = r14.zzd
            com.google.android.gms.measurement.internal.zzfx r8 = r14.zzc
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.zzb((java.lang.Runnable) r2)
            throw r1
        L_0x0123:
            r3 = move-exception
            r5 = r3
            r3 = r2
        L_0x0126:
            r4 = r2
        L_0x0127:
            r12 = r2
            r2 = r4
            r10 = r5
            r9 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x0145
            r2.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x0145
        L_0x0131:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzfy r2 = r14.zzf
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()
            java.lang.String r4 = r14.zzd
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r4)
            r2.zza(r0, r4, r1)
        L_0x0145:
            if (r3 == 0) goto L_0x014a
            r3.disconnect()
        L_0x014a:
            com.google.android.gms.measurement.internal.zzfy r0 = r14.zzf
            com.google.android.gms.measurement.internal.zzgy r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzga r1 = new com.google.android.gms.measurement.internal.zzga
            java.lang.String r7 = r14.zzd
            com.google.android.gms.measurement.internal.zzfx r8 = r14.zzc
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.zzb((java.lang.Runnable) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgc.run():void");
    }
}
