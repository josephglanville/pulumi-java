// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceTemplateConfidentialInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateConfidentialInstanceConfigArgs Empty = new InstanceTemplateConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
     */
    @InputImport(name="enableConfidentialCompute", required=true)
      private final Input<Boolean> enableConfidentialCompute;

    public Input<Boolean> getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public InstanceTemplateConfidentialInstanceConfigArgs(Input<Boolean> enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private InstanceTemplateConfidentialInstanceConfigArgs() {
        this.enableConfidentialCompute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(Input<Boolean> enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }

        public Builder setEnableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Input.of(Objects.requireNonNull(enableConfidentialCompute));
            return this;
        }
        public InstanceTemplateConfidentialInstanceConfigArgs build() {
            return new InstanceTemplateConfidentialInstanceConfigArgs(enableConfidentialCompute);
        }
    }
}
