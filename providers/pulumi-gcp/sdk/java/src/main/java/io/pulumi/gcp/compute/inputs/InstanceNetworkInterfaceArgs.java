// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAccessConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpRangeArgs;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceIpv6AccessConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceArgs Empty = new InstanceNetworkInterfaceArgs();

    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet. If omitted, ssh will not
     * work unless this provider can send traffic to the instance's network (e.g. via
     * tunnel or because it is running on another cloud instance on that network).
     * This block can be repeated multiple times. Structure documented below.
     * 
     */
    @InputImport(name="accessConfigs")
      private final @Nullable Input<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs;

    public Input<List<InstanceNetworkInterfaceAccessConfigArgs>> getAccessConfigs() {
        return this.accessConfigs == null ? Input.empty() : this.accessConfigs;
    }

    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    @InputImport(name="aliasIpRanges")
      private final @Nullable Input<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges;

    public Input<List<InstanceNetworkInterfaceAliasIpRangeArgs>> getAliasIpRanges() {
        return this.aliasIpRanges == null ? Input.empty() : this.aliasIpRanges;
    }

    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    @InputImport(name="ipv6AccessConfigs")
      private final @Nullable Input<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs;

    public Input<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Input.empty() : this.ipv6AccessConfigs;
    }

    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
     * This field is always inherited from its subnetwork.
     * 
     */
    @InputImport(name="ipv6AccessType")
      private final @Nullable Input<String> ipv6AccessType;

    public Input<String> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Input.empty() : this.ipv6AccessType;
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name or self_link of the network to attach this interface to.
     * Either `network` or `subnetwork` must be provided. If network isn't provided it will
     * be inferred from the subnetwork.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    @InputImport(name="networkIp")
      private final @Nullable Input<String> networkIp;

    public Input<String> getNetworkIp() {
        return this.networkIp == null ? Input.empty() : this.networkIp;
    }

    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    @InputImport(name="nicType")
      private final @Nullable Input<String> nicType;

    public Input<String> getNicType() {
        return this.nicType == null ? Input.empty() : this.nicType;
    }

    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    @InputImport(name="queueCount")
      private final @Nullable Input<Integer> queueCount;

    public Input<Integer> getQueueCount() {
        return this.queueCount == null ? Input.empty() : this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    @InputImport(name="stackType")
      private final @Nullable Input<String> stackType;

    public Input<String> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    /**
     * The name or self_link of the subnetwork to attach this
     * interface to. Either `network` or `subnetwork` must be provided. If network isn't provided
     * it will be inferred from the subnetwork. The subnetwork must exist in the same region this
     * instance will be created in. If the network resource is in
     * [legacy](https://cloud.google.com/vpc/docs/legacy) mode, do not specify this field. If the
     * network is in auto subnet mode, specifying the subnetwork is optional. If the network is
     * in custom subnet mode, specifying the subnetwork is required.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    /**
     * The project in which the subnetwork belongs.
     * If the `subnetwork` is a self_link, this field is ignored in favor of the project
     * defined in the subnetwork self_link. If the `subnetwork` is a name and this
     * field is not provided, the provider project is used.
     * 
     */
    @InputImport(name="subnetworkProject")
      private final @Nullable Input<String> subnetworkProject;

    public Input<String> getSubnetworkProject() {
        return this.subnetworkProject == null ? Input.empty() : this.subnetworkProject;
    }

    public InstanceNetworkInterfaceArgs(
        @Nullable Input<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs,
        @Nullable Input<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges,
        @Nullable Input<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs,
        @Nullable Input<String> ipv6AccessType,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> networkIp,
        @Nullable Input<String> nicType,
        @Nullable Input<Integer> queueCount,
        @Nullable Input<String> stackType,
        @Nullable Input<String> subnetwork,
        @Nullable Input<String> subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    private InstanceNetworkInterfaceArgs() {
        this.accessConfigs = Input.empty();
        this.aliasIpRanges = Input.empty();
        this.ipv6AccessConfigs = Input.empty();
        this.ipv6AccessType = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkIp = Input.empty();
        this.nicType = Input.empty();
        this.queueCount = Input.empty();
        this.stackType = Input.empty();
        this.subnetwork = Input.empty();
        this.subnetworkProject = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs;
        private @Nullable Input<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges;
        private @Nullable Input<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs;
        private @Nullable Input<String> ipv6AccessType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> networkIp;
        private @Nullable Input<String> nicType;
        private @Nullable Input<Integer> queueCount;
        private @Nullable Input<String> stackType;
        private @Nullable Input<String> subnetwork;
        private @Nullable Input<String> subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder setAccessConfigs(@Nullable Input<List<InstanceNetworkInterfaceAccessConfigArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }

        public Builder setAccessConfigs(@Nullable List<InstanceNetworkInterfaceAccessConfigArgs> accessConfigs) {
            this.accessConfigs = Input.ofNullable(accessConfigs);
            return this;
        }

        public Builder setAliasIpRanges(@Nullable Input<List<InstanceNetworkInterfaceAliasIpRangeArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }

        public Builder setAliasIpRanges(@Nullable List<InstanceNetworkInterfaceAliasIpRangeArgs> aliasIpRanges) {
            this.aliasIpRanges = Input.ofNullable(aliasIpRanges);
            return this;
        }

        public Builder setIpv6AccessConfigs(@Nullable Input<List<InstanceNetworkInterfaceIpv6AccessConfigArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        public Builder setIpv6AccessConfigs(@Nullable List<InstanceNetworkInterfaceIpv6AccessConfigArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Input.ofNullable(ipv6AccessConfigs);
            return this;
        }

        public Builder setIpv6AccessType(@Nullable Input<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder setIpv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Input.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkIp(@Nullable Input<String> networkIp) {
            this.networkIp = networkIp;
            return this;
        }

        public Builder setNetworkIp(@Nullable String networkIp) {
            this.networkIp = Input.ofNullable(networkIp);
            return this;
        }

        public Builder setNicType(@Nullable Input<String> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = Input.ofNullable(nicType);
            return this;
        }

        public Builder setQueueCount(@Nullable Input<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }

        public Builder setQueueCount(@Nullable Integer queueCount) {
            this.queueCount = Input.ofNullable(queueCount);
            return this;
        }

        public Builder setStackType(@Nullable Input<String> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setStackType(@Nullable String stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public Builder setSubnetworkProject(@Nullable Input<String> subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }

        public Builder setSubnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = Input.ofNullable(subnetworkProject);
            return this;
        }
        public InstanceNetworkInterfaceArgs build() {
            return new InstanceNetworkInterfaceArgs(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
