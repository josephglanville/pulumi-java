// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.IPConfigResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMNicDetailsResponse {
    /**
     * A value indicating whether the NIC has accelerated networking enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworkingOnRecovery;
    /**
     * Whether the test failover NIC has accelerated networking enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworkingOnTfo;
    /**
     * Ip address type.
     * 
     */
    private final @Nullable String ipAddressType;
    /**
     * The nic Id.
     * 
     */
    private final @Nullable String nicId;
    /**
     * Primary nic static IP address.
     * 
     */
    private final @Nullable String primaryNicStaticIPAddress;
    /**
     * The target backend address pools for the NIC.
     * 
     */
    private final @Nullable List<String> recoveryLBBackendAddressPoolIds;
    /**
     * The id of the NSG associated with the NIC.
     * 
     */
    private final @Nullable String recoveryNetworkSecurityGroupId;
    /**
     * IP allocation type for recovery VM.
     * 
     */
    private final @Nullable String recoveryNicIpAddressType;
    /**
     * The name of the NIC to be used when creating target NICs.
     * 
     */
    private final @Nullable String recoveryNicName;
    /**
     * The resource group of the NIC to be used when creating target NICs.
     * 
     */
    private final @Nullable String recoveryNicResourceGroupName;
    /**
     * The id of the public IP address resource associated with the NIC.
     * 
     */
    private final @Nullable String recoveryPublicIpAddressId;
    /**
     * Recovery VM network Id.
     * 
     */
    private final @Nullable String recoveryVMNetworkId;
    /**
     * Recovery VM subnet name.
     * 
     */
    private final @Nullable String recoveryVMSubnetName;
    /**
     * The replica nic Id.
     * 
     */
    private final @Nullable String replicaNicId;
    /**
     * Replica nic static IP address.
     * 
     */
    private final @Nullable String replicaNicStaticIPAddress;
    /**
     * A value indicating whether an existing NIC is allowed to be reused during failover subject to availability.
     * 
     */
    private final @Nullable Boolean reuseExistingNic;
    /**
     * Selection type for failover.
     * 
     */
    private final @Nullable String selectionType;
    /**
     * The source nic ARM Id.
     * 
     */
    private final @Nullable String sourceNicArmId;
    /**
     * The IP configurations to be used by NIC during test failover.
     * 
     */
    private final @Nullable List<IPConfigResponse> tfoIPConfigs;
    /**
     * The NSG to be used by NIC during test failover.
     * 
     */
    private final @Nullable String tfoNetworkSecurityGroupId;
    /**
     * The name of the NIC to be used when creating target NICs in TFO.
     * 
     */
    private final @Nullable String tfoRecoveryNicName;
    /**
     * The resource group of the NIC to be used when creating target NICs in TFO.
     * 
     */
    private final @Nullable String tfoRecoveryNicResourceGroupName;
    /**
     * A value indicating whether an existing NIC is allowed to be reused during test failover subject to availability.
     * 
     */
    private final @Nullable Boolean tfoReuseExistingNic;
    /**
     * The network to be used by NIC during test failover.
     * 
     */
    private final @Nullable String tfoVMNetworkId;
    /**
     * The subnet to be used by NIC during test failover.
     * 
     */
    private final @Nullable String tfoVMSubnetName;
    /**
     * VM network name.
     * 
     */
    private final @Nullable String vMNetworkName;
    /**
     * VM subnet name.
     * 
     */
    private final @Nullable String vMSubnetName;

    @CustomType.Constructor
    private VMNicDetailsResponse(
        @CustomType.Parameter("enableAcceleratedNetworkingOnRecovery") @Nullable Boolean enableAcceleratedNetworkingOnRecovery,
        @CustomType.Parameter("enableAcceleratedNetworkingOnTfo") @Nullable Boolean enableAcceleratedNetworkingOnTfo,
        @CustomType.Parameter("ipAddressType") @Nullable String ipAddressType,
        @CustomType.Parameter("nicId") @Nullable String nicId,
        @CustomType.Parameter("primaryNicStaticIPAddress") @Nullable String primaryNicStaticIPAddress,
        @CustomType.Parameter("recoveryLBBackendAddressPoolIds") @Nullable List<String> recoveryLBBackendAddressPoolIds,
        @CustomType.Parameter("recoveryNetworkSecurityGroupId") @Nullable String recoveryNetworkSecurityGroupId,
        @CustomType.Parameter("recoveryNicIpAddressType") @Nullable String recoveryNicIpAddressType,
        @CustomType.Parameter("recoveryNicName") @Nullable String recoveryNicName,
        @CustomType.Parameter("recoveryNicResourceGroupName") @Nullable String recoveryNicResourceGroupName,
        @CustomType.Parameter("recoveryPublicIpAddressId") @Nullable String recoveryPublicIpAddressId,
        @CustomType.Parameter("recoveryVMNetworkId") @Nullable String recoveryVMNetworkId,
        @CustomType.Parameter("recoveryVMSubnetName") @Nullable String recoveryVMSubnetName,
        @CustomType.Parameter("replicaNicId") @Nullable String replicaNicId,
        @CustomType.Parameter("replicaNicStaticIPAddress") @Nullable String replicaNicStaticIPAddress,
        @CustomType.Parameter("reuseExistingNic") @Nullable Boolean reuseExistingNic,
        @CustomType.Parameter("selectionType") @Nullable String selectionType,
        @CustomType.Parameter("sourceNicArmId") @Nullable String sourceNicArmId,
        @CustomType.Parameter("tfoIPConfigs") @Nullable List<IPConfigResponse> tfoIPConfigs,
        @CustomType.Parameter("tfoNetworkSecurityGroupId") @Nullable String tfoNetworkSecurityGroupId,
        @CustomType.Parameter("tfoRecoveryNicName") @Nullable String tfoRecoveryNicName,
        @CustomType.Parameter("tfoRecoveryNicResourceGroupName") @Nullable String tfoRecoveryNicResourceGroupName,
        @CustomType.Parameter("tfoReuseExistingNic") @Nullable Boolean tfoReuseExistingNic,
        @CustomType.Parameter("tfoVMNetworkId") @Nullable String tfoVMNetworkId,
        @CustomType.Parameter("tfoVMSubnetName") @Nullable String tfoVMSubnetName,
        @CustomType.Parameter("vMNetworkName") @Nullable String vMNetworkName,
        @CustomType.Parameter("vMSubnetName") @Nullable String vMSubnetName) {
        this.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
        this.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
        this.ipAddressType = ipAddressType;
        this.nicId = nicId;
        this.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
        this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
        this.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
        this.recoveryNicIpAddressType = recoveryNicIpAddressType;
        this.recoveryNicName = recoveryNicName;
        this.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
        this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
        this.recoveryVMNetworkId = recoveryVMNetworkId;
        this.recoveryVMSubnetName = recoveryVMSubnetName;
        this.replicaNicId = replicaNicId;
        this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
        this.reuseExistingNic = reuseExistingNic;
        this.selectionType = selectionType;
        this.sourceNicArmId = sourceNicArmId;
        this.tfoIPConfigs = tfoIPConfigs;
        this.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
        this.tfoRecoveryNicName = tfoRecoveryNicName;
        this.tfoRecoveryNicResourceGroupName = tfoRecoveryNicResourceGroupName;
        this.tfoReuseExistingNic = tfoReuseExistingNic;
        this.tfoVMNetworkId = tfoVMNetworkId;
        this.tfoVMSubnetName = tfoVMSubnetName;
        this.vMNetworkName = vMNetworkName;
        this.vMSubnetName = vMSubnetName;
    }

    /**
     * A value indicating whether the NIC has accelerated networking enabled.
     * 
    */
    public Optional<Boolean> getEnableAcceleratedNetworkingOnRecovery() {
        return Optional.ofNullable(this.enableAcceleratedNetworkingOnRecovery);
    }
    /**
     * Whether the test failover NIC has accelerated networking enabled.
     * 
    */
    public Optional<Boolean> getEnableAcceleratedNetworkingOnTfo() {
        return Optional.ofNullable(this.enableAcceleratedNetworkingOnTfo);
    }
    /**
     * Ip address type.
     * 
    */
    public Optional<String> getIpAddressType() {
        return Optional.ofNullable(this.ipAddressType);
    }
    /**
     * The nic Id.
     * 
    */
    public Optional<String> getNicId() {
        return Optional.ofNullable(this.nicId);
    }
    /**
     * Primary nic static IP address.
     * 
    */
    public Optional<String> getPrimaryNicStaticIPAddress() {
        return Optional.ofNullable(this.primaryNicStaticIPAddress);
    }
    /**
     * The target backend address pools for the NIC.
     * 
    */
    public List<String> getRecoveryLBBackendAddressPoolIds() {
        return this.recoveryLBBackendAddressPoolIds == null ? List.of() : this.recoveryLBBackendAddressPoolIds;
    }
    /**
     * The id of the NSG associated with the NIC.
     * 
    */
    public Optional<String> getRecoveryNetworkSecurityGroupId() {
        return Optional.ofNullable(this.recoveryNetworkSecurityGroupId);
    }
    /**
     * IP allocation type for recovery VM.
     * 
    */
    public Optional<String> getRecoveryNicIpAddressType() {
        return Optional.ofNullable(this.recoveryNicIpAddressType);
    }
    /**
     * The name of the NIC to be used when creating target NICs.
     * 
    */
    public Optional<String> getRecoveryNicName() {
        return Optional.ofNullable(this.recoveryNicName);
    }
    /**
     * The resource group of the NIC to be used when creating target NICs.
     * 
    */
    public Optional<String> getRecoveryNicResourceGroupName() {
        return Optional.ofNullable(this.recoveryNicResourceGroupName);
    }
    /**
     * The id of the public IP address resource associated with the NIC.
     * 
    */
    public Optional<String> getRecoveryPublicIpAddressId() {
        return Optional.ofNullable(this.recoveryPublicIpAddressId);
    }
    /**
     * Recovery VM network Id.
     * 
    */
    public Optional<String> getRecoveryVMNetworkId() {
        return Optional.ofNullable(this.recoveryVMNetworkId);
    }
    /**
     * Recovery VM subnet name.
     * 
    */
    public Optional<String> getRecoveryVMSubnetName() {
        return Optional.ofNullable(this.recoveryVMSubnetName);
    }
    /**
     * The replica nic Id.
     * 
    */
    public Optional<String> getReplicaNicId() {
        return Optional.ofNullable(this.replicaNicId);
    }
    /**
     * Replica nic static IP address.
     * 
    */
    public Optional<String> getReplicaNicStaticIPAddress() {
        return Optional.ofNullable(this.replicaNicStaticIPAddress);
    }
    /**
     * A value indicating whether an existing NIC is allowed to be reused during failover subject to availability.
     * 
    */
    public Optional<Boolean> getReuseExistingNic() {
        return Optional.ofNullable(this.reuseExistingNic);
    }
    /**
     * Selection type for failover.
     * 
    */
    public Optional<String> getSelectionType() {
        return Optional.ofNullable(this.selectionType);
    }
    /**
     * The source nic ARM Id.
     * 
    */
    public Optional<String> getSourceNicArmId() {
        return Optional.ofNullable(this.sourceNicArmId);
    }
    /**
     * The IP configurations to be used by NIC during test failover.
     * 
    */
    public List<IPConfigResponse> getTfoIPConfigs() {
        return this.tfoIPConfigs == null ? List.of() : this.tfoIPConfigs;
    }
    /**
     * The NSG to be used by NIC during test failover.
     * 
    */
    public Optional<String> getTfoNetworkSecurityGroupId() {
        return Optional.ofNullable(this.tfoNetworkSecurityGroupId);
    }
    /**
     * The name of the NIC to be used when creating target NICs in TFO.
     * 
    */
    public Optional<String> getTfoRecoveryNicName() {
        return Optional.ofNullable(this.tfoRecoveryNicName);
    }
    /**
     * The resource group of the NIC to be used when creating target NICs in TFO.
     * 
    */
    public Optional<String> getTfoRecoveryNicResourceGroupName() {
        return Optional.ofNullable(this.tfoRecoveryNicResourceGroupName);
    }
    /**
     * A value indicating whether an existing NIC is allowed to be reused during test failover subject to availability.
     * 
    */
    public Optional<Boolean> getTfoReuseExistingNic() {
        return Optional.ofNullable(this.tfoReuseExistingNic);
    }
    /**
     * The network to be used by NIC during test failover.
     * 
    */
    public Optional<String> getTfoVMNetworkId() {
        return Optional.ofNullable(this.tfoVMNetworkId);
    }
    /**
     * The subnet to be used by NIC during test failover.
     * 
    */
    public Optional<String> getTfoVMSubnetName() {
        return Optional.ofNullable(this.tfoVMSubnetName);
    }
    /**
     * VM network name.
     * 
    */
    public Optional<String> getVMNetworkName() {
        return Optional.ofNullable(this.vMNetworkName);
    }
    /**
     * VM subnet name.
     * 
    */
    public Optional<String> getVMSubnetName() {
        return Optional.ofNullable(this.vMSubnetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAcceleratedNetworkingOnRecovery;
        private @Nullable Boolean enableAcceleratedNetworkingOnTfo;
        private @Nullable String ipAddressType;
        private @Nullable String nicId;
        private @Nullable String primaryNicStaticIPAddress;
        private @Nullable List<String> recoveryLBBackendAddressPoolIds;
        private @Nullable String recoveryNetworkSecurityGroupId;
        private @Nullable String recoveryNicIpAddressType;
        private @Nullable String recoveryNicName;
        private @Nullable String recoveryNicResourceGroupName;
        private @Nullable String recoveryPublicIpAddressId;
        private @Nullable String recoveryVMNetworkId;
        private @Nullable String recoveryVMSubnetName;
        private @Nullable String replicaNicId;
        private @Nullable String replicaNicStaticIPAddress;
        private @Nullable Boolean reuseExistingNic;
        private @Nullable String selectionType;
        private @Nullable String sourceNicArmId;
        private @Nullable List<IPConfigResponse> tfoIPConfigs;
        private @Nullable String tfoNetworkSecurityGroupId;
        private @Nullable String tfoRecoveryNicName;
        private @Nullable String tfoRecoveryNicResourceGroupName;
        private @Nullable Boolean tfoReuseExistingNic;
        private @Nullable String tfoVMNetworkId;
        private @Nullable String tfoVMSubnetName;
        private @Nullable String vMNetworkName;
        private @Nullable String vMSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(VMNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAcceleratedNetworkingOnRecovery = defaults.enableAcceleratedNetworkingOnRecovery;
    	      this.enableAcceleratedNetworkingOnTfo = defaults.enableAcceleratedNetworkingOnTfo;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.nicId = defaults.nicId;
    	      this.primaryNicStaticIPAddress = defaults.primaryNicStaticIPAddress;
    	      this.recoveryLBBackendAddressPoolIds = defaults.recoveryLBBackendAddressPoolIds;
    	      this.recoveryNetworkSecurityGroupId = defaults.recoveryNetworkSecurityGroupId;
    	      this.recoveryNicIpAddressType = defaults.recoveryNicIpAddressType;
    	      this.recoveryNicName = defaults.recoveryNicName;
    	      this.recoveryNicResourceGroupName = defaults.recoveryNicResourceGroupName;
    	      this.recoveryPublicIpAddressId = defaults.recoveryPublicIpAddressId;
    	      this.recoveryVMNetworkId = defaults.recoveryVMNetworkId;
    	      this.recoveryVMSubnetName = defaults.recoveryVMSubnetName;
    	      this.replicaNicId = defaults.replicaNicId;
    	      this.replicaNicStaticIPAddress = defaults.replicaNicStaticIPAddress;
    	      this.reuseExistingNic = defaults.reuseExistingNic;
    	      this.selectionType = defaults.selectionType;
    	      this.sourceNicArmId = defaults.sourceNicArmId;
    	      this.tfoIPConfigs = defaults.tfoIPConfigs;
    	      this.tfoNetworkSecurityGroupId = defaults.tfoNetworkSecurityGroupId;
    	      this.tfoRecoveryNicName = defaults.tfoRecoveryNicName;
    	      this.tfoRecoveryNicResourceGroupName = defaults.tfoRecoveryNicResourceGroupName;
    	      this.tfoReuseExistingNic = defaults.tfoReuseExistingNic;
    	      this.tfoVMNetworkId = defaults.tfoVMNetworkId;
    	      this.tfoVMSubnetName = defaults.tfoVMSubnetName;
    	      this.vMNetworkName = defaults.vMNetworkName;
    	      this.vMSubnetName = defaults.vMSubnetName;
        }

        public Builder enableAcceleratedNetworkingOnRecovery(@Nullable Boolean enableAcceleratedNetworkingOnRecovery) {
            this.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
            return this;
        }
        public Builder enableAcceleratedNetworkingOnTfo(@Nullable Boolean enableAcceleratedNetworkingOnTfo) {
            this.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
            return this;
        }
        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }
        public Builder nicId(@Nullable String nicId) {
            this.nicId = nicId;
            return this;
        }
        public Builder primaryNicStaticIPAddress(@Nullable String primaryNicStaticIPAddress) {
            this.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
            return this;
        }
        public Builder recoveryLBBackendAddressPoolIds(@Nullable List<String> recoveryLBBackendAddressPoolIds) {
            this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
            return this;
        }
        public Builder recoveryLBBackendAddressPoolIds(String... recoveryLBBackendAddressPoolIds) {
            return recoveryLBBackendAddressPoolIds(List.of(recoveryLBBackendAddressPoolIds));
        }
        public Builder recoveryNetworkSecurityGroupId(@Nullable String recoveryNetworkSecurityGroupId) {
            this.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
            return this;
        }
        public Builder recoveryNicIpAddressType(@Nullable String recoveryNicIpAddressType) {
            this.recoveryNicIpAddressType = recoveryNicIpAddressType;
            return this;
        }
        public Builder recoveryNicName(@Nullable String recoveryNicName) {
            this.recoveryNicName = recoveryNicName;
            return this;
        }
        public Builder recoveryNicResourceGroupName(@Nullable String recoveryNicResourceGroupName) {
            this.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
            return this;
        }
        public Builder recoveryPublicIpAddressId(@Nullable String recoveryPublicIpAddressId) {
            this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
            return this;
        }
        public Builder recoveryVMNetworkId(@Nullable String recoveryVMNetworkId) {
            this.recoveryVMNetworkId = recoveryVMNetworkId;
            return this;
        }
        public Builder recoveryVMSubnetName(@Nullable String recoveryVMSubnetName) {
            this.recoveryVMSubnetName = recoveryVMSubnetName;
            return this;
        }
        public Builder replicaNicId(@Nullable String replicaNicId) {
            this.replicaNicId = replicaNicId;
            return this;
        }
        public Builder replicaNicStaticIPAddress(@Nullable String replicaNicStaticIPAddress) {
            this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
            return this;
        }
        public Builder reuseExistingNic(@Nullable Boolean reuseExistingNic) {
            this.reuseExistingNic = reuseExistingNic;
            return this;
        }
        public Builder selectionType(@Nullable String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public Builder sourceNicArmId(@Nullable String sourceNicArmId) {
            this.sourceNicArmId = sourceNicArmId;
            return this;
        }
        public Builder tfoIPConfigs(@Nullable List<IPConfigResponse> tfoIPConfigs) {
            this.tfoIPConfigs = tfoIPConfigs;
            return this;
        }
        public Builder tfoIPConfigs(IPConfigResponse... tfoIPConfigs) {
            return tfoIPConfigs(List.of(tfoIPConfigs));
        }
        public Builder tfoNetworkSecurityGroupId(@Nullable String tfoNetworkSecurityGroupId) {
            this.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
            return this;
        }
        public Builder tfoRecoveryNicName(@Nullable String tfoRecoveryNicName) {
            this.tfoRecoveryNicName = tfoRecoveryNicName;
            return this;
        }
        public Builder tfoRecoveryNicResourceGroupName(@Nullable String tfoRecoveryNicResourceGroupName) {
            this.tfoRecoveryNicResourceGroupName = tfoRecoveryNicResourceGroupName;
            return this;
        }
        public Builder tfoReuseExistingNic(@Nullable Boolean tfoReuseExistingNic) {
            this.tfoReuseExistingNic = tfoReuseExistingNic;
            return this;
        }
        public Builder tfoVMNetworkId(@Nullable String tfoVMNetworkId) {
            this.tfoVMNetworkId = tfoVMNetworkId;
            return this;
        }
        public Builder tfoVMSubnetName(@Nullable String tfoVMSubnetName) {
            this.tfoVMSubnetName = tfoVMSubnetName;
            return this;
        }
        public Builder vMNetworkName(@Nullable String vMNetworkName) {
            this.vMNetworkName = vMNetworkName;
            return this;
        }
        public Builder vMSubnetName(@Nullable String vMSubnetName) {
            this.vMSubnetName = vMSubnetName;
            return this;
        }        public VMNicDetailsResponse build() {
            return new VMNicDetailsResponse(enableAcceleratedNetworkingOnRecovery, enableAcceleratedNetworkingOnTfo, ipAddressType, nicId, primaryNicStaticIPAddress, recoveryLBBackendAddressPoolIds, recoveryNetworkSecurityGroupId, recoveryNicIpAddressType, recoveryNicName, recoveryNicResourceGroupName, recoveryPublicIpAddressId, recoveryVMNetworkId, recoveryVMSubnetName, replicaNicId, replicaNicStaticIPAddress, reuseExistingNic, selectionType, sourceNicArmId, tfoIPConfigs, tfoNetworkSecurityGroupId, tfoRecoveryNicName, tfoRecoveryNicResourceGroupName, tfoReuseExistingNic, tfoVMNetworkId, tfoVMSubnetName, vMNetworkName, vMSubnetName);
        }
    }
}
