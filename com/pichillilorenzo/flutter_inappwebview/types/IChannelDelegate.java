package com.pichillilorenzo.flutter_inappwebview.types;

import io.flutter.plugin.common.MethodChannel;

public interface IChannelDelegate extends MethodChannel.MethodCallHandler, Disposable {
    MethodChannel getChannel();
}