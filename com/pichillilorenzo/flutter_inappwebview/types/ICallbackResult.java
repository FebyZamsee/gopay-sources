package com.pichillilorenzo.flutter_inappwebview.types;

import io.flutter.plugin.common.MethodChannel;

public interface ICallbackResult<T> extends MethodChannel.Result {
    T decodeResult(Object obj);

    void defaultBehaviour(T t);

    boolean nonNullSuccess(T t);

    boolean nullSuccess();
}
