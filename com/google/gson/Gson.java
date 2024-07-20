package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import o.hasWindowFocus;
import o.isIconfiedByDefault;
import o.isSelectedChildViewEnabled;
import o.lookForSelectablePosition;
import o.measureHeightOfChildrenCompat;
import o.onForwardedEvent;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.positionSelectorLikeTouchCompat;
import o.setListSelectionHidden;
import o.setOnBackInvokedDispatcher;
import o.setSelector;
import o.superSetSelectedChildViewEnabled;
import o.toGlobalMotionEvent;
import o.toLocalMotionEvent;
import o.updateSelectorStateCompat;

public class Gson {
    private static toGlobalMotionEvent<?> asInterface = new toGlobalMotionEvent<>(Object.class);
    private isSelectedChildViewEnabled AudioAttributesCompatParcelizer;
    private ThreadLocal<Map<toGlobalMotionEvent<?>, FutureTypeAdapter<?>>> AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private Excluder AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private JsonAdapterAnnotationTypeAdapterFactory MediaBrowserCompat$ItemReceiver;
    private measureHeightOfChildrenCompat MediaBrowserCompat$MediaItem;
    private measureHeightOfChildrenCompat MediaBrowserCompat$SearchResultReceiver;
    private int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private onForwardedEvent MediaDescriptionCompat;
    private boolean MediaSessionCompat$QueueItem;
    private Map<toGlobalMotionEvent<?>, setSelector<?>> MediaSessionCompat$ResultReceiverWrapper;
    private boolean RatingCompat;
    public final updateSelectorStateCompat RemoteActionCompatParcelizer;
    private List<setListSelectionHidden> asBinder;
    private boolean onConnected;
    private List<setListSelectionHidden> onConnectionFailed;
    private boolean onConnectionSuspended;
    private List<setListSelectionHidden> onTransact;
    public final boolean read;
    private Map<Type, superSetSelectedChildViewEnabled<?>> setInternalConnectionCallback;
    private boolean write;

