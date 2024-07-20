package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import o.restoreActionViewStates;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    int read = 0;

    /* access modifiers changed from: protected */
    public abstract boolean onTransact(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final restoreActionViewStates restoreactionviewstates;
        if (!ViewCompat.isLaidOut(view)) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    restoreactionviewstates = null;
                    break;
                }
                View view2 = dependencies.get(i2);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    restoreactionviewstates = (restoreActionViewStates) view2;
                    break;
                }
                i2++;
            }
            if (restoreactionviewstates != null && asInterface(restoreactionviewstates.read())) {
                final int i3 = restoreactionviewstates.read() ? 1 : 2;
                this.read = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.read == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            restoreActionViewStates restoreactionviewstates = restoreactionviewstates;
                            expandableBehavior.onTransact((View) restoreactionviewstates, view, restoreactionviewstates.read(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        restoreActionViewStates restoreactionviewstates = (restoreActionViewStates) view2;
        if (!asInterface(restoreactionviewstates.read())) {
            return false;
        }
        this.read = restoreactionviewstates.read() ? 1 : 2;
        return onTransact((View) restoreactionviewstates, view, restoreactionviewstates.read(), true);
    }

    private boolean asInterface(boolean z) {
        if (z) {
            int i = this.read;
            return i == 0 || i == 2;
        } else if (this.read == 1) {
            return true;
        } else {
            return false;
        }
    }
}
