// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.DomainClusterConfigZoneAwarenessConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainClusterConfig {
    /**
     * Number of dedicated main nodes in the cluster.
     * 
     */
    private final @Nullable Integer dedicatedMasterCount;
    /**
     * Whether dedicated main nodes are enabled for the cluster.
     * 
     */
    private final @Nullable Boolean dedicatedMasterEnabled;
    /**
     * Instance type of the dedicated main nodes in the cluster.
     * 
     */
    private final @Nullable String dedicatedMasterType;
    /**
     * Number of instances in the cluster.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * Instance type of data nodes in the cluster.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    private final @Nullable Integer warmCount;
    /**
     * Whether to enable warm storage.
     * 
     */
    private final @Nullable Boolean warmEnabled;
    /**
     * Instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
     */
    private final @Nullable String warmType;
    /**
     * Configuration block containing zone awareness settings. Detailed below.
     * 
     */
    private final @Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig;
    /**
     * Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
     */
    private final @Nullable Boolean zoneAwarenessEnabled;

    @CustomType.Constructor
    private DomainClusterConfig(
        @CustomType.Parameter("dedicatedMasterCount") @Nullable Integer dedicatedMasterCount,
        @CustomType.Parameter("dedicatedMasterEnabled") @Nullable Boolean dedicatedMasterEnabled,
        @CustomType.Parameter("dedicatedMasterType") @Nullable String dedicatedMasterType,
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("warmCount") @Nullable Integer warmCount,
        @CustomType.Parameter("warmEnabled") @Nullable Boolean warmEnabled,
        @CustomType.Parameter("warmType") @Nullable String warmType,
        @CustomType.Parameter("zoneAwarenessConfig") @Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig,
        @CustomType.Parameter("zoneAwarenessEnabled") @Nullable Boolean zoneAwarenessEnabled) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * Number of dedicated main nodes in the cluster.
     * 
    */
    public Optional<Integer> getDedicatedMasterCount() {
        return Optional.ofNullable(this.dedicatedMasterCount);
    }
    /**
     * Whether dedicated main nodes are enabled for the cluster.
     * 
    */
    public Optional<Boolean> getDedicatedMasterEnabled() {
        return Optional.ofNullable(this.dedicatedMasterEnabled);
    }
    /**
     * Instance type of the dedicated main nodes in the cluster.
     * 
    */
    public Optional<String> getDedicatedMasterType() {
        return Optional.ofNullable(this.dedicatedMasterType);
    }
    /**
     * Number of instances in the cluster.
     * 
    */
    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * Instance type of data nodes in the cluster.
     * 
    */
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * Number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
     * 
    */
    public Optional<Integer> getWarmCount() {
        return Optional.ofNullable(this.warmCount);
    }
    /**
     * Whether to enable warm storage.
     * 
    */
    public Optional<Boolean> getWarmEnabled() {
        return Optional.ofNullable(this.warmEnabled);
    }
    /**
     * Instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
     * 
    */
    public Optional<String> getWarmType() {
        return Optional.ofNullable(this.warmType);
    }
    /**
     * Configuration block containing zone awareness settings. Detailed below.
     * 
    */
    public Optional<DomainClusterConfigZoneAwarenessConfig> getZoneAwarenessConfig() {
        return Optional.ofNullable(this.zoneAwarenessConfig);
    }
    /**
     * Whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
     * 
    */
    public Optional<Boolean> getZoneAwarenessEnabled() {
        return Optional.ofNullable(this.zoneAwarenessEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer dedicatedMasterCount;
        private @Nullable Boolean dedicatedMasterEnabled;
        private @Nullable String dedicatedMasterType;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private @Nullable String warmType;
        private @Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig;
        private @Nullable Boolean zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }
        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }
        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = warmCount;
            return this;
        }
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        public Builder warmType(@Nullable String warmType) {
            this.warmType = warmType;
            return this;
        }
        public Builder zoneAwarenessConfig(@Nullable DomainClusterConfigZoneAwarenessConfig zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }
        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }        public DomainClusterConfig build() {
            return new DomainClusterConfig(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }
}
