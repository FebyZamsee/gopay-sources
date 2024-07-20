package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.MethodChannel;

final class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    private Activity activity;
    private final AppSettingsManager appSettingsManager;
    private final Context applicationContext;
    private final PermissionManager permissionManager;
    private final ServiceManager serviceManager;

    MethodCallHandlerImpl(Context context, AppSettingsManager appSettingsManager2, PermissionManager permissionManager2, ServiceManager serviceManager2) {
        this.applicationContext = context;
        this.appSettingsManager = appSettingsManager2;
        this.permissionManager = permissionManager2;
        this.serviceManager = serviceManager2;
    }

    public final void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r7, io.flutter.plugin.common.MethodChannel.Result r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.method
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1544053025: goto L_0x0039;
                case -1017315255: goto L_0x002f;
                case -576207927: goto L_0x0025;
                case 347240634: goto L_0x001b;
                case 1669188213: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0043
        L_0x0011:
            java.lang.String r1 = "requestPermissions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 4
            goto L_0x0044
        L_0x001b:
            java.lang.String r1 = "openAppSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 3
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "checkPermissionStatus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 2
            goto L_0x0044
        L_0x002f:
            java.lang.String r1 = "shouldShowRequestPermissionRationale"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0039:
            java.lang.String r1 = "checkServiceStatus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            if (r0 == 0) goto L_0x00bb
            if (r0 == r5) goto L_0x009c
            if (r0 == r4) goto L_0x0082
            if (r0 == r3) goto L_0x006d
            if (r0 == r2) goto L_0x0052
            r8.notImplemented()
            return
        L_0x0052:
            java.lang.Object r7 = r7.arguments()
            java.util.List r7 = (java.util.List) r7
            com.baseflow.permissionhandler.PermissionManager r0 = r6.permissionManager
            android.app.Activity r1 = r6.activity
            java.util.Objects.requireNonNull(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda3 r2 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda3
            r2.<init>(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda4 r3 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda4
            r3.<init>(r8)
            r0.requestPermissions(r7, r1, r2, r3)
            return
        L_0x006d:
            com.baseflow.permissionhandler.AppSettingsManager r7 = r6.appSettingsManager
            android.content.Context r0 = r6.applicationContext
            java.util.Objects.requireNonNull(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda7 r1 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda7
            r1.<init>(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda8 r2 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda8
            r2.<init>(r8)
            r7.openAppSettings(r0, r1, r2)
            return
        L_0x0082:
            java.lang.Object r7 = r7.arguments
            java.lang.String r7 = r7.toString()
            int r7 = java.lang.Integer.parseInt(r7)
            com.baseflow.permissionhandler.PermissionManager r0 = r6.permissionManager
            android.content.Context r1 = r6.applicationContext
            java.util.Objects.requireNonNull(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda2 r2 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda2
            r2.<init>(r8)
            r0.checkPermissionStatus(r7, r1, r2)
            return
        L_0x009c:
            java.lang.Object r7 = r7.arguments
            java.lang.String r7 = r7.toString()
            int r7 = java.lang.Integer.parseInt(r7)
            com.baseflow.permissionhandler.PermissionManager r0 = r6.permissionManager
            android.app.Activity r1 = r6.activity
            java.util.Objects.requireNonNull(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda5 r2 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda5
            r2.<init>(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda6 r3 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda6
            r3.<init>(r8)
            r0.shouldShowRequestPermissionRationale(r7, r1, r2, r3)
            return
        L_0x00bb:
            java.lang.Object r7 = r7.arguments
            java.lang.String r7 = r7.toString()
            int r7 = java.lang.Integer.parseInt(r7)
            com.baseflow.permissionhandler.ServiceManager r0 = r6.serviceManager
            android.content.Context r1 = r6.applicationContext
            java.util.Objects.requireNonNull(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda0 r2 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda0
            r2.<init>(r8)
            com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda1 r3 = new com.baseflow.permissionhandler.MethodCallHandlerImpl$$ExternalSyntheticLambda1
            r3.<init>(r8)
            r0.checkServiceStatus(r7, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baseflow.permissionhandler.MethodCallHandlerImpl.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
