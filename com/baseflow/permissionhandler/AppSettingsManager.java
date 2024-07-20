package com.baseflow.permissionhandler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;

final class AppSettingsManager {

    @FunctionalInterface
    interface OpenAppSettingsSuccessCallback {
        void onSuccess(boolean z);
    }

    AppSettingsManager() {
    }

    /* access modifiers changed from: package-private */
    public final void openAppSettings(Context context, OpenAppSettingsSuccessCallback openAppSettingsSuccessCallback, ErrorCallback errorCallback) {
        if (context == null) {
            errorCallback.onError("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            intent.addFlags(BasicMeasure.EXACTLY);
            intent.addFlags(8388608);
            context.startActivity(intent);
            openAppSettingsSuccessCallback.onSuccess(true);
        } catch (Exception unused) {
            openAppSettingsSuccessCallback.onSuccess(false);
        }
    }
}
