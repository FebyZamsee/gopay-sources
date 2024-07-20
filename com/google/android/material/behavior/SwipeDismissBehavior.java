package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private final ViewDragHelper.Callback AudioAttributesCompatParcelizer = new ViewDragHelper.Callback() {
        private int asBinder = -1;
        private int asInterface;

        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.asBinder;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.RemoteActionCompatParcelizer(view);
        }

        public final void onViewCaptured(View view, int i) {
            this.asBinder = i;
            this.asInterface = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.this.onTransact != null) {
                SwipeDismissBehavior.this.onTransact.asBinder(i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.asInterface) >= java.lang.Math.round(((float) r8.getWidth()) * r7.RemoteActionCompatParcelizer.asBinder)) goto L_0x001e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onViewReleased(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.asBinder = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0042
                int r4 = androidx.core.view.ViewCompat.getLayoutDirection(r8)
                if (r4 != r2) goto L_0x0016
                r4 = 1
                goto L_0x0017
            L_0x0016:
                r4 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.asInterface
                r6 = 2
                if (r5 != r6) goto L_0x0020
            L_0x001e:
                r9 = 1
                goto L_0x005f
            L_0x0020:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.asInterface
                if (r5 != 0) goto L_0x0032
                if (r4 == 0) goto L_0x002d
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0030
                goto L_0x002f
            L_0x002d:
                if (r3 <= 0) goto L_0x0030
            L_0x002f:
                goto L_0x001e
            L_0x0030:
                r9 = 0
                goto L_0x005f
            L_0x0032:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.asInterface
                if (r5 != r2) goto L_0x0030
                if (r4 == 0) goto L_0x003d
                if (r3 <= 0) goto L_0x0030
                goto L_0x0041
            L_0x003d:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0030
            L_0x0041:
                goto L_0x001e
            L_0x0042:
                int r9 = r8.getLeft()
                int r0 = r7.asInterface
                int r3 = r8.getWidth()
                float r3 = (float) r3
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r4 = r4.asBinder
                float r3 = r3 * r4
                int r3 = java.lang.Math.round(r3)
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r3) goto L_0x0030
                goto L_0x001e
            L_0x005f:
                if (r9 == 0) goto L_0x006e
                int r9 = r8.getLeft()
                int r0 = r7.asInterface
                if (r9 >= r0) goto L_0x006b
                int r0 = r0 - r10
                goto L_0x006c
            L_0x006b:
                int r0 = r0 + r10
            L_0x006c:
                r1 = 1
                goto L_0x0070
            L_0x006e:
                int r0 = r7.asInterface
            L_0x0070:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                androidx.customview.widget.ViewDragHelper r9 = r9.AudioAttributesImplApi26Parcelizer
                int r10 = r8.getTop()
                boolean r9 = r9.settleCapturedViewAt(r0, r10)
                if (r9 == 0) goto L_0x0089
                com.google.android.material.behavior.SwipeDismissBehavior$RemoteActionCompatParcelizer r9 = new com.google.android.material.behavior.SwipeDismissBehavior$RemoteActionCompatParcelizer
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                androidx.core.view.ViewCompat.postOnAnimation(r8, r9)
                return
            L_0x0089:
                if (r1 == 0) goto L_0x0098
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$asBinder r9 = r9.onTransact
                if (r9 == 0) goto L_0x0098
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$asBinder r9 = r9.onTransact
                r9.onTransact(r8)
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass2.onViewReleased(android.view.View, float, float):void");
        }

        public final int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            int i3;
            int i4;
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.asInterface != 0) {
                if (SwipeDismissBehavior.this.asInterface != 1) {
                    i3 = this.asInterface - view.getWidth();
                    i4 = view.getWidth() + this.asInterface;
                } else if (!z) {
                    i3 = this.asInterface - view.getWidth();
                    i4 = this.asInterface;
                }
                return Math.min(Math.max(i3, i), i4);
            } else if (z) {
                i3 = this.asInterface - view.getWidth();
                i4 = this.asInterface;
                return Math.min(Math.max(i3, i), i4);
            }
            i3 = this.asInterface;
            i4 = view.getWidth() + i3;
            return Math.min(Math.max(i3, i), i4);
        }

        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.asInterface) + (((float) view.getWidth()) * SwipeDismissBehavior.this.RemoteActionCompatParcelizer);
            float width2 = ((float) this.asInterface) + (((float) view.getWidth()) * SwipeDismissBehavior.this.read);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }
    };
    private boolean AudioAttributesImplApi21Parcelizer;
    ViewDragHelper AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    public float RemoteActionCompatParcelizer = 0.0f;
    float asBinder = 0.5f;
    public int asInterface = 2;
    public asBinder onTransact;
    public float read = 0.5f;
    private float write = 0.0f;

    public interface asBinder {
        void asBinder(int i);

        void onTransact(View view);
    }

    public boolean RemoteActionCompatParcelizer(View view) {
        return true;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            ViewCompat.removeAccessibilityAction(v, 1048576);
            if (RemoteActionCompatParcelizer(v)) {
                ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, (CharSequence) null, new AccessibilityViewCommand() {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        boolean z = false;
                        if (!SwipeDismissBehavior.this.RemoteActionCompatParcelizer(view)) {
                            return false;
                        }
                        boolean z2 = ViewCompat.getLayoutDirection(view) == 1;
                        if ((SwipeDismissBehavior.this.asInterface == 0 && z2) || (SwipeDismissBehavior.this.asInterface == 1 && !z2)) {
                            z = true;
                        }
                        int width = view.getWidth();
                        if (z) {
                            width = -width;
                        }
                        ViewCompat.offsetLeftAndRight(view, width);
                        view.setAlpha(0.0f);
                        if (SwipeDismissBehavior.this.onTransact != null) {
                            SwipeDismissBehavior.this.onTransact.onTransact(view);
                        }
                        return true;
                    }
                });
            }
        }
        return onLayoutChild;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.AudioAttributesImplApi21Parcelizer = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.AudioAttributesImplApi21Parcelizer = false;
        }
        if (!z) {
            return false;
        }
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = ViewDragHelper.create(coordinatorLayout, this.AudioAttributesCompatParcelizer);
        }
        return this.AudioAttributesImplApi26Parcelizer.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.AudioAttributesImplApi26Parcelizer;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    class RemoteActionCompatParcelizer implements Runnable {
        private final boolean RemoteActionCompatParcelizer;
        private final View onTransact;

        RemoteActionCompatParcelizer(View view, boolean z) {
            this.onTransact = view;
            this.RemoteActionCompatParcelizer = z;
        }

        public final void run() {
            if (SwipeDismissBehavior.this.AudioAttributesImplApi26Parcelizer != null && SwipeDismissBehavior.this.AudioAttributesImplApi26Parcelizer.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.onTransact, this);
            } else if (this.RemoteActionCompatParcelizer && SwipeDismissBehavior.this.onTransact != null) {
                SwipeDismissBehavior.this.onTransact.onTransact(this.onTransact);
            }
        }
    }
}
