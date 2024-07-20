package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;

public final class RequestMetadata extends GeneratedMessageLite<RequestMetadata, asBinder> implements layoutHorizontal {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<RequestMetadata> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    private RequestMetadata() {
    }

    public final String getCallerIp() {
        return this.callerIp_;
    }

    public final getBaseline getCallerIpBytes() {
        return getBaseline.asBinder(this.callerIp_);
    }

    /* access modifiers changed from: private */
    public void setCallerIp(String str) {
        this.callerIp_ = str;
    }

    /* access modifiers changed from: private */
    public void clearCallerIp() {
        this.callerIp_ = getDefaultInstance().getCallerIp();
    }

    /* access modifiers changed from: private */
    public void setCallerIpBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.callerIp_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    public final getBaseline getCallerSuppliedUserAgentBytes() {
        return getBaseline.asBinder(this.callerSuppliedUserAgent_);
    }

    /* access modifiers changed from: private */
    public void setCallerSuppliedUserAgent(String str) {
        this.callerSuppliedUserAgent_ = str;
    }

    /* access modifiers changed from: private */
    public void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
    }

    /* access modifiers changed from: private */
    public void setCallerSuppliedUserAgentBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.callerSuppliedUserAgent_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static RequestMetadata parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static RequestMetadata parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static RequestMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestMetadata parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (RequestMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static RequestMetadata parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static RequestMetadata parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(RequestMetadata requestMetadata) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(requestMetadata);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<RequestMetadata, asBinder> implements layoutHorizontal {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(RequestMetadata.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.cloud.audit.RequestMetadata$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

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
                read = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.cloud.audit.RequestMetadata.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.read[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new RequestMetadata();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<RequestMetadata> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (RequestMetadata.class) {
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
        RequestMetadata requestMetadata = new RequestMetadata();
        DEFAULT_INSTANCE = requestMetadata;
        GeneratedMessageLite.registerDefaultInstance(RequestMetadata.class, requestMetadata);
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<RequestMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
