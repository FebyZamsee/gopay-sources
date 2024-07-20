package com.google.gson.internal;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.setState;
import o.toGlobalMotionEvent;

public final class Excluder implements setListSelectionHidden, Cloneable {
    public static final Excluder asBinder = new Excluder();
    public double IconCompatParcelizer = -1.0d;
    public boolean RemoteActionCompatParcelizer;
    public List<setState> asInterface = Collections.emptyList();
    public int onTransact = 136;
    public List<setState> read = Collections.emptyList();
    public boolean write = true;

    /* access modifiers changed from: private */
    /* renamed from: asInterface */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(java.lang.Class<?> r9) {
        /*
            r8 = this;
            double r0 = r8.IconCompatParcelizer
            r2 = 0
            r3 = 1
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0042
            java.lang.Class<o.DropDownListView$Api30Impl> r0 = o.DropDownListView.Api30Impl.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            o.DropDownListView$Api30Impl r0 = (o.DropDownListView.Api30Impl) r0
            java.lang.Class<o.positionSelectorForHoveredItem> r1 = o.positionSelectorForHoveredItem.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            o.positionSelectorForHoveredItem r1 = (o.positionSelectorForHoveredItem) r1
            if (r0 == 0) goto L_0x0028
            double r4 = r0.onTransact()
            double r6 = r8.IconCompatParcelizer
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x0039
            double r0 = r1.onTransact()
            double r4 = r8.IconCompatParcelizer
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0042
            return r3
        L_0x0042:
            boolean r0 = r8.write
            if (r0 != 0) goto L_0x005f
            boolean r0 = r9.isMemberClass()
            if (r0 == 0) goto L_0x005b
            int r0 = r9.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r3
        L_0x005f:
            boolean r9 = read(r9)
            if (r9 == 0) goto L_0x0066
            return r3
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.onTransact(java.lang.Class):boolean");
    }

    public final boolean asBinder(boolean z) {
        for (setState RemoteActionCompatParcelizer2 : z ? this.asInterface : this.read) {
            if (RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    public static boolean read(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (((cls.getModifiers() & 8) != 0) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean RemoteActionCompatParcelizer(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
        boolean onTransact2 = onTransact(toglobalmotionevent.asBinder);
        final boolean z = onTransact2 || asBinder(true);
        final boolean z2 = onTransact2 || asBinder(false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final toGlobalMotionEvent<T> toglobalmotionevent2 = toglobalmotionevent;
        return new setSelector<T>() {
            private setSelector<T> RemoteActionCompatParcelizer;

            public final T asBinder(pointInView pointinview) throws IOException {
                if (z2) {
                    pointinview.onConnectionSuspended();
                    return null;
                }
                setSelector<T> setselector = this.RemoteActionCompatParcelizer;
                if (setselector == null) {
                    setselector = gson2.asInterface((setListSelectionHidden) Excluder.this, toglobalmotionevent2);
                    this.RemoteActionCompatParcelizer = setselector;
                }
                return setselector.asBinder(pointinview);
            }

            public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
                if (z) {
                    ontouchobserved.onTransact();
                    return;
                }
                setSelector<T> setselector = this.RemoteActionCompatParcelizer;
                if (setselector == null) {
                    setselector = gson2.asInterface((setListSelectionHidden) Excluder.this, toglobalmotionevent2);
                    this.RemoteActionCompatParcelizer = setselector;
                }
                setselector.asBinder(ontouchobserved, t);
            }
        };
    }
}
