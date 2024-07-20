package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AppCompatResources;
import o.OnBackPressedDispatcher;
import o.createFromXmlInner;
import o.createPopupWindow;
import o.findMenuItemForSubmenu;
import o.getColorStateList;
import o.getKeyListener;
import o.onItemHoverEnter;
import o.parseItem;
import o.setMultiChoiceItems;
import o.setOnBackInvokedDispatcher;

public final class MediaCodecUtil {
    private static int RemoteActionCompatParcelizer = -1;
    private static final Pattern asInterface = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<onTransact, List<createFromXmlInner>> onTransact = new HashMap<>();

    public interface asBinder<T> {
        int RemoteActionCompatParcelizer(T t);
    }

    interface asInterface {
        boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean asBinder(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo asInterface(int i);

        boolean asInterface();

        int read();
    }

    private static int onTransact(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static class DecoderQueryException extends Exception {
        /* synthetic */ DecoderQueryException(Throwable th, byte b) {
            this(th);
        }

        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private MediaCodecUtil() {
    }

    public static createFromXmlInner read(String str) throws DecoderQueryException {
        List<createFromXmlInner> asBinder2 = asBinder(str, false, false);
        if (asBinder2.isEmpty()) {
            return null;
        }
        return asBinder2.get(0);
    }

    public static List<createFromXmlInner> asBinder(String str, boolean z, boolean z2) throws DecoderQueryException {
        asInterface asinterface;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (MediaCodecUtil.class) {
            onTransact ontransact = new onTransact(str2, z3, z4);
            HashMap<onTransact, List<createFromXmlInner>> hashMap = onTransact;
            List<createFromXmlInner> list = hashMap.get(ontransact);
            if (list != null) {
                return list;
            }
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21) {
                asinterface = new RemoteActionCompatParcelizer(z3, z4);
            } else {
                asinterface = new read((byte) 0);
            }
            ArrayList<createFromXmlInner> asInterface2 = asInterface(ontransact, asinterface);
            if (z3 && asInterface2.isEmpty() && 21 <= OnBackPressedDispatcher.Api33Impl.onConnectionFailed && OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 23) {
                asInterface2 = asInterface(ontransact, (asInterface) new read((byte) 0));
                if (!asInterface2.isEmpty()) {
                    String str3 = asInterface2.get(0).onTransact;
                    synchronized (findMenuItemForSubmenu.read) {
                    }
                }
            }
            if ("audio/raw".equals(str2)) {
                if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 26 && OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.equals("R9") && asInterface2.size() == 1 && asInterface2.get(0).onTransact.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    asInterface2.add(createFromXmlInner.read("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
                }
                Collections.sort(asInterface2, new getColorStateList(new AppCompatResources()));
            }
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21 && asInterface2.size() > 1) {
                String str4 = asInterface2.get(0).onTransact;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    Collections.sort(asInterface2, new getColorStateList(new parseItem()));
                }
            }
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 32 && asInterface2.size() > 1 && "OMX.qti.audio.decoder.flac".equals(asInterface2.get(0).onTransact)) {
                asInterface2.add(asInterface2.remove(0));
            }
            getKeyListener<createFromXmlInner> asInterface3 = getKeyListener.asInterface(asInterface2);
            hashMap.put(ontransact, asInterface3);
            return asInterface3;
        }
    }

