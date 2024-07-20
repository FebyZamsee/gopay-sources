package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;

public final class zzgk {
    private static final ArrayMap<String, Uri> zza = new ArrayMap<>();

    public static Uri zza(String str) {
        Uri uri;
        synchronized (zzgk.class) {
            ArrayMap<String, Uri> arrayMap = zza;
            uri = arrayMap.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                arrayMap.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }
}
