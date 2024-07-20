package com.google.logging.type;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;

public final class HttpRequest extends GeneratedMessageLite<HttpRequest, onTransact> implements layoutHorizontal {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile getAnimationStyle<HttpRequest> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    private HttpRequest() {
    }

    public final String getRequestMethod() {
        return this.requestMethod_;
    }

    public final getBaseline getRequestMethodBytes() {
        return getBaseline.asBinder(this.requestMethod_);
    }

    /* access modifiers changed from: private */
    public void setRequestMethod(String str) {
        this.requestMethod_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    /* access modifiers changed from: private */
    public void setRequestMethodBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.requestMethod_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getRequestUrl() {
        return this.requestUrl_;
    }

    public final getBaseline getRequestUrlBytes() {
        return getBaseline.asBinder(this.requestUrl_);
    }

    /* access modifiers changed from: private */
    public void setRequestUrl(String str) {
        this.requestUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    /* access modifiers changed from: private */
    public void setRequestUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.requestUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final long getRequestSize() {
        return this.requestSize_;
    }

    /* access modifiers changed from: private */
    public void setRequestSize(long j) {
        this.requestSize_ = j;
    }

    /* access modifiers changed from: private */
    public void clearRequestSize() {
        this.requestSize_ = 0;
    }

    public final int getStatus() {
        return this.status_;
    }

    /* access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public final long getResponseSize() {
        return this.responseSize_;
    }

    /* access modifiers changed from: private */
    public void setResponseSize(long j) {
        this.responseSize_ = j;
    }

    /* access modifiers changed from: private */
    public void clearResponseSize() {
        this.responseSize_ = 0;
    }

    public final String getUserAgent() {
        return this.userAgent_;
    }

    public final getBaseline getUserAgentBytes() {
        return getBaseline.asBinder(this.userAgent_);
    }

    /* access modifiers changed from: private */
    public void setUserAgent(String str) {
        this.userAgent_ = str;
    }

    /* access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* access modifiers changed from: private */
    public void setUserAgentBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.userAgent_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getRemoteIp() {
        return this.remoteIp_;
    }

    public final getBaseline getRemoteIpBytes() {
        return getBaseline.asBinder(this.remoteIp_);
    }

    /* access modifiers changed from: private */
    public void setRemoteIp(String str) {
        this.remoteIp_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* access modifiers changed from: private */
    public void setRemoteIpBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.remoteIp_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getServerIp() {
        return this.serverIp_;
    }

    public final getBaseline getServerIpBytes() {
        return getBaseline.asBinder(this.serverIp_);
    }

    /* access modifiers changed from: private */
    public void setServerIp(String str) {
        this.serverIp_ = str;
    }

    /* access modifiers changed from: private */
    public void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    /* access modifiers changed from: private */
    public void setServerIpBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.serverIp_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getReferer() {
        return this.referer_;
    }

    public final getBaseline getRefererBytes() {
        return getBaseline.asBinder(this.referer_);
    }

    /* access modifiers changed from: private */
    public void setReferer(String str) {
        this.referer_ = str;
    }

    /* access modifiers changed from: private */
    public void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    /* access modifiers changed from: private */
    public void setRefererBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.referer_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean hasLatency() {
        return this.latency_ != null;
    }

    public final Duration getLatency() {
        Duration duration = this.latency_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    /* access modifiers changed from: private */
    public void setLatency(Duration duration) {
        this.latency_ = duration;
    }

    /* access modifiers changed from: private */
    public void mergeLatency(Duration duration) {
        Duration duration2 = this.latency_;
        if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
            this.latency_ = duration;
        } else {
            this.latency_ = (Duration) ((Duration.asInterface) Duration.newBuilder(this.latency_).mergeFrom(duration)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearLatency() {
        this.latency_ = null;
    }

    public final boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    /* access modifiers changed from: private */
    public void setCacheLookup(boolean z) {
        this.cacheLookup_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    public final boolean getCacheHit() {
        return this.cacheHit_;
    }

    /* access modifiers changed from: private */
    public void setCacheHit(boolean z) {
        this.cacheHit_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheHit() {
        this.cacheHit_ = false;
    }

    public final boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    /* access modifiers changed from: private */
    public void setCacheValidatedWithOriginServer(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    /* access modifiers changed from: private */
    public void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    public final long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    /* access modifiers changed from: private */
    public void setCacheFillBytes(long j) {
        this.cacheFillBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0;
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

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static HttpRequest parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static HttpRequest parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static HttpRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRequest parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static HttpRequest parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static HttpRequest parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(HttpRequest httpRequest) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<HttpRequest, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(HttpRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.logging.type.HttpRequest$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.logging.type.HttpRequest.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new HttpRequest();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<HttpRequest> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (HttpRequest.class) {
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
        HttpRequest httpRequest = new HttpRequest();
        DEFAULT_INSTANCE = httpRequest;
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
