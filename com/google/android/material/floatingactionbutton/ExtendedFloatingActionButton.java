package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.gojek.gopay.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.ActivityResultContracts;
import o.clearHeader;
import o.dispatchRestoreInstanceState;
import o.getMenuView;
import o.getOrdering;
import o.setDefaultShowAsAction;
import o.setExpandedFormat;
import o.setGroupCheckable;
import o.setHeaderTitleInt;
import o.showsIcon;

public final class ExtendedFloatingActionButton extends clearHeader implements CoordinatorLayout.AttachedBehavior {
    public static final Property<View, Float> AudioAttributesCompatParcelizer = new Property<View, Float>(Float.class, "width") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    };
    public static final Property<View, Float> AudioAttributesImplApi26Parcelizer = new Property<View, Float>(Float.class, "height") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    };
    public static final Property<View, Float> IconCompatParcelizer = new Property<View, Float>(Float.class, "paddingEnd") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ViewCompat.getPaddingEnd((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    };
    private static final int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = 2131886744;
    public static final Property<View, Float> write = new Property<View, Float>(Float.class, "paddingStart") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ViewCompat.getPaddingStart((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            ViewCompat.setPaddingRelative(view, ((Float) obj2).intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        }
    };
    int AudioAttributesImplApi21Parcelizer;
    final int AudioAttributesImplBaseParcelizer;
    public ColorStateList MediaBrowserCompat$CustomActionResultReceiver;
    final setHeaderTitleInt MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    final setHeaderTitleInt MediaBrowserCompat$SearchResultReceiver;
    boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> MediaSessionCompat$QueueItem;
    private final setGroupCheckable RatingCompat;
    int onConnected;
    final setHeaderTitleInt onConnectionFailed;
    final setHeaderTitleInt onConnectionSuspended;
    int setInternalConnectionCallback;

    interface RemoteActionCompatParcelizer {
        int RemoteActionCompatParcelizer();

        int asBinder();

        int asInterface();

        int onTransact();

        ViewGroup.LayoutParams read();
    }

    public static abstract class asInterface implements setExpandedFormat {
        private final boolean RemoteActionCompatParcelizer;
        public int asBinder;
        private showsIcon asInterface;
        public final ArrayList<getMenuView> read;

        public asInterface() {
        }

        public asInterface(boolean z) {
            this.RemoteActionCompatParcelizer = z;
            this.read = new ArrayList<>(1);
        }

        public final void RemoteActionCompatParcelizer(getMenuView getmenuview) {
            if (!this.read.contains(getmenuview)) {
                this.read.add(getmenuview);
                this.asBinder++;
            }
        }

        /* access modifiers changed from: protected */
        public final void onTransact(int i) {
            showsIcon showsicon = this.asInterface;
            for (int i2 = 0; i2 < this.asBinder; i2++) {
                this.read.get(i2).asInterface(showsicon, this.RemoteActionCompatParcelizer, i);
            }
        }

        public /* synthetic */ Map onTransact() {
            return Collections.emptyMap();
        }

        /* access modifiers changed from: protected */
        public final void asBinder() {
            showsIcon showsicon = this.asInterface;
            for (int i = 0; i < this.asBinder; i++) {
                this.read.get(i).RemoteActionCompatParcelizer(showsicon, this.RemoteActionCompatParcelizer);
            }
            this.asInterface = null;
        }

        /* access modifiers changed from: protected */
        public final void RemoteActionCompatParcelizer() {
            for (int i = 0; i < this.asBinder; i++) {
                getMenuView getmenuview = this.read.get(i);
            }
        }

        /* access modifiers changed from: protected */
        public final void asInterface(showsIcon showsicon) {
            this.asInterface = showsicon;
            for (int i = 0; i < this.asBinder; i++) {
                this.read.get(i).asInterface(showsicon, this.RemoteActionCompatParcelizer);
            }
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3902130968920);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r1 = r17
            android.content.Context r1 = o.ActivityResultContracts.TakePicture.asBinder.read(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.AudioAttributesImplApi21Parcelizer = r10
            o.setGroupCheckable r1 = new o.setGroupCheckable
            r1.<init>()
            r0.RatingCompat = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$read r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$read
            r11.<init>(r1)
            r0.MediaBrowserCompat$SearchResultReceiver = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$asBinder r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$asBinder
            r12.<init>(r1)
            r0.onConnectionSuspended = r12
            r13 = 1
            r0.MediaBrowserCompat$MediaItem = r13
            r0.MediaDescriptionCompat = r10
            r0.MediaMetadataCompat = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.MediaSessionCompat$QueueItem = r1
            int[] r15 = o.dispatchRestoreInstanceState.onConnected.AudioAttributesImplApi26Parcelizer
            int[] r6 = new int[r10]
            o.ActivityResultContracts.PickContact.asInterface(r14, r7, r8, r9)
            r1 = r14
            r2 = r18
            r3 = r15
            r4 = r19
            r5 = r9
            o.ActivityResultContracts.PickContact.read(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r7, r15, r8, r9)
            r2 = 4
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0063
            int r2 = r1.getResourceId(r2, r10)
            if (r2 == 0) goto L_0x0063
            o.getOrdering r2 = o.getOrdering.read(r14, r2)
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            r3 = 3
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L_0x0076
            int r3 = r1.getResourceId(r3, r10)
            if (r3 == 0) goto L_0x0076
            o.getOrdering r3 = o.getOrdering.read(r14, r3)
            goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            r5 = 2
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0089
            int r5 = r1.getResourceId(r5, r10)
            if (r5 == 0) goto L_0x0089
            o.getOrdering r5 = o.getOrdering.read(r14, r5)
            goto L_0x008a
        L_0x0089:
            r5 = r4
        L_0x008a:
            r6 = 5
            boolean r15 = r1.hasValue(r6)
            if (r15 == 0) goto L_0x009b
            int r6 = r1.getResourceId(r6, r10)
            if (r6 == 0) goto L_0x009b
            o.getOrdering r4 = o.getOrdering.read(r14, r6)
        L_0x009b:
            r6 = -1
            int r6 = r1.getDimensionPixelSize(r10, r6)
            r0.AudioAttributesImplBaseParcelizer = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.onConnected = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.setInternalConnectionCallback = r6
            o.setGroupCheckable r6 = new o.setGroupCheckable
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$onTransact r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$onTransact
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.onConnectionFailed = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$onTransact r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$onTransact
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.MediaBrowserCompat$ItemReceiver = r10
            r11.asInterface(r2)
            r12.asInterface(r3)
            r15.asInterface(r5)
            r10.asInterface(r4)
            r1.recycle()
            o.applyIconTintIfNecessary r1 = o.setMenuInfo.onTransact
            r2 = r18
            r3 = 0
            o.setMenuInfo$RemoteActionCompatParcelizer r1 = o.setMenuInfo.read(r14, r2, r8, r9, r1)
            o.setMenuInfo r2 = new o.setMenuInfo
            r2.<init>(r1, r3)
            r0.setShapeAppearanceModel(r2)
            android.content.res.ColorStateList r1 = r16.getTextColors()
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setTextColor(int i) {
        super.setTextColor(i);
        this.MediaBrowserCompat$CustomActionResultReceiver = getTextColors();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.MediaBrowserCompat$CustomActionResultReceiver = getTextColors();
    }

    public final void read(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.MediaBrowserCompat$MediaItem && TextUtils.isEmpty(getText()) && this.onTransact != null) {
            this.MediaBrowserCompat$MediaItem = false;
            this.MediaBrowserCompat$ItemReceiver.AudioAttributesCompatParcelizer();
        }
    }

    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final void setExtended(boolean z) {
        if (this.MediaBrowserCompat$MediaItem != z) {
            setHeaderTitleInt setheadertitleint = z ? this.onConnectionFailed : this.MediaBrowserCompat$ItemReceiver;
            if (!setheadertitleint.AudioAttributesImplApi21Parcelizer()) {
                setheadertitleint.AudioAttributesCompatParcelizer();
            }
        }
    }

    public final void setAnimateShowBeforeLayout(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.MediaBrowserCompat$MediaItem && !this.MediaDescriptionCompat) {
            this.onConnected = i;
            this.setInternalConnectionCallback = i3;
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.MediaBrowserCompat$MediaItem && !this.MediaDescriptionCompat) {
            this.onConnected = ViewCompat.getPaddingStart(this);
            this.setInternalConnectionCallback = ViewCompat.getPaddingEnd(this);
        }
    }

    public final void setShowMotionSpec(getOrdering getordering) {
        this.MediaBrowserCompat$SearchResultReceiver.asInterface(getordering);
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(getOrdering.read(getContext(), i));
    }

    public final void setHideMotionSpec(getOrdering getordering) {
        this.onConnectionSuspended.asInterface(getordering);
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(getOrdering.read(getContext(), i));
    }

    public final void setExtendMotionSpec(getOrdering getordering) {
        this.onConnectionFailed.asInterface(getordering);
    }

    public final void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(getOrdering.read(getContext(), i));
    }

    public final void setShrinkMotionSpec(getOrdering getordering) {
        this.MediaBrowserCompat$ItemReceiver.asInterface(getordering);
    }

    public final void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(getOrdering.read(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public final boolean read() {
        if (getVisibility() != 0) {
            if (this.AudioAttributesImplApi21Parcelizer == 2) {
                return true;
            }
            return false;
        } else if (this.AudioAttributesImplApi21Parcelizer != 1) {
            return true;
        } else {
            return false;
        }
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect RemoteActionCompatParcelizer;
        private boolean asBinder;
        private asInterface asInterface;
        private asInterface onTransact;
        private boolean read;

        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                asBinder(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    onTransact(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && onTransact(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (asBinder(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.asBinder = false;
            this.read = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchRestoreInstanceState.onConnected.setInternalConnectionCallback);
            this.asBinder = obtainStyledAttributes.getBoolean(0, false);
            this.read = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        private boolean asInterface(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.asBinder || this.read) && layoutParams.getAnchorId() == view.getId()) {
                return true;
            }
            return false;
        }

        private boolean asBinder(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!asInterface(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new Rect();
            }
            Rect rect = this.RemoteActionCompatParcelizer;
            ActivityResultContracts.TakePicture.onTransact.asInterface(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.onTransact()) {
                asInterface(extendedFloatingActionButton);
                return true;
            }
            asBinder(extendedFloatingActionButton);
            return true;
        }

        private boolean onTransact(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!asInterface(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                asInterface(extendedFloatingActionButton);
                return true;
            }
            asBinder(extendedFloatingActionButton);
            return true;
        }

        private void asInterface(ExtendedFloatingActionButton extendedFloatingActionButton) {
            setHeaderTitleInt setheadertitleint;
            boolean z = this.read;
            asInterface asinterface = z ? this.onTransact : this.asInterface;
            if (z) {
                setheadertitleint = extendedFloatingActionButton.MediaBrowserCompat$ItemReceiver;
            } else {
                setheadertitleint = extendedFloatingActionButton.onConnectionSuspended;
            }
            ExtendedFloatingActionButton.onTransact(extendedFloatingActionButton, setheadertitleint, asinterface);
        }

        private void asBinder(ExtendedFloatingActionButton extendedFloatingActionButton) {
            setHeaderTitleInt setheadertitleint;
            boolean z = this.read;
            asInterface asinterface = z ? this.onTransact : this.asInterface;
            if (z) {
                setheadertitleint = extendedFloatingActionButton.onConnectionFailed;
            } else {
                setheadertitleint = extendedFloatingActionButton.MediaBrowserCompat$SearchResultReceiver;
            }
            ExtendedFloatingActionButton.onTransact(extendedFloatingActionButton, setheadertitleint, asinterface);
        }
    }

    class onTransact extends setDefaultShowAsAction {
        private final boolean asBinder;
        private final RemoteActionCompatParcelizer onTransact;

        onTransact(setGroupCheckable setgroupcheckable, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            super(ExtendedFloatingActionButton.this, setgroupcheckable);
            this.onTransact = remoteActionCompatParcelizer;
            this.asBinder = z;
        }

        public final void AudioAttributesCompatParcelizer() {
            ExtendedFloatingActionButton.this.MediaBrowserCompat$MediaItem = this.asBinder;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.onTransact.read().width;
                layoutParams.height = this.onTransact.read().height;
                ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.onTransact.asInterface(), ExtendedFloatingActionButton.this.getPaddingTop(), this.onTransact.onTransact(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return this.asBinder ? R.animator.f692130837522 : R.animator.f682130837521;
        }

        public final AnimatorSet onTransact() {
            getOrdering asInterface = asInterface();
            if (asInterface.asInterface.get("width") != null) {
                PropertyValuesHolder[] asInterface2 = asInterface.asInterface("width");
                asInterface2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.onTransact.asBinder()});
                asInterface.asInterface.put("width", asInterface2);
            }
            if (asInterface.asInterface.get("height") != null) {
                PropertyValuesHolder[] asInterface3 = asInterface.asInterface("height");
                asInterface3[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.onTransact.RemoteActionCompatParcelizer()});
                asInterface.asInterface.put("height", asInterface3);
            }
            if (asInterface.asInterface.get("paddingStart") != null) {
                PropertyValuesHolder[] asInterface4 = asInterface.asInterface("paddingStart");
                asInterface4[0].setFloatValues(new float[]{(float) ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), (float) this.onTransact.asInterface()});
                asInterface.asInterface.put("paddingStart", asInterface4);
            }
            if (asInterface.asInterface.get("paddingEnd") != null) {
                PropertyValuesHolder[] asInterface5 = asInterface.asInterface("paddingEnd");
                asInterface5[0].setFloatValues(new float[]{(float) ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), (float) this.onTransact.onTransact()});
                asInterface.asInterface.put("paddingEnd", asInterface5);
            }
            if (asInterface.asInterface.get("labelOpacity") != null) {
                PropertyValuesHolder[] asInterface6 = asInterface.asInterface("labelOpacity");
                boolean z = this.asBinder;
                float f = 1.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (!z) {
                    f = 0.0f;
                }
                asInterface6[0].setFloatValues(new float[]{f2, f});
                asInterface.asInterface.put("labelOpacity", asInterface6);
            }
            return super.read(asInterface);
        }

        public final void onTransact(Animator animator) {
            super.onTransact(animator);
            ExtendedFloatingActionButton.this.MediaBrowserCompat$MediaItem = this.asBinder;
            ExtendedFloatingActionButton.this.MediaDescriptionCompat = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.MediaDescriptionCompat = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.onTransact.read().width;
                layoutParams.height = this.onTransact.read().height;
            }
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            return this.asBinder == ExtendedFloatingActionButton.this.MediaBrowserCompat$MediaItem || ExtendedFloatingActionButton.this.onTransact == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    class read extends setDefaultShowAsAction {
        public final int AudioAttributesImplApi26Parcelizer() {
            return R.animator.f712130837524;
        }

        public read(setGroupCheckable setgroupcheckable) {
            super(ExtendedFloatingActionButton.this, setgroupcheckable);
        }

        public final void AudioAttributesCompatParcelizer() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        public final void onTransact(Animator animator) {
            super.onTransact(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 2;
        }

        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 0;
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            return ExtendedFloatingActionButton.this.read();
        }
    }

    class asBinder extends setDefaultShowAsAction {
        private boolean read;

        public final int AudioAttributesImplApi26Parcelizer() {
            return R.animator.f702130837523;
        }

        public asBinder(setGroupCheckable setgroupcheckable) {
            super(ExtendedFloatingActionButton.this, setgroupcheckable);
        }

        public final void AudioAttributesCompatParcelizer() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.AudioAttributesImplApi21Parcelizer == 1) {
                    return true;
                }
                return false;
            } else if (extendedFloatingActionButton.AudioAttributesImplApi21Parcelizer != 2) {
                return true;
            } else {
                return false;
            }
        }

        public final void onTransact(Animator animator) {
            super.onTransact(animator);
            this.read = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 1;
        }

        public final void asBinder() {
            super.asBinder();
            this.read = true;
        }

        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 0;
            if (!this.read) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }
    }

    static /* synthetic */ void onTransact(ExtendedFloatingActionButton extendedFloatingActionButton, final setHeaderTitleInt setheadertitleint, final asInterface asinterface) {
        if (!setheadertitleint.AudioAttributesImplApi21Parcelizer()) {
            if (!((ViewCompat.isLaidOut(extendedFloatingActionButton) || (!extendedFloatingActionButton.read() && extendedFloatingActionButton.MediaMetadataCompat)) && !extendedFloatingActionButton.isInEditMode())) {
                setheadertitleint.AudioAttributesCompatParcelizer();
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet onTransact2 = setheadertitleint.onTransact();
            onTransact2.addListener(new AnimatorListenerAdapter() {
                private boolean RemoteActionCompatParcelizer;

                public final void onAnimationStart(Animator animator) {
                    setheadertitleint.onTransact(animator);
                    this.RemoteActionCompatParcelizer = false;
                }

                public final void onAnimationCancel(Animator animator) {
                    this.RemoteActionCompatParcelizer = true;
                    setheadertitleint.asBinder();
                }

                public final void onAnimationEnd(Animator animator) {
                    setheadertitleint.read();
                    boolean z = this.RemoteActionCompatParcelizer;
                }
            });
            for (Animator.AnimatorListener addListener : setheadertitleint.RemoteActionCompatParcelizer()) {
                onTransact2.addListener(addListener);
            }
            onTransact2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final int asInterface() {
        int i = this.AudioAttributesImplBaseParcelizer;
        if (i < 0) {
            i = (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) << 1) + this.asInterface;
        }
        return (i - this.asInterface) / 2;
    }
}
