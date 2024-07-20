package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.RemoteActionCompatParcelizer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.ForwardingListener;
import o.drawDividersVertical;
import o.drawVerticalDivider;
import o.getAnimationStyle;
import o.getBaseline;
import o.getBaselineAlignedChildIndex;
import o.getChildrenSkipCount;
import o.getDividerDrawable;
import o.getDividerPadding;
import o.getDividerWidth;
import o.getMaxAvailableHeight;
import o.getShowDividers;
import o.getSoftInputMode;
import o.getWidth;
import o.isConfirmKey;
import o.isDropDownAlwaysVisible;
import o.isMeasureWithLargestChildEnabled;
import o.layoutHorizontal;
import o.measureChildBeforeLayout;
import o.measureNullChild;
import o.onLongPress;
import o.postShow;
import o.setDividerDrawable;
import o.setDropDownGravity;
import o.setMeasureWithLargestChildEnabled;
import o.setModal;
import o.setOnItemClickListener;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> extends onLongPress<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    public setDropDownGravity unknownFields = setDropDownGravity.onTransact();

    public enum AudioAttributesImplApi26Parcelizer {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2);

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final getAnimationStyle<MessageType> getParserForType() {
        return (getAnimationStyle) dynamicMethod(AudioAttributesImplApi26Parcelizer.GET_PARSER);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (RemoteActionCompatParcelizer) dynamicMethod(AudioAttributesImplApi26Parcelizer.NEW_BUILDER);
    }

    public MessageType newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE);
    }

    public String toString() {
        return isConfirmKey.read(this, super.toString());
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    /* access modifiers changed from: package-private */
    public int computeHashCode() {
        return isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(getClass()).read(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(getClass()).onTransact(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == setDropDownGravity.onTransact()) {
            this.unknownFields = setDropDownGravity.RemoteActionCompatParcelizer();
        }
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(int i, getDividerDrawable getdividerdrawable) throws IOException {
        if (setOnItemClickListener.onTransact(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.asBinder(i, getdividerdrawable);
    }

    /* access modifiers changed from: protected */
    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        setDropDownGravity setdropdowngravity = this.unknownFields;
        if (!setdropdowngravity.asBinder) {
            throw new UnsupportedOperationException();
        } else if (i != 0) {
            setdropdowngravity.asBinder(setOnItemClickListener.asInterface(i, 0), (Object) Long.valueOf((long) i2));
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    /* access modifiers changed from: protected */
    public void mergeLengthDelimitedField(int i, getBaseline getbaseline) {
        ensureUnknownFieldsInitialized();
        setDropDownGravity setdropdowngravity = this.unknownFields;
        if (!setdropdowngravity.asBinder) {
            throw new UnsupportedOperationException();
        } else if (i != 0) {
            setdropdowngravity.asBinder(setOnItemClickListener.asInterface(i, 2), (Object) getbaseline);
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    public void makeImmutable() {
        isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(getClass()).onTransact(this);
        markImmutable();
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> BuilderType createBuilder() {
        return (RemoteActionCompatParcelizer) dynamicMethod(AudioAttributesImplApi26Parcelizer.NEW_BUILDER);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public final BuilderType toBuilder() {
        return ((RemoteActionCompatParcelizer) dynamicMethod(AudioAttributesImplApi26Parcelizer.NEW_BUILDER)).mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj) {
        return dynamicMethod(audioAttributesImplApi26Parcelizer, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        return dynamicMethod(audioAttributesImplApi26Parcelizer, (Object) null, (Object) null);
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getChildrenSkipCount getchildrenskipcount;
        postShow<?> RemoteActionCompatParcelizer2 = isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(getClass());
        if (codedOutputStream.asInterface != null) {
            getchildrenskipcount = codedOutputStream.asInterface;
        } else {
            getchildrenskipcount = new getChildrenSkipCount(codedOutputStream);
        }
        RemoteActionCompatParcelizer2.onTransact(this, (setPromptPosition) getchildrenskipcount);
    }

    public int getSerializedSize(postShow postshow) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(postshow);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            StringBuilder sb = new StringBuilder("serialized size must be non-negative, was ");
            sb.append(computeSerializedSize);
            throw new IllegalStateException(sb.toString());
        } else if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        } else {
            int computeSerializedSize2 = computeSerializedSize(postshow);
            setMemoizedSerializedSize(computeSerializedSize2);
            return computeSerializedSize2;
        }
    }

    public int getSerializedSize() {
        return getSerializedSize((postShow) null);
    }

    private int computeSerializedSize(postShow<?> postshow) {
        if (postshow == null) {
            return isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(getClass()).RemoteActionCompatParcelizer(this);
        }
        return postshow.RemoteActionCompatParcelizer(this);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO);
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) setModal.read(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    protected static Object newMessageInfo(getMaxAvailableHeight getmaxavailableheight, String str, Object[] objArr) {
        return new getSoftInputMode(getmaxavailableheight, str, objArr);
    }

    /* access modifiers changed from: protected */
    public final void mergeUnknownFields(setDropDownGravity setdropdowngravity) {
        this.unknownFields = setDropDownGravity.onTransact(this.unknownFields, setdropdowngravity);
    }

    public static abstract class RemoteActionCompatParcelizer<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends RemoteActionCompatParcelizer<MessageType, BuilderType>> extends onLongPress.onTransact<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        public MessageType instance;

        public RemoteActionCompatParcelizer(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (!messagetype.isMutable()) {
                this.instance = newMutableInstance();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private MessageType newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }

        /* access modifiers changed from: protected */
        public final void copyOnWrite() {
            if (!this.instance.isMutable()) {
                copyOnWriteInternal();
            }
        }

        /* access modifiers changed from: protected */
        public void copyOnWriteInternal() {
            MessageType newMutableInstance = newMutableInstance();
            mergeFromInstance(newMutableInstance, this.instance);
            this.instance = newMutableInstance;
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.instance = buildPartial();
            return newBuilderForType;
        }

        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        /* access modifiers changed from: protected */
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(messagetype.getClass()).asInterface(messagetype, messagetype2);
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType mergeFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            getBaselineAlignedChildIndex getbaselinealignedchildindex;
            copyOnWrite();
            try {
                postShow<?> RemoteActionCompatParcelizer = isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(this.instance.getClass());
                MessageType messagetype = this.instance;
                if (getdividerdrawable.onTransact != null) {
                    getbaselinealignedchildindex = getdividerdrawable.onTransact;
                } else {
                    getbaselinealignedchildindex = new getBaselineAlignedChildIndex(getdividerdrawable);
                }
                RemoteActionCompatParcelizer.asBinder(messagetype, getbaselinealignedchildindex, getdividerwidth);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends read<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements layoutHorizontal<MessageType, BuilderType> {
        public measureChildBeforeLayout<asInterface> extensions = measureChildBeforeLayout.onTransact();

        public /* bridge */ /* synthetic */ getMaxAvailableHeight getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ getMaxAvailableHeight.read newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ getMaxAvailableHeight.read toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        /* access modifiers changed from: protected */
        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.asInterface) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.asInterface(messagetype.extensions);
        }

        /* access modifiers changed from: protected */
        public <MessageType extends getMaxAvailableHeight> boolean parseUnknownField(MessageType messagetype, getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth, int i) throws IOException {
            int asInterface = setOnItemClickListener.asInterface(i);
            return parseExtension(getdividerdrawable, getdividerwidth, getdividerwidth.onTransact.get(new getDividerWidth.RemoteActionCompatParcelizer(messagetype, asInterface)), i, asInterface);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean parseExtension(o.getDividerDrawable r5, o.getDividerWidth r6, com.google.protobuf.GeneratedMessageLite.asBinder<?, ?> r7, int r8, int r9) throws java.io.IOException {
            /*
                r4 = this;
                int r0 = o.setOnItemClickListener.onTransact(r8)
                r1 = 0
                r2 = 1
                if (r7 != 0) goto L_0x0009
                goto L_0x0031
            L_0x0009:
                com.google.protobuf.GeneratedMessageLite$asInterface r3 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r3 = r3.asBinder
                int r3 = o.measureChildBeforeLayout.read((o.setOnItemClickListener.RemoteActionCompatParcelizer) r3, (boolean) r1)
                if (r0 != r3) goto L_0x0015
                r0 = 0
                goto L_0x0032
            L_0x0015:
                com.google.protobuf.GeneratedMessageLite$asInterface r3 = r7.read
                boolean r3 = r3.RemoteActionCompatParcelizer
                if (r3 == 0) goto L_0x0031
                com.google.protobuf.GeneratedMessageLite$asInterface r3 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r3 = r3.asBinder
                boolean r3 = r3.onTransact()
                if (r3 == 0) goto L_0x0031
                com.google.protobuf.GeneratedMessageLite$asInterface r3 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r3 = r3.asBinder
                int r3 = o.measureChildBeforeLayout.read((o.setOnItemClickListener.RemoteActionCompatParcelizer) r3, (boolean) r2)
                if (r0 != r3) goto L_0x0031
                r0 = 1
                goto L_0x0034
            L_0x0031:
                r0 = 1
            L_0x0032:
                r1 = r0
                r0 = 0
            L_0x0034:
                if (r1 == 0) goto L_0x003b
                boolean r5 = r4.parseUnknownField(r8, r5)
                return r5
            L_0x003b:
                r4.ensureExtensionsAreMutable()
                if (r0 == 0) goto L_0x009c
                int r6 = r5.onConnectionSuspended()
                int r6 = r5.onTransact((int) r6)
                com.google.protobuf.GeneratedMessageLite$asInterface r8 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r8 = r8.asBinder
                o.setOnItemClickListener$RemoteActionCompatParcelizer r9 = o.setOnItemClickListener.RemoteActionCompatParcelizer.ENUM
                if (r8 != r9) goto L_0x0081
            L_0x0050:
                int r8 = r5.asBinder()
                if (r8 <= 0) goto L_0x0097
                int r8 = r5.AudioAttributesImplApi26Parcelizer()
                com.google.protobuf.GeneratedMessageLite$asInterface r9 = r7.read
                o.measureNullChild$asInterface<?> r9 = r9.asInterface
                o.measureNullChild$read r8 = r9.findValueByNumber(r8)
                if (r8 != 0) goto L_0x0065
                return r2
            L_0x0065:
                o.measureChildBeforeLayout<com.google.protobuf.GeneratedMessageLite$asInterface> r9 = r4.extensions
                com.google.protobuf.GeneratedMessageLite$asInterface r0 = r7.read
                com.google.protobuf.GeneratedMessageLite$asInterface r1 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r1 = r1.asBinder
                o.setOnItemClickListener$read r1 = r1.MediaDescriptionCompat
                o.setOnItemClickListener$read r3 = o.setOnItemClickListener.read.ENUM
                if (r1 != r3) goto L_0x007d
                o.measureNullChild$read r8 = (o.measureNullChild.read) r8
                int r8 = r8.getNumber()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            L_0x007d:
                r9.asInterface(r0, r8)
                goto L_0x0050
            L_0x0081:
                int r8 = r5.asBinder()
                if (r8 <= 0) goto L_0x0097
                com.google.protobuf.GeneratedMessageLite$asInterface r8 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r8 = r8.asBinder
                java.lang.Object r8 = o.measureChildBeforeLayout.onTransact(r5, r8)
                o.measureChildBeforeLayout<com.google.protobuf.GeneratedMessageLite$asInterface> r9 = r4.extensions
                com.google.protobuf.GeneratedMessageLite$asInterface r0 = r7.read
                r9.asInterface(r0, r8)
                goto L_0x0081
            L_0x0097:
                r5.asInterface((int) r6)
                goto L_0x0140
            L_0x009c:
                int[] r8 = com.google.protobuf.GeneratedMessageLite.AnonymousClass4.RemoteActionCompatParcelizer
                com.google.protobuf.GeneratedMessageLite$asInterface r0 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r0 = r0.asBinder
                o.setOnItemClickListener$read r0 = r0.MediaDescriptionCompat
                int r0 = r0.ordinal()
                r8 = r8[r0]
                if (r8 == r2) goto L_0x00cc
                r6 = 2
                if (r8 == r6) goto L_0x00b8
                com.google.protobuf.GeneratedMessageLite$asInterface r6 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r6 = r6.asBinder
                java.lang.Object r5 = o.measureChildBeforeLayout.onTransact(r5, r6)
                goto L_0x0103
            L_0x00b8:
                int r5 = r5.AudioAttributesImplApi26Parcelizer()
                com.google.protobuf.GeneratedMessageLite$asInterface r6 = r7.read
                o.measureNullChild$asInterface<?> r6 = r6.asInterface
                o.measureNullChild$read r6 = r6.findValueByNumber(r5)
                if (r6 != 0) goto L_0x00ca
                r4.mergeVarintField(r9, r5)
                return r2
            L_0x00ca:
                r5 = r6
                goto L_0x0103
            L_0x00cc:
                com.google.protobuf.GeneratedMessageLite$asInterface r8 = r7.read
                boolean r8 = r8.RemoteActionCompatParcelizer
                if (r8 != 0) goto L_0x00e3
                o.measureChildBeforeLayout<com.google.protobuf.GeneratedMessageLite$asInterface> r8 = r4.extensions
                com.google.protobuf.GeneratedMessageLite$asInterface r9 = r7.read
                java.lang.Object r8 = r8.asBinder(r9)
                o.getMaxAvailableHeight r8 = (o.getMaxAvailableHeight) r8
                if (r8 == 0) goto L_0x00e3
                o.getMaxAvailableHeight$read r8 = r8.toBuilder()
                goto L_0x00e4
            L_0x00e3:
                r8 = 0
            L_0x00e4:
                if (r8 != 0) goto L_0x00ec
                o.getMaxAvailableHeight r8 = r7.asBinder
                o.getMaxAvailableHeight$read r8 = r8.newBuilderForType()
            L_0x00ec:
                com.google.protobuf.GeneratedMessageLite$asInterface r9 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r9 = r9.asBinder
                o.setOnItemClickListener$RemoteActionCompatParcelizer r0 = o.setOnItemClickListener.RemoteActionCompatParcelizer.GROUP
                if (r9 != r0) goto L_0x00fc
                com.google.protobuf.GeneratedMessageLite$asInterface r9 = r7.read
                int r9 = r9.onTransact
                r5.RemoteActionCompatParcelizer(r9, r8, r6)
                goto L_0x00ff
            L_0x00fc:
                r5.asInterface(r8, r6)
            L_0x00ff:
                o.getMaxAvailableHeight r5 = r8.build()
            L_0x0103:
                com.google.protobuf.GeneratedMessageLite$asInterface r6 = r7.read
                boolean r6 = r6.RemoteActionCompatParcelizer
                if (r6 == 0) goto L_0x0125
                o.measureChildBeforeLayout<com.google.protobuf.GeneratedMessageLite$asInterface> r6 = r4.extensions
                com.google.protobuf.GeneratedMessageLite$asInterface r8 = r7.read
                com.google.protobuf.GeneratedMessageLite$asInterface r7 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r7 = r7.asBinder
                o.setOnItemClickListener$read r7 = r7.MediaDescriptionCompat
                o.setOnItemClickListener$read r9 = o.setOnItemClickListener.read.ENUM
                if (r7 != r9) goto L_0x0121
                o.measureNullChild$read r5 = (o.measureNullChild.read) r5
                int r5 = r5.getNumber()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L_0x0121:
                r6.asInterface(r8, r5)
                goto L_0x0140
            L_0x0125:
                o.measureChildBeforeLayout<com.google.protobuf.GeneratedMessageLite$asInterface> r6 = r4.extensions
                com.google.protobuf.GeneratedMessageLite$asInterface r8 = r7.read
                com.google.protobuf.GeneratedMessageLite$asInterface r7 = r7.read
                o.setOnItemClickListener$RemoteActionCompatParcelizer r7 = r7.asBinder
                o.setOnItemClickListener$read r7 = r7.MediaDescriptionCompat
                o.setOnItemClickListener$read r9 = o.setOnItemClickListener.read.ENUM
                if (r7 != r9) goto L_0x013d
                o.measureNullChild$read r5 = (o.measureNullChild.read) r5
                int r5 = r5.getNumber()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L_0x013d:
                r6.asBinder(r8, (java.lang.Object) r5)
            L_0x0140:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(o.getDividerDrawable, o.getDividerWidth, com.google.protobuf.GeneratedMessageLite$asBinder, int, int):boolean");
        }

        /* access modifiers changed from: protected */
        public <MessageType extends getMaxAvailableHeight> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth, int i) throws IOException {
            if (i == setOnItemClickListener.asBinder) {
                mergeMessageSetExtensionFromCodedStream(messagetype, getdividerdrawable, getdividerwidth);
                return true;
            } else if (setOnItemClickListener.onTransact(i) == 2) {
                return parseUnknownField(messagetype, getdividerdrawable, getdividerwidth, i);
            } else {
                return getdividerdrawable.asBinder(i);
            }
        }

        private <MessageType extends getMaxAvailableHeight> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
            int i = 0;
            getBaseline getbaseline = null;
            asBinder asbinder = null;
            while (true) {
                int MediaSessionCompat$ResultReceiverWrapper = getdividerdrawable.MediaSessionCompat$ResultReceiverWrapper();
                if (MediaSessionCompat$ResultReceiverWrapper == 0) {
                    break;
                } else if (MediaSessionCompat$ResultReceiverWrapper == setOnItemClickListener.RemoteActionCompatParcelizer) {
                    i = getdividerdrawable.RatingCompat();
                    if (i != 0) {
                        asbinder = getdividerwidth.onTransact.get(new getDividerWidth.RemoteActionCompatParcelizer(messagetype, i));
                    }
                } else if (MediaSessionCompat$ResultReceiverWrapper == setOnItemClickListener.asInterface) {
                    if (i == 0 || asbinder == null) {
                        getbaseline = getdividerdrawable.asInterface();
                    } else {
                        eagerlyMergeMessageSetExtension(getdividerdrawable, asbinder, getdividerwidth, i);
                        getbaseline = null;
                    }
                } else if (!getdividerdrawable.asBinder(MediaSessionCompat$ResultReceiverWrapper)) {
                    break;
                }
            }
            getdividerdrawable.RemoteActionCompatParcelizer(setOnItemClickListener.onTransact);
            if (getbaseline != null && i != 0) {
                if (asbinder != null) {
                    mergeMessageSetExtensionFromBytes(getbaseline, getdividerwidth, asbinder);
                } else if (getbaseline != null) {
                    mergeLengthDelimitedField(i, getbaseline);
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(getDividerDrawable getdividerdrawable, asBinder<?, ?> asbinder, getDividerWidth getdividerwidth, int i) throws IOException {
            parseExtension(getdividerdrawable, getdividerwidth, asbinder, setOnItemClickListener.asInterface(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(getBaseline getbaseline, getDividerWidth getdividerwidth, asBinder<?, ?> asbinder) throws IOException {
            getMaxAvailableHeight.read read2;
            getMaxAvailableHeight getmaxavailableheight = (getMaxAvailableHeight) this.extensions.asBinder(asbinder.read);
            if (getmaxavailableheight != null) {
                read2 = getmaxavailableheight.toBuilder();
            } else {
                read2 = null;
            }
            if (read2 == null) {
                read2 = asbinder.asBinder.newBuilderForType();
            }
            read2.mergeFrom(getbaseline, getdividerwidth);
            Object build = read2.build();
            measureChildBeforeLayout<asInterface> ensureExtensionsAreMutable = ensureExtensionsAreMutable();
            asInterface asinterface = asbinder.read;
            if (asbinder.read.asBinder.MediaDescriptionCompat == setOnItemClickListener.read.ENUM) {
                build = Integer.valueOf(((measureNullChild.read) build).getNumber());
            }
            ensureExtensionsAreMutable.asBinder(asinterface, build);
        }

        public measureChildBeforeLayout<asInterface> ensureExtensionsAreMutable() {
            if (this.extensions.asInterface) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public final <Type> boolean hasExtension(getShowDividers<MessageType, Type> getshowdividers) {
            asBinder access$000 = GeneratedMessageLite.checkIsLite(getshowdividers);
            verifyExtensionContainingType(access$000);
            measureChildBeforeLayout<asInterface> measurechildbeforelayout = this.extensions;
            asInterface asinterface = access$000.read;
            if (!asinterface.onTransact()) {
                return measurechildbeforelayout.onTransact.get(asinterface) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final <Type> int getExtensionCount(getShowDividers<MessageType, List<Type>> getshowdividers) {
            asBinder access$000 = GeneratedMessageLite.checkIsLite(getshowdividers);
            verifyExtensionContainingType(access$000);
            measureChildBeforeLayout<asInterface> measurechildbeforelayout = this.extensions;
            asInterface asinterface = access$000.read;
            if (asinterface.onTransact()) {
                Object asBinder = measurechildbeforelayout.asBinder(asinterface);
                if (asBinder == null) {
                    return 0;
                }
                return ((List) asBinder).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> Type getExtension(getShowDividers<MessageType, Type> getshowdividers) {
            asBinder access$000 = GeneratedMessageLite.checkIsLite(getshowdividers);
            verifyExtensionContainingType(access$000);
            Type asBinder = this.extensions.asBinder(access$000.read);
            if (asBinder == null) {
                return access$000.RemoteActionCompatParcelizer;
            }
            if (!access$000.read.RemoteActionCompatParcelizer) {
                return access$000.RemoteActionCompatParcelizer(asBinder);
            }
            if (access$000.read.asBinder.MediaDescriptionCompat != setOnItemClickListener.read.ENUM) {
                return asBinder;
            }
            Type arrayList = new ArrayList();
            for (Object RemoteActionCompatParcelizer : (List) asBinder) {
                arrayList.add(access$000.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer));
            }
            return arrayList;
        }

        public final <Type> Type getExtension(getShowDividers<MessageType, List<Type>> getshowdividers, int i) {
            asBinder access$000 = GeneratedMessageLite.checkIsLite(getshowdividers);
            verifyExtensionContainingType(access$000);
            measureChildBeforeLayout<asInterface> measurechildbeforelayout = this.extensions;
            asInterface asinterface = access$000.read;
            if (asinterface.onTransact()) {
                Object asBinder = measurechildbeforelayout.asBinder(asinterface);
                if (asBinder != null) {
                    return access$000.RemoteActionCompatParcelizer(((List) asBinder).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.asInterface();
        }

        protected class read {
            private final Iterator<Map.Entry<asInterface, Object>> RemoteActionCompatParcelizer;
            private final boolean asInterface;
            private Map.Entry<asInterface, Object> read;

            /* synthetic */ read(ExtendableMessage extendableMessage, boolean z, byte b) {
                this(z);
            }

            private read(boolean z) {
                Iterator<Map.Entry<asInterface, Object>> AudioAttributesCompatParcelizer = ExtendableMessage.this.extensions.AudioAttributesCompatParcelizer();
                this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
                if (AudioAttributesCompatParcelizer.hasNext()) {
                    this.read = AudioAttributesCompatParcelizer.next();
                }
                this.asInterface = z;
            }
        }

        /* access modifiers changed from: protected */
        public ExtendableMessage<MessageType, BuilderType>.read newExtensionWriter() {
            return new read(this, false, (byte) 0);
        }

        /* access modifiers changed from: protected */
        public ExtendableMessage<MessageType, BuilderType>.read newMessageSetExtensionWriter() {
            return new read(this, true, (byte) 0);
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.RemoteActionCompatParcelizer();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.asBinder();
        }

        private void verifyExtensionContainingType(asBinder<MessageType, ?> asbinder) {
            if (asbinder.asInterface != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.setOnItemClickListener$read[] r0 = o.setOnItemClickListener.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                RemoteActionCompatParcelizer = r0
                o.setOnItemClickListener$read r1 = o.setOnItemClickListener.read.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setOnItemClickListener$read r1 = o.setOnItemClickListener.read.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.AnonymousClass4.<clinit>():void");
        }
    }

    public static abstract class read<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends read<MessageType, BuilderType>> extends RemoteActionCompatParcelizer<MessageType, BuilderType> implements layoutHorizontal<MessageType, BuilderType> {
        protected read(MessageType messagetype) {
            super(messagetype);
        }

        /* access modifiers changed from: protected */
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != measureChildBeforeLayout.onTransact()) {
                ((ExtendableMessage) this.instance).extensions = ((ExtendableMessage) this.instance).extensions.clone();
            }
        }

        /* renamed from: RemoteActionCompatParcelizer */
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (ExtendableMessage) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.IconCompatParcelizer();
            return (ExtendableMessage) super.buildPartial();
        }
    }

    public static <ContainingType extends getMaxAvailableHeight, Type> asBinder<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, getMaxAvailableHeight getmaxavailableheight, measureNullChild.asInterface<?> asinterface, int i, setOnItemClickListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Class cls) {
        return new asBinder<>(containingtype, type, getmaxavailableheight, new asInterface(asinterface, i, remoteActionCompatParcelizer, false, false));
    }

    public static <ContainingType extends getMaxAvailableHeight, Type> asBinder<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, getMaxAvailableHeight getmaxavailableheight, measureNullChild.asInterface<?> asinterface, int i, setOnItemClickListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, Class cls) {
        return new asBinder<>(containingtype, Collections.emptyList(), getmaxavailableheight, new asInterface(asinterface, i, remoteActionCompatParcelizer, true, z));
    }

    public static final class asInterface implements measureChildBeforeLayout.asBinder<asInterface> {
        public final boolean RemoteActionCompatParcelizer;
        public final setOnItemClickListener.RemoteActionCompatParcelizer asBinder;
        public final measureNullChild.asInterface<?> asInterface;
        public final int onTransact;
        public final boolean read;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.onTransact - ((asInterface) obj).onTransact;
        }

        asInterface(measureNullChild.asInterface<?> asinterface, int i, setOnItemClickListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, boolean z2) {
            this.asInterface = asinterface;
            this.onTransact = i;
            this.asBinder = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = z;
            this.read = z2;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.onTransact;
        }

        public final setOnItemClickListener.RemoteActionCompatParcelizer asInterface() {
            return this.asBinder;
        }

        public final setOnItemClickListener.read read() {
            return this.asBinder.MediaDescriptionCompat;
        }

        public final boolean onTransact() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean asBinder() {
            return this.read;
        }

        public final getMaxAvailableHeight.read RemoteActionCompatParcelizer(getMaxAvailableHeight.read read2, getMaxAvailableHeight getmaxavailableheight) {
            return ((RemoteActionCompatParcelizer) read2).mergeFrom((GeneratedMessageLite) getmaxavailableheight);
        }
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Generated message class \"");
            sb.append(cls.getName());
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static class asBinder<ContainingType extends getMaxAvailableHeight, Type> extends getShowDividers<ContainingType, Type> {
        final Type RemoteActionCompatParcelizer;
        public final getMaxAvailableHeight asBinder;
        final ContainingType asInterface;
        public final asInterface read;

        asBinder(ContainingType containingtype, Type type, getMaxAvailableHeight getmaxavailableheight, asInterface asinterface) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (asinterface.asBinder == setOnItemClickListener.RemoteActionCompatParcelizer.MESSAGE && getmaxavailableheight == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.asInterface = containingtype;
                this.RemoteActionCompatParcelizer = type;
                this.asBinder = getmaxavailableheight;
                this.read = asinterface;
            }
        }

        /* access modifiers changed from: package-private */
        public final Object RemoteActionCompatParcelizer(Object obj) {
            return this.read.asBinder.MediaDescriptionCompat == setOnItemClickListener.read.ENUM ? this.read.asInterface.findValueByNumber(((Integer) obj).intValue()) : obj;
        }
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends read<MessageType, BuilderType>, T> asBinder<MessageType, T> checkIsLite(getShowDividers<MessageType, T> getshowdividers) {
        return (asBinder) getshowdividers;
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean asInterface2 = isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(t.getClass()).asInterface(t);
        if (z) {
            t.dynamicMethod(AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED, asInterface2 ? t : null);
        }
        return asInterface2;
    }

    protected static measureNullChild.IconCompatParcelizer emptyIntList() {
        return setDividerDrawable.asBinder();
    }

    public static measureNullChild.IconCompatParcelizer mutableCopy(measureNullChild.IconCompatParcelizer iconCompatParcelizer) {
        int size = iconCompatParcelizer.size();
        return iconCompatParcelizer.onTransact(size == 0 ? 10 : size << 1);
    }

    protected static measureNullChild.AudioAttributesImplApi21Parcelizer emptyLongList() {
        return setMeasureWithLargestChildEnabled.asBinder();
    }

    public static measureNullChild.AudioAttributesImplApi21Parcelizer mutableCopy(measureNullChild.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        int size = audioAttributesImplApi21Parcelizer.size();
        return audioAttributesImplApi21Parcelizer.asBinder(size == 0 ? 10 : size << 1);
    }

    protected static measureNullChild.AudioAttributesImplApi26Parcelizer emptyFloatList() {
        return isMeasureWithLargestChildEnabled.asInterface();
    }

    protected static measureNullChild.AudioAttributesImplApi26Parcelizer mutableCopy(measureNullChild.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        int size = audioAttributesImplApi26Parcelizer.size();
        return audioAttributesImplApi26Parcelizer.onTransact(size == 0 ? 10 : size << 1);
    }

    protected static measureNullChild.asBinder emptyDoubleList() {
        return getDividerPadding.asInterface();
    }

    public static measureNullChild.asBinder mutableCopy(measureNullChild.asBinder asbinder) {
        int size = asbinder.size();
        return asbinder.asInterface(size == 0 ? 10 : size << 1);
    }

    protected static measureNullChild.onTransact emptyBooleanList() {
        return drawDividersVertical.asBinder();
    }

    protected static measureNullChild.onTransact mutableCopy(measureNullChild.onTransact ontransact) {
        int size = ontransact.size();
        return ontransact.asInterface(size == 0 ? 10 : size << 1);
    }

    public static <E> measureNullChild.AudioAttributesCompatParcelizer<E> emptyProtobufList() {
        return getWidth.asInterface();
    }

    public static <E> measureNullChild.AudioAttributesCompatParcelizer<E> mutableCopy(measureNullChild.AudioAttributesCompatParcelizer<E> audioAttributesCompatParcelizer) {
        int size = audioAttributesCompatParcelizer.size();
        return audioAttributesCompatParcelizer.read(size == 0 ? 10 : size << 1);
    }

    public static class onTransact<T extends GeneratedMessageLite<T, ?>> extends ForwardingListener.DisallowIntercept<T> {
        private final T asBinder;

        public onTransact(T t) {
            this.asBinder = t;
        }

        public final /* synthetic */ Object RemoteActionCompatParcelizer(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.asBinder, getdividerdrawable, getdividerwidth);
        }
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        getBaselineAlignedChildIndex getbaselinealignedchildindex;
        T newMutableInstance = t.newMutableInstance();
        try {
            postShow<?> RemoteActionCompatParcelizer2 = isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(newMutableInstance.getClass());
            if (getdividerdrawable.onTransact != null) {
                getbaselinealignedchildindex = getdividerdrawable.onTransact;
            } else {
                getbaselinealignedchildindex = new getBaselineAlignedChildIndex(getdividerdrawable);
            }
            RemoteActionCompatParcelizer2.asBinder(newMutableInstance, getbaselinealignedchildindex, getdividerwidth);
            RemoteActionCompatParcelizer2.onTransact(newMutableInstance);
            return newMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.read) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            e.onTransact = newMutableInstance;
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.onTransact = newMutableInstance;
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.onTransact = newMutableInstance;
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        T newMutableInstance = t.newMutableInstance();
        try {
            postShow<?> RemoteActionCompatParcelizer2 = isDropDownAlwaysVisible.onTransact().RemoteActionCompatParcelizer(newMutableInstance.getClass());
            postShow<?> postshow = RemoteActionCompatParcelizer2;
            T t2 = newMutableInstance;
            byte[] bArr2 = bArr;
            int i3 = i;
            postshow.read(t2, bArr2, i3, i + i2, new drawVerticalDivider.onTransact(getdividerwidth));
            RemoteActionCompatParcelizer2.onTransact(newMutableInstance);
            return newMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.read) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            e.onTransact = newMutableInstance;
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.onTransact = newMutableInstance;
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.onTransact = newMutableInstance;
            throw invalidProtocolBufferException2;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException AudioAttributesImplApi21Parcelizer = InvalidProtocolBufferException.AudioAttributesImplApi21Parcelizer();
            AudioAttributesImplApi21Parcelizer.onTransact = newMutableInstance;
            throw AudioAttributesImplApi21Parcelizer;
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, getDividerDrawable getdividerdrawable) throws InvalidProtocolBufferException {
        return parsePartialFrom(t, getdividerdrawable, getDividerWidth.onTransact());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(t.newUninitializedMessageException().getMessage());
        invalidProtocolBufferException.onTransact = t;
        throw invalidProtocolBufferException;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(t, getDividerDrawable.RemoteActionCompatParcelizer(byteBuffer), getdividerwidth));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(t, byteBuffer, getDividerWidth.onTransact());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, getBaseline getbaseline) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(t, getbaseline, getDividerWidth.onTransact()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, getbaseline, getdividerwidth));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        getDividerDrawable read2 = getbaseline.read();
        T parsePartialFrom = parsePartialFrom(t, read2, getdividerwidth);
        try {
            read2.RemoteActionCompatParcelizer(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            e.onTransact = parsePartialFrom;
            throw e;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, getDividerWidth.onTransact()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, getdividerwidth));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, getDividerDrawable.RemoteActionCompatParcelizer(inputStream), getDividerWidth.onTransact()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, getDividerDrawable.RemoteActionCompatParcelizer(inputStream), getdividerwidth));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, getDividerDrawable getdividerdrawable) throws InvalidProtocolBufferException {
        return parseFrom(t, getdividerdrawable, getDividerWidth.onTransact());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, getdividerdrawable, getdividerwidth));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, getDividerWidth.onTransact()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, getdividerwidth));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        try {
            int read2 = inputStream.read();
            if (read2 == -1) {
                return null;
            }
            getDividerDrawable RemoteActionCompatParcelizer2 = getDividerDrawable.RemoteActionCompatParcelizer((InputStream) new onLongPress.onTransact.asBinder(inputStream, getDividerDrawable.onTransact(read2, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, RemoteActionCompatParcelizer2, getdividerwidth);
            try {
                RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                e.onTransact = parsePartialFrom;
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.read) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }
}
