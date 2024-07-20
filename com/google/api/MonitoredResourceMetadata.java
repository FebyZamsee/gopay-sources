package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
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

public final class MonitoredResourceMetadata extends GeneratedMessageLite<MonitoredResourceMetadata, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<MonitoredResourceMetadata> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private Struct systemLabels_;
    private setWeightSum<String, String> userLabels_ = setWeightSum.asInterface();

    static final class RemoteActionCompatParcelizer {
        static final setVerticalGravity<String, String> asBinder = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
    }

    private MonitoredResourceMetadata() {
    }

    public final boolean hasSystemLabels() {
        return this.systemLabels_ != null;
    }

    public final Struct getSystemLabels() {
        Struct struct = this.systemLabels_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    /* access modifiers changed from: private */
    public void setSystemLabels(Struct struct) {
        this.systemLabels_ = struct;
    }

    /* access modifiers changed from: private */
    public void mergeSystemLabels(Struct struct) {
        Struct struct2 = this.systemLabels_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.systemLabels_ = struct;
        } else {
            this.systemLabels_ = (Struct) ((Struct.asBinder) Struct.newBuilder(this.systemLabels_).mergeFrom(struct)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearSystemLabels() {
        this.systemLabels_ = null;
    }

    private setWeightSum<String, String> internalGetUserLabels() {
        return this.userLabels_;
    }

    private setWeightSum<String, String> internalGetMutableUserLabels() {
        if (!this.userLabels_.asBinder) {
            setWeightSum<String, String> setweightsum = this.userLabels_;
            this.userLabels_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.userLabels_;
    }

    public final int getUserLabelsCount() {
        return internalGetUserLabels().size();
    }

    public final boolean containsUserLabels(String str) {
        return internalGetUserLabels().containsKey(str);
    }

    @Deprecated
    public final Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    public final Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(internalGetUserLabels());
    }

    public final String getUserLabelsOrDefault(String str, String str2) {
        setWeightSum<String, String> internalGetUserLabels = internalGetUserLabels();
        return internalGetUserLabels.containsKey(str) ? internalGetUserLabels.get(str) : str2;
    }

    public final String getUserLabelsOrThrow(String str) {
        setWeightSum<String, String> internalGetUserLabels = internalGetUserLabels();
        if (internalGetUserLabels.containsKey(str)) {
            return internalGetUserLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableUserLabelsMap() {
        return internalGetMutableUserLabels();
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static MonitoredResourceMetadata parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static MonitoredResourceMetadata parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (MonitoredResourceMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static MonitoredResourceMetadata parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static MonitoredResourceMetadata parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (MonitoredResourceMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(monitoredResourceMetadata);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<MonitoredResourceMetadata, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(MonitoredResourceMetadata.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.MonitoredResourceMetadata$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.MonitoredResourceMetadata.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new MonitoredResourceMetadata();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"systemLabels_", "userLabels_", RemoteActionCompatParcelizer.asBinder});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<MonitoredResourceMetadata> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (MonitoredResourceMetadata.class) {
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
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceMetadata.class, monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<MonitoredResourceMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
