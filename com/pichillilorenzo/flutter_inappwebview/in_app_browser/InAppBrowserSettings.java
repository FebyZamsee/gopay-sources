package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview.ISettings;
import com.pichillilorenzo.flutter_inappwebview.R;
import java.util.HashMap;
import java.util.Map;

public class InAppBrowserSettings implements ISettings<InAppBrowserActivity> {
    public static final String LOG_TAG = "InAppBrowserSettings";
    public Boolean allowGoBackWithBackButton;
    public Boolean closeOnCannotGoBack;
    public Boolean hidden;
    public Boolean hideDefaultMenuItems;
    public Boolean hideProgressBar;
    public Boolean hideTitleBar;
    public Boolean hideToolbarTop;
    public Boolean hideUrlBar;
    public Boolean shouldCloseOnBackButtonPressed;
    public String toolbarTopBackgroundColor;
    public String toolbarTopFixedTitle;

    public InAppBrowserSettings() {
        Boolean bool = Boolean.FALSE;
        this.hidden = bool;
        this.hideToolbarTop = bool;
        this.hideUrlBar = bool;
        this.hideProgressBar = bool;
        this.hideTitleBar = bool;
        Boolean bool2 = Boolean.TRUE;
        this.closeOnCannotGoBack = bool2;
        this.allowGoBackWithBackButton = bool2;
        this.shouldCloseOnBackButtonPressed = bool;
        this.hideDefaultMenuItems = bool;
    }

    public InAppBrowserSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1307803139:
                        if (str.equals("hideTitleBar")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1217487446:
                        if (str.equals("hidden")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -842349289:
                        if (str.equals("allowGoBackWithBackButton")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -809085252:
                        if (str.equals("hideToolbarTop")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -299596350:
                        if (str.equals("hideDefaultMenuItems")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -118493506:
                        if (str.equals("toolbarTopFixedTitle")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3851268:
                        if (str.equals("hideProgressBar")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 90270825:
                        if (str.equals("closeOnCannotGoBack")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 406250502:
                        if (str.equals("hideUrlBar")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 2111633307:
                        if (str.equals("toolbarTopBackgroundColor")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 2140270213:
                        if (str.equals("shouldCloseOnBackButtonPressed")) {
                            c = 10;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.hideTitleBar = (Boolean) value;
                        break;
                    case 1:
                        this.hidden = (Boolean) value;
                        break;
                    case 2:
                        this.allowGoBackWithBackButton = (Boolean) value;
                        break;
                    case 3:
                        this.hideToolbarTop = (Boolean) value;
                        break;
                    case 4:
                        this.hideDefaultMenuItems = (Boolean) value;
                        break;
                    case 5:
                        this.toolbarTopFixedTitle = (String) value;
                        break;
                    case 6:
                        this.hideProgressBar = (Boolean) value;
                        break;
                    case 7:
                        this.closeOnCannotGoBack = (Boolean) value;
                        break;
                    case 8:
                        this.hideUrlBar = (Boolean) value;
                        break;
                    case 9:
                        this.toolbarTopBackgroundColor = (String) value;
                        break;
                    case 10:
                        this.shouldCloseOnBackButtonPressed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("hidden", this.hidden);
        hashMap.put("hideToolbarTop", this.hideToolbarTop);
        hashMap.put("toolbarTopBackgroundColor", this.toolbarTopBackgroundColor);
        hashMap.put("toolbarTopFixedTitle", this.toolbarTopFixedTitle);
        hashMap.put("hideUrlBar", this.hideUrlBar);
        hashMap.put("hideTitleBar", this.hideTitleBar);
        hashMap.put("closeOnCannotGoBack", this.closeOnCannotGoBack);
        hashMap.put("hideProgressBar", this.hideProgressBar);
        hashMap.put("allowGoBackWithBackButton", this.allowGoBackWithBackButton);
        hashMap.put("shouldCloseOnBackButtonPressed", this.shouldCloseOnBackButtonPressed);
        hashMap.put("hideDefaultMenuItems", this.hideDefaultMenuItems);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(InAppBrowserActivity inAppBrowserActivity) {
        Map<String, Object> map = toMap();
        map.put("hidden", Boolean.valueOf(inAppBrowserActivity.isHidden));
        boolean z = false;
        map.put("hideToolbarTop", Boolean.valueOf(inAppBrowserActivity.actionBar == null || !inAppBrowserActivity.actionBar.isShowing()));
        map.put("hideUrlBar", Boolean.valueOf(inAppBrowserActivity.menu == null || !inAppBrowserActivity.menu.findItem(R.id.menu_search).isVisible()));
        if (inAppBrowserActivity.progressBar == null || inAppBrowserActivity.progressBar.getMax() == 0) {
            z = true;
        }
        map.put("hideProgressBar", Boolean.valueOf(z));
        return map;
    }
}
