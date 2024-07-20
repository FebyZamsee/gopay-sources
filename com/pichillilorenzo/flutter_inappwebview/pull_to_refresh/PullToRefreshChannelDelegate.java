package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, MethodChannel methodChannel) {
        super(methodChannel);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r8, io.flutter.plugin.common.MethodChannel.Result r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = -1
            r5 = 0
            r6 = 1
            switch(r1) {
                case -1790841290: goto L_0x0071;
                case 154556713: goto L_0x0067;
                case 1235582893: goto L_0x005d;
                case 1364071551: goto L_0x0053;
                case 1389555745: goto L_0x0049;
                case 1743806995: goto L_0x003f;
                case 1807783361: goto L_0x0035;
                case 1849446385: goto L_0x002b;
                case 1984958339: goto L_0x0020;
                case 2105594551: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x007b
        L_0x0015:
            java.lang.String r1 = "isEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 9
            goto L_0x007c
        L_0x0020:
            java.lang.String r1 = "setSize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 8
            goto L_0x007c
        L_0x002b:
            java.lang.String r1 = "isRefreshing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 7
            goto L_0x007c
        L_0x0035:
            java.lang.String r1 = "setDistanceToTriggerSync"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 6
            goto L_0x007c
        L_0x003f:
            java.lang.String r1 = "setBackgroundColor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 5
            goto L_0x007c
        L_0x0049:
            java.lang.String r1 = "setColor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 4
            goto L_0x007c
        L_0x0053:
            java.lang.String r1 = "setEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x005d:
            java.lang.String r1 = "getDefaultSlingshotDistance"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r1 = "setRefreshing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x0071:
            java.lang.String r1 = "setSlingshotDistance"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            java.lang.String r1 = "color"
            switch(r0) {
                case 0: goto L_0x0169;
                case 1: goto L_0x014c;
                case 2: goto L_0x0144;
                case 3: goto L_0x0121;
                case 4: goto L_0x0102;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00b6;
                case 8: goto L_0x0099;
                case 9: goto L_0x0085;
                default: goto L_0x0081;
            }
        L_0x0081:
            r9.notImplemented()
            return
        L_0x0085:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r8 = r7.pullToRefreshView
            if (r8 == 0) goto L_0x0095
            boolean r8 = r8.isEnabled()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9.success(r8)
            return
        L_0x0095:
            r9.success(r3)
            return
        L_0x0099:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "size"
            java.lang.Object r8 = r8.argument(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            int r8 = r8.intValue()
            r0.setSize(r8)
            r9.success(r2)
            return
        L_0x00b2:
            r9.success(r3)
            return
        L_0x00b6:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r8 = r7.pullToRefreshView
            if (r8 == 0) goto L_0x00c2
            boolean r8 = r8.isRefreshing()
            if (r8 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r5 = 1
        L_0x00c2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r9.success(r8)
            return
        L_0x00ca:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "distanceToTriggerSync"
            java.lang.Object r8 = r8.argument(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            int r8 = r8.intValue()
            r0.setDistanceToTriggerSync(r8)
            r9.success(r2)
            return
        L_0x00e3:
            r9.success(r3)
            return
        L_0x00e7:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r8 = r8.argument(r1)
            java.lang.String r8 = (java.lang.String) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            int r8 = android.graphics.Color.parseColor(r8)
            r0.setProgressBackgroundColorSchemeColor(r8)
            r9.success(r2)
            return
        L_0x00fe:
            r9.success(r3)
            return
        L_0x0102:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x011d
            java.lang.Object r8 = r8.argument(r1)
            java.lang.String r8 = (java.lang.String) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            int[] r1 = new int[r6]
            int r8 = android.graphics.Color.parseColor(r8)
            r1[r5] = r8
            r0.setColorSchemeColors(r1)
            r9.success(r2)
            return
        L_0x011d:
            r9.success(r3)
            return
        L_0x0121:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "enabled"
            java.lang.Object r8 = r8.argument(r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshSettings r0 = r0.settings
            r0.enabled = r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            boolean r8 = r8.booleanValue()
            r0.setEnabled(r8)
            r9.success(r2)
            return
        L_0x0140:
            r9.success(r3)
            return
        L_0x0144:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9.success(r8)
            return
        L_0x014c:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "refreshing"
            java.lang.Object r8 = r8.argument(r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            boolean r8 = r8.booleanValue()
            r0.setRefreshing(r8)
            r9.success(r2)
            return
        L_0x0165:
            r9.success(r3)
            return
        L_0x0169:
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "slingshotDistance"
            java.lang.Object r8 = r8.argument(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout r0 = r7.pullToRefreshView
            int r8 = r8.intValue()
            r0.setSlingshotDistance(r8)
            r9.success(r2)
            return
        L_0x0182:
            r9.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onRefresh() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onRefresh", new HashMap());
        }
    }

    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }
}
