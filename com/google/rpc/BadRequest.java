package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.ListPopupWindow;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;

public final class BadRequest extends GeneratedMessageLite<BadRequest, onTransact> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<BadRequest> PARSER;
    private measureNullChild.AudioAttributesCompatParcelizer<FieldViolation> fieldViolations_ = emptyProtobufList();

    public interface asBinder extends ListPopupWindow {
    }

    private BadRequest() {
    }

    public static final class FieldViolation extends GeneratedMessageLite<FieldViolation, asBinder> implements asBinder {
        /* access modifiers changed from: private */
        public static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<FieldViolation> PARSER;
        private String description_ = "";
        private String field_ = "";

        private FieldViolation() {
        }

        public final String getField() {
            return this.field_;
        }

        public final getBaseline getFieldBytes() {
            return getBaseline.asBinder(this.field_);
        }

        /* access modifiers changed from: private */
        public void setField(String str) {
            this.field_ = str;
        }

        /* access modifiers changed from: private */
        public void clearField() {
            this.field_ = getDefaultInstance().getField();
        }

        /* access modifiers changed from: private */
        public void setFieldBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.field_ = getbaseline.AudioAttributesImplApi26Parcelizer();
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

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FieldViolation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FieldViolation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FieldViolation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldViolation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldViolation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldViolation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FieldViolation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(FieldViolation fieldViolation) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(fieldViolation);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<FieldViolation, asBinder> implements asBinder {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(FieldViolation.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FieldViolation();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FieldViolation> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FieldViolation.class) {
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
            FieldViolation fieldViolation = new FieldViolation();
            DEFAULT_INSTANCE = fieldViolation;
            GeneratedMessageLite.registerDefaultInstance(FieldViolation.class, fieldViolation);
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FieldViolation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.rpc.BadRequest$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onTransact;

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
                onTransact = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = onTransact     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.BadRequest.AnonymousClass2.<clinit>():void");
        }
    }

    public final List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public final List<? extends asBinder> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    public final int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public final FieldViolation getFieldViolations(int i) {
        return (FieldViolation) this.fieldViolations_.get(i);
    }

    public final asBinder getFieldViolationsOrBuilder(int i) {
        return (asBinder) this.fieldViolations_.get(i);
    }

    private void ensureFieldViolationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<FieldViolation> audioAttributesCompatParcelizer = this.fieldViolations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setFieldViolations(int i, FieldViolation fieldViolation) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(i, fieldViolation);
    }

    /* access modifiers changed from: private */
    public void addFieldViolations(FieldViolation fieldViolation) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(fieldViolation);
    }

    /* access modifiers changed from: private */
    public void addFieldViolations(int i, FieldViolation fieldViolation) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(i, fieldViolation);
    }

    /* access modifiers changed from: private */
    public void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        ensureFieldViolationsIsMutable();
        onLongPress.addAll(iterable, this.fieldViolations_);
    }

    /* access modifiers changed from: private */
    public void clearFieldViolations() {
        this.fieldViolations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeFieldViolations(int i) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(i);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static BadRequest parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static BadRequest parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static BadRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadRequest parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (BadRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static BadRequest parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static BadRequest parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static onTransact newBuilder() {
        return (onTransact) DEFAULT_INSTANCE.createBuilder();
    }

    public static onTransact newBuilder(BadRequest badRequest) {
        return (onTransact) DEFAULT_INSTANCE.createBuilder(badRequest);
    }

    public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<BadRequest, onTransact> implements layoutHorizontal {
        /* synthetic */ onTransact(byte b) {
            this();
        }

        private onTransact() {
            super(BadRequest.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.onTransact[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new BadRequest();
            case 2:
                return new onTransact((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", FieldViolation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<BadRequest> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (BadRequest.class) {
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
        BadRequest badRequest = new BadRequest();
        DEFAULT_INSTANCE = badRequest;
        GeneratedMessageLite.registerDefaultInstance(BadRequest.class, badRequest);
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<BadRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
