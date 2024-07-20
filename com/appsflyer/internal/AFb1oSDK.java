package com.appsflyer.internal;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class AFb1oSDK {
    public static final double valueOf(String str) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            Number parse = NumberFormat.getInstance(Locale.getDefault()).parse(str);
            if (parse != null) {
                return parse.doubleValue();
            }
            throw new ParseException("Failed parse String into number", 0);
        }
    }
}
