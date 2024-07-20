package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

@Deprecated
public class StatsUtils {
    public static String getEventKey(PowerManager.WakeLock wakeLock, String str) {
        long myPid = (long) Process.myPid();
        long identityHashCode = (long) System.identityHashCode(wakeLock);
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(String.valueOf((myPid << 32) | identityHashCode)).concat(String.valueOf(str));
    }
}
