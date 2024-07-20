package com.google.api;

import com.google.api.OAuthRequirements;
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
import o.setAllCaps;
import o.setAutoSizeTextTypeUniformWithConfiguration;

public final class AuthenticationRule extends GeneratedMessageLite<AuthenticationRule, onTransact> implements setAutoSizeTextTypeUniformWithConfiguration {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<AuthenticationRule> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private measureNullChild.AudioAttributesCompatParcelizer<AuthRequirement> requirements_ = emptyProtobufList();
    private String selector_ = "";

    private AuthenticationRule() {
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

    public final boolean hasOauth() {
        return this.oauth_ != null;
    }

    public final OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        return oAuthRequirements == null ? OAuthRequirements.getDefaultInstance() : oAuthRequirements;
    }

    /* access modifiers changed from: private */
    public void setOauth(OAuthRequirements oAuthRequirements) {
        this.oauth_ = oAuthRequirements;
    }

    /* access modifiers changed from: private */
    public void mergeOauth(OAuthRequirements oAuthRequirements) {
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 == null || oAuthRequirements2 == OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = oAuthRequirements;
        } else {
            this.oauth_ = (OAuthRequirements) ((OAuthRequirements.asInterface) OAuthRequirements.newBuilder(this.oauth_).mergeFrom(oAuthRequirements)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearOauth() {
        this.oauth_ = null;
    }

    public final boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    /* access modifiers changed from: private */
    public void setAllowWithoutCredential(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    /* access modifiers changed from: private */
    public void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    public final List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public final List<? extends setAllCaps> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    public final int getRequirementsCount() {
        return this.requirements_.size();
    }

    public final AuthRequirement getRequirements(int i) {
        return (AuthRequirement) this.requirements_.get(i);
    }

    public final setAllCaps getRequirementsOrBuilder(int i) {
        return (setAllCaps) this.requirements_.get(i);
    }

    private void ensureRequirementsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<AuthRequirement> audioAttributesCompatParcelizer = this.requirements_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRequirements(int i, AuthRequirement authRequirement) {
        ensureRequirementsIsMutable();
        this.requirements_.set(i, authRequirement);
    }

    /* access modifiers changed from: private */
    public void addRequirements(AuthRequirement authRequirement) {
        ensureRequirementsIsMutable();
        this.requirements_.add(authRequirement);
    }

    /* access modifiers changed from: private */
    public void addRequirements(int i, AuthRequirement authRequirement) {
        ensureRequirementsIsMutable();
        this.requirements_.add(i, authRequirement);
    }

    /* access modifiers changed from: private */
    public void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        ensureRequirementsIsMutable();
        onLongPress.addAll(iterable, this.requirements_);
    }

    /* access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeRequirements(int i) {
        ensureRequirementsIsMutable();
        this.requirements_.remove(i);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AuthenticationRule parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AuthenticationRule parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AuthenticationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationRule parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthenticationRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthenticationRule parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AuthenticationRule parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(AuthenticationRule authenticationRule) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(authenticationRule);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<AuthenticationRule, onTransact> implements setAutoSizeTextTypeUniformWithConfiguration {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(AuthenticationRule.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.AuthenticationRule$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
                RemoteActionCompatParcelizer = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.AuthenticationRule.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AuthenticationRule();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AuthenticationRule> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AuthenticationRule.class) {
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
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        GeneratedMessageLite.registerDefaultInstance(AuthenticationRule.class, authenticationRule);
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AuthenticationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
