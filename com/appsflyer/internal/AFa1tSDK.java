package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1tSDK {
    public static JSONObject AFInAppEventParameterName(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), values(next.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject AFKeystoreWrapper(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object values(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (Object values : (Collection) obj) {
                    jSONArray.put(values(values));
                }
                return jSONArray;
            } catch (Exception unused) {
                return JSONObject.NULL;
            }
        } else if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(values(Array.get(obj, i)));
            }
            return jSONArray2;
        } else if (obj instanceof Map) {
            return AFInAppEventParameterName((Map) obj);
        } else {
            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
        }
    }

    public static Map<String, Object> AFKeystoreWrapper(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> values(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    static AFf1zSDK AFInAppEventType(Context context) {
        if (context instanceof Activity) {
            return AFf1zSDK.activity;
        }
        if (context instanceof Application) {
            return AFf1zSDK.application;
        }
        return AFf1zSDK.other;
    }
}
