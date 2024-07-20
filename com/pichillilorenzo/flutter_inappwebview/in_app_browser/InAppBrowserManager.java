package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InAppBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
    public static final Map<String, InAppBrowserManager> shared = new HashMap();
    public String id;
    public InAppWebViewFlutterPlugin plugin;

    public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        String obj = UUID.randomUUID().toString();
        this.id = obj;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(obj, this);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("openWithSystemBrowser")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                result.success(Boolean.FALSE);
                return;
            }
            openWithSystemBrowser(this.plugin.activity, (String) methodCall.argument(ImagesContract.URL), result);
        } else if (!str.equals("open")) {
            result.notImplemented();
        } else {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
            if (inAppWebViewFlutterPlugin2 == null || inAppWebViewFlutterPlugin2.activity == null) {
                result.success(Boolean.FALSE);
                return;
            }
            open(this.plugin.activity, (Map) methodCall.arguments());
            result.success(Boolean.TRUE);
        }
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public void openWithSystemBrowser(Activity activity, String str, MethodChannel.Result result) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if (Constants.FILE.equals(parse.getScheme())) {
                intent.setDataAndType(parse, getMimeType(str));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            openExternalExcludeCurrentApp(activity, intent);
            result.success(Boolean.TRUE);
        } catch (RuntimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" cannot be opened!");
            result.error(LOG_TAG, sb.toString(), (Object) null);
        }
    }

    public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ResolveInfo next : queryIntentActivities) {
            if (!packageName.equals(next.activityInfo.packageName)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(next.activityInfo.packageName);
                arrayList.add(intent2);
            } else {
                z = true;
            }
        }
        if (z && arrayList.size() != 0) {
            if (arrayList.size() == 1) {
                activity.startActivity((Intent) arrayList.get(0));
                return;
            } else if (arrayList.size() > 0) {
                intent = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), (CharSequence) null);
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            } else {
                return;
            }
        }
        activity.startActivity(intent);
    }

    public void open(Activity activity, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        Integer num = (Integer) map2.get("windowId");
        String str = "windowId";
        List list = (List) map2.get("initialUserScripts");
        String str2 = "initialUserScripts";
        Map map3 = (Map) map2.get("pullToRefreshSettings");
        String str3 = "menuItems";
        Bundle bundle = new Bundle();
        List list2 = (List) map2.get("menuItems");
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable) ((Map) map2.get("urlRequest")));
        bundle.putString("initialFile", (String) map2.get("assetFilePath"));
        bundle.putString("initialData", (String) map2.get("data"));
        bundle.putString("initialMimeType", (String) map2.get("mimeType"));
        bundle.putString("initialEncoding", (String) map2.get("encoding"));
        bundle.putString("initialBaseUrl", (String) map2.get("baseUrl"));
        bundle.putString("initialHistoryUrl", (String) map2.get("historyUrl"));
        bundle.putString("id", (String) map2.get("id"));
        bundle.putString("managerId", this.id);
        bundle.putSerializable("settings", (Serializable) ((Map) map2.get("settings")));
        bundle.putSerializable("contextMenu", (Serializable) ((Map) map2.get("contextMenu")));
        bundle.putInt(str, num != null ? num.intValue() : -1);
        bundle.putSerializable(str2, (Serializable) list);
        bundle.putSerializable("pullToRefreshInitialSettings", (Serializable) map3);
        bundle.putSerializable(str3, (Serializable) list2);
        startInAppBrowserActivity(activity, bundle);
    }

    public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public void dispose() {
        super.dispose();
        shared.remove(this.id);
        this.plugin = null;
    }
}
