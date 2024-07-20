package com.google.type;

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

public final class PostalAddress extends GeneratedMessageLite<PostalAddress, read> implements layoutHorizontal {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile getAnimationStyle<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private measureNullChild.AudioAttributesCompatParcelizer<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private String administrativeArea_ = "";
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    private PostalAddress() {
    }

    public final int getRevision() {
        return this.revision_;
    }

    /* access modifiers changed from: private */
    public void setRevision(int i) {
        this.revision_ = i;
    }

    /* access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = 0;
    }

    public final String getRegionCode() {
        return this.regionCode_;
    }

    public final getBaseline getRegionCodeBytes() {
        return getBaseline.asBinder(this.regionCode_);
    }

    /* access modifiers changed from: private */
    public void setRegionCode(String str) {
        this.regionCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearRegionCode() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* access modifiers changed from: private */
    public void setRegionCodeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.regionCode_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getLanguageCode() {
        return this.languageCode_;
    }

    public final getBaseline getLanguageCodeBytes() {
        return getBaseline.asBinder(this.languageCode_);
    }

    /* access modifiers changed from: private */
    public void setLanguageCode(String str) {
        this.languageCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* access modifiers changed from: private */
    public void setLanguageCodeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.languageCode_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getPostalCode() {
        return this.postalCode_;
    }

    public final getBaseline getPostalCodeBytes() {
        return getBaseline.asBinder(this.postalCode_);
    }

    /* access modifiers changed from: private */
    public void setPostalCode(String str) {
        this.postalCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* access modifiers changed from: private */
    public void setPostalCodeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.postalCode_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getSortingCode() {
        return this.sortingCode_;
    }

    public final getBaseline getSortingCodeBytes() {
        return getBaseline.asBinder(this.sortingCode_);
    }

    /* access modifiers changed from: private */
    public void setSortingCode(String str) {
        this.sortingCode_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSortingCode() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* access modifiers changed from: private */
    public void setSortingCodeBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.sortingCode_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public final getBaseline getAdministrativeAreaBytes() {
        return getBaseline.asBinder(this.administrativeArea_);
    }

    /* access modifiers changed from: private */
    public void setAdministrativeArea(String str) {
        this.administrativeArea_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAdministrativeArea() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* access modifiers changed from: private */
    public void setAdministrativeAreaBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.administrativeArea_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getLocality() {
        return this.locality_;
    }

    public final getBaseline getLocalityBytes() {
        return getBaseline.asBinder(this.locality_);
    }

    /* access modifiers changed from: private */
    public void setLocality(String str) {
        this.locality_ = str;
    }

    /* access modifiers changed from: private */
    public void clearLocality() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* access modifiers changed from: private */
    public void setLocalityBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.locality_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getSublocality() {
        return this.sublocality_;
    }

    public final getBaseline getSublocalityBytes() {
        return getBaseline.asBinder(this.sublocality_);
    }

    /* access modifiers changed from: private */
    public void setSublocality(String str) {
        this.sublocality_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSublocality() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    /* access modifiers changed from: private */
    public void setSublocalityBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.sublocality_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public final int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public final String getAddressLines(int i) {
        return (String) this.addressLines_.get(i);
    }

    public final getBaseline getAddressLinesBytes(int i) {
        return getBaseline.asBinder((String) this.addressLines_.get(i));
    }

    private void ensureAddressLinesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.addressLines_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setAddressLines(int i, String str) {
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addAddressLines(String str) {
        ensureAddressLinesIsMutable();
        this.addressLines_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllAddressLines(Iterable<String> iterable) {
        ensureAddressLinesIsMutable();
        onLongPress.addAll(iterable, this.addressLines_);
    }

    /* access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addAddressLinesBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final List<String> getRecipientsList() {
        return this.recipients_;
    }

    public final int getRecipientsCount() {
        return this.recipients_.size();
    }

    public final String getRecipients(int i) {
        return (String) this.recipients_.get(i);
    }

    public final getBaseline getRecipientsBytes(int i) {
        return getBaseline.asBinder((String) this.recipients_.get(i));
    }

    private void ensureRecipientsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.recipients_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setRecipients(int i, String str) {
        ensureRecipientsIsMutable();
        this.recipients_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void addRecipients(String str) {
        ensureRecipientsIsMutable();
        this.recipients_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllRecipients(Iterable<String> iterable) {
        ensureRecipientsIsMutable();
        onLongPress.addAll(iterable, this.recipients_);
    }

    /* access modifiers changed from: private */
    public void clearRecipients() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void addRecipientsBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        ensureRecipientsIsMutable();
        this.recipients_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
    }

    public final String getOrganization() {
        return this.organization_;
    }

    public final getBaseline getOrganizationBytes() {
        return getBaseline.asBinder(this.organization_);
    }

    /* access modifiers changed from: private */
    public void setOrganization(String str) {
        this.organization_ = str;
    }

    /* access modifiers changed from: private */
    public void clearOrganization() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* access modifiers changed from: private */
    public void setOrganizationBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.organization_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static PostalAddress parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static PostalAddress parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static PostalAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostalAddress parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PostalAddress) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PostalAddress parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static PostalAddress parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (PostalAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(PostalAddress postalAddress) {
        return (read) DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<PostalAddress, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(PostalAddress.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.type.PostalAddress$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

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
                read = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.PostalAddress.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.read[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new PostalAddress();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<PostalAddress> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (PostalAddress.class) {
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
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
