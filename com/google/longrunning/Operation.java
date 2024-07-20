package com.google.longrunning;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.LinearLayoutCompat;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;

public final class Operation extends GeneratedMessageLite<Operation, asInterface> implements LinearLayoutCompat {
    /* access modifiers changed from: private */
    public static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    private Operation() {
    }

    public enum onTransact {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);
        
        private final int asBinder;

        private onTransact(int i) {
            this.asBinder = i;
        }

        public static onTransact RemoteActionCompatParcelizer(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 4) {
                return ERROR;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }
    }

    public final onTransact getResultCase() {
        return onTransact.RemoteActionCompatParcelizer(this.resultCase_);
    }

    /* access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
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

    public final boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public final Any getMetadata() {
        Any any = this.metadata_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    /* access modifiers changed from: private */
    public void setMetadata(Any any) {
        this.metadata_ = any;
    }

    /* access modifiers changed from: private */
    public void mergeMetadata(Any any) {
        Any any2 = this.metadata_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.metadata_ = any;
        } else {
            this.metadata_ = (Any) ((Any.read) Any.newBuilder(this.metadata_).mergeFrom(any)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    public final boolean getDone() {
        return this.done_;
    }

    /* access modifiers changed from: private */
    public void setDone(boolean z) {
        this.done_ = z;
    }

    /* access modifiers changed from: private */
    public void clearDone() {
        this.done_ = false;
    }

    public final boolean hasError() {
        return this.resultCase_ == 4;
    }

    public final Status getError() {
        if (this.resultCase_ == 4) {
            return (Status) this.result_;
        }
        return Status.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setError(Status status) {
        this.result_ = status;
        this.resultCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void mergeError(Status status) {
        if (this.resultCase_ != 4 || this.result_ == Status.getDefaultInstance()) {
            this.result_ = status;
        } else {
            this.result_ = ((Status.asBinder) Status.newBuilder((Status) this.result_).mergeFrom(status)).buildPartial();
        }
        this.resultCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public final boolean hasResponse() {
        return this.resultCase_ == 5;
    }

    public final Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any) this.result_;
        }
        return Any.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setResponse(Any any) {
        this.result_ = any;
        this.resultCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Any any) {
        if (this.resultCase_ != 5 || this.result_ == Any.getDefaultInstance()) {
            this.result_ = any;
        } else {
            this.result_ = ((Any.read) Any.newBuilder((Any) this.result_).mergeFrom(any)).buildPartial();
        }
        this.resultCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Operation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Operation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Operation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Operation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Operation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Operation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Operation operation) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Operation, asInterface> implements LinearLayoutCompat {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Operation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.longrunning.Operation$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.Operation.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Operation();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Operation> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Operation.class) {
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
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
