package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.ActionBarDrawerToggleHoneycomb;
import o.ListPopupWindow;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onDrawerStateChanged;
import o.onLongPress;

public final class DescriptorProtos implements ActionBarDrawerToggleHoneycomb.SetIndicatorInfo.RemoteActionCompatParcelizer {
    private /* synthetic */ onDrawerStateChanged read;

    public interface AudioAttributesImplApi21Parcelizer extends ListPopupWindow {
    }

    public interface AudioAttributesImplApi26Parcelizer extends ListPopupWindow {
    }

    public interface IconCompatParcelizer extends ListPopupWindow {
    }

    public interface RemoteActionCompatParcelizer extends ListPopupWindow {
    }

    public interface asBinder extends ListPopupWindow {
    }

    public interface asInterface extends ListPopupWindow {
    }

    public interface onTransact extends ListPopupWindow {
    }

    public interface read extends ListPopupWindow {
    }

    public interface write extends ListPopupWindow {
    }

    public static final class FileDescriptorSet extends GeneratedMessageLite<FileDescriptorSet, onTransact> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final FileDescriptorSet DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<FileDescriptorSet> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<FileDescriptorProto> file_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        private FileDescriptorSet() {
        }

        public final List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public final List<? extends RemoteActionCompatParcelizer> getFileOrBuilderList() {
            return this.file_;
        }

        public final int getFileCount() {
            return this.file_.size();
        }

        public final FileDescriptorProto getFile(int i) {
            return (FileDescriptorProto) this.file_.get(i);
        }

        public final RemoteActionCompatParcelizer getFileOrBuilder(int i) {
            return (RemoteActionCompatParcelizer) this.file_.get(i);
        }

