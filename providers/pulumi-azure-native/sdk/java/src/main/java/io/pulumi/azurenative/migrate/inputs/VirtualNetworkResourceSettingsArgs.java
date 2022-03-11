// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SubnetResourceSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the virtual network resource settings.
 * 
 */
public final class VirtualNetworkResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkResourceSettingsArgs Empty = new VirtualNetworkResourceSettingsArgs();

    /**
     * Gets or sets the address prefixes for the virtual network.
     * 
     */
    @InputImport(name="addressSpace")
      private final @Nullable Output<List<String>> addressSpace;

    public Output<List<String>> getAddressSpace() {
        return this.addressSpace == null ? Output.empty() : this.addressSpace;
    }

    /**
     * Gets or sets DHCPOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     * 
     */
    @InputImport(name="dnsServers")
      private final @Nullable Output<List<String>> dnsServers;

    public Output<List<String>> getDnsServers() {
        return this.dnsServers == null ? Output.empty() : this.dnsServers;
    }

    /**
     * Gets or sets a value indicating whether gets or sets whether the
     * DDOS protection should be switched on.
     * 
     */
    @InputImport(name="enableDdosProtection")
      private final @Nullable Output<Boolean> enableDdosProtection;

    public Output<Boolean> getEnableDdosProtection() {
        return this.enableDdosProtection == null ? Output.empty() : this.enableDdosProtection;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/virtualNetworks'.
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets List of subnets in a VirtualNetwork.
     * 
     */
    @InputImport(name="subnets")
      private final @Nullable Output<List<SubnetResourceSettingsArgs>> subnets;

    public Output<List<SubnetResourceSettingsArgs>> getSubnets() {
        return this.subnets == null ? Output.empty() : this.subnets;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
      private final Output<String> targetResourceName;

    public Output<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    public VirtualNetworkResourceSettingsArgs(
        @Nullable Output<List<String>> addressSpace,
        @Nullable Output<List<String>> dnsServers,
        @Nullable Output<Boolean> enableDdosProtection,
        Output<String> resourceType,
        @Nullable Output<List<SubnetResourceSettingsArgs>> subnets,
        Output<String> targetResourceName) {
        this.addressSpace = addressSpace;
        this.dnsServers = dnsServers;
        this.enableDdosProtection = enableDdosProtection;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.subnets = subnets;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private VirtualNetworkResourceSettingsArgs() {
        this.addressSpace = Output.empty();
        this.dnsServers = Output.empty();
        this.enableDdosProtection = Output.empty();
        this.resourceType = Output.empty();
        this.subnets = Output.empty();
        this.targetResourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addressSpace;
        private @Nullable Output<List<String>> dnsServers;
        private @Nullable Output<Boolean> enableDdosProtection;
        private Output<String> resourceType;
        private @Nullable Output<List<SubnetResourceSettingsArgs>> subnets;
        private Output<String> targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.resourceType = defaults.resourceType;
    	      this.subnets = defaults.subnets;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder addressSpace(@Nullable Output<List<String>> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public Builder addressSpace(@Nullable List<String> addressSpace) {
            this.addressSpace = Output.ofNullable(addressSpace);
            return this;
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Output.ofNullable(dnsServers);
            return this;
        }

        public Builder enableDdosProtection(@Nullable Output<Boolean> enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }

        public Builder enableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = Output.ofNullable(enableDdosProtection);
            return this;
        }

        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder subnets(@Nullable Output<List<SubnetResourceSettingsArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder subnets(@Nullable List<SubnetResourceSettingsArgs> subnets) {
            this.subnets = Output.ofNullable(subnets);
            return this;
        }

        public Builder targetResourceName(Output<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Output.of(Objects.requireNonNull(targetResourceName));
            return this;
        }
        public VirtualNetworkResourceSettingsArgs build() {
            return new VirtualNetworkResourceSettingsArgs(addressSpace, dnsServers, enableDdosProtection, resourceType, subnets, targetResourceName);
        }
    }
}
