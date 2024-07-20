package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFb1wSDK {
    public String AFInAppEventParameterName;
    public AFd1kSDK AFInAppEventType;
    String AFKeystoreWrapper;
    private byte[] valueOf;
    public String values;

    public AFb1wSDK(String str, byte[] bArr, String str2, AFd1kSDK aFd1kSDK) {
        this.values = str;
        this.valueOf = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = aFd1kSDK;
    }

    public AFb1wSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.values = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.valueOf = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.AFInAppEventType = AFd1kSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final byte[] AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFb1wSDK aFb1wSDK = (AFb1wSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFb1wSDK.AFKeystoreWrapper != null : !str.equals(aFb1wSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.valueOf, aFb1wSDK.valueOf)) {
                return false;
            }
            String str2 = this.values;
            if (str2 == null ? aFb1wSDK.values != null : !str2.equals(aFb1wSDK.values)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? aFb1wSDK.AFInAppEventParameterName != null : !str3.equals(aFb1wSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (this.AFInAppEventType == aFb1wSDK.AFInAppEventType) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.valueOf);
        String str2 = this.values;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AFInAppEventParameterName;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        AFd1kSDK aFd1kSDK = this.AFInAppEventType;
        if (aFd1kSDK != null) {
            i = aFd1kSDK.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }
}
