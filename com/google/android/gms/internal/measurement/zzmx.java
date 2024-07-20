package com.google.android.gms.internal.measurement;

public enum zzmx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzhm.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzmx(Object obj) {
        this.zzk = obj;
    }
}
