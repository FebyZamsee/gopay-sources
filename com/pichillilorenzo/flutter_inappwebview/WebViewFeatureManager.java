package com.pichillilorenzo.flutter_inappwebview;

import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class WebViewFeatureManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (!str.equals("isFeatureSupported")) {
            result.notImplemented();
        } else {
            result.success(Boolean.valueOf(WebViewFeature.isFeatureSupported((String) methodCall.argument("feature"))));
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
}
