package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    public UnsupportedApiCallException(Feature feature) {
        this.zza = feature;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.zza)));
    }
}
