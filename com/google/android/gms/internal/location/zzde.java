package com.google.android.gms.internal.location;

import android.os.Parcelable;

public final class zzde implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r18)
            r2 = 0
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r3
            r8 = r7
            r11 = r8
            r14 = r11
            r15 = r4
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
        L_0x0016:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0065
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r18)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L_0x005b
            r4 = 5
            if (r3 == r4) goto L_0x0054
            switch(r3) {
                case 8: goto L_0x004f;
                case 9: goto L_0x004a;
                case 10: goto L_0x0045;
                case 11: goto L_0x0040;
                case 12: goto L_0x003b;
                case 13: goto L_0x0036;
                case 14: goto L_0x0031;
                default: goto L_0x002d;
            }
        L_0x002d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0016
        L_0x0031:
            long r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0016
        L_0x0036:
            java.lang.String r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0016
        L_0x003b:
            boolean r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x0040:
            boolean r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x0045:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0016
        L_0x004a:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x004f:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0016
        L_0x0054:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.ClientIdentity> r3 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r0, r2, r3)
            goto L_0x0016
        L_0x005b:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r3 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r7 = r2
            com.google.android.gms.location.LocationRequest r7 = (com.google.android.gms.location.LocationRequest) r7
            goto L_0x0016
        L_0x0065:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.location.zzdd r0 = new com.google.android.gms.internal.location.zzdd
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzde.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
