// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.NetworkInterfaceSubInterfaceIpAllocationMode;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceSubInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceSubInterfaceArgs Empty = new NetworkInterfaceSubInterfaceArgs();

    /**
     * An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    @InputImport(name="ipAllocationMode")
      private final @Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode;

    public Output<NetworkInterfaceSubInterfaceIpAllocationMode> getIpAllocationMode() {
        return this.ipAllocationMode == null ? Output.empty() : this.ipAllocationMode;
    }

    /**
     * If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
     * 
     */
    @InputImport(name="vlan")
      private final @Nullable Output<Integer> vlan;

    public Output<Integer> getVlan() {
        return this.vlan == null ? Output.empty() : this.vlan;
    }

    public NetworkInterfaceSubInterfaceArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode,
        @Nullable Output<String> subnetwork,
        @Nullable Output<Integer> vlan) {
        this.ipAddress = ipAddress;
        this.ipAllocationMode = ipAllocationMode;
        this.subnetwork = subnetwork;
        this.vlan = vlan;
    }

    private NetworkInterfaceSubInterfaceArgs() {
        this.ipAddress = Output.empty();
        this.ipAllocationMode = Output.empty();
        this.subnetwork = Output.empty();
        this.vlan = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceSubInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceSubInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMode = defaults.ipAllocationMode;
    	      this.subnetwork = defaults.subnetwork;
    	      this.vlan = defaults.vlan;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }

        public Builder ipAllocationMode(@Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode) {
            this.ipAllocationMode = ipAllocationMode;
            return this;
        }

        public Builder ipAllocationMode(@Nullable NetworkInterfaceSubInterfaceIpAllocationMode ipAllocationMode) {
            this.ipAllocationMode = Output.ofNullable(ipAllocationMode);
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

        public Builder vlan(@Nullable Output<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }

        public Builder vlan(@Nullable Integer vlan) {
            this.vlan = Output.ofNullable(vlan);
            return this;
        }
        public NetworkInterfaceSubInterfaceArgs build() {
            return new NetworkInterfaceSubInterfaceArgs(ipAddress, ipAllocationMode, subnetwork, vlan);
        }
    }
}
