package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AFb1gSDK<T> {
    public final String AFInAppEventParameterName;
    public final FutureTask<T> AFInAppEventType = new FutureTask<>(new Callable<T>() {
        public final T call() {
            if (AFb1gSDK.this.AFInAppEventParameterName()) {
                return AFb1gSDK.this.valueOf();
            }
            return null;
        }
    });
    public final AFc1pSDK AFKeystoreWrapper;
    public final Context valueOf;
    private final String[] values;

    /* access modifiers changed from: protected */
    public abstract T valueOf();

    public AFb1gSDK(Context context, AFc1pSDK aFc1pSDK, String str, String... strArr) {
        this.valueOf = context;
        this.AFInAppEventParameterName = str;
        this.values = strArr;
        this.AFKeystoreWrapper = aFc1pSDK;
    }

    public T values() {
        try {
            return this.AFInAppEventType.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo resolveContentProvider = this.valueOf.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128);
            if (resolveContentProvider == null || !Arrays.asList(this.values).contains(AFa1bSDK.values(this.valueOf.getPackageManager(), resolveContentProvider.packageName))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return false;
        }
    }
}
