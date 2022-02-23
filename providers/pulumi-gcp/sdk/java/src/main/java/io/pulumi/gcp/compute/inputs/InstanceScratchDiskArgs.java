// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InstanceScratchDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceScratchDiskArgs Empty = new InstanceScratchDiskArgs();

    /**
     * The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
     */
    @InputImport(name="interface", required=true)
      private final Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface;
    }

    public InstanceScratchDiskArgs(Input<String> $interface) {
        this.$interface = Objects.requireNonNull($interface, "expected parameter '$interface' to be non-null");
    }

    private InstanceScratchDiskArgs() {
        this.$interface = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScratchDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> $interface;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceScratchDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$interface = defaults.$interface;
        }

        public Builder set$interface(Input<String> $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder set$interface(String $interface) {
            this.$interface = Input.of(Objects.requireNonNull($interface));
            return this;
        }
        public InstanceScratchDiskArgs build() {
            return new InstanceScratchDiskArgs($interface);
        }
    }
}
