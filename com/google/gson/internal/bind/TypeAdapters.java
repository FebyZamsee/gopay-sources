package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter$1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.DropDownListView;
import o.EmojiCompatConfigurationView;
import o.canPositionSelectorForHoveredItem;
import o.dispatchDraw;
import o.hasFocus;
import o.hasWindowFocus;
import o.isFocused;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.post;
import o.setListSelectionHidden;
import o.setSelector;
import o.setSelectorEnabled;
import o.toGlobalMotionEvent;

public final class TypeAdapters {
    public static final setListSelectionHidden AudioAttributesCompatParcelizer;
    public static final setListSelectionHidden AudioAttributesImplApi21Parcelizer;
    public static final setListSelectionHidden AudioAttributesImplApi26Parcelizer;
    public static final setListSelectionHidden AudioAttributesImplBaseParcelizer = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            Class cls = toglobalmotionevent.asBinder;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new EnumTypeAdapter(cls);
        }
    };
    public static final setListSelectionHidden Cancellable;
    public static final setSelector<Boolean> IconCompatParcelizer = new setSelector<Boolean>() {
        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            Boolean bool = (Boolean) obj;
            ontouchobserved.RemoteActionCompatParcelizer(bool == null ? "null" : bool.toString());
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                return Boolean.valueOf(pointinview.onConnected());
            }
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
    };
    public static final setSelector<hasWindowFocus> MediaBrowserCompat$CustomActionResultReceiver;
    public static final setListSelectionHidden MediaBrowserCompat$ItemReceiver;
    public static final setListSelectionHidden MediaBrowserCompat$MediaItem;
    public static final setSelector<Number> MediaBrowserCompat$SearchResultReceiver = new setSelector<Number>() {
        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            ontouchobserved.onTransact((Number) obj);
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                return Float.valueOf((float) pointinview.AudioAttributesImplApi21Parcelizer());
            }
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
    };
    public static final setListSelectionHidden MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    public static final setListSelectionHidden MediaDescriptionCompat;
    public static final setListSelectionHidden MediaMetadataCompat;
    public static final setListSelectionHidden MediaSessionCompat$QueueItem;
    public static final setListSelectionHidden MediaSessionCompat$ResultReceiverWrapper;
    public static final setListSelectionHidden ParcelableVolumeInfo;
    public static final setListSelectionHidden PlaybackStateCompat;
    public static final setListSelectionHidden PlaybackStateCompat$CustomAction;
    public static final setSelector<Number> RatingCompat = new setSelector<Number>() {
        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            return RemoteActionCompatParcelizer(pointinview);
        }

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            ontouchobserved.onTransact((Number) obj);
        }

        private static Number RemoteActionCompatParcelizer(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            try {
                return Long.valueOf(pointinview.IconCompatParcelizer());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final setListSelectionHidden RemoteActionCompatParcelizer;
    public static final setSelector<BigInteger> asBinder = new setSelector<BigInteger>() {
        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            return read(pointinview);
        }

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            ontouchobserved.onTransact((Number) (BigInteger) obj);
        }

        private static BigInteger read(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            try {
                return new BigInteger(pointinview.onConnected());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final setListSelectionHidden asInterface;
    public static final setListSelectionHidden onConnected;
    public static final setListSelectionHidden onConnectionFailed;
    public static final setListSelectionHidden onConnectionSuspended;
    public static final setSelector<BigDecimal> onTransact = new setSelector<BigDecimal>() {
        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            return read(pointinview);
        }

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            ontouchobserved.onTransact((Number) (BigDecimal) obj);
        }

        private static BigDecimal read(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            try {
                return new BigDecimal(pointinview.onConnected());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final setListSelectionHidden read;
    public static final setSelector<Number> setInternalConnectionCallback = new setSelector<Number>() {
        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            ontouchobserved.onTransact((Number) obj);
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                return Double.valueOf(pointinview.AudioAttributesImplApi21Parcelizer());
            }
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
    };
    public static final setListSelectionHidden write;

    static {
        final TypeAdapter$1 typeAdapter$1 = new TypeAdapter$1(new setSelector<Class>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(((Class) obj).getName());
                sb.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(sb.toString());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        });
        final Class<Class> cls = Class.class;
        onConnected = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final TypeAdapter$1 typeAdapter$12 = new TypeAdapter$1(new setSelector<BitSet>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return onTransact(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                BitSet bitSet = (BitSet) obj;
                ontouchobserved.asBinder();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    ontouchobserved.RemoteActionCompatParcelizer(bitSet.get(i) ? 1 : 0);
                }
                ontouchobserved.RemoteActionCompatParcelizer();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) == 0) goto L_0x0062;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
                if (r7.write() != 0) goto L_0x0063;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.util.BitSet onTransact(o.pointInView r7) throws java.io.IOException {
                /*
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r7.asInterface()
                    o.onTouchForwarded r1 = r7.setInternalConnectionCallback()
                    r2 = 0
                    r3 = 0
                L_0x000e:
                    o.onTouchForwarded r4 = o.onTouchForwarded.END_ARRAY
                    if (r1 == r4) goto L_0x006f
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.RemoteActionCompatParcelizer
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x005b
                    r6 = 2
                    if (r4 == r6) goto L_0x0056
                    r6 = 3
                    if (r4 != r6) goto L_0x0042
                    java.lang.String r1 = r7.onConnected()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002e }
                    if (r1 != 0) goto L_0x0063
                    goto L_0x0062
                L_0x002e:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r7.<init>(r0)
                    r7.append(r1)
                    com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                    java.lang.String r7 = r7.toString()
                    r0.<init>((java.lang.String) r7)
                    throw r0
                L_0x0042:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r0 = "Invalid bitset value type: "
                    r7.<init>(r0)
                    r7.append(r1)
                    com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                    java.lang.String r7 = r7.toString()
                    r0.<init>((java.lang.String) r7)
                    throw r0
                L_0x0056:
                    boolean r5 = r7.AudioAttributesImplApi26Parcelizer()
                    goto L_0x0063
                L_0x005b:
                    int r1 = r7.write()
                    if (r1 == 0) goto L_0x0062
                    goto L_0x0063
                L_0x0062:
                    r5 = 0
                L_0x0063:
                    if (r5 == 0) goto L_0x0068
                    r0.set(r3)
                L_0x0068:
                    int r3 = r3 + 1
                    o.onTouchForwarded r1 = r7.setInternalConnectionCallback()
                    goto L_0x000e
                L_0x006f:
                    r7.read()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.onTransact(o.pointInView):java.util.BitSet");
            }
        });
        final Class<BitSet> cls2 = BitSet.class;
        AudioAttributesImplApi21Parcelizer = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass3 r0 = new setSelector<Boolean>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.onTransact((Boolean) obj);
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                onTouchForwarded internalConnectionCallback = pointinview.setInternalConnectionCallback();
                if (internalConnectionCallback == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                } else if (internalConnectionCallback == onTouchForwarded.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(pointinview.onConnected()));
                } else {
                    return Boolean.valueOf(pointinview.AudioAttributesImplApi26Parcelizer());
                }
            }
        };
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        AudioAttributesImplApi26Parcelizer = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }
        };
        final AnonymousClass5 r02 = new setSelector<Number>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return RemoteActionCompatParcelizer(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.onTransact((Number) obj);
            }

            private static Number RemoteActionCompatParcelizer(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) pointinview.write());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        };
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        write = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }
        };
        final AnonymousClass6 r03 = new setSelector<Number>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return read(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.onTransact((Number) obj);
            }

            private static Number read(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                try {
                    return Short.valueOf((short) pointinview.write());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        };
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        MediaSessionCompat$QueueItem = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }
        };
        final AnonymousClass7 r04 = new setSelector<Number>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return asInterface(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.onTransact((Number) obj);
            }

            private static Number asInterface(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                try {
                    return Integer.valueOf(pointinview.write());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        };
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        MediaDescriptionCompat = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }
        };
        final TypeAdapter$1 typeAdapter$13 = new TypeAdapter$1(new setSelector<AtomicInteger>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return read(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.RemoteActionCompatParcelizer((long) ((AtomicInteger) obj).get());
            }

            private static AtomicInteger read(pointInView pointinview) throws IOException {
                try {
                    return new AtomicInteger(pointinview.write());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        });
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        RemoteActionCompatParcelizer = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final TypeAdapter$1 typeAdapter$14 = new TypeAdapter$1(new setSelector<AtomicBoolean>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.RemoteActionCompatParcelizer(((AtomicBoolean) obj).get());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return new AtomicBoolean(pointinview.AudioAttributesImplApi26Parcelizer());
            }
        });
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        asInterface = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final TypeAdapter$1 typeAdapter$15 = new TypeAdapter$1(new setSelector<AtomicIntegerArray>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return onTransact(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                ontouchobserved.asBinder();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    ontouchobserved.RemoteActionCompatParcelizer((long) atomicIntegerArray.get(i));
                }
                ontouchobserved.RemoteActionCompatParcelizer();
            }

            private static AtomicIntegerArray onTransact(pointInView pointinview) throws IOException {
                ArrayList arrayList = new ArrayList();
                pointinview.asInterface();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    try {
                        arrayList.add(Integer.valueOf(pointinview.write()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                }
                pointinview.read();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }
        });
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        read = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass14 r05 = new setSelector<Character>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                Character ch = (Character) obj;
                ontouchobserved.RemoteActionCompatParcelizer(ch == null ? null : String.valueOf(ch));
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                String onConnected = pointinview.onConnected();
                if (onConnected.length() == 1) {
                    return Character.valueOf(onConnected.charAt(0));
                }
                StringBuilder sb = new StringBuilder("Expecting character, got: ");
                sb.append(onConnected);
                throw new JsonSyntaxException(sb.toString());
            }
        };
        final Class cls14 = Character.TYPE;
        final Class<Character> cls15 = Character.class;
        onConnectionSuspended = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }
        };
        final AnonymousClass15 r06 = new setSelector<String>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.RemoteActionCompatParcelizer((String) obj);
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                onTouchForwarded internalConnectionCallback = pointinview.setInternalConnectionCallback();
                if (internalConnectionCallback == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                } else if (internalConnectionCallback == onTouchForwarded.BOOLEAN) {
                    return Boolean.toString(pointinview.AudioAttributesImplApi26Parcelizer());
                } else {
                    return pointinview.onConnected();
                }
            }
        };
        final Class<String> cls16 = String.class;
        PlaybackStateCompat$CustomAction = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass18 r07 = new setSelector<StringBuilder>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                ontouchobserved.RemoteActionCompatParcelizer(sb == null ? null : sb.toString());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                    return new StringBuilder(pointinview.onConnected());
                }
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
        };
        final Class<StringBuilder> cls17 = StringBuilder.class;
        MediaMetadataCompat = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass19 r08 = new setSelector<StringBuffer>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                ontouchobserved.RemoteActionCompatParcelizer(stringBuffer == null ? null : stringBuffer.toString());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                    return new StringBuffer(pointinview.onConnected());
                }
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
        };
        final Class<StringBuffer> cls18 = StringBuffer.class;
        MediaSessionCompat$ResultReceiverWrapper = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass20 r09 = new setSelector<URL>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                URL url = (URL) obj;
                ontouchobserved.RemoteActionCompatParcelizer(url == null ? null : url.toExternalForm());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                String onConnected = pointinview.onConnected();
                if ("null".equals(onConnected)) {
                    return null;
                }
                return new URL(onConnected);
            }
        };
        final Class<URL> cls19 = URL.class;
        PlaybackStateCompat = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass21 r010 = new setSelector<URI>() {
            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return asInterface(pointinview);
            }

            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                URI uri = (URI) obj;
                ontouchobserved.RemoteActionCompatParcelizer(uri == null ? null : uri.toASCIIString());
            }

            private static URI asInterface(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                try {
                    String onConnected = pointinview.onConnected();
                    if ("null".equals(onConnected)) {
                        return null;
                    }
                    return new URI(onConnected);
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Throwable) e);
                }
            }
        };
        final Class<URI> cls20 = URI.class;
        Cancellable = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass22 r011 = new setSelector<InetAddress>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                ontouchobserved.RemoteActionCompatParcelizer(inetAddress == null ? null : inetAddress.getHostAddress());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                    return InetAddress.getByName(pointinview.onConnected());
                }
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
        };
        final Class<InetAddress> cls21 = InetAddress.class;
        MediaBrowserCompat$ItemReceiver = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r0);
                sb.append("]");
                return sb.toString();
            }

            public final <T2> setSelector<T2> asInterface(Gson gson, toGlobalMotionEvent<T2> toglobalmotionevent) {
                final Class<? super T> cls = toglobalmotionevent.asBinder;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new setSelector<T1>() {
                    public final void asBinder(onTouchObserved ontouchobserved, T1 t1) throws IOException {
                        r0.asBinder(ontouchobserved, t1);
                    }

                    public final T1 asBinder(pointInView pointinview) throws IOException {
                        T1 asBinder = r0.asBinder(pointinview);
                        if (asBinder == null || cls.isInstance(asBinder)) {
                            return asBinder;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(cls.getName());
                        sb.append(" but was ");
                        sb.append(asBinder.getClass().getName());
                        throw new JsonSyntaxException(sb.toString());
                    }
                };
            }
        };
        final AnonymousClass23 r012 = new setSelector<UUID>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                ontouchobserved.RemoteActionCompatParcelizer(uuid == null ? null : uuid.toString());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                    return UUID.fromString(pointinview.onConnected());
                }
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
        };
        final Class<UUID> cls22 = UUID.class;
        ParcelableVolumeInfo = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final TypeAdapter$1 typeAdapter$16 = new TypeAdapter$1(new setSelector<Currency>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                ontouchobserved.RemoteActionCompatParcelizer(((Currency) obj).getCurrencyCode());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return Currency.getInstance(pointinview.onConnected());
            }
        });
        final Class<Currency> cls23 = Currency.class;
        onConnectionFailed = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass25 r013 = new setSelector<Calendar>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    ontouchobserved.onTransact();
                    return;
                }
                ontouchobserved.read();
                ontouchobserved.onTransact("year");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(1));
                ontouchobserved.onTransact("month");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(2));
                ontouchobserved.onTransact("dayOfMonth");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(5));
                ontouchobserved.onTransact("hourOfDay");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(11));
                ontouchobserved.onTransact("minute");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(12));
                ontouchobserved.onTransact("second");
                ontouchobserved.RemoteActionCompatParcelizer((long) calendar.get(13));
                ontouchobserved.asInterface();
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                pointinview.asBinder();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (pointinview.setInternalConnectionCallback() != onTouchForwarded.END_OBJECT) {
                    String onConnectionFailed = pointinview.onConnectionFailed();
                    int write = pointinview.write();
                    if ("year".equals(onConnectionFailed)) {
                        i = write;
                    } else if ("month".equals(onConnectionFailed)) {
                        i2 = write;
                    } else if ("dayOfMonth".equals(onConnectionFailed)) {
                        i3 = write;
                    } else if ("hourOfDay".equals(onConnectionFailed)) {
                        i4 = write;
                    } else if ("minute".equals(onConnectionFailed)) {
                        i5 = write;
                    } else if ("second".equals(onConnectionFailed)) {
                        i6 = write;
                    }
                }
                pointinview.onTransact();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
        };
        final Class<Calendar> cls24 = Calendar.class;
        final Class<GregorianCalendar> cls25 = GregorianCalendar.class;
        AudioAttributesCompatParcelizer = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls24.getName());
                sb.append("+");
                sb.append(cls25.getName());
                sb.append(",adapter=");
                sb.append(r013);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == cls24 || cls == cls25) {
                    return r013;
                }
                return null;
            }
        };
        final AnonymousClass26 r014 = new setSelector<Locale>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                ontouchobserved.RemoteActionCompatParcelizer(locale == null ? null : locale.toString());
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                String str = null;
                if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(pointinview.onConnected(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }
        };
        final Class<Locale> cls26 = Locale.class;
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == r1) {
                    return r2;
                }
                return null;
            }
        };
        final AnonymousClass27 r015 = new setSelector<hasWindowFocus>() {
            /* access modifiers changed from: private */
            /* renamed from: RemoteActionCompatParcelizer */
            public hasWindowFocus asBinder(pointInView pointinview) throws IOException {
                if (pointinview instanceof EmojiCompatConfigurationView) {
                    EmojiCompatConfigurationView emojiCompatConfigurationView = (EmojiCompatConfigurationView) pointinview;
                    onTouchForwarded internalConnectionCallback = emojiCompatConfigurationView.setInternalConnectionCallback();
                    if (internalConnectionCallback == onTouchForwarded.NAME || internalConnectionCallback == onTouchForwarded.END_ARRAY || internalConnectionCallback == onTouchForwarded.END_OBJECT || internalConnectionCallback == onTouchForwarded.END_DOCUMENT) {
                        StringBuilder sb = new StringBuilder("Unexpected ");
                        sb.append(internalConnectionCallback);
                        sb.append(" when reading a JsonElement.");
                        throw new IllegalStateException(sb.toString());
                    }
                    hasWindowFocus haswindowfocus = (hasWindowFocus) emojiCompatConfigurationView.read[emojiCompatConfigurationView.RemoteActionCompatParcelizer - 1];
                    emojiCompatConfigurationView.onConnectionSuspended();
                    return haswindowfocus;
                }
                switch (AnonymousClass34.RemoteActionCompatParcelizer[pointinview.setInternalConnectionCallback().ordinal()]) {
                    case 1:
                        return new isFocused((Number) new DropDownListView.PreApi33Impl(pointinview.onConnected()));
                    case 2:
                        return new isFocused(Boolean.valueOf(pointinview.AudioAttributesImplApi26Parcelizer()));
                    case 3:
                        return new isFocused(pointinview.onConnected());
                    case 4:
                        pointinview.AudioAttributesImplBaseParcelizer();
                        return hasFocus.asInterface;
                    case 5:
                        setSelectorEnabled setselectorenabled = new setSelectorEnabled();
                        pointinview.asInterface();
                        while (pointinview.AudioAttributesCompatParcelizer()) {
                            Object RemoteActionCompatParcelizer = asBinder(pointinview);
                            if (RemoteActionCompatParcelizer == null) {
                                RemoteActionCompatParcelizer = hasFocus.asInterface;
                            }
                            setselectorenabled.asBinder.add(RemoteActionCompatParcelizer);
                        }
                        pointinview.read();
                        return setselectorenabled;
                    case 6:
                        dispatchDraw dispatchdraw = new dispatchDraw();
                        pointinview.asBinder();
                        while (pointinview.AudioAttributesCompatParcelizer()) {
                            String onConnectionFailed = pointinview.onConnectionFailed();
                            Object RemoteActionCompatParcelizer2 = asBinder(pointinview);
                            post<String, hasWindowFocus> post = dispatchdraw.asInterface;
                            if (RemoteActionCompatParcelizer2 == null) {
                                RemoteActionCompatParcelizer2 = hasFocus.asInterface;
                            }
                            post.put(onConnectionFailed, RemoteActionCompatParcelizer2);
                        }
                        pointinview.onTransact();
                        return dispatchdraw;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: asInterface */
            public void asBinder(onTouchObserved ontouchobserved, hasWindowFocus haswindowfocus) throws IOException {
                boolean z;
                if (haswindowfocus == null || (haswindowfocus instanceof hasFocus)) {
                    ontouchobserved.onTransact();
                } else if (haswindowfocus instanceof isFocused) {
                    isFocused write = haswindowfocus.write();
                    if (write.asBinder instanceof Number) {
                        ontouchobserved.onTransact(write.asBinder());
                    } else if (write.asBinder instanceof Boolean) {
                        if (write.asBinder instanceof Boolean) {
                            z = ((Boolean) write.asBinder).booleanValue();
                        } else {
                            z = Boolean.parseBoolean(write.IconCompatParcelizer());
                        }
                        ontouchobserved.RemoteActionCompatParcelizer(z);
                    } else {
                        ontouchobserved.RemoteActionCompatParcelizer(write.IconCompatParcelizer());
                    }
                } else {
                    boolean z2 = haswindowfocus instanceof setSelectorEnabled;
                    if (z2) {
                        ontouchobserved.asBinder();
                        if (z2) {
                            Iterator<hasWindowFocus> it = ((setSelectorEnabled) haswindowfocus).iterator();
                            while (it.hasNext()) {
                                asBinder(ontouchobserved, it.next());
                            }
                            ontouchobserved.RemoteActionCompatParcelizer();
                            return;
                        }
                        StringBuilder sb = new StringBuilder("Not a JSON Array: ");
                        sb.append(haswindowfocus);
                        throw new IllegalStateException(sb.toString());
                    } else if (haswindowfocus instanceof dispatchDraw) {
                        ontouchobserved.read();
                        for (Map.Entry next : haswindowfocus.AudioAttributesImplApi21Parcelizer().asInterface.entrySet()) {
                            ontouchobserved.onTransact((String) next.getKey());
                            asBinder(ontouchobserved, (hasWindowFocus) next.getValue());
                        }
                        ontouchobserved.asInterface();
                    } else {
                        StringBuilder sb2 = new StringBuilder("Couldn't write ");
                        sb2.append(haswindowfocus.getClass());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        };
        MediaBrowserCompat$CustomActionResultReceiver = r015;
        final Class<hasWindowFocus> cls27 = hasWindowFocus.class;
        MediaBrowserCompat$MediaItem = new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls27.getName());
                sb.append(",adapter=");
                sb.append(r015);
                sb.append("]");
                return sb.toString();
            }

            public final <T2> setSelector<T2> asInterface(Gson gson, toGlobalMotionEvent<T2> toglobalmotionevent) {
                final Class<? super T> cls = toglobalmotionevent.asBinder;
                if (!cls27.isAssignableFrom(cls)) {
                    return null;
                }
                return new setSelector<T1>() {
                    public final void asBinder(onTouchObserved ontouchobserved, T1 t1) throws IOException {
                        r015.asBinder(ontouchobserved, t1);
                    }

                    public final T1 asBinder(pointInView pointinview) throws IOException {
                        T1 asBinder = r015.asBinder(pointinview);
                        if (asBinder == null || cls.isInstance(asBinder)) {
                            return asBinder;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(cls.getName());
                        sb.append(" but was ");
                        sb.append(asBinder.getClass().getName());
                        throw new JsonSyntaxException(sb.toString());
                    }
                };
            }
        };
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34  reason: invalid class name */
    static /* synthetic */ class AnonymousClass34 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.onTouchForwarded[] r0 = o.onTouchForwarded.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                RemoteActionCompatParcelizer = r0
                o.onTouchForwarded r1 = o.onTouchForwarded.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.onTouchForwarded r1 = o.onTouchForwarded.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.onTouchForwarded r1 = o.onTouchForwarded.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.onTouchForwarded r1 = o.onTouchForwarded.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                o.onTouchForwarded r1 = o.onTouchForwarded.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.onTouchForwarded r1 = o.onTouchForwarded.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.onTouchForwarded r1 = o.onTouchForwarded.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.onTouchForwarded r1 = o.onTouchForwarded.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x006c }
                o.onTouchForwarded r1 = o.onTouchForwarded.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = RemoteActionCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.onTouchForwarded r1 = o.onTouchForwarded.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass34.<clinit>():void");
        }
    }

    static final class EnumTypeAdapter<T extends Enum<T>> extends setSelector<T> {
        private final Map<T, String> asBinder = new HashMap();
        private final Map<String, T> onTransact = new HashMap();

        public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
            Enum enumR = (Enum) obj;
            ontouchobserved.RemoteActionCompatParcelizer(enumR == null ? null : this.asBinder.get(enumR));
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (final Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new PrivilegedAction<Void>() {
                            public final /* synthetic */ Object run() {
                                field.setAccessible(true);
                                return null;
                            }
                        });
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        canPositionSelectorForHoveredItem canpositionselectorforhovereditem = (canPositionSelectorForHoveredItem) field.getAnnotation(canPositionSelectorForHoveredItem.class);
                        if (canpositionselectorforhovereditem != null) {
                            name = canpositionselectorforhovereditem.onTransact();
                            for (String put : canpositionselectorforhovereditem.asInterface()) {
                                this.onTransact.put(put, enumR);
                            }
                        }
                        this.onTransact.put(name, enumR);
                        this.asBinder.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
            if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                return (Enum) this.onTransact.get(pointinview.onConnected());
            }
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29  reason: invalid class name */
    class AnonymousClass29 implements setListSelectionHidden {
        private /* synthetic */ setSelector RemoteActionCompatParcelizer;
        private /* synthetic */ toGlobalMotionEvent read;

        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.equals(this.read)) {
                return this.RemoteActionCompatParcelizer;
            }
            return null;
        }
    }

    public static <TT> setListSelectionHidden asInterface(final Class<TT> cls, final setSelector<TT> setselector) {
        return new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(setselector);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                if (toglobalmotionevent.asBinder == cls) {
                    return setselector;
                }
                return null;
            }
        };
    }

    public static <TT> setListSelectionHidden asInterface(final Class<TT> cls, final Class<TT> cls2, final setSelector<? super TT> setselector) {
        return new setListSelectionHidden() {
            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(setselector);
                sb.append("]");
                return sb.toString();
            }

            public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
                Class<? super T> cls = toglobalmotionevent.asBinder;
                if (cls == cls || cls == cls2) {
                    return setselector;
                }
                return null;
            }
        };
    }
}
