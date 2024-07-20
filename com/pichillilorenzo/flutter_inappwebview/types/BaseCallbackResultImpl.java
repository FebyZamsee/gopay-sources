package com.pichillilorenzo.flutter_inappwebview.types;

public class BaseCallbackResultImpl<T> implements ICallbackResult<T> {
    public T decodeResult(Object obj) {
        return null;
    }

    public void defaultBehaviour(T t) {
    }

    public void error(String str, String str2, Object obj) {
    }

    public boolean nonNullSuccess(T t) {
        return true;
    }

    public boolean nullSuccess() {
        return true;
    }

    public void success(Object obj) {
        boolean z;
        Object decodeResult = decodeResult(obj);
        if (decodeResult == null) {
            z = nullSuccess();
        } else {
            z = nonNullSuccess(decodeResult);
        }
        if (z) {
            defaultBehaviour(decodeResult);
        }
    }

    public void notImplemented() {
        defaultBehaviour((Object) null);
    }
}
