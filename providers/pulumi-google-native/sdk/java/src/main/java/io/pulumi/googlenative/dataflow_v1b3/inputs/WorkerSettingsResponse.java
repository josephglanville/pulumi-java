// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class WorkerSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkerSettingsResponse Empty = new WorkerSettingsResponse();

    @InputImport(name="baseUrl", required=true)
    private final String baseUrl;

    public String getBaseUrl() {
        return this.baseUrl;
    }

    @InputImport(name="reportingEnabled", required=true)
    private final Boolean reportingEnabled;

    public Boolean getReportingEnabled() {
        return this.reportingEnabled;
    }

    @InputImport(name="servicePath", required=true)
    private final String servicePath;

    public String getServicePath() {
        return this.servicePath;
    }

    @InputImport(name="shuffleServicePath", required=true)
    private final String shuffleServicePath;

    public String getShuffleServicePath() {
        return this.shuffleServicePath;
    }

    @InputImport(name="tempStoragePrefix", required=true)
    private final String tempStoragePrefix;

    public String getTempStoragePrefix() {
        return this.tempStoragePrefix;
    }

    @InputImport(name="workerId", required=true)
    private final String workerId;

    public String getWorkerId() {
        return this.workerId;
    }

    public WorkerSettingsResponse(
        String baseUrl,
        Boolean reportingEnabled,
        String servicePath,
        String shuffleServicePath,
        String tempStoragePrefix,
        String workerId) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.reportingEnabled = Objects.requireNonNull(reportingEnabled, "expected parameter 'reportingEnabled' to be non-null");
        this.servicePath = Objects.requireNonNull(servicePath, "expected parameter 'servicePath' to be non-null");
        this.shuffleServicePath = Objects.requireNonNull(shuffleServicePath, "expected parameter 'shuffleServicePath' to be non-null");
        this.tempStoragePrefix = Objects.requireNonNull(tempStoragePrefix, "expected parameter 'tempStoragePrefix' to be non-null");
        this.workerId = Objects.requireNonNull(workerId, "expected parameter 'workerId' to be non-null");
    }

    private WorkerSettingsResponse() {
        this.baseUrl = null;
        this.reportingEnabled = null;
        this.servicePath = null;
        this.shuffleServicePath = null;
        this.tempStoragePrefix = null;
        this.workerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private Boolean reportingEnabled;
        private String servicePath;
        private String shuffleServicePath;
        private String tempStoragePrefix;
        private String workerId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.reportingEnabled = defaults.reportingEnabled;
    	      this.servicePath = defaults.servicePath;
    	      this.shuffleServicePath = defaults.shuffleServicePath;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.workerId = defaults.workerId;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder setReportingEnabled(Boolean reportingEnabled) {
            this.reportingEnabled = Objects.requireNonNull(reportingEnabled);
            return this;
        }

        public Builder setServicePath(String servicePath) {
            this.servicePath = Objects.requireNonNull(servicePath);
            return this;
        }

        public Builder setShuffleServicePath(String shuffleServicePath) {
            this.shuffleServicePath = Objects.requireNonNull(shuffleServicePath);
            return this;
        }

        public Builder setTempStoragePrefix(String tempStoragePrefix) {
            this.tempStoragePrefix = Objects.requireNonNull(tempStoragePrefix);
            return this;
        }

        public Builder setWorkerId(String workerId) {
            this.workerId = Objects.requireNonNull(workerId);
            return this;
        }

        public WorkerSettingsResponse build() {
            return new WorkerSettingsResponse(baseUrl, reportingEnabled, servicePath, shuffleServicePath, tempStoragePrefix, workerId);
        }
    }
}