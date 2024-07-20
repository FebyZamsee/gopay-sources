package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity2, MethodChannel methodChannel) {
        super(methodChannel);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r11, io.flutter.plugin.common.MethodChannel.Result r12) {
        /*
            r10 = this;
            java.lang.String r0 = r11.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r1) {
                case -675108676: goto L_0x0049;
                case -334843312: goto L_0x003e;
                case 50870385: goto L_0x0034;
                case 94756344: goto L_0x002a;
                case 1256059502: goto L_0x0020;
                case 2000053463: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0053
        L_0x0016:
            java.lang.String r1 = "mayLaunchUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 5
            goto L_0x0054
        L_0x0020:
            java.lang.String r1 = "validateRelationship"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 4
            goto L_0x0054
        L_0x002a:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 3
            goto L_0x0054
        L_0x0034:
            java.lang.String r1 = "updateActionButton"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 2
            goto L_0x0054
        L_0x003e:
            java.lang.String r1 = "updateSecondaryToolbar"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            r0 = 1
            goto L_0x0054
        L_0x0049:
            java.lang.String r1 = "launchUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 0
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            java.lang.String r1 = "otherLikelyURLs"
            java.lang.String r9 = "url"
            if (r0 == 0) goto L_0x0151
            if (r0 == r8) goto L_0x0134
            if (r0 == r7) goto L_0x0113
            if (r0 == r6) goto L_0x00bf
            if (r0 == r5) goto L_0x008a
            if (r0 == r4) goto L_0x0068
            r12.notImplemented()
            return
        L_0x0068:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r11.argument(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r11 = r11.argument(r1)
            java.util.List r11 = (java.util.List) r11
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r1 = r10.chromeCustomTabsActivity
            boolean r11 = r1.mayLaunchUrl(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12.success(r11)
            return
        L_0x0086:
            r12.success(r3)
            return
        L_0x008a:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            if (r0 == 0) goto L_0x00bb
            androidx.browser.customtabs.CustomTabsSession r0 = r0.customTabsSession
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "relation"
            java.lang.Object r0 = r11.argument(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "origin"
            java.lang.Object r11 = r11.argument(r1)
            java.lang.String r11 = (java.lang.String) r11
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r1 = r10.chromeCustomTabsActivity
            androidx.browser.customtabs.CustomTabsSession r1 = r1.customTabsSession
            int r0 = r0.intValue()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r2 = 0
            boolean r11 = r1.validateRelationship(r0, r11, r2)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12.success(r11)
            return
        L_0x00bb:
            r12.success(r3)
            return
        L_0x00bf:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            if (r11 == 0) goto L_0x010f
            r11.onStop()
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            r11.onDestroy()
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            r11.close()
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager r11 = r11.manager
            if (r11 == 0) goto L_0x0106
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager r11 = r11.manager
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r11 = r11.plugin
            if (r11 == 0) goto L_0x0106
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager r11 = r11.manager
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r11 = r11.plugin
            android.app.Activity r11 = r11.activity
            if (r11 == 0) goto L_0x0106
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager r11 = r11.manager
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r11 = r11.plugin
            android.app.Activity r11 = r11.activity
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class r1 = r11.getClass()
            r0.<init>(r11, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r1)
            r11.startActivity(r0)
        L_0x0106:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r11 = r10.chromeCustomTabsActivity
            r11.dispose()
            r12.success(r2)
            return
        L_0x010f:
            r12.success(r3)
            return
        L_0x0113:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "icon"
            java.lang.Object r0 = r11.argument(r0)
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = "description"
            java.lang.Object r11 = r11.argument(r1)
            java.lang.String r11 = (java.lang.String) r11
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r1 = r10.chromeCustomTabsActivity
            r1.updateActionButton(r0, r11)
            r12.success(r2)
            return
        L_0x0130:
            r12.success(r3)
            return
        L_0x0134:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "secondaryToolbar"
            java.lang.Object r11 = r11.argument(r0)
            java.util.Map r11 = (java.util.Map) r11
            com.pichillilorenzo.flutter_inappwebview.types.CustomTabsSecondaryToolbar r11 = com.pichillilorenzo.flutter_inappwebview.types.CustomTabsSecondaryToolbar.fromMap(r11)
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            r0.updateSecondaryToolbar(r11)
            r12.success(r2)
            return
        L_0x014d:
            r12.success(r3)
            return
        L_0x0151:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r0 = r10.chromeCustomTabsActivity
            if (r0 == 0) goto L_0x0180
            java.lang.Object r0 = r11.argument(r9)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x017c
            java.lang.String r3 = "headers"
            java.lang.Object r3 = r11.argument(r3)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "referrer"
            java.lang.Object r4 = r11.argument(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r11.argument(r1)
            java.util.List r11 = (java.util.List) r11
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity r1 = r10.chromeCustomTabsActivity
            r1.launchUrl(r0, r3, r4, r11)
            r12.success(r2)
            return
        L_0x017c:
            r12.success(r3)
            return
        L_0x0180:
            r12.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onServiceConnected() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onServiceConnected", new HashMap());
        }
    }

    public void onOpened() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onOpened", new HashMap());
        }
    }

    public void onCompletedInitialLoad() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onCompletedInitialLoad", new HashMap());
        }
    }

    public void onNavigationEvent(int i) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("navigationEvent", Integer.valueOf(i));
            channel.invokeMethod("onNavigationEvent", hashMap);
        }
    }

    public void onClosed() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onClosed", new HashMap());
        }
    }

    public void onItemActionPerform(int i, String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i));
            hashMap.put(ImagesContract.URL, str);
            hashMap.put("title", str2);
            channel.invokeMethod("onItemActionPerform", hashMap);
        }
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put(ImagesContract.URL, str2);
            channel.invokeMethod("onSecondaryItemActionPerform", hashMap);
        }
    }

    public void onRelationshipValidationResult(int i, Uri uri, boolean z) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("relation", Integer.valueOf(i));
            hashMap.put("requestedOrigin", uri.toString());
            hashMap.put("result", Boolean.valueOf(z));
            channel.invokeMethod("onRelationshipValidationResult", hashMap);
        }
    }

    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }
}
