package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;

public class ViewUtils {
    private ViewUtils() {
    }

    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/") || !z) {
            return attributeValue;
        }
        String substring = attributeValue.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            Resources resources = context.getResources();
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(":string/");
            sb.append(substring);
            resources.getValue(sb.toString(), typedValue, true);
        } catch (Resources.NotFoundException unused) {
        }
        return typedValue.string != null ? typedValue.string.toString() : attributeValue;
    }
}
