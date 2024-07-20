package com.baseflow.geolocator.location;

import android.app.Activity;
import com.baseflow.geolocator.errors.ErrorCallback;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class FusedLocationClient$$ExternalSyntheticLambda3 implements OnFailureListener {
    public final /* synthetic */ FusedLocationClient f$0;
    public final /* synthetic */ Activity f$1;
    public final /* synthetic */ ErrorCallback f$2;

    public /* synthetic */ FusedLocationClient$$ExternalSyntheticLambda3(FusedLocationClient fusedLocationClient, Activity activity, ErrorCallback errorCallback) {
        this.f$0 = fusedLocationClient;
        this.f$1 = activity;
        this.f$2 = errorCallback;
    }

    public final void onFailure(Exception exc) {
        this.f$0.m61lambda$startPositionUpdates$3$combaseflowgeolocatorlocationFusedLocationClient(this.f$1, this.f$2, exc);
    }
}
