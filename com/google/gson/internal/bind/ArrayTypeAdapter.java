package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelectedChildViewEnabled;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class ArrayTypeAdapter<E> extends setSelector<Object> {
    public static final setListSelectionHidden RemoteActionCompatParcelizer = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            Type type = toglobalmotionevent.RemoteActionCompatParcelizer;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type onTransact = setSelectedChildViewEnabled.onTransact(type);
            return new ArrayTypeAdapter(gson, gson.read(new toGlobalMotionEvent(onTransact)), setSelectedChildViewEnabled.asInterface(onTransact));
        }
    };
    private final Class<E> asInterface;
    private final setSelector<E> onTransact;

    public ArrayTypeAdapter(Gson gson, setSelector<E> setselector, Class<E> cls) {
        this.onTransact = new TypeAdapterRuntimeTypeWrapper(gson, setselector, cls);
        this.asInterface = cls;
    }

    public final Object asBinder(pointInView pointinview) throws IOException {
        if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        pointinview.asInterface();
        while (pointinview.AudioAttributesCompatParcelizer()) {
            arrayList.add(this.onTransact.asBinder(pointinview));
        }
        pointinview.read();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.asInterface, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        if (obj == null) {
            ontouchobserved.onTransact();
            return;
        }
        ontouchobserved.asBinder();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.onTransact.asBinder(ontouchobserved, Array.get(obj, i));
        }
        ontouchobserved.RemoteActionCompatParcelizer();
    }
}
