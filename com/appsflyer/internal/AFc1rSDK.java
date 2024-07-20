package com.appsflyer.internal;

import android.util.Base64;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;
import o.cancelAuthentication;
import org.json.JSONObject;

public final class AFc1rSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK((DefaultConstructorMarker) null);
    final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    int AFKeystoreWrapper;
    public final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1rSDK)) {
            return false;
        }
        AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.AFInAppEventType, aFc1rSDK.AFInAppEventType) && Intrinsics.RemoteActionCompatParcelizer(this.AFInAppEventParameterName, aFc1rSDK.AFInAppEventParameterName) && Intrinsics.RemoteActionCompatParcelizer(this.values, aFc1rSDK.values) && this.AFKeystoreWrapper == aFc1rSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((((this.AFInAppEventType.hashCode() * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AFKeystoreWrapper;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFc1rSDK(valueOf=");
        sb.append(this.AFInAppEventType);
        sb.append(", values=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.values);
        sb.append(", AFInAppEventType=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(')');
        return sb.toString();
    }

    public AFc1rSDK(String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.values = str3;
        this.AFKeystoreWrapper = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AFc1rSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    public static final class AFa1vSDK {
        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1vSDK() {
        }

        public static AFc1rSDK AFInAppEventParameterName(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> onTransact = BiometricFragment.AnonymousClass5.onTransact((CharSequence) str, new String[]{"\n"}, false, 0);
            if (onTransact.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            for (String next : onTransact) {
                if (!BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(next, "label=", false)) {
                    if (!BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(next, "hashName=", false)) {
                        if (!BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(next, "stackTrace=", false)) {
                            if (!BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(next, "c=", false)) {
                                break;
                            }
                            String substring = next.substring(2);
                            Intrinsics.checkNotNullExpressionValue(substring, "");
                            num = Integer.valueOf(Integer.parseInt(BiometricFragment.AnonymousClass5.onTransact(substring).toString()));
                        } else {
                            str3 = AFKeystoreWrapper(next, "stackTrace=");
                        }
                    } else {
                        str2 = AFKeystoreWrapper(next, "hashName=");
                    }
                } else {
                    str4 = AFKeystoreWrapper(next, "label=");
                }
            }
            if (AFInAppEventParameterName(num, str4, str2, str3)) {
                return null;
            }
            Intrinsics.onTransact((Object) str4);
            Intrinsics.onTransact((Object) str2);
            Intrinsics.onTransact((Object) str3);
            Intrinsics.onTransact((Object) num);
            return new AFc1rSDK(str4, str2, str3, num.intValue());
        }

        private static boolean AFInAppEventParameterName(Integer num, String... strArr) {
            boolean z;
            boolean z2 = num == null;
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (!z2) {
                    CharSequence charSequence = str;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        z = false;
                    }
                }
                z = true;
            }
            return z2;
        }

        private static String AFKeystoreWrapper(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = BiometricFragment.AnonymousClass5.onTransact(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            byte[] bytes = obj.getBytes(cancelAuthentication.onTransact);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, cancelAuthentication.onTransact);
        }
    }

    public final JSONObject values() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.AFInAppEventParameterName);
        jSONObject.put("st", this.values);
        jSONObject.put("c", String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }
}
