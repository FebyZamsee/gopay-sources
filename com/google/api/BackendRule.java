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
import o.measureNullChild;
import o.onTextChanged;

public final class BackendRule extends GeneratedMessageLite<BackendRule, read> implements onTextChanged {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile getAnimationStyle<BackendRule> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_ = "";
    private int authenticationCase_ = 0;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_ = "";
    private String selector_ = "";

    private BackendRule() {
    }

    public enum RemoteActionCompatParcelizer implements measureNullChild.read {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);
        
        private final int IconCompatParcelizer;

        static {
            new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return RemoteActionCompatParcelizer.asInterface(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.IconCompatParcelizer;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static RemoteActionCompatParcelizer asInterface(int i) {
            if (i == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        private RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }
    }

    public enum asBinder {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);
        
        private final int asInterface;

        private asBinder(int i) {
            this.asInterface = i;
        }

        public static asBinder onTransact(int i) {
            if (i == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i == 7) {
                return JWT_AUDIENCE;
            }
            if (i != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }
    }

    public final asBinder getAuthenticationCase() {
        return asBinder.onTransact(this.authenticationCase_);
    }

    /* access modifiers changed from: private */
    public void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
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

    public final String getAddress() {
        return this.address_;
    }

    public final getBaseline getAddressBytes() {
        return getBaseline.asBinder(this.address_);
    }

    /* access modifiers changed from: private */
    public void setAddress(String str) {
        this.address_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* access modifiers changed from: private */
    public void setAddressBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.address_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final double getDeadline() {
        return this.deadline_;
    }

    /* access modifiers changed from: private */
    public void setDeadline(double d) {
        this.deadline_ = d;
    }

    /* access modifiers changed from: private */
    public void clearDeadline() {
        this.deadline_ = 0.0d;
    }

    public final double getMinDeadline() {
        return this.minDeadline_;
    }

    /* access modifiers changed from: private */
    public void setMinDeadline(double d) {
        this.minDeadline_ = d;
    }

    /* access modifiers changed from: private */
    public void clearMinDeadline() {
        this.minDeadline_ = 0.0d;
    }

    public final double getOperationDeadline() {
        return this.operationDeadline_;
    }

    /* access modifiers changed from: private */
    public void setOperationDeadline(double d) {
        this.operationDeadline_ = d;
    }

    /* access modifiers changed from: private */
    public void clearOperationDeadline() {
        this.operationDeadline_ = 0.0d;
    }

    public final int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    public final RemoteActionCompatParcelizer getPathTranslation() {
        RemoteActionCompatParcelizer asInterface = RemoteActionCompatParcelizer.asInterface(this.pathTranslation_);
        return asInterface == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : asInterface;
    }

    /* access modifiers changed from: private */
    public void setPathTranslationValue(int i) {
        this.pathTranslation_ = i;
    }

    /* access modifiers changed from: private */
    public void setPathTranslation(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.pathTranslation_ = remoteActionCompatParcelizer.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    public final String getJwtAudience() {
        return this.authenticationCase_ == 7 ? (String) this.authentication_ : "";
    }

    public final getBaseline getJwtAudienceBytes() {
        return getBaseline.asBinder(this.authenticationCase_ == 7 ? (String) this.authentication_ : "");
    }

    /* access modifiers changed from: private */
    public void setJwtAudience(String str) {
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* access modifiers changed from: private */
    public void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setJwtAudienceBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.authentication_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.authenticationCase_ = 7;
    }

    public final boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void setDisableAuth(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    public final String getProtocol() {
        return this.protocol_;
    }

    public final getBaseline getProtocolBytes() {
        return getBaseline.asBinder(this.protocol_);
    }

    /* access modifiers changed from: private */
    public void setProtocol(String str) {
        this.protocol_ = str;
    }

    /* access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* access modifiers changed from: private */
    public void setProtocolBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.protocol_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static BackendRule parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static BackendRule parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static BackendRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BackendRule parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackendRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (BackendRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static BackendRule parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static BackendRule parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(BackendRule backendRule) {
        return (read) DEFAULT_INSTANCE.createBuilder(backendRule);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<BackendRule, read> implements onTextChanged {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(BackendRule.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.BackendRule$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.BackendRule.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new BackendRule();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<BackendRule> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (BackendRule.class) {
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
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        GeneratedMessageLite.registerDefaultInstance(BackendRule.class, backendRule);
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<BackendRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
