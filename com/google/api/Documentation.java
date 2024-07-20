package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.getAnimationStyle;
import o.getBaseline;
import o.getCompoundPaddingLeft;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setCheckMarkDrawable;

public final class Documentation extends GeneratedMessageLite<Documentation, asBinder> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile getAnimationStyle<Documentation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Page> pages_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<DocumentationRule> rules_ = emptyProtobufList();
    private String summary_ = "";

    private Documentation() {
    }

    public final String getSummary() {
        return this.summary_;
    }

    public final getBaseline getSummaryBytes() {
        return getBaseline.asBinder(this.summary_);
    }

    /* access modifiers changed from: private */
    public void setSummary(String str) {
        this.summary_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    /* access modifiers changed from: private */
    public void setSummaryBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.summary_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<Page> getPagesList() {
        return this.pages_;
    }

    public final List<? extends setCheckMarkDrawable> getPagesOrBuilderList() {
        return this.pages_;
    }

    public final int getPagesCount() {
        return this.pages_.size();
    }

    public final Page getPages(int i) {
        return (Page) this.pages_.get(i);
    }

    public final setCheckMarkDrawable getPagesOrBuilder(int i) {
        return (setCheckMarkDrawable) this.pages_.get(i);
    }

    private void ensurePagesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Page> audioAttributesCompatParcelizer = this.pages_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.pages_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setPages(int i, Page page) {
        ensurePagesIsMutable();
        this.pages_.set(i, page);
    }

    /* access modifiers changed from: private */
    public void addPages(Page page) {
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* access modifiers changed from: private */
    public void addPages(int i, Page page) {
        ensurePagesIsMutable();
        this.pages_.add(i, page);
    }

    /* access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        onLongPress.addAll(iterable, this.pages_);
    }

    /* access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    public final List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public final List<? extends getCompoundPaddingLeft> getRulesOrBuilderList() {
        return this.rules_;
    }

    public final int getRulesCount() {
        return this.rules_.size();
    }

    public final DocumentationRule getRules(int i) {
        return (DocumentationRule) this.rules_.get(i);
    }

    public final getCompoundPaddingLeft getRulesOrBuilder(int i) {
        return (getCompoundPaddingLeft) this.rules_.get(i);
    }

    private void ensureRulesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<DocumentationRule> audioAttributesCompatParcelizer = this.rules_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRules(int i, DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.set(i, documentationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, DocumentationRule documentationRule) {
        ensureRulesIsMutable();
        this.rules_.add(i, documentationRule);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends DocumentationRule> iterable) {
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

    public final String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    public final getBaseline getDocumentationRootUrlBytes() {
        return getBaseline.asBinder(this.documentationRootUrl_);
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        this.documentationRootUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.documentationRootUrl_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getOverview() {
        return this.overview_;
    }

    public final getBaseline getOverviewBytes() {
        return getBaseline.asBinder(this.overview_);
    }

    /* access modifiers changed from: private */
    public void setOverview(String str) {
        this.overview_ = str;
    }

    /* access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* access modifiers changed from: private */
    public void setOverviewBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.overview_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Documentation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Documentation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Documentation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Documentation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Documentation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Documentation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Documentation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(Documentation documentation) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Documentation, asBinder> implements layoutHorizontal {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(Documentation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Documentation$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Documentation.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Documentation();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Documentation> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Documentation.class) {
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
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        GeneratedMessageLite.registerDefaultInstance(Documentation.class, documentation);
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Documentation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
