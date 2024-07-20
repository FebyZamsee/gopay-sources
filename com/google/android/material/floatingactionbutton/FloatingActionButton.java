package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.gojek.gopay.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import o.ActivityResultContracts;
import o.C0033size;
import o.MenuHelper;
import o.addIntentOptions;
import o.dispatchRestoreInstanceState;
import o.getOrdering;
import o.isActionButton;
import o.restoreActionViewStates;
import o.savePresenterStates;
import o.setActionViewExpanded;
import o.setCurrentMenuInfo;
import o.setExclusiveItemChecked;
import o.setGroupEnabled;
import o.setMenuInfo;
import o.setQwertyMode;
import o.shouldShowIcon;

public final class FloatingActionButton extends C0033size implements TintableBackgroundView, TintableImageSourceView, restoreActionViewStates, setActionViewExpanded, CoordinatorLayout.AttachedBehavior {
    private static final int write = 2131886689;
    public int AudioAttributesImplApi21Parcelizer;
    private PorterDuff.Mode AudioAttributesImplApi26Parcelizer;
    private final AppCompatImageHelper AudioAttributesImplBaseParcelizer;
    private ColorStateList IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private final Rect MediaBrowserCompat$SearchResultReceiver;
    private ColorStateList MediaDescriptionCompat;
    final Rect RemoteActionCompatParcelizer;
    boolean asBinder;
    int asInterface;
    private int onConnected;
    private ColorStateList onConnectionFailed;
    private PorterDuff.Mode onConnectionSuspended;
    public setGroupEnabled onTransact;
    public final savePresenterStates read;
    private int setInternalConnectionCallback;

    public static abstract class asInterface {
        public void asBinder(FloatingActionButton floatingActionButton) {
        }

        public void read() {
        }
    }

    public final void setBackgroundColor(int i) {
    }

    public final void setBackgroundDrawable(Drawable drawable) {
    }

