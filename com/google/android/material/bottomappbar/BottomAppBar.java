package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.R;
import o.TooltipCompatHandler;
import o.addIntentOptions;
import o.clearAll;
import o.isActionButton;
import o.onBackInvoked;
import o.setCurrentMenuInfo;
import o.setGroupEnabled;
import o.setMenuInfo;
import o.setQwertyMode;
import o.setSubMenu;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    private static final int MediaBrowserCompat$MediaItem = 2131886708;
    boolean AudioAttributesCompatParcelizer;
    addIntentOptions<FloatingActionButton> AudioAttributesImplApi21Parcelizer;
    boolean AudioAttributesImplApi26Parcelizer;
    final boolean AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    private ArrayList<RemoteActionCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    int MediaBrowserCompat$SearchResultReceiver;
    private Behavior MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    int MediaDescriptionCompat;
    private int MediaSessionCompat$ResultReceiverWrapper;
    int RemoteActionCompatParcelizer;
    boolean asBinder;
    AnimatorListenerAdapter asInterface;
    final boolean onConnected;
    Animator onConnectionFailed;
    Animator onConnectionSuspended;
    final int onTransact;
    int read;
    final boolean setInternalConnectionCallback;
    final isActionButton write;

    public interface RemoteActionCompatParcelizer {
        Object read(String str, R.id idVar, setSubMenu.read read, TooltipCompatHandler<? super onBackInvoked> tooltipCompatHandler);
    }

    public final void setSubtitle(CharSequence charSequence) {
    }

    public final void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.gojek.gopay.R.attr.f1652130968671);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = MediaBrowserCompat$MediaItem
            android.content.Context r13 = o.ActivityResultContracts.TakePicture.asBinder.read(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            o.isActionButton r13 = new o.isActionButton
            r13.<init>()
            r12.write = r13
            r7 = 0
            r12.MediaBrowserCompat$ItemReceiver = r7
            r12.MediaDescriptionCompat = r7
            r12.AudioAttributesImplApi26Parcelizer = r7
            r8 = 1
            r12.asBinder = r8
            com.google.android.material.bottomappbar.BottomAppBar$2 r0 = new com.google.android.material.bottomappbar.BottomAppBar$2
            r0.<init>()
            r12.asInterface = r0
            com.google.android.material.bottomappbar.BottomAppBar$4 r0 = new com.google.android.material.bottomappbar.BottomAppBar$4
            r0.<init>()
            r12.AudioAttributesImplApi21Parcelizer = r0
            android.content.Context r9 = r12.getContext()
            int[] r10 = o.dispatchRestoreInstanceState.onConnected.read
            int[] r5 = new int[r7]
            o.ActivityResultContracts.PickContact.asInterface(r9, r14, r15, r6)
            r0 = r9
            r1 = r14
            r2 = r10
            r3 = r15
            r4 = r6
            o.ActivityResultContracts.PickContact.read(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r14, r10, r15, r6)
            android.content.res.ColorStateList r1 = o.setOnBackInvokedDispatcher.asInterface((android.content.Context) r9, (android.content.res.TypedArray) r0, (int) r7)
            int r2 = r0.getDimensionPixelSize(r8, r7)
            r3 = 4
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            r4 = 5
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            r5 = 6
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            r10 = 2
            int r11 = r0.getInt(r10, r7)
            r12.read = r11
            r11 = 3
            int r11 = r0.getInt(r11, r7)
            r12.MediaSessionCompat$ResultReceiverWrapper = r11
            r11 = 7
            boolean r11 = r0.getBoolean(r11, r7)
            r12.AudioAttributesCompatParcelizer = r11
            r11 = 8
            boolean r11 = r0.getBoolean(r11, r7)
            r12.AudioAttributesImplBaseParcelizer = r11
            r11 = 9
            boolean r11 = r0.getBoolean(r11, r7)
            r12.setInternalConnectionCallback = r11
            r11 = 10
            boolean r11 = r0.getBoolean(r11, r7)
            r12.onConnected = r11
            r0.recycle()
            android.content.res.Resources r0 = r12.getResources()
            r11 = 2131165395(0x7f0700d3, float:1.7945006E38)
            int r0 = r0.getDimensionPixelOffset(r11)
            r12.onTransact = r0
            o.clearAll r0 = new o.clearAll
            r0.<init>(r3, r4, r5)
            o.setMenuInfo$RemoteActionCompatParcelizer r3 = new o.setMenuInfo$RemoteActionCompatParcelizer
            r3.<init>()
            r3.AudioAttributesCompatParcelizer = r0
            o.setMenuInfo r0 = new o.setMenuInfo
            r0.<init>(r3, r7)
            r13.setShapeAppearanceModel(r0)
            o.isActionButton$onTransact r0 = r13.Cancellable
            int r0 = r0.onConnectionFailed
            if (r0 == r10) goto L_0x00b7
            o.isActionButton$onTransact r0 = r13.Cancellable
            r0.onConnectionFailed = r10
            r13.RemoteActionCompatParcelizer()
        L_0x00b7:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            o.isActionButton$onTransact r3 = r13.Cancellable
            r3.AudioAttributesImplApi21Parcelizer = r0
            r13.RemoteActionCompatParcelizer()
            r13.read((android.content.Context) r9)
            float r0 = (float) r2
            r12.setElevation(r0)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r13, r1)
            androidx.core.view.ViewCompat.setBackground(r12, r13)
            com.google.android.material.bottomappbar.BottomAppBar$3 r13 = new com.google.android.material.bottomappbar.BottomAppBar$3
            r13.<init>()
            android.content.Context r0 = r12.getContext()
            int[] r1 = o.dispatchRestoreInstanceState.onConnected.onConnected
            android.content.res.TypedArray r14 = r0.obtainStyledAttributes(r14, r1, r15, r6)
            boolean r15 = r14.getBoolean(r7, r7)
            boolean r0 = r14.getBoolean(r8, r7)
            boolean r1 = r14.getBoolean(r10, r7)
            r14.recycle()
            o.setQwertyMode$5 r14 = new o.setQwertyMode$5
            r14.<init>(r15, r0, r1, r13)
            o.setQwertyMode.RemoteActionCompatParcelizer(r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setFabAlignmentModeAndReplaceMenu(final int r6, int r7) {
        /*
            r5 = this;
            r5.MediaDescriptionCompat = r7
            r7 = 1
            r5.AudioAttributesImplApi26Parcelizer = r7
            boolean r0 = r5.asBinder
            r5.onTransact(r6, r0)
            int r0 = r5.read
            if (r0 == r6) goto L_0x00a6
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r5)
            if (r0 == 0) goto L_0x00a6
            android.animation.Animator r0 = r5.onConnectionFailed
            if (r0 == 0) goto L_0x001b
            r0.cancel()
        L_0x001b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.MediaSessionCompat$ResultReceiverWrapper
            r2 = 0
            if (r1 != r7) goto L_0x0048
            android.view.View r1 = r5.read()
            boolean r3 = r1 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 == 0) goto L_0x0030
            r2 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
        L_0x0030:
            float[] r7 = new float[r7]
            r1 = 0
            float r3 = r5.onTransact(r6)
            r7[r1] = r3
            java.lang.String r1 = "translationX"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r1, r7)
            r1 = 300(0x12c, double:1.48E-321)
            r7.setDuration(r1)
            r0.add(r7)
            goto L_0x008f
        L_0x0048:
            android.view.View r1 = r5.read()
            boolean r3 = r1 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 == 0) goto L_0x0053
            r2 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
        L_0x0053:
            if (r2 == 0) goto L_0x008f
            o.setGroupEnabled r1 = r2.onTransact
            if (r1 != 0) goto L_0x0065
            o.setCurrentMenuInfo r1 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r3 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r3.<init>()
            r1.<init>(r2, r3)
            r2.onTransact = r1
        L_0x0065:
            o.setGroupEnabled r1 = r2.onTransact
            boolean r1 = r1.RemoteActionCompatParcelizer()
            if (r1 != 0) goto L_0x008f
            r5.asInterface()
            com.google.android.material.bottomappbar.BottomAppBar$1 r1 = new com.google.android.material.bottomappbar.BottomAppBar$1
            r1.<init>(r6)
            o.setGroupEnabled r3 = r2.onTransact
            if (r3 != 0) goto L_0x0085
            o.setCurrentMenuInfo r3 = new o.setCurrentMenuInfo
            com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer r4 = new com.google.android.material.floatingactionbutton.FloatingActionButton$RemoteActionCompatParcelizer
            r4.<init>()
            r3.<init>(r2, r4)
            r2.onTransact = r3
        L_0x0085:
            o.setGroupEnabled r3 = r2.onTransact
            com.google.android.material.floatingactionbutton.FloatingActionButton$1 r4 = new com.google.android.material.floatingactionbutton.FloatingActionButton$1
            r4.<init>(r1)
            r3.RemoteActionCompatParcelizer(r4, r7)
        L_0x008f:
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r7.playTogether(r0)
            r5.onConnectionFailed = r7
            com.google.android.material.bottomappbar.BottomAppBar$5 r0 = new com.google.android.material.bottomappbar.BottomAppBar$5
            r0.<init>()
            r7.addListener(r0)
            android.animation.Animator r7 = r5.onConnectionFailed
            r7.start()
        L_0x00a6:
            r5.read = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setFabAlignmentModeAndReplaceMenu(int, int):void");
    }

    public final void setFabAnimationMode(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.write, colorStateList);
    }

    public final void setHideOnScroll(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final void setElevation(float f) {
        this.write.onConnected(f);
        int i = this.write.Cancellable.setInternalConnectionCallback;
        isActionButton isactionbutton = this.write;
        int cos = (int) (((double) isactionbutton.Cancellable.onConnected) * Math.cos(Math.toRadians((double) isactionbutton.Cancellable.onConnectionSuspended)));
        if (this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new Behavior();
        }
        Behavior behavior = this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        int i2 = i - cos;
        behavior.asInterface = i2;
        if (behavior.onTransact == 1) {
            setTranslationY((float) (behavior.asBinder + i2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void asInterface() {
        ArrayList<RemoteActionCompatParcelizer> arrayList;
        int i = this.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = i + 1;
        if (i == 0 && (arrayList = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            Iterator<RemoteActionCompatParcelizer> it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer next = it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View read() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.read():android.view.View");
    }

    /* access modifiers changed from: package-private */
    public final void onTransact(final int i, final boolean z) {
        if (!ViewCompat.isLaidOut(this)) {
            this.AudioAttributesImplApi26Parcelizer = false;
            int i2 = this.MediaDescriptionCompat;
            if (i2 != 0) {
                this.MediaDescriptionCompat = 0;
                getMenu().clear();
                inflateMenu(i2);
                return;
            }
            return;
        }
        Animator animator = this.onConnectionSuspended;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!AudioAttributesImplApi21Parcelizer()) {
            i = 0;
            z = false;
        }
        final ActionMenuView onTransact2 = onTransact();
        if (onTransact2 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(onTransact2, "alpha", new float[]{1.0f});
            if (Math.abs(onTransact2.getTranslationX() - ((float) asBinder(onTransact2, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(onTransact2, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    private boolean onTransact;

                    public final void onAnimationCancel(Animator animator) {
                        this.onTransact = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!this.onTransact) {
                            boolean z = BottomAppBar.this.MediaDescriptionCompat != 0;
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            int i = bottomAppBar.MediaDescriptionCompat;
                            if (i != 0) {
                                bottomAppBar.MediaDescriptionCompat = 0;
                                bottomAppBar.getMenu().clear();
                                bottomAppBar.inflateMenu(i);
                            }
                            BottomAppBar bottomAppBar2 = BottomAppBar.this;
                            ActionMenuView actionMenuView = onTransact2;
                            AnonymousClass6 r4 = new Runnable(actionMenuView, i, z) {
                                public final void run() {
                                    ActionMenuView actionMenuView = r0;
                                    actionMenuView.setTranslationX((float) BottomAppBar.this.asBinder(actionMenuView, r1, r2));
                                }
                            };
                            if (z) {
                                actionMenuView.post(r4);
                            } else {
                                r4.run();
                            }
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                arrayList.add(animatorSet);
            } else if (onTransact2.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.onConnectionSuspended = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BottomAppBar.this.asInterface();
            }

            public final void onAnimationEnd(Animator animator) {
                BottomAppBar.RemoteActionCompatParcelizer(BottomAppBar.this);
                BottomAppBar.this.AudioAttributesImplApi26Parcelizer = false;
                BottomAppBar.this.onConnectionSuspended = null;
            }
        });
        this.onConnectionSuspended.start();
    }

    private ActionMenuView onTransact() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.onConnectionSuspended;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.onConnectionFailed;
            if (animator2 != null) {
                animator2.cancel();
            }
            RemoteActionCompatParcelizer();
        }
        asBinder();
    }

    /* access modifiers changed from: package-private */
    public final void asBinder() {
        final ActionMenuView onTransact2 = onTransact();
        if (onTransact2 != null && this.onConnectionSuspended == null) {
            onTransact2.setAlpha(1.0f);
            if (!AudioAttributesImplApi21Parcelizer()) {
                new Runnable(0, false) {
                    public final void run() {
                        ActionMenuView actionMenuView = onTransact2;
                        actionMenuView.setTranslationX((float) BottomAppBar.this.asBinder(actionMenuView, r1, r2));
                    }
                }.run();
                return;
            }
            final int i = this.read;
            final boolean z = this.asBinder;
            new Runnable() {
                public final void run() {
                    ActionMenuView actionMenuView = onTransact2;
                    actionMenuView.setTranslationX((float) BottomAppBar.this.asBinder(actionMenuView, i, z));
                }
            }.run();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        isActionButton isactionbutton = this.write;
        if (isactionbutton.Cancellable.RemoteActionCompatParcelizer != null && isactionbutton.Cancellable.RemoteActionCompatParcelizer.asInterface) {
            isactionbutton.onConnectionSuspended(setQwertyMode.asInterface(this));
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        WeakReference<BottomAppBar> AudioAttributesCompatParcelizer;
        private final View.OnLayoutChangeListener AudioAttributesImplApi26Parcelizer = new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.AudioAttributesCompatParcelizer.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.RemoteActionCompatParcelizer;
                boolean z = false;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.read(rect);
                int height = Behavior.this.RemoteActionCompatParcelizer.height();
                float f = (float) height;
                if (f != ((clearAll) bottomAppBar.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).asBinder) {
                    ((clearAll) bottomAppBar.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).asBinder = f;
                    bottomAppBar.write.invalidateSelf();
                }
                if (floatingActionButton.onTransact == null) {
                    floatingActionButton.onTransact = new setCurrentMenuInfo(floatingActionButton, new FloatingActionButton.RemoteActionCompatParcelizer());
                }
                float asInterface2 = ((setMenuInfo) Preconditions.checkNotNull(floatingActionButton.onTransact.MediaMetadataCompat)).onConnectionFailed.asInterface(new RectF(Behavior.this.RemoteActionCompatParcelizer));
                if (asInterface2 != ((clearAll) bottomAppBar.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).asInterface) {
                    ((clearAll) bottomAppBar.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).asInterface = asInterface2;
                    bottomAppBar.write.invalidateSelf();
                }
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (Behavior.this.write == 0) {
                    layoutParams.bottomMargin = bottomAppBar.RemoteActionCompatParcelizer + (bottomAppBar.getResources().getDimensionPixelOffset(com.gojek.gopay.R.dimen.f11632131165396) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    layoutParams.leftMargin = bottomAppBar.IconCompatParcelizer;
                    layoutParams.rightMargin = bottomAppBar.MediaBrowserCompat$SearchResultReceiver;
                    if (ViewCompat.getLayoutDirection(floatingActionButton) == 1) {
                        z = true;
                    }
                    if (z) {
                        layoutParams.leftMargin += bottomAppBar.onTransact;
                    } else {
                        layoutParams.rightMargin += bottomAppBar.onTransact;
                    }
                }
            }
        };
        final Rect RemoteActionCompatParcelizer = new Rect();
        int write;

        public /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.AudioAttributesCompatParcelizer = new WeakReference<>(bottomAppBar);
            View read = bottomAppBar.read();
            if (read != null && !ViewCompat.isLaidOut(read)) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) read.getLayoutParams();
                layoutParams.anchorGravity = 49;
                this.write = layoutParams.bottomMargin;
                if (read instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) read;
                    floatingActionButton.addOnLayoutChangeListener(this.AudioAttributesImplApi26Parcelizer);
                    AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.asInterface;
                    if (floatingActionButton.onTransact == null) {
                        floatingActionButton.onTransact = new setCurrentMenuInfo(floatingActionButton, new FloatingActionButton.RemoteActionCompatParcelizer());
                    }
                    setGroupEnabled setgroupenabled = floatingActionButton.onTransact;
                    if (setgroupenabled.AudioAttributesImplBaseParcelizer == null) {
                        setgroupenabled.AudioAttributesImplBaseParcelizer = new ArrayList<>();
                    }
                    setgroupenabled.AudioAttributesImplBaseParcelizer.add(animatorListenerAdapter);
                    AnonymousClass10 r1 = new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            BottomAppBar.this.asInterface.onAnimationStart(animator);
                            View read2 = BottomAppBar.this.read();
                            FloatingActionButton floatingActionButton = read2 instanceof FloatingActionButton ? (FloatingActionButton) read2 : null;
                            if (floatingActionButton != null) {
                                BottomAppBar bottomAppBar = BottomAppBar.this;
                                floatingActionButton.setTranslationX(bottomAppBar.onTransact(bottomAppBar.read));
                            }
                        }
                    };
                    if (floatingActionButton.onTransact == null) {
                        floatingActionButton.onTransact = new setCurrentMenuInfo(floatingActionButton, new FloatingActionButton.RemoteActionCompatParcelizer());
                    }
                    setGroupEnabled setgroupenabled2 = floatingActionButton.onTransact;
                    if (setgroupenabled2.PlaybackStateCompat$CustomAction == null) {
                        setgroupenabled2.PlaybackStateCompat$CustomAction = new ArrayList<>();
                    }
                    setgroupenabled2.PlaybackStateCompat$CustomAction.add(r1);
                    addIntentOptions<FloatingActionButton> addintentoptions = bottomAppBar.AudioAttributesImplApi21Parcelizer;
                    if (floatingActionButton.onTransact == null) {
                        floatingActionButton.onTransact = new setCurrentMenuInfo(floatingActionButton, new FloatingActionButton.RemoteActionCompatParcelizer());
                    }
                    setGroupEnabled setgroupenabled3 = floatingActionButton.onTransact;
                    FloatingActionButton.read read2 = new FloatingActionButton.read(addintentoptions);
                    if (setgroupenabled3.Cancellable == null) {
                        setgroupenabled3.Cancellable = new ArrayList<>();
                    }
                    setgroupenabled3.Cancellable.add(read2);
                }
                bottomAppBar.RemoteActionCompatParcelizer();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.AudioAttributesCompatParcelizer && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public final Parcelable onSaveInstanceState() {
        onTransact ontransact = new onTransact(super.onSaveInstanceState());
        ontransact.onTransact = this.read;
        ontransact.asBinder = this.asBinder;
        return ontransact;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof onTransact)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        onTransact ontransact = (onTransact) parcelable;
        super.onRestoreInstanceState(ontransact.getSuperState());
        this.read = ontransact.onTransact;
        this.asBinder = ontransact.asBinder;
    }

    static class onTransact extends AbsSavedState {
        public static final Parcelable.Creator<onTransact> CREATOR = new Parcelable.ClassLoaderCreator<onTransact>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new onTransact(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new onTransact(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new onTransact[i];
            }
        };
        boolean asBinder;
        int onTransact;

        public onTransact(Parcelable parcelable) {
            super(parcelable);
        }

        public onTransact(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.onTransact = parcel.readInt();
            this.asBinder = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.onTransact);
            parcel.writeInt(this.asBinder ? 1 : 0);
        }
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(BottomAppBar bottomAppBar) {
        ArrayList<RemoteActionCompatParcelizer> arrayList;
        int i = bottomAppBar.MediaBrowserCompat$ItemReceiver - 1;
        bottomAppBar.MediaBrowserCompat$ItemReceiver = i;
        if (i == 0 && (arrayList = bottomAppBar.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            Iterator<RemoteActionCompatParcelizer> it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer next = it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final float onTransact(int i) {
        int i2 = 1;
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int i3 = z ? this.IconCompatParcelizer : this.MediaBrowserCompat$SearchResultReceiver;
        int i4 = this.onTransact;
        int measuredWidth = getMeasuredWidth() / 2;
        if (z) {
            i2 = -1;
        }
        return (float) ((measuredWidth - (i4 + i3)) * i2);
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        View read2 = read();
        FloatingActionButton floatingActionButton = read2 instanceof FloatingActionButton ? (FloatingActionButton) read2 : null;
        if (floatingActionButton != null) {
            if (floatingActionButton.onTransact == null) {
                floatingActionButton.onTransact = new setCurrentMenuInfo(floatingActionButton, new FloatingActionButton.RemoteActionCompatParcelizer());
            }
            if (floatingActionButton.onTransact.onTransact()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void RemoteActionCompatParcelizer() {
        ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).RemoteActionCompatParcelizer = onTransact(this.read);
        View read2 = read();
        isActionButton isactionbutton = this.write;
        float f = (!this.asBinder || !AudioAttributesImplApi21Parcelizer()) ? 0.0f : 1.0f;
        if (isactionbutton.Cancellable.IconCompatParcelizer != f) {
            isactionbutton.Cancellable.IconCompatParcelizer = f;
            isactionbutton.access$001 = true;
            isactionbutton.invalidateSelf();
        }
        if (read2 != null) {
            read2.setTranslationY(-((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).read);
            read2.setTranslationX(onTransact(this.read));
        }
    }

    /* access modifiers changed from: protected */
    public final int asBinder(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                if (z2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((z2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (z2 ? this.MediaBrowserCompat$SearchResultReceiver : -this.IconCompatParcelizer));
    }

    public final /* synthetic */ CoordinatorLayout.Behavior getBehavior() {
        if (this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new Behavior();
        }
        return this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).read) {
            clearAll clearall = (clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
            if (f >= 0.0f) {
                clearall.read = f;
                this.write.invalidateSelf();
                RemoteActionCompatParcelizer();
                return;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public final void setFabCradleMargin(float f) {
        if (f != ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).onTransact) {
            ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).onTransact = f;
            this.write.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).AudioAttributesImplApi26Parcelizer) {
            ((clearAll) this.write.Cancellable.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer).AudioAttributesImplApi26Parcelizer = f;
            this.write.invalidateSelf();
        }
    }
}
