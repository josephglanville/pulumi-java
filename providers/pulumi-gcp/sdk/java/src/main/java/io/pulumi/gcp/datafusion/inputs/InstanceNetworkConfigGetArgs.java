// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datafusion.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InstanceNetworkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkConfigGetArgs Empty = new InstanceNetworkConfigGetArgs();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    @InputImport(name="ipAllocation", required=true)
      private final Input<String> ipAllocation;

    public Input<String> getIpAllocation() {
        return this.ipAllocation;
    }

    /**
     * Name of the network in the project with which the tenant project
     * will be peered for executing pipelines. In case of shared VPC where the network resides in another host
     * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @InputImport(name="network", required=true)
      private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    public InstanceNetworkConfigGetArgs(
        Input<String> ipAllocation,
        Input<String> network) {
        this.ipAllocation = Objects.requireNonNull(ipAllocation, "expected parameter 'ipAllocation' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
    }

    private InstanceNetworkConfigGetArgs() {
        this.ipAllocation = Input.empty();
        this.network = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipAllocation;
        private Input<String> network;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAllocation = defaults.ipAllocation;
    	      this.network = defaults.network;
        }

        public Builder setIpAllocation(Input<String> ipAllocation) {
            this.ipAllocation = Objects.requireNonNull(ipAllocation);
            return this;
        }

        public Builder setIpAllocation(String ipAllocation) {
            this.ipAllocation = Input.of(Objects.requireNonNull(ipAllocation));
            return this;
        }

        public Builder setNetwork(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }
        public InstanceNetworkConfigGetArgs build() {
            return new InstanceNetworkConfigGetArgs(ipAllocation, network);
        }
    }
}
