package com.google.firebase.perf.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    public static void registerForNextDraw(View view, Runnable runnable) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || isAliveAndAttached(view)) {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(View view) {
                    view.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
                    view.removeOnAttachStateChangeListener(this);
                }

                public void onViewDetachedFromWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    private FirstDrawDoneListener(View view, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view);
        this.callback = runnable;
    }

    public void onDraw() {
        View andSet = this.viewReference.getAndSet((Object) null);
        if (andSet != null) {
            andSet.getViewTreeObserver().addOnGlobalLayoutListener(new FirstDrawDoneListener$$ExternalSyntheticLambda0(this, andSet));
            this.mainThreadHandler.postAtFrontOfQueue(this.callback);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onDraw$0$com-google-firebase-perf-util-FirstDrawDoneListener  reason: not valid java name */
    public /* synthetic */ void m74lambda$onDraw$0$comgooglefirebaseperfutilFirstDrawDoneListener(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    private static boolean isAliveAndAttached(View view) {
        return view.getViewTreeObserver().isAlive() && isAttachedToWindow(view);
    }

    private static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }
}
