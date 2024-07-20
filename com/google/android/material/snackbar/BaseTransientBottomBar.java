package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import o.createIntent;
import o.setState;
import o.setSubMenu;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler onTransact = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).asBinder();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).asBinder(message.arg1);
                return true;
            }
        }
    });
    private final Runnable AudioAttributesCompatParcelizer;
    private List<asBinder<B>> AudioAttributesImplApi21Parcelizer;
    private final AccessibilityManager AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private View IconCompatParcelizer;
    private Rect MediaBrowserCompat$ItemReceiver;
    private final ViewGroup MediaDescriptionCompat;
    final setState RemoteActionCompatParcelizer;
    int asBinder;
    setSubMenu.read asInterface;
    private int onConnected;
    private int onConnectionFailed;
    private int onConnectionSuspended;
    protected final read read;
    private boolean setInternalConnectionCallback;
    private Behavior write;

    public interface RemoteActionCompatParcelizer {
        void asInterface();

        void read();
    }

    public static abstract class asBinder<B> {
    }

    public interface onTransact {
        void asBinder();
    }

    /* access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.read.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.MediaBrowserCompat$ItemReceiver) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + (this.IconCompatParcelizer != null ? this.onConnectionSuspended : this.AudioAttributesImplBaseParcelizer);
            marginLayoutParams.leftMargin = this.MediaBrowserCompat$ItemReceiver.left + this.onConnectionFailed;
            marginLayoutParams.rightMargin = this.MediaBrowserCompat$ItemReceiver.right + this.onConnected;
            this.read.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && asInterface()) {
                this.read.removeCallbacks(this.AudioAttributesCompatParcelizer);
                this.read.post(this.AudioAttributesCompatParcelizer);
            }
        }
    }

    private boolean asInterface() {
        if (this.asBinder > 0) {
            ViewGroup.LayoutParams layoutParams = this.read.getLayoutParams();
            if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void asBinder() {
        int i;
        this.read.read = new Object() {
            public final void read() {
                WindowInsets rootWindowInsets;
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.read.getRootWindowInsets()) != null) {
                    BaseTransientBottomBar.this.asBinder = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.AudioAttributesCompatParcelizer();
                }
            }

            public final void asInterface() {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                if (setSubMenu.read == null) {
                    setSubMenu.read = new setSubMenu();
                }
                if (setSubMenu.read.asBinder(baseTransientBottomBar.asInterface)) {
                    BaseTransientBottomBar.onTransact.post(this);
                }
            }

            public final void run() {
                BaseTransientBottomBar.this.onTransact();
            }
        };
        if (this.read.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.read.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                Behavior behavior = this.write;
                if (behavior == null) {
                    behavior = new Behavior();
                }
                if (behavior instanceof Behavior) {
                    behavior.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = this.asInterface;
                }
                behavior.onTransact = new SwipeDismissBehavior.asBinder() {
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
                    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onTransact(android.view.View r6) {
                        /*
                            r5 = this;
                            android.view.ViewParent r0 = r6.getParent()
                            if (r0 == 0) goto L_0x000b
                            r0 = 8
                            r6.setVisibility(r0)
                        L_0x000b:
                            com.google.android.material.snackbar.BaseTransientBottomBar r6 = com.google.android.material.snackbar.BaseTransientBottomBar.this
                            o.setSubMenu r0 = o.setSubMenu.read
                            if (r0 != 0) goto L_0x0018
                            o.setSubMenu r0 = new o.setSubMenu
                            r0.<init>()
                            o.setSubMenu.read = r0
                        L_0x0018:
                            o.setSubMenu r0 = o.setSubMenu.read
                            o.setSubMenu$read r6 = r6.asInterface
                            java.lang.Object r1 = r0.asInterface
                            monitor-enter(r1)
                            o.setSubMenu$RemoteActionCompatParcelizer r2 = r0.onTransact     // Catch:{ all -> 0x0075 }
                            r3 = 1
                            r4 = 0
                            if (r2 == 0) goto L_0x0036
                            if (r6 == 0) goto L_0x0031
                            java.lang.ref.WeakReference<o.setSubMenu$read> r2 = r2.asInterface     // Catch:{ all -> 0x0075 }
                            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0075 }
                            if (r2 != r6) goto L_0x0031
                            r2 = 1
                            goto L_0x0032
                        L_0x0031:
                            r2 = 0
                        L_0x0032:
                            if (r2 == 0) goto L_0x0036
                            r2 = 1
                            goto L_0x0037
                        L_0x0036:
                            r2 = 0
                        L_0x0037:
                            if (r2 == 0) goto L_0x004b
                            o.setSubMenu$RemoteActionCompatParcelizer r6 = r0.onTransact     // Catch:{ all -> 0x0075 }
                            java.lang.ref.WeakReference<o.setSubMenu$read> r2 = r6.asInterface     // Catch:{ all -> 0x0075 }
                            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0075 }
                            o.setSubMenu$read r2 = (o.setSubMenu.read) r2     // Catch:{ all -> 0x0075 }
                            if (r2 == 0) goto L_0x0073
                            android.os.Handler r0 = r0.asBinder     // Catch:{ all -> 0x0075 }
                            r0.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0075 }
                            goto L_0x0073
                        L_0x004b:
                            o.setSubMenu$RemoteActionCompatParcelizer r2 = r0.RemoteActionCompatParcelizer     // Catch:{ all -> 0x0075 }
                            if (r2 == 0) goto L_0x005f
                            if (r6 == 0) goto L_0x005b
                            java.lang.ref.WeakReference<o.setSubMenu$read> r2 = r2.asInterface     // Catch:{ all -> 0x0075 }
                            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0075 }
                            if (r2 != r6) goto L_0x005b
                            r6 = 1
                            goto L_0x005c
                        L_0x005b:
                            r6 = 0
                        L_0x005c:
                            if (r6 == 0) goto L_0x005f
                            goto L_0x0060
                        L_0x005f:
                            r3 = 0
                        L_0x0060:
                            if (r3 == 0) goto L_0x0073
                            o.setSubMenu$RemoteActionCompatParcelizer r6 = r0.RemoteActionCompatParcelizer     // Catch:{ all -> 0x0075 }
                            java.lang.ref.WeakReference<o.setSubMenu$read> r2 = r6.asInterface     // Catch:{ all -> 0x0075 }
                            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0075 }
                            o.setSubMenu$read r2 = (o.setSubMenu.read) r2     // Catch:{ all -> 0x0075 }
                            if (r2 == 0) goto L_0x0073
                            android.os.Handler r0 = r0.asBinder     // Catch:{ all -> 0x0075 }
                            r0.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0075 }
                        L_0x0073:
                            monitor-exit(r1)
                            return
                        L_0x0075:
                            r6 = move-exception
                            monitor-exit(r1)
                            throw r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass6.onTransact(android.view.View):void");
                    }

                    public final void asBinder(int i) {
                        if (i == 0) {
                            if (setSubMenu.read == null) {
                                setSubMenu.read = new setSubMenu();
                            }
                            setSubMenu.read.asInterface(BaseTransientBottomBar.this.asInterface);
                        } else if (i == 1 || i == 2) {
                            if (setSubMenu.read == null) {
                                setSubMenu.read = new setSubMenu();
                            }
                            setSubMenu.read.read(BaseTransientBottomBar.this.asInterface);
                        }
                    }
                };
                layoutParams2.setBehavior(behavior);
                if (this.IconCompatParcelizer == null) {
                    layoutParams2.insetEdge = 80;
                }
            }
            View view = this.IconCompatParcelizer;
            if (view == null) {
                i = 0;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i2 = iArr[1];
                int[] iArr2 = new int[2];
                this.MediaDescriptionCompat.getLocationOnScreen(iArr2);
                i = (iArr2[1] + this.MediaDescriptionCompat.getHeight()) - i2;
            }
            this.onConnectionSuspended = i;
            AudioAttributesCompatParcelizer();
            this.read.setVisibility(4);
            this.MediaDescriptionCompat.addView(this.read);
        }
        if (ViewCompat.isLaidOut(this.read)) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        this.read.asBinder = new onTransact() {
            public final void asBinder() {
                BaseTransientBottomBar.this.read.asBinder = null;
                BaseTransientBottomBar.this.AudioAttributesImplApi26Parcelizer();
            }
        };
    }

    /* access modifiers changed from: private */
    public void AudioAttributesImplApi26Parcelizer() {
        if (AudioAttributesImplApi21Parcelizer()) {
            this.read.post(new Runnable() {
                public final void run() {
                    if (BaseTransientBottomBar.this.read != null) {
                        if (BaseTransientBottomBar.this.read.getParent() != null) {
                            BaseTransientBottomBar.this.read.setVisibility(0);
                        }
                        int i = BaseTransientBottomBar.this.read.RemoteActionCompatParcelizer;
                        BaseTransientBottomBar.read(BaseTransientBottomBar.this);
                    }
                }
            });
            return;
        }
        if (this.read.getParent() != null) {
            this.read.setVisibility(0);
        }
        read();
    }

    private int RemoteActionCompatParcelizer() {
        int height = this.read.getHeight();
        ViewGroup.LayoutParams layoutParams = this.read.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    public final void asBinder(final int i) {
        if (!AudioAttributesImplApi21Parcelizer() || this.read.getVisibility() != 0) {
            onTransact();
            return;
        }
        int i2 = this.read.RemoteActionCompatParcelizer;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, RemoteActionCompatParcelizer()});
        valueAnimator.setInterpolator(createIntent.activity_release.asBinder.asBinder);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                setState setstate = BaseTransientBottomBar.this.RemoteActionCompatParcelizer;
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.onTransact();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            private int onTransact = 0;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.read.setTranslationY((float) intValue);
                this.onTransact = intValue;
            }
        });
        valueAnimator.start();
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        AccessibilityManager accessibilityManager = this.AudioAttributesImplApi26Parcelizer;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static class read extends FrameLayout {
        private static final View.OnTouchListener onTransact = new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        private PorterDuff.Mode AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        onTransact asBinder;
        private ColorStateList asInterface;
        RemoteActionCompatParcelizer read;

        public final void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public final void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.asInterface == null)) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.asInterface);
                DrawableCompat.setTintMode(drawable, this.AudioAttributesCompatParcelizer);
            }
            super.setBackgroundDrawable(drawable);
        }

        public final void setBackgroundTintList(ColorStateList colorStateList) {
            this.asInterface = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.AudioAttributesCompatParcelizer);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        public final void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.AudioAttributesCompatParcelizer = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        public final void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : onTransact);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            onTransact ontransact = this.asBinder;
            if (ontransact != null) {
                ontransact.asBinder();
            }
        }

        /* access modifiers changed from: protected */
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.read();
            }
            ViewCompat.requestApplyInsets(this);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.asInterface();
            }
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        final asInterface AudioAttributesCompatParcelizer = new asInterface(this);

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            asInterface asinterface = this.AudioAttributesCompatParcelizer;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (setSubMenu.read == null) {
                        setSubMenu.read = new setSubMenu();
                    }
                    setSubMenu.read.asInterface(asinterface.RemoteActionCompatParcelizer);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (setSubMenu.read == null) {
                    setSubMenu.read = new setSubMenu();
                }
                setSubMenu.read.read(asinterface.RemoteActionCompatParcelizer);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public final boolean RemoteActionCompatParcelizer(View view) {
            return view instanceof read;
        }
    }

    public static class asInterface {
        setSubMenu.read RemoteActionCompatParcelizer;

        public asInterface(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.RemoteActionCompatParcelizer = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.read = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.asInterface = 0;
        }
    }

    static /* synthetic */ void read(BaseTransientBottomBar baseTransientBottomBar) {
        int RemoteActionCompatParcelizer2 = baseTransientBottomBar.RemoteActionCompatParcelizer();
        baseTransientBottomBar.read.setTranslationY((float) RemoteActionCompatParcelizer2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{RemoteActionCompatParcelizer2, 0});
        valueAnimator.setInterpolator(createIntent.activity_release.asBinder.asBinder);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                setState setstate = BaseTransientBottomBar.this.RemoteActionCompatParcelizer;
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.read();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(RemoteActionCompatParcelizer2) {
            private int asBinder;
            private /* synthetic */ int onTransact;

            {
                this.onTransact = r2;
                this.asBinder = r2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.read.setTranslationY((float) intValue);
                this.asBinder = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    public final void onTransact() {
        if (setSubMenu.read == null) {
            setSubMenu.read = new setSubMenu();
        }
        setSubMenu.read.onTransact(this.asInterface);
        List<asBinder<B>> list = this.AudioAttributesImplApi21Parcelizer;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                asBinder asbinder = this.AudioAttributesImplApi21Parcelizer.get(size);
            }
        }
        ViewParent parent = this.read.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.read);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        if (setSubMenu.read == null) {
            setSubMenu.read = new setSubMenu();
        }
        setSubMenu setsubmenu = setSubMenu.read;
        setSubMenu.read read2 = this.asInterface;
        synchronized (setsubmenu.asInterface) {
            setSubMenu.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setsubmenu.onTransact;
            boolean z = false;
            if (remoteActionCompatParcelizer != null) {
                if (read2 != null && remoteActionCompatParcelizer.asInterface.get() == read2) {
                    z = true;
                }
            }
            if (z) {
                setsubmenu.RemoteActionCompatParcelizer(setsubmenu.onTransact);
            }
        }
        List<asBinder<B>> list = this.AudioAttributesImplApi21Parcelizer;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                asBinder asbinder = this.AudioAttributesImplApi21Parcelizer.get(size);
            }
        }
    }
}
