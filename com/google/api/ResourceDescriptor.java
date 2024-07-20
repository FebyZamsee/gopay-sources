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
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class ResourceDescriptor extends GeneratedMessageLite<ResourceDescriptor, read> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<ResourceDescriptor> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<String> pattern_ = GeneratedMessageLite.emptyProtobufList();
    private String plural_ = "";
    private String singular_ = "";
    private String type_ = "";

    private ResourceDescriptor() {
    }

    public enum RemoteActionCompatParcelizer implements measureNullChild.read {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);
        
        private final int write;

        static {
            new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                    return RemoteActionCompatParcelizer.asInterface(i);
                }
            };
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.write;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static RemoteActionCompatParcelizer asInterface(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        private RemoteActionCompatParcelizer(int i) {
            this.write = i;
        }
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

    public final List<String> getPatternList() {
        return this.pattern_;
    }

    public final int getPatternCount() {
        return this.pattern_.size();
    }

    public final String getPattern(int i) {
        return (String) this.pattern_.get(i);
    }

    public final getBaseline getPatternBytes(int i) {
        return getBaseline.asBinder((String) this.pattern_.get(i));
    }

    private void ensurePatternIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.pattern_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.pattern_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setPattern(int i, String str) {
        ensurePatternIsMutable();
        this.pattern_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addPattern(String str) {
        ensurePatternIsMutable();
        this.pattern_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllPattern(Iterable<String> iterable) {
        ensurePatternIsMutable();
        onLongPress.addAll(iterable, this.pattern_);
    }

    /* access modifiers changed from: private */
    public void clearPattern() {
        this.pattern_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addPatternBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensurePatternIsMutable();
        this.pattern_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final String getNameField() {
        return this.nameField_;
    }

    public final getBaseline getNameFieldBytes() {
        return getBaseline.asBinder(this.nameField_);
    }

    /* access modifiers changed from: private */
    public void setNameField(String str) {
        this.nameField_ = str;
    }

    /* access modifiers changed from: private */
    public void clearNameField() {
        this.nameField_ = getDefaultInstance().getNameField();
    }

    /* access modifiers changed from: private */
    public void setNameFieldBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.nameField_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final int getHistoryValue() {
        return this.history_;
    }

    public final RemoteActionCompatParcelizer getHistory() {
        RemoteActionCompatParcelizer asInterface = RemoteActionCompatParcelizer.asInterface(this.history_);
        return asInterface == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : asInterface;
    }

    /* access modifiers changed from: private */
    public void setHistoryValue(int i) {
        this.history_ = i;
    }

    /* access modifiers changed from: private */
    public void setHistory(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.history_ = remoteActionCompatParcelizer.getNumber();
    }

    /* access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    public final String getPlural() {
        return this.plural_;
    }

    public final getBaseline getPluralBytes() {
        return getBaseline.asBinder(this.plural_);
    }

    /* access modifiers changed from: private */
    public void setPlural(String str) {
        this.plural_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPlural() {
        this.plural_ = getDefaultInstance().getPlural();
    }

    /* access modifiers changed from: private */
    public void setPluralBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.plural_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getSingular() {
        return this.singular_;
    }

    public final getBaseline getSingularBytes() {
        return getBaseline.asBinder(this.singular_);
    }

    /* access modifiers changed from: private */
    public void setSingular(String str) {
        this.singular_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSingular() {
        this.singular_ = getDefaultInstance().getSingular();
    }

    /* access modifiers changed from: private */
    public void setSingularBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.singular_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ResourceDescriptor parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ResourceDescriptor parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ResourceDescriptor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ResourceDescriptor parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ResourceDescriptor parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(ResourceDescriptor resourceDescriptor) {
        return (read) DEFAULT_INSTANCE.createBuilder(resourceDescriptor);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<ResourceDescriptor, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(ResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.ResourceDescriptor$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
                RemoteActionCompatParcelizer = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ResourceDescriptor.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ResourceDescriptor();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ResourceDescriptor> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ResourceDescriptor.class) {
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
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        GeneratedMessageLite.registerDefaultInstance(ResourceDescriptor.class, resourceDescriptor);
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ResourceDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
