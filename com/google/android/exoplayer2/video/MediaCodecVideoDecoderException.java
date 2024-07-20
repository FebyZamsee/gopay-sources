package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import o.createFromXmlInner;

public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    private int asBinder;
    private boolean read;

    public MediaCodecVideoDecoderException(Throwable th, createFromXmlInner createfromxmlinner, Surface surface) {
        super(th, createfromxmlinner);
        this.asBinder = System.identityHashCode(surface);
        this.read = surface == null || surface.isValid();
    }
}
