package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

public class InputAwareWebView extends WebView {
    private static final String LOG_TAG = "InputAwareWebView";
    public View containerView;
    private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
    private View threadedInputConnectionProxyView;
    private boolean useHybridComposition;

    public InputAwareWebView(Context context, View view, Boolean bool) {
        super(context);
        boolean z = false;
        this.useHybridComposition = false;
        this.containerView = view;
        this.useHybridComposition = bool != null ? bool.booleanValue() : z;
    }

    public InputAwareWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.useHybridComposition = false;
        this.containerView = null;
    }

    public InputAwareWebView(Context context) {
        super(context);
        this.useHybridComposition = false;
        this.containerView = null;
    }

    public InputAwareWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.useHybridComposition = false;
        this.containerView = null;
    }

    public void setContainerView(View view) {
        this.containerView = view;
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null && view != null) {
            setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
        }
    }

    public void lockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null) {
            threadedInputConnectionProxyAdapterView.setLocked(true);
        }
    }

    public void unlockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null) {
            threadedInputConnectionProxyAdapterView.setLocked(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        if (!this.useHybridComposition) {
            resetInputConnection();
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (this.useHybridComposition) {
            return super.checkInputConnectionProxy(view);
        }
        View view2 = this.threadedInputConnectionProxyView;
        this.threadedInputConnectionProxyView = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.containerView;
        if (view3 == null) {
            return super.checkInputConnectionProxy(view);
        }
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = new ThreadedInputConnectionProxyAdapterView(view3, view, view.getHandler());
        this.proxyAdapterView = threadedInputConnectionProxyAdapterView;
        setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        if (!this.useHybridComposition) {
            resetInputConnection();
        }
    }

    private void resetInputConnection() {
        View view;
        if (this.proxyAdapterView != null && (view = this.containerView) != null) {
            setInputConnectionTarget(view);
        }
    }

    private void setInputConnectionTarget(final View view) {
        if (this.containerView != null) {
            view.requestFocus();
            this.containerView.post(new Runnable() {
                public void run() {
                    if (InputAwareWebView.this.containerView != null) {
                        InputMethodManager inputMethodManager = (InputMethodManager) InputAwareWebView.this.getContext().getSystemService("input_method");
                        view.onWindowFocusChanged(true);
                        if (Build.VERSION.SDK_INT < 29) {
                            inputMethodManager.isActive(InputAwareWebView.this.containerView);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.useHybridComposition) {
            super.onFocusChanged(z, i, rect);
        } else if (Build.VERSION.SDK_INT >= 28 || !isCalledFromListPopupWindowShow() || z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    private boolean isCalledFromListPopupWindowShow() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }
}
