// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAdvancedMachineFeaturesArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAdvancedMachineFeaturesArgs Empty = new InstanceAdvancedMachineFeaturesArgs();

    /**
     * Defines whether the instance should have nested virtualization  enabled. Defaults to false.
     * 
     */
    @InputImport(name="enableNestedVirtualization")
      private final @Nullable Input<Boolean> enableNestedVirtualization;

    public Input<Boolean> getEnableNestedVirtualization() {
        return this.enableNestedVirtualization == null ? Input.empty() : this.enableNestedVirtualization;
    }

    /**
     * he number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
     * 
     */
    @InputImport(name="threadsPerCore")
      private final @Nullable Input<Integer> threadsPerCore;

    public Input<Integer> getThreadsPerCore() {
        return this.threadsPerCore == null ? Input.empty() : this.threadsPerCore;
    }

    public InstanceAdvancedMachineFeaturesArgs(
        @Nullable Input<Boolean> enableNestedVirtualization,
        @Nullable Input<Integer> threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.threadsPerCore = threadsPerCore;
    }

    private InstanceAdvancedMachineFeaturesArgs() {
        this.enableNestedVirtualization = Input.empty();
        this.threadsPerCore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableNestedVirtualization;
        private @Nullable Input<Integer> threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAdvancedMachineFeaturesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setEnableNestedVirtualization(@Nullable Input<Boolean> enableNestedVirtualization) {
            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder setEnableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Input.ofNullable(enableNestedVirtualization);
            return this;
        }

        public Builder setThreadsPerCore(@Nullable Input<Integer> threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder setThreadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = Input.ofNullable(threadsPerCore);
            return this;
        }
        public InstanceAdvancedMachineFeaturesArgs build() {
            return new InstanceAdvancedMachineFeaturesArgs(enableNestedVirtualization, threadsPerCore);
        }
    }
}
