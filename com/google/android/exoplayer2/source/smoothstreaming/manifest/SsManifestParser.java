package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import o.addSubMenuItem;
import o.expandItemActionView;
import o.getFlagsValues;
import o.getPanelState;
import o.isPowerSaveMode;
import o.onItemSelected;
import o.onNothingSelected;
import o.setMultiChoiceItems;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class SsManifestParser implements expandItemActionView.RemoteActionCompatParcelizer<addSubMenuItem> {
    private final XmlPullParserFactory read;

    public SsManifestParser() {
        try {
            this.read = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: RemoteActionCompatParcelizer */
    public addSubMenuItem onTransact(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.read.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (addSubMenuItem) new asInterface((RemoteActionCompatParcelizer) null, uri.toString()).RemoteActionCompatParcelizer(newPullParser);
        } catch (XmlPullParserException e) {
            throw new ParserException((String) null, e, true, 4);
        }
    }

    public static class MissingFieldException extends ParserException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public MissingFieldException(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Missing required field: "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 0
                r1 = 1
                r2 = 4
                r3.<init>(r4, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.MissingFieldException.<init>(java.lang.String):void");
        }
    }

    static abstract class RemoteActionCompatParcelizer {
        private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        private final List<Pair<String, Object>> asBinder = new LinkedList();
        private final String asInterface;
        private final String read;

        /* access modifiers changed from: protected */
        public void asBinder(XmlPullParser xmlPullParser) throws ParserException {
        }

        /* access modifiers changed from: protected */
        public void asInterface(Object obj) {
        }

        /* access modifiers changed from: protected */
        public void asInterface(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public abstract Object read();

        /* access modifiers changed from: protected */
        public void read(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public boolean read(String str) {
            return false;
        }

        public RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, String str2) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.asInterface = str;
            this.read = str2;
        }

        public final Object RemoteActionCompatParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.read.equals(name)) {
                        asBinder(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (read(name)) {
                            asBinder(xmlPullParser);
                        } else {
                            String str = this.asInterface;
                            if ("QualityLevel".equals(name)) {
                                remoteActionCompatParcelizer = new asBinder(this, str);
                            } else if ("Protection".equals(name)) {
                                remoteActionCompatParcelizer = new onTransact(this, str);
                            } else if ("StreamIndex".equals(name)) {
                                remoteActionCompatParcelizer = new read(this, str);
                            }
                            if (remoteActionCompatParcelizer == null) {
                                i = 1;
                            } else {
                                asInterface(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        read(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    asInterface(xmlPullParser);
                    if (!read(name2)) {
                        return read();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        public final void onTransact(String str, Object obj) {
            this.asBinder.add(Pair.create(str, obj));
        }

        /* access modifiers changed from: protected */
        public final Object asInterface(String str) {
            for (int i = 0; i < this.asBinder.size(); i++) {
                Pair pair = this.asBinder.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
            if (remoteActionCompatParcelizer == null) {
                return null;
            }
            return remoteActionCompatParcelizer.asInterface(str);
        }

        protected static int asInterface(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return -1;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException((String) null, e, true, 4);
            }
        }

        protected static int onTransact(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new ParserException((String) null, e, true, 4);
                }
            } else {
                throw new MissingFieldException(str);
            }
        }

        protected static long RemoteActionCompatParcelizer(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException((String) null, e, true, 4);
            }
        }

        protected static long asBinder(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new ParserException((String) null, e, true, 4);
                }
            } else {
                throw new MissingFieldException(str);
            }
        }
    }

    static class asInterface extends RemoteActionCompatParcelizer {
        private final List<addSubMenuItem.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new LinkedList();
        private int AudioAttributesImplApi26Parcelizer;
        private long IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private int asBinder;
        private long asInterface;
        private int onTransact = -1;
        private boolean read;
        private addSubMenuItem.asInterface write = null;

        public asInterface(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
            super(remoteActionCompatParcelizer, str, "SmoothStreamingMedia");
        }

        public final void asBinder(XmlPullParser xmlPullParser) throws ParserException {
            boolean z;
            this.asBinder = onTransact(xmlPullParser, "MajorVersion");
            this.AudioAttributesImplApi26Parcelizer = onTransact(xmlPullParser, "MinorVersion");
            this.IconCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, "TimeScale", 10000000);
            this.RemoteActionCompatParcelizer = asBinder(xmlPullParser, "Duration");
            this.asInterface = RemoteActionCompatParcelizer(xmlPullParser, "DVRWindowLength", 0);
            this.onTransact = asInterface(xmlPullParser, "LookaheadCount");
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "IsLive");
            if (attributeValue != null) {
                z = Boolean.parseBoolean(attributeValue);
            } else {
                z = false;
            }
            this.read = z;
            onTransact("TimeScale", (Object) Long.valueOf(this.IconCompatParcelizer));
        }

        public final void asInterface(Object obj) {
            if (obj instanceof addSubMenuItem.RemoteActionCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.add((addSubMenuItem.RemoteActionCompatParcelizer) obj);
            } else if (obj instanceof addSubMenuItem.asInterface) {
                if (this.write == null) {
                    this.write = (addSubMenuItem.asInterface) obj;
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public final Object read() {
            int size = this.AudioAttributesCompatParcelizer.size();
            addSubMenuItem.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = new addSubMenuItem.RemoteActionCompatParcelizer[size];
            this.AudioAttributesCompatParcelizer.toArray(remoteActionCompatParcelizerArr);
            if (this.write != null) {
                isPowerSaveMode ispowersavemode = new isPowerSaveMode(new isPowerSaveMode.asBinder(this.write.asBinder, "video/mp4", this.write.asInterface));
                for (int i = 0; i < size; i++) {
                    addSubMenuItem.RemoteActionCompatParcelizer remoteActionCompatParcelizer = remoteActionCompatParcelizerArr[i];
                    int i2 = remoteActionCompatParcelizer.IconCompatParcelizer;
                    if (i2 == 2 || i2 == 1) {
                        setMultiChoiceItems[] setmultichoiceitemsArr = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                        for (int i3 = 0; i3 < setmultichoiceitemsArr.length; i3++) {
                            setMultiChoiceItems.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new setMultiChoiceItems.RemoteActionCompatParcelizer(setmultichoiceitemsArr[i3], (byte) 0);
                            remoteActionCompatParcelizer2.write = ispowersavemode;
                            setmultichoiceitemsArr[i3] = new setMultiChoiceItems(remoteActionCompatParcelizer2, (byte) 0);
                        }
                    }
                }
            }
            return new addSubMenuItem(this.asBinder, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.asInterface, this.onTransact, this.read, this.write, remoteActionCompatParcelizerArr);
        }
    }

    static class onTransact extends RemoteActionCompatParcelizer {
        private byte[] RemoteActionCompatParcelizer;
        private UUID asInterface;
        private boolean read;

        public onTransact(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
            super(remoteActionCompatParcelizer, str, "Protection");
        }

        public final boolean read(String str) {
            return "ProtectionHeader".equals(str);
        }

        public final void asBinder(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.read = true;
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "SystemID");
                if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                    attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
                }
                this.asInterface = UUID.fromString(attributeValue);
            }
        }

        public final void read(XmlPullParser xmlPullParser) {
            if (this.read) {
                this.RemoteActionCompatParcelizer = Base64.decode(xmlPullParser.getText(), 0);
            }
        }

        public final void asInterface(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.read = false;
            }
        }

        public final Object read() {
            UUID uuid = this.asInterface;
            return new addSubMenuItem.asInterface(uuid, onItemSelected.asBinder(uuid, this.RemoteActionCompatParcelizer), new onNothingSelected[]{new onNothingSelected(true, (String) null, 8, RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer), 0, 0, (byte[]) null)});
        }

        private static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String obj = sb.toString();
            byte[] decode = Base64.decode(obj.substring(obj.indexOf("<KID>") + 5, obj.indexOf("</KID>")), 0);
            byte b = decode[0];
            decode[0] = decode[3];
            decode[3] = b;
            byte b2 = decode[1];
            decode[1] = decode[2];
            decode[2] = b2;
            byte b3 = decode[4];
            decode[4] = decode[5];
            decode[5] = b3;
            byte b4 = decode[6];
            decode[6] = decode[7];
            decode[7] = b4;
            return decode;
        }
    }

    static class read extends RemoteActionCompatParcelizer {
        private long AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private ArrayList<Long> AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int asBinder;
        private final List<setMultiChoiceItems> asInterface = new LinkedList();
        private String onConnectionFailed;
        private int onConnectionSuspended;
        private final String onTransact;
        private String read;
        private String setInternalConnectionCallback;
        private int write;

        public read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
            super(remoteActionCompatParcelizer, str, "StreamIndex");
            this.onTransact = str;
        }

        public final boolean read(String str) {
            return "c".equals(str);
        }

        public final void asBinder(XmlPullParser xmlPullParser) throws ParserException {
            int i = 1;
            if ("c".equals(xmlPullParser.getName())) {
                int size = this.AudioAttributesImplApi26Parcelizer.size();
                long RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(xmlPullParser, "t", -9223372036854775807L);
                if (RemoteActionCompatParcelizer2 == -9223372036854775807L) {
                    if (size == 0) {
                        RemoteActionCompatParcelizer2 = 0;
                    } else if (this.AudioAttributesCompatParcelizer != -1) {
                        RemoteActionCompatParcelizer2 = this.AudioAttributesCompatParcelizer + this.AudioAttributesImplApi26Parcelizer.get(size - 1).longValue();
                    } else {
                        throw new ParserException("Unable to infer start time", (Throwable) null, true, 4);
                    }
                }
                this.AudioAttributesImplApi26Parcelizer.add(Long.valueOf(RemoteActionCompatParcelizer2));
                this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(xmlPullParser, "d", -9223372036854775807L);
                long RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(xmlPullParser, "r", 1);
                if (RemoteActionCompatParcelizer3 <= 1 || this.AudioAttributesCompatParcelizer != -9223372036854775807L) {
                    while (true) {
                        long j = (long) i;
                        if (j < RemoteActionCompatParcelizer3) {
                            this.AudioAttributesImplApi26Parcelizer.add(Long.valueOf((this.AudioAttributesCompatParcelizer * j) + RemoteActionCompatParcelizer2));
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new ParserException("Repeated chunk with unspecified duration", (Throwable) null, true, 4);
                }
            } else {
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
                if (attributeValue != null) {
                    if (!"audio".equalsIgnoreCase(attributeValue)) {
                        if ("video".equalsIgnoreCase(attributeValue)) {
                            i = 2;
                        } else if ("text".equalsIgnoreCase(attributeValue)) {
                            i = 3;
                        } else {
                            StringBuilder sb = new StringBuilder("Invalid key value[");
                            sb.append(attributeValue);
                            sb.append("]");
                            throw new ParserException(sb.toString(), (Throwable) null, true, 4);
                        }
                    }
                    this.onConnectionSuspended = i;
                    onTransact("Type", (Object) Integer.valueOf(i));
                    if (this.onConnectionSuspended == 3) {
                        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "Subtype");
                        if (attributeValue2 != null) {
                            this.onConnectionFailed = attributeValue2;
                        } else {
                            throw new MissingFieldException("Subtype");
                        }
                    } else {
                        this.onConnectionFailed = xmlPullParser.getAttributeValue((String) null, "Subtype");
                    }
                    onTransact("Subtype", (Object) this.onConnectionFailed);
                    String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "Name");
                    this.AudioAttributesImplApi21Parcelizer = attributeValue3;
                    onTransact("Name", (Object) attributeValue3);
                    String attributeValue4 = xmlPullParser.getAttributeValue((String) null, "Url");
                    if (attributeValue4 != null) {
                        this.setInternalConnectionCallback = attributeValue4;
                        this.write = asInterface(xmlPullParser, "MaxWidth");
                        this.IconCompatParcelizer = asInterface(xmlPullParser, "MaxHeight");
                        this.RemoteActionCompatParcelizer = asInterface(xmlPullParser, "DisplayWidth");
                        this.asBinder = asInterface(xmlPullParser, "DisplayHeight");
                        String attributeValue5 = xmlPullParser.getAttributeValue((String) null, "Language");
                        this.read = attributeValue5;
                        onTransact("Language", (Object) attributeValue5);
                        long asInterface2 = (long) asInterface(xmlPullParser, "TimeScale");
                        this.AudioAttributesImplBaseParcelizer = asInterface2;
                        if (asInterface2 == -1) {
                            this.AudioAttributesImplBaseParcelizer = ((Long) asInterface("TimeScale")).longValue();
                        }
                        this.AudioAttributesImplApi26Parcelizer = new ArrayList<>();
                        return;
                    }
                    throw new MissingFieldException("Url");
                }
                throw new MissingFieldException("Type");
            }
        }

        public final void asInterface(Object obj) {
            if (obj instanceof setMultiChoiceItems) {
                this.asInterface.add((setMultiChoiceItems) obj);
            }
        }

        public final Object read() {
            setMultiChoiceItems[] setmultichoiceitemsArr = new setMultiChoiceItems[this.asInterface.size()];
            this.asInterface.toArray(setmultichoiceitemsArr);
            addSubMenuItem.RemoteActionCompatParcelizer remoteActionCompatParcelizer = r2;
            addSubMenuItem.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new addSubMenuItem.RemoteActionCompatParcelizer(this.onTransact, this.setInternalConnectionCallback, this.onConnectionSuspended, this.onConnectionFailed, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.asBinder, this.read, setmultichoiceitemsArr, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer);
            return remoteActionCompatParcelizer;
        }
    }

    static class asBinder extends RemoteActionCompatParcelizer {
        private setMultiChoiceItems asInterface;

        public asBinder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
            super(remoteActionCompatParcelizer, str, "QualityLevel");
        }

        public final void asBinder(XmlPullParser xmlPullParser) throws ParserException {
            String str;
            int i;
            setMultiChoiceItems.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new setMultiChoiceItems.RemoteActionCompatParcelizer();
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "FourCC");
            if (attributeValue != null) {
                if (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) {
                    str = "video/avc";
                } else {
                    str = (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
                }
                int intValue = ((Integer) asInterface("Type")).intValue();
                if (intValue == 2) {
                    List<byte[]> onTransact = onTransact(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                    remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = "video/mp4";
                    remoteActionCompatParcelizer.createFullyDrawnExecutor = onTransact(xmlPullParser, "MaxWidth");
                    remoteActionCompatParcelizer.onConnected = onTransact(xmlPullParser, "MaxHeight");
                    remoteActionCompatParcelizer.onConnectionFailed = onTransact;
                } else if (intValue == 1) {
                    if (str == null) {
                        str = "audio/mp4a-latm";
                    }
                    int onTransact2 = onTransact(xmlPullParser, "Channels");
                    int onTransact3 = onTransact(xmlPullParser, "SamplingRate");
                    List<byte[]> onTransact4 = onTransact(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                    if (onTransact4.isEmpty() && "audio/mp4a-latm".equals(str)) {
                        int i2 = 0;
                        int i3 = -1;
                        while (true) {
                            int[] iArr = getPanelState.read;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            if (onTransact3 == iArr[i2]) {
                                i3 = i2;
                            }
                            i2++;
                        }
                        int i4 = 0;
                        int i5 = -1;
                        while (true) {
                            int[] iArr2 = getPanelState.onTransact;
                            if (i4 >= iArr2.length) {
                                break;
                            }
                            if (onTransact2 == iArr2[i4]) {
                                i5 = i4;
                            }
                            i4++;
                        }
                        if (onTransact3 == -1 || i5 == -1) {
                            StringBuilder sb = new StringBuilder("Invalid sample rate or number of channels: ");
                            sb.append(onTransact3);
                            sb.append(", ");
                            sb.append(onTransact2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        onTransact4 = Collections.singletonList(getPanelState.asBinder(2, i3, i5));
                    }
                    remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = "audio/mp4";
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer = onTransact2;
                    remoteActionCompatParcelizer.ParcelableVolumeInfo = onTransact3;
                    remoteActionCompatParcelizer.onConnectionFailed = onTransact4;
                } else if (intValue == 3) {
                    String str2 = (String) asInterface("Subtype");
                    if (str2 != null) {
                        str2.hashCode();
                        if (str2.equals("CAPT")) {
                            i = 64;
                        } else if (str2.equals("DESC")) {
                            i = 1024;
                        }
                        remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = "application/mp4";
                        remoteActionCompatParcelizer.RatingCompat = i;
                    }
                    i = 0;
                    remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = "application/mp4";
                    remoteActionCompatParcelizer.RatingCompat = i;
                } else {
                    remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = "application/mp4";
                }
                remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = xmlPullParser.getAttributeValue((String) null, "Index");
                remoteActionCompatParcelizer.onConnectionSuspended = (String) asInterface("Name");
                remoteActionCompatParcelizer.MediaMetadataCompat = str;
                remoteActionCompatParcelizer.asInterface = onTransact(xmlPullParser, "Bitrate");
                remoteActionCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = (String) asInterface("Language");
                this.asInterface = new setMultiChoiceItems(remoteActionCompatParcelizer, (byte) 0);
                return;
            }
            throw new MissingFieldException("FourCC");
        }

        public final Object read() {
            return this.asInterface;
        }

        private static List<byte[]> onTransact(String str) {
            byte[][] bArr;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                int length = str.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i << 1;
                    bArr2[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
                }
                if (!getFlagsValues.onTransact.RemoteActionCompatParcelizer(bArr2, 0)) {
                    bArr = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    do {
                        arrayList2.add(Integer.valueOf(i3));
                        i3 += getFlagsValues.onTransact.read.length;
                        int length2 = getFlagsValues.onTransact.read.length;
                        while (true) {
                            if (i3 > length - length2) {
                                i3 = -1;
                                continue;
                                break;
                            } else if (getFlagsValues.onTransact.RemoteActionCompatParcelizer(bArr2, i3)) {
                                continue;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } while (i3 != -1);
                    byte[][] bArr3 = new byte[arrayList2.size()][];
                    int i4 = 0;
                    while (i4 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i4)).intValue();
                        int intValue2 = (i4 < arrayList2.size() + -1 ? ((Integer) arrayList2.get(i4 + 1)).intValue() : length) - intValue;
                        byte[] bArr4 = new byte[intValue2];
                        System.arraycopy(bArr2, intValue, bArr4, 0, intValue2);
                        bArr3[i4] = bArr4;
                        i4++;
                    }
                    bArr = bArr3;
                }
                if (bArr == null) {
                    arrayList.add(bArr2);
                } else {
                    Collections.addAll(arrayList, bArr);
                }
            }
            return arrayList;
        }
    }
}
