package com.baseflow.geolocator.location;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.location.LocationListenerCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.location.LocationRequestCompat;
import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.baseflow.geolocator.location.LocationClient;
import java.util.List;

class LocationManagerClient implements LocationClient, LocationListenerCompat {
    private static final long TWO_MINUTES = 120000;
    public Context context;
    private Location currentBestLocation;
    private String currentLocationProvider;
    private ErrorCallback errorCallback;
    private boolean isListening = false;
    private final LocationManager locationManager;
    private final LocationOptions locationOptions;
    private final NmeaClient nmeaClient;
    private PositionChangedCallback positionChangedCallback;

    public /* synthetic */ boolean checkLocationService(Context context2) {
        return LocationClient.CC.$default$checkLocationService(this, context2);
    }

    public boolean onActivityResult(int i, int i2) {
        return false;
    }

    public /* synthetic */ void onFlushComplete(int i) {
        LocationListenerCompat.CC.$default$onFlushComplete(this, i);
    }

    public /* synthetic */ void onLocationChanged(List list) {
        LocationListenerCompat.CC.$default$onLocationChanged(this, list);
    }

    public void onProviderEnabled(String str) {
    }

    public LocationManagerClient(Context context2, LocationOptions locationOptions2) {
        this.locationManager = (LocationManager) context2.getSystemService("location");
        this.locationOptions = locationOptions2;
        this.context = context2;
        this.nmeaClient = new NmeaClient(context2, locationOptions2);
    }

    static boolean isBetterLocation(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > TWO_MINUTES;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        float accuracy = (float) ((int) (location.getAccuracy() - location2.getAccuracy()));
        boolean z4 = accuracy > 0.0f;
        boolean z5 = accuracy < 0.0f;
        boolean z6 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && equals;
        }
        return true;
    }

    private static String determineProvider(LocationManager locationManager2, LocationAccuracy locationAccuracy) {
        List<String> providers = locationManager2.getProviders(true);
        if (locationAccuracy == LocationAccuracy.lowest) {
            return "passive";
        }
        if (providers.contains("fused") && Build.VERSION.SDK_INT >= 31) {
            return "fused";
        }
        if (providers.contains("gps")) {
            return "gps";
        }
        if (providers.contains("network")) {
            return "network";
        }
        if (!providers.isEmpty()) {
            return providers.get(0);
        }
        return null;
    }

    /* renamed from: com.baseflow.geolocator.location.LocationManagerClient$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.baseflow.geolocator.location.LocationAccuracy[] r0 = com.baseflow.geolocator.location.LocationAccuracy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy = r0
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.lowest     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.low     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.high     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.best     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy     // Catch:{ NoSuchFieldError -> 0x003e }
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.bestForNavigation     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$location$LocationAccuracy     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.baseflow.geolocator.location.LocationAccuracy r1 = com.baseflow.geolocator.location.LocationAccuracy.medium     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baseflow.geolocator.location.LocationManagerClient.AnonymousClass1.<clinit>():void");
        }
    }

    private static int accuracyToQuality(LocationAccuracy locationAccuracy) {
        int i = AnonymousClass1.$SwitchMap$com$baseflow$geolocator$location$LocationAccuracy[locationAccuracy.ordinal()];
        if (i == 1 || i == 2) {
            return 104;
        }
        return (i == 3 || i == 4 || i == 5) ? 100 : 102;
    }

    public void isLocationServiceEnabled(LocationServiceListener locationServiceListener) {
        if (this.locationManager == null) {
            locationServiceListener.onLocationServiceResult(false);
        } else {
            locationServiceListener.onLocationServiceResult(checkLocationService(this.context));
        }
    }

    public void getLastKnownPosition(PositionChangedCallback positionChangedCallback2, ErrorCallback errorCallback2) {
        Location location = null;
        for (String lastKnownLocation : this.locationManager.getProviders(true)) {
            Location lastKnownLocation2 = this.locationManager.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null && isBetterLocation(lastKnownLocation2, location)) {
                location = lastKnownLocation2;
            }
        }
        positionChangedCallback2.onPositionChanged(location);
    }

    public void startPositionUpdates(Activity activity, PositionChangedCallback positionChangedCallback2, ErrorCallback errorCallback2) {
        float f;
        int i;
        long j;
        if (!checkLocationService(this.context)) {
            errorCallback2.onError(ErrorCodes.locationServicesDisabled);
            return;
        }
        this.positionChangedCallback = positionChangedCallback2;
        this.errorCallback = errorCallback2;
        LocationAccuracy locationAccuracy = LocationAccuracy.best;
        LocationOptions locationOptions2 = this.locationOptions;
        if (locationOptions2 != null) {
            float distanceFilter = (float) locationOptions2.getDistanceFilter();
            LocationAccuracy accuracy = this.locationOptions.getAccuracy();
            if (accuracy == LocationAccuracy.lowest) {
                j = LocationRequestCompat.PASSIVE_INTERVAL;
            } else {
                j = this.locationOptions.getTimeInterval();
            }
            i = accuracyToQuality(accuracy);
            LocationAccuracy locationAccuracy2 = accuracy;
            f = distanceFilter;
            locationAccuracy = locationAccuracy2;
        } else {
            j = 0;
            f = 0.0f;
            i = 102;
        }
        String determineProvider = determineProvider(this.locationManager, locationAccuracy);
        this.currentLocationProvider = determineProvider;
        if (determineProvider == null) {
            errorCallback2.onError(ErrorCodes.locationServicesDisabled);
            return;
        }
        LocationRequestCompat build = new LocationRequestCompat.Builder(j).setMinUpdateDistanceMeters(f).setQuality(i).build();
        this.isListening = true;
        this.nmeaClient.start();
        LocationManagerCompat.requestLocationUpdates(this.locationManager, this.currentLocationProvider, build, (LocationListenerCompat) this, Looper.getMainLooper());
    }

    public void stopPositionUpdates() {
        this.isListening = false;
        this.nmeaClient.stop();
        this.locationManager.removeUpdates(this);
    }

    public void onLocationChanged(Location location) {
        synchronized (this) {
            if (isBetterLocation(location, this.currentBestLocation)) {
                this.currentBestLocation = location;
                if (this.positionChangedCallback != null) {
                    this.nmeaClient.enrichExtrasWithNmea(location);
                    this.positionChangedCallback.onPositionChanged(this.currentBestLocation);
                }
            }
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        if (i == 2) {
            onProviderEnabled(str);
        } else if (i == 0) {
            onProviderDisabled(str);
        }
    }

    public void onProviderDisabled(String str) {
        if (str.equals(this.currentLocationProvider)) {
            if (this.isListening) {
                this.locationManager.removeUpdates(this);
            }
            ErrorCallback errorCallback2 = this.errorCallback;
            if (errorCallback2 != null) {
                errorCallback2.onError(ErrorCodes.locationServicesDisabled);
            }
            this.currentLocationProvider = null;
        }
    }
}
