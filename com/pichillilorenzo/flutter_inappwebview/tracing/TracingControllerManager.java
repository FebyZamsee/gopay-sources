package com.pichillilorenzo.flutter_inappwebview.tracing;

import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import io.flutter.plugin.common.MethodChannel;

public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static TracingController tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static void init() {
        if (tracingController == null && WebViewFeature.isFeatureSupported(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE)) {
            tracingController = TracingController.getInstance();
        }
    }

    public static TracingConfig buildTracingConfig(TracingSettings tracingSettings) {
        TracingConfig.Builder builder = new TracingConfig.Builder();
        for (Object next : tracingSettings.categories) {
            if (next instanceof String) {
                builder.addCategories((String) next);
            }
            if (next instanceof Integer) {
                builder.addCategories(((Integer) next).intValue());
            }
        }
        if (tracingSettings.tracingMode != null) {
            builder.setTracingMode(tracingSettings.tracingMode.intValue());
        }
        return builder.build();
    }

    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
