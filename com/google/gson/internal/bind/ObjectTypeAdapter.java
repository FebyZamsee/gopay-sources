package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import o.lookForSelectablePosition;
import o.measureHeightOfChildrenCompat;
import o.onTouchObserved;
import o.pointInView;
import o.post;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class ObjectTypeAdapter extends setSelector<Object> {
    private static final setListSelectionHidden read;
    private final Gson asBinder;
    private final measureHeightOfChildrenCompat asInterface;

    /* synthetic */ ObjectTypeAdapter(Gson gson, measureHeightOfChildrenCompat measureheightofchildrencompat, byte b) {
        this(gson, measureheightofchildrencompat);
    }

    static {
        final lookForSelectablePosition lookforselectableposition = lookForSelectablePosition.asBinder;
        read = new setListSelectionHidden() {
            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == Object.class) {
                    return new ObjectTypeAdapter(gson, measureHeightOfChildrenCompat.this, (byte) 0);
                }
                return null;
            }
        };
    }

    private ObjectTypeAdapter(Gson gson, measureHeightOfChildrenCompat measureheightofchildrencompat) {
        this.asBinder = gson;
        this.asInterface = measureheightofchildrencompat;
    }

    public static setListSelectionHidden onTransact(final measureHeightOfChildrenCompat measureheightofchildrencompat) {
        if (measureheightofchildrencompat == lookForSelectablePosition.asBinder) {
            return read;
        }
        return new setListSelectionHidden() {
            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == Object.class) {
                    return new ObjectTypeAdapter(gson, measureHeightOfChildrenCompat.this, (byte) 0);
                }
                return null;
            }
        };
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] asInterface;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.onTouchForwarded[] r0 = o.onTouchForwarded.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                asInterface = r0
                o.onTouchForwarded r1 = o.onTouchForwarded.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x001d }
                o.onTouchForwarded r1 = o.onTouchForwarded.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.onTouchForwarded r1 = o.onTouchForwarded.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.onTouchForwarded r1 = o.onTouchForwarded.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x003e }
                o.onTouchForwarded r1 = o.onTouchForwarded.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.onTouchForwarded r1 = o.onTouchForwarded.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object asBinder(pointInView pointinview) throws IOException {
        switch (AnonymousClass5.asInterface[pointinview.setInternalConnectionCallback().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                pointinview.asInterface();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    arrayList.add(asBinder(pointinview));
                }
                pointinview.read();
                return arrayList;
            case 2:
                post post = new post();
                pointinview.asBinder();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    post.put(pointinview.onConnectionFailed(), asBinder(pointinview));
                }
                pointinview.onTransact();
                return post;
            case 3:
                return pointinview.onConnected();
            case 4:
                return this.asInterface.read(pointinview);
            case 5:
                return Boolean.valueOf(pointinview.AudioAttributesImplApi26Parcelizer());
            case 6:
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        if (obj == null) {
            ontouchobserved.onTransact();
            return;
        }
        setSelector read2 = this.asBinder.read(new toGlobalMotionEvent(obj.getClass()));
        if (read2 instanceof ObjectTypeAdapter) {
            ontouchobserved.read();
            ontouchobserved.asInterface();
            return;
        }
        read2.asBinder(ontouchobserved, obj);
    }
}
