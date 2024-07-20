package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TransportInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;

public final class PerfMetric extends GeneratedMessageLite<PerfMetric, Builder> implements PerfMetricOrBuilder {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<PerfMetric> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    private PerfMetric() {
    }

    public final boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public final ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.getDefaultInstance() : applicationInfo;
    }

    /* access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 == null || applicationInfo2 == ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = applicationInfo;
        } else {
            this.applicationInfo_ = (ApplicationInfo) ((ApplicationInfo.Builder) ApplicationInfo.newBuilder(this.applicationInfo_).mergeFrom(applicationInfo)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    public final boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    public final TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.getDefaultInstance() : traceMetric;
    }

    /* access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 == null || traceMetric2 == TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = traceMetric;
        } else {
            this.traceMetric_ = (TraceMetric) ((TraceMetric.Builder) TraceMetric.newBuilder(this.traceMetric_).mergeFrom(traceMetric)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    public final boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    public final NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.getDefaultInstance() : networkRequestMetric;
    }

    /* access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 == null || networkRequestMetric2 == NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = networkRequestMetric;
        } else {
            this.networkRequestMetric_ = (NetworkRequestMetric) ((NetworkRequestMetric.Builder) NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mergeFrom(networkRequestMetric)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    public final boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    public final GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.getDefaultInstance() : gaugeMetric;
    }

    /* access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 == null || gaugeMetric2 == GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = gaugeMetric;
        } else {
            this.gaugeMetric_ = (GaugeMetric) ((GaugeMetric.Builder) GaugeMetric.newBuilder(this.gaugeMetric_).mergeFrom(gaugeMetric)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    public final boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public final TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        return transportInfo == null ? TransportInfo.getDefaultInstance() : transportInfo;
    }

    /* access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 == null || transportInfo2 == TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = transportInfo;
        } else {
            this.transportInfo_ = (TransportInfo) ((TransportInfo.Builder) TransportInfo.newBuilder(this.transportInfo_).mergeFrom(transportInfo)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static PerfMetric parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static PerfMetric parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static PerfMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static PerfMetric parseFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PerfMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PerfMetric parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static PerfMetric parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PerfMetric perfMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<PerfMetric, Builder> implements PerfMetricOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(PerfMetric.DEFAULT_INSTANCE);
        }

        public final Builder setApplicationInfo(ApplicationInfo.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo((ApplicationInfo) builder.build());
            return this;
        }

        public final boolean hasTraceMetric() {
            return ((PerfMetric) this.instance).hasTraceMetric();
        }

        public final TraceMetric getTraceMetric() {
            return ((PerfMetric) this.instance).getTraceMetric();
        }

        public final Builder setTraceMetric(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric(traceMetric);
            return this;
        }

        public final boolean hasNetworkRequestMetric() {
            return ((PerfMetric) this.instance).hasNetworkRequestMetric();
        }

        public final NetworkRequestMetric getNetworkRequestMetric() {
            return ((PerfMetric) this.instance).getNetworkRequestMetric();
        }

        public final Builder setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public final boolean hasGaugeMetric() {
            return ((PerfMetric) this.instance).hasGaugeMetric();
        }

        public final GaugeMetric getGaugeMetric() {
            return ((PerfMetric) this.instance).getGaugeMetric();
        }

        public final Builder setGaugeMetric(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric(gaugeMetric);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.PerfMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new PerfMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<PerfMetric> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (PerfMetric.class) {
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
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        GeneratedMessageLite.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<PerfMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
