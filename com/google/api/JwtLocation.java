package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.setTextSize;

public final class JwtLocation extends GeneratedMessageLite<JwtLocation, read> implements setTextSize {
    /* access modifiers changed from: private */
    public static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_ = 0;
    private Object in_;
    private String valuePrefix_ = "";

    private JwtLocation() {
    }

    public enum asInterface {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);
        
        private final int onTransact;

        private asInterface(int i) {
            this.onTransact = i;
        }

        public static asInterface onTransact(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }
    }

    public final asInterface getInCase() {
        return asInterface.onTransact(this.inCase_);
    }

    /* access modifiers changed from: private */
    public void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    public final String getHeader() {
        return this.inCase_ == 1 ? (String) this.in_ : "";
    }

    public final getBaseline getHeaderBytes() {
        return getBaseline.asBinder(this.inCase_ == 1 ? (String) this.in_ : "");
    }

    /* access modifiers changed from: private */
    public void setHeader(String str) {
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* access modifiers changed from: private */
    public void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setHeaderBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.in_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.inCase_ = 1;
    }

    public final String getQuery() {
        return this.inCase_ == 2 ? (String) this.in_ : "";
    }

    public final getBaseline getQueryBytes() {
        return getBaseline.asBinder(this.inCase_ == 2 ? (String) this.in_ : "");
    }

    /* access modifiers changed from: private */
    public void setQuery(String str) {
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* access modifiers changed from: private */
    public void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setQueryBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.in_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.inCase_ = 2;
    }

    public final String getValuePrefix() {
        return this.valuePrefix_;
    }

    public final getBaseline getValuePrefixBytes() {
        return getBaseline.asBinder(this.valuePrefix_);
    }

    /* access modifiers changed from: private */
    public void setValuePrefix(String str) {
        this.valuePrefix_ = str;
    }

    /* access modifiers changed from: private */
    public void clearValuePrefix() {
        this.valuePrefix_ = getDefaultInstance().getValuePrefix();
    }

    /* access modifiers changed from: private */
    public void setValuePrefixBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.valuePrefix_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static JwtLocation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static JwtLocation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static JwtLocation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtLocation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (JwtLocation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static JwtLocation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static JwtLocation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(JwtLocation jwtLocation) {
        return (read) DEFAULT_INSTANCE.createBuilder(jwtLocation);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<JwtLocation, read> implements setTextSize {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(JwtLocation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.JwtLocation$5  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.JwtLocation.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new JwtLocation();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<JwtLocation> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (JwtLocation.class) {
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
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        GeneratedMessageLite.registerDefaultInstance(JwtLocation.class, jwtLocation);
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<JwtLocation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
