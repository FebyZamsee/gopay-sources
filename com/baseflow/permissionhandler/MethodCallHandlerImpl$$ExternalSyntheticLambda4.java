package com.baseflow.permissionhandler;

import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda4 implements ErrorCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda4(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onError(String str, String str2) {
        this.f$0.error(str, str2, (Object) null);
    }
}
