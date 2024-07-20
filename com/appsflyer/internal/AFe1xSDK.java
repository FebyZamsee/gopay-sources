package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AFe1xSDK extends AFd1jSDK<Map<String, Object>> {
    private static final int afInfoLog = ((int) TimeUnit.SECONDS.toMillis(2));
    private final Map<String, Object> AFLogger;
    private final List<String> AFVersionDeclaration;
    private final Context afDebugLog;
    private Map<String, Object> afErrorLog;
    private final Uri afRDLog;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final long AFInAppEventType() {
        return 60000;
    }

    public AFe1xSDK(Context context, Map<String, Object> map, Uri uri, List<String> list) {
        super(AFd1kSDK.RESOLVE_ESP, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, "ResolveEsp");
        this.afDebugLog = context;
        this.AFLogger = map;
        this.afRDLog = uri;
        this.AFVersionDeclaration = list;
    }

    public final AFd1sSDK valueOf() throws Exception {
        if (!AFKeystoreWrapper(this.afRDLog.toString())) {
            AFa1dSDK.valueOf().valueOf(this.afDebugLog, this.AFLogger, this.afRDLog);
            return AFd1sSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.afRDLog.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Integer num = null;
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(Uri.parse(obj));
            String str2 = (String) AFKeystoreWrapper.get("res");
            Integer num2 = (Integer) AFKeystoreWrapper.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) AFKeystoreWrapper.get("error");
            if (str2 == null || !AFKeystoreWrapper(str2)) {
                Integer num3 = num2;
                str = str3;
                obj = str2;
                num = num3;
            } else {
                if (i < 4) {
                    arrayList.add(str2);
                }
                i++;
                Integer num4 = num2;
                str = str3;
                obj = str2;
                num = num4;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.AFLogger) {
            this.AFLogger.put("af_deeplink_r", hashMap);
            this.AFLogger.put("af_deeplink", this.afRDLog.toString());
        }
        AFa1dSDK.valueOf().valueOf(this.afDebugLog, this.AFLogger, obj != null ? Uri.parse(obj) : this.afRDLog);
        this.afErrorLog = hashMap;
        return AFd1sSDK.SUCCESS;
    }

    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = afInfoLog;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.11.1");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.AFVersionDeclaration);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.AFVersionDeclaration.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
