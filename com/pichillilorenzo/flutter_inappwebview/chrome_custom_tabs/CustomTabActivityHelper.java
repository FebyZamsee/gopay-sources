package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.TrustedWebActivityIntent;
import java.util.List;
import java.util.Map;

public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private CustomTabsClient mClient;
    private CustomTabsServiceConnection mConnection;
    private ConnectionCallback mConnectionCallback;
    private CustomTabsCallback mCustomTabsCallback;
    private CustomTabsSession mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i);
    }

    public static void openCustomTab(Activity activity, CustomTabsIntent customTabsIntent, Uri uri, Map<String, String> map, Uri uri2, int i) {
        openCustomTab(activity, customTabsIntent.intent, uri, map, uri2, i);
    }

    public static void openTrustedWebActivity(Activity activity, TrustedWebActivityIntent trustedWebActivityIntent, Uri uri, Map<String, String> map, Uri uri2, int i) {
        openCustomTab(activity, trustedWebActivityIntent.getIntent(), uri, map, uri2, i);
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public void unbindCustomTabsService(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.mConnection;
        if (customTabsServiceConnection != null) {
            activity.unbindService(customTabsServiceConnection);
            this.mClient = null;
            this.mCustomTabsSession = null;
            this.mConnection = null;
        }
    }

    public CustomTabsSession getSession() {
        CustomTabsClient customTabsClient = this.mClient;
        if (customTabsClient == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = customTabsClient.newSession(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(CustomTabsCallback customTabsCallback) {
        this.mCustomTabsCallback = customTabsCallback;
    }

    public void bindCustomTabsService(Activity activity) {
        String packageNameToUse;
        if (this.mClient == null && (packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity)) != null) {
            ServiceConnection serviceConnection = new ServiceConnection(this);
            this.mConnection = serviceConnection;
            CustomTabsClient.bindCustomTabsService(activity, packageNameToUse, serviceConnection);
        }
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsSession session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        return session.mayLaunchUrl(uri, bundle, list);
    }

    public void onServiceConnected(CustomTabsClient customTabsClient) {
        this.mClient = customTabsClient;
        customTabsClient.warmup(0);
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }
}
