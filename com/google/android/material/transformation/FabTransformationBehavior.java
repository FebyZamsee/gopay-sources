package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import o.createIntent;
import o.findInsertIndex;
import o.getOrdering;
import o.setHeaderInternal;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final RectF AudioAttributesCompatParcelizer = new RectF();
    private final RectF IconCompatParcelizer = new RectF();
    private float RemoteActionCompatParcelizer;
    private float asBinder;
    private final int[] onTransact = new int[2];
    private final Rect write = new Rect();

    /* access modifiers changed from: protected */
    public abstract onTransact asBinder(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int i = ((FloatingActionButton) view2).read.RemoteActionCompatParcelizer;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03c2 A[LOOP:1: B:96:0x03c0->B:97:0x03c2, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet asBinder(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r9 = r29
            r10 = r30
            android.content.Context r2 = r29.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$onTransact r11 = r0.asBinder(r2, r10)
            if (r10 == 0) goto L_0x001e
            float r2 = r28.getTranslationX()
            r0.asBinder = r2
            float r2 = r28.getTranslationY()
            r0.RemoteActionCompatParcelizer = r2
        L_0x001e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            float r2 = androidx.core.view.ViewCompat.getElevation(r29)
            float r3 = androidx.core.view.ViewCompat.getElevation(r28)
            float r2 = r2 - r3
            r14 = 0
            r15 = 1
            r8 = 0
            if (r10 == 0) goto L_0x0047
            if (r31 != 0) goto L_0x003c
            float r2 = -r2
            r9.setTranslationZ(r2)
        L_0x003c:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r15]
            r3[r8] = r14
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r3)
            goto L_0x0052
        L_0x0047:
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r4 = new float[r15]
            float r2 = -r2
            r4[r8] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r3, r4)
        L_0x0052:
            o.getOrdering r3 = r11.RemoteActionCompatParcelizer
            java.lang.String r4 = "elevation"
            o.findInsertIndex r3 = r3.onTransact(r4)
            r3.read(r2)
            r12.add(r2)
            android.graphics.RectF r2 = r0.IconCompatParcelizer
            o.setHeaderInternal r3 = r11.read
            float r3 = r0.onTransact(r1, r9, r3)
            o.setHeaderInternal r4 = r11.read
            float r4 = r0.read(r1, r9, r4)
            android.util.Pair r5 = onTransact((float) r3, (float) r4, (boolean) r10, (com.google.android.material.transformation.FabTransformationBehavior.onTransact) r11)
            java.lang.Object r6 = r5.first
            o.findInsertIndex r6 = (o.findInsertIndex) r6
            java.lang.Object r5 = r5.second
            o.findInsertIndex r5 = (o.findInsertIndex) r5
            if (r10 == 0) goto L_0x00c4
            if (r31 != 0) goto L_0x0086
            float r7 = -r3
            r9.setTranslationX(r7)
            float r7 = -r4
            r9.setTranslationY(r7)
        L_0x0086:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            r16 = r13
            float[] r13 = new float[r15]
            r13[r8] = r14
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r7, r13)
            android.util.Property r13 = android.view.View.TRANSLATION_Y
            r17 = r7
            float[] r7 = new float[r15]
            r7[r8] = r14
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r13, r7)
            float r3 = -r3
            float r4 = -r4
            float r3 = onTransact((com.google.android.material.transformation.FabTransformationBehavior.onTransact) r11, (o.findInsertIndex) r6, (float) r3, (float) r14)
            float r4 = onTransact((com.google.android.material.transformation.FabTransformationBehavior.onTransact) r11, (o.findInsertIndex) r5, (float) r4, (float) r14)
            android.graphics.Rect r13 = r0.write
            r9.getWindowVisibleDisplayFrame(r13)
            android.graphics.RectF r14 = r0.IconCompatParcelizer
            r14.set(r13)
            android.graphics.RectF r13 = r0.AudioAttributesCompatParcelizer
            r0.asInterface(r9, r13)
            r13.offset(r3, r4)
            r13.intersect(r14)
            r2.set(r13)
            r3 = r7
            r7 = r17
            goto L_0x00dc
        L_0x00c4:
            r16 = r13
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r13 = new float[r15]
            float r3 = -r3
            r13[r8] = r3
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r7, r13)
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r13 = new float[r15]
            float r4 = -r4
            r13[r8] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r3, r13)
        L_0x00dc:
            r6.read(r7)
            r5.read(r3)
            r12.add(r7)
            r12.add(r3)
            float r3 = r2.width()
            float r2 = r2.height()
            o.setHeaderInternal r4 = r11.read
            float r4 = r0.onTransact(r1, r9, r4)
            o.setHeaderInternal r5 = r11.read
            float r5 = r0.read(r1, r9, r5)
            android.util.Pair r6 = onTransact((float) r4, (float) r5, (boolean) r10, (com.google.android.material.transformation.FabTransformationBehavior.onTransact) r11)
            java.lang.Object r7 = r6.first
            o.findInsertIndex r7 = (o.findInsertIndex) r7
            java.lang.Object r6 = r6.second
            o.findInsertIndex r6 = (o.findInsertIndex) r6
            android.util.Property r13 = android.view.View.TRANSLATION_X
            float[] r14 = new float[r15]
            if (r10 != 0) goto L_0x0110
            float r4 = r0.asBinder
        L_0x0110:
            r14[r8] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r1, r13, r14)
            android.util.Property r13 = android.view.View.TRANSLATION_Y
            float[] r14 = new float[r15]
            if (r10 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            float r5 = r0.RemoteActionCompatParcelizer
        L_0x011f:
            r14[r8] = r5
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r1, r13, r14)
            r7.read(r4)
            r6.read(r5)
            r12.add(r4)
            r12.add(r5)
            boolean r13 = r9 instanceof o.getNonActionItems
            if (r13 == 0) goto L_0x0187
            boolean r4 = r1 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x0187
            r4 = r9
            o.getNonActionItems r4 = (o.getNonActionItems) r4
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            if (r5 == 0) goto L_0x0187
            r5.mutate()
            r6 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x015c
            if (r31 != 0) goto L_0x0151
            r5.setAlpha(r6)
        L_0x0151:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r6 = o.dispatchPresenterUpdate.RemoteActionCompatParcelizer
            int[] r7 = new int[r15]
            r7[r8] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r5, r6, r7)
            goto L_0x0166
        L_0x015c:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = o.dispatchPresenterUpdate.RemoteActionCompatParcelizer
            int[] r14 = new int[r15]
            r14[r8] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r5, r7, r14)
        L_0x0166:
            com.google.android.material.transformation.FabTransformationBehavior$3 r7 = new com.google.android.material.transformation.FabTransformationBehavior$3
            r7.<init>(r9)
            r6.addUpdateListener(r7)
            o.getOrdering r7 = r11.RemoteActionCompatParcelizer
            java.lang.String r14 = "iconFade"
            o.findInsertIndex r7 = r7.onTransact(r14)
            r7.read(r6)
            r12.add(r6)
            com.google.android.material.transformation.FabTransformationBehavior$4 r6 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r6.<init>(r4, r5)
            r14 = r16
            r14.add(r6)
            goto L_0x0189
        L_0x0187:
            r14 = r16
        L_0x0189:
            if (r13 == 0) goto L_0x02d2
            r7 = r9
            o.getNonActionItems r7 = (o.getNonActionItems) r7
            o.setHeaderInternal r4 = r11.read
            android.graphics.RectF r5 = r0.IconCompatParcelizer
            android.graphics.RectF r6 = r0.AudioAttributesCompatParcelizer
            r0.asInterface(r1, r5)
            float r15 = r0.asBinder
            float r8 = r0.RemoteActionCompatParcelizer
            r5.offset(r15, r8)
            r0.asInterface(r9, r6)
            float r4 = r0.onTransact(r1, r9, r4)
            float r4 = -r4
            r8 = 0
            r6.offset(r4, r8)
            float r4 = r5.centerX()
            float r5 = r6.left
            float r4 = r4 - r5
            o.setHeaderInternal r5 = r11.read
            android.graphics.RectF r6 = r0.IconCompatParcelizer
            android.graphics.RectF r8 = r0.AudioAttributesCompatParcelizer
            r0.asInterface(r1, r6)
            float r15 = r0.asBinder
            r18 = r13
            float r13 = r0.RemoteActionCompatParcelizer
            r6.offset(r15, r13)
            r0.asInterface(r9, r8)
            float r5 = r0.read(r1, r9, r5)
            float r5 = -r5
            r13 = 0
            r8.offset(r13, r5)
            float r5 = r6.centerY()
            float r6 = r8.top
            float r5 = r5 - r6
            r6 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r6
            android.graphics.Rect r8 = r0.write
            boolean r13 = androidx.core.view.ViewCompat.isLaidOut(r6)
            if (r13 == 0) goto L_0x01f1
            int r13 = r6.getWidth()
            int r15 = r6.getHeight()
            r1 = 0
            r8.set(r1, r1, r13, r15)
            r6.read(r8)
            goto L_0x01f2
        L_0x01f1:
            r1 = 0
        L_0x01f2:
            android.graphics.Rect r6 = r0.write
            int r6 = r6.width()
            float r6 = (float) r6
            r8 = 1073741824(0x40000000, float:2.0)
            float r13 = r6 / r8
            o.getOrdering r6 = r11.RemoteActionCompatParcelizer
            java.lang.String r8 = "expansion"
            o.findInsertIndex r15 = r6.onTransact(r8)
            if (r10 == 0) goto L_0x0249
            if (r31 != 0) goto L_0x0211
            o.getNonActionItems$onTransact r6 = new o.getNonActionItems$onTransact
            r6.<init>(r4, r5, r13)
            r7.setRevealInfo(r6)
        L_0x0211:
            if (r31 == 0) goto L_0x021a
            o.getNonActionItems$onTransact r6 = r7.asInterface()
            float r6 = r6.asInterface
            r13 = r6
        L_0x021a:
            float r2 = o.setOnBackInvokedDispatcher.onTransact((float) r4, (float) r5, (float) r3, (float) r2)
            android.animation.Animator r8 = o.getHeaderIcon.onTransact(r7, r4, r5, r2)
            com.google.android.material.transformation.FabTransformationBehavior$5 r2 = new com.google.android.material.transformation.FabTransformationBehavior$5
            r2.<init>(r7)
            r8.addListener(r2)
            long r2 = r15.asInterface
            int r6 = (int) r4
            int r5 = (int) r5
            r3 = r2
            r2 = r29
            r17 = r5
            r5 = r6
            r6 = r17
            r17 = r7
            r7 = r13
            r1 = r8
            r13 = 0
            r8 = r12
            read(r2, r3, r5, r6, r7, r8)
            r8 = r1
            r20 = r11
            r22 = r14
            r1 = r15
            r0 = r17
            goto L_0x02c1
        L_0x0249:
            r17 = r7
            o.getNonActionItems$onTransact r2 = r17.asInterface()
            float r7 = r2.asInterface
            r8 = r17
            android.animation.Animator r17 = o.getHeaderIcon.onTransact(r8, r4, r5, r13)
            long r2 = r15.asInterface
            int r6 = (int) r4
            int r5 = (int) r5
            r3 = r2
            r2 = r29
            r19 = r5
            r5 = r6
            r1 = r6
            r6 = r19
            r0 = r8
            r8 = r12
            read(r2, r3, r5, r6, r7, r8)
            long r2 = r15.asInterface
            long r4 = r15.asBinder
            o.getOrdering r6 = r11.RemoteActionCompatParcelizer
            androidx.collection.SimpleArrayMap<java.lang.String, o.findInsertIndex> r7 = r6.asBinder
            int r7 = r7.size()
            r20 = 0
            r8 = 0
            r25 = r20
            r20 = r11
            r10 = r25
        L_0x027e:
            if (r8 >= r7) goto L_0x02a4
            r21 = r7
            androidx.collection.SimpleArrayMap<java.lang.String, o.findInsertIndex> r7 = r6.asBinder
            java.lang.Object r7 = r7.valueAt(r8)
            o.findInsertIndex r7 = (o.findInsertIndex) r7
            r22 = r14
            r23 = r15
            long r14 = r7.asInterface
            r24 = r6
            long r6 = r7.asBinder
            long r14 = r14 + r6
            long r10 = java.lang.Math.max(r10, r14)
            int r8 = r8 + 1
            r7 = r21
            r14 = r22
            r15 = r23
            r6 = r24
            goto L_0x027e
        L_0x02a4:
            r22 = r14
            r23 = r15
            long r2 = r2 + r4
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x02bd
            r4 = r19
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r9, r1, r4, r13, r13)
            r1.setStartDelay(r2)
            long r10 = r10 - r2
            r1.setDuration(r10)
            r12.add(r1)
        L_0x02bd:
            r8 = r17
            r1 = r23
        L_0x02c1:
            r1.read(r8)
            r12.add(r8)
            o.getHeaderIcon$5 r1 = new o.getHeaderIcon$5
            r1.<init>(r0)
            r0 = r22
            r0.add(r1)
            goto L_0x02d7
        L_0x02d2:
            r20 = r11
            r18 = r13
            r0 = r14
        L_0x02d7:
            if (r18 == 0) goto L_0x032e
            r1 = r9
            o.getNonActionItems r1 = (o.getNonActionItems) r1
            android.content.res.ColorStateList r2 = androidx.core.view.ViewCompat.getBackgroundTintList(r28)
            if (r2 == 0) goto L_0x02f1
            int[] r3 = r28.getDrawableState()
            int r4 = r2.getDefaultColor()
            int r8 = r2.getColorForState(r3, r4)
            r2 = r30
            goto L_0x02f4
        L_0x02f1:
            r2 = r30
            r8 = 0
        L_0x02f4:
            if (r2 == 0) goto L_0x030c
            if (r31 != 0) goto L_0x02fb
            r1.setCircularRevealScrimColor(r8)
        L_0x02fb:
            android.util.Property<o.getNonActionItems, java.lang.Integer> r3 = o.getNonActionItems.RemoteActionCompatParcelizer.onTransact
            r4 = 1
            int[] r5 = new int[r4]
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r8
            r7 = 0
            r5[r7] = r6
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r3, r5)
            goto L_0x0318
        L_0x030c:
            r4 = 1
            r7 = 0
            android.util.Property<o.getNonActionItems, java.lang.Integer> r3 = o.getNonActionItems.RemoteActionCompatParcelizer.onTransact
            int[] r5 = new int[r4]
            r5[r7] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r3, r5)
        L_0x0318:
            o.dispatchSaveInstanceState r3 = o.dispatchSaveInstanceState.onTransact
            r1.setEvaluator(r3)
            r3 = r20
            o.getOrdering r4 = r3.RemoteActionCompatParcelizer
            java.lang.String r5 = "color"
            o.findInsertIndex r4 = r4.onTransact(r5)
            r4.read(r1)
            r12.add(r1)
            goto L_0x0332
        L_0x032e:
            r2 = r30
            r3 = r20
        L_0x0332:
            boolean r1 = r9 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x03a6
            if (r18 == 0) goto L_0x033c
            int r4 = o.getActionViewStatesKey.read
            if (r4 == 0) goto L_0x03a6
        L_0x033c:
            r4 = 2131296535(0x7f090117, float:1.821099E38)
            android.view.View r4 = r9.findViewById(r4)
            r5 = 0
            if (r4 == 0) goto L_0x034e
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x036b
            r5 = r4
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x036b
        L_0x034e:
            boolean r4 = r9 instanceof o.toMenuAdapter
            if (r4 != 0) goto L_0x035c
            boolean r4 = r9 instanceof o.createPopup
            if (r4 != 0) goto L_0x035c
            if (r1 == 0) goto L_0x036b
            r5 = r9
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x036b
        L_0x035c:
            r1 = r9
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4 = 0
            android.view.View r1 = r1.getChildAt(r4)
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x036b
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x036b:
            if (r5 == 0) goto L_0x03a6
            if (r2 == 0) goto L_0x038a
            if (r31 != 0) goto L_0x037b
            android.util.Property<android.view.ViewGroup, java.lang.Float> r1 = o.createNewMenuItem.RemoteActionCompatParcelizer
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1.set(r5, r4)
        L_0x037b:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r1 = o.createNewMenuItem.RemoteActionCompatParcelizer
            r4 = 1
            float[] r4 = new float[r4]
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r4[r7] = r6
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r1, r4)
            goto L_0x0397
        L_0x038a:
            r4 = 1
            r7 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r1 = o.createNewMenuItem.RemoteActionCompatParcelizer
            float[] r4 = new float[r4]
            r6 = 0
            r4[r7] = r6
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r5, r1, r4)
        L_0x0397:
            o.getOrdering r3 = r3.RemoteActionCompatParcelizer
            java.lang.String r4 = "contentFade"
            o.findInsertIndex r3 = r3.onTransact(r4)
            r3.read(r1)
            r12.add(r1)
            goto L_0x03a7
        L_0x03a6:
            r7 = 0
        L_0x03a7:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            o.ActivityResultContracts.TakePicture.asBinder(r1, r12)
            com.google.android.material.transformation.FabTransformationBehavior$1 r3 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r4 = r27
            r5 = r28
            r3.<init>(r2, r9, r5)
            r1.addListener(r3)
            int r2 = r0.size()
            r8 = 0
        L_0x03c0:
            if (r8 >= r2) goto L_0x03ce
            java.lang.Object r3 = r0.get(r8)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r1.addListener(r3)
            int r8 = r8 + 1
            goto L_0x03c0
        L_0x03ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.asBinder(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    private static Pair<findInsertIndex, findInsertIndex> onTransact(float f, float f2, boolean z, onTransact ontransact) {
        findInsertIndex findinsertindex;
        findInsertIndex findinsertindex2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            findinsertindex2 = ontransact.RemoteActionCompatParcelizer.onTransact("translationXLinear");
            findinsertindex = ontransact.RemoteActionCompatParcelizer.onTransact("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            findinsertindex2 = ontransact.RemoteActionCompatParcelizer.onTransact("translationXCurveDownwards");
            findinsertindex = ontransact.RemoteActionCompatParcelizer.onTransact("translationYCurveDownwards");
        } else {
            findinsertindex2 = ontransact.RemoteActionCompatParcelizer.onTransact("translationXCurveUpwards");
            findinsertindex = ontransact.RemoteActionCompatParcelizer.onTransact("translationYCurveUpwards");
        }
        return new Pair<>(findinsertindex2, findinsertindex);
    }

    private float onTransact(View view, View view2, setHeaderInternal setheaderinternal) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesCompatParcelizer;
        asInterface(view, rectF);
        rectF.offset(this.asBinder, this.RemoteActionCompatParcelizer);
        asInterface(view2, rectF2);
        int i = setheaderinternal.onTransact & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + setheaderinternal.asBinder;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + setheaderinternal.asBinder;
    }

    private float read(View view, View view2, setHeaderInternal setheaderinternal) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesCompatParcelizer;
        asInterface(view, rectF);
        rectF.offset(this.asBinder, this.RemoteActionCompatParcelizer);
        asInterface(view2, rectF2);
        int i = setheaderinternal.onTransact & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + setheaderinternal.RemoteActionCompatParcelizer;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + setheaderinternal.RemoteActionCompatParcelizer;
    }

    private void asInterface(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.onTransact;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private static void read(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    public static class onTransact {
        public getOrdering RemoteActionCompatParcelizer;
        public setHeaderInternal read;

        protected onTransact() {
        }
    }

    private static float onTransact(onTransact ontransact, findInsertIndex findinsertindex, float f, float f2) {
        long j = findinsertindex.asInterface;
        long j2 = findinsertindex.asBinder;
        findInsertIndex onTransact2 = ontransact.RemoteActionCompatParcelizer.onTransact("expansion");
        float f3 = ((float) (((onTransact2.asInterface + onTransact2.asBinder) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = findinsertindex.RemoteActionCompatParcelizer;
        if (timeInterpolator == null) {
            timeInterpolator = createIntent.activity_release.asBinder.asBinder;
        }
        return f + (timeInterpolator.getInterpolation(f3) * (0.0f - f));
    }
}
