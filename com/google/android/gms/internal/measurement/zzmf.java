package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzmf implements PrivilegedExceptionAction<Unsafe> {
    public final /* synthetic */ Object run() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (Unsafe.class.isInstance(obj)) {
                return Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    zzmf() {
    }
}
