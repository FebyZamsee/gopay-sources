package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

public class SpriteStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        /* synthetic */ Builder(zzs zzs) {
        }

        public final SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        /* access modifiers changed from: protected */
        public final Builder self() {
            return this;
        }
    }

    public SpriteStyle(BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return (Builder) new Builder((zzs) null).stamp(bitmapDescriptor);
    }
}
