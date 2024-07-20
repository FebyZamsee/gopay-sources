package com.google.api;

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
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setAutoSizeTextTypeUniformWithConfiguration;
import o.setAutoSizeTextTypeWithDefaults;

public final class Authentication extends GeneratedMessageLite<Authentication, onTransact> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Authentication DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private measureNullChild.AudioAttributesCompatParcelizer<AuthProvider> providers_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<AuthenticationRule> rules_ = emptyProtobufList();

    private Authentication() {
    }

    public final List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public final List<? extends setAutoSizeTextTypeUniformWithConfiguration> getRulesOrBuilderList() {
        return this.rules_;
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final AuthenticationRule getRules(int i) {
        return (AuthenticationRule) this.rules_.get(i);
    }

    public final setAutoSizeTextTypeUniformWithConfiguration getRulesOrBuilder(int i) {
        return (setAutoSizeTextTypeUniformWithConfiguration) this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<AuthenticationRule> audioAttributesCompatParcelizer = this.rules_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRules(int i, AuthenticationRule authenticationRule) {
        ensureRulesIsMutable();
        this.rules_.set(i, authenticationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(AuthenticationRule authenticationRule) {
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, AuthenticationRule authenticationRule) {
        ensureRulesIsMutable();
        this.rules_.add(i, authenticationRule);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
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

    public final List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public final List<? extends setAutoSizeTextTypeWithDefaults> getProvidersOrBuilderList() {
        return this.providers_;
    }

    public final int getProvidersCount() {
        return this.providers_.size();
    }

    public final AuthProvider getProviders(int i) {
        return (AuthProvider) this.providers_.get(i);
    }

    public final setAutoSizeTextTypeWithDefaults getProvidersOrBuilder(int i) {
        return (setAutoSizeTextTypeWithDefaults) this.providers_.get(i);
    }

    private void ensureProvidersIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<AuthProvider> audioAttributesCompatParcelizer = this.providers_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.providers_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setProviders(int i, AuthProvider authProvider) {
        ensureProvidersIsMutable();
        this.providers_.set(i, authProvider);
    }

    /* access modifiers changed from: private */
    public void addProviders(AuthProvider authProvider) {
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    /* access modifiers changed from: private */
    public void addProviders(int i, AuthProvider authProvider) {
        ensureProvidersIsMutable();
        this.providers_.add(i, authProvider);
    }

    /* access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        onLongPress.addAll(iterable, this.providers_);
    }

    /* access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeProviders(int i) {
        ensureProvidersIsMutable();
        this.providers_.remove(i);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Authentication parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Authentication parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Authentication parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Authentication) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Authentication parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Authentication parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(Authentication authentication) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<Authentication, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(Authentication.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Authentication$5  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Authentication.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Authentication> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Authentication.class) {
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
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, authentication);
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
