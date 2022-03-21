// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkLogConfigAggregationInterval;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkLogConfigMetadata;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available logging options for this subnetwork.
 * 
 */
public final class SubnetworkLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkLogConfigArgs Empty = new SubnetworkLogConfigArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    @Import(name="aggregationInterval")
      private final @Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval;

    public Output<SubnetworkLogConfigAggregationInterval> getAggregationInterval() {
        return this.aggregationInterval == null ? Output.empty() : this.aggregationInterval;
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    @Import(name="filterExpr")
      private final @Nullable Output<String> filterExpr;

    public Output<String> getFilterExpr() {
        return this.filterExpr == null ? Output.empty() : this.filterExpr;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    @Import(name="flowSampling")
      private final @Nullable Output<Double> flowSampling;

    public Output<Double> getFlowSampling() {
        return this.flowSampling == null ? Output.empty() : this.flowSampling;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<SubnetworkLogConfigMetadata> metadata;

    public Output<SubnetworkLogConfigMetadata> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
     * 
     */
    @Import(name="metadataFields")
      private final @Nullable Output<List<String>> metadataFields;

    public Output<List<String>> getMetadataFields() {
        return this.metadataFields == null ? Output.empty() : this.metadataFields;
    }

    public SubnetworkLogConfigArgs(
        @Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval,
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> filterExpr,
        @Nullable Output<Double> flowSampling,
        @Nullable Output<SubnetworkLogConfigMetadata> metadata,
        @Nullable Output<List<String>> metadataFields) {
        this.aggregationInterval = aggregationInterval;
        this.enable = enable;
        this.filterExpr = filterExpr;
        this.flowSampling = flowSampling;
        this.metadata = metadata;
        this.metadataFields = metadataFields;
    }

    private SubnetworkLogConfigArgs() {
        this.aggregationInterval = Output.empty();
        this.enable = Output.empty();
        this.filterExpr = Output.empty();
        this.flowSampling = Output.empty();
        this.metadata = Output.empty();
        this.metadataFields = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval;
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> filterExpr;
        private @Nullable Output<Double> flowSampling;
        private @Nullable Output<SubnetworkLogConfigMetadata> metadata;
        private @Nullable Output<List<String>> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.enable = defaults.enable;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder aggregationInterval(@Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }
        public Builder aggregationInterval(@Nullable SubnetworkLogConfigAggregationInterval aggregationInterval) {
            this.aggregationInterval = Output.ofNullable(aggregationInterval);
            return this;
        }
        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }
        public Builder filterExpr(@Nullable Output<String> filterExpr) {
            this.filterExpr = filterExpr;
            return this;
        }
        public Builder filterExpr(@Nullable String filterExpr) {
            this.filterExpr = Output.ofNullable(filterExpr);
            return this;
        }
        public Builder flowSampling(@Nullable Output<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }
        public Builder flowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Output.ofNullable(flowSampling);
            return this;
        }
        public Builder metadata(@Nullable Output<SubnetworkLogConfigMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable SubnetworkLogConfigMetadata metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder metadataFields(@Nullable Output<List<String>> metadataFields) {
            this.metadataFields = metadataFields;
            return this;
        }
        public Builder metadataFields(@Nullable List<String> metadataFields) {
            this.metadataFields = Output.ofNullable(metadataFields);
            return this;
        }
        public Builder metadataFields(String... metadataFields) {
            return metadataFields(List.of(metadataFields));
        }        public SubnetworkLogConfigArgs build() {
            return new SubnetworkLogConfigArgs(aggregationInterval, enable, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
