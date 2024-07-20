package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.gojek.gopay.R;
import java.lang.ref.WeakReference;
import java.util.List;
import o.ActivityResultContracts;
import o.addInternal;
import o.addMenuPresenter;
import o.createIntent;
import o.dispatchRestoreInstanceState;
import o.isActionButton;
import o.setQwertyMode;

public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int RemoteActionCompatParcelizer = 2131886685;
    private WeakReference<View> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private List<read> AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int[] MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$MediaItem;
    private Drawable MediaBrowserCompat$SearchResultReceiver;
    boolean asBinder;
    WindowInsetsCompat asInterface;
    private boolean onConnected;
    private int onConnectionFailed;
    private boolean onConnectionSuspended;
    boolean onTransact;
    int read;
    private boolean setInternalConnectionCallback;
    private ValueAnimator write;

    public interface read<T extends AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f1292130968627);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = RemoteActionCompatParcelizer
            android.content.Context r13 = o.ActivityResultContracts.TakePicture.asBinder.read(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            r13 = -1
            r12.MediaBrowserCompat$MediaItem = r13
            r12.IconCompatParcelizer = r13
            r12.AudioAttributesImplApi26Parcelizer = r13
            r7 = 0
            r12.read = r7
            android.content.Context r8 = r12.getContext()
            r9 = 1
            r12.setOrientation(r9)
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r12.setOutlineProvider(r0)
            android.content.Context r10 = r12.getContext()
            int[] r11 = o.ActivityResultContracts.TakePicture.read.RemoteActionCompatParcelizer
            int[] r5 = new int[r7]
            o.ActivityResultContracts.PickContact.asInterface(r10, r14, r15, r6)
            r0 = r10
            r1 = r14
            r2 = r11
            r3 = r15
            r4 = r6
            o.ActivityResultContracts.PickContact.read(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r14, r11, r15, r6)
            boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x0048
            int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x00f7 }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r10, r1)     // Catch:{ all -> 0x00f7 }
            r12.setStateListAnimator(r1)     // Catch:{ all -> 0x00f7 }
        L_0x0048:
            r0.recycle()
            int[] r10 = o.dispatchRestoreInstanceState.onConnected.onTransact
            int[] r5 = new int[r7]
            o.ActivityResultContracts.PickContact.asInterface(r8, r14, r15, r6)
            r0 = r8
            r1 = r14
            r2 = r10
            r3 = r15
            r4 = r6
            o.ActivityResultContracts.PickContact.read(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r14 = r8.obtainStyledAttributes(r14, r10, r15, r6)
            android.graphics.drawable.Drawable r15 = r14.getDrawable(r7)
            androidx.core.view.ViewCompat.setBackground(r12, r15)
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            boolean r15 = r15 instanceof android.graphics.drawable.ColorDrawable
            if (r15 == 0) goto L_0x0097
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r15 = (android.graphics.drawable.ColorDrawable) r15
            o.isActionButton r0 = new o.isActionButton
            r0.<init>()
            int r15 = r15.getColor()
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r15)
            o.isActionButton$onTransact r1 = r0.Cancellable
            android.content.res.ColorStateList r1 = r1.asBinder
            if (r1 == r15) goto L_0x0091
            o.isActionButton$onTransact r1 = r0.Cancellable
            r1.asBinder = r15
            int[] r15 = r0.getState()
            r0.onStateChange(r15)
        L_0x0091:
            r0.read((android.content.Context) r8)
            androidx.core.view.ViewCompat.setBackground(r12, r0)
        L_0x0097:
            r15 = 4
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x00a5
            boolean r15 = r14.getBoolean(r15, r7)
            r12.read(r15, r7, r7)
        L_0x00a5:
            r15 = 3
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x00b4
            int r15 = r14.getDimensionPixelSize(r15, r7)
            float r15 = (float) r15
            o.ActivityResultContracts.TakePicture.read.onTransact(r12, r15)
        L_0x00b4:
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r15 < r0) goto L_0x00d5
            r15 = 2
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x00c8
            boolean r15 = r14.getBoolean(r15, r7)
            r12.setKeyboardNavigationCluster(r15)
        L_0x00c8:
            boolean r15 = r14.hasValue(r9)
            if (r15 == 0) goto L_0x00d5
            boolean r15 = r14.getBoolean(r9, r7)
            r12.setTouchscreenBlocksFocus(r15)
        L_0x00d5:
            r15 = 5
            boolean r15 = r14.getBoolean(r15, r7)
            r12.asBinder = r15
            r15 = 6
            int r13 = r14.getResourceId(r15, r13)
            r12.onConnectionFailed = r13
            r13 = 7
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r13)
            r12.setStatusBarForeground(r13)
            r14.recycle()
            com.google.android.material.appbar.AppBarLayout$2 r13 = new com.google.android.material.appbar.AppBarLayout$2
            r13.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r12, r13)
            return
        L_0x00f7:
            r13 = move-exception
            r0.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.MediaBrowserCompat$SearchResultReceiver = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.MediaBrowserCompat$SearchResultReceiver.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.MediaBrowserCompat$SearchResultReceiver, ViewCompat.getLayoutDirection(this));
                this.MediaBrowserCompat$SearchResultReceiver.setVisible(getVisibility() == 0, false);
                this.MediaBrowserCompat$SearchResultReceiver.setCallback(this);
            }
            setWillNotDraw(true ^ asInterface());
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public final void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i));
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (asInterface()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.AudioAttributesImplApi21Parcelizer));
            this.MediaBrowserCompat$SearchResultReceiver.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.MediaBrowserCompat$SearchResultReceiver;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.MediaBrowserCompat$SearchResultReceiver;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && AudioAttributesImplApi26Parcelizer()) {
            int measuredHeight = getMeasuredHeight();
            int i3 = 0;
            if (mode == Integer.MIN_VALUE) {
                int measuredHeight2 = getMeasuredHeight();
                WindowInsetsCompat windowInsetsCompat = this.asInterface;
                measuredHeight = MathUtils.clamp(measuredHeight2 + (windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                WindowInsetsCompat windowInsetsCompat2 = this.asInterface;
                if (windowInsetsCompat2 != null) {
                    i3 = windowInsetsCompat2.getSystemWindowInsetTop();
                }
                measuredHeight += i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.MediaBrowserCompat$MediaItem = -1;
        this.IconCompatParcelizer = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (ViewCompat.getFitsSystemWindows(this) && AudioAttributesImplApi26Parcelizer()) {
            WindowInsetsCompat windowInsetsCompat = this.asInterface;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), systemWindowInsetTop);
            }
        }
        this.MediaBrowserCompat$MediaItem = -1;
        this.IconCompatParcelizer = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.onTransact = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((asBinder) getChildAt(i5).getLayoutParams()).asInterface != null) {
                this.onTransact = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.MediaBrowserCompat$SearchResultReceiver;
        if (drawable != null) {
            int width = getWidth();
            WindowInsetsCompat windowInsetsCompat2 = this.asInterface;
            drawable.setBounds(0, 0, width, windowInsetsCompat2 != null ? windowInsetsCompat2.getSystemWindowInsetTop() : 0);
        }
        if (!this.asBinder) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((asBinder) getChildAt(i6).getLayoutParams()).asBinder;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.onConnected != z3) {
            this.onConnected = z3;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean asInterface() {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            return false;
        }
        WindowInsetsCompat windowInsetsCompat = this.asInterface;
        return (windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0) > 0;
    }

    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof isActionButton) {
            isActionButton isactionbutton = (isActionButton) background;
            if (isactionbutton.Cancellable.RemoteActionCompatParcelizer != null && isactionbutton.Cancellable.RemoteActionCompatParcelizer.asInterface) {
                isactionbutton.onConnectionSuspended(setQwertyMode.asInterface(this));
            }
        }
    }

    public final CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof isActionButton) {
            ((isActionButton) background).onConnected(f);
        }
    }

    public final void setExpanded(boolean z) {
        setExpanded(z, ViewCompat.isLaidOut(this));
    }

    public final void setExpanded(boolean z, boolean z2) {
        read(z, z2, true);
    }

    private void read(boolean z, boolean z2, boolean z3) {
        int i = z ? 1 : 2;
        int i2 = 0;
        int i3 = z2 ? 4 : 0;
        if (z3) {
            i2 = 8;
        }
        this.read = i | i3 | i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof asBinder;
    }

    private static asBinder read(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new asBinder((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new asBinder((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new asBinder(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.AudioAttributesCompatParcelizer;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.AudioAttributesCompatParcelizer = null;
    }

    public final int read() {
        int i = this.MediaBrowserCompat$MediaItem;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            asBinder asbinder = (asBinder) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = asbinder.asBinder;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + asbinder.topMargin + asbinder.bottomMargin;
            if (i3 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                WindowInsetsCompat windowInsetsCompat = this.asInterface;
                i2 -= windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            }
            if ((i4 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i2);
        this.MediaBrowserCompat$MediaItem = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int RemoteActionCompatParcelizer() {
        /*
            r9 = this;
            int r0 = r9.IconCompatParcelizer
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = 0
        L_0x000e:
            if (r0 < 0) goto L_0x005e
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$asBinder r4 = (com.google.android.material.appbar.AppBarLayout.asBinder) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.asBinder
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0059
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0033
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            goto L_0x003d
        L_0x0033:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x003f
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            int r4 = r5 - r4
        L_0x003d:
            int r7 = r7 + r4
            goto L_0x0040
        L_0x003f:
            int r7 = r7 + r5
        L_0x0040:
            if (r0 != 0) goto L_0x0057
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
            if (r3 == 0) goto L_0x0057
            androidx.core.view.WindowInsetsCompat r3 = r9.asInterface
            if (r3 == 0) goto L_0x0051
            int r3 = r3.getSystemWindowInsetTop()
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L_0x0057:
            int r2 = r2 + r7
            goto L_0x005b
        L_0x0059:
            if (r2 > 0) goto L_0x005e
        L_0x005b:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x005e:
            int r0 = java.lang.Math.max(r1, r2)
            r9.IconCompatParcelizer = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.RemoteActionCompatParcelizer():int");
    }

    /* access modifiers changed from: package-private */
    public final int asBinder() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            asBinder asbinder = (asBinder) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = asbinder.topMargin;
            int i5 = asbinder.bottomMargin;
            int i6 = asbinder.asBinder;
            if ((i6 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + i4 + i5;
            if ((i6 & 2) != 0) {
                i2 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i2);
        this.AudioAttributesImplApi26Parcelizer = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final void onTransact(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List<read> list = this.AudioAttributesImplBaseParcelizer;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                read read2 = this.AudioAttributesImplBaseParcelizer.get(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new int[4];
        }
        int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.onConnected ? R.attr.f7352130969354 : -2130969354;
        iArr[1] = (!this.onConnected || !this.setInternalConnectionCallback) ? -2130969355 : R.attr.f7362130969355;
        iArr[2] = this.onConnected ? R.attr.f7332130969352 : -2130969352;
        iArr[3] = (!this.onConnected || !this.setInternalConnectionCallback) ? -2130969351 : R.attr.f7322130969351;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean asBinder(boolean z) {
        if (this.setInternalConnectionCallback == z) {
            return false;
        }
        this.setInternalConnectionCallback = z;
        refreshDrawableState();
        if (this.asBinder && (getBackground() instanceof isActionButton)) {
            final isActionButton isactionbutton = (isActionButton) getBackground();
            float dimension = getResources().getDimension(R.dimen.f11132131165282);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.write;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.write = ofFloat;
            getResources();
            ofFloat.setDuration(150);
            this.write.setInterpolator(createIntent.activity_release.asBinder.RemoteActionCompatParcelizer);
            this.write.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    isactionbutton.onConnected(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.write.start();
        }
        return true;
    }

    public final void setLiftOnScroll(boolean z) {
        this.asBinder = z;
    }

    public final void setLiftOnScrollTargetViewId(int i) {
        this.onConnectionFailed = i;
        WeakReference<View> weakReference = this.AudioAttributesCompatParcelizer;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.AudioAttributesCompatParcelizer = null;
    }

    @Deprecated
    public final void setTargetElevation(float f) {
        ActivityResultContracts.TakePicture.read.onTransact(this, f);
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) {
            return false;
        }
        return true;
    }

    public static class asBinder extends LinearLayout.LayoutParams {
        int asBinder = 1;
        Interpolator asInterface;

        public asBinder(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchRestoreInstanceState.onConnected.asInterface);
            this.asBinder = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.asInterface = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public asBinder() {
            super(-1, -2);
        }

        public asBinder(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public asBinder(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public asBinder(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public final /* bridge */ /* synthetic */ Parcelable asBinder(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        public final /* bridge */ /* synthetic */ void asBinder(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public final /* bridge */ /* synthetic */ boolean asBinder(int i) {
            return super.asBinder(i);
        }

        public final /* bridge */ /* synthetic */ boolean asBinder(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        public final /* bridge */ /* synthetic */ boolean asInterface(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ boolean asInterface(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public final /* bridge */ /* synthetic */ void onTransact(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends addMenuPresenter<T> {
        private asInterface AudioAttributesCompatParcelizer;
        private float AudioAttributesImplApi26Parcelizer;
        private boolean IconCompatParcelizer;
        private WeakReference<View> RemoteActionCompatParcelizer;
        private int asBinder;
        int asInterface;
        private ValueAnimator read;
        private int write = -1;

        public static abstract class asInterface<T extends AppBarLayout> {
            public abstract boolean read();
        }

        public final /* synthetic */ int asBinder(View view) {
            return ((AppBarLayout) view).read();
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int asBinder(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.read()
                int r1 = r7.asInterface
                int r0 = r0 + r1
                r1 = 0
                if (r11 == 0) goto L_0x00b4
                if (r0 < r11) goto L_0x00b4
                if (r0 > r12) goto L_0x00b4
                int r10 = androidx.core.math.MathUtils.clamp((int) r10, (int) r11, (int) r12)
                if (r0 == r10) goto L_0x00b6
                boolean r11 = r9.onTransact
                if (r11 == 0) goto L_0x008f
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = 0
            L_0x0023:
                if (r2 >= r12) goto L_0x008f
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$asBinder r4 = (com.google.android.material.appbar.AppBarLayout.asBinder) r4
                android.view.animation.Interpolator r5 = r4.asInterface
                int r6 = r3.getTop()
                if (r11 < r6) goto L_0x008c
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x008c
                if (r5 == 0) goto L_0x008f
                int r12 = r4.asBinder
                r2 = r12 & 1
                if (r2 == 0) goto L_0x005a
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r12 = r12 & 2
                if (r12 == 0) goto L_0x005b
                int r12 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
                int r2 = r2 - r12
                goto L_0x005b
            L_0x005a:
                r2 = 0
            L_0x005b:
                boolean r12 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
                if (r12 == 0) goto L_0x006c
                androidx.core.view.WindowInsetsCompat r12 = r9.asInterface
                if (r12 == 0) goto L_0x006a
                int r12 = r12.getSystemWindowInsetTop()
                goto L_0x006b
            L_0x006a:
                r12 = 0
            L_0x006b:
                int r2 = r2 - r12
            L_0x006c:
                if (r2 <= 0) goto L_0x008f
                int r12 = r3.getTop()
                float r2 = (float) r2
                int r11 = r11 - r12
                float r11 = (float) r11
                float r11 = r11 / r2
                float r11 = r5.getInterpolation(r11)
                float r2 = r2 * r11
                int r11 = java.lang.Math.round(r2)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r12 = r12 * r2
                goto L_0x0090
            L_0x008c:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x008f:
                r12 = r10
            L_0x0090:
                boolean r11 = r7.asBinder(r12)
                int r2 = r0 - r10
                int r12 = r10 - r12
                r7.asInterface = r12
                if (r11 != 0) goto L_0x00a3
                boolean r11 = r9.onTransact
                if (r11 == 0) goto L_0x00a3
                r8.dispatchDependentViewsChanged(r9)
            L_0x00a3:
                int r11 = r7.read()
                r9.onTransact(r11)
                if (r10 >= r0) goto L_0x00ae
                r11 = -1
                goto L_0x00af
            L_0x00ae:
                r11 = 1
            L_0x00af:
                RemoteActionCompatParcelizer(r8, r9, r10, r11, r1)
                r1 = r2
                goto L_0x00b6
            L_0x00b4:
                r7.asInterface = r1
            L_0x00b6:
                r7.read((androidx.coordinatorlayout.widget.CoordinatorLayout) r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.asBinder(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final /* synthetic */ boolean asInterface(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            asInterface asinterface = this.AudioAttributesCompatParcelizer;
            if (asinterface != null) {
                return asinterface.read();
            }
            WeakReference<View> weakReference = this.RemoteActionCompatParcelizer;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public final /* synthetic */ int read(View view) {
            return -((AppBarLayout) view).asBinder();
        }

        public final /* synthetic */ void read(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout);
            if (appBarLayout.asBinder) {
                appBarLayout.asBinder(appBarLayout.asBinder(asBinder(coordinatorLayout)));
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: asBinder */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.read();
                    i5 = i6;
                    i4 = t.RemoteActionCompatParcelizer() + i6;
                } else {
                    i5 = -t.read();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = asBinder(coordinatorLayout, t, asInterface() - i2, i5, i4);
                }
            }
            if (t.asBinder) {
                t.asBinder(t.asBinder(view));
            }
        }

        /* renamed from: read */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                T t2 = t;
                iArr[1] = asBinder(coordinatorLayout2, t2, asInterface() - i4, -t.asBinder(), 0);
            }
            if (i4 == 0) {
                read(coordinatorLayout, t);
            }
        }

        /* renamed from: onTransact */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.asBinder == 0 || i == 1) {
                RemoteActionCompatParcelizer(coordinatorLayout, t);
                if (t.asBinder) {
                    t.asBinder(t.asBinder(view));
                }
            }
            this.RemoteActionCompatParcelizer = new WeakReference<>(view);
        }

        /* renamed from: asInterface */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.LayoutParams) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: asBinder */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int i3 = t.read;
            int i4 = this.write;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = t.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.IconCompatParcelizer) {
                    int minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    WindowInsetsCompat windowInsetsCompat = t.asInterface;
                    i2 = minimumHeight + (windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0);
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.AudioAttributesImplApi26Parcelizer);
                }
                asBinder(coordinatorLayout, t, i5 + i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i6 = -t.read();
                    if (z) {
                        asInterface(coordinatorLayout, t, i6);
                    } else {
                        asBinder(coordinatorLayout, t, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        asInterface(coordinatorLayout, t, 0);
                    } else {
                        asBinder(coordinatorLayout, t, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                }
            }
            t.read = 0;
            this.write = -1;
            asBinder(MathUtils.clamp(read(), -t.read(), 0));
            RemoteActionCompatParcelizer(coordinatorLayout, t, read(), 0, true);
            t.onTransact(read());
            read(coordinatorLayout, t);
            return onLayoutChild;
        }

        private void read(CoordinatorLayout coordinatorLayout, final T t) {
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            final View asBinder2 = asBinder(coordinatorLayout);
            if (asBinder2 != null && t.read() != 0 && (((CoordinatorLayout.LayoutParams) asBinder2.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior)) {
                if (read() + this.asInterface != (-t.read()) && asBinder2.canScrollVertically(1)) {
                    ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD, (CharSequence) null, new AccessibilityViewCommand(false) {
                        public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                            t.setExpanded(true);
                            return true;
                        }
                    });
                }
                if (read() + this.asInterface == 0) {
                    return;
                }
                if (asBinder2.canScrollVertically(-1)) {
                    final int i = -t.RemoteActionCompatParcelizer();
                    if (i != 0) {
                        final CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                        final T t2 = t;
                        ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, (CharSequence) null, new AccessibilityViewCommand() {
                            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                                BaseBehavior.this.onNestedPreScroll(coordinatorLayout2, t2, asBinder2, 0, i, new int[]{0, 0}, 1);
                                return true;
                            }
                        });
                        return;
                    }
                    return;
                }
                ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, (CharSequence) null, new AccessibilityViewCommand(true) {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        t.setExpanded(true);
                        return true;
                    }
                });
            }
        }

        private static View asBinder(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int asInterface() {
            return read() + this.asInterface;
        }

        /* renamed from: asBinder */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int read2 = read();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + read2;
                if (childAt.getTop() + read2 > 0 || bottom < 0) {
                    i++;
                } else {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(onSaveInstanceState);
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer = i;
                    int minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    WindowInsetsCompat windowInsetsCompat = t.asInterface;
                    if (bottom == minimumHeight + (windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0)) {
                        z = true;
                    }
                    remoteActionCompatParcelizer.read = z;
                    remoteActionCompatParcelizer.onTransact = ((float) bottom) / ((float) childAt.getHeight());
                    return remoteActionCompatParcelizer;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: read */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, remoteActionCompatParcelizer.getSuperState());
                this.write = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.onTransact;
                this.IconCompatParcelizer = remoteActionCompatParcelizer.read;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.write = -1;
        }

        public static class RemoteActionCompatParcelizer extends AbsSavedState {
            public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new RemoteActionCompatParcelizer(parcel, (ClassLoader) null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new RemoteActionCompatParcelizer(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new RemoteActionCompatParcelizer[i];
                }
            };
            int RemoteActionCompatParcelizer;
            float onTransact;
            boolean read;

            public RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.RemoteActionCompatParcelizer = parcel.readInt();
                this.onTransact = parcel.readFloat();
                this.read = parcel.readByte() != 0;
            }

            public RemoteActionCompatParcelizer(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.RemoteActionCompatParcelizer);
                parcel.writeFloat(this.onTransact);
                parcel.writeByte(this.read ? (byte) 1 : 0);
            }
        }

        private void asInterface(final CoordinatorLayout coordinatorLayout, final T t, int i) {
            int i2;
            int abs = Math.abs((read() + this.asInterface) - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int read2 = read() + this.asInterface;
            if (read2 == i) {
                ValueAnimator valueAnimator = this.read;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.read.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.read;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.read = valueAnimator3;
                valueAnimator3.setInterpolator(createIntent.activity_release.asBinder.onTransact);
                this.read.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.asBinder(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.read.setDuration((long) Math.min(i2, 600));
            this.read.setIntValues(new int[]{read2, i});
            this.read.start();
        }

        private void RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            int read2 = read() + this.asInterface;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                asBinder asbinder = (asBinder) childAt.getLayoutParams();
                if ((asbinder.asBinder & 32) == 32) {
                    top -= asbinder.topMargin;
                    bottom += asbinder.bottomMargin;
                }
                int i2 = -read2;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                asBinder asbinder2 = (asBinder) childAt2.getLayoutParams();
                int i3 = asbinder2.asBinder;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        WindowInsetsCompat windowInsetsCompat = t.asInterface;
                        i5 += windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
                    }
                    if ((i3 & 2) == 2) {
                        i5 += ViewCompat.getMinimumHeight(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            int minimumHeight = ViewCompat.getMinimumHeight(childAt2) + i5;
                            if (read2 < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += asbinder2.topMargin;
                        i5 -= asbinder2.bottomMargin;
                    }
                    if (read2 < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    asInterface(coordinatorLayout, t, MathUtils.clamp(i4, -t.read(), 0));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
            if (r8 >= (r9 - (r0 != null ? r0.getSystemWindowInsetTop() : 0))) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
            if (r8 < (r9 - (r0 != null ? r0.getSystemWindowInsetTop() : 0))) goto L_0x0068;
         */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void RemoteActionCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x00ac
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$asBinder r0 = (com.google.android.material.appbar.AppBarLayout.asBinder) r0
                int r0 = r0.asBinder
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x0068
                int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                if (r9 <= 0) goto L_0x004e
                r9 = r0 & 12
                if (r9 == 0) goto L_0x004e
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                androidx.core.view.WindowInsetsCompat r0 = r7.asInterface
                if (r0 == 0) goto L_0x0049
                int r0 = r0.getSystemWindowInsetTop()
                goto L_0x004a
            L_0x0049:
                r0 = 0
            L_0x004a:
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0068
                goto L_0x0066
            L_0x004e:
                r9 = r0 & 2
                if (r9 == 0) goto L_0x0068
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                androidx.core.view.WindowInsetsCompat r0 = r7.asInterface
                if (r0 == 0) goto L_0x0061
                int r0 = r0.getSystemWindowInsetTop()
                goto L_0x0062
            L_0x0061:
                r0 = 0
            L_0x0062:
                int r9 = r9 - r0
                if (r8 >= r9) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r8 = 1
                goto L_0x0069
            L_0x0068:
                r8 = 0
            L_0x0069:
                boolean r9 = r7.asBinder
                if (r9 == 0) goto L_0x0075
                android.view.View r8 = asBinder((androidx.coordinatorlayout.widget.CoordinatorLayout) r6)
                boolean r8 = r7.asBinder((android.view.View) r8)
            L_0x0075:
                boolean r8 = r7.asBinder((boolean) r8)
                if (r10 != 0) goto L_0x00a9
                if (r8 == 0) goto L_0x00ac
                java.util.List r6 = r6.getDependents(r7)
                int r8 = r6.size()
                r9 = 0
            L_0x0086:
                if (r9 >= r8) goto L_0x00a7
                java.lang.Object r10 = r6.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r10 = r10.getBehavior()
                boolean r0 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00a4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r6 = r10.read
                if (r6 == 0) goto L_0x00a7
                r2 = 1
                goto L_0x00a7
            L_0x00a4:
                int r9 = r9 + 1
                goto L_0x0086
            L_0x00a7:
                if (r2 == 0) goto L_0x00ac
            L_0x00a9:
                r7.jumpDrawablesToCurrentState()
            L_0x00ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.RemoteActionCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.read() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: asInterface */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.asBinder
                if (r5 != 0) goto L_0x002b
                int r5 = r3.read()
                if (r5 == 0) goto L_0x0012
                r5 = 1
                goto L_0x0013
            L_0x0012:
                r5 = 0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0034
                android.animation.ValueAnimator r2 = r1.read
                if (r2 == 0) goto L_0x0034
                r2.cancel()
            L_0x0034:
                r2 = 0
                r1.RemoteActionCompatParcelizer = r2
                r1.asBinder = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }
    }

    public static class ScrollingViewBehavior extends addInternal {
        public final /* bridge */ /* synthetic */ boolean asBinder(int i) {
            return super.asBinder(i);
        }

        public final /* synthetic */ View asInterface(List list) {
            return read((List<View>) list);
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchRestoreInstanceState.onConnected.ParcelableVolumeInfo);
            this.read = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout read = read(coordinatorLayout.getDependencies(view));
            if (read != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.onTransact;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    read.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public final float read(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int read = appBarLayout.read();
                int RemoteActionCompatParcelizer = appBarLayout.RemoteActionCompatParcelizer();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                if (behavior instanceof BaseBehavior) {
                    BaseBehavior baseBehavior = (BaseBehavior) behavior;
                    i = baseBehavior.read() + baseBehavior.asInterface;
                } else {
                    i = 0;
                }
                if ((RemoteActionCompatParcelizer == 0 || read + i > RemoteActionCompatParcelizer) && (i2 = read - RemoteActionCompatParcelizer) != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout read(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final int asInterface(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).read();
            }
            return super.asInterface(view);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((BaseBehavior) behavior).asInterface;
                ViewCompat.offsetTopAndBottom(view, (((bottom - top) + i) + RemoteActionCompatParcelizer()) - onTransact(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.asBinder) {
                return false;
            }
            appBarLayout.asBinder(appBarLayout.asBinder(view));
            return false;
        }
    }

    public final int onTransact() {
        WindowInsetsCompat windowInsetsCompat = this.asInterface;
        int i = 0;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                i = ViewCompat.getMinimumHeight(getChildAt(childCount - 1));
            }
            if (i == 0) {
                return getHeight() / 3;
            }
            minimumHeight = i;
        }
        return (minimumHeight << 1) + systemWindowInsetTop;
    }

    /* access modifiers changed from: package-private */
    public final boolean asBinder(View view) {
        int i;
        View view2 = null;
        if (this.AudioAttributesCompatParcelizer == null && (i = this.onConnectionFailed) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.onConnectionFailed);
            }
            if (findViewById != null) {
                this.AudioAttributesCompatParcelizer = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.AudioAttributesCompatParcelizer;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
}
