package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzll implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    zzll() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
