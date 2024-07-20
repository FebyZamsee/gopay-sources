package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFb1fSDK;

public class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    public static void afInfoLog(String str, boolean z) {
        if (values(LogLevel.INFO)) {
            values(str, false);
        }
        if (z) {
            AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType("I", values(str, true));
        }
    }

    private static String values(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFInAppEventParameterName);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        long j;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getSimpleName());
            sb.append(" at ");
            sb.append(th.getStackTrace()[0].toString());
            str = sb.toString();
        }
        if (values(LogLevel.ERROR)) {
            values(str, false);
        }
        AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType(th);
        if (AFb1fSDK.AFKeystoreWrapper != null) {
            SharedPreferences.Editor edit = AFa1dSDK.AFInAppEventParameterName((Context) AFb1fSDK.AFKeystoreWrapper).edit();
            if (AFb1fSDK.AFKeystoreWrapper == null) {
                j = -1;
            } else {
                j = AFa1dSDK.AFInAppEventParameterName((Context) AFb1fSDK.AFKeystoreWrapper).getLong("exception_number", 0);
            }
            edit.putLong("exception_number", j + 1).apply();
        }
        if (z3) {
            AFa1dSDK.valueOf().values().onDeepLinking().AFInAppEventType(th, str);
        }
    }

    public static void valueOf(String str) {
        if (values(LogLevel.WARNING)) {
            values(str, false);
        }
        AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType(ExifInterface.LONGITUDE_WEST, values(str, true));
    }

    public static void afRDLog(String str) {
        if (values(LogLevel.VERBOSE)) {
            values(str, false);
        }
        AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, values(str, true));
    }

    private static boolean values(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFKeystoreWrapper(String str) {
        if (!valueOf()) {
            values(str, false);
        }
        AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType("F", str);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afErrorLog(String str, Throwable th) {
        afErrorLog(str, th, true, false, true);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th) {
        afErrorLogForExcManagerOnly(str, th, false);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        afErrorLog(str, th, false, false, !z);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        afErrorLog(str, th, true, z, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        afErrorLog(str, th, true, z, z2);
    }

    @Deprecated
    public static void afErrorLog(Throwable th) {
        afErrorLogForExcManagerOnly("Unknown", th);
    }

    public static void afWarnLog(String str) {
        valueOf(str);
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventType;

        private LogLevel(int i) {
            this.AFInAppEventType = i;
        }

        public final int getLevel() {
            return this.AFInAppEventType;
        }
    }

    public static void afDebugLog(String str) {
        if (values(LogLevel.DEBUG)) {
            values(str, false);
        }
        AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly().AFInAppEventType("D", values(str, true));
    }
}
