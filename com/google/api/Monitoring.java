package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.ListPopupWindow;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class Monitoring extends GeneratedMessageLite<Monitoring, asBinder> implements layoutHorizontal {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Monitoring DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<Monitoring> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<MonitoringDestination> consumerDestinations_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<MonitoringDestination> producerDestinations_ = emptyProtobufList();

    public interface read extends ListPopupWindow {
    }

    private Monitoring() {
    }

    public static final class MonitoringDestination extends GeneratedMessageLite<MonitoringDestination, read> implements read {
        /* access modifiers changed from: private */
        public static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<MonitoringDestination> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        private MonitoringDestination() {
        }

        public final String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public final getBaseline getMonitoredResourceBytes() {
            return getBaseline.asBinder(this.monitoredResource_);
        }

        /* access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            this.monitoredResource_ = str;
        }

        /* access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        /* access modifiers changed from: private */
        public void setMonitoredResourceBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.monitoredResource_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final List<String> getMetricsList() {
            return this.metrics_;
        }

        public final int getMetricsCount() {
            return this.metrics_.size();
        }

        public final String getMetrics(int i) {
            return (String) this.metrics_.get(i);
        }

        public final getBaseline getMetricsBytes(int i) {
            return getBaseline.asBinder((String) this.metrics_.get(i));
        }

        private void ensureMetricsIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.metrics_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setMetrics(int i, String str) {
            ensureMetricsIsMutable();
            this.metrics_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addMetrics(String str) {
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            onLongPress.addAll(iterable, this.metrics_);
        }

        /* access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addMetricsBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            ensureMetricsIsMutable();
            this.metrics_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static MonitoringDestination parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static MonitoringDestination parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static MonitoringDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringDestination parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MonitoringDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MonitoringDestination parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static MonitoringDestination parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(MonitoringDestination monitoringDestination) {
            return (read) DEFAULT_INSTANCE.createBuilder(monitoringDestination);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<MonitoringDestination, read> implements read {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass1.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new MonitoringDestination();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<MonitoringDestination> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (MonitoringDestination.class) {
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
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            GeneratedMessageLite.registerDefaultInstance(MonitoringDestination.class, monitoringDestination);
        }

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<MonitoringDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.Monitoring$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Monitoring.AnonymousClass1.<clinit>():void");
        }
    }

    public final List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public final List<? extends read> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public final int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public final MonitoringDestination getProducerDestinations(int i) {
        return (MonitoringDestination) this.producerDestinations_.get(i);
    }

    public final read getProducerDestinationsOrBuilder(int i) {
        return (read) this.producerDestinations_.get(i);
    }

    private void ensureProducerDestinationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<MonitoringDestination> audioAttributesCompatParcelizer = this.producerDestinations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(MonitoringDestination monitoringDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        onLongPress.addAll(iterable, this.producerDestinations_);
    }

    /* access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeProducerDestinations(int i) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i);
    }

    public final List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public final List<? extends read> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public final int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public final MonitoringDestination getConsumerDestinations(int i) {
        return (MonitoringDestination) this.consumerDestinations_.get(i);
    }

    public final read getConsumerDestinationsOrBuilder(int i) {
        return (read) this.consumerDestinations_.get(i);
    }

    private void ensureConsumerDestinationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<MonitoringDestination> audioAttributesCompatParcelizer = this.consumerDestinations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        onLongPress.addAll(iterable, this.consumerDestinations_);
    }

    /* access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Monitoring parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Monitoring parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Monitoring parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Monitoring parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitoring) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Monitoring) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Monitoring parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Monitoring parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(Monitoring monitoring) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Monitoring, asBinder> implements layoutHorizontal {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(Monitoring.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Monitoring();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Monitoring> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Monitoring.class) {
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
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        GeneratedMessageLite.registerDefaultInstance(Monitoring.class, monitoring);
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Monitoring> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
