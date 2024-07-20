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

public final class Logging extends GeneratedMessageLite<Logging, RemoteActionCompatParcelizer> implements layoutHorizontal {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Logging DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<Logging> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<LoggingDestination> consumerDestinations_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<LoggingDestination> producerDestinations_ = emptyProtobufList();

    public interface onTransact extends ListPopupWindow {
    }

    private Logging() {
    }

    public static final class LoggingDestination extends GeneratedMessageLite<LoggingDestination, asBinder> implements onTransact {
        /* access modifiers changed from: private */
        public static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<LoggingDestination> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<String> logs_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        private LoggingDestination() {
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

        public final List<String> getLogsList() {
            return this.logs_;
        }

        public final int getLogsCount() {
            return this.logs_.size();
        }

        public final String getLogs(int i) {
            return (String) this.logs_.get(i);
        }

        public final getBaseline getLogsBytes(int i) {
            return getBaseline.asBinder((String) this.logs_.get(i));
        }

        private void ensureLogsIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.logs_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.logs_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setLogs(int i, String str) {
            ensureLogsIsMutable();
            this.logs_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addLogs(String str) {
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            onLongPress.addAll(iterable, this.logs_);
        }

        /* access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addLogsBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            ensureLogsIsMutable();
            this.logs_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static LoggingDestination parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static LoggingDestination parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static LoggingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingDestination parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (LoggingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static LoggingDestination parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static LoggingDestination parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(LoggingDestination loggingDestination) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(loggingDestination);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<LoggingDestination, asBinder> implements onTransact {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass1.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new LoggingDestination();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<LoggingDestination> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (LoggingDestination.class) {
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
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            GeneratedMessageLite.registerDefaultInstance(LoggingDestination.class, loggingDestination);
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<LoggingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.Logging$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] asBinder;

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
                asBinder = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Logging.AnonymousClass1.<clinit>():void");
        }
    }

    public final List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public final List<? extends onTransact> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public final int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public final LoggingDestination getProducerDestinations(int i) {
        return (LoggingDestination) this.producerDestinations_.get(i);
    }

    public final onTransact getProducerDestinationsOrBuilder(int i) {
        return (onTransact) this.producerDestinations_.get(i);
    }

    private void ensureProducerDestinationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<LoggingDestination> audioAttributesCompatParcelizer = this.producerDestinations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setProducerDestinations(int i, LoggingDestination loggingDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(LoggingDestination loggingDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(int i, LoggingDestination loggingDestination) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
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

    public final List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public final List<? extends onTransact> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public final int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public final LoggingDestination getConsumerDestinations(int i) {
        return (LoggingDestination) this.consumerDestinations_.get(i);
    }

    public final onTransact getConsumerDestinationsOrBuilder(int i) {
        return (onTransact) this.consumerDestinations_.get(i);
    }

    private void ensureConsumerDestinationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<LoggingDestination> audioAttributesCompatParcelizer = this.consumerDestinations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, LoggingDestination loggingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(LoggingDestination loggingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, LoggingDestination loggingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, loggingDestination);
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
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

    public static Logging parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Logging parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Logging parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Logging parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Logging parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Logging) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Logging parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Logging parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(Logging logging) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Logging, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(Logging.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Logging();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Logging> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Logging.class) {
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
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        GeneratedMessageLite.registerDefaultInstance(Logging.class, logging);
    }

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Logging> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
