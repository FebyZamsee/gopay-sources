package com.google.android.gms.maps.model;

public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.length = Math.max(f, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Dash: length=");
        sb.append(this.length);
        sb.append("]");
        return sb.toString();
    }
}
