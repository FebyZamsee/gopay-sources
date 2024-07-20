package com.google.longrunning;

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

public final class OperationInfo extends GeneratedMessageLite<OperationInfo, read> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<OperationInfo> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String metadataType_ = "";
    private String responseType_ = "";

    private OperationInfo() {
    }

    public final String getResponseType() {
        return this.responseType_;
    }

    public final getBaseline getResponseTypeBytes() {
        return getBaseline.asBinder(this.responseType_);
    }

    /* access modifiers changed from: private */
    public void setResponseType(String str) {
        this.responseType_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResponseType() {
        this.responseType_ = getDefaultInstance().getResponseType();
    }

    /* access modifiers changed from: private */
    public void setResponseTypeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.responseType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getMetadataType() {
        return this.metadataType_;
    }

    public final getBaseline getMetadataTypeBytes() {
        return getBaseline.asBinder(this.metadataType_);
    }

    /* access modifiers changed from: private */
    public void setMetadataType(String str) {
        this.metadataType_ = str;
    }

    /* access modifiers changed from: private */
    public void clearMetadataType() {
        this.metadataType_ = getDefaultInstance().getMetadataType();
    }

    /* access modifiers changed from: private */
    public void setMetadataTypeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.metadataType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static OperationInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static OperationInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static OperationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static OperationInfo parseFrom(InputStream inputStream) throws IOException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (OperationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static OperationInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static OperationInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (OperationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(OperationInfo operationInfo) {
        return (read) DEFAULT_INSTANCE.createBuilder(operationInfo);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<OperationInfo, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(OperationInfo.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.longrunning.OperationInfo$4  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.OperationInfo.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.read[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new OperationInfo();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<OperationInfo> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (OperationInfo.class) {
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
        OperationInfo operationInfo = new OperationInfo();
        DEFAULT_INSTANCE = operationInfo;
        GeneratedMessageLite.registerDefaultInstance(OperationInfo.class, operationInfo);
    }

    public static OperationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<OperationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
