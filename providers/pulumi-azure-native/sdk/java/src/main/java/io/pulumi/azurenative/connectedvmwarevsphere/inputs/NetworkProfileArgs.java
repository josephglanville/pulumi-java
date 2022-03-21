// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.NetworkInterfaceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Gets or sets the list of network interfaces associated with the virtual machine.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    public Output<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Output.empty() : this.networkInterfaces;
    }

    public NetworkProfileArgs(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    private NetworkProfileArgs() {
        this.networkInterfaces = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Output.ofNullable(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(networkInterfaces);
        }
    }
}
