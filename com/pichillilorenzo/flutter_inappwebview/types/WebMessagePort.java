package com.pichillilorenzo.flutter_inappwebview.types;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.webview.web_message.WebMessageChannel;
import java.util.ArrayList;
import java.util.List;

public class WebMessagePort {
    public boolean isClosed = false;
    public boolean isStarted = false;
    public boolean isTransferred = false;
    public String name;
    public WebMessageChannel webMessageChannel;

    public WebMessagePort(String str, WebMessageChannel webMessageChannel2) {
        this.name = str;
        this.webMessageChannel = webMessageChannel2;
    }

    public void setWebMessageCallback(final ValueCallback<Void> valueCallback) throws Exception {
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        this.isStarted = true;
        WebMessageChannel webMessageChannel2 = this.webMessageChannel;
        InAppWebViewInterface inAppWebViewInterface = (webMessageChannel2 == null || webMessageChannel2.webView == null) ? null : this.webMessageChannel.webView;
        if (inAppWebViewInterface != null) {
            boolean equals = this.name.equals("port1");
            StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
            sb.append(this.webMessageChannel.id);
            sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
            sb.append(this.name);
            sb.append(".onmessage = function (event) {          window.flutter_inappwebview.callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '");
            sb.append(this.webMessageChannel.id);
            sb.append("',              'index': ");
            sb.append(true ^ equals ? 1 : 0);
            sb.append(",              'message': event.data          });      }  }})();");
            inAppWebViewInterface.evaluateJavascript(sb.toString(), (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    ValueCallback valueCallback = valueCallback;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue((Object) null);
                    }
                }
            });
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    public void postMessage(WebMessage webMessage, final ValueCallback<Void> valueCallback) throws Exception {
        String str;
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        WebMessageChannel webMessageChannel2 = this.webMessageChannel;
        InAppWebViewInterface inAppWebViewInterface = (webMessageChannel2 == null || webMessageChannel2.webView == null) ? null : this.webMessageChannel.webView;
        if (inAppWebViewInterface != null) {
            List<WebMessagePort> list = webMessage.ports;
            String str2 = "null";
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (WebMessagePort next : list) {
                    if (next == this) {
                        throw new Exception("Source port cannot be transferred");
                    } else if (next.isStarted) {
                        throw new Exception("Port is already started");
                    } else if (next.isClosed || next.isTransferred) {
                        throw new Exception("Port is already closed or transferred");
                    } else {
                        next.isTransferred = true;
                        StringBuilder sb = new StringBuilder("window.flutter_inappwebview._webMessageChannels['");
                        sb.append(this.webMessageChannel.id);
                        sb.append("'].");
                        sb.append(next.name);
                        arrayList.add(sb.toString());
                    }
                }
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(TextUtils.join(", ", arrayList));
                sb2.append("]");
                str = sb2.toString();
            } else {
                str = str2;
            }
            if (webMessage.data != null) {
                str2 = Util.replaceAll(webMessage.data, "'", "\\'");
            }
            StringBuilder sb3 = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
            sb3.append(this.webMessageChannel.id);
            sb3.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
            sb3.append(this.name);
            sb3.append(".postMessage('");
            sb3.append(str2);
            sb3.append("', ");
            sb3.append(str);
            sb3.append(");  }})();");
            inAppWebViewInterface.evaluateJavascript(sb3.toString(), (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue((Object) null);
                }
            });
        } else {
            valueCallback.onReceiveValue((Object) null);
        }
        webMessage.dispose();
    }

    public void close(final ValueCallback<Void> valueCallback) throws Exception {
        if (!this.isTransferred) {
            this.isClosed = true;
            WebMessageChannel webMessageChannel2 = this.webMessageChannel;
            InAppWebViewInterface inAppWebViewInterface = (webMessageChannel2 == null || webMessageChannel2.webView == null) ? null : this.webMessageChannel.webView;
            if (inAppWebViewInterface != null) {
                StringBuilder sb = new StringBuilder("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
                sb.append(this.webMessageChannel.id);
                sb.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
                sb.append(this.name);
                sb.append(".close();  }})();");
                inAppWebViewInterface.evaluateJavascript(sb.toString(), (ContentWorld) null, new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        valueCallback.onReceiveValue((Object) null);
                    }
                });
                return;
            }
            valueCallback.onReceiveValue((Object) null);
            return;
        }
        throw new Exception("Port is already transferred");
    }

    public void dispose() {
        this.isClosed = true;
        this.webMessageChannel = null;
    }
}
