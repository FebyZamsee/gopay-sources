package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzw implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r17)
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r12 = r3
            r14 = r5
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 1
            r11 = 1
            r15 = 0
        L_0x0014:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L_0x004c
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r17)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x0047;
                case 2: goto L_0x0042;
                case 3: goto L_0x003d;
                case 4: goto L_0x0038;
                case 5: goto L_0x002e;
                case 6: goto L_0x0029;
                default: goto L_0x0025;
            }
        L_0x0025:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0014
        L_0x0029:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0014
        L_0x002e:
            android.os.Parcelable$Creator<com.google.android.gms.location.zzac> r3 = com.google.android.gms.location.zzac.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            r14 = r2
            com.google.android.gms.location.zzac[] r14 = (com.google.android.gms.location.zzac[]) r14
            goto L_0x0014
        L_0x0038:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0014
        L_0x003d:
            long r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0014
        L_0x0042:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0014
        L_0x0047:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0014
        L_0x004c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.location.LocationAvailability r0 = new com.google.android.gms.location.LocationAvailability
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzw.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
