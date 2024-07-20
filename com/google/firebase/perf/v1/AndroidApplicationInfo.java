package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;

public final class AndroidApplicationInfo extends GeneratedMessageLite<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
    /* access modifiers changed from: private */
    public static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<AndroidApplicationInfo> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    private AndroidApplicationInfo() {
    }

    public final boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getPackageName() {
        return this.packageName_;
    }

    public final getBaseline getPackageNameBytes() {
        return getBaseline.asBinder(this.packageName_);
    }

    /* access modifiers changed from: private */
    public void setPackageName(String str) {
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* access modifiers changed from: private */
    public void setPackageNameBytes(getBaseline getbaseline) {
        this.packageName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    public final boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public final String getSdkVersion() {
        return this.sdkVersion_;
    }

    public final getBaseline getSdkVersionBytes() {
        return getBaseline.asBinder(this.sdkVersion_);
    }

    /* access modifiers changed from: private */
    public void setSdkVersion(String str) {
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* access modifiers changed from: private */
    public void setSdkVersionBytes(getBaseline getbaseline) {
        this.sdkVersion_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 2;
    }

    public final boolean hasVersionName() {
        return (this.bitField0_ & 4) != 0;
    }

    public final String getVersionName() {
        return this.versionName_;
    }

    public final getBaseline getVersionNameBytes() {
        return getBaseline.asBinder(this.versionName_);
    }

    /* access modifiers changed from: private */
    public void setVersionName(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    /* access modifiers changed from: private */
    public void setVersionNameBytes(getBaseline getbaseline) {
        this.versionName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 4;
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static AndroidApplicationInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static AndroidApplicationInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (AndroidApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static AndroidApplicationInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static AndroidApplicationInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (AndroidApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AndroidApplicationInfo androidApplicationInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(androidApplicationInfo);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(AndroidApplicationInfo.DEFAULT_INSTANCE);
        }

        public final Builder setPackageName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageName(str);
            return this;
        }

        public final Builder setSdkVersion(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersion(str);
            return this;
        }

        public final Builder setVersionName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionName(str);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.AndroidApplicationInfo$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.AndroidApplicationInfo.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new AndroidApplicationInfo();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<AndroidApplicationInfo> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (AndroidApplicationInfo.class) {
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
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        GeneratedMessageLite.registerDefaultInstance(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    public static AndroidApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<AndroidApplicationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
