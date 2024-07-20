package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;

public final class ListOperationsRequest extends GeneratedMessageLite<ListOperationsRequest, read> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final ListOperationsRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile getAnimationStyle<ListOperationsRequest> PARSER;
    private String filter_ = "";
    private String name_ = "";
    private int pageSize_;
    private String pageToken_ = "";

    private ListOperationsRequest() {
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

    public final String getFilter() {
        return this.filter_;
    }

    public final getBaseline getFilterBytes() {
        return getBaseline.asBinder(this.filter_);
    }

    /* access modifiers changed from: private */
    public void setFilter(String str) {
        this.filter_ = str;
    }

    /* access modifiers changed from: private */
    public void clearFilter() {
        this.filter_ = getDefaultInstance().getFilter();
    }

    /* access modifiers changed from: private */
    public void setFilterBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.filter_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final int getPageSize() {
        return this.pageSize_;
    }

    /* access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    public final String getPageToken() {
        return this.pageToken_;
    }

    public final getBaseline getPageTokenBytes() {
        return getBaseline.asBinder(this.pageToken_);
    }

    /* access modifiers changed from: private */
    public void setPageToken(String str) {
        this.pageToken_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    /* access modifiers changed from: private */
    public void setPageTokenBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.pageToken_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ListOperationsRequest parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ListOperationsRequest parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ListOperationsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsRequest parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ListOperationsRequest parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ListOperationsRequest parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(ListOperationsRequest listOperationsRequest) {
        return (read) DEFAULT_INSTANCE.createBuilder(listOperationsRequest);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<ListOperationsRequest, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(ListOperationsRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.longrunning.ListOperationsRequest$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.ListOperationsRequest.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ListOperationsRequest();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ListOperationsRequest> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ListOperationsRequest.class) {
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
        ListOperationsRequest listOperationsRequest = new ListOperationsRequest();
        DEFAULT_INSTANCE = listOperationsRequest;
        GeneratedMessageLite.registerDefaultInstance(ListOperationsRequest.class, listOperationsRequest);
    }

    public static ListOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ListOperationsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
