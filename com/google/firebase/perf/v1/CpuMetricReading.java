package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;

public final class CpuMetricReading extends GeneratedMessageLite<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<CpuMetricReading> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    private CpuMetricReading() {
    }

    public final boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public final long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    /* access modifiers changed from: private */
    public void setClientTimeUs(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0;
    }

    public final boolean hasUserTimeUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public final long getUserTimeUs() {
        return this.userTimeUs_;
    }

    /* access modifiers changed from: private */
    public void setUserTimeUs(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0;
    }

    public final boolean hasSystemTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public final long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    /* access modifiers changed from: private */
    public void setSystemTimeUs(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0;
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static CpuMetricReading parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static CpuMetricReading parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static CpuMetricReading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CpuMetricReading parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) throws IOException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CpuMetricReading) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (CpuMetricReading) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static CpuMetricReading parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static CpuMetricReading parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CpuMetricReading cpuMetricReading) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(CpuMetricReading.DEFAULT_INSTANCE);
        }

        public final Builder setClientTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setClientTimeUs(j);
            return this;
        }

        public final Builder setUserTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setUserTimeUs(j);
            return this;
        }

        public final Builder setSystemTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setSystemTimeUs(j);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.CpuMetricReading$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.CpuMetricReading.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new CpuMetricReading();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<CpuMetricReading> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (CpuMetricReading.class) {
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
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        GeneratedMessageLite.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<CpuMetricReading> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
