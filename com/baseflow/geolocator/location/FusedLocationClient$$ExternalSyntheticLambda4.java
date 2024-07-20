package com.baseflow.geolocator.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class FusedLocationClient$$ExternalSyntheticLambda4 implements OnCompleteListener {
    public final /* synthetic */ LocationServiceListener f$0;

    public /* synthetic */ FusedLocationClient$$ExternalSyntheticLambda4(LocationServiceListener locationServiceListener) {
        this.f$0 = locationServiceListener;
    }

    public final void onComplete(Task task) {
        FusedLocationClient.lambda$isLocationServiceEnabled$0(this.f$0, task);
    }
}
