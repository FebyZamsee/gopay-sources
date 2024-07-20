package com.pichillilorenzo.flutter_inappwebview.proxy;

import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.ProxyRuleExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static ProxyController proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (proxyController == null && WebViewFeature.isFeatureSupported(WebViewFeature.PROXY_OVERRIDE)) {
            proxyController = ProxyController.getInstance();
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.hashCode();
        if (!str.equals("clearProxyOverride")) {
            if (!str.equals("setProxyOverride")) {
                result.notImplemented();
            } else if (proxyController != null) {
                HashMap hashMap = (HashMap) methodCall.argument("settings");
                ProxySettings proxySettings = new ProxySettings();
                if (hashMap != null) {
                    proxySettings.parse((Map) hashMap);
                }
                setProxyOverride(proxySettings, result);
            } else {
                result.success(Boolean.FALSE);
            }
        } else if (proxyController != null) {
            clearProxyOverride(result);
        } else {
            result.success(Boolean.FALSE);
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final MethodChannel.Result result) {
        if (proxyController != null) {
            ProxyConfig.Builder builder = new ProxyConfig.Builder();
            for (String addBypassRule : proxySettings.bypassRules) {
                builder.addBypassRule(addBypassRule);
            }
            for (String addDirect : proxySettings.directs) {
                builder.addDirect(addDirect);
            }
            for (ProxyRuleExt next : proxySettings.proxyRules) {
                if (next.getSchemeFilter() != null) {
                    builder.addProxyRule(next.getUrl(), next.getSchemeFilter());
                } else {
                    builder.addProxyRule(next.getUrl());
                }
            }
            if (proxySettings.bypassSimpleHostnames != null && proxySettings.bypassSimpleHostnames.booleanValue()) {
                builder.bypassSimpleHostnames();
            }
            if (proxySettings.removeImplicitRules != null && proxySettings.removeImplicitRules.booleanValue()) {
                builder.removeImplicitRules();
            }
            if (proxySettings.reverseBypassEnabled != null && WebViewFeature.isFeatureSupported(WebViewFeature.PROXY_OVERRIDE_REVERSE_BYPASS)) {
                builder.setReverseBypassEnabled(proxySettings.reverseBypassEnabled.booleanValue());
            }
            proxyController.setProxyOverride(builder.build(), new Executor() {
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() {
                public void run() {
                    result.success(Boolean.TRUE);
                }
            });
        }
    }

    private void clearProxyOverride(final MethodChannel.Result result) {
        ProxyController proxyController2 = proxyController;
        if (proxyController2 != null) {
            proxyController2.clearProxyOverride(new Executor() {
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() {
                public void run() {
                    result.success(Boolean.TRUE);
                }
            });
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
}
