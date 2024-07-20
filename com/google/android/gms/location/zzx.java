package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzx implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r42) {
        /*
            r41 = this;
            r0 = r42
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r42)
            android.os.WorkSource r2 = new android.os.WorkSource
            r2.<init>()
            r3 = 0
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            r6 = 600000(0x927c0, double:2.964394E-318)
            r8 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = -1
            r14 = 0
            r15 = 102(0x66, float:1.43E-43)
            r16 = 2147483647(0x7fffffff, float:NaN)
            r17 = 0
            r39 = r2
            r20 = r4
            r22 = r6
            r24 = r8
            r26 = r10
            r28 = r26
            r33 = r12
            r37 = r14
            r40 = r37
            r19 = 102(0x66, float:1.43E-43)
            r30 = 2147483647(0x7fffffff, float:NaN)
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r38 = 0
        L_0x0044:
            int r2 = r42.dataPosition()
            if (r2 >= r1) goto L_0x00b5
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r42)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a6;
                case 4: goto L_0x0055;
                case 5: goto L_0x00a1;
                case 6: goto L_0x009c;
                case 7: goto L_0x0097;
                case 8: goto L_0x0092;
                case 9: goto L_0x008d;
                case 10: goto L_0x0088;
                case 11: goto L_0x0083;
                case 12: goto L_0x007e;
                case 13: goto L_0x0079;
                case 14: goto L_0x0074;
                case 15: goto L_0x006f;
                case 16: goto L_0x0064;
                case 17: goto L_0x0059;
                default: goto L_0x0055;
            }
        L_0x0055:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0044
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzd> r3 = com.google.android.gms.internal.location.zzd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r40 = r2
            com.google.android.gms.internal.location.zzd r40 = (com.google.android.gms.internal.location.zzd) r40
            goto L_0x0044
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r39 = r2
            android.os.WorkSource r39 = (android.os.WorkSource) r39
            goto L_0x0044
        L_0x006f:
            boolean r38 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0044
        L_0x0074:
            java.lang.String r37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0044
        L_0x0079:
            int r36 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0044
        L_0x007e:
            int r35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0044
        L_0x0083:
            long r33 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x0088:
            long r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x008d:
            boolean r32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0044
        L_0x0092:
            long r24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x0097:
            float r31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L_0x0044
        L_0x009c:
            int r30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0044
        L_0x00a1:
            long r26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x00a6:
            long r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x00ab:
            long r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0044
        L_0x00b0:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0044
        L_0x00b5:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.location.LocationRequest r0 = new com.google.android.gms.location.LocationRequest
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzx.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
