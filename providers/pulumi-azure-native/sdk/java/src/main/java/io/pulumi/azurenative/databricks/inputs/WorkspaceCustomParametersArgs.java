// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomBooleanParameterArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomStringParameterArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceEncryptionParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom Parameters used for Cluster Creation.
 * 
 */
public final class WorkspaceCustomParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomParametersArgs Empty = new WorkspaceCustomParametersArgs();

    /**
     * The ID of a Azure Machine Learning workspace to link with Databricks workspace
     * 
     */
    @InputImport(name="amlWorkspaceId")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> amlWorkspaceId;

    public Input<WorkspaceCustomStringParameterArgs> getAmlWorkspaceId() {
        return this.amlWorkspaceId == null ? Input.empty() : this.amlWorkspaceId;
    }

    /**
     * The name of the Private Subnet within the Virtual Network
     * 
     */
    @InputImport(name="customPrivateSubnetName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> customPrivateSubnetName;

    public Input<WorkspaceCustomStringParameterArgs> getCustomPrivateSubnetName() {
        return this.customPrivateSubnetName == null ? Input.empty() : this.customPrivateSubnetName;
    }

    /**
     * The name of a Public Subnet within the Virtual Network
     * 
     */
    @InputImport(name="customPublicSubnetName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> customPublicSubnetName;

    public Input<WorkspaceCustomStringParameterArgs> getCustomPublicSubnetName() {
        return this.customPublicSubnetName == null ? Input.empty() : this.customPublicSubnetName;
    }

    /**
     * The ID of a Virtual Network where this Databricks Cluster should be created
     * 
     */
    @InputImport(name="customVirtualNetworkId")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> customVirtualNetworkId;

    public Input<WorkspaceCustomStringParameterArgs> getCustomVirtualNetworkId() {
        return this.customVirtualNetworkId == null ? Input.empty() : this.customVirtualNetworkId;
    }

    /**
     * Should the Public IP be Disabled?
     * 
     */
    @InputImport(name="enableNoPublicIp")
      private final @Nullable Input<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp;

    public Input<WorkspaceCustomBooleanParameterArgs> getEnableNoPublicIp() {
        return this.enableNoPublicIp == null ? Input.empty() : this.enableNoPublicIp;
    }

    /**
     * Contains the encryption details for Customer-Managed Key (CMK) enabled workspace.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<WorkspaceEncryptionParameterArgs> encryption;

    public Input<WorkspaceEncryptionParameterArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * Name of the outbound Load Balancer Backend Pool for Secure Cluster Connectivity (No Public IP).
     * 
     */
    @InputImport(name="loadBalancerBackendPoolName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName;

    public Input<WorkspaceCustomStringParameterArgs> getLoadBalancerBackendPoolName() {
        return this.loadBalancerBackendPoolName == null ? Input.empty() : this.loadBalancerBackendPoolName;
    }

    /**
     * Resource URI of Outbound Load balancer for Secure Cluster Connectivity (No Public IP) workspace.
     * 
     */
    @InputImport(name="loadBalancerId")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerId;

    public Input<WorkspaceCustomStringParameterArgs> getLoadBalancerId() {
        return this.loadBalancerId == null ? Input.empty() : this.loadBalancerId;
    }

    /**
     * Name of the NAT gateway for Secure Cluster Connectivity (No Public IP) workspace subnets.
     * 
     */
    @InputImport(name="natGatewayName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> natGatewayName;

    public Input<WorkspaceCustomStringParameterArgs> getNatGatewayName() {
        return this.natGatewayName == null ? Input.empty() : this.natGatewayName;
    }

    /**
     * Prepare the workspace for encryption. Enables the Managed Identity for managed storage account.
     * 
     */
    @InputImport(name="prepareEncryption")
      private final @Nullable Input<WorkspaceCustomBooleanParameterArgs> prepareEncryption;

    public Input<WorkspaceCustomBooleanParameterArgs> getPrepareEncryption() {
        return this.prepareEncryption == null ? Input.empty() : this.prepareEncryption;
    }

    /**
     * Name of the Public IP for No Public IP workspace with managed vNet.
     * 
     */
    @InputImport(name="publicIpName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> publicIpName;

    public Input<WorkspaceCustomStringParameterArgs> getPublicIpName() {
        return this.publicIpName == null ? Input.empty() : this.publicIpName;
    }

    /**
     * A boolean indicating whether or not the DBFS root file system will be enabled with secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @InputImport(name="requireInfrastructureEncryption")
      private final @Nullable Input<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption;

    public Input<WorkspaceCustomBooleanParameterArgs> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Input.empty() : this.requireInfrastructureEncryption;
    }

    /**
     * Default DBFS storage account name.
     * 
     */
    @InputImport(name="storageAccountName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountName;

    public Input<WorkspaceCustomStringParameterArgs> getStorageAccountName() {
        return this.storageAccountName == null ? Input.empty() : this.storageAccountName;
    }

    /**
     * Storage account SKU name, ex: Standard_GRS, Standard_LRS. Refer https://aka.ms/storageskus for valid inputs.
     * 
     */
    @InputImport(name="storageAccountSkuName")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountSkuName;

    public Input<WorkspaceCustomStringParameterArgs> getStorageAccountSkuName() {
        return this.storageAccountSkuName == null ? Input.empty() : this.storageAccountSkuName;
    }

    /**
     * Address prefix for Managed virtual network. Default value for this input is 10.139.
     * 
     */
    @InputImport(name="vnetAddressPrefix")
      private final @Nullable Input<WorkspaceCustomStringParameterArgs> vnetAddressPrefix;

    public Input<WorkspaceCustomStringParameterArgs> getVnetAddressPrefix() {
        return this.vnetAddressPrefix == null ? Input.empty() : this.vnetAddressPrefix;
    }

    public WorkspaceCustomParametersArgs(
        @Nullable Input<WorkspaceCustomStringParameterArgs> amlWorkspaceId,
        @Nullable Input<WorkspaceCustomStringParameterArgs> customPrivateSubnetName,
        @Nullable Input<WorkspaceCustomStringParameterArgs> customPublicSubnetName,
        @Nullable Input<WorkspaceCustomStringParameterArgs> customVirtualNetworkId,
        @Nullable Input<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp,
        @Nullable Input<WorkspaceEncryptionParameterArgs> encryption,
        @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName,
        @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerId,
        @Nullable Input<WorkspaceCustomStringParameterArgs> natGatewayName,
        @Nullable Input<WorkspaceCustomBooleanParameterArgs> prepareEncryption,
        @Nullable Input<WorkspaceCustomStringParameterArgs> publicIpName,
        @Nullable Input<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption,
        @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountName,
        @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountSkuName,
        @Nullable Input<WorkspaceCustomStringParameterArgs> vnetAddressPrefix) {
        this.amlWorkspaceId = amlWorkspaceId;
        this.customPrivateSubnetName = customPrivateSubnetName;
        this.customPublicSubnetName = customPublicSubnetName;
        this.customVirtualNetworkId = customVirtualNetworkId;
        this.enableNoPublicIp = enableNoPublicIp;
        this.encryption = encryption;
        this.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
        this.loadBalancerId = loadBalancerId;
        this.natGatewayName = natGatewayName;
        this.prepareEncryption = prepareEncryption;
        this.publicIpName = publicIpName;
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.storageAccountName = storageAccountName;
        this.storageAccountSkuName = storageAccountSkuName;
        this.vnetAddressPrefix = vnetAddressPrefix;
    }

    private WorkspaceCustomParametersArgs() {
        this.amlWorkspaceId = Input.empty();
        this.customPrivateSubnetName = Input.empty();
        this.customPublicSubnetName = Input.empty();
        this.customVirtualNetworkId = Input.empty();
        this.enableNoPublicIp = Input.empty();
        this.encryption = Input.empty();
        this.loadBalancerBackendPoolName = Input.empty();
        this.loadBalancerId = Input.empty();
        this.natGatewayName = Input.empty();
        this.prepareEncryption = Input.empty();
        this.publicIpName = Input.empty();
        this.requireInfrastructureEncryption = Input.empty();
        this.storageAccountName = Input.empty();
        this.storageAccountSkuName = Input.empty();
        this.vnetAddressPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkspaceCustomStringParameterArgs> amlWorkspaceId;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> customPrivateSubnetName;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> customPublicSubnetName;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> customVirtualNetworkId;
        private @Nullable Input<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp;
        private @Nullable Input<WorkspaceEncryptionParameterArgs> encryption;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerId;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> natGatewayName;
        private @Nullable Input<WorkspaceCustomBooleanParameterArgs> prepareEncryption;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> publicIpName;
        private @Nullable Input<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountName;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountSkuName;
        private @Nullable Input<WorkspaceCustomStringParameterArgs> vnetAddressPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amlWorkspaceId = defaults.amlWorkspaceId;
    	      this.customPrivateSubnetName = defaults.customPrivateSubnetName;
    	      this.customPublicSubnetName = defaults.customPublicSubnetName;
    	      this.customVirtualNetworkId = defaults.customVirtualNetworkId;
    	      this.enableNoPublicIp = defaults.enableNoPublicIp;
    	      this.encryption = defaults.encryption;
    	      this.loadBalancerBackendPoolName = defaults.loadBalancerBackendPoolName;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.prepareEncryption = defaults.prepareEncryption;
    	      this.publicIpName = defaults.publicIpName;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageAccountSkuName = defaults.storageAccountSkuName;
    	      this.vnetAddressPrefix = defaults.vnetAddressPrefix;
        }

        public Builder setAmlWorkspaceId(@Nullable Input<WorkspaceCustomStringParameterArgs> amlWorkspaceId) {
            this.amlWorkspaceId = amlWorkspaceId;
            return this;
        }

        public Builder setAmlWorkspaceId(@Nullable WorkspaceCustomStringParameterArgs amlWorkspaceId) {
            this.amlWorkspaceId = Input.ofNullable(amlWorkspaceId);
            return this;
        }

        public Builder setCustomPrivateSubnetName(@Nullable Input<WorkspaceCustomStringParameterArgs> customPrivateSubnetName) {
            this.customPrivateSubnetName = customPrivateSubnetName;
            return this;
        }

        public Builder setCustomPrivateSubnetName(@Nullable WorkspaceCustomStringParameterArgs customPrivateSubnetName) {
            this.customPrivateSubnetName = Input.ofNullable(customPrivateSubnetName);
            return this;
        }

        public Builder setCustomPublicSubnetName(@Nullable Input<WorkspaceCustomStringParameterArgs> customPublicSubnetName) {
            this.customPublicSubnetName = customPublicSubnetName;
            return this;
        }

        public Builder setCustomPublicSubnetName(@Nullable WorkspaceCustomStringParameterArgs customPublicSubnetName) {
            this.customPublicSubnetName = Input.ofNullable(customPublicSubnetName);
            return this;
        }

        public Builder setCustomVirtualNetworkId(@Nullable Input<WorkspaceCustomStringParameterArgs> customVirtualNetworkId) {
            this.customVirtualNetworkId = customVirtualNetworkId;
            return this;
        }

        public Builder setCustomVirtualNetworkId(@Nullable WorkspaceCustomStringParameterArgs customVirtualNetworkId) {
            this.customVirtualNetworkId = Input.ofNullable(customVirtualNetworkId);
            return this;
        }

        public Builder setEnableNoPublicIp(@Nullable Input<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp) {
            this.enableNoPublicIp = enableNoPublicIp;
            return this;
        }

        public Builder setEnableNoPublicIp(@Nullable WorkspaceCustomBooleanParameterArgs enableNoPublicIp) {
            this.enableNoPublicIp = Input.ofNullable(enableNoPublicIp);
            return this;
        }

        public Builder setEncryption(@Nullable Input<WorkspaceEncryptionParameterArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable WorkspaceEncryptionParameterArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setLoadBalancerBackendPoolName(@Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName) {
            this.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
            return this;
        }

        public Builder setLoadBalancerBackendPoolName(@Nullable WorkspaceCustomStringParameterArgs loadBalancerBackendPoolName) {
            this.loadBalancerBackendPoolName = Input.ofNullable(loadBalancerBackendPoolName);
            return this;
        }

        public Builder setLoadBalancerId(@Nullable Input<WorkspaceCustomStringParameterArgs> loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        public Builder setLoadBalancerId(@Nullable WorkspaceCustomStringParameterArgs loadBalancerId) {
            this.loadBalancerId = Input.ofNullable(loadBalancerId);
            return this;
        }

        public Builder setNatGatewayName(@Nullable Input<WorkspaceCustomStringParameterArgs> natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }

        public Builder setNatGatewayName(@Nullable WorkspaceCustomStringParameterArgs natGatewayName) {
            this.natGatewayName = Input.ofNullable(natGatewayName);
            return this;
        }

        public Builder setPrepareEncryption(@Nullable Input<WorkspaceCustomBooleanParameterArgs> prepareEncryption) {
            this.prepareEncryption = prepareEncryption;
            return this;
        }

        public Builder setPrepareEncryption(@Nullable WorkspaceCustomBooleanParameterArgs prepareEncryption) {
            this.prepareEncryption = Input.ofNullable(prepareEncryption);
            return this;
        }

        public Builder setPublicIpName(@Nullable Input<WorkspaceCustomStringParameterArgs> publicIpName) {
            this.publicIpName = publicIpName;
            return this;
        }

        public Builder setPublicIpName(@Nullable WorkspaceCustomStringParameterArgs publicIpName) {
            this.publicIpName = Input.ofNullable(publicIpName);
            return this;
        }

        public Builder setRequireInfrastructureEncryption(@Nullable Input<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder setRequireInfrastructureEncryption(@Nullable WorkspaceCustomBooleanParameterArgs requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = Input.ofNullable(requireInfrastructureEncryption);
            return this;
        }

        public Builder setStorageAccountName(@Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setStorageAccountName(@Nullable WorkspaceCustomStringParameterArgs storageAccountName) {
            this.storageAccountName = Input.ofNullable(storageAccountName);
            return this;
        }

        public Builder setStorageAccountSkuName(@Nullable Input<WorkspaceCustomStringParameterArgs> storageAccountSkuName) {
            this.storageAccountSkuName = storageAccountSkuName;
            return this;
        }

        public Builder setStorageAccountSkuName(@Nullable WorkspaceCustomStringParameterArgs storageAccountSkuName) {
            this.storageAccountSkuName = Input.ofNullable(storageAccountSkuName);
            return this;
        }

        public Builder setVnetAddressPrefix(@Nullable Input<WorkspaceCustomStringParameterArgs> vnetAddressPrefix) {
            this.vnetAddressPrefix = vnetAddressPrefix;
            return this;
        }

        public Builder setVnetAddressPrefix(@Nullable WorkspaceCustomStringParameterArgs vnetAddressPrefix) {
            this.vnetAddressPrefix = Input.ofNullable(vnetAddressPrefix);
            return this;
        }
        public WorkspaceCustomParametersArgs build() {
            return new WorkspaceCustomParametersArgs(amlWorkspaceId, customPrivateSubnetName, customPublicSubnetName, customVirtualNetworkId, enableNoPublicIp, encryption, loadBalancerBackendPoolName, loadBalancerId, natGatewayName, prepareEncryption, publicIpName, requireInfrastructureEncryption, storageAccountName, storageAccountSkuName, vnetAddressPrefix);
        }
    }
}
