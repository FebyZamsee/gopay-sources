package com.google.rpc.context;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setOnItemClickListener;
import o.setVerticalGravity;
import o.setWeightSum;

public final class AttributeContext extends GeneratedMessageLite<AttributeContext, asInterface> implements layoutHorizontal {
    public static final int API_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile getAnimationStyle<AttributeContext> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;

    private AttributeContext() {
    }

    public static final class Peer extends GeneratedMessageLite<Peer, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final Peer DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile getAnimationStyle<Peer> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_ = "";
        private setWeightSum<String, String> labels_ = setWeightSum.asInterface();
        private long port_;
        private String principal_ = "";
        private String regionCode_ = "";

        static final class read {
            static final setVerticalGravity<String, String> asInterface = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
        }

        private Peer() {
        }

        public final String getIp() {
            return this.ip_;
        }

        public final getBaseline getIpBytes() {
            return getBaseline.asBinder(this.ip_);
        }

        /* access modifiers changed from: private */
        public void setIp(String str) {
            this.ip_ = str;
        }

        /* access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        /* access modifiers changed from: private */
        public void setIpBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.ip_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final long getPort() {
            return this.port_;
        }

        /* access modifiers changed from: private */
        public void setPort(long j) {
            this.port_ = j;
        }

        /* access modifiers changed from: private */
        public void clearPort() {
            this.port_ = 0;
        }

        private setWeightSum<String, String> internalGetLabels() {
            return this.labels_;
        }

        private setWeightSum<String, String> internalGetMutableLabels() {
            if (!this.labels_.asBinder) {
                setWeightSum<String, String> setweightsum = this.labels_;
                this.labels_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
            }
            return this.labels_;
        }

        public final int getLabelsCount() {
            return internalGetLabels().size();
        }

        public final boolean containsLabels(String str) {
            return internalGetLabels().containsKey(str);
        }

        @Deprecated
        public final Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public final Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public final String getLabelsOrDefault(String str, String str2) {
            setWeightSum<String, String> internalGetLabels = internalGetLabels();
            return internalGetLabels.containsKey(str) ? internalGetLabels.get(str) : str2;
        }

        public final String getLabelsOrThrow(String str) {
            setWeightSum<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        public final String getPrincipal() {
            return this.principal_;
        }

        public final getBaseline getPrincipalBytes() {
            return getBaseline.asBinder(this.principal_);
        }

        /* access modifiers changed from: private */
        public void setPrincipal(String str) {
            this.principal_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* access modifiers changed from: private */
        public void setPrincipalBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.principal_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getRegionCode() {
            return this.regionCode_;
        }

        public final getBaseline getRegionCodeBytes() {
            return getBaseline.asBinder(this.regionCode_);
        }

        /* access modifiers changed from: private */
        public void setRegionCode(String str) {
            this.regionCode_ = str;
        }

        /* access modifiers changed from: private */
        public void clearRegionCode() {
            this.regionCode_ = getDefaultInstance().getRegionCode();
        }

        /* access modifiers changed from: private */
        public void setRegionCodeBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.regionCode_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Peer parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Peer parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Peer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Peer parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Peer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Peer parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Peer parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(Peer peer) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(peer);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Peer, RemoteActionCompatParcelizer> implements layoutHorizontal {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(Peer.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Peer();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", read.asInterface, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Peer> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Peer.class) {
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
            Peer peer = new Peer();
            DEFAULT_INSTANCE = peer;
            GeneratedMessageLite.registerDefaultInstance(Peer.class, peer);
        }

        public static Peer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Peer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] asBinder;

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
                asBinder = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.context.AttributeContext.AnonymousClass5.<clinit>():void");
        }
    }

    public static final class Api extends GeneratedMessageLite<Api, read> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final Api DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<Api> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_ = "";
        private String protocol_ = "";
        private String service_ = "";
        private String version_ = "";

        private Api() {
        }

        public final String getService() {
            return this.service_;
        }

        public final getBaseline getServiceBytes() {
            return getBaseline.asBinder(this.service_);
        }

