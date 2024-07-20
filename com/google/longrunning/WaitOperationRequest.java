package com.google.longrunning;

import com.google.protobuf.Duration;
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

public final class WaitOperationRequest extends GeneratedMessageLite<WaitOperationRequest, onTransact> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final WaitOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<WaitOperationRequest> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_ = "";
    private Duration timeout_;

    private WaitOperationRequest() {
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

    public final boolean hasTimeout() {
        return this.timeout_ != null;
    }

    public final Duration getTimeout() {
        Duration duration = this.timeout_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    /* access modifiers changed from: private */
    public void setTimeout(Duration duration) {
        this.timeout_ = duration;
    }

    /* access modifiers changed from: private */
    public void mergeTimeout(Duration duration) {
        Duration duration2 = this.timeout_;
        if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
            this.timeout_ = duration;
        } else {
            this.timeout_ = (Duration) ((Duration.asInterface) Duration.newBuilder(this.timeout_).mergeFrom(duration)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearTimeout() {
        this.timeout_ = null;
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static WaitOperationRequest parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static WaitOperationRequest parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static WaitOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WaitOperationRequest parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WaitOperationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (WaitOperationRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static WaitOperationRequest parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static WaitOperationRequest parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (WaitOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(WaitOperationRequest waitOperationRequest) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(waitOperationRequest);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<WaitOperationRequest, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(WaitOperationRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.longrunning.WaitOperationRequest$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onTransact;

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
                onTransact = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.WaitOperationRequest.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new WaitOperationRequest();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "timeout_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<WaitOperationRequest> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (WaitOperationRequest.class) {
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
        WaitOperationRequest waitOperationRequest = new WaitOperationRequest();
        DEFAULT_INSTANCE = waitOperationRequest;
        GeneratedMessageLite.registerDefaultInstance(WaitOperationRequest.class, waitOperationRequest);
    }

    public static WaitOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<WaitOperationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
