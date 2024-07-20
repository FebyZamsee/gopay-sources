package com.google.android.gms.auth.api.identity;

import android.os.Parcelable;

public final class zbg implements Parcelable.Creator<SaveAccountLinkingTokenRequest> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000a:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0049
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r2 == r8) goto L_0x003f
            r8 = 2
            if (r2 == r8) goto L_0x003a
            r8 = 3
            if (r2 == r8) goto L_0x0035
            r8 = 4
            if (r2 == r8) goto L_0x0030
            r8 = 5
            if (r2 == r8) goto L_0x002b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto L_0x000a
        L_0x002b:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto L_0x000a
        L_0x0030:
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r10, r1)
            goto L_0x000a
        L_0x0035:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto L_0x000a
        L_0x003a:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto L_0x000a
        L_0x003f:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r3 = r1
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            goto L_0x000a
        L_0x0049:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r10 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.zbg.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