    public Gson() {
        this(Excluder.asBinder, positionSelectorLikeTouchCompat.asBinder, Collections.emptyMap(), false, false, false, true, false, false, false, onForwardedEvent.read, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), lookForSelectablePosition.asBinder, lookForSelectablePosition.read);
    }

    public Gson(Excluder excluder, updateSelectorStateCompat updateselectorstatecompat, Map<Type, superSetSelectedChildViewEnabled<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, onForwardedEvent onforwardedevent, String str, int i, int i2, List<setListSelectionHidden> list, List<setListSelectionHidden> list2, List<setListSelectionHidden> list3, measureHeightOfChildrenCompat measureheightofchildrencompat, measureHeightOfChildrenCompat measureheightofchildrencompat2) {
        final setSelector setselector;
        setSelector setselector2;
        setSelector setselector3;
        boolean z8 = z2;
        boolean z9 = z7;
        onForwardedEvent onforwardedevent2 = onforwardedevent;
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new isIconfiedByDefault());
        this.AudioAttributesImplApi21Parcelizer = new ThreadLocal<>();
        this.MediaSessionCompat$ResultReceiverWrapper = new ConcurrentHashMap();
        this.AudioAttributesImplBaseParcelizer = excluder;
        this.RemoteActionCompatParcelizer = updateselectorstatecompat;
        this.setInternalConnectionCallback = map;
        isSelectedChildViewEnabled isselectedchildviewenabled = new isSelectedChildViewEnabled(map);
        this.AudioAttributesCompatParcelizer = isselectedchildviewenabled;
        this.MediaSessionCompat$QueueItem = z;
        this.write = z8;
        this.onConnected = z3;
        this.onConnectionSuspended = z4;
        this.MediaBrowserCompat$CustomActionResultReceiver = z5;
        this.read = z6;
        this.RatingCompat = z9;
        this.MediaDescriptionCompat = onforwardedevent2;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.IconCompatParcelizer = i;
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = i2;
        this.onTransact = list;
        this.asBinder = list2;
        this.MediaBrowserCompat$SearchResultReceiver = measureheightofchildrencompat;
        this.MediaBrowserCompat$MediaItem = measureheightofchildrencompat2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(TypeAdapters.MediaBrowserCompat$MediaItem);
        arrayList2.add(ObjectTypeAdapter.onTransact(measureheightofchildrencompat));
        arrayList2.add(excluder);
        arrayList2.addAll(arrayList);
        arrayList2.add(TypeAdapters.PlaybackStateCompat$CustomAction);
        arrayList2.add(TypeAdapters.MediaDescriptionCompat);
        arrayList2.add(TypeAdapters.AudioAttributesImplApi26Parcelizer);
        arrayList2.add(TypeAdapters.write);
        arrayList2.add(TypeAdapters.MediaSessionCompat$QueueItem);
        if (onforwardedevent2 == onForwardedEvent.read) {
            setselector = TypeAdapters.RatingCompat;
        } else {
            setselector = new setSelector<Number>() {
                public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        ontouchobserved.onTransact();
                    } else {
                        ontouchobserved.RemoteActionCompatParcelizer(number.toString());
                    }
                }

                public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                    if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                        return Long.valueOf(pointinview.IconCompatParcelizer());
                    }
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
            };
        }
        arrayList2.add(TypeAdapters.asInterface(Long.TYPE, Long.class, setselector));
        Class cls = Double.TYPE;
        if (z9) {
            setselector2 = TypeAdapters.setInternalConnectionCallback;
        } else {
            setselector2 = new setSelector<Number>() {
                public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        ontouchobserved.onTransact();
                        return;
                    }
                    Gson.asInterface(number.doubleValue());
                    ontouchobserved.onTransact(number);
                }

                public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                    if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                        return Double.valueOf(pointinview.AudioAttributesImplApi21Parcelizer());
                    }
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
            };
        }
        arrayList2.add(TypeAdapters.asInterface(cls, Double.class, setselector2));
        Class cls2 = Float.TYPE;
        if (z9) {
            setselector3 = TypeAdapters.MediaBrowserCompat$SearchResultReceiver;
        } else {
            setselector3 = new setSelector<Number>() {
                public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        ontouchobserved.onTransact();
                        return;
                    }
                    Gson.asInterface((double) number.floatValue());
                    ontouchobserved.onTransact(number);
                }

                public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                    if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
                        return Float.valueOf((float) pointinview.AudioAttributesImplApi21Parcelizer());
                    }
                    pointinview.AudioAttributesImplBaseParcelizer();
                    return null;
                }
            };
        }
        arrayList2.add(TypeAdapters.asInterface(cls2, Float.class, setselector3));
        arrayList2.add(NumberTypeAdapter.asInterface(measureheightofchildrencompat2));
        arrayList2.add(TypeAdapters.RemoteActionCompatParcelizer);
        arrayList2.add(TypeAdapters.asInterface);
        arrayList2.add(TypeAdapters.asInterface(AtomicLong.class, new TypeAdapter$1(new setSelector<AtomicLong>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                setSelector.this.asBinder(ontouchobserved, Long.valueOf(((AtomicLong) obj).get()));
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                return new AtomicLong(((Number) setSelector.this.asBinder(pointinview)).longValue());
            }
        })));
        arrayList2.add(TypeAdapters.asInterface(AtomicLongArray.class, new TypeAdapter$1(new setSelector<AtomicLongArray>() {
            public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                ontouchobserved.asBinder();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    setSelector.this.asBinder(ontouchobserved, Long.valueOf(atomicLongArray.get(i)));
                }
                ontouchobserved.RemoteActionCompatParcelizer();
            }

            public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
                ArrayList arrayList = new ArrayList();
                pointinview.asInterface();
                while (pointinview.AudioAttributesCompatParcelizer()) {
                    arrayList.add(Long.valueOf(((Number) setSelector.this.asBinder(pointinview)).longValue()));
                }
                pointinview.read();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        })));
        arrayList2.add(TypeAdapters.read);
        arrayList2.add(TypeAdapters.onConnectionSuspended);
        arrayList2.add(TypeAdapters.MediaMetadataCompat);
        arrayList2.add(TypeAdapters.MediaSessionCompat$ResultReceiverWrapper);
        arrayList2.add(TypeAdapters.asInterface(BigDecimal.class, TypeAdapters.onTransact));
        arrayList2.add(TypeAdapters.asInterface(BigInteger.class, TypeAdapters.asBinder));
        arrayList2.add(TypeAdapters.PlaybackStateCompat);
        arrayList2.add(TypeAdapters.Cancellable);
        arrayList2.add(TypeAdapters.ParcelableVolumeInfo);
        arrayList2.add(TypeAdapters.onConnectionFailed);
        arrayList2.add(TypeAdapters.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        arrayList2.add(TypeAdapters.MediaBrowserCompat$ItemReceiver);
        arrayList2.add(TypeAdapters.AudioAttributesImplApi21Parcelizer);
        arrayList2.add(DateTypeAdapter.asInterface);
        arrayList2.add(TypeAdapters.AudioAttributesCompatParcelizer);
        if (toLocalMotionEvent.asBinder) {
            arrayList2.add(toLocalMotionEvent.AudioAttributesImplApi21Parcelizer);
            arrayList2.add(toLocalMotionEvent.asInterface);
            arrayList2.add(toLocalMotionEvent.read);
        }
        arrayList2.add(ArrayTypeAdapter.RemoteActionCompatParcelizer);
        arrayList2.add(TypeAdapters.onConnected);
        arrayList2.add(new CollectionTypeAdapterFactory(isselectedchildviewenabled));
        arrayList2.add(new MapTypeAdapterFactory(isselectedchildviewenabled, z8));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(isselectedchildviewenabled);
        this.MediaBrowserCompat$ItemReceiver = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList2.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList2.add(TypeAdapters.AudioAttributesImplBaseParcelizer);
        arrayList2.add(new ReflectiveTypeAdapterFactory(isselectedchildviewenabled, updateselectorstatecompat, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.onConnectionFailed = Collections.unmodifiableList(arrayList2);
    }

    static void asInterface(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <T> setSelector<T> read(toGlobalMotionEvent<T> toglobalmotionevent) {
        boolean z;
        setSelector<T> setselector = this.MediaSessionCompat$ResultReceiverWrapper.get(toglobalmotionevent == null ? asInterface : toglobalmotionevent);
        if (setselector != null) {
            return setselector;
        }
        Map map = this.AudioAttributesImplApi21Parcelizer.get();
        if (map == null) {
            map = new HashMap();
            this.AudioAttributesImplApi21Parcelizer.set(map);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(toglobalmotionevent);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(toglobalmotionevent, futureTypeAdapter2);
            for (setListSelectionHidden asInterface2 : this.onConnectionFailed) {
                setSelector<T> asInterface3 = asInterface2.asInterface(this, toglobalmotionevent);
                if (asInterface3 != null) {
                    if (futureTypeAdapter2.asInterface == null) {
                        futureTypeAdapter2.asInterface = asInterface3;
                        this.MediaSessionCompat$ResultReceiverWrapper.put(toglobalmotionevent, asInterface3);
                        return asInterface3;
                    }
                    throw new AssertionError();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GSON (2.8.9) cannot handle ");
            sb.append(toglobalmotionevent);
            throw new IllegalArgumentException(sb.toString());
        } finally {
            map.remove(toglobalmotionevent);
            if (z) {
                this.AudioAttributesImplApi21Parcelizer.remove();
            }
        }
    }

    public final <T> setSelector<T> asInterface(setListSelectionHidden setlistselectionhidden, toGlobalMotionEvent<T> toglobalmotionevent) {
        if (!this.onConnectionFailed.contains(setlistselectionhidden)) {
            setlistselectionhidden = this.MediaBrowserCompat$ItemReceiver;
        }
        boolean z = false;
        for (setListSelectionHidden next : this.onConnectionFailed) {
            if (z) {
                setSelector<T> asInterface2 = next.asInterface(this, toglobalmotionevent);
                if (asInterface2 != null) {
                    return asInterface2;
                }
            } else if (next == setlistselectionhidden) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(toglobalmotionevent);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String read(Object obj, Type type) {
        onTouchObserved RemoteActionCompatParcelizer2;
        boolean z;
        boolean z2;
        boolean z3;
        StringWriter stringWriter = new StringWriter();
        try {
            RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((Writer) stringWriter);
            setSelector read2 = read(new toGlobalMotionEvent(type));
            z = RemoteActionCompatParcelizer2.asInterface;
            RemoteActionCompatParcelizer2.asInterface = true;
            z2 = RemoteActionCompatParcelizer2.read;
            RemoteActionCompatParcelizer2.read = this.onConnectionSuspended;
            z3 = RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = this.MediaSessionCompat$QueueItem;
            read2.asBinder(RemoteActionCompatParcelizer2, obj);
            RemoteActionCompatParcelizer2.asInterface = z;
            RemoteActionCompatParcelizer2.read = z2;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = z3;
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.9): ");
            sb.append(e2.getMessage());
            AssertionError assertionError = new AssertionError(sb.toString());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (IOException e3) {
            throw new JsonIOException((Throwable) e3);
        } catch (Throwable th) {
            RemoteActionCompatParcelizer2.asInterface = z;
            RemoteActionCompatParcelizer2.read = z2;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = z3;
            throw th;
        }
    }

    public final String RemoteActionCompatParcelizer(hasWindowFocus haswindowfocus) {
        onTouchObserved RemoteActionCompatParcelizer2;
        boolean z;
        boolean z2;
        boolean z3;
        StringWriter stringWriter = new StringWriter();
        try {
            RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((Writer) stringWriter);
            z = RemoteActionCompatParcelizer2.asInterface;
            RemoteActionCompatParcelizer2.asInterface = true;
            z2 = RemoteActionCompatParcelizer2.read;
            RemoteActionCompatParcelizer2.read = this.onConnectionSuspended;
            z3 = RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = this.MediaSessionCompat$QueueItem;
            TypeAdapters.MediaBrowserCompat$CustomActionResultReceiver.asBinder(RemoteActionCompatParcelizer2, haswindowfocus);
            RemoteActionCompatParcelizer2.asInterface = z;
            RemoteActionCompatParcelizer2.read = z2;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = z3;
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.9): ");
            sb.append(e2.getMessage());
            AssertionError assertionError = new AssertionError(sb.toString());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (IOException e3) {
            throw new JsonIOException((Throwable) e3);
        } catch (Throwable th) {
            RemoteActionCompatParcelizer2.asInterface = z;
            RemoteActionCompatParcelizer2.read = z2;
            RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = z3;
            throw th;
        }
    }

    public final onTouchObserved RemoteActionCompatParcelizer(Writer writer) throws IOException {
        if (this.onConnected) {
            writer.write(")]}'\n");
        }
        onTouchObserved ontouchobserved = new onTouchObserved(writer);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            ontouchobserved.onTransact = "  ";
            ontouchobserved.AudioAttributesCompatParcelizer = ": ";
        }
        ontouchobserved.AudioAttributesImplApi21Parcelizer = this.MediaSessionCompat$QueueItem;
        return ontouchobserved;
    }

    static class FutureTypeAdapter<T> extends setSelector<T> {
        setSelector<T> asInterface;

        FutureTypeAdapter() {
        }

        public final T asBinder(pointInView pointinview) throws IOException {
            setSelector<T> setselector = this.asInterface;
            if (setselector != null) {
                return setselector.asBinder(pointinview);
            }
            throw new IllegalStateException();
        }

        public final void asBinder(onTouchObserved ontouchobserved, T t) throws IOException {
            setSelector<T> setselector = this.asInterface;
            if (setselector != null) {
                setselector.asBinder(ontouchobserved, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(",factories:");
        sb.append(this.onConnectionFailed);
        sb.append(",instanceCreators:");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = new java.lang.StringBuilder("AssertionError (GSON 2.8.9): ");
        r2.append(r6.getMessage());
        r1 = new java.lang.AssertionError(r2.toString());
        r1.initCause(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r5.asBinder = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r5.asBinder = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[ExcHandler: AssertionError (r6v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a A[Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e, all -> 0x001c }, ExcHandler: IOException (r6v4 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041 A[Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e, all -> 0x001c }, ExcHandler: IllegalStateException (r6v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T asInterface(o.pointInView r5, java.lang.reflect.Type r6) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        /*
            r4 = this;
            boolean r0 = r5.asBinder
            r1 = 1
            r5.asBinder = r1
            r2 = 0
            r5.setInternalConnectionCallback()     // Catch:{ EOFException -> 0x0048, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e }
            o.toGlobalMotionEvent r1 = new o.toGlobalMotionEvent     // Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e }
            r1.<init>(r6)     // Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e }
            o.setSelector r6 = r4.read(r1)     // Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e }
            java.lang.Object r6 = r6.asBinder(r5)     // Catch:{ EOFException -> 0x0019, IllegalStateException -> 0x0041, IOException -> 0x003a, AssertionError -> 0x001e }
            r5.asBinder = r0
            return r6
        L_0x0019:
            r6 = move-exception
            r1 = 0
            goto L_0x0049
        L_0x001c:
            r6 = move-exception
            goto L_0x0055
        L_0x001e:
            r6 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x001c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
            java.lang.String r3 = "AssertionError (GSON 2.8.9): "
            r2.<init>(r3)     // Catch:{ all -> 0x001c }
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x001c }
            r2.append(r3)     // Catch:{ all -> 0x001c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x001c }
            r1.<init>(r2)     // Catch:{ all -> 0x001c }
            r1.initCause(r6)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x003a:
            r6 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001c }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0041:
            r6 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001c }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0048:
            r6 = move-exception
        L_0x0049:
            if (r1 == 0) goto L_0x004f
            r5.asBinder = r0
            r5 = 0
            return r5
        L_0x004f:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001c }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0055:
            r5.asBinder = r0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.asInterface(o.pointInView, java.lang.reflect.Type):java.lang.Object");
    }

    public final <T> T asBinder(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        pointInView pointinview = new pointInView(reader);
        pointinview.asBinder = this.read;
        T asInterface2 = asInterface(pointinview, type);
        if (asInterface2 != null) {
            try {
                if (pointinview.setInternalConnectionCallback() != onTouchForwarded.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
        return asInterface2;
    }

    public final <T> T read(String str, Class<T> cls) throws JsonSyntaxException {
        T t;
        if (str == null) {
            t = null;
        } else {
            t = asBinder(new StringReader(str), cls);
        }
        return setOnBackInvokedDispatcher.asBinder(cls).cast(t);
    }
}
