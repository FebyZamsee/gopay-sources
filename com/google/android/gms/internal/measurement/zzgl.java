package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import o.onDrawableLoadedFromResources;

public final class zzgl {
    private static volatile onDrawableLoadedFromResources<Boolean> zza = onDrawableLoadedFromResources.read();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zza(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        } else if (zza.asInterface()) {
            return zza.asBinder().booleanValue();
        } else {
            synchronized (zzb) {
                if (zza.asInterface()) {
                    boolean booleanValue = zza.asBinder().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && zza(context)) {
                            z2 = true;
                        }
                        zza = onDrawableLoadedFromResources.asBinder(Boolean.valueOf(z2));
                        return zza.asBinder().booleanValue();
                    }
                }
                z = true;
                z2 = true;
                zza = onDrawableLoadedFromResources.asBinder(Boolean.valueOf(z2));
                return zza.asBinder().booleanValue();
            }
        }
    }
}