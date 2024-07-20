package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.measurement.internal.zzih;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzfl extends zze {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List<String> zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn = 0;
    private String zzo = null;

    /* access modifiers changed from: package-private */
    public final int zzaa() {
        zzu();
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int zzab() {
        zzu();
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    /* access modifiers changed from: package-private */
    public final zzo zza(String str) {
        String str2;
        int i;
        String str3;
        long j;
        Boolean bool;
        String str4;
        List<String> list;
        long j2;
        long j3;
        boolean z;
        int i2;
        zzt();
        zzih zzm2 = zzk().zzm();
        if (!zznp.zza() || !zze().zza(zzbi.zzcl)) {
            str2 = "";
            i = 100;
        } else {
            str2 = zzk().zzh().zzf();
            i = zzm2.zza();
        }
        String zzad = zzad();
        String zzae = zzae();
        zzu();
        String str5 = this.zzb;
        long zzab = (long) zzab();
        zzu();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        zzu();
        zzt();
        if (this.zzf == 0) {
            this.zzf = this.zzu.zzt().zza(zza(), zza().getPackageName());
        }
        long j4 = this.zzf;
        boolean zzac = this.zzu.zzac();
        boolean z2 = zzk().zzm;
        zzt();
        if (!this.zzu.zzac()) {
            str3 = null;
        } else {
            str3 = zzah();
        }
        zzhf zzhf = this.zzu;
        String str7 = zzad;
        long zza2 = zzhf.zzn().zzc.zza();
        if (zza2 == 0) {
            j = zzhf.zza;
        } else {
            j = Math.min(zzhf.zza, zza2);
        }
        long j5 = j;
        int zzaa = zzaa();
        boolean zzp = zze().zzp();
        zzgd zzk2 = zzk();
        zzk2.zzt();
        boolean z3 = zzk2.zzc().getBoolean("deferred_analytics_collection", false);
        String zzac2 = zzac();
        Boolean zzg2 = zze().zzg("google_analytics_default_allow_ad_personalization_signals");
        if (zzg2 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!zzg2.booleanValue());
        }
        long j6 = this.zzg;
        List<String> list2 = this.zzh;
        String zze2 = zzm2.zze();
        if (this.zzi == null) {
            this.zzi = zzq().zzp();
        }
        String str8 = this.zzi;
        if (!zzps.zza() || !zze().zza(zzbi.zzbs)) {
            j2 = j6;
            list = list2;
            j3 = 0;
            str4 = null;
        } else {
            zzt();
            j3 = 0;
            if (this.zzn != 0) {
                long currentTimeMillis = zzb().currentTimeMillis();
                j2 = j6;
                long j7 = this.zzn;
                list = list2;
                if (this.zzm != null && currentTimeMillis - j7 > 86400000 && this.zzo == null) {
                    zzag();
                }
            } else {
                j2 = j6;
                list = list2;
            }
            if (this.zzm == null) {
                zzag();
            }
            str4 = this.zzm;
        }
        Boolean zzg3 = zze().zzg("google_analytics_sgtm_upload_enabled");
        if (zzg3 == null) {
            z = false;
        } else {
            z = zzg3.booleanValue();
        }
        long zzc2 = zzq().zzc(zzad());
        if (!zzpg.zza() || !zze().zza(zzbi.zzcg)) {
            i2 = 0;
        } else {
            zzq();
            i2 = zznd.zzc();
        }
        return new zzo(str7, zzae, str5, zzab, str6, 82001, j4, str, zzac, !z2, str3, 0, j5, zzaa, zzp, z3, zzac2, bool, j2, list, (String) null, zze2, str8, str4, z, zzc2, i, str2, i2, (!zzpg.zza() || !zze().zza(zzbi.zzcg)) ? j3 : zzq().zzh());
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzfl zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzfo zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ zziq zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzkh zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzkp zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzlx zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    /* access modifiers changed from: package-private */
    public final String zzac() {
        zzu();
        return this.zzl;
    }

    /* access modifiers changed from: package-private */
    public final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    private final String zzah() {
        if (!zzqe.zza() || !zze().zza(zzbi.zzbk)) {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final List<String> zzaf() {
        return this.zzh;
    }

    zzfl(zzhf zzhf, long j) {
        super(zzhf);
        this.zzg = j;
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018c A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018d A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0196 A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01af A[Catch:{ IllegalStateException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzx() {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.zza()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.zza(r9, r8)
            goto L_0x0079
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.zza(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.zza()     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007b }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r7 == 0) goto L_0x0079
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007b }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x007b }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008f
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007c
        L_0x0079:
            r8 = r2
            goto L_0x008f
        L_0x007b:
            r7 = r2
        L_0x007c:
            com.google.android.gms.measurement.internal.zzfr r8 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.zza(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x008f:
            r11.zza = r0
            r11.zzd = r5
            r11.zzb = r2
            r11.zzc = r6
            r11.zze = r8
            r5 = 0
            r11.zzf = r5
            com.google.android.gms.measurement.internal.zzhf r2 = r11.zzu
            java.lang.String r2 = r2.zzu()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x00ba
            com.google.android.gms.measurement.internal.zzhf r2 = r11.zzu
            java.lang.String r2 = r2.zzv()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00ba
            r2 = 1
            goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzhf r6 = r11.zzu
            int r6 = r6.zzc()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0143;
                case 2: goto L_0x0135;
                case 3: goto L_0x0127;
                case 4: goto L_0x0119;
                case 5: goto L_0x010b;
                case 6: goto L_0x00fd;
                case 7: goto L_0x00ef;
                case 8: goto L_0x00e0;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement disabled"
            r7.zza(r8)
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzm()
            java.lang.String r8 = "Invalid scion state in identity"
            r7.zza(r8)
            goto L_0x015e
        L_0x00e0:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.zza(r8)
            goto L_0x015e
        L_0x00ef:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.zza(r8)
            goto L_0x015e
        L_0x00fd:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzv()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.zza(r8)
            goto L_0x015e
        L_0x010b:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzp()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.zza(r8)
            goto L_0x015e
        L_0x0119:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.zza(r8)
            goto L_0x015e
        L_0x0127:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.zza(r8)
            goto L_0x015e
        L_0x0135:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzp()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.zza(r8)
            goto L_0x015e
        L_0x0143:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzn()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.zza(r8)
            goto L_0x015e
        L_0x0151:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzp()
            java.lang.String r8 = "App measurement collection enabled"
            r7.zza(r8)
        L_0x015e:
            if (r6 != 0) goto L_0x0162
            r6 = 1
            goto L_0x0163
        L_0x0162:
            r6 = 0
        L_0x0163:
            r11.zzk = r3
            r11.zzl = r3
            if (r2 == 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zzhf r2 = r11.zzu
            java.lang.String r2 = r2.zzu()
            r11.zzl = r2
        L_0x0171:
            android.content.Context r2 = r11.zza()     // Catch:{ IllegalStateException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzhf r7 = r11.zzu     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r7 = r7.zzx()     // Catch:{ IllegalStateException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzgz r8 = new com.google.android.gms.measurement.internal.zzgz     // Catch:{ IllegalStateException -> 0x01cc }
            r8.<init>(r2, r7)     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r2 = "google_app_id"
            java.lang.String r2 = r8.zza((java.lang.String) r2)     // Catch:{ IllegalStateException -> 0x01cc }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01cc }
            if (r7 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r3 = r2
        L_0x018e:
            r11.zzk = r3     // Catch:{ IllegalStateException -> 0x01cc }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01cc }
            if (r2 != 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.zzgz r2 = new com.google.android.gms.measurement.internal.zzgz     // Catch:{ IllegalStateException -> 0x01cc }
            android.content.Context r3 = r11.zza()     // Catch:{ IllegalStateException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzhf r7 = r11.zzu     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r7 = r7.zzx()     // Catch:{ IllegalStateException -> 0x01cc }
            r2.<init>(r3, r7)     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r3 = "admob_app_id"
            java.lang.String r2 = r2.zza((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x01cc }
            r11.zzl = r2     // Catch:{ IllegalStateException -> 0x01cc }
        L_0x01ad:
            if (r6 == 0) goto L_0x01de
            com.google.android.gms.measurement.internal.zzfr r2 = r11.zzj()     // Catch:{ IllegalStateException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzp()     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r3 = r11.zza     // Catch:{ IllegalStateException -> 0x01cc }
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01cc }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01cc }
            if (r6 == 0) goto L_0x01c4
            java.lang.String r6 = r11.zzl     // Catch:{ IllegalStateException -> 0x01cc }
            goto L_0x01c6
        L_0x01c4:
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01cc }
        L_0x01c6:
            java.lang.String r7 = "App measurement enabled for app package, google app id"
            r2.zza(r7, r3, r6)     // Catch:{ IllegalStateException -> 0x01cc }
            goto L_0x01de
        L_0x01cc:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.zza(r6, r0, r2)
        L_0x01de:
            r0 = 0
            r11.zzh = r0
            com.google.android.gms.measurement.internal.zzaf r0 = r11.zze()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.zzi(r2)
            if (r0 == 0) goto L_0x021e
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0201
            com.google.android.gms.measurement.internal.zzfr r2 = r11.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzv()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.zza(r3)
            goto L_0x021d
        L_0x0201:
            java.util.Iterator r2 = r0.iterator()
        L_0x0205:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x021e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.zznd r6 = r11.zzq()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.zzb((java.lang.String) r7, (java.lang.String) r3)
            if (r3 != 0) goto L_0x0205
        L_0x021d:
            r5 = 0
        L_0x021e:
            if (r5 == 0) goto L_0x0222
            r11.zzh = r0
        L_0x0222:
            if (r1 == 0) goto L_0x022f
            android.content.Context r0 = r11.zza()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r11.zzj = r0
            return
        L_0x022f:
            r11.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfl.zzx():void");
    }

    /* access modifiers changed from: package-private */
    public final void zzag() {
        String str;
        zzt();
        if (!zzk().zzm().zza(zzih.zza.ANALYTICS_STORAGE)) {
            zzj().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            zzq().zzv().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        zzft zzc2 = zzj().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzc2.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = str;
        this.zzn = zzb().currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(String str) {
        String str2 = this.zzo;
        boolean z = str2 != null && !str2.equals(str);
        this.zzo = str;
        return z;
    }
}
