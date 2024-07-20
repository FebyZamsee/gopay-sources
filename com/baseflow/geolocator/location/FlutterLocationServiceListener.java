package com.baseflow.geolocator.location;

import com.baseflow.geolocator.errors.ErrorCodes;
import io.flutter.plugin.common.MethodChannel;

public class FlutterLocationServiceListener implements LocationServiceListener {
    private MethodChannel.Result result;

    public FlutterLocationServiceListener(MethodChannel.Result result2) {
        this.result = result2;
    }

    public void onLocationServiceResult(boolean z) {
        this.result.success(Boolean.valueOf(z));
    }

    public void onLocationServiceError(ErrorCodes errorCodes) {
        this.result.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
    }
}
