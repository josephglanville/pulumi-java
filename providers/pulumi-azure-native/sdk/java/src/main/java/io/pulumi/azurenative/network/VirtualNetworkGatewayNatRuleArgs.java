// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VpnNatRuleMode;
import io.pulumi.azurenative.network.enums.VpnNatRuleType;
import io.pulumi.azurenative.network.inputs.VpnNatRuleMappingArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayNatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayNatRuleArgs Empty = new VirtualNetworkGatewayNatRuleArgs();

    /**
     * The private IP address external mapping for NAT.
     * 
     */
    @InputImport(name="externalMappings")
      private final @Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings;

    public Input<List<VpnNatRuleMappingArgs>> getExternalMappings() {
        return this.externalMappings == null ? Input.empty() : this.externalMappings;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    @InputImport(name="internalMappings")
      private final @Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings;

    public Input<List<VpnNatRuleMappingArgs>> getInternalMappings() {
        return this.internalMappings == null ? Input.empty() : this.internalMappings;
    }

    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    @InputImport(name="ipConfigurationId")
      private final @Nullable Input<String> ipConfigurationId;

    public Input<String> getIpConfigurationId() {
        return this.ipConfigurationId == null ? Input.empty() : this.ipConfigurationId;
    }

    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<Either<String,VpnNatRuleMode>> mode;

    public Input<Either<String,VpnNatRuleMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the nat rule.
     * 
     */
    @InputImport(name="natRuleName")
      private final @Nullable Input<String> natRuleName;

    public Input<String> getNatRuleName() {
        return this.natRuleName == null ? Input.empty() : this.natRuleName;
    }

    /**
     * The resource group name of the Virtual Network Gateway.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of NAT rule for VPN NAT.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,VpnNatRuleType>> type;

    public Input<Either<String,VpnNatRuleType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The name of the gateway.
     * 
     */
    @InputImport(name="virtualNetworkGatewayName", required=true)
      private final Input<String> virtualNetworkGatewayName;

    public Input<String> getVirtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    public VirtualNetworkGatewayNatRuleArgs(
        @Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings,
        @Nullable Input<String> id,
        @Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings,
        @Nullable Input<String> ipConfigurationId,
        @Nullable Input<Either<String,VpnNatRuleMode>> mode,
        @Nullable Input<String> name,
        @Nullable Input<String> natRuleName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,VpnNatRuleType>> type,
        Input<String> virtualNetworkGatewayName) {
        this.externalMappings = externalMappings;
        this.id = id;
        this.internalMappings = internalMappings;
        this.ipConfigurationId = ipConfigurationId;
        this.mode = mode;
        this.name = name;
        this.natRuleName = natRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.type = type;
        this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
    }

    private VirtualNetworkGatewayNatRuleArgs() {
        this.externalMappings = Input.empty();
        this.id = Input.empty();
        this.internalMappings = Input.empty();
        this.ipConfigurationId = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
        this.natRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.type = Input.empty();
        this.virtualNetworkGatewayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings;
        private @Nullable Input<String> id;
        private @Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings;
        private @Nullable Input<String> ipConfigurationId;
        private @Nullable Input<Either<String,VpnNatRuleMode>> mode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> natRuleName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,VpnNatRuleType>> type;
        private Input<String> virtualNetworkGatewayName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalMappings = defaults.externalMappings;
    	      this.id = defaults.id;
    	      this.internalMappings = defaults.internalMappings;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.natRuleName = defaults.natRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.type = defaults.type;
    	      this.virtualNetworkGatewayName = defaults.virtualNetworkGatewayName;
        }

        public Builder setExternalMappings(@Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings) {
            this.externalMappings = externalMappings;
            return this;
        }

        public Builder setExternalMappings(@Nullable List<VpnNatRuleMappingArgs> externalMappings) {
            this.externalMappings = Input.ofNullable(externalMappings);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInternalMappings(@Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings) {
            this.internalMappings = internalMappings;
            return this;
        }

        public Builder setInternalMappings(@Nullable List<VpnNatRuleMappingArgs> internalMappings) {
            this.internalMappings = Input.ofNullable(internalMappings);
            return this;
        }

        public Builder setIpConfigurationId(@Nullable Input<String> ipConfigurationId) {
            this.ipConfigurationId = ipConfigurationId;
            return this;
        }

        public Builder setIpConfigurationId(@Nullable String ipConfigurationId) {
            this.ipConfigurationId = Input.ofNullable(ipConfigurationId);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,VpnNatRuleMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,VpnNatRuleMode> mode) {
            this.mode = Input.ofNullable(mode);
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

        public Builder setNatRuleName(@Nullable Input<String> natRuleName) {
            this.natRuleName = natRuleName;
            return this;
        }

        public Builder setNatRuleName(@Nullable String natRuleName) {
            this.natRuleName = Input.ofNullable(natRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,VpnNatRuleType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,VpnNatRuleType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVirtualNetworkGatewayName(Input<String> virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName);
            return this;
        }

        public Builder setVirtualNetworkGatewayName(String virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = Input.of(Objects.requireNonNull(virtualNetworkGatewayName));
            return this;
        }
        public VirtualNetworkGatewayNatRuleArgs build() {
            return new VirtualNetworkGatewayNatRuleArgs(externalMappings, id, internalMappings, ipConfigurationId, mode, name, natRuleName, resourceGroupName, type, virtualNetworkGatewayName);
        }
    }
}
