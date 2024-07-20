package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzlf extends zzlg<FieldDescriptorType, Object> {
    zzlf(int i) {
        super(i);
    }

    public final void zza() {
        if (!zze()) {
            for (int i = 0; i < zzb(); i++) {
                Map.Entry zzb = zzb(i);
                if (((zzis) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzis) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
