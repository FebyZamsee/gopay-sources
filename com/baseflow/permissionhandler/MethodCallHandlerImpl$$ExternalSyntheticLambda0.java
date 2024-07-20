package com.baseflow.permissionhandler;

import com.baseflow.permissionhandler.ServiceManager;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda0 implements ServiceManager.SuccessCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda0(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onSuccess(int i) {
        this.f$0.success(Integer.valueOf(i));
    }
}
