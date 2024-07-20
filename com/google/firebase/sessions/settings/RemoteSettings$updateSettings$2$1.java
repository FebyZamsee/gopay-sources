package com.google.firebase.sessions.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.TooltipCompatHandler;
import o.getLayoutResource;
import org.json.JSONObject;

final class RemoteSettings$updateSettings$2$1 extends getLayoutResource implements Function2<JSONObject, TooltipCompatHandler<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, TooltipCompatHandler<? super RemoteSettings$updateSettings$2$1> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.this$0 = remoteSettings;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, tooltipCompatHandler);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    public final Object invoke(JSONObject jSONObject, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fb, code lost:
        r12 = (java.lang.Integer) r7.onTransact;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        if (r12 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        r12 = r12;
        r11.L$0 = r1;
        r11.L$1 = r8;
        r11.L$2 = null;
        r11.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011a, code lost:
        if (r11.this$0.settingsCache.updateSessionRestartTimeout((java.lang.Integer) r7.onTransact, r11) != r4) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011d, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        r12 = (java.lang.Double) r1.onTransact;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        if (r12 == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0124, code lost:
        r12 = r12;
        r11.L$0 = r0;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013d, code lost:
        if (r11.this$0.settingsCache.updateSamplingRate((java.lang.Double) r1.onTransact, r11) != r4) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0140, code lost:
        r12 = (java.lang.Integer) r0.onTransact;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r12 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        r12 = r12;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015f, code lost:
        if (r11.this$0.settingsCache.updateSessionCacheDuration((java.lang.Integer) r0.onTransact, r11) != r4) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0161, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0162, code lost:
        r12 = kotlin.Unit.asInterface;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0165, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0166, code lost:
        if (r12 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0168, code lost:
        r12 = r11.this$0.settingsCache;
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0182, code lost:
        if (r12.updateSessionCacheDuration(86400, r11) != r4) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0184, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0185, code lost:
        r11.L$0 = null;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a4, code lost:
        if (r11.this$0.settingsCache.updateSessionCacheUpdatedTime(new java.lang.Long(java.lang.System.currentTimeMillis()), r11) != r4) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a9, code lost:
        return kotlin.Unit.asInterface;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "cache_duration"
            java.lang.String r1 = "session_timeout_seconds"
            java.lang.String r2 = "sampling_rate"
            java.lang.String r3 = "sessions_enabled"
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r4 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r5 = r11.label
            r6 = 0
            switch(r5) {
                case 0: goto L_0x0072;
                case 1: goto L_0x005b;
                case 2: goto L_0x0048;
                case 3: goto L_0x0039;
                case 4: goto L_0x002e;
                case 5: goto L_0x0023;
                case 6: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0018:
            boolean r0 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r0 != 0) goto L_0x001e
            goto L_0x01a7
        L_0x001e:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x0023:
            boolean r0 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r0 != 0) goto L_0x0029
            goto L_0x0185
        L_0x0029:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x002e:
            boolean r0 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r0 != 0) goto L_0x0034
            goto L_0x0162
        L_0x0034:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x0039:
            java.lang.Object r0 = r11.L$0
            o.AsyncLayoutInflater$read r0 = (o.AsyncLayoutInflater.read) r0
            boolean r1 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r1 != 0) goto L_0x0043
            goto L_0x0140
        L_0x0043:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x0048:
            java.lang.Object r0 = r11.L$1
            o.AsyncLayoutInflater$read r0 = (o.AsyncLayoutInflater.read) r0
            java.lang.Object r1 = r11.L$0
            o.AsyncLayoutInflater$read r1 = (o.AsyncLayoutInflater.read) r1
            boolean r2 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x0056
            goto L_0x011e
        L_0x0056:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x005b:
            java.lang.Object r0 = r11.L$2
            o.AsyncLayoutInflater$read r0 = (o.AsyncLayoutInflater.read) r0
            java.lang.Object r1 = r11.L$1
            o.AsyncLayoutInflater$read r1 = (o.AsyncLayoutInflater.read) r1
            java.lang.Object r2 = r11.L$0
            o.AsyncLayoutInflater$read r2 = (o.AsyncLayoutInflater.read) r2
            boolean r3 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r3 != 0) goto L_0x006d
            goto L_0x00f6
        L_0x006d:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x0072:
            boolean r5 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r5 != 0) goto L_0x01aa
            java.lang.Object r12 = r11.L$0
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            o.AsyncLayoutInflater$read r5 = new o.AsyncLayoutInflater$read
            r5.<init>()
            o.AsyncLayoutInflater$read r7 = new o.AsyncLayoutInflater$read
            r7.<init>()
            o.AsyncLayoutInflater$read r8 = new o.AsyncLayoutInflater$read
            r8.<init>()
            java.lang.String r9 = "app_quality"
            boolean r10 = r12.has(r9)
            if (r10 == 0) goto L_0x00da
            java.lang.Object r12 = r12.get(r9)
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r12)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            boolean r9 = r12.has(r3)     // Catch:{ JSONException -> 0x00d5 }
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r3 = r12.get(r3)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x00d5 }
            goto L_0x00a8
        L_0x00a7:
            r3 = r6
        L_0x00a8:
            boolean r9 = r12.has(r2)     // Catch:{ JSONException -> 0x00d3 }
            if (r9 == 0) goto L_0x00b6
            java.lang.Object r2 = r12.get(r2)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00d3 }
            r5.onTransact = r2     // Catch:{ JSONException -> 0x00d3 }
        L_0x00b6:
            boolean r2 = r12.has(r1)     // Catch:{ JSONException -> 0x00d3 }
            if (r2 == 0) goto L_0x00c4
            java.lang.Object r1 = r12.get(r1)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00d3 }
            r7.onTransact = r1     // Catch:{ JSONException -> 0x00d3 }
        L_0x00c4:
            boolean r1 = r12.has(r0)     // Catch:{ JSONException -> 0x00d3 }
            if (r1 == 0) goto L_0x00db
            java.lang.Object r12 = r12.get(r0)     // Catch:{ JSONException -> 0x00d3 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ JSONException -> 0x00d3 }
            r8.onTransact = r12     // Catch:{ JSONException -> 0x00d3 }
            goto L_0x00db
        L_0x00d3:
            r12 = move-exception
            goto L_0x00d7
        L_0x00d5:
            r12 = move-exception
            r3 = r6
        L_0x00d7:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            goto L_0x00db
        L_0x00da:
            r3 = r6
        L_0x00db:
            if (r3 == 0) goto L_0x00fa
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            r11.L$0 = r5
            r11.L$1 = r7
            r11.L$2 = r8
            r0 = 1
            r11.label = r0
            java.lang.Object r12 = r12.updateSettingsEnabled(r3, r11)
            if (r12 != r4) goto L_0x00f3
            return r4
        L_0x00f3:
            r2 = r5
            r1 = r7
            r0 = r8
        L_0x00f6:
            r8 = r0
            r7 = r1
            r1 = r2
            goto L_0x00fb
        L_0x00fa:
            r1 = r5
        L_0x00fb:
            T r12 = r7.onTransact
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L_0x011d
            com.google.firebase.sessions.settings.RemoteSettings r0 = r11.this$0
            java.lang.Number r12 = (java.lang.Number) r12
            com.google.firebase.sessions.settings.SettingsCache r12 = r0.settingsCache
            T r0 = r7.onTransact
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.L$0 = r1
            r11.L$1 = r8
            r11.L$2 = r6
            r2 = 2
            r11.label = r2
            java.lang.Object r12 = r12.updateSessionRestartTimeout(r0, r11)
            if (r12 != r4) goto L_0x011d
            return r4
        L_0x011d:
            r0 = r8
        L_0x011e:
            T r12 = r1.onTransact
            java.lang.Double r12 = (java.lang.Double) r12
            if (r12 == 0) goto L_0x0140
            com.google.firebase.sessions.settings.RemoteSettings r2 = r11.this$0
            java.lang.Number r12 = (java.lang.Number) r12
            com.google.firebase.sessions.settings.SettingsCache r12 = r2.settingsCache
            T r1 = r1.onTransact
            java.lang.Double r1 = (java.lang.Double) r1
            r11.L$0 = r0
            r11.L$1 = r6
            r11.L$2 = r6
            r2 = 3
            r11.label = r2
            java.lang.Object r12 = r12.updateSamplingRate(r1, r11)
            if (r12 != r4) goto L_0x0140
            return r4
        L_0x0140:
            T r12 = r0.onTransact
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L_0x0165
            com.google.firebase.sessions.settings.RemoteSettings r1 = r11.this$0
            java.lang.Number r12 = (java.lang.Number) r12
            com.google.firebase.sessions.settings.SettingsCache r12 = r1.settingsCache
            T r0 = r0.onTransact
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 4
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheDuration(r0, r11)
            if (r12 != r4) goto L_0x0162
            return r4
        L_0x0162:
            kotlin.Unit r12 = kotlin.Unit.asInterface
            goto L_0x0166
        L_0x0165:
            r12 = r6
        L_0x0166:
            if (r12 != 0) goto L_0x0185
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            r0 = 86400(0x15180, float:1.21072E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 5
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheDuration(r0, r11)
            if (r12 != r4) goto L_0x0185
            return r4
        L_0x0185:
            com.google.firebase.sessions.settings.RemoteSettings r12 = r11.this$0
            com.google.firebase.sessions.settings.SettingsCache r12 = r12.settingsCache
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r0 = r11
            o.TooltipCompatHandler r0 = (o.TooltipCompatHandler) r0
            r11.L$0 = r6
            r11.L$1 = r6
            r11.L$2 = r6
            r1 = 6
            r11.label = r1
            java.lang.Object r12 = r12.updateSessionCacheUpdatedTime(r2, r0)
            if (r12 != r4) goto L_0x01a7
            return r4
        L_0x01a7:
            kotlin.Unit r12 = kotlin.Unit.asInterface
            return r12
        L_0x01aa:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
