package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.webkit.WebView;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;

public class InAppWebViewRenderProcessClient extends WebViewRenderProcessClient {
    protected static final String LOG_TAG = "IAWRenderProcessClient";

    /* access modifiers changed from: package-private */
    public void dispose() {
    }

    public void onRenderProcessUnresponsive(WebView webView, final WebViewRenderProcess webViewRenderProcess) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass1 r0 = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback() {
            public void defaultBehaviour(Integer num) {
            }

            public boolean nonNullSuccess(Integer num) {
                if (webViewRenderProcess == null) {
                    return true;
                }
                if (num.intValue() != 0 || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE)) {
                    return false;
                }
                webViewRenderProcess.terminate();
                return false;
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((Integer) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), r0);
        } else {
            r0.defaultBehaviour(null);
        }
    }

    public void onRenderProcessResponsive(WebView webView, final WebViewRenderProcess webViewRenderProcess) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass2 r0 = new WebViewChannelDelegate.RenderProcessResponsiveCallback() {
            public void defaultBehaviour(Integer num) {
            }

            public boolean nonNullSuccess(Integer num) {
                if (webViewRenderProcess == null) {
                    return true;
                }
                if (num.intValue() != 0 || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE)) {
                    return false;
                }
                webViewRenderProcess.terminate();
                return false;
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((Integer) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), r0);
        } else {
            r0.defaultBehaviour(null);
        }
    }
}
