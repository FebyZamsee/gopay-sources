package com.gojek.narad.core.internal.di.module;

import com.google.gson.Gson;
import o.R;
import o.getTintList;
import o.requestsActionButton;
import o.target;
import o.tintDrawableUsingColorFilter;

public final class PushNotificationsModule {
    static {
        new PushNotificationsModule();
    }

    private PushNotificationsModule() {
    }

    public static final Gson onTransact() {
        return new Gson();
    }

    public static final getTintList asBinder() {
        return new getTintList();
    }

    public static final R.integer RemoteActionCompatParcelizer() {
        return new requestsActionButton.asBinder();
    }

    public static final R.layout read() {
        return new tintDrawableUsingColorFilter();
    }

    public static final target asInterface() {
        return new target();
    }
}
