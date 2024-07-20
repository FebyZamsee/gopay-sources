package com.pichillilorenzo.flutter_inappwebview.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public WebViewCompat.WebMessageListener listener;
    public JavaScriptReplyProxy replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, String str2, Set<String> set) {
        this.id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
        sb.append(this.id);
        sb.append("_");
        sb.append(this.jsObjectName);
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
        if (this.webView instanceof InAppWebView) {
            this.listener = new WebViewCompat.WebMessageListener() {
                public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
                    WebMessageListener.this.replyProxy = javaScriptReplyProxy;
                    if (WebMessageListener.this.channelDelegate != null) {
                        WebMessageListener.this.channelDelegate.onPostMessage(webMessageCompat.getData(), uri.toString().equals("null") ? null : uri.toString(), z);
                    }
                }
            };
        }
    }

    public void initJsInstance() {
        String str;
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String next : this.allowedOriginRules) {
                if (ProxyConfig.MATCH_ALL_SCHEMES.equals(next)) {
                    arrayList.add("'*'");
                } else {
                    Uri parse = Uri.parse(next);
                    Object obj = "null";
                    if (parse.getHost() != null) {
                        StringBuilder sb = new StringBuilder("'");
                        sb.append(Util.replaceAll(parse.getHost(), "'", "\\'"));
                        sb.append("'");
                        str = sb.toString();
                    } else {
                        str = obj;
                    }
                    StringBuilder sb2 = new StringBuilder("{scheme: '");
                    sb2.append(parse.getScheme());
                    sb2.append("', host: ");
                    sb2.append(str);
                    sb2.append(", port: ");
                    Object obj2 = obj;
                    if (parse.getPort() != -1) {
                        obj2 = Integer.valueOf(parse.getPort());
                    }
                    sb2.append(obj2);
                    sb2.append("}");
                    arrayList.add(sb2.toString());
                }
            }
            String join = TextUtils.join(", ", arrayList);
            StringBuilder sb3 = new StringBuilder("(function() {  var allowedOriginRules = [");
            sb3.append(join);
            sb3.append("];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.flutter_inappwebview._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['");
            sb3.append(replaceAll);
            sb3.append("'] = new FlutterInAppWebViewWebMessageListener('");
            sb3.append(replaceAll);
            sb3.append("');  }})();");
            String obj3 = sb3.toString();
            UserContentController userContentController = this.webView.getUserContentController();
            StringBuilder sb4 = new StringBuilder("WebMessageListener-");
            sb4.append(this.jsObjectName);
            userContentController.addPluginScript(new PluginScript(sb4.toString(), obj3, UserScriptInjectionTime.AT_DOCUMENT_START, (ContentWorld) null, false, (Set<String>) null));
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, binaryMessenger, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() throws Exception {
        int i = 0;
        for (String next : this.allowedOriginRules) {
            if (next == null) {
                StringBuilder sb = new StringBuilder("allowedOriginRules[");
                sb.append(i);
                sb.append("] is null");
                throw new Exception(sb.toString());
            } else if (next.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("allowedOriginRules[");
                sb2.append(i);
                sb2.append("] is empty");
                throw new Exception(sb2.toString());
            } else if (!ProxyConfig.MATCH_ALL_SCHEMES.equals(next)) {
                Uri parse = Uri.parse(next);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    StringBuilder sb3 = new StringBuilder("allowedOriginRules ");
                    sb3.append(next);
                    sb3.append(" is invalid");
                    throw new Exception(sb3.toString());
                } else if ((ProxyConfig.MATCH_HTTP.equals(scheme) || ProxyConfig.MATCH_HTTPS.equals(scheme)) && (host == null || host.isEmpty())) {
                    StringBuilder sb4 = new StringBuilder("allowedOriginRules ");
                    sb4.append(next);
                    sb4.append(" is invalid");
                    throw new Exception(sb4.toString());
                } else if (!ProxyConfig.MATCH_HTTP.equals(scheme) && !ProxyConfig.MATCH_HTTPS.equals(scheme) && (host != null || port != -1)) {
                    StringBuilder sb5 = new StringBuilder("allowedOriginRules ");
                    sb5.append(next);
                    sb5.append(" is invalid");
                    throw new Exception(sb5.toString());
                } else if ((host == null || host.isEmpty()) && port != -1) {
                    StringBuilder sb6 = new StringBuilder("allowedOriginRules ");
                    sb6.append(next);
                    sb6.append(" is invalid");
                    throw new Exception(sb6.toString());
                } else if (path.isEmpty()) {
                    if (host != null) {
                        int indexOf = host.indexOf(ProxyConfig.MATCH_ALL_SCHEMES);
                        if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                            StringBuilder sb7 = new StringBuilder("allowedOriginRules ");
                            sb7.append(next);
                            sb7.append(" is invalid");
                            throw new Exception(sb7.toString());
                        } else if (host.startsWith("[")) {
                            if (!host.endsWith("]")) {
                                StringBuilder sb8 = new StringBuilder("allowedOriginRules ");
                                sb8.append(next);
                                sb8.append(" is invalid");
                                throw new Exception(sb8.toString());
                            } else if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                                StringBuilder sb9 = new StringBuilder("allowedOriginRules ");
                                sb9.append(next);
                                sb9.append(" is invalid");
                                throw new Exception(sb9.toString());
                            }
                        }
                    }
                    i++;
                } else {
                    StringBuilder sb10 = new StringBuilder("allowedOriginRules ");
                    sb10.append(next);
                    sb10.append(" is invalid");
                    throw new Exception(sb10.toString());
                }
            }
        }
    }

    public void postMessageForInAppWebView(String str, MethodChannel.Result result) {
        if (this.replyProxy != null && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            this.replyProxy.postMessage(str);
        }
        result.success(Boolean.TRUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOriginAllowed(java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.allowedOriginRules
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x00fa
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "*"
            boolean r4 = r3.equals(r1)
            r5 = 1
            if (r4 == 0) goto L_0x001d
            return r5
        L_0x001d:
            if (r12 == 0) goto L_0x0006
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L_0x0006
            r4 = -1
            if (r12 == 0) goto L_0x002e
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L_0x003a
        L_0x002e:
            if (r13 == 0) goto L_0x0036
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x003a
        L_0x0036:
            if (r14 == 0) goto L_0x0006
            if (r14 == r4) goto L_0x0006
        L_0x003a:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            int r6 = r1.getPort()
            r7 = 80
            java.lang.String r8 = "https"
            r9 = 443(0x1bb, float:6.21E-43)
            if (r6 == r4) goto L_0x0055
            int r6 = r1.getPort()
            if (r6 == 0) goto L_0x0055
            int r6 = r1.getPort()
            goto L_0x0064
        L_0x0055:
            java.lang.String r6 = r1.getScheme()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0062
            r6 = 443(0x1bb, float:6.21E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 80
        L_0x0064:
            if (r14 == 0) goto L_0x006a
            if (r14 == r4) goto L_0x006a
            r7 = r14
            goto L_0x0073
        L_0x006a:
            boolean r4 = r8.equals(r12)
            if (r4 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r7 = 443(0x1bb, float:6.21E-43)
        L_0x0073:
            java.lang.String r4 = r1.getHost()
            r8 = 0
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = r1.getHost()
            java.lang.String r9 = "["
            boolean r4 = r4.startsWith(r9)
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = r1.getHost()     // Catch:{ Exception -> 0x009c }
            java.lang.String r9 = r1.getHost()     // Catch:{ Exception -> 0x009c }
            int r9 = r9.length()     // Catch:{ Exception -> 0x009c }
            int r9 = r9 - r5
            java.lang.String r4 = r4.substring(r5, r9)     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = com.pichillilorenzo.flutter_inappwebview.Util.normalizeIPv6(r4)     // Catch:{ Exception -> 0x009c }
            goto L_0x009d
        L_0x009c:
            r4 = r8
        L_0x009d:
            java.lang.String r8 = com.pichillilorenzo.flutter_inappwebview.Util.normalizeIPv6(r13)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            java.lang.String r9 = r1.getScheme()
            boolean r9 = r9.equals(r12)
            java.lang.String r10 = r1.getHost()
            if (r10 == 0) goto L_0x00ef
            java.lang.String r10 = r1.getHost()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x00ef
            java.lang.String r10 = r1.getHost()
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x00ef
            java.lang.String r10 = r1.getHost()
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L_0x00e3
            if (r13 == 0) goto L_0x00e3
            java.lang.String r1 = r1.getHost()
            java.lang.String r3 = "\\*"
            java.lang.String[] r1 = r1.split(r3)
            r1 = r1[r5]
            boolean r1 = r13.contains(r1)
            if (r1 != 0) goto L_0x00ef
        L_0x00e3:
            if (r8 == 0) goto L_0x00ed
            if (r4 == 0) goto L_0x00ed
            boolean r1 = r8.equals(r4)
            if (r1 != 0) goto L_0x00ef
        L_0x00ed:
            r1 = 0
            goto L_0x00f0
        L_0x00ef:
            r1 = 1
        L_0x00f0:
            if (r6 != r7) goto L_0x00f3
            r2 = 1
        L_0x00f3:
            if (r9 == 0) goto L_0x0006
            if (r1 == 0) goto L_0x0006
            if (r2 == 0) goto L_0x0006
            return r5
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageListener.isOriginAllowed(java.lang.String, java.lang.String, int):boolean");
    }

    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }
}
