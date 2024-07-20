package com.pichillilorenzo.flutter_inappwebview.service_worker;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview.types.WebResourceResponseExt;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static ServiceWorkerControllerCompat serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static void init() {
        if (serviceWorkerController == null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BASIC_USAGE)) {
            serviceWorkerController = ServiceWorkerControllerCompat.getInstance();
        }
    }

    public void setServiceWorkerClient(Boolean bool) {
        ServiceWorkerControllerCompat serviceWorkerControllerCompat = serviceWorkerController;
        if (serviceWorkerControllerCompat != null) {
            serviceWorkerControllerCompat.setServiceWorkerClient(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new ServiceWorkerClientCompat() {
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt webResourceResponseExt;
                    WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (ServiceWorkerManager.this.channelDelegate != null) {
                        try {
                            webResourceResponseExt = ServiceWorkerManager.this.channelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            return null;
                        }
                    } else {
                        webResourceResponseExt = null;
                    }
                    if (webResourceResponseExt == null) {
                        return null;
                    }
                    String contentType = webResourceResponseExt.getContentType();
                    String contentEncoding = webResourceResponseExt.getContentEncoding();
                    byte[] data = webResourceResponseExt.getData();
                    Map<String, String> headers = webResourceResponseExt.getHeaders();
                    Integer statusCode = webResourceResponseExt.getStatusCode();
                    String reasonPhrase = webResourceResponseExt.getReasonPhrase();
                    if (data != null) {
                        byteArrayInputStream = new ByteArrayInputStream(data);
                    }
                    ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                    if (statusCode == null || reasonPhrase == null) {
                        return new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream2);
                    }
                    return new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream2);
                }
            });
        }
    }

    private ServiceWorkerClientCompat dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    static final class DummyServiceWorkerClientCompat extends ServiceWorkerClientCompat {
        static final ServiceWorkerClientCompat INSTANCE = new DummyServiceWorkerClientCompat();

        public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }

        private DummyServiceWorkerClientCompat() {
        }
    }
}
