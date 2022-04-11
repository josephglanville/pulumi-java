// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.inputs;

import io.pulumi.azurenative.hardwaresecuritymodules.inputs.ApiEntityReferenceArgs;
import io.pulumi.azurenative.hardwaresecuritymodules.inputs.NetworkInterfaceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    public Output<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Codegen.empty() : this.networkInterfaces;
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<ApiEntityReferenceArgs> subnet;

    public Output<ApiEntityReferenceArgs> getSubnet() {
        return this.subnet == null ? Codegen.empty() : this.subnet;
    }

    public NetworkProfileArgs(
        @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Output<ApiEntityReferenceArgs> subnet) {
        this.networkInterfaces = networkInterfaces;
        this.subnet = subnet;
    }

    private NetworkProfileArgs() {
        this.networkInterfaces = Codegen.empty();
        this.subnet = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Output<ApiEntityReferenceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.subnet = defaults.subnet;
        }

        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Codegen.ofNullable(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder subnet(@Nullable Output<ApiEntityReferenceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable ApiEntityReferenceArgs subnet) {
            this.subnet = Codegen.ofNullable(subnet);
            return this;
        }        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(networkInterfaces, subnet);
        }
    }
}
