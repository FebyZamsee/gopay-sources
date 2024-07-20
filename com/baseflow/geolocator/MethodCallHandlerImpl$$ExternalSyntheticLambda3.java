package com.baseflow.geolocator;

import com.baseflow.geolocator.permission.LocationPermission;
import com.baseflow.geolocator.permission.PermissionResultCallback;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda3 implements PermissionResultCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda3(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onResult(LocationPermission locationPermission) {
        this.f$0.success(Integer.valueOf(locationPermission.toInt()));
    }
}
