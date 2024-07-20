package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChromeCustomTabsActivity extends Activity implements Disposable {
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    protected final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    public CustomTabsActionButton actionButton;
    public CustomTabsIntent.Builder builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    public CustomTabsSession customTabsSession;
    public String id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();
    protected boolean onCompletedInitialLoad = false;
    protected boolean onOpened = false;
    public CustomTabsSecondaryToolbar secondaryToolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.id = extras.getString("id");
            ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = chromeSafariBrowserManager;
            if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.plugin != null && this.manager.plugin.messenger != null) {
                this.manager.browsers.put(this.id, this);
                BinaryMessenger binaryMessenger = this.manager.plugin.messenger;
                StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
                sb.append(this.id);
                this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
                this.initialUrl = extras.getString(ImagesContract.URL);
                this.initialHeaders = (Map) extras.getSerializable("headers");
                this.initialReferrer = extras.getString("referrer");
                this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
                ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
                this.customSettings = chromeCustomTabsSettings;
                chromeCustomTabsSettings.parse((Map) (HashMap) extras.getSerializable("settings"));
                this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
                this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
                for (Map fromMap : (List) extras.getSerializable("menuItemList")) {
                    this.menuItems.add(CustomTabsMenuItem.fromMap(fromMap));
                }
                this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() {
                    public void onCustomTabsConnected() {
                        ChromeCustomTabsActivity.this.customTabsConnected();
                        if (ChromeCustomTabsActivity.this.channelDelegate != null) {
                            ChromeCustomTabsActivity.this.channelDelegate.onServiceConnected();
                        }
                    }

                    public void onCustomTabsDisconnected() {
                        this.close();
                        ChromeCustomTabsActivity.this.dispose();
                    }
                });
                this.customTabActivityHelper.setCustomTabsCallback(new CustomTabsCallback() {
                    public void extraCallback(String str, Bundle bundle) {
                    }

                    public void onMessageChannelReady(Bundle bundle) {
                    }

                    public void onPostMessage(String str, Bundle bundle) {
                    }

                    public void onNavigationEvent(int i, Bundle bundle) {
                        if (i == 5 && !ChromeCustomTabsActivity.this.onOpened) {
                            ChromeCustomTabsActivity.this.onOpened = true;
                            if (ChromeCustomTabsActivity.this.channelDelegate != null) {
                                ChromeCustomTabsActivity.this.channelDelegate.onOpened();
                            }
                        }
                        if (i == 2 && !ChromeCustomTabsActivity.this.onCompletedInitialLoad) {
                            ChromeCustomTabsActivity.this.onCompletedInitialLoad = true;
                            if (ChromeCustomTabsActivity.this.channelDelegate != null) {
                                ChromeCustomTabsActivity.this.channelDelegate.onCompletedInitialLoad();
                            }
                        }
                        if (ChromeCustomTabsActivity.this.channelDelegate != null) {
                            ChromeCustomTabsActivity.this.channelDelegate.onNavigationEvent(i);
                        }
                    }

                    public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                        if (ChromeCustomTabsActivity.this.channelDelegate != null) {
                            ChromeCustomTabsActivity.this.channelDelegate.onRelationshipValidationResult(i, uri, z);
                        }
                    }
                });
            }
        }
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new CustomTabsIntent.Builder(this.customTabsSession);
        prepareCustomTabs();
        CustomTabsIntent build = this.builder.build();
        prepareCustomTabsIntent(build);
        CustomTabActivityHelper.openCustomTab((Activity) this, build, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri parse = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            for (String putString : list) {
                bundle.putString(CustomTabsService.KEY_URL, putString);
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(parse, (Bundle) null, arrayList);
    }

    public void customTabsConnected() {
        this.customTabsSession = this.customTabActivityHelper.getSession();
        String str = this.initialUrl;
        if (str != null) {
            launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
        }
    }

    private void prepareCustomTabs() {
        if (this.builder != null) {
            if (this.customSettings.addDefaultShareMenuItem != null) {
                this.builder.setShareState(this.customSettings.addDefaultShareMenuItem.booleanValue() ? 1 : 2);
            } else {
                this.builder.setShareState(this.customSettings.shareState.intValue());
            }
            CustomTabColorSchemeParams.Builder builder2 = new CustomTabColorSchemeParams.Builder();
            if (this.customSettings.toolbarBackgroundColor != null && !this.customSettings.toolbarBackgroundColor.isEmpty()) {
                builder2.setToolbarColor(Color.parseColor(this.customSettings.toolbarBackgroundColor));
            }
            if (this.customSettings.navigationBarColor != null && !this.customSettings.navigationBarColor.isEmpty()) {
                builder2.setNavigationBarColor(Color.parseColor(this.customSettings.navigationBarColor));
            }
            if (this.customSettings.navigationBarDividerColor != null && !this.customSettings.navigationBarDividerColor.isEmpty()) {
                builder2.setNavigationBarDividerColor(Color.parseColor(this.customSettings.navigationBarDividerColor));
            }
            if (this.customSettings.secondaryToolbarColor != null && !this.customSettings.secondaryToolbarColor.isEmpty()) {
                builder2.setSecondaryToolbarColor(Color.parseColor(this.customSettings.secondaryToolbarColor));
            }
            this.builder.setDefaultColorSchemeParams(builder2.build());
            this.builder.setShowTitle(this.customSettings.showTitle.booleanValue());
            this.builder.setUrlBarHidingEnabled(this.customSettings.enableUrlBarHiding.booleanValue());
            this.builder.setInstantAppsEnabled(this.customSettings.instantAppsEnabled.booleanValue());
            if (this.customSettings.startAnimations.size() == 2) {
                this.builder.setStartAnimations(this, this.customSettings.startAnimations.get(0).getIdentifier(this), this.customSettings.startAnimations.get(1).getIdentifier(this));
            }
            if (this.customSettings.exitAnimations.size() == 2) {
                this.builder.setExitAnimations(this, this.customSettings.exitAnimations.get(0).getIdentifier(this), this.customSettings.exitAnimations.get(1).getIdentifier(this));
            }
            for (CustomTabsMenuItem next : this.menuItems) {
                this.builder.addMenuItem(next.getLabel(), createPendingIntent(next.getId()));
            }
            CustomTabsActionButton customTabsActionButton = this.actionButton;
            if (customTabsActionButton != null) {
                byte[] icon = customTabsActionButton.getIcon();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                this.builder.setActionButton(BitmapFactory.decodeByteArray(icon, 0, icon.length, options), this.actionButton.getDescription(), createPendingIntent(this.actionButton.getId()), this.actionButton.isShouldTint());
            }
            CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
            if (customTabsSecondaryToolbar != null) {
                AndroidResource layout = customTabsSecondaryToolbar.getLayout();
                RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
                int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
                int size = this.secondaryToolbar.getClickableIDs().size();
                for (int i = 0; i < size; i++) {
                    iArr[i] = this.secondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
                }
                this.builder.setSecondaryToolbarViews(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
            }
        }
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast(this, 0, intent, 167772160);
        }
        return PendingIntent.getBroadcast(this, 0, intent, 134217728);
    }

    private void prepareCustomTabsIntent(CustomTabsIntent customTabsIntent) {
        if (this.customSettings.packageName != null) {
            customTabsIntent.intent.setPackage(this.customSettings.packageName);
        } else {
            customTabsIntent.intent.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, customTabsIntent.intent);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            CustomTabsIntent.setAlwaysUseBrowserUI(customTabsIntent.intent);
        }
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession != null && this.actionButton != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            this.customTabsSession.setActionButton(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), str);
            this.actionButton.setIcon(bArr);
            this.actionButton.setDescription(str);
        }
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
            int size = customTabsSecondaryToolbar.getClickableIDs().size();
            for (int i = 0; i < size; i++) {
                iArr[i] = customTabsSecondaryToolbar.getClickableIDs().get(i).getIdentifier(this);
            }
            this.customTabsSession.setSecondaryToolbarViews(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
            this.secondaryToolbar = customTabsSecondaryToolbar;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.customTabActivityHelper.bindCustomTabsService(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            close();
            dispose();
        }
    }

    private PendingIntent createPendingIntent(int i) {
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast(this, i, intent, 167772160);
        }
        return PendingIntent.getBroadcast(this, i, intent, 134217728);
    }

    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.id)) {
            this.manager.browsers.put(this.id, (Object) null);
        }
        this.manager = null;
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }
}
