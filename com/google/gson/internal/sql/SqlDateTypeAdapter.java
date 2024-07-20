package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class SqlDateTypeAdapter extends setSelector<Date> {
    public static final setListSelectionHidden RemoteActionCompatParcelizer = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.asBinder == Date.class) {
                return new SqlDateTypeAdapter((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat read;

    /* synthetic */ SqlDateTypeAdapter(byte b) {
        this();
    }

    public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            ontouchobserved.RemoteActionCompatParcelizer(date == null ? null : this.read.format(date));
        }
    }

    private SqlDateTypeAdapter() {
        this.read = new SimpleDateFormat("MMM d, yyyy");
    }

    /* access modifiers changed from: private */
    /* renamed from: read */
    public Date asBinder(pointInView pointinview) throws IOException {
        synchronized (this) {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            try {
                Date date = new Date(this.read.parse(pointinview.onConnected()).getTime());
                return date;
            } catch (ParseException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }
}
