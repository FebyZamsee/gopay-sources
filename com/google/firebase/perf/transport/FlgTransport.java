package com.google.firebase.perf.transport;

import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.PerfMetric;
import o.getNavigationMode;
import o.getSelectedNavigationIndex;
import o.getSubtitle;
import o.getTabAt;
import o.getTitle;

final class FlgTransport {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private getTitle<PerfMetric> flgTransport;
    private final Provider<getTabAt> flgTransportFactoryProvider;
    private final String logSourceName;

    FlgTransport(Provider<getTabAt> provider, String str) {
        this.logSourceName = str;
        this.flgTransportFactoryProvider = provider;
    }

    public final void log(PerfMetric perfMetric) {
        if (!initializeFlgTransportClient()) {
            logger.warn("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.flgTransport.asBinder(new getSelectedNavigationIndex((Integer) null, perfMetric, getNavigationMode.DEFAULT));
        }
    }

    private boolean initializeFlgTransportClient() {
        if (this.flgTransport == null) {
            getTabAt gettabat = this.flgTransportFactoryProvider.get();
            if (gettabat != null) {
                Class<PerfMetric> cls = PerfMetric.class;
                this.flgTransport = gettabat.RemoteActionCompatParcelizer(this.logSourceName, new getSubtitle("proto"), new FlgTransport$$ExternalSyntheticLambda0());
            } else {
                logger.warn("Flg TransportFactory is not available at the moment");
            }
        }
        return this.flgTransport != null;
    }
}
