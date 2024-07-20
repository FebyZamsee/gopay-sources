package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator<T> implements Iterator<T> {
    protected final DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(DataBuffer dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() - 1;
    }

    public Object next() {
        if (hasNext()) {
            DataBuffer dataBuffer = this.zaa;
            int i = this.zab + 1;
            this.zab = i;
            return dataBuffer.get(i);
        }
        int i2 = this.zab;
        StringBuilder sb = new StringBuilder("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
