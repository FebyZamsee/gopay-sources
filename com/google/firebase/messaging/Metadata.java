package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

class Metadata {
    private String appVersionCode;
    private String appVersionName;
    private final Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;

    Metadata(Context context2) {
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }

    /* access modifiers changed from: package-private */
    public int getIidImplementation() {
        synchronized (this) {
            int i = this.iidImplementation;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.iidImplementation = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                if (PlatformVersion.isAtLeastO()) {
                    this.iidImplementation = 2;
                } else {
                    this.iidImplementation = 1;
                }
                int i2 = this.iidImplementation;
                return i2;
            }
            this.iidImplementation = 2;
            return 2;
        }
    }

    static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public String getAppVersionCode() {
        String str;
        synchronized (this) {
            if (this.appVersionCode == null) {
                populateAppVersionInfo();
            }
            str = this.appVersionCode;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public String getAppVersionName() {
        String str;
        synchronized (this) {
            if (this.appVersionName == null) {
                populateAppVersionInfo();
            }
            str = this.appVersionName;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public int getGmsVersionCode() {
        int i;
        PackageInfo packageInfo;
        synchronized (this) {
            if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
                this.gmsVersionCode = packageInfo.versionCode;
            }
            i = this.gmsVersionCode;
        }
        return i;
    }

    private void populateAppVersionInfo() {
        synchronized (this) {
            PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
            if (packageInfo != null) {
                this.appVersionCode = Integer.toString(packageInfo.versionCode);
                this.appVersionName = packageInfo.versionName;
            }
        }
    }

    private PackageInfo getPackageInfo(String str) {
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
