package com.appsflyer.internal;

import java.util.Locale;

public enum AFf1fSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
