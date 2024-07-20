package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzv implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r6 = r2
            r10 = r4
            r11 = r10
            r8 = 0
            r9 = 0
        L_0x0010:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x004f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L_0x004a
            r3 = 2
            if (r2 == r3) goto L_0x0045
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r3 = 4
            if (r2 == r3) goto L_0x003b
            r3 = 5
            if (r2 == r3) goto L_0x0031
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto L_0x0010
        L_0x0031:
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzd> r2 = com.google.android.gms.internal.location.zzd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r11 = r1
            com.google.android.gms.internal.location.zzd r11 = (com.google.android.gms.internal.location.zzd) r11
            goto L_0x0010
        L_0x003b:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto L_0x0010
        L_0x0040:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            goto L_0x0010
        L_0x0045:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto L_0x0010
        L_0x004a:
            long r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            goto L_0x0010
        L_0x004f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.location.LastLocationRequest r13 = new com.google.android.gms.location.LastLocationRequest
            r5 = r13
            r5.<init>(r6, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzv.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
