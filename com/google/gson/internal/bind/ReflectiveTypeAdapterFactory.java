package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import java.io.IOException;
import java.util.Map;
import o.FitWindowsFrameLayout;
import o.FitWindowsViewGroup;
import o.isSelectedChildViewEnabled;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;
import o.updateSelectorStateCompat;

public final class ReflectiveTypeAdapterFactory implements setListSelectionHidden {
    private final updateSelectorStateCompat RemoteActionCompatParcelizer;
    private final Excluder asBinder;
    private final FitWindowsViewGroup.OnFitSystemWindowsListener asInterface = FitWindowsViewGroup.OnFitSystemWindowsListener.onTransact();
    private final JsonAdapterAnnotationTypeAdapterFactory onTransact;
    private final isSelectedChildViewEnabled read;

    public ReflectiveTypeAdapterFactory(isSelectedChildViewEnabled isselectedchildviewenabled, updateSelectorStateCompat updateselectorstatecompat, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.read = isselectedchildviewenabled;
        this.RemoteActionCompatParcelizer = updateselectorstatecompat;
        this.asBinder = excluder;
        this.onTransact = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r0 != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean asInterface(java.lang.reflect.Field r8, boolean r9, com.google.gson.internal.Excluder r10) {
        /*
            java.lang.Class r0 = r8.getType()
            boolean r0 = r10.onTransact(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            boolean r0 = r10.asBinder(r9)
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r0 != 0) goto L_0x00b4
            int r0 = r10.onTransact
            int r3 = r8.getModifiers()
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0023
        L_0x0020:
            r8 = 1
            goto L_0x00b1
        L_0x0023:
            double r3 = r10.IconCompatParcelizer
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            java.lang.Class<o.DropDownListView$Api30Impl> r0 = o.DropDownListView.Api30Impl.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            o.DropDownListView$Api30Impl r0 = (o.DropDownListView.Api30Impl) r0
            java.lang.Class<o.positionSelectorForHoveredItem> r3 = o.positionSelectorForHoveredItem.class
            java.lang.annotation.Annotation r3 = r8.getAnnotation(r3)
            o.positionSelectorForHoveredItem r3 = (o.positionSelectorForHoveredItem) r3
            if (r0 == 0) goto L_0x0049
            double r4 = r0.onTransact()
            double r6 = r10.IconCompatParcelizer
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            if (r0 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x005a
            double r3 = r3.onTransact()
            double r5 = r10.IconCompatParcelizer
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            r0 = 0
            goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 != 0) goto L_0x0063
            goto L_0x0020
        L_0x0063:
            boolean r0 = r8.isSynthetic()
            if (r0 == 0) goto L_0x006a
            goto L_0x0020
        L_0x006a:
            boolean r0 = r10.RemoteActionCompatParcelizer
            boolean r0 = r10.write
            if (r0 != 0) goto L_0x007b
            java.lang.Class r0 = r8.getType()
            boolean r0 = com.google.gson.internal.Excluder.RemoteActionCompatParcelizer(r0)
            if (r0 == 0) goto L_0x007b
            goto L_0x0020
        L_0x007b:
            java.lang.Class r0 = r8.getType()
            boolean r0 = com.google.gson.internal.Excluder.read(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x0020
        L_0x0086:
            if (r9 == 0) goto L_0x008b
            java.util.List<o.setState> r9 = r10.asInterface
            goto L_0x008d
        L_0x008b:
            java.util.List<o.setState> r9 = r10.read
        L_0x008d:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00b0
            o.setPressedItem r10 = new o.setPressedItem
            r10.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x009c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b0
            java.lang.Object r9 = r8.next()
            o.setState r9 = (o.setState) r9
            boolean r9 = r9.onTransact()
            if (r9 == 0) goto L_0x009c
            goto L_0x0020
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 != 0) goto L_0x00b4
            r1 = 1
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.asInterface(java.lang.reflect.Field, boolean, com.google.gson.internal.Excluder):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$read} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.read> asBinder(com.google.gson.Gson r32, o.toGlobalMotionEvent<?> r33, java.lang.Class<?> r34) {
        /*
            r31 = this;
            r11 = r31
            r12 = r32
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            boolean r0 = r34.isInterface()
            if (r0 == 0) goto L_0x0010
            return r13
        L_0x0010:
            r0 = r33
            java.lang.reflect.Type r14 = r0.RemoteActionCompatParcelizer
            r10 = r34
            r15 = r0
        L_0x0017:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r10 == r0) goto L_0x01a3
            java.lang.reflect.Field[] r9 = r10.getDeclaredFields()
            int r8 = r9.length
            r7 = 0
            r6 = 0
        L_0x0022:
            if (r6 >= r8) goto L_0x0187
            r5 = r9[r6]
            com.google.gson.internal.Excluder r0 = r11.asBinder
            r4 = 1
            boolean r0 = asInterface(r5, r4, r0)
            com.google.gson.internal.Excluder r1 = r11.asBinder
            boolean r16 = asInterface(r5, r7, r1)
            if (r0 != 0) goto L_0x0046
            if (r16 == 0) goto L_0x0038
            goto L_0x0046
        L_0x0038:
            r28 = r6
            r24 = r8
            r30 = r9
            r33 = r10
            r34 = r15
            r29 = 0
            goto L_0x015a
        L_0x0046:
            o.FitWindowsViewGroup$OnFitSystemWindowsListener r1 = r11.asInterface
            r1.RemoteActionCompatParcelizer(r5)
            java.lang.reflect.Type r1 = r15.RemoteActionCompatParcelizer
            java.lang.reflect.Type r2 = r5.getGenericType()
            java.lang.reflect.Type r3 = o.setSelectedChildViewEnabled.RemoteActionCompatParcelizer((java.lang.reflect.Type) r1, (java.lang.Class<?>) r10, (java.lang.reflect.Type) r2)
            java.lang.Class<o.canPositionSelectorForHoveredItem> r1 = o.canPositionSelectorForHoveredItem.class
            java.lang.annotation.Annotation r1 = r5.getAnnotation(r1)
            o.canPositionSelectorForHoveredItem r1 = (o.canPositionSelectorForHoveredItem) r1
            if (r1 != 0) goto L_0x006d
            o.updateSelectorStateCompat r1 = r11.RemoteActionCompatParcelizer
            java.lang.String r1 = r1.asBinder(r5)
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0069:
            r34 = r0
            r7 = r1
            goto L_0x0096
        L_0x006d:
            java.lang.String r2 = r1.onTransact()
            java.lang.String[] r1 = r1.asInterface()
            int r7 = r1.length
            if (r7 != 0) goto L_0x007d
            java.util.List r1 = java.util.Collections.singletonList(r2)
            goto L_0x0069
        L_0x007d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r34 = r0
            int r0 = r1.length
            int r0 = r0 + r4
            r7.<init>(r0)
            r7.add(r2)
            int r0 = r1.length
            r2 = 0
        L_0x008b:
            if (r2 >= r0) goto L_0x0096
            r4 = r1[r2]
            r7.add(r4)
            int r2 = r2 + 1
            r4 = 1
            goto L_0x008b
        L_0x0096:
            int r4 = r7.size()
            r18 = 0
            r0 = r34
            r1 = r18
            r2 = 0
        L_0x00a1:
            if (r2 >= r4) goto L_0x014b
            java.lang.Object r19 = r7.get(r2)
            r34 = r15
            r15 = r19
            java.lang.String r15 = (java.lang.String) r15
            if (r2 == 0) goto L_0x00b2
            r19 = 0
            goto L_0x00b4
        L_0x00b2:
            r19 = r0
        L_0x00b4:
            o.toGlobalMotionEvent r0 = new o.toGlobalMotionEvent
            r0.<init>(r3)
            r20 = r1
            java.lang.Class<? super T> r1 = r0.asBinder
            r21 = r2
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L_0x00ce
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x00ce
            r22 = 1
            goto L_0x00d0
        L_0x00ce:
            r22 = 0
        L_0x00d0:
            java.lang.Class<o.drawableHotspotChanged> r1 = o.drawableHotspotChanged.class
            java.lang.annotation.Annotation r1 = r5.getAnnotation(r1)
            o.drawableHotspotChanged r1 = (o.drawableHotspotChanged) r1
            if (r1 == 0) goto L_0x00e1
            o.isSelectedChildViewEnabled r2 = r11.read
            o.setSelector r1 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.read(r2, r12, r0, r1)
            goto L_0x00e3
        L_0x00e1:
            r1 = r18
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r23 = 1
            goto L_0x00ea
        L_0x00e8:
            r23 = 0
        L_0x00ea:
            if (r1 != 0) goto L_0x00f0
            o.setSelector r1 = r12.read(r0)
        L_0x00f0:
            r24 = r1
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$5 r2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$5
            r25 = r0
            r0 = r2
            r11 = r20
            r1 = r31
            r12 = r2
            r20 = r21
            r2 = r15
            r21 = r3
            r3 = r19
            r17 = r4
            r26 = 1
            r4 = r16
            r27 = r5
            r28 = r6
            r6 = r23
            r23 = r7
            r29 = 0
            r7 = r24
            r24 = r8
            r8 = r32
            r30 = r9
            r9 = r25
            r33 = r10
            r10 = r22
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r13.put(r15, r12)
            r1 = r0
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$read r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.read) r1
            if (r11 != 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r1 = r11
        L_0x012f:
            int r2 = r20 + 1
            r11 = r31
            r12 = r32
            r10 = r33
            r15 = r34
            r4 = r17
            r0 = r19
            r3 = r21
            r7 = r23
            r8 = r24
            r5 = r27
            r6 = r28
            r9 = r30
            goto L_0x00a1
        L_0x014b:
            r11 = r1
            r28 = r6
            r24 = r8
            r30 = r9
            r33 = r10
            r34 = r15
            r29 = 0
            if (r11 != 0) goto L_0x016b
        L_0x015a:
            int r6 = r28 + 1
            r11 = r31
            r12 = r32
            r10 = r33
            r15 = r34
            r8 = r24
            r9 = r30
            r7 = 0
            goto L_0x0022
        L_0x016b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = " declares multiple JSON fields named "
            r0.append(r1)
            java.lang.String r1 = r11.asBinder
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0187:
            r33 = r10
            r0 = r15
            java.lang.reflect.Type r0 = r0.RemoteActionCompatParcelizer
            java.lang.reflect.Type r1 = r33.getGenericSuperclass()
            r2 = r33
            java.lang.reflect.Type r0 = o.setSelectedChildViewEnabled.RemoteActionCompatParcelizer((java.lang.reflect.Type) r0, (java.lang.Class<?>) r2, (java.lang.reflect.Type) r1)
            o.toGlobalMotionEvent r15 = new o.toGlobalMotionEvent
            r15.<init>(r0)
            java.lang.Class<? super T> r10 = r15.asBinder
            r11 = r31
            r12 = r32
            goto L_0x0017
        L_0x01a3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.asBinder(com.google.gson.Gson, o.toGlobalMotionEvent, java.lang.Class):java.util.Map");
    }

    static abstract class read {
        final String asBinder;
        final boolean asInterface;
        final boolean onTransact;

        /* access modifiers changed from: package-private */
        public abstract void RemoteActionCompatParcelizer(onTouchObserved ontouchobserved, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        public abstract void asBinder(pointInView pointinview, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        public abstract boolean read(Object obj) throws IOException, IllegalAccessException;

        protected read(String str, boolean z, boolean z2) {
            this.asBinder = str;
            this.asInterface = z;
            this.onTransact = z2;
        }
    }

    public static final class Adapter<T> extends setSelector<T> {
        private final Map<String, read> asBinder;
        private final FitWindowsFrameLayout<T> asInterface;

        Adapter(FitWindowsFrameLayout<T> fitWindowsFrameLayout, Map<String, read> map) {
            this.asInterface = fitWindowsFrameLayout;
            this.asBinder = map;
        }

        public final T asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            T asBinder2 = this.asInterface.asBinder();
            try {
                pointinview.asBinder();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    read read = this.asBinder.get(pointinview.onConnectionFailed());
                    if (read != null) {
                        if (read.onTransact) {
                            read.asBinder(pointinview, asBinder2);
                        }
                    }
                    pointinview.onConnectionSuspended();
                }
                pointinview.onTransact();
                return asBinder2;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
            if (t == null) {
                ontouchobserved.onTransact();
                return;
            }
            ontouchobserved.read();
            try {
                for (read next : this.asBinder.values()) {
                    if (next.read(t)) {
                        ontouchobserved.onTransact(next.asBinder);
                        next.RemoteActionCompatParcelizer(ontouchobserved, t);
                    }
                }
                ontouchobserved.asInterface();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
        Class<? super T> cls = toglobalmotionevent.asBinder;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new Adapter(this.read.asInterface(toglobalmotionevent), asBinder(gson, toglobalmotionevent, cls));
    }
}
