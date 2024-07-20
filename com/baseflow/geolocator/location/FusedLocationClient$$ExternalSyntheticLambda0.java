package com.baseflow.geolocator.location;

import android.location.Location;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class FusedLocationClient$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ PositionChangedCallback f$0;

    public /* synthetic */ FusedLocationClient$$ExternalSyntheticLambda0(PositionChangedCallback positionChangedCallback) {
        this.f$0 = positionChangedCallback;
    }

    public final void onSuccess(Object obj) {
        this.f$0.onPositionChanged((Location) obj);
    }
}
