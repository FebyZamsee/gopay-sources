package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.setOnItemClickListener;
import o.setVerticalGravity;
import o.setWeightSum;

public final class ApplicationInfo extends GeneratedMessageLite<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<ApplicationInfo> PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private setWeightSum<String, String> customAttributes_ = setWeightSum.asInterface();
    private String googleAppId_ = "";

    static final class CustomAttributesDefaultEntryHolder {
        static final setVerticalGravity<String, String> defaultEntry = setVerticalGravity.RemoteActionCompatParcelizer(setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "", setOnItemClickListener.RemoteActionCompatParcelizer.STRING, "");
    }

    private ApplicationInfo() {
    }

    public final boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String getGoogleAppId() {
        return this.googleAppId_;
    }

    public final getBaseline getGoogleAppIdBytes() {
        return getBaseline.asBinder(this.googleAppId_);
    }

    /* access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    /* access modifiers changed from: private */
    public void setGoogleAppIdBytes(getBaseline getbaseline) {
        this.googleAppId_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 1;
    }

    public final boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public final String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public final getBaseline getAppInstanceIdBytes() {
        return getBaseline.asBinder(this.appInstanceId_);
    }

    /* access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* access modifiers changed from: private */
    public void setAppInstanceIdBytes(getBaseline getbaseline) {
        this.appInstanceId_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        this.bitField0_ |= 2;
    }

    public final boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public final AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.getDefaultInstance() : androidApplicationInfo;
    }

    /* access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 == null || androidApplicationInfo2 == AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = androidApplicationInfo;
        } else {
            this.androidAppInfo_ = (AndroidApplicationInfo) ((AndroidApplicationInfo.Builder) AndroidApplicationInfo.newBuilder(this.androidAppInfo_).mergeFrom(androidApplicationInfo)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    public final boolean hasApplicationProcessState() {
        return (this.bitField0_ & 8) != 0;
    }

    public final ApplicationProcessState getApplicationProcessState() {
        ApplicationProcessState forNumber = ApplicationProcessState.forNumber(this.applicationProcessState_);
        return forNumber == null ? ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN : forNumber;
    }

    /* access modifiers changed from: private */
    public void setApplicationProcessState(ApplicationProcessState applicationProcessState) {
        this.applicationProcessState_ = applicationProcessState.getNumber();
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    private setWeightSum<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private setWeightSum<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.asBinder) {
            setWeightSum<String, String> setweightsum = this.customAttributes_;
            this.customAttributes_ = setweightsum.isEmpty() ? new setWeightSum<>() : new setWeightSum<>(setweightsum);
        }
        return this.customAttributes_;
    }

    public final int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public final boolean containsCustomAttributes(String str) {
        return internalGetCustomAttributes().containsKey(str);
    }

    @Deprecated
    public final Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public final Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public final String getCustomAttributesOrDefault(String str, String str2) {
        setWeightSum<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        return internalGetCustomAttributes.containsKey(str) ? internalGetCustomAttributes.get(str) : str2;
    }

    public final String getCustomAttributesOrThrow(String str) {
        setWeightSum<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static ApplicationInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static ApplicationInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (ApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static ApplicationInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static ApplicationInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ApplicationInfo applicationInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static final class Builder extends GeneratedMessageLite.RemoteActionCompatParcelizer<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(ApplicationInfo.DEFAULT_INSTANCE);
        }

        public final Builder setGoogleAppId(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setGoogleAppId(str);
            return this;
        }

        public final boolean hasAppInstanceId() {
            return ((ApplicationInfo) this.instance).hasAppInstanceId();
        }

        public final Builder setAppInstanceId(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAppInstanceId(str);
            return this;
        }

        public final Builder setAndroidAppInfo(AndroidApplicationInfo.Builder builder) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAndroidAppInfo((AndroidApplicationInfo) builder.build());
            return this;
        }

        public final Builder setApplicationProcessState(ApplicationProcessState applicationProcessState) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setApplicationProcessState(applicationProcessState);
            return this;
        }

        public final Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.ApplicationInfo.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.internalGetVerifier(), "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<ApplicationInfo> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (ApplicationInfo.class) {
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
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        GeneratedMessageLite.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    public static ApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<ApplicationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
