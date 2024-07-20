package com.baseflow.geolocator;

import android.location.Location;
import com.baseflow.geolocator.location.LocationMapper;
import com.baseflow.geolocator.location.PositionChangedCallback;
import io.flutter.plugin.common.MethodChannel;

public final /* synthetic */ class MethodCallHandlerImpl$$ExternalSyntheticLambda0 implements PositionChangedCallback {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ MethodCallHandlerImpl$$ExternalSyntheticLambda0(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onPositionChanged(Location location) {
        this.f$0.success(LocationMapper.toHashMap(location));
    }
}
