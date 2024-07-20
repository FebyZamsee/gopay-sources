package com.baseflow.geolocator;

import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.baseflow.geolocator.location.LocationClient;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda6 implements ErrorCallback {
    public final /* synthetic */ MethodCallHandlerImpl f$0;
    public final /* synthetic */ boolean[] f$1;
    public final /* synthetic */ LocationClient f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ MethodChannel.Result f$4;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda6(MethodCallHandlerImpl methodCallHandlerImpl, boolean[] zArr, LocationClient locationClient, String str, MethodChannel.Result result) {
        this.f$0 = methodCallHandlerImpl;
        this.f$1 = zArr;
        this.f$2 = locationClient;
        this.f$3 = str;
        this.f$4 = result;
    }

    public final void onError(ErrorCodes errorCodes) {
        this.f$0.m59lambda$onGetCurrentPosition$6$combaseflowgeolocatorMethodCallHandlerImpl(this.f$1, this.f$2, this.f$3, this.f$4, errorCodes);
    }
}
