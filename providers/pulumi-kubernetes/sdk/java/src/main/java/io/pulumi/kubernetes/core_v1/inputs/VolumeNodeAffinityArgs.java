// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.NodeSelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 * 
 */
public final class VolumeNodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeNodeAffinityArgs Empty = new VolumeNodeAffinityArgs();

    /**
     * Required specifies hard node constraints that must be met.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Input<NodeSelectorArgs> required;

    public Input<NodeSelectorArgs> getRequired() {
        return this.required == null ? Input.empty() : this.required;
    }

    public VolumeNodeAffinityArgs(@Nullable Input<NodeSelectorArgs> required) {
        this.required = required;
    }

    private VolumeNodeAffinityArgs() {
        this.required = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeSelectorArgs> required;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeNodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.required = defaults.required;
        }

        public Builder setRequired(@Nullable Input<NodeSelectorArgs> required) {
            this.required = required;
            return this;
        }

        public Builder setRequired(@Nullable NodeSelectorArgs required) {
            this.required = Input.ofNullable(required);
            return this;
        }
        public VolumeNodeAffinityArgs build() {
            return new VolumeNodeAffinityArgs(required);
        }
    }
}
