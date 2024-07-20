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
import o.measureNullChild;
import o.onLongPress;
import o.setAutoSizeTextTypeWithDefaults;
import o.setTextSize;

public final class AuthProvider extends GeneratedMessageLite<AuthProvider, asInterface> implements setAutoSizeTextTypeWithDefaults {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile getAnimationStyle<AuthProvider> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<JwtLocation> jwtLocations_ = emptyProtobufList();

    private AuthProvider() {
    }

    public final String getId() {
        return this.id_;
    }

    public final getBaseline getIdBytes() {
        return getBaseline.asBinder(this.id_);
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void setIdBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.id_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getIssuer() {
        return this.issuer_;
    }

    public final getBaseline getIssuerBytes() {
        return getBaseline.asBinder(this.issuer_);
    }

    /* access modifiers changed from: private */
    public void setIssuer(String str) {
        this.issuer_ = str;
    }

    /* access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* access modifiers changed from: private */
    public void setIssuerBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.issuer_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getJwksUri() {
        return this.jwksUri_;
    }

    public final getBaseline getJwksUriBytes() {
        return getBaseline.asBinder(this.jwksUri_);
    }

    /* access modifiers changed from: private */
    public void setJwksUri(String str) {
        this.jwksUri_ = str;
    }

    /* access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* access modifiers changed from: private */
    public void setJwksUriBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.jwksUri_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getAudiences() {
        return this.audiences_;
    }

    public final getBaseline getAudiencesBytes() {
        return getBaseline.asBinder(this.audiences_);
    }

    /* access modifiers changed from: private */
    public void setAudiences(String str) {
        this.audiences_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* access modifiers changed from: private */
    public void setAudiencesBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.audiences_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public final getBaseline getAuthorizationUrlBytes() {
        return getBaseline.asBinder(this.authorizationUrl_);
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrl(String str) {
        this.authorizationUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.authorizationUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public final List<? extends setTextSize> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public final int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public final JwtLocation getJwtLocations(int i) {
        return (JwtLocation) this.jwtLocations_.get(i);
    }

    public final setTextSize getJwtLocationsOrBuilder(int i) {
        return (setTextSize) this.jwtLocations_.get(i);
    }

    private void ensureJwtLocationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<JwtLocation> audioAttributesCompatParcelizer = this.jwtLocations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setJwtLocations(int i, JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(int i, JwtLocation jwtLocation) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jwtLocation);
    }

    /* access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        onLongPress.addAll(iterable, this.jwtLocations_);
    }

    /* access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AuthProvider parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AuthProvider parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthProvider) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthProvider parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AuthProvider parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(AuthProvider authProvider) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<AuthProvider, asInterface> implements setAutoSizeTextTypeWithDefaults {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.AuthProvider$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.AuthProvider.AnonymousClass3.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass3.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AuthProvider> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AuthProvider.class) {
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
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
