package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Type;
import o.DrawableContainerCompat;
import o.DropDownListView;
import o.hasFocus;
import o.hasWindowFocus;
import o.isInTouchMode;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.superIsSelectedChildViewEnabled;
import o.toGlobalMotionEvent;

public final class TreeTypeAdapter<T> extends setSelector<T> {
    private final toGlobalMotionEvent<T> AudioAttributesCompatParcelizer;
    private Gson RemoteActionCompatParcelizer;
    private final superIsSelectedChildViewEnabled<T> asBinder;
    private final isInTouchMode<T> asInterface;
    private final TreeTypeAdapter<T>.onTransact onTransact = new onTransact(this, (byte) 0);
    private setSelector<T> read;
    private final setListSelectionHidden write;

    public TreeTypeAdapter(isInTouchMode<T> isintouchmode, superIsSelectedChildViewEnabled<T> superisselectedchildviewenabled, Gson gson, toGlobalMotionEvent<T> toglobalmotionevent, setListSelectionHidden setlistselectionhidden) {
        this.asInterface = isintouchmode;
        this.asBinder = superisselectedchildviewenabled;
        this.RemoteActionCompatParcelizer = gson;
        this.AudioAttributesCompatParcelizer = toglobalmotionevent;
        this.write = setlistselectionhidden;
    }

    public final T asBinder(pointInView pointinview) throws IOException {
        if (this.asBinder == null) {
            setSelector<T> setselector = this.read;
            if (setselector == null) {
                setselector = this.RemoteActionCompatParcelizer.asInterface(this.write, this.AudioAttributesCompatParcelizer);
                this.read = setselector;
            }
            return setselector.asBinder(pointinview);
        }
        hasWindowFocus asBinder2 = DropDownListView.ResolveHoverRunnable.asBinder(pointinview);
        if (asBinder2 instanceof hasFocus) {
            return null;
        }
        superIsSelectedChildViewEnabled<T> superisselectedchildviewenabled = this.asBinder;
        Type type = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        return superisselectedchildviewenabled.onTransact(asBinder2);
    }

    public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
        isInTouchMode<T> isintouchmode = this.asInterface;
        if (isintouchmode == null) {
            setSelector<T> setselector = this.read;
            if (setselector == null) {
                setselector = this.RemoteActionCompatParcelizer.asInterface(this.write, this.AudioAttributesCompatParcelizer);
                this.read = setselector;
            }
            setselector.asBinder(ontouchobserved, t);
        } else if (t == null) {
            ontouchobserved.onTransact();
        } else {
            Type type = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            TypeAdapters.MediaBrowserCompat$CustomActionResultReceiver.asBinder(ontouchobserved, isintouchmode.RemoteActionCompatParcelizer());
        }
    }

    static final class SingleTypeFactory implements setListSelectionHidden {
        private final toGlobalMotionEvent<?> RemoteActionCompatParcelizer;
        private final Class<?> asBinder;
        private final superIsSelectedChildViewEnabled<?> asInterface;
        private final boolean onTransact;
        private final isInTouchMode<?> read;

        SingleTypeFactory(Object obj, toGlobalMotionEvent<?> toglobalmotionevent, boolean z, Class<?> cls) {
            superIsSelectedChildViewEnabled<?> superisselectedchildviewenabled = null;
            isInTouchMode<?> isintouchmode = obj instanceof isInTouchMode ? (isInTouchMode) obj : null;
            this.read = isintouchmode;
            superisselectedchildviewenabled = obj instanceof superIsSelectedChildViewEnabled ? (superIsSelectedChildViewEnabled) obj : superisselectedchildviewenabled;
            this.asInterface = superisselectedchildviewenabled;
            if ((isintouchmode == null && superisselectedchildviewenabled == null) ? false : true) {
                this.RemoteActionCompatParcelizer = toglobalmotionevent;
                this.onTransact = z;
                this.asBinder = cls;
                return;
            }
            throw new IllegalArgumentException();
        }

        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            toGlobalMotionEvent<?> toglobalmotionevent2 = this.RemoteActionCompatParcelizer;
            if (toglobalmotionevent2 != null ? toglobalmotionevent2.equals(toglobalmotionevent) || (this.onTransact && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer == toglobalmotionevent.asBinder) : this.asBinder.isAssignableFrom(toglobalmotionevent.asBinder)) {
                return new TreeTypeAdapter(this.read, this.asInterface, gson, toglobalmotionevent, this);
            }
            return null;
        }
    }

    final class onTransact implements DrawableContainerCompat.AnonymousClass1 {
        private onTransact() {
        }

        /* synthetic */ onTransact(TreeTypeAdapter treeTypeAdapter, byte b) {
            this();
        }
    }

    public static setListSelectionHidden asInterface(toGlobalMotionEvent<?> toglobalmotionevent, Object obj) {
        return new SingleTypeFactory(obj, toglobalmotionevent, toglobalmotionevent.RemoteActionCompatParcelizer == toglobalmotionevent.asBinder, (Class<?>) null);
    }
}
