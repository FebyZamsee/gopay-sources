package com.pichillilorenzo.flutter_inappwebview.content_blocker;

public enum ContentBlockerTriggerResourceType {
    DOCUMENT("document"),
    IMAGE("image"),
    STYLE_SHEET("style-sheet"),
    SCRIPT("script"),
    FONT("font"),
    SVG_DOCUMENT("svg-document"),
    MEDIA("media"),
    POPUP("popup"),
    RAW("raw");
    
    private final String value;

    private ContentBlockerTriggerResourceType(String str) {
        this.value = str;
    }

    public final boolean equalsValue(String str) {
        return this.value.equals(str);
    }

    public static ContentBlockerTriggerResourceType fromValue(String str) {
        for (ContentBlockerTriggerResourceType contentBlockerTriggerResourceType : values()) {
            if (str.equals(contentBlockerTriggerResourceType.value)) {
                return contentBlockerTriggerResourceType;
            }
        }
        StringBuilder sb = new StringBuilder("No enum constant: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return this.value;
    }
}
