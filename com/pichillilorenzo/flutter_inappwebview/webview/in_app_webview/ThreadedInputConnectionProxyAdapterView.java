package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class ThreadedInputConnectionProxyAdapterView extends View {
    private InputConnection cachedConnection;
    final View containerView;
    final Handler imeHandler;
    private boolean isLocked = false;
    final View rootView;
    final View targetView;
    private boolean triggerDelayed = true;
    final IBinder windowToken;

    public final boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public final boolean hasWindowFocus() {
        return true;
    }

    public final boolean isFocused() {
        return true;
    }

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    ThreadedInputConnectionProxyAdapterView(View view, View view2, Handler handler) {
        super(view.getContext());
        this.imeHandler = handler;
        this.containerView = view;
        this.targetView = view2;
        this.windowToken = view.getWindowToken();
        this.rootView = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean isTriggerDelayed() {
        return this.triggerDelayed;
    }

    /* access modifiers changed from: package-private */
    public final void setLocked(boolean z) {
        this.isLocked = z;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.triggerDelayed = false;
        InputConnection onCreateInputConnection = this.isLocked ? this.cachedConnection : this.targetView.onCreateInputConnection(editorInfo);
        this.triggerDelayed = true;
        this.cachedConnection = onCreateInputConnection;
        return onCreateInputConnection;
    }

    public final View getRootView() {
        return this.rootView;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final Handler getHandler() {
        return this.imeHandler;
    }
}
