package com.baseflow.geolocator.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.google.android.gms.common.GoogleApiAvailability;
import io.flutter.plugin.common.PluginRegistry;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GeolocationManager implements PluginRegistry.ActivityResultListener {
    private final List<LocationClient> locationClients = new CopyOnWriteArrayList();

    public void getLastKnownPosition(Context context, boolean z, PositionChangedCallback positionChangedCallback, ErrorCallback errorCallback) {
        createLocationClient(context, z, (LocationOptions) null).getLastKnownPosition(positionChangedCallback, errorCallback);
    }

    public void isLocationServiceEnabled(Context context, LocationServiceListener locationServiceListener) {
        if (context == null) {
            locationServiceListener.onLocationServiceError(ErrorCodes.locationServicesDisabled);
        }
        createLocationClient(context, false, (LocationOptions) null).isLocationServiceEnabled(locationServiceListener);
    }

    public void startPositionUpdates(LocationClient locationClient, Activity activity, PositionChangedCallback positionChangedCallback, ErrorCallback errorCallback) {
        this.locationClients.add(locationClient);
        locationClient.startPositionUpdates(activity, positionChangedCallback, errorCallback);
    }

    public void stopPositionUpdates(LocationClient locationClient) {
        this.locationClients.remove(locationClient);
        locationClient.stopPositionUpdates();
    }

    public LocationClient createLocationClient(Context context, boolean z, LocationOptions locationOptions) {
        if (z) {
            return new LocationManagerClient(context, locationOptions);
        }
        if (isGooglePlayServicesAvailable(context)) {
            return new FusedLocationClient(context, locationOptions);
        }
        return new LocationManagerClient(context, locationOptions);
    }

    private boolean isGooglePlayServicesAvailable(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (NoClassDefFoundError unused) {
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        for (LocationClient onActivityResult : this.locationClients) {
            if (onActivityResult.onActivityResult(i, i2)) {
                return true;
            }
        }
        return false;
    }
}
