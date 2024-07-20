package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

public class TextureStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        /* synthetic */ Builder(zzac zzac) {
        }

        public final TextureStyle build() {
            return new TextureStyle(this.zza, (zzad) null);
        }

        /* access modifiers changed from: protected */
        public final Builder self() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzad zzad) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return (Builder) new Builder((zzac) null).stamp(bitmapDescriptor);
    }
}
