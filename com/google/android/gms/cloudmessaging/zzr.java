package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class zzr extends zzp<Bundle> {
    zzr(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return false;
    }
}
