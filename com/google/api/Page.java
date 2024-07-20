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
import o.setCheckMarkDrawable;

public final class Page extends GeneratedMessageLite<Page, onTransact> implements setCheckMarkDrawable {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Page> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_ = "";
    private String name_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Page> subpages_ = emptyProtobufList();

    private Page() {
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

    public final String getContent() {
        return this.content_;
    }

    public final getBaseline getContentBytes() {
        return getBaseline.asBinder(this.content_);
    }

    /* access modifiers changed from: private */
    public void setContent(String str) {
        this.content_ = str;
    }

    /* access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* access modifiers changed from: private */
    public void setContentBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.content_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public final List<? extends setCheckMarkDrawable> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public final int getSubpagesCount() {
        return this.subpages_.size();
    }

    public final Page getSubpages(int i) {
        return (Page) this.subpages_.get(i);
    }

    public final setCheckMarkDrawable getSubpagesOrBuilder(int i) {
        return (setCheckMarkDrawable) this.subpages_.get(i);
    }

    private void ensureSubpagesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Page> audioAttributesCompatParcelizer = this.subpages_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.subpages_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setSubpages(int i, Page page) {
        ensureSubpagesIsMutable();
        this.subpages_.set(i, page);
    }

    /* access modifiers changed from: private */
    public void addSubpages(Page page) {
        ensureSubpagesIsMutable();
        this.subpages_.add(page);
    }

    /* access modifiers changed from: private */
    public void addSubpages(int i, Page page) {
        ensureSubpagesIsMutable();
        this.subpages_.add(i, page);
    }

    /* access modifiers changed from: private */
    public void addAllSubpages(Iterable<? extends Page> iterable) {
        ensureSubpagesIsMutable();
        onLongPress.addAll(iterable, this.subpages_);
    }

    /* access modifiers changed from: private */
    public void clearSubpages() {
        this.subpages_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeSubpages(int i) {
        ensureSubpagesIsMutable();
        this.subpages_.remove(i);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Page parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Page parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Page parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Page parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Page) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Page parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Page parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(Page page) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(page);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<Page, onTransact> implements setCheckMarkDrawable {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(Page.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Page$2  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Page.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        Class<Page> cls = Page.class;
        switch (AnonymousClass2.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Page> getanimationstyle = PARSER;
                if (getanimationstyle == null) {
                    synchronized (cls) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact<>(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
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
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        GeneratedMessageLite.registerDefaultInstance(Page.class, page);
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Page> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
