package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    static boolean zza = false;
    private static boolean zzb = false;
    private static final AtomicBoolean zzc = new AtomicBoolean();

    GooglePlayServicesUtilLight() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            if (errorResolutionIntent == null) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.zza(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent((Context) null, i, (String) null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zza) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                zza = true;
            }
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        Preconditions.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return UidVerifier.uidHasPackageName(context, i, str);
    }

    static boolean zza(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (com.google.android.gms.common.GoogleSignatureVerifier.zzb(r6, true) != false) goto L_0x007d;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ all -> 0x000a }
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000a }
            r0.getString(r1)     // Catch:{ all -> 0x000a }
            goto L_0x000b
        L_0x000a:
        L_0x000b:
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r0 = zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0036
            int r0 = com.google.android.gms.common.internal.zzag.zza(r8)
            if (r0 == 0) goto L_0x0030
            int r2 = GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r2) goto L_0x002a
            goto L_0x0036
        L_0x002a:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r8 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r8.<init>(r0)
            throw r8
        L_0x0030:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r8 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r8.<init>()
            throw r8
        L_0x0036:
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r8)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0046
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzb(r8)
            if (r0 != 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r9 < 0) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            java.lang.String r4 = r8.getPackageName()
            android.content.pm.PackageManager r5 = r8.getPackageManager()
            if (r0 == 0) goto L_0x0062
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00c0 }
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            r7 = 64
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r1, r7)     // Catch:{ NameNotFoundException -> 0x00c2 }
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r8)
            boolean r8 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r7, r2)
            if (r8 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x007d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            boolean r8 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r6, r2)
            if (r8 == 0) goto L_0x00c0
        L_0x007d:
            if (r0 == 0) goto L_0x008f
            if (r6 == 0) goto L_0x008f
            android.content.pm.Signature[] r8 = r6.signatures
            r8 = r8[r3]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r3]
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00c0
        L_0x008f:
            int r8 = r7.versionCode
            int r8 = com.google.android.gms.common.util.zza.zza(r8)
            int r9 = com.google.android.gms.common.util.zza.zza(r9)
            if (r8 >= r9) goto L_0x009f
            int r8 = r7.versionCode
            r2 = 2
            goto L_0x00c2
        L_0x009f:
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo
            if (r8 != 0) goto L_0x00b9
            android.content.pm.ApplicationInfo r8 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00a8 }
            goto L_0x00b9
        L_0x00a8:
            r8 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r9 = r9.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r9, r8)
            goto L_0x00c2
        L_0x00b9:
            boolean r8 = r8.enabled
            if (r8 != 0) goto L_0x00bf
            r2 = 3
            goto L_0x00c2
        L_0x00bf:
            return r3
        L_0x00c0:
            r2 = 9
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}
