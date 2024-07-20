package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AppCompatCompoundButtonHelper;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class Usage extends GeneratedMessageLite<Usage, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Usage DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<Usage> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<String> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<UsageRule> rules_ = emptyProtobufList();

    private Usage() {
    }

    public final List<String> getRequirementsList() {
        return this.requirements_;
    }

    public final int getRequirementsCount() {
        return this.requirements_.size();
    }

    public final String getRequirements(int i) {
        return (String) this.requirements_.get(i);
    }

    public final getBaseline getRequirementsBytes(int i) {
        return getBaseline.asBinder((String) this.requirements_.get(i));
    }

    private void ensureRequirementsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.requirements_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRequirements(int i, String str) {
        ensureRequirementsIsMutable();
        this.requirements_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addRequirements(String str) {
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        onLongPress.addAll(iterable, this.requirements_);
    }

    /* access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addRequirementsBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureRequirementsIsMutable();
        this.requirements_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public final List<? extends AppCompatCompoundButtonHelper> getRulesOrBuilderList() {
        return this.rules_;
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final UsageRule getRules(int i) {
        return (UsageRule) this.rules_.get(i);
    }

    public final AppCompatCompoundButtonHelper getRulesOrBuilder(int i) {
        return (AppCompatCompoundButtonHelper) this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<UsageRule> audioAttributesCompatParcelizer = this.rules_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRules(int i, UsageRule usageRule) {
        ensureRulesIsMutable();
        this.rules_.set(i, usageRule);
    }

    /* access modifiers changed from: private */
    public void addRules(UsageRule usageRule) {
        ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, UsageRule usageRule) {
        ensureRulesIsMutable();
        this.rules_.add(i, usageRule);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends UsageRule> iterable) {
        ensureRulesIsMutable();
        onLongPress.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    public final String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    public final getBaseline getProducerNotificationChannelBytes() {
        return getBaseline.asBinder(this.producerNotificationChannel_);
    }

    /* access modifiers changed from: private */
    public void setProducerNotificationChannel(String str) {
        this.producerNotificationChannel_ = str;
    }

    /* access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.producerNotificationChannel_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Usage parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Usage parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Usage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Usage parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Usage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Usage parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Usage parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Usage usage) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Usage, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Usage.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Usage$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Usage.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Usage();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Usage> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Usage.class) {
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
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        GeneratedMessageLite.registerDefaultInstance(Usage.class, usage);
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Usage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
