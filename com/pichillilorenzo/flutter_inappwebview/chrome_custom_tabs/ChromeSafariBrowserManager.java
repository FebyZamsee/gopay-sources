package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers = new HashMap();
    public String id;
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        String obj = UUID.randomUUID().toString();
        this.id = obj;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(obj, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r14, io.flutter.plugin.common.MethodChannel.Result r15) {
        /*
            r13 = this;
            java.lang.String r0 = "id"
            java.lang.Object r0 = r14.argument(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r14.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4 = -1382009261(0xffffffffada03653, float:-1.8214019E-11)
            r5 = 2
            r6 = 1
            if (r1 == r4) goto L_0x003a
            r4 = 3417674(0x34264a, float:4.789181E-39)
            if (r1 == r4) goto L_0x0030
            r4 = 444517567(0x1a7eccbf, float:5.269136E-23)
            if (r1 == r4) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            java.lang.String r1 = "isAvailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r1 = "open"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r1 = "getMaxToolbarItems"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            if (r0 == 0) goto L_0x00c9
            if (r0 == r6) goto L_0x006b
            if (r0 == r5) goto L_0x004f
            r15.notImplemented()
            return
        L_0x004f:
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r14 = r13.plugin
            if (r14 == 0) goto L_0x0067
            android.app.Activity r14 = r14.activity
            if (r14 == 0) goto L_0x0067
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r14 = r13.plugin
            android.app.Activity r14 = r14.activity
            boolean r14 = com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.isAvailable(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15.success(r14)
            return
        L_0x0067:
            r15.success(r2)
            return
        L_0x006b:
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r0 = r13.plugin
            if (r0 == 0) goto L_0x00c5
            android.app.Activity r0 = r0.activity
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "url"
            java.lang.Object r0 = r14.argument(r0)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "headers"
            java.lang.Object r0 = r14.argument(r0)
            r5 = r0
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r0 = "referrer"
            java.lang.Object r0 = r14.argument(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "otherLikelyURLs"
            java.lang.Object r0 = r14.argument(r0)
            r7 = r0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.String r0 = "settings"
            java.lang.Object r0 = r14.argument(r0)
            r8 = r0
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.String r0 = "actionButton"
            java.lang.Object r0 = r14.argument(r0)
            r9 = r0
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.String r0 = "secondaryToolbar"
            java.lang.Object r0 = r14.argument(r0)
            r10 = r0
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.String r0 = "menuItemList"
            java.lang.Object r14 = r14.argument(r0)
            r11 = r14
            java.util.List r11 = (java.util.List) r11
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r14 = r13.plugin
            android.app.Activity r2 = r14.activity
            r1 = r13
            r12 = r15
            r1.open(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00c5:
            r15.success(r2)
            return
        L_0x00c9:
            int r14 = androidx.browser.customtabs.CustomTabsIntent.getMaxToolbarItems()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.success(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, String str3, ArrayList<String> arrayList, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, List<HashMap<String, Object>> list, MethodChannel.Result result) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putString(ImagesContract.URL, str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("headers", hashMap);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", hashMap2);
        bundle.putSerializable("actionButton", hashMap3);
        bundle.putSerializable("secondaryToolbar", hashMap4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap2, "isTrustedWebActivity", bool);
        if (CustomTabActivityHelper.isAvailable(activity)) {
            if (!bool2.booleanValue()) {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class;
            } else {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class;
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtras(bundle);
            if (((Boolean) Util.getOrDefault(hashMap2, "noHistory", bool)).booleanValue()) {
                intent.addFlags(BasicMeasure.EXACTLY);
            }
            activity.startActivity(intent);
            result.success(Boolean.TRUE);
            return;
        }
        result.error(LOG_TAG, "ChromeCustomTabs is not available!", (Object) null);
    }

    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity next : this.browsers.values()) {
            if (next != null) {
                next.close();
                next.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.id);
        this.plugin = null;
    }
}
