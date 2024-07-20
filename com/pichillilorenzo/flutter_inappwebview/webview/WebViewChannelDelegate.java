package com.pichillilorenzo.flutter_inappwebview.webview;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageListener;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebViewChannelDelegate extends ChannelDelegateImpl {
    static final String LOG_TAG = "WebViewChannelDelegate";
    private InAppWebViewInterface webView;

    public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object> {
        public Object decodeResult(Object obj) {
            return obj;
        }
    }

    public WebViewChannelDelegate(InAppWebViewInterface inAppWebViewInterface, MethodChannel methodChannel) {
        super(methodChannel);
        this.webView = inAppWebViewInterface;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MethodCall methodCall2 = methodCall;
        final MethodChannel.Result result2 = result;
        try {
            boolean z = true;
            String str = "source";
            Object obj = null;
            switch (AnonymousClass8.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.valueOf(methodCall2.method).ordinal()]) {
                case 1:
                    InAppWebViewInterface inAppWebViewInterface = this.webView;
                    if (inAppWebViewInterface != null) {
                        obj = inAppWebViewInterface.getUrl();
                    }
                    result2.success(obj);
                    return;
                case 2:
                    InAppWebViewInterface inAppWebViewInterface2 = this.webView;
                    if (inAppWebViewInterface2 != null) {
                        obj = inAppWebViewInterface2.getTitle();
                    }
                    result2.success(obj);
                    return;
                case 3:
                    InAppWebViewInterface inAppWebViewInterface3 = this.webView;
                    if (inAppWebViewInterface3 != null) {
                        obj = Integer.valueOf(inAppWebViewInterface3.getProgress());
                    }
                    result2.success(obj);
                    return;
                case 4:
                    if (this.webView != null) {
                        this.webView.loadUrl(URLRequest.fromMap((Map) methodCall2.argument("urlRequest")));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 5:
                    if (this.webView != null) {
                        this.webView.postUrl((String) methodCall2.argument(ImagesContract.URL), (byte[]) methodCall2.argument("postData"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 6:
                    if (this.webView != null) {
                        String str2 = (String) methodCall2.argument("baseUrl");
                        this.webView.loadDataWithBaseURL(str2, (String) methodCall2.argument("data"), (String) methodCall2.argument("mimeType"), (String) methodCall2.argument("encoding"), (String) methodCall2.argument("historyUrl"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 7:
                    if (this.webView != null) {
                        try {
                            this.webView.loadFile((String) methodCall2.argument("assetFilePath"));
                        } catch (IOException e) {
                            e.printStackTrace();
                            result2.error(LOG_TAG, e.getMessage(), (Object) null);
                            return;
                        }
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 8:
                    String str3 = str;
                    if (this.webView != null) {
                        ContentWorld fromMap = ContentWorld.fromMap((Map) methodCall2.argument("contentWorld"));
                        this.webView.evaluateJavascript((String) methodCall2.argument(str3), fromMap, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                result2.success(str);
                            }
                        });
                        return;
                    }
                    result2.success((Object) null);
                    return;
                case 9:
                    if (this.webView != null) {
                        this.webView.injectJavascriptFileFromUrl((String) methodCall2.argument("urlFile"), (Map) methodCall2.argument("scriptHtmlTagAttributes"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 10:
                    if (this.webView != null) {
                        this.webView.injectCSSCode((String) methodCall2.argument(str));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 11:
                    if (this.webView != null) {
                        this.webView.injectCSSFileFromUrl((String) methodCall2.argument("urlFile"), (Map) methodCall2.argument("cssLinkHtmlTagAttributes"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 12:
                    InAppWebViewInterface inAppWebViewInterface4 = this.webView;
                    if (inAppWebViewInterface4 != null) {
                        inAppWebViewInterface4.reload();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 13:
                    InAppWebViewInterface inAppWebViewInterface5 = this.webView;
                    if (inAppWebViewInterface5 != null) {
                        inAppWebViewInterface5.goBack();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 14:
                    InAppWebViewInterface inAppWebViewInterface6 = this.webView;
                    if (inAppWebViewInterface6 == null || !inAppWebViewInterface6.canGoBack()) {
                        z = false;
                    }
                    result2.success(Boolean.valueOf(z));
                    return;
                case 15:
                    InAppWebViewInterface inAppWebViewInterface7 = this.webView;
                    if (inAppWebViewInterface7 != null) {
                        inAppWebViewInterface7.goForward();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 16:
                    InAppWebViewInterface inAppWebViewInterface8 = this.webView;
                    if (inAppWebViewInterface8 == null || !inAppWebViewInterface8.canGoForward()) {
                        z = false;
                    }
                    result2.success(Boolean.valueOf(z));
                    return;
                case 17:
                    InAppWebViewInterface inAppWebViewInterface9 = this.webView;
                    if (inAppWebViewInterface9 != null) {
                        inAppWebViewInterface9.goBackOrForward(((Integer) methodCall2.argument("steps")).intValue());
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 18:
                    InAppWebViewInterface inAppWebViewInterface10 = this.webView;
                    if (inAppWebViewInterface10 == null || !inAppWebViewInterface10.canGoBackOrForward(((Integer) methodCall2.argument("steps")).intValue())) {
                        z = false;
                    }
                    result2.success(Boolean.valueOf(z));
                    return;
                case 19:
                    InAppWebViewInterface inAppWebViewInterface11 = this.webView;
                    if (inAppWebViewInterface11 != null) {
                        inAppWebViewInterface11.stopLoading();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 20:
                    InAppWebViewInterface inAppWebViewInterface12 = this.webView;
                    if (inAppWebViewInterface12 == null || !inAppWebViewInterface12.isLoading()) {
                        z = false;
                    }
                    result2.success(Boolean.valueOf(z));
                    return;
                case 21:
                    if (this.webView != null) {
                        this.webView.takeScreenshot((Map) methodCall2.argument("screenshotConfiguration"), result2);
                        return;
                    }
                    result2.success((Object) null);
                    return;
                case 22:
                    InAppWebViewInterface inAppWebViewInterface13 = this.webView;
                    if (inAppWebViewInterface13 != null && (inAppWebViewInterface13.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
                        HashMap hashMap = (HashMap) methodCall2.argument("settings");
                        inAppBrowserSettings.parse((Map) hashMap);
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).setSettings(inAppBrowserSettings, hashMap);
                    } else if (this.webView != null) {
                        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                        HashMap hashMap2 = (HashMap) methodCall2.argument("settings");
                        inAppWebViewSettings.parse((Map) hashMap2);
                        this.webView.setSettings(inAppWebViewSettings, hashMap2);
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 23:
                    InAppWebViewInterface inAppWebViewInterface14 = this.webView;
                    if (inAppWebViewInterface14 == null || !(inAppWebViewInterface14.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppWebViewInterface inAppWebViewInterface15 = this.webView;
                        if (inAppWebViewInterface15 != null) {
                            obj = inAppWebViewInterface15.getCustomSettings();
                        }
                        result2.success(obj);
                        return;
                    }
                    result2.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getCustomSettings());
                    return;
                case 24:
                    InAppWebViewInterface inAppWebViewInterface16 = this.webView;
                    if (inAppWebViewInterface16 == null || !(inAppWebViewInterface16.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                        return;
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(result2);
                        return;
                    }
                case 25:
                    InAppWebViewInterface inAppWebViewInterface17 = this.webView;
                    if (inAppWebViewInterface17 == null || !(inAppWebViewInterface17.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                        return;
                    }
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
                    result2.success(Boolean.TRUE);
                    return;
                case 26:
                    InAppWebViewInterface inAppWebViewInterface18 = this.webView;
                    if (inAppWebViewInterface18 == null || !(inAppWebViewInterface18.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                        return;
                    }
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
                    result2.success(Boolean.TRUE);
                    return;
                case 27:
                    InAppWebViewInterface inAppWebViewInterface19 = this.webView;
                    if (inAppWebViewInterface19 == null || !(inAppWebViewInterface19.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                        return;
                    } else {
                        result2.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
                        return;
                    }
                case 28:
                    InAppWebViewInterface inAppWebViewInterface20 = this.webView;
                    if (inAppWebViewInterface20 != null) {
                        obj = inAppWebViewInterface20.getCopyBackForwardList();
                    }
                    result2.success(obj);
                    return;
                case 29:
                    if (this.webView == null || !WebViewFeature.isFeatureSupported(WebViewFeature.START_SAFE_BROWSING)) {
                        result2.success(Boolean.FALSE);
                        return;
                    } else {
                        WebViewCompat.startSafeBrowsing(this.webView.getContext(), new ValueCallback<Boolean>() {
                            public void onReceiveValue(Boolean bool) {
                                result2.success(bool);
                            }
                        });
                        return;
                    }
                case 30:
                    InAppWebViewInterface inAppWebViewInterface21 = this.webView;
                    if (inAppWebViewInterface21 != null) {
                        inAppWebViewInterface21.clearAllCache();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 31:
                    InAppWebViewInterface inAppWebViewInterface22 = this.webView;
                    if (inAppWebViewInterface22 != null) {
                        inAppWebViewInterface22.clearSslPreferences();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 32:
                    if (this.webView != null) {
                        this.webView.findAllAsync((String) methodCall2.argument("find"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 33:
                    if (this.webView != null) {
                        this.webView.findNext(((Boolean) methodCall2.argument("forward")).booleanValue());
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 34:
                    InAppWebViewInterface inAppWebViewInterface23 = this.webView;
                    if (inAppWebViewInterface23 != null) {
                        inAppWebViewInterface23.clearMatches();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 35:
                    if (this.webView != null) {
                        this.webView.scrollTo((Integer) methodCall2.argument("x"), (Integer) methodCall2.argument("y"), (Boolean) methodCall2.argument("animated"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 36:
                    if (this.webView != null) {
                        this.webView.scrollBy((Integer) methodCall2.argument("x"), (Integer) methodCall2.argument("y"), (Boolean) methodCall2.argument("animated"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 37:
                    InAppWebViewInterface inAppWebViewInterface24 = this.webView;
                    if (inAppWebViewInterface24 != null) {
                        inAppWebViewInterface24.onPause();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 38:
                    InAppWebViewInterface inAppWebViewInterface25 = this.webView;
                    if (inAppWebViewInterface25 != null) {
                        inAppWebViewInterface25.onResume();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 39:
                    InAppWebViewInterface inAppWebViewInterface26 = this.webView;
                    if (inAppWebViewInterface26 != null) {
                        inAppWebViewInterface26.pauseTimers();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 40:
                    InAppWebViewInterface inAppWebViewInterface27 = this.webView;
                    if (inAppWebViewInterface27 != null) {
                        inAppWebViewInterface27.resumeTimers();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 41:
                    if (this.webView != null) {
                        PrintJobSettings printJobSettings = new PrintJobSettings();
                        Map map = (Map) methodCall2.argument("settings");
                        if (map != null) {
                            printJobSettings.parse(map);
                        }
                        result2.success(this.webView.printCurrentPage(printJobSettings));
                        return;
                    }
                    result2.success((Object) null);
                    return;
                case 42:
                    InAppWebViewInterface inAppWebViewInterface28 = this.webView;
                    if (inAppWebViewInterface28 instanceof InAppWebView) {
                        result2.success(Integer.valueOf(inAppWebViewInterface28.getContentHeight()));
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 43:
                    InAppWebViewInterface inAppWebViewInterface29 = this.webView;
                    if (inAppWebViewInterface29 instanceof InAppWebView) {
                        inAppWebViewInterface29.getContentWidth(new ValueCallback<Integer>() {
                            public void onReceiveValue(Integer num) {
                                result2.success(num);
                            }
                        });
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 44:
                    if (this.webView != null) {
                        this.webView.zoomBy((float) ((Double) methodCall2.argument("zoomFactor")).doubleValue());
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 45:
                    InAppWebViewInterface inAppWebViewInterface30 = this.webView;
                    if (inAppWebViewInterface30 != null) {
                        obj = inAppWebViewInterface30.getOriginalUrl();
                    }
                    result2.success(obj);
                    return;
                case 46:
                    InAppWebViewInterface inAppWebViewInterface31 = this.webView;
                    if (inAppWebViewInterface31 instanceof InAppWebView) {
                        result2.success(Float.valueOf(inAppWebViewInterface31.getZoomScale()));
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 47:
                    InAppWebViewInterface inAppWebViewInterface32 = this.webView;
                    if (inAppWebViewInterface32 instanceof InAppWebView) {
                        inAppWebViewInterface32.getSelectedText(new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                result2.success(str);
                            }
                        });
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 48:
                    InAppWebViewInterface inAppWebViewInterface33 = this.webView;
                    if (inAppWebViewInterface33 instanceof InAppWebView) {
                        result2.success(HitTestResult.fromWebViewHitTestResult(inAppWebViewInterface33.getHitTestResult()).toMap());
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 49:
                    if (this.webView != null) {
                        result2.success(Boolean.valueOf(this.webView.pageDown(((Boolean) methodCall2.argument("bottom")).booleanValue())));
                        return;
                    }
                    result2.success(Boolean.FALSE);
                    return;
                case 50:
                    if (this.webView != null) {
                        result2.success(Boolean.valueOf(this.webView.pageUp(((Boolean) methodCall2.argument("top")).booleanValue())));
                        return;
                    }
                    result2.success(Boolean.FALSE);
                    return;
                case 51:
                    if (this.webView != null) {
                        boolean booleanValue = ((Boolean) methodCall2.argument("autoname")).booleanValue();
                        this.webView.saveWebArchive((String) methodCall2.argument("filePath"), booleanValue, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                result2.success(str);
                            }
                        });
                        return;
                    }
                    result2.success((Object) null);
                    return;
                case 52:
                    InAppWebViewInterface inAppWebViewInterface34 = this.webView;
                    if (inAppWebViewInterface34 != null) {
                        result2.success(Boolean.valueOf(inAppWebViewInterface34.zoomIn()));
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                case 53:
                    InAppWebViewInterface inAppWebViewInterface35 = this.webView;
                    if (inAppWebViewInterface35 != null) {
                        result2.success(Boolean.valueOf(inAppWebViewInterface35.zoomOut()));
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                case 54:
                    InAppWebViewInterface inAppWebViewInterface36 = this.webView;
                    if (inAppWebViewInterface36 != null) {
                        inAppWebViewInterface36.clearFocus();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 55:
                    if (this.webView != null) {
                        this.webView.setContextMenu((Map) methodCall2.argument("contextMenu"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 56:
                    InAppWebViewInterface inAppWebViewInterface37 = this.webView;
                    if (inAppWebViewInterface37 != null) {
                        result2.success(inAppWebViewInterface37.requestFocusNodeHref());
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 57:
                    InAppWebViewInterface inAppWebViewInterface38 = this.webView;
                    if (inAppWebViewInterface38 != null) {
                        result2.success(inAppWebViewInterface38.requestImageRef());
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 58:
                    InAppWebViewInterface inAppWebViewInterface39 = this.webView;
                    if (inAppWebViewInterface39 != null) {
                        result2.success(Integer.valueOf(inAppWebViewInterface39.getScrollX()));
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 59:
                    InAppWebViewInterface inAppWebViewInterface40 = this.webView;
                    if (inAppWebViewInterface40 != null) {
                        result2.success(Integer.valueOf(inAppWebViewInterface40.getScrollY()));
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 60:
                    InAppWebViewInterface inAppWebViewInterface41 = this.webView;
                    if (inAppWebViewInterface41 != null) {
                        result2.success(SslCertificateExt.toMap(inAppWebViewInterface41.getCertificate()));
                        return;
                    } else {
                        result2.success((Object) null);
                        return;
                    }
                case 61:
                    InAppWebViewInterface inAppWebViewInterface42 = this.webView;
                    if (inAppWebViewInterface42 != null) {
                        inAppWebViewInterface42.clearHistory();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 62:
                    InAppWebViewInterface inAppWebViewInterface43 = this.webView;
                    if (inAppWebViewInterface43 == null || inAppWebViewInterface43.getUserContentController() == null) {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                    result2.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) methodCall2.argument("userScript")))));
                    return;
                case 63:
                    InAppWebViewInterface inAppWebViewInterface44 = this.webView;
                    if (inAppWebViewInterface44 == null || inAppWebViewInterface44.getUserContentController() == null) {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                    result2.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) methodCall2.argument("index")).intValue(), UserScript.fromMap((Map) methodCall2.argument("userScript")).getInjectionTime())));
                    return;
                case 64:
                    InAppWebViewInterface inAppWebViewInterface45 = this.webView;
                    if (!(inAppWebViewInterface45 == null || inAppWebViewInterface45.getUserContentController() == null)) {
                        this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) methodCall2.argument("groupName"));
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 65:
                    InAppWebViewInterface inAppWebViewInterface46 = this.webView;
                    if (!(inAppWebViewInterface46 == null || inAppWebViewInterface46.getUserContentController() == null)) {
                        this.webView.getUserContentController().removeAllUserOnlyScripts();
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 66:
                    if (this.webView != null) {
                        ContentWorld fromMap2 = ContentWorld.fromMap((Map) methodCall2.argument("contentWorld"));
                        this.webView.callAsyncJavaScript((String) methodCall2.argument("functionBody"), (Map) methodCall2.argument("arguments"), fromMap2, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                result2.success(str);
                            }
                        });
                        return;
                    }
                    result2.success((Object) null);
                    return;
                case 67:
                    InAppWebViewInterface inAppWebViewInterface47 = this.webView;
                    if (inAppWebViewInterface47 != null) {
                        inAppWebViewInterface47.isSecureContext(new ValueCallback<Boolean>() {
                            public void onReceiveValue(Boolean bool) {
                                result2.success(bool);
                            }
                        });
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                case 68:
                    InAppWebViewInterface inAppWebViewInterface48 = this.webView;
                    if (inAppWebViewInterface48 == null) {
                        result2.success((Object) null);
                        return;
                    } else if (!(inAppWebViewInterface48 instanceof InAppWebView) || !WebViewFeature.isFeatureSupported(WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL)) {
                        result2.success((Object) null);
                        return;
                    } else {
                        result2.success(this.webView.createCompatWebMessageChannel().toMap());
                        return;
                    }
                case 69:
                    if (this.webView == null || !WebViewFeature.isFeatureSupported(WebViewFeature.POST_WEB_MESSAGE)) {
                        result2.success(Boolean.TRUE);
                        return;
                    }
                    Map map2 = (Map) methodCall2.argument(Constants.MESSAGE);
                    String str4 = (String) methodCall2.argument("targetOrigin");
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    List<Map> list = (List) map2.get("ports");
                    if (list != null) {
                        for (Map map3 : list) {
                            Integer num = (Integer) map3.get("index");
                            WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get((String) map3.get("webMessageChannelId"));
                            if (webMessageChannel != null && (this.webView instanceof InAppWebView)) {
                                arrayList.add(webMessageChannel.compatPorts.get(num.intValue()));
                            }
                        }
                    }
                    if (this.webView instanceof InAppWebView) {
                        try {
                            WebViewCompat.postWebMessage((WebView) this.webView, new WebMessageCompat((String) map2.get("data"), (WebMessagePortCompat[]) arrayList.toArray(new WebMessagePortCompat[0])), Uri.parse(str4));
                            result2.success(Boolean.TRUE);
                            return;
                        } catch (Exception e2) {
                            result2.error(LOG_TAG, e2.getMessage(), (Object) null);
                            return;
                        }
                    } else {
                        return;
                    }
                case 70:
                    if (this.webView != null) {
                        InAppWebViewInterface inAppWebViewInterface49 = this.webView;
                        WebMessageListener fromMap3 = WebMessageListener.fromMap(inAppWebViewInterface49, inAppWebViewInterface49.getPlugin().messenger, (Map) methodCall2.argument("webMessageListener"));
                        if (!(this.webView instanceof InAppWebView) || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
                            result2.success(Boolean.TRUE);
                            return;
                        }
                        try {
                            this.webView.addWebMessageListener(fromMap3);
                            result2.success(Boolean.TRUE);
                            return;
                        } catch (Exception e3) {
                            result2.error(LOG_TAG, e3.getMessage(), (Object) null);
                            return;
                        }
                    } else {
                        result2.success(Boolean.TRUE);
                        return;
                    }
                case 71:
                    InAppWebViewInterface inAppWebViewInterface50 = this.webView;
                    if (inAppWebViewInterface50 != null) {
                        result2.success(Boolean.valueOf(inAppWebViewInterface50.canScrollVertically()));
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                case 72:
                    InAppWebViewInterface inAppWebViewInterface51 = this.webView;
                    if (inAppWebViewInterface51 != null) {
                        result2.success(Boolean.valueOf(inAppWebViewInterface51.canScrollHorizontally()));
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                case 73:
                    InAppWebViewInterface inAppWebViewInterface52 = this.webView;
                    if (inAppWebViewInterface52 != null) {
                        result2.success(Boolean.valueOf(inAppWebViewInterface52.isInFullscreen()));
                        return;
                    } else {
                        result2.success(Boolean.FALSE);
                        return;
                    }
                default:
                    return;
            }
        } catch (IllegalArgumentException unused) {
            result.notImplemented();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods;

        /* JADX WARNING: Can't wrap try/catch for region: R(146:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(148:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|148) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0264 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0270 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x02b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x02c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x02dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x02e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0300 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0318 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0324 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0330 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x033c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0348 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0354 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0360 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x024c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods[] r0 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods = r0
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getUrl     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getTitle     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getProgress     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.loadUrl     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x003e }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.postUrl     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.loadData     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.loadFile     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.evaluateJavascript     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x006c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.injectJavascriptFileFromUrl     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.injectCSSCode     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.injectCSSFileFromUrl     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.reload     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x009c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.goBack     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.canGoBack     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.goForward     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.canGoForward     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.goBackOrForward     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.canGoBackOrForward     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.stopLoading     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.isLoading     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.takeScreenshot     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.setSettings     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getSettings     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.close     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x012c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.show     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.hide     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.isHidden     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getCopyBackForwardList     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x015c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.startSafeBrowsing     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0168 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.clearCache     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0174 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.clearSslPreferences     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0180 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.findAll     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x018c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.findNext     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0198 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.clearMatches     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01a4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.scrollTo     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01b0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.scrollBy     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01bc }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.pause     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01c8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.resume     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01d4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.pauseTimers     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01e0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.resumeTimers     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01ec }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.printCurrentPage     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01f8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getContentHeight     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0204 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getContentWidth     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0210 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.zoomBy     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x021c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getOriginalUrl     // Catch:{ NoSuchFieldError -> 0x021c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021c }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021c }
            L_0x021c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0228 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getZoomScale     // Catch:{ NoSuchFieldError -> 0x0228 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0228 }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0228 }
            L_0x0228:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0234 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getSelectedText     // Catch:{ NoSuchFieldError -> 0x0234 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0234 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0234 }
            L_0x0234:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0240 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getHitTestResult     // Catch:{ NoSuchFieldError -> 0x0240 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0240 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0240 }
            L_0x0240:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x024c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.pageDown     // Catch:{ NoSuchFieldError -> 0x024c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024c }
                r2 = 49
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024c }
            L_0x024c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0258 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.pageUp     // Catch:{ NoSuchFieldError -> 0x0258 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0258 }
                r2 = 50
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0258 }
            L_0x0258:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0264 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.saveWebArchive     // Catch:{ NoSuchFieldError -> 0x0264 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0264 }
                r2 = 51
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0264 }
            L_0x0264:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0270 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.zoomIn     // Catch:{ NoSuchFieldError -> 0x0270 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0270 }
                r2 = 52
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0270 }
            L_0x0270:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x027c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.zoomOut     // Catch:{ NoSuchFieldError -> 0x027c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
                r2 = 53
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x027c }
            L_0x027c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0288 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.clearFocus     // Catch:{ NoSuchFieldError -> 0x0288 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0288 }
                r2 = 54
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0288 }
            L_0x0288:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0294 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.setContextMenu     // Catch:{ NoSuchFieldError -> 0x0294 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0294 }
                r2 = 55
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0294 }
            L_0x0294:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02a0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.requestFocusNodeHref     // Catch:{ NoSuchFieldError -> 0x02a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a0 }
                r2 = 56
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02a0 }
            L_0x02a0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02ac }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.requestImageRef     // Catch:{ NoSuchFieldError -> 0x02ac }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ac }
                r2 = 57
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02ac }
            L_0x02ac:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02b8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getScrollX     // Catch:{ NoSuchFieldError -> 0x02b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b8 }
                r2 = 58
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b8 }
            L_0x02b8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02c4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getScrollY     // Catch:{ NoSuchFieldError -> 0x02c4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c4 }
                r2 = 59
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02c4 }
            L_0x02c4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02d0 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.getCertificate     // Catch:{ NoSuchFieldError -> 0x02d0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d0 }
                r2 = 60
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02d0 }
            L_0x02d0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02dc }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.clearHistory     // Catch:{ NoSuchFieldError -> 0x02dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02dc }
                r2 = 61
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02dc }
            L_0x02dc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02e8 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.addUserScript     // Catch:{ NoSuchFieldError -> 0x02e8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e8 }
                r2 = 62
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e8 }
            L_0x02e8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02f4 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.removeUserScript     // Catch:{ NoSuchFieldError -> 0x02f4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f4 }
                r2 = 63
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02f4 }
            L_0x02f4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0300 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.removeUserScriptsByGroupName     // Catch:{ NoSuchFieldError -> 0x0300 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0300 }
                r2 = 64
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0300 }
            L_0x0300:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x030c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.removeAllUserScripts     // Catch:{ NoSuchFieldError -> 0x030c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x030c }
                r2 = 65
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x030c }
            L_0x030c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0318 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.callAsyncJavaScript     // Catch:{ NoSuchFieldError -> 0x0318 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0318 }
                r2 = 66
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0318 }
            L_0x0318:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0324 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.isSecureContext     // Catch:{ NoSuchFieldError -> 0x0324 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0324 }
                r2 = 67
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0324 }
            L_0x0324:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0330 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.createWebMessageChannel     // Catch:{ NoSuchFieldError -> 0x0330 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0330 }
                r2 = 68
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0330 }
            L_0x0330:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x033c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.postWebMessage     // Catch:{ NoSuchFieldError -> 0x033c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x033c }
                r2 = 69
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x033c }
            L_0x033c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0348 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.addWebMessageListener     // Catch:{ NoSuchFieldError -> 0x0348 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0348 }
                r2 = 70
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0348 }
            L_0x0348:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0354 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.canScrollVertically     // Catch:{ NoSuchFieldError -> 0x0354 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0354 }
                r2 = 71
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0354 }
            L_0x0354:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0360 }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.canScrollHorizontally     // Catch:{ NoSuchFieldError -> 0x0360 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0360 }
                r2 = 72
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0360 }
            L_0x0360:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x036c }
                com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegateMethods.isInFullscreen     // Catch:{ NoSuchFieldError -> 0x036c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x036c }
                r2 = 73
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x036c }
            L_0x036c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate.AnonymousClass8.<clinit>():void");
        }
    }

    @Deprecated
    public void onFindResultReceived(int i, int i2, boolean z) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i));
            hashMap.put("numberOfMatches", Integer.valueOf(i2));
            hashMap.put("isDoneCounting", Boolean.valueOf(z));
            channel.invokeMethod("onFindResultReceived", hashMap);
        }
    }

    public void onLongPressHitTestResult(HitTestResult hitTestResult) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onLongPressHitTestResult", hitTestResult.toMap());
        }
    }

    public void onScrollChanged(int i, int i2) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i));
            hashMap.put("y", Integer.valueOf(i2));
            channel.invokeMethod("onScrollChanged", hashMap);
        }
    }

    public void onDownloadStartRequest(DownloadStartRequest downloadStartRequest) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onDownloadStartRequest", downloadStartRequest.toMap());
        }
    }

    public void onCreateContextMenu(HitTestResult hitTestResult) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onCreateContextMenu", hitTestResult.toMap());
        }
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i));
            hashMap.put("y", Integer.valueOf(i2));
            hashMap.put("clampedX", Boolean.valueOf(z));
            hashMap.put("clampedY", Boolean.valueOf(z2));
            channel.invokeMethod("onOverScrolled", hashMap);
        }
    }

    public void onContextMenuActionItemClicked(int i, String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i));
            hashMap.put("androidId", Integer.valueOf(i));
            hashMap.put("iosId", (Object) null);
            hashMap.put("title", str);
            channel.invokeMethod("onContextMenuActionItemClicked", hashMap);
        }
    }

    public void onHideContextMenu() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onHideContextMenu", new HashMap());
        }
    }

    public void onEnterFullscreen() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onEnterFullscreen", new HashMap());
        }
    }

    public void onExitFullscreen() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onExitFullscreen", new HashMap());
        }
    }

    public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse> {
        public JsAlertResponse decodeResult(Object obj) {
            return JsAlertResponse.fromMap((Map) obj);
        }
    }

    public void onJsAlert(String str, String str2, Boolean bool, JsAlertCallback jsAlertCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsAlertCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("isMainFrame", bool);
        channel.invokeMethod("onJsAlert", hashMap, jsAlertCallback);
    }

    public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse> {
        public JsConfirmResponse decodeResult(Object obj) {
            return JsConfirmResponse.fromMap((Map) obj);
        }
    }

    public void onJsConfirm(String str, String str2, Boolean bool, JsConfirmCallback jsConfirmCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsConfirmCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("isMainFrame", bool);
        channel.invokeMethod("onJsConfirm", hashMap, jsConfirmCallback);
    }

    public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse> {
        public JsPromptResponse decodeResult(Object obj) {
            return JsPromptResponse.fromMap((Map) obj);
        }
    }

    public void onJsPrompt(String str, String str2, String str3, Boolean bool, JsPromptCallback jsPromptCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("isMainFrame", bool);
        channel.invokeMethod("onJsPrompt", hashMap, jsPromptCallback);
    }

    public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse> {
        public JsBeforeUnloadResponse decodeResult(Object obj) {
            return JsBeforeUnloadResponse.fromMap((Map) obj);
        }
    }

    public void onJsBeforeUnload(String str, String str2, JsBeforeUnloadCallback jsBeforeUnloadCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsBeforeUnloadCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put(Constants.MESSAGE, str2);
        channel.invokeMethod("onJsBeforeUnload", hashMap, jsBeforeUnloadCallback);
    }

    public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean> {
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public void onCreateWindow(CreateWindowAction createWindowAction, CreateWindowCallback createWindowCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            createWindowCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onCreateWindow", createWindowAction.toMap(), createWindowCallback);
        }
    }

    public void onCloseWindow() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onCloseWindow", new HashMap());
        }
    }

    public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse> {
        public GeolocationPermissionShowPromptResponse decodeResult(Object obj) {
            return GeolocationPermissionShowPromptResponse.fromMap((Map) obj);
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        channel.invokeMethod("onGeolocationPermissionsShowPrompt", hashMap, geolocationPermissionsShowPromptCallback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onGeolocationPermissionsHidePrompt", new HashMap());
        }
    }

    public void onConsoleMessage(String str, int i) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.MESSAGE, str);
            hashMap.put("messageLevel", Integer.valueOf(i));
            channel.invokeMethod("onConsoleMessage", hashMap);
        }
    }

    public void onProgressChanged(int i) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(i));
            channel.invokeMethod("onProgressChanged", hashMap);
        }
    }

    public void onTitleChanged(String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("title", str);
            channel.invokeMethod("onTitleChanged", hashMap);
        }
    }

    public void onReceivedIcon(byte[] bArr) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("icon", bArr);
            channel.invokeMethod("onReceivedIcon", hashMap);
        }
    }

    public void onReceivedTouchIconUrl(String str, boolean z) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, str);
            hashMap.put("precomposed", Boolean.valueOf(z));
            channel.invokeMethod("onReceivedTouchIconUrl", hashMap);
        }
    }

    public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse> {
        public PermissionResponse decodeResult(Object obj) {
            return PermissionResponse.fromMap((Map) obj);
        }
    }

    public void onPermissionRequest(String str, List<String> list, Object obj, PermissionRequestCallback permissionRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            permissionRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        hashMap.put("resources", list);
        hashMap.put("frame", obj);
        channel.invokeMethod("onPermissionRequest", hashMap, permissionRequestCallback);
    }

    public void onPermissionRequestCanceled(String str, List<String> list) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
            hashMap.put("resources", list);
            channel.invokeMethod("onPermissionRequestCanceled", hashMap);
        }
    }

    public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy> {
        public NavigationActionPolicy decodeResult(Object obj) {
            return NavigationActionPolicy.fromValue(obj instanceof Integer ? ((Integer) obj).intValue() : NavigationActionPolicy.CANCEL.rawValue());
        }
    }

    public void shouldOverrideUrlLoading(NavigationAction navigationAction, ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("shouldOverrideUrlLoading", navigationAction.toMap(), shouldOverrideUrlLoadingCallback);
        }
    }

    public void onLoadStart(String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, str);
            channel.invokeMethod("onLoadStart", hashMap);
        }
    }

    public void onLoadStop(String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, str);
            channel.invokeMethod("onLoadStop", hashMap);
        }
    }

    public void onUpdateVisitedHistory(String str, boolean z) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, str);
            hashMap.put("isReload", Boolean.valueOf(z));
            channel.invokeMethod("onUpdateVisitedHistory", hashMap);
        }
    }

    public void onReceivedError(WebResourceRequestExt webResourceRequestExt, WebResourceErrorExt webResourceErrorExt) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("request", webResourceRequestExt.toMap());
            hashMap.put("error", webResourceErrorExt.toMap());
            channel.invokeMethod("onReceivedError", hashMap);
        }
    }

    public void onReceivedHttpError(WebResourceRequestExt webResourceRequestExt, WebResourceResponseExt webResourceResponseExt) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("request", webResourceRequestExt.toMap());
            hashMap.put("errorResponse", webResourceResponseExt.toMap());
            channel.invokeMethod("onReceivedHttpError", hashMap);
        }
    }

    public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse> {
        public HttpAuthResponse decodeResult(Object obj) {
            return HttpAuthResponse.fromMap((Map) obj);
        }
    }

    public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge httpAuthenticationChallenge, ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedHttpAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedHttpAuthRequest", httpAuthenticationChallenge.toMap(), receivedHttpAuthRequestCallback);
        }
    }

    public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse> {
        public ServerTrustAuthResponse decodeResult(Object obj) {
            return ServerTrustAuthResponse.fromMap((Map) obj);
        }
    }

    public void onReceivedServerTrustAuthRequest(ServerTrustChallenge serverTrustChallenge, ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedServerTrustAuthRequest", serverTrustChallenge.toMap(), receivedServerTrustAuthRequestCallback);
        }
    }

    public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse> {
        public ClientCertResponse decodeResult(Object obj) {
            return ClientCertResponse.fromMap((Map) obj);
        }
    }

    public void onReceivedClientCertRequest(ClientCertChallenge clientCertChallenge, ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedClientCertRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedClientCertRequest", clientCertChallenge.toMap(), receivedClientCertRequestCallback);
        }
    }

    public void onZoomScaleChanged(float f, float f2) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldScale", Float.valueOf(f));
            hashMap.put("newScale", Float.valueOf(f2));
            channel.invokeMethod("onZoomScaleChanged", hashMap);
        }
    }

    public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse> {
        public SafeBrowsingResponse decodeResult(Object obj) {
            return SafeBrowsingResponse.fromMap((Map) obj);
        }
    }

    public void onSafeBrowsingHit(String str, int i, SafeBrowsingHitCallback safeBrowsingHitCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            safeBrowsingHitCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put("threatType", Integer.valueOf(i));
        channel.invokeMethod("onSafeBrowsingHit", hashMap, safeBrowsingHitCallback);
    }

    public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public void onFormResubmission(String str, FormResubmissionCallback formResubmissionCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            formResubmissionCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        channel.invokeMethod("onFormResubmission", hashMap, formResubmissionCallback);
    }

    public void onPageCommitVisible(String str) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, str);
            channel.invokeMethod("onPageCommitVisible", hashMap);
        }
    }

    public void onRenderProcessGone(boolean z, int i) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("didCrash", Boolean.valueOf(z));
            hashMap.put("rendererPriorityAtExit", Integer.valueOf(i));
            channel.invokeMethod("onRenderProcessGone", hashMap);
        }
    }

    public void onReceivedLoginRequest(String str, String str2, String str3) {
        MethodChannel channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
            hashMap.put("account", str2);
            hashMap.put("args", str3);
            channel.invokeMethod("onReceivedLoginRequest", hashMap);
        }
    }

    public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse> {
        public CustomSchemeResponse decodeResult(Object obj) {
            return CustomSchemeResponse.fromMap((Map) obj);
        }
    }

    public void onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt, LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        channel.invokeMethod("onLoadResourceWithCustomScheme", hashMap, loadResourceWithCustomSchemeCallback);
    }

    public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse> {
        public CustomSchemeResponse decodeResult(Object obj) {
            return new LoadResourceWithCustomSchemeCallback().decodeResult(obj);
        }
    }

    public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt) throws InterruptedException {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        return (CustomSchemeResponse) Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", hashMap, new SyncLoadResourceWithCustomSchemeCallback());
    }

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            shouldInterceptRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) throws InterruptedException {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public void onRenderProcessUnresponsive(String str, RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        channel.invokeMethod("onRenderProcessUnresponsive", hashMap, renderProcessUnresponsiveCallback);
    }

    public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public void onRenderProcessResponsive(String str, RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            renderProcessResponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        channel.invokeMethod("onRenderProcessResponsive", hashMap, renderProcessResponsiveCallback);
    }

    public void onCallJsHandler(String str, String str2, CallJsHandlerCallback callJsHandlerCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            callJsHandlerCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("handlerName", str);
        hashMap.put("args", str2);
        channel.invokeMethod("onCallJsHandler", hashMap, callJsHandlerCallback);
    }

    public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean> {
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public void onPrintRequest(String str, String str2, PrintRequestCallback printRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            printRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, str);
        hashMap.put("printJobId", str2);
        channel.invokeMethod("onPrintRequest", hashMap, printRequestCallback);
    }

    public void onRequestFocus() {
        MethodChannel channel = getChannel();
        if (channel != null) {
            channel.invokeMethod("onRequestFocus", new HashMap());
        }
    }

    public void dispose() {
        super.dispose();
        this.webView = null;
    }
}
