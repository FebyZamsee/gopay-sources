package com.baseflow.geolocator;

import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda1 implements ErrorCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda1(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onError(ErrorCodes errorCodes) {
        this.f$0.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
    }
}
