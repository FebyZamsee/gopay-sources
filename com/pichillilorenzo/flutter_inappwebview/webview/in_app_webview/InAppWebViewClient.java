package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class InAppWebViewClient extends WebViewClient {
    protected static final String LOG_TAG = "IAWebViewClient";
    /* access modifiers changed from: private */
    public static List<URLCredential> credentialsProposed;
    /* access modifiers changed from: private */
    public static int previousAuthRequestFailureCount;
    private InAppBrowserDelegate inAppBrowserDelegate;

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public InAppWebViewClient(InAppBrowserDelegate inAppBrowserDelegate2) {
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r9, android.webkit.WebResourceRequest r10) {
        /*
            r8 = this;
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView r9 = (com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView) r9
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings r0 = r9.customSettings
            java.lang.Boolean r0 = r0.useShouldOverrideUrlLoading
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "WEB_RESOURCE_REQUEST_IS_REDIRECT"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = androidx.webkit.WebResourceRequestCompat.isRedirect(r10)
        L_0x0019:
            r7 = r0
            goto L_0x0027
        L_0x001b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L_0x0026
            boolean r0 = r10.isRedirect()
            goto L_0x0019
        L_0x0026:
            r7 = 0
        L_0x0027:
            android.net.Uri r0 = r10.getUrl()
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = r10.getMethod()
            java.util.Map r4 = r10.getRequestHeaders()
            boolean r5 = r10.isForMainFrame()
            boolean r6 = r10.hasGesture()
            r0 = r8
            r1 = r9
            r0.onShouldOverrideUrlLoading(r1, r2, r3, r4, r5, r6, r7)
            java.util.regex.Pattern r0 = r9.regexToCancelSubFramesLoadingCompiled
            if (r0 == 0) goto L_0x0063
            boolean r0 = r10.isForMainFrame()
            if (r0 == 0) goto L_0x0050
            r9 = 1
            return r9
        L_0x0050:
            java.util.regex.Pattern r9 = r9.regexToCancelSubFramesLoadingCompiled
            android.net.Uri r10 = r10.getUrl()
            java.lang.String r10 = r10.toString()
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r9 = r9.matches()
            return r9
        L_0x0063:
            boolean r9 = r10.isForMainFrame()
            return r9
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, ShareTarget.METHOD_GET, (Map<String, String>) null, true, false, false);
        return true;
    }

    /* access modifiers changed from: private */
    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z) {
        if (z) {
            webView.loadUrl(str, map);
        }
    }

    public void onShouldOverrideUrlLoading(InAppWebView inAppWebView, String str, String str2, Map<String, String> map, boolean z, boolean z2, boolean z3) {
        NavigationAction navigationAction = new NavigationAction(new URLRequest(str, str2, (byte[]) null, map), z, z2, z3);
        final InAppWebView inAppWebView2 = inAppWebView;
        final String str3 = str;
        final Map<String, String> map2 = map;
        final boolean z4 = z;
        AnonymousClass1 r2 = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() {
            public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
                if (AnonymousClass7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy[navigationActionPolicy.ordinal()] != 1) {
                    return false;
                }
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView2, str3, map2, z4);
                return false;
            }

            public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView2, str3, map2, z4);
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((NavigationActionPolicy) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.shouldOverrideUrlLoading(navigationAction, r2);
        } else {
            r2.defaultBehaviour(null);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy[] r0 = com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy = r0
                com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy r1 = com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy.ALLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy r1 = com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient.AnonymousClass7.<clinit>():void");
        }
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            ValueCallback valueCallback = null;
            inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentStart(), (ValueCallback) null);
        }
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        ValueCallback valueCallback = null;
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentEnd(), (ValueCallback) null);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didStartNavigation(str);
        }
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onLoadStart(str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didFinishNavigation(str);
        }
        CookieManager.getInstance().flush();
        ValueCallback valueCallback = null;
        inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, (ValueCallback) null);
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onLoadStop(str);
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didUpdateVisitedHistory(url);
        }
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onUpdateVisitedHistory(url, z);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (webResourceRequest.isForMainFrame()) {
            if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
                inAppWebView.stopLoading();
                inAppWebView.loadUrl("about:blank");
            }
            inAppWebView.isLoading = false;
            previousAuthRequestFailureCount = 0;
            credentialsProposed = null;
            InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
            if (inAppBrowserDelegate2 != null) {
                inAppBrowserDelegate2.didFailNavigation(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(webResourceError));
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.SUPPRESS_ERROR_PAGE) && inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didFailNavigation(str2, i, str);
        }
        WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, (Map<String, String>) null, false, false, true, ShareTarget.METHOD_GET);
        WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i, str);
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceivedHttpAuthRequest(android.webkit.WebView r16, android.webkit.HttpAuthHandler r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            java.lang.String r0 = r16.getUrl()
            r1 = 0
            java.lang.String r2 = "https"
            if (r0 == 0) goto L_0x001b
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0017 }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x0017 }
            java.lang.String r2 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x0017 }
            int r0 = r3.getPort()     // Catch:{ URISyntaxException -> 0x0017 }
            goto L_0x001c
        L_0x0017:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001b:
            r0 = 0
        L_0x001c:
            int r3 = previousAuthRequestFailureCount
            int r3 = r3 + 1
            previousAuthRequestFailureCount = r3
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r3 = credentialsProposed
            if (r3 != 0) goto L_0x003d
            android.content.Context r3 = r16.getContext()
            com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase r3 = com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase.getInstance(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r10 = r18
            r11 = r19
            java.util.List r3 = r3.getHttpAuthCredentials(r10, r2, r11, r4)
            credentialsProposed = r3
            goto L_0x0041
        L_0x003d:
            r10 = r18
            r11 = r19
        L_0x0041:
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r3 = credentialsProposed
            r12 = 0
            if (r3 == 0) goto L_0x0055
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0055
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r3 = credentialsProposed
            java.lang.Object r1 = r3.get(r1)
            com.pichillilorenzo.flutter_inappwebview.types.URLCredential r1 = (com.pichillilorenzo.flutter_inappwebview.types.URLCredential) r1
            goto L_0x0056
        L_0x0055:
            r1 = r12
        L_0x0056:
            com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace r13 = new com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace
            android.net.http.SslCertificate r8 = r16.getCertificate()
            r9 = 0
            r3 = r13
            r4 = r18
            r5 = r2
            r6 = r19
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge r14 = new com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge
            int r3 = previousAuthRequestFailureCount
            r14.<init>(r13, r3, r1)
            r1 = r16
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView r1 = (com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView) r1
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient$2 r13 = new com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient$2
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r18
            r7 = r2
            r8 = r19
            r9 = r0
            r10 = r17
            r3.<init>(r5, r6, r7, r8, r9, r10)
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r0 = r1.channelDelegate
            if (r0 == 0) goto L_0x008d
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r0 = r1.channelDelegate
            r0.onReceivedHttpAuthRequest(r14, r13)
            return
        L_0x008d:
            r13.defaultBehaviour(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient.onReceivedHttpAuthRequest(android.webkit.WebView, android.webkit.HttpAuthHandler, java.lang.String, java.lang.String):void");
    }

    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        int i;
        String str;
        String str2;
        try {
            URI uri = new URI(sslError.getUrl());
            String host = uri.getHost();
            String scheme = uri.getScheme();
            i = uri.getPort();
            str2 = host;
            str = scheme;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            str2 = "";
            str = ProxyConfig.MATCH_HTTPS;
            i = 0;
        }
        ServerTrustChallenge serverTrustChallenge = new ServerTrustChallenge(new URLProtectionSpace(str2, str, (String) null, i, sslError.getCertificate(), sslError));
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass3 r2 = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() {
            public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
                Integer action = serverTrustAuthResponse.getAction();
                if (action == null) {
                    return true;
                }
                if (action.intValue() != 1) {
                    sslErrorHandler.cancel();
                    return false;
                }
                sslErrorHandler.proceed();
                return false;
            }

            public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
                InAppWebViewClient.super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((ServerTrustAuthResponse) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onReceivedServerTrustAuthRequest(serverTrustChallenge, r2);
        } else {
            r2.defaultBehaviour(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceivedClientCertRequest(final android.webkit.WebView r9, final android.webkit.ClientCertRequest r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getUrl()
            java.lang.String r2 = r10.getHost()
            int r5 = r10.getPort()
            if (r0 == 0) goto L_0x001c
            java.net.URI r1 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0018 }
            r1.<init>(r0)     // Catch:{ URISyntaxException -> 0x0018 }
            java.lang.String r0 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001c:
            java.lang.String r0 = "https"
        L_0x001e:
            r3 = r0
            com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace r0 = new com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace
            r4 = 0
            android.net.http.SslCertificate r6 = r9.getCertificate()
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.pichillilorenzo.flutter_inappwebview.types.ClientCertChallenge r1 = new com.pichillilorenzo.flutter_inappwebview.types.ClientCertChallenge
            java.security.Principal[] r2 = r10.getPrincipals()
            java.lang.String[] r3 = r10.getKeyTypes()
            r1.<init>(r0, r2, r3)
            r0 = r9
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView r0 = (com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView) r0
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient$4 r2 = new com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient$4
            r2.<init>(r0, r10, r9)
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r9 = r0.channelDelegate
            if (r9 == 0) goto L_0x004a
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r9 = r0.channelDelegate
            r9.onReceivedClientCertRequest(r1, r2)
            return
        L_0x004a:
            r9 = 0
            r2.defaultBehaviour(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient.onReceivedClientCertRequest(android.webkit.WebView, android.webkit.ClientCertRequest):void");
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f2 / Util.getPixelDensity(inAppWebView.getContext());
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onZoomScaleChanged(f, f2);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        final SafeBrowsingResponse safeBrowsingResponse2 = safeBrowsingResponse;
        final WebView webView2 = webView;
        final WebResourceRequest webResourceRequest2 = webResourceRequest;
        final int i2 = i;
        AnonymousClass5 r1 = new WebViewChannelDelegate.SafeBrowsingHitCallback() {
            public boolean nonNullSuccess(com.pichillilorenzo.flutter_inappwebview.types.SafeBrowsingResponse safeBrowsingResponse) {
                Integer action = safeBrowsingResponse.getAction();
                if (action == null) {
                    return true;
                }
                boolean isReport = safeBrowsingResponse.isReport();
                int intValue = action.intValue();
                if (intValue == 0) {
                    safeBrowsingResponse2.backToSafety(isReport);
                    return false;
                } else if (intValue != 1) {
                    safeBrowsingResponse2.showInterstitial(isReport);
                    return false;
                } else {
                    safeBrowsingResponse2.proceed(isReport);
                    return false;
                }
            }

            public void defaultBehaviour(com.pichillilorenzo.flutter_inappwebview.types.SafeBrowsingResponse safeBrowsingResponse) {
                InAppWebViewClient.super.onSafeBrowsingHit(webView2, webResourceRequest2, i2, safeBrowsingResponse2);
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((com.pichillilorenzo.flutter_inappwebview.types.SafeBrowsingResponse) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), i, r1);
        } else {
            r1.defaultBehaviour(null);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r10, com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt r11) {
        /*
            r9 = this;
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView r10 = (com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView) r10
            com.pichillilorenzo.flutter_inappwebview.types.WebViewAssetLoaderExt r0 = r10.webViewAssetLoaderExt
            if (r0 == 0) goto L_0x0023
            com.pichillilorenzo.flutter_inappwebview.types.WebViewAssetLoaderExt r0 = r10.webViewAssetLoaderExt
            androidx.webkit.WebViewAssetLoader r0 = r0.loader
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r11.getUrl()     // Catch:{ Exception -> 0x001f }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x001f }
            com.pichillilorenzo.flutter_inappwebview.types.WebViewAssetLoaderExt r1 = r10.webViewAssetLoaderExt     // Catch:{ Exception -> 0x001f }
            androidx.webkit.WebViewAssetLoader r1 = r1.loader     // Catch:{ Exception -> 0x001f }
            android.webkit.WebResourceResponse r0 = r1.shouldInterceptRequest(r0)     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x0023
            return r0
        L_0x001f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0023:
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings r0 = r10.customSettings
            java.lang.Boolean r0 = r0.useShouldInterceptRequest
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r0 = r10.channelDelegate
            if (r0 == 0) goto L_0x003e
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r10 = r10.channelDelegate     // Catch:{ InterruptedException -> 0x0039 }
            com.pichillilorenzo.flutter_inappwebview.types.WebResourceResponseExt r10 = r10.shouldInterceptRequest(r11)     // Catch:{ InterruptedException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r10 = move-exception
            r10.printStackTrace()
            return r1
        L_0x003e:
            r10 = r1
        L_0x003f:
            if (r10 == 0) goto L_0x0076
            java.lang.String r3 = r10.getContentType()
            java.lang.String r4 = r10.getContentEncoding()
            byte[] r11 = r10.getData()
            java.util.Map r7 = r10.getHeaders()
            java.lang.Integer r0 = r10.getStatusCode()
            java.lang.String r6 = r10.getReasonPhrase()
            if (r11 == 0) goto L_0x0060
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r11)
        L_0x0060:
            r8 = r1
            if (r0 == 0) goto L_0x0070
            if (r6 == 0) goto L_0x0070
            android.webkit.WebResourceResponse r10 = new android.webkit.WebResourceResponse
            int r5 = r0.intValue()
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        L_0x0070:
            android.webkit.WebResourceResponse r10 = new android.webkit.WebResourceResponse
            r10.<init>(r3, r4, r8)
            return r10
        L_0x0076:
            return r1
        L_0x0077:
            java.lang.String r0 = r11.getUrl()
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)
            r2 = 0
            r0 = r0[r2]
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = r11.getUrl()     // Catch:{ Exception -> 0x0095 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r2.getScheme()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings r2 = r10.customSettings
            java.util.List<java.lang.String> r2 = r2.resourceCustomSchemes
            if (r2 == 0) goto L_0x00e2
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings r2 = r10.customSettings
            java.util.List<java.lang.String> r2 = r2.resourceCustomSchemes
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x00e2
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r0 = r10.channelDelegate
            if (r0 == 0) goto L_0x00b6
            com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate r0 = r10.channelDelegate     // Catch:{ InterruptedException -> 0x00b1 }
            com.pichillilorenzo.flutter_inappwebview.types.CustomSchemeResponse r0 = r0.onLoadResourceWithCustomScheme(r11)     // Catch:{ InterruptedException -> 0x00b1 }
            goto L_0x00b7
        L_0x00b1:
            r10 = move-exception
            r10.printStackTrace()
            return r1
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            if (r0 == 0) goto L_0x00e2
            com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler r2 = r10.contentBlockerHandler     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r3 = r0.getContentType()     // Catch:{ Exception -> 0x00c4 }
            android.webkit.WebResourceResponse r1 = r2.checkUrl((com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView) r10, (com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt) r11, (java.lang.String) r3)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00c8:
            if (r1 == 0) goto L_0x00cb
            return r1
        L_0x00cb:
            java.lang.String r10 = r0.getContentType()
            java.lang.String r11 = r0.getContentType()
            android.webkit.WebResourceResponse r1 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getData()
            r2.<init>(r0)
            r1.<init>(r10, r11, r2)
            return r1
        L_0x00e2:
            com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler r0 = r10.contentBlockerHandler
            java.util.List r0 = r0.getRuleList()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f9
            com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler r0 = r10.contentBlockerHandler     // Catch:{ Exception -> 0x00f5 }
            android.webkit.WebResourceResponse r1 = r0.checkUrl(r10, r11)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00f9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient.shouldInterceptRequest(android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt):android.webkit.WebResourceResponse");
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return shouldInterceptRequest(webView, new WebResourceRequestExt(str, (Map<String, String>) null, false, false, true, ShareTarget.METHOD_GET));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
    }

    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        AnonymousClass6 r1 = new WebViewChannelDelegate.FormResubmissionCallback() {
            public boolean nonNullSuccess(Integer num) {
                if (num.intValue() != 0) {
                    message.sendToTarget();
                    return false;
                }
                message2.sendToTarget();
                return false;
            }

            public void defaultBehaviour(Integer num) {
                InAppWebViewClient.super.onFormResubmission(webView, message, message2);
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((Integer) null);
            }
        };
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onFormResubmission(inAppWebView.getUrl(), r1);
        } else {
            r1.defaultBehaviour(null);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onPageCommitVisible(str);
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useOnRenderProcessGone.booleanValue() || inAppWebView.channelDelegate == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
        return true;
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onReceivedLoginRequest(str, str2, str3);
        }
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }
}
