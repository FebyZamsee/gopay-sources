package com.baseflow.geolocator;

import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import io.flutter.plugin.common.EventChannel;

public final /* synthetic */ class StreamHandlerImpl$$ExternalSyntheticLambda1 implements ErrorCallback {
    public final /* synthetic */ EventChannel.EventSink f$0;

    public /* synthetic */ StreamHandlerImpl$$ExternalSyntheticLambda1(EventChannel.EventSink eventSink) {
        this.f$0 = eventSink;
    }

    public final void onError(ErrorCodes errorCodes) {
        this.f$0.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
    }
}
