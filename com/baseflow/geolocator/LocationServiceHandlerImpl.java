package com.baseflow.geolocator;

import android.content.Context;
import android.content.IntentFilter;
import com.baseflow.geolocator.location.LocationServiceStatusReceiver;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

public class LocationServiceHandlerImpl implements EventChannel.StreamHandler {
    private static final String TAG = "LocationServiceHandler";
    private EventChannel channel;
    private Context context;
    private LocationServiceStatusReceiver receiver;

    /* access modifiers changed from: package-private */
    public void startListening(Context context2, BinaryMessenger binaryMessenger) {
        if (this.channel != null) {
            stopListening();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_service_updates_android");
        this.channel = eventChannel;
        eventChannel.setStreamHandler(this);
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public void stopListening() {
        if (this.channel != null) {
            disposeListeners();
            this.channel.setStreamHandler((EventChannel.StreamHandler) null);
            this.channel = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setContext(Context context2) {
        this.context = context2;
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.context != null) {
            IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
            intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
            LocationServiceStatusReceiver locationServiceStatusReceiver = new LocationServiceStatusReceiver(eventSink);
            this.receiver = locationServiceStatusReceiver;
            this.context.registerReceiver(locationServiceStatusReceiver, intentFilter);
        }
    }

    public void onCancel(Object obj) {
        disposeListeners();
    }

    private void disposeListeners() {
        LocationServiceStatusReceiver locationServiceStatusReceiver;
        Context context2 = this.context;
        if (context2 != null && (locationServiceStatusReceiver = this.receiver) != null) {
            context2.unregisterReceiver(locationServiceStatusReceiver);
        }
    }
}
