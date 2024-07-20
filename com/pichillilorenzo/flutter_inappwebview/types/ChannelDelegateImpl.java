package com.pichillilorenzo.flutter_inappwebview.types;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class ChannelDelegateImpl implements IChannelDelegate {
    private MethodChannel channel;

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
    }

    public ChannelDelegateImpl(MethodChannel methodChannel) {
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public MethodChannel getChannel() {
        return this.channel;
    }

    public void dispose() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.channel = null;
        }
    }
}
