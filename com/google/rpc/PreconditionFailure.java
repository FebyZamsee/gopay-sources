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

public final class PreconditionFailure extends GeneratedMessageLite<PreconditionFailure, RemoteActionCompatParcelizer> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<PreconditionFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private measureNullChild.AudioAttributesCompatParcelizer<Violation> violations_ = emptyProtobufList();

    public interface read extends ListPopupWindow {
    }

    private PreconditionFailure() {
    }

    public static final class Violation extends GeneratedMessageLite<Violation, onTransact> implements read {
        /* access modifiers changed from: private */
        public static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String description_ = "";
        private String subject_ = "";
        private String type_ = "";

        private Violation() {
        }

        public final String getType() {
            return this.type_;
        }

        public final getBaseline getTypeBytes() {
            return getBaseline.asBinder(this.type_);
        }

        /* access modifiers changed from: private */
        public void setType(String str) {
            this.type_ = str;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* access modifiers changed from: private */
        public void setTypeBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.type_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public final String getSubject() {
            return this.subject_;
        }

        public final getBaseline getSubjectBytes() {
            return getBaseline.asBinder(this.subject_);
        }

        /* access modifiers changed from: private */
        public void setSubject(String str) {
            this.subject_ = str;
        }

        /* access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        /* access modifiers changed from: private */
        public void setSubjectBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.subject_ = getbaseline.AudioAttributesImplApi26Parcelizer();
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

        public static Violation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Violation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Violation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Violation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Violation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Violation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Violation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Violation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(Violation violation) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(violation);
        }

        public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<Violation, onTransact> implements read {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(Violation.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass3.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Violation();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Violation> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Violation.class) {
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
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            GeneratedMessageLite.registerDefaultInstance(Violation.class, violation);
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Violation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.rpc.PreconditionFailure$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.PreconditionFailure.AnonymousClass3.<clinit>():void");
        }
    }

    public final List<Violation> getViolationsList() {
        return this.violations_;
    }

    public final List<? extends read> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public final int getViolationsCount() {
        return this.violations_.size();
    }

    public final Violation getViolations(int i) {
        return (Violation) this.violations_.get(i);
    }

    public final read getViolationsOrBuilder(int i) {
        return (read) this.violations_.get(i);
    }

    private void ensureViolationsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Violation> audioAttributesCompatParcelizer = this.violations_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setViolations(int i, Violation violation) {
        ensureViolationsIsMutable();
        this.violations_.set(i, violation);
    }

    /* access modifiers changed from: private */
    public void addViolations(Violation violation) {
        ensureViolationsIsMutable();
        this.violations_.add(violation);
    }

    /* access modifiers changed from: private */
    public void addViolations(int i, Violation violation) {
        ensureViolationsIsMutable();
        this.violations_.add(i, violation);
    }

    /* access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends Violation> iterable) {
        ensureViolationsIsMutable();
        onLongPress.addAll(iterable, this.violations_);
    }

    /* access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeViolations(int i) {
        ensureViolationsIsMutable();
        this.violations_.remove(i);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static PreconditionFailure parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static PreconditionFailure parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static PreconditionFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreconditionFailure parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PreconditionFailure) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PreconditionFailure parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static PreconditionFailure parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static RemoteActionCompatParcelizer newBuilder() {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoteActionCompatParcelizer newBuilder(PreconditionFailure preconditionFailure) {
        return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(preconditionFailure);
    }

    public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<PreconditionFailure, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass3.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new PreconditionFailure();
            case 2:
                return new RemoteActionCompatParcelizer((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<PreconditionFailure> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (PreconditionFailure.class) {
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
        PreconditionFailure preconditionFailure = new PreconditionFailure();
        DEFAULT_INSTANCE = preconditionFailure;
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure.class, preconditionFailure);
    }

    public static PreconditionFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<PreconditionFailure> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
