package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public class HeadlessInAppWebView implements Disposable {
    protected static final String LOG_TAG = "HeadlessInAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_headless_inappwebview_";
    public HeadlessWebViewChannelDelegate channelDelegate;
    public FlutterWebView flutterWebView;
    public final String id;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView2) {
        this.id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.flutterWebView = flutterWebView2;
        BinaryMessenger binaryMessenger = inAppWebViewFlutterPlugin.messenger;
        StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
        sb.append(str);
        this.channelDelegate = new HeadlessWebViewChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
    }

    public void onWebViewCreated() {
        HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
        if (headlessWebViewChannelDelegate != null) {
            headlessWebViewChannelDelegate.onWebViewCreated();
        }
    }

    public void prepare(Map<String, Object> map) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        View view;
        View view2;
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (!(flutterWebView3 == null || (view2 = flutterWebView3.getView()) == null)) {
            Size2D fromMap = Size2D.fromMap((Map) map.get("initialSize"));
            if (fromMap == null) {
                fromMap = new Size2D(-1.0d, -1.0d);
            }
            setSize(fromMap);
            view2.setVisibility(4);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null && (viewGroup = (ViewGroup) this.plugin.activity.findViewById(16908290)) != null && (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) != null && (flutterWebView2 = this.flutterWebView) != null && (view = flutterWebView2.getView()) != null) {
            viewGroup2.addView(view, 0);
        }
    }

    public void setSize(Size2D size2D) {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null && flutterWebView2.webView != null && (view = this.flutterWebView.getView()) != null) {
            float pixelDensity = Util.getPixelDensity(view.getContext());
            Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams((int) (size2D.getWidth() == -1.0d ? fullscreenSize.getWidth() : size2D.getWidth() * ((double) pixelDensity)), (int) (size2D.getWidth() == -1.0d ? fullscreenSize.getHeight() : ((double) pixelDensity) * size2D.getHeight())));
        }
    }

    public Size2D getSize() {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 == null || flutterWebView2.webView == null || (view = this.flutterWebView.getView()) == null) {
            return null;
        }
        float pixelDensity = Util.getPixelDensity(view.getContext());
        Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = layoutParams.width;
        double d = fullscreenSize.getWidth() == ((double) layoutParams.width) ? (double) i : (double) (((float) i) / pixelDensity);
        int i2 = layoutParams.height;
        return new Size2D(d, fullscreenSize.getHeight() == ((double) layoutParams.height) ? (double) i2 : (double) (((float) i2) / pixelDensity));
    }

    public FlutterWebView disposeAndGetFlutterWebView() {
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null) {
            View view = flutterWebView2.getView();
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            this.flutterWebView = null;
            dispose();
        }
        return flutterWebView2;
    }

    public void dispose() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
        if (headlessWebViewChannelDelegate != null) {
            headlessWebViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            HeadlessInAppWebViewManager headlessInAppWebViewManager = inAppWebViewFlutterPlugin.headlessInAppWebViewManager;
            if (headlessInAppWebViewManager != null && headlessInAppWebViewManager.webViews.containsKey(this.id)) {
                headlessInAppWebViewManager.webViews.put(this.id, (Object) null);
            }
            if (!(this.plugin.activity == null || (viewGroup = (ViewGroup) this.plugin.activity.findViewById(16908290)) == null || (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) == null || (flutterWebView2 = this.flutterWebView) == null || flutterWebView2.getView() == null)) {
                viewGroup2.removeView(this.flutterWebView.getView());
            }
        }
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (flutterWebView3 != null) {
            flutterWebView3.dispose();
        }
        this.flutterWebView = null;
        this.plugin = null;
    }
}