    public static int RemoteActionCompatParcelizer() throws DecoderQueryException {
        if (RemoteActionCompatParcelizer == -1) {
            createFromXmlInner read2 = read("video/avc");
            int i = 0;
            if (read2 != null) {
                MediaCodecInfo.CodecProfileLevel[] asBinder2 = read2.asBinder();
                int length = asBinder2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(onTransact(asBinder2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21 ? 345600 : 172800);
            }
            RemoteActionCompatParcelizer = i;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r3.equals("av01") != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> asInterface(o.setMultiChoiceItems r5) {
        /*
            java.lang.String r0 = r5.addMenuProvider
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r5.addMenuProvider
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r5.f17lambda$new$1$androidxactivityComponentActivity
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r5.addMenuProvider
            android.util.Pair r5 = asInterface((java.lang.String) r5, (java.lang.String[]) r0)
            return r5
        L_0x001f:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case 3004662: goto L_0x0069;
                case 3006243: goto L_0x005f;
                case 3006244: goto L_0x0055;
                case 3199032: goto L_0x004b;
                case 3214780: goto L_0x0041;
                case 3356560: goto L_0x0037;
                case 3624515: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0072
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 6
            goto L_0x0073
        L_0x0037:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 5
            goto L_0x0073
        L_0x0041:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 4
            goto L_0x0073
        L_0x004b:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 3
            goto L_0x0073
        L_0x0055:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 2
            goto L_0x0073
        L_0x005f:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0072
            r2 = 1
            goto L_0x0073
        L_0x0069:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = -1
        L_0x0073:
            switch(r2) {
                case 0: goto L_0x0095;
                case 1: goto L_0x008e;
                case 2: goto L_0x008e;
                case 3: goto L_0x0085;
                case 4: goto L_0x0085;
                case 5: goto L_0x007e;
                case 6: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            return r1
        L_0x0077:
            java.lang.String r5 = r5.addMenuProvider
            android.util.Pair r5 = onTransact(r5, r0)
            return r5
        L_0x007e:
            java.lang.String r5 = r5.addMenuProvider
            android.util.Pair r5 = asBinder((java.lang.String) r5, (java.lang.String[]) r0)
            return r5
        L_0x0085:
            java.lang.String r1 = r5.addMenuProvider
            o.onItemHoverEnter r5 = r5.addOnContextAvailableListener
            android.util.Pair r5 = asBinder((java.lang.String) r1, (java.lang.String[]) r0, (o.onItemHoverEnter) r5)
            return r5
        L_0x008e:
            java.lang.String r5 = r5.addMenuProvider
            android.util.Pair r5 = read(r5, r0)
            return r5
        L_0x0095:
            java.lang.String r1 = r5.addMenuProvider
            o.onItemHoverEnter r5 = r5.addOnContextAvailableListener
            android.util.Pair r5 = read(r1, r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.asInterface(o.setMultiChoiceItems):android.util.Pair");
    }

    public static String asBinder(setMultiChoiceItems setmultichoiceitems) {
        Pair<Integer, Integer> asInterface2;
        if ("audio/eac3-joc".equals(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity) || (asInterface2 = asInterface(setmultichoiceitems)) == null) {
            return null;
        }
        int intValue = ((Integer) asInterface2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r7.endsWith(".secure") == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0259 A[Catch:{ Exception -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03a4 A[Catch:{ Exception -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03a8 A[Catch:{ Exception -> 0x03b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<o.createFromXmlInner> asInterface(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.onTransact r22, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.asInterface r23) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r1 = r22
            r2 = r23
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x03b3 }
            r6.<init>()     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r15 = r1.onTransact     // Catch:{ Exception -> 0x03b3 }
            int r14 = r23.read()     // Catch:{ Exception -> 0x03b3 }
            boolean r16 = r23.asInterface()     // Catch:{ Exception -> 0x03b3 }
            r13 = 0
        L_0x0018:
            if (r13 >= r14) goto L_0x03b2
            android.media.MediaCodecInfo r0 = r2.asInterface(r13)     // Catch:{ Exception -> 0x03b3 }
            int r7 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r8 = 29
            if (r7 < r8) goto L_0x002c
            boolean r7 = r0.isAlias()     // Catch:{ Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            if (r7 == 0) goto L_0x0031
            goto L_0x0253
        L_0x0031:
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x03b3 }
            boolean r10 = r0.isEncoder()     // Catch:{ Exception -> 0x03b3 }
            r12 = 23
            java.lang.String r11 = ".secure"
            if (r10 != 0) goto L_0x0250
            if (r16 != 0) goto L_0x0047
            boolean r10 = r7.endsWith(r11)     // Catch:{ Exception -> 0x03b3 }
            if (r10 != 0) goto L_0x0250
        L_0x0047:
            int r10 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r5 = 21
            if (r10 >= r5) goto L_0x007f
            java.lang.String r5 = "CIPAACDecoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = "CIPMP3Decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = "CIPVorbisDecoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = "CIPAMRNBDecoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = "AACDecoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = "MP3Decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x007f
            goto L_0x0250
        L_0x007f:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r10 = 18
            if (r5 >= r10) goto L_0x00ad
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x00ad
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "a70"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.write     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "Xiaomi"
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x00ad
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "HM"
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x00ad
            goto L_0x0250
        L_0x00ad:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r10 = 16
            if (r5 != r10) goto L_0x0135
            java.lang.String r5 = "OMX.qcom.audio.decoder.mp3"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0135
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "dlxu"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "protou"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "ville"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "villeplus"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "villec2"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "gee"
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C6602"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C6603"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C6606"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C6616"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "L36h"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "SO-02E"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0135
            goto L_0x0250
        L_0x0135:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            if (r5 != r10) goto L_0x016b
            java.lang.String r5 = "OMX.qcom.audio.decoder.aac"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x016b
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C1504"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C1505"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C1604"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "C1605"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x016b
            goto L_0x0250
        L_0x016b:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r9 = 24
            java.lang.String r10 = "samsung"
            if (r5 >= r9) goto L_0x01dd
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0183
            java.lang.String r5 = "OMX.Exynos.AAC.Decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x01dd
        L_0x0183:
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.write     // Catch:{ Exception -> 0x03b3 }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x01dd
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "zeroflte"
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "zerolte"
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "zenlte"
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "SC-05G"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "marinelteatt"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "404SC"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "SC-04G"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "SCV31"
            boolean r5 = r9.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x01dd
            goto L_0x0250
        L_0x01dd:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r9 = "jflte"
            r8 = 19
            if (r5 > r8) goto L_0x0226
            java.lang.String r5 = "OMX.SEC.vp8.dec"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0226
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.write     // Catch:{ Exception -> 0x03b3 }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0226
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "d2"
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "serrano"
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "santos"
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r10 = "t0"
            boolean r5 = r5.startsWith(r10)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0226
            goto L_0x0250
        L_0x0226:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            if (r5 > r8) goto L_0x023a
            java.lang.String r5 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer     // Catch:{ Exception -> 0x03b3 }
            boolean r5 = r5.startsWith(r9)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x023a
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
        L_0x023a:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            if (r5 > r12) goto L_0x024e
            java.lang.String r5 = "audio/eac3-joc"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x024e
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0250
        L_0x024e:
            r5 = 1
            goto L_0x0251
        L_0x0250:
            r5 = 0
        L_0x0251:
            if (r5 != 0) goto L_0x0259
        L_0x0253:
            r18 = r13
            r19 = r14
            goto L_0x03ac
        L_0x0259:
            java.lang.String[] r5 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x03b3 }
            int r8 = r5.length     // Catch:{ Exception -> 0x03b3 }
            r9 = 0
        L_0x025f:
            if (r9 >= r8) goto L_0x026f
            r10 = r5[r9]     // Catch:{ Exception -> 0x03b3 }
            boolean r19 = r10.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x03b3 }
            if (r19 == 0) goto L_0x026c
            r9 = r10
            goto L_0x02d1
        L_0x026c:
            int r9 = r9 + 1
            goto L_0x025f
        L_0x026f:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0296
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x0283
            java.lang.String r5 = "video/hevcdv"
        L_0x0281:
            r9 = r5
            goto L_0x02d1
        L_0x0283:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x0293
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02cf
        L_0x0293:
            java.lang.String r5 = "video/dv_hevc"
            goto L_0x0281
        L_0x0296:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02a9
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02a9
            java.lang.String r5 = "audio/x-lg-alac"
            goto L_0x0281
        L_0x02a9:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02bc
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02bc
            java.lang.String r5 = "audio/x-lg-flac"
            goto L_0x0281
        L_0x02bc:
            java.lang.String r5 = "audio/ac3"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02cf
            java.lang.String r5 = "OMX.lge.ac3.decoder"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x03b3 }
            if (r5 == 0) goto L_0x02cf
            java.lang.String r5 = "audio/lg-ac3"
            goto L_0x0281
        L_0x02cf:
            r5 = 0
            goto L_0x0281
        L_0x02d1:
            if (r9 == 0) goto L_0x0253
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r9)     // Catch:{ Exception -> 0x036b }
            boolean r5 = r2.RemoteActionCompatParcelizer(r4, r9, r10)     // Catch:{ Exception -> 0x036b }
            boolean r8 = r2.asBinder(r4, r10)     // Catch:{ Exception -> 0x036b }
            boolean r12 = r1.read     // Catch:{ Exception -> 0x036b }
            if (r12 != 0) goto L_0x02e5
            if (r8 != 0) goto L_0x0253
        L_0x02e5:
            boolean r8 = r1.read     // Catch:{ Exception -> 0x036b }
            if (r8 == 0) goto L_0x02eb
            if (r5 == 0) goto L_0x0253
        L_0x02eb:
            boolean r5 = r2.RemoteActionCompatParcelizer(r3, r9, r10)     // Catch:{ Exception -> 0x036b }
            boolean r8 = r2.asBinder(r3, r10)     // Catch:{ Exception -> 0x036b }
            boolean r12 = r1.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x036b }
            if (r12 != 0) goto L_0x02f9
            if (r8 != 0) goto L_0x0253
        L_0x02f9:
            boolean r8 = r1.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x036b }
            if (r8 == 0) goto L_0x02ff
            if (r5 == 0) goto L_0x0253
        L_0x02ff:
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x036b }
            r12 = 29
            if (r8 < r12) goto L_0x030d
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x036b }
            r17 = r8
            r12 = 1
            goto L_0x0315
        L_0x030d:
            boolean r8 = asBinder((android.media.MediaCodecInfo) r0, (java.lang.String) r15)     // Catch:{ Exception -> 0x036b }
            r12 = 1
            r8 = r8 ^ r12
            r17 = r8
        L_0x0315:
            boolean r20 = asBinder((android.media.MediaCodecInfo) r0, (java.lang.String) r15)     // Catch:{ Exception -> 0x036b }
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x036b }
            r12 = 29
            if (r8 < r12) goto L_0x0324
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x036b }
            goto L_0x034b
        L_0x0324:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x036b }
            java.lang.String r0 = o.setOnBackInvokedDispatcher.AudioAttributesImplApi21Parcelizer((java.lang.String) r0)     // Catch:{ Exception -> 0x036b }
            java.lang.String r8 = "omx.google."
            boolean r8 = r0.startsWith(r8)     // Catch:{ Exception -> 0x036b }
            if (r8 != 0) goto L_0x0347
            java.lang.String r8 = "c2.android."
            boolean r8 = r0.startsWith(r8)     // Catch:{ Exception -> 0x036b }
            if (r8 != 0) goto L_0x0347
            java.lang.String r8 = "c2.google."
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x036b }
            if (r0 != 0) goto L_0x0347
            r21 = 1
            goto L_0x0349
        L_0x0347:
            r21 = 0
        L_0x0349:
            r0 = r21
        L_0x034b:
            if (r16 == 0) goto L_0x0351
            boolean r8 = r1.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x036b }
            if (r8 == r5) goto L_0x0357
        L_0x0351:
            if (r16 != 0) goto L_0x0371
            boolean r8 = r1.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x036b }
            if (r8 != 0) goto L_0x0371
        L_0x0357:
            r5 = 0
            r8 = r15
            r11 = r17
            r12 = r20
            r18 = r13
            r13 = r0
            r19 = r14
            r14 = r5
            o.createFromXmlInner r0 = o.createFromXmlInner.read(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0397 }
            r6.add(r0)     // Catch:{ Exception -> 0x0397 }
            goto L_0x03ac
        L_0x036b:
            r0 = move-exception
            r18 = r13
            r19 = r14
            goto L_0x0398
        L_0x0371:
            r18 = r13
            r19 = r14
            if (r16 != 0) goto L_0x03ac
            if (r5 == 0) goto L_0x03ac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0397 }
            r5.<init>()     // Catch:{ Exception -> 0x0397 }
            r5.append(r7)     // Catch:{ Exception -> 0x0397 }
            r5.append(r11)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x0397 }
            r14 = 1
            r8 = r15
            r11 = r17
            r12 = r20
            r13 = r0
            o.createFromXmlInner r0 = o.createFromXmlInner.read(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0397 }
            r6.add(r0)     // Catch:{ Exception -> 0x0397 }
            return r6
        L_0x0397:
            r0 = move-exception
        L_0x0398:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ Exception -> 0x03b3 }
            r7 = 23
            if (r5 > r7) goto L_0x03a8
            boolean r5 = r6.isEmpty()     // Catch:{ Exception -> 0x03b3 }
            if (r5 != 0) goto L_0x03a8
            o.findMenuItemForSubmenu.RemoteActionCompatParcelizer()     // Catch:{ Exception -> 0x03b3 }
            goto L_0x03ac
        L_0x03a8:
            o.findMenuItemForSubmenu.RemoteActionCompatParcelizer()     // Catch:{ Exception -> 0x03b3 }
            throw r0     // Catch:{ Exception -> 0x03b3 }
        L_0x03ac:
            int r13 = r18 + 1
            r14 = r19
            goto L_0x0018
        L_0x03b2:
            return r6
        L_0x03b3:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.asInterface(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$onTransact, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$asInterface):java.util.ArrayList");
    }

    private static boolean asBinder(MediaCodecInfo mediaCodecInfo, String str) {
        int indexOf;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = str.substring(0, indexOf);
        }
        if ("audio".equals(str2)) {
            return true;
        }
        String AudioAttributesImplApi21Parcelizer = setOnBackInvokedDispatcher.AudioAttributesImplApi21Parcelizer(mediaCodecInfo.getName());
        if (AudioAttributesImplApi21Parcelizer.startsWith("arc.")) {
            return false;
        }
        if (AudioAttributesImplApi21Parcelizer.startsWith("omx.google.") || AudioAttributesImplApi21Parcelizer.startsWith("omx.ffmpeg.") || ((AudioAttributesImplApi21Parcelizer.startsWith("omx.sec.") && AudioAttributesImplApi21Parcelizer.contains(".sw.")) || AudioAttributesImplApi21Parcelizer.equals("omx.qcom.video.decoder.hevcswvdec") || AudioAttributesImplApi21Parcelizer.startsWith("c2.android.") || AudioAttributesImplApi21Parcelizer.startsWith("c2.google.") || (!AudioAttributesImplApi21Parcelizer.startsWith("omx.") && !AudioAttributesImplApi21Parcelizer.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    private static Pair<Integer, Integer> asInterface(String str, String[] strArr) {
        if (strArr.length < 3) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        Matcher matcher = asInterface.matcher(strArr[1]);
        if (!matcher.matches()) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        Integer asBinder2 = asBinder(matcher.group(1));
        if (asBinder2 == null) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        Integer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(strArr[2]);
        if (RemoteActionCompatParcelizer2 != null) {
            return new Pair<>(asBinder2, RemoteActionCompatParcelizer2);
        }
        synchronized (findMenuItemForSubmenu.read) {
        }
        return null;
    }

    private static Pair<Integer, Integer> asBinder(String str, String[] strArr, onItemHoverEnter onitemhoverenter) {
        if (strArr.length < 4) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        int i = 1;
        Matcher matcher = asInterface.matcher(strArr[1]);
        if (!matcher.matches()) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (ExifInterface.GPS_MEASUREMENT_2D.equals(group)) {
                i = (onitemhoverenter == null || onitemhoverenter.write != 6) ? 2 : 4096;
            } else {
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            }
        }
        Integer asInterface2 = asInterface(strArr[3]);
        if (asInterface2 != null) {
            return new Pair<>(Integer.valueOf(i), asInterface2);
        }
        synchronized (findMenuItemForSubmenu.read) {
        }
        return null;
    }

    private static Pair<Integer, Integer> read(String str, String[] strArr) {
        int i;
        int i2;
        int i3 = 2;
        if (strArr.length < 2) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        int i4 = 1;
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                i2 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
            } else {
                findMenuItemForSubmenu.onTransact();
                return null;
            }
            if (i2 == 66) {
                i3 = 1;
            } else if (i2 != 77) {
                i3 = i2 != 88 ? i2 != 100 ? i2 != 110 ? i2 != 122 ? i2 != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
            }
            if (i3 == -1) {
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            }
            switch (i) {
                case 10:
                    break;
                case 11:
                    i4 = 4;
                    break;
                case 12:
                    i4 = 8;
                    break;
                case 13:
                    i4 = 16;
                    break;
                default:
                    switch (i) {
                        case 20:
                            i4 = 32;
                            break;
                        case 21:
                            i4 = 64;
                            break;
                        case 22:
                            i4 = 128;
                            break;
                        default:
                            switch (i) {
                                case 30:
                                    i4 = 256;
                                    break;
                                case 31:
                                    i4 = 512;
                                    break;
                                case 32:
                                    i4 = 1024;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                            i4 = 2048;
                                            break;
                                        case 41:
                                            i4 = 4096;
                                            break;
                                        case 42:
                                            i4 = 8192;
                                            break;
                                        default:
                                            switch (i) {
                                                case 50:
                                                    i4 = 16384;
                                                    break;
                                                case 51:
                                                    i4 = 32768;
                                                    break;
                                                case 52:
                                                    i4 = 65536;
                                                    break;
                                                default:
                                                    i4 = -1;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
            if (i4 != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
            }
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        } catch (NumberFormatException unused) {
            synchronized (findMenuItemForSubmenu.read) {
                return null;
            }
        }
    }

    private static Pair<Integer, Integer> onTransact(String str, String[] strArr) {
        if (strArr.length < 3) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        int i = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int i2 = parseInt != 0 ? parseInt != 1 ? parseInt != 2 ? parseInt != 3 ? -1 : 8 : 4 : 2 : 1;
            if (i2 == -1) {
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            }
            if (parseInt2 != 10) {
                if (parseInt2 == 11) {
                    i = 2;
                } else if (parseInt2 == 20) {
                    i = 4;
                } else if (parseInt2 == 21) {
                    i = 8;
                } else if (parseInt2 == 30) {
                    i = 16;
                } else if (parseInt2 == 31) {
                    i = 32;
                } else if (parseInt2 == 40) {
                    i = 64;
                } else if (parseInt2 == 41) {
                    i = 128;
                } else if (parseInt2 == 50) {
                    i = 256;
                } else if (parseInt2 != 51) {
                    switch (parseInt2) {
                        case 60:
                            i = 2048;
                            break;
                        case 61:
                            i = 4096;
                            break;
                        case 62:
                            i = 8192;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 512;
                }
            }
            if (i != -1) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
            }
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        } catch (NumberFormatException unused) {
            synchronized (findMenuItemForSubmenu.read) {
                return null;
            }
        }
    }

    private static Pair<Integer, Integer> read(String str, String[] strArr, onItemHoverEnter onitemhoverenter) {
        int i = 4;
        if (strArr.length < 4) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                int i2 = parseInt3 != 8 ? (onitemhoverenter == null || !(onitemhoverenter.AudioAttributesCompatParcelizer != null || onitemhoverenter.write == 7 || onitemhoverenter.write == 6)) ? 2 : 4096 : 1;
                switch (parseInt2) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 16;
                        break;
                    case 5:
                        i = 32;
                        break;
                    case 6:
                        i = 64;
                        break;
                    case 7:
                        i = 128;
                        break;
                    case 8:
                        i = 256;
                        break;
                    case 9:
                        i = 512;
                        break;
                    case 10:
                        i = 1024;
                        break;
                    case 11:
                        i = 2048;
                        break;
                    case 12:
                        i = 4096;
                        break;
                    case 13:
                        i = 8192;
                        break;
                    case 14:
                        i = 16384;
                        break;
                    case 15:
                        i = 32768;
                        break;
                    case 16:
                        i = 65536;
                        break;
                    case 17:
                        i = 131072;
                        break;
                    case 18:
                        i = 262144;
                        break;
                    case 19:
                        i = 524288;
                        break;
                    case 20:
                        i = 1048576;
                        break;
                    case 21:
                        i = 2097152;
                        break;
                    case 22:
                        i = 4194304;
                        break;
                    case 23:
                        i = 8388608;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
                }
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            } else {
                synchronized (findMenuItemForSubmenu.read) {
                }
                return null;
            }
        } catch (NumberFormatException unused) {
            synchronized (findMenuItemForSubmenu.read) {
                return null;
            }
        }
    }

    private static Pair<Integer, Integer> asBinder(String str, String[] strArr) {
        int i = 3;
        if (strArr.length != 3) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(createPopupWindow.onTransact(Integer.parseInt(strArr[1], 16)))) {
                int parseInt = Integer.parseInt(strArr[2]);
                if (parseInt == 17) {
                    i = 17;
                } else if (parseInt == 20) {
                    i = 20;
                } else if (parseInt == 23) {
                    i = 23;
                } else if (parseInt == 29) {
                    i = 29;
                } else if (parseInt == 39) {
                    i = 39;
                } else if (parseInt != 42) {
                    switch (parseInt) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 42;
                }
                if (i != -1) {
                    return new Pair<>(Integer.valueOf(i), 0);
                }
            }
        } catch (NumberFormatException unused) {
            synchronized (findMenuItemForSubmenu.read) {
            }
        }
        return null;
    }

    static final class RemoteActionCompatParcelizer implements asInterface {
        private final int asInterface;
        private MediaCodecInfo[] onTransact;

        public final boolean asInterface() {
            return true;
        }

        public RemoteActionCompatParcelizer(boolean z, boolean z2) {
            this.asInterface = (z || z2) ? 1 : 0;
        }

        public final boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public final boolean asBinder(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public final int read() {
            if (this.onTransact == null) {
                this.onTransact = new MediaCodecList(this.asInterface).getCodecInfos();
            }
            return this.onTransact.length;
        }

        public final MediaCodecInfo asInterface(int i) {
            if (this.onTransact == null) {
                this.onTransact = new MediaCodecList(this.asInterface).getCodecInfos();
            }
            return this.onTransact[i];
        }
    }

    static final class read implements asInterface {
        public final boolean asBinder(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public final boolean asInterface() {
            return false;
        }

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        public final int read() {
            return MediaCodecList.getCodecCount();
        }

        public final MediaCodecInfo asInterface(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public final boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    static final class onTransact {
        public final boolean RemoteActionCompatParcelizer;
        public final String onTransact;
        public final boolean read;

        public onTransact(String str, boolean z, boolean z2) {
            this.onTransact = str;
            this.RemoteActionCompatParcelizer = z;
            this.read = z2;
        }

        public final int hashCode() {
            int hashCode = this.onTransact.hashCode();
            int i = 1237;
            int i2 = this.RemoteActionCompatParcelizer ? 1231 : 1237;
            if (this.read) {
                i = 1231;
            }
            return ((((hashCode + 31) * 31) + i2) * 31) + i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != onTransact.class) {
                return false;
            }
            onTransact ontransact = (onTransact) obj;
            if (TextUtils.equals(this.onTransact, ontransact.onTransact) && this.RemoteActionCompatParcelizer == ontransact.RemoteActionCompatParcelizer && this.read == ontransact.read) {
                return true;
            }
            return false;
        }
    }

    private static Integer asInterface(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    private static Integer asBinder(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            default:
                return null;
        }
    }

    private static Integer RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        char c = 65535;
        switch (hashCode) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 8;
                    break;
                }
                break;
            default:
                switch (hashCode) {
                    case 1567:
                        if (str.equals("10")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            c = 12;
                            break;
                        }
                        break;
                }
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }
}
