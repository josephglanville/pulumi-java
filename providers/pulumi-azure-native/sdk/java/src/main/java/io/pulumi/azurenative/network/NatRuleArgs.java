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


public final class NatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatRuleArgs Empty = new NatRuleArgs();

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
     * The name of the gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
      private final Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName;
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
     * The resource group name of the VpnGateway.
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

    public NatRuleArgs(
        @Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings,
        Input<String> gatewayName,
        @Nullable Input<String> id,
        @Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings,
        @Nullable Input<String> ipConfigurationId,
        @Nullable Input<Either<String,VpnNatRuleMode>> mode,
        @Nullable Input<String> name,
        @Nullable Input<String> natRuleName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,VpnNatRuleType>> type) {
        this.externalMappings = externalMappings;
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.id = id;
        this.internalMappings = internalMappings;
        this.ipConfigurationId = ipConfigurationId;
        this.mode = mode;
        this.name = name;
        this.natRuleName = natRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.type = type;
    }

    private NatRuleArgs() {
        this.externalMappings = Input.empty();
        this.gatewayName = Input.empty();
        this.id = Input.empty();
        this.internalMappings = Input.empty();
        this.ipConfigurationId = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
        this.natRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings;
        private Input<String> gatewayName;
        private @Nullable Input<String> id;
        private @Nullable Input<List<VpnNatRuleMappingArgs>> internalMappings;
        private @Nullable Input<String> ipConfigurationId;
        private @Nullable Input<Either<String,VpnNatRuleMode>> mode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> natRuleName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,VpnNatRuleType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalMappings = defaults.externalMappings;
    	      this.gatewayName = defaults.gatewayName;
    	      this.id = defaults.id;
    	      this.internalMappings = defaults.internalMappings;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.natRuleName = defaults.natRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.type = defaults.type;
        }

        public Builder setExternalMappings(@Nullable Input<List<VpnNatRuleMappingArgs>> externalMappings) {
            this.externalMappings = externalMappings;
            return this;
        }

        public Builder setExternalMappings(@Nullable List<VpnNatRuleMappingArgs> externalMappings) {
            this.externalMappings = Input.ofNullable(externalMappings);
            return this;
        }

        public Builder setGatewayName(Input<String> gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Input.of(Objects.requireNonNull(gatewayName));
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
        public NatRuleArgs build() {
            return new NatRuleArgs(externalMappings, gatewayName, id, internalMappings, ipConfigurationId, mode, name, natRuleName, resourceGroupName, type);
        }
    }
}
