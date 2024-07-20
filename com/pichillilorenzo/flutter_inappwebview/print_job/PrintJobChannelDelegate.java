package com.pichillilorenzo.flutter_inappwebview.print_job;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;

public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController2, MethodChannel methodChannel) {
        super(methodChannel);
        this.printJobController = printJobController2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r7, io.flutter.plugin.common.MethodChannel.Result r8) {
        /*
            r6 = this;
            java.lang.String r7 = r7.method
            r7.hashCode()
            int r0 = r7.hashCode()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1367724422: goto L_0x0033;
                case -75444956: goto L_0x0028;
                case 1097506319: goto L_0x001e;
                case 1671767583: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003d
        L_0x0014:
            java.lang.String r0 = "dispose"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003d
            r7 = 3
            goto L_0x003e
        L_0x001e:
            java.lang.String r0 = "restart"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003d
            r7 = 2
            goto L_0x003e
        L_0x0028:
            java.lang.String r0 = "getInfo"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            r7 = 1
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "cancel"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003d
            r7 = 0
            goto L_0x003e
        L_0x003d:
            r7 = -1
        L_0x003e:
            if (r7 == 0) goto L_0x007f
            if (r7 == r5) goto L_0x0068
            if (r7 == r4) goto L_0x0059
            if (r7 == r3) goto L_0x004a
            r8.notImplemented()
            return
        L_0x004a:
            com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController r7 = r6.printJobController
            if (r7 == 0) goto L_0x0055
            r7.dispose()
            r8.success(r1)
            return
        L_0x0055:
            r8.success(r2)
            return
        L_0x0059:
            com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController r7 = r6.printJobController
            if (r7 == 0) goto L_0x0064
            r7.restart()
            r8.success(r1)
            return
        L_0x0064:
            r8.success(r2)
            return
        L_0x0068:
            com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController r7 = r6.printJobController
            r0 = 0
            if (r7 == 0) goto L_0x007b
            com.pichillilorenzo.flutter_inappwebview.types.PrintJobInfoExt r7 = r7.getInfo()
            if (r7 == 0) goto L_0x0077
            java.util.Map r0 = r7.toMap()
        L_0x0077:
            r8.success(r0)
            return
        L_0x007b:
            r8.success(r0)
            return
        L_0x007f:
            com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController r7 = r6.printJobController
            if (r7 == 0) goto L_0x008a
            r7.cancel()
            r8.success(r1)
            return
        L_0x008a:
            r8.success(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }
}
