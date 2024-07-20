package com.google.android.gms.internal.location;

import android.os.Parcelable;

public final class zze implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            com.google.android.gms.internal.location.zzds r1 = com.google.android.gms.internal.location.zzds.zzk()
            r2 = 0
            r3 = 0
            r11 = r1
            r7 = r3
            r8 = r7
            r9 = r8
            r12 = r9
            r5 = 0
            r6 = 0
            r10 = 0
        L_0x0012:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0056
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L_0x0051;
                case 2: goto L_0x004c;
                case 3: goto L_0x0047;
                case 4: goto L_0x0042;
                case 5: goto L_0x003d;
                case 6: goto L_0x0038;
                case 7: goto L_0x002e;
                case 8: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto L_0x0012
        L_0x0027:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r2 = com.google.android.gms.common.Feature.CREATOR
            java.util.ArrayList r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r14, r1, r2)
            goto L_0x0012
        L_0x002e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzd> r2 = com.google.android.gms.internal.location.zzd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r12 = r1
            com.google.android.gms.internal.location.zzd r12 = (com.google.android.gms.internal.location.zzd) r12
            goto L_0x0012
        L_0x0038:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto L_0x0012
        L_0x003d:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto L_0x0012
        L_0x0042:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto L_0x0012
        L_0x0047:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto L_0x0012
        L_0x004c:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto L_0x0012
        L_0x0051:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto L_0x0012
        L_0x0056:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.internal.location.zzd r14 = new com.google.android.gms.internal.location.zzd
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zze.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
