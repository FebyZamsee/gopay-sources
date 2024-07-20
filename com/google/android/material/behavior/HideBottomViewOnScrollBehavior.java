package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.createIntent;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public int asBinder = 0;
    public int asInterface = 0;
    public int onTransact = 2;
    ViewPropertyAnimator read;

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.asBinder = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    private void asInterface(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.read = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.read = null;
            }
        });
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.onTransact != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.read;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.onTransact = 1;
                asInterface(v, this.asBinder + this.asInterface, 175, createIntent.activity_release.asBinder.asInterface);
            }
        } else if (i2 < 0 && this.onTransact != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.read;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.onTransact = 2;
            asInterface(v, 0, 225, createIntent.activity_release.asBinder.read);
        }
    }
}