    public final void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4062130968937);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = write
            android.content.Context r13 = o.ActivityResultContracts.TakePicture.asBinder.read(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r12.RemoteActionCompatParcelizer = r13
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r12.MediaBrowserCompat$SearchResultReceiver = r13
            android.content.Context r13 = r12.getContext()
            int[] r7 = o.dispatchRestoreInstanceState.onConnected.AudioAttributesImplBaseParcelizer
            r8 = 0
            int[] r5 = new int[r8]
            o.ActivityResultContracts.PickContact.asInterface(r13, r14, r15, r6)
            r0 = r13
            r1 = r14
            r2 = r7
            r3 = r15
            r4 = r6
            o.ActivityResultContracts.PickContact.read(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r13.obtainStyledAttributes(r14, r7, r15, r6)
            r1 = 1
            android.content.res.ColorStateList r2 = o.setOnBackInvokedDispatcher.asInterface((android.content.Context) r13, (android.content.res.TypedArray) r0, (int) r1)
            r12.IconCompatParcelizer = r2
            r2 = -1
            r3 = 2
            int r3 = r0.getInt(r3, r2)
            r4 = 0
            android.graphics.PorterDuff$Mode r3 = o.setQwertyMode.asBinder(r3, r4)
            r12.AudioAttributesImplApi26Parcelizer = r3
            r3 = 12
            android.content.res.ColorStateList r3 = o.setOnBackInvokedDispatcher.asInterface((android.content.Context) r13, (android.content.res.TypedArray) r0, (int) r3)
            r12.MediaDescriptionCompat = r3
            r3 = 7
            int r2 = r0.getInt(r3, r2)
            r12.AudioAttributesImplApi21Parcelizer = r2
            r2 = 6
            int r2 = r0.getDimensionPixelSize(r2, r8)
            r12.onConnected = r2
            r2 = 3
            int r2 = r0.getDimensionPixelSize(r2, r8)
            r12.setInternalConnectionCallback = r2
            r2 = 0
            r3 = 4
            float r3 = r0.getDimension(r3, r2)
            r5 = 9
            float r5 = r0.getDimension(r5, r2)
            r7 = 11
            float r2 = r0.getDimension(r7, r2)
            r7 = 16
            boolean r7 = r0.getBoolean(r7, r8)
            r12.asBinder = r7
            android.content.res.Resources r7 = r12.getResources()
            r9 = 2131165497(0x7f070139, float:1.7945213E38)
            int r7 = r7.getDimensionPixelSize(r9)
            r9 = 10
            int r9 = r0.getDimensionPixelSize(r9, r8)
            r12.MediaBrowserCompat$CustomActionResultReceiver = r9
            r9 = 15
            boolean r10 = r0.hasValue(r9)
            if (r10 == 0) goto L_0x00a0
            int r9 = r0.getResourceId(r9, r8)
            if (r9 == 0) goto L_0x00a0
            o.getOrdering r9 = o.getOrdering.read(r13, r9)
            goto L_0x00a1
        L_0x00a0:
            r9 = r4
        L_0x00a1:
            r10 = 8
            boolean r11 = r0.hasValue(r10)
            if (r11 == 0) goto L_0x00b3
            int r10 = r0.getResourceId(r10, r8)
            if (r10 == 0) goto L_0x00b3
            o.getOrdering r4 = o.getOrdering.read(r13, r10)
        L_0x00b3:
            o.applyIconTintIfNecessary r10 = o.setMenuInfo.onTransact
            o.setMenuInfo$RemoteActionCompatParcelizer r13 = o.setMenuInfo.read(r13, r14, r15, r6, r10)
            o.setMenuInfo r6 = new o.setMenuInfo
            r6.<init>(r13, r8)
            r13 = 5
            boolean r13 = r0.getBoolean(r13, r8)
            boolean r1 = r0.getBoolean(r8, r1)
            r12.setEnabled(r1)
            r0.recycle()
            androidx.appcompat.widget.AppCompatImageHelper r0 = new androidx.appcompat.widget.AppCompatImageHelper
            r0.<init>(r12)
            r12.AudioAttributesImplBaseParcelizer = r0
            r0.loadFromAttributes(r14, r15)
            o.savePresenterStates r14 = new o.savePresenterStates
            r14.<init>(r12)
            r12.read = r14
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x00ee
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x00ee:
            o.setGroupEnabled r14 = r12.onTransact
            r14.onTransact((o.setMenuInfo) r6)
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0103
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0103:
            o.setGroupEnabled r14 = r12.onTransact
            android.content.res.ColorStateList r15 = r12.IconCompatParcelizer
            android.graphics.PorterDuff$Mode r0 = r12.AudioAttributesImplApi26Parcelizer
            android.content.res.ColorStateList r1 = r12.MediaDescriptionCompat
            int r6 = r12.setInternalConnectionCallback
            r14.onTransact(r15, r0, r1, r6)
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0120
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0120:
            o.setGroupEnabled r14 = r12.onTransact
            r14.MediaBrowserCompat$CustomActionResultReceiver = r7
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0134
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0134:
            o.setGroupEnabled r14 = r12.onTransact
            float r15 = r14.onConnectionFailed
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x0145
            r14.onConnectionFailed = r3
            float r15 = r14.MediaBrowserCompat$SearchResultReceiver
            float r0 = r14.RatingCompat
            r14.asBinder(r3, r15, r0)
        L_0x0145:
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0155
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0155:
            o.setGroupEnabled r14 = r12.onTransact
            float r15 = r14.MediaBrowserCompat$SearchResultReceiver
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x0166
            r14.MediaBrowserCompat$SearchResultReceiver = r5
            float r15 = r14.onConnectionFailed
            float r0 = r14.RatingCompat
            r14.asBinder(r15, r5, r0)
        L_0x0166:
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0176
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0176:
            o.setGroupEnabled r14 = r12.onTransact
            float r15 = r14.RatingCompat
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0187
            r14.RatingCompat = r2
            float r15 = r14.onConnectionFailed
            float r0 = r14.MediaBrowserCompat$SearchResultReceiver
            r14.asBinder(r15, r0, r2)
        L_0x0187:
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x0197
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x0197:
            o.setGroupEnabled r14 = r12.onTransact
            int r15 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r14.MediaDescriptionCompat
            if (r0 == r15) goto L_0x01af
            r14.MediaDescriptionCompat = r15
            float r15 = r14.MediaBrowserCompat$MediaItem
            r14.MediaBrowserCompat$MediaItem = r15
            android.graphics.Matrix r0 = r14.PlaybackStateCompat
            r14.asBinder((float) r15, (android.graphics.Matrix) r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r14 = r14.initViewTreeOwners
            r14.setImageMatrix(r0)
        L_0x01af:
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x01bf
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x01bf:
            o.setGroupEnabled r14 = r12.onTransact
            r14.MediaSessionCompat$Token = r9
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x01d3
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x01d3:
            o.setGroupEnabled r14 = r12.onTransact
            r14.setInternalConnectionCallback = r4
            o.setGroupEnabled r14 = r12.onTransact
            if (r14 != 0) goto L_0x01e7
            o.setCurrentMenuInfo r14 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r15 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r15.<init>()
            r14.<init>(r12, r15)
            r12.onTransact = r14
        L_0x01e7:
            o.setGroupEnabled r14 = r12.onTransact
            r14.onConnectionSuspended = r13
            android.widget.ImageView$ScaleType r13 = android.widget.ImageView.ScaleType.MATRIX
            r12.setScaleType(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (this.MediaDescriptionCompat != colorStateList) {
            this.MediaDescriptionCompat = colorStateList;
            RemoteActionCompatParcelizer().onTransact(this.MediaDescriptionCompat);
        }
    }

    public final CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public final ColorStateList getBackgroundTintList() {
        return this.IconCompatParcelizer;
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.IconCompatParcelizer != colorStateList) {
            this.IconCompatParcelizer = colorStateList;
            setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            isActionButton isactionbutton = RemoteActionCompatParcelizer2.ParcelableVolumeInfo;
            if (isactionbutton != null) {
                isactionbutton.setTintList(colorStateList);
            }
            setExclusiveItemChecked setexclusiveitemchecked = RemoteActionCompatParcelizer2.write;
            if (setexclusiveitemchecked != null) {
                setexclusiveitemchecked.onTransact(colorStateList);
            }
        }
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.AudioAttributesImplApi26Parcelizer != mode) {
            this.AudioAttributesImplApi26Parcelizer = mode;
            isActionButton isactionbutton = RemoteActionCompatParcelizer().ParcelableVolumeInfo;
            if (isactionbutton != null) {
                isactionbutton.setTintMode(mode);
            }
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.onConnectionFailed != colorStateList) {
            this.onConnectionFailed = colorStateList;
            asBinder();
        }
    }

    public final ColorStateList getSupportImageTintList() {
        return this.onConnectionFailed;
    }

    public final void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.onConnectionSuspended != mode) {
            this.onConnectionSuspended = mode;
            asBinder();
        }
    }

    public final PorterDuff.Mode getSupportImageTintMode() {
        return this.onConnectionSuspended;
    }

    private void asBinder() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.onConnectionFailed;
            if (colorStateList == null) {
                DrawableCompat.clearColorFilter(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.onConnectionSuspended;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
        }
    }

    public final void setImageResource(int i) {
        this.AudioAttributesImplBaseParcelizer.setImageResource(i);
        asBinder();
    }

    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            float f = RemoteActionCompatParcelizer2.MediaBrowserCompat$MediaItem;
            RemoteActionCompatParcelizer2.MediaBrowserCompat$MediaItem = f;
            Matrix matrix = RemoteActionCompatParcelizer2.PlaybackStateCompat;
            RemoteActionCompatParcelizer2.asBinder(f, matrix);
            RemoteActionCompatParcelizer2.initViewTreeOwners.setImageMatrix(matrix);
            if (this.onConnectionFailed != null) {
                asBinder();
            }
        }
    }

    public final void setShapeAppearanceModel(setMenuInfo setmenuinfo) {
        RemoteActionCompatParcelizer().onTransact(setmenuinfo);
    }

    public final void setEnsureMinTouchTargetSize(boolean z) {
        if (z != RemoteActionCompatParcelizer().onConnectionSuspended) {
            RemoteActionCompatParcelizer().onConnectionSuspended = z;
            requestLayout();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final boolean read() {
        return this.read.asInterface;
    }

    public final void setExpandedComponentIdHint(int i) {
        this.read.RemoteActionCompatParcelizer = i;
    }

    public final void setUseCompatPadding(boolean z) {
        if (this.asBinder != z) {
            this.asBinder = z;
            RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void setSize(int i) {
        this.onConnected = 0;
        if (i != this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = i;
            requestLayout();
        }
    }

    public final void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.onConnected) {
            this.onConnected = i;
            requestLayout();
        }
    }

    public final int asBinder(int i) {
        int i2 = this.onConnected;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.f11202131165302);
            }
            return resources.getDimensionPixelSize(R.dimen.f11192131165301);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return asBinder(1);
        } else {
            return asBinder(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        isActionButton isactionbutton = RemoteActionCompatParcelizer2.ParcelableVolumeInfo;
        if (isactionbutton != null) {
            FloatingActionButton floatingActionButton = RemoteActionCompatParcelizer2.initViewTreeOwners;
            if (isactionbutton.Cancellable.RemoteActionCompatParcelizer != null && isactionbutton.Cancellable.RemoteActionCompatParcelizer.asInterface) {
                isactionbutton.onConnectionSuspended(setQwertyMode.asInterface(floatingActionButton));
            }
        }
        if (RemoteActionCompatParcelizer2.write()) {
            ViewTreeObserver viewTreeObserver = RemoteActionCompatParcelizer2.initViewTreeOwners.getViewTreeObserver();
            if (RemoteActionCompatParcelizer2.MediaBrowserCompat$ItemReceiver == null) {
                RemoteActionCompatParcelizer2.MediaBrowserCompat$ItemReceiver = RemoteActionCompatParcelizer2;
            }
            viewTreeObserver.addOnPreDrawListener(RemoteActionCompatParcelizer2.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        ViewTreeObserver viewTreeObserver = RemoteActionCompatParcelizer2.initViewTreeOwners.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = RemoteActionCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            RemoteActionCompatParcelizer2.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        RemoteActionCompatParcelizer().asInterface(getDrawableState());
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        RemoteActionCompatParcelizer().asInterface();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        shouldShowIcon shouldshowicon = new shouldShowIcon(onSaveInstanceState);
        SimpleArrayMap<String, Bundle> simpleArrayMap = shouldshowicon.RemoteActionCompatParcelizer;
        savePresenterStates savepresenterstates = this.read;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", savepresenterstates.asInterface);
        bundle.putInt("expandedComponentIdHint", savepresenterstates.RemoteActionCompatParcelizer);
        simpleArrayMap.put("expandableWidgetHelper", bundle);
        return shouldshowicon;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof shouldShowIcon)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        shouldShowIcon shouldshowicon = (shouldShowIcon) parcelable;
        super.onRestoreInstanceState(shouldshowicon.getSuperState());
        savePresenterStates savepresenterstates = this.read;
        Bundle bundle = (Bundle) Preconditions.checkNotNull(shouldshowicon.RemoteActionCompatParcelizer.get("expandableWidgetHelper"));
        savepresenterstates.asInterface = bundle.getBoolean("expanded", false);
        savepresenterstates.RemoteActionCompatParcelizer = bundle.getInt("expandedComponentIdHint", 0);
        if (savepresenterstates.asInterface) {
            ViewParent parent = savepresenterstates.asBinder.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(savepresenterstates.asBinder);
            }
        }
    }

    public final void read(Rect rect) {
        rect.left += this.RemoteActionCompatParcelizer.left;
        rect.top += this.RemoteActionCompatParcelizer.top;
        rect.right -= this.RemoteActionCompatParcelizer.right;
        rect.bottom -= this.RemoteActionCompatParcelizer.bottom;
    }

    private static int read(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.MediaBrowserCompat$SearchResultReceiver;
            if (ViewCompat.isLaidOut(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                read(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !this.MediaBrowserCompat$SearchResultReceiver.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        public final /* bridge */ /* synthetic */ boolean asInterface(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        public final /* bridge */ /* synthetic */ boolean onTransact(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private boolean RemoteActionCompatParcelizer;
        private asInterface asInterface;
        private Rect read;

        public BaseBehavior() {
            this.RemoteActionCompatParcelizer = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchRestoreInstanceState.onConnected.onConnectionSuspended);
            this.RemoteActionCompatParcelizer = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        /* renamed from: RemoteActionCompatParcelizer */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                onTransact(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    RemoteActionCompatParcelizer(view, floatingActionButton);
                }
            }
            return false;
        }

        private boolean read(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (this.RemoteActionCompatParcelizer && layoutParams.getAnchorId() == view.getId() && floatingActionButton.AudioAttributesCompatParcelizer == 0) {
                return true;
            }
            return false;
        }

        private boolean onTransact(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!read(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.read == null) {
                this.read = new Rect();
            }
            Rect rect = this.read;
            ActivityResultContracts.TakePicture.onTransact.asInterface(coordinatorLayout, appBarLayout, rect);
            int i = rect.bottom;
            AnonymousClass1 r0 = null;
            if (i <= appBarLayout.onTransact()) {
                asInterface asinterface = this.asInterface;
                setGroupEnabled RemoteActionCompatParcelizer2 = floatingActionButton.RemoteActionCompatParcelizer();
                if (asinterface != null) {
                    r0 = new setGroupEnabled.asInterface(asinterface) {
                        private /* synthetic */ asInterface read;

                        {
                            this.read = r2;
                        }

                        public final void onTransact() {
                            this.read.read();
                        }

                        public final void asBinder() {
                            this.read.asBinder(FloatingActionButton.this);
                        }
                    };
                }
                RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(r0, false);
                return true;
            }
            asInterface asinterface2 = this.asInterface;
            setGroupEnabled RemoteActionCompatParcelizer3 = floatingActionButton.RemoteActionCompatParcelizer();
            if (asinterface2 != null) {
                r0 = new setGroupEnabled.asInterface(asinterface2) {
                    private /* synthetic */ asInterface read;

                    {
                        this.read = r2;
                    }

                    public final void onTransact() {
                        this.read.read();
                    }

                    public final void asBinder() {
                        this.read.asBinder(FloatingActionButton.this);
                    }
                };
            }
            RemoteActionCompatParcelizer3.asBinder((setGroupEnabled.asInterface) r0, false);
            return true;
        }

        private boolean RemoteActionCompatParcelizer(View view, FloatingActionButton floatingActionButton) {
            if (!read(view, floatingActionButton)) {
                return false;
            }
            AnonymousClass1 r0 = null;
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                asInterface asinterface = this.asInterface;
                setGroupEnabled RemoteActionCompatParcelizer2 = floatingActionButton.RemoteActionCompatParcelizer();
                if (asinterface != null) {
                    r0 = new setGroupEnabled.asInterface(asinterface) {
                        private /* synthetic */ asInterface read;

                        {
                            this.read = r2;
                        }

                        public final void onTransact() {
                            this.read.read();
                        }

                        public final void asBinder() {
                            this.read.asBinder(FloatingActionButton.this);
                        }
                    };
                }
                RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(r0, false);
                return true;
            }
            asInterface asinterface2 = this.asInterface;
            setGroupEnabled RemoteActionCompatParcelizer3 = floatingActionButton.RemoteActionCompatParcelizer();
            if (asinterface2 != null) {
                r0 = new setGroupEnabled.asInterface(asinterface2) {
                    private /* synthetic */ asInterface read;

                    {
                        this.read = r2;
                    }

                    public final void onTransact() {
                        this.read.read();
                    }

                    public final void asBinder() {
                        this.read.asBinder(FloatingActionButton.this);
                    }
                };
            }
            RemoteActionCompatParcelizer3.asBinder((setGroupEnabled.asInterface) r0, false);
            return true;
        }

        /* renamed from: onTransact */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = dependencies.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && RemoteActionCompatParcelizer(view, floatingActionButton)) {
                        break;
                    }
                } else if (onTransact(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            Rect rect = floatingActionButton.RemoteActionCompatParcelizer;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams2.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= layoutParams2.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams2.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= layoutParams2.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            ViewCompat.offsetLeftAndRight(floatingActionButton, i2);
            return true;
        }

        /* renamed from: asInterface */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.RemoteActionCompatParcelizer;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        isActionButton isactionbutton = RemoteActionCompatParcelizer().ParcelableVolumeInfo;
        if (isactionbutton != null) {
            isactionbutton.onConnected(f);
        }
    }

    public final void setCompatElevation(float f) {
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer2.onConnectionFailed != f) {
            RemoteActionCompatParcelizer2.onConnectionFailed = f;
            RemoteActionCompatParcelizer2.asBinder(f, RemoteActionCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver, RemoteActionCompatParcelizer2.RatingCompat);
        }
    }

    public final void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public final void setCompatHoveredFocusedTranslationZ(float f) {
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver != f) {
            RemoteActionCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver = f;
            RemoteActionCompatParcelizer2.asBinder(RemoteActionCompatParcelizer2.onConnectionFailed, f, RemoteActionCompatParcelizer2.RatingCompat);
        }
    }

    public final void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public final void setCompatPressedTranslationZ(float f) {
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer2.RatingCompat != f) {
            RemoteActionCompatParcelizer2.RatingCompat = f;
            RemoteActionCompatParcelizer2.asBinder(RemoteActionCompatParcelizer2.onConnectionFailed, RemoteActionCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver, f);
        }
    }

    public final void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public final void setShowMotionSpec(getOrdering getordering) {
        RemoteActionCompatParcelizer().MediaSessionCompat$Token = getordering;
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(getOrdering.read(getContext(), i));
    }

    public final void setHideMotionSpec(getOrdering getordering) {
        RemoteActionCompatParcelizer().setInternalConnectionCallback = getordering;
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(getOrdering.read(getContext(), i));
    }

    public class read<T extends FloatingActionButton> implements setGroupEnabled.onTransact {
        private final addIntentOptions<T> asInterface;

        public read(addIntentOptions<T> addintentoptions) {
            this.asInterface = addintentoptions;
        }

        public final void read() {
            this.asInterface.asBinder(FloatingActionButton.this);
        }

        public final void RemoteActionCompatParcelizer() {
            this.asInterface.read(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof read) && ((read) obj).asInterface.equals(this.asInterface);
        }

        public final int hashCode() {
            return this.asInterface.hashCode();
        }
    }

    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        RemoteActionCompatParcelizer().IconCompatParcelizer();
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        RemoteActionCompatParcelizer().IconCompatParcelizer();
    }

    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        RemoteActionCompatParcelizer().IconCompatParcelizer();
    }

    public final void setScaleX(float f) {
        super.setScaleX(f);
        RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
    }

    public final void setScaleY(float f) {
        super.setScaleY(f);
        RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
    }

    public final void setShadowPaddingEnabled(boolean z) {
        setGroupEnabled RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer2.MediaSessionCompat$ResultReceiverWrapper = z;
        RemoteActionCompatParcelizer2.onConnected();
    }

    /* access modifiers changed from: package-private */
    public setGroupEnabled RemoteActionCompatParcelizer() {
        if (this.onTransact == null) {
            this.onTransact = new setCurrentMenuInfo(this, new RemoteActionCompatParcelizer());
        }
        return this.onTransact;
    }

    public class RemoteActionCompatParcelizer implements MenuHelper {
        public RemoteActionCompatParcelizer() {
        }

        public final void onTransact(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.RemoteActionCompatParcelizer.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.asInterface, i2 + FloatingActionButton.this.asInterface, i3 + FloatingActionButton.this.asInterface, i4 + FloatingActionButton.this.asInterface);
        }

        public final void asBinder(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public final boolean onTransact() {
            return FloatingActionButton.this.asBinder;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int asBinder2 = asBinder(this.AudioAttributesImplApi21Parcelizer);
        this.asInterface = (asBinder2 - this.MediaBrowserCompat$CustomActionResultReceiver) / 2;
        RemoteActionCompatParcelizer().onConnected();
        int min = Math.min(read(asBinder2, i), read(asBinder2, i2));
        setMeasuredDimension(this.RemoteActionCompatParcelizer.left + min + this.RemoteActionCompatParcelizer.right, min + this.RemoteActionCompatParcelizer.top + this.RemoteActionCompatParcelizer.bottom);
    }
}
