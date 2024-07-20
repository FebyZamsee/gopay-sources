package com.baseflow.geolocator;

import android.location.Location;
import com.baseflow.geolocator.location.LocationMapper;
import com.baseflow.geolocator.location.PositionChangedCallback;
import io.flutter.plugin.common.EventChannel;

public final /* synthetic */ class GeolocatorLocationService$$ExternalSyntheticLambda0 implements PositionChangedCallback {
    public final /* synthetic */ EventChannel.EventSink f$0;

    public /* synthetic */ GeolocatorLocationService$$ExternalSyntheticLambda0(EventChannel.EventSink eventSink) {
        this.f$0 = eventSink;
    }

    public final void onPositionChanged(Location location) {
        this.f$0.success(LocationMapper.toHashMap(location));
    }
}
