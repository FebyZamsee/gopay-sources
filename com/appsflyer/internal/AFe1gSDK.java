package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1gSDK {
    private final PackageManager AFInAppEventParameterName;
    private final String AFKeystoreWrapper;
    private final Map<String, Object> valueOf = new LinkedHashMap();

    public AFe1gSDK(AFc1tSDK aFc1tSDK, AFc1vSDK aFc1vSDK) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        Context context = aFc1tSDK.AFInAppEventType;
        if (context != null) {
            packageManager = context.getPackageManager();
        } else {
            packageManager = null;
        }
        this.AFInAppEventParameterName = packageManager;
        String packageName = aFc1vSDK.AFInAppEventParameterName.AFInAppEventType.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFKeystoreWrapper = packageName;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.valueOf.isEmpty()) {
            try {
                PackageManager packageManager = this.AFInAppEventParameterName;
                if (!(packageManager == null || (installerPackageName = packageManager.getInstallerPackageName(this.AFKeystoreWrapper)) == null)) {
                    this.valueOf.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.valueOf;
                Map linkedHashMap = new LinkedHashMap();
                String str = this.AFKeystoreWrapper;
                PackageManager packageManager2 = this.AFInAppEventParameterName;
                if (!(packageManager2 == null || (installSourceInfo = packageManager2.getInstallSourceInfo(str)) == null)) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.valueOf;
    }
}
