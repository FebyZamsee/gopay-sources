package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class DynamicLinkDataCreator implements Parcelable.Creator<DynamicLinkData> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.dynamiclinks.internal.DynamicLinkData createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = r1
            r7 = r6
            r11 = r7
            r12 = r11
            r9 = r2
            r8 = 0
        L_0x000e:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0046
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003c;
                case 3: goto L_0x0037;
                case 4: goto L_0x0032;
                case 5: goto L_0x002d;
                case 6: goto L_0x0023;
                default: goto L_0x001f;
            }
        L_0x001f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto L_0x000e
        L_0x0023:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r12 = r1
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x000e
        L_0x002d:
            android.os.Bundle r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r14, r1)
            goto L_0x000e
        L_0x0032:
            long r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r1)
            goto L_0x000e
        L_0x0037:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            goto L_0x000e
        L_0x003c:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto L_0x000e
        L_0x0041:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            goto L_0x000e
        L_0x0046:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.firebase.dynamiclinks.internal.DynamicLinkData r14 = new com.google.firebase.dynamiclinks.internal.DynamicLinkData
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.internal.DynamicLinkDataCreator.createFromParcel(android.os.Parcel):com.google.firebase.dynamiclinks.internal.DynamicLinkData");
    }

    public DynamicLinkData[] newArray(int i) {
        return new DynamicLinkData[i];
    }

    static void writeToParcel(DynamicLinkData dynamicLinkData, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, dynamicLinkData.getDynamicLink(), false);
        SafeParcelWriter.writeString(parcel, 2, dynamicLinkData.getDeepLink(), false);
        SafeParcelWriter.writeInt(parcel, 3, dynamicLinkData.getMinVersion());
        SafeParcelWriter.writeLong(parcel, 4, dynamicLinkData.getClickTimestamp());
        SafeParcelWriter.writeBundle(parcel, 5, dynamicLinkData.getExtensionBundle(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, dynamicLinkData.getRedirectUrl(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
