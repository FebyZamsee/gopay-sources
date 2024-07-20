package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Arrays;
import java.util.Map;

public class CustomTabsActionButton {
    private String description;
    private byte[] icon;
    private int id;
    private boolean shouldTint;

    public CustomTabsActionButton(int i, byte[] bArr, String str, boolean z) {
        this.id = i;
        this.icon = bArr;
        this.description = str;
        this.shouldTint = z;
    }

    public static CustomTabsActionButton fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton(((Integer) map.get("id")).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public void setIcon(byte[] bArr) {
        this.icon = bArr;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public boolean isShouldTint() {
        return this.shouldTint;
    }

    public void setShouldTint(boolean z) {
        this.shouldTint = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
        if (this.id == customTabsActionButton.id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
            return this.description.equals(customTabsActionButton.description);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id;
        return (((((i * 31) + Arrays.hashCode(this.icon)) * 31) + this.description.hashCode()) * 31) + (this.shouldTint ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomTabsActionButton{id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(Arrays.toString(this.icon));
        sb.append(", description='");
        sb.append(this.description);
        sb.append("', shouldTint=");
        sb.append(this.shouldTint);
        sb.append('}');
        return sb.toString();
    }
}
