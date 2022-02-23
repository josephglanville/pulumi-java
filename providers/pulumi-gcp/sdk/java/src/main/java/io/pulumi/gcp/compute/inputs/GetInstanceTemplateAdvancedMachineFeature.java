// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceTemplateAdvancedMachineFeature extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateAdvancedMachineFeature Empty = new GetInstanceTemplateAdvancedMachineFeature();

    @InputImport(name="enableNestedVirtualization", required=true)
      private final Boolean enableNestedVirtualization;

    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }

    @InputImport(name="threadsPerCore", required=true)
      private final Integer threadsPerCore;

    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    public GetInstanceTemplateAdvancedMachineFeature(
        Boolean enableNestedVirtualization,
        Integer threadsPerCore) {
        this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization, "expected parameter 'enableNestedVirtualization' to be non-null");
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore, "expected parameter 'threadsPerCore' to be non-null");
    }

    private GetInstanceTemplateAdvancedMachineFeature() {
        this.enableNestedVirtualization = null;
        this.threadsPerCore = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateAdvancedMachineFeature defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateAdvancedMachineFeature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setEnableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }
        public GetInstanceTemplateAdvancedMachineFeature build() {
            return new GetInstanceTemplateAdvancedMachineFeature(enableNestedVirtualization, threadsPerCore);
        }
    }
}
