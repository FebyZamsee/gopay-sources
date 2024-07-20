package com.baseflow.permissionhandler;

import com.baseflow.permissionhandler.PermissionManager;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda5 implements PermissionManager.ShouldShowRequestPermissionRationaleSuccessCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda5(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onSuccess(boolean z) {
        this.f$0.success(Boolean.valueOf(z));
    }
}
