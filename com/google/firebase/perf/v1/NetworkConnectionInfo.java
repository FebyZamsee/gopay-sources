package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.measureNullChild;

public final class NetworkConnectionInfo extends GeneratedMessageLite<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
    /* access modifiers changed from: private */
    public static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<NetworkConnectionInfo> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    private NetworkConnectionInfo() {
    }

    public enum NetworkType implements measureNullChild.read {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        
        private static final measureNullChild.asInterface<NetworkType> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new measureNullChild.asInterface<NetworkType>() {
                public NetworkType findValueByNumber(int i) {
                    return NetworkType.forNumber(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static NetworkType forNumber(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
            return NetworkTypeVerifier.INSTANCE;
        }

        static final class NetworkTypeVerifier implements measureNullChild.RemoteActionCompatParcelizer {
            static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

            private NetworkTypeVerifier() {
            }

            static {
                INSTANCE = new NetworkTypeVerifier();
            }

            public final boolean isInRange(int i) {
                return NetworkType.forNumber(i) != null;
            }
        }

        private NetworkType(int i) {
            this.value = i;
        }
    }

    public enum MobileSubtype implements measureNullChild.read {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final measureNullChild.asInterface<MobileSubtype> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new measureNullChild.asInterface<MobileSubtype>() {
                public MobileSubtype findValueByNumber(int i) {
                    return MobileSubtype.forNumber(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static MobileSubtype forNumber(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
            return MobileSubtypeVerifier.INSTANCE;
        }

        static final class MobileSubtypeVerifier implements measureNullChild.RemoteActionCompatParcelizer {
            static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

            private MobileSubtypeVerifier() {
            }

            static {
                INSTANCE = new MobileSubtypeVerifier();
            }

            public final boolean isInRange(int i) {
                return MobileSubtype.forNumber(i) != null;
            }
        }

        private MobileSubtype(int i) {
            this.value = i;
        }
    }

    public final boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public final NetworkType getNetworkType() {
        NetworkType forNumber = NetworkType.forNumber(this.networkType_);
        return forNumber == null ? NetworkType.NONE : forNumber;
    }

    /* access modifiers changed from: private */
    public void setNetworkType(NetworkType networkType) {
        this.networkType_ = networkType.getNumber();
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public final boolean hasMobileSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public final MobileSubtype getMobileSubtype() {
        MobileSubtype forNumber = MobileSubtype.forNumber(this.mobileSubtype_);
        return forNumber == null ? MobileSubtype.UNKNOWN_MOBILE_SUBTYPE : forNumber;
    }

    /* access modifiers changed from: private */
    public void setMobileSubtype(MobileSubtype mobileSubtype) {
        this.mobileSubtype_ = mobileSubtype.getNumber();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static NetworkConnectionInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static NetworkConnectionInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkConnectionInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static NetworkConnectionInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static NetworkConnectionInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(NetworkConnectionInfo.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer[] r0 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.NetworkConnectionInfo.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new NetworkConnectionInfo();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "networkType_", NetworkType.internalGetVerifier(), "mobileSubtype_", MobileSubtype.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<NetworkConnectionInfo> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (NetworkConnectionInfo.class) {
                    getanimationstyle = PARSER;
                    if (getanimationstyle == null) {
                        getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                        PARSER = getanimationstyle;
                    }
                }
                return getanimationstyle;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        GeneratedMessageLite.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<NetworkConnectionInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
