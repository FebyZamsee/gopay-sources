package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getInputMethodMode;
import o.getVirtualChildCount;
import o.measureNullChild;
import o.onLongPress;

public final class Field extends GeneratedMessageLite<Field, read> implements getVirtualChildCount {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile getAnimationStyle<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_ = "";
    private String jsonName_ = "";
    private int kind_;
    private String name_ = "";
    private int number_;
    private int oneofIndex_;
    private measureNullChild.AudioAttributesCompatParcelizer<Option> options_ = emptyProtobufList();
    private boolean packed_;
    private String typeUrl_ = "";

    private Field() {
    }

    public enum asInterface implements measureNullChild.read {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);
        
        private final int MediaSessionCompat$QueueItem;

        static {
            new measureNullChild.asInterface<asInterface>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return asInterface.onTransact(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.MediaSessionCompat$QueueItem;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static asInterface onTransact(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        private asInterface(int i) {
            this.MediaSessionCompat$QueueItem = i;
        }
    }

    public enum RemoteActionCompatParcelizer implements measureNullChild.read {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);
        
        private final int AudioAttributesImplApi26Parcelizer;

        static {
            new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.AudioAttributesImplApi26Parcelizer;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        private RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }
    }

    public final int getKindValue() {
        return this.kind_;
    }

    public final asInterface getKind() {
        asInterface onTransact = asInterface.onTransact(this.kind_);
        return onTransact == null ? asInterface.UNRECOGNIZED : onTransact;
    }

    /* access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
    }

    /* access modifiers changed from: private */
    public void setKind(asInterface asinterface) {
        this.kind_ = asinterface.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    public final int getCardinalityValue() {
        return this.cardinality_;
    }

    public final RemoteActionCompatParcelizer getCardinality() {
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.cardinality_);
        return RemoteActionCompatParcelizer2 == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : RemoteActionCompatParcelizer2;
    }

    /* access modifiers changed from: private */
    public void setCardinalityValue(int i) {
        this.cardinality_ = i;
    }

    /* access modifiers changed from: private */
    public void setCardinality(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.cardinality_ = remoteActionCompatParcelizer.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    public final int getNumber() {
        return this.number_;
    }

    /* access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
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

    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    public final getBaseline getTypeUrlBytes() {
        return getBaseline.asBinder(this.typeUrl_);
    }

    /* access modifiers changed from: private */
    public void setTypeUrl(String str) {
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* access modifiers changed from: private */
    public void setTypeUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.typeUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final int getOneofIndex() {
        return this.oneofIndex_;
    }

    /* access modifiers changed from: private */
    public void setOneofIndex(int i) {
        this.oneofIndex_ = i;
    }

    /* access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    public final boolean getPacked() {
        return this.packed_;
    }

    /* access modifiers changed from: private */
    public void setPacked(boolean z) {
        this.packed_ = z;
    }

    /* access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    public final List<Option> getOptionsList() {
        return this.options_;
    }

    public final List<? extends getInputMethodMode> getOptionsOrBuilderList() {
        return this.options_;
    }

    public final int getOptionsCount() {
        return this.options_.size();
    }

    public final Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    public final getInputMethodMode getOptionsOrBuilder(int i) {
        return (getInputMethodMode) this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Option> audioAttributesCompatParcelizer = this.options_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.options_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        onLongPress.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public final String getJsonName() {
        return this.jsonName_;
    }

    public final getBaseline getJsonNameBytes() {
        return getBaseline.asBinder(this.jsonName_);
    }

    /* access modifiers changed from: private */
    public void setJsonName(String str) {
        this.jsonName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* access modifiers changed from: private */
    public void setJsonNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.jsonName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getDefaultValue() {
        return this.defaultValue_;
    }

    public final getBaseline getDefaultValueBytes() {
        return getBaseline.asBinder(this.defaultValue_);
    }

    /* access modifiers changed from: private */
    public void setDefaultValue(String str) {
        this.defaultValue_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* access modifiers changed from: private */
    public void setDefaultValueBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.defaultValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Field parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Field parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Field parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Field parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Field parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(Field field) {
        return (read) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Field, read> implements getVirtualChildCount {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.protobuf.Field$5  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Field.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Field> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Field.class) {
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
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
