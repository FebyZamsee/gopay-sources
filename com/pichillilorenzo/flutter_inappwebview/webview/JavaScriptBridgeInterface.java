package com.pichillilorenzo.flutter_inappwebview.webview;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    /* access modifiers changed from: private */
    public InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView2) {
        this.inAppWebView = inAppWebView2;
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView != null) {
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu != null) {
                        JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void _callHandler(final String str, final String str2, final String str3) {
        if (this.inAppWebView != null) {
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                        if (str.equals("onPrintRequest")) {
                            PrintJobSettings printJobSettings = new PrintJobSettings();
                            printJobSettings.handledByClient = Boolean.TRUE;
                            final String printCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
                            if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                                JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), printCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() {
                                    public boolean nonNullSuccess(Boolean bool) {
                                        return !bool.booleanValue();
                                    }

                                    public void defaultBehaviour(Boolean bool) {
                                        PrintJobController printJobController;
                                        if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.plugin != null && JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager != null && (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(printCurrentPage)) != null) {
                                            printJobController.disposeNoCancel();
                                        }
                                    }

                                    public void error(String str, String str2, Object obj) {
                                        defaultBehaviour((Boolean) null);
                                    }
                                });
                            }
                        } else if (str.equals("callAsyncJavaScript")) {
                            try {
                                JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
                                String string = jSONObject.getString("resultUuid");
                                ValueCallback valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(jSONObject.toString());
                                    JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        } else if (str.equals("evaluateJavaScriptWithContentWorld")) {
                            try {
                                JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
                                String string2 = jSONObject2.getString("resultUuid");
                                ValueCallback valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                                    JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        } else if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                            JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(str, str3, new WebViewChannelDelegate.CallJsHandlerCallback() {
                                public void defaultBehaviour(Object obj) {
                                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                                        StringBuilder sb = new StringBuilder("if (window.flutter_inappwebview[");
                                        sb.append(str2);
                                        sb.append("] != null) { window.flutter_inappwebview[");
                                        sb.append(str2);
                                        sb.append("].resolve(");
                                        sb.append(obj);
                                        sb.append("); delete window.flutter_inappwebview[");
                                        sb.append(str2);
                                        sb.append("]; }");
                                        ValueCallback valueCallback = null;
                                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(sb.toString(), (ValueCallback) null);
                                    }
                                }

                                public void error(String str, String str2, Object obj) {
                                    String str3;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    if (str2 != null) {
                                        StringBuilder sb2 = new StringBuilder(", ");
                                        sb2.append(str2);
                                        str3 = sb2.toString();
                                    } else {
                                        str3 = "";
                                    }
                                    sb.append(str3);
                                    String obj2 = sb.toString();
                                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                                        StringBuilder sb3 = new StringBuilder("if (window.flutter_inappwebview[");
                                        sb3.append(str2);
                                        sb3.append("] != null) { window.flutter_inappwebview[");
                                        sb3.append(str2);
                                        sb3.append("].reject(new Error(");
                                        sb3.append(JSONObject.quote(obj2));
                                        sb3.append(")); delete window.flutter_inappwebview[");
                                        sb3.append(str2);
                                        sb3.append("]; }");
                                        ValueCallback valueCallback = null;
                                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(sb3.toString(), (ValueCallback) null);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
