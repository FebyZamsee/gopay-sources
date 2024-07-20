package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.setSupportCheckMarkTintMode;

public final class AuthorizationInfo extends GeneratedMessageLite<AuthorizationInfo, asBinder> implements setSupportCheckMarkTintMode {
    /* access modifiers changed from: private */
    public static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<AuthorizationInfo> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_ = "";
    private String resource_ = "";

    private AuthorizationInfo() {
    }

    public final String getResource() {
        return this.resource_;
    }

    public final getBaseline getResourceBytes() {
        return getBaseline.asBinder(this.resource_);
    }

    /* access modifiers changed from: private */
    public void setResource(String str) {
        this.resource_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    /* access modifiers changed from: private */
    public void setResourceBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.resource_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getPermission() {
        return this.permission_;
    }

    public final getBaseline getPermissionBytes() {
        return getBaseline.asBinder(this.permission_);
    }

    /* access modifiers changed from: private */
    public void setPermission(String str) {
        this.permission_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = getDefaultInstance().getPermission();
    }

    /* access modifiers changed from: private */
    public void setPermissionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.permission_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean getGranted() {
        return this.granted_;
    }

    /* access modifiers changed from: private */
    public void setGranted(boolean z) {
        this.granted_ = z;
    }

    /* access modifiers changed from: private */
    public void clearGranted() {
        this.granted_ = false;
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AuthorizationInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AuthorizationInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuthorizationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuthorizationInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AuthorizationInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AuthorizationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(AuthorizationInfo authorizationInfo) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(authorizationInfo);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<AuthorizationInfo, asBinder> implements setSupportCheckMarkTintMode {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(AuthorizationInfo.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.cloud.audit.AuthorizationInfo$4  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.cloud.audit.AuthorizationInfo.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AuthorizationInfo();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AuthorizationInfo> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AuthorizationInfo.class) {
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
        AuthorizationInfo authorizationInfo = new AuthorizationInfo();
        DEFAULT_INSTANCE = authorizationInfo;
        GeneratedMessageLite.registerDefaultInstance(AuthorizationInfo.class, authorizationInfo);
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AuthorizationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
