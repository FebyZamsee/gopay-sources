package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.createDragToOpenListener;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getInputMethodMode;
import o.measureNullChild;
import o.onLongPress;
import o.setDropDownAlwaysVisible;

public final class Method extends GeneratedMessageLite<Method, asInterface> implements createDragToOpenListener {
    /* access modifiers changed from: private */
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile getAnimationStyle<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Option> options_ = emptyProtobufList();
    private boolean requestStreaming_;
    private String requestTypeUrl_ = "";
    private boolean responseStreaming_;
    private String responseTypeUrl_ = "";
    private int syntax_;

    private Method() {
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

    public final String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public final getBaseline getRequestTypeUrlBytes() {
        return getBaseline.asBinder(this.requestTypeUrl_);
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        this.requestTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.requestTypeUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    /* access modifiers changed from: private */
    public void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    public final String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public final getBaseline getResponseTypeUrlBytes() {
        return getBaseline.asBinder(this.responseTypeUrl_);
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        this.responseTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.responseTypeUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    /* access modifiers changed from: private */
    public void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    public final List<Option> getOptionsList() {
        return this.options_;
    }

    public final List<? extends getInputMethodMode> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final int getOptionsCount() {
        return this.options_.size();
    }

    public final Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    public final getInputMethodMode getOptionsOrBuilder(int i) {
        return (getInputMethodMode) this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Option> audioAttributesCompatParcelizer = this.options_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.options_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        onLongPress.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final setDropDownAlwaysVisible getSyntax() {
        setDropDownAlwaysVisible asBinder = setDropDownAlwaysVisible.asBinder(this.syntax_);
        return asBinder == null ? setDropDownAlwaysVisible.UNRECOGNIZED : asBinder;
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* access modifiers changed from: private */
    public void setSyntax(setDropDownAlwaysVisible setdropdownalwaysvisible) {
        this.syntax_ = setdropdownalwaysvisible.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Method parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Method parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Method parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Method parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Method method) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Method, asInterface> implements createDragToOpenListener {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Method.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.protobuf.Method$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Method.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.read[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Method> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Method.class) {
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
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
