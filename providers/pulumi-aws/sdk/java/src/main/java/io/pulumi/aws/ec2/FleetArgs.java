// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs;
import io.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs;
import io.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs;
import io.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    @Import(name="excessCapacityTerminationPolicy")
      private final @Nullable Output<String> excessCapacityTerminationPolicy;

    public Output<String> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Output.empty() : this.excessCapacityTerminationPolicy;
    }

    /**
     * Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    @Import(name="launchTemplateConfig", required=true)
      private final Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig;

    public Output<FleetLaunchTemplateConfigArgs> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    @Import(name="onDemandOptions")
      private final @Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions;

    public Output<FleetOnDemandOptionsArgs> getOnDemandOptions() {
        return this.onDemandOptions == null ? Output.empty() : this.onDemandOptions;
    }

    /**
     * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    @Import(name="replaceUnhealthyInstances")
      private final @Nullable Output<Boolean> replaceUnhealthyInstances;

    public Output<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Output.empty() : this.replaceUnhealthyInstances;
    }

    /**
     * Nested argument containing Spot configurations. Defined below.
     * 
     */
    @Import(name="spotOptions")
      private final @Nullable Output<FleetSpotOptionsArgs> spotOptions;

    public Output<FleetSpotOptionsArgs> getSpotOptions() {
        return this.spotOptions == null ? Output.empty() : this.spotOptions;
    }

    /**
     * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Nested argument containing target capacity configurations. Defined below.
     * 
     */
    @Import(name="targetCapacitySpecification", required=true)
      private final Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification;

    public Output<FleetTargetCapacitySpecificationArgs> getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    /**
     * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstances")
      private final @Nullable Output<Boolean> terminateInstances;

    public Output<Boolean> getTerminateInstances() {
        return this.terminateInstances == null ? Output.empty() : this.terminateInstances;
    }

    /**
     * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstancesWithExpiration")
      private final @Nullable Output<Boolean> terminateInstancesWithExpiration;

    public Output<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Output.empty() : this.terminateInstancesWithExpiration;
    }

    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public FleetArgs(
        @Nullable Output<String> excessCapacityTerminationPolicy,
        Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig,
        @Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions,
        @Nullable Output<Boolean> replaceUnhealthyInstances,
        @Nullable Output<FleetSpotOptionsArgs> spotOptions,
        @Nullable Output<Map<String,String>> tags,
        Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification,
        @Nullable Output<Boolean> terminateInstances,
        @Nullable Output<Boolean> terminateInstancesWithExpiration,
        @Nullable Output<String> type) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.launchTemplateConfig = Objects.requireNonNull(launchTemplateConfig, "expected parameter 'launchTemplateConfig' to be non-null");
        this.onDemandOptions = onDemandOptions;
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        this.spotOptions = spotOptions;
        this.tags = tags;
        this.targetCapacitySpecification = Objects.requireNonNull(targetCapacitySpecification, "expected parameter 'targetCapacitySpecification' to be non-null");
        this.terminateInstances = terminateInstances;
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        this.type = type;
    }

    private FleetArgs() {
        this.excessCapacityTerminationPolicy = Output.empty();
        this.launchTemplateConfig = Output.empty();
        this.onDemandOptions = Output.empty();
        this.replaceUnhealthyInstances = Output.empty();
        this.spotOptions = Output.empty();
        this.tags = Output.empty();
        this.targetCapacitySpecification = Output.empty();
        this.terminateInstances = Output.empty();
        this.terminateInstancesWithExpiration = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> excessCapacityTerminationPolicy;
        private Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig;
        private @Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions;
        private @Nullable Output<Boolean> replaceUnhealthyInstances;
        private @Nullable Output<FleetSpotOptionsArgs> spotOptions;
        private @Nullable Output<Map<String,String>> tags;
        private Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification;
        private @Nullable Output<Boolean> terminateInstances;
        private @Nullable Output<Boolean> terminateInstancesWithExpiration;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.launchTemplateConfig = defaults.launchTemplateConfig;
    	      this.onDemandOptions = defaults.onDemandOptions;
    	      this.replaceUnhealthyInstances = defaults.replaceUnhealthyInstances;
    	      this.spotOptions = defaults.spotOptions;
    	      this.tags = defaults.tags;
    	      this.targetCapacitySpecification = defaults.targetCapacitySpecification;
    	      this.terminateInstances = defaults.terminateInstances;
    	      this.terminateInstancesWithExpiration = defaults.terminateInstancesWithExpiration;
    	      this.type = defaults.type;
        }

        public Builder excessCapacityTerminationPolicy(@Nullable Output<String> excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }
        public Builder excessCapacityTerminationPolicy(@Nullable String excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = Output.ofNullable(excessCapacityTerminationPolicy);
            return this;
        }
        public Builder launchTemplateConfig(Output<FleetLaunchTemplateConfigArgs> launchTemplateConfig) {
            this.launchTemplateConfig = Objects.requireNonNull(launchTemplateConfig);
            return this;
        }
        public Builder launchTemplateConfig(FleetLaunchTemplateConfigArgs launchTemplateConfig) {
            this.launchTemplateConfig = Output.of(Objects.requireNonNull(launchTemplateConfig));
            return this;
        }
        public Builder onDemandOptions(@Nullable Output<FleetOnDemandOptionsArgs> onDemandOptions) {
            this.onDemandOptions = onDemandOptions;
            return this;
        }
        public Builder onDemandOptions(@Nullable FleetOnDemandOptionsArgs onDemandOptions) {
            this.onDemandOptions = Output.ofNullable(onDemandOptions);
            return this;
        }
        public Builder replaceUnhealthyInstances(@Nullable Output<Boolean> replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }
        public Builder replaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = Output.ofNullable(replaceUnhealthyInstances);
            return this;
        }
        public Builder spotOptions(@Nullable Output<FleetSpotOptionsArgs> spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }
        public Builder spotOptions(@Nullable FleetSpotOptionsArgs spotOptions) {
            this.spotOptions = Output.ofNullable(spotOptions);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder targetCapacitySpecification(Output<FleetTargetCapacitySpecificationArgs> targetCapacitySpecification) {
            this.targetCapacitySpecification = Objects.requireNonNull(targetCapacitySpecification);
            return this;
        }
        public Builder targetCapacitySpecification(FleetTargetCapacitySpecificationArgs targetCapacitySpecification) {
            this.targetCapacitySpecification = Output.of(Objects.requireNonNull(targetCapacitySpecification));
            return this;
        }
        public Builder terminateInstances(@Nullable Output<Boolean> terminateInstances) {
            this.terminateInstances = terminateInstances;
            return this;
        }
        public Builder terminateInstances(@Nullable Boolean terminateInstances) {
            this.terminateInstances = Output.ofNullable(terminateInstances);
            return this;
        }
        public Builder terminateInstancesWithExpiration(@Nullable Output<Boolean> terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }
        public Builder terminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = Output.ofNullable(terminateInstancesWithExpiration);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public FleetArgs build() {
            return new FleetArgs(excessCapacityTerminationPolicy, launchTemplateConfig, onDemandOptions, replaceUnhealthyInstances, spotOptions, tags, targetCapacitySpecification, terminateInstances, terminateInstancesWithExpiration, type);
        }
    }
}