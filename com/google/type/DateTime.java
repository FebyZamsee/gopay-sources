package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.type.TimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;

public final class DateTime extends GeneratedMessageLite<DateTime, read> implements layoutHorizontal {
    public static final int DAY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile getAnimationStyle<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    private DateTime() {
    }

    public enum RemoteActionCompatParcelizer {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);
        
        private final int onTransact;

        private RemoteActionCompatParcelizer(int i) {
            this.onTransact = i;
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }
    }

    public final RemoteActionCompatParcelizer getTimeOffsetCase() {
        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.timeOffsetCase_);
    }

    /* access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    public final int getYear() {
        return this.year_;
    }

    /* access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    /* access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public final int getMonth() {
        return this.month_;
    }

    /* access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    public final int getDay() {
        return this.day_;
    }

    /* access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    public final int getHours() {
        return this.hours_;
    }

    /* access modifiers changed from: private */
    public void setHours(int i) {
        this.hours_ = i;
    }

    /* access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    public final int getMinutes() {
        return this.minutes_;
    }

    /* access modifiers changed from: private */
    public void setMinutes(int i) {
        this.minutes_ = i;
    }

    /* access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    public final int getSeconds() {
        return this.seconds_;
    }

    /* access modifiers changed from: private */
    public void setSeconds(int i) {
        this.seconds_ = i;
    }

    /* access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public final int getNanos() {
        return this.nanos_;
    }

    /* access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public final boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    public final Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration) this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setUtcOffset(Duration duration) {
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void mergeUtcOffset(Duration duration) {
        if (this.timeOffsetCase_ != 8 || this.timeOffset_ == Duration.getDefaultInstance()) {
            this.timeOffset_ = duration;
        } else {
            this.timeOffset_ = ((Duration.asInterface) Duration.newBuilder((Duration) this.timeOffset_).mergeFrom(duration)).buildPartial();
        }
        this.timeOffsetCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    public final boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    public final TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone) this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setTimeZone(TimeZone timeZone) {
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void mergeTimeZone(TimeZone timeZone) {
        if (this.timeOffsetCase_ != 9 || this.timeOffset_ == TimeZone.getDefaultInstance()) {
            this.timeOffset_ = timeZone;
        } else {
            this.timeOffset_ = ((TimeZone.onTransact) TimeZone.newBuilder((TimeZone) this.timeOffset_).mergeFrom(timeZone)).buildPartial();
        }
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static DateTime parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static DateTime parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (DateTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static DateTime parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static DateTime parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(DateTime dateTime) {
        return (read) DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<DateTime, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(DateTime.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.type.DateTime$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] asInterface;

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
                asInterface = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.DateTime.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<DateTime> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (DateTime.class) {
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
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<DateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
