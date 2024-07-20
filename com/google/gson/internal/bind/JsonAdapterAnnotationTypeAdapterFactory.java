package com.google.gson.internal.bind;

import com.google.gson.Gson;
import o.drawableHotspotChanged;
import o.isSelectedChildViewEnabled;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class JsonAdapterAnnotationTypeAdapterFactory implements setListSelectionHidden {
    private final isSelectedChildViewEnabled asBinder;

    public JsonAdapterAnnotationTypeAdapterFactory(isSelectedChildViewEnabled isselectedchildviewenabled) {
        this.asBinder = isselectedchildviewenabled;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: o.setSelector<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: o.setSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.setSelector<?> read(o.isSelectedChildViewEnabled r8, com.google.gson.Gson r9, o.toGlobalMotionEvent<?> r10, o.drawableHotspotChanged r11) {
        /*
            java.lang.Class r0 = r11.onTransact()
            o.toGlobalMotionEvent r1 = new o.toGlobalMotionEvent
            r1.<init>(r0)
            o.FitWindowsFrameLayout r8 = r8.asInterface(r1)
            java.lang.Object r8 = r8.asBinder()
            boolean r0 = r8 instanceof o.setSelector
            if (r0 == 0) goto L_0x0018
            o.setSelector r8 = (o.setSelector) r8
            goto L_0x0073
        L_0x0018:
            boolean r0 = r8 instanceof o.setListSelectionHidden
            if (r0 == 0) goto L_0x0023
            o.setListSelectionHidden r8 = (o.setListSelectionHidden) r8
            o.setSelector r8 = r8.asInterface(r9, r10)
            goto L_0x0073
        L_0x0023:
            boolean r0 = r8 instanceof o.isInTouchMode
            if (r0 != 0) goto L_0x0059
            boolean r1 = r8 instanceof o.superIsSelectedChildViewEnabled
            if (r1 == 0) goto L_0x002c
            goto L_0x0059
        L_0x002c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Invalid attempt to bind an instance of "
            r9.<init>(r11)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r9.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r9.append(r8)
            java.lang.String r8 = r10.toString()
            r9.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r9.append(r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0059:
            r1 = 0
            if (r0 == 0) goto L_0x0061
            r0 = r8
            o.isInTouchMode r0 = (o.isInTouchMode) r0
            r3 = r0
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            boolean r0 = r8 instanceof o.superIsSelectedChildViewEnabled
            if (r0 == 0) goto L_0x0069
            r1 = r8
            o.superIsSelectedChildViewEnabled r1 = (o.superIsSelectedChildViewEnabled) r1
        L_0x0069:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0073:
            if (r8 == 0) goto L_0x0081
            boolean r9 = r11.asInterface()
            if (r9 == 0) goto L_0x0081
            com.google.gson.TypeAdapter$1 r9 = new com.google.gson.TypeAdapter$1
            r9.<init>(r8)
            r8 = r9
        L_0x0081:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.read(o.isSelectedChildViewEnabled, com.google.gson.Gson, o.toGlobalMotionEvent, o.drawableHotspotChanged):o.setSelector");
    }

    public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
        drawableHotspotChanged drawablehotspotchanged = (drawableHotspotChanged) toglobalmotionevent.asBinder.getAnnotation(drawableHotspotChanged.class);
        if (drawablehotspotchanged == null) {
            return null;
        }
        return read(this.asBinder, gson, toglobalmotionevent, drawablehotspotchanged);
    }
}
