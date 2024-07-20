package com.baseflow.geolocator;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.baseflow.geolocator.location.BackgroundNotification;
import com.baseflow.geolocator.location.ForegroundNotificationOptions;
import com.baseflow.geolocator.location.GeolocationManager;
import com.baseflow.geolocator.location.LocationClient;
import com.baseflow.geolocator.location.LocationOptions;
import io.flutter.plugin.common.EventChannel;

public class GeolocatorLocationService extends Service {
    private static final String CHANNEL_ID = "geolocator_channel_01";
    private static final int ONGOING_NOTIFICATION_ID = 75415;
    private static final String TAG = "FlutterGeolocator";
    private final String WAKELOCK_TAG = "GeolocatorLocationService:Wakelock";
    private final String WIFILOCK_TAG = "GeolocatorLocationService:WifiLock";
    private Activity activity = null;
    private BackgroundNotification backgroundNotification = null;
    private final LocalBinder binder = new LocalBinder(this);
    private int connectedEngines = 0;
    private GeolocationManager geolocationManager = null;
    private boolean isForeground = false;
    private int listenerCount = 0;
    private LocationClient locationClient;
    private PowerManager.WakeLock wakeLock = null;
    private WifiManager.WifiLock wifiLock = null;

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public void onCreate() {
        super.onCreate();
        this.geolocationManager = new GeolocationManager();
    }

    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public void onDestroy() {
        stopLocationService();
        disableBackgroundMode();
        this.geolocationManager = null;
        this.backgroundNotification = null;
        super.onDestroy();
    }

    public boolean canStopLocationService(boolean z) {
        if (z) {
            return this.listenerCount == 1;
        }
        if (this.connectedEngines == 0) {
            return true;
        }
        return false;
    }

    public void flutterEngineConnected() {
        this.connectedEngines++;
    }

    public void flutterEngineDisconnected() {
        this.connectedEngines--;
    }

    public void startLocationService(boolean z, LocationOptions locationOptions, EventChannel.EventSink eventSink) {
        this.listenerCount++;
        GeolocationManager geolocationManager2 = this.geolocationManager;
        if (geolocationManager2 != null) {
            LocationClient createLocationClient = geolocationManager2.createLocationClient(getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(z)), locationOptions);
            this.locationClient = createLocationClient;
            this.geolocationManager.startPositionUpdates(createLocationClient, this.activity, new GeolocatorLocationService$$ExternalSyntheticLambda0(eventSink), new GeolocatorLocationService$$ExternalSyntheticLambda1(eventSink));
        }
    }

    public void stopLocationService() {
        GeolocationManager geolocationManager2;
        this.listenerCount--;
        LocationClient locationClient2 = this.locationClient;
        if (locationClient2 != null && (geolocationManager2 = this.geolocationManager) != null) {
            geolocationManager2.stopPositionUpdates(locationClient2);
        }
    }

    public void enableBackgroundMode(ForegroundNotificationOptions foregroundNotificationOptions) {
        if (this.backgroundNotification != null) {
            changeNotificationOptions(foregroundNotificationOptions);
        } else {
            BackgroundNotification backgroundNotification2 = new BackgroundNotification(getApplicationContext(), CHANNEL_ID, Integer.valueOf(ONGOING_NOTIFICATION_ID), foregroundNotificationOptions);
            this.backgroundNotification = backgroundNotification2;
            backgroundNotification2.updateChannel("Background Location");
            startForeground(ONGOING_NOTIFICATION_ID, this.backgroundNotification.build());
            this.isForeground = true;
        }
        obtainWakeLocks(foregroundNotificationOptions);
    }

    public void disableBackgroundMode() {
        if (this.isForeground) {
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            releaseWakeLocks();
            this.isForeground = false;
            this.backgroundNotification = null;
        }
    }

    public void changeNotificationOptions(ForegroundNotificationOptions foregroundNotificationOptions) {
        BackgroundNotification backgroundNotification2 = this.backgroundNotification;
        if (backgroundNotification2 != null) {
            backgroundNotification2.updateOptions(foregroundNotificationOptions, this.isForeground);
            obtainWakeLocks(foregroundNotificationOptions);
        }
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    private void releaseWakeLocks() {
        PowerManager.WakeLock wakeLock2 = this.wakeLock;
        if (wakeLock2 != null && wakeLock2.isHeld()) {
            this.wakeLock.release();
            this.wakeLock = null;
        }
        WifiManager.WifiLock wifiLock2 = this.wifiLock;
        if (wifiLock2 != null && wifiLock2.isHeld()) {
            this.wifiLock.release();
            this.wifiLock = null;
        }
    }

    private void obtainWakeLocks(ForegroundNotificationOptions foregroundNotificationOptions) {
        WifiManager wifiManager;
        PowerManager powerManager;
        releaseWakeLocks();
        if (foregroundNotificationOptions.isEnableWakeLock() && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.wakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.wakeLock.acquire();
        }
        if (foregroundNotificationOptions.isEnableWifiLock() && (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) != null) {
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "GeolocatorLocationService:WifiLock");
            this.wifiLock = createWifiLock;
            createWifiLock.setReferenceCounted(false);
            this.wifiLock.acquire();
        }
    }

    class LocalBinder extends Binder {
        private final GeolocatorLocationService locationService;

        LocalBinder(GeolocatorLocationService geolocatorLocationService) {
            this.locationService = geolocatorLocationService;
        }

        public GeolocatorLocationService getLocationService() {
            return this.locationService;
        }
    }
}
