package com.google.android.gms.measurement.internal;

public final /* synthetic */ class zzr implements Runnable {
    private /* synthetic */ zzhf zza;

    public /* synthetic */ zzr(zzhf zzhf) {
        this.zza = zzhf;
    }

    public final void run() {
        zzhf zzhf = this.zza;
        if (!zzhf.zzt().zzw()) {
            zzhf.zzj().zzu().zza("registerTrigger called but app not eligible");
            return;
        }
        zziq zzp = zzhf.zzp();
        zzp.getClass();
        new Thread(new zzs(zzp)).start();
    }
}
