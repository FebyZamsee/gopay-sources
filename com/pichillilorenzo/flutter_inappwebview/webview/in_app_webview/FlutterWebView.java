package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionSettings;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.webview.PlatformWebView;
import io.flutter.view.FlutterView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlutterWebView implements PlatformWebView {
    static final String LOG_TAG = "IAWFlutterWebView";
    public String keepAliveId;
    public PullToRefreshLayout pullToRefreshLayout;
    public InAppWebView webView;

    public FlutterWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context, Object obj, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = inAppWebViewFlutterPlugin;
        Context context2 = context;
        Object obj2 = obj;
        HashMap<String, Object> hashMap2 = hashMap;
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        this.keepAliveId = (String) hashMap2.get("keepAliveId");
        Map map = (Map) hashMap2.get("contextMenu");
        Integer num = (Integer) hashMap2.get("windowId");
        List<Map> list = (List) hashMap2.get("initialUserScripts");
        Map map2 = (Map) hashMap2.get("pullToRefreshSettings");
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse((Map) hashMap2.get("initialSettings"));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Map fromMap : list) {
                arrayList.add(UserScript.fromMap(fromMap));
            }
        }
        FlutterView flutterView = inAppWebViewSettings.useHybridComposition.booleanValue() ? null : inAppWebViewFlutterPlugin2.flutterView;
        InAppWebView inAppWebView = r1;
        InAppWebView inAppWebView2 = new InAppWebView(context, inAppWebViewFlutterPlugin, obj, num, inAppWebViewSettings, map, flutterView, arrayList);
        this.webView = inAppWebView;
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
        pullToRefreshSettings.parse(map2);
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = inAppWebViewFlutterPlugin;
        PullToRefreshLayout pullToRefreshLayout2 = new PullToRefreshLayout(context2, inAppWebViewFlutterPlugin3, obj2, pullToRefreshSettings);
        this.pullToRefreshLayout = pullToRefreshLayout2;
        pullToRefreshLayout2.addView(this.webView);
        this.pullToRefreshLayout.prepare();
        FindInteractionController findInteractionController = new FindInteractionController(this.webView, inAppWebViewFlutterPlugin3, obj2, (FindInteractionSettings) null);
        this.webView.findInteractionController = findInteractionController;
        findInteractionController.prepare();
        this.webView.prepare();
    }

    public View getView() {
        PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
        return pullToRefreshLayout2 == null ? this.webView : pullToRefreshLayout2;
    }

    public void makeInitialLoad(HashMap<String, Object> hashMap) {
        URLRequest fromMap;
        Message message;
        if (this.webView != null) {
            Integer num = (Integer) hashMap.get("windowId");
            Map map = (Map) hashMap.get("initialUrlRequest");
            String str = (String) hashMap.get("initialFile");
            Map map2 = (Map) hashMap.get("initialData");
            if (num != null) {
                if (this.webView.plugin != null && this.webView.plugin.inAppWebViewManager != null && (message = this.webView.plugin.inAppWebViewManager.windowWebViewMessages.get(num)) != null) {
                    ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                    message.sendToTarget();
                    if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
                        this.webView.post(new Runnable() {
                            public void run() {
                                if (FlutterWebView.this.webView != null) {
                                    FlutterWebView.this.webView.prepareAndAddUserScripts();
                                }
                            }
                        });
                    }
                }
            } else if (str != null) {
                try {
                    this.webView.loadFile(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (map2 != null) {
                String str2 = (String) map2.get("baseUrl");
                this.webView.loadDataWithBaseURL(str2, (String) map2.get("data"), (String) map2.get("mimeType"), (String) map2.get("encoding"), (String) map2.get("historyUrl"));
            } else if (map != null && (fromMap = URLRequest.fromMap(map)) != null) {
                this.webView.loadUrl(fromMap);
            }
        }
    }

    public void dispose() {
        InAppWebView inAppWebView;
        if (this.keepAliveId == null && (inAppWebView = this.webView) != null) {
            inAppWebView.dispose();
            this.webView = null;
            PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
            if (pullToRefreshLayout2 != null) {
                pullToRefreshLayout2.dispose();
                this.pullToRefreshLayout = null;
            }
        }
    }

    public void onInputConnectionLocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && inAppWebView.inAppBrowserDelegate == null && !this.webView.customSettings.useHybridComposition.booleanValue()) {
            this.webView.lockInputConnection();
        }
    }

    public void onInputConnectionUnlocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && inAppWebView.inAppBrowserDelegate == null && !this.webView.customSettings.useHybridComposition.booleanValue()) {
            this.webView.unlockInputConnection();
        }
    }

    public void onFlutterViewAttached(View view) {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && !inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            this.webView.setContainerView(view);
        }
    }

    public void onFlutterViewDetached() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && !inAppWebView.customSettings.useHybridComposition.booleanValue()) {
            this.webView.setContainerView((View) null);
        }
    }
}
