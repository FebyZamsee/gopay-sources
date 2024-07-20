package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFc1aSDK implements AFd1wSDK<Map<String, Object>> {
    public final /* synthetic */ Object values(String str) throws JSONException {
        return AFInAppEventType(str);
    }

    public static Map<String, Object> AFInAppEventType(String str) throws JSONException {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
            }
            hashMap.remove("is_cache");
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("string_response", str);
            return hashMap2;
        }
    }
}
