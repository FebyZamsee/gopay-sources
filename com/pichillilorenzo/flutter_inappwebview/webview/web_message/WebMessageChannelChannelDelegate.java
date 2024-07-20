package com.pichillilorenzo.flutter_inappwebview.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
    private WebMessageChannel webMessageChannel;

    public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel2, MethodChannel methodChannel) {
        super(methodChannel);
        this.webMessageChannel = webMessageChannel2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r7, io.flutter.plugin.common.MethodChannel.Result r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            r4 = 2
            r5 = 1
            if (r1 == r3) goto L_0x0031
            r3 = 556190586(0x2126cb7a, float:5.6512287E-19)
            if (r1 == r3) goto L_0x0027
            r3 = 1490029383(0x58d00b47, float:1.82997484E15)
            if (r1 == r3) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r1 = "postMessage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 2
            goto L_0x003c
        L_0x0027:
            java.lang.String r1 = "setWebMessageCallback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            java.lang.String r1 = "index"
            if (r0 == 0) goto L_0x0088
            if (r0 == r5) goto L_0x006a
            if (r0 == r4) goto L_0x0048
            r8.notImplemented()
            return
        L_0x0048:
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r0 = r6.webMessageChannel
            if (r0 == 0) goto L_0x0066
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface r0 = r0.webView
            boolean r0 = r0 instanceof com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r7.argument(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "message"
            java.lang.Object r7 = r7.argument(r1)
            java.util.Map r7 = (java.util.Map) r7
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r1 = r6.webMessageChannel
            r1.postMessageForInAppWebView(r0, r7, r8)
            return
        L_0x0066:
            r8.success(r2)
            return
        L_0x006a:
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r0 = r6.webMessageChannel
            if (r0 == 0) goto L_0x0084
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface r0 = r0.webView
            boolean r0 = r0 instanceof com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView
            if (r0 == 0) goto L_0x0084
            java.lang.Object r7 = r7.argument(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r0 = r6.webMessageChannel
            int r7 = r7.intValue()
            r0.setWebMessageCallbackForInAppWebView(r7, r8)
            return
        L_0x0084:
            r8.success(r2)
            return
        L_0x0088:
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r0 = r6.webMessageChannel
            if (r0 == 0) goto L_0x009e
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface r0 = r0.webView
            boolean r0 = r0 instanceof com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView
            if (r0 == 0) goto L_0x009e
            java.lang.Object r7 = r7.argument(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel r0 = r6.webMessageChannel
            r0.closeForInAppWebView(r7, r8)
            return
        L_0x009e:
            r8.success(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannelChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onMessage(int i, String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put(Constants.MESSAGE, str);
            channel.invokeMethod("onMessage", hashMap);
        }
    }

    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }
}
