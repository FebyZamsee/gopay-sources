package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class HeadlessInAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
    public InAppWebViewFlutterPlugin plugin;
    public final Map<String, HeadlessInAppWebView> webViews = new HashMap();

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("id");
        String str2 = methodCall.method;
        str2.hashCode();
        if (!str2.equals("run")) {
            result.notImplemented();
            return;
        }
        run(str, (HashMap) methodCall.argument("params"));
        result.success(Boolean.TRUE);
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        if (inAppWebViewFlutterPlugin.activity != null || this.plugin.applicationContext != null) {
            Context context = this.plugin.activity;
            if (context == null) {
                context = this.plugin.applicationContext;
            }
            FlutterWebView flutterWebView = new FlutterWebView(this.plugin, context, str, hashMap);
            HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
            this.webViews.put(str, headlessInAppWebView);
            headlessInAppWebView.prepare(hashMap);
            headlessInAppWebView.onWebViewCreated();
            flutterWebView.makeInitialLoad(hashMap);
        }
    }

    public void dispose() {
        super.dispose();
        for (HeadlessInAppWebView next : this.webViews.values()) {
            if (next != null) {
                next.dispose();
            }
        }
        this.webViews.clear();
        this.plugin = null;
    }
}
