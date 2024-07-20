package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

final class zzjx implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zziq zza;

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[SYNTHETIC, Splitter:B:45:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0140 A[Catch:{ RuntimeException -> 0x01ce }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0141 A[Catch:{ RuntimeException -> 0x01ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzjx r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            r1 = r16
            r0 = r19
            r2 = r20
            com.google.android.gms.measurement.internal.zziq r3 = r1.zza
            r3.zzt()
            com.google.android.gms.measurement.internal.zziq r3 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zznd r3 = r3.zzq()     // Catch:{ RuntimeException -> 0x01ce }
            boolean r4 = com.google.android.gms.internal.measurement.zzpy.zza()     // Catch:{ RuntimeException -> 0x01ce }
            r6 = 1
            if (r4 == 0) goto L_0x0028
            com.google.android.gms.measurement.internal.zziq r4 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzaf r4 = r4.zze()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzby     // Catch:{ RuntimeException -> 0x01ce }
            boolean r4 = r4.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r7)     // Catch:{ RuntimeException -> 0x01ce }
            if (r4 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            boolean r7 = com.google.android.gms.internal.measurement.zzoi.zza()     // Catch:{ RuntimeException -> 0x01ce }
            if (r7 == 0) goto L_0x003f
            com.google.android.gms.measurement.internal.zziq r7 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzaf r7 = r7.zze()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzbi.zzcs     // Catch:{ RuntimeException -> 0x01ce }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            boolean r8 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r8 == 0) goto L_0x0053
            goto L_0x00a2
        L_0x0053:
            boolean r8 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x0063
            java.lang.String r8 = "gbraid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
        L_0x0063:
            boolean r8 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "utm_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "dclid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "srsltid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
            if (r4 == 0) goto L_0x0097
            java.lang.String r8 = "sfmc_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 != 0) goto L_0x00a4
        L_0x0097:
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzc()     // Catch:{ RuntimeException -> 0x01ce }
            r3.zza(r9)     // Catch:{ RuntimeException -> 0x01ce }
        L_0x00a2:
            r3 = 0
            goto L_0x00c1
        L_0x00a4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r14 = "https://google.com/search?"
            r8.<init>(r14)     // Catch:{ RuntimeException -> 0x01ce }
            r8.append(r2)     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r8 = r8.toString()     // Catch:{ RuntimeException -> 0x01ce }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ RuntimeException -> 0x01ce }
            android.os.Bundle r3 = r3.zza((android.net.Uri) r8, (boolean) r4, (boolean) r7)     // Catch:{ RuntimeException -> 0x01ce }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r4 = "referrer"
            r3.putString(r10, r4)     // Catch:{ RuntimeException -> 0x01ce }
        L_0x00c1:
            java.lang.String r4 = "_cmp"
            if (r17 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.zziq r7 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zznd r7 = r7.zzq()     // Catch:{ RuntimeException -> 0x01ce }
            boolean r8 = com.google.android.gms.internal.measurement.zzpy.zza()     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.zziq r8 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzaf r8 = r8.zze()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzbi.zzby     // Catch:{ RuntimeException -> 0x01ce }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r14)     // Catch:{ RuntimeException -> 0x01ce }
            if (r8 == 0) goto L_0x00e1
            r8 = 1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            boolean r14 = com.google.android.gms.internal.measurement.zzoi.zza()     // Catch:{ RuntimeException -> 0x01ce }
            if (r14 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.zziq r14 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzaf r14 = r14.zze()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzbi.zzcs     // Catch:{ RuntimeException -> 0x01ce }
            boolean r5 = r14.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r5)     // Catch:{ RuntimeException -> 0x01ce }
            if (r5 == 0) goto L_0x00fa
            r5 = r18
            r14 = 1
            goto L_0x00fd
        L_0x00fa:
            r5 = r18
            r14 = 0
        L_0x00fd:
            android.os.Bundle r5 = r7.zza((android.net.Uri) r5, (boolean) r8, (boolean) r14)     // Catch:{ RuntimeException -> 0x01ce }
            if (r5 == 0) goto L_0x0139
            java.lang.String r7 = "intent"
            r5.putString(r10, r7)     // Catch:{ RuntimeException -> 0x01ce }
            boolean r7 = r5.containsKey(r15)     // Catch:{ RuntimeException -> 0x01ce }
            if (r7 != 0) goto L_0x012b
            if (r3 == 0) goto L_0x012b
            boolean r7 = r3.containsKey(r15)     // Catch:{ RuntimeException -> 0x01ce }
            if (r7 == 0) goto L_0x012b
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r8 = r3.getString(r15)     // Catch:{ RuntimeException -> 0x01ce }
            r10 = 0
            r7[r10] = r8     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r8 = "gclid=%s"
            java.lang.String r7 = java.lang.String.format(r8, r7)     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r8 = "_cer"
            r5.putString(r8, r7)     // Catch:{ RuntimeException -> 0x01ce }
            goto L_0x012c
        L_0x012b:
            r10 = 0
        L_0x012c:
            com.google.android.gms.measurement.internal.zziq r7 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            r7.zzc(r0, r4, r5)     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zziq r7 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzu r7 = r7.zzb     // Catch:{ RuntimeException -> 0x01ce }
            r7.zza(r0, r5)     // Catch:{ RuntimeException -> 0x01ce }
            goto L_0x013a
        L_0x0139:
            r10 = 0
        L_0x013a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x01ce }
            if (r5 == 0) goto L_0x0141
            return
        L_0x0141:
            com.google.android.gms.measurement.internal.zziq r5 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.zzj()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzc()     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r7 = "Activity created with referrer"
            r5.zza(r7, r2)     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zziq r5 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzaf r5 = r5.zze()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzbi     // Catch:{ RuntimeException -> 0x01ce }
            boolean r5 = r5.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r7)     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r7 = "_ldl"
            java.lang.String r8 = "auto"
            if (r5 == 0) goto L_0x0187
            if (r3 == 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zziq r2 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            r2.zzc(r0, r4, r3)     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zziq r2 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzu r2 = r2.zzb     // Catch:{ RuntimeException -> 0x01ce }
            r2.zza(r0, r3)     // Catch:{ RuntimeException -> 0x01ce }
            goto L_0x0180
        L_0x0171:
            com.google.android.gms.measurement.internal.zziq r0 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzc()     // Catch:{ RuntimeException -> 0x01ce }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.zza(r3, r2)     // Catch:{ RuntimeException -> 0x01ce }
        L_0x0180:
            com.google.android.gms.measurement.internal.zziq r0 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            r2 = 0
            r0.zza((java.lang.String) r8, (java.lang.String) r7, (java.lang.Object) r2, (boolean) r6)     // Catch:{ RuntimeException -> 0x01ce }
            return
        L_0x0187:
            boolean r0 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 != 0) goto L_0x01af
            boolean r0 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 != 0) goto L_0x01af
            boolean r0 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 == 0) goto L_0x01b1
        L_0x01af:
            r5 = 1
            goto L_0x01b2
        L_0x01b1:
            r5 = 0
        L_0x01b2:
            if (r5 != 0) goto L_0x01c2
            com.google.android.gms.measurement.internal.zziq r0 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ RuntimeException -> 0x01ce }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzc()     // Catch:{ RuntimeException -> 0x01ce }
            r0.zza(r9)     // Catch:{ RuntimeException -> 0x01ce }
            return
        L_0x01c2:
            boolean r0 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x01ce }
            if (r0 != 0) goto L_0x01cd
            com.google.android.gms.measurement.internal.zziq r0 = r1.zza     // Catch:{ RuntimeException -> 0x01ce }
            r0.zza((java.lang.String) r8, (java.lang.String) r7, (java.lang.Object) r2, (boolean) r6)     // Catch:{ RuntimeException -> 0x01ce }
        L_0x01cd:
            return
        L_0x01ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zziq r1 = r1.zza
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.zza(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjx.zza(com.google.android.gms.measurement.internal.zzjx, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    zzjx(zziq zziq) {
        this.zza = zziq;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null) {
                    if (uri.isHierarchical()) {
                        this.zza.zzq();
                        this.zza.zzl().zzb((Runnable) new zzka(this, bundle == null, uri, zznd.zza(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                        this.zza.zzn().zza(activity, bundle);
                        return;
                    }
                }
                this.zza.zzn().zza(activity, bundle);
            }
        } catch (RuntimeException e) {
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zzlx zzp = this.zza.zzp();
        zzp.zzl().zzb((Runnable) new zzlz(zzp, zzp.zzb().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        zzlx zzp = this.zza.zzp();
        zzp.zzl().zzb((Runnable) new zzma(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }
}