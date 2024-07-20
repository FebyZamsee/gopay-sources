package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.internal.service.zao;

public class TelemetryLogging {
    private TelemetryLogging() {
    }

    public static TelemetryLoggingClient getClient(Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    public static TelemetryLoggingClient getClient(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        return new zao(context, telemetryLoggingOptions);
    }
}