package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewRenderProcessClient;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.ConsoleLogJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageListener;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks = new HashMap();
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler = new ContentBlockerHandler();
    public Map<String, Object> contextMenu = null;
    /* access modifiers changed from: private */
    public Point contextMenuPoint = new Point(0, 0);
    public InAppWebViewSettings customSettings = new InAppWebViewSettings();
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks = new HashMap();
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu = null;
    public GestureDetector gestureDetector = null;
    public Object id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen = false;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts = new ArrayList();
    public boolean isLoading = false;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch = new Point(0, 0);
    public Handler mainLooperHandler = new Handler(getWebViewLooper());
    public int newCheckContextMenuShouldBeClosedTaskTask = 100;
    public int newCheckScrollStoppedTask = 100;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController = new UserContentController(this);
    public Map<String, WebMessageChannel> webMessageChannels = new HashMap();
    public List<WebMessageListener> webMessageListeners = new ArrayList();
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale = 1.0f;

    public InAppWebView(Context context) {
        super(context);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.plugin = inAppWebViewFlutterPlugin;
        this.id = obj;
        BinaryMessenger binaryMessenger = inAppWebViewFlutterPlugin.messenger;
        StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
        sb.append(obj);
        this.channelDelegate = new WebViewChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
            inAppWebViewFlutterPlugin.activity.registerForContextMenu(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ((r0.contains(".") ? java.lang.Integer.parseInt(r0.split("\\.")[0]) : 0) >= 73) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebViewClient createWebViewClient(com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.pm.PackageInfo r0 = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(r0)
            if (r0 != 0) goto L_0x0010
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient r0 = new com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient
            r0.<init>(r6)
            return r0
        L_0x0010:
            java.lang.String r1 = r0.packageName
            java.lang.String r2 = "com.android.webview"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r0.packageName
            java.lang.String r4 = "com.google.android.webview"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r0.packageName
            java.lang.String r4 = "com.android.chrome"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0032
            r1 = 0
            goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            if (r1 == 0) goto L_0x0059
            java.lang.String r4 = r0.versionName
            if (r4 == 0) goto L_0x003c
            java.lang.String r0 = r0.versionName
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = ""
        L_0x003e:
            java.lang.String r4 = "."
            boolean r4 = r0.contains(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            if (r4 == 0) goto L_0x0053
            java.lang.String r4 = "\\."
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            r0 = r0[r3]     // Catch:{ NumberFormatException -> 0x0059 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0059 }
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            r4 = 73
            if (r0 < r4) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient r0 = new com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClient
            r0.<init>(r6)
            return r0
        L_0x0064:
            com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClientCompat r0 = new com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewClientCompat
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView.createWebViewClient(com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate):android.webkit.WebViewClient");
    }

    public final void prepare() {
        if (this.plugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface2 = new JavaScriptBridgeInterface(this);
        this.javaScriptBridgeInterface = javaScriptBridgeInterface2;
        addJavascriptInterface(javaScriptBridgeInterface2, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        InAppWebViewChromeClient inAppWebViewChromeClient2 = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient2;
        setWebChromeClient(inAppWebViewChromeClient2);
        WebViewClient createWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
        if (createWebViewClient instanceof InAppWebViewClientCompat) {
            InAppWebViewClientCompat inAppWebViewClientCompat2 = (InAppWebViewClientCompat) createWebViewClient;
            this.inAppWebViewClientCompat = inAppWebViewClientCompat2;
            setWebViewClient(inAppWebViewClientCompat2);
        } else if (createWebViewClient instanceof InAppWebViewClient) {
            InAppWebViewClient inAppWebViewClient2 = (InAppWebViewClient) createWebViewClient;
            this.inAppWebViewClient = inAppWebViewClient2;
            setWebViewClient(inAppWebViewClient2);
        }
        if (Build.VERSION.SDK_INT >= 29 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE)) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient2 = new InAppWebViewRenderProcessClient();
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient2;
            WebViewCompat.setWebViewRenderProcessClient(this, inAppWebViewRenderProcessClient2);
        }
        if (this.windowId == null || !WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
        if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ENABLE)) {
            WebSettingsCompat.setSafeBrowsingEnabled(settings, this.customSettings.safeBrowsingEnabled.booleanValue());
        } else if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(this.customSettings.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
        if (this.customSettings.userAgent == null || this.customSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        } else {
            settings.setUserAgentString(this.customSettings.userAgent);
        }
        if (this.customSettings.applicationNameForUserAgent != null && !this.customSettings.applicationNameForUserAgent.isEmpty()) {
            String defaultUserAgent = (this.customSettings.userAgent == null || this.customSettings.userAgent.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent;
            StringBuilder sb = new StringBuilder();
            sb.append(defaultUserAgent);
            sb.append(" ");
            sb.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(sb.toString());
        }
        if (this.customSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.customSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
        settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
        settings.setTextZoom(this.customSettings.textZoom.intValue());
        setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
        if (this.customSettings.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        if (this.customSettings.mixedContentMode != null) {
            settings.setMixedContentMode(this.customSettings.mixedContentMode.intValue());
        }
        settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
        if (this.customSettings.appCachePath != null && !this.customSettings.appCachePath.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
        if (this.customSettings.cacheMode != null) {
            settings.setCacheMode(this.customSettings.cacheMode.intValue());
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS)) {
                WebSettingsCompat.setDisabledActionModeMenuItems(settings, this.customSettings.disabledActionModeMenuItems.intValue());
            } else if (Build.VERSION.SDK_INT >= 24) {
                settings.setDisabledActionModeMenuItems(this.customSettings.disabledActionModeMenuItems.intValue());
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                WebSettingsCompat.setForceDark(settings, this.customSettings.forceDark.intValue());
            } else if (Build.VERSION.SDK_INT >= 29) {
                settings.setForceDark(this.customSettings.forceDark.intValue());
            }
        }
        if (this.customSettings.forceDarkStrategy != null && WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            WebSettingsCompat.setForceDarkStrategy(settings, this.customSettings.forceDarkStrategy.intValue());
        }
        settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
        if (this.customSettings.layoutAlgorithm != null) {
            this.customSettings.layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
        }
        settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
        setInitialScale(this.customSettings.initialScale.intValue());
        settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
        if (WebViewFeature.isFeatureSupported(WebViewFeature.OFF_SCREEN_PRERASTER)) {
            WebSettingsCompat.setOffscreenPreRaster(settings, this.customSettings.offscreenPreRaster.booleanValue());
        } else if (Build.VERSION.SDK_INT >= 23) {
            settings.setOffscreenPreRaster(this.customSettings.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        if (this.customSettings.preferredContentMode != null && this.customSettings.preferredContentMode.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
        if (this.customSettings.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.customSettings.hardwareAcceleration.booleanValue()) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
        if (this.customSettings.regexToCancelSubFramesLoading != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
        }
        setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
        if (this.customSettings.scrollBarDefaultDelayBeforeFade != null) {
            setScrollBarDefaultDelayBeforeFade(this.customSettings.scrollBarDefaultDelayBeforeFade.intValue());
        } else {
            this.customSettings.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
        if (this.customSettings.scrollBarFadeDuration != null) {
            setScrollBarFadeDuration(this.customSettings.scrollBarFadeDuration.intValue());
        } else {
            this.customSettings.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.customSettings.verticalScrollbarThumbColor != null) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
            }
            if (this.customSettings.verticalScrollbarTrackColor != null) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
            }
            if (this.customSettings.horizontalScrollbarThumbColor != null) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
            }
            if (this.customSettings.horizontalScrollbarTrackColor != null) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
            }
        }
        setOverScrollMode(this.customSettings.overScrollMode.intValue());
        if (this.customSettings.networkAvailable != null) {
            setNetworkAvailable(this.customSettings.networkAvailable.booleanValue());
        }
        if (this.customSettings.rendererPriorityPolicy != null && !this.customSettings.rendererPriorityPolicy.isEmpty() && Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.SUPPRESS_ERROR_PAGE)) {
            WebSettingsCompat.setWillSuppressErrorPage(settings, this.customSettings.disableDefaultErrorPage.booleanValue());
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING) && Build.VERSION.SDK_INT >= 29) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, this.customSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY)) {
            WebSettingsCompat.setEnterpriseAuthenticationAppLinkPolicyEnabled(settings, this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && WebViewFeature.isFeatureSupported(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST)) {
            WebSettingsCompat.setRequestedWithHeaderOriginAllowList(settings, this.customSettings.requestedWithHeaderOriginAllowList);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map next : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
        }
        setFindListener(new WebView.FindListener() {
            public void onFindResultReceived(int i, int i2, boolean z) {
                if (!(InAppWebView.this.findInteractionController == null || InAppWebView.this.findInteractionController.channelDelegate == null)) {
                    InAppWebView.this.findInteractionController.channelDelegate.onFindResultReceived(i, i2, z);
                }
                if (InAppWebView.this.channelDelegate != null) {
                    InAppWebView.this.channelDelegate.onFindResultReceived(i, i2, z);
                }
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    InAppWebView.this.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() {
            public void run() {
                if (InAppWebView.this.initialPositionScrollStoppedTask - InAppWebView.this.getScrollY() == 0) {
                    InAppWebView.this.onScrollStopped();
                    return;
                }
                InAppWebView inAppWebView = InAppWebView.this;
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView.this.mainLooperHandler.postDelayed(InAppWebView.this.checkScrollStoppedTask, (long) InAppWebView.this.newCheckScrollStoppedTask);
            }
        };
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() {
                public void run() {
                    if (InAppWebView.this.floatingContextMenu != null) {
                        InAppWebView.this.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                if (str != null && !str.equals("true")) {
                                    InAppWebView.this.mainLooperHandler.postDelayed(InAppWebView.this.checkContextMenuShouldBeClosedTask, (long) InAppWebView.this.newCheckContextMenuShouldBeClosedTaskTask);
                                } else if (InAppWebView.this.floatingContextMenu != null) {
                                    InAppWebView.this.hideContextMenu();
                                }
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() {
            float m_downX;
            float m_downY;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (!InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || !InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            this.m_downX = motionEvent.getX();
                            this.m_downY = motionEvent.getY();
                        } else if (action == 1 || action == 2 || action == 3) {
                            if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
                                motionEvent.setLocation(this.m_downX, motionEvent.getY());
                            } else {
                                motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                            }
                        }
                    }
                    return false;
                } else if (motionEvent.getAction() != 2) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
                if (InAppWebView.this.channelDelegate == null) {
                    return false;
                }
                InAppWebView.this.channelDelegate.onLongPressHitTestResult(fromWebViewHitTestResult);
                return false;
            }
        });
    }

    public final void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(ConsoleLogJS.CONSOLE_LOG_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    public final void setIncognito(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            clearHistory();
            clearCache(true);
            clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            return;
        }
        settings.setCacheMode(-1);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
    }

    public final void setCacheEnabled(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            Context context = getContext();
            if (context != null) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
                return;
            }
            return;
        }
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
    }

    public final void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method == null || !method.equals(ShareTarget.METHOD_POST)) {
            Map<String, String> headers = uRLRequest.getHeaders();
            if (headers != null) {
                loadUrl(url, headers);
            } else {
                loadUrl(url);
            }
        } else {
            postUrl(url, uRLRequest.getBody());
        }
    }

    public final void loadFile(String str) throws IOException {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
        }
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() {
            public void onReceiveValue(Boolean bool) {
            }
        });
    }

    public final void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    public final void takeScreenshot(final Map<String, Object> map, final MethodChannel.Result result) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                int i;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate((float) (-InAppWebView.this.getScrollX()), (float) (-InAppWebView.this.getScrollY()));
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    Map map = map;
                    if (map != null) {
                        Map map2 = (Map) map.get("rect");
                        if (map2 != null) {
                            createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map2.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map2.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map2.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map2.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                        }
                        Double d = (Double) map.get("snapshotWidth");
                        if (d != null) {
                            int floor = (int) Math.floor((d.doubleValue() * ((double) pixelDensity)) + 0.5d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (((float) floor) / (((float) createBitmap.getWidth()) / ((float) createBitmap.getHeight()))), true);
                        }
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        }
                        i = ((Integer) map.get("quality")).intValue();
                    } else {
                        i = 100;
                    }
                    createBitmap.compress(compressFormat, i, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    createBitmap.recycle();
                    result.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                    result.success((Object) null);
                }
            }
        });
    }

    public final void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> hashMap) {
        WebSettings settings = getSettings();
        if (!(hashMap.get("javaScriptEnabled") == null || this.customSettings.javaScriptEnabled == inAppWebViewSettings.javaScriptEnabled)) {
            settings.setJavaScriptEnabled(inAppWebViewSettings.javaScriptEnabled.booleanValue());
        }
        if (!(hashMap.get("useShouldInterceptAjaxRequest") == null || this.customSettings.useShouldInterceptAjaxRequest == inAppWebViewSettings.useShouldInterceptAjaxRequest)) {
            enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, inAppWebViewSettings.useShouldInterceptAjaxRequest.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("useShouldInterceptFetchRequest") == null || this.customSettings.useShouldInterceptFetchRequest == inAppWebViewSettings.useShouldInterceptFetchRequest)) {
            enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, inAppWebViewSettings.useShouldInterceptFetchRequest.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("useOnLoadResource") == null || this.customSettings.useOnLoadResource == inAppWebViewSettings.useOnLoadResource)) {
            enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, inAppWebViewSettings.useOnLoadResource.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("javaScriptCanOpenWindowsAutomatically") == null || this.customSettings.javaScriptCanOpenWindowsAutomatically == inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically)) {
            settings.setJavaScriptCanOpenWindowsAutomatically(inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        }
        if (!(hashMap.get("builtInZoomControls") == null || this.customSettings.builtInZoomControls == inAppWebViewSettings.builtInZoomControls)) {
            settings.setBuiltInZoomControls(inAppWebViewSettings.builtInZoomControls.booleanValue());
        }
        if (!(hashMap.get("displayZoomControls") == null || this.customSettings.displayZoomControls == inAppWebViewSettings.displayZoomControls)) {
            settings.setDisplayZoomControls(inAppWebViewSettings.displayZoomControls.booleanValue());
        }
        if (!(hashMap.get("safeBrowsingEnabled") == null || this.customSettings.safeBrowsingEnabled == inAppWebViewSettings.safeBrowsingEnabled)) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ENABLE)) {
                WebSettingsCompat.setSafeBrowsingEnabled(settings, inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            } else if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            }
        }
        if (!(hashMap.get("mediaPlaybackRequiresUserGesture") == null || this.customSettings.mediaPlaybackRequiresUserGesture == inAppWebViewSettings.mediaPlaybackRequiresUserGesture)) {
            settings.setMediaPlaybackRequiresUserGesture(inAppWebViewSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        }
        if (!(hashMap.get("databaseEnabled") == null || this.customSettings.databaseEnabled == inAppWebViewSettings.databaseEnabled)) {
            settings.setDatabaseEnabled(inAppWebViewSettings.databaseEnabled.booleanValue());
        }
        if (!(hashMap.get("domStorageEnabled") == null || this.customSettings.domStorageEnabled == inAppWebViewSettings.domStorageEnabled)) {
            settings.setDomStorageEnabled(inAppWebViewSettings.domStorageEnabled.booleanValue());
        }
        if (hashMap.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
            String defaultUserAgent = (inAppWebViewSettings.userAgent == null || inAppWebViewSettings.userAgent.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent;
            StringBuilder sb = new StringBuilder();
            sb.append(defaultUserAgent);
            sb.append(" ");
            sb.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(sb.toString());
        }
        if (hashMap.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (!(hashMap.get("thirdPartyCookiesEnabled") == null || this.customSettings.thirdPartyCookiesEnabled == inAppWebViewSettings.thirdPartyCookiesEnabled)) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (!(hashMap.get("useWideViewPort") == null || this.customSettings.useWideViewPort == inAppWebViewSettings.useWideViewPort)) {
            settings.setUseWideViewPort(inAppWebViewSettings.useWideViewPort.booleanValue());
        }
        if (!(hashMap.get("supportZoom") == null || this.customSettings.supportZoom == inAppWebViewSettings.supportZoom)) {
            settings.setSupportZoom(inAppWebViewSettings.supportZoom.booleanValue());
        }
        if (hashMap.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (!(hashMap.get("verticalScrollBarEnabled") == null || this.customSettings.verticalScrollBarEnabled == inAppWebViewSettings.verticalScrollBarEnabled)) {
            setVerticalScrollBarEnabled(inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
        }
        if (!(hashMap.get("horizontalScrollBarEnabled") == null || this.customSettings.horizontalScrollBarEnabled == inAppWebViewSettings.horizontalScrollBarEnabled)) {
            setHorizontalScrollBarEnabled(inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue());
        }
        boolean z = false;
        if (!(hashMap.get("transparentBackground") == null || this.customSettings.transparentBackground == inAppWebViewSettings.transparentBackground)) {
            if (inAppWebViewSettings.transparentBackground.booleanValue()) {
                setBackgroundColor(0);
            } else {
                setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }
        if (hashMap.get("mixedContentMode") != null && (this.customSettings.mixedContentMode == null || !this.customSettings.mixedContentMode.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (!(hashMap.get("supportMultipleWindows") == null || this.customSettings.supportMultipleWindows == inAppWebViewSettings.supportMultipleWindows)) {
            settings.setSupportMultipleWindows(inAppWebViewSettings.supportMultipleWindows.booleanValue());
        }
        if (!(hashMap.get("useOnDownloadStart") == null || this.customSettings.useOnDownloadStart == inAppWebViewSettings.useOnDownloadStart)) {
            if (inAppWebViewSettings.useOnDownloadStart.booleanValue()) {
                setDownloadListener(new DownloadStartListener());
            } else {
                setDownloadListener((DownloadListener) null);
            }
        }
        if (!(hashMap.get("allowContentAccess") == null || this.customSettings.allowContentAccess == inAppWebViewSettings.allowContentAccess)) {
            settings.setAllowContentAccess(inAppWebViewSettings.allowContentAccess.booleanValue());
        }
        if (!(hashMap.get("allowFileAccess") == null || this.customSettings.allowFileAccess == inAppWebViewSettings.allowFileAccess)) {
            settings.setAllowFileAccess(inAppWebViewSettings.allowFileAccess.booleanValue());
        }
        if (!(hashMap.get("allowFileAccessFromFileURLs") == null || this.customSettings.allowFileAccessFromFileURLs == inAppWebViewSettings.allowFileAccessFromFileURLs)) {
            settings.setAllowFileAccessFromFileURLs(inAppWebViewSettings.allowFileAccessFromFileURLs.booleanValue());
        }
        if (!(hashMap.get("allowUniversalAccessFromFileURLs") == null || this.customSettings.allowUniversalAccessFromFileURLs == inAppWebViewSettings.allowUniversalAccessFromFileURLs)) {
            settings.setAllowUniversalAccessFromFileURLs(inAppWebViewSettings.allowUniversalAccessFromFileURLs.booleanValue());
        }
        if (!(hashMap.get("cacheEnabled") == null || this.customSettings.cacheEnabled == inAppWebViewSettings.cacheEnabled)) {
            setCacheEnabled(inAppWebViewSettings.cacheEnabled.booleanValue());
        }
        if (hashMap.get("appCachePath") != null && (this.customSettings.appCachePath == null || !this.customSettings.appCachePath.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (!(hashMap.get("blockNetworkImage") == null || this.customSettings.blockNetworkImage == inAppWebViewSettings.blockNetworkImage)) {
            settings.setBlockNetworkImage(inAppWebViewSettings.blockNetworkImage.booleanValue());
        }
        if (!(hashMap.get("blockNetworkLoads") == null || this.customSettings.blockNetworkLoads == inAppWebViewSettings.blockNetworkLoads)) {
            settings.setBlockNetworkLoads(inAppWebViewSettings.blockNetworkLoads.booleanValue());
        }
        if (hashMap.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (hashMap.get("disabledActionModeMenuItems") != null && (this.customSettings.disabledActionModeMenuItems == null || !this.customSettings.disabledActionModeMenuItems.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS)) {
                WebSettingsCompat.setDisabledActionModeMenuItems(settings, inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            } else if (Build.VERSION.SDK_INT >= 24) {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                WebSettingsCompat.setForceDark(settings, inAppWebViewSettings.forceDark.intValue());
            } else if (Build.VERSION.SDK_INT >= 29) {
                settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
            }
        }
        if (hashMap.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            WebSettingsCompat.setForceDarkStrategy(settings, inAppWebViewSettings.forceDarkStrategy.intValue());
        }
        if (!(hashMap.get("geolocationEnabled") == null || this.customSettings.geolocationEnabled == inAppWebViewSettings.geolocationEnabled)) {
            settings.setGeolocationEnabled(inAppWebViewSettings.geolocationEnabled.booleanValue());
        }
        if (!(hashMap.get("layoutAlgorithm") == null || this.customSettings.layoutAlgorithm == inAppWebViewSettings.layoutAlgorithm)) {
            inAppWebViewSettings.layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
        }
        if (!(hashMap.get("loadWithOverviewMode") == null || this.customSettings.loadWithOverviewMode == inAppWebViewSettings.loadWithOverviewMode)) {
            settings.setLoadWithOverviewMode(inAppWebViewSettings.loadWithOverviewMode.booleanValue());
        }
        if (!(hashMap.get("loadsImagesAutomatically") == null || this.customSettings.loadsImagesAutomatically == inAppWebViewSettings.loadsImagesAutomatically)) {
            settings.setLoadsImagesAutomatically(inAppWebViewSettings.loadsImagesAutomatically.booleanValue());
        }
        if (hashMap.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (!(hashMap.get("needInitialFocus") == null || this.customSettings.needInitialFocus == inAppWebViewSettings.needInitialFocus)) {
            settings.setNeedInitialFocus(inAppWebViewSettings.needInitialFocus.booleanValue());
        }
        if (!(hashMap.get("offscreenPreRaster") == null || this.customSettings.offscreenPreRaster == inAppWebViewSettings.offscreenPreRaster)) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.OFF_SCREEN_PRERASTER)) {
                WebSettingsCompat.setOffscreenPreRaster(settings, inAppWebViewSettings.offscreenPreRaster.booleanValue());
            } else if (Build.VERSION.SDK_INT >= 23) {
                settings.setOffscreenPreRaster(inAppWebViewSettings.offscreenPreRaster.booleanValue());
            }
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i = AnonymousClass21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i == 1) {
                setDesktopMode(true);
            } else if (i == 2 || i == 3) {
                setDesktopMode(false);
            }
        }
        if (!(hashMap.get("saveFormData") == null || this.customSettings.saveFormData == inAppWebViewSettings.saveFormData)) {
            settings.setSaveFormData(inAppWebViewSettings.saveFormData.booleanValue());
        }
        if (!(hashMap.get("incognito") == null || this.customSettings.incognito == inAppWebViewSettings.incognito)) {
            setIncognito(inAppWebViewSettings.incognito.booleanValue());
        }
        if (!(hashMap.get("hardwareAcceleration") == null || this.customSettings.hardwareAcceleration == inAppWebViewSettings.hardwareAcceleration)) {
            if (inAppWebViewSettings.hardwareAcceleration.booleanValue()) {
                setLayerType(2, (Paint) null);
            } else {
                setLayerType(1, (Paint) null);
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && (this.customSettings.regexToCancelSubFramesLoading == null || !this.customSettings.regexToCancelSubFramesLoading.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
            if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map next : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && (this.customSettings.scrollBarDefaultDelayBeforeFade == null || !this.customSettings.scrollBarDefaultDelayBeforeFade.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && (this.customSettings.scrollBarFadeDuration == null || !this.customSettings.scrollBarFadeDuration.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (!(hashMap.get("disableVerticalScroll") == null || this.customSettings.disableVerticalScroll == inAppWebViewSettings.disableVerticalScroll)) {
            setVerticalScrollBarEnabled(!inAppWebViewSettings.disableVerticalScroll.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
        }
        if (!(hashMap.get("disableHorizontalScroll") == null || this.customSettings.disableHorizontalScroll == inAppWebViewSettings.disableHorizontalScroll)) {
            if (!inAppWebViewSettings.disableHorizontalScroll.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                z = true;
            }
            setHorizontalScrollBarEnabled(z);
        }
        if (hashMap.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (!(hashMap.get("networkAvailable") == null || this.customSettings.networkAvailable == inAppWebViewSettings.networkAvailable)) {
            setNetworkAvailable(inAppWebViewSettings.networkAvailable.booleanValue());
        }
        if (hashMap.get("rendererPriorityPolicy") != null && (!(this.customSettings.rendererPriorityPolicy != null && this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority") == inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") && this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") == inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
            }
            if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
            }
            if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (hashMap.get("disableDefaultErrorPage") != null && !Util.objEquals(this.customSettings.disableDefaultErrorPage, inAppWebViewSettings.disableDefaultErrorPage) && WebViewFeature.isFeatureSupported(WebViewFeature.SUPPRESS_ERROR_PAGE)) {
            WebSettingsCompat.setWillSuppressErrorPage(settings, inAppWebViewSettings.disableDefaultErrorPage.booleanValue());
        }
        if (hashMap.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING) && Build.VERSION.SDK_INT >= 29) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (hashMap.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && WebViewFeature.isFeatureSupported(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY)) {
            WebSettingsCompat.setEnterpriseAuthenticationAppLinkPolicyEnabled(settings, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (hashMap.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && WebViewFeature.isFeatureSupported(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST)) {
            WebSettingsCompat.setRequestedWithHeaderOriginAllowList(settings, inAppWebViewSettings.requestedWithHeaderOriginAllowList);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt2 = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt2 != null) {
                webViewAssetLoaderExt2.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView$21  reason: invalid class name */
    static /* synthetic */ class AnonymousClass21 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType[] r0 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType = r0
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.DESKTOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.MOBILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView.AnonymousClass21.<clinit>():void");
        }
    }

    public final Map<String, Object> getCustomSettings() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    public final void enablePluginScriptAtRuntime(final String str, final boolean z, final PluginScript pluginScript) {
        StringBuilder sb = new StringBuilder("window.");
        sb.append(str);
        evaluateJavascript(sb.toString(), (ContentWorld) null, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str != null && !str.equalsIgnoreCase("null")) {
                    StringBuilder sb = new StringBuilder("window.");
                    sb.append(str);
                    sb.append(" = ");
                    sb.append(z);
                    sb.append(";");
                    InAppWebView.this.evaluateJavascript(sb.toString(), (ContentWorld) null, (ValueCallback<String>) null);
                    if (!z) {
                        InAppWebView.this.userContentController.removePluginScript(pluginScript);
                    }
                } else if (z) {
                    InAppWebView.this.evaluateJavascript(pluginScript.getSource(), (ContentWorld) null, (ValueCallback<String>) null);
                    InAppWebView.this.userContentController.addPluginScript(pluginScript);
                }
            }
        });
    }

    public final void injectDeferredObject(String str, ContentWorld contentWorld, String str2, ValueCallback<String> valueCallback) {
        String str3;
        final String str4;
        final String obj = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str3 = String.format(str2, new Object[]{jSONArray2.substring(1, jSONArray2.length() - 1)});
        } else {
            str3 = str;
        }
        if (obj == null || valueCallback == null) {
            str4 = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(obj, valueCallback);
            StringBuilder sb = new StringBuilder("_flutter_inappwebview_");
            sb.append(Math.round(Math.random() * 1000000.0d));
            str4 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, sb.toString()).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, obj);
        }
        final ContentWorld contentWorld2 = contentWorld;
        final ValueCallback<String> valueCallback2 = valueCallback;
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str4, contentWorld2), new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        if (obj == null && valueCallback2 != null) {
                            valueCallback2.onReceiveValue(str);
                        }
                    }
                });
            }
        });
    }

    public final void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, (String) null, valueCallback);
    }

    public final void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                StringBuilder sb = new StringBuilder(" script.type = '");
                sb.append(str3.replaceAll("'", "\\\\'"));
                sb.append("'; ");
                str2 = sb.toString();
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" script.id = '");
                sb2.append(replaceAll);
                sb2.append("'; ");
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append(" script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '");
                sb3.append(replaceAll);
                sb3.append("');  }};");
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append(" script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '");
                sb4.append(replaceAll);
                sb4.append("');  }};");
                str2 = sb4.toString();
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(" script.async = true; ");
                str2 = sb5.toString();
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(" script.defer = true; ");
                str2 = sb6.toString();
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(" script.crossOrigin = '");
                sb7.append(str5.replaceAll("'", "\\\\'"));
                sb7.append("'; ");
                str2 = sb7.toString();
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(" script.integrity = '");
                sb8.append(str6.replaceAll("'", "\\\\'"));
                sb8.append("'; ");
                str2 = sb8.toString();
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(" script.noModule = true; ");
                str2 = sb9.toString();
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str2);
                sb10.append(" script.nonce = '");
                sb10.append(str7.replaceAll("'", "\\\\'"));
                sb10.append("'; ");
                str2 = sb10.toString();
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str2);
                sb11.append(" script.referrerPolicy = '");
                sb11.append(str8.replaceAll("'", "\\\\'"));
                sb11.append("'; ");
                str2 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder("(function(d) { var script = d.createElement('script'); ");
        sb12.append(str2);
        sb12.append(" script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);");
        injectDeferredObject(str, (ContentWorld) null, sb12.toString(), (ValueCallback<String>) null);
    }

    public final void injectCSSCode(String str) {
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", (ValueCallback<String>) null);
    }

    public final void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                StringBuilder sb = new StringBuilder(" link.id = '");
                sb.append(str5.replaceAll("'", "\\\\'"));
                sb.append("'; ");
                str3 = sb.toString();
            } else {
                str3 = str4;
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(" link.media = '");
                sb2.append(str6.replaceAll("'", "\\\\'"));
                sb2.append("'; ");
                str3 = sb2.toString();
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" link.crossOrigin = '");
                sb3.append(str7.replaceAll("'", "\\\\'"));
                sb3.append("'; ");
                str3 = sb3.toString();
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(" link.integrity = '");
                sb4.append(str8.replaceAll("'", "\\\\'"));
                sb4.append("'; ");
                str3 = sb4.toString();
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(" link.referrerPolicy = '");
                sb5.append(str9.replaceAll("'", "\\\\'"));
                sb5.append("'; ");
                str3 = sb5.toString();
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(" link.disabled = true; ");
                str3 = sb6.toString();
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str3);
                sb7.append(" link.title = '");
                sb7.append(str10.replaceAll("'", "\\\\'"));
                sb7.append("'; ");
                str2 = sb7.toString();
            } else {
                str2 = str3;
            }
        } else {
            str2 = str4;
        }
        StringBuilder sb8 = new StringBuilder("(function(d) { var link = d.createElement('link'); link.rel='");
        sb8.append(str4);
        sb8.append("stylesheet'; link.type='text/css'; ");
        sb8.append(str2);
        sb8.append(" link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);");
        injectDeferredObject(str, (ContentWorld) null, sb8.toString(), (ValueCallback<String>) null);
    }

    public final HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put(ImagesContract.URL, itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("list", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i, i2);
        }
    }

    public final void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollTo(num.intValue(), num2.intValue());
    }

    public final void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX() + num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY() + num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollBy(num.intValue(), num2.intValue());
    }

    class DownloadStartListener implements DownloadListener {
        DownloadStartListener() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j, URLUtil.guessFileName(str, str3, str4), (String) null);
            if (InAppWebView.this.channelDelegate != null) {
                InAppWebView.this.channelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }

    public final void setDesktopMode(boolean z) {
        String str;
        WebSettings settings = getSettings();
        if (z) {
            str = settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA");
        } else {
            str = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android");
        }
        settings.setUserAgentString(str);
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    public final String printCurrentPage(PrintJobSettings printJobSettings) {
        PrintManager printManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null || (printManager = (PrintManager) this.plugin.activity.getSystemService("print")) == null) {
            return null;
        }
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle() != null ? getTitle() : getUrl());
        sb.append(" Document");
        String obj = sb.toString();
        if (printJobSettings != null) {
            if (printJobSettings.jobName != null && !printJobSettings.jobName.isEmpty()) {
                obj = printJobSettings.jobName;
            }
            if (printJobSettings.orientation != null) {
                int intValue = printJobSettings.orientation.intValue();
                if (intValue == 0) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                } else if (intValue == 1) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                }
            }
            if (printJobSettings.mediaSize != null) {
                builder.setMediaSize(printJobSettings.mediaSize.toMediaSize());
            }
            if (printJobSettings.colorMode != null) {
                builder.setColorMode(printJobSettings.colorMode.intValue());
            }
            if (printJobSettings.duplexMode != null && Build.VERSION.SDK_INT >= 23) {
                builder.setDuplexMode(printJobSettings.duplexMode.intValue());
            }
            if (printJobSettings.resolution != null) {
                builder.setResolution(printJobSettings.resolution.toResolution());
            }
        }
        PrintJob print = printManager.print(obj, createPrintDocumentAdapter(obj), builder.build());
        if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
            return null;
        }
        String obj2 = UUID.randomUUID().toString();
        PrintJobController printJobController = new PrintJobController(obj2, print, printJobSettings, this.plugin);
        this.plugin.printJobManager.jobs.put(printJobController.id, printJobController);
        return obj2;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu2) {
        super.onCreateContextMenu(contextMenu2);
        sendOnCreateContextMenuEvent();
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(fromWebViewHitTestResult);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i, i2, z, z2);
        boolean z3 = true;
        boolean z4 = canScrollHorizontally() && z;
        if (!canScrollVertically() || !z2) {
            z3 = false;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z3 && i2 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z4 || z3) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i, i2, z4, z3);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && this.containerView != null) {
            this.containerView.getHandler().postDelayed(new Runnable() {
                public void run() {
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (InAppWebView.this.containerView != null && inputMethodManager != null && !inputMethodManager.isAcceptingText()) {
                        inputMethodManager.hideSoftInputFromWindow(InAppWebView.this.containerView.getWindowToken(), 2);
                    }
                }
            }, 128);
        }
        return onCreateInputConnection;
    }

    public final ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        if (!this.customSettings.useHybridComposition.booleanValue() || this.customSettings.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback), callback);
        }
        return super.startActionMode(callback);
    }

    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Map<String, Object> map;
        if (!this.customSettings.useHybridComposition.booleanValue() || this.customSettings.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback, i), callback);
        }
        return super.startActionMode(callback, i);
    }

    public final ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z;
        ActionMode actionMode2 = actionMode;
        if (!this.customSettings.useHybridComposition.booleanValue() && this.containerView != null) {
            onWindowFocusChanged(this.containerView.isFocused());
        }
        final int i = 0;
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z = true;
        } else {
            z = false;
        }
        if (actionMode2 == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (Build.VERSION.SDK_INT >= 23) {
            actionMode2.hide(3000);
        }
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu.booleanValue()) {
            return actionMode2;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map map2 = (Map) this.contextMenu.get("settings");
            if (map2 != null) {
                contextMenuSettings.parse(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        if (contextMenuSettings.hideDefaultSystemContextMenuItems == null || !contextMenuSettings.hideDefaultSystemContextMenuItems.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String charSequence = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
                textView.setText(charSequence);
                final ActionMode.Callback callback2 = callback;
                final ActionMode actionMode3 = actionMode;
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        InAppWebView.this.hideContextMenu();
                        callback2.onActionItemClicked(actionMode3, menuItem);
                        if (InAppWebView.this.channelDelegate != null) {
                            InAppWebView.this.channelDelegate.onContextMenuActionItemClicked(itemId, charSequence);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int intValue = ((Integer) map3.get("id")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    InAppWebView.this.hideContextMenu();
                    if (InAppWebView.this.channelDelegate != null) {
                        InAppWebView.this.channelDelegate.onContextMenuActionItemClicked(intValue, str);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i3 = point != null ? point.x : 0;
        Point point2 = this.lastTouch;
        if (point2 != null) {
            i = point2.y;
        }
        this.contextMenuPoint = new Point(i3, i);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (InAppWebView.this.floatingContextMenu != null) {
                        InAppWebView.this.floatingContextMenu.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i3, i);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i3, i));
            if (z) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode2;
    }

    public final void onFloatingActionGlobalLayout(int i, int i2) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i3 = i - (width2 / 2);
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 + width2 > width) {
            i3 = width - width2;
        }
        float f = ((float) i2) - (((float) height) * 1.5f);
        if (f < 0.0f) {
            f = (float) (i2 + height);
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i3, ((int) f) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                if (InAppWebView.this.floatingContextMenu != null) {
                    InAppWebView.this.floatingContextMenu.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                }
            }
        });
    }

    public final void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    public final void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            adjustFloatingContextMenuPosition();
        }
    }

    public final void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu == null) {
                    return;
                }
                if (str == null || str.equalsIgnoreCase("null")) {
                    InAppWebView.this.floatingContextMenu.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                    return;
                }
                int i = InAppWebView.this.contextMenuPoint.x;
                int parseFloat = (int) (((double) (Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext()))) + (((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d));
                InAppWebView.this.contextMenuPoint.y = parseFloat;
                InAppWebView.this.onFloatingActionGlobalLayout(i, parseFloat);
            }
        });
    }

    public final void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    public final Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put(ImagesContract.URL, peekData.getString(ImagesContract.URL));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    public final Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put(ImagesContract.URL, peekData.getString(ImagesContract.URL));
        return hashMap;
    }

    public final void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String obj = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(obj, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            StringBuilder sb = new StringBuilder("obj.");
            sb.append(next);
            arrayList2.add(sb.toString());
        }
        String join = TextUtils.join(", ", arrayList);
        String join2 = TextUtils.join(", ", arrayList2);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, join2).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, obj).replace(PluginScriptsUtil.VAR_RESULT_UUID, obj), contentWorld), (ValueCallback) null);
    }

    public final void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    public final boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    public final boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    public final WebMessageChannel createCompatWebMessageChannel() {
        String obj = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(obj, this);
        this.webMessageChannels.put(obj, webMessageChannel);
        return webMessageChannel;
    }

    public final WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel createCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(createCompatWebMessageChannel);
        return createCompatWebMessageChannel;
    }

    public final void addWebMessageListener(WebMessageListener webMessageListener) throws Exception {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            WebViewCompat.addWebMessageListener(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public final void disposeWebMessageChannels() {
        for (WebMessageChannel dispose : this.webMessageChannels.values()) {
            dispose.dispose();
        }
        this.webMessageChannels.clear();
    }

    public final void disposeWebMessageListeners() {
        for (WebMessageListener dispose : this.webMessageListeners) {
            dispose.dispose();
        }
        this.webMessageListeners.clear();
    }

    public final Looper getWebViewLooper() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getWebViewLooper();
        }
        return Looper.getMainLooper();
    }

    public final boolean isInFullscreen() {
        return this.inFullscreen;
    }

    public final void setInFullscreen(boolean z) {
        this.inFullscreen = z;
    }

    public final void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) throws Exception {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i);
        } else if (i != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    public final float getZoomScale() {
        return this.zoomScale;
    }

    public final void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public final Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    public final void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public final InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    public final void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public final InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    public final void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate2) {
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
    }

    public final UserContentController getUserContentController() {
        return this.userContentController;
    }

    public final void setUserContentController(UserContentController userContentController2) {
        this.userContentController = userContentController2;
    }

    public final Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    public final void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    public final void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    public final void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    public final void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    public final WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    public final void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    public final void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        if (Build.VERSION.SDK_INT >= 29 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE)) {
            WebViewCompat.setWebViewRenderProcessClient(this, (WebViewRenderProcessClient) null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.userContentController.dispose();
        FindInteractionController findInteractionController2 = this.findInteractionController;
        if (findInteractionController2 != null) {
            findInteractionController2.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt2 = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt2 != null) {
            webViewAssetLoaderExt2.dispose();
            this.webViewAssetLoaderExt = null;
        }
        if (!(this.windowId == null || (inAppWebViewFlutterPlugin = this.plugin) == null || inAppWebViewFlutterPlugin.inAppWebViewManager == null)) {
            this.plugin.inAppWebViewManager.windowWebViewMessages.remove(this.windowId);
        }
        this.mainLooperHandler.removeCallbacksAndMessages((Object) null);
        mHandler.removeCallbacksAndMessages((Object) null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient2 = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient2 != null) {
            inAppWebViewRenderProcessClient2.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient2 = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient2 != null) {
            inAppWebViewChromeClient2.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat2 = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat2 != null) {
            inAppWebViewClientCompat2.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient2 = this.inAppWebViewClient;
        if (inAppWebViewClient2 != null) {
            inAppWebViewClient2.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface2 = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface2 != null) {
            javaScriptBridgeInterface2.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl("about:blank");
    }

    public final void destroy() {
        super.destroy();
    }
}
