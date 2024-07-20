package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class AFg1hSDK {
    public final WeakReference<Context> AFKeystoreWrapper;
    public String valueOf;

    public AFg1hSDK(Context context) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
    }
}
