package com.appsflyer.internal;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAuthentication;

public final class AFc1fSDK {
    public static final String AFInAppEventParameterName(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    static final String valueOf(String str, String str2) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = instance.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte valueOf : digest) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(valueOf)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            sb.append(format);
            str3 = sb.toString();
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int valueOf(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?"
            r1.<init>((java.lang.String) r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.regex.Pattern r1 = r1.read
            java.util.regex.Matcher r1 = r1.matcher(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0022
            r5 = 0
            goto L_0x002a
        L_0x0022:
            o.showFingerprintErrorMessage r2 = new o.showFingerprintErrorMessage
            r2.<init>(r1, r5)
            r5 = r2
            kotlin.text.MatchResult r5 = (kotlin.text.MatchResult) r5
        L_0x002a:
            if (r5 == 0) goto L_0x008f
            o.authenticateWithFingerprint r1 = r5.RemoteActionCompatParcelizer()
            r2 = 1
            kotlin.text.MatchGroup r1 = r1.asBinder(r2)
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r1.asInterface
            if (r1 == 0) goto L_0x004a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Integer r1 = o.BiometricFragment.AnonymousClass5.onTransact(r1)
            if (r1 == 0) goto L_0x004a
            int r1 = r1.intValue()
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            o.authenticateWithFingerprint r3 = r5.RemoteActionCompatParcelizer()
            r4 = 2
            kotlin.text.MatchGroup r3 = r3.asBinder(r4)
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = r3.asInterface
            if (r3 == 0) goto L_0x0068
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r3 = o.BiometricFragment.AnonymousClass5.onTransact(r3)
            if (r3 == 0) goto L_0x0068
            int r3 = r3.intValue()
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            o.authenticateWithFingerprint r5 = r5.RemoteActionCompatParcelizer()
            r4 = 3
            kotlin.text.MatchGroup r5 = r5.asBinder(r4)
            if (r5 == 0) goto L_0x0085
            java.lang.String r5 = r5.asInterface
            if (r5 == 0) goto L_0x0085
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Integer r5 = o.BiometricFragment.AnonymousClass5.onTransact(r5)
            if (r5 == 0) goto L_0x0085
            int r2 = r5.intValue()
        L_0x0085:
            r5 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r5
            int r3 = r3 * 1000
            int r1 = r1 + r3
            int r1 = r1 + r2
            return r1
        L_0x008f:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.valueOf(java.lang.String):int");
    }
}
