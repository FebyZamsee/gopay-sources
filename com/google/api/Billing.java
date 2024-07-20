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

public final class Billing extends GeneratedMessageLite<Billing, onTransact> implements layoutHorizontal {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final Billing DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<Billing> PARSER;
    private measureNullChild.AudioAttributesCompatParcelizer<BillingDestination> consumerDestinations_ = emptyProtobufList();

    public interface asInterface extends ListPopupWindow {
    }

    private Billing() {
    }

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, asInterface> implements asInterface {
        /* access modifiers changed from: private */
        public static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<BillingDestination> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        private BillingDestination() {
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

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static BillingDestination parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static BillingDestination parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static BillingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BillingDestination parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (BillingDestination) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static BillingDestination parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static BillingDestination parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asInterface newBuilder() {
            return (asInterface) DEFAULT_INSTANCE.createBuilder();
        }

        public static asInterface newBuilder(BillingDestination billingDestination) {
            return (asInterface) DEFAULT_INSTANCE.createBuilder(billingDestination);
        }

        public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<BillingDestination, asInterface> implements asInterface {
            /* synthetic */ asInterface(byte b) {
                this();
            }

            private asInterface() {
                super(BillingDestination.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new BillingDestination();
                case 2:
                    return new asInterface((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<BillingDestination> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (BillingDestination.class) {
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
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            GeneratedMessageLite.registerDefaultInstance(BillingDestination.class, billingDestination);
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<BillingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.Billing$4  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Billing.AnonymousClass4.<clinit>():void");
        }
    }

    public final List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public final List<? extends asInterface> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public final int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public final BillingDestination getConsumerDestinations(int i) {
        return (BillingDestination) this.consumerDestinations_.get(i);
    }

    public final asInterface getConsumerDestinationsOrBuilder(int i) {
        return (asInterface) this.consumerDestinations_.get(i);
    }

    private void ensureConsumerDestinationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<BillingDestination> audioAttributesCompatParcelizer = this.consumerDestinations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, BillingDestination billingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, billingDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(BillingDestination billingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billingDestination);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, BillingDestination billingDestination) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, billingDestination);
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
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

    public static Billing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Billing parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Billing parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Billing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Billing parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Billing) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Billing parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Billing parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(Billing billing) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<Billing, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(Billing.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Billing();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Billing> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Billing.class) {
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
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        GeneratedMessageLite.registerDefaultInstance(Billing.class, billing);
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Billing> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
