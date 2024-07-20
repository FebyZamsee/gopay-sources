package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getSupportButtonTintMode;
import o.measureNullChild;
import o.onLongPress;
import o.setButtonDrawable;

public final class LogDescriptor extends GeneratedMessageLite<LogDescriptor, read> implements getSupportButtonTintMode {
    /* access modifiers changed from: private */
    public static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<LogDescriptor> PARSER;
    private String description_ = "";
    private String displayName_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<LabelDescriptor> labels_ = emptyProtobufList();
    private String name_ = "";

    private LogDescriptor() {
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

    public final List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public final List<? extends setButtonDrawable> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public final int getLabelsCount() {
        return this.labels_.size();
    }

    public final LabelDescriptor getLabels(int i) {
        return (LabelDescriptor) this.labels_.get(i);
    }

    public final setButtonDrawable getLabelsOrBuilder(int i) {
        return (setButtonDrawable) this.labels_.get(i);
    }

    private void ensureLabelsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<LabelDescriptor> audioAttributesCompatParcelizer = this.labels_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setLabels(int i, LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        onLongPress.addAll(iterable, this.labels_);
    }

    /* access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final getBaseline getDisplayNameBytes() {
        return getBaseline.asBinder(this.displayName_);
    }

    /* access modifiers changed from: private */
    public void setDisplayName(String str) {
        this.displayName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* access modifiers changed from: private */
    public void setDisplayNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.displayName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static LogDescriptor parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static LogDescriptor parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static LogDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LogDescriptor parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (LogDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static LogDescriptor parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static LogDescriptor parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(LogDescriptor logDescriptor) {
        return (read) DEFAULT_INSTANCE.createBuilder(logDescriptor);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<LogDescriptor, read> implements getSupportButtonTintMode {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.LogDescriptor$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.LogDescriptor.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new LogDescriptor();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", LabelDescriptor.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<LogDescriptor> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (LogDescriptor.class) {
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
        LogDescriptor logDescriptor = new LogDescriptor();
        DEFAULT_INSTANCE = logDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LogDescriptor.class, logDescriptor);
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<LogDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
