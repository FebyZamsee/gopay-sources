package com.baseflow.geolocator.location;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import com.baseflow.geolocator.errors.ErrorCallback;

public interface LocationClient {
    boolean checkLocationService(Context context);

    void getLastKnownPosition(PositionChangedCallback positionChangedCallback, ErrorCallback errorCallback);

    void isLocationServiceEnabled(LocationServiceListener locationServiceListener);

    boolean onActivityResult(int i, int i2);

    void startPositionUpdates(Activity activity, PositionChangedCallback positionChangedCallback, ErrorCallback errorCallback);

    void stopPositionUpdates();

    /* renamed from: com.baseflow.geolocator.location.LocationClient$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$checkLocationService(LocationClient locationClient, Context context) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }
    }
}
