package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.measureNullChild;
import o.onLongPress;
import o.setSupportAllCaps;

public final class HttpRule extends GeneratedMessageLite<HttpRule, asInterface> implements setSupportAllCaps {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<HttpRule> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<HttpRule> additionalBindings_ = emptyProtobufList();
    private String body_ = "";
    private int patternCase_ = 0;
    private Object pattern_;
    private String responseBody_ = "";
    private String selector_ = "";

    private HttpRule() {
    }

    public enum asBinder {
        RemoteActionCompatParcelizer(2),
        PUT(3),
        AudioAttributesCompatParcelizer(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);
        
        private final int AudioAttributesImplApi26Parcelizer;

        private asBinder(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        public static asBinder read(int i) {
            if (i == 0) {
                return PATTERN_NOT_SET;
            }
            if (i == 8) {
                return CUSTOM;
            }
            if (i == 2) {
                return RemoteActionCompatParcelizer;
            }
            if (i == 3) {
                return PUT;
            }
            if (i == 4) {
                return AudioAttributesCompatParcelizer;
            }
            if (i == 5) {
                return DELETE;
            }
            if (i != 6) {
                return null;
            }
            return PATCH;
        }
    }

    public final asBinder getPatternCase() {
        return asBinder.read(this.patternCase_);
    }

    /* access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    public final String getSelector() {
        return this.selector_;
    }

    public final getBaseline getSelectorBytes() {
        return getBaseline.asBinder(this.selector_);
    }

    /* access modifiers changed from: private */
    public void setSelector(String str) {
        this.selector_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* access modifiers changed from: private */
    public void setSelectorBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.selector_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getGet() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    public final getBaseline getGetBytes() {
        return getBaseline.asBinder(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    /* access modifiers changed from: private */
    public void setGet(String str) {
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setGetBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pattern_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.patternCase_ = 2;
    }

    public final String getPut() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    public final getBaseline getPutBytes() {
        return getBaseline.asBinder(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    /* access modifiers changed from: private */
    public void setPut(String str) {
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setPutBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pattern_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.patternCase_ = 3;
    }

    public final String getPost() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    public final getBaseline getPostBytes() {
        return getBaseline.asBinder(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    /* access modifiers changed from: private */
    public void setPost(String str) {
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setPostBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pattern_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.patternCase_ = 4;
    }

    public final String getDelete() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }

    public final getBaseline getDeleteBytes() {
        return getBaseline.asBinder(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    /* access modifiers changed from: private */
    public void setDelete(String str) {
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setDeleteBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pattern_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.patternCase_ = 5;
    }

    public final String getPatch() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    public final getBaseline getPatchBytes() {
        return getBaseline.asBinder(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    /* access modifiers changed from: private */
    public void setPatch(String str) {
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setPatchBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pattern_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.patternCase_ = 6;
    }

    public final boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    public final CustomHttpPattern getCustom() {
        if (this.patternCase_ == 8) {
            return (CustomHttpPattern) this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setCustom(CustomHttpPattern customHttpPattern) {
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void mergeCustom(CustomHttpPattern customHttpPattern) {
        if (this.patternCase_ != 8 || this.pattern_ == CustomHttpPattern.getDefaultInstance()) {
            this.pattern_ = customHttpPattern;
        } else {
            this.pattern_ = ((CustomHttpPattern.RemoteActionCompatParcelizer) CustomHttpPattern.newBuilder((CustomHttpPattern) this.pattern_).mergeFrom(customHttpPattern)).buildPartial();
        }
        this.patternCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    public final String getBody() {
        return this.body_;
    }

    public final getBaseline getBodyBytes() {
        return getBaseline.asBinder(this.body_);
    }

    /* access modifiers changed from: private */
    public void setBody(String str) {
        this.body_ = str;
    }

    /* access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* access modifiers changed from: private */
    public void setBodyBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.body_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getResponseBody() {
        return this.responseBody_;
    }

    public final getBaseline getResponseBodyBytes() {
        return getBaseline.asBinder(this.responseBody_);
    }

    /* access modifiers changed from: private */
    public void setResponseBody(String str) {
        this.responseBody_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* access modifiers changed from: private */
    public void setResponseBodyBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.responseBody_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public final List<? extends setSupportAllCaps> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    public final int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    public final HttpRule getAdditionalBindings(int i) {
        return (HttpRule) this.additionalBindings_.get(i);
    }

    public final setSupportAllCaps getAdditionalBindingsOrBuilder(int i) {
        return (setSupportAllCaps) this.additionalBindings_.get(i);
    }

    private void ensureAdditionalBindingsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<HttpRule> audioAttributesCompatParcelizer = this.additionalBindings_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAdditionalBindings(int i, HttpRule httpRule) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i, httpRule);
    }

    /* access modifiers changed from: private */
    public void addAdditionalBindings(HttpRule httpRule) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    /* access modifiers changed from: private */
    public void addAdditionalBindings(int i, HttpRule httpRule) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i, httpRule);
    }

    /* access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        ensureAdditionalBindingsIsMutable();
        onLongPress.addAll(iterable, this.additionalBindings_);
    }

    /* access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeAdditionalBindings(int i) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static HttpRule parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static HttpRule parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static HttpRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRule parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpRule parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static HttpRule parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(HttpRule httpRule) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<HttpRule, asInterface> implements setSupportAllCaps {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(HttpRule.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.HttpRule$4  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.HttpRule.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        Class<HttpRule> cls = HttpRule.class;
        switch (AnonymousClass4.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new HttpRule();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", cls, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<HttpRule> getanimationstyle = PARSER;
                if (getanimationstyle == null) {
                    synchronized (cls) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact<>(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
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
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        GeneratedMessageLite.registerDefaultInstance(HttpRule.class, httpRule);
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<HttpRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
