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
import o.layoutHorizontal;
import o.setOnItemClickListener;
import o.setVerticalGravity;
import o.setWeightSum;

public final class Metric extends GeneratedMessageLite<Metric, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Metric DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<Metric> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private setWeightSum<String, String> labels_ = setWeightSum.asInterface();
    private String type_ = "";

    static final class onTransact {
        static final setVerticalGravity<String, String> onTransact = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
    }

    private Metric() {
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

    private setWeightSum<String, String> internalGetLabels() {
        return this.labels_;
    }

    private setWeightSum<String, String> internalGetMutableLabels() {
        if (!this.labels_.asBinder) {
            setWeightSum<String, String> setweightsum = this.labels_;
            this.labels_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.labels_;
    }

    public final int getLabelsCount() {
        return internalGetLabels().size();
    }

    public final boolean containsLabels(String str) {
        return internalGetLabels().containsKey(str);
    }

    @Deprecated
    public final Map<String, String> getLabels() {
        return getLabelsMap();
    }

    public final Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    public final String getLabelsOrDefault(String str, String str2) {
        setWeightSum<String, String> internalGetLabels = internalGetLabels();
        return internalGetLabels.containsKey(str) ? internalGetLabels.get(str) : str2;
    }

    public final String getLabelsOrThrow(String str) {
        setWeightSum<String, String> internalGetLabels = internalGetLabels();
        if (internalGetLabels.containsKey(str)) {
            return internalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Metric parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Metric parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Metric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Metric parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Metric parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Metric metric) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(metric);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Metric, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Metric.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Metric$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Metric.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Metric();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", onTransact.onTransact, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Metric> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Metric.class) {
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
        Metric metric = new Metric();
        DEFAULT_INSTANCE = metric;
        GeneratedMessageLite.registerDefaultInstance(Metric.class, metric);
    }

    public static Metric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Metric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
