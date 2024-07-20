package com.google.gson.internal.sql;

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import o.onTouchObserved;
import o.pointInView;
import o.setListSelectionHidden;
import o.setSelector;
import o.toGlobalMotionEvent;

public class SqlTimestampTypeAdapter extends setSelector<Timestamp> {
    public static final setListSelectionHidden read = new setListSelectionHidden() {
        public final <T> setSelector<T> asInterface(Gson gson, toGlobalMotionEvent<T> toglobalmotionevent) {
            if (toglobalmotionevent.asBinder == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.read(new toGlobalMotionEvent(Date.class)), (byte) 0);
            }
            return null;
        }
    };
    private final setSelector<Date> RemoteActionCompatParcelizer;

    /* synthetic */ SqlTimestampTypeAdapter(setSelector setselector, byte b) {
        this(setselector);
    }

    public final /* bridge */ /* synthetic */ void asBinder(onTouchObserved ontouchobserved, Object obj) throws IOException {
        this.RemoteActionCompatParcelizer.asBinder(ontouchobserved, (Timestamp) obj);
    }

    private SqlTimestampTypeAdapter(setSelector<Date> setselector) {
        this.RemoteActionCompatParcelizer = setselector;
    }

    public final /* synthetic */ Object asBinder(pointInView pointinview) throws IOException {
        Date asBinder = this.RemoteActionCompatParcelizer.asBinder(pointinview);
        if (asBinder != null) {
            return new Timestamp(asBinder.getTime());
        }
        return null;
    }
}
