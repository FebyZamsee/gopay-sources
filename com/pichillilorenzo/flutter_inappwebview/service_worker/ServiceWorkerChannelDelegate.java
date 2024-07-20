package com.pichillilorenzo.flutter_inappwebview.service_worker;

import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceResponseExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager2, MethodChannel methodChannel) {
        super(methodChannel);
        this.serviceWorkerManager = serviceWorkerManager2;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        ServiceWorkerManager.init();
        ServiceWorkerControllerCompat serviceWorkerControllerCompat = ServiceWorkerManager.serviceWorkerController;
        ServiceWorkerWebSettingsCompat serviceWorkerWebSettings = serviceWorkerControllerCompat != null ? serviceWorkerControllerCompat.getServiceWorkerWebSettings() : null;
        String str = methodCall.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c = 0;
                    break;
                }
                break;
            case -1165005700:
                if (str.equals("setServiceWorkerClient")) {
                    c = 1;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c = 2;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c = 3;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c = 4;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c = 5;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c = 6;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c = 7;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (serviceWorkerWebSettings == null || !WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS)) {
                    result.success(Boolean.FALSE);
                    return;
                } else {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getAllowContentAccess()));
                    return;
                }
            case 1:
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
                    result.success(Boolean.TRUE);
                    return;
                }
                result.success(Boolean.FALSE);
                return;
            case 2:
                if (serviceWorkerWebSettings == null || !WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CACHE_MODE)) {
                    result.success((Object) null);
                    return;
                } else {
                    result.success(Integer.valueOf(serviceWorkerWebSettings.getCacheMode()));
                    return;
                }
            case 3:
                if (serviceWorkerWebSettings == null || !WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_FILE_ACCESS)) {
                    result.success(Boolean.FALSE);
                    return;
                } else {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getAllowFileAccess()));
                    return;
                }
            case 4:
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CACHE_MODE)) {
                    serviceWorkerWebSettings.setCacheMode(((Integer) methodCall.argument("mode")).intValue());
                }
                result.success(Boolean.TRUE);
                return;
            case 5:
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS)) {
                    serviceWorkerWebSettings.setBlockNetworkLoads(((Boolean) methodCall.argument("flag")).booleanValue());
                }
                result.success(Boolean.TRUE);
                return;
            case 6:
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS)) {
                    serviceWorkerWebSettings.setAllowContentAccess(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                result.success(Boolean.TRUE);
                return;
            case 7:
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_FILE_ACCESS)) {
                    serviceWorkerWebSettings.setAllowFileAccess(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                result.success(Boolean.TRUE);
                return;
            case 8:
                if (serviceWorkerWebSettings == null || !WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS)) {
                    result.success(Boolean.FALSE);
                    return;
                } else {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getBlockNetworkLoads()));
                    return;
                }
            default:
                result.notImplemented();
                return;
        }
    }

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel != null) {
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

    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }
}
