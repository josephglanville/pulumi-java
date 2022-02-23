// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.enums.EC2FleetExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.enums.EC2FleetType;
import io.pulumi.awsnative.ec2.inputs.EC2FleetFleetLaunchTemplateConfigRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetOnDemandOptionsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetSpotOptionsRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetTagSpecificationArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetTargetCapacitySpecificationRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetArgs Empty = new EC2FleetArgs();

    @InputImport(name="context")
      private final @Nullable Input<String> context;

    public Input<String> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    @InputImport(name="excessCapacityTerminationPolicy")
      private final @Nullable Input<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Input<EC2FleetExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Input.empty() : this.excessCapacityTerminationPolicy;
    }

    @InputImport(name="launchTemplateConfigs", required=true)
      private final Input<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs;

    public Input<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }

    @InputImport(name="onDemandOptions")
      private final @Nullable Input<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions;

    public Input<EC2FleetOnDemandOptionsRequestArgs> getOnDemandOptions() {
        return this.onDemandOptions == null ? Input.empty() : this.onDemandOptions;
    }

    @InputImport(name="replaceUnhealthyInstances")
      private final @Nullable Input<Boolean> replaceUnhealthyInstances;

    public Input<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Input.empty() : this.replaceUnhealthyInstances;
    }

    @InputImport(name="spotOptions")
      private final @Nullable Input<EC2FleetSpotOptionsRequestArgs> spotOptions;

    public Input<EC2FleetSpotOptionsRequestArgs> getSpotOptions() {
        return this.spotOptions == null ? Input.empty() : this.spotOptions;
    }

    @InputImport(name="tagSpecifications")
      private final @Nullable Input<List<EC2FleetTagSpecificationArgs>> tagSpecifications;

    public Input<List<EC2FleetTagSpecificationArgs>> getTagSpecifications() {
        return this.tagSpecifications == null ? Input.empty() : this.tagSpecifications;
    }

    @InputImport(name="targetCapacitySpecification", required=true)
      private final Input<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification;

    public Input<EC2FleetTargetCapacitySpecificationRequestArgs> getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }

    @InputImport(name="terminateInstancesWithExpiration")
      private final @Nullable Input<Boolean> terminateInstancesWithExpiration;

    public Input<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Input.empty() : this.terminateInstancesWithExpiration;
    }

    @InputImport(name="type")
      private final @Nullable Input<EC2FleetType> type;

    public Input<EC2FleetType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="validFrom")
      private final @Nullable Input<String> validFrom;

    public Input<String> getValidFrom() {
        return this.validFrom == null ? Input.empty() : this.validFrom;
    }

    @InputImport(name="validUntil")
      private final @Nullable Input<String> validUntil;

    public Input<String> getValidUntil() {
        return this.validUntil == null ? Input.empty() : this.validUntil;
    }

    public EC2FleetArgs(
        @Nullable Input<String> context,
        @Nullable Input<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy,
        Input<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs,
        @Nullable Input<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions,
        @Nullable Input<Boolean> replaceUnhealthyInstances,
        @Nullable Input<EC2FleetSpotOptionsRequestArgs> spotOptions,
        @Nullable Input<List<EC2FleetTagSpecificationArgs>> tagSpecifications,
        Input<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification,
        @Nullable Input<Boolean> terminateInstancesWithExpiration,
        @Nullable Input<EC2FleetType> type,
        @Nullable Input<String> validFrom,
        @Nullable Input<String> validUntil) {
        this.context = context;
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.launchTemplateConfigs = Objects.requireNonNull(launchTemplateConfigs, "expected parameter 'launchTemplateConfigs' to be non-null");
        this.onDemandOptions = onDemandOptions;
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        this.spotOptions = spotOptions;
        this.tagSpecifications = tagSpecifications;
        this.targetCapacitySpecification = Objects.requireNonNull(targetCapacitySpecification, "expected parameter 'targetCapacitySpecification' to be non-null");
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        this.type = type;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    private EC2FleetArgs() {
        this.context = Input.empty();
        this.excessCapacityTerminationPolicy = Input.empty();
        this.launchTemplateConfigs = Input.empty();
        this.onDemandOptions = Input.empty();
        this.replaceUnhealthyInstances = Input.empty();
        this.spotOptions = Input.empty();
        this.tagSpecifications = Input.empty();
        this.targetCapacitySpecification = Input.empty();
        this.terminateInstancesWithExpiration = Input.empty();
        this.type = Input.empty();
        this.validFrom = Input.empty();
        this.validUntil = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> context;
        private @Nullable Input<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;
        private Input<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs;
        private @Nullable Input<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions;
        private @Nullable Input<Boolean> replaceUnhealthyInstances;
        private @Nullable Input<EC2FleetSpotOptionsRequestArgs> spotOptions;
        private @Nullable Input<List<EC2FleetTagSpecificationArgs>> tagSpecifications;
        private Input<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification;
        private @Nullable Input<Boolean> terminateInstancesWithExpiration;
        private @Nullable Input<EC2FleetType> type;
        private @Nullable Input<String> validFrom;
        private @Nullable Input<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.launchTemplateConfigs = defaults.launchTemplateConfigs;
    	      this.onDemandOptions = defaults.onDemandOptions;
    	      this.replaceUnhealthyInstances = defaults.replaceUnhealthyInstances;
    	      this.spotOptions = defaults.spotOptions;
    	      this.tagSpecifications = defaults.tagSpecifications;
    	      this.targetCapacitySpecification = defaults.targetCapacitySpecification;
    	      this.terminateInstancesWithExpiration = defaults.terminateInstancesWithExpiration;
    	      this.type = defaults.type;
    	      this.validFrom = defaults.validFrom;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder setContext(@Nullable Input<String> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setExcessCapacityTerminationPolicy(@Nullable Input<EC2FleetExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder setExcessCapacityTerminationPolicy(@Nullable EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = Input.ofNullable(excessCapacityTerminationPolicy);
            return this;
        }

        public Builder setLaunchTemplateConfigs(Input<List<EC2FleetFleetLaunchTemplateConfigRequestArgs>> launchTemplateConfigs) {
            this.launchTemplateConfigs = Objects.requireNonNull(launchTemplateConfigs);
            return this;
        }

        public Builder setLaunchTemplateConfigs(List<EC2FleetFleetLaunchTemplateConfigRequestArgs> launchTemplateConfigs) {
            this.launchTemplateConfigs = Input.of(Objects.requireNonNull(launchTemplateConfigs));
            return this;
        }

        public Builder setOnDemandOptions(@Nullable Input<EC2FleetOnDemandOptionsRequestArgs> onDemandOptions) {
            this.onDemandOptions = onDemandOptions;
            return this;
        }

        public Builder setOnDemandOptions(@Nullable EC2FleetOnDemandOptionsRequestArgs onDemandOptions) {
            this.onDemandOptions = Input.ofNullable(onDemandOptions);
            return this;
        }

        public Builder setReplaceUnhealthyInstances(@Nullable Input<Boolean> replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder setReplaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = Input.ofNullable(replaceUnhealthyInstances);
            return this;
        }

        public Builder setSpotOptions(@Nullable Input<EC2FleetSpotOptionsRequestArgs> spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }

        public Builder setSpotOptions(@Nullable EC2FleetSpotOptionsRequestArgs spotOptions) {
            this.spotOptions = Input.ofNullable(spotOptions);
            return this;
        }

        public Builder setTagSpecifications(@Nullable Input<List<EC2FleetTagSpecificationArgs>> tagSpecifications) {
            this.tagSpecifications = tagSpecifications;
            return this;
        }

        public Builder setTagSpecifications(@Nullable List<EC2FleetTagSpecificationArgs> tagSpecifications) {
            this.tagSpecifications = Input.ofNullable(tagSpecifications);
            return this;
        }

        public Builder setTargetCapacitySpecification(Input<EC2FleetTargetCapacitySpecificationRequestArgs> targetCapacitySpecification) {
            this.targetCapacitySpecification = Objects.requireNonNull(targetCapacitySpecification);
            return this;
        }

        public Builder setTargetCapacitySpecification(EC2FleetTargetCapacitySpecificationRequestArgs targetCapacitySpecification) {
            this.targetCapacitySpecification = Input.of(Objects.requireNonNull(targetCapacitySpecification));
            return this;
        }

        public Builder setTerminateInstancesWithExpiration(@Nullable Input<Boolean> terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder setTerminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = Input.ofNullable(terminateInstancesWithExpiration);
            return this;
        }

        public Builder setType(@Nullable Input<EC2FleetType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable EC2FleetType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValidFrom(@Nullable Input<String> validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder setValidFrom(@Nullable String validFrom) {
            this.validFrom = Input.ofNullable(validFrom);
            return this;
        }

        public Builder setValidUntil(@Nullable Input<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        public Builder setValidUntil(@Nullable String validUntil) {
            this.validUntil = Input.ofNullable(validUntil);
            return this;
        }
        public EC2FleetArgs build() {
            return new EC2FleetArgs(context, excessCapacityTerminationPolicy, launchTemplateConfigs, onDemandOptions, replaceUnhealthyInstances, spotOptions, tagSpecifications, targetCapacitySpecification, terminateInstancesWithExpiration, type, validFrom, validUntil);
        }
    }
}
