package com.pichillilorenzo.flutter_inappwebview.webview;

import android.content.pm.PackageInfo;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews = new HashMap();
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId = 0;
    public final Map<Integer, Message> windowWebViewMessages = new HashMap();

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r5, final io.flutter.plugin.common.MethodChannel.Result r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            switch(r1) {
                case -910403233: goto L_0x0063;
                case -633518365: goto L_0x0058;
                case -436220260: goto L_0x004e;
                case 258673215: goto L_0x0044;
                case 426229521: goto L_0x003a;
                case 643643439: goto L_0x0030;
                case 1586319888: goto L_0x0026;
                case 1667434977: goto L_0x001c;
                case 1867011305: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x006d
        L_0x0011:
            java.lang.String r1 = "disposeKeepAlive"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 8
            goto L_0x006e
        L_0x001c:
            java.lang.String r1 = "isMultiProcessEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 7
            goto L_0x006e
        L_0x0026:
            java.lang.String r1 = "getCurrentWebViewPackage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 6
            goto L_0x006e
        L_0x0030:
            java.lang.String r1 = "getDefaultUserAgent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 5
            goto L_0x006e
        L_0x003a:
            java.lang.String r1 = "setSafeBrowsingAllowlist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 4
            goto L_0x006e
        L_0x0044:
            java.lang.String r1 = "getSafeBrowsingPrivacyPolicyUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 3
            goto L_0x006e
        L_0x004e:
            java.lang.String r1 = "clearClientCertPreferences"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 2
            goto L_0x006e
        L_0x0058:
            java.lang.String r1 = "getVariationsHeader"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            r0 = 1
            goto L_0x006e
        L_0x0063:
            java.lang.String r1 = "setWebContentsDebuggingEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            r0 = 0
            goto L_0x006e
        L_0x006d:
            r0 = -1
        L_0x006e:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x013f;
                case 1: goto L_0x012b;
                case 2: goto L_0x0122;
                case 3: goto L_0x010a;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00bf;
                case 6: goto L_0x009f;
                case 7: goto L_0x0087;
                case 8: goto L_0x0076;
                default: goto L_0x0072;
            }
        L_0x0072:
            r6.notImplemented()
            return
        L_0x0076:
            java.lang.String r0 = "keepAliveId"
            java.lang.Object r5 = r5.argument(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0083
            r4.disposeKeepAlive(r5)
        L_0x0083:
            r6.success(r2)
            return
        L_0x0087:
            java.lang.String r5 = "MULTI_PROCESS"
            boolean r5 = androidx.webkit.WebViewFeature.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x009b
            boolean r5 = androidx.webkit.WebViewCompat.isMultiProcessEnabled()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.success(r5)
            return
        L_0x009b:
            r6.success(r3)
            return
        L_0x009f:
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r5 = r4.plugin
            if (r5 == 0) goto L_0x00ac
            android.app.Activity r5 = r5.activity
            if (r5 != 0) goto L_0x00ad
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r5 = r4.plugin
            android.content.Context r5 = r5.applicationContext
            goto L_0x00ad
        L_0x00ac:
            r5 = r1
        L_0x00ad:
            if (r5 == 0) goto L_0x00b4
            android.content.pm.PackageInfo r5 = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(r5)
            goto L_0x00b5
        L_0x00b4:
            r5 = r1
        L_0x00b5:
            if (r5 == 0) goto L_0x00bb
            java.util.Map r1 = r4.convertWebViewPackageToMap(r5)
        L_0x00bb:
            r6.success(r1)
            return
        L_0x00bf:
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r5 = r4.plugin
            if (r5 == 0) goto L_0x00cd
            android.content.Context r5 = r5.applicationContext
            java.lang.String r5 = android.webkit.WebSettings.getDefaultUserAgent(r5)
            r6.success(r5)
            return
        L_0x00cd:
            r6.success(r1)
            return
        L_0x00d1:
            java.lang.String r0 = "SAFE_BROWSING_ALLOWLIST"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            java.lang.String r1 = "hosts"
            if (r0 == 0) goto L_0x00ef
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.Object r5 = r5.argument(r1)
            java.util.List r5 = (java.util.List) r5
            r0.<init>(r5)
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$2 r5 = new com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$2
            r5.<init>(r6)
            androidx.webkit.WebViewCompat.setSafeBrowsingAllowlist(r0, r5)
            return
        L_0x00ef:
            java.lang.String r0 = "SAFE_BROWSING_WHITELIST"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0106
            java.lang.Object r5 = r5.argument(r1)
            java.util.List r5 = (java.util.List) r5
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$3 r0 = new com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$3
            r0.<init>(r6)
            androidx.webkit.WebViewCompat.setSafeBrowsingWhitelist(r5, r0)
            return
        L_0x0106:
            r6.success(r3)
            return
        L_0x010a:
            java.lang.String r5 = "SAFE_BROWSING_PRIVACY_POLICY_URL"
            boolean r5 = androidx.webkit.WebViewFeature.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x011e
            android.net.Uri r5 = androidx.webkit.WebViewCompat.getSafeBrowsingPrivacyPolicyUrl()
            java.lang.String r5 = r5.toString()
            r6.success(r5)
            return
        L_0x011e:
            r6.success(r1)
            return
        L_0x0122:
            com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$1 r5 = new com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager$1
            r5.<init>(r6)
            android.webkit.WebView.clearClientCertPreferences(r5)
            return
        L_0x012b:
            java.lang.String r5 = "GET_VARIATIONS_HEADER"
            boolean r5 = androidx.webkit.WebViewFeature.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x013b
            java.lang.String r5 = androidx.webkit.WebViewCompat.getVariationsHeader()
            r6.success(r5)
            return
        L_0x013b:
            r6.success(r1)
            return
        L_0x013f:
            java.lang.String r0 = "debuggingEnabled"
            java.lang.Object r5 = r5.argument(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            android.webkit.WebView.setWebContentsDebuggingEnabled(r5)
            r6.success(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, (Object) null);
        }
    }

    public void dispose() {
        super.dispose();
        for (FlutterWebView next : this.keepAliveWebViews.values()) {
            if (next.keepAliveId != null) {
                disposeKeepAlive(next.keepAliveId);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }
}
