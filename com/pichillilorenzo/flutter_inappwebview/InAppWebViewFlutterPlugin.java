package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview.proxy.ProxyManager;
import com.pichillilorenzo.flutter_inappwebview.service_worker.ServiceWorkerManager;
import com.pichillilorenzo.flutter_inappwebview.tracing.TracingControllerManager;
import com.pichillilorenzo.flutter_inappwebview.webview.FlutterWebViewFactory;
import com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterView;

public class InAppWebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public Activity activity;
    public ActivityPluginBinding activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public FlutterPlugin.FlutterAssets flutterAssets;
    public FlutterView flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewManager inAppWebViewManager;
    public BinaryMessenger messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public PlatformUtil platformUtil;
    public PrintJobManager printJobManager;
    public ProxyManager proxyManager;
    public PluginRegistry.Registrar registrar;
    public ServiceWorkerManager serviceWorkerManager;
    public TracingControllerManager tracingControllerManager;
    public WebViewFeatureManager webViewFeatureManager;

    public static void registerWith(PluginRegistry.Registrar registrar2) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = new InAppWebViewFlutterPlugin();
        inAppWebViewFlutterPlugin.registrar = registrar2;
        inAppWebViewFlutterPlugin.onAttachedToEngine(registrar2.context(), registrar2.messenger(), registrar2.activity(), registrar2.platformViewRegistry(), registrar2.view());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.flutterAssets = flutterPluginBinding.getFlutterAssets();
        onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger(), this.activity, flutterPluginBinding.getPlatformViewRegistry(), (FlutterView) null);
    }

    private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger, Activity activity2, PlatformViewRegistry platformViewRegistry, FlutterView flutterView2) {
        this.applicationContext = context;
        this.activity = activity2;
        this.messenger = binaryMessenger;
        this.flutterView = flutterView2;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        FlutterWebViewFactory flutterWebViewFactory2 = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory2;
        platformViewRegistry.registerViewFactory(FlutterWebViewFactory.VIEW_TYPE_ID, flutterWebViewFactory2);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewManager = new InAppWebViewManager(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        if (Build.VERSION.SDK_INT >= 24) {
            this.serviceWorkerManager = new ServiceWorkerManager(this);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
        this.proxyManager = new ProxyManager(this);
        this.printJobManager = new PrintJobManager(this);
        this.tracingControllerManager = new TracingControllerManager(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        PlatformUtil platformUtil2 = this.platformUtil;
        if (platformUtil2 != null) {
            platformUtil2.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager2 = this.inAppBrowserManager;
        if (inAppBrowserManager2 != null) {
            inAppBrowserManager2.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager2 = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager2 != null) {
            headlessInAppWebViewManager2.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager2 = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager2 != null) {
            chromeSafariBrowserManager2.dispose();
            this.chromeSafariBrowserManager = null;
        }
        MyCookieManager myCookieManager2 = this.myCookieManager;
        if (myCookieManager2 != null) {
            myCookieManager2.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage2 = this.myWebStorage;
        if (myWebStorage2 != null) {
            myWebStorage2.dispose();
            this.myWebStorage = null;
        }
        if (this.credentialDatabaseHandler != null && Build.VERSION.SDK_INT >= 26) {
            this.credentialDatabaseHandler.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewManager inAppWebViewManager2 = this.inAppWebViewManager;
        if (inAppWebViewManager2 != null) {
            inAppWebViewManager2.dispose();
            this.inAppWebViewManager = null;
        }
        if (this.serviceWorkerManager != null && Build.VERSION.SDK_INT >= 24) {
            this.serviceWorkerManager.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager2 = this.webViewFeatureManager;
        if (webViewFeatureManager2 != null) {
            webViewFeatureManager2.dispose();
            this.webViewFeatureManager = null;
        }
        ProxyManager proxyManager2 = this.proxyManager;
        if (proxyManager2 != null) {
            proxyManager2.dispose();
            this.proxyManager = null;
        }
        PrintJobManager printJobManager2 = this.printJobManager;
        if (printJobManager2 != null) {
            printJobManager2.dispose();
            this.printJobManager = null;
        }
        TracingControllerManager tracingControllerManager2 = this.tracingControllerManager;
        if (tracingControllerManager2 != null) {
            tracingControllerManager2.dispose();
            this.tracingControllerManager = null;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding2) {
        this.activityPluginBinding = activityPluginBinding2;
        this.activity = activityPluginBinding2.getActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding2) {
        this.activityPluginBinding = activityPluginBinding2;
        this.activity = activityPluginBinding2.getActivity();
    }

    public void onDetachedFromActivity() {
        this.activityPluginBinding = null;
        this.activity = null;
    }
}
