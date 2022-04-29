// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.VmClusterNetworkVmNetworkNode;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VmClusterNetworkVmNetwork {
    /**
     * @return (Updatable) The network domain name.
     * 
     */
    private final String domainName;
    /**
     * @return (Updatable) The network gateway.
     * 
     */
    private final String gateway;
    /**
     * @return (Updatable) The network netmask.
     * 
     */
    private final String netmask;
    /**
     * @return (Updatable) The network type.
     * 
     */
    private final String networkType;
    /**
     * @return (Updatable) The list of node details.
     * 
     */
    private final List<VmClusterNetworkVmNetworkNode> nodes;
    /**
     * @return (Updatable) The network VLAN ID.
     * 
     */
    private final String vlanId;

    @CustomType.Constructor
    private VmClusterNetworkVmNetwork(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("gateway") String gateway,
        @CustomType.Parameter("netmask") String netmask,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("nodes") List<VmClusterNetworkVmNetworkNode> nodes,
        @CustomType.Parameter("vlanId") String vlanId) {
        this.domainName = domainName;
        this.gateway = gateway;
        this.netmask = netmask;
        this.networkType = networkType;
        this.nodes = nodes;
        this.vlanId = vlanId;
    }

    /**
     * @return (Updatable) The network domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return (Updatable) The network gateway.
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return (Updatable) The network netmask.
     * 
     */
    public String netmask() {
        return this.netmask;
    }
    /**
     * @return (Updatable) The network type.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return (Updatable) The list of node details.
     * 
     */
    public List<VmClusterNetworkVmNetworkNode> nodes() {
        return this.nodes;
    }
    /**
     * @return (Updatable) The network VLAN ID.
     * 
     */
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmClusterNetworkVmNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String gateway;
        private String netmask;
        private String networkType;
        private List<VmClusterNetworkVmNetworkNode> nodes;
        private String vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmClusterNetworkVmNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.gateway = defaults.gateway;
    	      this.netmask = defaults.netmask;
    	      this.networkType = defaults.networkType;
    	      this.nodes = defaults.nodes;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder gateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        public Builder netmask(String netmask) {
            this.netmask = Objects.requireNonNull(netmask);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder nodes(List<VmClusterNetworkVmNetworkNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(VmClusterNetworkVmNetworkNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder vlanId(String vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }        public VmClusterNetworkVmNetwork build() {
            return new VmClusterNetworkVmNetwork(domainName, gateway, netmask, networkType, nodes, vlanId);
        }
    }
}
