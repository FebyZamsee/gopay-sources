package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.android.gms.measurement.internal.zzih;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzmp implements zzif {
    private static volatile zzmp zza;
    private List<Long> zzaa;
    private long zzab;
    private final Map<String, zzih> zzac;
    private final Map<String, zzay> zzad;
    private final Map<String, zzb> zzae;
    private zzki zzaf;
    private String zzag;
    private final zznf zzah;
    private zzgp zzb;
    private zzfy zzc;
    private zzao zzd;
    private zzgb zze;
    private zzmj zzf;
    private zzt zzg;
    private final zzmz zzh;
    private zzkg zzi;
    private zzls zzj;
    private final zzmn zzk;
    private zzgm zzl;
    /* access modifiers changed from: private */
    public final zzhf zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private List<Runnable> zzq;
    private final Set<String> zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List<Long> zzz;

    final class zza implements zzas {
        zzfi.zzj zza;
        List<Long> zzb;
        List<zzfi.zze> zzc;
        private long zzd;

        private static long zza(zzfi.zze zze2) {
            return ((zze2.zzd() / 1000) / 60) / 60;
        }

        private zza() {
        }

        public final void zza(zzfi.zzj zzj) {
            Preconditions.checkNotNull(zzj);
            this.zza = zzj;
        }

        public final boolean zza(long j, zzfi.zze zze2) {
            Preconditions.checkNotNull(zze2);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (!this.zzc.isEmpty() && zza(this.zzc.get(0)) != zza(zze2)) {
                return false;
            }
            long zzbw = this.zzd + ((long) zze2.zzbw());
            zzmp.this.zze();
            if (zzbw >= ((long) Math.max(0, zzbi.zzi.zza(null).intValue()))) {
                return false;
            }
            this.zzd = zzbw;
            this.zzc.add(zze2);
            this.zzb.add(Long.valueOf(j));
            int size = this.zzc.size();
            zzmp.this.zze();
            if (size >= Math.max(1, zzbi.zzj.zza(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    final class zzb {
        final String zza;
        long zzb;

        private zzb(zzmp zzmp) {
            this(zzmp, zzmp.zzq().zzp());
        }

        private zzb(zzmp zzmp, String str) {
            this.zza = str;
            this.zzb = zzmp.zzb().elapsedRealtime();
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    zzj().zzu().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            zzj().zzg().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final long zzx() {
        long currentTimeMillis = zzb().currentTimeMillis();
        zzls zzls = this.zzj;
        zzls.zzak();
        zzls.zzt();
        long zza2 = zzls.zze.zza();
        if (zza2 == 0) {
            zza2 = ((long) zzls.zzq().zzv().nextInt(86400000)) + 1;
            zzls.zze.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    public final Context zza() {
        return this.zzm.zza();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r5.zzl()
            r0.zzt()
            r5.zzs()
            boolean r0 = com.google.android.gms.internal.measurement.zznp.zza()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.google.android.gms.measurement.internal.zzgp r0 = r5.zzi()
            com.google.android.gms.internal.measurement.zzfc$zza r0 = r0.zzb(r6)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzih r1 = r5.zzb((java.lang.String) r6)
            android.os.Bundle r2 = r1.zzb()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.zzay r2 = r5.zzd((java.lang.String) r6)
            com.google.android.gms.measurement.internal.zzak r3 = new com.google.android.gms.measurement.internal.zzak
            r3.<init>()
            com.google.android.gms.measurement.internal.zzay r1 = r5.zza(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.zzb()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.zzmz r1 = r5.zzp()
            boolean r1 = r1.zzc((java.lang.String) r6)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.zzao r1 = r5.zzf()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.zzne r1 = r1.zze(r6, r3)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r6 = r1.zze
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L_0x0071
        L_0x0064:
            com.google.android.gms.measurement.internal.zzgp r1 = r5.zzb
            com.google.android.gms.measurement.internal.zzih$zza r3 = com.google.android.gms.measurement.internal.zzih.zza.AD_PERSONALIZATION
            boolean r6 = r1.zzb((java.lang.String) r6, (com.google.android.gms.measurement.internal.zzih.zza) r3)
            if (r6 == 0) goto L_0x0070
            r6 = 0
            goto L_0x0071
        L_0x0070:
            r6 = 1
        L_0x0071:
            if (r6 != r2) goto L_0x0076
            java.lang.String r6 = "denied"
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = "granted"
        L_0x0078:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String):android.os.Bundle");
    }

    public final Clock zzb() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzh zza(zzo zzo2) {
        zzl().zzt();
        zzs();
        Preconditions.checkNotNull(zzo2);
        Preconditions.checkNotEmpty(zzo2.zza);
        if (!zzo2.zzu.isEmpty()) {
            this.zzae.put(zzo2.zza, new zzb(zzo2.zzu));
        }
        zzh zzd2 = zzf().zzd(zzo2.zza);
        zzih zza2 = zzb(zzo2.zza).zza(zzih.zza(zzo2.zzt));
        String zza3 = zza2.zzg() ? this.zzj.zza(zzo2.zza, zzo2.zzn) : "";
        if (zzd2 == null) {
            zzd2 = new zzh(this.zzm, zzo2.zza);
            if (zza2.zzh()) {
                zzd2.zzb(zza(zza2));
            }
            if (zza2.zzg()) {
                zzd2.zzh(zza3);
            }
        } else if (zza2.zzg() && zza3 != null && !zza3.equals(zzd2.zzae())) {
            zzd2.zzh(zza3);
            if (zzo2.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzj.zza(zzo2.zza, zza2).first)) {
                zzd2.zzb(zza(zza2));
                if (zzf().zze(zzo2.zza, "_id") != null && zzf().zze(zzo2.zza, "_lair") == null) {
                    zzf().zza(new zzne(zzo2.zza, "auto", "_lair", zzb().currentTimeMillis(), 1L));
                }
            }
        } else if (TextUtils.isEmpty(zzd2.zzy()) && zza2.zzh()) {
            zzd2.zzb(zza(zza2));
        }
        zzd2.zzf(zzo2.zzb);
        zzd2.zza(zzo2.zzp);
        if (!TextUtils.isEmpty(zzo2.zzk)) {
            zzd2.zze(zzo2.zzk);
        }
        if (zzo2.zze != 0) {
            zzd2.zzm(zzo2.zze);
        }
        if (!TextUtils.isEmpty(zzo2.zzc)) {
            zzd2.zzd(zzo2.zzc);
        }
        zzd2.zza(zzo2.zzj);
        if (zzo2.zzd != null) {
            zzd2.zzc(zzo2.zzd);
        }
        zzd2.zzj(zzo2.zzf);
        zzd2.zzb(zzo2.zzh);
        if (!TextUtils.isEmpty(zzo2.zzg)) {
            zzd2.zzg(zzo2.zzg);
        }
        zzd2.zza(zzo2.zzn);
        zzd2.zza(zzo2.zzq);
        zzd2.zzk(zzo2.zzr);
        if (zzps.zza() && (zze().zza(zzbi.zzbr) || zze().zze(zzo2.zza, zzbi.zzbt))) {
            zzd2.zzi(zzo2.zzv);
        }
        if (zznq.zza() && zze().zza(zzbi.zzbq)) {
            zzd2.zza(zzo2.zzs);
        } else if (zznq.zza() && zze().zza(zzbi.zzbp)) {
            zzd2.zza((List<String>) null);
        }
        if (zzqd.zza() && zze().zza(zzbi.zzbu)) {
            zzd2.zzc(zzo2.zzw);
        }
        if (zzpg.zza() && zze().zza(zzbi.zzcf)) {
            zzd2.zza(zzo2.zzaa);
        }
        zzd2.zzr(zzo2.zzx);
        if (zzd2.zzal()) {
            zzf().zza(zzd2);
        }
        return zzd2;
    }

    private final zzo zzc(String str) {
        String str2;
        int i;
        String str3 = str;
        zzh zzd2 = zzf().zzd(str3);
        if (zzd2 == null || TextUtils.isEmpty(zzd2.zzaa())) {
            zzj().zzc().zza("No app data available; dropping", str3);
            return null;
        }
        Boolean zza2 = zza(zzd2);
        if (zza2 == null || zza2.booleanValue()) {
            zzih zzb2 = zzb(str);
            if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
                str2 = "";
                i = 100;
            } else {
                str2 = zzd(str).zzf();
                i = zzb2.zza();
            }
            return new zzo(str, zzd2.zzac(), zzd2.zzaa(), zzd2.zzc(), zzd2.zzz(), zzd2.zzo(), zzd2.zzl(), (String) null, zzd2.zzak(), false, zzd2.zzab(), zzd2.zzb(), 0, 0, zzd2.zzaj(), false, zzd2.zzv(), zzd2.zzu(), zzd2.zzm(), zzd2.zzag(), (String) null, zzb2.zze(), "", (String) null, zzd2.zzam(), zzd2.zzt(), i, str2, zzd2.zza(), zzd2.zzd());
        }
        zzj().zzg().zza("App version does not match; dropping. appId", zzfr.zza(str));
        return null;
    }

    public final zzt zzc() {
        return (zzt) zza((zzmo) this.zzg);
    }

    public final zzae zzd() {
        return this.zzm.zzd();
    }

    public final zzaf zze() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzf();
    }

    public final zzao zzf() {
        return (zzao) zza((zzmo) this.zzd);
    }

    private final zzay zza(String str, zzay zzay, zzih zzih, zzak zzak) {
        if (!zznp.zza()) {
            return zzay.zza;
        }
        int i = 90;
        if (zzi().zzb(str) == null) {
            if (zzay.zzc() == Boolean.FALSE) {
                i = zzay.zza();
                zzak.zza(zzih.zza.AD_USER_DATA, i);
            } else {
                zzak.zza(zzih.zza.AD_USER_DATA, zzaj.FAILSAFE);
            }
            return new zzay((Boolean) false, i, (Boolean) true, "-");
        }
        Boolean zzc2 = zzay.zzc();
        if (zzc2 != null) {
            i = zzay.zza();
            zzak.zza(zzih.zza.AD_USER_DATA, i);
        } else {
            if (this.zzb.zza(str, zzih.zza.AD_USER_DATA) == zzih.zza.AD_STORAGE && zzih.zzc() != null) {
                Boolean zzc3 = zzih.zzc();
                zzak.zza(zzih.zza.AD_USER_DATA, zzaj.REMOTE_DELEGATION);
                zzc2 = zzc3;
            }
            if (zzc2 == null) {
                zzc2 = Boolean.valueOf(this.zzb.zzb(str, zzih.zza.AD_USER_DATA));
                zzak.zza(zzih.zza.AD_USER_DATA, zzaj.REMOTE_DEFAULT);
            }
        }
        Preconditions.checkNotNull(zzc2);
        boolean zzn2 = this.zzb.zzn(str);
        SortedSet<String> zzh2 = zzi().zzh(str);
        if (!zzc2.booleanValue() || zzh2.isEmpty()) {
            return new zzay((Boolean) false, i, Boolean.valueOf(zzn2), "-");
        }
        String str2 = "";
        if (zzn2) {
            str2 = TextUtils.join(str2, zzh2);
        }
        return new zzay((Boolean) true, i, Boolean.valueOf(zzn2), str2);
    }

    private final zzay zzd(String str) {
        zzl().zzt();
        zzs();
        if (!zznp.zza()) {
            return zzay.zza;
        }
        zzay zzay = this.zzad.get(str);
        if (zzay != null) {
            return zzay;
        }
        zzay zzf2 = zzf().zzf(str);
        this.zzad.put(str, zzf2);
        return zzf2;
    }

    public final zzfq zzg() {
        return this.zzm.zzk();
    }

    public final zzfr zzj() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzj();
    }

    public final zzfy zzh() {
        return (zzfy) zza((zzmo) this.zzc);
    }

    private final zzgb zzy() {
        zzgb zzgb = this.zze;
        if (zzgb != null) {
            return zzgb;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzgp zzi() {
        return (zzgp) zza((zzmo) this.zzb);
    }

    public final zzgy zzl() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzl();
    }

    /* access modifiers changed from: package-private */
    public final zzhf zzk() {
        return this.zzm;
    }

    /* access modifiers changed from: package-private */
    public final zzih zzb(String str) {
        zzl().zzt();
        zzs();
        zzih zzih = this.zzac.get(str);
        if (zzih == null) {
            zzih = zzf().zzg(str);
            if (zzih == null) {
                zzih = zzih.zza;
            }
            zza(str, zzih);
        }
        return zzih;
    }

    public final zzkg zzm() {
        return (zzkg) zza((zzmo) this.zzi);
    }

    public final zzls zzn() {
        return this.zzj;
    }

    private final zzmj zzz() {
        return (zzmj) zza((zzmo) this.zzf);
    }

    private static zzmo zza(zzmo zzmo) {
        if (zzmo == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzmo.zzam()) {
            return zzmo;
        } else {
            String valueOf = String.valueOf(zzmo.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public final zzmn zzo() {
        return this.zzk;
    }

    public static zzmp zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzmp.class) {
                if (zza == null) {
                    zza = new zzmp((zzna) Preconditions.checkNotNull(new zzna(context)));
                }
            }
        }
        return zza;
    }

    public final zzmz zzp() {
        return (zzmz) zza((zzmo) this.zzh);
    }

    public final zznd zzq() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzt();
    }

    private final Boolean zza(zzh zzh2) {
        try {
            if (zzh2.zzc() != -2147483648L) {
                if (zzh2.zzc() == ((long) Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh2.zzx(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh2.zzx(), 0).versionName;
                String zzaa2 = zzh2.zzaa();
                if (zzaa2 != null && zzaa2.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String zza(zzih zzih) {
        if (!zzih.zzh()) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzq().zzv().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    public final String zzb(zzo zzo2) {
        try {
            return (String) zzl().zza(new zzmt(this, zzo2)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzj().zzg().zza("Failed to get app instance id. appId", zzfr.zza(zzo2.zza), e);
            return null;
        }
    }

    static /* synthetic */ void zza(zzmp zzmp, zzna zzna) {
        zzmp.zzl().zzt();
        zzmp.zzl = new zzgm(zzmp);
        zzao zzao = new zzao(zzmp);
        zzao.zzal();
        zzmp.zzd = zzao;
        zzmp.zze().zza((zzah) Preconditions.checkNotNull(zzmp.zzb));
        zzls zzls = new zzls(zzmp);
        zzls.zzal();
        zzmp.zzj = zzls;
        zzt zzt2 = new zzt(zzmp);
        zzt2.zzal();
        zzmp.zzg = zzt2;
        zzkg zzkg = new zzkg(zzmp);
        zzkg.zzal();
        zzmp.zzi = zzkg;
        zzmj zzmj = new zzmj(zzmp);
        zzmj.zzal();
        zzmp.zzf = zzmj;
        zzmp.zze = new zzgb(zzmp);
        if (zzmp.zzs != zzmp.zzt) {
            zzmp.zzj().zzg().zza("Not all upload components initialized", Integer.valueOf(zzmp.zzs), Integer.valueOf(zzmp.zzt));
        }
        zzmp.zzn = true;
    }

    private zzmp(zzna zzna) {
        this(zzna, (zzhf) null);
    }

    private zzmp(zzna zzna, zzhf zzhf) {
        this.zzn = false;
        this.zzr = new HashSet();
        this.zzah = new zzmw(this);
        Preconditions.checkNotNull(zzna);
        this.zzm = zzhf.zza(zzna.zza, (zzdd) null, (Long) null);
        this.zzab = -1;
        this.zzk = new zzmn(this);
        zzmz zzmz = new zzmz(this);
        zzmz.zzal();
        this.zzh = zzmz;
        zzfy zzfy = new zzfy(this);
        zzfy.zzal();
        this.zzc = zzfy;
        zzgp zzgp = new zzgp(this);
        zzgp.zzal();
        this.zzb = zzgp;
        this.zzac = new HashMap();
        this.zzad = new HashMap();
        this.zzae = new HashMap();
        zzl().zzb((Runnable) new zzms(this, zzna));
    }

    /* access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzl().zzt();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzl().zzt();
        zzs();
        if (!this.zzo) {
            this.zzo = true;
            if (zzad()) {
                int zza2 = zza(this.zzy);
                int zzab2 = this.zzm.zzh().zzab();
                zzl().zzt();
                if (zza2 > zzab2) {
                    zzj().zzg().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                } else if (zza2 >= zzab2) {
                } else {
                    if (zza(zzab2, this.zzy)) {
                        zzj().zzp().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                    } else {
                        zzj().zzg().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs() {
        if (!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private final void zzaa() {
        zzl().zzt();
        if (this.zzu || this.zzv || this.zzw) {
            zzj().zzp().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzj().zzp().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzfi.zzj.zza zza2) {
        int zza3;
        int indexOf;
        Set<String> zzg2 = zzi().zzg(str);
        if (zzg2 != null) {
            zza2.zzd((Iterable<String>) zzg2);
        }
        if (zzi().zzq(str)) {
            zza2.zzg();
        }
        if (zzi().zzt(str)) {
            if (zze().zze(str, zzbi.zzbv)) {
                String zzu2 = zza2.zzu();
                if (!TextUtils.isEmpty(zzu2) && (indexOf = zzu2.indexOf(".")) != -1) {
                    zza2.zzo(zzu2.substring(0, indexOf));
                }
            } else {
                zza2.zzl();
            }
        }
        if (zzi().zzu(str) && (zza3 = zzmz.zza(zza2, "_id")) != -1) {
            zza2.zzc(zza3);
        }
        if (zzi().zzs(str)) {
            zza2.zzh();
        }
        if (zzi().zzp(str)) {
            zza2.zze();
            zzb zzb2 = this.zzae.get(str);
            if (zzb2 == null || zzb2.zzb + zze().zzc(str, zzbi.zzat) < zzb().elapsedRealtime()) {
                zzb2 = new zzb();
                this.zzae.put(str, zzb2);
            }
            zza2.zzk(zzb2.zza);
        }
        if (zzi().zzr(str)) {
            zza2.zzp();
        }
    }

    private final void zzb(zzh zzh2) {
        zzl().zzt();
        if (!TextUtils.isEmpty(zzh2.zzac()) || !TextUtils.isEmpty(zzh2.zzv())) {
            Uri.Builder builder = new Uri.Builder();
            String zzac2 = zzh2.zzac();
            if (TextUtils.isEmpty(zzac2)) {
                zzac2 = zzh2.zzv();
            }
            ArrayMap arrayMap = null;
            Uri.Builder encodedAuthority = builder.scheme(zzbi.zze.zza(null)).encodedAuthority(zzbi.zzf.zza(null));
            encodedAuthority.path("config/app/" + zzac2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(zzh2.zzx());
                URL url = new URL(uri);
                zzj().zzp().zza("Fetching remote configuration", str);
                zzfc.zzd zzc2 = zzi().zzc(str);
                String zze2 = zzi().zze(str);
                if (zzc2 != null) {
                    if (!TextUtils.isEmpty(zze2)) {
                        ArrayMap arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", zze2);
                        arrayMap = arrayMap2;
                    }
                    String zzd2 = zzi().zzd(str);
                    if (!TextUtils.isEmpty(zzd2)) {
                        if (arrayMap == null) {
                            arrayMap = new ArrayMap();
                        }
                        arrayMap.put("If-None-Match", zzd2);
                    }
                }
                this.zzu = true;
                zzfy zzh3 = zzh();
                zzmu zzmu = new zzmu(this);
                zzh3.zzt();
                zzh3.zzak();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzmu);
                zzh3.zzl().zza((Runnable) new zzgc(zzh3, str, url, (byte[]) null, arrayMap, zzmu));
            } catch (MalformedURLException unused) {
                zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzfr.zza(zzh2.zzx()), uri);
            }
        } else {
            zza((String) Preconditions.checkNotNull(zzh2.zzx()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzh zzh2, zzfi.zzj.zza zza2) {
        zzfi.zzn zzn2;
        zzl().zzt();
        zzs();
        if (zznp.zza()) {
            zzak zza3 = zzak.zza(zza2.zzs());
            String zzx2 = zzh2.zzx();
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                zzih zzb2 = zzb(zzx2);
                if (zznp.zza() && zze().zza(zzbi.zzco)) {
                    zza2.zzg(zzb2.zzf());
                }
                if (zzb2.zzc() != null) {
                    zza3.zza(zzih.zza.AD_STORAGE, zzb2.zza());
                } else {
                    zza3.zza(zzih.zza.AD_STORAGE, zzaj.FAILSAFE);
                }
                if (zzb2.zzd() != null) {
                    zza3.zza(zzih.zza.ANALYTICS_STORAGE, zzb2.zza());
                } else {
                    zza3.zza(zzih.zza.ANALYTICS_STORAGE, zzaj.FAILSAFE);
                }
            }
            String zzx3 = zzh2.zzx();
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                zzay zza4 = zza(zzx3, zzd(zzx3), zzb(zzx3), zza3);
                zza2.zzb(((Boolean) Preconditions.checkNotNull(zza4.zzd())).booleanValue());
                if (!TextUtils.isEmpty(zza4.zze())) {
                    zza2.zzh(zza4.zze());
                }
            }
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                Iterator<zzfi.zzn> it = zza2.zzx().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzn2 = null;
                        break;
                    }
                    zzn2 = it.next();
                    if ("_npa".equals(zzn2.zzg())) {
                        break;
                    }
                }
                if (zzn2 != null) {
                    if (zza3.zza(zzih.zza.AD_PERSONALIZATION) == zzaj.UNSET) {
                        Boolean zzu2 = zzh2.zzu();
                        if (zzu2 == null || ((zzu2 == Boolean.TRUE && zzn2.zzc() != 1) || (zzu2 == Boolean.FALSE && zzn2.zzc() != 0))) {
                            zza3.zza(zzih.zza.AD_PERSONALIZATION, zzaj.API);
                        } else {
                            zza3.zza(zzih.zza.AD_PERSONALIZATION, zzaj.MANIFEST);
                        }
                    }
                } else if (zznp.zza() && zze().zza(zzbi.zzcp)) {
                    boolean z = true;
                    if (this.zzb.zzb(zzh2.zzx()) == null) {
                        zza3.zza(zzih.zza.AD_PERSONALIZATION, zzaj.FAILSAFE);
                    } else {
                        z = true ^ this.zzb.zzb(zzh2.zzx(), zzih.zza.AD_PERSONALIZATION);
                        zza3.zza(zzih.zza.AD_PERSONALIZATION, zzaj.REMOTE_DEFAULT);
                    }
                    zza2.zza((zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(zzb().currentTimeMillis()).zza(z ? 1 : 0).zzab()));
                }
            }
            zza2.zzf(zza3.toString());
        }
    }

    private static void zza(zzfi.zze.zza zza2, int i, String str) {
        List<zzfi.zzg> zzf2 = zza2.zzf();
        int i2 = 0;
        while (i2 < zzf2.size()) {
            if (!"_err".equals(zzf2.get(i2).zzg())) {
                i2++;
            } else {
                return;
            }
        }
        zza2.zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_err").zza(Long.valueOf((long) i).longValue()).zzab())).zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_ev").zzb(str).zzab()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002b, code lost:
        r4 = r1.zzag;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.measurement.internal.zzbg r20, com.google.android.gms.measurement.internal.zzo r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r21)
            java.lang.String r2 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            com.google.android.gms.measurement.internal.zzgy r2 = r19.zzl()
            r2.zzt()
            r19.zzs()
            java.lang.String r2 = r0.zza
            r3 = r20
            long r10 = r3.zzd
            com.google.android.gms.measurement.internal.zzfv r3 = com.google.android.gms.measurement.internal.zzfv.zza(r20)
            com.google.android.gms.measurement.internal.zzgy r4 = r19.zzl()
            r4.zzt()
            com.google.android.gms.measurement.internal.zzki r4 = r1.zzaf
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r1.zzag
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.gms.measurement.internal.zzki r4 = r1.zzaf
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            android.os.Bundle r5 = r3.zzb
            r12 = 0
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zzki) r4, (android.os.Bundle) r5, (boolean) r12)
            com.google.android.gms.measurement.internal.zzbg r3 = r3.zza()
            r19.zzp()
            boolean r4 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.measurement.internal.zzbg) r3, (com.google.android.gms.measurement.internal.zzo) r0)
            if (r4 != 0) goto L_0x004e
            return
        L_0x004e:
            boolean r4 = r0.zzh
            if (r4 != 0) goto L_0x0056
            r1.zza((com.google.android.gms.measurement.internal.zzo) r0)
            return
        L_0x0056:
            java.util.List<java.lang.String> r4 = r0.zzs
            if (r4 == 0) goto L_0x0099
            java.util.List<java.lang.String> r4 = r0.zzs
            java.lang.String r5 = r3.zza
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0087
            com.google.android.gms.measurement.internal.zzbb r4 = r3.zzb
            android.os.Bundle r4 = r4.zzb()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            com.google.android.gms.measurement.internal.zzbg r5 = new com.google.android.gms.measurement.internal.zzbg
            java.lang.String r14 = r3.zza
            com.google.android.gms.measurement.internal.zzbb r15 = new com.google.android.gms.measurement.internal.zzbb
            r15.<init>(r4)
            java.lang.String r4 = r3.zzc
            long r6 = r3.zzd
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            goto L_0x009a
        L_0x0087:
            com.google.android.gms.measurement.internal.zzfr r0 = r19.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzc()
            java.lang.String r4 = r3.zza
            java.lang.String r3 = r3.zzc
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.zza(r5, r2, r4, r3)
            return
        L_0x0099:
            r13 = r3
        L_0x009a:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()
            r3.zzp()
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02fe }
            r3.zzt()     // Catch:{ all -> 0x02fe }
            r3.zzak()     // Catch:{ all -> 0x02fe }
            r4 = 0
            r6 = 2
            r14 = 1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x02fe }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = "Invalid time querying timed out conditional properties"
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r3.zza(r5, r4, r8)     // Catch:{ all -> 0x02fe }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02fe }
            goto L_0x00e0
        L_0x00d0:
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x02fe }
            r4[r12] = r2     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r4[r14] = r5     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.util.List r3 = r3.zza((java.lang.String) r5, (java.lang.String[]) r4)     // Catch:{ all -> 0x02fe }
        L_0x00e0:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02fe }
        L_0x00e4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x02fe }
            if (r4 == 0) goto L_0x0130
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzad r4 = (com.google.android.gms.measurement.internal.zzad) r4     // Catch:{ all -> 0x02fe }
            if (r4 == 0) goto L_0x00e4
            com.google.android.gms.measurement.internal.zzfr r5 = r19.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzp()     // Catch:{ all -> 0x02fe }
            java.lang.String r8 = r4.zza     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzfq r9 = r9.zzk()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r15 = r4.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r15 = r15.zza     // Catch:{ all -> 0x02fe }
            java.lang.String r9 = r9.zzc(r15)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r15 = r4.zzc     // Catch:{ all -> 0x02fe }
            java.lang.Object r15 = r15.zza()     // Catch:{ all -> 0x02fe }
            java.lang.String r14 = "User property timed out"
            r5.zza(r14, r8, r9, r15)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzbg r5 = r4.zzg     // Catch:{ all -> 0x02fe }
            if (r5 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.zzbg r5 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzbg r8 = r4.zzg     // Catch:{ all -> 0x02fe }
            r5.<init>(r8, r10)     // Catch:{ all -> 0x02fe }
            r1.zzc(r5, r0)     // Catch:{ all -> 0x02fe }
        L_0x0123:
            com.google.android.gms.measurement.internal.zzao r5 = r19.zzf()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r4 = r4.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x02fe }
            r5.zza((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x02fe }
            r14 = 1
            goto L_0x00e4
        L_0x0130:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02fe }
            r3.zzt()     // Catch:{ all -> 0x02fe }
            r3.zzak()     // Catch:{ all -> 0x02fe }
            if (r7 >= 0) goto L_0x0159
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x02fe }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r3.zza(r5, r4, r8)     // Catch:{ all -> 0x02fe }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02fe }
            goto L_0x016a
        L_0x0159:
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x02fe }
            r4[r12] = r2     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r8 = 1
            r4[r8] = r5     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.util.List r3 = r3.zza((java.lang.String) r5, (java.lang.String[]) r4)     // Catch:{ all -> 0x02fe }
        L_0x016a:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02fe }
            int r5 = r3.size()     // Catch:{ all -> 0x02fe }
            r4.<init>(r5)     // Catch:{ all -> 0x02fe }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02fe }
        L_0x0177:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02fe }
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzad r5 = (com.google.android.gms.measurement.internal.zzad) r5     // Catch:{ all -> 0x02fe }
            if (r5 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzfr r8 = r19.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ all -> 0x02fe }
            java.lang.String r9 = r5.zza     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzhf r14 = r1.zzm     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzfq r14 = r14.zzk()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r15 = r5.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r15 = r15.zza     // Catch:{ all -> 0x02fe }
            java.lang.String r14 = r14.zzc(r15)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r15 = r5.zzc     // Catch:{ all -> 0x02fe }
            java.lang.Object r15 = r15.zza()     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = "User property expired"
            r8.zza(r6, r9, r14, r15)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzao r6 = r19.zzf()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r8 = r5.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r8 = r8.zza     // Catch:{ all -> 0x02fe }
            r6.zzh(r2, r8)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzbg r6 = r5.zzk     // Catch:{ all -> 0x02fe }
            if (r6 == 0) goto L_0x01bc
            com.google.android.gms.measurement.internal.zzbg r6 = r5.zzk     // Catch:{ all -> 0x02fe }
            r4.add(r6)     // Catch:{ all -> 0x02fe }
        L_0x01bc:
            com.google.android.gms.measurement.internal.zzao r6 = r19.zzf()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zznc r5 = r5.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x02fe }
            r6.zza((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x02fe }
            r6 = 2
            goto L_0x0177
        L_0x01c9:
            r3 = r4
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x02fe }
            int r3 = r4.size()     // Catch:{ all -> 0x02fe }
            r5 = 0
        L_0x01d1:
            if (r5 >= r3) goto L_0x01e4
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x02fe }
            int r5 = r5 + 1
            com.google.android.gms.measurement.internal.zzbg r6 = (com.google.android.gms.measurement.internal.zzbg) r6     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzbg r8 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02fe }
            r8.<init>(r6, r10)     // Catch:{ all -> 0x02fe }
            r1.zzc(r8, r0)     // Catch:{ all -> 0x02fe }
            goto L_0x01d1
        L_0x01e4:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = r13.zza     // Catch:{ all -> 0x02fe }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x02fe }
            r3.zzt()     // Catch:{ all -> 0x02fe }
            r3.zzak()     // Catch:{ all -> 0x02fe }
            if (r7 >= 0) goto L_0x021a
            com.google.android.gms.measurement.internal.zzfr r5 = r3.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x02fe }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzfq r3 = r3.zzi()     // Catch:{ all -> 0x02fe }
            java.lang.String r3 = r3.zza((java.lang.String) r4)     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = "Invalid time querying triggered conditional properties"
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r5.zza(r4, r2, r3, r6)     // Catch:{ all -> 0x02fe }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02fe }
            goto L_0x022f
        L_0x021a:
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x02fe }
            r5[r12] = r2     // Catch:{ all -> 0x02fe }
            r2 = 1
            r5[r2] = r4     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02fe }
            r4 = 2
            r5[r4] = r2     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.util.List r2 = r3.zza((java.lang.String) r2, (java.lang.String[]) r5)     // Catch:{ all -> 0x02fe }
        L_0x022f:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x02fe }
            int r3 = r2.size()     // Catch:{ all -> 0x02fe }
            r14.<init>(r3)     // Catch:{ all -> 0x02fe }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02fe }
        L_0x023c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02fe }
            if (r3 == 0) goto L_0x02d1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02fe }
            r15 = r3
            com.google.android.gms.measurement.internal.zzad r15 = (com.google.android.gms.measurement.internal.zzad) r15     // Catch:{ all -> 0x02fe }
            if (r15 == 0) goto L_0x023c
            com.google.android.gms.measurement.internal.zznc r3 = r15.zzc     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzne r9 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = r15.zza     // Catch:{ all -> 0x02fe }
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = r15.zzb     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x02fe }
            java.lang.Object r3 = r3.zza()     // Catch:{ all -> 0x02fe }
            java.lang.Object r16 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x02fe }
            r3 = r9
            r7 = r10
            r12 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02fe }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzne) r12)     // Catch:{ all -> 0x02fe }
            if (r3 == 0) goto L_0x0293
            com.google.android.gms.measurement.internal.zzfr r3 = r19.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzp()     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = r15.zza     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzhf r5 = r1.zzm     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzfq r5 = r5.zzk()     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = r12.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = r5.zzc(r6)     // Catch:{ all -> 0x02fe }
            java.lang.Object r6 = r12.zze     // Catch:{ all -> 0x02fe }
            java.lang.String r7 = "User property triggered"
            r3.zza(r7, r4, r5, r6)     // Catch:{ all -> 0x02fe }
            goto L_0x02b4
        L_0x0293:
            com.google.android.gms.measurement.internal.zzfr r3 = r19.zzj()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = r15.zza     // Catch:{ all -> 0x02fe }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r4)     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzhf r5 = r1.zzm     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzfq r5 = r5.zzk()     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = r12.zzc     // Catch:{ all -> 0x02fe }
            java.lang.String r5 = r5.zzc(r6)     // Catch:{ all -> 0x02fe }
            java.lang.Object r6 = r12.zze     // Catch:{ all -> 0x02fe }
            java.lang.String r7 = "Too many active user properties, ignoring"
            r3.zza(r7, r4, r5, r6)     // Catch:{ all -> 0x02fe }
        L_0x02b4:
            com.google.android.gms.measurement.internal.zzbg r3 = r15.zzi     // Catch:{ all -> 0x02fe }
            if (r3 == 0) goto L_0x02bd
            com.google.android.gms.measurement.internal.zzbg r3 = r15.zzi     // Catch:{ all -> 0x02fe }
            r14.add(r3)     // Catch:{ all -> 0x02fe }
        L_0x02bd:
            com.google.android.gms.measurement.internal.zznc r3 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x02fe }
            r3.<init>(r12)     // Catch:{ all -> 0x02fe }
            r15.zzc = r3     // Catch:{ all -> 0x02fe }
            r3 = 1
            r15.zze = r3     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzao r4 = r19.zzf()     // Catch:{ all -> 0x02fe }
            r4.zza((com.google.android.gms.measurement.internal.zzad) r15)     // Catch:{ all -> 0x02fe }
            r12 = 0
            goto L_0x023c
        L_0x02d1:
            r1.zzc(r13, r0)     // Catch:{ all -> 0x02fe }
            r2 = r14
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x02fe }
            int r2 = r14.size()     // Catch:{ all -> 0x02fe }
            r12 = 0
        L_0x02dc:
            if (r12 >= r2) goto L_0x02ef
            java.lang.Object r3 = r14.get(r12)     // Catch:{ all -> 0x02fe }
            int r12 = r12 + 1
            com.google.android.gms.measurement.internal.zzbg r3 = (com.google.android.gms.measurement.internal.zzbg) r3     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzbg r4 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02fe }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x02fe }
            r1.zzc(r4, r0)     // Catch:{ all -> 0x02fe }
            goto L_0x02dc
        L_0x02ef:
            com.google.android.gms.measurement.internal.zzao r0 = r19.zzf()     // Catch:{ all -> 0x02fe }
            r0.zzw()     // Catch:{ all -> 0x02fe }
            com.google.android.gms.measurement.internal.zzao r0 = r19.zzf()
            r0.zzu()
            return
        L_0x02fe:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzao r2 = r19.zzf()
            r2.zzu()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzo):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbg zzbg, String str) {
        String str2;
        int i;
        zzbg zzbg2 = zzbg;
        String str3 = str;
        zzh zzd2 = zzf().zzd(str3);
        if (zzd2 == null || TextUtils.isEmpty(zzd2.zzaa())) {
            zzj().zzc().zza("No app data available; dropping event", str3);
            return;
        }
        Boolean zza2 = zza(zzd2);
        if (zza2 == null) {
            if (!"_ui".equals(zzbg2.zza)) {
                zzj().zzu().zza("Could not find package. appId", zzfr.zza(str));
            }
        } else if (!zza2.booleanValue()) {
            zzj().zzg().zza("App version does not match; dropping event. appId", zzfr.zza(str));
            return;
        }
        zzih zzb2 = zzb(str3);
        if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
            str2 = "";
            i = 100;
        } else {
            str2 = zzd(str3).zzf();
            i = zzb2.zza();
        }
        zzo zzo2 = r2;
        zzo zzo3 = new zzo(str, zzd2.zzac(), zzd2.zzaa(), zzd2.zzc(), zzd2.zzz(), zzd2.zzo(), zzd2.zzl(), (String) null, zzd2.zzak(), false, zzd2.zzab(), zzd2.zzb(), 0, 0, zzd2.zzaj(), false, zzd2.zzv(), zzd2.zzu(), zzd2.zzm(), zzd2.zzag(), (String) null, zzb2.zze(), "", (String) null, zzd2.zzam(), zzd2.zzt(), i, str2, zzd2.zza(), zzd2.zzd());
        zzb(zzbg2, zzo2);
    }

    private final void zzb(zzbg zzbg, zzo zzo2) {
        Preconditions.checkNotEmpty(zzo2.zza);
        zzfv zza2 = zzfv.zza(zzbg);
        zzq().zza(zza2.zzb, zzf().zzc(zzo2.zza));
        zzq().zza(zza2, zze().zzd(zzo2.zza));
        zzbg zza3 = zza2.zza();
        if ("_cmp".equals(zza3.zza) && "referrer API v2".equals(zza3.zzb.zzd("_cis"))) {
            String zzd2 = zza3.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(zzd2)) {
                zza(new zznc("_lgclid", zza3.zzd, zzd2, "auto"), zzo2);
            }
        }
        if (zzoi.zza() && zzoi.zzc() && "_cmp".equals(zza3.zza) && "referrer API v2".equals(zza3.zzb.zzd("_cis"))) {
            String zzd3 = zza3.zzb.zzd("gbraid");
            if (!TextUtils.isEmpty(zzd3)) {
                zza(new zznc("_gbraid", zza3.zzd, zzd3, "auto"), zzo2);
            }
        }
        zza(zza3, zzo2);
    }

    private final void zza(zzfi.zzj.zza zza2, long j, boolean z) {
        zzne zzne;
        boolean z2;
        String str = z ? "_se" : "_lte";
        zzne zze2 = zzf().zze(zza2.zzr(), str);
        if (zze2 == null || zze2.zze == null) {
            zzne = new zzne(zza2.zzr(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzne = new zzne(zza2.zzr(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(((Long) zze2.zze).longValue() + j));
        }
        zzfi.zzn zzn2 = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza(str).zzb(zzb().currentTimeMillis()).zza(((Long) zzne.zze).longValue()).zzab());
        int zza3 = zzmz.zza(zza2, str);
        if (zza3 >= 0) {
            zza2.zza(zza3, zzn2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            zza2.zza(zzn2);
        }
        if (j > 0) {
            zzf().zza(zzne);
            zzj().zzp().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", zzne.zze);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        this.zzt++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0144 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r6.zzl()
            r0.zzt()
            r6.zzs()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x019c }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzfr r1 = r6.zzj()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x019c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019c }
            r1.zza(r2, r3)     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzao r1 = r6.zzf()     // Catch:{ all -> 0x019c }
            r1.zzp()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzao r1 = r6.zzf()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzd(r7)     // Catch:{ all -> 0x0193 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r3) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzu()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0193 }
            r8.zza(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0061
            goto L_0x00ba
        L_0x0061:
            com.google.android.gms.common.util.Clock r10 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r1.zzl(r10)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r10 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r10.zza((com.google.android.gms.measurement.internal.zzh) r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzfr r10 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzp()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            r10.zza(r11, r1, r9)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgp r9 = r6.zzi()     // Catch:{ all -> 0x0193 }
            r9.zzi(r7)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzls r7 = r6.zzj     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzd     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.Clock r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r7.zza(r9)     // Catch:{ all -> 0x0193 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a4
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.zzls r7 = r6.zzj     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzb     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.Clock r8 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r7.zza(r8)     // Catch:{ all -> 0x0193 }
        L_0x00b5:
            r6.zzab()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x0193 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r9
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e2
            java.lang.String r4 = "ETag"
            java.lang.Object r11 = r11.get(r4)     // Catch:{ all -> 0x0193 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 == 0) goto L_0x00f2
            boolean r4 = r11.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00f2
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00f3
        L_0x00f2:
            r11 = r9
        L_0x00f3:
            if (r8 == r5) goto L_0x010f
            if (r8 != r3) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            com.google.android.gms.measurement.internal.zzgp r9 = r6.zzi()     // Catch:{ all -> 0x0193 }
            boolean r9 = r9.zza(r7, r10, r2, r11)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x010f:
            com.google.android.gms.measurement.internal.zzgp r11 = r6.zzi()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.measurement.zzfc$zzd r11 = r11.zzc(r7)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzgp r11 = r6.zzi()     // Catch:{ all -> 0x0193 }
            boolean r9 = r11.zza(r7, r9, r9, r9)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x0130:
            com.google.android.gms.common.util.Clock r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r1.zzc((long) r2)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r9 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r9.zza((com.google.android.gms.measurement.internal.zzh) r1)     // Catch:{ all -> 0x0193 }
            if (r8 != r5) goto L_0x0152
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzv()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zza(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x0168
        L_0x0152:
            com.google.android.gms.measurement.internal.zzfr r7 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzp()     // Catch:{ all -> 0x0193 }
            int r9 = r10.length     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0193 }
            r7.zza(r10, r8, r9)     // Catch:{ all -> 0x0193 }
        L_0x0168:
            com.google.android.gms.measurement.internal.zzfy r7 = r6.zzh()     // Catch:{ all -> 0x0193 }
            boolean r7 = r7.zzu()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            boolean r7 = r6.zzac()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            r6.zzw()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x017c:
            r6.zzab()     // Catch:{ all -> 0x0193 }
        L_0x017f:
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r7.zzw()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x0193:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzao r8 = r6.zzf()     // Catch:{ all -> 0x019c }
            r8.zzu()     // Catch:{ all -> 0x019c }
            throw r7     // Catch:{ all -> 0x019c }
        L_0x019c:
            r7 = move-exception
            r6.zzu = r0
            r6.zzaa()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzab();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0133 A[Catch:{ SQLiteException -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0137 A[Catch:{ SQLiteException -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzgy r13 = r8.zzl()
            r13.zzt()
            r8.zzs()
            r13 = 0
            if (r12 != 0) goto L_0x000f
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x01c2 }
        L_0x000f:
            java.util.List<java.lang.Long> r0 = r8.zzz     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x01c2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01c2 }
            r1 = 0
            r8.zzz = r1     // Catch:{ all -> 0x01c2 }
            boolean r2 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x01c2 }
            r3 = 1
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.zzaf r2 = r8.zze()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x01c2 }
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x01c2 }
            if (r2 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x0039
        L_0x002f:
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 == r2) goto L_0x0037
            r2 = 204(0xcc, float:2.86E-43)
            if (r10 != r2) goto L_0x0177
        L_0x0037:
            if (r11 != 0) goto L_0x0177
        L_0x0039:
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x014b }
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzaf r11 = r8.zze()     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x014b }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r2)     // Catch:{ SQLiteException -> 0x014b }
            if (r11 == 0) goto L_0x004d
            if (r9 == 0) goto L_0x005c
        L_0x004d:
            com.google.android.gms.measurement.internal.zzls r11 = r8.zzj     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzgi r11 = r11.zzc     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.common.util.Clock r2 = r8.zzb()     // Catch:{ SQLiteException -> 0x014b }
            long r4 = r2.currentTimeMillis()     // Catch:{ SQLiteException -> 0x014b }
            r11.zza(r4)     // Catch:{ SQLiteException -> 0x014b }
        L_0x005c:
            com.google.android.gms.measurement.internal.zzls r11 = r8.zzj     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzgi r11 = r11.zzd     // Catch:{ SQLiteException -> 0x014b }
            r4 = 0
            r11.zza(r4)     // Catch:{ SQLiteException -> 0x014b }
            r8.zzab()     // Catch:{ SQLiteException -> 0x014b }
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x014b }
            if (r11 == 0) goto L_0x009d
            com.google.android.gms.measurement.internal.zzaf r11 = r8.zze()     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x014b }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r2)     // Catch:{ SQLiteException -> 0x014b }
            if (r11 == 0) goto L_0x009d
            if (r9 == 0) goto L_0x007d
            goto L_0x009d
        L_0x007d:
            boolean r9 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x014b }
            if (r9 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.zzaf r9 = r8.zze()     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x014b }
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r10)     // Catch:{ SQLiteException -> 0x014b }
            if (r9 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ SQLiteException -> 0x014b }
            java.lang.String r10 = "Purged empty bundles"
            r9.zza(r10)     // Catch:{ SQLiteException -> 0x014b }
            goto L_0x00b3
        L_0x009d:
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ SQLiteException -> 0x014b }
            int r11 = r12.length     // Catch:{ SQLiteException -> 0x014b }
            java.lang.String r12 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x014b }
            r9.zza(r12, r10, r11)     // Catch:{ SQLiteException -> 0x014b }
        L_0x00b3:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ SQLiteException -> 0x014b }
            r9.zzp()     // Catch:{ SQLiteException -> 0x014b }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0142 }
        L_0x00be:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x0113
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0142 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0142 }
            com.google.android.gms.measurement.internal.zzao r11 = r8.zzf()     // Catch:{ SQLiteException -> 0x0106 }
            long r6 = r10.longValue()     // Catch:{ SQLiteException -> 0x0106 }
            r11.zzt()     // Catch:{ SQLiteException -> 0x0106 }
            r11.zzak()     // Catch:{ SQLiteException -> 0x0106 }
            android.database.sqlite.SQLiteDatabase r12 = r11.e_()     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0106 }
            r0[r13] = r2     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r2 = "queue"
            java.lang.String r6 = "rowid=?"
            int r12 = r12.delete(r2, r6, r0)     // Catch:{ SQLiteException -> 0x00f7 }
            if (r12 != r3) goto L_0x00ef
            goto L_0x00be
        L_0x00ef:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00f7 }
            java.lang.String r0 = "Deleted fewer rows from queue than expected"
            r12.<init>(r0)     // Catch:{ SQLiteException -> 0x00f7 }
            throw r12     // Catch:{ SQLiteException -> 0x00f7 }
        L_0x00f7:
            r12 = move-exception
            com.google.android.gms.measurement.internal.zzfr r11 = r11.zzj()     // Catch:{ SQLiteException -> 0x0106 }
            com.google.android.gms.measurement.internal.zzft r11 = r11.zzg()     // Catch:{ SQLiteException -> 0x0106 }
            java.lang.String r0 = "Failed to delete a bundle in a queue table"
            r11.zza(r0, r12)     // Catch:{ SQLiteException -> 0x0106 }
            throw r12     // Catch:{ SQLiteException -> 0x0106 }
        L_0x0106:
            r11 = move-exception
            java.util.List<java.lang.Long> r12 = r8.zzaa     // Catch:{ all -> 0x0142 }
            if (r12 == 0) goto L_0x0112
            boolean r10 = r12.contains(r10)     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x0112
            goto L_0x00be
        L_0x0112:
            throw r11     // Catch:{ all -> 0x0142 }
        L_0x0113:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ all -> 0x0142 }
            r9.zzw()     // Catch:{ all -> 0x0142 }
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ SQLiteException -> 0x014b }
            r9.zzu()     // Catch:{ SQLiteException -> 0x014b }
            r8.zzaa = r1     // Catch:{ SQLiteException -> 0x014b }
            com.google.android.gms.measurement.internal.zzfy r9 = r8.zzh()     // Catch:{ SQLiteException -> 0x014b }
            boolean r9 = r9.zzu()     // Catch:{ SQLiteException -> 0x014b }
            if (r9 == 0) goto L_0x0137
            boolean r9 = r8.zzac()     // Catch:{ SQLiteException -> 0x014b }
            if (r9 == 0) goto L_0x0137
            r8.zzw()     // Catch:{ SQLiteException -> 0x014b }
            goto L_0x013e
        L_0x0137:
            r9 = -1
            r8.zzab = r9     // Catch:{ SQLiteException -> 0x014b }
            r8.zzab()     // Catch:{ SQLiteException -> 0x014b }
        L_0x013e:
            r8.zzp = r4     // Catch:{ SQLiteException -> 0x014b }
            goto L_0x01bc
        L_0x0142:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzao r10 = r8.zzf()     // Catch:{ SQLiteException -> 0x014b }
            r10.zzu()     // Catch:{ SQLiteException -> 0x014b }
            throw r9     // Catch:{ SQLiteException -> 0x014b }
        L_0x014b:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzfr r10 = r8.zzj()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzg()     // Catch:{ all -> 0x01c2 }
            java.lang.String r11 = "Database error while trying to delete uploaded bundles"
            r10.zza(r11, r9)     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.common.util.Clock r9 = r8.zzb()     // Catch:{ all -> 0x01c2 }
            long r9 = r9.elapsedRealtime()     // Catch:{ all -> 0x01c2 }
            r8.zzp = r9     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = "Disable upload, time"
            long r11 = r8.zzp     // Catch:{ all -> 0x01c2 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01c2 }
            r9.zza(r10, r11)     // Catch:{ all -> 0x01c2 }
            goto L_0x01bc
        L_0x0177:
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ all -> 0x01c2 }
            java.lang.String r12 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c2 }
            r9.zza(r12, r1, r11)     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzls r9 = r8.zzj     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzd     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.common.util.Clock r11 = r8.zzb()     // Catch:{ all -> 0x01c2 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x01c2 }
            r9.zza(r11)     // Catch:{ all -> 0x01c2 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x01a1
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r3 = 0
        L_0x01a1:
            if (r3 == 0) goto L_0x01b2
            com.google.android.gms.measurement.internal.zzls r9 = r8.zzj     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzb     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.common.util.Clock r10 = r8.zzb()     // Catch:{ all -> 0x01c2 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x01c2 }
            r9.zza(r10)     // Catch:{ all -> 0x01c2 }
        L_0x01b2:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ all -> 0x01c2 }
            r9.zza((java.util.List<java.lang.Long>) r0)     // Catch:{ all -> 0x01c2 }
            r8.zzab()     // Catch:{ all -> 0x01c2 }
        L_0x01bc:
            r8.zzv = r13
            r8.zzaa()
            return
        L_0x01c2:
            r9 = move-exception
            r8.zzv = r13
            r8.zzaa()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0248 A[Catch:{ all -> 0x01ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x026b A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x026e A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0277 A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0286 A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x029b A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x040e A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0439 A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x044c A[SYNTHETIC, Splitter:B:164:0x044c] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04fd A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0566 A[Catch:{ RuntimeException -> 0x0394, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011d A[SYNTHETIC, Splitter:B:45:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0210 A[Catch:{ all -> 0x01ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.measurement.internal.zzo r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.zzgy r9 = r30.zzl()
            r9.zzt()
            r30.zzs()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r31)
            java.lang.String r9 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            boolean r9 = zze(r31)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.zzao r9 = r30.zzf()
            java.lang.String r10 = r2.zza
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzd(r10)
            r10 = 0
            if (r9 == 0) goto L_0x005e
            java.lang.String r12 = r9.zzac()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = r2.zzb
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x005e
            r9.zzc((long) r10)
            com.google.android.gms.measurement.internal.zzao r12 = r30.zzf()
            r12.zza((com.google.android.gms.measurement.internal.zzh) r9)
            com.google.android.gms.measurement.internal.zzgp r9 = r30.zzi()
            java.lang.String r12 = r2.zza
            r9.zzj(r12)
        L_0x005e:
            boolean r9 = r2.zzh
            if (r9 != 0) goto L_0x0066
            r30.zza((com.google.android.gms.measurement.internal.zzo) r31)
            return
        L_0x0066:
            long r12 = r2.zzl
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r9 = r30.zzb()
            long r12 = r9.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzg()
            r9.zzm()
            int r9 = r2.zzm
            r15 = 1
            if (r9 == 0) goto L_0x009c
            if (r9 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfr r16 = r30.zzj()
            com.google.android.gms.measurement.internal.zzft r14 = r16.zzu()
            java.lang.String r15 = r2.zza
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r14.zza(r10, r15, r9)
            r9 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzao r10 = r30.zzf()
            r10.zzp()
            com.google.android.gms.measurement.internal.zzao r10 = r30.zzf()     // Catch:{ all -> 0x0596 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0596 }
            com.google.android.gms.measurement.internal.zzne r10 = r10.zze(r11, r0)     // Catch:{ all -> 0x0596 }
            if (r10 == 0) goto L_0x00c1
            java.lang.String r11 = r10.zzb     // Catch:{ all -> 0x0596 }
            java.lang.String r14 = "auto"
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0596 }
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            r22 = r3
            r23 = r4
            r3 = 1
            r4 = 0
            goto L_0x010b
        L_0x00c1:
            java.lang.Boolean r11 = r2.zzq     // Catch:{ all -> 0x0596 }
            if (r11 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x0596 }
            java.lang.Boolean r11 = r2.zzq     // Catch:{ all -> 0x0596 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0596 }
            if (r11 == 0) goto L_0x00d2
            r14 = 1
            goto L_0x00d4
        L_0x00d2:
            r14 = 0
        L_0x00d4:
            java.lang.String r11 = "_npa"
            java.lang.Long r20 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0596 }
            java.lang.String r21 = "auto"
            r22 = r3
            r23 = r4
            r3 = 1
            r15 = 0
            r14 = r0
            r3 = 1
            r4 = 0
            r15 = r11
            r16 = r12
            r18 = r20
            r19 = r21
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0596 }
            if (r10 == 0) goto L_0x00fc
            java.lang.Object r10 = r10.zze     // Catch:{ all -> 0x0596 }
            java.lang.Long r11 = r0.zzc     // Catch:{ all -> 0x0596 }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x0596 }
            if (r10 != 0) goto L_0x010b
        L_0x00fc:
            r1.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x0596 }
            goto L_0x010b
        L_0x0100:
            r22 = r3
            r23 = r4
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x010b
            r1.zza((java.lang.String) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x0596 }
        L_0x010b:
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()     // Catch:{ all -> 0x0596 }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x0596 }
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x0596 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0596 }
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzd(r10)     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x0204
            r30.zzq()     // Catch:{ all -> 0x01ff }
            java.lang.String r11 = r2.zzb     // Catch:{ all -> 0x01ff }
            java.lang.String r14 = r0.zzac()     // Catch:{ all -> 0x01ff }
            java.lang.String r15 = r2.zzp     // Catch:{ all -> 0x01ff }
            java.lang.String r10 = r0.zzv()     // Catch:{ all -> 0x01ff }
            boolean r10 = com.google.android.gms.measurement.internal.zznd.zza((java.lang.String) r11, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r10)     // Catch:{ all -> 0x01ff }
            if (r10 == 0) goto L_0x0204
            com.google.android.gms.measurement.internal.zzfr r10 = r30.zzj()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzu()     // Catch:{ all -> 0x01ff }
            java.lang.String r11 = r0.zzx()     // Catch:{ all -> 0x01ff }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r11)     // Catch:{ all -> 0x01ff }
            java.lang.String r14 = "New GMP App Id passed in. Removing cached database data. appId"
            r10.zza(r14, r11)     // Catch:{ all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzao r10 = r30.zzf()     // Catch:{ all -> 0x01ff }
            java.lang.String r11 = r0.zzx()     // Catch:{ all -> 0x01ff }
            r10.zzak()     // Catch:{ all -> 0x01ff }
            r10.zzt()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)     // Catch:{ all -> 0x01ff }
            android.database.sqlite.SQLiteDatabase r0 = r10.e_()     // Catch:{ SQLiteException -> 0x01e1 }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01e1 }
            r14[r4] = r11     // Catch:{ SQLiteException -> 0x01e1 }
            java.lang.String r15 = "events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01e1 }
            java.lang.String r3 = "user_attributes"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01e1 }
            java.lang.String r4 = "conditional_properties"
            int r4 = r0.delete(r4, r8, r14)     // Catch:{ SQLiteException -> 0x01e1 }
            r24 = r5
            java.lang.String r5 = "apps"
            int r5 = r0.delete(r5, r8, r14)     // Catch:{ SQLiteException -> 0x01df }
            r25 = r7
            java.lang.String r7 = "raw_events"
            int r7 = r0.delete(r7, r8, r14)     // Catch:{ SQLiteException -> 0x01db }
            r26 = r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r0.delete(r6, r8, r14)     // Catch:{ SQLiteException -> 0x01d9 }
            r27 = r9
            java.lang.String r9 = "event_filters"
            int r9 = r0.delete(r9, r8, r14)     // Catch:{ SQLiteException -> 0x01d7 }
            java.lang.String r1 = "property_filters"
            int r1 = r0.delete(r1, r8, r14)     // Catch:{ SQLiteException -> 0x01d7 }
            r28 = r12
            java.lang.String r12 = "audience_filter_values"
            int r12 = r0.delete(r12, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r13 = "consent_settings"
            int r13 = r0.delete(r13, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r2 = "default_event_params"
            int r2 = r0.delete(r2, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            r16 = 0
            int r15 = r15 + 0
            int r15 = r15 + r3
            int r15 = r15 + r4
            int r15 = r15 + r5
            int r15 = r15 + r7
            int r15 = r15 + r6
            int r15 = r15 + r9
            int r15 = r15 + r1
            int r15 = r15 + r12
            int r15 = r15 + r13
            int r15 = r15 + r2
            java.lang.String r1 = "trigger_uris"
            int r0 = r0.delete(r1, r8, r14)     // Catch:{ SQLiteException -> 0x01d5 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01fd
            com.google.android.gms.measurement.internal.zzfr r0 = r10.zzj()     // Catch:{ SQLiteException -> 0x01d5 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ SQLiteException -> 0x01d5 }
            java.lang.String r1 = "Deleted application data. app, records"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01d5 }
            r0.zza(r1, r11, r2)     // Catch:{ SQLiteException -> 0x01d5 }
            goto L_0x01fd
        L_0x01d5:
            r0 = move-exception
            goto L_0x01ec
        L_0x01d7:
            r0 = move-exception
            goto L_0x01ea
        L_0x01d9:
            r0 = move-exception
            goto L_0x01e8
        L_0x01db:
            r0 = move-exception
            r26 = r6
            goto L_0x01e8
        L_0x01df:
            r0 = move-exception
            goto L_0x01e4
        L_0x01e1:
            r0 = move-exception
            r24 = r5
        L_0x01e4:
            r26 = r6
            r25 = r7
        L_0x01e8:
            r27 = r9
        L_0x01ea:
            r28 = r12
        L_0x01ec:
            com.google.android.gms.measurement.internal.zzfr r1 = r10.zzj()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x01ff }
            java.lang.String r2 = "Error deleting application data. appId, error"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r11)     // Catch:{ all -> 0x01ff }
            r1.zza(r2, r3, r0)     // Catch:{ all -> 0x01ff }
        L_0x01fd:
            r0 = 0
            goto L_0x020e
        L_0x01ff:
            r0 = move-exception
            r2 = r30
            goto L_0x0598
        L_0x0204:
            r24 = r5
            r26 = r6
            r25 = r7
            r27 = r9
            r28 = r12
        L_0x020e:
            if (r0 == 0) goto L_0x026e
            long r1 = r0.zzc()     // Catch:{ all -> 0x01ff }
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0229
            long r1 = r0.zzc()     // Catch:{ all -> 0x01ff }
            r5 = r31
            long r6 = r5.zzj     // Catch:{ all -> 0x01ff }
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x022b
            r15 = 1
            goto L_0x022c
        L_0x0229:
            r5 = r31
        L_0x022b:
            r15 = 0
        L_0x022c:
            java.lang.String r1 = r0.zzaa()     // Catch:{ all -> 0x01ff }
            long r6 = r0.zzc()     // Catch:{ all -> 0x01ff }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0244
            if (r1 == 0) goto L_0x0244
            java.lang.String r0 = r5.zzc     // Catch:{ all -> 0x01ff }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x0244
            r0 = 1
            goto L_0x0245
        L_0x0244:
            r0 = 0
        L_0x0245:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x026b
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x01ff }
            r0.<init>()     // Catch:{ all -> 0x01ff }
            java.lang.String r2 = "_pv"
            r0.putString(r2, r1)     // Catch:{ all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzbg r1 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x01ff }
            com.google.android.gms.measurement.internal.zzbb r2 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x01ff }
            r2.<init>(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r15 = "_au"
            java.lang.String r17 = "auto"
            r14 = r1
            r16 = r2
            r18 = r28
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x01ff }
            r2 = r30
            r2.zza((com.google.android.gms.measurement.internal.zzbg) r1, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
            goto L_0x0272
        L_0x026b:
            r2 = r30
            goto L_0x0272
        L_0x026e:
            r2 = r30
            r5 = r31
        L_0x0272:
            r30.zza((com.google.android.gms.measurement.internal.zzo) r31)     // Catch:{ all -> 0x0594 }
            if (r27 != 0) goto L_0x0286
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()     // Catch:{ all -> 0x0594 }
            java.lang.String r1 = r5.zza     // Catch:{ all -> 0x0594 }
            java.lang.String r3 = "_f"
            com.google.android.gms.measurement.internal.zzbc r0 = r0.zzd(r1, r3)     // Catch:{ all -> 0x0594 }
            r9 = r27
            goto L_0x0299
        L_0x0286:
            r9 = r27
            r1 = 1
            if (r9 != r1) goto L_0x0298
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()     // Catch:{ all -> 0x0594 }
            java.lang.String r1 = r5.zza     // Catch:{ all -> 0x0594 }
            java.lang.String r3 = "_v"
            com.google.android.gms.measurement.internal.zzbc r0 = r0.zzd(r1, r3)     // Catch:{ all -> 0x0594 }
            goto L_0x0299
        L_0x0298:
            r0 = 0
        L_0x0299:
            if (r0 != 0) goto L_0x0566
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r28 / r0
            r3 = 1
            long r12 = r12 + r3
            long r12 = r12 * r0
            java.lang.String r1 = "_dac"
            java.lang.String r3 = "_et"
            java.lang.String r4 = "_r"
            java.lang.String r6 = "_c"
            if (r9 != 0) goto L_0x0518
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x0594 }
            java.lang.String r15 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0594 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r28
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0594 }
            r2.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzgy r0 = r30.zzl()     // Catch:{ all -> 0x0594 }
            r0.zzt()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzgm r0 = r2.zzl     // Catch:{ all -> 0x0594 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0594 }
            r7 = r0
            com.google.android.gms.measurement.internal.zzgm r7 = (com.google.android.gms.measurement.internal.zzgm) r7     // Catch:{ all -> 0x0594 }
            java.lang.String r0 = r5.zza     // Catch:{ all -> 0x0594 }
            if (r0 == 0) goto L_0x03c9
            boolean r8 = r0.isEmpty()     // Catch:{ all -> 0x0594 }
            if (r8 == 0) goto L_0x02de
            goto L_0x03c9
        L_0x02de:
            com.google.android.gms.measurement.internal.zzhf r8 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzgy r8 = r8.zzl()     // Catch:{ all -> 0x0594 }
            r8.zzt()     // Catch:{ all -> 0x0594 }
            boolean r8 = r7.zza()     // Catch:{ all -> 0x0594 }
            if (r8 != 0) goto L_0x02fe
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzn()     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Install Referrer Reporter is not available"
            r0.zza(r7)     // Catch:{ all -> 0x0594 }
            goto L_0x03d8
        L_0x02fe:
            com.google.android.gms.measurement.internal.zzgl r8 = new com.google.android.gms.measurement.internal.zzgl     // Catch:{ all -> 0x0594 }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzgy r0 = r0.zzl()     // Catch:{ all -> 0x0594 }
            r0.zzt()     // Catch:{ all -> 0x0594 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0594 }
            java.lang.String r9 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r9)     // Catch:{ all -> 0x0594 }
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ all -> 0x0594 }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r11 = r26
            r9.<init>(r11, r10)     // Catch:{ all -> 0x0594 }
            r0.setComponent(r9)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzhf r9 = r7.zza     // Catch:{ all -> 0x0594 }
            android.content.Context r9 = r9.zza()     // Catch:{ all -> 0x0594 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ all -> 0x0594 }
            if (r9 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzw()     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r7)     // Catch:{ all -> 0x0594 }
            goto L_0x03d8
        L_0x033c:
            r10 = 0
            java.util.List r9 = r9.queryIntentServices(r0, r10)     // Catch:{ all -> 0x0594 }
            if (r9 == 0) goto L_0x03b9
            boolean r12 = r9.isEmpty()     // Catch:{ all -> 0x0594 }
            if (r12 != 0) goto L_0x03b9
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0594 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x0594 }
            android.content.pm.ServiceInfo r10 = r9.serviceInfo     // Catch:{ all -> 0x0594 }
            if (r10 == 0) goto L_0x03d8
            android.content.pm.ServiceInfo r10 = r9.serviceInfo     // Catch:{ all -> 0x0594 }
            java.lang.String r10 = r10.packageName     // Catch:{ all -> 0x0594 }
            android.content.pm.ServiceInfo r9 = r9.serviceInfo     // Catch:{ all -> 0x0594 }
            java.lang.String r9 = r9.name     // Catch:{ all -> 0x0594 }
            if (r9 == 0) goto L_0x03a9
            boolean r9 = r11.equals(r10)     // Catch:{ all -> 0x0594 }
            if (r9 == 0) goto L_0x03a9
            boolean r9 = r7.zza()     // Catch:{ all -> 0x0594 }
            if (r9 == 0) goto L_0x03a9
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x0594 }
            r9.<init>(r0)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x0394 }
            com.google.android.gms.measurement.internal.zzhf r10 = r7.zza     // Catch:{ RuntimeException -> 0x0394 }
            android.content.Context r10 = r10.zza()     // Catch:{ RuntimeException -> 0x0394 }
            r11 = 1
            boolean r0 = r0.bindService(r10, r9, r8, r11)     // Catch:{ RuntimeException -> 0x0394 }
            com.google.android.gms.measurement.internal.zzhf r8 = r7.zza     // Catch:{ RuntimeException -> 0x0394 }
            com.google.android.gms.measurement.internal.zzfr r8 = r8.zzj()     // Catch:{ RuntimeException -> 0x0394 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ RuntimeException -> 0x0394 }
            if (r0 == 0) goto L_0x038c
            java.lang.String r0 = "available"
            goto L_0x038e
        L_0x038c:
            java.lang.String r0 = "not available"
        L_0x038e:
            java.lang.String r9 = "Install Referrer Service is"
            r8.zza(r9, r0)     // Catch:{ RuntimeException -> 0x0394 }
            goto L_0x03d8
        L_0x0394:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhf r7 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r7 = r7.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()     // Catch:{ all -> 0x0594 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0594 }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            r7.zza(r8, r0)     // Catch:{ all -> 0x0594 }
            goto L_0x03d8
        L_0x03a9:
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r7)     // Catch:{ all -> 0x0594 }
            goto L_0x03d8
        L_0x03b9:
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzn()     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r7)     // Catch:{ all -> 0x0594 }
            goto L_0x03d8
        L_0x03c9:
            com.google.android.gms.measurement.internal.zzhf r0 = r7.zza     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzw()     // Catch:{ all -> 0x0594 }
            java.lang.String r7 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r7)     // Catch:{ all -> 0x0594 }
        L_0x03d8:
            com.google.android.gms.measurement.internal.zzgy r0 = r30.zzl()     // Catch:{ all -> 0x0594 }
            r0.zzt()     // Catch:{ all -> 0x0594 }
            r30.zzs()     // Catch:{ all -> 0x0594 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0594 }
            r7.<init>()     // Catch:{ all -> 0x0594 }
            r8 = 1
            r7.putLong(r6, r8)     // Catch:{ all -> 0x0594 }
            r7.putLong(r4, r8)     // Catch:{ all -> 0x0594 }
            r4 = r25
            r8 = 0
            r7.putLong(r4, r8)     // Catch:{ all -> 0x0594 }
            r6 = r24
            r7.putLong(r6, r8)     // Catch:{ all -> 0x0594 }
            r10 = r23
            r7.putLong(r10, r8)     // Catch:{ all -> 0x0594 }
            r11 = r22
            r7.putLong(r11, r8)     // Catch:{ all -> 0x0594 }
            r8 = 1
            r7.putLong(r3, r8)     // Catch:{ all -> 0x0594 }
            boolean r0 = r5.zzo     // Catch:{ all -> 0x0594 }
            if (r0 == 0) goto L_0x0411
            r7.putLong(r1, r8)     // Catch:{ all -> 0x0594 }
        L_0x0411:
            java.lang.String r0 = r5.zza     // Catch:{ all -> 0x0594 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0594 }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)     // Catch:{ all -> 0x0594 }
            r0.zzt()     // Catch:{ all -> 0x0594 }
            r0.zzak()     // Catch:{ all -> 0x0594 }
            java.lang.String r3 = "first_open_count"
            long r8 = r0.zzb((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzhf r0 = r2.zzm     // Catch:{ all -> 0x0594 }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x0594 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0594 }
            if (r0 != 0) goto L_0x044c
            com.google.android.gms.measurement.internal.zzfr r0 = r30.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0594 }
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r1)     // Catch:{ all -> 0x0594 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            r0.zza(r3, r1)     // Catch:{ all -> 0x0594 }
            goto L_0x04f7
        L_0x044c:
            com.google.android.gms.measurement.internal.zzhf r0 = r2.zzm     // Catch:{ NameNotFoundException -> 0x045c }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x045c }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x045c }
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x045c }
            goto L_0x046f
        L_0x045c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r30.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0594 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r1)     // Catch:{ all -> 0x0594 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            r3.zza(r13, r12, r0)     // Catch:{ all -> 0x0594 }
            r0 = 0
        L_0x046f:
            if (r0 == 0) goto L_0x04bc
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x0594 }
            r14 = 0
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x04bc
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x0594 }
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x0594 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x04a0
            com.google.android.gms.measurement.internal.zzaf r0 = r30.zze()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbl     // Catch:{ all -> 0x0594 }
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r3)     // Catch:{ all -> 0x0594 }
            if (r0 == 0) goto L_0x0499
            r12 = 0
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x049e
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x0594 }
            goto L_0x049e
        L_0x0499:
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x0594 }
        L_0x049e:
            r15 = 0
            goto L_0x04a1
        L_0x04a0:
            r15 = 1
        L_0x04a1:
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x0594 }
            if (r15 == 0) goto L_0x04a8
            r14 = 1
            goto L_0x04aa
        L_0x04a8:
            r14 = 0
        L_0x04aa:
            java.lang.String r3 = "_fi"
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0594 }
            java.lang.String r19 = "auto"
            r14 = r0
            r15 = r3
            r16 = r28
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0594 }
            r2.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
        L_0x04bc:
            com.google.android.gms.measurement.internal.zzhf r0 = r2.zzm     // Catch:{ NameNotFoundException -> 0x04cc }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x04cc }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x04cc }
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x04cc }
            goto L_0x04df
        L_0x04cc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r30.zzj()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0594 }
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r1)     // Catch:{ all -> 0x0594 }
            java.lang.String r4 = "Application info is null, first open report might be inaccurate. appId"
            r3.zza(r4, r1, r0)     // Catch:{ all -> 0x0594 }
            r0 = 0
        L_0x04df:
            if (r0 == 0) goto L_0x04f7
            int r1 = r0.flags     // Catch:{ all -> 0x0594 }
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x04ec
            r3 = 1
            r7.putLong(r10, r3)     // Catch:{ all -> 0x0594 }
        L_0x04ec:
            int r0 = r0.flags     // Catch:{ all -> 0x0594 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x04f7
            r3 = 1
            r7.putLong(r11, r3)     // Catch:{ all -> 0x0594 }
        L_0x04f7:
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0500
            r7.putLong(r6, r8)     // Catch:{ all -> 0x0594 }
        L_0x0500:
            com.google.android.gms.measurement.internal.zzbg r0 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzbb r1 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x0594 }
            r1.<init>(r7)     // Catch:{ all -> 0x0594 }
            java.lang.String r15 = "_f"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r1
            r18 = r28
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0594 }
            r2.zzb((com.google.android.gms.measurement.internal.zzbg) r0, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
            goto L_0x0585
        L_0x0518:
            r7 = 1
            if (r9 != r7) goto L_0x0585
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x0594 }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0594 }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r28
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x0594 }
            r2.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzgy r0 = r30.zzl()     // Catch:{ all -> 0x0594 }
            r0.zzt()     // Catch:{ all -> 0x0594 }
            r30.zzs()     // Catch:{ all -> 0x0594 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0594 }
            r0.<init>()     // Catch:{ all -> 0x0594 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0594 }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0594 }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0594 }
            boolean r3 = r5.zzo     // Catch:{ all -> 0x0594 }
            if (r3 == 0) goto L_0x054f
            r0.putLong(r1, r7)     // Catch:{ all -> 0x0594 }
        L_0x054f:
            com.google.android.gms.measurement.internal.zzbg r1 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzbb r3 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x0594 }
            r3.<init>(r0)     // Catch:{ all -> 0x0594 }
            java.lang.String r15 = "_v"
            java.lang.String r17 = "auto"
            r14 = r1
            r16 = r3
            r18 = r28
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0594 }
            r2.zzb((com.google.android.gms.measurement.internal.zzbg) r1, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
            goto L_0x0585
        L_0x0566:
            boolean r0 = r5.zzi     // Catch:{ all -> 0x0594 }
            if (r0 == 0) goto L_0x0585
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0594 }
            r0.<init>()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzbg r1 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzbb r3 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x0594 }
            r3.<init>(r0)     // Catch:{ all -> 0x0594 }
            java.lang.String r15 = "_cd"
            java.lang.String r17 = "auto"
            r14 = r1
            r16 = r3
            r18 = r28
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0594 }
            r2.zzb((com.google.android.gms.measurement.internal.zzbg) r1, (com.google.android.gms.measurement.internal.zzo) r5)     // Catch:{ all -> 0x0594 }
        L_0x0585:
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()     // Catch:{ all -> 0x0594 }
            r0.zzw()     // Catch:{ all -> 0x0594 }
            com.google.android.gms.measurement.internal.zzao r0 = r30.zzf()
            r0.zzu()
            return
        L_0x0594:
            r0 = move-exception
            goto L_0x0598
        L_0x0596:
            r0 = move-exception
            r2 = r1
        L_0x0598:
            com.google.android.gms.measurement.internal.zzao r1 = r30.zzf()
            r1.zzu()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzc(com.google.android.gms.measurement.internal.zzo):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        this.zzs++;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzad zzad2) {
        zzo zzc2 = zzc((String) Preconditions.checkNotNull(zzad2.zza));
        if (zzc2 != null) {
            zza(zzad2, zzc2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzad zzad2, zzo zzo2) {
        Preconditions.checkNotNull(zzad2);
        Preconditions.checkNotEmpty(zzad2.zza);
        Preconditions.checkNotNull(zzad2.zzc);
        Preconditions.checkNotEmpty(zzad2.zzc.zza);
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            zzf().zzp();
            try {
                zza(zzo2);
                String str = (String) Preconditions.checkNotNull(zzad2.zza);
                zzad zzc2 = zzf().zzc(str, zzad2.zzc.zza);
                if (zzc2 != null) {
                    zzj().zzc().zza("Removing conditional user property", zzad2.zza, this.zzm.zzk().zzc(zzad2.zzc.zza));
                    zzf().zza(str, zzad2.zzc.zza);
                    if (zzc2.zze) {
                        zzf().zzh(str, zzad2.zzc.zza);
                    }
                    if (zzad2.zzk != null) {
                        zzc((zzbg) Preconditions.checkNotNull(zzq().zza(str, ((zzbg) Preconditions.checkNotNull(zzad2.zzk)).zza, zzad2.zzk.zzb != null ? zzad2.zzk.zzb.zzb() : null, zzc2.zzb, zzad2.zzk.zzd, true, true)), zzo2);
                    }
                } else {
                    zzj().zzu().zza("Conditional user property doesn't exist", zzfr.zza(zzad2.zza), this.zzm.zzk().zzc(zzad2.zzc.zza));
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    private static void zza(zzfi.zze.zza zza2, String str) {
        List<zzfi.zzg> zzf2 = zza2.zzf();
        for (int i = 0; i < zzf2.size(); i++) {
            if (str.equals(zzf2.get(i).zzg())) {
                zza2.zza(i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzo zzo2) {
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
            } else if (!"_npa".equals(str) || zzo2.zzq == null) {
                zzj().zzc().zza("Removing user property", this.zzm.zzk().zzc(str));
                zzf().zzp();
                try {
                    zza(zzo2);
                    if ("_id".equals(str)) {
                        zzf().zzh((String) Preconditions.checkNotNull(zzo2.zza), "_lair");
                    }
                    zzf().zzh((String) Preconditions.checkNotNull(zzo2.zza), str);
                    zzf().zzw();
                    zzj().zzc().zza("User property removed", this.zzm.zzk().zzc(str));
                } finally {
                    zzf().zzu();
                }
            } else {
                zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zznc("_npa", zzb().currentTimeMillis(), Long.valueOf(zzo2.zzq.booleanValue() ? 1 : 0), "auto"), zzo2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzo zzo2) {
        zzo zzo3 = zzo2;
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzaa = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzao zzf2 = zzf();
        String str = (String) Preconditions.checkNotNull(zzo3.zza);
        Preconditions.checkNotEmpty(str);
        zzf2.zzt();
        zzf2.zzak();
        try {
            SQLiteDatabase e_ = zzf2.e_();
            String[] strArr = {str};
            int delete = e_.delete("apps", "app_id=?", strArr);
            int delete2 = e_.delete("events", "app_id=?", strArr);
            int delete3 = e_.delete("user_attributes", "app_id=?", strArr);
            int delete4 = e_.delete("conditional_properties", "app_id=?", strArr);
            int delete5 = e_.delete("raw_events", "app_id=?", strArr);
            int delete6 = e_.delete("raw_events_metadata", "app_id=?", strArr);
            int delete7 = e_.delete("queue", "app_id=?", strArr);
            int delete8 = e_.delete("audience_filter_values", "app_id=?", strArr);
            int delete9 = delete + 0 + delete2 + delete3 + delete4 + delete5 + delete6 + delete7 + delete8 + e_.delete("main_event_params", "app_id=?", strArr) + e_.delete("default_event_params", "app_id=?", strArr) + e_.delete("trigger_uris", "app_id=?", strArr);
            if (delete9 > 0) {
                zzf2.zzj().zzp().zza("Reset analytics data. app, records", str, Integer.valueOf(delete9));
            }
        } catch (SQLiteException e) {
            zzf2.zzj().zzg().zza("Error resetting analytics data. appId, error", zzfr.zza(str), e);
        }
        if (zzo3.zzh) {
            zzc(zzo2);
        }
    }

    public final void zza(String str, zzki zzki) {
        zzl().zzt();
        String str2 = this.zzag;
        if (str2 == null || str2.equals(str) || zzki != null) {
            this.zzag = str;
            this.zzaf = zzki;
        }
    }

    private final void zza(List<Long> list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzj().zzg().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        zzl().zzt();
        zzf().zzv();
        if (this.zzj.zzc.zza() == 0) {
            this.zzj.zzc.zza(zzb().currentTimeMillis());
        }
        zzab();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzad zzad2) {
        zzo zzc2 = zzc((String) Preconditions.checkNotNull(zzad2.zza));
        if (zzc2 != null) {
            zzb(zzad2, zzc2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzad zzad2, zzo zzo2) {
        Preconditions.checkNotNull(zzad2);
        Preconditions.checkNotEmpty(zzad2.zza);
        Preconditions.checkNotNull(zzad2.zzb);
        Preconditions.checkNotNull(zzad2.zzc);
        Preconditions.checkNotEmpty(zzad2.zzc.zza);
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            zzad zzad3 = new zzad(zzad2);
            boolean z = false;
            zzad3.zze = false;
            zzf().zzp();
            try {
                zzad zzc2 = zzf().zzc((String) Preconditions.checkNotNull(zzad3.zza), zzad3.zzc.zza);
                if (zzc2 != null && !zzc2.zzb.equals(zzad3.zzb)) {
                    zzj().zzu().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzb, zzc2.zzb);
                }
                if (zzc2 != null && zzc2.zze) {
                    zzad3.zzb = zzc2.zzb;
                    zzad3.zzd = zzc2.zzd;
                    zzad3.zzh = zzc2.zzh;
                    zzad3.zzf = zzc2.zzf;
                    zzad3.zzi = zzc2.zzi;
                    zzad3.zze = zzc2.zze;
                    zzad3.zzc = new zznc(zzad3.zzc.zza, zzc2.zzc.zzb, zzad3.zzc.zza(), zzc2.zzc.zze);
                } else if (TextUtils.isEmpty(zzad3.zzf)) {
                    zzad3.zzc = new zznc(zzad3.zzc.zza, zzad3.zzd, zzad3.zzc.zza(), zzad3.zzc.zze);
                    zzad3.zze = true;
                    z = true;
                }
                if (zzad3.zze) {
                    zznc zznc = zzad3.zzc;
                    zzne zzne = new zzne((String) Preconditions.checkNotNull(zzad3.zza), zzad3.zzb, zznc.zza, zznc.zzb, Preconditions.checkNotNull(zznc.zza()));
                    if (zzf().zza(zzne)) {
                        zzj().zzc().zza("User property updated immediately", zzad3.zza, this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                    } else {
                        zzj().zzg().zza("(2)Too many active user properties, ignoring", zzfr.zza(zzad3.zza), this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                    }
                    if (z && zzad3.zzi != null) {
                        zzc(new zzbg(zzad3.zzi, zzad3.zzd), zzo2);
                    }
                }
                if (zzf().zza(zzad3)) {
                    zzj().zzc().zza("Conditional property added", zzad3.zza, this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzc.zza());
                } else {
                    zzj().zzg().zza("Too many conditional properties, ignoring", zzfr.zza(zzad3.zza), this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzc.zza());
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzih zzih) {
        zzl().zzt();
        zzs();
        this.zzac.put(str, zzih);
        zzf().zza(str, zzih);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzay zzay) {
        zzl().zzt();
        zzs();
        if (zznp.zza()) {
            this.zzad.put(str, zzay);
            zzf().zza(str, zzay);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzab() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.zzgy r1 = r21.zzl()
            r1.zzt()
            r21.zzs()
            long r1 = r0.zzp
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.elapsedRealtime()
            long r5 = r0.zzp
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x004b:
            r0.zzp = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzhf r1 = r0.zzm
            boolean r1 = r1.zzaf()
            if (r1 == 0) goto L_0x024f
            boolean r1 = r21.zzac()
            if (r1 != 0) goto L_0x005d
            goto L_0x024f
        L_0x005d:
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzbi.zzaa
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()
            boolean r5 = r5.zzz()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()
            boolean r5 = r5.zzy()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.zzaf r10 = r21.zze()
            java.lang.String r10 = r10.zzn()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzv
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzu
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzt
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.zzls r12 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r12 = r12.zzc
            long r12 = r12.zza()
            com.google.android.gms.measurement.internal.zzls r14 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r14 = r14.zzd
            long r14 = r14.zza()
            com.google.android.gms.measurement.internal.zzao r16 = r21.zzf()
            r17 = r10
            long r9 = r16.c_()
            com.google.android.gms.measurement.internal.zzao r11 = r21.zzf()
            r19 = r7
            long r6 = r11.d_()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0112
            goto L_0x018d
        L_0x0112:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r10 = r1 - r10
            long r1 = r1 - r8
            long r1 = java.lang.Math.max(r1, r10)
            long r8 = r6 + r19
            if (r5 == 0) goto L_0x0138
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0138
            long r8 = java.lang.Math.min(r6, r1)
            long r8 = r8 + r17
        L_0x0138:
            com.google.android.gms.measurement.internal.zzmz r5 = r21.zzp()
            r12 = r17
            boolean r5 = r5.zza((long) r1, (long) r12)
            if (r5 != 0) goto L_0x0146
            long r8 = r1 + r12
        L_0x0146:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x014f:
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r2 = com.google.android.gms.measurement.internal.zzbi.zzac
            r5 = 0
            java.lang.Object r2 = r2.zza(r5)
            r6 = 20
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            int r2 = java.lang.Math.min(r6, r2)
            if (r1 >= r2) goto L_0x018d
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r2 = com.google.android.gms.measurement.internal.zzbi.zzab
            java.lang.Object r2 = r2.zza(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r8 = r8 + r5
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x018a
            goto L_0x018e
        L_0x018a:
            int r1 = r1 + 1
            goto L_0x014f
        L_0x018d:
            r8 = r3
        L_0x018e:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x01ae:
            com.google.android.gms.measurement.internal.zzfy r1 = r21.zzh()
            boolean r1 = r1.zzu()
            if (r1 != 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zza()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x01d4:
            com.google.android.gms.measurement.internal.zzls r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r1 = r1.zzb
            long r1 = r1.zza()
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzbi.zzr
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzmz r7 = r21.zzp()
            boolean r7 = r7.zza((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01ff
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01ff:
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0236
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzbi.zzw
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzls r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r1 = r1.zzc
            com.google.android.gms.common.util.Clock r2 = r21.zzb()
            long r2 = r2.currentTimeMillis()
            r1.zza(r2)
        L_0x0236:
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zza(r8)
            return
        L_0x024f:
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzab():void");
    }

    private final void zza(String str, boolean z) {
        zzh zzd2 = zzf().zzd(str);
        if (zzd2 != null) {
            zzd2.zzd(z);
            if (zzd2.zzal()) {
                zzf().zza(zzd2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zznc zznc, zzo zzo2) {
        zzne zze2;
        long j;
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            int zzb2 = zzq().zzb(zznc.zza);
            if (zzb2 != 0) {
                zzq();
                String str = zznc.zza;
                zze();
                String zza2 = zznd.zza(str, 24, true);
                int length = zznc.zza != null ? zznc.zza.length() : 0;
                zzq();
                zznd.zza(this.zzah, zzo2.zza, zzb2, "_ev", zza2, length);
                return;
            }
            int zza3 = zzq().zza(zznc.zza, zznc.zza());
            if (zza3 != 0) {
                zzq();
                String str2 = zznc.zza;
                zze();
                String zza4 = zznd.zza(str2, 24, true);
                Object zza5 = zznc.zza();
                int length2 = (zza5 == null || (!(zza5 instanceof String) && !(zza5 instanceof CharSequence))) ? 0 : String.valueOf(zza5).length();
                zzq();
                zznd.zza(this.zzah, zzo2.zza, zza3, "_ev", zza4, length2);
                return;
            }
            Object zzc2 = zzq().zzc(zznc.zza, zznc.zza());
            if (zzc2 != null) {
                if ("_sid".equals(zznc.zza)) {
                    long j2 = zznc.zzb;
                    String str3 = zznc.zze;
                    String str4 = (String) Preconditions.checkNotNull(zzo2.zza);
                    zzne zze3 = zzf().zze(str4, "_sno");
                    if (zze3 == null || !(zze3.zze instanceof Long)) {
                        if (zze3 != null) {
                            zzj().zzu().zza("Retrieved last session number from database does not contain a valid (long) value", zze3.zze);
                        }
                        zzbc zzd2 = zzf().zzd(str4, "_s");
                        if (zzd2 != null) {
                            j = zzd2.zzc;
                            zzj().zzp().zza("Backfill the session number. Last used session number", Long.valueOf(j));
                        } else {
                            j = 0;
                        }
                    } else {
                        j = ((Long) zze3.zze).longValue();
                    }
                    zza(new zznc("_sno", j2, Long.valueOf(j + 1), str3), zzo2);
                }
                zzne zzne = new zzne((String) Preconditions.checkNotNull(zzo2.zza), (String) Preconditions.checkNotNull(zznc.zze), zznc.zza, zznc.zzb, zzc2);
                zzj().zzp().zza("Setting user property", this.zzm.zzk().zzc(zzne.zzc), zzc2);
                zzf().zzp();
                try {
                    if ("_id".equals(zzne.zzc) && (zze2 = zzf().zze(zzo2.zza, "_id")) != null && !zzne.zze.equals(zze2.zze)) {
                        zzf().zzh(zzo2.zza, "_lair");
                    }
                    zza(zzo2);
                    boolean zza6 = zzf().zza(zzne);
                    if ("_sid".equals(zznc.zza)) {
                        long zza7 = zzp().zza(zzo2.zzv);
                        zzh zzd3 = zzf().zzd(zzo2.zza);
                        if (zzd3 != null) {
                            zzd3.zzq(zza7);
                            if (zzd3.zzal()) {
                                zzf().zza(zzd3);
                            }
                        }
                    }
                    zzf().zzw();
                    if (!zza6) {
                        zzj().zzg().zza("Too many unique user properties are set. Ignoring user property", this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                        zzq();
                        zznd.zza(this.zzah, zzo2.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzf().zzu();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x040e */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0311 A[Catch:{ all -> 0x0450 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0312 A[Catch:{ all -> 0x0450 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzw() {
        /*
            r21 = this;
            r7 = r21
            com.google.android.gms.measurement.internal.zzgy r0 = r21.zzl()
            r0.zzt()
            r21.zzs()
            r0 = 1
            r7.zzw = r0
            r8 = 0
            com.google.android.gms.measurement.internal.zzhf r1 = r7.zzm     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzkp r1 = r1.zzr()     // Catch:{ all -> 0x0450 }
            java.lang.Boolean r1 = r1.zzab()     // Catch:{ all -> 0x0450 }
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()     // Catch:{ all -> 0x0450 }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
            r0.zza(r1)     // Catch:{ all -> 0x0450 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x002f:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0450 }
            if (r1 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0450 }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            r0.zza(r1)     // Catch:{ all -> 0x0450 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x0048:
            long r1 = r7.zzp     // Catch:{ all -> 0x0450 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0059
            r21.zzab()     // Catch:{ all -> 0x0450 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x0059:
            com.google.android.gms.measurement.internal.zzgy r1 = r21.zzl()     // Catch:{ all -> 0x0450 }
            r1.zzt()     // Catch:{ all -> 0x0450 }
            java.util.List<java.lang.Long> r1 = r7.zzz     // Catch:{ all -> 0x0450 }
            if (r1 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x007c
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ all -> 0x0450 }
            java.lang.String r1 = "Uploading requested multiple times"
            r0.zza(r1)     // Catch:{ all -> 0x0450 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x007c:
            com.google.android.gms.measurement.internal.zzfy r1 = r21.zzh()     // Catch:{ all -> 0x0450 }
            boolean r1 = r1.zzu()     // Catch:{ all -> 0x0450 }
            if (r1 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ all -> 0x0450 }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.zza(r1)     // Catch:{ all -> 0x0450 }
            r21.zzab()     // Catch:{ all -> 0x0450 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x009c:
            com.google.android.gms.common.util.Clock r1 = r21.zzb()     // Catch:{ all -> 0x0450 }
            long r1 = r1.currentTimeMillis()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzaf r5 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.zzbi.zzar     // Catch:{ all -> 0x0450 }
            r9 = 0
            int r5 = r5.zzb(r9, r6)     // Catch:{ all -> 0x0450 }
            r21.zze()     // Catch:{ all -> 0x0450 }
            long r10 = com.google.android.gms.measurement.internal.zzaf.zzh()     // Catch:{ all -> 0x0450 }
            r6 = 0
        L_0x00b7:
            if (r6 >= r5) goto L_0x00c4
            long r12 = r1 - r10
            boolean r12 = r7.zza((java.lang.String) r9, (long) r12)     // Catch:{ all -> 0x0450 }
            if (r12 == 0) goto L_0x00c4
            int r6 = r6 + 1
            goto L_0x00b7
        L_0x00c4:
            boolean r5 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0450 }
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.measurement.internal.zzgy r5 = r21.zzl()     // Catch:{ all -> 0x0450 }
            r5.zzt()     // Catch:{ all -> 0x0450 }
            java.util.Set<java.lang.String> r5 = r7.zzr     // Catch:{ all -> 0x0450 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0450 }
        L_0x00d7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0450 }
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0450 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0450 }
            boolean r10 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0450 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.zzaf r10 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0450 }
            boolean r10 = r10.zze(r6, r11)     // Catch:{ all -> 0x0450 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.zzfr r10 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzc()     // Catch:{ all -> 0x0450 }
            java.lang.String r11 = "Notifying app that trigger URIs are available. App ID"
            r10.zza(r11, r6)     // Catch:{ all -> 0x0450 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0450 }
            r10.<init>()     // Catch:{ all -> 0x0450 }
            java.lang.String r11 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r10.setAction(r11)     // Catch:{ all -> 0x0450 }
            r10.setPackage(r6)     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzhf r6 = r7.zzm     // Catch:{ all -> 0x0450 }
            android.content.Context r6 = r6.zza()     // Catch:{ all -> 0x0450 }
            r6.sendBroadcast(r10)     // Catch:{ all -> 0x0450 }
            goto L_0x00d7
        L_0x0119:
            java.util.Set<java.lang.String> r5 = r7.zzr     // Catch:{ all -> 0x0450 }
            r5.clear()     // Catch:{ all -> 0x0450 }
        L_0x011e:
            com.google.android.gms.measurement.internal.zzls r5 = r7.zzj     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.zzc     // Catch:{ all -> 0x0450 }
            long r5 = r5.zza()     // Catch:{ all -> 0x0450 }
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0141
            com.google.android.gms.measurement.internal.zzfr r3 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzc()     // Catch:{ all -> 0x0450 }
            long r4 = r1 - r5
            long r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x0450 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0450 }
            r3.zza(r6, r4)     // Catch:{ all -> 0x0450 }
        L_0x0141:
            com.google.android.gms.measurement.internal.zzao r3 = r21.zzf()     // Catch:{ all -> 0x0450 }
            java.lang.String r6 = r3.f_()     // Catch:{ all -> 0x0450 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0450 }
            r4 = -1
            if (r3 != 0) goto L_0x0424
            long r10 = r7.zzab     // Catch:{ all -> 0x0450 }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.zzao r3 = r21.zzf()     // Catch:{ all -> 0x0450 }
            long r3 = r3.b_()     // Catch:{ all -> 0x0450 }
            r7.zzab = r3     // Catch:{ all -> 0x0450 }
        L_0x0161:
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r4 = com.google.android.gms.measurement.internal.zzbi.zzg     // Catch:{ all -> 0x0450 }
            int r3 = r3.zzb(r6, r4)     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzaf r4 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.zzbi.zzh     // Catch:{ all -> 0x0450 }
            int r4 = r4.zzb(r6, r5)     // Catch:{ all -> 0x0450 }
            int r4 = java.lang.Math.max(r8, r4)     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()     // Catch:{ all -> 0x0450 }
            java.util.List r3 = r5.zza((java.lang.String) r6, (int) r3, (int) r4)     // Catch:{ all -> 0x0450 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0450 }
            if (r4 != 0) goto L_0x0449
            com.google.android.gms.measurement.internal.zzih r4 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            boolean r4 = r4.zzg()     // Catch:{ all -> 0x0450 }
            if (r4 == 0) goto L_0x01e4
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0450 }
        L_0x0195:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0450 }
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0450 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x0450 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = (com.google.android.gms.internal.measurement.zzfi.zzj) r5     // Catch:{ all -> 0x0450 }
            java.lang.String r10 = r5.zzal()     // Catch:{ all -> 0x0450 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0450 }
            if (r10 != 0) goto L_0x0195
            java.lang.String r4 = r5.zzal()     // Catch:{ all -> 0x0450 }
            goto L_0x01b5
        L_0x01b4:
            r4 = r9
        L_0x01b5:
            if (r4 == 0) goto L_0x01e4
            r5 = 0
        L_0x01b8:
            int r10 = r3.size()     // Catch:{ all -> 0x0450 }
            if (r5 >= r10) goto L_0x01e4
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x0450 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0450 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = (com.google.android.gms.internal.measurement.zzfi.zzj) r10     // Catch:{ all -> 0x0450 }
            java.lang.String r11 = r10.zzal()     // Catch:{ all -> 0x0450 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0450 }
            if (r11 != 0) goto L_0x01e1
            java.lang.String r10 = r10.zzal()     // Catch:{ all -> 0x0450 }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x0450 }
            if (r10 != 0) goto L_0x01e1
            java.util.List r3 = r3.subList(r8, r5)     // Catch:{ all -> 0x0450 }
            goto L_0x01e4
        L_0x01e1:
            int r5 = r5 + 1
            goto L_0x01b8
        L_0x01e4:
            com.google.android.gms.internal.measurement.zzfi$zzi$zza r4 = com.google.android.gms.internal.measurement.zzfi.zzi.zzb()     // Catch:{ all -> 0x0450 }
            int r5 = r3.size()     // Catch:{ all -> 0x0450 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0450 }
            int r11 = r3.size()     // Catch:{ all -> 0x0450 }
            r10.<init>(r11)     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()     // Catch:{ all -> 0x0450 }
            boolean r11 = r11.zzk(r6)     // Catch:{ all -> 0x0450 }
            if (r11 == 0) goto L_0x020b
            com.google.android.gms.measurement.internal.zzih r11 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            boolean r11 = r11.zzg()     // Catch:{ all -> 0x0450 }
            if (r11 == 0) goto L_0x020b
            r11 = 1
            goto L_0x020c
        L_0x020b:
            r11 = 0
        L_0x020c:
            com.google.android.gms.measurement.internal.zzih r12 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            boolean r12 = r12.zzg()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzih r13 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            boolean r13 = r13.zzh()     // Catch:{ all -> 0x0450 }
            boolean r14 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0450 }
            if (r14 == 0) goto L_0x0230
            com.google.android.gms.measurement.internal.zzaf r14 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzbi.zzbt     // Catch:{ all -> 0x0450 }
            boolean r14 = r14.zze(r6, r15)     // Catch:{ all -> 0x0450 }
            if (r14 == 0) goto L_0x0230
            r14 = 1
            goto L_0x0231
        L_0x0230:
            r14 = 0
        L_0x0231:
            r15 = 0
        L_0x0232:
            if (r15 >= r5) goto L_0x0349
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0450 }
            r9 = r16
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0450 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = (com.google.android.gms.internal.measurement.zzfi.zzj) r9     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzix$zzb r9 = r9.zzby()     // Catch:{ all -> 0x0450 }
            r16 = r9
            com.google.android.gms.internal.measurement.zzix$zzb r16 = (com.google.android.gms.internal.measurement.zzix.zzb) r16     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ all -> 0x0450 }
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0450 }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0450 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0450 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0450 }
            r10.add(r0)     // Catch:{ all -> 0x0450 }
            r21.zze()     // Catch:{ all -> 0x0450 }
            r0 = r3
            r16 = r4
            r3 = 82001(0x14051, double:4.0514E-319)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r9.zzl((long) r3)     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r3.zzk((long) r1)     // Catch:{ all -> 0x0450 }
            r3.zzd((boolean) r8)     // Catch:{ all -> 0x0450 }
            if (r11 != 0) goto L_0x0272
            r9.zzh()     // Catch:{ all -> 0x0450 }
        L_0x0272:
            if (r12 != 0) goto L_0x027a
            r9.zzo()     // Catch:{ all -> 0x0450 }
            r9.zzk()     // Catch:{ all -> 0x0450 }
        L_0x027a:
            if (r13 != 0) goto L_0x027f
            r9.zze()     // Catch:{ all -> 0x0450 }
        L_0x027f:
            r7.zza((java.lang.String) r6, (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9)     // Catch:{ all -> 0x0450 }
            if (r14 != 0) goto L_0x0287
            r9.zzp()     // Catch:{ all -> 0x0450 }
        L_0x0287:
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x0315
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0450 }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x0315
            java.lang.String r3 = r9.zzv()     // Catch:{ all -> 0x0450 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0450 }
            if (r4 != 0) goto L_0x02af
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x02ac
            goto L_0x02af
        L_0x02ac:
            r20 = r0
            goto L_0x030b
        L_0x02af:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0450 }
            java.util.List r4 = r9.zzw()     // Catch:{ all -> 0x0450 }
            r3.<init>(r4)     // Catch:{ all -> 0x0450 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0450 }
            r17 = 0
            r18 = 0
        L_0x02c0:
            boolean r19 = r4.hasNext()     // Catch:{ all -> 0x0450 }
            if (r19 == 0) goto L_0x02f7
            java.lang.Object r19 = r4.next()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zze r19 = (com.google.android.gms.internal.measurement.zzfi.zze) r19     // Catch:{ all -> 0x0450 }
            java.lang.String r8 = "_fx"
            r20 = r0
            java.lang.String r0 = r19.zzg()     // Catch:{ all -> 0x0450 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x02e5
            r4.remove()     // Catch:{ all -> 0x0450 }
            r0 = r20
            r8 = 0
            r17 = 1
            r18 = 1
            goto L_0x02c0
        L_0x02e5:
            java.lang.String r0 = "_f"
            java.lang.String r8 = r19.zzg()     // Catch:{ all -> 0x0450 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x02f3
            r18 = 1
        L_0x02f3:
            r0 = r20
            r8 = 0
            goto L_0x02c0
        L_0x02f7:
            r20 = r0
            if (r17 == 0) goto L_0x0301
            r9.zzi()     // Catch:{ all -> 0x0450 }
            r9.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r3)     // Catch:{ all -> 0x0450 }
        L_0x0301:
            if (r18 == 0) goto L_0x030b
            java.lang.String r0 = r9.zzr()     // Catch:{ all -> 0x0450 }
            r3 = 1
            r7.zza((java.lang.String) r0, (boolean) r3)     // Catch:{ all -> 0x0450 }
        L_0x030b:
            int r0 = r9.zza()     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x0312
            goto L_0x0317
        L_0x0312:
            r0 = r16
            goto L_0x033f
        L_0x0315:
            r20 = r0
        L_0x0317:
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbd     // Catch:{ all -> 0x0450 }
            boolean r0 = r0.zze(r6, r3)     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x033a
            com.google.android.gms.internal.measurement.zzkj r0 = r9.zzab()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzix r0 = (com.google.android.gms.internal.measurement.zzix) r0     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = (com.google.android.gms.internal.measurement.zzfi.zzj) r0     // Catch:{ all -> 0x0450 }
            byte[] r0 = r0.zzbv()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzmz r3 = r21.zzp()     // Catch:{ all -> 0x0450 }
            long r3 = r3.zza((byte[]) r0)     // Catch:{ all -> 0x0450 }
            r9.zza((long) r3)     // Catch:{ all -> 0x0450 }
        L_0x033a:
            r0 = r16
            r0.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9)     // Catch:{ all -> 0x0450 }
        L_0x033f:
            int r15 = r15 + 1
            r4 = r0
            r3 = r20
            r0 = 1
            r8 = 0
            r9 = 0
            goto L_0x0232
        L_0x0349:
            r0 = r4
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x0376
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0450 }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x0376
            int r3 = r0.zza()     // Catch:{ all -> 0x0450 }
            if (r3 != 0) goto L_0x0376
            r7.zza((java.util.List<java.lang.Long>) r10)     // Catch:{ all -> 0x0450 }
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r21
            r1.zza((boolean) r2, (int) r3, (java.lang.Throwable) r4, (byte[]) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            r1 = 0
            r7.zzw = r1
            r21.zzaa()
            return
        L_0x0376:
            com.google.android.gms.measurement.internal.zzfr r3 = r21.zzj()     // Catch:{ all -> 0x0450 }
            r4 = 2
            boolean r3 = r3.zza((int) r4)     // Catch:{ all -> 0x0450 }
            if (r3 == 0) goto L_0x0392
            com.google.android.gms.measurement.internal.zzmz r3 = r21.zzp()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzkj r4 = r0.zzab()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzi r4 = (com.google.android.gms.internal.measurement.zzfi.zzi) r4     // Catch:{ all -> 0x0450 }
            java.lang.String r9 = r3.zza((com.google.android.gms.internal.measurement.zzfi.zzi) r4)     // Catch:{ all -> 0x0450 }
            goto L_0x0393
        L_0x0392:
            r9 = 0
        L_0x0393:
            r21.zzp()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzkj r3 = r0.zzab()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3     // Catch:{ all -> 0x0450 }
            com.google.android.gms.internal.measurement.zzfi$zzi r3 = (com.google.android.gms.internal.measurement.zzfi.zzi) r3     // Catch:{ all -> 0x0450 }
            byte[] r14 = r3.zzbv()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzmn r3 = r7.zzk     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzmq r3 = r3.zza(r6)     // Catch:{ all -> 0x0450 }
            r7.zza((java.util.List<java.lang.Long>) r10)     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzls r4 = r7.zzj     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzgi r4 = r4.zzd     // Catch:{ MalformedURLException -> 0x040e }
            r4.zza(r1)     // Catch:{ MalformedURLException -> 0x040e }
            if (r5 <= 0) goto L_0x03c1
            r1 = 0
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = r0.zza((int) r1)     // Catch:{ all -> 0x03be }
            java.lang.String r0 = r0.zzx()     // Catch:{ MalformedURLException -> 0x040e }
            goto L_0x03c3
        L_0x03be:
            r0 = move-exception
            goto L_0x0452
        L_0x03c1:
            java.lang.String r0 = "?"
        L_0x03c3:
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()     // Catch:{ MalformedURLException -> 0x040e }
            int r2 = r14.length     // Catch:{ MalformedURLException -> 0x040e }
            java.lang.String r4 = "Uploading data. app, uncompressed size, data"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ MalformedURLException -> 0x040e }
            r1.zza(r4, r0, r2, r9)     // Catch:{ MalformedURLException -> 0x040e }
            r0 = 1
            r7.zzv = r0     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzfy r11 = r21.zzh()     // Catch:{ MalformedURLException -> 0x040e }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x040e }
            java.lang.String r0 = r3.zza()     // Catch:{ MalformedURLException -> 0x040e }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x040e }
            java.util.Map r15 = r3.zzb()     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzmr r0 = new com.google.android.gms.measurement.internal.zzmr     // Catch:{ MalformedURLException -> 0x040e }
            r0.<init>(r7, r6)     // Catch:{ MalformedURLException -> 0x040e }
            r11.zzt()     // Catch:{ MalformedURLException -> 0x040e }
            r11.zzak()     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzgy r1 = r11.zzl()     // Catch:{ MalformedURLException -> 0x040e }
            com.google.android.gms.measurement.internal.zzgc r2 = new com.google.android.gms.measurement.internal.zzgc     // Catch:{ MalformedURLException -> 0x040e }
            r10 = r2
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x040e }
            r1.zza((java.lang.Runnable) r2)     // Catch:{ MalformedURLException -> 0x040e }
            goto L_0x0449
        L_0x040e:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0450 }
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r6)     // Catch:{ all -> 0x0450 }
            java.lang.String r2 = r3.zza()     // Catch:{ all -> 0x0450 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            r0.zza(r3, r1, r2)     // Catch:{ all -> 0x0450 }
            goto L_0x0449
        L_0x0424:
            r7.zzab = r4     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzao r0 = r21.zzf()     // Catch:{ all -> 0x0450 }
            r21.zze()     // Catch:{ all -> 0x0450 }
            long r3 = com.google.android.gms.measurement.internal.zzaf.zzh()     // Catch:{ all -> 0x0450 }
            long r1 = r1 - r3
            java.lang.String r0 = r0.zza((long) r1)     // Catch:{ all -> 0x0450 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0450 }
            if (r1 != 0) goto L_0x0449
            com.google.android.gms.measurement.internal.zzao r1 = r21.zzf()     // Catch:{ all -> 0x0450 }
            com.google.android.gms.measurement.internal.zzh r0 = r1.zzd(r0)     // Catch:{ all -> 0x0450 }
            if (r0 == 0) goto L_0x0449
            r7.zzb((com.google.android.gms.measurement.internal.zzh) r0)     // Catch:{ all -> 0x0450 }
        L_0x0449:
            r1 = 0
            r7.zzw = r1
            r21.zzaa()
            return
        L_0x0450:
            r0 = move-exception
            r1 = 0
        L_0x0452:
            r7.zzw = r1
            r21.zzaa()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzw():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x030e A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0345 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03b3 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x073c A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0750 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0796 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0839 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0852 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x08d9 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x08f7 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x096e A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x09c8 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ce A[Catch:{ SQLiteException -> 0x02d7, all -> 0x0a13 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(com.google.android.gms.measurement.internal.zzbg r36, com.google.android.gms.measurement.internal.zzo r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)
            java.lang.String r6 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzgy r8 = r35.zzl()
            r8.zzt()
            r35.zzs()
            java.lang.String r8 = r3.zza
            r35.zzp()
            boolean r9 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.measurement.internal.zzbg) r36, (com.google.android.gms.measurement.internal.zzo) r37)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.zzh
            if (r9 != 0) goto L_0x0034
            r1.zza((com.google.android.gms.measurement.internal.zzo) r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.zzgp r9 = r35.zzi()
            java.lang.String r10 = r2.zza
            boolean r9 = r9.zzd(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzfr r3 = r35.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)
            com.google.android.gms.measurement.internal.zzhf r5 = r1.zzm
            com.google.android.gms.measurement.internal.zzfq r5 = r5.zzk()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zza((java.lang.String) r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.zza(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzgp r3 = r35.zzi()
            boolean r3 = r3.zzm(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.zzgp r3 = r35.zzi()
            boolean r3 = r3.zzo(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.zza
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r35.zzq()
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah
            java.lang.String r13 = r2.zza
            r11 = 11
            r2 = 0
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzd(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.zzn()
            long r7 = r2.zze()
            long r5 = java.lang.Math.max(r5, r7)
            com.google.android.gms.common.util.Clock r3 = r35.zzb()
            long r7 = r3.currentTimeMillis()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r35.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r3 = com.google.android.gms.measurement.internal.zzbi.zzz
            java.lang.Object r3 = r3.zza(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzfr r3 = r35.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzc()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.zza(r4)
            r1.zzb((com.google.android.gms.measurement.internal.zzh) r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzfv r2 = com.google.android.gms.measurement.internal.zzfv.zza(r36)
            com.google.android.gms.measurement.internal.zznd r9 = r35.zzq()
            com.google.android.gms.measurement.internal.zzaf r10 = r35.zze()
            int r10 = r10.zzd(r8)
            r9.zza((com.google.android.gms.measurement.internal.zzfv) r2, (int) r10)
            boolean r9 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzaf r9 = r35.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzcd
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzaf r9 = r35.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzbi.zzaq
            r11 = 10
            r12 = 35
            int r9 = r9.zza(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.zzb
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.zznd r12 = r35.zzq()
            android.os.Bundle r13 = r2.zzb
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzaf r13 = r35.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzbi.zzcd
            boolean r13 = r13.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.zza((android.os.Parcelable[]) r11, (int) r9, (boolean) r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.zzbg r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzfr r9 = r35.zzj()
            r10 = 2
            boolean r9 = r9.zza((int) r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.zzfr r9 = r35.zzj()
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()
            com.google.android.gms.measurement.internal.zzhf r11 = r1.zzm
            com.google.android.gms.measurement.internal.zzfq r11 = r11.zzk()
            java.lang.String r11 = r11.zza((com.google.android.gms.measurement.internal.zzbg) r2)
            java.lang.String r12 = "Logging event"
            r9.zza(r12, r11)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.zzon.zza()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.zzaf r9 = r35.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzca
            r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r11)
        L_0x0190:
            com.google.android.gms.measurement.internal.zzao r9 = r35.zzf()
            r9.zzp()
            r1.zza((com.google.android.gms.measurement.internal.zzo) r3)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "ecommerce_purchase"
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "refund"
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r12 = "purchase"
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r9 = 0
            goto L_0x01bc
        L_0x01bb:
            r9 = 1
        L_0x01bc:
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = "_iap"
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x0a13 }
            if (r12 != 0) goto L_0x01cb
            if (r9 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r12 = 0
            goto L_0x01cc
        L_0x01cb:
            r12 = 1
        L_0x01cc:
            if (r12 == 0) goto L_0x0354
            com.google.android.gms.measurement.internal.zzbb r12 = r2.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.zzd(r13)     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x0236
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.Double r9 = r9.zza((java.lang.String) r13)     // Catch:{ all -> 0x0a13 }
            double r19 = r9.doubleValue()     // Catch:{ all -> 0x0a13 }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r9 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.Long r9 = r9.zzb(r13)     // Catch:{ all -> 0x0a13 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a13 }
            double r13 = (double) r13     // Catch:{ all -> 0x0a13 }
            double r19 = r13 * r21
        L_0x01fe:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0218
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x0218
            long r13 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0240
            long r13 = -r13
            goto L_0x0240
        L_0x0218:
            com.google.android.gms.measurement.internal.zzfr r9 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzu()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "Data lost. Currency value is too big. appId"
            java.lang.Double r12 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0a13 }
            r9.zza(r11, r10, r12)     // Catch:{ all -> 0x0a13 }
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
            r13 = 0
            goto L_0x0343
        L_0x0236:
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.Long r9 = r9.zzb(r13)     // Catch:{ all -> 0x0a13 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a13 }
        L_0x0240:
            boolean r9 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0a13 }
            if (r9 != 0) goto L_0x033c
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r12.toUpperCase(r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a13 }
            if (r11 == 0) goto L_0x033c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a13 }
            java.lang.String r12 = "_ltv_"
            r11.<init>(r12)     // Catch:{ all -> 0x0a13 }
            r11.append(r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r9 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r9 = r9.zze(r8, r12)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x02a0
            java.lang.Object r11 = r9.zze     // Catch:{ all -> 0x0a13 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a13 }
            if (r11 != 0) goto L_0x0273
            goto L_0x02a0
        L_0x0273:
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0a13 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0a13 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.util.Clock r19 = r35.zzb()     // Catch:{ all -> 0x0a13 }
            long r19 = r19.currentTimeMillis()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r21 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x0a13 }
            long r9 = r9 + r13
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a13 }
            r9 = r21
            r10 = r8
            r13 = 0
            r24 = r6
            r6 = 1
            r7 = 0
            r13 = r19
            r26 = r15
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a13 }
        L_0x029d:
            r9 = r21
            goto L_0x0304
        L_0x02a0:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
            com.google.android.gms.measurement.internal.zzao r9 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaf r11 = r35.zze()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzbi.zzae     // Catch:{ all -> 0x0a13 }
            int r11 = r11.zzb(r8, r15)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0a13 }
            r9.zzt()     // Catch:{ all -> 0x0a13 }
            r9.zzak()     // Catch:{ all -> 0x0a13 }
            android.database.sqlite.SQLiteDatabase r15 = r9.e_()     // Catch:{ SQLiteException -> 0x02d7 }
            r10 = 3
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x02d7 }
            r10[r7] = r8     // Catch:{ SQLiteException -> 0x02d7 }
            r10[r6] = r8     // Catch:{ SQLiteException -> 0x02d7 }
            int r11 = r11 - r6
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x02d7 }
            r16 = 2
            r10[r16] = r11     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.String r11 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r15.execSQL(r11, r10)     // Catch:{ SQLiteException -> 0x02d7 }
            goto L_0x02ea
        L_0x02d7:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.zzfr r9 = r9.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            r9.zza(r11, r15, r10)     // Catch:{ all -> 0x0a13 }
        L_0x02ea:
            com.google.android.gms.measurement.internal.zzne r21 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.util.Clock r9 = r35.zzb()     // Catch:{ all -> 0x0a13 }
            long r15 = r9.currentTimeMillis()     // Catch:{ all -> 0x0a13 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a13 }
            r9 = r21
            r10 = r8
            r13 = r15
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a13 }
            goto L_0x029d
        L_0x0304:
            com.google.android.gms.measurement.internal.zzao r10 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            boolean r10 = r10.zza((com.google.android.gms.measurement.internal.zzne) r9)     // Catch:{ all -> 0x0a13 }
            if (r10 != 0) goto L_0x0342
            com.google.android.gms.measurement.internal.zzfr r10 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r12 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfq r12 = r12.zzk()     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = r9.zzc     // Catch:{ all -> 0x0a13 }
            java.lang.String r12 = r12.zzc(r13)     // Catch:{ all -> 0x0a13 }
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = "Too many unique user properties are set. Ignoring user property. appId"
            r10.zza(r13, r11, r12, r9)     // Catch:{ all -> 0x0a13 }
            r35.zzq()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a13 }
            r11 = 9
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a13 }
            goto L_0x0342
        L_0x033c:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
        L_0x0342:
            r13 = 1
        L_0x0343:
            if (r13 != 0) goto L_0x035a
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r2.zzw()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            return
        L_0x0354:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
        L_0x035a:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            boolean r20 = com.google.android.gms.measurement.internal.zznd.zzh(r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            r10 = r26
            boolean r21 = r10.equals(r9)     // Catch:{ all -> 0x0a13 }
            r35.zzq()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a13 }
            long r9 = com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zzbb) r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r11 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            long r12 = r35.zzx()     // Catch:{ all -> 0x0a13 }
            r14 = 1
            long r16 = r9 + r14
            r18 = 1
            r19 = 0
            r22 = 0
            r9 = r11
            r10 = r12
            r12 = r8
            r6 = r14
            r13 = r16
            r15 = r18
            r16 = r20
            r17 = r19
            r18 = r21
            r19 = r22
            com.google.android.gms.measurement.internal.zzap r9 = r9.zza(r10, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0a13 }
            long r10 = r9.zzb     // Catch:{ all -> 0x0a13 }
            r35.zze()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzk     // Catch:{ all -> 0x0a13 }
            r13 = 0
            java.lang.Object r12 = r12.zza(r13)     // Catch:{ all -> 0x0a13 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a13 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a13 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a13 }
            long r10 = r10 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03de
            long r10 = r10 % r12
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x03cf
            com.google.android.gms.measurement.internal.zzfr r2 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            long r4 = r9.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.String r6 = "Data loss. Too many events logged. appId, count"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0a13 }
            r2.zza(r6, r3, r4)     // Catch:{ all -> 0x0a13 }
        L_0x03cf:
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r2.zzw()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            return
        L_0x03de:
            if (r20 == 0) goto L_0x0435
            long r10 = r9.zza     // Catch:{ all -> 0x0a13 }
            r35.zze()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.zzbi.zzm     // Catch:{ all -> 0x0a13 }
            r7 = 0
            java.lang.Object r6 = r6.zza(r7)     // Catch:{ all -> 0x0a13 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0a13 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0a13 }
            long r6 = (long) r6     // Catch:{ all -> 0x0a13 }
            long r10 = r10 - r6
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0435
            long r10 = r10 % r12
            r3 = 1
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0416
            com.google.android.gms.measurement.internal.zzfr r3 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            long r5 = r9.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r7 = "Data loss. Too many public events logged. appId, count"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a13 }
            r3.zza(r7, r4, r5)     // Catch:{ all -> 0x0a13 }
        L_0x0416:
            r35.zzq()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0a13 }
            r11 = 16
            java.lang.String r12 = "_ev"
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r2.zzw()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            return
        L_0x0435:
            if (r21 == 0) goto L_0x0483
            long r6 = r9.zzd     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaf r10 = r35.zze()     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzl     // Catch:{ all -> 0x0a13 }
            int r10 = r10.zzb(r11, r12)     // Catch:{ all -> 0x0a13 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0a13 }
            r11 = 0
            int r10 = java.lang.Math.max(r11, r10)     // Catch:{ all -> 0x0a13 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a13 }
            long r6 = r6 - r10
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0483
            r10 = 1
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0474
            com.google.android.gms.measurement.internal.zzfr r2 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            long r4 = r9.zzd     // Catch:{ all -> 0x0a13 }
            java.lang.String r6 = "Too many error events logged. appId, count"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0a13 }
            r2.zza(r6, r3, r4)     // Catch:{ all -> 0x0a13 }
        L_0x0474:
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r2.zzw()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            return
        L_0x0483:
            com.google.android.gms.measurement.internal.zzbb r6 = r2.zzb     // Catch:{ all -> 0x0a13 }
            android.os.Bundle r6 = r6.zzb()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznd r7 = r35.zzq()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.zzc     // Catch:{ all -> 0x0a13 }
            r7.zza((android.os.Bundle) r6, (java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznd r7 = r35.zzq()     // Catch:{ all -> 0x0a13 }
            boolean r7 = r7.zzf(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r13 = "_r"
            if (r7 == 0) goto L_0x04ba
            com.google.android.gms.measurement.internal.zznd r7 = r35.zzq()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = "_dbg"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a13 }
            r7.zza((android.os.Bundle) r6, (java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznd r7 = r35.zzq()     // Catch:{ all -> 0x0a13 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a13 }
            r7.zza((android.os.Bundle) r6, (java.lang.String) r13, (java.lang.Object) r9)     // Catch:{ all -> 0x0a13 }
        L_0x04ba:
            java.lang.String r7 = "_s"
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a13 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0a13 }
            if (r7 == 0) goto L_0x04df
            com.google.android.gms.measurement.internal.zzao r7 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r7 = r7.zze(r9, r5)     // Catch:{ all -> 0x0a13 }
            if (r7 == 0) goto L_0x04df
            java.lang.Object r9 = r7.zze     // Catch:{ all -> 0x0a13 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x04df
            com.google.android.gms.measurement.internal.zznd r9 = r35.zzq()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x0a13 }
            r9.zza((android.os.Bundle) r6, (java.lang.String) r5, (java.lang.Object) r7)     // Catch:{ all -> 0x0a13 }
        L_0x04df:
            com.google.android.gms.measurement.internal.zzao r5 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            long r9 = r5.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0500
            com.google.android.gms.measurement.internal.zzfr r5 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a13 }
            r5.zza(r11, r7, r9)     // Catch:{ all -> 0x0a13 }
        L_0x0500:
            com.google.android.gms.measurement.internal.zzaz r5 = new com.google.android.gms.measurement.internal.zzaz     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r10 = r1.zzm     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a13 }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0a13 }
            long r14 = r2.zzd     // Catch:{ all -> 0x0a13 }
            r18 = 0
            r9 = r5
            r12 = r8
            r2 = r13
            r13 = r7
            r16 = r18
            r18 = r6
            r9.<init>((com.google.android.gms.measurement.internal.zzhf) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r6 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            java.lang.String r7 = r5.zzb     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzbc r6 = r6.zzd(r8, r7)     // Catch:{ all -> 0x0a13 }
            if (r6 != 0) goto L_0x0595
            com.google.android.gms.measurement.internal.zzao r6 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            long r6 = r6.zzb(r8)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaf r9 = r35.zze()     // Catch:{ all -> 0x0a13 }
            int r9 = r9.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            long r9 = (long) r9     // Catch:{ all -> 0x0a13 }
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0579
            if (r20 == 0) goto L_0x0579
            com.google.android.gms.measurement.internal.zzfr r2 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r4 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfq r4 = r4.zzk()     // Catch:{ all -> 0x0a13 }
            java.lang.String r5 = r5.zzb     // Catch:{ all -> 0x0a13 }
            java.lang.String r4 = r4.zza((java.lang.String) r5)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaf r5 = r35.zze()     // Catch:{ all -> 0x0a13 }
            int r5 = r5.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r6 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0a13 }
            r2.zza(r6, r3, r4, r5)     // Catch:{ all -> 0x0a13 }
            r35.zzq()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a13 }
            r11 = 8
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            return
        L_0x0579:
            com.google.android.gms.measurement.internal.zzbc r6 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r5.zzb     // Catch:{ all -> 0x0a13 }
            r12 = 0
            r14 = 0
            long r9 = r5.zzc     // Catch:{ all -> 0x0a13 }
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r9
            r9 = r6
            r10 = r8
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0a13 }
            goto L_0x05a3
        L_0x0595:
            com.google.android.gms.measurement.internal.zzhf r7 = r1.zzm     // Catch:{ all -> 0x0a13 }
            long r8 = r6.zzf     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaz r5 = r5.zza(r7, r8)     // Catch:{ all -> 0x0a13 }
            long r7 = r5.zzc     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzbc r6 = r6.zza(r7)     // Catch:{ all -> 0x0a13 }
        L_0x05a3:
            com.google.android.gms.measurement.internal.zzao r7 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r7.zza((com.google.android.gms.measurement.internal.zzbc) r6)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzgy r6 = r35.zzl()     // Catch:{ all -> 0x0a13 }
            r6.zzt()     // Catch:{ all -> 0x0a13 }
            r35.zzs()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r37)     // Catch:{ all -> 0x0a13 }
            java.lang.String r6 = r5.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x0a13 }
            java.lang.String r6 = r5.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0a13 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r6)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ all -> 0x0a13 }
            r7 = 1
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r6 = r6.zzg((int) r7)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = "android"
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r6 = r6.zzp(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x05e6
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a13 }
            r6.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
        L_0x05e6:
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x05f3
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0a13 }
            r6.zzd((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
        L_0x05f3:
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x0600
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0a13 }
            r6.zze((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
        L_0x0600:
            boolean r8 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0a13 }
            if (r8 == 0) goto L_0x062d
            java.lang.String r8 = r3.zzv     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x062d
            com.google.android.gms.measurement.internal.zzaf r8 = r35.zze()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzbi.zzbr     // Catch:{ all -> 0x0a13 }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r9)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x0628
            com.google.android.gms.measurement.internal.zzaf r8 = r35.zze()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzbt     // Catch:{ all -> 0x0a13 }
            boolean r8 = r8.zze(r9, r10)     // Catch:{ all -> 0x0a13 }
            if (r8 == 0) goto L_0x062d
        L_0x0628:
            java.lang.String r8 = r3.zzv     // Catch:{ all -> 0x0a13 }
            r6.zzr(r8)     // Catch:{ all -> 0x0a13 }
        L_0x062d:
            long r8 = r3.zzj     // Catch:{ all -> 0x0a13 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x063c
            long r8 = r3.zzj     // Catch:{ all -> 0x0a13 }
            int r9 = (int) r8     // Catch:{ all -> 0x0a13 }
            r6.zze((int) r9)     // Catch:{ all -> 0x0a13 }
        L_0x063c:
            long r8 = r3.zze     // Catch:{ all -> 0x0a13 }
            r6.zzf((long) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x064e
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0a13 }
            r6.zzm(r8)     // Catch:{ all -> 0x0a13 }
        L_0x064e:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a13 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r8 = r1.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzt     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r9 = com.google.android.gms.measurement.internal.zzih.zza((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r8 = r8.zza((com.google.android.gms.measurement.internal.zzih) r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r8.zze()     // Catch:{ all -> 0x0a13 }
            r6.zzg((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r6.zzt()     // Catch:{ all -> 0x0a13 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0682
            java.lang.String r9 = r3.zzp     // Catch:{ all -> 0x0a13 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 != 0) goto L_0x0682
            java.lang.String r9 = r3.zzp     // Catch:{ all -> 0x0a13 }
            r6.zza((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
        L_0x0682:
            boolean r9 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0734
            com.google.android.gms.measurement.internal.zzaf r9 = r35.zze()     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0a13 }
            boolean r9 = r9.zze(r10, r11)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0734
            r35.zzq()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            boolean r9 = com.google.android.gms.measurement.internal.zznd.zzd(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0734
            int r9 = r3.zzaa     // Catch:{ all -> 0x0a13 }
            r6.zzd((int) r9)     // Catch:{ all -> 0x0a13 }
            long r9 = r3.zzab     // Catch:{ all -> 0x0a13 }
            boolean r8 = r8.zzg()     // Catch:{ all -> 0x0a13 }
            r11 = 32
            r13 = 0
            if (r8 != 0) goto L_0x06bc
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x06bc
            r15 = -2
            long r8 = r9 & r15
            long r9 = r8 | r11
        L_0x06bc:
            r15 = 1
            int r8 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r8 != 0) goto L_0x06c4
            r8 = 1
            goto L_0x06c5
        L_0x06c4:
            r8 = 0
        L_0x06c5:
            r6.zza((boolean) r8)     // Catch:{ all -> 0x0a13 }
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0736
            com.google.android.gms.internal.measurement.zzfi$zzb$zza r8 = com.google.android.gms.internal.measurement.zzfi.zzb.zza()     // Catch:{ all -> 0x0a13 }
            long r17 = r9 & r15
            int r15 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x06d8
            r15 = 1
            goto L_0x06d9
        L_0x06d8:
            r15 = 0
        L_0x06d9:
            r8.zzc(r15)     // Catch:{ all -> 0x0a13 }
            r15 = 2
            long r15 = r15 & r9
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x06e5
            r15 = 1
            goto L_0x06e6
        L_0x06e5:
            r15 = 0
        L_0x06e6:
            r8.zze(r15)     // Catch:{ all -> 0x0a13 }
            r15 = 4
            long r15 = r15 & r9
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x06f2
            r15 = 1
            goto L_0x06f3
        L_0x06f2:
            r15 = 0
        L_0x06f3:
            r8.zzf(r15)     // Catch:{ all -> 0x0a13 }
            r15 = 8
            long r15 = r15 & r9
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x06ff
            r15 = 1
            goto L_0x0700
        L_0x06ff:
            r15 = 0
        L_0x0700:
            r8.zzg(r15)     // Catch:{ all -> 0x0a13 }
            r15 = 16
            long r15 = r15 & r9
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x070c
            r15 = 1
            goto L_0x070d
        L_0x070c:
            r15 = 0
        L_0x070d:
            r8.zzb(r15)     // Catch:{ all -> 0x0a13 }
            long r11 = r11 & r9
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0717
            r11 = 1
            goto L_0x0718
        L_0x0717:
            r11 = 0
        L_0x0718:
            r8.zza(r11)     // Catch:{ all -> 0x0a13 }
            r11 = 64
            long r9 = r9 & r11
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0724
            r9 = 1
            goto L_0x0725
        L_0x0724:
            r9 = 0
        L_0x0725:
            r8.zzd(r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzkj r8 = r8.zzab()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzix r8 = (com.google.android.gms.internal.measurement.zzix) r8     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzb r8 = (com.google.android.gms.internal.measurement.zzfi.zzb) r8     // Catch:{ all -> 0x0a13 }
            r6.zza((com.google.android.gms.internal.measurement.zzfi.zzb) r8)     // Catch:{ all -> 0x0a13 }
            goto L_0x0736
        L_0x0734:
            r13 = 0
        L_0x0736:
            long r8 = r3.zzf     // Catch:{ all -> 0x0a13 }
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0741
            long r8 = r3.zzf     // Catch:{ all -> 0x0a13 }
            r6.zzc((long) r8)     // Catch:{ all -> 0x0a13 }
        L_0x0741:
            long r8 = r3.zzr     // Catch:{ all -> 0x0a13 }
            r6.zzd((long) r8)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzmz r8 = r35.zzp()     // Catch:{ all -> 0x0a13 }
            java.util.List r8 = r8.zzu()     // Catch:{ all -> 0x0a13 }
            if (r8 == 0) goto L_0x0753
            r6.zzc((java.lang.Iterable<? extends java.lang.Integer>) r8)     // Catch:{ all -> 0x0a13 }
        L_0x0753:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a13 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r8 = r1.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzt     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r9 = com.google.android.gms.measurement.internal.zzih.zza((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzih r8 = r8.zza((com.google.android.gms.measurement.internal.zzih) r9)     // Catch:{ all -> 0x0a13 }
            boolean r9 = r8.zzg()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x07f1
            boolean r9 = r3.zzn     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x07f1
            com.google.android.gms.measurement.internal.zzls r9 = r1.zzj     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0a13 }
            android.util.Pair r9 = r9.zza((java.lang.String) r10, (com.google.android.gms.measurement.internal.zzih) r8)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x07f1
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a13 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0a13 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0a13 }
            if (r10 != 0) goto L_0x07f1
            boolean r10 = r3.zzn     // Catch:{ all -> 0x0a13 }
            if (r10 == 0) goto L_0x07f1
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0a13 }
            r6.zzq(r10)     // Catch:{ all -> 0x0a13 }
            java.lang.Object r10 = r9.second     // Catch:{ all -> 0x0a13 }
            if (r10 == 0) goto L_0x07a1
            java.lang.Object r10 = r9.second     // Catch:{ all -> 0x0a13 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0a13 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0a13 }
            r6.zzc((boolean) r10)     // Catch:{ all -> 0x0a13 }
        L_0x07a1:
            boolean r10 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0a13 }
            if (r10 == 0) goto L_0x07f1
            com.google.android.gms.measurement.internal.zzaf r10 = r35.zze()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0a13 }
            boolean r10 = r10.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r11)     // Catch:{ all -> 0x0a13 }
            if (r10 == 0) goto L_0x07f1
            java.lang.String r10 = r5.zzb     // Catch:{ all -> 0x0a13 }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x0a13 }
            if (r10 != 0) goto L_0x07f1
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = "00000000-0000-0000-0000-000000000000"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0a13 }
            if (r9 != 0) goto L_0x07f1
            com.google.android.gms.measurement.internal.zzao r9 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzd(r10)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x07f1
            boolean r9 = r9.zzan()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x07f1
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            r10 = 0
            r1.zza((java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x0a13 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0a13 }
            r9.<init>()     // Catch:{ all -> 0x0a13 }
            r11 = 1
            r9.putLong(r2, r11)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zznf r11 = r1.zzah     // Catch:{ all -> 0x0a13 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0a13 }
            r11.zza(r12, r4, r9)     // Catch:{ all -> 0x0a13 }
            goto L_0x07f2
        L_0x07f1:
            r10 = 0
        L_0x07f2:
            com.google.android.gms.measurement.internal.zzhf r4 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzba r4 = r4.zzg()     // Catch:{ all -> 0x0a13 }
            r4.zzab()     // Catch:{ all -> 0x0a13 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r6.zzi((java.lang.String) r4)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzg()     // Catch:{ all -> 0x0a13 }
            r9.zzab()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzo(r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzg()     // Catch:{ all -> 0x0a13 }
            long r11 = r9.zzg()     // Catch:{ all -> 0x0a13 }
            int r9 = (int) r11     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzi((int) r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r9.zzh()     // Catch:{ all -> 0x0a13 }
            r4.zzs(r9)     // Catch:{ all -> 0x0a13 }
            long r11 = r3.zzx     // Catch:{ all -> 0x0a13 }
            r6.zzj((long) r11)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r4 = r1.zzm     // Catch:{ all -> 0x0a13 }
            boolean r4 = r4.zzac()     // Catch:{ all -> 0x0a13 }
            if (r4 == 0) goto L_0x0846
            r6.zzr()     // Catch:{ all -> 0x0a13 }
            r4 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a13 }
            if (r9 != 0) goto L_0x0846
            r6.zzj((java.lang.String) r4)     // Catch:{ all -> 0x0a13 }
        L_0x0846:
            com.google.android.gms.measurement.internal.zzao r4 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzd(r9)     // Catch:{ all -> 0x0a13 }
            if (r4 != 0) goto L_0x08b2
            com.google.android.gms.measurement.internal.zzh r4 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a13 }
            r4.<init>(r9, r11)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r1.zza((com.google.android.gms.measurement.internal.zzih) r8)     // Catch:{ all -> 0x0a13 }
            r4.zzb((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzk     // Catch:{ all -> 0x0a13 }
            r4.zze((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzb     // Catch:{ all -> 0x0a13 }
            r4.zzf((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            boolean r9 = r8.zzg()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x087f
            com.google.android.gms.measurement.internal.zzls r9 = r1.zzj     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a13 }
            boolean r12 = r3.zzn     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r9.zza((java.lang.String) r11, (boolean) r12)     // Catch:{ all -> 0x0a13 }
            r4.zzh((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
        L_0x087f:
            r4.zzo(r13)     // Catch:{ all -> 0x0a13 }
            r4.zzp(r13)     // Catch:{ all -> 0x0a13 }
            r4.zzn(r13)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzc     // Catch:{ all -> 0x0a13 }
            r4.zzd((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            long r11 = r3.zzj     // Catch:{ all -> 0x0a13 }
            r4.zza((long) r11)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zzd     // Catch:{ all -> 0x0a13 }
            r4.zzc((java.lang.String) r9)     // Catch:{ all -> 0x0a13 }
            long r11 = r3.zze     // Catch:{ all -> 0x0a13 }
            r4.zzm(r11)     // Catch:{ all -> 0x0a13 }
            long r11 = r3.zzf     // Catch:{ all -> 0x0a13 }
            r4.zzj(r11)     // Catch:{ all -> 0x0a13 }
            boolean r9 = r3.zzh     // Catch:{ all -> 0x0a13 }
            r4.zzb((boolean) r9)     // Catch:{ all -> 0x0a13 }
            long r11 = r3.zzr     // Catch:{ all -> 0x0a13 }
            r4.zzk(r11)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r9 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r9.zza((com.google.android.gms.measurement.internal.zzh) r4)     // Catch:{ all -> 0x0a13 }
        L_0x08b2:
            boolean r8 = r8.zzh()     // Catch:{ all -> 0x0a13 }
            if (r8 == 0) goto L_0x08cf
            java.lang.String r8 = r4.zzy()     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x08cf
            java.lang.String r8 = r4.zzy()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a13 }
            r6.zzc((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
        L_0x08cf:
            java.lang.String r8 = r4.zzab()     // Catch:{ all -> 0x0a13 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a13 }
            if (r8 != 0) goto L_0x08e6
            java.lang.String r8 = r4.zzab()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a13 }
            r6.zzl((java.lang.String) r8)     // Catch:{ all -> 0x0a13 }
        L_0x08e6:
            com.google.android.gms.measurement.internal.zzao r8 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a13 }
            java.util.List r8 = r8.zzi(r9)     // Catch:{ all -> 0x0a13 }
            r12 = 0
        L_0x08f1:
            int r9 = r8.size()     // Catch:{ all -> 0x0a13 }
            if (r12 >= r9) goto L_0x0956
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r9 = com.google.android.gms.internal.measurement.zzfi.zzn.zze()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r11 = r8.get(r12)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r11 = (com.google.android.gms.measurement.internal.zzne) r11     // Catch:{ all -> 0x0a13 }
            java.lang.String r11 = r11.zzc     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r9 = r9.zza((java.lang.String) r11)     // Catch:{ all -> 0x0a13 }
            java.lang.Object r11 = r8.get(r12)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r11 = (com.google.android.gms.measurement.internal.zzne) r11     // Catch:{ all -> 0x0a13 }
            long r10 = r11.zzd     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r9 = r9.zzb((long) r10)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzmz r10 = r35.zzp()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r11 = r8.get(r12)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r11 = (com.google.android.gms.measurement.internal.zzne) r11     // Catch:{ all -> 0x0a13 }
            java.lang.Object r11 = r11.zze     // Catch:{ all -> 0x0a13 }
            r10.zza((com.google.android.gms.internal.measurement.zzfi.zzn.zza) r9, (java.lang.Object) r11)     // Catch:{ all -> 0x0a13 }
            r6.zza((com.google.android.gms.internal.measurement.zzfi.zzn.zza) r9)     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = "_sid"
            java.lang.Object r10 = r8.get(r12)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzne r10 = (com.google.android.gms.measurement.internal.zzne) r10     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r10.zzc     // Catch:{ all -> 0x0a13 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0952
            long r9 = r4.zzs()     // Catch:{ all -> 0x0a13 }
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0952
            com.google.android.gms.measurement.internal.zzmz r9 = r35.zzp()     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r3.zzv     // Catch:{ all -> 0x0a13 }
            long r9 = r9.zza((java.lang.String) r10)     // Catch:{ all -> 0x0a13 }
            long r17 = r4.zzs()     // Catch:{ all -> 0x0a13 }
            int r11 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r11 == 0) goto L_0x0952
            r6.zzp()     // Catch:{ all -> 0x0a13 }
        L_0x0952:
            int r12 = r12 + 1
            r10 = 0
            goto L_0x08f1
        L_0x0956:
            com.google.android.gms.measurement.internal.zzao r3 = r35.zzf()     // Catch:{ IOException -> 0x09cb }
            com.google.android.gms.internal.measurement.zzkj r4 = r6.zzab()     // Catch:{ IOException -> 0x09cb }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ IOException -> 0x09cb }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = (com.google.android.gms.internal.measurement.zzfi.zzj) r4     // Catch:{ IOException -> 0x09cb }
            long r3 = r3.zza((com.google.android.gms.internal.measurement.zzfi.zzj) r4)     // Catch:{ IOException -> 0x09cb }
            com.google.android.gms.measurement.internal.zzao r6 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzbb r8 = r5.zze     // Catch:{ all -> 0x0a13 }
            if (r8 == 0) goto L_0x09c1
            com.google.android.gms.measurement.internal.zzbb r8 = r5.zze     // Catch:{ all -> 0x0a13 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0a13 }
        L_0x0974:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0987
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a13 }
            boolean r9 = r2.equals(r9)     // Catch:{ all -> 0x0a13 }
            if (r9 == 0) goto L_0x0974
            goto L_0x09c2
        L_0x0987:
            com.google.android.gms.measurement.internal.zzgp r2 = r35.zzi()     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0a13 }
            java.lang.String r9 = r5.zzb     // Catch:{ all -> 0x0a13 }
            boolean r2 = r2.zzc(r8, r9)     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r26 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            long r27 = r35.zzx()     // Catch:{ all -> 0x0a13 }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0a13 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r29 = r8
            com.google.android.gms.measurement.internal.zzap r8 = r26.zza(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0a13 }
            if (r2 == 0) goto L_0x09c1
            long r8 = r8.zze     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzaf r2 = r35.zze()     // Catch:{ all -> 0x0a13 }
            java.lang.String r10 = r5.zza     // Catch:{ all -> 0x0a13 }
            int r2 = r2.zze(r10)     // Catch:{ all -> 0x0a13 }
            long r10 = (long) r2     // Catch:{ all -> 0x0a13 }
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x09c1
            goto L_0x09c2
        L_0x09c1:
            r7 = 0
        L_0x09c2:
            boolean r2 = r6.zza((com.google.android.gms.measurement.internal.zzaz) r5, (long) r3, (boolean) r7)     // Catch:{ all -> 0x0a13 }
            if (r2 == 0) goto L_0x09e2
            r1.zzp = r13     // Catch:{ all -> 0x0a13 }
            goto L_0x09e2
        L_0x09cb:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzfr r3 = r35.zzj()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0a13 }
            java.lang.String r4 = r6.zzr()     // Catch:{ all -> 0x0a13 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r4)     // Catch:{ all -> 0x0a13 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            r3.zza(r5, r4, r2)     // Catch:{ all -> 0x0a13 }
        L_0x09e2:
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()     // Catch:{ all -> 0x0a13 }
            r2.zzw()     // Catch:{ all -> 0x0a13 }
            com.google.android.gms.measurement.internal.zzao r2 = r35.zzf()
            r2.zzu()
            r35.zzab()
            com.google.android.gms.measurement.internal.zzfr r2 = r35.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzp()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zza(r4, r3)
            return
        L_0x0a13:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzao r3 = r35.zzf()
            r3.zzu()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzc(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzo):void");
    }

    private static boolean zze(zzo zzo2) {
        return !TextUtils.isEmpty(zzo2.zzb) || !TextUtils.isEmpty(zzo2.zzp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x023e A[SYNTHETIC, Splitter:B:123:0x023e] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0245 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0253 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03d4 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03d6 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03d9 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03da A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05b9 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0684 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x06d0 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0b53 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0b68 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0b6d A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0b92 A[Catch:{ IOException -> 0x0205, all -> 0x0ef6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0ede A[SYNTHETIC, Splitter:B:551:0x0ede] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0ef2 A[SYNTHETIC, Splitter:B:558:0x0ef2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_dbg"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.zzao r4 = r41.zzf()
            r4.zzp()
            com.google.android.gms.measurement.internal.zzmp$zza r4 = new com.google.android.gms.measurement.internal.zzmp$zza     // Catch:{ all -> 0x0ef6 }
            r5 = 0
            r4.<init>()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r6 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            long r7 = r1.zzab     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0ef6 }
            r6.zzt()     // Catch:{ all -> 0x0ef6 }
            r6.zzak()     // Catch:{ all -> 0x0ef6 }
            r10 = -1
            r12 = 2
            r13 = 0
            r14 = 1
            android.database.sqlite.SQLiteDatabase r15 = r6.e_()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r17 = ""
            if (r16 == 0) goto L_0x008d
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x004b
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0046 }
            java.lang.String r18 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0046 }
            r9[r13] = r18     // Catch:{ SQLiteException -> 0x0046 }
            java.lang.String r18 = java.lang.String.valueOf(r43)     // Catch:{ SQLiteException -> 0x0046 }
            r9[r14] = r18     // Catch:{ SQLiteException -> 0x0046 }
            goto L_0x0053
        L_0x0046:
            r0 = move-exception
            r7 = r0
            r9 = r5
            goto L_0x022b
        L_0x004b:
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r18 = java.lang.String.valueOf(r43)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r9[r13] = r18     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
        L_0x0053:
            if (r16 == 0) goto L_0x0057
            java.lang.String r17 = "rowid <= ? and "
        L_0x0057:
            r5 = r17
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r10 = "select app_id, metadata_fingerprint from raw_events where "
            r12.<init>(r10)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = r12.toString()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021e }
            if (r9 != 0) goto L_0x007d
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x007d:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x021e }
            java.lang.String r10 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x0089 }
            r5.close()     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x00d6
        L_0x0089:
            r0 = move-exception
            r7 = r0
            goto L_0x022b
        L_0x008d:
            r9 = r10
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x009f
            r9 = 2
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r9 = 0
            r10[r13] = r9     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r10[r14] = r9     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            goto L_0x00a4
        L_0x009f:
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[]{r9}     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
        L_0x00a4:
            if (r5 == 0) goto L_0x00a8
            java.lang.String r17 = " and rowid <= ?"
        L_0x00a8:
            r5 = r17
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r9.<init>(r11)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r9.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = " order by rowid limit 1;"
            r9.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = r9.toString()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            android.database.Cursor r5 = r15.rawQuery(r5, r10)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021e }
            if (r9 != 0) goto L_0x00ce
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x00ce:
            java.lang.String r10 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x021e }
            r5.close()     // Catch:{ SQLiteException -> 0x021e }
            r9 = 0
        L_0x00d6:
            java.lang.String r11 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r11}     // Catch:{ SQLiteException -> 0x0089 }
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0089 }
            r12[r13] = r9     // Catch:{ SQLiteException -> 0x0089 }
            r12[r14] = r10     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "2"
            r11 = r15
            r15 = r11
            r19 = r12
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0089 }
            boolean r12 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r12 != 0) goto L_0x0115
            com.google.android.gms.measurement.internal.zzfr r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x0089 }
            r7.zza(r8, r10)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x0115:
            byte[] r12 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r15 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzkm r12 = com.google.android.gms.measurement.internal.zzmz.zza(r15, (byte[]) r12)     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r12 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r12     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzkj r12 = r12.zzab()     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzix r12 = (com.google.android.gms.internal.measurement.zzix) r12     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = (com.google.android.gms.internal.measurement.zzfi.zzj) r12     // Catch:{ IOException -> 0x0205 }
            boolean r15 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r15 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.zzfr r15 = r6.zzj()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzft r15 = r15.zzu()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r13 = "Get multiple raw event metadata records, expected one. appId"
            r15.zza(r13, r14)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x0142:
            r5.close()     // Catch:{ SQLiteException -> 0x0089 }
            r4.zza(r12)     // Catch:{ SQLiteException -> 0x0089 }
            r12 = -1
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0165
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0089 }
            r12 = 0
            r13[r12] = r9     // Catch:{ SQLiteException -> 0x0089 }
            r12 = 1
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0089 }
            r8 = 2
            r13[r8] = r7     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r18 = r7
            r19 = r13
            goto L_0x0174
        L_0x0165:
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0089 }
            r7 = 0
            r8[r7] = r9     // Catch:{ SQLiteException -> 0x0089 }
            r7 = 1
            r8[r7] = r10     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r18 = r7
            r19 = r8
        L_0x0174:
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r10 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r17 = new java.lang.String[]{r7, r8, r10, r12}     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r16 = "raw_events"
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            r23 = 0
            r15 = r11
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0089 }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r7 != 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.zzfr r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzu()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r10 = "Raw event data disappeared while in transaction. appId"
            r7.zza(r10, r8)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x01ad:
            r7 = 0
            long r10 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x0089 }
            r7 = 3
            byte[] r8 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r7 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x01e6 }
            com.google.android.gms.internal.measurement.zzkm r7 = com.google.android.gms.measurement.internal.zzmz.zza(r7, (byte[]) r8)     // Catch:{ IOException -> 0x01e6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r7 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r7     // Catch:{ IOException -> 0x01e6 }
            r8 = 1
            java.lang.String r12 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r8 = r7.zza((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0089 }
            r12 = 2
            long r13 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x0089 }
            r8.zzb((long) r13)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzkj r7 = r7.zzab()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzix r7 = (com.google.android.gms.internal.measurement.zzix) r7     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.internal.measurement.zzfi$zze r7 = (com.google.android.gms.internal.measurement.zzfi.zze) r7     // Catch:{ SQLiteException -> 0x0089 }
            boolean r7 = r4.zza(r10, r7)     // Catch:{ SQLiteException -> 0x0089 }
            if (r7 != 0) goto L_0x01f9
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x01e6:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x0089 }
            r8.zza(r10, r11, r7)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x01f9:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r7 != 0) goto L_0x01ad
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x0205:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r11 = "Data loss. Failed to merge raw event metadata. appId"
            r8.zza(r11, r10, r7)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
            goto L_0x0241
        L_0x021e:
            r0 = move-exception
            r7 = r0
            goto L_0x022a
        L_0x0221:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0ef0
        L_0x0226:
            r0 = move-exception
            r5 = r0
            r7 = r5
            r5 = 0
        L_0x022a:
            r9 = 0
        L_0x022b:
            com.google.android.gms.measurement.internal.zzfr r6 = r6.zzj()     // Catch:{ all -> 0x0eee }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzg()     // Catch:{ all -> 0x0eee }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ all -> 0x0eee }
            r6.zza(r8, r9, r7)     // Catch:{ all -> 0x0eee }
            if (r5 == 0) goto L_0x0241
            r5.close()     // Catch:{ all -> 0x0ef6 }
        L_0x0241:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r5 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0250
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r5 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x024e
            goto L_0x0250
        L_0x024e:
            r5 = 0
            goto L_0x0251
        L_0x0250:
            r5 = 1
        L_0x0251:
            if (r5 != 0) goto L_0x0ede
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r5 = r5.zzby()     // Catch:{ all -> 0x0ef6 }
            r6 = r5
            com.google.android.gms.internal.measurement.zzix$zzb r6 = (com.google.android.gms.internal.measurement.zzix.zzb) r6     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r5 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r5     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r5 = r5.zzi()     // Catch:{ all -> 0x0ef6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
        L_0x0269:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            int r14 = r14.size()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r15 = "_fr"
            java.lang.String r6 = "_et"
            r16 = r11
            java.lang.String r11 = "_e"
            r17 = r2
            java.lang.String r2 = "_c"
            r44 = r5
            r18 = r6
            if (r9 >= r14) goto L_0x074c
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r14 = r14.get(r9)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r14 = (com.google.android.gms.internal.measurement.zzfi.zze) r14     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r14 = r14.zzby()     // Catch:{ all -> 0x0ef6 }
            r19 = r14
            com.google.android.gms.internal.measurement.zzix$zzb r19 = (com.google.android.gms.internal.measurement.zzix.zzb) r19     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r14 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r14     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzgp r5 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ef6 }
            r21 = r10
            java.lang.String r10 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.zzd(r6, r10)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "_err"
            if (r5 == 0) goto L_0x0329
            com.google.android.gms.measurement.internal.zzfr r2 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzu()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzhf r10 = r1.zzm     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfq r10 = r10.zzk()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = "Dropping blocked raw event. appId"
            r2.zza(r11, r5, r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzgp r2 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r2.zzm(r5)     // Catch:{ all -> 0x0ef6 }
            if (r2 != 0) goto L_0x02f3
            com.google.android.gms.measurement.internal.zzgp r2 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r2.zzo(r5)     // Catch:{ all -> 0x0ef6 }
            if (r2 == 0) goto L_0x02f1
            goto L_0x02f3
        L_0x02f1:
            r2 = 0
            goto L_0x02f4
        L_0x02f3:
            r2 = 1
        L_0x02f4:
            if (r2 != 0) goto L_0x031a
            java.lang.String r2 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x0ef6 }
            if (r2 != 0) goto L_0x031a
            r41.zzq()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zznf r2 = r1.zzah     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r25 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r28 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            r26 = 11
            java.lang.String r27 = "_ev"
            r29 = 0
            r24 = r2
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r24, (java.lang.String) r25, (int) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29)     // Catch:{ all -> 0x0ef6 }
        L_0x031a:
            r23 = r3
            r25 = r8
            r8 = r9
            r11 = r16
            r10 = r21
            r5 = -1
            r9 = 3
            r3 = r44
            goto L_0x0740
        L_0x0329:
            java.lang.String r5 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = com.google.android.gms.measurement.internal.zzii.zza(r3)     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.equals(r10)     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x039b
            r14.zza((java.lang.String) r3)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzp()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = "Renaming ad_impression to _ai"
            r5.zza(r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            r10 = 5
            boolean r5 = r5.zza((int) r10)     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x039b
            r5 = 0
        L_0x0353:
            int r10 = r14.zza()     // Catch:{ all -> 0x0ef6 }
            if (r5 >= r10) goto L_0x039b
            java.lang.String r10 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfi$zzg r22 = r14.zzb((int) r5)     // Catch:{ all -> 0x0ef6 }
            r23 = r3
            java.lang.String r3 = r22.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0ef6 }
            if (r3 == 0) goto L_0x0396
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = r14.zzb((int) r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r3 = r3.zzh()     // Catch:{ all -> 0x0ef6 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ef6 }
            if (r3 != 0) goto L_0x0396
            java.lang.String r3 = "admob"
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = r14.zzb((int) r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zzh()     // Catch:{ all -> 0x0ef6 }
            boolean r3 = r3.equalsIgnoreCase(r10)     // Catch:{ all -> 0x0ef6 }
            if (r3 == 0) goto L_0x0396
            com.google.android.gms.measurement.internal.zzfr r3 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzv()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = "AdMob ad impression logged from app. Potentially duplicative."
            r3.zza(r10)     // Catch:{ all -> 0x0ef6 }
        L_0x0396:
            int r5 = r5 + 1
            r3 = r23
            goto L_0x0353
        L_0x039b:
            r23 = r3
            com.google.android.gms.measurement.internal.zzgp r3 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r3 = r3.zzc(r5, r10)     // Catch:{ all -> 0x0ef6 }
            if (r3 != 0) goto L_0x03e2
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch:{ all -> 0x0ef6 }
            int r10 = r5.hashCode()     // Catch:{ all -> 0x0ef6 }
            r22 = r9
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r10 == r9) goto L_0x03c7
            goto L_0x03d1
        L_0x03c7:
            java.lang.String r9 = "_ui"
            boolean r5 = r5.equals(r9)     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x03d1
            r5 = 0
            goto L_0x03d2
        L_0x03d1:
            r5 = -1
        L_0x03d2:
            if (r5 == 0) goto L_0x03d6
            r5 = 0
            goto L_0x03d7
        L_0x03d6:
            r5 = 1
        L_0x03d7:
            if (r5 == 0) goto L_0x03da
            goto L_0x03e4
        L_0x03da:
            r25 = r8
            r26 = r12
            r24 = r13
            goto L_0x05b7
        L_0x03e2:
            r22 = r9
        L_0x03e4:
            r24 = r13
            r5 = 0
            r9 = 0
            r10 = 0
        L_0x03e9:
            int r13 = r14.zza()     // Catch:{ all -> 0x0ef6 }
            r25 = r8
            java.lang.String r8 = "_r"
            if (r10 >= r13) goto L_0x0459
            com.google.android.gms.internal.measurement.zzfi$zzg r13 = r14.zzb((int) r10)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r13 = r2.equals(r13)     // Catch:{ all -> 0x0ef6 }
            if (r13 == 0) goto L_0x0423
            com.google.android.gms.internal.measurement.zzfi$zzg r5 = r14.zzb((int) r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r5 = r5.zzby()     // Catch:{ all -> 0x0ef6 }
            r8 = r5
            com.google.android.gms.internal.measurement.zzix$zzb r8 = (com.google.android.gms.internal.measurement.zzix.zzb) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r5     // Catch:{ all -> 0x0ef6 }
            r26 = r12
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = r5.zza((long) r12)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r5 = r5.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r5 = (com.google.android.gms.internal.measurement.zzfi.zzg) r5     // Catch:{ all -> 0x0ef6 }
            r14.zza((int) r10, (com.google.android.gms.internal.measurement.zzfi.zzg) r5)     // Catch:{ all -> 0x0ef6 }
            r5 = 1
            goto L_0x0452
        L_0x0423:
            r26 = r12
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r10)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0ef6 }
            if (r8 == 0) goto L_0x0452
            com.google.android.gms.internal.measurement.zzfi$zzg r8 = r14.zzb((int) r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r8 = r8.zzby()     // Catch:{ all -> 0x0ef6 }
            r9 = r8
            com.google.android.gms.internal.measurement.zzix$zzb r9 = (com.google.android.gms.internal.measurement.zzix.zzb) r9     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r8 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r8     // Catch:{ all -> 0x0ef6 }
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r8 = r8.zza((long) r12)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r8 = r8.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r8 = (com.google.android.gms.internal.measurement.zzix) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r8 = (com.google.android.gms.internal.measurement.zzfi.zzg) r8     // Catch:{ all -> 0x0ef6 }
            r14.zza((int) r10, (com.google.android.gms.internal.measurement.zzfi.zzg) r8)     // Catch:{ all -> 0x0ef6 }
            r9 = 1
        L_0x0452:
            int r10 = r10 + 1
            r8 = r25
            r12 = r26
            goto L_0x03e9
        L_0x0459:
            r26 = r12
            if (r5 != 0) goto L_0x048b
            if (r3 == 0) goto L_0x048b
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzhf r10 = r1.zzm     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfq r10 = r10.zzk()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zza((java.lang.String) r12)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = "Marking event as conversion"
            r5.zza(r12, r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = r5.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ef6 }
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = r5.zza((long) r12)     // Catch:{ all -> 0x0ef6 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r5)     // Catch:{ all -> 0x0ef6 }
        L_0x048b:
            if (r9 != 0) goto L_0x04b9
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfq r9 = r9.zzk()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = r9.zza((java.lang.String) r10)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = "Marking event as real-time"
            r5.zza(r10, r9)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = r5.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            r9 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = r5.zza((long) r9)     // Catch:{ all -> 0x0ef6 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r5)     // Catch:{ all -> 0x0ef6 }
        L_0x04b9:
            com.google.android.gms.measurement.internal.zzao r27 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            long r28 = r41.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r30 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 1
            com.google.android.gms.measurement.internal.zzap r5 = r27.zza(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ef6 }
            long r9 = r5.zze     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzaf r5 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ef6 }
            int r5 = r5.zze(r12)     // Catch:{ all -> 0x0ef6 }
            long r12 = (long) r5     // Catch:{ all -> 0x0ef6 }
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x04ee
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            goto L_0x04f0
        L_0x04ee:
            r16 = 1
        L_0x04f0:
            java.lang.String r5 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r5 = com.google.android.gms.measurement.internal.zznd.zzh(r5)     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x05b7
            if (r3 == 0) goto L_0x05b7
            com.google.android.gms.measurement.internal.zzao r27 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            long r28 = r41.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r30 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            r31 = 0
            r32 = 0
            r33 = 1
            r34 = 0
            r35 = 0
            com.google.android.gms.measurement.internal.zzap r5 = r27.zza(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ef6 }
            long r8 = r5.zzc     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzaf r5 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzn     // Catch:{ all -> 0x0ef6 }
            int r5 = r5.zzb(r10, r12)     // Catch:{ all -> 0x0ef6 }
            long r12 = (long) r5     // Catch:{ all -> 0x0ef6 }
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x05b7
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = "Too many conversions. Not logging as conversion. appId"
            r5.zza(r9, r8)     // Catch:{ all -> 0x0ef6 }
            r5 = -1
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x054a:
            int r12 = r14.zza()     // Catch:{ all -> 0x0ef6 }
            if (r10 >= r12) goto L_0x0578
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r10)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r13 = r12.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r13 = r2.equals(r13)     // Catch:{ all -> 0x0ef6 }
            if (r13 == 0) goto L_0x056a
            com.google.android.gms.internal.measurement.zzix$zzb r5 = r12.zzby()     // Catch:{ all -> 0x0ef6 }
            r8 = r5
            com.google.android.gms.internal.measurement.zzix$zzb r8 = (com.google.android.gms.internal.measurement.zzix.zzb) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r5 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r5     // Catch:{ all -> 0x0ef6 }
            r8 = r5
            r5 = r10
            goto L_0x0575
        L_0x056a:
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r12 = r6.equals(r12)     // Catch:{ all -> 0x0ef6 }
            if (r12 == 0) goto L_0x0575
            r9 = 1
        L_0x0575:
            int r10 = r10 + 1
            goto L_0x054a
        L_0x0578:
            if (r9 == 0) goto L_0x0580
            if (r8 == 0) goto L_0x0580
            r14.zza((int) r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x05b7
        L_0x0580:
            if (r8 == 0) goto L_0x05a0
            java.lang.Object r8 = r8.clone()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r8 = (com.google.android.gms.internal.measurement.zzix.zzb) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r8 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r8.zza((java.lang.String) r6)     // Catch:{ all -> 0x0ef6 }
            r8 = 10
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r8)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ef6 }
            r14.zza((int) r5, (com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ef6 }
            goto L_0x05b7
        L_0x05a0:
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r6)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = "Did not find conversion parameter. appId"
            r5.zza(r8, r6)     // Catch:{ all -> 0x0ef6 }
        L_0x05b7:
            if (r3 == 0) goto L_0x0676
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0ef6 }
            java.util.List r5 = r14.zzf()     // Catch:{ all -> 0x0ef6 }
            r3.<init>(r5)     // Catch:{ all -> 0x0ef6 }
            r5 = 0
            r6 = -1
            r8 = -1
        L_0x05c5:
            int r9 = r3.size()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = "currency"
            java.lang.String r12 = "value"
            if (r5 >= r9) goto L_0x05f5
            java.lang.Object r9 = r3.get(r5)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r9 = (com.google.android.gms.internal.measurement.zzfi.zzg) r9     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = r9.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0ef6 }
            if (r9 == 0) goto L_0x05e1
            r6 = r5
            goto L_0x05f2
        L_0x05e1:
            java.lang.Object r9 = r3.get(r5)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r9 = (com.google.android.gms.internal.measurement.zzfi.zzg) r9     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = r9.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x0ef6 }
            if (r9 == 0) goto L_0x05f2
            r8 = r5
        L_0x05f2:
            int r5 = r5 + 1
            goto L_0x05c5
        L_0x05f5:
            r5 = -1
            if (r6 == r5) goto L_0x0677
            java.lang.Object r5 = r3.get(r6)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r5 = (com.google.android.gms.internal.measurement.zzfi.zzg) r5     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.zzl()     // Catch:{ all -> 0x0ef6 }
            if (r5 != 0) goto L_0x0629
            java.lang.Object r5 = r3.get(r6)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r5 = (com.google.android.gms.internal.measurement.zzfi.zzg) r5     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.zzj()     // Catch:{ all -> 0x0ef6 }
            if (r5 != 0) goto L_0x0629
            com.google.android.gms.measurement.internal.zzfr r3 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzv()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r3.zza(r5)     // Catch:{ all -> 0x0ef6 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ef6 }
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r2)     // Catch:{ all -> 0x0ef6 }
            r2 = 18
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (int) r2, (java.lang.String) r12)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0676
        L_0x0629:
            r5 = -1
            if (r8 != r5) goto L_0x062f
            r3 = 1
            r9 = 3
            goto L_0x065b
        L_0x062f:
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3     // Catch:{ all -> 0x0ef6 }
            java.lang.String r3 = r3.zzh()     // Catch:{ all -> 0x0ef6 }
            int r8 = r3.length()     // Catch:{ all -> 0x0ef6 }
            r9 = 3
            if (r8 == r9) goto L_0x0641
            goto L_0x0652
        L_0x0641:
            r8 = 0
        L_0x0642:
            int r12 = r3.length()     // Catch:{ all -> 0x0ef6 }
            if (r8 >= r12) goto L_0x065a
            int r12 = r3.codePointAt(r8)     // Catch:{ all -> 0x0ef6 }
            boolean r13 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0ef6 }
            if (r13 != 0) goto L_0x0654
        L_0x0652:
            r3 = 1
            goto L_0x065b
        L_0x0654:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0ef6 }
            int r8 = r8 + r12
            goto L_0x0642
        L_0x065a:
            r3 = 0
        L_0x065b:
            if (r3 == 0) goto L_0x0678
            com.google.android.gms.measurement.internal.zzfr r3 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzv()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r3.zza(r8)     // Catch:{ all -> 0x0ef6 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ef6 }
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r2)     // Catch:{ all -> 0x0ef6 }
            r2 = 19
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (int) r2, (java.lang.String) r10)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0678
        L_0x0676:
            r5 = -1
        L_0x0677:
            r9 = 3
        L_0x0678:
            java.lang.String r2 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0ef6 }
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06d0
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0ef6 }
            if (r2 != 0) goto L_0x06cb
            if (r7 == 0) goto L_0x06c0
            long r2 = r7.zzc()     // Catch:{ all -> 0x0ef6 }
            long r12 = r14.zzc()     // Catch:{ all -> 0x0ef6 }
            long r2 = r2 - r12
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0ef6 }
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x06c0
            java.lang.Object r2 = r7.clone()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ef6 }
            boolean r3 = r1.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ef6 }
            if (r3 == 0) goto L_0x06c0
            r3 = r44
            r6 = r26
            r3.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ef6 }
            r8 = r24
            goto L_0x0719
        L_0x06c0:
            r3 = r44
            r6 = r26
            r12 = r6
            r25 = r14
            r13 = r21
            goto L_0x072a
        L_0x06cb:
            r3 = r44
            r6 = r26
            goto L_0x0726
        L_0x06d0:
            r3 = r44
            r6 = r26
            java.lang.String r2 = "_vs"
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0ef6 }
            if (r2 == 0) goto L_0x0726
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ef6 }
            r8 = r18
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r2, (java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            if (r2 != 0) goto L_0x0726
            if (r25 == 0) goto L_0x071f
            long r7 = r25.zzc()     // Catch:{ all -> 0x0ef6 }
            long r12 = r14.zzc()     // Catch:{ all -> 0x0ef6 }
            long r7 = r7 - r12
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0ef6 }
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x071f
            java.lang.Object r2 = r25.clone()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ef6 }
            boolean r7 = r1.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r2, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r14)     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x071f
            r8 = r24
            r3.zza((int) r8, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ef6 }
        L_0x0719:
            r12 = r6
            r13 = r8
            r7 = 0
            r25 = 0
            goto L_0x072a
        L_0x071f:
            r8 = r24
            r13 = r8
            r7 = r14
            r12 = r21
            goto L_0x072a
        L_0x0726:
            r8 = r24
            r12 = r6
            r13 = r8
        L_0x072a:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r2 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r6 = r14.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r6 = (com.google.android.gms.internal.measurement.zzfi.zze) r6     // Catch:{ all -> 0x0ef6 }
            r8 = r22
            r2.set(r8, r6)     // Catch:{ all -> 0x0ef6 }
            int r10 = r21 + 1
            r3.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14)     // Catch:{ all -> 0x0ef6 }
            r11 = r16
        L_0x0740:
            int r2 = r8 + 1
            r9 = r2
            r5 = r3
            r2 = r17
            r3 = r23
            r8 = r25
            goto L_0x0269
        L_0x074c:
            r3 = r44
            r21 = r10
            r8 = r18
            r5 = 0
            r12 = r5
            r7 = 0
        L_0x0756:
            if (r7 >= r10) goto L_0x07a3
            com.google.android.gms.internal.measurement.zzfi$zze r9 = r3.zza((int) r7)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r14 = r9.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x0ef6 }
            if (r14 == 0) goto L_0x0777
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r14 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r9, (java.lang.String) r15)     // Catch:{ all -> 0x0ef6 }
            if (r14 == 0) goto L_0x0777
            r3.zzb((int) r7)     // Catch:{ all -> 0x0ef6 }
            int r10 = r10 + -1
            int r7 = r7 + -1
            goto L_0x07a0
        L_0x0777:
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r9 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            if (r9 == 0) goto L_0x07a0
            boolean r14 = r9.zzl()     // Catch:{ all -> 0x0ef6 }
            if (r14 == 0) goto L_0x078f
            long r21 = r9.zzd()     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0790
        L_0x078f:
            r9 = 0
        L_0x0790:
            if (r9 == 0) goto L_0x07a0
            long r21 = r9.longValue()     // Catch:{ all -> 0x0ef6 }
            int r14 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x07a0
            long r21 = r9.longValue()     // Catch:{ all -> 0x0ef6 }
            long r12 = r12 + r21
        L_0x07a0:
            r9 = 1
            int r7 = r7 + r9
            goto L_0x0756
        L_0x07a3:
            r7 = 0
            r1.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3, (long) r12, (boolean) r7)     // Catch:{ all -> 0x0ef6 }
            java.util.List r7 = r3.zzw()     // Catch:{ all -> 0x0ef6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0ef6 }
        L_0x07af:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0ef6 }
            if (r8 == 0) goto L_0x07c9
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r8 = (com.google.android.gms.internal.measurement.zzfi.zze) r8     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = "_s"
            java.lang.String r8 = r8.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x0ef6 }
            if (r8 == 0) goto L_0x07af
            r7 = 1
            goto L_0x07ca
        L_0x07c9:
            r7 = 0
        L_0x07ca:
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x07d9
            com.google.android.gms.measurement.internal.zzao r7 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = r3.zzr()     // Catch:{ all -> 0x0ef6 }
            r7.zzh(r9, r8)     // Catch:{ all -> 0x0ef6 }
        L_0x07d9:
            java.lang.String r7 = "_sid"
            int r7 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3, (java.lang.String) r7)     // Catch:{ all -> 0x0ef6 }
            if (r7 < 0) goto L_0x07e3
            r7 = 1
            goto L_0x07e4
        L_0x07e3:
            r7 = 0
        L_0x07e4:
            if (r7 == 0) goto L_0x07eb
            r7 = 1
            r1.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3, (long) r12, (boolean) r7)     // Catch:{ all -> 0x0ef6 }
            goto L_0x080b
        L_0x07eb:
            int r7 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3, (java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            if (r7 < 0) goto L_0x080b
            r3.zzc((int) r7)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfr r7 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = "Session engagement user property is in the bundle without session ID. appId"
            r7.zza(r9, r8)     // Catch:{ all -> 0x0ef6 }
        L_0x080b:
            com.google.android.gms.measurement.internal.zzmz r7 = r41.zzp()     // Catch:{ all -> 0x0ef6 }
            r7.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3)     // Catch:{ all -> 0x0ef6 }
            boolean r7 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x0859
            com.google.android.gms.measurement.internal.zzaf r7 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzbi.zzcm     // Catch:{ all -> 0x0ef6 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r8)     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x0859
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzgy r8 = r41.zzl()     // Catch:{ all -> 0x0ef6 }
            r8.zzt()     // Catch:{ all -> 0x0ef6 }
            r41.zzs()     // Catch:{ all -> 0x0ef6 }
            boolean r8 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ef6 }
            if (r8 == 0) goto L_0x0859
            com.google.android.gms.measurement.internal.zzao r8 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzh r8 = r8.zzd(r7)     // Catch:{ all -> 0x0ef6 }
            if (r8 != 0) goto L_0x0856
            com.google.android.gms.measurement.internal.zzfr r8 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0ef6 }
            r8.zza(r9, r7)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0859
        L_0x0856:
            r1.zza((com.google.android.gms.measurement.internal.zzh) r8, (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r3)     // Catch:{ all -> 0x0ef6 }
        L_0x0859:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r7 = r3.zzi((long) r7)     // Catch:{ all -> 0x0ef6 }
            r8 = -9223372036854775808
            r7.zze((long) r8)     // Catch:{ all -> 0x0ef6 }
            r7 = 0
        L_0x0868:
            int r8 = r3.zza()     // Catch:{ all -> 0x0ef6 }
            if (r7 >= r8) goto L_0x089b
            com.google.android.gms.internal.measurement.zzfi$zze r8 = r3.zza((int) r7)     // Catch:{ all -> 0x0ef6 }
            long r9 = r8.zzd()     // Catch:{ all -> 0x0ef6 }
            long r11 = r3.zzd()     // Catch:{ all -> 0x0ef6 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0885
            long r9 = r8.zzd()     // Catch:{ all -> 0x0ef6 }
            r3.zzi((long) r9)     // Catch:{ all -> 0x0ef6 }
        L_0x0885:
            long r9 = r8.zzd()     // Catch:{ all -> 0x0ef6 }
            long r11 = r3.zzc()     // Catch:{ all -> 0x0ef6 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0898
            long r8 = r8.zzd()     // Catch:{ all -> 0x0ef6 }
            r3.zze((long) r8)     // Catch:{ all -> 0x0ef6 }
        L_0x0898:
            int r7 = r7 + 1
            goto L_0x0868
        L_0x089b:
            r3.zzq()     // Catch:{ all -> 0x0ef6 }
            boolean r7 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x09d0
            com.google.android.gms.measurement.internal.zzaf r7 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0ef6 }
            boolean r7 = r7.zze(r8, r9)     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x09d0
            r41.zzq()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ef6 }
            boolean r7 = com.google.android.gms.measurement.internal.zznd.zzd(r7)     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x09d0
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzih r7 = r1.zzb((java.lang.String) r7)     // Catch:{ all -> 0x0ef6 }
            boolean r7 = r7.zzg()     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x09d0
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r4.zza     // Catch:{ all -> 0x0ef6 }
            boolean r7 = r7.zzar()     // Catch:{ all -> 0x0ef6 }
            if (r7 == 0) goto L_0x09d0
            r7 = 0
        L_0x08de:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r8 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            int r8 = r8.size()     // Catch:{ all -> 0x0ef6 }
            if (r7 >= r8) goto L_0x09d0
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r8 = r4.zzc     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r8 = (com.google.android.gms.internal.measurement.zzfi.zze) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r8 = r8.zzby()     // Catch:{ all -> 0x0ef6 }
            r9 = r8
            com.google.android.gms.internal.measurement.zzix$zzb r9 = (com.google.android.gms.internal.measurement.zzix.zzb) r9     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r8 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8     // Catch:{ all -> 0x0ef6 }
            java.util.List r9 = r8.zzf()     // Catch:{ all -> 0x0ef6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0ef6 }
        L_0x08ff:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0ef6 }
            if (r10 == 0) goto L_0x0917
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0ef6 }
            boolean r10 = r2.equals(r10)     // Catch:{ all -> 0x0ef6 }
            if (r10 == 0) goto L_0x08ff
            r9 = 1
            goto L_0x0918
        L_0x0917:
            r9 = 0
        L_0x0918:
            if (r9 == 0) goto L_0x09cc
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = r4.zza     // Catch:{ all -> 0x0ef6 }
            int r9 = r9.zza()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzaf r10 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzau     // Catch:{ all -> 0x0ef6 }
            int r10 = r10.zzb(r11, r12)     // Catch:{ all -> 0x0ef6 }
            if (r9 < r10) goto L_0x09c1
            com.google.android.gms.measurement.internal.zzaf r9 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzch     // Catch:{ all -> 0x0ef6 }
            boolean r9 = r9.zze(r10, r11)     // Catch:{ all -> 0x0ef6 }
            if (r9 == 0) goto L_0x0966
            com.google.android.gms.measurement.internal.zznd r9 = r41.zzq()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r9 = r9.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = "_tu"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = r10.zzb(r9)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r10 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r10 = (com.google.android.gms.internal.measurement.zzix) r10     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ef6 }
            r8.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r10)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0967
        L_0x0966:
            r9 = 0
        L_0x0967:
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = "_tr"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ef6 }
            r11 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r10 = r10.zza((long) r11)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r10 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r10 = (com.google.android.gms.internal.measurement.zzix) r10     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ef6 }
            r8.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r10)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmz r10 = r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r4.zza     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmh r9 = r10.zza((java.lang.String) r11, (com.google.android.gms.internal.measurement.zzfi.zzj) r12, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0ef6 }
            if (r9 == 0) goto L_0x09c1
            com.google.android.gms.measurement.internal.zzfr r10 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = r9.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r13 = "Generated trigger URI. appId, uri"
            r10.zza(r13, r11, r12)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r10 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ef6 }
            r10.zza((java.lang.String) r11, (com.google.android.gms.measurement.internal.zzmh) r9)     // Catch:{ all -> 0x0ef6 }
            java.util.Set<java.lang.String> r9 = r1.zzr     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ef6 }
            r9.add(r10)     // Catch:{ all -> 0x0ef6 }
        L_0x09c1:
            com.google.android.gms.internal.measurement.zzkj r8 = r8.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r8 = (com.google.android.gms.internal.measurement.zzix) r8     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r8 = (com.google.android.gms.internal.measurement.zzfi.zze) r8     // Catch:{ all -> 0x0ef6 }
            r3.zza((int) r7, (com.google.android.gms.internal.measurement.zzfi.zze) r8)     // Catch:{ all -> 0x0ef6 }
        L_0x09cc:
            int r7 = r7 + 1
            goto L_0x08de
        L_0x09d0:
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r3.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzt r7 = r41.zzc()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r8 = r3.zzr()     // Catch:{ all -> 0x0ef6 }
            java.util.List r9 = r3.zzw()     // Catch:{ all -> 0x0ef6 }
            java.util.List r10 = r3.zzx()     // Catch:{ all -> 0x0ef6 }
            long r11 = r3.zzd()     // Catch:{ all -> 0x0ef6 }
            long r13 = r3.zzc()     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0ef6 }
            java.util.List r7 = r7.zza(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0ef6 }
            r2.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zzc>) r7)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzaf r2 = r41.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ef6 }
            boolean r2 = r2.zzl(r7)     // Catch:{ all -> 0x0ef6 }
            if (r2 == 0) goto L_0x0d59
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ef6 }
            r2.<init>()     // Catch:{ all -> 0x0ef6 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0ef6 }
            r7.<init>()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zznd r8 = r41.zzq()     // Catch:{ all -> 0x0ef6 }
            java.security.SecureRandom r8 = r8.zzv()     // Catch:{ all -> 0x0ef6 }
            r9 = 0
        L_0x0a1e:
            int r10 = r3.zza()     // Catch:{ all -> 0x0ef6 }
            if (r9 >= r10) goto L_0x0d22
            com.google.android.gms.internal.measurement.zzfi$zze r10 = r3.zza((int) r9)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix$zzb r10 = r10.zzby()     // Catch:{ all -> 0x0ef6 }
            r11 = r10
            com.google.android.gms.internal.measurement.zzix$zzb r11 = (com.google.android.gms.internal.measurement.zzix.zzb) r11     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r10 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r10     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x0abd
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r11 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r11 = (com.google.android.gms.internal.measurement.zzfi.zze) r11     // Catch:{ all -> 0x0ef6 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzmz.zzb(r11, r14)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r14 = r2.get(r11)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r14 = (com.google.android.gms.measurement.internal.zzbc) r14     // Catch:{ all -> 0x0ef6 }
            if (r14 != 0) goto L_0x0a77
            com.google.android.gms.measurement.internal.zzao r14 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r15 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r15 = r15.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r18 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0ef6 }
            r5 = r18
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r14 = r14.zzd(r15, r5)     // Catch:{ all -> 0x0ef6 }
            if (r14 == 0) goto L_0x0a77
            r2.put(r11, r14)     // Catch:{ all -> 0x0ef6 }
        L_0x0a77:
            if (r14 == 0) goto L_0x0ab8
            java.lang.Long r5 = r14.zzi     // Catch:{ all -> 0x0ef6 }
            if (r5 != 0) goto L_0x0ab8
            java.lang.Long r5 = r14.zzj     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0a95
            java.lang.Long r5 = r14.zzj     // Catch:{ all -> 0x0ef6 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ef6 }
            r18 = 1
            int r11 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0a95
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r5 = r14.zzj     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r10, (java.lang.String) r13, (java.lang.Object) r5)     // Catch:{ all -> 0x0ef6 }
        L_0x0a95:
            java.lang.Boolean r5 = r14.zzk     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0aad
            java.lang.Boolean r5 = r14.zzk     // Catch:{ all -> 0x0ef6 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0aad
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            r5 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r10, (java.lang.String) r12, (java.lang.Object) r11)     // Catch:{ all -> 0x0ef6 }
        L_0x0aad:
            com.google.android.gms.internal.measurement.zzkj r5 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r5 = (com.google.android.gms.internal.measurement.zzfi.zze) r5     // Catch:{ all -> 0x0ef6 }
            r7.add(r5)     // Catch:{ all -> 0x0ef6 }
        L_0x0ab8:
            r3.zza((int) r9, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r10)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0c3e
        L_0x0abd:
            com.google.android.gms.measurement.internal.zzgp r5 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ef6 }
            long r5 = r5.zza((java.lang.String) r6)     // Catch:{ all -> 0x0ef6 }
            r41.zzq()     // Catch:{ all -> 0x0ef6 }
            long r14 = r10.zzc()     // Catch:{ all -> 0x0ef6 }
            long r14 = com.google.android.gms.measurement.internal.zznd.zza((long) r14, (long) r5)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r11 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r11 = (com.google.android.gms.internal.measurement.zzfi.zze) r11     // Catch:{ all -> 0x0ef6 }
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ef6 }
            boolean r18 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x0ef6 }
            if (r18 != 0) goto L_0x0b4c
            if (r1 != 0) goto L_0x0aed
            goto L_0x0b4c
        L_0x0aed:
            java.util.List r11 = r11.zzh()     // Catch:{ all -> 0x0ef6 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0ef6 }
        L_0x0af5:
            boolean r18 = r11.hasNext()     // Catch:{ all -> 0x0ef6 }
            if (r18 == 0) goto L_0x0b4c
            java.lang.Object r18 = r11.next()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzg r18 = (com.google.android.gms.internal.measurement.zzfi.zzg) r18     // Catch:{ all -> 0x0ef6 }
            r44 = r11
            java.lang.String r11 = r18.zzg()     // Catch:{ all -> 0x0ef6 }
            r21 = r12
            r12 = r17
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0ef6 }
            if (r11 == 0) goto L_0x0b45
            boolean r11 = r1 instanceof java.lang.Long     // Catch:{ all -> 0x0ef6 }
            if (r11 == 0) goto L_0x0b23
            long r22 = r18.zzd()     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0ef6 }
            boolean r11 = r1.equals(r11)     // Catch:{ all -> 0x0ef6 }
            if (r11 != 0) goto L_0x0b43
        L_0x0b23:
            boolean r11 = r1 instanceof java.lang.String     // Catch:{ all -> 0x0ef6 }
            if (r11 == 0) goto L_0x0b31
            java.lang.String r11 = r18.zzh()     // Catch:{ all -> 0x0ef6 }
            boolean r11 = r1.equals(r11)     // Catch:{ all -> 0x0ef6 }
            if (r11 != 0) goto L_0x0b43
        L_0x0b31:
            boolean r11 = r1 instanceof java.lang.Double     // Catch:{ all -> 0x0ef6 }
            if (r11 == 0) goto L_0x0b50
            double r17 = r18.zza()     // Catch:{ all -> 0x0ef6 }
            java.lang.Double r11 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0ef6 }
            boolean r1 = r1.equals(r11)     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0b50
        L_0x0b43:
            r1 = 1
            goto L_0x0b51
        L_0x0b45:
            r11 = r44
            r17 = r12
            r12 = r21
            goto L_0x0af5
        L_0x0b4c:
            r21 = r12
            r12 = r17
        L_0x0b50:
            r1 = 0
        L_0x0b51:
            if (r1 != 0) goto L_0x0b68
            com.google.android.gms.measurement.internal.zzgp r1 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ef6 }
            r17 = r12
            java.lang.String r12 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            int r1 = r1.zzb((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0b6b
        L_0x0b68:
            r17 = r12
            r1 = 1
        L_0x0b6b:
            if (r1 > 0) goto L_0x0b92
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ef6 }
            r5.zza(r6, r11, r1)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r1 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ef6 }
            r7.add(r1)     // Catch:{ all -> 0x0ef6 }
            r3.zza((int) r9, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r10)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0c3e
        L_0x0b92:
            java.lang.String r11 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r11 = (com.google.android.gms.measurement.internal.zzbc) r11     // Catch:{ all -> 0x0ef6 }
            if (r11 != 0) goto L_0x0bf1
            com.google.android.gms.measurement.internal.zzao r11 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ef6 }
            r22 = r5
            java.lang.String r5 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r11 = r11.zzd(r12, r5)     // Catch:{ all -> 0x0ef6 }
            if (r11 != 0) goto L_0x0bf3
            com.google.android.gms.measurement.internal.zzfr r5 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r11 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            r5.zza(r12, r6, r11)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r11 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r4.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r25 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r26 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r10.zzc()     // Catch:{ all -> 0x0ef6 }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r11
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0bf3
        L_0x0bf1:
            r22 = r5
        L_0x0bf3:
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r5 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r5 = (com.google.android.gms.internal.measurement.zzfi.zze) r5     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "_eid"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzmz.zzb(r5, r6)     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0c0a
            r6 = 1
            goto L_0x0c0b
        L_0x0c0a:
            r6 = 0
        L_0x0c0b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0ef6 }
            r12 = 1
            if (r1 != r12) goto L_0x0c47
            com.google.android.gms.internal.measurement.zzkj r1 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ef6 }
            r7.add(r1)     // Catch:{ all -> 0x0ef6 }
            boolean r1 = r6.booleanValue()     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0c3b
            java.lang.Long r1 = r11.zzi     // Catch:{ all -> 0x0ef6 }
            if (r1 != 0) goto L_0x0c2f
            java.lang.Long r1 = r11.zzj     // Catch:{ all -> 0x0ef6 }
            if (r1 != 0) goto L_0x0c2f
            java.lang.Boolean r1 = r11.zzk     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0c3b
        L_0x0c2f:
            r1 = 0
            com.google.android.gms.measurement.internal.zzbc r5 = r11.zza(r1, r1, r1)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r1 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ef6 }
        L_0x0c3b:
            r3.zza((int) r9, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r10)     // Catch:{ all -> 0x0ef6 }
        L_0x0c3e:
            r1 = r3
            r12 = r4
            r18 = r8
            r5 = r9
            r3 = 1
            goto L_0x0d16
        L_0x0c47:
            int r12 = r8.nextInt(r1)     // Catch:{ all -> 0x0ef6 }
            if (r12 != 0) goto L_0x0c8a
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            r12 = r4
            long r4 = (long) r1     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r10, (java.lang.String) r13, (java.lang.Object) r1)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r1 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ef6 }
            r7.add(r1)     // Catch:{ all -> 0x0ef6 }
            boolean r1 = r6.booleanValue()     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0c73
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ef6 }
            r4 = 0
            com.google.android.gms.measurement.internal.zzbc r11 = r11.zza(r4, r1, r4)     // Catch:{ all -> 0x0ef6 }
        L_0x0c73:
            java.lang.String r1 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            long r4 = r10.zzc()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r4 = r11.zza(r4, r14)     // Catch:{ all -> 0x0ef6 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0ef6 }
            r1 = r3
            r18 = r8
            r5 = r9
            r3 = 1
            goto L_0x0d13
        L_0x0c8a:
            r12 = r4
            java.lang.Long r4 = r11.zzh     // Catch:{ all -> 0x0ef6 }
            if (r4 == 0) goto L_0x0c9c
            java.lang.Long r4 = r11.zzh     // Catch:{ all -> 0x0ef6 }
            long r22 = r4.longValue()     // Catch:{ all -> 0x0ef6 }
            r44 = r3
            r18 = r8
            r24 = r9
            goto L_0x0caf
        L_0x0c9c:
            r41.zzq()     // Catch:{ all -> 0x0ef6 }
            r44 = r3
            long r3 = r10.zzb()     // Catch:{ all -> 0x0ef6 }
            r18 = r8
            r24 = r9
            r8 = r22
            long r22 = com.google.android.gms.measurement.internal.zznd.zza((long) r3, (long) r8)     // Catch:{ all -> 0x0ef6 }
        L_0x0caf:
            int r3 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0cfb
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            r3 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0ef6 }
            r8 = r21
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r10, (java.lang.String) r8, (java.lang.Object) r5)     // Catch:{ all -> 0x0ef6 }
            r41.zzp()     // Catch:{ all -> 0x0ef6 }
            long r8 = (long) r1     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r10, (java.lang.String) r13, (java.lang.Object) r1)     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r1 = r10.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ef6 }
            r7.add(r1)     // Catch:{ all -> 0x0ef6 }
            boolean r1 = r6.booleanValue()     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0ceb
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0ef6 }
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0ef6 }
            r5 = 0
            com.google.android.gms.measurement.internal.zzbc r11 = r11.zza(r5, r1, r6)     // Catch:{ all -> 0x0ef6 }
        L_0x0ceb:
            java.lang.String r1 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            long r5 = r10.zzc()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r5 = r11.zza(r5, r14)     // Catch:{ all -> 0x0ef6 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0d0f
        L_0x0cfb:
            r3 = 1
            boolean r1 = r6.booleanValue()     // Catch:{ all -> 0x0ef6 }
            if (r1 == 0) goto L_0x0d0f
            java.lang.String r1 = r10.zze()     // Catch:{ all -> 0x0ef6 }
            r6 = 0
            com.google.android.gms.measurement.internal.zzbc r5 = r11.zza(r5, r6, r6)     // Catch:{ all -> 0x0ef6 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ef6 }
        L_0x0d0f:
            r1 = r44
            r5 = r24
        L_0x0d13:
            r1.zza((int) r5, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r10)     // Catch:{ all -> 0x0ef6 }
        L_0x0d16:
            int r9 = r5 + 1
            r5 = 0
            r3 = r1
            r4 = r12
            r8 = r18
            r1 = r41
            goto L_0x0a1e
        L_0x0d22:
            r1 = r3
            r12 = r4
            int r3 = r7.size()     // Catch:{ all -> 0x0ef6 }
            int r4 = r1.zza()     // Catch:{ all -> 0x0ef6 }
            if (r3 >= r4) goto L_0x0d35
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r1.zzi()     // Catch:{ all -> 0x0ef6 }
            r3.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r7)     // Catch:{ all -> 0x0ef6 }
        L_0x0d35:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0ef6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ef6 }
        L_0x0d3d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0ef6 }
            if (r3 == 0) goto L_0x0d57
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0ef6 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r4 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzbc r3 = (com.google.android.gms.measurement.internal.zzbc) r3     // Catch:{ all -> 0x0ef6 }
            r4.zza((com.google.android.gms.measurement.internal.zzbc) r3)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0d3d
        L_0x0d57:
            r2 = r12
            goto L_0x0d5b
        L_0x0d59:
            r1 = r3
            r2 = r4
        L_0x0d5b:
            com.google.android.gms.internal.measurement.zzfi$zzj r3 = r2.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r4 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzd(r3)     // Catch:{ all -> 0x0ef6 }
            if (r4 != 0) goto L_0x0d83
            com.google.android.gms.measurement.internal.zzfr r4 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r2.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            r4.zza(r6, r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0dde
        L_0x0d83:
            int r5 = r1.zza()     // Catch:{ all -> 0x0ef6 }
            if (r5 <= 0) goto L_0x0dde
            long r5 = r4.zzp()     // Catch:{ all -> 0x0ef6 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0d97
            r1.zzg((long) r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0d9a
        L_0x0d97:
            r1.zzm()     // Catch:{ all -> 0x0ef6 }
        L_0x0d9a:
            long r7 = r4.zzr()     // Catch:{ all -> 0x0ef6 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0da5
            goto L_0x0da6
        L_0x0da5:
            r5 = r7
        L_0x0da6:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0dae
            r1.zzh((long) r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0db1
        L_0x0dae:
            r1.zzn()     // Catch:{ all -> 0x0ef6 }
        L_0x0db1:
            r4.zzai()     // Catch:{ all -> 0x0ef6 }
            long r5 = r4.zzq()     // Catch:{ all -> 0x0ef6 }
            int r6 = (int) r5     // Catch:{ all -> 0x0ef6 }
            r1.zzf((int) r6)     // Catch:{ all -> 0x0ef6 }
            long r5 = r1.zzd()     // Catch:{ all -> 0x0ef6 }
            r4.zzp(r5)     // Catch:{ all -> 0x0ef6 }
            long r5 = r1.zzc()     // Catch:{ all -> 0x0ef6 }
            r4.zzn(r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r4.zzw()     // Catch:{ all -> 0x0ef6 }
            if (r5 == 0) goto L_0x0dd4
            r1.zzn(r5)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0dd7
        L_0x0dd4:
            r1.zzj()     // Catch:{ all -> 0x0ef6 }
        L_0x0dd7:
            com.google.android.gms.measurement.internal.zzao r5 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            r5.zza((com.google.android.gms.measurement.internal.zzh) r4)     // Catch:{ all -> 0x0ef6 }
        L_0x0dde:
            int r4 = r1.zza()     // Catch:{ all -> 0x0ef6 }
            if (r4 <= 0) goto L_0x0e3d
            com.google.android.gms.measurement.internal.zzgp r4 = r41.zzi()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r2.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfc$zzd r4 = r4.zzc(r5)     // Catch:{ all -> 0x0ef6 }
            if (r4 == 0) goto L_0x0e03
            boolean r5 = r4.zzs()     // Catch:{ all -> 0x0ef6 }
            if (r5 != 0) goto L_0x0dfb
            goto L_0x0e03
        L_0x0dfb:
            long r4 = r4.zzc()     // Catch:{ all -> 0x0ef6 }
            r1.zzb((long) r4)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0e2c
        L_0x0e03:
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r2.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r4 = r4.zzah()     // Catch:{ all -> 0x0ef6 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ef6 }
            if (r4 == 0) goto L_0x0e15
            r4 = -1
            r1.zzb((long) r4)     // Catch:{ all -> 0x0ef6 }
            goto L_0x0e2c
        L_0x0e15:
            com.google.android.gms.measurement.internal.zzfr r4 = r41.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzu()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r2.zza     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ef6 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            r4.zza(r6, r5)     // Catch:{ all -> 0x0ef6 }
        L_0x0e2c:
            com.google.android.gms.measurement.internal.zzao r4 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzkj r1 = r1.zzab()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.internal.measurement.zzfi$zzj r1 = (com.google.android.gms.internal.measurement.zzfi.zzj) r1     // Catch:{ all -> 0x0ef6 }
            r11 = r16
            r4.zza((com.google.android.gms.internal.measurement.zzfi.zzj) r1, (boolean) r11)     // Catch:{ all -> 0x0ef6 }
        L_0x0e3d:
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            java.util.List<java.lang.Long> r2 = r2.zzb     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0ef6 }
            r1.zzt()     // Catch:{ all -> 0x0ef6 }
            r1.zzak()     // Catch:{ all -> 0x0ef6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0ef6 }
            r5 = 0
        L_0x0e54:
            int r6 = r2.size()     // Catch:{ all -> 0x0ef6 }
            if (r5 >= r6) goto L_0x0e71
            if (r5 == 0) goto L_0x0e61
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0ef6 }
        L_0x0e61:
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0ef6 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ef6 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ef6 }
            r4.append(r6)     // Catch:{ all -> 0x0ef6 }
            int r5 = r5 + 1
            goto L_0x0e54
        L_0x0e71:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0ef6 }
            android.database.sqlite.SQLiteDatabase r5 = r1.e_()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ef6 }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0ef6 }
            int r5 = r2.size()     // Catch:{ all -> 0x0ef6 }
            if (r4 == r5) goto L_0x0ea4
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0ef6 }
            int r2 = r2.size()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ef6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0ef6 }
            r1.zza(r5, r4, r2)     // Catch:{ all -> 0x0ef6 }
        L_0x0ea4:
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            android.database.sqlite.SQLiteDatabase r2 = r1.e_()     // Catch:{ all -> 0x0ef6 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0ebb }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0ebb }
            r5 = 1
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0ebb }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r2.execSQL(r5, r4)     // Catch:{ SQLiteException -> 0x0ebb }
            goto L_0x0ece
        L_0x0ebb:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzj()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0ef6 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r3)     // Catch:{ all -> 0x0ef6 }
            r1.zza(r4, r3, r2)     // Catch:{ all -> 0x0ef6 }
        L_0x0ece:
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            r1.zzw()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()
            r1.zzu()
            r1 = 1
            return r1
        L_0x0ede:
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()     // Catch:{ all -> 0x0ef6 }
            r1.zzw()     // Catch:{ all -> 0x0ef6 }
            com.google.android.gms.measurement.internal.zzao r1 = r41.zzf()
            r1.zzu()
            r1 = 0
            return r1
        L_0x0eee:
            r0 = move-exception
            r2 = r0
        L_0x0ef0:
            if (r5 == 0) goto L_0x0ef5
            r5.close()     // Catch:{ all -> 0x0ef6 }
        L_0x0ef5:
            throw r2     // Catch:{ all -> 0x0ef6 }
        L_0x0ef6:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.measurement.internal.zzao r2 = r41.zzf()
            r2.zzu()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String, long):boolean");
    }

    private final boolean zzac() {
        zzl().zzt();
        zzs();
        return zzf().zzx() || !TextUtils.isEmpty(zzf().f_());
    }

    private final boolean zzad() {
        zzl().zzt();
        FileLock fileLock = this.zzx;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzm.zza().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzy = channel;
                FileLock tryLock = channel.tryLock();
                this.zzx = tryLock;
                if (tryLock != null) {
                    zzj().zzp().zza("Storage concurrent access okay");
                    return true;
                }
                zzj().zzg().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                zzj().zzg().zza("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                zzj().zzg().zza("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                zzj().zzu().zza("Storage lock already acquired", e3);
                return false;
            }
        } else {
            zzj().zzp().zza("Storage concurrent access okay");
            return true;
        }
    }

    private final boolean zza(zzfi.zze.zza zza2, zzfi.zze.zza zza3) {
        String str;
        Preconditions.checkArgument("_e".equals(zza2.zze()));
        zzp();
        zzfi.zzg zza4 = zzmz.zza((zzfi.zze) ((zzix) zza2.zzab()), "_sc");
        String str2 = null;
        if (zza4 == null) {
            str = null;
        } else {
            str = zza4.zzh();
        }
        zzp();
        zzfi.zzg zza5 = zzmz.zza((zzfi.zze) ((zzix) zza3.zzab()), "_pc");
        if (zza5 != null) {
            str2 = zza5.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zza2.zze()));
        zzp();
        zzfi.zzg zza6 = zzmz.zza((zzfi.zze) ((zzix) zza2.zzab()), "_et");
        if (zza6 == null || !zza6.zzl() || zza6.zzd() <= 0) {
            return true;
        }
        long zzd2 = zza6.zzd();
        zzp();
        zzfi.zzg zza7 = zzmz.zza((zzfi.zze) ((zzix) zza3.zzab()), "_et");
        if (zza7 != null && zza7.zzd() > 0) {
            zzd2 += zza7.zzd();
        }
        zzp();
        zzmz.zza(zza3, "_et", (Object) Long.valueOf(zzd2));
        zzp();
        zzmz.zza(zza2, "_fr", (Object) 1L);
        return true;
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().zzg().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            zzj().zzg().zza("Failed to write to channel", e);
            return false;
        }
    }
}
