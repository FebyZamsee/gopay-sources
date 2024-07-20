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

public final class Help extends GeneratedMessageLite<Help, asInterface> implements layoutHorizontal {
    /* access modifiers changed from: private */
    public static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Help> PARSER;
    private measureNullChild.AudioAttributesCompatParcelizer<Link> links_ = emptyProtobufList();

    public interface read extends ListPopupWindow {
    }

    private Help() {
    }

    public static final class Link extends GeneratedMessageLite<Link, RemoteActionCompatParcelizer> implements read {
        /* access modifiers changed from: private */
        public static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<Link> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        private Link() {
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

        public final String getUrl() {
            return this.url_;
        }

        public final getBaseline getUrlBytes() {
            return getBaseline.asBinder(this.url_);
        }

        /* access modifiers changed from: private */
        public void setUrl(String str) {
            this.url_ = str;
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* access modifiers changed from: private */
        public void setUrlBytes(getBaseline getbaseline) {
            checkByteStringIsUtf8(getbaseline);
            this.url_ = getbaseline.AudioAttributesImplApi26Parcelizer();
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static Link parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static Link parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static Link parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (Link) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static Link parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static Link parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(Link link) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(link);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Link, RemoteActionCompatParcelizer> implements read {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(Link.DEFAULT_INSTANCE);
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass3.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new Link();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<Link> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (Link.class) {
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
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.registerDefaultInstance(Link.class, link);
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.rpc.Help$3  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.Help.AnonymousClass3.<clinit>():void");
        }
    }

    public final List<Link> getLinksList() {
        return this.links_;
    }

    public final List<? extends read> getLinksOrBuilderList() {
        return this.links_;
    }

    public final int getLinksCount() {
        return this.links_.size();
    }

    public final Link getLinks(int i) {
        return (Link) this.links_.get(i);
    }

    public final read getLinksOrBuilder(int i) {
        return (read) this.links_.get(i);
    }

    private void ensureLinksIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Link> audioAttributesCompatParcelizer = this.links_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.links_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setLinks(int i, Link link) {
        ensureLinksIsMutable();
        this.links_.set(i, link);
    }

    /* access modifiers changed from: private */
    public void addLinks(Link link) {
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* access modifiers changed from: private */
    public void addLinks(int i, Link link) {
        ensureLinksIsMutable();
        this.links_.add(i, link);
    }

    /* access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        onLongPress.addAll(iterable, this.links_);
    }

    /* access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeLinks(int i) {
        ensureLinksIsMutable();
        this.links_.remove(i);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Help parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Help parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Help parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Help parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Help) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Help) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Help parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Help parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static asInterface newBuilder() {
        return (asInterface) DEFAULT_INSTANCE.createBuilder();
    }

    public static asInterface newBuilder(Help help) {
        return (asInterface) DEFAULT_INSTANCE.createBuilder(help);
    }

    public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<Help, asInterface> implements layoutHorizontal {
        /* synthetic */ asInterface(byte b) {
            this();
        }

        private asInterface() {
            super(Help.DEFAULT_INSTANCE);
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass3.asBinder[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Help();
            case 2:
                return new asInterface((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", Link.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Help> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Help.class) {
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
        Help help = new Help();
        DEFAULT_INSTANCE = help;
        GeneratedMessageLite.registerDefaultInstance(Help.class, help);
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Help> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
