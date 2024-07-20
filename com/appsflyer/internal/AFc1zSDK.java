package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

public final class AFc1zSDK implements AFb1aSDK {
    private final SharedPreferences AFInAppEventParameterName;

    public AFc1zSDK(SharedPreferences sharedPreferences) {
        this.AFInAppEventParameterName = sharedPreferences;
    }

    public final void AFKeystoreWrapper(String str, String str2) {
        this.AFInAppEventParameterName.edit().putString(str, str2).apply();
    }

    public final String AFInAppEventParameterName(String str, String str2) {
        try {
            return this.AFInAppEventParameterName.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    public final boolean values(String str) {
        try {
            return this.AFInAppEventParameterName.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    public final void values(String str, boolean z) {
        this.AFInAppEventParameterName.edit().putBoolean(str, z).apply();
    }

    public final long values(String str, long j) {
        try {
            return this.AFInAppEventParameterName.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    public final void AFInAppEventType(String str, long j) {
        this.AFInAppEventParameterName.edit().putLong(str, j).apply();
    }

    public final void valueOf(String str, int i) {
        this.AFInAppEventParameterName.edit().putInt(str, i).apply();
    }

    public final int AFInAppEventType(String str, int i) {
        try {
            return this.AFInAppEventParameterName.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    public final void AFKeystoreWrapper(String str) {
        this.AFInAppEventParameterName.edit().remove(str).apply();
    }
}
