package com.pichillilorenzo.flutter_inappwebview.types;

import android.content.Context;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebViewAssetLoaderExt implements Disposable {
    public List<PathHandlerExt> customPathHandlers;
    public WebViewAssetLoader loader;

    public WebViewAssetLoaderExt(WebViewAssetLoader webViewAssetLoader, List<PathHandlerExt> list) {
        this.loader = webViewAssetLoader;
        this.customPathHandlers = list;
    }

    public static WebViewAssetLoaderExt fromMap(Map<String, Object> map, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context) {
        if (map == null) {
            return null;
        }
        WebViewAssetLoader.Builder builder = new WebViewAssetLoader.Builder();
        String str = (String) map.get("domain");
        Boolean bool = (Boolean) map.get("httpAllowed");
        List<Map> list = (List) map.get("pathHandlers");
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            builder.setDomain(str);
        }
        if (bool != null) {
            builder.setHttpAllowed(bool.booleanValue());
        }
        if (list != null) {
            for (Map map2 : list) {
                String str2 = (String) map2.get("type");
                String str3 = (String) map2.get("path");
                if (!(str2 == null || str3 == null)) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    char c = 65535;
                    if (hashCode != -1506882528) {
                        if (hashCode != -667829310) {
                            if (hashCode == 1490480039 && str2.equals("InternalStoragePathHandler")) {
                                c = 2;
                            }
                        } else if (str2.equals("AssetsPathHandler")) {
                            c = 1;
                        }
                    } else if (str2.equals("ResourcesPathHandler")) {
                        c = 0;
                    }
                    if (c == 0) {
                        builder.addPathHandler(str3, new WebViewAssetLoader.ResourcesPathHandler(context));
                    } else if (c == 1) {
                        builder.addPathHandler(str3, new WebViewAssetLoader.AssetsPathHandler(context));
                    } else if (c != 2) {
                        String str4 = (String) map2.get("id");
                        if (str4 != null) {
                            PathHandlerExt pathHandlerExt = new PathHandlerExt(str4, inAppWebViewFlutterPlugin);
                            builder.addPathHandler(str3, pathHandlerExt);
                            arrayList.add(pathHandlerExt);
                        }
                    } else {
                        String str5 = (String) map2.get("directory");
                        if (str5 != null) {
                            builder.addPathHandler(str3, new WebViewAssetLoader.InternalStoragePathHandler(context, new File(str5)));
                        }
                    }
                }
            }
        }
        return new WebViewAssetLoaderExt(builder.build(), arrayList);
    }

    public void dispose() {
        for (PathHandlerExt dispose : this.customPathHandlers) {
            dispose.dispose();
        }
        this.customPathHandlers.clear();
    }

    public static class PathHandlerExt implements WebViewAssetLoader.PathHandler, Disposable {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;
        public String id;

        public PathHandlerExt(String str, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.id = str;
            BinaryMessenger binaryMessenger = inAppWebViewFlutterPlugin.messenger;
            StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
            sb.append(str);
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
        }

        public WebResourceResponse handle(String str) {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            ByteArrayInputStream byteArrayInputStream = null;
            if (pathHandlerExtChannelDelegate != null) {
                try {
                    WebResourceResponseExt handle = pathHandlerExtChannelDelegate.handle(str);
                    if (handle != null) {
                        String contentType = handle.getContentType();
                        String contentEncoding = handle.getContentEncoding();
                        byte[] data = handle.getData();
                        Map<String, String> headers = handle.getHeaders();
                        Integer statusCode = handle.getStatusCode();
                        String reasonPhrase = handle.getReasonPhrase();
                        if (data != null) {
                            byteArrayInputStream = new ByteArrayInputStream(data);
                        }
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        if (statusCode == null || reasonPhrase == null) {
                            return new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream2);
                        }
                        return new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream2);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        public void dispose() {
            PathHandlerExtChannelDelegate pathHandlerExtChannelDelegate = this.channelDelegate;
            if (pathHandlerExtChannelDelegate != null) {
                pathHandlerExtChannelDelegate.dispose();
                this.channelDelegate = null;
            }
        }
    }

    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl {
        private PathHandlerExt pathHandler;

        public PathHandlerExtChannelDelegate(PathHandlerExt pathHandlerExt, MethodChannel methodChannel) {
            super(methodChannel);
            this.pathHandler = pathHandlerExt;
        }

        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
            public WebResourceResponseExt decodeResult(Object obj) {
                return WebResourceResponseExt.fromMap((Map) obj);
            }
        }

        public void handle(String str, HandleCallback handleCallback) {
            MethodChannel channel = getChannel();
            if (channel != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", str);
                channel.invokeMethod("handle", hashMap, handleCallback);
            }
        }

        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
            public WebResourceResponseExt decodeResult(Object obj) {
                return new HandleCallback().decodeResult(obj);
            }
        }

        public WebResourceResponseExt handle(String str) throws InterruptedException {
            MethodChannel channel = getChannel();
            if (channel == null) {
                return null;
            }
            SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            HashMap hashMap = new HashMap();
            hashMap.put("path", str);
            return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "handle", hashMap, syncHandleCallback);
        }

        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }
    }
}
