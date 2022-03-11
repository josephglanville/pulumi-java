// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAccessConfigGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceAliasIpRangeGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceIpv6AccessConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceGetArgs Empty = new InstanceNetworkInterfaceGetArgs();

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
      private final @Nullable Output<List<InstanceNetworkInterfaceAccessConfigGetArgs>> accessConfigs;

    public Output<List<InstanceNetworkInterfaceAccessConfigGetArgs>> getAccessConfigs() {
        return this.accessConfigs == null ? Output.empty() : this.accessConfigs;
    }

    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    @InputImport(name="aliasIpRanges")
      private final @Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;

    public Output<List<InstanceNetworkInterfaceAliasIpRangeGetArgs>> getAliasIpRanges() {
        return this.aliasIpRanges == null ? Output.empty() : this.aliasIpRanges;
    }

    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    @InputImport(name="ipv6AccessConfigs")
      private final @Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;

    public Output<List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs>> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Output.empty() : this.ipv6AccessConfigs;
    }

    /**
     * One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet.
     * This field is always inherited from its subnetwork.
     * 
     */
    @InputImport(name="ipv6AccessType")
      private final @Nullable Output<String> ipv6AccessType;

    public Output<String> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Output.empty() : this.ipv6AccessType;
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name or self_link of the network to attach this interface to.
     * Either `network` or `subnetwork` must be provided. If network isn't provided it will
     * be inferred from the subnetwork.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    @InputImport(name="networkIp")
      private final @Nullable Output<String> networkIp;

    public Output<String> getNetworkIp() {
        return this.networkIp == null ? Output.empty() : this.networkIp;
    }

    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    @InputImport(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> getNicType() {
        return this.nicType == null ? Output.empty() : this.nicType;
    }

    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    @InputImport(name="queueCount")
      private final @Nullable Output<Integer> queueCount;

    public Output<Integer> getQueueCount() {
        return this.queueCount == null ? Output.empty() : this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    @InputImport(name="stackType")
      private final @Nullable Output<String> stackType;

    public Output<String> getStackType() {
        return this.stackType == null ? Output.empty() : this.stackType;
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
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * The project in which the subnetwork belongs.
     * If the `subnetwork` is a self_link, this field is ignored in favor of the project
     * defined in the subnetwork self_link. If the `subnetwork` is a name and this
     * field is not provided, the provider project is used.
     * 
     */
    @InputImport(name="subnetworkProject")
      private final @Nullable Output<String> subnetworkProject;

    public Output<String> getSubnetworkProject() {
        return this.subnetworkProject == null ? Output.empty() : this.subnetworkProject;
    }

    public InstanceNetworkInterfaceGetArgs(
        @Nullable Output<List<InstanceNetworkInterfaceAccessConfigGetArgs>> accessConfigs,
        @Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges,
        @Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs,
        @Nullable Output<String> ipv6AccessType,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> networkIp,
        @Nullable Output<String> nicType,
        @Nullable Output<Integer> queueCount,
        @Nullable Output<String> stackType,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> subnetworkProject) {
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

    private InstanceNetworkInterfaceGetArgs() {
        this.accessConfigs = Output.empty();
        this.aliasIpRanges = Output.empty();
        this.ipv6AccessConfigs = Output.empty();
        this.ipv6AccessType = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.networkIp = Output.empty();
        this.nicType = Output.empty();
        this.queueCount = Output.empty();
        this.stackType = Output.empty();
        this.subnetwork = Output.empty();
        this.subnetworkProject = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceNetworkInterfaceAccessConfigGetArgs>> accessConfigs;
        private @Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;
        private @Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;
        private @Nullable Output<String> ipv6AccessType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> networkIp;
        private @Nullable Output<String> nicType;
        private @Nullable Output<Integer> queueCount;
        private @Nullable Output<String> stackType;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceGetArgs defaults) {
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

        public Builder accessConfigs(@Nullable Output<List<InstanceNetworkInterfaceAccessConfigGetArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }

        public Builder accessConfigs(@Nullable List<InstanceNetworkInterfaceAccessConfigGetArgs> accessConfigs) {
            this.accessConfigs = Output.ofNullable(accessConfigs);
            return this;
        }

        public Builder aliasIpRanges(@Nullable Output<List<InstanceNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }

        public Builder aliasIpRanges(@Nullable List<InstanceNetworkInterfaceAliasIpRangeGetArgs> aliasIpRanges) {
            this.aliasIpRanges = Output.ofNullable(aliasIpRanges);
            return this;
        }

        public Builder ipv6AccessConfigs(@Nullable Output<List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        public Builder ipv6AccessConfigs(@Nullable List<InstanceNetworkInterfaceIpv6AccessConfigGetArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Output.ofNullable(ipv6AccessConfigs);
            return this;
        }

        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Output.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder networkIp(@Nullable Output<String> networkIp) {
            this.networkIp = networkIp;
            return this;
        }

        public Builder networkIp(@Nullable String networkIp) {
            this.networkIp = Output.ofNullable(networkIp);
            return this;
        }

        public Builder nicType(@Nullable Output<String> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder nicType(@Nullable String nicType) {
            this.nicType = Output.ofNullable(nicType);
            return this;
        }

        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }

        public Builder queueCount(@Nullable Integer queueCount) {
            this.queueCount = Output.ofNullable(queueCount);
            return this;
        }

        public Builder stackType(@Nullable Output<String> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder stackType(@Nullable String stackType) {
            this.stackType = Output.ofNullable(stackType);
            return this;
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }

        public Builder subnetworkProject(@Nullable Output<String> subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }

        public Builder subnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = Output.ofNullable(subnetworkProject);
            return this;
        }
        public InstanceNetworkInterfaceGetArgs build() {
            return new InstanceNetworkInterfaceGetArgs(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
