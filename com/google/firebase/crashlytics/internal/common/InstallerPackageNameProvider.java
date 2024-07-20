package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

class InstallerPackageNameProvider {
    private String installerPackageName;

    InstallerPackageNameProvider() {
    }

    /* access modifiers changed from: package-private */
    public String getInstallerPackageName(Context context) {
        String str;
        synchronized (this) {
            if (this.installerPackageName == null) {
                this.installerPackageName = loadInstallerPackageName(context);
            }
            str = "".equals(this.installerPackageName) ? null : this.installerPackageName;
        }
        return str;
    }

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName2 == null ? "" : installerPackageName2;
    }
}
