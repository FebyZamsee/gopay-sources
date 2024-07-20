package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.drawDividersHorizontal;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class Status extends GeneratedMessageLite<Status, asBinder> implements layoutHorizontal {
    public static final int CODE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile getAnimationStyle<Status> PARSER;
    private int code_;
    private measureNullChild.AudioAttributesCompatParcelizer<Any> details_ = emptyProtobufList();
    private String message_ = "";

    private Status() {
    }

    public final int getCode() {
        return this.code_;
    }

    /* access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public final String getMessage() {
        return this.message_;
    }

    public final getBaseline getMessageBytes() {
        return getBaseline.asBinder(this.message_);
    }

    /* access modifiers changed from: private */
    public void setMessage(String str) {
        this.message_ = str;
    }

    /* access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* access modifiers changed from: private */
    public void setMessageBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.message_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<Any> getDetailsList() {
        return this.details_;
    }

    public final List<? extends drawDividersHorizontal> getDetailsOrBuilderList() {
        return this.details_;
    }

    public final int getDetailsCount() {
        return this.details_.size();
    }

    public final Any getDetails(int i) {
        return (Any) this.details_.get(i);
    }

    public final drawDividersHorizontal getDetailsOrBuilder(int i) {
        return (drawDividersHorizontal) this.details_.get(i);
    }

    private void ensureDetailsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Any> audioAttributesCompatParcelizer = this.details_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.details_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setDetails(int i, Any any) {
        ensureDetailsIsMutable();
        this.details_.set(i, any);
    }

    /* access modifiers changed from: private */
    public void addDetails(Any any) {
        ensureDetailsIsMutable();
        this.details_.add(any);
    }

    /* access modifiers changed from: private */
    public void addDetails(int i, Any any) {
        ensureDetailsIsMutable();
        this.details_.add(i, any);
    }

    /* access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Any> iterable) {
        ensureDetailsIsMutable();
        onLongPress.addAll(iterable, this.details_);
    }

    /* access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Status parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Status parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Status parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Status parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asBinder newBuilder() {
        return (asBinder) DEFAULT_INSTANCE.createBuilder();
    }

    public static asBinder newBuilder(Status status) {
        return (asBinder) DEFAULT_INSTANCE.createBuilder(status);
    }

    public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Status, asBinder> implements layoutHorizontal {
        /* synthetic */ asBinder(byte b) {
            this();
        }

        private asBinder() {
            super(Status.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.rpc.Status$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] asBinder;

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
                asBinder = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asBinder     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.Status.AnonymousClass4.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass4.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new asBinder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Status> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Status.class) {
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
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
