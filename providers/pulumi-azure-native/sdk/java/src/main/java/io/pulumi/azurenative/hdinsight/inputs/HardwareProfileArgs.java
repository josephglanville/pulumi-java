// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The hardware profile.
 * 
 */
public final class HardwareProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final HardwareProfileArgs Empty = new HardwareProfileArgs();

    /**
     * The size of the VM
     * 
     */
    @InputImport(name="vmSize")
      private final @Nullable Output<String> vmSize;

    public Output<String> getVmSize() {
        return this.vmSize == null ? Output.empty() : this.vmSize;
    }

    public HardwareProfileArgs(@Nullable Output<String> vmSize) {
        this.vmSize = vmSize;
    }

    private HardwareProfileArgs() {
        this.vmSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmSize = defaults.vmSize;
        }

        public Builder vmSize(@Nullable Output<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = Output.ofNullable(vmSize);
            return this;
        }
        public HardwareProfileArgs build() {
            return new HardwareProfileArgs(vmSize);
        }
    }
}
