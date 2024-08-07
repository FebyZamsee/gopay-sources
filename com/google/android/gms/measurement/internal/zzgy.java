package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class zzgy extends zzic {
    /* access modifiers changed from: private */
    public static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    public zzhc zzb;
    /* access modifiers changed from: private */
    public zzhc zzc;
    private final PriorityBlockingQueue<zzhd<?>> zzd = new PriorityBlockingQueue<>();
    private final BlockingQueue<zzhd<?>> zze = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler zzf = new zzha(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler zzg = new zzha(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object zzh = new Object();
    /* access modifiers changed from: private */
    public final Semaphore zzi = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean zzj;

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final boolean zzo() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
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

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = zzj().zzu();
        r3.zza("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = zzj().zzu();
        r3.zza("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzl()     // Catch:{ all -> 0x0048 }
            r0.zzb((java.lang.Runnable) r6)     // Catch:{ all -> 0x0048 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.zzfr r3 = r1.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.zza(r4)
        L_0x002b:
            return r2
        L_0x002c:
            com.google.android.gms.measurement.internal.zzfr r3 = r1.zzj()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x0048 }
            r4.append(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0048 }
            r3.zza(r4)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            r2 = 0
            return r2
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgy.zza(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> zza(Callable<V> callable) throws IllegalStateException {
        zzab();
        Preconditions.checkNotNull(callable);
        zzhd zzhd = new zzhd(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                zzj().zzu().zza("Callable skipped the worker queue.");
            }
            zzhd.run();
        } else {
            zza((zzhd<?>) zzhd);
        }
        return zzhd;
    }

    public final <V> Future<V> zzb(Callable<V> callable) throws IllegalStateException {
        zzab();
        Preconditions.checkNotNull(callable);
        zzhd zzhd = new zzhd(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzhd.run();
        } else {
            zza((zzhd<?>) zzhd);
        }
        return zzhd;
    }

    zzgy(zzhf zzhf) {
        super(zzhf);
    }

    public final void zzr() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final void zzt() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    private final void zza(zzhd<?> zzhd) {
        synchronized (this.zzh) {
            this.zzd.add(zzhd);
            zzhc zzhc = this.zzb;
            if (zzhc == null) {
                zzhc zzhc2 = new zzhc(this, "Measurement Worker", this.zzd);
                this.zzb = zzhc2;
                zzhc2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzhc.zza();
            }
        }
    }

    public final void zza(Runnable runnable) throws IllegalStateException {
        zzab();
        Preconditions.checkNotNull(runnable);
        zzhd zzhd = new zzhd(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            this.zze.add(zzhd);
            zzhc zzhc = this.zzc;
            if (zzhc == null) {
                zzhc zzhc2 = new zzhc(this, "Measurement Network", this.zze);
                this.zzc = zzhc2;
                zzhc2.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            } else {
                zzhc.zza();
            }
        }
    }

    public final void zzb(Runnable runnable) throws IllegalStateException {
        zzab();
        Preconditions.checkNotNull(runnable);
        zza((zzhd<?>) new zzhd(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzc(Runnable runnable) throws IllegalStateException {
        zzab();
        Preconditions.checkNotNull(runnable);
        zza((zzhd<?>) new zzhd(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzg() {
        return Thread.currentThread() == this.zzb;
    }
}
