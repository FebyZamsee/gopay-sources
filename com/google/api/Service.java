package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Http;
import com.google.api.Logging;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.drawHorizontalDivider;
import o.getAnimationStyle;
import o.getBaseline;
import o.getDividerDrawable;
import o.getDividerWidth;
import o.getNextLocationOffset;
import o.getSupportButtonTintMode;
import o.getSupportCheckMarkTintMode;
import o.layoutHorizontal;
import o.measureNullChild;
import o.onLongPress;
import o.setAnimationStyle;
import o.setFilters;
import o.setSupportButtonTintMode;

public final class Service extends GeneratedMessageLite<Service, read> implements layoutHorizontal {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    /* access modifiers changed from: private */
    public static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile getAnimationStyle<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private measureNullChild.AudioAttributesCompatParcelizer<Api> apis_ = emptyProtobufList();
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private measureNullChild.AudioAttributesCompatParcelizer<Endpoint> endpoints_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<Enum> enums_ = emptyProtobufList();
    private Http http_;
    private String id_ = "";
    private Logging logging_;
    private measureNullChild.AudioAttributesCompatParcelizer<LogDescriptor> logs_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<MetricDescriptor> metrics_ = emptyProtobufList();
    private measureNullChild.AudioAttributesCompatParcelizer<MonitoredResourceDescriptor> monitoredResources_ = emptyProtobufList();
    private Monitoring monitoring_;
    private String name_ = "";
    private String producerProjectId_ = "";
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_ = "";
    private measureNullChild.AudioAttributesCompatParcelizer<Type> types_ = emptyProtobufList();
    private Usage usage_;

    private Service() {
    }

    public final boolean hasConfigVersion() {
        return this.configVersion_ != null;
    }

    public final UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    /* access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        this.configVersion_ = uInt32Value;
    }

    /* access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 == null || uInt32Value2 == UInt32Value.getDefaultInstance()) {
            this.configVersion_ = uInt32Value;
        } else {
            this.configVersion_ = (UInt32Value) ((UInt32Value.RemoteActionCompatParcelizer) UInt32Value.newBuilder(this.configVersion_).mergeFrom(uInt32Value)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
    }

    public final String getName() {
        return this.name_;
    }

    public final getBaseline getNameBytes() {
        return getBaseline.asBinder(this.name_);
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void setNameBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.name_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getId() {
        return this.id_;
    }

    public final getBaseline getIdBytes() {
        return getBaseline.asBinder(this.id_);
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void setIdBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.id_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getTitle() {
        return this.title_;
    }

    public final getBaseline getTitleBytes() {
        return getBaseline.asBinder(this.title_);
    }

    /* access modifiers changed from: private */
    public void setTitle(String str) {
        this.title_ = str;
    }

    /* access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* access modifiers changed from: private */
    public void setTitleBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.title_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public final getBaseline getProducerProjectIdBytes() {
        return getBaseline.asBinder(this.producerProjectId_);
    }

    /* access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        this.producerProjectId_ = str;
    }

    /* access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* access modifiers changed from: private */
    public void setProducerProjectIdBytes(getBaseline getbaseline) {
        checkByteStringIsUtf8(getbaseline);
        this.producerProjectId_ = getbaseline.AudioAttributesImplApi26Parcelizer();
    }

    public final List<Api> getApisList() {
        return this.apis_;
    }

    public final List<? extends drawHorizontalDivider> getApisOrBuilderList() {
        return this.apis_;
    }

    public final int getApisCount() {
        return this.apis_.size();
    }

    public final Api getApis(int i) {
        return (Api) this.apis_.get(i);
    }

    public final drawHorizontalDivider getApisOrBuilder(int i) {
        return (drawHorizontalDivider) this.apis_.get(i);
    }

    private void ensureApisIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Api> audioAttributesCompatParcelizer = this.apis_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setApis(int i, Api api) {
        ensureApisIsMutable();
        this.apis_.set(i, api);
    }

