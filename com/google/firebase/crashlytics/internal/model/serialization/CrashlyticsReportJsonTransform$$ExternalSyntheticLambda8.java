package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final /* synthetic */ class CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8 implements CrashlyticsReportJsonTransform.ObjectParser {
    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader);
    }
}