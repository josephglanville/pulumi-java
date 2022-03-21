// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.outputs.EC2FleetTargetCapacitySpecificationRequest;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEC2FleetResult {
    private final @Nullable String context;
    private final @Nullable EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy;
    private final @Nullable String fleetId;
    private final @Nullable EC2FleetTargetCapacitySpecificationRequest targetCapacitySpecification;

    @CustomType.Constructor
    private GetEC2FleetResult(
        @CustomType.Parameter("context") @Nullable String context,
        @CustomType.Parameter("excessCapacityTerminationPolicy") @Nullable EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy,
        @CustomType.Parameter("fleetId") @Nullable String fleetId,
        @CustomType.Parameter("targetCapacitySpecification") @Nullable EC2FleetTargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.context = context;
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.fleetId = fleetId;
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    public Optional<String> getContext() {
        return Optional.ofNullable(this.context);
    }
    public Optional<EC2FleetExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return Optional.ofNullable(this.excessCapacityTerminationPolicy);
    }
    public Optional<String> getFleetId() {
        return Optional.ofNullable(this.fleetId);
    }
    public Optional<EC2FleetTargetCapacitySpecificationRequest> getTargetCapacitySpecification() {
        return Optional.ofNullable(this.targetCapacitySpecification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEC2FleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private @Nullable EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy;
        private @Nullable String fleetId;
        private @Nullable EC2FleetTargetCapacitySpecificationRequest targetCapacitySpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEC2FleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.fleetId = defaults.fleetId;
    	      this.targetCapacitySpecification = defaults.targetCapacitySpecification;
        }

        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        public Builder excessCapacityTerminationPolicy(@Nullable EC2FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }
        public Builder fleetId(@Nullable String fleetId) {
            this.fleetId = fleetId;
            return this;
        }
        public Builder targetCapacitySpecification(@Nullable EC2FleetTargetCapacitySpecificationRequest targetCapacitySpecification) {
            this.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }        public GetEC2FleetResult build() {
            return new GetEC2FleetResult(context, excessCapacityTerminationPolicy, fleetId, targetCapacitySpecification);
        }
    }
}
