package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    private AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.arch = i;
        this.model = str;
        this.cores = i2;
        this.ram = j;
        this.diskSpace = j2;
        this.simulator = z;
        this.state = i3;
        this.manufacturer = str2;
        this.modelClass = str3;
    }

    public final int getArch() {
        return this.arch;
    }

    public final String getModel() {
        return this.model;
    }

    public final int getCores() {
        return this.cores;
    }

    public final long getRam() {
        return this.ram;
    }

    public final long getDiskSpace() {
        return this.diskSpace;
    }

    public final boolean isSimulator() {
        return this.simulator;
    }

    public final int getState() {
        return this.state;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModelClass() {
        return this.modelClass;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.arch);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", cores=");
        sb.append(this.cores);
        sb.append(", ram=");
        sb.append(this.ram);
        sb.append(", diskSpace=");
        sb.append(this.diskSpace);
        sb.append(", simulator=");
        sb.append(this.simulator);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", modelClass=");
        sb.append(this.modelClass);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        if (this.arch == device.getArch() && this.model.equals(device.getModel()) && this.cores == device.getCores() && this.ram == device.getRam() && this.diskSpace == device.getDiskSpace() && this.simulator == device.isSimulator() && this.state == device.getState() && this.manufacturer.equals(device.getManufacturer()) && this.modelClass.equals(device.getModelClass())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.arch;
        int hashCode = this.model.hashCode();
        int i2 = this.cores;
        long j = this.ram;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.diskSpace;
        int i4 = (int) (j2 ^ (j2 >>> 32));
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (this.simulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    static final class Builder extends CrashlyticsReport.Session.Device.Builder {
        private Integer arch;
        private Integer cores;
        private Long diskSpace;
        private String manufacturer;
        private String model;
        private String modelClass;
        private Long ram;
        private Boolean simulator;
        private Integer state;

        Builder() {
        }

        public final CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.arch = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str != null) {
                this.model = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        public final CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.cores = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.ram = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.diskSpace = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.simulator = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.state = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str != null) {
                this.manufacturer = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        public final CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str != null) {
                this.modelClass = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        public final CrashlyticsReport.Session.Device build() {
            String str = this.arch == null ? " arch" : "";
            if (this.model == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" model");
                str = sb.toString();
            }
            if (this.cores == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" cores");
                str = sb2.toString();
            }
            if (this.ram == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" ram");
                str = sb3.toString();
            }
            if (this.diskSpace == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" diskSpace");
                str = sb4.toString();
            }
            if (this.simulator == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" simulator");
                str = sb5.toString();
            }
            if (this.state == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" state");
                str = sb6.toString();
            }
            if (this.manufacturer == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" manufacturer");
                str = sb7.toString();
            }
            if (this.modelClass == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" modelClass");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.arch.intValue(), this.model, this.cores.intValue(), this.ram.longValue(), this.diskSpace.longValue(), this.simulator.booleanValue(), this.state.intValue(), this.manufacturer, this.modelClass);
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }
}
