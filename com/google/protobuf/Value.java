package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getPromptPosition;
import o.setHeight;

public final class Value extends GeneratedMessageLite<Value, asInterface> implements setHeight {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    private Value() {
    }

    public enum asBinder {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int IconCompatParcelizer;

        private asBinder(int i) {
            this.IconCompatParcelizer = i;
        }

        public static asBinder read(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }
    }

    public final asBinder getKindCase() {
        return asBinder.read(this.kindCase_);
    }

    /* access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    public final boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public final int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public final getPromptPosition getNullValue() {
        if (this.kindCase_ != 1) {
            return getPromptPosition.NULL_VALUE;
        }
        getPromptPosition asInterface2 = getPromptPosition.asInterface(((Integer) this.kind_).intValue());
        return asInterface2 == null ? getPromptPosition.UNRECOGNIZED : asInterface2;
    }

    /* access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    public void setNullValue(getPromptPosition getpromptposition) {
        this.kind_ = Integer.valueOf(getpromptposition.getNumber());
        this.kindCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public final double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    /* access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public final String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    public final getBaseline getStringValueBytes() {
        return getBaseline.asBinder(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    /* access modifiers changed from: private */
    public void setStringValue(String str) {
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void setStringValueBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.kind_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.kindCase_ = 3;
    }

    public final boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public final boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public final Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            this.kind_ = ((Struct.asBinder) Struct.newBuilder((Struct) this.kind_).mergeFrom(struct)).buildPartial();
        }
        this.kindCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public final ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ((ListValue.read) ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue)).buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Value parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Value parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Value parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Value parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Value value) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Value, asInterface> implements setHeight {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.protobuf.Value$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Value> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Value.class) {
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
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
