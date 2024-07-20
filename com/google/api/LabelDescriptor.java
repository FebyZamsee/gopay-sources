package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.measureNullChild;
import o.setButtonDrawable;

public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, read> implements setButtonDrawable {
    /* access modifiers changed from: private */
    public static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String key_ = "";
    private int valueType_;

    private LabelDescriptor() {
    }

    public enum RemoteActionCompatParcelizer implements measureNullChild.read {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);
        
        private final int AudioAttributesImplApi21Parcelizer;

        static {
            new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.AudioAttributesImplApi21Parcelizer;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return BOOL;
            }
            if (i != 2) {
                return null;
            }
            return INT64;
        }

        private RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = i;
        }
    }

    public final String getKey() {
        return this.key_;
    }

    public final getBaseline getKeyBytes() {
        return getBaseline.asBinder(this.key_);
    }

    /* access modifiers changed from: private */
    public void setKey(String str) {
        this.key_ = str;
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* access modifiers changed from: private */
    public void setKeyBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.key_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final int getValueTypeValue() {
        return this.valueType_;
    }

    public final RemoteActionCompatParcelizer getValueType() {
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.valueType_);
        return RemoteActionCompatParcelizer2 == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : RemoteActionCompatParcelizer2;
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

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static LabelDescriptor parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static LabelDescriptor parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static LabelDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelDescriptor parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (LabelDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static LabelDescriptor parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static LabelDescriptor parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(LabelDescriptor labelDescriptor) {
        return (read) DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<LabelDescriptor, read> implements setButtonDrawable {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.LabelDescriptor$5  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.LabelDescriptor.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new LabelDescriptor();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<LabelDescriptor> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (LabelDescriptor.class) {
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
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<LabelDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
