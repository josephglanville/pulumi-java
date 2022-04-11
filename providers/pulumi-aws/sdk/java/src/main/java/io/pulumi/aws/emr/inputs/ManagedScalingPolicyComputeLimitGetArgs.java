// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedScalingPolicyComputeLimitGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedScalingPolicyComputeLimitGetArgs Empty = new ManagedScalingPolicyComputeLimitGetArgs();

    /**
     * The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
     */
    @Import(name="maximumCapacityUnits", required=true)
      private final Output<Integer> maximumCapacityUnits;

    public Output<Integer> getMaximumCapacityUnits() {
        return this.maximumCapacityUnits;
    }

    /**
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * 
     */
    @Import(name="maximumCoreCapacityUnits")
      private final @Nullable Output<Integer> maximumCoreCapacityUnits;

    public Output<Integer> getMaximumCoreCapacityUnits() {
        return this.maximumCoreCapacityUnits == null ? Codegen.empty() : this.maximumCoreCapacityUnits;
    }

    /**
     * The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances.
     * 
     */
    @Import(name="maximumOndemandCapacityUnits")
      private final @Nullable Output<Integer> maximumOndemandCapacityUnits;

    public Output<Integer> getMaximumOndemandCapacityUnits() {
        return this.maximumOndemandCapacityUnits == null ? Codegen.empty() : this.maximumOndemandCapacityUnits;
    }

    /**
     * The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
     */
    @Import(name="minimumCapacityUnits", required=true)
      private final Output<Integer> minimumCapacityUnits;

    public Output<Integer> getMinimumCapacityUnits() {
        return this.minimumCapacityUnits;
    }

    /**
     * The unit type used for specifying a managed scaling policy. Valid Values: `InstanceFleetUnits` | `Instances` | `VCPU`
     * 
     */
    @Import(name="unitType", required=true)
      private final Output<String> unitType;

    public Output<String> getUnitType() {
        return this.unitType;
    }

    public ManagedScalingPolicyComputeLimitGetArgs(
        Output<Integer> maximumCapacityUnits,
        @Nullable Output<Integer> maximumCoreCapacityUnits,
        @Nullable Output<Integer> maximumOndemandCapacityUnits,
        Output<Integer> minimumCapacityUnits,
        Output<String> unitType) {
        this.maximumCapacityUnits = Objects.requireNonNull(maximumCapacityUnits, "expected parameter 'maximumCapacityUnits' to be non-null");
        this.maximumCoreCapacityUnits = maximumCoreCapacityUnits;
        this.maximumOndemandCapacityUnits = maximumOndemandCapacityUnits;
        this.minimumCapacityUnits = Objects.requireNonNull(minimumCapacityUnits, "expected parameter 'minimumCapacityUnits' to be non-null");
        this.unitType = Objects.requireNonNull(unitType, "expected parameter 'unitType' to be non-null");
    }

    private ManagedScalingPolicyComputeLimitGetArgs() {
        this.maximumCapacityUnits = Codegen.empty();
        this.maximumCoreCapacityUnits = Codegen.empty();
        this.maximumOndemandCapacityUnits = Codegen.empty();
        this.minimumCapacityUnits = Codegen.empty();
        this.unitType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedScalingPolicyComputeLimitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maximumCapacityUnits;
        private @Nullable Output<Integer> maximumCoreCapacityUnits;
        private @Nullable Output<Integer> maximumOndemandCapacityUnits;
        private Output<Integer> minimumCapacityUnits;
        private Output<String> unitType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedScalingPolicyComputeLimitGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCapacityUnits = defaults.maximumCapacityUnits;
    	      this.maximumCoreCapacityUnits = defaults.maximumCoreCapacityUnits;
    	      this.maximumOndemandCapacityUnits = defaults.maximumOndemandCapacityUnits;
    	      this.minimumCapacityUnits = defaults.minimumCapacityUnits;
    	      this.unitType = defaults.unitType;
        }

        public Builder maximumCapacityUnits(Output<Integer> maximumCapacityUnits) {
            this.maximumCapacityUnits = Objects.requireNonNull(maximumCapacityUnits);
            return this;
        }
        public Builder maximumCapacityUnits(Integer maximumCapacityUnits) {
            this.maximumCapacityUnits = Output.of(Objects.requireNonNull(maximumCapacityUnits));
            return this;
        }
        public Builder maximumCoreCapacityUnits(@Nullable Output<Integer> maximumCoreCapacityUnits) {
            this.maximumCoreCapacityUnits = maximumCoreCapacityUnits;
            return this;
        }
        public Builder maximumCoreCapacityUnits(@Nullable Integer maximumCoreCapacityUnits) {
            this.maximumCoreCapacityUnits = Codegen.ofNullable(maximumCoreCapacityUnits);
            return this;
        }
        public Builder maximumOndemandCapacityUnits(@Nullable Output<Integer> maximumOndemandCapacityUnits) {
            this.maximumOndemandCapacityUnits = maximumOndemandCapacityUnits;
            return this;
        }
        public Builder maximumOndemandCapacityUnits(@Nullable Integer maximumOndemandCapacityUnits) {
            this.maximumOndemandCapacityUnits = Codegen.ofNullable(maximumOndemandCapacityUnits);
            return this;
        }
        public Builder minimumCapacityUnits(Output<Integer> minimumCapacityUnits) {
            this.minimumCapacityUnits = Objects.requireNonNull(minimumCapacityUnits);
            return this;
        }
        public Builder minimumCapacityUnits(Integer minimumCapacityUnits) {
            this.minimumCapacityUnits = Output.of(Objects.requireNonNull(minimumCapacityUnits));
            return this;
        }
        public Builder unitType(Output<String> unitType) {
            this.unitType = Objects.requireNonNull(unitType);
            return this;
        }
        public Builder unitType(String unitType) {
            this.unitType = Output.of(Objects.requireNonNull(unitType));
            return this;
        }        public ManagedScalingPolicyComputeLimitGetArgs build() {
            return new ManagedScalingPolicyComputeLimitGetArgs(maximumCapacityUnits, maximumCoreCapacityUnits, maximumOndemandCapacityUnits, minimumCapacityUnits, unitType);
        }
    }
}
