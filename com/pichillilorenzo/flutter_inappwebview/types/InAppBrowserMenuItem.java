package com.pichillilorenzo.flutter_inappwebview.types;

import com.pichillilorenzo.flutter_inappwebview.Util;
import java.util.Map;
import java.util.Objects;

public class InAppBrowserMenuItem {
    private Object icon;
    private String iconColor;
    private int id;
    private Integer order;
    private boolean showAsAction;
    private String title;

    public InAppBrowserMenuItem(int i, String str, Integer num, Object obj, String str2, boolean z) {
        this.id = i;
        this.title = str;
        this.order = num;
        this.icon = obj;
        this.iconColor = str2;
        this.showAsAction = z;
    }

    public static InAppBrowserMenuItem fromMap(Map<String, Object> map) {
        AndroidResource androidResource;
        AndroidResource androidResource2 = null;
        if (map == null) {
            return null;
        }
        int intValue = ((Integer) map.get("id")).intValue();
        String str = (String) map.get("title");
        Integer num = (Integer) map.get("order");
        Object obj = map.get("icon");
        if (obj instanceof Map) {
            androidResource2 = AndroidResource.fromMap((Map) map.get("icon"));
        } else if (obj instanceof byte[]) {
            androidResource = obj;
            return new InAppBrowserMenuItem(intValue, str, num, androidResource, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
        }
        androidResource = androidResource2;
        return new InAppBrowserMenuItem(intValue, str, num, androidResource, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrder(Integer num) {
        this.order = num;
    }

    public Object getIcon() {
        return this.icon;
    }

    public void setIcon(Object obj) {
        this.icon = obj;
    }

    public String getIconColor() {
        return this.iconColor;
    }

    public void setIconColor(String str) {
        this.iconColor = str;
    }

    public boolean isShowAsAction() {
        return this.showAsAction;
    }

    public void setShowAsAction(boolean z) {
        this.showAsAction = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InAppBrowserMenuItem inAppBrowserMenuItem = (InAppBrowserMenuItem) obj;
        if (this.id == inAppBrowserMenuItem.id && this.showAsAction == inAppBrowserMenuItem.showAsAction && this.title.equals(inAppBrowserMenuItem.title) && Objects.equals(this.order, inAppBrowserMenuItem.order) && Objects.equals(this.icon, inAppBrowserMenuItem.icon)) {
            return Objects.equals(this.iconColor, inAppBrowserMenuItem.iconColor);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id;
        int hashCode = this.title.hashCode();
        Integer num = this.order;
        int i2 = 0;
        int hashCode2 = num != null ? num.hashCode() : 0;
        Object obj = this.icon;
        int hashCode3 = obj != null ? obj.hashCode() : 0;
        String str = this.iconColor;
        if (str != null) {
            i2 = str.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + (this.showAsAction ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InAppBrowserMenuItem{id=");
        sb.append(this.id);
        sb.append(", title='");
        sb.append(this.title);
        sb.append("', order=");
        sb.append(this.order);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconColor='");
        sb.append(this.iconColor);
        sb.append("', showAsAction=");
        sb.append(this.showAsAction);
        sb.append('}');
        return sb.toString();
    }
}
