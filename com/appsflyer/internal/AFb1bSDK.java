package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public interface AFb1bSDK {
    AFa1vSDK valueOf(Context context);

    public static final class AFa1vSDK {
        public final float AFKeystoreWrapper;
        public final String valueOf;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Intrinsics.RemoteActionCompatParcelizer(Float.valueOf(this.AFKeystoreWrapper), Float.valueOf(aFa1vSDK.AFKeystoreWrapper)) && Intrinsics.RemoteActionCompatParcelizer(this.valueOf, aFa1vSDK.valueOf);
        }

        public final int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.AFKeystoreWrapper);
            String str = this.valueOf;
            return (floatToIntBits * 31) + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.AFKeystoreWrapper);
            sb.append(", charging=");
            sb.append(this.valueOf);
            sb.append(')');
            return sb.toString();
        }

        public AFa1vSDK(float f, String str) {
            this.AFKeystoreWrapper = f;
            this.valueOf = str;
        }
    }
}
