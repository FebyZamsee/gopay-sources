package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.ListPopupWindow;
import o.drawDividersHorizontal;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class Distribution extends GeneratedMessageLite<Distribution, read> implements layoutHorizontal {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<Distribution> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private measureNullChild.AudioAttributesImplApi21Parcelizer bucketCounts_ = emptyLongList();
    private BucketOptions bucketOptions_;
    private long count_;
    private measureNullChild.AudioAttributesCompatParcelizer<Exemplar> exemplars_ = emptyProtobufList();
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    public interface onTransact extends ListPopupWindow {
    }

    private Distribution() {
    }

    public static final class Range extends GeneratedMessageLite<Range, asBinder> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<Range> PARSER;
        private double max_;
        private double min_;

        private Range() {
        }

        public final double getMin() {
            return this.min_;
        }

        /* access modifiers changed from: private */
        public void setMin(double d) {
            this.min_ = d;
        }

        /* access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0.0d;
        }

        public final double getMax() {
            return this.max_;
        }

        /* access modifiers changed from: private */
        public void setMax(double d) {
            this.max_ = d;
        }

        /* access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0.0d;
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Range parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Range parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Range parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Range parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Range) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Range parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Range parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(Range range) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(range);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Range, asBinder> implements layoutHorizontal {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(Range.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Range();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Range> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Range.class) {
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
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            GeneratedMessageLite.registerDefaultInstance(Range.class, range);
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Range> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.Distribution$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Distribution.AnonymousClass2.<clinit>():void");
        }
    }

    public static final class BucketOptions extends GeneratedMessageLite<BucketOptions, onTransact> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        private BucketOptions() {
        }

        public static final class Linear extends GeneratedMessageLite<Linear, RemoteActionCompatParcelizer> implements layoutHorizontal {
            /* access modifiers changed from: private */
            public static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile getAnimationStyle<Linear> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            private Linear() {
            }

            public final int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            public final double getWidth() {
                return this.width_;
            }

            /* access modifiers changed from: private */
            public void setWidth(double d) {
                this.width_ = d;
            }

            /* access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = 0.0d;
            }

            public final double getOffset() {
                return this.offset_;
            }

            /* access modifiers changed from: private */
            public void setOffset(double d) {
                this.offset_ = d;
            }

            /* access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = 0.0d;
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static Linear parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static Linear parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static Linear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Linear parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Linear) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Linear parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static Linear parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static RemoteActionCompatParcelizer newBuilder() {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
            }

            public static RemoteActionCompatParcelizer newBuilder(Linear linear) {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(linear);
            }

            public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Linear, RemoteActionCompatParcelizer> implements layoutHorizontal {
                /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                    this();
                }

                private RemoteActionCompatParcelizer() {
                    super(Linear.DEFAULT_INSTANCE);
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new Linear();
                    case 2:
                        return new RemoteActionCompatParcelizer((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<Linear> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (Linear.class) {
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
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                GeneratedMessageLite.registerDefaultInstance(Linear.class, linear);
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<Linear> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Exponential extends GeneratedMessageLite<Exponential, asBinder> implements layoutHorizontal {
            /* access modifiers changed from: private */
            public static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile getAnimationStyle<Exponential> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            private Exponential() {
            }

            public final int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            public final double getGrowthFactor() {
                return this.growthFactor_;
            }

            /* access modifiers changed from: private */
            public void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            /* access modifiers changed from: private */
            public void clearGrowthFactor() {
                this.growthFactor_ = 0.0d;
            }

            public final double getScale() {
                return this.scale_;
            }

            /* access modifiers changed from: private */
            public void setScale(double d) {
                this.scale_ = d;
            }

            /* access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = 0.0d;
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static Exponential parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static Exponential parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static Exponential parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Exponential parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Exponential) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Exponential parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static Exponential parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static asBinder newBuilder() {
                return (asBinder) DEFAULT_INSTANCE.createBuilder();
            }

            public static asBinder newBuilder(Exponential exponential) {
                return (asBinder) DEFAULT_INSTANCE.createBuilder(exponential);
            }

            public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Exponential, asBinder> implements layoutHorizontal {
                /* synthetic */ asBinder(byte b) {
                    this();
                }

                private asBinder() {
                    super(Exponential.DEFAULT_INSTANCE);
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new Exponential();
                    case 2:
                        return new asBinder((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<Exponential> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (Exponential.class) {
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
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                GeneratedMessageLite.registerDefaultInstance(Exponential.class, exponential);
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<Exponential> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Explicit extends GeneratedMessageLite<Explicit, read> implements layoutHorizontal {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Explicit DEFAULT_INSTANCE;
            private static volatile getAnimationStyle<Explicit> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private measureNullChild.asBinder bounds_ = emptyDoubleList();

            private Explicit() {
            }

            public final List<Double> getBoundsList() {
                return this.bounds_;
            }

            public final int getBoundsCount() {
                return this.bounds_.size();
            }

            public final double getBounds(int i) {
                return this.bounds_.RemoteActionCompatParcelizer(i);
            }

            private void ensureBoundsIsMutable() {
                measureNullChild.asBinder asbinder = this.bounds_;
                if (!asbinder.onTransact()) {
                    this.bounds_ = GeneratedMessageLite.mutableCopy(asbinder);
                }
            }

            /* access modifiers changed from: private */
            public void setBounds(int i, double d) {
                ensureBoundsIsMutable();
                this.bounds_.asBinder(i, d);
            }

            /* access modifiers changed from: private */
            public void addBounds(double d) {
                ensureBoundsIsMutable();
                this.bounds_.onTransact(d);
            }

            /* access modifiers changed from: private */
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                onLongPress.addAll(iterable, this.bounds_);
            }

            /* access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = emptyDoubleList();
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static Explicit parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static Explicit parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static Explicit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Explicit parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Explicit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Explicit parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static Explicit parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static read newBuilder() {
                return (read) DEFAULT_INSTANCE.createBuilder();
            }

            public static read newBuilder(Explicit explicit) {
                return (read) DEFAULT_INSTANCE.createBuilder(explicit);
            }

            public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Explicit, read> implements layoutHorizontal {
                /* synthetic */ read(byte b) {
                    this();
                }

                private read() {
                    super(Explicit.DEFAULT_INSTANCE);
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new Explicit();
                    case 2:
                        return new read((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<Explicit> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (Explicit.class) {
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
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                GeneratedMessageLite.registerDefaultInstance(Explicit.class, explicit);
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<Explicit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum RemoteActionCompatParcelizer {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);
            
            private final int IconCompatParcelizer;

            private RemoteActionCompatParcelizer(int i) {
                this.IconCompatParcelizer = i;
            }

            public static RemoteActionCompatParcelizer asBinder(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }
        }

        public final RemoteActionCompatParcelizer getOptionsCase() {
            return RemoteActionCompatParcelizer.asBinder(this.optionsCase_);
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public final boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        public final Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setLinearBuckets(Linear linear) {
            this.options_ = linear;
            this.optionsCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeLinearBuckets(Linear linear) {
            if (this.optionsCase_ != 1 || this.options_ == Linear.getDefaultInstance()) {
                this.options_ = linear;
            } else {
                this.options_ = ((Linear.RemoteActionCompatParcelizer) Linear.newBuilder((Linear) this.options_).mergeFrom(linear)).buildPartial();
            }
            this.optionsCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public final boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        public final Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setExponentialBuckets(Exponential exponential) {
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeExponentialBuckets(Exponential exponential) {
            if (this.optionsCase_ != 2 || this.options_ == Exponential.getDefaultInstance()) {
                this.options_ = exponential;
            } else {
                this.options_ = ((Exponential.asBinder) Exponential.newBuilder((Exponential) this.options_).mergeFrom(exponential)).buildPartial();
            }
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public final boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        public final Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setExplicitBuckets(Explicit explicit) {
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeExplicitBuckets(Explicit explicit) {
            if (this.optionsCase_ != 3 || this.options_ == Explicit.getDefaultInstance()) {
                this.options_ = explicit;
            } else {
                this.options_ = ((Explicit.read) Explicit.newBuilder((Explicit) this.options_).mergeFrom(explicit)).buildPartial();
            }
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static BucketOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static BucketOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static BucketOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (BucketOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static BucketOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static BucketOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(BucketOptions bucketOptions) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(bucketOptions);
        }

        public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<BucketOptions, onTransact> implements layoutHorizontal {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(BucketOptions.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new BucketOptions();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<BucketOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (BucketOptions.class) {
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
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            GeneratedMessageLite.registerDefaultInstance(BucketOptions.class, bucketOptions);
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<BucketOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Exemplar extends GeneratedMessageLite<Exemplar, RemoteActionCompatParcelizer> implements onTransact {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Exemplar DEFAULT_INSTANCE;
        private static volatile getAnimationStyle<Exemplar> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private measureNullChild.AudioAttributesCompatParcelizer<Any> attachments_ = emptyProtobufList();
        private Timestamp timestamp_;
        private double value_;

        private Exemplar() {
        }

        public final double getValue() {
            return this.value_;
        }

        /* access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        public final boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            this.timestamp_ = timestamp;
        }

        /* access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.timestamp_ = timestamp;
            } else {
                this.timestamp_ = (Timestamp) ((Timestamp.asInterface) Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        public final List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        public final List<? extends drawDividersHorizontal> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        public final int getAttachmentsCount() {
            return this.attachments_.size();
        }

        public final Any getAttachments(int i) {
            return (Any) this.attachments_.get(i);
        }

        public final drawDividersHorizontal getAttachmentsOrBuilder(int i) {
            return (drawDividersHorizontal) this.attachments_.get(i);
        }

        private void ensureAttachmentsIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<Any> audioAttributesCompatParcelizer = this.attachments_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.attachments_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setAttachments(int i, Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.set(i, any);
        }

        /* access modifiers changed from: private */
        public void addAttachments(Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.add(any);
        }

        /* access modifiers changed from: private */
        public void addAttachments(int i, Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.add(i, any);
        }

        /* access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends Any> iterable) {
            ensureAttachmentsIsMutable();
            onLongPress.addAll(iterable, this.attachments_);
        }

        /* access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeAttachments(int i) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Exemplar parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Exemplar parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Exemplar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Exemplar parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Exemplar parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(Exemplar exemplar) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(exemplar);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Exemplar, RemoteActionCompatParcelizer> implements onTransact {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(Exemplar.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Exemplar();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", Any.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Exemplar> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Exemplar.class) {
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
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            GeneratedMessageLite.registerDefaultInstance(Exemplar.class, exemplar);
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Exemplar> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public final long getCount() {
        return this.count_;
    }

    /* access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    public final double getMean() {
        return this.mean_;
    }

    /* access modifiers changed from: private */
    public void setMean(double d) {
        this.mean_ = d;
    }

    /* access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = 0.0d;
    }

    public final double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    /* access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    /* access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    public final boolean hasRange() {
        return this.range_ != null;
    }

    public final Range getRange() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    /* access modifiers changed from: private */
    public void setRange(Range range) {
        this.range_ = range;
    }

    /* access modifiers changed from: private */
    public void mergeRange(Range range) {
        Range range2 = this.range_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.range_ = range;
        } else {
            this.range_ = (Range) ((Range.asBinder) Range.newBuilder(this.range_).mergeFrom(range)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
    }

    public final boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    public final BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    /* access modifiers changed from: private */
    public void setBucketOptions(BucketOptions bucketOptions) {
        this.bucketOptions_ = bucketOptions;
    }

    /* access modifiers changed from: private */
    public void mergeBucketOptions(BucketOptions bucketOptions) {
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 == null || bucketOptions2 == BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = bucketOptions;
        } else {
            this.bucketOptions_ = (BucketOptions) ((BucketOptions.onTransact) BucketOptions.newBuilder(this.bucketOptions_).mergeFrom(bucketOptions)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    public final List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    public final int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public final long getBucketCounts(int i) {
        return this.bucketCounts_.onTransact(i);
    }

    private void ensureBucketCountsIsMutable() {
        measureNullChild.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = this.bucketCounts_;
        if (!audioAttributesImplApi21Parcelizer.onTransact()) {
            this.bucketCounts_ = GeneratedMessageLite.mutableCopy(audioAttributesImplApi21Parcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.RemoteActionCompatParcelizer(i, j);
    }

    /* access modifiers changed from: private */
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.onTransact(j);
    }

    /* access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        onLongPress.addAll(iterable, this.bucketCounts_);
    }

    /* access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = emptyLongList();
    }

    public final List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public final List<? extends onTransact> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public final int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public final Exemplar getExemplars(int i) {
        return (Exemplar) this.exemplars_.get(i);
    }

    public final onTransact getExemplarsOrBuilder(int i) {
        return (onTransact) this.exemplars_.get(i);
    }

    private void ensureExemplarsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Exemplar> audioAttributesCompatParcelizer = this.exemplars_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.exemplars_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
    }

    /* access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* access modifiers changed from: private */
    public void addExemplars(int i, Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, exemplar);
    }

    /* access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        onLongPress.addAll(iterable, this.exemplars_);
    }

    /* access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Distribution parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Distribution parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Distribution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Distribution parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Distribution) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Distribution parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Distribution parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(Distribution distribution) {
        return (read) DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Distribution, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(Distribution.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Distribution();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Distribution> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Distribution.class) {
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
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        GeneratedMessageLite.registerDefaultInstance(Distribution.class, distribution);
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Distribution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
