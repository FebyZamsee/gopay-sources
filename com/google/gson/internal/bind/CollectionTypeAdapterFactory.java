package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import o.FitWindowsFrameLayout;
import o.isSelectedChildViewEnabled;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelectedChildViewEnabled;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class CollectionTypeAdapterFactory implements setListSelectionHidden {
    private final isSelectedChildViewEnabled RemoteActionCompatParcelizer;

    public CollectionTypeAdapterFactory(isSelectedChildViewEnabled isselectedchildviewenabled) {
        this.RemoteActionCompatParcelizer = isselectedchildviewenabled;
    }

    static final class Adapter<E> extends setSelector<Collection<E>> {
        private final setSelector<E> asBinder;
        private final FitWindowsFrameLayout<? extends Collection<E>> read;

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                ontouchobserved.onTransact();
                return;
            }
            ontouchobserved.asBinder();
            for (Object asBinder2 : collection) {
                this.asBinder.asBinder(ontouchobserved, asBinder2);
            }
            ontouchobserved.RemoteActionCompatParcelizer();
        }

        public Adapter(Gson gson, Type type, setSelector<E> setselector, FitWindowsFrameLayout<? extends Collection<E>> fitWindowsFrameLayout) {
            this.asBinder = new TypeAdapterRuntimeTypeWrapper(gson, setselector, type);
            this.read = fitWindowsFrameLayout;
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            Collection collection = (Collection) this.read.asBinder();
            pointinview.asInterface();
            while (pointinview.AudioAttributesCompatParcelizer()) {
                collection.add(this.asBinder.asBinder(pointinview));
            }
            pointinview.read();
            return collection;
        }
    }

    public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
        Type type = toglobalmotionevent.RemoteActionCompatParcelizer;
        Class<? super T> cls = toglobalmotionevent.asBinder;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type asInterface = setSelectedChildViewEnabled.asInterface(type, cls);
        return new Adapter(gson, asInterface, gson.read(new toGlobalMotionEvent(asInterface)), this.RemoteActionCompatParcelizer.asInterface(toglobalmotionevent));
    }
}
