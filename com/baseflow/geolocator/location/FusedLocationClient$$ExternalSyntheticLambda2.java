package com.baseflow.geolocator.location;

import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class FusedLocationClient$$ExternalSyntheticLambda2 implements OnSuccessListener {
    public final /* synthetic */ FusedLocationClient f$0;

    public /* synthetic */ FusedLocationClient$$ExternalSyntheticLambda2(FusedLocationClient fusedLocationClient) {
        this.f$0 = fusedLocationClient;
    }

    public final void onSuccess(Object obj) {
        this.f$0.m60lambda$startPositionUpdates$2$combaseflowgeolocatorlocationFusedLocationClient((LocationSettingsResponse) obj);
    }
}
