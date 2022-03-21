// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Network configuration for a Data Fusion instance. These configurations are used for peering with the customer network. Configurations are optional when a public Data Fusion instance is to be created. However, providing these configurations allows several benefits, such as reduced network latency while accessing the customer resources from managed Data Fusion instance nodes, as well as access to the customer on-prem resources.
 * 
 */
public final class NetworkConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigResponse Empty = new NetworkConfigResponse();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    @Import(name="ipAllocation", required=true)
      private final String ipAllocation;

    public String getIpAllocation() {
        return this.ipAllocation;
    }

    /**
     * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    public NetworkConfigResponse(
        String ipAllocation,
        String network) {
        this.ipAllocation = Objects.requireNonNull(ipAllocation, "expected parameter 'ipAllocation' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
    }

    private NetworkConfigResponse() {
        this.ipAllocation = null;
        this.network = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAllocation;
        private String network;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAllocation = defaults.ipAllocation;
    	      this.network = defaults.network;
        }

        public Builder ipAllocation(String ipAllocation) {
            this.ipAllocation = Objects.requireNonNull(ipAllocation);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(ipAllocation, network);
        }
    }
}
