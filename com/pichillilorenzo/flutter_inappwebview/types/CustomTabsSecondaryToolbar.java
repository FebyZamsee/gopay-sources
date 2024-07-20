package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomTabsSecondaryToolbar {
    private List<AndroidResource> clickableIDs;
    private AndroidResource layout;

    public CustomTabsSecondaryToolbar(AndroidResource androidResource, List<AndroidResource> list) {
        new ArrayList();
        this.layout = androidResource;
        this.clickableIDs = list;
    }

    public static CustomTabsSecondaryToolbar fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        AndroidResource fromMap = AndroidResource.fromMap((Map) map.get("layout"));
        ArrayList arrayList = new ArrayList();
        List<Map> list = (List) map.get("clickableIDs");
        if (list != null) {
            for (Map map2 : list) {
                AndroidResource fromMap2 = AndroidResource.fromMap((Map) map2.get("id"));
                if (fromMap2 != null) {
                    arrayList.add(fromMap2);
                }
            }
        }
        return new CustomTabsSecondaryToolbar(fromMap, arrayList);
    }

    public AndroidResource getLayout() {
        return this.layout;
    }

    public void setLayout(AndroidResource androidResource) {
        this.layout = androidResource;
    }

    public List<AndroidResource> getClickableIDs() {
        return this.clickableIDs;
    }

    public void setClickableIDs(List<AndroidResource> list) {
        this.clickableIDs = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = (CustomTabsSecondaryToolbar) obj;
        if (!this.layout.equals(customTabsSecondaryToolbar.layout)) {
            return false;
        }
        return this.clickableIDs.equals(customTabsSecondaryToolbar.clickableIDs);
    }

    public int hashCode() {
        return (this.layout.hashCode() * 31) + this.clickableIDs.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomTabsSecondaryToolbar{layout=");
        sb.append(this.layout);
        sb.append(", clickableIDs=");
        sb.append(this.clickableIDs);
        sb.append('}');
        return sb.toString();
    }
}
