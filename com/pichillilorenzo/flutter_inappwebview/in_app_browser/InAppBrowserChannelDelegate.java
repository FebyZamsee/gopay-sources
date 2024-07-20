package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.InAppBrowserMenuItem;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(MethodChannel methodChannel) {
        super(methodChannel);
    }

    public void onBrowserCreated() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onBrowserCreated", new HashMap());
        }
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
            channel.invokeMethod("onMenuItemClicked", hashMap);
        }
    }

    public void onExit() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onExit", new HashMap());
        }
    }
}
