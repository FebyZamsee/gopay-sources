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
import o.measureNullChild;
import o.onLongPress;
import o.setFilters;

public final class Endpoint extends GeneratedMessageLite<Endpoint, asBinder> implements setFilters {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Endpoint> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private measureNullChild.AudioAttributesCompatParcelizer<String> aliases_ = GeneratedMessageLite.emptyProtobufList();
    private boolean allowCors_;
    private measureNullChild.AudioAttributesCompatParcelizer<String> features_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private String target_ = "";

    private Endpoint() {
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

    @Deprecated
    public final List<String> getAliasesList() {
        return this.aliases_;
    }

    @Deprecated
    public final int getAliasesCount() {
        return this.aliases_.size();
    }

    @Deprecated
    public final String getAliases(int i) {
        return (String) this.aliases_.get(i);
    }

    @Deprecated
    public final getBaseline getAliasesBytes(int i) {
        return getBaseline.asBinder((String) this.aliases_.get(i));
    }

    private void ensureAliasesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.aliases_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.aliases_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAliases(int i, String str) {
        ensureAliasesIsMutable();
        this.aliases_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAliases(String str) {
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        onLongPress.addAll(iterable, this.aliases_);
    }

    /* access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAliasesBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureAliasesIsMutable();
        this.aliases_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<String> getFeaturesList() {
        return this.features_;
    }

    public final int getFeaturesCount() {
        return this.features_.size();
    }

    public final String getFeatures(int i) {
        return (String) this.features_.get(i);
    }

    public final getBaseline getFeaturesBytes(int i) {
        return getBaseline.asBinder((String) this.features_.get(i));
    }

    private void ensureFeaturesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.features_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.features_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setFeatures(int i, String str) {
        ensureFeaturesIsMutable();
        this.features_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addFeatures(String str) {
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        onLongPress.addAll(iterable, this.features_);
    }

    /* access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addFeaturesBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureFeaturesIsMutable();
        this.features_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final String getTarget() {
        return this.target_;
    }

    public final getBaseline getTargetBytes() {
        return getBaseline.asBinder(this.target_);
    }

    /* access modifiers changed from: private */
    public void setTarget(String str) {
        this.target_ = str;
    }

    /* access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    /* access modifiers changed from: private */
    public void setTargetBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.target_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final boolean getAllowCors() {
        return this.allowCors_;
    }

    /* access modifiers changed from: private */
    public void setAllowCors(boolean z) {
        this.allowCors_ = z;
    }

    /* access modifiers changed from: private */
    public void clearAllowCors() {
        this.allowCors_ = false;
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Endpoint parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Endpoint parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Endpoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Endpoint parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Endpoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Endpoint) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Endpoint parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Endpoint parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(Endpoint endpoint) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Endpoint, asBinder> implements setFilters {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(Endpoint.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Endpoint$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Endpoint.AnonymousClass3.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass3.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Endpoint();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Endpoint> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Endpoint.class) {
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
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        GeneratedMessageLite.registerDefaultInstance(Endpoint.class, endpoint);
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Endpoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
