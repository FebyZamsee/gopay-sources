package com.baseflow.permissionhandler;

import com.baseflow.permissionhandler.PermissionManager;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda3 implements PermissionManager.RequestPermissionsSuccessCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda3(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onSuccess(Map map) {
        this.f$0.success(map);
    }
}
