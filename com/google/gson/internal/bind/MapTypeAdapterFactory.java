package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import o.DropDownListView;
import o.FitWindowsFrameLayout;
import o.dispatchDraw;
import o.hasFocus;
import o.hasWindowFocus;
import o.isFocused;
import o.isSelectedChildViewEnabled;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelectedChildViewEnabled;
import o.setSelector;
import o.setSelectorEnabled;
import o.toGlobalMotionEvent;

public final class MapTypeAdapterFactory implements setListSelectionHidden {
    final boolean asBinder;
    private final isSelectedChildViewEnabled onTransact;

    public MapTypeAdapterFactory(isSelectedChildViewEnabled isselectedchildviewenabled, boolean z) {
        this.onTransact = isselectedchildviewenabled;
        this.asBinder = z;
    }

    final class Adapter<K, V> extends setSelector<Map<K, V>> {
        private final setSelector<V> RemoteActionCompatParcelizer;
        private final FitWindowsFrameLayout<? extends Map<K, V>> asBinder;
        private final setSelector<K> asInterface;

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                ontouchobserved.onTransact();
            } else if (!MapTypeAdapterFactory.this.asBinder) {
                ontouchobserved.read();
                for (Map.Entry entry : map.entrySet()) {
                    ontouchobserved.onTransact(String.valueOf(entry.getKey()));
                    this.RemoteActionCompatParcelizer.asBinder(ontouchobserved, entry.getValue());
                }
                ontouchobserved.asInterface();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    hasWindowFocus RemoteActionCompatParcelizer2 = this.asInterface.RemoteActionCompatParcelizer(entry2.getKey());
                    arrayList.add(RemoteActionCompatParcelizer2);
                    arrayList2.add(entry2.getValue());
                    z2 |= (RemoteActionCompatParcelizer2 instanceof setSelectorEnabled) || (RemoteActionCompatParcelizer2 instanceof dispatchDraw);
                }
                if (z2) {
                    ontouchobserved.asBinder();
                    int size = arrayList.size();
                    while (i < size) {
                        ontouchobserved.asBinder();
                        TypeAdapters.MediaBrowserCompat$CustomActionResultReceiver.asBinder(ontouchobserved, (hasWindowFocus) arrayList.get(i));
                        this.RemoteActionCompatParcelizer.asBinder(ontouchobserved, arrayList2.get(i));
                        ontouchobserved.RemoteActionCompatParcelizer();
                        i++;
                    }
                    ontouchobserved.RemoteActionCompatParcelizer();
                    return;
                }
                ontouchobserved.read();
                int size2 = arrayList.size();
                while (i < size2) {
                    hasWindowFocus haswindowfocus = (hasWindowFocus) arrayList.get(i);
                    if (haswindowfocus instanceof isFocused) {
                        isFocused write = haswindowfocus.write();
                        if (write.asBinder instanceof Number) {
                            str = String.valueOf(write.asBinder());
                        } else if (write.asBinder instanceof Boolean) {
                            if (write.asBinder instanceof Boolean) {
                                z = ((Boolean) write.asBinder).booleanValue();
                            } else {
                                z = Boolean.parseBoolean(write.IconCompatParcelizer());
                            }
                            str = Boolean.toString(z);
                        } else if (write.asBinder instanceof String) {
                            str = write.IconCompatParcelizer();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (haswindowfocus instanceof hasFocus) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    ontouchobserved.onTransact(str);
                    this.RemoteActionCompatParcelizer.asBinder(ontouchobserved, arrayList2.get(i));
                    i++;
                }
                ontouchobserved.asInterface();
            }
        }

        public Adapter(Gson gson, Type type, setSelector<K> setselector, Type type2, setSelector<V> setselector2, FitWindowsFrameLayout<? extends Map<K, V>> fitWindowsFrameLayout) {
            this.asInterface = new TypeAdapterRuntimeTypeWrapper(gson, setselector, type);
            this.RemoteActionCompatParcelizer = new TypeAdapterRuntimeTypeWrapper(gson, setselector2, type2);
            this.asBinder = fitWindowsFrameLayout;
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            onTouchForwarded internalConnectionCallback = pointinview.setInternalConnectionCallback();
            if (internalConnectionCallback == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            Map map = (Map) this.asBinder.asBinder();
            if (internalConnectionCallback == onTouchForwarded.BEGIN_ARRAY) {
                pointinview.asInterface();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    pointinview.asInterface();
                    K asBinder2 = this.asInterface.asBinder(pointinview);
                    if (map.put(asBinder2, this.RemoteActionCompatParcelizer.asBinder(pointinview)) == null) {
                        pointinview.read();
                    } else {
                        StringBuilder sb = new StringBuilder("duplicate key: ");
                        sb.append(asBinder2);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                pointinview.read();
            } else {
                pointinview.asBinder();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    DropDownListView.GateKeeperDrawable.onTransact.RemoteActionCompatParcelizer(pointinview);
                    K asBinder3 = this.asInterface.asBinder(pointinview);
                    if (map.put(asBinder3, this.RemoteActionCompatParcelizer.asBinder(pointinview)) != null) {
                        StringBuilder sb2 = new StringBuilder("duplicate key: ");
                        sb2.append(asBinder3);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                pointinview.onTransact();
            }
            return map;
        }
    }

    public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
        setSelector<Boolean> setselector;
        Type type = toglobalmotionevent.RemoteActionCompatParcelizer;
        if (!Map.class.isAssignableFrom(toglobalmotionevent.asBinder)) {
            return null;
        }
        Type[] RemoteActionCompatParcelizer = setSelectedChildViewEnabled.RemoteActionCompatParcelizer(type, setSelectedChildViewEnabled.asInterface(type));
        Type type2 = RemoteActionCompatParcelizer[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            setselector = TypeAdapters.IconCompatParcelizer;
        } else {
            setselector = gson.read(new toGlobalMotionEvent(type2));
        }
        setSelector read = gson.read(new toGlobalMotionEvent(RemoteActionCompatParcelizer[1]));
        FitWindowsFrameLayout<T> asInterface = this.onTransact.asInterface(toglobalmotionevent);
        return new Adapter(gson, RemoteActionCompatParcelizer[0], setselector, RemoteActionCompatParcelizer[1], read, asInterface);
    }
}
