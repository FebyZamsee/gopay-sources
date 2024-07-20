package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
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
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class DateTypeAdapter extends setSelector<Date> {
    public static final setListSelectionHidden asInterface = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.asBinder == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> asBinder;

    public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                ontouchobserved.onTransact();
            } else {
                ontouchobserved.RemoteActionCompatParcelizer(this.asBinder.get(0).format(date));
            }
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.asBinder = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (DropDownListView.Api33Impl.RemoteActionCompatParcelizer()) {
            arrayList.add(onCreateView.read.asInterface(2, 2));
        }
    }

    private Date RemoteActionCompatParcelizer(String str) {
        synchronized (this) {
            for (DateFormat parse : this.asBinder) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date asInterface2 = FitWindowsViewGroup.asInterface(str, new ParsePosition(0));
                return asInterface2;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
        if (pointinview.setInternalConnectionCallback() != onTouchForwarded.NULL) {
            return RemoteActionCompatParcelizer(pointinview.onConnected());
        }
        pointinview.AudioAttributesImplBaseParcelizer();
        return null;
    }
}
