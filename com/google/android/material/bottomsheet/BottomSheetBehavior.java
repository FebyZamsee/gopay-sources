package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.gojek.gopay.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.MenuItemImpl;
import o.dispatchRestoreInstanceState;
import o.isActionButton;
import o.setMenuInfo;
import o.setOnBackInvokedDispatcher;
import o.setQwertyMode;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int MediaSessionCompat$QueueItem = 2131886687;
    int AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    int AudioAttributesImplApi26Parcelizer;
    boolean AudioAttributesImplBaseParcelizer;
    private boolean Cancellable;
    private float ComponentActivity = 0.5f;
    public boolean IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem = 4;
    int MediaBrowserCompat$SearchResultReceiver;
    private int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    boolean MediaDescriptionCompat;
    WeakReference<V> MediaMetadataCompat;
    boolean MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token = -1;
    private int ParcelableVolumeInfo;
    private final ViewDragHelper.Callback PlaybackStateCompat = new ViewDragHelper.Callback() {
        public final boolean tryCaptureView(View view, int i) {
            if (BottomSheetBehavior.this.MediaBrowserCompat$MediaItem == 1 || BottomSheetBehavior.this.MediaSessionCompat$ResultReceiverWrapper) {
                return false;
            }
            if (BottomSheetBehavior.this.MediaBrowserCompat$MediaItem == 3 && BottomSheetBehavior.this.RemoteActionCompatParcelizer == i) {
                View view2 = BottomSheetBehavior.this.onConnectionFailed != null ? BottomSheetBehavior.this.onConnectionFailed.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.MediaMetadataCompat == null || BottomSheetBehavior.this.MediaMetadataCompat.get() != view) {
                return false;
            }
            return true;
        }

        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.onTransact(i2);
        }

        public final void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.onTransact) {
                BottomSheetBehavior.this.RemoteActionCompatParcelizer(1);
            }
        }

        public final void onViewReleased(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 6;
            if (f2 < 0.0f) {
                if (BottomSheetBehavior.this.read) {
                    i = BottomSheetBehavior.this.AudioAttributesCompatParcelizer;
                } else if (view.getTop() > BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer) {
                    i = BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer;
                    BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
                } else {
                    i = BottomSheetBehavior.this.asBinder();
                }
            } else if (!BottomSheetBehavior.this.IconCompatParcelizer || !BottomSheetBehavior.this.read(view, f2)) {
                if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.read) {
                        if (top < BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer) {
                            if (top < Math.abs(top - BottomSheetBehavior.this.asBinder)) {
                                i = BottomSheetBehavior.this.asBinder();
                            } else {
                                i = BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer) < Math.abs(top - BottomSheetBehavior.this.asBinder)) {
                            i = BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer;
                        } else {
                            i2 = BottomSheetBehavior.this.asBinder;
                        }
                        BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
                    } else if (Math.abs(top - BottomSheetBehavior.this.AudioAttributesCompatParcelizer) < Math.abs(top - BottomSheetBehavior.this.asBinder)) {
                        i = BottomSheetBehavior.this.AudioAttributesCompatParcelizer;
                    } else {
                        i2 = BottomSheetBehavior.this.asBinder;
                    }
                } else if (BottomSheetBehavior.this.read) {
                    i2 = BottomSheetBehavior.this.asBinder;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer) < Math.abs(top2 - BottomSheetBehavior.this.asBinder)) {
                        i = BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer;
                        BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
                    }
                    i2 = BottomSheetBehavior.this.asBinder;
                }
                i3 = 4;
                BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
            } else {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    if (!(view.getTop() > (BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver + BottomSheetBehavior.this.asBinder()) / 2)) {
                        if (BottomSheetBehavior.this.read) {
                            i = BottomSheetBehavior.this.AudioAttributesCompatParcelizer;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.asBinder()) < Math.abs(view.getTop() - BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer)) {
                            i = BottomSheetBehavior.this.asBinder();
                        } else {
                            i = BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer;
                            BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
                        }
                    }
                }
                i = BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver;
                i3 = 5;
                BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
            }
            i3 = 3;
            BottomSheetBehavior.this.RemoteActionCompatParcelizer(view, i3, i, true);
        }

        public final int clampViewPositionVertical(View view, int i, int i2) {
            return MathUtils.clamp(i, BottomSheetBehavior.this.asBinder(), BottomSheetBehavior.this.IconCompatParcelizer ? BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver : BottomSheetBehavior.this.asBinder);
        }

        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        public final int getViewVerticalDragRange(View view) {
            if (BottomSheetBehavior.this.IconCompatParcelizer) {
                return BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver;
            }
            return BottomSheetBehavior.this.asBinder;
        }
    };
    private float PlaybackStateCompat$CustomAction = -1.0f;
    ViewDragHelper RatingCompat;
    int RemoteActionCompatParcelizer;
    private Map<View, Integer> access$001;
    private int addContentView = -1;
    private int addMenuProvider;
    private boolean addOnConfigurationChangedListener;
    private boolean addOnContextAvailableListener;
    private float addOnMultiWindowModeChangedListener;
    private boolean addOnNewIntentListener;
    private boolean addOnPictureInPictureModeChangedListener;
    private int addOnTrimMemoryListener;
    int asBinder;
    public final ArrayList<RemoteActionCompatParcelizer> asInterface = new ArrayList<>();
    private int cancel;
    private ValueAnimator createFullyDrawnExecutor;
    private int ensureViewModelStore;
    private int getActivityResultRegistry;
    private int getDefaultViewModelCreationExtras = 0;
    private boolean getDefaultViewModelProviderFactory = false;
    private setMenuInfo getFullyDrawnReporter;
    private boolean getLastCustomNonConfigurationInstance;
    private BottomSheetBehavior<V>.onTransact getLifecycle = null;
    private boolean initViewTreeOwners;

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity  reason: not valid java name */
    private VelocityTracker f2467lambda$new$0$androidxactivityComponentActivity;
    int onConnected;
    WeakReference<View> onConnectionFailed;
    public isActionButton onConnectionSuspended;
    boolean onTransact = true;
    boolean read = true;
    boolean setInternalConnectionCallback;
    int write;

    public static abstract class RemoteActionCompatParcelizer {
        public abstract void asInterface(View view, int i);

        public abstract void onTransact(View view);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ensureViewModelStore = context.getResources().getDimensionPixelSize(R.dimen.f12312131165509);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchRestoreInstanceState.onConnected.RemoteActionCompatParcelizer);
        this.getLastCustomNonConfigurationInstance = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            onTransact(context, attributeSet, hasValue, setOnBackInvokedDispatcher.asInterface(context, obtainStyledAttributes, 2));
        } else {
            onTransact(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.createFullyDrawnExecutor = ofFloat;
        ofFloat.setDuration(500);
        this.createFullyDrawnExecutor.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.onConnectionSuspended != null) {
                    isActionButton isactionbutton = BottomSheetBehavior.this.onConnectionSuspended;
                    if (isactionbutton.Cancellable.IconCompatParcelizer != floatValue) {
                        isactionbutton.Cancellable.IconCompatParcelizer = floatValue;
                        isactionbutton.access$001 = true;
                        isactionbutton.invalidateSelf();
                    }
                }
            }
        });
        this.PlaybackStateCompat$CustomAction = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.addContentView = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || peekValue.data != -1) {
            AudioAttributesImplApi26Parcelizer(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            AudioAttributesImplApi26Parcelizer(peekValue.data);
        }
        asBinder(obtainStyledAttributes.getBoolean(7, false));
        this.Cancellable = obtainStyledAttributes.getBoolean(11, false);
        boolean z = obtainStyledAttributes.getBoolean(5, true);
        if (this.read != z) {
            this.read = z;
            if (this.MediaMetadataCompat != null) {
                read();
            }
            RemoteActionCompatParcelizer((!this.read || this.MediaBrowserCompat$MediaItem != 6) ? this.MediaBrowserCompat$MediaItem : 3);
            onTransact();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(10, false);
        this.onTransact = obtainStyledAttributes.getBoolean(3, true);
        this.getDefaultViewModelCreationExtras = obtainStyledAttributes.getInt(9, 0);
        float f = obtainStyledAttributes.getFloat(6, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.ComponentActivity = f;
        if (this.MediaMetadataCompat != null) {
            this.AudioAttributesImplApi26Parcelizer = (int) (((float) this.MediaBrowserCompat$ItemReceiver) * (1.0f - f));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            if (dimensionPixelOffset >= 0) {
                this.ParcelableVolumeInfo = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i = peekValue2.data;
            if (i >= 0) {
                this.ParcelableVolumeInfo = i;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.AudioAttributesImplBaseParcelizer = obtainStyledAttributes.getBoolean(12, false);
        this.setInternalConnectionCallback = obtainStyledAttributes.getBoolean(13, false);
        this.MediaDescriptionCompat = obtainStyledAttributes.getBoolean(14, false);
        this.addOnPictureInPictureModeChangedListener = obtainStyledAttributes.getBoolean(15, true);
        obtainStyledAttributes.recycle();
        this.addOnMultiWindowModeChangedListener = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new asInterface(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        asInterface asinterface = (asInterface) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, asinterface.getSuperState());
        int i = this.getDefaultViewModelCreationExtras;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.MediaBrowserCompat$SearchResultReceiver = asinterface.asBinder;
            }
            int i2 = this.getDefaultViewModelCreationExtras;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.read = asinterface.read;
            }
            int i3 = this.getDefaultViewModelCreationExtras;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.IconCompatParcelizer = asinterface.onTransact;
            }
            int i4 = this.getDefaultViewModelCreationExtras;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.MediaBrowserCompat$CustomActionResultReceiver = asinterface.RemoteActionCompatParcelizer;
            }
        }
        if (asinterface.asInterface == 1 || asinterface.asInterface == 2) {
            this.MediaBrowserCompat$MediaItem = 4;
        } else {
            this.MediaBrowserCompat$MediaItem = asinterface.asInterface;
        }
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.MediaMetadataCompat = null;
        this.RatingCompat = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.MediaMetadataCompat = null;
        this.RatingCompat = null;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final V v, int i) {
        isActionButton isactionbutton;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.MediaMetadataCompat == null) {
            this.getActivityResultRegistry = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f11152131165297);
            final boolean z = Build.VERSION.SDK_INT >= 29 && !this.Cancellable && !this.addOnNewIntentListener;
            if (this.AudioAttributesImplBaseParcelizer || this.setInternalConnectionCallback || this.MediaDescriptionCompat || z) {
                setQwertyMode.RemoteActionCompatParcelizer(v, new setQwertyMode.RemoteActionCompatParcelizer() {
                    public final WindowInsetsCompat onTransact(View view, WindowInsetsCompat windowInsetsCompat, setQwertyMode.asInterface asinterface) {
                        BottomSheetBehavior.this.onConnected = windowInsetsCompat.getSystemWindowInsetTop();
                        boolean z = true;
                        if (ViewCompat.getLayoutDirection(view) != 1) {
                            z = false;
                        }
                        int paddingBottom = view.getPaddingBottom();
                        int paddingLeft = view.getPaddingLeft();
                        int paddingRight = view.getPaddingRight();
                        if (BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer) {
                            BottomSheetBehavior.this.write = windowInsetsCompat.getSystemWindowInsetBottom();
                            paddingBottom = asinterface.asInterface + BottomSheetBehavior.this.write;
                        }
                        if (BottomSheetBehavior.this.setInternalConnectionCallback) {
                            paddingLeft = (z ? asinterface.read : asinterface.asBinder) + windowInsetsCompat.getSystemWindowInsetLeft();
                        }
                        if (BottomSheetBehavior.this.MediaDescriptionCompat) {
                            paddingRight = (z ? asinterface.asBinder : asinterface.read) + windowInsetsCompat.getSystemWindowInsetRight();
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        if (z) {
                            BottomSheetBehavior.this.AudioAttributesImplApi21Parcelizer = windowInsetsCompat.getMandatorySystemGestureInsets().bottom;
                        }
                        if (BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer || z) {
                            BottomSheetBehavior.this.onTransact(false);
                        }
                        return windowInsetsCompat;
                    }
                });
            }
            this.MediaMetadataCompat = new WeakReference<>(v);
            if (this.getLastCustomNonConfigurationInstance && (isactionbutton = this.onConnectionSuspended) != null) {
                ViewCompat.setBackground(v, isactionbutton);
            }
            isActionButton isactionbutton2 = this.onConnectionSuspended;
            if (isactionbutton2 != null) {
                float f = this.PlaybackStateCompat$CustomAction;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                isactionbutton2.onConnected(f);
                boolean z2 = this.MediaBrowserCompat$MediaItem == 3;
                this.addOnContextAvailableListener = z2;
                isActionButton isactionbutton3 = this.onConnectionSuspended;
                float f2 = z2 ? 0.0f : 1.0f;
                if (isactionbutton3.Cancellable.IconCompatParcelizer != f2) {
                    isactionbutton3.Cancellable.IconCompatParcelizer = f2;
                    isactionbutton3.access$001 = true;
                    isactionbutton3.invalidateSelf();
                }
            }
            onTransact();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.addContentView;
            if (measuredWidth > i2 && i2 != -1) {
                final ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.addContentView;
                v.post(new Runnable() {
                    public final void run() {
                        v.setLayoutParams(layoutParams);
                    }
                });
            }
        }
        if (this.RatingCompat == null) {
            this.RatingCompat = ViewDragHelper.create(coordinatorLayout, this.PlaybackStateCompat);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.addOnTrimMemoryListener = coordinatorLayout.getWidth();
        this.MediaBrowserCompat$ItemReceiver = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = height;
        int i3 = this.MediaBrowserCompat$ItemReceiver;
        int i4 = this.onConnected;
        if (i3 - height < i4) {
            if (this.addOnPictureInPictureModeChangedListener) {
                this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = i3;
            } else {
                this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = i3 - i4;
            }
        }
        this.AudioAttributesCompatParcelizer = Math.max(0, i3 - this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        this.AudioAttributesImplApi26Parcelizer = (int) (((float) this.MediaBrowserCompat$ItemReceiver) * (1.0f - this.ComponentActivity));
        read();
        int i5 = this.MediaBrowserCompat$MediaItem;
        if (i5 == 3) {
            ViewCompat.offsetTopAndBottom(v, asBinder());
        } else if (i5 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.AudioAttributesImplApi26Parcelizer);
        } else if (this.IconCompatParcelizer && i5 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.MediaBrowserCompat$ItemReceiver);
        } else if (i5 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.asBinder);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        this.onConnectionFailed = new WeakReference<>(RemoteActionCompatParcelizer((View) v));
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.onTransact) {
            this.initViewTreeOwners = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.RemoteActionCompatParcelizer = -1;
            VelocityTracker velocityTracker = this.f2467lambda$new$0$androidxactivityComponentActivity;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2467lambda$new$0$androidxactivityComponentActivity = null;
            }
        }
        if (this.f2467lambda$new$0$androidxactivityComponentActivity == null) {
            this.f2467lambda$new$0$androidxactivityComponentActivity = VelocityTracker.obtain();
        }
        this.f2467lambda$new$0$androidxactivityComponentActivity.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.cancel = (int) motionEvent.getY();
            if (this.MediaBrowserCompat$MediaItem != 2) {
                WeakReference<View> weakReference = this.onConnectionFailed;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, this.cancel)) {
                    this.RemoteActionCompatParcelizer = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.MediaSessionCompat$ResultReceiverWrapper = true;
                }
            }
            this.initViewTreeOwners = this.RemoteActionCompatParcelizer == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.cancel);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.MediaSessionCompat$ResultReceiverWrapper = false;
            this.RemoteActionCompatParcelizer = -1;
            if (this.initViewTreeOwners) {
                this.initViewTreeOwners = false;
                return false;
            }
        }
        if (!this.initViewTreeOwners && (viewDragHelper = this.RatingCompat) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.onConnectionFailed;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.initViewTreeOwners || this.MediaBrowserCompat$MediaItem == 1 || coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.RatingCompat == null || Math.abs(((float) this.cancel) - motionEvent.getY()) <= ((float) this.RatingCompat.getTouchSlop())) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.MediaBrowserCompat$MediaItem == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.RatingCompat;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.RemoteActionCompatParcelizer = -1;
            VelocityTracker velocityTracker = this.f2467lambda$new$0$androidxactivityComponentActivity;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2467lambda$new$0$androidxactivityComponentActivity = null;
            }
        }
        if (this.f2467lambda$new$0$androidxactivityComponentActivity == null) {
            this.f2467lambda$new$0$androidxactivityComponentActivity = VelocityTracker.obtain();
        }
        this.f2467lambda$new$0$androidxactivityComponentActivity.addMovement(motionEvent);
        if (this.RatingCompat != null && actionMasked == 2 && !this.initViewTreeOwners && Math.abs(((float) this.cancel) - motionEvent.getY()) > ((float) this.RatingCompat.getTouchSlop())) {
            this.RatingCompat.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.initViewTreeOwners;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.addMenuProvider = 0;
        this.addOnConfigurationChangedListener = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.onConnectionFailed;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < asBinder()) {
                        int asBinder2 = top - asBinder();
                        iArr[1] = asBinder2;
                        ViewCompat.offsetTopAndBottom(v, -asBinder2);
                        RemoteActionCompatParcelizer(3);
                    } else if (this.onTransact) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        RemoteActionCompatParcelizer(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.asBinder;
                    if (i4 > i5 && !this.IconCompatParcelizer) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        ViewCompat.offsetTopAndBottom(v, -i6);
                        RemoteActionCompatParcelizer(4);
                    } else if (this.onTransact) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        RemoteActionCompatParcelizer(1);
                    } else {
                        return;
                    }
                }
                onTransact(v.getTop());
                this.addMenuProvider = i2;
                this.addOnConfigurationChangedListener = true;
            }
        }
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        float f;
        int i4 = 3;
        if (v.getTop() == asBinder()) {
            RemoteActionCompatParcelizer(3);
            return;
        }
        WeakReference<View> weakReference = this.onConnectionFailed;
        if (weakReference != null && view == weakReference.get() && this.addOnConfigurationChangedListener) {
            if (this.addMenuProvider > 0) {
                if (this.read) {
                    i2 = this.AudioAttributesCompatParcelizer;
                } else {
                    int top = v.getTop();
                    int i5 = this.AudioAttributesImplApi26Parcelizer;
                    if (top <= i5) {
                        i2 = asBinder();
                    } else {
                        i2 = i5;
                    }
                }
                RemoteActionCompatParcelizer(v, i4, i2, false);
                this.addOnConfigurationChangedListener = false;
            }
            if (this.IconCompatParcelizer) {
                VelocityTracker velocityTracker = this.f2467lambda$new$0$androidxactivityComponentActivity;
                if (velocityTracker == null) {
                    f = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.addOnMultiWindowModeChangedListener);
                    f = this.f2467lambda$new$0$androidxactivityComponentActivity.getYVelocity(this.RemoteActionCompatParcelizer);
                }
                if (read(v, f)) {
                    i2 = this.MediaBrowserCompat$ItemReceiver;
                    i4 = 5;
                    RemoteActionCompatParcelizer(v, i4, i2, false);
                    this.addOnConfigurationChangedListener = false;
                }
            }
            if (this.addMenuProvider == 0) {
                int top2 = v.getTop();
                if (!this.read) {
                    int i6 = this.AudioAttributesImplApi26Parcelizer;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.asBinder)) {
                            i2 = asBinder();
                            RemoteActionCompatParcelizer(v, i4, i2, false);
                            this.addOnConfigurationChangedListener = false;
                        }
                        i2 = this.AudioAttributesImplApi26Parcelizer;
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.asBinder)) {
                        i2 = this.AudioAttributesImplApi26Parcelizer;
                    } else {
                        i3 = this.asBinder;
                    }
                } else if (Math.abs(top2 - this.AudioAttributesCompatParcelizer) < Math.abs(top2 - this.asBinder)) {
                    i2 = this.AudioAttributesCompatParcelizer;
                    RemoteActionCompatParcelizer(v, i4, i2, false);
                    this.addOnConfigurationChangedListener = false;
                } else {
                    i3 = this.asBinder;
                }
            } else if (this.read) {
                i3 = this.asBinder;
            } else {
                int top3 = v.getTop();
                if (Math.abs(top3 - this.AudioAttributesImplApi26Parcelizer) < Math.abs(top3 - this.asBinder)) {
                    i2 = this.AudioAttributesImplApi26Parcelizer;
                } else {
                    i3 = this.asBinder;
                }
            }
            i4 = 4;
            RemoteActionCompatParcelizer(v, i4, i2, false);
            this.addOnConfigurationChangedListener = false;
            i4 = 6;
            RemoteActionCompatParcelizer(v, i4, i2, false);
            this.addOnConfigurationChangedListener = false;
        }
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.onConnectionFailed;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.MediaBrowserCompat$MediaItem != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AudioAttributesImplApi26Parcelizer(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.addOnNewIntentListener
            if (r4 != 0) goto L_0x0014
            r3.addOnNewIntentListener = r0
            goto L_0x001e
        L_0x000c:
            boolean r2 = r3.addOnNewIntentListener
            if (r2 != 0) goto L_0x0016
            int r2 = r3.MediaBrowserCompat$SearchResultReceiver
            if (r2 != r4) goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x001e
        L_0x0016:
            r3.addOnNewIntentListener = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.MediaBrowserCompat$SearchResultReceiver = r4
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r3.onTransact((boolean) r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AudioAttributesImplApi26Parcelizer(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void onTransact(boolean z) {
        View view;
        if (this.MediaMetadataCompat != null) {
            read();
            if (this.MediaBrowserCompat$MediaItem == 4 && (view = (View) this.MediaMetadataCompat.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final int asBinder() {
        if (this.read) {
            return this.AudioAttributesCompatParcelizer;
        }
        return Math.max(this.ParcelableVolumeInfo, this.addOnPictureInPictureModeChangedListener ? 0 : this.onConnected);
    }

    public final void asBinder(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            if (!z && this.MediaBrowserCompat$MediaItem == 5) {
                asInterface(4);
            }
            onTransact();
        }
    }

    public final void asInterface(int i) {
        if (i != this.MediaBrowserCompat$MediaItem) {
            if (this.MediaMetadataCompat != null) {
                asBinder(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.IconCompatParcelizer && i == 5)) {
                this.MediaBrowserCompat$MediaItem = i;
            }
        }
    }

    private void asBinder(final int i) {
        final View view = (View) this.MediaMetadataCompat.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                asInterface(view, i);
            } else {
                view.post(new Runnable() {
                    public final void run() {
                        BottomSheetBehavior.this.asInterface(view, i);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void RemoteActionCompatParcelizer(int i) {
        View view;
        if (this.MediaBrowserCompat$MediaItem != i) {
            this.MediaBrowserCompat$MediaItem = i;
            WeakReference<V> weakReference = this.MediaMetadataCompat;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    RemoteActionCompatParcelizer(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    RemoteActionCompatParcelizer(false);
                }
                read(i);
                for (int i2 = 0; i2 < this.asInterface.size(); i2++) {
                    this.asInterface.get(i2).asInterface(view, i);
                }
                onTransact();
            }
        }
    }

    private void read(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.addOnContextAvailableListener != z) {
                this.addOnContextAvailableListener = z;
                if (this.onConnectionSuspended != null && (valueAnimator = this.createFullyDrawnExecutor) != null) {
                    if (valueAnimator.isRunning()) {
                        this.createFullyDrawnExecutor.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.createFullyDrawnExecutor.setFloatValues(new float[]{1.0f - f, f});
                    this.createFullyDrawnExecutor.start();
                }
            }
        }
    }

    private int RemoteActionCompatParcelizer() {
        int i;
        if (this.addOnNewIntentListener) {
            return Math.min(Math.max(this.getActivityResultRegistry, this.MediaBrowserCompat$ItemReceiver - ((this.addOnTrimMemoryListener * 9) / 16)), this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) + this.write;
        }
        if (this.Cancellable || this.AudioAttributesImplBaseParcelizer || (i = this.AudioAttributesImplApi21Parcelizer) <= 0) {
            return this.MediaBrowserCompat$SearchResultReceiver + this.write;
        }
        return Math.max(this.MediaBrowserCompat$SearchResultReceiver, i + this.ensureViewModelStore);
    }

    private void read() {
        int RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (this.read) {
            this.asBinder = Math.max(this.MediaBrowserCompat$ItemReceiver - RemoteActionCompatParcelizer2, this.AudioAttributesCompatParcelizer);
        } else {
            this.asBinder = this.MediaBrowserCompat$ItemReceiver - RemoteActionCompatParcelizer2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean read(View view, float f) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        if (view.getTop() < this.asBinder) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.asBinder)) / ((float) RemoteActionCompatParcelizer()) <= 0.5f) {
            return false;
        }
        return true;
    }

    private View RemoteActionCompatParcelizer(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(viewGroup.getChildAt(i));
            if (RemoteActionCompatParcelizer2 != null) {
                return RemoteActionCompatParcelizer2;
            }
        }
        return null;
    }

    private void onTransact(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.getLastCustomNonConfigurationInstance) {
            this.getFullyDrawnReporter = new setMenuInfo(setMenuInfo.read(context, attributeSet, R.attr.f1672130968674, MediaSessionCompat$QueueItem, new MenuItemImpl(0.0f)), (byte) 0);
            isActionButton isactionbutton = new isActionButton(this.getFullyDrawnReporter);
            this.onConnectionSuspended = isactionbutton;
            isactionbutton.read(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.onConnectionSuspended.setTint(typedValue.data);
                return;
            }
            isActionButton isactionbutton2 = this.onConnectionSuspended;
            if (isactionbutton2.Cancellable.asBinder != colorStateList) {
                isactionbutton2.Cancellable.asBinder = colorStateList;
                isactionbutton2.onStateChange(isactionbutton2.getState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void asInterface(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.asBinder;
        } else if (i == 6) {
            int i4 = this.AudioAttributesImplApi26Parcelizer;
            if (!this.read || i4 > (i3 = this.AudioAttributesCompatParcelizer)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = asBinder();
        } else if (!this.IconCompatParcelizer || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.MediaBrowserCompat$ItemReceiver;
        }
        RemoteActionCompatParcelizer(view, i, i2, false);
    }

    /* access modifiers changed from: package-private */
    public final void RemoteActionCompatParcelizer(View view, int i, int i2, boolean z) {
        ViewDragHelper viewDragHelper = this.RatingCompat;
        if (viewDragHelper != null && (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2) : viewDragHelper.settleCapturedViewAt(view.getLeft(), i2))) {
            RemoteActionCompatParcelizer(2);
            read(i);
            if (this.getLifecycle == null) {
                this.getLifecycle = new onTransact(view, i);
            }
            if (!this.getLifecycle.RemoteActionCompatParcelizer) {
                this.getLifecycle.onTransact = i;
                ViewCompat.postOnAnimation(view, this.getLifecycle);
                this.getLifecycle.RemoteActionCompatParcelizer = true;
                return;
            }
            this.getLifecycle.onTransact = i;
            return;
        }
        RemoteActionCompatParcelizer(i);
    }

    /* access modifiers changed from: package-private */
    public final void onTransact(int i) {
        View view = (View) this.MediaMetadataCompat.get();
        if (view != null && !this.asInterface.isEmpty()) {
            int i2 = this.asBinder;
            if (i <= i2 && i2 != asBinder()) {
                asBinder();
            }
            for (int i3 = 0; i3 < this.asInterface.size(); i3++) {
                this.asInterface.get(i3).onTransact(view);
            }
        }
    }

    class onTransact implements Runnable {
        boolean RemoteActionCompatParcelizer;
        private final View asBinder;
        int onTransact;

        onTransact(View view, int i) {
            this.asBinder = view;
            this.onTransact = i;
        }

        public final void run() {
            if (BottomSheetBehavior.this.RatingCompat == null || !BottomSheetBehavior.this.RatingCompat.continueSettling(true)) {
                BottomSheetBehavior.this.RemoteActionCompatParcelizer(this.onTransact);
            } else {
                ViewCompat.postOnAnimation(this.asBinder, this);
            }
            this.RemoteActionCompatParcelizer = false;
        }
    }

    public static class asInterface extends AbsSavedState {
        public static final Parcelable.Creator<asInterface> CREATOR = new Parcelable.ClassLoaderCreator<asInterface>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new asInterface(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new asInterface(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new asInterface[i];
            }
        };
        boolean RemoteActionCompatParcelizer;
        int asBinder;
        final int asInterface;
        boolean onTransact;
        boolean read;

        public asInterface(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.asInterface = parcel.readInt();
            this.asBinder = parcel.readInt();
            boolean z = false;
            this.read = parcel.readInt() == 1;
            this.onTransact = parcel.readInt() == 1;
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1 ? true : z;
        }

        public asInterface(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.asInterface = bottomSheetBehavior.MediaBrowserCompat$MediaItem;
            this.asBinder = bottomSheetBehavior.MediaBrowserCompat$SearchResultReceiver;
            this.read = bottomSheetBehavior.read;
            this.onTransact = bottomSheetBehavior.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = bottomSheetBehavior.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.asInterface);
            parcel.writeInt(this.asBinder);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeInt(this.onTransact ? 1 : 0);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        }
    }

    public static <V extends View> BottomSheetBehavior<V> asBinder(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        WeakReference<V> weakReference = this.MediaMetadataCompat;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.access$001 == null) {
                        this.access$001 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.MediaMetadataCompat.get() && z) {
                        this.access$001.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.access$001 = null;
                }
            }
        }
    }

    private void onTransact() {
        View view;
        WeakReference<V> weakReference = this.MediaMetadataCompat;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            int i = this.MediaSessionCompat$Token;
            if (i != -1) {
                ViewCompat.removeAccessibilityAction(view, i);
            }
            final int i2 = 6;
            if (!this.read && this.MediaBrowserCompat$MediaItem != 6) {
                this.MediaSessionCompat$Token = ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.f19522131820581), new AccessibilityViewCommand(6) {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
            }
            if (this.IconCompatParcelizer && this.MediaBrowserCompat$MediaItem != 5) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, (CharSequence) null, new AccessibilityViewCommand(5) {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
            }
            int i3 = this.MediaBrowserCompat$MediaItem;
            if (i3 == 3) {
                if (this.read) {
                    i2 = 4;
                }
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, (CharSequence) null, new AccessibilityViewCommand() {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
            } else if (i3 == 4) {
                if (this.read) {
                    i2 = 3;
                }
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, (CharSequence) null, new AccessibilityViewCommand() {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
            } else if (i3 == 6) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, (CharSequence) null, new AccessibilityViewCommand(4) {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, (CharSequence) null, new AccessibilityViewCommand(3) {
                    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                        BottomSheetBehavior.this.asInterface(i2);
                        return true;
                    }
                });
            }
        }
    }
}
