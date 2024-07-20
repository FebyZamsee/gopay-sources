package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
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
import o.setSupportCheckMarkTintMode;

public final class AuditLog extends GeneratedMessageLite<AuditLog, asInterface> implements layoutHorizontal {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    /* access modifiers changed from: private */
    public static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile getAnimationStyle<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private measureNullChild.AudioAttributesCompatParcelizer<AuthorizationInfo> authorizationInfo_ = emptyProtobufList();
    private String methodName_ = "";
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_ = "";
    private Struct response_;
    private Any serviceData_;
    private String serviceName_ = "";
    private Status status_;

    private AuditLog() {
    }

    public final String getServiceName() {
        return this.serviceName_;
    }

    public final getBaseline getServiceNameBytes() {
        return getBaseline.asBinder(this.serviceName_);
    }

    /* access modifiers changed from: private */
    public void setServiceName(String str) {
        this.serviceName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* access modifiers changed from: private */
    public void setServiceNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.serviceName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getMethodName() {
        return this.methodName_;
    }

    public final getBaseline getMethodNameBytes() {
        return getBaseline.asBinder(this.methodName_);
    }

    /* access modifiers changed from: private */
    public void setMethodName(String str) {
        this.methodName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* access modifiers changed from: private */
    public void setMethodNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.methodName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getResourceName() {
        return this.resourceName_;
    }

    public final getBaseline getResourceNameBytes() {
        return getBaseline.asBinder(this.resourceName_);
    }

    /* access modifiers changed from: private */
    public void setResourceName(String str) {
        this.resourceName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* access modifiers changed from: private */
    public void setResourceNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.resourceName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final long getNumResponseItems() {
        return this.numResponseItems_;
    }

    /* access modifiers changed from: private */
    public void setNumResponseItems(long j) {
        this.numResponseItems_ = j;
    }

    /* access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0;
    }

    public final boolean hasStatus() {
        return this.status_ != null;
    }

    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    /* access modifiers changed from: private */
    public void setStatus(Status status) {
        this.status_ = status;
    }

    /* access modifiers changed from: private */
    public void mergeStatus(Status status) {
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.asBinder) Status.newBuilder(this.status_).mergeFrom(status)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
    }

    public final boolean hasAuthenticationInfo() {
        return this.authenticationInfo_ != null;
    }

    public final AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    /* access modifiers changed from: private */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        this.authenticationInfo_ = authenticationInfo;
    }

    /* access modifiers changed from: private */
    public void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 == null || authenticationInfo2 == AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = authenticationInfo;
        } else {
            this.authenticationInfo_ = (AuthenticationInfo) ((AuthenticationInfo.onTransact) AuthenticationInfo.newBuilder(this.authenticationInfo_).mergeFrom(authenticationInfo)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    public final List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public final List<? extends setSupportCheckMarkTintMode> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public final int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public final AuthorizationInfo getAuthorizationInfo(int i) {
        return (AuthorizationInfo) this.authorizationInfo_.get(i);
    }

    public final setSupportCheckMarkTintMode getAuthorizationInfoOrBuilder(int i) {
        return (setSupportCheckMarkTintMode) this.authorizationInfo_.get(i);
    }

    private void ensureAuthorizationInfoIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<AuthorizationInfo> audioAttributesCompatParcelizer = this.authorizationInfo_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i, authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i, authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        ensureAuthorizationInfoIsMutable();
        onLongPress.addAll(iterable, this.authorizationInfo_);
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeAuthorizationInfo(int i) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i);
    }

    public final boolean hasRequestMetadata() {
        return this.requestMetadata_ != null;
    }

    public final RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    /* access modifiers changed from: private */
    public void setRequestMetadata(RequestMetadata requestMetadata) {
        this.requestMetadata_ = requestMetadata;
    }

    /* access modifiers changed from: private */
    public void mergeRequestMetadata(RequestMetadata requestMetadata) {
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 == null || requestMetadata2 == RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = requestMetadata;
        } else {
            this.requestMetadata_ = (RequestMetadata) ((RequestMetadata.asBinder) RequestMetadata.newBuilder(this.requestMetadata_).mergeFrom(requestMetadata)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    public final boolean hasRequest() {
        return this.request_ != null;
    }

    public final Struct getRequest() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    /* access modifiers changed from: private */
    public void setRequest(Struct struct) {
        this.request_ = struct;
    }

    /* access modifiers changed from: private */
    public void mergeRequest(Struct struct) {
        Struct struct2 = this.request_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.request_ = struct;
        } else {
            this.request_ = (Struct) ((Struct.asBinder) Struct.newBuilder(this.request_).mergeFrom(struct)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    public final boolean hasResponse() {
        return this.response_ != null;
    }

    public final Struct getResponse() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    /* access modifiers changed from: private */
    public void setResponse(Struct struct) {
        this.response_ = struct;
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Struct struct) {
        Struct struct2 = this.response_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.response_ = struct;
        } else {
            this.response_ = (Struct) ((Struct.asBinder) Struct.newBuilder(this.response_).mergeFrom(struct)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    public final boolean hasServiceData() {
        return this.serviceData_ != null;
    }

    public final Any getServiceData() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    /* access modifiers changed from: private */
    public void setServiceData(Any any) {
        this.serviceData_ = any;
    }

    /* access modifiers changed from: private */
    public void mergeServiceData(Any any) {
        Any any2 = this.serviceData_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.serviceData_ = any;
        } else {
            this.serviceData_ = (Any) ((Any.read) Any.newBuilder(this.serviceData_).mergeFrom(any)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AuditLog parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AuditLog parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AuditLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AuditLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AuditLog parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AuditLog parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(AuditLog auditLog) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<AuditLog, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(AuditLog.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.cloud.audit.AuditLog$5  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.cloud.audit.AuditLog.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.read[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AuditLog();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AuditLog> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AuditLog.class) {
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
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, auditLog);
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AuditLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
