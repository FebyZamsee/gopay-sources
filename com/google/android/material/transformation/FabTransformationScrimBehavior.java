package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o.ActivityResultContracts;
import o.findInsertIndex;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final findInsertIndex RemoteActionCompatParcelizer = new findInsertIndex(75);
    private final findInsertIndex asBinder = new findInsertIndex(0);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet asBinder(View view, final View view2, final boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        findInsertIndex findinsertindex = z ? this.RemoteActionCompatParcelizer : this.asBinder;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        findinsertindex.read(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        ActivityResultContracts.TakePicture.asBinder(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }
        });
        return animatorSet;
    }
}
