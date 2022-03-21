// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetFleetLaunchTemplateSpecificationArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchTemplateOverridesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetLaunchTemplateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetLaunchTemplateConfigArgs Empty = new SpotFleetLaunchTemplateConfigArgs();

    @Import(name="launchTemplateSpecification")
      private final @Nullable Output<SpotFleetFleetLaunchTemplateSpecificationArgs> launchTemplateSpecification;

    public Output<SpotFleetFleetLaunchTemplateSpecificationArgs> getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification == null ? Output.empty() : this.launchTemplateSpecification;
    }

    @Import(name="overrides")
      private final @Nullable Output<List<SpotFleetLaunchTemplateOverridesArgs>> overrides;

    public Output<List<SpotFleetLaunchTemplateOverridesArgs>> getOverrides() {
        return this.overrides == null ? Output.empty() : this.overrides;
    }

    public SpotFleetLaunchTemplateConfigArgs(
        @Nullable Output<SpotFleetFleetLaunchTemplateSpecificationArgs> launchTemplateSpecification,
        @Nullable Output<List<SpotFleetLaunchTemplateOverridesArgs>> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    private SpotFleetLaunchTemplateConfigArgs() {
        this.launchTemplateSpecification = Output.empty();
        this.overrides = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLaunchTemplateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SpotFleetFleetLaunchTemplateSpecificationArgs> launchTemplateSpecification;
        private @Nullable Output<List<SpotFleetLaunchTemplateOverridesArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLaunchTemplateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(@Nullable Output<SpotFleetFleetLaunchTemplateSpecificationArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = launchTemplateSpecification;
            return this;
        }
        public Builder launchTemplateSpecification(@Nullable SpotFleetFleetLaunchTemplateSpecificationArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Output.ofNullable(launchTemplateSpecification);
            return this;
        }
        public Builder overrides(@Nullable Output<List<SpotFleetLaunchTemplateOverridesArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(@Nullable List<SpotFleetLaunchTemplateOverridesArgs> overrides) {
            this.overrides = Output.ofNullable(overrides);
            return this;
        }
        public Builder overrides(SpotFleetLaunchTemplateOverridesArgs... overrides) {
            return overrides(List.of(overrides));
        }        public SpotFleetLaunchTemplateConfigArgs build() {
            return new SpotFleetLaunchTemplateConfigArgs(launchTemplateSpecification, overrides);
        }
    }
}
