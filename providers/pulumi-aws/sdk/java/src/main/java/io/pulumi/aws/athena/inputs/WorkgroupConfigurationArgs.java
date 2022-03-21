// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.aws.athena.inputs.WorkgroupConfigurationEngineVersionArgs;
import io.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupConfigurationArgs Empty = new WorkgroupConfigurationArgs();

    /**
     * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
     * 
     */
    @Import(name="bytesScannedCutoffPerQuery")
      private final @Nullable Output<Integer> bytesScannedCutoffPerQuery;

    public Output<Integer> getBytesScannedCutoffPerQuery() {
        return this.bytesScannedCutoffPerQuery == null ? Output.empty() : this.bytesScannedCutoffPerQuery;
    }

    /**
     * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
     * 
     */
    @Import(name="enforceWorkgroupConfiguration")
      private final @Nullable Output<Boolean> enforceWorkgroupConfiguration;

    public Output<Boolean> getEnforceWorkgroupConfiguration() {
        return this.enforceWorkgroupConfiguration == null ? Output.empty() : this.enforceWorkgroupConfiguration;
    }

    /**
     * Configuration block for the Athena Engine Versioning. For more information, see [Athena Engine Versioning](https://docs.aws.amazon.com/athena/latest/ug/engine-versions.html). Documented below.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<WorkgroupConfigurationEngineVersionArgs> engineVersion;

    public Output<WorkgroupConfigurationEngineVersionArgs> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
     * 
     */
    @Import(name="publishCloudwatchMetricsEnabled")
      private final @Nullable Output<Boolean> publishCloudwatchMetricsEnabled;

    public Output<Boolean> getPublishCloudwatchMetricsEnabled() {
        return this.publishCloudwatchMetricsEnabled == null ? Output.empty() : this.publishCloudwatchMetricsEnabled;
    }

    /**
     * If set to true , allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false , workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false . For more information about Requester Pays buckets, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Import(name="requesterPaysEnabled")
      private final @Nullable Output<Boolean> requesterPaysEnabled;

    public Output<Boolean> getRequesterPaysEnabled() {
        return this.requesterPaysEnabled == null ? Output.empty() : this.requesterPaysEnabled;
    }

    /**
     * Configuration block with result settings. Documented below.
     * 
     */
    @Import(name="resultConfiguration")
      private final @Nullable Output<WorkgroupConfigurationResultConfigurationArgs> resultConfiguration;

    public Output<WorkgroupConfigurationResultConfigurationArgs> getResultConfiguration() {
        return this.resultConfiguration == null ? Output.empty() : this.resultConfiguration;
    }

    public WorkgroupConfigurationArgs(
        @Nullable Output<Integer> bytesScannedCutoffPerQuery,
        @Nullable Output<Boolean> enforceWorkgroupConfiguration,
        @Nullable Output<WorkgroupConfigurationEngineVersionArgs> engineVersion,
        @Nullable Output<Boolean> publishCloudwatchMetricsEnabled,
        @Nullable Output<Boolean> requesterPaysEnabled,
        @Nullable Output<WorkgroupConfigurationResultConfigurationArgs> resultConfiguration) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
        this.engineVersion = engineVersion;
        this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
        this.requesterPaysEnabled = requesterPaysEnabled;
        this.resultConfiguration = resultConfiguration;
    }

    private WorkgroupConfigurationArgs() {
        this.bytesScannedCutoffPerQuery = Output.empty();
        this.enforceWorkgroupConfiguration = Output.empty();
        this.engineVersion = Output.empty();
        this.publishCloudwatchMetricsEnabled = Output.empty();
        this.requesterPaysEnabled = Output.empty();
        this.resultConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bytesScannedCutoffPerQuery;
        private @Nullable Output<Boolean> enforceWorkgroupConfiguration;
        private @Nullable Output<WorkgroupConfigurationEngineVersionArgs> engineVersion;
        private @Nullable Output<Boolean> publishCloudwatchMetricsEnabled;
        private @Nullable Output<Boolean> requesterPaysEnabled;
        private @Nullable Output<WorkgroupConfigurationResultConfigurationArgs> resultConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesScannedCutoffPerQuery = defaults.bytesScannedCutoffPerQuery;
    	      this.enforceWorkgroupConfiguration = defaults.enforceWorkgroupConfiguration;
    	      this.engineVersion = defaults.engineVersion;
    	      this.publishCloudwatchMetricsEnabled = defaults.publishCloudwatchMetricsEnabled;
    	      this.requesterPaysEnabled = defaults.requesterPaysEnabled;
    	      this.resultConfiguration = defaults.resultConfiguration;
        }

        public Builder bytesScannedCutoffPerQuery(@Nullable Output<Integer> bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }
        public Builder bytesScannedCutoffPerQuery(@Nullable Integer bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = Output.ofNullable(bytesScannedCutoffPerQuery);
            return this;
        }
        public Builder enforceWorkgroupConfiguration(@Nullable Output<Boolean> enforceWorkgroupConfiguration) {
            this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
            return this;
        }
        public Builder enforceWorkgroupConfiguration(@Nullable Boolean enforceWorkgroupConfiguration) {
            this.enforceWorkgroupConfiguration = Output.ofNullable(enforceWorkgroupConfiguration);
            return this;
        }
        public Builder engineVersion(@Nullable Output<WorkgroupConfigurationEngineVersionArgs> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable WorkgroupConfigurationEngineVersionArgs engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }
        public Builder publishCloudwatchMetricsEnabled(@Nullable Output<Boolean> publishCloudwatchMetricsEnabled) {
            this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
            return this;
        }
        public Builder publishCloudwatchMetricsEnabled(@Nullable Boolean publishCloudwatchMetricsEnabled) {
            this.publishCloudwatchMetricsEnabled = Output.ofNullable(publishCloudwatchMetricsEnabled);
            return this;
        }
        public Builder requesterPaysEnabled(@Nullable Output<Boolean> requesterPaysEnabled) {
            this.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }
        public Builder requesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            this.requesterPaysEnabled = Output.ofNullable(requesterPaysEnabled);
            return this;
        }
        public Builder resultConfiguration(@Nullable Output<WorkgroupConfigurationResultConfigurationArgs> resultConfiguration) {
            this.resultConfiguration = resultConfiguration;
            return this;
        }
        public Builder resultConfiguration(@Nullable WorkgroupConfigurationResultConfigurationArgs resultConfiguration) {
            this.resultConfiguration = Output.ofNullable(resultConfiguration);
            return this;
        }        public WorkgroupConfigurationArgs build() {
            return new WorkgroupConfigurationArgs(bytesScannedCutoffPerQuery, enforceWorkgroupConfiguration, engineVersion, publishCloudwatchMetricsEnabled, requesterPaysEnabled, resultConfiguration);
        }
    }
}
