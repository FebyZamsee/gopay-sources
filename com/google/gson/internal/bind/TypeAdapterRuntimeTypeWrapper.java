package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o.onTouchObserved;
import o.pointInView;
import o.setSelector;
import o.toGlobalMotionEvent;

final class TypeAdapterRuntimeTypeWrapper<T> extends setSelector<T> {
    private final Gson asBinder;
    private final setSelector<T> asInterface;
    private final Type read;

    TypeAdapterRuntimeTypeWrapper(Gson gson, setSelector<T> setselector, Type type) {
        this.asBinder = gson;
        this.asInterface = setselector;
        this.read = type;
    }

    public final T asBinder(pointInView pointinview) throws IOException {
        return this.asInterface.asBinder(pointinview);
    }

    public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
        setSelector<T> setselector = this.asInterface;
        Type type = this.read;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.read) {
            setselector = this.asBinder.read(new toGlobalMotionEvent(type));
            if (setselector instanceof ReflectiveTypeAdapterFactory.Adapter) {
                setSelector<T> setselector2 = this.asInterface;
                if (!(setselector2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    setselector = setselector2;
                }
            }
        }
        setselector.asBinder(ontouchobserved, t);
    }
}