        private void ensureFileIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<FileDescriptorProto> audioAttributesCompatParcelizer = this.file_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.file_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setFile(int i, FileDescriptorProto fileDescriptorProto) {
            ensureFileIsMutable();
            this.file_.set(i, fileDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addFile(FileDescriptorProto fileDescriptorProto) {
            ensureFileIsMutable();
            this.file_.add(fileDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addFile(int i, FileDescriptorProto fileDescriptorProto) {
            ensureFileIsMutable();
            this.file_.add(i, fileDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
            ensureFileIsMutable();
            onLongPress.addAll(iterable, this.file_);
        }

        /* access modifiers changed from: private */
        public void clearFile() {
            this.file_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeFile(int i) {
            ensureFileIsMutable();
            this.file_.remove(i);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FileDescriptorSet parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FileDescriptorSet parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorSet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileDescriptorSet parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FileDescriptorSet parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(FileDescriptorSet fileDescriptorSet) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(fileDescriptorSet);
        }

        public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<FileDescriptorSet, onTransact> implements layoutHorizontal {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FileDescriptorSet();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FileDescriptorSet> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FileDescriptorSet.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet();
            DEFAULT_INSTANCE = fileDescriptorSet;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, fileDescriptorSet);
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FileDescriptorSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
                RemoteActionCompatParcelizer = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.AnonymousClass2.<clinit>():void");
        }
    }

    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, read> implements RemoteActionCompatParcelizer {
        /* access modifiers changed from: private */
        public static final FileDescriptorProto DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private measureNullChild.AudioAttributesCompatParcelizer<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<EnumDescriptorProto> enumType_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> extension_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<DescriptorProto> messageType_ = emptyProtobufList();
        private String name_ = "";
        private FileOptions options_;
        private String package_ = "";
        private measureNullChild.IconCompatParcelizer publicDependency_ = emptyIntList();
        private measureNullChild.AudioAttributesCompatParcelizer<ServiceDescriptorProto> service_ = emptyProtobufList();
        private SourceCodeInfo sourceCodeInfo_;
        private String syntax_ = "";
        private measureNullChild.IconCompatParcelizer weakDependency_ = emptyIntList();

        private FileDescriptorProto() {
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        public final String getPackage() {
            return this.package_;
        }

        public final getBaseline getPackageBytes() {
            return getBaseline.asBinder(this.package_);
        }

        /* access modifiers changed from: private */
        public void setPackage(String str) {
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = getDefaultInstance().getPackage();
        }

        /* access modifiers changed from: private */
        public void setPackageBytes(getBaseline getbaseline) {
            this.package_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 2;
        }

        public final List<String> getDependencyList() {
            return this.dependency_;
        }

        public final int getDependencyCount() {
            return this.dependency_.size();
        }

        public final String getDependency(int i) {
            return (String) this.dependency_.get(i);
        }

        public final getBaseline getDependencyBytes(int i) {
            return getBaseline.asBinder((String) this.dependency_.get(i));
        }

        private void ensureDependencyIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.dependency_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.dependency_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setDependency(int i, String str) {
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addDependency(String str) {
            ensureDependencyIsMutable();
            this.dependency_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            onLongPress.addAll(iterable, this.dependency_);
        }

        /* access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addDependencyBytes(getBaseline getbaseline) {
            ensureDependencyIsMutable();
            this.dependency_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public final List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        public final int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        public final int getPublicDependency(int i) {
            return this.publicDependency_.asBinder(i);
        }

        private void ensurePublicDependencyIsMutable() {
            measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.publicDependency_;
            if (!iconCompatParcelizer.onTransact()) {
                this.publicDependency_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.RemoteActionCompatParcelizer(i, i2);
        }

        /* access modifiers changed from: private */
        public void addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.asInterface(i);
        }

        /* access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            onLongPress.addAll(iterable, this.publicDependency_);
        }

        /* access modifiers changed from: private */
        public void clearPublicDependency() {
            this.publicDependency_ = emptyIntList();
        }

        public final List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        public final int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        public final int getWeakDependency(int i) {
            return this.weakDependency_.asBinder(i);
        }

        private void ensureWeakDependencyIsMutable() {
            measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.weakDependency_;
            if (!iconCompatParcelizer.onTransact()) {
                this.weakDependency_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.RemoteActionCompatParcelizer(i, i2);
        }

        /* access modifiers changed from: private */
        public void addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.asInterface(i);
        }

        /* access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            onLongPress.addAll(iterable, this.weakDependency_);
        }

        /* access modifiers changed from: private */
        public void clearWeakDependency() {
            this.weakDependency_ = emptyIntList();
        }

        public final List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public final List<? extends onTransact> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        public final int getMessageTypeCount() {
            return this.messageType_.size();
        }

        public final DescriptorProto getMessageType(int i) {
            return (DescriptorProto) this.messageType_.get(i);
        }

        public final onTransact getMessageTypeOrBuilder(int i) {
            return (onTransact) this.messageType_.get(i);
        }

        private void ensureMessageTypeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<DescriptorProto> audioAttributesCompatParcelizer = this.messageType_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.messageType_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setMessageType(int i, DescriptorProto descriptorProto) {
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMessageType(DescriptorProto descriptorProto) {
            ensureMessageTypeIsMutable();
            this.messageType_.add(descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMessageType(int i, DescriptorProto descriptorProto) {
            ensureMessageTypeIsMutable();
            this.messageType_.add(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
            ensureMessageTypeIsMutable();
            onLongPress.addAll(iterable, this.messageType_);
        }

        /* access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeMessageType(int i) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
        }

        public final List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public final List<? extends asBinder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public final int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public final EnumDescriptorProto getEnumType(int i) {
            return (EnumDescriptorProto) this.enumType_.get(i);
        }

        public final asBinder getEnumTypeOrBuilder(int i) {
            return (asBinder) this.enumType_.get(i);
        }

        private void ensureEnumTypeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<EnumDescriptorProto> audioAttributesCompatParcelizer = this.enumType_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            onLongPress.addAll(iterable, this.enumType_);
        }

        /* access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        public final List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public final List<? extends AudioAttributesImplApi26Parcelizer> getServiceOrBuilderList() {
            return this.service_;
        }

        public final int getServiceCount() {
            return this.service_.size();
        }

        public final ServiceDescriptorProto getService(int i) {
            return (ServiceDescriptorProto) this.service_.get(i);
        }

        public final AudioAttributesImplApi26Parcelizer getServiceOrBuilder(int i) {
            return (AudioAttributesImplApi26Parcelizer) this.service_.get(i);
        }

        private void ensureServiceIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<ServiceDescriptorProto> audioAttributesCompatParcelizer = this.service_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.service_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            ensureServiceIsMutable();
            this.service_.set(i, serviceDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addService(ServiceDescriptorProto serviceDescriptorProto) {
            ensureServiceIsMutable();
            this.service_.add(serviceDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            ensureServiceIsMutable();
            this.service_.add(i, serviceDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
            ensureServiceIsMutable();
            onLongPress.addAll(iterable, this.service_);
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeService(int i) {
            ensureServiceIsMutable();
            this.service_.remove(i);
        }

        public final List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public final List<? extends asInterface> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public final int getExtensionCount() {
            return this.extension_.size();
        }

        public final FieldDescriptorProto getExtension(int i) {
            return (FieldDescriptorProto) this.extension_.get(i);
        }

        public final asInterface getExtensionOrBuilder(int i) {
            return (asInterface) this.extension_.get(i);
        }

        private void ensureExtensionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> audioAttributesCompatParcelizer = this.extension_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            onLongPress.addAll(iterable, this.extension_);
        }

        /* access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public final FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(FileOptions fileOptions) {
            this.options_ = fileOptions;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(FileOptions fileOptions) {
            FileOptions fileOptions2 = this.options_;
            if (fileOptions2 == null || fileOptions2 == FileOptions.getDefaultInstance()) {
                this.options_ = fileOptions;
            } else {
                this.options_ = (FileOptions) ((FileOptions.asBinder) FileOptions.newBuilder(this.options_).mergeFrom(fileOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public final boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public final SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        /* access modifiers changed from: private */
        public void setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            this.sourceCodeInfo_ = sourceCodeInfo;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            SourceCodeInfo sourceCodeInfo2 = this.sourceCodeInfo_;
            if (sourceCodeInfo2 == null || sourceCodeInfo2 == SourceCodeInfo.getDefaultInstance()) {
                this.sourceCodeInfo_ = sourceCodeInfo;
            } else {
                this.sourceCodeInfo_ = (SourceCodeInfo) ((SourceCodeInfo.onTransact) SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom(sourceCodeInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        public final boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        public final String getSyntax() {
            return this.syntax_;
        }

        public final getBaseline getSyntaxBytes() {
            return getBaseline.asBinder(this.syntax_);
        }

        /* access modifiers changed from: private */
        public void setSyntax(String str) {
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* access modifiers changed from: private */
        public void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = getDefaultInstance().getSyntax();
        }

        /* access modifiers changed from: private */
        public void setSyntaxBytes(getBaseline getbaseline) {
            this.syntax_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 16;
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FileDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FileDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FileDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(FileDescriptorProto fileDescriptorProto) {
            return (read) DEFAULT_INSTANCE.createBuilder(fileDescriptorProto);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<FileDescriptorProto, read> implements RemoteActionCompatParcelizer {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FileDescriptorProto();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FileDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FileDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto();
            DEFAULT_INSTANCE = fileDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, fileDescriptorProto);
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FileDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public /* synthetic */ DescriptorProtos(onDrawerStateChanged ondrawerstatechanged) {
        this.read = ondrawerstatechanged;
    }

    public final Object asBinder() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, asBinder> implements onTransact {
        /* access modifiers changed from: private */
        public static final DescriptorProto DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile getAnimationStyle<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private measureNullChild.AudioAttributesCompatParcelizer<EnumDescriptorProto> enumType_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<ExtensionRange> extensionRange_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> extension_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> field_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private measureNullChild.AudioAttributesCompatParcelizer<DescriptorProto> nestedType_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<OneofDescriptorProto> oneofDecl_ = emptyProtobufList();
        private MessageOptions options_;
        private measureNullChild.AudioAttributesCompatParcelizer<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<ReservedRange> reservedRange_ = emptyProtobufList();

        public interface RemoteActionCompatParcelizer extends ListPopupWindow {
        }

        public interface asInterface extends ListPopupWindow {
        }

        private DescriptorProto() {
        }

        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, onTransact> implements asInterface {
            /* access modifiers changed from: private */
            public static final ExtensionRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile getAnimationStyle<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private ExtensionRangeOptions options_;
            private int start_;

            private ExtensionRange() {
            }

            public final boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public final int getStart() {
                return this.start_;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public final boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public final int getEnd() {
                return this.end_;
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            public final boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            public final ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            /* access modifiers changed from: private */
            public void setOptions(ExtensionRangeOptions extensionRangeOptions) {
                this.options_ = extensionRangeOptions;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                ExtensionRangeOptions extensionRangeOptions2 = this.options_;
                if (extensionRangeOptions2 == null || extensionRangeOptions2 == ExtensionRangeOptions.getDefaultInstance()) {
                    this.options_ = extensionRangeOptions;
                } else {
                    this.options_ = (ExtensionRangeOptions) ((ExtensionRangeOptions.onTransact) ExtensionRangeOptions.newBuilder(this.options_).mergeFrom(extensionRangeOptions)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static ExtensionRange parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static ExtensionRange parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExtensionRange parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (ExtensionRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static ExtensionRange parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static ExtensionRange parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static onTransact newBuilder() {
                return (onTransact) DEFAULT_INSTANCE.createBuilder();
            }

            public static onTransact newBuilder(ExtensionRange extensionRange) {
                return (onTransact) DEFAULT_INSTANCE.createBuilder(extensionRange);
            }

            public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<ExtensionRange, onTransact> implements asInterface {
                /* synthetic */ onTransact(byte b) {
                    this();
                }

                private onTransact() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                int i = 1;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new ExtensionRange();
                    case 2:
                        return new onTransact((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<ExtensionRange> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (ExtensionRange.class) {
                            getanimationstyle = PARSER;
                            if (getanimationstyle == null) {
                                getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                                PARSER = getanimationstyle;
                            }
                        }
                        return getanimationstyle;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                ExtensionRange extensionRange = new ExtensionRange();
                DEFAULT_INSTANCE = extensionRange;
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<ExtensionRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, RemoteActionCompatParcelizer> implements RemoteActionCompatParcelizer {
            /* access modifiers changed from: private */
            public static final ReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile getAnimationStyle<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            private ReservedRange() {
            }

            public final boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public final int getStart() {
                return this.start_;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public final boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public final int getEnd() {
                return this.end_;
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static ReservedRange parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static ReservedRange parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ReservedRange parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (ReservedRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static ReservedRange parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static ReservedRange parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static RemoteActionCompatParcelizer newBuilder() {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
            }

            public static RemoteActionCompatParcelizer newBuilder(ReservedRange reservedRange) {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(reservedRange);
            }

            public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<ReservedRange, RemoteActionCompatParcelizer> implements RemoteActionCompatParcelizer {
                /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                    this();
                }

                private RemoteActionCompatParcelizer() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new ReservedRange();
                    case 2:
                        return new RemoteActionCompatParcelizer((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<ReservedRange> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (ReservedRange.class) {
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
                ReservedRange reservedRange = new ReservedRange();
                DEFAULT_INSTANCE = reservedRange;
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
            }

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<ReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public final List<? extends asInterface> getFieldOrBuilderList() {
            return this.field_;
        }

        public final int getFieldCount() {
            return this.field_.size();
        }

        public final FieldDescriptorProto getField(int i) {
            return (FieldDescriptorProto) this.field_.get(i);
        }

        public final asInterface getFieldOrBuilder(int i) {
            return (asInterface) this.field_.get(i);
        }

        private void ensureFieldIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> audioAttributesCompatParcelizer = this.field_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.field_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setField(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureFieldIsMutable();
            this.field_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addField(FieldDescriptorProto fieldDescriptorProto) {
            ensureFieldIsMutable();
            this.field_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addField(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureFieldIsMutable();
            this.field_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureFieldIsMutable();
            onLongPress.addAll(iterable, this.field_);
        }

        /* access modifiers changed from: private */
        public void clearField() {
            this.field_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeField(int i) {
            ensureFieldIsMutable();
            this.field_.remove(i);
        }

        public final List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public final List<? extends asInterface> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public final int getExtensionCount() {
            return this.extension_.size();
        }

        public final FieldDescriptorProto getExtension(int i) {
            return (FieldDescriptorProto) this.extension_.get(i);
        }

        public final asInterface getExtensionOrBuilder(int i) {
            return (asInterface) this.extension_.get(i);
        }

        private void ensureExtensionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<FieldDescriptorProto> audioAttributesCompatParcelizer = this.extension_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            onLongPress.addAll(iterable, this.extension_);
        }

        /* access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        public final List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public final List<? extends onTransact> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        public final int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        public final DescriptorProto getNestedType(int i) {
            return (DescriptorProto) this.nestedType_.get(i);
        }

        public final onTransact getNestedTypeOrBuilder(int i) {
            return (onTransact) this.nestedType_.get(i);
        }

        private void ensureNestedTypeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<DescriptorProto> audioAttributesCompatParcelizer = this.nestedType_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.nestedType_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setNestedType(int i, DescriptorProto descriptorProto) {
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addNestedType(DescriptorProto descriptorProto) {
            ensureNestedTypeIsMutable();
            this.nestedType_.add(descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addNestedType(int i, DescriptorProto descriptorProto) {
            ensureNestedTypeIsMutable();
            this.nestedType_.add(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
            ensureNestedTypeIsMutable();
            onLongPress.addAll(iterable, this.nestedType_);
        }

        /* access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeNestedType(int i) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
        }

        public final List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public final List<? extends asBinder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public final int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public final EnumDescriptorProto getEnumType(int i) {
            return (EnumDescriptorProto) this.enumType_.get(i);
        }

        public final asBinder getEnumTypeOrBuilder(int i) {
            return (asBinder) this.enumType_.get(i);
        }

        private void ensureEnumTypeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<EnumDescriptorProto> audioAttributesCompatParcelizer = this.enumType_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            onLongPress.addAll(iterable, this.enumType_);
        }

        /* access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        public final List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public final List<? extends asInterface> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        public final int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        public final ExtensionRange getExtensionRange(int i) {
            return (ExtensionRange) this.extensionRange_.get(i);
        }

        public final asInterface getExtensionRangeOrBuilder(int i) {
            return (asInterface) this.extensionRange_.get(i);
        }

        private void ensureExtensionRangeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<ExtensionRange> audioAttributesCompatParcelizer = this.extensionRange_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.extensionRange_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setExtensionRange(int i, ExtensionRange extensionRange) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, extensionRange);
        }

        /* access modifiers changed from: private */
        public void addExtensionRange(ExtensionRange extensionRange) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(extensionRange);
        }

        /* access modifiers changed from: private */
        public void addExtensionRange(int i, ExtensionRange extensionRange) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(i, extensionRange);
        }

        /* access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            ensureExtensionRangeIsMutable();
            onLongPress.addAll(iterable, this.extensionRange_);
        }

        /* access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeExtensionRange(int i) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
        }

        public final List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public final List<? extends AudioAttributesImplApi21Parcelizer> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        public final int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        public final OneofDescriptorProto getOneofDecl(int i) {
            return (OneofDescriptorProto) this.oneofDecl_.get(i);
        }

        public final AudioAttributesImplApi21Parcelizer getOneofDeclOrBuilder(int i) {
            return (AudioAttributesImplApi21Parcelizer) this.oneofDecl_.get(i);
        }

        private void ensureOneofDeclIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<OneofDescriptorProto> audioAttributesCompatParcelizer = this.oneofDecl_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.oneofDecl_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(i, oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
            ensureOneofDeclIsMutable();
            onLongPress.addAll(iterable, this.oneofDecl_);
        }

        /* access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeOneofDecl(int i) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public final MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(MessageOptions messageOptions) {
            this.options_ = messageOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(MessageOptions messageOptions) {
            MessageOptions messageOptions2 = this.options_;
            if (messageOptions2 == null || messageOptions2 == MessageOptions.getDefaultInstance()) {
                this.options_ = messageOptions;
            } else {
                this.options_ = (MessageOptions) ((MessageOptions.read) MessageOptions.newBuilder(this.options_).mergeFrom(messageOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public final List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public final List<? extends RemoteActionCompatParcelizer> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        public final int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public final ReservedRange getReservedRange(int i) {
            return (ReservedRange) this.reservedRange_.get(i);
        }

        public final RemoteActionCompatParcelizer getReservedRangeOrBuilder(int i) {
            return (RemoteActionCompatParcelizer) this.reservedRange_.get(i);
        }

        private void ensureReservedRangeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<ReservedRange> audioAttributesCompatParcelizer = this.reservedRange_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setReservedRange(int i, ReservedRange reservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, reservedRange);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(ReservedRange reservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(reservedRange);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(int i, ReservedRange reservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, reservedRange);
        }

        /* access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            onLongPress.addAll(iterable, this.reservedRange_);
        }

        /* access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        public final List<String> getReservedNameList() {
            return this.reservedName_;
        }

        public final int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public final String getReservedName(int i) {
            return (String) this.reservedName_.get(i);
        }

        public final getBaseline getReservedNameBytes(int i) {
            return getBaseline.asBinder((String) this.reservedName_.get(i));
        }

        private void ensureReservedNameIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.reservedName_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addReservedName(String str) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            onLongPress.addAll(iterable, this.reservedName_);
        }

        /* access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addReservedNameBytes(getBaseline getbaseline) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static DescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static DescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (DescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static DescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static DescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(DescriptorProto descriptorProto) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(descriptorProto);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<DescriptorProto, asBinder> implements onTransact {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            Class<DescriptorProto> cls = DescriptorProto.class;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new DescriptorProto();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", cls, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<DescriptorProto> getanimationstyle = PARSER;
                    if (getanimationstyle == null) {
                        synchronized (cls) {
                            getanimationstyle = PARSER;
                            if (getanimationstyle == null) {
                                getanimationstyle = new GeneratedMessageLite.onTransact<>(DEFAULT_INSTANCE);
                                PARSER = getanimationstyle;
                            }
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            DescriptorProto descriptorProto = new DescriptorProto();
            DEFAULT_INSTANCE = descriptorProto;
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, descriptorProto);
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<DescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, onTransact> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final ExtensionRangeOptions DEFAULT_INSTANCE;
        private static volatile getAnimationStyle<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private ExtensionRangeOptions() {
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static ExtensionRangeOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static ExtensionRangeOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ExtensionRangeOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ExtensionRangeOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static ExtensionRangeOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(ExtensionRangeOptions extensionRangeOptions) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(extensionRangeOptions);
        }

        public static final class onTransact extends GeneratedMessageLite.read<ExtensionRangeOptions, onTransact> {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new ExtensionRangeOptions();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<ExtensionRangeOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (ExtensionRangeOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions();
            DEFAULT_INSTANCE = extensionRangeOptions;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, extensionRangeOptions);
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<ExtensionRangeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, asBinder> implements asInterface {
        /* access modifiers changed from: private */
        public static final FieldDescriptorProto DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile getAnimationStyle<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private String defaultValue_ = "";
        private String extendee_ = "";
        private String jsonName_ = "";
        private int label_ = 1;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private String typeName_ = "";
        private int type_ = 1;

        private FieldDescriptorProto() {
        }

        public enum onTransact implements measureNullChild.read {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);
            
            private final int MediaDescriptionCompat;

            static {
                new measureNullChild.asInterface<onTransact>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return onTransact.RemoteActionCompatParcelizer(i);
                    }
                };
            }

            public final int getNumber() {
                return this.MediaDescriptionCompat;
            }

            public static onTransact RemoteActionCompatParcelizer(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static measureNullChild.RemoteActionCompatParcelizer asBinder() {
                return asBinder.asInterface;
            }

            static final class asBinder implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer asInterface = null;

                private asBinder() {
                }

                static {
                    asInterface = new asBinder();
                }

                public final boolean isInRange(int i) {
                    return onTransact.RemoteActionCompatParcelizer(i) != null;
                }
            }

            private onTransact(int i) {
                this.MediaDescriptionCompat = i;
            }
        }

        public enum RemoteActionCompatParcelizer implements measureNullChild.read {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);
            
            private final int RemoteActionCompatParcelizer;

            static {
                new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return RemoteActionCompatParcelizer.asInterface(i);
                    }
                };
            }

            public final int getNumber() {
                return this.RemoteActionCompatParcelizer;
            }

            public static RemoteActionCompatParcelizer asInterface(int i) {
                if (i == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i == 2) {
                    return LABEL_REQUIRED;
                }
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static measureNullChild.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
                return asBinder.asBinder;
            }

            static final class asBinder implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer asBinder = null;

                private asBinder() {
                }

                static {
                    asBinder = new asBinder();
                }

                public final boolean isInRange(int i) {
                    return RemoteActionCompatParcelizer.asInterface(i) != null;
                }
            }

            private RemoteActionCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer = i;
            }
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public final int getNumber() {
            return this.number_;
        }

        /* access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        public final boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public final RemoteActionCompatParcelizer getLabel() {
            RemoteActionCompatParcelizer asInterface = RemoteActionCompatParcelizer.asInterface(this.label_);
            return asInterface == null ? RemoteActionCompatParcelizer.LABEL_OPTIONAL : asInterface;
        }

        /* access modifiers changed from: private */
        public void setLabel(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.label_ = remoteActionCompatParcelizer.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        public final boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        public final onTransact getType() {
            onTransact RemoteActionCompatParcelizer2 = onTransact.RemoteActionCompatParcelizer(this.type_);
            return RemoteActionCompatParcelizer2 == null ? onTransact.TYPE_DOUBLE : RemoteActionCompatParcelizer2;
        }

        /* access modifiers changed from: private */
        public void setType(onTransact ontransact) {
            this.type_ = ontransact.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        public final boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        public final String getTypeName() {
            return this.typeName_;
        }

        public final getBaseline getTypeNameBytes() {
            return getBaseline.asBinder(this.typeName_);
        }

        /* access modifiers changed from: private */
        public void setTypeName(String str) {
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* access modifiers changed from: private */
        public void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        /* access modifiers changed from: private */
        public void setTypeNameBytes(getBaseline getbaseline) {
            this.typeName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 16;
        }

        public final boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        public final String getExtendee() {
            return this.extendee_;
        }

        public final getBaseline getExtendeeBytes() {
            return getBaseline.asBinder(this.extendee_);
        }

        /* access modifiers changed from: private */
        public void setExtendee(String str) {
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* access modifiers changed from: private */
        public void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = getDefaultInstance().getExtendee();
        }

        /* access modifiers changed from: private */
        public void setExtendeeBytes(getBaseline getbaseline) {
            this.extendee_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 32;
        }

        public final boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        public final String getDefaultValue() {
            return this.defaultValue_;
        }

        public final getBaseline getDefaultValueBytes() {
            return getBaseline.asBinder(this.defaultValue_);
        }

        /* access modifiers changed from: private */
        public void setDefaultValue(String str) {
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* access modifiers changed from: private */
        public void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = getDefaultInstance().getDefaultValue();
        }

        /* access modifiers changed from: private */
        public void setDefaultValueBytes(getBaseline getbaseline) {
            this.defaultValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 64;
        }

        public final boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        public final int getOneofIndex() {
            return this.oneofIndex_;
        }

        /* access modifiers changed from: private */
        public void setOneofIndex(int i) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        public final boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        public final String getJsonName() {
            return this.jsonName_;
        }

        public final getBaseline getJsonNameBytes() {
            return getBaseline.asBinder(this.jsonName_);
        }

        /* access modifiers changed from: private */
        public void setJsonName(String str) {
            this.bitField0_ |= 256;
            this.jsonName_ = str;
        }

        /* access modifiers changed from: private */
        public void clearJsonName() {
            this.bitField0_ &= -257;
            this.jsonName_ = getDefaultInstance().getJsonName();
        }

        /* access modifiers changed from: private */
        public void setJsonNameBytes(getBaseline getbaseline) {
            this.jsonName_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 256;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        public final FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(FieldOptions fieldOptions) {
            this.options_ = fieldOptions;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(FieldOptions fieldOptions) {
            FieldOptions fieldOptions2 = this.options_;
            if (fieldOptions2 == null || fieldOptions2 == FieldOptions.getDefaultInstance()) {
                this.options_ = fieldOptions;
            } else {
                this.options_ = (FieldOptions) ((FieldOptions.onTransact) FieldOptions.newBuilder(this.options_).mergeFrom(fieldOptions)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        public final boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        public final boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        /* access modifiers changed from: private */
        public void setProto3Optional(boolean z) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z;
        }

        /* access modifiers changed from: private */
        public void clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FieldDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FieldDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FieldDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(fieldDescriptorProto);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<FieldDescriptorProto, asBinder> implements asInterface {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FieldDescriptorProto();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), "type_", onTransact.asBinder(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FieldDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FieldDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto();
            DEFAULT_INSTANCE = fieldDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, fieldDescriptorProto);
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FieldDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, asInterface> implements AudioAttributesImplApi21Parcelizer {
        /* access modifiers changed from: private */
        public static final OneofDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private OneofOptions options_;

        private OneofDescriptorProto() {
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public final OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(OneofOptions oneofOptions) {
            this.options_ = oneofOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(OneofOptions oneofOptions) {
            OneofOptions oneofOptions2 = this.options_;
            if (oneofOptions2 == null || oneofOptions2 == OneofOptions.getDefaultInstance()) {
                this.options_ = oneofOptions;
            } else {
                this.options_ = (OneofOptions) ((OneofOptions.RemoteActionCompatParcelizer) OneofOptions.newBuilder(this.options_).mergeFrom(oneofOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static OneofDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static OneofDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (OneofDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static OneofDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static OneofDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asInterface newBuilder() {
            return (asInterface) DEFAULT_INSTANCE.createBuilder();
        }

        public static asInterface newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return (asInterface) DEFAULT_INSTANCE.createBuilder(oneofDescriptorProto);
        }

        public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<OneofDescriptorProto, asInterface> implements AudioAttributesImplApi21Parcelizer {
            /* synthetic */ asInterface(byte b) {
                this();
            }

            private asInterface() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new OneofDescriptorProto();
                case 2:
                    return new asInterface((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<OneofDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (OneofDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto();
            DEFAULT_INSTANCE = oneofDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, oneofDescriptorProto);
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<OneofDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, onTransact> implements asBinder {
        /* access modifiers changed from: private */
        public static final EnumDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private EnumOptions options_;
        private measureNullChild.AudioAttributesCompatParcelizer<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<EnumReservedRange> reservedRange_ = emptyProtobufList();
        private measureNullChild.AudioAttributesCompatParcelizer<EnumValueDescriptorProto> value_ = emptyProtobufList();

        public interface read extends ListPopupWindow {
        }

        private EnumDescriptorProto() {
        }

        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, onTransact> implements read {
            /* access modifiers changed from: private */
            public static final EnumReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile getAnimationStyle<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            private EnumReservedRange() {
            }

            public final boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public final int getStart() {
                return this.start_;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public final boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public final int getEnd() {
                return this.end_;
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static EnumReservedRange parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static EnumReservedRange parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumReservedRange parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (EnumReservedRange) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static EnumReservedRange parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static EnumReservedRange parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static onTransact newBuilder() {
                return (onTransact) DEFAULT_INSTANCE.createBuilder();
            }

            public static onTransact newBuilder(EnumReservedRange enumReservedRange) {
                return (onTransact) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
            }

            public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<EnumReservedRange, onTransact> implements read {
                /* synthetic */ onTransact(byte b) {
                    this();
                }

                private onTransact() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new EnumReservedRange();
                    case 2:
                        return new onTransact((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<EnumReservedRange> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (EnumReservedRange.class) {
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
                EnumReservedRange enumReservedRange = new EnumReservedRange();
                DEFAULT_INSTANCE = enumReservedRange;
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
            }

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<EnumReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public final List<? extends read> getValueOrBuilderList() {
            return this.value_;
        }

        public final int getValueCount() {
            return this.value_.size();
        }

        public final EnumValueDescriptorProto getValue(int i) {
            return (EnumValueDescriptorProto) this.value_.get(i);
        }

        public final read getValueOrBuilder(int i) {
            return (read) this.value_.get(i);
        }

        private void ensureValueIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<EnumValueDescriptorProto> audioAttributesCompatParcelizer = this.value_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.value_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            ensureValueIsMutable();
            this.value_.set(i, enumValueDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
            ensureValueIsMutable();
            this.value_.add(enumValueDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            ensureValueIsMutable();
            this.value_.add(i, enumValueDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
            ensureValueIsMutable();
            onLongPress.addAll(iterable, this.value_);
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeValue(int i) {
            ensureValueIsMutable();
            this.value_.remove(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public final EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(EnumOptions enumOptions) {
            this.options_ = enumOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(EnumOptions enumOptions) {
            EnumOptions enumOptions2 = this.options_;
            if (enumOptions2 == null || enumOptions2 == EnumOptions.getDefaultInstance()) {
                this.options_ = enumOptions;
            } else {
                this.options_ = (EnumOptions) ((EnumOptions.asInterface) EnumOptions.newBuilder(this.options_).mergeFrom(enumOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public final List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public final List<? extends read> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        public final int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public final EnumReservedRange getReservedRange(int i) {
            return (EnumReservedRange) this.reservedRange_.get(i);
        }

        public final read getReservedRangeOrBuilder(int i) {
            return (read) this.reservedRange_.get(i);
        }

        private void ensureReservedRangeIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<EnumReservedRange> audioAttributesCompatParcelizer = this.reservedRange_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setReservedRange(int i, EnumReservedRange enumReservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(EnumReservedRange enumReservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(int i, EnumReservedRange enumReservedRange) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            onLongPress.addAll(iterable, this.reservedRange_);
        }

        /* access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        public final List<String> getReservedNameList() {
            return this.reservedName_;
        }

        public final int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public final String getReservedName(int i) {
            return (String) this.reservedName_.get(i);
        }

        public final getBaseline getReservedNameBytes(int i) {
            return getBaseline.asBinder((String) this.reservedName_.get(i));
        }

        private void ensureReservedNameIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.reservedName_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void addReservedName(String str) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            onLongPress.addAll(iterable, this.reservedName_);
        }

        /* access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addReservedNameBytes(getBaseline getbaseline) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static EnumDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static EnumDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static EnumDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(enumDescriptorProto);
        }

        public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<EnumDescriptorProto, onTransact> implements asBinder {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new EnumDescriptorProto();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<EnumDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (EnumDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto();
            DEFAULT_INSTANCE = enumDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, enumDescriptorProto);
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<EnumDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, read> implements read {
        /* access modifiers changed from: private */
        public static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private EnumValueOptions options_;

        private EnumValueDescriptorProto() {
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public final int getNumber() {
            return this.number_;
        }

        /* access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public final EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(EnumValueOptions enumValueOptions) {
            this.options_ = enumValueOptions;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(EnumValueOptions enumValueOptions) {
            EnumValueOptions enumValueOptions2 = this.options_;
            if (enumValueOptions2 == null || enumValueOptions2 == EnumValueOptions.getDefaultInstance()) {
                this.options_ = enumValueOptions;
            } else {
                this.options_ = (EnumValueOptions) ((EnumValueOptions.asBinder) EnumValueOptions.newBuilder(this.options_).mergeFrom(enumValueOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static EnumValueDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static EnumValueDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumValueDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static EnumValueDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return (read) DEFAULT_INSTANCE.createBuilder(enumValueDescriptorProto);
        }

        public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<EnumValueDescriptorProto, read> implements read {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new EnumValueDescriptorProto();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<EnumValueDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (EnumValueDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto();
            DEFAULT_INSTANCE = enumValueDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, enumValueDescriptorProto);
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<EnumValueDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, RemoteActionCompatParcelizer> implements AudioAttributesImplApi26Parcelizer {
        /* access modifiers changed from: private */
        public static final ServiceDescriptorProto DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<MethodDescriptorProto> method_ = emptyProtobufList();
        private String name_ = "";
        private ServiceOptions options_;

        private ServiceDescriptorProto() {
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public final List<? extends IconCompatParcelizer> getMethodOrBuilderList() {
            return this.method_;
        }

        public final int getMethodCount() {
            return this.method_.size();
        }

        public final MethodDescriptorProto getMethod(int i) {
            return (MethodDescriptorProto) this.method_.get(i);
        }

        public final IconCompatParcelizer getMethodOrBuilder(int i) {
            return (IconCompatParcelizer) this.method_.get(i);
        }

        private void ensureMethodIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<MethodDescriptorProto> audioAttributesCompatParcelizer = this.method_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.method_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            ensureMethodIsMutable();
            this.method_.set(i, methodDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMethod(MethodDescriptorProto methodDescriptorProto) {
            ensureMethodIsMutable();
            this.method_.add(methodDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            ensureMethodIsMutable();
            this.method_.add(i, methodDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
            ensureMethodIsMutable();
            onLongPress.addAll(iterable, this.method_);
        }

        /* access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeMethod(int i) {
            ensureMethodIsMutable();
            this.method_.remove(i);
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public final ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(ServiceOptions serviceOptions) {
            this.options_ = serviceOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(ServiceOptions serviceOptions) {
            ServiceOptions serviceOptions2 = this.options_;
            if (serviceOptions2 == null || serviceOptions2 == ServiceOptions.getDefaultInstance()) {
                this.options_ = serviceOptions;
            } else {
                this.options_ = (ServiceOptions) ((ServiceOptions.RemoteActionCompatParcelizer) ServiceOptions.newBuilder(this.options_).mergeFrom(serviceOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static ServiceDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static ServiceDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ServiceDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static ServiceDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(serviceDescriptorProto);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<ServiceDescriptorProto, RemoteActionCompatParcelizer> implements AudioAttributesImplApi26Parcelizer {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new ServiceDescriptorProto();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<ServiceDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (ServiceDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto();
            DEFAULT_INSTANCE = serviceDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, serviceDescriptorProto);
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<ServiceDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, asBinder> implements IconCompatParcelizer {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final MethodDescriptorProto DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private String inputType_ = "";
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private MethodOptions options_;
        private String outputType_ = "";
        private boolean serverStreaming_;

        private MethodDescriptorProto() {
        }

        public final boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getName() {
            return this.name_;
        }

        public final getBaseline getNameBytes() {
            return getBaseline.asBinder(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(getBaseline getbaseline) {
            this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        public final String getInputType() {
            return this.inputType_;
        }

        public final getBaseline getInputTypeBytes() {
            return getBaseline.asBinder(this.inputType_);
        }

        /* access modifiers changed from: private */
        public void setInputType(String str) {
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* access modifiers changed from: private */
        public void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* access modifiers changed from: private */
        public void setInputTypeBytes(getBaseline getbaseline) {
            this.inputType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 2;
        }

        public final boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        public final String getOutputType() {
            return this.outputType_;
        }

        public final getBaseline getOutputTypeBytes() {
            return getBaseline.asBinder(this.outputType_);
        }

        /* access modifiers changed from: private */
        public void setOutputType(String str) {
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* access modifiers changed from: private */
        public void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* access modifiers changed from: private */
        public void setOutputTypeBytes(getBaseline getbaseline) {
            this.outputType_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 4;
        }

        public final boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        public final MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        /* access modifiers changed from: private */
        public void setOptions(MethodOptions methodOptions) {
            this.options_ = methodOptions;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(MethodOptions methodOptions) {
            MethodOptions methodOptions2 = this.options_;
            if (methodOptions2 == null || methodOptions2 == MethodOptions.getDefaultInstance()) {
                this.options_ = methodOptions;
            } else {
                this.options_ = (MethodOptions) ((MethodOptions.asBinder) MethodOptions.newBuilder(this.options_).mergeFrom(methodOptions)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        public final boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        /* access modifiers changed from: private */
        public void setClientStreaming(boolean z) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z;
        }

        /* access modifiers changed from: private */
        public void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        public final boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        /* access modifiers changed from: private */
        public void setServerStreaming(boolean z) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z;
        }

        /* access modifiers changed from: private */
        public void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static MethodDescriptorProto parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static MethodDescriptorProto parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MethodDescriptorProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MethodDescriptorProto parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static MethodDescriptorProto parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(methodDescriptorProto);
        }

        public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<MethodDescriptorProto, asBinder> implements IconCompatParcelizer {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new MethodDescriptorProto();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<MethodDescriptorProto> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (MethodDescriptorProto.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto();
            DEFAULT_INSTANCE = methodDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, methodDescriptorProto);
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<MethodDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, asBinder> implements layoutHorizontal {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        /* access modifiers changed from: private */
        public static final FileOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile getAnimationStyle<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccEnableArenas_ = true;
        private boolean ccGenericServices_;
        private String csharpNamespace_ = "";
        private boolean deprecated_;
        private String goPackage_ = "";
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private String javaOuterClassname_ = "";
        private String javaPackage_ = "";
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized = 2;
        private String objcClassPrefix_ = "";
        private int optimizeFor_ = 1;
        private String phpClassPrefix_ = "";
        private boolean phpGenericServices_;
        private String phpMetadataNamespace_ = "";
        private String phpNamespace_ = "";
        private boolean pyGenericServices_;
        private String rubyPackage_ = "";
        private String swiftPrefix_ = "";
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private FileOptions() {
        }

        public enum RemoteActionCompatParcelizer implements measureNullChild.read {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);
            
            private final int RemoteActionCompatParcelizer;

            static {
                new measureNullChild.asInterface<RemoteActionCompatParcelizer>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
                    }
                };
            }

            public final int getNumber() {
                return this.RemoteActionCompatParcelizer;
            }

            public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
                if (i == 1) {
                    return SPEED;
                }
                if (i == 2) {
                    return CODE_SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static measureNullChild.RemoteActionCompatParcelizer read() {
                return asInterface.asBinder;
            }

            static final class asInterface implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer asBinder = null;

                private asInterface() {
                }

                static {
                    asBinder = new asInterface();
                }

                public final boolean isInRange(int i) {
                    return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i) != null;
                }
            }

            private RemoteActionCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer = i;
            }
        }

        public final boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getJavaPackage() {
            return this.javaPackage_;
        }

        public final getBaseline getJavaPackageBytes() {
            return getBaseline.asBinder(this.javaPackage_);
        }

        /* access modifiers changed from: private */
        public void setJavaPackage(String str) {
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = getDefaultInstance().getJavaPackage();
        }

        /* access modifiers changed from: private */
        public void setJavaPackageBytes(getBaseline getbaseline) {
            this.javaPackage_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        public final String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        public final getBaseline getJavaOuterClassnameBytes() {
            return getBaseline.asBinder(this.javaOuterClassname_);
        }

        /* access modifiers changed from: private */
        public void setJavaOuterClassname(String str) {
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* access modifiers changed from: private */
        public void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
        }

        /* access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(getBaseline getbaseline) {
            this.javaOuterClassname_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 2;
        }

        public final boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        /* access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean z) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z;
        }

        /* access modifiers changed from: private */
        public void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        @Deprecated
        public final boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Deprecated
        public final boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        /* access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean z) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z;
        }

        /* access modifiers changed from: private */
        public void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        public final boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        /* access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean z) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z;
        }

        /* access modifiers changed from: private */
        public void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        public final boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        public final RemoteActionCompatParcelizer getOptimizeFor() {
            RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.optimizeFor_);
            return RemoteActionCompatParcelizer2 == null ? RemoteActionCompatParcelizer.SPEED : RemoteActionCompatParcelizer2;
        }

        /* access modifiers changed from: private */
        public void setOptimizeFor(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.optimizeFor_ = remoteActionCompatParcelizer.getNumber();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        public final boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        public final String getGoPackage() {
            return this.goPackage_;
        }

        public final getBaseline getGoPackageBytes() {
            return getBaseline.asBinder(this.goPackage_);
        }

        /* access modifiers changed from: private */
        public void setGoPackage(String str) {
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = getDefaultInstance().getGoPackage();
        }

        /* access modifiers changed from: private */
        public void setGoPackageBytes(getBaseline getbaseline) {
            this.goPackage_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 64;
        }

        public final boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        /* access modifiers changed from: private */
        public void setCcGenericServices(boolean z) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        public final boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        /* access modifiers changed from: private */
        public void setJavaGenericServices(boolean z) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        public final boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        public final boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        /* access modifiers changed from: private */
        public void setPyGenericServices(boolean z) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        public final boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        public final boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        /* access modifiers changed from: private */
        public void setPhpGenericServices(boolean z) {
            this.bitField0_ |= 1024;
            this.phpGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void clearPhpGenericServices() {
            this.bitField0_ &= -1025;
            this.phpGenericServices_ = false;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2048;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2049;
            this.deprecated_ = false;
        }

        public final boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        public final boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        /* access modifiers changed from: private */
        public void setCcEnableArenas(boolean z) {
            this.bitField0_ |= 4096;
            this.ccEnableArenas_ = z;
        }

        /* access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -4097;
            this.ccEnableArenas_ = true;
        }

        public final boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 8192) != 0;
        }

        public final String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        public final getBaseline getObjcClassPrefixBytes() {
            return getBaseline.asBinder(this.objcClassPrefix_);
        }

        /* access modifiers changed from: private */
        public void setObjcClassPrefix(String str) {
            this.bitField0_ |= 8192;
            this.objcClassPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void clearObjcClassPrefix() {
            this.bitField0_ &= -8193;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* access modifiers changed from: private */
        public void setObjcClassPrefixBytes(getBaseline getbaseline) {
            this.objcClassPrefix_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 8192;
        }

        public final boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        public final String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        public final getBaseline getCsharpNamespaceBytes() {
            return getBaseline.asBinder(this.csharpNamespace_);
        }

        /* access modifiers changed from: private */
        public void setCsharpNamespace(String str) {
            this.bitField0_ |= 16384;
            this.csharpNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -16385;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* access modifiers changed from: private */
        public void setCsharpNamespaceBytes(getBaseline getbaseline) {
            this.csharpNamespace_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 16384;
        }

        public final boolean hasSwiftPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        public final String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        public final getBaseline getSwiftPrefixBytes() {
            return getBaseline.asBinder(this.swiftPrefix_);
        }

        /* access modifiers changed from: private */
        public void setSwiftPrefix(String str) {
            this.bitField0_ |= 32768;
            this.swiftPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -32769;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* access modifiers changed from: private */
        public void setSwiftPrefixBytes(getBaseline getbaseline) {
            this.swiftPrefix_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 32768;
        }

        public final boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 65536) != 0;
        }

        public final String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        public final getBaseline getPhpClassPrefixBytes() {
            return getBaseline.asBinder(this.phpClassPrefix_);
        }

        /* access modifiers changed from: private */
        public void setPhpClassPrefix(String str) {
            this.bitField0_ |= 65536;
            this.phpClassPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -65537;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* access modifiers changed from: private */
        public void setPhpClassPrefixBytes(getBaseline getbaseline) {
            this.phpClassPrefix_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 65536;
        }

        public final boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        public final String getPhpNamespace() {
            return this.phpNamespace_;
        }

        public final getBaseline getPhpNamespaceBytes() {
            return getBaseline.asBinder(this.phpNamespace_);
        }

        /* access modifiers changed from: private */
        public void setPhpNamespace(String str) {
            this.bitField0_ |= 131072;
            this.phpNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -131073;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* access modifiers changed from: private */
        public void setPhpNamespaceBytes(getBaseline getbaseline) {
            this.phpNamespace_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 131072;
        }

        public final boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        public final String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        public final getBaseline getPhpMetadataNamespaceBytes() {
            return getBaseline.asBinder(this.phpMetadataNamespace_);
        }

        /* access modifiers changed from: private */
        public void setPhpMetadataNamespace(String str) {
            this.bitField0_ |= 262144;
            this.phpMetadataNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -262145;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(getBaseline getbaseline) {
            this.phpMetadataNamespace_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 262144;
        }

        public final boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        public final String getRubyPackage() {
            return this.rubyPackage_;
        }

        public final getBaseline getRubyPackageBytes() {
            return getBaseline.asBinder(this.rubyPackage_);
        }

        /* access modifiers changed from: private */
        public void setRubyPackage(String str) {
            this.bitField0_ |= 524288;
            this.rubyPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -524289;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* access modifiers changed from: private */
        public void setRubyPackageBytes(getBaseline getbaseline) {
            this.rubyPackage_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 524288;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FileOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FileOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FileOptions parseFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FileOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FileOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FileOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(FileOptions fileOptions) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(fileOptions);
        }

        public static final class asBinder extends GeneratedMessageLite.read<FileOptions, asBinder> {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(FileOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FileOptions();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", RemoteActionCompatParcelizer.read(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FileOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FileOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FileOptions fileOptions = new FileOptions();
            DEFAULT_INSTANCE = fileOptions;
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, fileOptions);
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FileOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, read> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final MessageOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized = 2;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private MessageOptions() {
        }

        public final boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        /* access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean z) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z;
        }

        /* access modifiers changed from: private */
        public void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        public final boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        /* access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean z) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z;
        }

        /* access modifiers changed from: private */
        public void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 4;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        public final boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean getMapEntry() {
            return this.mapEntry_;
        }

        /* access modifiers changed from: private */
        public void setMapEntry(boolean z) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z;
        }

        /* access modifiers changed from: private */
        public void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static MessageOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static MessageOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MessageOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static MessageOptions parseFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MessageOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MessageOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static MessageOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static read newBuilder() {
            return (read) DEFAULT_INSTANCE.createBuilder();
        }

        public static read newBuilder(MessageOptions messageOptions) {
            return (read) DEFAULT_INSTANCE.createBuilder(messageOptions);
        }

        public static final class read extends GeneratedMessageLite.read<MessageOptions, read> {
            /* synthetic */ read(byte b) {
                this();
            }

            private read() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new MessageOptions();
                case 2:
                    return new read((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<MessageOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (MessageOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MessageOptions messageOptions = new MessageOptions();
            DEFAULT_INSTANCE = messageOptions;
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, messageOptions);
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<MessageOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, onTransact> implements layoutHorizontal {
        public static final int CTYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FieldOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile getAnimationStyle<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized = 2;
        private boolean packed_;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();
        private boolean weak_;

        private FieldOptions() {
        }

        public enum asBinder implements measureNullChild.read {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);
            
            private final int RemoteActionCompatParcelizer;

            static {
                new measureNullChild.asInterface<asBinder>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return asBinder.onTransact(i);
                    }
                };
            }

            public final int getNumber() {
                return this.RemoteActionCompatParcelizer;
            }

            public static asBinder onTransact(int i) {
                if (i == 0) {
                    return STRING;
                }
                if (i == 1) {
                    return CORD;
                }
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static measureNullChild.RemoteActionCompatParcelizer read() {
                return RemoteActionCompatParcelizer.asInterface;
            }

            static final class RemoteActionCompatParcelizer implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer asInterface = null;

                private RemoteActionCompatParcelizer() {
                }

                static {
                    asInterface = new RemoteActionCompatParcelizer();
                }

                public final boolean isInRange(int i) {
                    return asBinder.onTransact(i) != null;
                }
            }

            private asBinder(int i) {
                this.RemoteActionCompatParcelizer = i;
            }
        }

        public enum asInterface implements measureNullChild.read {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);
            
            private final int asBinder;

            static {
                new measureNullChild.asInterface<asInterface>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return asInterface.asBinder(i);
                    }
                };
            }

            public final int getNumber() {
                return this.asBinder;
            }

            public static asInterface asBinder(int i) {
                if (i == 0) {
                    return JS_NORMAL;
                }
                if (i == 1) {
                    return JS_STRING;
                }
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static measureNullChild.RemoteActionCompatParcelizer onTransact() {
                return C0023asInterface.RemoteActionCompatParcelizer;
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$asInterface$asInterface  reason: collision with other inner class name */
            static final class C0023asInterface implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = null;

                private C0023asInterface() {
                }

                static {
                    RemoteActionCompatParcelizer = new C0023asInterface();
                }

                public final boolean isInRange(int i) {
                    return asInterface.asBinder(i) != null;
                }
            }

            private asInterface(int i) {
                this.asBinder = i;
            }
        }

        public final boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        public final asBinder getCtype() {
            asBinder onTransact2 = asBinder.onTransact(this.ctype_);
            return onTransact2 == null ? asBinder.STRING : onTransact2;
        }

        /* access modifiers changed from: private */
        public void setCtype(asBinder asbinder) {
            this.ctype_ = asbinder.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        public final boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean getPacked() {
            return this.packed_;
        }

        /* access modifiers changed from: private */
        public void setPacked(boolean z) {
            this.bitField0_ |= 2;
            this.packed_ = z;
        }

        /* access modifiers changed from: private */
        public void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        public final boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        public final asInterface getJstype() {
            asInterface asBinder2 = asInterface.asBinder(this.jstype_);
            return asBinder2 == null ? asInterface.JS_NORMAL : asBinder2;
        }

        /* access modifiers changed from: private */
        public void setJstype(asInterface asinterface) {
            this.jstype_ = asinterface.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        public final boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean getLazy() {
            return this.lazy_;
        }

        /* access modifiers changed from: private */
        public void setLazy(boolean z) {
            this.bitField0_ |= 8;
            this.lazy_ = z;
        }

        /* access modifiers changed from: private */
        public void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 16;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        public final boolean hasWeak() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean getWeak() {
            return this.weak_;
        }

        /* access modifiers changed from: private */
        public void setWeak(boolean z) {
            this.bitField0_ |= 32;
            this.weak_ = z;
        }

        /* access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static FieldOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static FieldOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static FieldOptions parseFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (FieldOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static FieldOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static FieldOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(FieldOptions fieldOptions) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(fieldOptions);
        }

        public static final class onTransact extends GeneratedMessageLite.read<FieldOptions, onTransact> {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new FieldOptions();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", asBinder.read(), "packed_", "deprecated_", "lazy_", "jstype_", asInterface.onTransact(), "weak_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<FieldOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (FieldOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            FieldOptions fieldOptions = new FieldOptions();
            DEFAULT_INSTANCE = fieldOptions;
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, fieldOptions);
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<FieldOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final OneofOptions DEFAULT_INSTANCE;
        private static volatile getAnimationStyle<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private OneofOptions() {
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static OneofOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static OneofOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static OneofOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static OneofOptions parseFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (OneofOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static OneofOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static OneofOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(OneofOptions oneofOptions) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(oneofOptions);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.read<OneofOptions, RemoteActionCompatParcelizer> {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new OneofOptions();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<OneofOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (OneofOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            OneofOptions oneofOptions = new OneofOptions();
            DEFAULT_INSTANCE = oneofOptions;
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, oneofOptions);
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<OneofOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, asInterface> implements layoutHorizontal {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final EnumOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile getAnimationStyle<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private EnumOptions() {
        }

        public final boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean getAllowAlias() {
            return this.allowAlias_;
        }

        /* access modifiers changed from: private */
        public void setAllowAlias(boolean z) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z;
        }

        /* access modifiers changed from: private */
        public void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static EnumOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static EnumOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static EnumOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static EnumOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asInterface newBuilder() {
            return (asInterface) DEFAULT_INSTANCE.createBuilder();
        }

        public static asInterface newBuilder(EnumOptions enumOptions) {
            return (asInterface) DEFAULT_INSTANCE.createBuilder(enumOptions);
        }

        public static final class asInterface extends GeneratedMessageLite.read<EnumOptions, asInterface> {
            /* synthetic */ asInterface(byte b) {
                this();
            }

            private asInterface() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new EnumOptions();
                case 2:
                    return new asInterface((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<EnumOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (EnumOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EnumOptions enumOptions = new EnumOptions();
            DEFAULT_INSTANCE = enumOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, enumOptions);
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<EnumOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, asBinder> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final EnumValueOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private EnumValueOptions() {
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static EnumValueOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static EnumValueOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static EnumValueOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static EnumValueOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(EnumValueOptions enumValueOptions) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(enumValueOptions);
        }

        public static final class asBinder extends GeneratedMessageLite.read<EnumValueOptions, asBinder> {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new EnumValueOptions();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<EnumValueOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (EnumValueOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            EnumValueOptions enumValueOptions = new EnumValueOptions();
            DEFAULT_INSTANCE = enumValueOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, enumValueOptions);
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<EnumValueOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, RemoteActionCompatParcelizer> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final ServiceOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile getAnimationStyle<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private ServiceOptions() {
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static ServiceOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static ServiceOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static ServiceOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static ServiceOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static ServiceOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(ServiceOptions serviceOptions) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(serviceOptions);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.read<ServiceOptions, RemoteActionCompatParcelizer> {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new ServiceOptions();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<ServiceOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (ServiceOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ServiceOptions serviceOptions = new ServiceOptions();
            DEFAULT_INSTANCE = serviceOptions;
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, serviceOptions);
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<ServiceOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, asBinder> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final MethodOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile getAnimationStyle<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> uninterpretedOption_ = emptyProtobufList();

        private MethodOptions() {
        }

        public enum asInterface implements measureNullChild.read {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);
            
            private final int asInterface;

            static {
                new measureNullChild.asInterface<asInterface>() {
                    public final /* synthetic */ measureNullChild.read findValueByNumber(int i) {
                        return asInterface.asInterface(i);
                    }
                };
            }

            public final int getNumber() {
                return this.asInterface;
            }

            public static asInterface asInterface(int i) {
                if (i == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static measureNullChild.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
                return RemoteActionCompatParcelizer.read;
            }

            static final class RemoteActionCompatParcelizer implements measureNullChild.RemoteActionCompatParcelizer {
                static final measureNullChild.RemoteActionCompatParcelizer read = null;

                private RemoteActionCompatParcelizer() {
                }

                static {
                    read = new RemoteActionCompatParcelizer();
                }

                public final boolean isInRange(int i) {
                    return asInterface.asInterface(i) != null;
                }
            }

            private asInterface(int i) {
                this.asInterface = i;
            }
        }

        public final boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean getDeprecated() {
            return this.deprecated_;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        public final boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        public final asInterface getIdempotencyLevel() {
            asInterface asInterface2 = asInterface.asInterface(this.idempotencyLevel_);
            return asInterface2 == null ? asInterface.IDEMPOTENCY_UNKNOWN : asInterface2;
        }

        /* access modifiers changed from: private */
        public void setIdempotencyLevel(asInterface asinterface) {
            this.idempotencyLevel_ = asinterface.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        public final List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public final List<? extends write> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public final int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public final UninterpretedOption getUninterpretedOption(int i) {
            return (UninterpretedOption) this.uninterpretedOption_.get(i);
        }

        public final write getUninterpretedOptionOrBuilder(int i) {
            return (write) this.uninterpretedOption_.get(i);
        }

        private void ensureUninterpretedOptionIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<UninterpretedOption> audioAttributesCompatParcelizer = this.uninterpretedOption_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            onLongPress.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static MethodOptions parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static MethodOptions parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodOptions parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static MethodOptions parseFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (MethodOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static MethodOptions parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static MethodOptions parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asBinder newBuilder() {
            return (asBinder) DEFAULT_INSTANCE.createBuilder();
        }

        public static asBinder newBuilder(MethodOptions methodOptions) {
            return (asBinder) DEFAULT_INSTANCE.createBuilder(methodOptions);
        }

        public static final class asBinder extends GeneratedMessageLite.read<MethodOptions, asBinder> {
            /* synthetic */ asBinder(byte b) {
                this();
            }

            private asBinder() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new MethodOptions();
                case 2:
                    return new asBinder((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", asInterface.RemoteActionCompatParcelizer(), "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<MethodOptions> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (MethodOptions.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            MethodOptions methodOptions = new MethodOptions();
            DEFAULT_INSTANCE = methodOptions;
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, methodOptions);
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<MethodOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, RemoteActionCompatParcelizer> implements write {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final UninterpretedOption DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile getAnimationStyle<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private String aggregateValue_ = "";
        private int bitField0_;
        private double doubleValue_;
        private String identifierValue_ = "";
        private byte memoizedIsInitialized = 2;
        private measureNullChild.AudioAttributesCompatParcelizer<NamePart> name_ = emptyProtobufList();
        private long negativeIntValue_;
        private long positiveIntValue_;
        private getBaseline stringValue_ = getBaseline.RemoteActionCompatParcelizer;

        public interface asInterface extends ListPopupWindow {
        }

        private UninterpretedOption() {
        }

        public static final class NamePart extends GeneratedMessageLite<NamePart, onTransact> implements asInterface {
            /* access modifiers changed from: private */
            public static final NamePart DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile getAnimationStyle<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            private NamePart() {
            }

            public final boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            public final String getNamePart() {
                return this.namePart_;
            }

            public final getBaseline getNamePartBytes() {
                return getBaseline.asBinder(this.namePart_);
            }

            /* access modifiers changed from: private */
            public void setNamePart(String str) {
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* access modifiers changed from: private */
            public void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = getDefaultInstance().getNamePart();
            }

            /* access modifiers changed from: private */
            public void setNamePartBytes(getBaseline getbaseline) {
                this.namePart_ = getbaseline.AudioAttributesImplApi26Parcelizer();
                this.bitField0_ |= 1;
            }

            public final boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean getIsExtension() {
                return this.isExtension_;
            }

            /* access modifiers changed from: private */
            public void setIsExtension(boolean z) {
                this.bitField0_ |= 2;
                this.isExtension_ = z;
            }

            /* access modifiers changed from: private */
            public void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static NamePart parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static NamePart parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NamePart parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static NamePart parseFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NamePart) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (NamePart) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static NamePart parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static NamePart parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static onTransact newBuilder() {
                return (onTransact) DEFAULT_INSTANCE.createBuilder();
            }

            public static onTransact newBuilder(NamePart namePart) {
                return (onTransact) DEFAULT_INSTANCE.createBuilder(namePart);
            }

            public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<NamePart, onTransact> implements asInterface {
                /* synthetic */ onTransact(byte b) {
                    this();
                }

                private onTransact() {
                    super(NamePart.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                int i = 1;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new NamePart();
                    case 2:
                        return new onTransact((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<NamePart> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (NamePart.class) {
                            getanimationstyle = PARSER;
                            if (getanimationstyle == null) {
                                getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                                PARSER = getanimationstyle;
                            }
                        }
                        return getanimationstyle;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                NamePart namePart = new NamePart();
                DEFAULT_INSTANCE = namePart;
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<NamePart> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public final List<NamePart> getNameList() {
            return this.name_;
        }

        public final List<? extends asInterface> getNameOrBuilderList() {
            return this.name_;
        }

        public final int getNameCount() {
            return this.name_.size();
        }

        public final NamePart getName(int i) {
            return (NamePart) this.name_.get(i);
        }

        public final asInterface getNameOrBuilder(int i) {
            return (asInterface) this.name_.get(i);
        }

        private void ensureNameIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<NamePart> audioAttributesCompatParcelizer = this.name_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.name_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setName(int i, NamePart namePart) {
            ensureNameIsMutable();
            this.name_.set(i, namePart);
        }

        /* access modifiers changed from: private */
        public void addName(NamePart namePart) {
            ensureNameIsMutable();
            this.name_.add(namePart);
        }

        /* access modifiers changed from: private */
        public void addName(int i, NamePart namePart) {
            ensureNameIsMutable();
            this.name_.add(i, namePart);
        }

        /* access modifiers changed from: private */
        public void addAllName(Iterable<? extends NamePart> iterable) {
            ensureNameIsMutable();
            onLongPress.addAll(iterable, this.name_);
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeName(int i) {
            ensureNameIsMutable();
            this.name_.remove(i);
        }

        public final boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        public final String getIdentifierValue() {
            return this.identifierValue_;
        }

        public final getBaseline getIdentifierValueBytes() {
            return getBaseline.asBinder(this.identifierValue_);
        }

        /* access modifiers changed from: private */
        public void setIdentifierValue(String str) {
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* access modifiers changed from: private */
        public void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = getDefaultInstance().getIdentifierValue();
        }

        /* access modifiers changed from: private */
        public void setIdentifierValueBytes(getBaseline getbaseline) {
            this.identifierValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 1;
        }

        public final boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public final long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        /* access modifiers changed from: private */
        public void setPositiveIntValue(long j) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j;
        }

        /* access modifiers changed from: private */
        public void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0;
        }

        public final boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public final long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        /* access modifiers changed from: private */
        public void setNegativeIntValue(long j) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j;
        }

        /* access modifiers changed from: private */
        public void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0;
        }

        public final boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        public final double getDoubleValue() {
            return this.doubleValue_;
        }

        /* access modifiers changed from: private */
        public void setDoubleValue(double d) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d;
        }

        /* access modifiers changed from: private */
        public void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        public final boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        public final getBaseline getStringValue() {
            return this.stringValue_;
        }

        /* access modifiers changed from: private */
        public void setStringValue(getBaseline getbaseline) {
            this.bitField0_ |= 16;
            this.stringValue_ = getbaseline;
        }

        /* access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        public final boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        public final String getAggregateValue() {
            return this.aggregateValue_;
        }

        public final getBaseline getAggregateValueBytes() {
            return getBaseline.asBinder(this.aggregateValue_);
        }

        /* access modifiers changed from: private */
        public void setAggregateValue(String str) {
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* access modifiers changed from: private */
        public void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = getDefaultInstance().getAggregateValue();
        }

        /* access modifiers changed from: private */
        public void setAggregateValueBytes(getBaseline getbaseline) {
            this.aggregateValue_ = getbaseline.AudioAttributesImplApi26Parcelizer();
            this.bitField0_ |= 32;
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static UninterpretedOption parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static UninterpretedOption parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (UninterpretedOption) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static UninterpretedOption parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static UninterpretedOption parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static RemoteActionCompatParcelizer newBuilder() {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoteActionCompatParcelizer newBuilder(UninterpretedOption uninterpretedOption) {
            return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(uninterpretedOption);
        }

        public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<UninterpretedOption, RemoteActionCompatParcelizer> implements write {
            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            private RemoteActionCompatParcelizer() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            int i = 1;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new UninterpretedOption();
                case 2:
                    return new RemoteActionCompatParcelizer((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<UninterpretedOption> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (UninterpretedOption.class) {
                        getanimationstyle = PARSER;
                        if (getanimationstyle == null) {
                            getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                            PARSER = getanimationstyle;
                        }
                    }
                    return getanimationstyle;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            UninterpretedOption uninterpretedOption = new UninterpretedOption();
            DEFAULT_INSTANCE = uninterpretedOption;
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, uninterpretedOption);
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<UninterpretedOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class SourceCodeInfo extends GeneratedMessageLite<SourceCodeInfo, onTransact> implements layoutHorizontal {
        /* access modifiers changed from: private */
        public static final SourceCodeInfo DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile getAnimationStyle<SourceCodeInfo> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<Location> location_ = emptyProtobufList();

        public interface asBinder extends ListPopupWindow {
        }

        private SourceCodeInfo() {
        }

        public static final class Location extends GeneratedMessageLite<Location, asBinder> implements asBinder {
            /* access modifiers changed from: private */
            public static final Location DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile getAnimationStyle<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String leadingComments_ = "";
            private measureNullChild.AudioAttributesCompatParcelizer<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            private int pathMemoizedSerializedSize = -1;
            private measureNullChild.IconCompatParcelizer path_ = emptyIntList();
            private int spanMemoizedSerializedSize = -1;
            private measureNullChild.IconCompatParcelizer span_ = emptyIntList();
            private String trailingComments_ = "";

            private Location() {
            }

            public final List<Integer> getPathList() {
                return this.path_;
            }

            public final int getPathCount() {
                return this.path_.size();
            }

            public final int getPath(int i) {
                return this.path_.asBinder(i);
            }

            private void ensurePathIsMutable() {
                measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.path_;
                if (!iconCompatParcelizer.onTransact()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
                }
            }

            /* access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.RemoteActionCompatParcelizer(i, i2);
            }

            /* access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.asInterface(i);
            }

            /* access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                onLongPress.addAll(iterable, this.path_);
            }

            /* access modifiers changed from: private */
            public void clearPath() {
                this.path_ = emptyIntList();
            }

            public final List<Integer> getSpanList() {
                return this.span_;
            }

            public final int getSpanCount() {
                return this.span_.size();
            }

            public final int getSpan(int i) {
                return this.span_.asBinder(i);
            }

            private void ensureSpanIsMutable() {
                measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.span_;
                if (!iconCompatParcelizer.onTransact()) {
                    this.span_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
                }
            }

            /* access modifiers changed from: private */
            public void setSpan(int i, int i2) {
                ensureSpanIsMutable();
                this.span_.RemoteActionCompatParcelizer(i, i2);
            }

            /* access modifiers changed from: private */
            public void addSpan(int i) {
                ensureSpanIsMutable();
                this.span_.asInterface(i);
            }

            /* access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                onLongPress.addAll(iterable, this.span_);
            }

            /* access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = emptyIntList();
            }

            public final boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            public final String getLeadingComments() {
                return this.leadingComments_;
            }

            public final getBaseline getLeadingCommentsBytes() {
                return getBaseline.asBinder(this.leadingComments_);
            }

            /* access modifiers changed from: private */
            public void setLeadingComments(String str) {
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* access modifiers changed from: private */
            public void setLeadingCommentsBytes(getBaseline getbaseline) {
                this.leadingComments_ = getbaseline.AudioAttributesImplApi26Parcelizer();
                this.bitField0_ |= 1;
            }

            public final boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            public final String getTrailingComments() {
                return this.trailingComments_;
            }

            public final getBaseline getTrailingCommentsBytes() {
                return getBaseline.asBinder(this.trailingComments_);
            }

            /* access modifiers changed from: private */
            public void setTrailingComments(String str) {
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            /* access modifiers changed from: private */
            public void setTrailingCommentsBytes(getBaseline getbaseline) {
                this.trailingComments_ = getbaseline.AudioAttributesImplApi26Parcelizer();
                this.bitField0_ |= 2;
            }

            public final List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            public final int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            public final String getLeadingDetachedComments(int i) {
                return (String) this.leadingDetachedComments_.get(i);
            }

            public final getBaseline getLeadingDetachedCommentsBytes(int i) {
                return getBaseline.asBinder((String) this.leadingDetachedComments_.get(i));
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                measureNullChild.AudioAttributesCompatParcelizer<String> audioAttributesCompatParcelizer = this.leadingDetachedComments_;
                if (!audioAttributesCompatParcelizer.onTransact()) {
                    this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
                }
            }

            /* access modifiers changed from: private */
            public void setLeadingDetachedComments(int i, String str) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void addLeadingDetachedComments(String str) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(str);
            }

            /* access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                onLongPress.addAll(iterable, this.leadingDetachedComments_);
            }

            /* access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(getBaseline getbaseline) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(getbaseline.AudioAttributesImplApi26Parcelizer());
            }

            public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Location parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static Location parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static Location parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Location parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static Location parseFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Location) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Location) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Location parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static Location parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static asBinder newBuilder() {
                return (asBinder) DEFAULT_INSTANCE.createBuilder();
            }

            public static asBinder newBuilder(Location location) {
                return (asBinder) DEFAULT_INSTANCE.createBuilder(location);
            }

            public static final class asBinder extends GeneratedMessageLite.RemoteActionCompatParcelizer<Location, asBinder> implements asBinder {
                /* synthetic */ asBinder(byte b) {
                    this();
                }

                private asBinder() {
                    super(Location.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new Location();
                    case 2:
                        return new asBinder((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<Location> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (Location.class) {
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
                Location location = new Location();
                DEFAULT_INSTANCE = location;
                GeneratedMessageLite.registerDefaultInstance(Location.class, location);
            }

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<Location> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public final List<Location> getLocationList() {
            return this.location_;
        }

        public final List<? extends asBinder> getLocationOrBuilderList() {
            return this.location_;
        }

        public final int getLocationCount() {
            return this.location_.size();
        }

        public final Location getLocation(int i) {
            return (Location) this.location_.get(i);
        }

        public final asBinder getLocationOrBuilder(int i) {
            return (asBinder) this.location_.get(i);
        }

        private void ensureLocationIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<Location> audioAttributesCompatParcelizer = this.location_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.location_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setLocation(int i, Location location) {
            ensureLocationIsMutable();
            this.location_.set(i, location);
        }

        /* access modifiers changed from: private */
        public void addLocation(Location location) {
            ensureLocationIsMutable();
            this.location_.add(location);
        }

        /* access modifiers changed from: private */
        public void addLocation(int i, Location location) {
            ensureLocationIsMutable();
            this.location_.add(i, location);
        }

        /* access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends Location> iterable) {
            ensureLocationIsMutable();
            onLongPress.addAll(iterable, this.location_);
        }

        /* access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeLocation(int i) {
            ensureLocationIsMutable();
            this.location_.remove(i);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static SourceCodeInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static SourceCodeInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (SourceCodeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static SourceCodeInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static SourceCodeInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static onTransact newBuilder() {
            return (onTransact) DEFAULT_INSTANCE.createBuilder();
        }

        public static onTransact newBuilder(SourceCodeInfo sourceCodeInfo) {
            return (onTransact) DEFAULT_INSTANCE.createBuilder(sourceCodeInfo);
        }

        public static final class onTransact extends GeneratedMessageLite.RemoteActionCompatParcelizer<SourceCodeInfo, onTransact> implements layoutHorizontal {
            /* synthetic */ onTransact(byte b) {
                this();
            }

            private onTransact() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new SourceCodeInfo();
                case 2:
                    return new onTransact((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<SourceCodeInfo> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (SourceCodeInfo.class) {
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
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo();
            DEFAULT_INSTANCE = sourceCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, sourceCodeInfo);
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<SourceCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, asInterface> implements layoutHorizontal {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile getAnimationStyle<GeneratedCodeInfo> PARSER;
        private measureNullChild.AudioAttributesCompatParcelizer<Annotation> annotation_ = emptyProtobufList();

        public interface read extends ListPopupWindow {
        }

        private GeneratedCodeInfo() {
        }

        public static final class Annotation extends GeneratedMessageLite<Annotation, RemoteActionCompatParcelizer> implements read {
            public static final int BEGIN_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Annotation DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile getAnimationStyle<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private measureNullChild.IconCompatParcelizer path_ = emptyIntList();
            private String sourceFile_ = "";

            private Annotation() {
            }

            public final List<Integer> getPathList() {
                return this.path_;
            }

            public final int getPathCount() {
                return this.path_.size();
            }

            public final int getPath(int i) {
                return this.path_.asBinder(i);
            }

            private void ensurePathIsMutable() {
                measureNullChild.IconCompatParcelizer iconCompatParcelizer = this.path_;
                if (!iconCompatParcelizer.onTransact()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(iconCompatParcelizer);
                }
            }

            /* access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.RemoteActionCompatParcelizer(i, i2);
            }

            /* access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.asInterface(i);
            }

            /* access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                onLongPress.addAll(iterable, this.path_);
            }

            /* access modifiers changed from: private */
            public void clearPath() {
                this.path_ = emptyIntList();
            }

            public final boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            public final String getSourceFile() {
                return this.sourceFile_;
            }

            public final getBaseline getSourceFileBytes() {
                return getBaseline.asBinder(this.sourceFile_);
            }

            /* access modifiers changed from: private */
            public void setSourceFile(String str) {
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            /* access modifiers changed from: private */
            public void setSourceFileBytes(getBaseline getbaseline) {
                this.sourceFile_ = getbaseline.AudioAttributesImplApi26Parcelizer();
                this.bitField0_ |= 1;
            }

            public final boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            public final int getBegin() {
                return this.begin_;
            }

            /* access modifiers changed from: private */
            public void setBegin(int i) {
                this.bitField0_ |= 2;
                this.begin_ = i;
            }

            /* access modifiers changed from: private */
            public void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            public final boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public final int getEnd() {
                return this.end_;
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 4;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
            }

            public static Annotation parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
            }

            public static Annotation parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
            }

            public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Annotation parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
            }

            public static Annotation parseFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Annotation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
                return (Annotation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
            }

            public static Annotation parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
            }

            public static Annotation parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
            }

            public static RemoteActionCompatParcelizer newBuilder() {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder();
            }

            public static RemoteActionCompatParcelizer newBuilder(Annotation annotation) {
                return (RemoteActionCompatParcelizer) DEFAULT_INSTANCE.createBuilder(annotation);
            }

            public static final class RemoteActionCompatParcelizer extends GeneratedMessageLite.RemoteActionCompatParcelizer<Annotation, RemoteActionCompatParcelizer> implements read {
                /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                    this();
                }

                private RemoteActionCompatParcelizer() {
                    super(Annotation.DEFAULT_INSTANCE);
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
                getAnimationStyle getanimationstyle;
                switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        return new Annotation();
                    case 2:
                        return new RemoteActionCompatParcelizer((byte) 0);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        getAnimationStyle<Annotation> getanimationstyle2 = PARSER;
                        if (getanimationstyle2 != null) {
                            return getanimationstyle2;
                        }
                        synchronized (Annotation.class) {
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
                Annotation annotation = new Annotation();
                DEFAULT_INSTANCE = annotation;
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
            }

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static getAnimationStyle<Annotation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public final List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public final List<? extends read> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        public final int getAnnotationCount() {
            return this.annotation_.size();
        }

        public final Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public final read getAnnotationOrBuilder(int i) {
            return (read) this.annotation_.get(i);
        }

        private void ensureAnnotationIsMutable() {
            measureNullChild.AudioAttributesCompatParcelizer<Annotation> audioAttributesCompatParcelizer = this.annotation_;
            if (!audioAttributesCompatParcelizer.onTransact()) {
                this.annotation_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
            }
        }

        /* access modifiers changed from: private */
        public void setAnnotation(int i, Annotation annotation) {
            ensureAnnotationIsMutable();
            this.annotation_.set(i, annotation);
        }

        /* access modifiers changed from: private */
        public void addAnnotation(Annotation annotation) {
            ensureAnnotationIsMutable();
            this.annotation_.add(annotation);
        }

        /* access modifiers changed from: private */
        public void addAnnotation(int i, Annotation annotation) {
            ensureAnnotationIsMutable();
            this.annotation_.add(i, annotation);
        }

        /* access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
            ensureAnnotationIsMutable();
            onLongPress.addAll(iterable, this.annotation_);
        }

        /* access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeAnnotation(int i) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
        }

        public static GeneratedCodeInfo parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
        }

        public static GeneratedCodeInfo parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
            return (GeneratedCodeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
        }

        public static GeneratedCodeInfo parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
        }

        public static GeneratedCodeInfo parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
        }

        public static asInterface newBuilder() {
            return (asInterface) DEFAULT_INSTANCE.createBuilder();
        }

        public static asInterface newBuilder(GeneratedCodeInfo generatedCodeInfo) {
            return (asInterface) DEFAULT_INSTANCE.createBuilder(generatedCodeInfo);
        }

        public static final class asInterface extends GeneratedMessageLite.RemoteActionCompatParcelizer<GeneratedCodeInfo, asInterface> implements layoutHorizontal {
            /* synthetic */ asInterface(byte b) {
                this();
            }

            private asInterface() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
            getAnimationStyle getanimationstyle;
            switch (AnonymousClass2.RemoteActionCompatParcelizer[audioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                    return new GeneratedCodeInfo();
                case 2:
                    return new asInterface((byte) 0);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAnimationStyle<GeneratedCodeInfo> getanimationstyle2 = PARSER;
                    if (getanimationstyle2 != null) {
                        return getanimationstyle2;
                    }
                    synchronized (GeneratedCodeInfo.class) {
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
            GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo();
            DEFAULT_INSTANCE = generatedCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, generatedCodeInfo);
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static getAnimationStyle<GeneratedCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
