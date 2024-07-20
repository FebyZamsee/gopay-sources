package com.baseflow.geolocator.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import io.flutter.plugin.common.EventChannel;

public class LocationServiceStatusReceiver extends BroadcastReceiver {
    private final EventChannel.EventSink events;
    private ServiceStatus lastKnownServiceStatus;

    public LocationServiceStatusReceiver(EventChannel.EventSink eventSink) {
        this.events = eventSink;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (isProviderEnabled || isProviderEnabled2) {
                ServiceStatus serviceStatus = this.lastKnownServiceStatus;
                if (serviceStatus == null || serviceStatus == ServiceStatus.disabled) {
                    this.lastKnownServiceStatus = ServiceStatus.enabled;
                    this.events.success(Integer.valueOf(ServiceStatus.enabled.ordinal()));
                    return;
                }
                return;
            }
            ServiceStatus serviceStatus2 = this.lastKnownServiceStatus;
            if (serviceStatus2 == null || serviceStatus2 == ServiceStatus.enabled) {
                this.lastKnownServiceStatus = ServiceStatus.disabled;
                this.events.success(Integer.valueOf(ServiceStatus.disabled.ordinal()));
            }
        }
    }
}
