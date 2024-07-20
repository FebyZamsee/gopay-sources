package com.google.firebase.perf.v1;

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

public final class PerfSession extends GeneratedMessageLite<PerfSession, Builder> implements PerfSessionOrBuilder {
    /* access modifiers changed from: private */
    public static final PerfSession DEFAULT_INSTANCE;
    private static volatile getAnimationStyle<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final measureNullChild.write.read<Integer, SessionVerbosity> sessionVerbosity_converter_ = new measureNullChild.write.read<Integer, SessionVerbosity>() {
        public SessionVerbosity convert(Integer num) {
            SessionVerbosity forNumber = SessionVerbosity.forNumber(num.intValue());
            return forNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : forNumber;
        }
    };
    private int bitField0_;
    private String sessionId_ = "";
    private measureNullChild.IconCompatParcelizer sessionVerbosity_ = emptyIntList();

    private PerfSession() {
    }

    public final boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final getBaseline getSessionIdBytes() {
        return getBaseline.asBinder(this.sessionId_);
    }

    /* access modifiers changed from: private */
    public void setSessionId(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* access modifiers changed from: private */
    public void setSessionIdBytes(getBaseline getbaseline) {
        this.sessionId_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    public final List<SessionVerbosity> getSessionVerbosityList() {
        return new measureNullChild.write(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public final int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public final SessionVerbosity getSessionVerbosity(int i) {
        SessionVerbosity forNumber = SessionVerbosity.forNumber(this.sessionVerbosity_.asBinder(i));
        return forNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : forNumber;
    }

    private void ensureSessionVerbosityIsMutable() {
        measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.sessionVerbosity_;
        if (!iconCompatParcelizer.onTransact()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.RemoteActionCompatParcelizer(i, sessionVerbosity.getNumber());
    }

    /* access modifiers changed from: private */
    public void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.asInterface(sessionVerbosity.getNumber());
    }

    /* access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        ensureSessionVerbosityIsMutable();
        for (SessionVerbosity number : iterable) {
            this.sessionVerbosity_.asInterface(number.getNumber());
        }
    }

    /* access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = emptyIntList();
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static PerfSession parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static PerfSession parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static PerfSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfSession) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (PerfSession) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static PerfSession parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static PerfSession parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PerfSession perfSession) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<PerfSession, Builder> implements PerfSessionOrBuilder {
        private Builder() {
            super(PerfSession.DEFAULT_INSTANCE);
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
            return this;
        }

        public final Builder addSessionVerbosity(SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(sessionVerbosity);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfSession$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

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
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.PerfSession.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<PerfSession> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (PerfSession.class) {
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

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<PerfSession> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
