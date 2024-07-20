package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;
import o.createFromXmlInner;

public class MediaCodecDecoderException extends DecoderException {
    private createFromXmlInner RemoteActionCompatParcelizer;
    public final String onTransact;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaCodecDecoderException(java.lang.Throwable r4, o.createFromXmlInner r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000c
            r2 = r1
            goto L_0x000e
        L_0x000c:
            java.lang.String r2 = r5.onTransact
        L_0x000e:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.RemoteActionCompatParcelizer = r5
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            r0 = 21
            if (r5 < r0) goto L_0x002b
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x002b
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4
            java.lang.String r4 = r4.getDiagnosticInfo()
            r1 = r4
        L_0x002b:
            r3.onTransact = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, o.createFromXmlInner):void");
    }
}
