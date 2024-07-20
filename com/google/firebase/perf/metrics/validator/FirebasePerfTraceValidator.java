package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;

final class FirebasePerfTraceValidator extends PerfMetricValidator {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final TraceMetric traceMetric;

    private boolean isValidCounterValue(Long l) {
        return l != null;
    }

    FirebasePerfTraceValidator(TraceMetric traceMetric2) {
        this.traceMetric = traceMetric2;
    }

    public final boolean isValidPerfMetric() {
        if (!isValidTrace(this.traceMetric, 0)) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Invalid Trace:");
            sb.append(this.traceMetric.getName());
            androidLogger.warn(sb.toString());
            return false;
        } else if (!hasCounters(this.traceMetric) || areCountersValid(this.traceMetric)) {
            return true;
        } else {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("Invalid Counters for Trace:");
            sb2.append(this.traceMetric.getName());
            androidLogger2.warn(sb2.toString());
            return false;
        }
    }

    private boolean hasCounters(TraceMetric traceMetric2) {
        boolean z;
        if (traceMetric2.getCountersCount() > 0) {
            return true;
        }
        for (TraceMetric countersCount : traceMetric2.getSubtracesList()) {
            if (countersCount.getCountersCount() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private boolean areCountersValid(TraceMetric traceMetric2) {
        return areCountersValid(traceMetric2, 0);
    }

    private boolean areCountersValid(TraceMetric traceMetric2, int i) {
        if (traceMetric2 == null) {
            return false;
        }
        if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry next : traceMetric2.getCountersMap().entrySet()) {
            if (!isValidCounterId((String) next.getKey())) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("invalid CounterId:");
                sb.append((String) next.getKey());
                androidLogger.warn(sb.toString());
                return false;
            } else if (!isValidCounterValue((Long) next.getValue())) {
                AndroidLogger androidLogger2 = logger;
                StringBuilder sb2 = new StringBuilder("invalid CounterValue:");
                sb2.append(next.getValue());
                androidLogger2.warn(sb2.toString());
                return false;
            }
        }
        for (TraceMetric areCountersValid : traceMetric2.getSubtracesList()) {
            if (!areCountersValid(areCountersValid, i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isScreenTrace(TraceMetric traceMetric2) {
        return traceMetric2.getName().startsWith("_st_");
    }

    private boolean isValidScreenTrace(TraceMetric traceMetric2) {
        Long l = traceMetric2.getCountersMap().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        return l != null && l.compareTo(0L) > 0;
    }

    private boolean isValidTrace(TraceMetric traceMetric2, int i) {
        if (traceMetric2 == null) {
            logger.warn("TraceMetric is null");
            return false;
        } else if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!isValidTraceId(traceMetric2.getName())) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("invalid TraceId:");
            sb.append(traceMetric2.getName());
            androidLogger.warn(sb.toString());
            return false;
        } else if (!isValidTraceDuration(traceMetric2)) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("invalid TraceDuration:");
            sb2.append(traceMetric2.getDurationUs());
            androidLogger2.warn(sb2.toString());
            return false;
        } else if (!traceMetric2.hasClientStartTimeUs()) {
            logger.warn("clientStartTimeUs is null.");
            return false;
        } else if (!isScreenTrace(traceMetric2) || isValidScreenTrace(traceMetric2)) {
            for (TraceMetric isValidTrace : traceMetric2.getSubtracesList()) {
                if (!isValidTrace(isValidTrace, i + 1)) {
                    return false;
                }
            }
            return areAllAttributesValid(traceMetric2.getCustomAttributesMap());
        } else {
            AndroidLogger androidLogger3 = logger;
            StringBuilder sb3 = new StringBuilder("non-positive totalFrames in screen trace ");
            sb3.append(traceMetric2.getName());
            androidLogger3.warn(sb3.toString());
            return false;
        }
    }

    private boolean isValidTraceId(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    private boolean isValidTraceDuration(TraceMetric traceMetric2) {
        return traceMetric2 != null && traceMetric2.getDurationUs() > 0;
    }

    private boolean isValidCounterId(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            logger.warn("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            logger.warn("counterId exceeded max length 100");
            return false;
        }
    }

    private boolean areAllAttributesValid(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            try {
                validateAttribute((String) next.getKey(), (String) next.getValue());
            } catch (IllegalArgumentException e) {
                logger.warn(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }
}
