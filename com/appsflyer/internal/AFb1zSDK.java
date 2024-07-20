package com.appsflyer.internal;

import android.content.Context;

final class AFb1zSDK extends AFb1gSDK<String> {
    AFb1zSDK(Context context, AFc1pSDK aFc1pSDK) {
        super(context, aFc1pSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: AFKeystoreWrapper */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String valueOf() {
        /*
            r9 = this;
            java.lang.String r0 = "aid"
            r1 = 0
            android.content.Context r2 = r9.valueOf     // Catch:{ all -> 0x0047 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "content://"
            r2.<init>(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = r9.AFInAppEventParameterName     // Catch:{ all -> 0x0047 }
            r2.append(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0047 }
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0047 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0041
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x0041
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003d
            r2.close()
        L_0x003d:
            return r0
        L_0x003e:
            r0 = move-exception
            r1 = r2
            goto L_0x0048
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            if (r1 == 0) goto L_0x004d
            r1.close()
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.valueOf():java.lang.String");
    }

    public final String AFInAppEventType() {
        this.AFKeystoreWrapper.valueOf().execute(this.AFInAppEventType);
        return (String) super.values();
    }

    public final /* synthetic */ Object values() {
        this.AFKeystoreWrapper.valueOf().execute(this.AFInAppEventType);
        return (String) super.values();
    }
}
