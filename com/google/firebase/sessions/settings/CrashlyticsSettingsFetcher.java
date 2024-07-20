package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.TooltipCompatHandler;
import org.json.JSONObject;

public interface CrashlyticsSettingsFetcher {
    Object doConfigFetch(Map<String, String> map, Function2<? super JSONObject, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function2, Function2<? super String, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function22, TooltipCompatHandler<? super Unit> tooltipCompatHandler);
}
