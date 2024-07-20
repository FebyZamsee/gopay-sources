package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.DropDownListView;
import o.FitWindowsViewGroup;
import o.onCreateView;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setSelector;

public final class DefaultDateTypeAdapter<T extends Date> extends setSelector<T> {
    private final RemoteActionCompatParcelizer<T> asBinder;
    private final List<DateFormat> onTransact;

    public /* synthetic */ DefaultDateTypeAdapter(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, byte b) {
        this(remoteActionCompatParcelizer, i, i2);
    }

    public /* synthetic */ DefaultDateTypeAdapter(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, byte b) {
        this(remoteActionCompatParcelizer, str);
    }

    public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            ontouchobserved.onTransact();
            return;
        }
        synchronized (this.onTransact) {
            ontouchobserved.RemoteActionCompatParcelizer(this.onTransact.get(0).format(date));
        }
    }

    public static abstract class RemoteActionCompatParcelizer<T extends Date> {
        public static final RemoteActionCompatParcelizer<Date> read = new RemoteActionCompatParcelizer<Date>(Date.class) {
            /* access modifiers changed from: protected */
            public final Date onTransact(Date date) {
                return date;
            }
        };
        public final Class<T> RemoteActionCompatParcelizer;

        /* access modifiers changed from: protected */
        public abstract T onTransact(Date date);

        public RemoteActionCompatParcelizer(Class<T> cls) {
            this.RemoteActionCompatParcelizer = cls;
        }
    }

    private DefaultDateTypeAdapter(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, String str) {
        ArrayList arrayList = new ArrayList();
        this.onTransact = arrayList;
        this.asBinder = remoteActionCompatParcelizer;
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private DefaultDateTypeAdapter(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.onTransact = arrayList;
        this.asBinder = remoteActionCompatParcelizer;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (DropDownListView.Api33Impl.RemoteActionCompatParcelizer()) {
            arrayList.add(onCreateView.read.asInterface(i, i2));
        }
    }

    private Date asBinder(String str) {
        synchronized (this.onTransact) {
            for (DateFormat parse : this.onTransact) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return FitWindowsViewGroup.asInterface(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.onTransact.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
        if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
            pointinview.AudioAttributesImplBaseParcelizer();
            return null;
        }
        return this.asBinder.onTransact(asBinder(pointinview.onConnected()));
    }
}
