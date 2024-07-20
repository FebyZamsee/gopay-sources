package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.baseflow.geolocator.errors.PermissionUndefinedException;
import com.baseflow.geolocator.location.ForegroundNotificationOptions;
import com.baseflow.geolocator.location.GeolocationManager;
import com.baseflow.geolocator.location.LocationClient;
import com.baseflow.geolocator.location.LocationOptions;
import com.baseflow.geolocator.permission.PermissionManager;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;

class StreamHandlerImpl implements EventChannel.StreamHandler {
    private static final String TAG = "FlutterGeolocator";
    private Activity activity;
    private EventChannel channel;
    private Context context;
    private GeolocatorLocationService foregroundLocationService;
    private GeolocationManager geolocationManager = new GeolocationManager();
    private LocationClient locationClient;
    private final PermissionManager permissionManager;

    public StreamHandlerImpl(PermissionManager permissionManager2) {
        this.permissionManager = permissionManager2;
    }

    public void setForegroundLocationService(GeolocatorLocationService geolocatorLocationService) {
        this.foregroundLocationService = geolocatorLocationService;
    }

    public void setActivity(Activity activity2) {
        if (!(activity2 != null || this.locationClient == null || this.channel == null)) {
            stopListening();
        }
        this.activity = activity2;
    }

    /* access modifiers changed from: package-private */
    public void startListening(Context context2, BinaryMessenger binaryMessenger) {
        if (this.channel != null) {
            stopListening();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_updates_android");
        this.channel = eventChannel;
        eventChannel.setStreamHandler(this);
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public void stopListening() {
        if (this.channel != null) {
            disposeListeners(false);
            this.channel.setStreamHandler((EventChannel.StreamHandler) null);
            this.channel = null;
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        ForegroundNotificationOptions foregroundNotificationOptions = null;
        try {
            if (!this.permissionManager.hasPermission(this.context)) {
                eventSink.error(ErrorCodes.permissionDenied.toString(), ErrorCodes.permissionDenied.toDescription(), (Object) null);
            } else if (this.foregroundLocationService != null) {
                Map map = (Map) obj;
                boolean booleanValue = (map == null || map.get("forceLocationManager") == null) ? false : ((Boolean) map.get("forceLocationManager")).booleanValue();
                LocationOptions parseArguments = LocationOptions.parseArguments(map);
                if (map != null) {
                    foregroundNotificationOptions = ForegroundNotificationOptions.parseArguments((Map) map.get("foregroundNotificationConfig"));
                }
                if (foregroundNotificationOptions != null) {
                    this.foregroundLocationService.startLocationService(booleanValue, parseArguments, eventSink);
                    this.foregroundLocationService.enableBackgroundMode(foregroundNotificationOptions);
                    return;
                }
                LocationClient createLocationClient = this.geolocationManager.createLocationClient(this.context, Boolean.TRUE.equals(Boolean.valueOf(booleanValue)), parseArguments);
                this.locationClient = createLocationClient;
                this.geolocationManager.startPositionUpdates(createLocationClient, this.activity, new StreamHandlerImpl$$ExternalSyntheticLambda0(eventSink), new StreamHandlerImpl$$ExternalSyntheticLambda1(eventSink));
            }
        } catch (PermissionUndefinedException unused) {
            eventSink.error(ErrorCodes.permissionDefinitionsNotFound.toString(), ErrorCodes.permissionDefinitionsNotFound.toDescription(), (Object) null);
        }
    }

    public void onCancel(Object obj) {
        disposeListeners(true);
    }

    private void disposeListeners(boolean z) {
        GeolocationManager geolocationManager2;
        GeolocatorLocationService geolocatorLocationService = this.foregroundLocationService;
        if (geolocatorLocationService != null && geolocatorLocationService.canStopLocationService(z)) {
            this.foregroundLocationService.stopLocationService();
            this.foregroundLocationService.disableBackgroundMode();
        }
        LocationClient locationClient2 = this.locationClient;
        if (locationClient2 != null && (geolocationManager2 = this.geolocationManager) != null) {
            geolocationManager2.stopPositionUpdates(locationClient2);
            this.locationClient = null;
        }
    }
}
