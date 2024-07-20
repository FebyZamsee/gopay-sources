package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AppCompatCheckBox;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.measureNullChild;
import o.onLongPress;

public final class ContextRule extends GeneratedMessageLite<ContextRule, RemoteActionCompatParcelizer> implements AppCompatCheckBox {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final ContextRule DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<String> allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<String> allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    private ContextRule() {
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

    public final List<String> getRequestedList() {
        return this.requested_;
    }

    public final int getRequestedCount() {
        return this.requested_.size();
    }

    public final String getRequested(int i) {
        return (String) this.requested_.get(i);
    }

    public final getBaseline getRequestedBytes(int i) {
        return getBaseline.asBinder((String) this.requested_.get(i));
    }

    private void ensureRequestedIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.requested_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.requested_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRequested(int i, String str) {
        ensureRequestedIsMutable();
        this.requested_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addRequested(String str) {
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        onLongPress.addAll(iterable, this.requested_);
    }

    /* access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addRequestedBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureRequestedIsMutable();
        this.requested_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<String> getProvidedList() {
        return this.provided_;
    }

    public final int getProvidedCount() {
        return this.provided_.size();
    }

    public final String getProvided(int i) {
        return (String) this.provided_.get(i);
    }

    public final getBaseline getProvidedBytes(int i) {
        return getBaseline.asBinder((String) this.provided_.get(i));
    }

    private void ensureProvidedIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.provided_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.provided_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setProvided(int i, String str) {
        ensureProvidedIsMutable();
        this.provided_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addProvided(String str) {
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        onLongPress.addAll(iterable, this.provided_);
    }

    /* access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addProvidedBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureProvidedIsMutable();
        this.provided_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public final int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public final String getAllowedRequestExtensions(int i) {
        return (String) this.allowedRequestExtensions_.get(i);
    }

    public final getBaseline getAllowedRequestExtensionsBytes(int i) {
        return getBaseline.asBinder((String) this.allowedRequestExtensions_.get(i));
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.allowedRequestExtensions_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i, String str) {
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        onLongPress.addAll(iterable, this.allowedRequestExtensions_);
    }

    /* access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public final int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public final String getAllowedResponseExtensions(int i) {
        return (String) this.allowedResponseExtensions_.get(i);
    }

    public final getBaseline getAllowedResponseExtensionsBytes(int i) {
        return getBaseline.asBinder((String) this.allowedResponseExtensions_.get(i));
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.allowedResponseExtensions_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i, String str) {
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        onLongPress.addAll(iterable, this.allowedResponseExtensions_);
    }

    /* access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ContextRule parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ContextRule parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ContextRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ContextRule parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ContextRule parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(ContextRule contextRule) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<ContextRule, RemoteActionCompatParcelizer> implements AppCompatCheckBox {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(ContextRule.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.ContextRule$4  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ContextRule.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ContextRule> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ContextRule.class) {
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
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
