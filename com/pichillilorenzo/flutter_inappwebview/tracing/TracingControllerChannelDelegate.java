package com.pichillilorenzo.flutter_inappwebview.tracing;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;

public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager2, MethodChannel methodChannel) {
        super(methodChannel);
        this.tracingControllerManager = tracingControllerManager2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r8, io.flutter.plugin.common.MethodChannel.Result r9) {
        /*
            r7 = this;
            com.pichillilorenzo.flutter_inappwebview.tracing.TracingControllerManager.init()
            androidx.webkit.TracingController r0 = com.pichillilorenzo.flutter_inappwebview.tracing.TracingControllerManager.tracingController
            java.lang.String r1 = r8.method
            r1.hashCode()
            int r2 = r1.hashCode()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = -1647175624(0xffffffff9dd21838, float:-5.561158E-21)
            r5 = 2
            r6 = 1
            if (r2 == r4) goto L_0x0036
            r4 = 3540994(0x360802, float:4.96199E-39)
            if (r2 == r4) goto L_0x002c
            r4 = 109757538(0x68ac462, float:5.219839E-35)
            if (r2 == r4) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r2 = "start"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 2
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "stop"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 1
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "isTracing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 0
            goto L_0x0041
        L_0x0040:
            r1 = -1
        L_0x0041:
            if (r1 == 0) goto L_0x00a9
            java.lang.String r2 = "TRACING_CONTROLLER_BASIC_USAGE"
            if (r1 == r6) goto L_0x0076
            if (r1 == r5) goto L_0x004d
            r9.notImplemented()
            return
        L_0x004d:
            if (r0 == 0) goto L_0x0072
            boolean r1 = androidx.webkit.WebViewFeature.isFeatureSupported(r2)
            if (r1 == 0) goto L_0x0072
            java.lang.String r1 = "settings"
            java.lang.Object r8 = r8.argument(r1)
            java.util.Map r8 = (java.util.Map) r8
            com.pichillilorenzo.flutter_inappwebview.tracing.TracingSettings r1 = new com.pichillilorenzo.flutter_inappwebview.tracing.TracingSettings
            r1.<init>()
            r1.parse((java.util.Map) r8)
            androidx.webkit.TracingConfig r8 = com.pichillilorenzo.flutter_inappwebview.tracing.TracingControllerManager.buildTracingConfig(r1)
            r0.start(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9.success(r8)
            return
        L_0x0072:
            r9.success(r3)
            return
        L_0x0076:
            if (r0 == 0) goto L_0x00a5
            boolean r1 = androidx.webkit.WebViewFeature.isFeatureSupported(r2)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = "filePath"
            java.lang.Object r8 = r8.argument(r1)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0090
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x008e }
            r1.<init>(r8)     // Catch:{ FileNotFoundException -> 0x008e }
            goto L_0x0091
        L_0x008e:
            r8 = move-exception
            goto L_0x00a1
        L_0x0090:
            r1 = 0
        L_0x0091:
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ FileNotFoundException -> 0x008e }
            boolean r8 = r0.stop(r1, r8)     // Catch:{ FileNotFoundException -> 0x008e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ FileNotFoundException -> 0x008e }
            r9.success(r8)     // Catch:{ FileNotFoundException -> 0x008e }
            return
        L_0x00a1:
            r8.printStackTrace()
            goto L_0x00b7
        L_0x00a5:
            r9.success(r3)
            return
        L_0x00a9:
            if (r0 == 0) goto L_0x00b7
            boolean r8 = r0.isTracing()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9.success(r8)
            return
        L_0x00b7:
            r9.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.tracing.TracingControllerChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }
}
