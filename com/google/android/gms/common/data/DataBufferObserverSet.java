package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private HashSet zaa = new HashSet();

    public final void addObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public final void clear() {
        this.zaa.clear();
    }

    public final boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    public final void onDataChanged() {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataChanged();
        }
    }

    public final void onDataRangeChanged(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeChanged(i, i2);
        }
    }

    public final void onDataRangeInserted(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeInserted(i, i2);
        }
    }

    public final void onDataRangeMoved(int i, int i2, int i3) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeMoved(i, i2, i3);
        }
    }

    public final void onDataRangeRemoved(int i, int i2) {
        Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((DataBufferObserver) it.next()).onDataRangeRemoved(i, i2);
        }
    }

    public final void removeObserver(DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}
