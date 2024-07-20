package com.google.firebase.crashlytics.internal.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HttpGetRequest {
    private final Map<String, String> headers = new HashMap();
    private final Map<String, String> queryParams;
    private final String url;

    public HttpGetRequest(String str, Map<String, String> map) {
        this.url = str;
        this.queryParams = map;
    }

    public HttpGetRequest header(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.network.HttpResponse execute() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.url     // Catch:{ all -> 0x0084 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.queryParams     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r5.createUrlWithParams(r1, r2)     // Catch:{ all -> 0x0084 }
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "GET Request URL: "
            r3.<init>(r4)     // Catch:{ all -> 0x0084 }
            r3.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0084 }
            r2.v(r3)     // Catch:{ all -> 0x0084 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0084 }
            r2.<init>(r1)     // Catch:{ all -> 0x0084 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0084 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0082 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0082 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.headers     // Catch:{ all -> 0x0082 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0082 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0040:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0082 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0082 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0082 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0082 }
            goto L_0x0040
        L_0x005c:
            r1.connect()     // Catch:{ all -> 0x0082 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0082 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0072
            java.lang.String r0 = r5.readStream(r3)     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L_0x0087
        L_0x0072:
            if (r3 == 0) goto L_0x0077
            r3.close()
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.disconnect()
        L_0x007c:
            com.google.firebase.crashlytics.internal.network.HttpResponse r1 = new com.google.firebase.crashlytics.internal.network.HttpResponse
            r1.<init>(r2, r0)
            return r1
        L_0x0082:
            r2 = move-exception
            goto L_0x0087
        L_0x0084:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            r1.disconnect()
        L_0x0091:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.network.HttpGetRequest.execute():com.google.firebase.crashlytics.internal.network.HttpResponse");
    }

    private String createUrlWithParams(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String createParamsString = createParamsString(map);
        if (createParamsString.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                StringBuilder sb = new StringBuilder("&");
                sb.append(createParamsString);
                createParamsString = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(createParamsString);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?");
        sb3.append(createParamsString);
        return sb3.toString();
    }

    private String createParamsString(Map<String, String> map) throws UnsupportedEncodingException {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb.append((String) next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode((String) next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            sb.append("&");
            sb.append((String) next2.getKey());
            sb.append("=");
            if (next2.getValue() != null) {
                str = URLEncoder.encode((String) next2.getValue(), "UTF-8");
            } else {
                str = "";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private String readStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
