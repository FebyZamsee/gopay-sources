package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, MethodChannel methodChannel) {
        super(methodChannel);
        this.headlessWebView = headlessInAppWebView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r8, io.flutter.plugin.common.MethodChannel.Result r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = -75151241(0xfffffffffb854877, float:-1.3840905E36)
            r5 = 2
            r6 = 1
            if (r1 == r4) goto L_0x0034
            r4 = 1671767583(0x63a5261f, float:6.0929194E21)
            if (r1 == r4) goto L_0x0029
            r4 = 1984958339(0x76500f83, float:1.05499254E33)
            if (r1 == r4) goto L_0x001f
            goto L_0x003e
        L_0x001f:
            java.lang.String r1 = "setSize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x0029:
            java.lang.String r1 = "dispose"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r0 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "getSize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0077
            if (r0 == r6) goto L_0x0068
            if (r0 == r5) goto L_0x0049
            r9.notImplemented()
            return
        L_0x0049:
            com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebView r0 = r7.headlessWebView
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "size"
            java.lang.Object r8 = r8.argument(r0)
            java.util.Map r8 = (java.util.Map) r8
            com.pichillilorenzo.flutter_inappwebview.types.Size2D r8 = com.pichillilorenzo.flutter_inappwebview.types.Size2D.fromMap(r8)
            if (r8 == 0) goto L_0x0060
            com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebView r0 = r7.headlessWebView
            r0.setSize(r8)
        L_0x0060:
            r9.success(r2)
            return
        L_0x0064:
            r9.success(r3)
            return
        L_0x0068:
            com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebView r8 = r7.headlessWebView
            if (r8 == 0) goto L_0x0073
            r8.dispose()
            r9.success(r2)
            return
        L_0x0073:
            r9.success(r3)
            return
        L_0x0077:
            com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebView r8 = r7.headlessWebView
            r0 = 0
            if (r8 == 0) goto L_0x008a
            com.pichillilorenzo.flutter_inappwebview.types.Size2D r8 = r8.getSize()
            if (r8 == 0) goto L_0x0086
            java.util.Map r0 = r8.toMap()
        L_0x0086:
            r9.success(r0)
            return
        L_0x008a:
            r9.success(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessWebViewChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onWebViewCreated() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onWebViewCreated", new HashMap());
        }
    }

    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }
}
