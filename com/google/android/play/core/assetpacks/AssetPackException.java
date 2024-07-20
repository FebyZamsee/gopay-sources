package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.j;

public class AssetPackException extends j {
    private final int asInterface;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AssetPackException(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = o.onSubDecorInstalled.RemoteActionCompatParcelizer.asInterface
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L_0x0019
            java.lang.String r1 = ""
            goto L_0x0053
        L_0x0019:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.Integer, java.lang.String> r3 = o.onSubDecorInstalled.RemoteActionCompatParcelizer.read
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 113
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            int r4 = r4 + r5
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x0053:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>((java.lang.String) r0)
            if (r7 == 0) goto L_0x0064
            r6.asInterface = r7
            return
        L_0x0064:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.AssetPackException.<init>(int):void");
    }
}
