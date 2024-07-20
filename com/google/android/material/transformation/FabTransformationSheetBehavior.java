package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.gojek.gopay.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import o.getOrdering;
import o.setHeaderInternal;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> RemoteActionCompatParcelizer;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final FabTransformationBehavior.onTransact asBinder(Context context, boolean z) {
        int i = z ? R.animator.f742130837529 : R.animator.f732130837528;
        FabTransformationBehavior.onTransact ontransact = new FabTransformationBehavior.onTransact();
        ontransact.RemoteActionCompatParcelizer = getOrdering.read(context, i);
        ontransact.read = new setHeaderInternal();
        return ontransact;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.RemoteActionCompatParcelizer = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.RemoteActionCompatParcelizer;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.RemoteActionCompatParcelizer.get(childAt).intValue());
                        }
                    } else {
                        this.RemoteActionCompatParcelizer.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.RemoteActionCompatParcelizer = null;
            }
        }
        return super.onTransact(view, view2, z, z2);
    }
}
