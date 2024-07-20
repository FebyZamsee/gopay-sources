package com.dexterous.flutterlocalnotifications.models;

import com.google.gson.JsonParseException;
import o.hasWindowFocus;
import o.superIsSelectedChildViewEnabled;

public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public static class Deserializer implements superIsSelectedChildViewEnabled<ScheduleMode> {
        public final /* synthetic */ Object onTransact(hasWindowFocus haswindowfocus) throws JsonParseException {
            return asBinder(haswindowfocus);
        }

        private static ScheduleMode asBinder(hasWindowFocus haswindowfocus) throws JsonParseException {
            try {
                return ScheduleMode.valueOf(haswindowfocus.IconCompatParcelizer());
            } catch (Exception unused) {
                return haswindowfocus.read() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }
}
