package com.baseflow.permissionhandler;

import com.baseflow.permissionhandler.PermissionManager;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda2 implements PermissionManager.CheckPermissionsSuccessCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda2(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onSuccess(int i) {
        this.f$0.success(Integer.valueOf(i));
    }
}
