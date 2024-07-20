package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.GaugeMetadata;
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

public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<AndroidMemoryReading> androidMemoryReadings_ = emptyProtobufList();
    private int bitField0_;
    private measureNullChild.AudioAttributesCompatParcelizer<CpuMetricReading> cpuMetricReadings_ = emptyProtobufList();
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";

    private GaugeMetric() {
    }

    public final boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final getBaseline getSessionIdBytes() {
        return getBaseline.asBinder(this.sessionId_);
    }

    /* access modifiers changed from: private */
    public void setSessionId(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* access modifiers changed from: private */
    public void setSessionIdBytes(getBaseline getbaseline) {
        this.sessionId_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    public final boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public final GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.getDefaultInstance() : gaugeMetadata;
    }

    /* access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 == null || gaugeMetadata2 == GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = gaugeMetadata;
        } else {
            this.gaugeMetadata_ = (GaugeMetadata) ((GaugeMetadata.Builder) GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom(gaugeMetadata)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    public final List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public final List<? extends CpuMetricReadingOrBuilder> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public final int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public final CpuMetricReading getCpuMetricReadings(int i) {
        return (CpuMetricReading) this.cpuMetricReadings_.get(i);
    }

    public final CpuMetricReadingOrBuilder getCpuMetricReadingsOrBuilder(int i) {
        return (CpuMetricReadingOrBuilder) this.cpuMetricReadings_.get(i);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<CpuMetricReading> audioAttributesCompatParcelizer = this.cpuMetricReadings_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i, cpuMetricReading);
    }

    /* access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* access modifiers changed from: private */
    public void addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i, cpuMetricReading);
    }

    /* access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        onLongPress.addAll(iterable, this.cpuMetricReadings_);
    }

    /* access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeCpuMetricReadings(int i) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i);
    }

    public final List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public final List<? extends AndroidMemoryReadingOrBuilder> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public final int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public final AndroidMemoryReading getAndroidMemoryReadings(int i) {
        return (AndroidMemoryReading) this.androidMemoryReadings_.get(i);
    }

    public final AndroidMemoryReadingOrBuilder getAndroidMemoryReadingsOrBuilder(int i) {
        return (AndroidMemoryReadingOrBuilder) this.androidMemoryReadings_.get(i);
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<AndroidMemoryReading> audioAttributesCompatParcelizer = this.androidMemoryReadings_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i, androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i, androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        onLongPress.addAll(iterable, this.androidMemoryReadings_);
    }

    /* access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static GaugeMetric parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static GaugeMetric parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (GaugeMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static GaugeMetric parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static GaugeMetric parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(GaugeMetric gaugeMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata(gaugeMetadata);
            return this;
        }

        public final Builder addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(cpuMetricReading);
            return this;
        }

        public final Builder addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(androidMemoryReading);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.GaugeMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<GaugeMetric> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (GaugeMetric.class) {
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
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<GaugeMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
