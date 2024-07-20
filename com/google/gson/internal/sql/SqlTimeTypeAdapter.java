package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o.onTouchForwarded;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public final class SqlTimeTypeAdapter extends setSelector<Time> {
    public static final setListSelectionHidden read = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.asBinder == Time.class) {
                return new SqlTimeTypeAdapter((byte) 0);
            }
            return null;
        }
    };
    private final DateFormat asBinder;

    /* synthetic */ SqlTimeTypeAdapter(byte b) {
        this();
    }

    public final /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        Time time = (Time) obj;
        synchronized (this) {
            ontouchobserved.RemoteActionCompatParcelizer(time == null ? null : this.asBinder.format(time));
        }
    }

    private SqlTimeTypeAdapter() {
        this.asBinder = new SimpleDateFormat("hh:mm:ss a");
    }

    /* access modifiers changed from: private */
    /* renamed from: asInterface */
    public Time asBinder(pointInView pointinview) throws IOException {
        synchronized (this) {
            if (pointinview.setInternalConnectionCallback() == onTouchForwarded.NULL) {
                pointinview.AudioAttributesImplBaseParcelizer();
                return null;
            }
            try {
                Time time = new Time(this.asBinder.parse(pointinview.onConnected()).getTime());
                return time;
            } catch (ParseException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }
}
