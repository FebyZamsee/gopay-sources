package com.appsflyer.internal;

public final class AFf1hSDK {
    public final AFf1iSDK AFInAppEventParameterName;
    public final AFf1kSDK values;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0052 A[SYNTHETIC, Splitter:B:8:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AFf1hSDK(org.json.JSONObject r13) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.String r0 = "exc_mngr"
            boolean r1 = r13.has(r0)
            java.lang.String r2 = "v1"
            java.lang.String r3 = "data"
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0049
            org.json.JSONArray r0 = r13.getJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            java.lang.String r1 = "sdk_ver"
            java.lang.String r7 = r0.getString(r1)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            java.lang.String r1 = "min"
            r6 = -1
            int r8 = r0.optInt(r1, r6)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            java.lang.String r1 = "expire"
            int r9 = r0.optInt(r1, r6)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            java.lang.String r1 = "ttl"
            r10 = -1
            long r10 = r0.optLong(r1, r10)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            com.appsflyer.internal.AFf1kSDK r0 = new com.appsflyer.internal.AFf1kSDK     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10)     // Catch:{ NullPointerException | JSONException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r0 = r5
        L_0x004a:
            java.lang.String r1 = "meta_data"
            boolean r6 = r13.has(r1)
            if (r6 == 0) goto L_0x0076
            org.json.JSONArray r13 = r13.getJSONArray(r1)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            org.json.JSONObject r13 = r13.optJSONObject(r4)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            org.json.JSONObject r13 = r13.optJSONObject(r3)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            java.lang.Object r13 = java.util.Objects.requireNonNull(r13)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            org.json.JSONObject r13 = r13.optJSONObject(r2)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            java.lang.String r1 = "send_rate"
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r13.optDouble(r1, r2)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            com.appsflyer.internal.AFf1iSDK r13 = new com.appsflyer.internal.AFf1iSDK     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            r13.<init>(r1)     // Catch:{ NullPointerException | JSONException -> 0x0076 }
            r5 = r13
        L_0x0076:
            r12.values = r0
            r12.AFInAppEventParameterName = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1hSDK.<init>(org.json.JSONObject):void");
    }

    public final int hashCode() {
        AFf1kSDK aFf1kSDK = this.values;
        if (aFf1kSDK != null) {
            return aFf1kSDK.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        AFf1iSDK aFf1iSDK;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1hSDK aFf1hSDK = (AFf1hSDK) obj;
        AFf1kSDK aFf1kSDK = this.values;
        if (aFf1kSDK == null || !aFf1kSDK.equals(aFf1hSDK.values) || (aFf1iSDK = this.AFInAppEventParameterName) == null || !aFf1iSDK.equals(aFf1hSDK.AFInAppEventParameterName)) {
            return false;
        }
        return true;
    }
}
