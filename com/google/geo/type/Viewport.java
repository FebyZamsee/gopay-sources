package com.google.geo.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;

public final class Viewport extends GeneratedMessageLite<Viewport, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Viewport> PARSER;
    private LatLng high_;
    private LatLng low_;

    private Viewport() {
    }

    public final boolean hasLow() {
        return this.low_ != null;
    }

    public final LatLng getLow() {
        LatLng latLng = this.low_;
        return latLng == null ? LatLng.getDefaultInstance() : latLng;
    }

    /* access modifiers changed from: private */
    public void setLow(LatLng latLng) {
        this.low_ = latLng;
    }

    /* access modifiers changed from: private */
    public void mergeLow(LatLng latLng) {
        LatLng latLng2 = this.low_;
        if (latLng2 == null || latLng2 == LatLng.getDefaultInstance()) {
            this.low_ = latLng;
        } else {
            this.low_ = (LatLng) ((LatLng.asInterface) LatLng.newBuilder(this.low_).mergeFrom(latLng)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearLow() {
        this.low_ = null;
    }

    public final boolean hasHigh() {
        return this.high_ != null;
    }

    public final LatLng getHigh() {
        LatLng latLng = this.high_;
        return latLng == null ? LatLng.getDefaultInstance() : latLng;
    }

    /* access modifiers changed from: private */
    public void setHigh(LatLng latLng) {
        this.high_ = latLng;
    }

    /* access modifiers changed from: private */
    public void mergeHigh(LatLng latLng) {
        LatLng latLng2 = this.high_;
        if (latLng2 == null || latLng2 == LatLng.getDefaultInstance()) {
            this.high_ = latLng;
        } else {
            this.high_ = (LatLng) ((LatLng.asInterface) LatLng.newBuilder(this.high_).mergeFrom(latLng)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearHigh() {
        this.high_ = null;
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Viewport parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Viewport parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Viewport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Viewport parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Viewport parseFrom(InputStream inputStream) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Viewport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Viewport) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Viewport parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Viewport parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Viewport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Viewport viewport) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(viewport);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Viewport, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Viewport.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.geo.type.Viewport$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.geo.type.Viewport.AnonymousClass2.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass2.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Viewport();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Viewport> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Viewport.class) {
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
        Viewport viewport = new Viewport();
        DEFAULT_INSTANCE = viewport;
        GeneratedMessageLite.registerDefaultInstance(Viewport.class, viewport);
    }

    public static Viewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Viewport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
