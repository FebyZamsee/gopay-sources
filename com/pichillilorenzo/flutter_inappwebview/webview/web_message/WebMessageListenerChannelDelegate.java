package com.pichillilorenzo.flutter_inappwebview.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener2, MethodChannel methodChannel) {
        super(methodChannel);
        this.webMessageListener = webMessageListener2;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (!str.equals("postMessage")) {
            result.notImplemented();
            return;
        }
        WebMessageListener webMessageListener2 = this.webMessageListener;
        if (webMessageListener2 == null || !(webMessageListener2.webView instanceof InAppWebView)) {
            result.success(Boolean.FALSE);
            return;
        }
        this.webMessageListener.postMessageForInAppWebView((String) methodCall.argument(Constants.MESSAGE), result);
    }

    public void onPostMessage(String str, String str2, boolean z) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.MESSAGE, str);
            hashMap.put("sourceOrigin", str2);
            hashMap.put("isMainFrame", Boolean.valueOf(z));
            channel.invokeMethod("onPostMessage", hashMap);
        }
    }

    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }
}
