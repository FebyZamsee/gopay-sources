package com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InAppWebViewChromeClient extends WebChromeClient implements PluginRegistry.ActivityResultListener, ActivityResultListener {
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES = "*/*";
    final Map<DialogInterface, JsResult> dialogs = new HashMap();
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri imageOutputFileUri;
    private InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebView inAppWebView;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    private Uri videoOutputFileUri;

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, InAppWebView inAppWebView2, InAppBrowserDelegate inAppBrowserDelegate2) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.inAppWebView = inAppWebView2;
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().add(this);
        }
        if (inAppWebViewFlutterPlugin.registrar != null) {
            inAppWebViewFlutterPlugin.registrar.addActivityResultListener(this);
        } else if (inAppWebViewFlutterPlugin.activityPluginBinding != null) {
            inAppWebViewFlutterPlugin.activityPluginBinding.addActivityResultListener(this);
        }
    }

    public Bitmap getDefaultVideoPoster() {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.customSettings.defaultVideoPoster == null) {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
        byte[] bArr = this.inAppWebView.customSettings.defaultVideoPoster;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public void onHideCustomView() {
        ViewGroup rootView;
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            View view = this.mCustomView;
            if (view != null) {
                ((FrameLayout) rootView).removeView(view);
            }
            this.mCustomView = null;
            rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            activity.setRequestedOrientation(this.mOriginalOrientation);
            WebChromeClient.CustomViewCallback customViewCallback = this.mCustomViewCallback;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.mCustomViewCallback = null;
            activity.getWindow().clearFlags(512);
            InAppWebView inAppWebView2 = this.inAppWebView;
            if (inAppWebView2 != null) {
                WebViewChannelDelegate webViewChannelDelegate = inAppWebView2.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onExitFullscreen();
                }
                this.inAppWebView.setInFullscreen(false);
            }
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup rootView;
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
            this.mOriginalOrientation = activity.getRequestedOrientation();
            this.mCustomViewCallback = customViewCallback;
            View view2 = this.mCustomView;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT);
            activity.getWindow().setFlags(512, 512);
            ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
            InAppWebView inAppWebView2 = this.inAppWebView;
            if (inAppWebView2 != null) {
                WebViewChannelDelegate webViewChannelDelegate = inAppWebView2.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onEnterFullscreen();
                }
                this.inAppWebView.setInFullscreen(true);
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, final String str2, final JsResult jsResult) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return false;
        }
        this.inAppWebView.channelDelegate.onJsAlert(str, str2, (Boolean) null, new WebViewChannelDelegate.JsAlertCallback() {
            public boolean nonNullSuccess(JsAlertResponse jsAlertResponse) {
                int i = 1;
                if (!jsAlertResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsAlertResponse.getAction();
                if (action != null) {
                    i = action.intValue();
                }
                if (i != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }

            public void defaultBehaviour(JsAlertResponse jsAlertResponse) {
                String str;
                String str2 = null;
                if (jsAlertResponse != null) {
                    str2 = jsAlertResponse.getMessage();
                    str = jsAlertResponse.getConfirmButtonTitle();
                } else {
                    str = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(str2, jsResult, str2, str);
            }

            public void error(String str, String str2, Object obj) {
                jsResult.cancel();
            }
        });
        return true;
    }

    public void createAlertDialog(String str, final JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass2 r6 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Dialog_Alert);
            builder.setMessage((CharSequence) str);
            if (str3 == null || str3.isEmpty()) {
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) r6);
            } else {
                builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) r6);
            }
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            AlertDialog create = builder.create();
            this.dialogs.put(create, jsResult);
            create.show();
        }
    }

    public boolean onJsConfirm(WebView webView, String str, final String str2, final JsResult jsResult) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return false;
        }
        this.inAppWebView.channelDelegate.onJsConfirm(str, str2, (Boolean) null, new WebViewChannelDelegate.JsConfirmCallback() {
            public boolean nonNullSuccess(JsConfirmResponse jsConfirmResponse) {
                int i = 1;
                if (!jsConfirmResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsConfirmResponse.getAction();
                if (action != null) {
                    i = action.intValue();
                }
                if (i != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }

            public void defaultBehaviour(JsConfirmResponse jsConfirmResponse) {
                String str;
                String str2;
                String str3;
                if (jsConfirmResponse != null) {
                    String message = jsConfirmResponse.getMessage();
                    String confirmButtonTitle = jsConfirmResponse.getConfirmButtonTitle();
                    str = jsConfirmResponse.getCancelButtonTitle();
                    str3 = message;
                    str2 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(str2, jsResult, str3, str2, str);
            }

            public void error(String str, String str2, Object obj) {
                jsResult.cancel();
            }
        });
        return true;
    }

    public void createConfirmDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass5 r7 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass6 r0 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Dialog_Alert);
            builder.setMessage((CharSequence) str);
            if (str3 == null || str3.isEmpty()) {
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) r7);
            } else {
                builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) r7);
            }
            if (str4 == null || str4.isEmpty()) {
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) r0);
            } else {
                builder.setNegativeButton((CharSequence) str4, (DialogInterface.OnClickListener) r0);
            }
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            AlertDialog create = builder.create();
            this.dialogs.put(create, jsResult);
            create.show();
        }
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return false;
        }
        final JsPromptResult jsPromptResult2 = jsPromptResult;
        final WebView webView2 = webView;
        final String str4 = str2;
        final String str5 = str3;
        this.inAppWebView.channelDelegate.onJsPrompt(str, str2, str3, (Boolean) null, new WebViewChannelDelegate.JsPromptCallback() {
            public boolean nonNullSuccess(JsPromptResponse jsPromptResponse) {
                int i = 1;
                if (!jsPromptResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsPromptResponse.getAction();
                if (action != null) {
                    i = action.intValue();
                }
                if (i != 0) {
                    jsPromptResult2.cancel();
                    return false;
                }
                jsPromptResult2.confirm(jsPromptResponse.getValue());
                return false;
            }

            public void defaultBehaviour(JsPromptResponse jsPromptResponse) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                if (jsPromptResponse != null) {
                    String message = jsPromptResponse.getMessage();
                    String defaultValue = jsPromptResponse.getDefaultValue();
                    String value = jsPromptResponse.getValue();
                    String confirmButtonTitle = jsPromptResponse.getConfirmButtonTitle();
                    str2 = jsPromptResponse.getCancelButtonTitle();
                    str5 = message;
                    str4 = defaultValue;
                    str3 = value;
                    str = confirmButtonTitle;
                } else {
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(webView2, str4, str5, jsPromptResult2, str5, str4, str3, str2, str);
            }

            public void error(String str, String str2, Object obj) {
                jsPromptResult2.cancel();
            }
        });
        return true;
    }

    public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        AnonymousClass9 r3 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                JsPromptResult jsPromptResult = jsPromptResult;
                String str = str5;
                if (str != null) {
                    obj = str;
                }
                jsPromptResult.confirm(obj);
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass10 r5 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Dialog_Alert);
            builder.setMessage((CharSequence) str);
            if (str7 == null || str7.isEmpty()) {
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) r3);
            } else {
                builder.setPositiveButton((CharSequence) str7, (DialogInterface.OnClickListener) r3);
            }
            if (str6 == null || str6.isEmpty()) {
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) r5);
            } else {
                builder.setNegativeButton((CharSequence) str6, (DialogInterface.OnClickListener) r5);
            }
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsPromptResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            AlertDialog create = builder.create();
            create.setView(frameLayout);
            this.dialogs.put(create, jsPromptResult);
            create.show();
        }
    }

    public boolean onJsBeforeUnload(WebView webView, String str, final String str2, final JsResult jsResult) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return false;
        }
        this.inAppWebView.channelDelegate.onJsBeforeUnload(str, str2, new WebViewChannelDelegate.JsBeforeUnloadCallback() {
            public boolean nonNullSuccess(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                int i = 1;
                if (!jsBeforeUnloadResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsBeforeUnloadResponse.getAction();
                if (action != null) {
                    i = action.intValue();
                }
                if (i != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }

            public void defaultBehaviour(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                String str;
                String str2;
                String str3;
                if (jsBeforeUnloadResponse != null) {
                    String message = jsBeforeUnloadResponse.getMessage();
                    String confirmButtonTitle = jsBeforeUnloadResponse.getConfirmButtonTitle();
                    str = jsBeforeUnloadResponse.getCancelButtonTitle();
                    str3 = message;
                    str2 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(str2, jsResult, str3, str2, str);
            }

            public void error(String str, String str2, Object obj) {
                jsResult.cancel();
            }
        });
        return true;
    }

    public void createBeforeUnloadDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass13 r7 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass14 r0 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Dialog_Alert);
            builder.setMessage((CharSequence) str);
            if (str3 == null || str3.isEmpty()) {
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) r7);
            } else {
                builder.setPositiveButton((CharSequence) str3, (DialogInterface.OnClickListener) r7);
            }
            if (str4 == null || str4.isEmpty()) {
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) r0);
            } else {
                builder.setNegativeButton((CharSequence) str4, (DialogInterface.OnClickListener) r0);
            }
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            AlertDialog create = builder.create();
            this.dialogs.put(create, jsResult);
            create.show();
        }
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        final int i;
        String string;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.inAppWebViewManager == null) {
            i = 0;
        } else {
            this.plugin.inAppWebViewManager.windowAutoincrementId++;
            i = this.plugin.inAppWebViewManager.windowAutoincrementId;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            Message obtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            Bundle data = obtainMessage.getData();
            if (!(data == null || (string = data.getString(ImagesContract.URL)) == null || string.isEmpty())) {
                extra = string;
            }
        }
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, ShareTarget.METHOD_GET, (byte[]) null, (Map<String, String>) null), true, z2, false, i, z);
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
        if (!(inAppWebViewFlutterPlugin2 == null || inAppWebViewFlutterPlugin2.inAppWebViewManager == null)) {
            this.plugin.inAppWebViewManager.windowWebViewMessages.put(Integer.valueOf(i), message);
        }
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return false;
        }
        this.inAppWebView.channelDelegate.onCreateWindow(createWindowAction, new WebViewChannelDelegate.CreateWindowCallback() {
            public boolean nonNullSuccess(Boolean bool) {
                return !bool.booleanValue();
            }

            public void defaultBehaviour(Boolean bool) {
                if (InAppWebViewChromeClient.this.plugin != null && InAppWebViewChromeClient.this.plugin.inAppWebViewManager != null) {
                    InAppWebViewChromeClient.this.plugin.inAppWebViewManager.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((Boolean) null);
            }
        });
        return true;
    }

    public void onCloseWindow(WebView webView) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (!(inAppWebView2 == null || inAppWebView2.channelDelegate == null)) {
            this.inAppWebView.channelDelegate.onCloseWindow();
        }
        super.onCloseWindow(webView);
    }

    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        AnonymousClass17 r0 = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback() {
            public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(geolocationPermissionShowPromptResponse.getOrigin(), geolocationPermissionShowPromptResponse.isAllow(), geolocationPermissionShowPromptResponse.isRetain());
                return false;
            }

            public void defaultBehaviour(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(str, false, false);
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((GeolocationPermissionShowPromptResponse) null);
            }
        };
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            r0.defaultBehaviour(null);
        } else {
            this.inAppWebView.channelDelegate.onGeolocationPermissionsShowPrompt(str, r0);
        }
    }

    public void onGeolocationPermissionsHidePrompt() {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 != null && inAppWebView2.channelDelegate != null) {
            this.inAppWebView.channelDelegate.onGeolocationPermissionsHidePrompt();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            return true;
        }
        this.inAppWebView.channelDelegate.onConsoleMessage(consoleMessage.message(), consoleMessage.messageLevel().ordinal());
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeProgress(i);
        }
        InAppWebView inAppWebView2 = (InAppWebView) webView;
        if (inAppWebView2.inAppWebViewClientCompat != null) {
            inAppWebView2.inAppWebViewClientCompat.loadCustomJavaScriptOnPageStarted(webView);
        } else if (inAppWebView2.inAppWebViewClient != null) {
            inAppWebView2.inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
        }
        if (inAppWebView2.channelDelegate != null) {
            inAppWebView2.channelDelegate.onProgressChanged(i);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeTitle(str);
        }
        InAppWebView inAppWebView2 = (InAppWebView) webView;
        if (inAppWebView2.channelDelegate != null) {
            inAppWebView2.channelDelegate.onTitleChanged(str);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
        bitmap.recycle();
        InAppWebView inAppWebView2 = (InAppWebView) webView;
        if (inAppWebView2.channelDelegate != null) {
            inAppWebView2.channelDelegate.onReceivedIcon(byteArrayOutputStream.toByteArray());
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
        InAppWebView inAppWebView2 = (InAppWebView) webView;
        if (inAppWebView2.channelDelegate != null) {
            inAppWebView2.channelDelegate.onReceivedTouchIconUrl(str, z);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup getRootView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPickerIntent(valueCallback, str, (String) null);
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPickerIntent(valueCallback, "", (String) null);
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPickerIntent(valueCallback, str, str2);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z = true;
        if (fileChooserParams.getMode() != 1) {
            z = false;
        }
        return startPickerIntent(valueCallback, acceptTypes, z, fileChooserParams.isCaptureEnabled());
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return true;
        }
        if (i == 1) {
            Uri[] selectedFiles = i2 == -1 ? getSelectedFiles(intent, i2) : null;
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i == 3) {
            Uri data = i2 == -1 ? intent != null ? intent.getData() : getCapturedMediaFile() : null;
            ValueCallback<Uri> valueCallback2 = this.filePathCallbackLegacy;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(data);
            }
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.imageOutputFileUri = null;
        this.videoOutputFileUri = null;
        return true;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null || intent.getData() == null) {
            if (intent == null || intent.getClipData() == null) {
                Uri capturedMediaFile = getCapturedMediaFile();
                if (capturedMediaFile == null) {
                    return null;
                }
                return new Uri[]{capturedMediaFile};
            }
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (i == -1) {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        } else {
            return null;
        }
    }

    private boolean isFileNotEmpty(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, "r");
            long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            if (length > 0) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    private Uri getCapturedMediaFile() {
        Uri uri = this.imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return this.imageOutputFileUri;
        }
        Uri uri2 = this.videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return this.videoOutputFileUri;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startPickerIntent(android.webkit.ValueCallback<android.net.Uri> r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.filePathCallbackLegacy = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String) r4)
            boolean r0 = r0.booleanValue()
            if (r5 == 0) goto L_0x0028
            boolean r5 = r2.needsCameraPermission()
            if (r5 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r5 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r5 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r5 != 0) goto L_0x0060
            android.content.Intent r4 = r2.getFileChooserIntent(r4)
            java.lang.String r5 = ""
            android.content.Intent r5 = android.content.Intent.createChooser(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0052
            if (r3 == 0) goto L_0x0049
            android.content.Intent r3 = r2.getPhotoIntent()
            r4.add(r3)
        L_0x0049:
            if (r0 == 0) goto L_0x0052
            android.content.Intent r3 = r2.getVideoIntent()
            r4.add(r3)
        L_0x0052:
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
            r5.putExtra(r4, r3)
        L_0x0060:
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x0074
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            android.content.ComponentName r4 = r5.resolveActivity(r4)
            if (r4 == 0) goto L_0x0074
            r4 = 3
            r3.startActivityForResult(r5, r4)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r3, java.lang.String[] r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r2.filePathCallback = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String[]) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String[]) r4)
            boolean r0 = r0.booleanValue()
            if (r6 == 0) goto L_0x0028
            boolean r6 = r2.needsCameraPermission()
            if (r6 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r6 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r6 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x0067
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x003f
            android.content.Intent r3 = r2.getPhotoIntent()
            r6.add(r3)
        L_0x003f:
            if (r0 == 0) goto L_0x0048
            android.content.Intent r3 = r2.getVideoIntent()
            r6.add(r3)
        L_0x0048:
            android.content.Intent r3 = r2.getFileChooserIntent(r4, r5)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.CHOOSER"
            r4.<init>(r5)
            java.lang.String r5 = "android.intent.extra.INTENT"
            r4.putExtra(r5, r3)
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r6.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r5 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r5, r3)
            r6 = r4
        L_0x0067:
            android.app.Activity r3 = r2.getActivity()
            r4 = 1
            if (r3 == 0) goto L_0x007b
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            android.content.ComponentName r5 = r6.resolveActivity(r5)
            if (r5 == 0) goto L_0x007b
            r3.startActivityForResult(r6, r4)
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean needsCameraPermission() {
        Activity activity = getActivity();
        if (activity == null) {
            return true;
        }
        try {
            if (!Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        this.imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        this.videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private Boolean acceptsAny(String[] strArr) {
        boolean booleanValue = isArrayEmpty(strArr).booleanValue();
        Boolean bool = Boolean.TRUE;
        if (booleanValue) {
            return bool;
        }
        for (String equals : strArr) {
            if (equals.equals("*/*")) {
                return bool;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "video").booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                str = getMimeTypeFromExtension(str.replace(".", ""));
            }
            strArr2[i] = str;
        }
        return strArr2;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e) {
            e.printStackTrace();
            file = null;
        }
        if (file == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getPackageName());
        sb.append(".flutter_inappwebview.fileprovider");
        return FileProvider.getUriForFile(activity.getApplicationContext(), sb.toString(), file);
    }

    private File getCapturedFile(String str) throws IOException {
        String str2;
        String str3;
        String str4 = "";
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = "video";
            str3 = ".mp4";
        } else {
            str2 = str4;
            str3 = str2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory(str4), String.format("%s-%d%s", new Object[]{str2, Long.valueOf(System.currentTimeMillis()), str3}));
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir((String) null));
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        AnonymousClass18 r0 = new WebViewChannelDelegate.PermissionRequestCallback() {
            public boolean nonNullSuccess(PermissionResponse permissionResponse) {
                Integer action = permissionResponse.getAction();
                if (action == null) {
                    return true;
                }
                if (action.intValue() != 1) {
                    permissionRequest.deny();
                    return false;
                }
                List<String> resources = permissionResponse.getResources();
                permissionRequest.grant((String[]) resources.toArray(new String[permissionResponse.getResources().size()]));
                return false;
            }

            public void defaultBehaviour(PermissionResponse permissionResponse) {
                permissionRequest.deny();
            }

            public void error(String str, String str2, Object obj) {
                defaultBehaviour((PermissionResponse) null);
            }
        };
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || inAppWebView2.channelDelegate == null) {
            r0.defaultBehaviour(null);
        } else {
            this.inAppWebView.channelDelegate.onPermissionRequest(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()), (Object) null, r0);
        }
    }

    public void onRequestFocus(WebView webView) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 != null && inAppWebView2.channelDelegate != null) {
            this.inAppWebView.channelDelegate.onRequestFocus();
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 != null && inAppWebView2.channelDelegate != null) {
            this.inAppWebView.channelDelegate.onPermissionRequestCanceled(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()));
        }
    }

    private Activity getActivity() {
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            return inAppBrowserDelegate2.getActivity();
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            return inAppWebViewFlutterPlugin.activity;
        }
        return null;
    }

    public void dispose() {
        for (Map.Entry next : this.dialogs.entrySet()) {
            ((JsResult) next.getValue()).cancel();
            ((DialogInterface) next.getKey()).dismiss();
        }
        this.dialogs.clear();
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activityPluginBinding == null)) {
            this.plugin.activityPluginBinding.removeActivityResultListener(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.filePathCallbackLegacy = null;
        this.filePathCallback = null;
        this.videoOutputFileUri = null;
        this.imageOutputFileUri = null;
        this.inAppWebView = null;
        this.plugin = null;
    }
}
