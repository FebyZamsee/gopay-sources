package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.j;

public class SplitInstallException extends j {
    public final int RemoteActionCompatParcelizer;

    public final int onTransact() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SplitInstallException(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = o.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0.asBinder
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L_0x0057
            java.util.Map<java.lang.Integer, java.lang.String> r3 = o.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0.asInterface
            boolean r4 = r3.containsKey(r2)
            if (r4 == 0) goto L_0x0057
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 118
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            int r4 = r4 + r5
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x0059
        L_0x0057:
            java.lang.String r1 = ""
        L_0x0059:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Split Install Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>((java.lang.String) r0)
            if (r7 == 0) goto L_0x006a
            r6.RemoteActionCompatParcelizer = r7
            return
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.SplitInstallException.<init>(int):void");
    }
}
