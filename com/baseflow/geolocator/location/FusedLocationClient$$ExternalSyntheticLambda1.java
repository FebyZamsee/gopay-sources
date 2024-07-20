package com.baseflow.geolocator.location;

import com.baseflow.geolocator.errors.ErrorCallback;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class FusedLocationClient$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ ErrorCallback f$0;

    public /* synthetic */ FusedLocationClient$$ExternalSyntheticLambda1(ErrorCallback errorCallback) {
        this.f$0 = errorCallback;
    }

    public final void onFailure(Exception exc) {
        FusedLocationClient.lambda$getLastKnownPosition$1(this.f$0, exc);
    }
}
