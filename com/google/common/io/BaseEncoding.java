package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import o.AppCompatRatingBar;
import o.setOnBackInvokedDispatcher;

public abstract class BaseEncoding {

    public static final class DecodingException extends IOException {
    }

    BaseEncoding() {
    }

    static {
        new read("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new read("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new onTransact("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new onTransact("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new RemoteActionCompatParcelizer("base16()", "0123456789ABCDEF");
    }

    static final class asBinder {
        private int AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        private final boolean[] IconCompatParcelizer;
        final int RemoteActionCompatParcelizer;
        final char[] asBinder;
        final byte[] asInterface;
        private int onTransact;
        private int read;

        asBinder(String str, char[] cArr) {
            int i;
            this.AudioAttributesImplApi26Parcelizer = str;
            this.asBinder = cArr;
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                if (length > 0) {
                    switch (AppCompatRatingBar.AnonymousClass3.onTransact[roundingMode.ordinal()]) {
                        case 1:
                            if (!(length > 0) || !(((length + -1) & length) == 0)) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
                            i = 32 - Integer.numberOfLeadingZeros(length - 1);
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                            i = (31 - numberOfLeadingZeros) + ((~(~((-1257966797 >>> numberOfLeadingZeros) - length))) >>> 31);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    i = 31 - Integer.numberOfLeadingZeros(length);
                    this.RemoteActionCompatParcelizer = i;
                    int min = Math.min(8, Integer.lowestOneBit(i));
                    try {
                        this.read = 8 / min;
                        this.onTransact = i / min;
                        this.AudioAttributesImplApi21Parcelizer = cArr.length - 1;
                        byte[] bArr = new byte[128];
                        Arrays.fill(bArr, (byte) -1);
                        int i2 = 0;
                        while (i2 < cArr.length) {
                            char c = cArr[i2];
                            if (c < 128) {
                                if (bArr[c] == -1) {
                                    bArr[c] = (byte) i2;
                                    i2++;
                                } else {
                                    throw new IllegalArgumentException(setOnBackInvokedDispatcher.RemoteActionCompatParcelizer("Duplicate character: %s", Character.valueOf(c)));
                                }
                            } else {
                                throw new IllegalArgumentException(setOnBackInvokedDispatcher.RemoteActionCompatParcelizer("Non-ASCII character: %s", Character.valueOf(c)));
                            }
                        }
                        this.asInterface = bArr;
                        boolean[] zArr = new boolean[this.read];
                        for (int i3 = 0; i3 < this.onTransact; i3++) {
                            zArr[AppCompatRatingBar.read(i3 << 3, this.RemoteActionCompatParcelizer, RoundingMode.CEILING)] = true;
                        }
                        this.IconCompatParcelizer = zArr;
                    } catch (ArithmeticException e) {
                        String str2 = new String(cArr);
                        throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("x".length() + 26);
                    sb.append("x");
                    sb.append(" (");
                    sb.append(length);
                    sb.append(") must be > 0");
                    throw new IllegalArgumentException(sb.toString());
                }
            } catch (ArithmeticException e2) {
                int length2 = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length2);
                throw new IllegalArgumentException(sb2.toString(), e2);
            }
        }

        public final String toString() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof asBinder) {
                return Arrays.equals(this.asBinder, ((asBinder) obj).asBinder);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.asBinder);
        }
    }

    static class onTransact extends BaseEncoding {
        private Character RemoteActionCompatParcelizer;
        private asBinder asBinder;

        onTransact(String str, String str2, Character ch) {
            this(new asBinder(str, str2.toCharArray()), ch);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        onTransact(com.google.common.io.BaseEncoding.asBinder r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                r0 = r5
                com.google.common.io.BaseEncoding$asBinder r0 = (com.google.common.io.BaseEncoding.asBinder) r0
                r4.asBinder = r0
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0021
                char r2 = r6.charValue()
                byte[] r5 = r5.asInterface
                int r3 = r5.length
                if (r2 >= r3) goto L_0x001c
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x001c
                r5 = 1
                goto L_0x001d
            L_0x001c:
                r5 = 0
            L_0x001d:
                if (r5 == 0) goto L_0x0021
                r5 = 0
                goto L_0x0022
            L_0x0021:
                r5 = 1
            L_0x0022:
                if (r5 == 0) goto L_0x0027
                r4.RemoteActionCompatParcelizer = r6
                return
            L_0x0027:
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r0] = r6
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Padding character %s was already in alphabet"
                java.lang.String r5 = o.setOnBackInvokedDispatcher.RemoteActionCompatParcelizer((java.lang.String) r0, (java.lang.Object[]) r5)
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.onTransact.<init>(com.google.common.io.BaseEncoding$asBinder, java.lang.Character):void");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.asBinder.toString());
            if (8 % this.asBinder.RemoteActionCompatParcelizer != 0) {
                if (this.RemoteActionCompatParcelizer == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.RemoteActionCompatParcelizer);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof onTransact) {
                onTransact ontransact = (onTransact) obj;
                if (this.asBinder.equals(ontransact.asBinder)) {
                    Character ch = this.RemoteActionCompatParcelizer;
                    Character ch2 = ontransact.RemoteActionCompatParcelizer;
                    if (ch == ch2 || (ch != null && ch.equals(ch2))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return this.asBinder.hashCode() ^ Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer});
        }
    }

    static final class RemoteActionCompatParcelizer extends onTransact {
        private char[] asBinder;

        RemoteActionCompatParcelizer(String str, String str2) {
            this(new asBinder(str, str2.toCharArray()));
        }

        private RemoteActionCompatParcelizer(asBinder asbinder) {
            super(asbinder, (Character) null);
            this.asBinder = new char[512];
            if (asbinder.asBinder.length == 16) {
                for (int i = 0; i < 256; i++) {
                    this.asBinder[i] = asbinder.asBinder[i >>> 4];
                    this.asBinder[i | 256] = asbinder.asBinder[i & 15];
                }
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    static final class read extends onTransact {
        read(String str, String str2, Character ch) {
            this(new asBinder(str, str2.toCharArray()), ch);
        }

        private read(asBinder asbinder, Character ch) {
            super(asbinder, ch);
            if (!(asbinder.asBinder.length == 64)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
