package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import o.lookForSelectablePosition;
import o.measureHeightOfChildrenCompat;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class NumberTypeAdapter extends setSelector<Number> {
    private static final setListSelectionHidden RemoteActionCompatParcelizer = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.asBinder == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    };
    private final measureHeightOfChildrenCompat asBinder;

    public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        ontouchobserved.onTransact((Number) obj);
    }

    private NumberTypeAdapter(measureHeightOfChildrenCompat measureheightofchildrencompat) {
        this.asBinder = measureheightofchildrencompat;
    }

    public static setListSelectionHidden asInterface(measureHeightOfChildrenCompat measureheightofchildrencompat) {
        if (measureheightofchildrencompat == lookForSelectablePosition.read) {
            return RemoteActionCompatParcelizer;
        }
        return new setListSelectionHidden() {
            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.onTouchForwarded[] r0 = o.onTouchForwarded.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.onTouchForwarded r1 = o.onTouchForwarded.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.onTouchForwarded r1 = o.onTouchForwarded.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.onTouchForwarded r1 = o.onTouchForwarded.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass4.<clinit>():void");
        }
    }

    public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
        onTouchForwarded internalConnectionCallback = pointinview.setInternalConnectionCallback();
        int i = AnonymousClass4.read[internalConnectionCallback.ordinal()];
        if (i == 1) {
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        } else if (i == 2 || i == 3) {
            return this.asBinder.read(pointinview);
        } else {
            StringBuilder sb = new StringBuilder("Expecting number, got: ");
            sb.append(internalConnectionCallback);
            throw new JsonSyntaxException(sb.toString());
        }
    }
}
