package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    AnimatorSet asInterface;

    /* access modifiers changed from: protected */
    public abstract AnimatorSet asBinder(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean onTransact(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.asInterface;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet asBinder = asBinder(view, view2, z, z3);
        this.asInterface = asBinder;
        asBinder.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.asInterface = null;
            }
        });
        this.asInterface.start();
        if (!z2) {
            this.asInterface.end();
        }
        return true;
    }
}
