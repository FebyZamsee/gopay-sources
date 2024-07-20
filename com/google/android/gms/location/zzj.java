package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzj implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r21)
            android.os.WorkSource r2 = new android.os.WorkSource
            r2.<init>()
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r7 = 102(0x66, float:1.43E-43)
            r18 = r2
            r9 = r4
            r13 = r9
            r17 = r6
            r19 = r17
            r11 = 0
            r12 = 102(0x66, float:1.43E-43)
            r15 = 0
            r16 = 0
        L_0x0022:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x0070
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r21)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0066;
                case 3: goto L_0x0061;
                case 4: goto L_0x005c;
                case 5: goto L_0x0057;
                case 6: goto L_0x004c;
                case 7: goto L_0x0047;
                case 8: goto L_0x0042;
                case 9: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0022
        L_0x0037:
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzd> r3 = com.google.android.gms.internal.location.zzd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r19 = r2
            com.google.android.gms.internal.location.zzd r19 = (com.google.android.gms.internal.location.zzd) r19
            goto L_0x0022
        L_0x0042:
            java.lang.String r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0022
        L_0x0047:
            int r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0022
        L_0x004c:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r18 = r2
            android.os.WorkSource r18 = (android.os.WorkSource) r18
            goto L_0x0022
        L_0x0057:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0022
        L_0x005c:
            long r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0022
        L_0x0061:
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0022
        L_0x0066:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0022
        L_0x006b:
            long r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0022
        L_0x0070:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.location.CurrentLocationRequest r0 = new com.google.android.gms.location.CurrentLocationRequest
            r8 = r0
            r8.<init>(r9, r11, r12, r13, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzj.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
