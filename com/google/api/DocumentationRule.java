package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getCompoundPaddingLeft;
import o.getDividerDrawable;
import o.getDividerWidth;

public final class DocumentationRule extends GeneratedMessageLite<DocumentationRule, asInterface> implements getCompoundPaddingLeft {
    /* access modifiers changed from: private */
    public static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<DocumentationRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String deprecationDescription_ = "";
    private String description_ = "";
    private String selector_ = "";

    private DocumentationRule() {
    }

    public final String getSelector() {
        return this.selector_;
    }

    public final getBaseline getSelectorBytes() {
        return getBaseline.asBinder(this.selector_);
    }

    /* access modifiers changed from: private */
    public void setSelector(String str) {
        this.selector_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* access modifiers changed from: private */
    public void setSelectorBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.selector_ = getbaseline.AudioAttributesImplApi26Parcelizer();
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

    public final String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    public final getBaseline getDeprecationDescriptionBytes() {
        return getBaseline.asBinder(this.deprecationDescription_);
    }

    /* access modifiers changed from: private */
    public void setDeprecationDescription(String str) {
        this.deprecationDescription_ = str;
    }

    /* access modifiers changed from: private */
    public void clearDeprecationDescription() {
        this.deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
    }

    /* access modifiers changed from: private */
    public void setDeprecationDescriptionBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.deprecationDescription_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static DocumentationRule parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static DocumentationRule parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static DocumentationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentationRule parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (DocumentationRule) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static DocumentationRule parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static DocumentationRule parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (DocumentationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(DocumentationRule documentationRule) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(documentationRule);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<DocumentationRule, asInterface> implements getCompoundPaddingLeft {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(DocumentationRule.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.DocumentationRule$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.DocumentationRule.AnonymousClass5.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass5.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new DocumentationRule();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<DocumentationRule> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (DocumentationRule.class) {
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
        DocumentationRule documentationRule = new DocumentationRule();
        DEFAULT_INSTANCE = documentationRule;
        GeneratedMessageLite.registerDefaultInstance(DocumentationRule.class, documentationRule);
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<DocumentationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
