package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzc implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r19) {
        /*
            r18 = this;
            r0 = r19
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r19)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = r3
            r15 = r7
            r10 = r5
            r11 = r10
            r12 = r11
            r14 = r12
            r17 = r14
            r9 = 0
            r13 = 0
        L_0x0014:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L_0x005b
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r19)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0051;
                case 3: goto L_0x0047;
                case 4: goto L_0x0042;
                case 5: goto L_0x003d;
                case 6: goto L_0x0038;
                case 7: goto L_0x0033;
                case 8: goto L_0x002e;
                case 9: goto L_0x0029;
                default: goto L_0x0025;
            }
        L_0x0025:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0014
        L_0x0029:
            java.lang.String r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0014
        L_0x002e:
            long r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0014
        L_0x0033:
            java.lang.String r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0014
        L_0x0038:
            boolean r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0014
        L_0x003d:
            int[] r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r0, r2)
            goto L_0x0014
        L_0x0042:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0014
        L_0x0047:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r10 = r2
            android.os.WorkSource r10 = (android.os.WorkSource) r10
            goto L_0x0014
        L_0x0051:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0014
        L_0x0056:
            long r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0014
        L_0x005b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.location.zzb r0 = new com.google.android.gms.location.zzb
            r6 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzc.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
