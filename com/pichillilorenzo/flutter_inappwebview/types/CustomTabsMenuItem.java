package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class CustomTabsMenuItem {
    private int id;
    private String label;

    public CustomTabsMenuItem(int i, String str) {
        this.id = i;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get("label"));
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.id != customTabsMenuItem.id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int hashCode() {
        return (this.id * 31) + this.label.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomTabsMenuItem{id=");
        sb.append(this.id);
        sb.append(", label='");
        sb.append(this.label);
        sb.append("'}");
        return sb.toString();
    }
}
