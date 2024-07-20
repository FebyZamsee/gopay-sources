package com.pichillilorenzo.flutter_inappwebview.types;

import android.print.PrintAttributes;
import java.util.HashMap;
import java.util.Map;

public class MediaSizeExt {
    private int heightMils;
    private String id;
    private String label;
    private int widthMils;

    public MediaSizeExt(String str, String str2, int i, int i2) {
        this.id = str;
        this.label = str2;
        this.widthMils = i;
        this.heightMils = i2;
    }

    public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize mediaSize) {
        if (mediaSize == null) {
            return null;
        }
        return new MediaSizeExt(mediaSize.getId(), (String) null, mediaSize.getHeightMils(), mediaSize.getWidthMils());
    }

    public static MediaSizeExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MediaSizeExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("widthMils")).intValue(), ((Integer) map.get("heightMils")).intValue());
    }

    public PrintAttributes.MediaSize toMediaSize() {
        return new PrintAttributes.MediaSize(this.id, "Custom", this.widthMils, this.heightMils);
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        hashMap.put("label", this.label);
        hashMap.put("heightMils", Integer.valueOf(this.heightMils));
        hashMap.put("widthMils", Integer.valueOf(this.widthMils));
        return hashMap;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public int getWidthMils() {
        return this.widthMils;
    }

    public void setWidthMils(int i) {
        this.widthMils = i;
    }

    public int getHeightMils() {
        return this.heightMils;
    }

    public void setHeightMils(int i) {
        this.heightMils = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaSizeExt mediaSizeExt = (MediaSizeExt) obj;
        if (this.widthMils != mediaSizeExt.widthMils || this.heightMils != mediaSizeExt.heightMils || !this.id.equals(mediaSizeExt.id)) {
            return false;
        }
        String str = this.label;
        String str2 = mediaSizeExt.label;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        String str = this.label;
        return (((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.widthMils) * 31) + this.heightMils;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSizeExt{id='");
        sb.append(this.id);
        sb.append("', label='");
        sb.append(this.label);
        sb.append("', widthMils=");
        sb.append(this.widthMils);
        sb.append(", heightMils=");
        sb.append(this.heightMils);
        sb.append('}');
        return sb.toString();
    }
}
