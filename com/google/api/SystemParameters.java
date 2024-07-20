package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AppCompatCheckedTextViewHelper;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class SystemParameters extends GeneratedMessageLite<SystemParameters, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final SystemParameters DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<SystemParameters> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<SystemParameterRule> rules_ = emptyProtobufList();

    private SystemParameters() {
    }

    public final List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public final List<? extends AppCompatCheckedTextViewHelper> getRulesOrBuilderList() {
        return this.rules_;
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final SystemParameterRule getRules(int i) {
        return (SystemParameterRule) this.rules_.get(i);
    }

    public final AppCompatCheckedTextViewHelper getRulesOrBuilder(int i) {
        return (AppCompatCheckedTextViewHelper) this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<SystemParameterRule> audioAttributesCompatParcelizer = this.rules_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRules(int i, SystemParameterRule systemParameterRule) {
        ensureRulesIsMutable();
        this.rules_.set(i, systemParameterRule);
    }

    /* access modifiers changed from: private */
    public void addRules(SystemParameterRule systemParameterRule) {
        ensureRulesIsMutable();
        this.rules_.add(systemParameterRule);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, SystemParameterRule systemParameterRule) {
        ensureRulesIsMutable();
        this.rules_.add(i, systemParameterRule);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        ensureRulesIsMutable();
        onLongPress.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static SystemParameters parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static SystemParameters parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static SystemParameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameters parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (SystemParameters) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static SystemParameters parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static SystemParameters parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(SystemParameters systemParameters) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(systemParameters);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<SystemParameters, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(SystemParameters.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.SystemParameters$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.SystemParameters.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new SystemParameters();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", SystemParameterRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<SystemParameters> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (SystemParameters.class) {
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
        SystemParameters systemParameters = new SystemParameters();
        DEFAULT_INSTANCE = systemParameters;
        GeneratedMessageLite.registerDefaultInstance(SystemParameters.class, systemParameters);
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<SystemParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
