package com.baseflow.permissionhandler;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

final class ServiceManager {

    @FunctionalInterface
    interface SuccessCallback {
        void onSuccess(int i);
    }

    private static boolean isLocationServiceEnablePreKitKat(Context context) {
        return false;
    }

    ServiceManager() {
    }

    /* access modifiers changed from: package-private */
    public final void checkServiceStatus(int i, Context context, SuccessCallback successCallback, ErrorCallback errorCallback) {
        if (context == null) {
            errorCallback.onError("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i == 3 || i == 4 || i == 5) {
            successCallback.onSuccess(isLocationServiceEnabled(context) ? 1 : 0);
        } else {
            if (i == 21) {
                successCallback.onSuccess(isBluetoothServiceEnabled(context) ? 1 : 0);
            }
            int i2 = 1;
            if (i == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    successCallback.onSuccess(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    successCallback.onSuccess(2);
                    return;
                }
                Intent intent = new Intent("android.intent.action.CALL");
                intent.setData(Uri.parse("tel:123123"));
                if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                    successCallback.onSuccess(2);
                } else if (telephonyManager.getSimState() != 5) {
                    successCallback.onSuccess(0);
                } else {
                    successCallback.onSuccess(1);
                }
            } else if (i == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i2 = 2;
                }
                successCallback.onSuccess(i2);
            } else {
                successCallback.onSuccess(2);
            }
        }
    }

    private boolean isLocationServiceEnabled(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return isLocationServiceEnabledKitKat(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    private static boolean isLocationServiceEnabledKitKat(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isBluetoothServiceEnabled(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }
}
