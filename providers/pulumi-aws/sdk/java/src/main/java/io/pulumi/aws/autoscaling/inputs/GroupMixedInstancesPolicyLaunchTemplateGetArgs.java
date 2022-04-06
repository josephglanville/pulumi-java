// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyLaunchTemplateGetArgs Empty = new GroupMixedInstancesPolicyLaunchTemplateGetArgs();

    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    @Import(name="launchTemplateSpecification", required=true)
      private final Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification;

    public Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    @Import(name="overrides")
      private final @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides;

    public Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> getOverrides() {
        return this.overrides == null ? Output.empty() : this.overrides;
    }

    public GroupMixedInstancesPolicyLaunchTemplateGetArgs(
        Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification,
        @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides) {
        this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification, "expected parameter 'launchTemplateSpecification' to be non-null");
        this.overrides = overrides;
    }

    private GroupMixedInstancesPolicyLaunchTemplateGetArgs() {
        this.launchTemplateSpecification = Output.empty();
        this.overrides = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification;
        private @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }
        public Builder launchTemplateSpecification(GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Output.of(Objects.requireNonNull(launchTemplateSpecification));
            return this;
        }
        public Builder overrides(@Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(@Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs> overrides) {
            this.overrides = Output.ofNullable(overrides);
            return this;
        }
        public Builder overrides(GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs... overrides) {
            return overrides(List.of(overrides));
        }        public GroupMixedInstancesPolicyLaunchTemplateGetArgs build() {
            return new GroupMixedInstancesPolicyLaunchTemplateGetArgs(launchTemplateSpecification, overrides);
        }
    }
}