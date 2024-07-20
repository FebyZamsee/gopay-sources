package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.setOnItemClickListener;
import o.setSupportCheckMarkTintList;
import o.setVerticalGravity;
import o.setWeightSum;

public final class QuotaLimit extends GeneratedMessageLite<QuotaLimit, RemoteActionCompatParcelizer> implements setSupportCheckMarkTintList {
    /* access modifiers changed from: private */
    public static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile getAnimationStyle<QuotaLimit> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_ = "";
    private String displayName_ = "";
    private String duration_ = "";
    private long freeTier_;
    private long maxLimit_;
    private String metric_ = "";
    private String name_ = "";
    private String unit_ = "";
    private setWeightSum<String, Long> values_ = setWeightSum.asInterface();

    static final class asInterface {
        static final setVerticalGravity<String, Long> asInterface = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.INT64, 0L);
    }

    private QuotaLimit() {
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

    public final long getDefaultLimit() {
        return this.defaultLimit_;
    }

    /* access modifiers changed from: private */
    public void setDefaultLimit(long j) {
        this.defaultLimit_ = j;
    }

    /* access modifiers changed from: private */
    public void clearDefaultLimit() {
        this.defaultLimit_ = 0;
    }

    public final long getMaxLimit() {
        return this.maxLimit_;
    }

    /* access modifiers changed from: private */
    public void setMaxLimit(long j) {
        this.maxLimit_ = j;
    }

    /* access modifiers changed from: private */
    public void clearMaxLimit() {
        this.maxLimit_ = 0;
    }

    public final long getFreeTier() {
        return this.freeTier_;
    }

    /* access modifiers changed from: private */
    public void setFreeTier(long j) {
        this.freeTier_ = j;
    }

    /* access modifiers changed from: private */
    public void clearFreeTier() {
        this.freeTier_ = 0;
    }

    public final String getDuration() {
        return this.duration_;
    }

    public final getBaseline getDurationBytes() {
        return getBaseline.asBinder(this.duration_);
    }

    /* access modifiers changed from: private */
    public void setDuration(String str) {
        this.duration_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = getDefaultInstance().getDuration();
    }

    /* access modifiers changed from: private */
    public void setDurationBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.duration_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getMetric() {
        return this.metric_;
    }

    public final getBaseline getMetricBytes() {
        return getBaseline.asBinder(this.metric_);
    }

    /* access modifiers changed from: private */
    public void setMetric(String str) {
        this.metric_ = str;
    }

    /* access modifiers changed from: private */
    public void clearMetric() {
        this.metric_ = getDefaultInstance().getMetric();
    }

    /* access modifiers changed from: private */
    public void setMetricBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.metric_ = getbaseline.AudioAttributesImplApi26Parcelizer();
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

    private setWeightSum<String, Long> internalGetValues() {
        return this.values_;
    }

    private setWeightSum<String, Long> internalGetMutableValues() {
        if (!this.values_.asBinder) {
            setWeightSum<String, Long> setweightsum = this.values_;
            this.values_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.values_;
    }

    public final int getValuesCount() {
        return internalGetValues().size();
    }

    public final boolean containsValues(String str) {
        return internalGetValues().containsKey(str);
    }

    @Deprecated
    public final Map<String, Long> getValues() {
        return getValuesMap();
    }

    public final Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    public final long getValuesOrDefault(String str, long j) {
        setWeightSum<String, Long> internalGetValues = internalGetValues();
        return internalGetValues.containsKey(str) ? internalGetValues.get(str).longValue() : j;
    }

    public final long getValuesOrThrow(String str) {
        setWeightSum<String, Long> internalGetValues = internalGetValues();
        if (internalGetValues.containsKey(str)) {
            return internalGetValues.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, Long> getMutableValuesMap() {
        return internalGetMutableValues();
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

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static QuotaLimit parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static QuotaLimit parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static QuotaLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuotaLimit parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (QuotaLimit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static QuotaLimit parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static QuotaLimit parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(QuotaLimit quotaLimit) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(quotaLimit);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<QuotaLimit, RemoteActionCompatParcelizer> implements setSupportCheckMarkTintList {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(QuotaLimit.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.QuotaLimit$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onTransact;

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
                onTransact = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.QuotaLimit.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new QuotaLimit();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", asInterface.asInterface, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<QuotaLimit> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (QuotaLimit.class) {
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
        QuotaLimit quotaLimit = new QuotaLimit();
        DEFAULT_INSTANCE = quotaLimit;
        GeneratedMessageLite.registerDefaultInstance(QuotaLimit.class, quotaLimit);
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<QuotaLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
