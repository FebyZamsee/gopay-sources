package com.google.type;

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

public final class Expr extends GeneratedMessageLite<Expr, read> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile getAnimationStyle<Expr> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String expression_ = "";
    private String location_ = "";
    private String title_ = "";

    private Expr() {
    }

    public final String getExpression() {
        return this.expression_;
    }

    public final getBaseline getExpressionBytes() {
        return getBaseline.asBinder(this.expression_);
    }

    /* access modifiers changed from: private */
    public void setExpression(String str) {
        this.expression_ = str;
    }

    /* access modifiers changed from: private */
    public void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    /* access modifiers changed from: private */
    public void setExpressionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.expression_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getTitle() {
        return this.title_;
    }

    public final getBaseline getTitleBytes() {
        return getBaseline.asBinder(this.title_);
    }

    /* access modifiers changed from: private */
    public void setTitle(String str) {
        this.title_ = str;
    }

    /* access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* access modifiers changed from: private */
    public void setTitleBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.title_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final getBaseline getDescriptionBytes() {
        return getBaseline.asBinder(this.description_);
    }

    /* access modifiers changed from: private */
    public void setDescription(String str) {
        this.description_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void setDescriptionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.description_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getLocation() {
        return this.location_;
    }

    public final getBaseline getLocationBytes() {
        return getBaseline.asBinder(this.location_);
    }

    /* access modifiers changed from: private */
    public void setLocation(String str) {
        this.location_ = str;
    }

    /* access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* access modifiers changed from: private */
    public void setLocationBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.location_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Expr parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Expr parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Expr parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expr parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Expr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Expr parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Expr parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(Expr expr) {
        return (read) DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Expr, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(Expr.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.type.Expr$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] asInterface;

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
                asInterface = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.Expr.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Expr();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Expr> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Expr.class) {
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
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        GeneratedMessageLite.registerDefaultInstance(Expr.class, expr);
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Expr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
