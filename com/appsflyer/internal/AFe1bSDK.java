package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1bSDK implements AFe1eSDK {
    private final Application values;

    public AFe1bSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.values = (Application) applicationContext;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    public final String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return AFa1bSDK.values(this.values.getPackageManager(), this.values.getPackageName());
    }

    public final long AFInAppEventParameterName() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final String values() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        long blockCountLong = statFs.getBlockCountLong();
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (((double) (availableBlocksLong * blockSizeLong)) / pow));
        sb.append('/');
        sb.append((long) (((double) (blockCountLong * blockSizeLong)) / pow));
        return sb.toString();
    }
}
