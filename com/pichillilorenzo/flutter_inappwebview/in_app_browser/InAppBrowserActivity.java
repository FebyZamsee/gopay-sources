package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.webkit.internal.AssetHelper;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview.find_interaction.FindInteractionSettings;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.InAppBrowserMenuItem;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.webview.in_app_webview.InAppWebViewSettings;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InAppBrowserActivity extends AppCompatActivity implements InAppBrowserDelegate, Disposable {
    protected static final String LOG_TAG = "InAppBrowserActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
    public ActionBar actionBar;
    private List<ActivityResultListener> activityResultListeners = new ArrayList();
    public InAppBrowserChannelDelegate channelDelegate;
    public InAppBrowserSettings customSettings = new InAppBrowserSettings();
    public String fromActivity;
    public String id;
    public boolean isHidden = false;
    public InAppBrowserManager manager;
    public Menu menu;
    public List<InAppBrowserMenuItem> menuItems = new ArrayList();
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;

    public Activity getActivity() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        URLRequest fromMap;
        Message message;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.id = extras.getString("id");
            InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = inAppBrowserManager;
            if (inAppBrowserManager != null && inAppBrowserManager.plugin != null && this.manager.plugin.messenger != null) {
                Map map = (Map) extras.getSerializable("settings");
                this.customSettings.parse(map);
                this.windowId = Integer.valueOf(extras.getInt("windowId"));
                setContentView(R.layout.activity_web_view);
                BinaryMessenger binaryMessenger = this.manager.plugin.messenger;
                StringBuilder sb = new StringBuilder(PullToRefreshLayout.METHOD_CHANNEL_NAME_PREFIX);
                sb.append(this.id);
                MethodChannel methodChannel = new MethodChannel(binaryMessenger, sb.toString());
                PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
                pullToRefreshSettings.parse((Map) extras.getSerializable("pullToRefreshInitialSettings"));
                PullToRefreshLayout pullToRefreshLayout2 = (PullToRefreshLayout) findViewById(R.id.pullToRefresh);
                this.pullToRefreshLayout = pullToRefreshLayout2;
                pullToRefreshLayout2.channelDelegate = new PullToRefreshChannelDelegate(pullToRefreshLayout2, methodChannel);
                this.pullToRefreshLayout.settings = pullToRefreshSettings;
                this.pullToRefreshLayout.prepare();
                InAppWebView inAppWebView = (InAppWebView) findViewById(R.id.webView);
                this.webView = inAppWebView;
                inAppWebView.id = this.id;
                this.webView.windowId = this.windowId;
                this.webView.inAppBrowserDelegate = this;
                this.webView.plugin = this.manager.plugin;
                FindInteractionController findInteractionController = new FindInteractionController(this.webView, this.manager.plugin, this.id, (FindInteractionSettings) null);
                this.webView.findInteractionController = findInteractionController;
                findInteractionController.prepare();
                BinaryMessenger binaryMessenger2 = this.manager.plugin.messenger;
                StringBuilder sb2 = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
                sb2.append(this.id);
                MethodChannel methodChannel2 = new MethodChannel(binaryMessenger2, sb2.toString());
                this.channelDelegate = new InAppBrowserChannelDelegate(methodChannel2);
                InAppWebView inAppWebView2 = this.webView;
                inAppWebView2.channelDelegate = new WebViewChannelDelegate(inAppWebView2, methodChannel2);
                this.fromActivity = extras.getString("fromActivity");
                Map<String, Object> map2 = (Map) extras.getSerializable("contextMenu");
                List<Map> list = (List) extras.getSerializable("initialUserScripts");
                for (Map fromMap2 : (List) extras.getSerializable("menuItems")) {
                    this.menuItems.add(InAppBrowserMenuItem.fromMap(fromMap2));
                }
                InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                inAppWebViewSettings.parse(map);
                this.webView.customSettings = inAppWebViewSettings;
                this.webView.contextMenu = map2;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Map fromMap3 : list) {
                        arrayList.add(UserScript.fromMap(fromMap3));
                    }
                }
                this.webView.userContentController.addUserOnlyScripts(arrayList);
                this.actionBar = getSupportActionBar();
                prepareView();
                if (this.windowId.intValue() == -1) {
                    String string = extras.getString("initialFile");
                    Map map3 = (Map) extras.getSerializable("initialUrlRequest");
                    String string2 = extras.getString("initialData");
                    if (string != null) {
                        try {
                            this.webView.loadFile(string);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    } else if (string2 != null) {
                        String string3 = extras.getString("initialMimeType");
                        String string4 = extras.getString("initialEncoding");
                        this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, string3, string4, extras.getString("initialHistoryUrl"));
                    } else if (!(map3 == null || (fromMap = URLRequest.fromMap(map3)) == null)) {
                        this.webView.loadUrl(fromMap);
                    }
                } else if (!(this.webView.plugin == null || this.webView.plugin.inAppWebViewManager == null || (message = this.webView.plugin.inAppWebViewManager.windowWebViewMessages.get(this.windowId)) == null)) {
                    ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                    message.sendToTarget();
                }
                InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
                if (inAppBrowserChannelDelegate != null) {
                    inAppBrowserChannelDelegate.onBrowserCreated();
                }
            }
        }
    }

    private void prepareView() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.prepare();
        }
        if (this.customSettings.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar);
        this.progressBar = progressBar2;
        if (progressBar2 != null) {
            if (this.customSettings.hideProgressBar.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            actionBar2.setDisplayShowTitleEnabled(!this.customSettings.hideTitleBar.booleanValue());
            if (this.customSettings.hideToolbarTop.booleanValue()) {
                this.actionBar.hide();
            }
            if (this.customSettings.toolbarTopBackgroundColor != null && !this.customSettings.toolbarTopBackgroundColor.isEmpty()) {
                this.actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(this.customSettings.toolbarTopBackgroundColor)));
            }
            if (this.customSettings.toolbarTopFixedTitle != null && !this.customSettings.toolbarTopFixedTitle.isEmpty()) {
                this.actionBar.setTitle((CharSequence) this.customSettings.toolbarTopFixedTitle);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.menu = menu2;
        String str = "";
        if (this.actionBar != null && (this.customSettings.toolbarTopFixedTitle == null || this.customSettings.toolbarTopFixedTitle.isEmpty())) {
            ActionBar actionBar2 = this.actionBar;
            InAppWebView inAppWebView = this.webView;
            actionBar2.setTitle((CharSequence) inAppWebView != null ? inAppWebView.getTitle() : str);
        }
        Menu menu3 = this.menu;
        if (menu3 == null) {
            return super.onCreateOptionsMenu(menu2);
        }
        if (menu3 instanceof MenuBuilder) {
            ((MenuBuilder) menu3).setOptionalIconsVisible(true);
        }
        getMenuInflater().inflate(R.menu.menu_main, this.menu);
        MenuItem findItem = this.menu.findItem(R.id.menu_search);
        if (findItem != null) {
            if (this.customSettings.hideUrlBar.booleanValue()) {
                findItem.setVisible(false);
            }
            SearchView searchView2 = (SearchView) findItem.getActionView();
            this.searchView = searchView2;
            if (searchView2 != null) {
                searchView2.setFocusable(true);
                SearchView searchView3 = this.searchView;
                InAppWebView inAppWebView2 = this.webView;
                if (inAppWebView2 != null) {
                    str = inAppWebView2.getUrl();
                }
                searchView3.setQuery(str, false);
                this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    public boolean onQueryTextChange(String str) {
                        return false;
                    }

                    public boolean onQueryTextSubmit(String str) {
                        if (str.isEmpty()) {
                            return false;
                        }
                        if (InAppBrowserActivity.this.webView != null) {
                            InAppBrowserActivity.this.webView.loadUrl(str);
                        }
                        if (InAppBrowserActivity.this.searchView != null) {
                            InAppBrowserActivity.this.searchView.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                        return true;
                    }
                });
                this.searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                    public boolean onClose() {
                        if (InAppBrowserActivity.this.searchView != null && InAppBrowserActivity.this.searchView.getQuery().toString().isEmpty()) {
                            InAppBrowserActivity.this.searchView.setQuery(InAppBrowserActivity.this.webView != null ? InAppBrowserActivity.this.webView.getUrl() : "", false);
                        }
                        return false;
                    }
                });
                this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
                    public void onFocusChange(View view, boolean z) {
                        if (!z && InAppBrowserActivity.this.searchView != null) {
                            InAppBrowserActivity.this.searchView.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                    }
                });
            }
        }
        if (this.customSettings.hideDefaultMenuItems.booleanValue()) {
            MenuItem findItem2 = this.menu.findItem(R.id.action_close);
            if (findItem2 != null) {
                findItem2.setVisible(false);
            }
            MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
            if (findItem3 != null) {
                findItem3.setVisible(false);
            }
            MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
            if (findItem4 != null) {
                findItem4.setVisible(false);
            }
            MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
            if (findItem5 != null) {
                findItem5.setVisible(false);
            }
            MenuItem findItem6 = this.menu.findItem(R.id.action_share);
            if (findItem6 != null) {
                findItem6.setVisible(false);
            }
        }
        for (final InAppBrowserMenuItem next : this.menuItems) {
            MenuItem add = this.menu.add(0, next.getId(), next.getOrder() != null ? next.getOrder().intValue() : 0, next.getTitle());
            if (next.isShowAsAction()) {
                add.setShowAsAction(2);
            }
            Object icon = next.getIcon();
            if (icon != null) {
                if (icon instanceof AndroidResource) {
                    add.setIcon(((AndroidResource) icon).getIdentifier(this));
                } else {
                    add.setIcon(Util.drawableFromBytes(this, (byte[]) icon));
                }
                String iconColor = next.getIconColor();
                if (iconColor != null && !iconColor.isEmpty()) {
                    add.getIcon().setTint(Color.parseColor(iconColor));
                }
            }
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (InAppBrowserActivity.this.channelDelegate == null) {
                        return true;
                    }
                    InAppBrowserActivity.this.channelDelegate.onMenuItemClicked(next);
                    return true;
                }
            });
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                close((MethodChannel.Result) null);
                return true;
            } else if (this.customSettings.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.customSettings.closeOnCannotGoBack.booleanValue()) {
                    close((MethodChannel.Result) null);
                }
                return true;
            } else if (!this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void close(MethodChannel.Result result) {
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.onExit();
        }
        dispose();
        if (result != null) {
            result.success(Boolean.TRUE);
        }
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void goBack() {
        if (this.webView != null && canGoBack()) {
            this.webView.goBack();
        }
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public void goForward() {
        if (this.webView != null && canGoForward()) {
            this.webView.goForward();
        }
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void hide() {
        if (this.fromActivity != null) {
            try {
                this.isHidden = true;
                Intent intent = new Intent(this, Class.forName(this.fromActivity));
                intent.setFlags(131072);
                startActivityIfNeeded(intent, 0);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        InAppWebView inAppWebView = this.webView;
        intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : "");
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close((MethodChannel.Result) null);
    }

    public void setSettings(InAppBrowserSettings inAppBrowserSettings, HashMap<String, Object> hashMap) {
        MenuItem findItem;
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse((Map) hashMap);
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.setSettings(inAppWebViewSettings, hashMap);
        }
        if (!(hashMap.get("hidden") == null || this.customSettings.hidden == inAppBrowserSettings.hidden)) {
            if (inAppBrowserSettings.hidden.booleanValue()) {
                hide();
            } else {
                show();
            }
        }
        if (!(hashMap.get("hideProgressBar") == null || this.customSettings.hideProgressBar == inAppBrowserSettings.hideProgressBar || this.progressBar == null)) {
            if (inAppBrowserSettings.hideProgressBar.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        if (!(this.actionBar == null || hashMap.get("hideTitleBar") == null || this.customSettings.hideTitleBar == inAppBrowserSettings.hideTitleBar)) {
            this.actionBar.setDisplayShowTitleEnabled(!inAppBrowserSettings.hideTitleBar.booleanValue());
        }
        if (!(this.actionBar == null || hashMap.get("hideToolbarTop") == null || this.customSettings.hideToolbarTop == inAppBrowserSettings.hideToolbarTop)) {
            if (inAppBrowserSettings.hideToolbarTop.booleanValue()) {
                this.actionBar.hide();
            } else {
                this.actionBar.show();
            }
        }
        if (!(this.actionBar == null || hashMap.get("toolbarTopBackgroundColor") == null || Util.objEquals(this.customSettings.toolbarTopBackgroundColor, inAppBrowserSettings.toolbarTopBackgroundColor) || inAppBrowserSettings.toolbarTopBackgroundColor == null || inAppBrowserSettings.toolbarTopBackgroundColor.isEmpty())) {
            this.actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(inAppBrowserSettings.toolbarTopBackgroundColor)));
        }
        if (!(this.actionBar == null || hashMap.get("toolbarTopFixedTitle") == null || Util.objEquals(this.customSettings.toolbarTopFixedTitle, inAppBrowserSettings.toolbarTopFixedTitle) || inAppBrowserSettings.toolbarTopFixedTitle == null || inAppBrowserSettings.toolbarTopFixedTitle.isEmpty())) {
            this.actionBar.setTitle((CharSequence) inAppBrowserSettings.toolbarTopFixedTitle);
        }
        if (!(this.menu == null || hashMap.get("hideUrlBar") == null || this.customSettings.hideUrlBar == inAppBrowserSettings.hideUrlBar || (findItem = this.menu.findItem(R.id.menu_search)) == null)) {
            findItem.setVisible(!inAppBrowserSettings.hideUrlBar.booleanValue());
        }
        if (!(this.menu == null || hashMap.get("hideDefaultMenuItems") == null || this.customSettings.hideDefaultMenuItems == inAppBrowserSettings.hideDefaultMenuItems)) {
            MenuItem findItem2 = this.menu.findItem(R.id.action_close);
            if (findItem2 != null) {
                findItem2.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
            if (findItem3 != null) {
                findItem3.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
            if (findItem4 != null) {
                findItem4.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
            if (findItem5 != null) {
                findItem5.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem6 = this.menu.findItem(R.id.action_share);
            if (findItem6 != null) {
                findItem6.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
        }
        this.customSettings = inAppBrowserSettings;
    }

    public Map<String, Object> getCustomSettings() {
        InAppWebView inAppWebView = this.webView;
        Map<String, Object> customSettings2 = inAppWebView != null ? inAppWebView.getCustomSettings() : null;
        InAppBrowserSettings inAppBrowserSettings = this.customSettings;
        if (inAppBrowserSettings == null || customSettings2 == null) {
            return null;
        }
        Map<String, Object> realSettings = inAppBrowserSettings.getRealSettings(this);
        realSettings.putAll(customSettings2);
        return realSettings;
    }

    public void didChangeTitle(String str) {
        if (this.actionBar == null) {
            return;
        }
        if (this.customSettings.toolbarTopFixedTitle == null || this.customSettings.toolbarTopFixedTitle.isEmpty()) {
            this.actionBar.setTitle((CharSequence) str);
        }
    }

    public void didStartNavigation(String str) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void didUpdateVisitedHistory(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void didFinishNavigation(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didFailNavigation(String str, int i, String str2) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didChangeProgress(int i) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.progressBar.setProgress(i, true);
            } else {
                this.progressBar.setProgress(i);
            }
            if (i == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (ActivityResultListener onActivityResult : this.activityResultListeners) {
            if (onActivityResult.onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void dispose() {
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.activityResultListeners.clear();
        if (this.webView != null) {
            InAppBrowserManager inAppBrowserManager = this.manager;
            if (!(inAppBrowserManager == null || inAppBrowserManager.plugin == null || this.manager.plugin.activityPluginBinding == null || this.webView.inAppWebViewChromeClient == null)) {
                this.manager.plugin.activityPluginBinding.removeActivityResultListener(this.webView.inAppWebViewChromeClient);
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.container);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            this.webView.dispose();
            this.webView = null;
            finish();
        }
    }

    public void onDestroy() {
        dispose();
        super.onDestroy();
    }
}
