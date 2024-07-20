package com.pichillilorenzo.flutter_inappwebview.types;

public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);
    
    private final int value;

    private PreferredContentModeOptionType(int i) {
        this.value = i;
    }

    public final boolean equalsValue(int i) {
        return this.value == i;
    }

    public static PreferredContentModeOptionType fromValue(int i) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
            }
        }
        StringBuilder sb = new StringBuilder("No enum constant: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int toValue() {
        return this.value;
    }
}
