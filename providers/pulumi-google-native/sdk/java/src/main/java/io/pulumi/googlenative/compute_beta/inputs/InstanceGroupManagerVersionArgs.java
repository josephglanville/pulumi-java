// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.FixedOrPercentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerVersionArgs Empty = new InstanceGroupManagerVersionArgs();

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
     * 
     */
    @Import(name="instanceTemplate")
      private final @Nullable Output<String> instanceTemplate;

    public Output<String> getInstanceTemplate() {
        return this.instanceTemplate == null ? Output.empty() : this.instanceTemplate;
    }

    /**
     * Name of the version. Unique among all versions in the scope of this managed instance group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to: - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded. If unset, this version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
     * 
     */
    @Import(name="targetSize")
      private final @Nullable Output<FixedOrPercentArgs> targetSize;

    public Output<FixedOrPercentArgs> getTargetSize() {
        return this.targetSize == null ? Output.empty() : this.targetSize;
    }

    public InstanceGroupManagerVersionArgs(
        @Nullable Output<String> instanceTemplate,
        @Nullable Output<String> name,
        @Nullable Output<FixedOrPercentArgs> targetSize) {
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.targetSize = targetSize;
    }

    private InstanceGroupManagerVersionArgs() {
        this.instanceTemplate = Output.empty();
        this.name = Output.empty();
        this.targetSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceTemplate;
        private @Nullable Output<String> name;
        private @Nullable Output<FixedOrPercentArgs> targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder instanceTemplate(@Nullable Output<String> instanceTemplate) {
            this.instanceTemplate = instanceTemplate;
            return this;
        }
        public Builder instanceTemplate(@Nullable String instanceTemplate) {
            this.instanceTemplate = Output.ofNullable(instanceTemplate);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder targetSize(@Nullable Output<FixedOrPercentArgs> targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Builder targetSize(@Nullable FixedOrPercentArgs targetSize) {
            this.targetSize = Output.ofNullable(targetSize);
            return this;
        }        public InstanceGroupManagerVersionArgs build() {
            return new InstanceGroupManagerVersionArgs(instanceTemplate, name, targetSize);
        }
    }
}
