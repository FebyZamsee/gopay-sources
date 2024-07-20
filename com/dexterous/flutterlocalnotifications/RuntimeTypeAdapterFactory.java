package com.dexterous.flutterlocalnotifications;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter$1;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.DropDownListView;
import o.dispatchDraw;
import o.hasFocus;
import o.hasWindowFocus;
import o.isFocused;
import o.onTouchObserved;
import o.pointInView;
import o.post;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class RuntimeTypeAdapterFactory<T> implements setListSelectionHidden {
    /* access modifiers changed from: private */
    public final String RemoteActionCompatParcelizer;
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> asBinder = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Class<?> asInterface;
    private final Map<String, Class<?>> read = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (cls != null) {
            this.asInterface = cls;
            this.RemoteActionCompatParcelizer = str;
            return;
        }
        throw null;
    }

    public static <T> RuntimeTypeAdapterFactory<T> asInterface(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public final RuntimeTypeAdapterFactory<T> asBinder(Class<? extends T> cls, String str) {
        if (str == null) {
            throw null;
        } else if (this.asBinder.containsKey(cls) || this.read.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.read.put(str, cls);
            this.asBinder.put(cls, str);
            return this;
        }
    }

    public final <R> setSelector<R> asInterface(Gson gson, toGlobalMotionEvent<R> toglobalmotionevent) {
        if (toglobalmotionevent.asBinder != this.asInterface) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.read.entrySet()) {
            setSelector asInterface2 = gson.asInterface((setListSelectionHidden) this, new toGlobalMotionEvent((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), asInterface2);
            linkedHashMap2.put((Class) next.getValue(), asInterface2);
        }
        return new TypeAdapter$1(new setSelector<R>() {
            public final R asBinder(pointInView pointinview) throws IOException {
                hasWindowFocus asBinder = DropDownListView.ResolveHoverRunnable.asBinder(pointinview);
                dispatchDraw AudioAttributesImplApi21Parcelizer = asBinder.AudioAttributesImplApi21Parcelizer();
                hasWindowFocus remove = AudioAttributesImplApi21Parcelizer.asInterface.remove(RuntimeTypeAdapterFactory.this.RemoteActionCompatParcelizer);
                if (remove != null) {
                    String IconCompatParcelizer = remove.IconCompatParcelizer();
                    setSelector setselector = (setSelector) linkedHashMap.get(IconCompatParcelizer);
                    if (setselector != null) {
                        return setselector.onTransact(asBinder);
                    }
                    StringBuilder sb = new StringBuilder("cannot deserialize ");
                    sb.append(RuntimeTypeAdapterFactory.this.asInterface);
                    sb.append(" subtype named ");
                    sb.append(IconCompatParcelizer);
                    sb.append("; did you forget to register a subtype?");
                    throw new JsonParseException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("cannot deserialize ");
                sb2.append(RuntimeTypeAdapterFactory.this.asInterface);
                sb2.append(" because it does not define a field named ");
                sb2.append(RuntimeTypeAdapterFactory.this.RemoteActionCompatParcelizer);
                throw new JsonParseException(sb2.toString());
            }

            public final void asBinder(onTouchObserved ontouchobserved, R r) throws IOException {
                Class<?> cls = r.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.asBinder.get(cls);
                setSelector setselector = (setSelector) linkedHashMap2.get(cls);
                if (setselector != null) {
                    dispatchDraw AudioAttributesImplApi21Parcelizer = setselector.RemoteActionCompatParcelizer(r).AudioAttributesImplApi21Parcelizer();
                    if (!AudioAttributesImplApi21Parcelizer.asInterface.containsKey(RuntimeTypeAdapterFactory.this.RemoteActionCompatParcelizer)) {
                        dispatchDraw dispatchdraw = new dispatchDraw();
                        dispatchdraw.asInterface.put(RuntimeTypeAdapterFactory.this.RemoteActionCompatParcelizer, new isFocused(str));
                        for (Map.Entry next : AudioAttributesImplApi21Parcelizer.asInterface.entrySet()) {
                            String str2 = (String) next.getKey();
                            Object obj = (hasWindowFocus) next.getValue();
                            post<String, hasWindowFocus> post = dispatchdraw.asInterface;
                            if (obj == null) {
                                obj = hasFocus.asInterface;
                            }
                            post.put(str2, obj);
                        }
                        TypeAdapters.MediaBrowserCompat$CustomActionResultReceiver.asBinder(ontouchobserved, dispatchdraw);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("cannot serialize ");
                    sb.append(cls.getName());
                    sb.append(" because it already defines a field named ");
                    sb.append(RuntimeTypeAdapterFactory.this.RemoteActionCompatParcelizer);
                    throw new JsonParseException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("cannot serialize ");
                sb2.append(cls.getName());
                sb2.append("; did you forget to register a subtype?");
                throw new JsonParseException(sb2.toString());
            }
        });
    }
}
