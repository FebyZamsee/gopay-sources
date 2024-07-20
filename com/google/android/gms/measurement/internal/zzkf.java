package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

public final class zzkf {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ IOException | ClassNotFoundException -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[Catch:{ IOException | ClassNotFoundException -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object zza(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0033 }
            r1.<init>()     // Catch:{ all -> 0x0033 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0042 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0042 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0037
        L_0x002f:
            r4 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x0037
        L_0x0033:
            r4 = move-exception
            r1 = r4
            r4 = r0
            r2 = r4
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0042 }
        L_0x003c:
            if (r4 == 0) goto L_0x0041
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0042 }
        L_0x0041:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkf.zza(java.lang.Object):java.lang.Object");
    }

    public static String zza(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
