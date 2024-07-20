package com.google.api;

import com.google.protobuf.Duration;
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
import o.getSupportButtonTintList;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setButtonDrawable;
import o.setSupportButtonTintMode;

public final class MetricDescriptor extends GeneratedMessageLite<MetricDescriptor, onTransact> implements setSupportButtonTintMode {
    /* access modifiers changed from: private */
    public static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<MetricDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_ = "";
    private String displayName_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<LabelDescriptor> labels_ = emptyProtobufList();
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private String name_ = "";
    private String type_ = "";
    private String unit_ = "";
    private int valueType_;

    private MetricDescriptor() {
    }

    public enum read implements measureNullChild.read {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);
        
        private final int IconCompatParcelizer;

        static {
            new measureNullChild.asInterface<read>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return read.read(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.IconCompatParcelizer;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static read read(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        private read(int i) {
            this.IconCompatParcelizer = i;
        }
    }

    public enum RemoteActionCompatParcelizer implements measureNullChild.read {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);
        
        private final int AudioAttributesImplApi26Parcelizer;

        static {
            new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return RemoteActionCompatParcelizer.asInterface(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.AudioAttributesImplApi26Parcelizer;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static RemoteActionCompatParcelizer asInterface(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        private RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }
    }

    public static final class MetricDescriptorMetadata extends GeneratedMessageLite<MetricDescriptorMetadata, read> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<MetricDescriptorMetadata> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        private MetricDescriptorMetadata() {
        }

        @Deprecated
        public final int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Deprecated
        public final getSupportButtonTintList getLaunchStage() {
            getSupportButtonTintList read2 = getSupportButtonTintList.read(this.launchStage_);
            return read2 == null ? getSupportButtonTintList.UNRECOGNIZED : read2;
        }

        /* access modifiers changed from: private */
        public void setLaunchStageValue(int i) {
            this.launchStage_ = i;
        }

        /* access modifiers changed from: private */
        public void setLaunchStage(getSupportButtonTintList getsupportbuttontintlist) {
            this.launchStage_ = getsupportbuttontintlist.getNumber();
        }

        /* access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        public final boolean hasSamplePeriod() {
            return this.samplePeriod_ != null;
        }

        public final Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        /* access modifiers changed from: private */
        public void setSamplePeriod(Duration duration) {
            this.samplePeriod_ = duration;
        }

        /* access modifiers changed from: private */
        public void mergeSamplePeriod(Duration duration) {
            Duration duration2 = this.samplePeriod_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.samplePeriod_ = duration;
            } else {
                this.samplePeriod_ = (Duration) ((Duration.asInterface) Duration.newBuilder(this.samplePeriod_).mergeFrom(duration)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
        }

        public final boolean hasIngestDelay() {
            return this.ingestDelay_ != null;
        }

        public final Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        /* access modifiers changed from: private */
        public void setIngestDelay(Duration duration) {
            this.ingestDelay_ = duration;
        }

        /* access modifiers changed from: private */
        public void mergeIngestDelay(Duration duration) {
            Duration duration2 = this.ingestDelay_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.ingestDelay_ = duration;
            } else {
                this.ingestDelay_ = (Duration) ((Duration.asInterface) Duration.newBuilder(this.ingestDelay_).mergeFrom(duration)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static MetricDescriptorMetadata parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static MetricDescriptorMetadata parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MetricDescriptorMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MetricDescriptorMetadata parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static MetricDescriptorMetadata parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (read) DEFAULT_INSTANCE.createBuilder(metricDescriptorMetadata);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<MetricDescriptorMetadata, read> implements layoutHorizontal {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass4.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new MetricDescriptorMetadata();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<MetricDescriptorMetadata> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (MetricDescriptorMetadata.class) {
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
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            GeneratedMessageLite.registerDefaultInstance(MetricDescriptorMetadata.class, metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<MetricDescriptorMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.MetricDescriptor$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.MetricDescriptor.AnonymousClass4.<clinit>():void");
        }
    }

    public final String getName() {
        return this.name_;
    }

    public final getBaseline getNameBytes() {
        return getBaseline.asBinder(this.name_);
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void setNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getType() {
        return this.type_;
    }

    public final getBaseline getTypeBytes() {
        return getBaseline.asBinder(this.type_);
    }

    /* access modifiers changed from: private */
    public void setType(String str) {
        this.type_ = str;
    }

    /* access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* access modifiers changed from: private */
    public void setTypeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.type_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public final List<? extends setButtonDrawable> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public final int getLabelsCount() {
        return this.labels_.size();
    }

    public final LabelDescriptor getLabels(int i) {
        return (LabelDescriptor) this.labels_.get(i);
    }

    public final setButtonDrawable getLabelsOrBuilder(int i) {
        return (setButtonDrawable) this.labels_.get(i);
    }

    private void ensureLabelsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<LabelDescriptor> audioAttributesCompatParcelizer = this.labels_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setLabels(int i, LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        onLongPress.addAll(iterable, this.labels_);
    }

    /* access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
    }

    public final int getMetricKindValue() {
        return this.metricKind_;
    }

    public final read getMetricKind() {
        read read2 = read.read(this.metricKind_);
        return read2 == null ? read.UNRECOGNIZED : read2;
    }

    /* access modifiers changed from: private */
    public void setMetricKindValue(int i) {
        this.metricKind_ = i;
    }

    /* access modifiers changed from: private */
    public void setMetricKind(read read2) {
        this.metricKind_ = read2.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    public final int getValueTypeValue() {
        return this.valueType_;
    }

    public final RemoteActionCompatParcelizer getValueType() {
        RemoteActionCompatParcelizer asInterface = RemoteActionCompatParcelizer.asInterface(this.valueType_);
        return asInterface == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : asInterface;
    }

    /* access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    /* access modifiers changed from: private */
    public void setValueType(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.valueType_ = remoteActionCompatParcelizer.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public final String getUnit() {
        return this.unit_;
    }

    public final getBaseline getUnitBytes() {
        return getBaseline.asBinder(this.unit_);
    }

    /* access modifiers changed from: private */
    public void setUnit(String str) {
        this.unit_ = str;
    }

    /* access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* access modifiers changed from: private */
    public void setUnitBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.unit_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final getBaseline getDescriptionBytes() {
        return getBaseline.asBinder(this.description_);
    }

    /* access modifiers changed from: private */
    public void setDescription(String str) {
        this.description_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void setDescriptionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.description_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final getBaseline getDisplayNameBytes() {
        return getBaseline.asBinder(this.displayName_);
    }

    /* access modifiers changed from: private */
    public void setDisplayName(String str) {
        this.displayName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* access modifiers changed from: private */
    public void setDisplayNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.displayName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public final MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    /* access modifiers changed from: private */
    public void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        this.metadata_ = metricDescriptorMetadata;
    }

    /* access modifiers changed from: private */
    public void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 == null || metricDescriptorMetadata2 == MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = metricDescriptorMetadata;
        } else {
            this.metadata_ = (MetricDescriptorMetadata) ((MetricDescriptorMetadata.read) MetricDescriptorMetadata.newBuilder(this.metadata_).mergeFrom(metricDescriptorMetadata)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    public final int getLaunchStageValue() {
        return this.launchStage_;
    }

    public final getSupportButtonTintList getLaunchStage() {
        getSupportButtonTintList read2 = getSupportButtonTintList.read(this.launchStage_);
        return read2 == null ? getSupportButtonTintList.UNRECOGNIZED : read2;
    }

    /* access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
    }

    /* access modifiers changed from: private */
    public void setLaunchStage(getSupportButtonTintList getsupportbuttontintlist) {
        this.launchStage_ = getsupportbuttontintlist.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static MetricDescriptor parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static MetricDescriptor parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (MetricDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static MetricDescriptor parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static MetricDescriptor parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(MetricDescriptor metricDescriptor) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<MetricDescriptor, onTransact> implements setSupportButtonTintMode {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new MetricDescriptor();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<MetricDescriptor> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (MetricDescriptor.class) {
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
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<MetricDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
