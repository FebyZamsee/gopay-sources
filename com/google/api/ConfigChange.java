package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.getAnimationStyle;
import o.getAutoSizeTextAvailableSizes;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setAutoSizeTextTypeUniformWithPresetSizes;

public final class ConfigChange extends GeneratedMessageLite<ConfigChange, RemoteActionCompatParcelizer> implements layoutHorizontal {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<ConfigChange> PARSER;
    private measureNullChild.AudioAttributesCompatParcelizer<Advice> advices_ = emptyProtobufList();
    private int changeType_;
    private String element_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";

    private ConfigChange() {
    }

    public final String getElement() {
        return this.element_;
    }

    public final getBaseline getElementBytes() {
        return getBaseline.asBinder(this.element_);
    }

    /* access modifiers changed from: private */
    public void setElement(String str) {
        this.element_ = str;
    }

    /* access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* access modifiers changed from: private */
    public void setElementBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.element_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getOldValue() {
        return this.oldValue_;
    }

    public final getBaseline getOldValueBytes() {
        return getBaseline.asBinder(this.oldValue_);
    }

    /* access modifiers changed from: private */
    public void setOldValue(String str) {
        this.oldValue_ = str;
    }

    /* access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    /* access modifiers changed from: private */
    public void setOldValueBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.oldValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getNewValue() {
        return this.newValue_;
    }

    public final getBaseline getNewValueBytes() {
        return getBaseline.asBinder(this.newValue_);
    }

    /* access modifiers changed from: private */
    public void setNewValue(String str) {
        this.newValue_ = str;
    }

    /* access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* access modifiers changed from: private */
    public void setNewValueBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.newValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final int getChangeTypeValue() {
        return this.changeType_;
    }

    public final setAutoSizeTextTypeUniformWithPresetSizes getChangeType() {
        setAutoSizeTextTypeUniformWithPresetSizes onTransact = setAutoSizeTextTypeUniformWithPresetSizes.onTransact(this.changeType_);
        return onTransact == null ? setAutoSizeTextTypeUniformWithPresetSizes.UNRECOGNIZED : onTransact;
    }

    /* access modifiers changed from: private */
    public void setChangeTypeValue(int i) {
        this.changeType_ = i;
    }

    /* access modifiers changed from: private */
    public void setChangeType(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
        this.changeType_ = setautosizetexttypeuniformwithpresetsizes.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    public final List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public final List<? extends getAutoSizeTextAvailableSizes> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    public final int getAdvicesCount() {
        return this.advices_.size();
    }

    public final Advice getAdvices(int i) {
        return (Advice) this.advices_.get(i);
    }

    public final getAutoSizeTextAvailableSizes getAdvicesOrBuilder(int i) {
        return (getAutoSizeTextAvailableSizes) this.advices_.get(i);
    }

    private void ensureAdvicesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Advice> audioAttributesCompatParcelizer = this.advices_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.advices_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAdvices(int i, Advice advice) {
        ensureAdvicesIsMutable();
        this.advices_.set(i, advice);
    }

    /* access modifiers changed from: private */
    public void addAdvices(Advice advice) {
        ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    /* access modifiers changed from: private */
    public void addAdvices(int i, Advice advice) {
        ensureAdvicesIsMutable();
        this.advices_.add(i, advice);
    }

    /* access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends Advice> iterable) {
        ensureAdvicesIsMutable();
        onLongPress.addAll(iterable, this.advices_);
    }

    /* access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeAdvices(int i) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ConfigChange parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ConfigChange parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ConfigChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigChange parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ConfigChange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ConfigChange parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ConfigChange parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(ConfigChange configChange) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<ConfigChange, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(ConfigChange.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.ConfigChange$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ConfigChange.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ConfigChange();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ConfigChange> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ConfigChange.class) {
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
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        GeneratedMessageLite.registerDefaultInstance(ConfigChange.class, configChange);
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ConfigChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
