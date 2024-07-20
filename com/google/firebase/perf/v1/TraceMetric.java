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

public final class TraceMetric extends GeneratedMessageLite<TraceMetric, Builder> implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private setWeightSum<String, Long> counters_ = setWeightSum.asInterface();
    private setWeightSum<String, String> customAttributes_ = setWeightSum.asInterface();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<PerfSession> perfSessions_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<TraceMetric> subtraces_ = emptyProtobufList();

    static final class CountersDefaultEntryHolder {
        static final setVerticalGravity<String, Long> defaultEntry = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.INT64, 0L);
    }

    static final class CustomAttributesDefaultEntryHolder {
        static final setVerticalGravity<String, String> defaultEntry = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
    }

    private TraceMetric() {
    }

    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getName() {
        return this.name_;
    }

    public final getBaseline getNameBytes() {
        return getBaseline.asBinder(this.name_);
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void setNameBytes(getBaseline getbaseline) {
        this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    public final boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean getIsAuto() {
        return this.isAuto_;
    }

    /* access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    public final boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public final long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    /* access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0;
    }

    public final boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public final long getDurationUs() {
        return this.durationUs_;
    }

    /* access modifiers changed from: private */
    public void setDurationUs(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0;
    }

    private setWeightSum<String, Long> internalGetCounters() {
        return this.counters_;
    }

    private setWeightSum<String, Long> internalGetMutableCounters() {
        if (!this.counters_.asBinder) {
            setWeightSum<String, Long> setweightsum = this.counters_;
            this.counters_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.counters_;
    }

    public final int getCountersCount() {
        return internalGetCounters().size();
    }

    public final boolean containsCounters(String str) {
        return internalGetCounters().containsKey(str);
    }

    @Deprecated
    public final Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public final Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    public final long getCountersOrDefault(String str, long j) {
        setWeightSum<String, Long> internalGetCounters = internalGetCounters();
        return internalGetCounters.containsKey(str) ? internalGetCounters.get(str).longValue() : j;
    }

    public final long getCountersOrThrow(String str) {
        setWeightSum<String, Long> internalGetCounters = internalGetCounters();
        if (internalGetCounters.containsKey(str)) {
            return internalGetCounters.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    public final List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public final List<? extends TraceMetricOrBuilder> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public final int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public final TraceMetric getSubtraces(int i) {
        return (TraceMetric) this.subtraces_.get(i);
    }

    public final TraceMetricOrBuilder getSubtracesOrBuilder(int i) {
        return (TraceMetricOrBuilder) this.subtraces_.get(i);
    }

    private void ensureSubtracesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<TraceMetric> audioAttributesCompatParcelizer = this.subtraces_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setSubtraces(int i, TraceMetric traceMetric) {
        ensureSubtracesIsMutable();
        this.subtraces_.set(i, traceMetric);
    }

    /* access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* access modifiers changed from: private */
    public void addSubtraces(int i, TraceMetric traceMetric) {
        ensureSubtracesIsMutable();
        this.subtraces_.add(i, traceMetric);
    }

    /* access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        onLongPress.addAll(iterable, this.subtraces_);
    }

    /* access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeSubtraces(int i) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i);
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

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static TraceMetric parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static TraceMetric parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static TraceMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (TraceMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static TraceMetric parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static TraceMetric parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TraceMetric traceMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<TraceMetric, Builder> implements TraceMetricOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }

        public final Builder setName(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).setName(str);
            return this;
        }

        public final Builder setClientStartTimeUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setClientStartTimeUs(j);
            return this;
        }

        public final Builder setDurationUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setDurationUs(j);
            return this;
        }

        public final Builder putCounters(String str, long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().put(str, Long.valueOf(j));
            return this;
        }

        public final Builder putAllCounters(Map<String, Long> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().putAll(map);
            return this;
        }

        public final Builder addSubtraces(TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(traceMetric);
            return this;
        }

        public final Builder addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllSubtraces(iterable);
            return this;
        }

        public final Builder putCustomAttributes(String str, String str2) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        public final Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public final Builder addPerfSessions(PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(perfSession);
            return this;
        }

        public final Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.TraceMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        Class<TraceMetric> cls = TraceMetric.class;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", CountersDefaultEntryHolder.defaultEntry, "subtraces_", cls, "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<TraceMetric> getanimationstyle = PARSER;
                if (getanimationstyle == null) {
                    synchronized (cls) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact<>(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
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
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<TraceMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
