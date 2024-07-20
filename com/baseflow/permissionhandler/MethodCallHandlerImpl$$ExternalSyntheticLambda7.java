package com.baseflow.permissionhandler;

import com.baseflow.permissionhandler.AppSettingsManager;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda7 implements AppSettingsManager.OpenAppSettingsSuccessCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda7(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onSuccess(boolean z) {
        this.f$0.success(Boolean.valueOf(z));
    }
}
