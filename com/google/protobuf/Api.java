package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.clearListSelection;
import o.createDragToOpenListener;
import o.drawHorizontalDivider;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getInputMethodMode;
import o.measureNullChild;
import o.onLongPress;
import o.setDropDownAlwaysVisible;

public final class Api extends GeneratedMessageLite<Api, RemoteActionCompatParcelizer> implements drawHorizontalDivider {
    /* access modifiers changed from: private */
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private measureNullChild.AudioAttributesCompatParcelizer<Method> methods_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<Mixin> mixins_ = emptyProtobufList();
    private String name_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Option> options_ = emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_ = "";

    private Api() {
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

    public final List<Method> getMethodsList() {
        return this.methods_;
    }

    public final List<? extends createDragToOpenListener> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public final int getMethodsCount() {
        return this.methods_.size();
    }

    public final Method getMethods(int i) {
        return (Method) this.methods_.get(i);
    }

    public final createDragToOpenListener getMethodsOrBuilder(int i) {
        return (createDragToOpenListener) this.methods_.get(i);
    }

    private void ensureMethodsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Method> audioAttributesCompatParcelizer = this.methods_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.methods_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setMethods(int i, Method method) {
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    /* access modifiers changed from: private */
    public void addMethods(Method method) {
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* access modifiers changed from: private */
    public void addMethods(int i, Method method) {
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    /* access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        onLongPress.addAll(iterable, this.methods_);
    }

    /* access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
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

    public final String getVersion() {
        return this.version_;
    }

    public final getBaseline getVersionBytes() {
        return getBaseline.asBinder(this.version_);
    }

    /* access modifiers changed from: private */
    public void setVersion(String str) {
        this.version_ = str;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* access modifiers changed from: private */
    public void setVersionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.version_ = getbaseline.AudioAttributesImplApi26Parcelizer();
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

    public final List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public final List<? extends clearListSelection> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    public final int getMixinsCount() {
        return this.mixins_.size();
    }

    public final Mixin getMixins(int i) {
        return (Mixin) this.mixins_.get(i);
    }

    public final clearListSelection getMixinsOrBuilder(int i) {
        return (clearListSelection) this.mixins_.get(i);
    }

    private void ensureMixinsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Mixin> audioAttributesCompatParcelizer = this.mixins_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.mixins_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setMixins(int i, Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
    }

    /* access modifiers changed from: private */
    public void addMixins(Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* access modifiers changed from: private */
    public void addMixins(int i, Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    /* access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        onLongPress.addAll(iterable, this.mixins_);
    }

    /* access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    public final int getSyntaxValue() {
        return this.syntax_;
    }

    public final setDropDownAlwaysVisible getSyntax() {
        setDropDownAlwaysVisible asBinder = setDropDownAlwaysVisible.asBinder(this.syntax_);
        return asBinder == null ? setDropDownAlwaysVisible.UNRECOGNIZED : asBinder;
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

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Api parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Api parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Api parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Api parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(Api api) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Api, RemoteActionCompatParcelizer> implements drawHorizontalDivider {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(Api.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.protobuf.Api$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Api.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Api> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Api.class) {
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
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
