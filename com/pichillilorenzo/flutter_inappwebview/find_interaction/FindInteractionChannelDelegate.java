package com.pichillilorenzo.flutter_inappwebview.find_interaction;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.FindSession;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController2, MethodChannel methodChannel) {
        super(methodChannel);
        this.findInteractionController = findInteractionController2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.method
            r0.hashCode()
            int r1 = r0.hashCode()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r1) {
                case -1008221461: goto L_0x0048;
                case -853211864: goto L_0x003e;
                case -679382964: goto L_0x0034;
                case -234090249: goto L_0x002a;
                case 817048102: goto L_0x0020;
                case 2137531137: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0052
        L_0x0016:
            java.lang.String r1 = "getActiveFindSession"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 5
            goto L_0x0053
        L_0x0020:
            java.lang.String r1 = "clearMatches"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 4
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "setSearchText"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "findNext"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "findAll"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "getSearchText"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            if (r0 == 0) goto L_0x00cb
            if (r0 == r8) goto L_0x00b6
            if (r0 == r7) goto L_0x009d
            if (r0 == r6) goto L_0x0087
            if (r0 == r5) goto L_0x007c
            if (r0 == r4) goto L_0x0063
            r11.notImplemented()
            return
        L_0x0063:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r10 = r9.findInteractionController
            if (r10 == 0) goto L_0x0077
            com.pichillilorenzo.flutter_inappwebview.types.FindSession r10 = r10.activeFindSession
            if (r10 == 0) goto L_0x0077
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r10 = r9.findInteractionController
            com.pichillilorenzo.flutter_inappwebview.types.FindSession r10 = r10.activeFindSession
            java.util.Map r10 = r10.toMap()
            r11.success(r10)
            return
        L_0x0077:
            r10 = 0
            r11.success(r10)
            return
        L_0x007c:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r10 = r9.findInteractionController
            if (r10 == 0) goto L_0x0083
            r10.clearMatches()
        L_0x0083:
            r11.success(r3)
            return
        L_0x0087:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r0 = r9.findInteractionController
            if (r0 == 0) goto L_0x0099
            java.lang.String r1 = "searchText"
            java.lang.Object r10 = r10.argument(r1)
            java.lang.String r10 = (java.lang.String) r10
            r0.searchText = r10
            r11.success(r3)
            return
        L_0x0099:
            r11.success(r2)
            return
        L_0x009d:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r0 = r9.findInteractionController
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "forward"
            java.lang.Object r10 = r10.argument(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r0 = r9.findInteractionController
            boolean r10 = r10.booleanValue()
            r0.findNext(r10)
        L_0x00b2:
            r11.success(r3)
            return
        L_0x00b6:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r0 = r9.findInteractionController
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "find"
            java.lang.Object r10 = r10.argument(r0)
            java.lang.String r10 = (java.lang.String) r10
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r0 = r9.findInteractionController
            r0.findAll(r10)
        L_0x00c7:
            r11.success(r3)
            return
        L_0x00cb:
            com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController r10 = r9.findInteractionController
            if (r10 == 0) goto L_0x00d5
            java.lang.String r10 = r10.searchText
            r11.success(r10)
            return
        L_0x00d5:
            r11.success(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionChannelDelegate.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onFindResultReceived(int i, int i2, boolean z) {
        FindInteractionController findInteractionController2;
        MethodChannel channel = getChannel();
        if (channel != null) {
            if (!(!z || (findInteractionController2 = this.findInteractionController) == null || findInteractionController2.webView == null)) {
                this.findInteractionController.activeFindSession = new FindSession(i2, i);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i));
            hashMap.put("numberOfMatches", Integer.valueOf(i2));
            hashMap.put("isDoneCounting", Boolean.valueOf(z));
            channel.invokeMethod("onFindResultReceived", hashMap);
        }
    }

    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }
}
