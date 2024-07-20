package com.pichillilorenzo.flutter_inappwebview.types;

import android.print.PrintAttributes;
import java.util.HashMap;
import java.util.Map;

public class MarginsExt {
    private double bottom;
    private double left;
    private double right;
    private double top;

    private static double milsToPixels(int i) {
        return ((double) i) * 0.09600001209449d;
    }

    public MarginsExt() {
    }

    public MarginsExt(double d, double d2, double d3, double d4) {
        this.top = d;
        this.right = d2;
        this.bottom = d3;
        this.left = d4;
    }

    public static MarginsExt fromMargins(PrintAttributes.Margins margins) {
        if (margins == null) {
            return null;
        }
        MarginsExt marginsExt = new MarginsExt();
        marginsExt.top = milsToPixels(margins.getTopMils());
        marginsExt.right = milsToPixels(margins.getRightMils());
        marginsExt.bottom = milsToPixels(margins.getBottomMils());
        marginsExt.left = milsToPixels(margins.getLeftMils());
        return marginsExt;
    }

    public static MarginsExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MarginsExt(((Double) map.get("top")).doubleValue(), ((Double) map.get("right")).doubleValue(), ((Double) map.get("bottom")).doubleValue(), ((Double) map.get("left")).doubleValue());
    }

    public PrintAttributes.Margins toMargins() {
        return new PrintAttributes.Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
    }

    private static int pixelsToMils(double d) {
        return (int) Math.round(d * 10.416665354331d);
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("top", Double.valueOf(this.top));
        hashMap.put("right", Double.valueOf(this.right));
        hashMap.put("bottom", Double.valueOf(this.bottom));
        hashMap.put("left", Double.valueOf(this.left));
        return hashMap;
    }

    public double getTop() {
        return this.top;
    }

    public void setTop(double d) {
        this.top = d;
    }

    public double getRight() {
        return this.right;
    }

    public void setRight(double d) {
        this.right = d;
    }

    public double getBottom() {
        return this.bottom;
    }

    public void setBottom(double d) {
        this.bottom = d;
    }

    public double getLeft() {
        return this.left;
    }

    public void setLeft(double d) {
        this.left = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarginsExt marginsExt = (MarginsExt) obj;
        if (Double.compare(marginsExt.top, this.top) == 0 && Double.compare(marginsExt.right, this.right) == 0 && Double.compare(marginsExt.bottom, this.bottom) == 0 && Double.compare(marginsExt.left, this.left) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.top);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.right);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.bottom);
        long doubleToLongBits4 = Double.doubleToLongBits(this.left);
        return (((((i * 31) + i2) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MarginsExt{top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", left=");
        sb.append(this.left);
        sb.append('}');
        return sb.toString();
    }
}
