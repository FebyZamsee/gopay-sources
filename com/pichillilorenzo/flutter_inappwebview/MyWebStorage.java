package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyWebStorage extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            init()
            java.lang.String r0 = r9.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r1) {
                case -1308548435: goto L_0x0041;
                case -1117417280: goto L_0x0036;
                case -876677967: goto L_0x002c;
                case -165580329: goto L_0x0022;
                case 843309476: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x004b
        L_0x0018:
            java.lang.String r1 = "getUsageForOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 4
            goto L_0x004c
        L_0x0022:
            java.lang.String r1 = "getOrigins"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 3
            goto L_0x004c
        L_0x002c:
            java.lang.String r1 = "deleteOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 2
            goto L_0x004c
        L_0x0036:
            java.lang.String r1 = "deleteAllData"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003f
            goto L_0x004b
        L_0x003f:
            r0 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "getQuotaForOrigin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            goto L_0x004c
        L_0x004b:
            r0 = -1
        L_0x004c:
            java.lang.String r1 = "origin"
            if (r0 == 0) goto L_0x0090
            if (r0 == r7) goto L_0x0081
            if (r0 == r6) goto L_0x006a
            if (r0 == r5) goto L_0x0066
            if (r0 == r4) goto L_0x005c
            r10.notImplemented()
            return
        L_0x005c:
            java.lang.Object r9 = r9.argument(r1)
            java.lang.String r9 = (java.lang.String) r9
            r8.getUsageForOrigin(r9, r10)
            return
        L_0x0066:
            r8.getOrigins(r10)
            return
        L_0x006a:
            android.webkit.WebStorage r0 = webStorageManager
            if (r0 == 0) goto L_0x007d
            java.lang.Object r9 = r9.argument(r1)
            java.lang.String r9 = (java.lang.String) r9
            android.webkit.WebStorage r0 = webStorageManager
            r0.deleteOrigin(r9)
            r10.success(r2)
            return
        L_0x007d:
            r10.success(r3)
            return
        L_0x0081:
            android.webkit.WebStorage r9 = webStorageManager
            if (r9 == 0) goto L_0x008c
            r9.deleteAllData()
            r10.success(r2)
            return
        L_0x008c:
            r10.success(r3)
            return
        L_0x0090:
            java.lang.Object r9 = r9.argument(r1)
            java.lang.String r9 = (java.lang.String) r9
            r8.getQuotaForOrigin(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void getOrigins(final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() {
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : map.keySet()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(obj);
                        HashMap hashMap = new HashMap();
                        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, origin.getOrigin());
                        hashMap.put("quota", Long.valueOf(origin.getQuota()));
                        hashMap.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(hashMap);
                    }
                    result.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() {
                public void onReceiveValue(Long l) {
                    result.success(l);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() {
                public void onReceiveValue(Long l) {
                    result.success(l);
                }
            });
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
}
