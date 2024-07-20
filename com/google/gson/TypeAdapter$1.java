package com.google.gson;

import java.io.IOException;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setSelector;

public class TypeAdapter$1 extends setSelector<T> {
    private /* synthetic */ setSelector RemoteActionCompatParcelizer;

    public TypeAdapter$1(setSelector setselector) {
        this.RemoteActionCompatParcelizer = setselector;
    }

    public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
        if (t == null) {
            ontouchobserved.onTransact();
        } else {
            this.RemoteActionCompatParcelizer.asBinder(ontouchobserved, t);
        }
    }

    public final T asBinder(pointInView pointinview) throws IOException {
        if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
            return this.RemoteActionCompatParcelizer.asBinder(pointinview);
        }
        pointinview.AudioAttributesImplBaseParcelizer();
        return null;
    }
}
