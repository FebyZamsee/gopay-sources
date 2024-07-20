package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.drawDividersHorizontal;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class HttpBody extends GeneratedMessageLite<HttpBody, onTransact> implements layoutHorizontal {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<HttpBody> PARSER;
    private String contentType_ = "";
    private getBaseline data_ = getBaseline.RemoteActionCompatParcelizer;
    private measureNullChild.AudioAttributesCompatParcelizer<Any> extensions_ = emptyProtobufList();

    private HttpBody() {
    }

    public final String getContentType() {
        return this.contentType_;
    }

    public final getBaseline getContentTypeBytes() {
        return getBaseline.asBinder(this.contentType_);
    }

    /* access modifiers changed from: private */
    public void setContentType(String str) {
        this.contentType_ = str;
    }

    /* access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = getDefaultInstance().getContentType();
    }

    /* access modifiers changed from: private */
    public void setContentTypeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.contentType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final getBaseline getData() {
        return this.data_;
    }

    /* access modifiers changed from: private */
    public void setData(getBaseline getbaseline) {
        this.data_ = getbaseline;
    }

    /* access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    public final List<Any> getExtensionsList() {
        return this.extensions_;
    }

    public final List<? extends drawDividersHorizontal> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    public final int getExtensionsCount() {
        return this.extensions_.size();
    }

    public final Any getExtensions(int i) {
        return (Any) this.extensions_.get(i);
    }

    public final drawDividersHorizontal getExtensionsOrBuilder(int i) {
        return (drawDividersHorizontal) this.extensions_.get(i);
    }

    private void ensureExtensionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Any> audioAttributesCompatParcelizer = this.extensions_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.extensions_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setExtensions(int i, Any any) {
        ensureExtensionsIsMutable();
        this.extensions_.set(i, any);
    }

    /* access modifiers changed from: private */
    public void addExtensions(Any any) {
        ensureExtensionsIsMutable();
        this.extensions_.add(any);
    }

    /* access modifiers changed from: private */
    public void addExtensions(int i, Any any) {
        ensureExtensionsIsMutable();
        this.extensions_.add(i, any);
    }

    /* access modifiers changed from: private */
    public void addAllExtensions(Iterable<? extends Any> iterable) {
        ensureExtensionsIsMutable();
        onLongPress.addAll(iterable, this.extensions_);
    }

    /* access modifiers changed from: private */
    public void clearExtensions() {
        this.extensions_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeExtensions(int i) {
        ensureExtensionsIsMutable();
        this.extensions_.remove(i);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static HttpBody parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static HttpBody parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static HttpBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpBody parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpBody) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpBody) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpBody parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static HttpBody parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(HttpBody httpBody) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(httpBody);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<HttpBody, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(HttpBody.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.HttpBody$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.HttpBody.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new HttpBody();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<HttpBody> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (HttpBody.class) {
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
        HttpBody httpBody = new HttpBody();
        DEFAULT_INSTANCE = httpBody;
        GeneratedMessageLite.registerDefaultInstance(HttpBody.class, httpBody);
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<HttpBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
