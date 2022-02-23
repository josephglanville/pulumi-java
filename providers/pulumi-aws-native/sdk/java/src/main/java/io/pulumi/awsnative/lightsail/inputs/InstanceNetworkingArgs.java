// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.InstanceMonthlyTransferArgs;
import io.pulumi.awsnative.lightsail.inputs.InstancePortArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Networking of the Instance.
 * 
 */
public final class InstanceNetworkingArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkingArgs Empty = new InstanceNetworkingArgs();

    @InputImport(name="monthlyTransfer")
      private final @Nullable Input<InstanceMonthlyTransferArgs> monthlyTransfer;

    public Input<InstanceMonthlyTransferArgs> getMonthlyTransfer() {
        return this.monthlyTransfer == null ? Input.empty() : this.monthlyTransfer;
    }

    /**
     * Ports to the Instance.
     * 
     */
    @InputImport(name="ports", required=true)
      private final Input<List<InstancePortArgs>> ports;

    public Input<List<InstancePortArgs>> getPorts() {
        return this.ports;
    }

    public InstanceNetworkingArgs(
        @Nullable Input<InstanceMonthlyTransferArgs> monthlyTransfer,
        Input<List<InstancePortArgs>> ports) {
        this.monthlyTransfer = monthlyTransfer;
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private InstanceNetworkingArgs() {
        this.monthlyTransfer = Input.empty();
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceMonthlyTransferArgs> monthlyTransfer;
        private Input<List<InstancePortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthlyTransfer = defaults.monthlyTransfer;
    	      this.ports = defaults.ports;
        }

        public Builder setMonthlyTransfer(@Nullable Input<InstanceMonthlyTransferArgs> monthlyTransfer) {
            this.monthlyTransfer = monthlyTransfer;
            return this;
        }

        public Builder setMonthlyTransfer(@Nullable InstanceMonthlyTransferArgs monthlyTransfer) {
            this.monthlyTransfer = Input.ofNullable(monthlyTransfer);
            return this;
        }

        public Builder setPorts(Input<List<InstancePortArgs>> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setPorts(List<InstancePortArgs> ports) {
            this.ports = Input.of(Objects.requireNonNull(ports));
            return this;
        }
        public InstanceNetworkingArgs build() {
            return new InstanceNetworkingArgs(monthlyTransfer, ports);
        }
    }
}
