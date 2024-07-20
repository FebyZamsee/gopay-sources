package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.measureNullChild;
import o.onLongPress;
import o.setOnItemClickListener;
import o.setVerticalGravity;
import o.setWeightSum;

public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile getAnimationStyle<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private setWeightSum<String, String> customAttributes_ = setWeightSum.asInterface();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private measureNullChild.AudioAttributesCompatParcelizer<PerfSession> perfSessions_ = emptyProtobufList();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    static final class CustomAttributesDefaultEntryHolder {
        static final setVerticalGravity<String, String> defaultEntry = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
    }

    private NetworkRequestMetric() {
    }

    public enum HttpMethod implements measureNullChild.read {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        private static final measureNullChild.asInterface<HttpMethod> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new measureNullChild.asInterface<HttpMethod>() {
                public HttpMethod findValueByNumber(int i) {
                    return HttpMethod.forNumber(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static HttpMethod forNumber(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
            return HttpMethodVerifier.INSTANCE;
        }

        static final class HttpMethodVerifier implements measureNullChild.RemoteActionCompatParcelizer {
            static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

            private HttpMethodVerifier() {
            }

            static {
                INSTANCE = new HttpMethodVerifier();
            }

            public final boolean isInRange(int i) {
                return HttpMethod.forNumber(i) != null;
            }
        }

        private HttpMethod(int i) {
            this.value = i;
        }
    }

    public enum NetworkClientErrorReason implements measureNullChild.read {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        private static final measureNullChild.asInterface<NetworkClientErrorReason> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new measureNullChild.asInterface<NetworkClientErrorReason>() {
                public NetworkClientErrorReason findValueByNumber(int i) {
                    return NetworkClientErrorReason.forNumber(i);
                }
            };
        }

        public final int getNumber() {
            return this.value;
        }

        public static NetworkClientErrorReason forNumber(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
            return NetworkClientErrorReasonVerifier.INSTANCE;
        }

        static final class NetworkClientErrorReasonVerifier implements measureNullChild.RemoteActionCompatParcelizer {
            static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

            private NetworkClientErrorReasonVerifier() {
            }

            static {
                INSTANCE = new NetworkClientErrorReasonVerifier();
            }

            public final boolean isInRange(int i) {
                return NetworkClientErrorReason.forNumber(i) != null;
            }
        }

        private NetworkClientErrorReason(int i) {
            this.value = i;
        }
    }

    public final boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final getBaseline getUrlBytes() {
        return getBaseline.asBinder(this.url_);
    }

    /* access modifiers changed from: private */
    public void setUrl(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    /* access modifiers changed from: private */
    public void setUrlBytes(getBaseline getbaseline) {
        this.url_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    public final boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public final HttpMethod getHttpMethod() {
        HttpMethod forNumber = HttpMethod.forNumber(this.httpMethod_);
        return forNumber == null ? HttpMethod.HTTP_METHOD_UNKNOWN : forNumber;
    }

    /* access modifiers changed from: private */
    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod_ = httpMethod.getNumber();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    public final boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public final long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    /* access modifiers changed from: private */
    public void setRequestPayloadBytes(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0;
    }

    public final boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public final long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    /* access modifiers changed from: private */
    public void setResponsePayloadBytes(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0;
    }

    public final boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public final NetworkClientErrorReason getNetworkClientErrorReason() {
        NetworkClientErrorReason forNumber = NetworkClientErrorReason.forNumber(this.networkClientErrorReason_);
        return forNumber == null ? NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : forNumber;
    }

    /* access modifiers changed from: private */
    public void setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
        this.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    public final boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public final int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    /* access modifiers changed from: private */
    public void setHttpResponseCode(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    public final boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public final String getResponseContentType() {
        return this.responseContentType_;
    }

    public final getBaseline getResponseContentTypeBytes() {
        return getBaseline.asBinder(this.responseContentType_);
    }

    /* access modifiers changed from: private */
    public void setResponseContentType(String str) {
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* access modifiers changed from: private */
    public void setResponseContentTypeBytes(getBaseline getbaseline) {
        this.responseContentType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 64;
    }

    public final boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public final long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    /* access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0;
    }

    public final boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    public final long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    /* access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0;
    }

    public final boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    public final long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    /* access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0;
    }

    public final boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    /* access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0;
    }

    private setWeightSum<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private setWeightSum<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.asBinder) {
            setWeightSum<String, String> setweightsum = this.customAttributes_;
            this.customAttributes_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.customAttributes_;
    }

    public final int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public final boolean containsCustomAttributes(String str) {
        return internalGetCustomAttributes().containsKey(str);
    }

    @Deprecated
    public final Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public final Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public final String getCustomAttributesOrDefault(String str, String str2) {
        setWeightSum<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        return internalGetCustomAttributes.containsKey(str) ? internalGetCustomAttributes.get(str) : str2;
    }

    public final String getCustomAttributesOrThrow(String str) {
        setWeightSum<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    public final List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public final List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public final int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public final PerfSession getPerfSessions(int i) {
        return (PerfSession) this.perfSessions_.get(i);
    }

    public final PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
        return (PerfSessionOrBuilder) this.perfSessions_.get(i);
    }

    private void ensurePerfSessionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<PerfSession> audioAttributesCompatParcelizer = this.perfSessions_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    /* access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        onLongPress.addAll(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static NetworkRequestMetric parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static NetworkRequestMetric parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkRequestMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static NetworkRequestMetric parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static NetworkRequestMetric parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }

        public final String getUrl() {
            return ((NetworkRequestMetric) this.instance).getUrl();
        }

        public final Builder setUrl(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setUrl(str);
            return this;
        }

        public final Builder setHttpMethod(HttpMethod httpMethod) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpMethod(httpMethod);
            return this;
        }

        public final Builder setRequestPayloadBytes(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setRequestPayloadBytes(j);
            return this;
        }

        public final Builder setResponsePayloadBytes(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponsePayloadBytes(j);
            return this;
        }

        public final Builder setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setNetworkClientErrorReason(networkClientErrorReason);
            return this;
        }

        public final boolean hasHttpResponseCode() {
            return ((NetworkRequestMetric) this.instance).hasHttpResponseCode();
        }

        public final Builder setHttpResponseCode(int i) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpResponseCode(i);
            return this;
        }

        public final Builder setResponseContentType(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponseContentType(str);
            return this;
        }

        public final Builder clearResponseContentType() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearResponseContentType();
            return this;
        }

        public final boolean hasClientStartTimeUs() {
            return ((NetworkRequestMetric) this.instance).hasClientStartTimeUs();
        }

        public final Builder setClientStartTimeUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setClientStartTimeUs(j);
            return this;
        }

        public final Builder setTimeToRequestCompletedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToRequestCompletedUs(j);
            return this;
        }

        public final long getTimeToResponseInitiatedUs() {
            return ((NetworkRequestMetric) this.instance).getTimeToResponseInitiatedUs();
        }

        public final Builder setTimeToResponseInitiatedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseInitiatedUs(j);
            return this;
        }

        public final boolean hasTimeToResponseCompletedUs() {
            return ((NetworkRequestMetric) this.instance).hasTimeToResponseCompletedUs();
        }

        public final Builder setTimeToResponseCompletedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseCompletedUs(j);
            return this;
        }

        public final Builder clearCustomAttributes() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().clear();
            return this;
        }

        public final Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public final Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

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
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.NetworkRequestMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.internalGetVerifier(), "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<NetworkRequestMetric> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (NetworkRequestMetric.class) {
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
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<NetworkRequestMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