    /* access modifiers changed from: private */
    public void addApis(Api api) {
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* access modifiers changed from: private */
    public void addApis(int i, Api api) {
        ensureApisIsMutable();
        this.apis_.add(i, api);
    }

    /* access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        onLongPress.addAll(iterable, this.apis_);
    }

    /* access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeApis(int i) {
        ensureApisIsMutable();
        this.apis_.remove(i);
    }

    public final List<Type> getTypesList() {
        return this.types_;
    }

    public final List<? extends setAnimationStyle> getTypesOrBuilderList() {
        return this.types_;
    }

    public final int getTypesCount() {
        return this.types_.size();
    }

    public final Type getTypes(int i) {
        return (Type) this.types_.get(i);
    }

    public final setAnimationStyle getTypesOrBuilder(int i) {
        return (setAnimationStyle) this.types_.get(i);
    }

    private void ensureTypesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Type> audioAttributesCompatParcelizer = this.types_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.types_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setTypes(int i, Type type) {
        ensureTypesIsMutable();
        this.types_.set(i, type);
    }

    /* access modifiers changed from: private */
    public void addTypes(Type type) {
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    /* access modifiers changed from: private */
    public void addTypes(int i, Type type) {
        ensureTypesIsMutable();
        this.types_.add(i, type);
    }

    /* access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        onLongPress.addAll(iterable, this.types_);
    }

    /* access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeTypes(int i) {
        ensureTypesIsMutable();
        this.types_.remove(i);
    }

    public final List<Enum> getEnumsList() {
        return this.enums_;
    }

    public final List<? extends getNextLocationOffset> getEnumsOrBuilderList() {
        return this.enums_;
    }

    public final int getEnumsCount() {
        return this.enums_.size();
    }

    public final Enum getEnums(int i) {
        return (Enum) this.enums_.get(i);
    }

    public final getNextLocationOffset getEnumsOrBuilder(int i) {
        return (getNextLocationOffset) this.enums_.get(i);
    }

    private void ensureEnumsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Enum> audioAttributesCompatParcelizer = this.enums_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setEnums(int i, Enum enumR) {
        ensureEnumsIsMutable();
        this.enums_.set(i, enumR);
    }

    /* access modifiers changed from: private */
    public void addEnums(Enum enumR) {
        ensureEnumsIsMutable();
        this.enums_.add(enumR);
    }

    /* access modifiers changed from: private */
    public void addEnums(int i, Enum enumR) {
        ensureEnumsIsMutable();
        this.enums_.add(i, enumR);
    }

    /* access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        onLongPress.addAll(iterable, this.enums_);
    }

    /* access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeEnums(int i) {
        ensureEnumsIsMutable();
        this.enums_.remove(i);
    }

    public final boolean hasDocumentation() {
        return this.documentation_ != null;
    }

    public final Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    /* access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        this.documentation_ = documentation;
    }

    /* access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            this.documentation_ = (Documentation) ((Documentation.asBinder) Documentation.newBuilder(this.documentation_).mergeFrom(documentation)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
    }

    public final boolean hasBackend() {
        return this.backend_ != null;
    }

    public final Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    /* access modifiers changed from: private */
    public void setBackend(Backend backend) {
        this.backend_ = backend;
    }

    /* access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            this.backend_ = (Backend) ((Backend.asInterface) Backend.newBuilder(this.backend_).mergeFrom(backend)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
    }

    public final boolean hasHttp() {
        return this.http_ != null;
    }

    public final Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    /* access modifiers changed from: private */
    public void setHttp(Http http) {
        this.http_ = http;
    }

    /* access modifiers changed from: private */
    public void mergeHttp(Http http) {
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            this.http_ = (Http) ((Http.asBinder) Http.newBuilder(this.http_).mergeFrom(http)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
    }

    public final boolean hasQuota() {
        return this.quota_ != null;
    }

    public final Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    /* access modifiers changed from: private */
    public void setQuota(Quota quota) {
        this.quota_ = quota;
    }

    /* access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            this.quota_ = (Quota) ((Quota.onTransact) Quota.newBuilder(this.quota_).mergeFrom(quota)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
    }

    public final boolean hasAuthentication() {
        return this.authentication_ != null;
    }

    public final Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    /* access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        this.authentication_ = authentication;
    }

    /* access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            this.authentication_ = (Authentication) ((Authentication.onTransact) Authentication.newBuilder(this.authentication_).mergeFrom(authentication)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
    }

    public final boolean hasContext() {
        return this.context_ != null;
    }

    public final Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    /* access modifiers changed from: private */
    public void setContext(Context context) {
        this.context_ = context;
    }

    /* access modifiers changed from: private */
    public void mergeContext(Context context) {
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            this.context_ = (Context) ((Context.asInterface) Context.newBuilder(this.context_).mergeFrom(context)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
    }

    public final boolean hasUsage() {
        return this.usage_ != null;
    }

    public final Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    /* access modifiers changed from: private */
    public void setUsage(Usage usage) {
        this.usage_ = usage;
    }

    /* access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            this.usage_ = (Usage) ((Usage.asInterface) Usage.newBuilder(this.usage_).mergeFrom(usage)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
    }

    public final List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public final List<? extends setFilters> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public final int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public final Endpoint getEndpoints(int i) {
        return (Endpoint) this.endpoints_.get(i);
    }

    public final setFilters getEndpointsOrBuilder(int i) {
        return (setFilters) this.endpoints_.get(i);
    }

    private void ensureEndpointsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<Endpoint> audioAttributesCompatParcelizer = this.endpoints_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setEndpoints(int i, Endpoint endpoint) {
        ensureEndpointsIsMutable();
        this.endpoints_.set(i, endpoint);
    }

    /* access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* access modifiers changed from: private */
    public void addEndpoints(int i, Endpoint endpoint) {
        ensureEndpointsIsMutable();
        this.endpoints_.add(i, endpoint);
    }

    /* access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        onLongPress.addAll(iterable, this.endpoints_);
    }

    /* access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeEndpoints(int i) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i);
    }

    public final boolean hasControl() {
        return this.control_ != null;
    }

    public final Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    /* access modifiers changed from: private */
    public void setControl(Control control) {
        this.control_ = control;
    }

    /* access modifiers changed from: private */
    public void mergeControl(Control control) {
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            this.control_ = (Control) ((Control.onTransact) Control.newBuilder(this.control_).mergeFrom(control)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
    }

    public final List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public final List<? extends getSupportButtonTintMode> getLogsOrBuilderList() {
        return this.logs_;
    }

    public final int getLogsCount() {
        return this.logs_.size();
    }

    public final LogDescriptor getLogs(int i) {
        return (LogDescriptor) this.logs_.get(i);
    }

    public final getSupportButtonTintMode getLogsOrBuilder(int i) {
        return (getSupportButtonTintMode) this.logs_.get(i);
    }

    private void ensureLogsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<LogDescriptor> audioAttributesCompatParcelizer = this.logs_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setLogs(int i, LogDescriptor logDescriptor) {
        ensureLogsIsMutable();
        this.logs_.set(i, logDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* access modifiers changed from: private */
    public void addLogs(int i, LogDescriptor logDescriptor) {
        ensureLogsIsMutable();
        this.logs_.add(i, logDescriptor);
    }

    /* access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        onLongPress.addAll(iterable, this.logs_);
    }

    /* access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    public final List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public final List<? extends setSupportButtonTintMode> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public final int getMetricsCount() {
        return this.metrics_.size();
    }

    public final MetricDescriptor getMetrics(int i) {
        return (MetricDescriptor) this.metrics_.get(i);
    }

    public final setSupportButtonTintMode getMetricsOrBuilder(int i) {
        return (setSupportButtonTintMode) this.metrics_.get(i);
    }

    private void ensureMetricsIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<MetricDescriptor> audioAttributesCompatParcelizer = this.metrics_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setMetrics(int i, MetricDescriptor metricDescriptor) {
        ensureMetricsIsMutable();
        this.metrics_.set(i, metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMetrics(int i, MetricDescriptor metricDescriptor) {
        ensureMetricsIsMutable();
        this.metrics_.add(i, metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        onLongPress.addAll(iterable, this.metrics_);
    }

    /* access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    public final List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public final List<? extends getSupportCheckMarkTintMode> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public final int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public final MonitoredResourceDescriptor getMonitoredResources(int i) {
        return (MonitoredResourceDescriptor) this.monitoredResources_.get(i);
    }

    public final getSupportCheckMarkTintMode getMonitoredResourcesOrBuilder(int i) {
        return (getSupportCheckMarkTintMode) this.monitoredResources_.get(i);
    }

    private void ensureMonitoredResourcesIsMutable() {
        measureNullChild.AudioAttributesCompatParcelizer<MonitoredResourceDescriptor> audioAttributesCompatParcelizer = this.monitoredResources_;
        if (!audioAttributesCompatParcelizer.onTransact()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(audioAttributesCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public void setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i, monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i, monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        onLongPress.addAll(iterable, this.monitoredResources_);
    }

    /* access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeMonitoredResources(int i) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i);
    }

    public final boolean hasBilling() {
        return this.billing_ != null;
    }

    public final Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    /* access modifiers changed from: private */
    public void setBilling(Billing billing) {
        this.billing_ = billing;
    }

    /* access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            this.billing_ = (Billing) ((Billing.onTransact) Billing.newBuilder(this.billing_).mergeFrom(billing)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
    }

    public final boolean hasLogging() {
        return this.logging_ != null;
    }

    public final Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    /* access modifiers changed from: private */
    public void setLogging(Logging logging) {
        this.logging_ = logging;
    }

    /* access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            this.logging_ = (Logging) ((Logging.RemoteActionCompatParcelizer) Logging.newBuilder(this.logging_).mergeFrom(logging)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
    }

    public final boolean hasMonitoring() {
        return this.monitoring_ != null;
    }

    public final Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    /* access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring_ = monitoring;
    }

    /* access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            this.monitoring_ = (Monitoring) ((Monitoring.asBinder) Monitoring.newBuilder(this.monitoring_).mergeFrom(monitoring)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
    }

    public final boolean hasSystemParameters() {
        return this.systemParameters_ != null;
    }

    public final SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    /* access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        this.systemParameters_ = systemParameters;
    }

    /* access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            this.systemParameters_ = (SystemParameters) ((SystemParameters.asInterface) SystemParameters.newBuilder(this.systemParameters_).mergeFrom(systemParameters)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    public final boolean hasSourceInfo() {
        return this.sourceInfo_ != null;
    }

    public final SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    /* access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        this.sourceInfo_ = sourceInfo;
    }

    /* access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            this.sourceInfo_ = (SourceInfo) ((SourceInfo.read) SourceInfo.newBuilder(this.sourceInfo_).mergeFrom(sourceInfo)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getdividerwidth);
    }

    public static Service parseFrom(getBaseline getbaseline) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline);
    }

    public static Service parseFrom(getBaseline getbaseline, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getbaseline, getdividerwidth);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, getDividerWidth getdividerwidth) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getdividerwidth);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, getDividerWidth getdividerwidth) throws IOException {
        return (Service) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getdividerwidth);
    }

    public static Service parseFrom(getDividerDrawable getdividerdrawable) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable);
    }

    public static Service parseFrom(getDividerDrawable getdividerdrawable, getDividerWidth getdividerwidth) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getdividerdrawable, getdividerwidth);
    }

    public static read newBuilder() {
        return (read) DEFAULT_INSTANCE.createBuilder();
    }

    public static read newBuilder(Service service) {
        return (read) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static final class read extends GeneratedMessageLite.RemoteActionCompatParcelizer<Service, read> implements layoutHorizontal {
        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            super(Service.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Service$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] asInterface;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer[] r0 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                asInterface = r0
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = asInterface     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$AudioAttributesImplApi26Parcelizer r1 = com.google.protobuf.GeneratedMessageLite.AudioAttributesImplApi26Parcelizer.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Service.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, Object obj, Object obj2) {
        getAnimationStyle getanimationstyle;
        switch (AnonymousClass1.asInterface[audioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new read((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAnimationStyle<Service> getanimationstyle2 = PARSER;
                if (getanimationstyle2 != null) {
                    return getanimationstyle2;
                }
                synchronized (Service.class) {
                    getanimationstyle = PARSER;
                    if (getanimationstyle == null) {
                        getanimationstyle = new GeneratedMessageLite.onTransact(DEFAULT_INSTANCE);
                        PARSER = getanimationstyle;
                    }
                }
                return getanimationstyle;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static getAnimationStyle<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
