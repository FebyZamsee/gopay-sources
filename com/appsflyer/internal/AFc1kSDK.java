package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class AFc1kSDK {
    public static final JSONArray valueOf(List<AFc1rSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterable<AFc1rSDK> iterable = list;
        Intrinsics.checkNotNullParameter(iterable, "");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (AFc1rSDK values : iterable) {
            arrayList.add(values.values());
        }
        return new JSONArray((List) arrayList);
    }

    public static final boolean valueOf(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
