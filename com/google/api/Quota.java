package com.google.api;

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
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setSupportButtonTintList;
import o.setSupportCheckMarkTintList;

public final class Quota extends GeneratedMessageLite<Quota, onTransact> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile getAnimationStyle<Quota> PARSER;
    private measureNullChild.AudioAttributesCompatParcelizer<QuotaLimit> limits_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<MetricRule> metricRules_ = emptyProtobufList();

    private Quota() {
    }

    public final List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public final List<? extends setSupportCheckMarkTintList> getLimitsOrBuilderList() {
        return this.limits_;
    }

    public final int getLimitsCount() {
        return this.limits_.size();
    }

    public final QuotaLimit getLimits(int i) {
        return (QuotaLimit) this.limits_.get(i);
    }

    public final setSupportCheckMarkTintList getLimitsOrBuilder(int i) {
        return (setSupportCheckMarkTintList) this.limits_.get(i);
    }

    private void ensureLimitsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<QuotaLimit> audioAttributesCompatParcelizer = this.limits_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.limits_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setLimits(int i, QuotaLimit quotaLimit) {
        ensureLimitsIsMutable();
        this.limits_.set(i, quotaLimit);
    }

    /* access modifiers changed from: private */
    public void addLimits(QuotaLimit quotaLimit) {
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    /* access modifiers changed from: private */
    public void addLimits(int i, QuotaLimit quotaLimit) {
        ensureLimitsIsMutable();
        this.limits_.add(i, quotaLimit);
    }

    /* access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        onLongPress.addAll(iterable, this.limits_);
    }

    /* access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeLimits(int i) {
        ensureLimitsIsMutable();
        this.limits_.remove(i);
    }

    public final List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public final List<? extends setSupportButtonTintList> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public final int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    public final MetricRule getMetricRules(int i) {
        return (MetricRule) this.metricRules_.get(i);
    }

    public final setSupportButtonTintList getMetricRulesOrBuilder(int i) {
        return (setSupportButtonTintList) this.metricRules_.get(i);
    }

    private void ensureMetricRulesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<MetricRule> audioAttributesCompatParcelizer = this.metricRules_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.metricRules_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setMetricRules(int i, MetricRule metricRule) {
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i, metricRule);
    }

    /* access modifiers changed from: private */
    public void addMetricRules(MetricRule metricRule) {
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    /* access modifiers changed from: private */
    public void addMetricRules(int i, MetricRule metricRule) {
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i, metricRule);
    }

    /* access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        onLongPress.addAll(iterable, this.metricRules_);
    }

    /* access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeMetricRules(int i) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Quota parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Quota parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Quota) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Quota parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Quota parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(Quota quota) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<Quota, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(Quota.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Quota$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Quota.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Quota> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Quota.class) {
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
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        GeneratedMessageLite.registerDefaultInstance(Quota.class, quota);
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
