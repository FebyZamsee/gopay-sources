package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.SourceContext;
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
import o.setAnimationStyle;
import o.setDropDownAlwaysVisible;

public final class Type extends GeneratedMessageLite<Type, asBinder> implements setAnimationStyle {
    /* access modifiers changed from: private */
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile getAnimationStyle<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private measureNullChild.AudioAttributesCompatParcelizer<Field> fields_ = emptyProtobufList();
    private String name_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<Option> options_ = emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;

    private Type() {
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

    public final List<Field> getFieldsList() {
        return this.fields_;
    }

    public final List<? extends getVirtualChildCount> getFieldsOrBuilderList() {
        return this.fields_;
    }

    public final int getFieldsCount() {
        return this.fields_.size();
    }

    public final Field getFields(int i) {
        return (Field) this.fields_.get(i);
    }

    public final getVirtualChildCount getFieldsOrBuilder(int i) {
        return (getVirtualChildCount) this.fields_.get(i);
    }

    private void ensureFieldsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Field> audioAttributesCompatParcelizer = this.fields_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setFields(int i, Field field) {
        ensureFieldsIsMutable();
        this.fields_.set(i, field);
    }

    /* access modifiers changed from: private */
    public void addFields(Field field) {
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* access modifiers changed from: private */
    public void addFields(int i, Field field) {
        ensureFieldsIsMutable();
        this.fields_.add(i, field);
    }

    /* access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        onLongPress.addAll(iterable, this.fields_);
    }

    /* access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    public final List<String> getOneofsList() {
        return this.oneofs_;
    }

    public final int getOneofsCount() {
        return this.oneofs_.size();
    }

    public final String getOneofs(int i) {
        return (String) this.oneofs_.get(i);
    }

    public final getBaseline getOneofsBytes(int i) {
        return getBaseline.asBinder((String) this.oneofs_.get(i));
    }

    private void ensureOneofsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.oneofs_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setOneofs(int i, String str) {
        ensureOneofsIsMutable();
        this.oneofs_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addOneofs(String str) {
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        onLongPress.addAll(iterable, this.oneofs_);
    }

    /* access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addOneofsBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureOneofsIsMutable();
        this.oneofs_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
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

    public final boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public final SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    /* access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        this.sourceContext_ = sourceContext;
    }

    /* access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
        } else {
            this.sourceContext_ = (SourceContext) ((SourceContext.asBinder) SourceContext.newBuilder(this.sourceContext_).mergeFrom(sourceContext)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final setDropDownAlwaysVisible getSyntax() {
        setDropDownAlwaysVisible asBinder2 = setDropDownAlwaysVisible.asBinder(this.syntax_);
        return asBinder2 == null ? setDropDownAlwaysVisible.UNRECOGNIZED : asBinder2;
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* access modifiers changed from: private */
    public void setSyntax(setDropDownAlwaysVisible setdropdownalwaysvisible) {
        this.syntax_ = setdropdownalwaysvisible.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Type parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Type parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Type) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Type parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Type parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(Type type) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Type, asBinder> implements setAnimationStyle {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(Type.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.protobuf.Type$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Type.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Type> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Type.class) {
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
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