        /* access modifiers changed from: private */
        public void setService(String str) {
            this.service_ = str;
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* access modifiers changed from: private */
        public void setServiceBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.service_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getOperation() {
            return this.operation_;
        }

        public final getBaseline getOperationBytes() {
            return getBaseline.asBinder(this.operation_);
        }

        /* access modifiers changed from: private */
        public void setOperation(String str) {
            this.operation_ = str;
        }

        /* access modifiers changed from: private */
        public void clearOperation() {
            this.operation_ = getDefaultInstance().getOperation();
        }

        /* access modifiers changed from: private */
        public void setOperationBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.operation_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getProtocol() {
            return this.protocol_;
        }

        public final getBaseline getProtocolBytes() {
            return getBaseline.asBinder(this.protocol_);
        }

        /* access modifiers changed from: private */
        public void setProtocol(String str) {
            this.protocol_ = str;
        }

        /* access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* access modifiers changed from: private */
        public void setProtocolBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.protocol_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getVersion() {
            return this.version_;
        }

        public final getBaseline getVersionBytes() {
            return getBaseline.asBinder(this.version_);
        }

        /* access modifiers changed from: private */
        public void setVersion(String str) {
            this.version_ = str;
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        /* access modifiers changed from: private */
        public void setVersionBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.version_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Api parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Api parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Api parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Api parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Api parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(Api api) {
            return (read) DEFAULT_INSTANCE.createBuilder(api);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Api, read> implements layoutHorizontal {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(Api.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Api();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Api> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Api.class) {
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
            Api api = new Api();
            DEFAULT_INSTANCE = api;
            GeneratedMessageLite.registerDefaultInstance(Api.class, api);
        }

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Api> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Auth extends GeneratedMessageLite<Auth, read> implements layoutHorizontal {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Auth DEFAULT_INSTANCE;
        private static volatile getAnimationStyle<Auth> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private measureNullChild.AudioAttributesCompatParcelizer<String> accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<String> audiences_ = GeneratedMessageLite.emptyProtobufList();
        private Struct claims_;
        private String presenter_ = "";
        private String principal_ = "";

        private Auth() {
        }

        public final String getPrincipal() {
            return this.principal_;
        }

        public final getBaseline getPrincipalBytes() {
            return getBaseline.asBinder(this.principal_);
        }

        /* access modifiers changed from: private */
        public void setPrincipal(String str) {
            this.principal_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* access modifiers changed from: private */
        public void setPrincipalBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.principal_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final List<String> getAudiencesList() {
            return this.audiences_;
        }

        public final int getAudiencesCount() {
            return this.audiences_.size();
        }

        public final String getAudiences(int i) {
            return (String) this.audiences_.get(i);
        }

        public final getBaseline getAudiencesBytes(int i) {
            return getBaseline.asBinder((String) this.audiences_.get(i));
        }

        private void ensureAudiencesIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.audiences_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.audiences_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setAudiences(int i, String str) {
            ensureAudiencesIsMutable();
            this.audiences_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addAudiences(String str) {
            ensureAudiencesIsMutable();
            this.audiences_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllAudiences(Iterable<String> iterable) {
            ensureAudiencesIsMutable();
            onLongPress.addAll(iterable, this.audiences_);
        }

        /* access modifiers changed from: private */
        public void clearAudiences() {
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addAudiencesBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            ensureAudiencesIsMutable();
            this.audiences_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public final String getPresenter() {
            return this.presenter_;
        }

        public final getBaseline getPresenterBytes() {
            return getBaseline.asBinder(this.presenter_);
        }

        /* access modifiers changed from: private */
        public void setPresenter(String str) {
            this.presenter_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPresenter() {
            this.presenter_ = getDefaultInstance().getPresenter();
        }

        /* access modifiers changed from: private */
        public void setPresenterBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.presenter_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final boolean hasClaims() {
            return this.claims_ != null;
        }

        public final Struct getClaims() {
            Struct struct = this.claims_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        /* access modifiers changed from: private */
        public void setClaims(Struct struct) {
            this.claims_ = struct;
        }

        /* access modifiers changed from: private */
        public void mergeClaims(Struct struct) {
            Struct struct2 = this.claims_;
            if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
                this.claims_ = struct;
            } else {
                this.claims_ = (Struct) ((Struct.asBinder) Struct.newBuilder(this.claims_).mergeFrom(struct)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearClaims() {
            this.claims_ = null;
        }

        public final List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        public final int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        public final String getAccessLevels(int i) {
            return (String) this.accessLevels_.get(i);
        }

        public final getBaseline getAccessLevelsBytes(int i) {
            return getBaseline.asBinder((String) this.accessLevels_.get(i));
        }

        private void ensureAccessLevelsIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.accessLevels_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.accessLevels_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setAccessLevels(int i, String str) {
            ensureAccessLevelsIsMutable();
            this.accessLevels_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addAccessLevels(String str) {
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllAccessLevels(Iterable<String> iterable) {
            ensureAccessLevelsIsMutable();
            onLongPress.addAll(iterable, this.accessLevels_);
        }

        /* access modifiers changed from: private */
        public void clearAccessLevels() {
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addAccessLevelsBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Auth parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Auth parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Auth) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Auth parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Auth parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(Auth auth) {
            return (read) DEFAULT_INSTANCE.createBuilder(auth);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Auth, read> implements layoutHorizontal {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(Auth.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Auth> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Auth.class) {
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
            Auth auth = new Auth();
            DEFAULT_INSTANCE = auth;
            GeneratedMessageLite.registerDefaultInstance(Auth.class, auth);
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Auth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Request extends GeneratedMessageLite<Request, read> implements layoutHorizontal {
        public static final int AUTH_FIELD_NUMBER = 13;
        /* access modifiers changed from: private */
        public static final Request DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<Request> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private setWeightSum<String, String> headers_ = setWeightSum.asInterface();
        private String host_ = "";
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String protocol_ = "";
        private String query_ = "";
        private String reason_ = "";
        private String scheme_ = "";
        private long size_;
        private Timestamp time_;

        static final class asInterface {
            static final setVerticalGravity<String, String> RemoteActionCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
        }

        private Request() {
        }

        public final String getId() {
            return this.id_;
        }

        public final getBaseline getIdBytes() {
            return getBaseline.asBinder(this.id_);
        }

        /* access modifiers changed from: private */
        public void setId(String str) {
            this.id_ = str;
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* access modifiers changed from: private */
        public void setIdBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.id_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getMethod() {
            return this.method_;
        }

        public final getBaseline getMethodBytes() {
            return getBaseline.asBinder(this.method_);
        }

        /* access modifiers changed from: private */
        public void setMethod(String str) {
            this.method_ = str;
        }

        /* access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* access modifiers changed from: private */
        public void setMethodBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.method_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        private setWeightSum<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private setWeightSum<String, String> internalGetMutableHeaders() {
            if (!this.headers_.asBinder) {
                setWeightSum<String, String> setweightsum = this.headers_;
                this.headers_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
            }
            return this.headers_;
        }

        public final int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public final boolean containsHeaders(String str) {
            return internalGetHeaders().containsKey(str);
        }

        @Deprecated
        public final Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public final Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public final String getHeadersOrDefault(String str, String str2) {
            setWeightSum<String, String> internalGetHeaders = internalGetHeaders();
            return internalGetHeaders.containsKey(str) ? internalGetHeaders.get(str) : str2;
        }

        public final String getHeadersOrThrow(String str) {
            setWeightSum<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        public final String getPath() {
            return this.path_;
        }

        public final getBaseline getPathBytes() {
            return getBaseline.asBinder(this.path_);
        }

        /* access modifiers changed from: private */
        public void setPath(String str) {
            this.path_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* access modifiers changed from: private */
        public void setPathBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.path_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getHost() {
            return this.host_;
        }

        public final getBaseline getHostBytes() {
            return getBaseline.asBinder(this.host_);
        }

        /* access modifiers changed from: private */
        public void setHost(String str) {
            this.host_ = str;
        }

        /* access modifiers changed from: private */
        public void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        /* access modifiers changed from: private */
        public void setHostBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.host_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getScheme() {
            return this.scheme_;
        }

        public final getBaseline getSchemeBytes() {
            return getBaseline.asBinder(this.scheme_);
        }

        /* access modifiers changed from: private */
        public void setScheme(String str) {
            this.scheme_ = str;
        }

        /* access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        /* access modifiers changed from: private */
        public void setSchemeBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.scheme_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getQuery() {
            return this.query_;
        }

        public final getBaseline getQueryBytes() {
            return getBaseline.asBinder(this.query_);
        }

        /* access modifiers changed from: private */
        public void setQuery(String str) {
            this.query_ = str;
        }

        /* access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* access modifiers changed from: private */
        public void setQueryBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.query_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final boolean hasTime() {
            return this.time_ != null;
        }

        public final Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            this.time_ = timestamp;
        }

        /* access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            Timestamp timestamp2 = this.time_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.time_ = timestamp;
            } else {
                this.time_ = (Timestamp) ((Timestamp.asInterface) Timestamp.newBuilder(this.time_).mergeFrom(timestamp)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public final long getSize() {
            return this.size_;
        }

        /* access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        public final String getProtocol() {
            return this.protocol_;
        }

        public final getBaseline getProtocolBytes() {
            return getBaseline.asBinder(this.protocol_);
        }

        /* access modifiers changed from: private */
        public void setProtocol(String str) {
            this.protocol_ = str;
        }

        /* access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* access modifiers changed from: private */
        public void setProtocolBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.protocol_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getReason() {
            return this.reason_;
        }

        public final getBaseline getReasonBytes() {
            return getBaseline.asBinder(this.reason_);
        }

        /* access modifiers changed from: private */
        public void setReason(String str) {
            this.reason_ = str;
        }

        /* access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* access modifiers changed from: private */
        public void setReasonBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.reason_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final boolean hasAuth() {
            return this.auth_ != null;
        }

        public final Auth getAuth() {
            Auth auth = this.auth_;
            return auth == null ? Auth.getDefaultInstance() : auth;
        }

        /* access modifiers changed from: private */
        public void setAuth(Auth auth) {
            this.auth_ = auth;
        }

        /* access modifiers changed from: private */
        public void mergeAuth(Auth auth) {
            Auth auth2 = this.auth_;
            if (auth2 == null || auth2 == Auth.getDefaultInstance()) {
                this.auth_ = auth;
            } else {
                this.auth_ = (Auth) ((Auth.read) Auth.newBuilder(this.auth_).mergeFrom(auth)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = null;
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Request parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Request parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Request parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Request parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Request parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(Request request) {
            return (read) DEFAULT_INSTANCE.createBuilder(request);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Request, read> implements layoutHorizontal {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(Request.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Request();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000bȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", asInterface.RemoteActionCompatParcelizer, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Request> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Request.class) {
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
            Request request = new Request();
            DEFAULT_INSTANCE = request;
            GeneratedMessageLite.registerDefaultInstance(Request.class, request);
        }

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Request> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Response extends GeneratedMessageLite<Response, read> implements layoutHorizontal {
        public static final int CODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Response DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<Response> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private setWeightSum<String, String> headers_ = setWeightSum.asInterface();
        private long size_;
        private Timestamp time_;

        static final class onTransact {
            static final setVerticalGravity<String, String> asInterface = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
        }

        private Response() {
        }

        public final long getCode() {
            return this.code_;
        }

        /* access modifiers changed from: private */
        public void setCode(long j) {
            this.code_ = j;
        }

        /* access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        public final long getSize() {
            return this.size_;
        }

        /* access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        private setWeightSum<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private setWeightSum<String, String> internalGetMutableHeaders() {
            if (!this.headers_.asBinder) {
                setWeightSum<String, String> setweightsum = this.headers_;
                this.headers_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
            }
            return this.headers_;
        }

        public final int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public final boolean containsHeaders(String str) {
            return internalGetHeaders().containsKey(str);
        }

        @Deprecated
        public final Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public final Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public final String getHeadersOrDefault(String str, String str2) {
            setWeightSum<String, String> internalGetHeaders = internalGetHeaders();
            return internalGetHeaders.containsKey(str) ? internalGetHeaders.get(str) : str2;
        }

        public final String getHeadersOrThrow(String str) {
            setWeightSum<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        public final boolean hasTime() {
            return this.time_ != null;
        }

        public final Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            this.time_ = timestamp;
        }

        /* access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            Timestamp timestamp2 = this.time_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.time_ = timestamp;
            } else {
                this.time_ = (Timestamp) ((Timestamp.asInterface) Timestamp.newBuilder(this.time_).mergeFrom(timestamp)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Response parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Response parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Response parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Response) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Response parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Response parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(Response response) {
            return (read) DEFAULT_INSTANCE.createBuilder(response);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Response, read> implements layoutHorizontal {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(Response.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Response();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", onTransact.asInterface, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Response> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Response.class) {
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
            Response response = new Response();
            DEFAULT_INSTANCE = response;
            GeneratedMessageLite.registerDefaultInstance(Response.class, response);
        }

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Response> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Resource extends GeneratedMessageLite<Resource, asBinder> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final Resource DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<Resource> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private setWeightSum<String, String> labels_ = setWeightSum.asInterface();
        private String name_ = "";
        private String service_ = "";
        private String type_ = "";

        static final class RemoteActionCompatParcelizer {
            static final setVerticalGravity<String, String> asBinder = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
        }

        private Resource() {
        }

        public final String getService() {
            return this.service_;
        }

        public final getBaseline getServiceBytes() {
            return getBaseline.asBinder(this.service_);
        }

        /* access modifiers changed from: private */
        public void setService(String str) {
            this.service_ = str;
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* access modifiers changed from: private */
        public void setServiceBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.service_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getType() {
            return this.type_;
        }

        public final getBaseline getTypeBytes() {
            return getBaseline.asBinder(this.type_);
        }

        /* access modifiers changed from: private */
        public void setType(String str) {
            this.type_ = str;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* access modifiers changed from: private */
        public void setTypeBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.type_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        private setWeightSum<String, String> internalGetLabels() {
            return this.labels_;
        }

        private setWeightSum<String, String> internalGetMutableLabels() {
            if (!this.labels_.asBinder) {
                setWeightSum<String, String> setweightsum = this.labels_;
                this.labels_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
            }
            return this.labels_;
        }

        public final int getLabelsCount() {
            return internalGetLabels().size();
        }

        public final boolean containsLabels(String str) {
            return internalGetLabels().containsKey(str);
        }

        @Deprecated
        public final Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public final Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public final String getLabelsOrDefault(String str, String str2) {
            setWeightSum<String, String> internalGetLabels = internalGetLabels();
            return internalGetLabels.containsKey(str) ? internalGetLabels.get(str) : str2;
        }

        public final String getLabelsOrThrow(String str) {
            setWeightSum<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Resource parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Resource parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Resource) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Resource parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Resource parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(Resource resource) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(resource);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Resource, asBinder> implements layoutHorizontal {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(Resource.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", RemoteActionCompatParcelizer.asBinder});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Resource> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Resource.class) {
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
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            GeneratedMessageLite.registerDefaultInstance(Resource.class, resource);
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public final boolean hasOrigin() {
        return this.origin_ != null;
    }

    public final Peer getOrigin() {
        Peer peer = this.origin_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    /* access modifiers changed from: private */
    public void setOrigin(Peer peer) {
        this.origin_ = peer;
    }

    /* access modifiers changed from: private */
    public void mergeOrigin(Peer peer) {
        Peer peer2 = this.origin_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.origin_ = peer;
        } else {
            this.origin_ = (Peer) ((Peer.RemoteActionCompatParcelizer) Peer.newBuilder(this.origin_).mergeFrom(peer)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
    }

    public final boolean hasSource() {
        return this.source_ != null;
    }

    public final Peer getSource() {
        Peer peer = this.source_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    /* access modifiers changed from: private */
    public void setSource(Peer peer) {
        this.source_ = peer;
    }

    /* access modifiers changed from: private */
    public void mergeSource(Peer peer) {
        Peer peer2 = this.source_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.source_ = peer;
        } else {
            this.source_ = (Peer) ((Peer.RemoteActionCompatParcelizer) Peer.newBuilder(this.source_).mergeFrom(peer)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearSource() {
        this.source_ = null;
    }

    public final boolean hasDestination() {
        return this.destination_ != null;
    }

    public final Peer getDestination() {
        Peer peer = this.destination_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    /* access modifiers changed from: private */
    public void setDestination(Peer peer) {
        this.destination_ = peer;
    }

    /* access modifiers changed from: private */
    public void mergeDestination(Peer peer) {
        Peer peer2 = this.destination_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.destination_ = peer;
        } else {
            this.destination_ = (Peer) ((Peer.RemoteActionCompatParcelizer) Peer.newBuilder(this.destination_).mergeFrom(peer)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
    }

    public final boolean hasRequest() {
        return this.request_ != null;
    }

    public final Request getRequest() {
        Request request = this.request_;
        return request == null ? Request.getDefaultInstance() : request;
    }

    /* access modifiers changed from: private */
    public void setRequest(Request request) {
        this.request_ = request;
    }

    /* access modifiers changed from: private */
    public void mergeRequest(Request request) {
        Request request2 = this.request_;
        if (request2 == null || request2 == Request.getDefaultInstance()) {
            this.request_ = request;
        } else {
            this.request_ = (Request) ((Request.read) Request.newBuilder(this.request_).mergeFrom(request)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    public final boolean hasResponse() {
        return this.response_ != null;
    }

    public final Response getResponse() {
        Response response = this.response_;
        return response == null ? Response.getDefaultInstance() : response;
    }

    /* access modifiers changed from: private */
    public void setResponse(Response response) {
        this.response_ = response;
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Response response) {
        Response response2 = this.response_;
        if (response2 == null || response2 == Response.getDefaultInstance()) {
            this.response_ = response;
        } else {
            this.response_ = (Response) ((Response.read) Response.newBuilder(this.response_).mergeFrom(response)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    public final boolean hasResource() {
        return this.resource_ != null;
    }

    public final Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    /* access modifiers changed from: private */
    public void setResource(Resource resource) {
        this.resource_ = resource;
    }

    /* access modifiers changed from: private */
    public void mergeResource(Resource resource) {
        Resource resource2 = this.resource_;
        if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
            this.resource_ = resource;
        } else {
            this.resource_ = (Resource) ((Resource.asBinder) Resource.newBuilder(this.resource_).mergeFrom(resource)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    public final boolean hasApi() {
        return this.api_ != null;
    }

    public final Api getApi() {
        Api api = this.api_;
        return api == null ? Api.getDefaultInstance() : api;
    }

    /* access modifiers changed from: private */
    public void setApi(Api api) {
        this.api_ = api;
    }

    /* access modifiers changed from: private */
    public void mergeApi(Api api) {
        Api api2 = this.api_;
        if (api2 == null || api2 == Api.getDefaultInstance()) {
            this.api_ = api;
        } else {
            this.api_ = (Api) ((Api.read) Api.newBuilder(this.api_).mergeFrom(api)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearApi() {
        this.api_ = null;
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AttributeContext parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AttributeContext parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AttributeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AttributeContext parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AttributeContext) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AttributeContext parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AttributeContext parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(AttributeContext attributeContext) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(attributeContext);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<AttributeContext, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(AttributeContext.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AttributeContext();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AttributeContext> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AttributeContext.class) {
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
        AttributeContext attributeContext = new AttributeContext();
        DEFAULT_INSTANCE = attributeContext;
        GeneratedMessageLite.registerDefaultInstance(AttributeContext.class, attributeContext);
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AttributeContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
