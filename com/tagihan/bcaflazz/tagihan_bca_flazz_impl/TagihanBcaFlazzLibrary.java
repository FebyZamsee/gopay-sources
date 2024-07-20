package com.tagihan.bcaflazz.tagihan_bca_flazz_impl;

import android.nfc.tech.IsoDep;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TagihanBcaFlazzLibrary {
    public static final asInterface Companion = new asInterface((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private IsoDep isoDep;

    public final native int C_BCACheckBalance();

    public final native String C_BCACheckMutation();

    public final native String C_BCADataReversal(String str, String str2);

    public final native String C_BCADataSession1(String str, String str2, String str3);

    public final native String C_BCADataSession2(String str);

    public final native String C_BCAGetConfig();

    public final native String C_BCAIsMyCard();

    public final native String C_BCALastTopUp();

    public final native String C_BCASetConfig(String str);

    public final native String C_BCATopUp1(String str, String str2, String str3, String str4, String str5, int i);

    public final native String C_BCATopUp2(String str);

    public final native String C_BCAVersionDll();

    public final native String C_SayHello();

    public TagihanBcaFlazzLibrary() {
        System.loadLibrary("ee94e7");
    }

    public final IsoDep getIsoDep() {
        return this.isoDep;
    }

    public final void setIsoDep(IsoDep isoDep2) {
        this.isoDep = isoDep2;
    }

    public final String sendContactlessAPDU(String str, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        byte[] bArr = new byte[((length + 1) / 2)];
        if (length % 2 == 1) {
            bArr[0] = (byte) asInterface.asInterface(str.charAt(0));
            i3 = 1;
            i2 = 1;
        } else {
            i3 = 0;
            i2 = 0;
        }
        while (i3 < length) {
            int i4 = i3 + 1;
            bArr[i2] = (byte) ((asInterface.asInterface(str.charAt(i3)) << 4) | asInterface.asInterface(str.charAt(i4)));
            i2++;
            i3 = i4 + 1;
        }
        try {
            IsoDep isoDep2 = this.isoDep;
            byte[] transceive = isoDep2 != null ? isoDep2.transceive(bArr) : null;
            Intrinsics.onTransact((Object) transceive);
            char[] cArr = new char[(r0 << 1)];
            int i5 = 0;
            for (byte b : transceive) {
                int i6 = i5 + 1;
                cArr[i5] = asInterface.asBinder()[(b >>> 4) & 15];
                i5 = i6 + 1;
                cArr[i6] = asInterface.asBinder()[b & 15];
            }
            String upperCase = new String(cArr).toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return upperCase;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final class asInterface {
        public /* synthetic */ asInterface(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private asInterface() {
        }

        public static char[] asBinder() {
            return TagihanBcaFlazzLibrary.HEX_DIGITS;
        }

        public static int asInterface(char c) {
            if (Intrinsics.asBinder((int) c, 48) >= 0 && Intrinsics.asBinder((int) c, 57) <= 0) {
                return c - '0';
            }
            if (Intrinsics.asBinder((int) c, 65) >= 0 && Intrinsics.asBinder((int) c, 70) <= 0) {
                return (c - 'A') + 10;
            }
            if (Intrinsics.asBinder((int) c, 97) < 0 || Intrinsics.asBinder((int) c, 102) > 0) {
                return 0;
            }
            return (c - 'a') + 10;
        }
    }
}
