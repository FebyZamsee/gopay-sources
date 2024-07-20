package com.baseflow.geolocator;

import android.location.Location;
import com.baseflow.geolocator.location.LocationClient;
import com.baseflow.geolocator.location.PositionChangedCallback;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda5 implements PositionChangedCallback {
    public final /* synthetic */ MethodCallHandlerImpl f$0;
    public final /* synthetic */ boolean[] f$1;
    public final /* synthetic */ LocationClient f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ MethodChannel.Result f$4;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda5(MethodCallHandlerImpl methodCallHandlerImpl, boolean[] zArr, LocationClient locationClient, String str, MethodChannel.Result result) {
        this.f$0 = methodCallHandlerImpl;
        this.f$1 = zArr;
        this.f$2 = locationClient;
        this.f$3 = str;
        this.f$4 = result;
    }

    public final void onPositionChanged(Location location) {
        this.f$0.m58lambda$onGetCurrentPosition$5$combaseflowgeolocatorMethodCallHandlerImpl(this.f$1, this.f$2, this.f$3, this.f$4, location);
    }
}
