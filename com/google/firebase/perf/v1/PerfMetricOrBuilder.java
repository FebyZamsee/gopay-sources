package com.google.firebase.perf.v1;

import o.ListPopupWindow;

public interface PerfMetricOrBuilder extends ListPopupWindow {
    GaugeMetric getGaugeMetric();

    NetworkRequestMetric getNetworkRequestMetric();

    TraceMetric getTraceMetric();

    boolean hasGaugeMetric();

    boolean hasNetworkRequestMetric();

    boolean hasTraceMetric();
}
