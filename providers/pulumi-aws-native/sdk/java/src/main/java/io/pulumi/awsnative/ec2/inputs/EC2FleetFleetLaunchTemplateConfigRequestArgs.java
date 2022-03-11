// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.EC2FleetFleetLaunchTemplateOverridesRequestArgs;
import io.pulumi.awsnative.ec2.inputs.EC2FleetFleetLaunchTemplateSpecificationRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetFleetLaunchTemplateConfigRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetFleetLaunchTemplateConfigRequestArgs Empty = new EC2FleetFleetLaunchTemplateConfigRequestArgs();

    @InputImport(name="launchTemplateSpecification")
      private final @Nullable Output<EC2FleetFleetLaunchTemplateSpecificationRequestArgs> launchTemplateSpecification;

    public Output<EC2FleetFleetLaunchTemplateSpecificationRequestArgs> getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification == null ? Output.empty() : this.launchTemplateSpecification;
    }

    @InputImport(name="overrides")
      private final @Nullable Output<List<EC2FleetFleetLaunchTemplateOverridesRequestArgs>> overrides;

    public Output<List<EC2FleetFleetLaunchTemplateOverridesRequestArgs>> getOverrides() {
        return this.overrides == null ? Output.empty() : this.overrides;
    }

    public EC2FleetFleetLaunchTemplateConfigRequestArgs(
        @Nullable Output<EC2FleetFleetLaunchTemplateSpecificationRequestArgs> launchTemplateSpecification,
        @Nullable Output<List<EC2FleetFleetLaunchTemplateOverridesRequestArgs>> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    private EC2FleetFleetLaunchTemplateConfigRequestArgs() {
        this.launchTemplateSpecification = Output.empty();
        this.overrides = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateConfigRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EC2FleetFleetLaunchTemplateSpecificationRequestArgs> launchTemplateSpecification;
        private @Nullable Output<List<EC2FleetFleetLaunchTemplateOverridesRequestArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateConfigRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(@Nullable Output<EC2FleetFleetLaunchTemplateSpecificationRequestArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = launchTemplateSpecification;
            return this;
        }

        public Builder launchTemplateSpecification(@Nullable EC2FleetFleetLaunchTemplateSpecificationRequestArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Output.ofNullable(launchTemplateSpecification);
            return this;
        }

        public Builder overrides(@Nullable Output<List<EC2FleetFleetLaunchTemplateOverridesRequestArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder overrides(@Nullable List<EC2FleetFleetLaunchTemplateOverridesRequestArgs> overrides) {
            this.overrides = Output.ofNullable(overrides);
            return this;
        }
        public EC2FleetFleetLaunchTemplateConfigRequestArgs build() {
            return new EC2FleetFleetLaunchTemplateConfigRequestArgs(launchTemplateSpecification, overrides);
        }
    }
}
