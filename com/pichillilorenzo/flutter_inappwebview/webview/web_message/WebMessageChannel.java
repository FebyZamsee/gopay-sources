package com.pichillilorenzo.flutter_inappwebview.webview.web_message;

import android.webkit.ValueCallback;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<WebMessagePortCompat> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.id = str;
        BinaryMessenger binaryMessenger = inAppWebViewInterface.getPlugin().messenger;
        StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
        sb.append(str);
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(WebViewCompat.createWebMessageChannel((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort[]{new WebMessagePort("port1", this), new WebMessagePort("port2", this)});
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            StringBuilder sb = new StringBuilder("(function() {window.flutter_inappwebview._webMessageChannels['");
            sb.append(this.id);
            sb.append("'] = new MessageChannel();})();");
            inAppWebViewInterface.evaluateJavascript(sb.toString(), (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
            return;
        }
        valueCallback.onReceiveValue(this);
    }

    public void setWebMessageCallbackForInAppWebView(final int i, MethodChannel.Result result) {
        InAppWebViewInterface inAppWebViewInterface = this.webView;
        Boolean bool = Boolean.TRUE;
        if (inAppWebViewInterface == null || this.compatPorts.size() <= 0 || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK)) {
            result.success(bool);
            return;
        }
        try {
            this.compatPorts.get(i).setWebMessageCallback(new WebMessagePortCompat.WebMessageCallbackCompat() {
                public void onMessage(WebMessagePortCompat webMessagePortCompat, WebMessageCompat webMessageCompat) {
                    super.onMessage(webMessagePortCompat, webMessageCompat);
                    this.onMessage(i, webMessageCompat != null ? webMessageCompat.getData() : null);
                }
            });
            result.success(bool);
        } catch (Exception e) {
            result.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    public void postMessageForInAppWebView(Integer num, Map<String, Object> map, MethodChannel.Result result) {
        InAppWebViewInterface inAppWebViewInterface = this.webView;
        Boolean bool = Boolean.TRUE;
        if (inAppWebViewInterface == null || this.compatPorts.size() <= 0 || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE)) {
            result.success(bool);
            return;
        }
        WebMessagePortCompat webMessagePortCompat = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<Map> list = (List) map.get("ports");
        if (list != null) {
            for (Map map2 : list) {
                Integer num2 = (Integer) map2.get("index");
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get((String) map2.get("webMessageChannelId"));
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(num2.intValue()));
                }
            }
        }
        try {
            webMessagePortCompat.postMessage(new WebMessageCompat((String) map.get("data"), (WebMessagePortCompat[]) arrayList.toArray(new WebMessagePortCompat[0])));
            result.success(bool);
        } catch (Exception e) {
            result.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    public void closeForInAppWebView(Integer num, MethodChannel.Result result) {
        InAppWebViewInterface inAppWebViewInterface = this.webView;
        Boolean bool = Boolean.TRUE;
        if (inAppWebViewInterface == null || this.compatPorts.size() <= 0 || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_PORT_CLOSE)) {
            result.success(bool);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).close();
            result.success(bool);
        } catch (Exception e) {
            result.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    public void onMessage(int i, String str) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i, str);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }

    public void dispose() {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_PORT_CLOSE)) {
            for (WebMessagePortCompat close : this.compatPorts) {
                try {
                    close.close();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }
}
