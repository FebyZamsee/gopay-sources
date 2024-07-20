package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.LinearLayoutCompat;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class ListOperationsResponse extends GeneratedMessageLite<ListOperationsResponse, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<ListOperationsResponse> PARSER;
    private String nextPageToken_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Operation> operations_ = emptyProtobufList();

    private ListOperationsResponse() {
    }

    public final List<Operation> getOperationsList() {
        return this.operations_;
    }

    public final List<? extends LinearLayoutCompat> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public final int getOperationsCount() {
        return this.operations_.size();
    }

    public final Operation getOperations(int i) {
        return (Operation) this.operations_.get(i);
    }

    public final LinearLayoutCompat getOperationsOrBuilder(int i) {
        return (LinearLayoutCompat) this.operations_.get(i);
    }

    private void ensureOperationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Operation> audioAttributesCompatParcelizer = this.operations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.operations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setOperations(int i, Operation operation) {
        ensureOperationsIsMutable();
        this.operations_.set(i, operation);
    }

    /* access modifiers changed from: private */
    public void addOperations(Operation operation) {
        ensureOperationsIsMutable();
        this.operations_.add(operation);
    }

    /* access modifiers changed from: private */
    public void addOperations(int i, Operation operation) {
        ensureOperationsIsMutable();
        this.operations_.add(i, operation);
    }

    /* access modifiers changed from: private */
    public void addAllOperations(Iterable<? extends Operation> iterable) {
        ensureOperationsIsMutable();
        onLongPress.addAll(iterable, this.operations_);
    }

    /* access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeOperations(int i) {
        ensureOperationsIsMutable();
        this.operations_.remove(i);
    }

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final getBaseline getNextPageTokenBytes() {
        return getBaseline.asBinder(this.nextPageToken_);
    }

    /* access modifiers changed from: private */
    public void setNextPageToken(String str) {
        this.nextPageToken_ = str;
    }

    /* access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    /* access modifiers changed from: private */
    public void setNextPageTokenBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.nextPageToken_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ListOperationsResponse parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ListOperationsResponse parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ListOperationsResponse parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ListOperationsResponse parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(ListOperationsResponse listOperationsResponse) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(listOperationsResponse);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<ListOperationsResponse, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(ListOperationsResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.longrunning.ListOperationsResponse$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.ListOperationsResponse.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ListOperationsResponse();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ListOperationsResponse> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ListOperationsResponse.class) {
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
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        GeneratedMessageLite.registerDefaultInstance(ListOperationsResponse.class, listOperationsResponse);
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ListOperationsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
