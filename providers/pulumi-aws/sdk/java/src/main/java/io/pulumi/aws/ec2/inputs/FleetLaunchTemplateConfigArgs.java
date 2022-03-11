// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs;
import io.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigArgs Empty = new FleetLaunchTemplateConfigArgs();

    /**
     * Nested argument containing EC2 Launch Template to use. Defined below.
     * 
     */
    @InputImport(name="launchTemplateSpecification", required=true)
      private final Output<FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs> launchTemplateSpecification;

    public Output<FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs> getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
     * 
     */
    @InputImport(name="overrides")
      private final @Nullable Output<List<FleetLaunchTemplateConfigOverrideArgs>> overrides;

    public Output<List<FleetLaunchTemplateConfigOverrideArgs>> getOverrides() {
        return this.overrides == null ? Output.empty() : this.overrides;
    }

    public FleetLaunchTemplateConfigArgs(
        Output<FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs> launchTemplateSpecification,
        @Nullable Output<List<FleetLaunchTemplateConfigOverrideArgs>> overrides) {
        this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification, "expected parameter 'launchTemplateSpecification' to be non-null");
        this.overrides = overrides;
    }

    private FleetLaunchTemplateConfigArgs() {
        this.launchTemplateSpecification = Output.empty();
        this.overrides = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs> launchTemplateSpecification;
        private @Nullable Output<List<FleetLaunchTemplateConfigOverrideArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(Output<FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }

        public Builder launchTemplateSpecification(FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Output.of(Objects.requireNonNull(launchTemplateSpecification));
            return this;
        }

        public Builder overrides(@Nullable Output<List<FleetLaunchTemplateConfigOverrideArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder overrides(@Nullable List<FleetLaunchTemplateConfigOverrideArgs> overrides) {
            this.overrides = Output.ofNullable(overrides);
            return this;
        }
        public FleetLaunchTemplateConfigArgs build() {
            return new FleetLaunchTemplateConfigArgs(launchTemplateSpecification, overrides);
        }
    }
}
