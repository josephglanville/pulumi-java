// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomBooleanParameterArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomStringParameterArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceEncryptionParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="amlWorkspaceId")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> amlWorkspaceId;

    public Output<WorkspaceCustomStringParameterArgs> getAmlWorkspaceId() {
        return this.amlWorkspaceId == null ? Codegen.empty() : this.amlWorkspaceId;
    }

    /**
     * The name of the Private Subnet within the Virtual Network
     * 
     */
    @Import(name="customPrivateSubnetName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> customPrivateSubnetName;

    public Output<WorkspaceCustomStringParameterArgs> getCustomPrivateSubnetName() {
        return this.customPrivateSubnetName == null ? Codegen.empty() : this.customPrivateSubnetName;
    }

    /**
     * The name of a Public Subnet within the Virtual Network
     * 
     */
    @Import(name="customPublicSubnetName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> customPublicSubnetName;

    public Output<WorkspaceCustomStringParameterArgs> getCustomPublicSubnetName() {
        return this.customPublicSubnetName == null ? Codegen.empty() : this.customPublicSubnetName;
    }

    /**
     * The ID of a Virtual Network where this Databricks Cluster should be created
     * 
     */
    @Import(name="customVirtualNetworkId")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> customVirtualNetworkId;

    public Output<WorkspaceCustomStringParameterArgs> getCustomVirtualNetworkId() {
        return this.customVirtualNetworkId == null ? Codegen.empty() : this.customVirtualNetworkId;
    }

    /**
     * Should the Public IP be Disabled?
     * 
     */
    @Import(name="enableNoPublicIp")
      private final @Nullable Output<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp;

    public Output<WorkspaceCustomBooleanParameterArgs> getEnableNoPublicIp() {
        return this.enableNoPublicIp == null ? Codegen.empty() : this.enableNoPublicIp;
    }

    /**
     * Contains the encryption details for Customer-Managed Key (CMK) enabled workspace.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<WorkspaceEncryptionParameterArgs> encryption;

    public Output<WorkspaceEncryptionParameterArgs> getEncryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * Name of the outbound Load Balancer Backend Pool for Secure Cluster Connectivity (No Public IP).
     * 
     */
    @Import(name="loadBalancerBackendPoolName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName;

    public Output<WorkspaceCustomStringParameterArgs> getLoadBalancerBackendPoolName() {
        return this.loadBalancerBackendPoolName == null ? Codegen.empty() : this.loadBalancerBackendPoolName;
    }

    /**
     * Resource URI of Outbound Load balancer for Secure Cluster Connectivity (No Public IP) workspace.
     * 
     */
    @Import(name="loadBalancerId")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerId;

    public Output<WorkspaceCustomStringParameterArgs> getLoadBalancerId() {
        return this.loadBalancerId == null ? Codegen.empty() : this.loadBalancerId;
    }

    /**
     * Name of the NAT gateway for Secure Cluster Connectivity (No Public IP) workspace subnets.
     * 
     */
    @Import(name="natGatewayName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> natGatewayName;

    public Output<WorkspaceCustomStringParameterArgs> getNatGatewayName() {
        return this.natGatewayName == null ? Codegen.empty() : this.natGatewayName;
    }

    /**
     * Prepare the workspace for encryption. Enables the Managed Identity for managed storage account.
     * 
     */
    @Import(name="prepareEncryption")
      private final @Nullable Output<WorkspaceCustomBooleanParameterArgs> prepareEncryption;

    public Output<WorkspaceCustomBooleanParameterArgs> getPrepareEncryption() {
        return this.prepareEncryption == null ? Codegen.empty() : this.prepareEncryption;
    }

    /**
     * Name of the Public IP for No Public IP workspace with managed vNet.
     * 
     */
    @Import(name="publicIpName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> publicIpName;

    public Output<WorkspaceCustomStringParameterArgs> getPublicIpName() {
        return this.publicIpName == null ? Codegen.empty() : this.publicIpName;
    }

    /**
     * A boolean indicating whether or not the DBFS root file system will be enabled with secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @Import(name="requireInfrastructureEncryption")
      private final @Nullable Output<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption;

    public Output<WorkspaceCustomBooleanParameterArgs> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Codegen.empty() : this.requireInfrastructureEncryption;
    }

    /**
     * Default DBFS storage account name.
     * 
     */
    @Import(name="storageAccountName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountName;

    public Output<WorkspaceCustomStringParameterArgs> getStorageAccountName() {
        return this.storageAccountName == null ? Codegen.empty() : this.storageAccountName;
    }

    /**
     * Storage account SKU name, ex: Standard_GRS, Standard_LRS. Refer https://aka.ms/storageskus for valid inputs.
     * 
     */
    @Import(name="storageAccountSkuName")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountSkuName;

    public Output<WorkspaceCustomStringParameterArgs> getStorageAccountSkuName() {
        return this.storageAccountSkuName == null ? Codegen.empty() : this.storageAccountSkuName;
    }

    /**
     * Address prefix for Managed virtual network. Default value for this input is 10.139.
     * 
     */
    @Import(name="vnetAddressPrefix")
      private final @Nullable Output<WorkspaceCustomStringParameterArgs> vnetAddressPrefix;

    public Output<WorkspaceCustomStringParameterArgs> getVnetAddressPrefix() {
        return this.vnetAddressPrefix == null ? Codegen.empty() : this.vnetAddressPrefix;
    }

    public WorkspaceCustomParametersArgs(
        @Nullable Output<WorkspaceCustomStringParameterArgs> amlWorkspaceId,
        @Nullable Output<WorkspaceCustomStringParameterArgs> customPrivateSubnetName,
        @Nullable Output<WorkspaceCustomStringParameterArgs> customPublicSubnetName,
        @Nullable Output<WorkspaceCustomStringParameterArgs> customVirtualNetworkId,
        @Nullable Output<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp,
        @Nullable Output<WorkspaceEncryptionParameterArgs> encryption,
        @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName,
        @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerId,
        @Nullable Output<WorkspaceCustomStringParameterArgs> natGatewayName,
        @Nullable Output<WorkspaceCustomBooleanParameterArgs> prepareEncryption,
        @Nullable Output<WorkspaceCustomStringParameterArgs> publicIpName,
        @Nullable Output<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption,
        @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountName,
        @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountSkuName,
        @Nullable Output<WorkspaceCustomStringParameterArgs> vnetAddressPrefix) {
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
        this.amlWorkspaceId = Codegen.empty();
        this.customPrivateSubnetName = Codegen.empty();
        this.customPublicSubnetName = Codegen.empty();
        this.customVirtualNetworkId = Codegen.empty();
        this.enableNoPublicIp = Codegen.empty();
        this.encryption = Codegen.empty();
        this.loadBalancerBackendPoolName = Codegen.empty();
        this.loadBalancerId = Codegen.empty();
        this.natGatewayName = Codegen.empty();
        this.prepareEncryption = Codegen.empty();
        this.publicIpName = Codegen.empty();
        this.requireInfrastructureEncryption = Codegen.empty();
        this.storageAccountName = Codegen.empty();
        this.storageAccountSkuName = Codegen.empty();
        this.vnetAddressPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkspaceCustomStringParameterArgs> amlWorkspaceId;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> customPrivateSubnetName;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> customPublicSubnetName;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> customVirtualNetworkId;
        private @Nullable Output<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp;
        private @Nullable Output<WorkspaceEncryptionParameterArgs> encryption;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerId;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> natGatewayName;
        private @Nullable Output<WorkspaceCustomBooleanParameterArgs> prepareEncryption;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> publicIpName;
        private @Nullable Output<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountName;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountSkuName;
        private @Nullable Output<WorkspaceCustomStringParameterArgs> vnetAddressPrefix;

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

        public Builder amlWorkspaceId(@Nullable Output<WorkspaceCustomStringParameterArgs> amlWorkspaceId) {
            this.amlWorkspaceId = amlWorkspaceId;
            return this;
        }
        public Builder amlWorkspaceId(@Nullable WorkspaceCustomStringParameterArgs amlWorkspaceId) {
            this.amlWorkspaceId = Codegen.ofNullable(amlWorkspaceId);
            return this;
        }
        public Builder customPrivateSubnetName(@Nullable Output<WorkspaceCustomStringParameterArgs> customPrivateSubnetName) {
            this.customPrivateSubnetName = customPrivateSubnetName;
            return this;
        }
        public Builder customPrivateSubnetName(@Nullable WorkspaceCustomStringParameterArgs customPrivateSubnetName) {
            this.customPrivateSubnetName = Codegen.ofNullable(customPrivateSubnetName);
            return this;
        }
        public Builder customPublicSubnetName(@Nullable Output<WorkspaceCustomStringParameterArgs> customPublicSubnetName) {
            this.customPublicSubnetName = customPublicSubnetName;
            return this;
        }
        public Builder customPublicSubnetName(@Nullable WorkspaceCustomStringParameterArgs customPublicSubnetName) {
            this.customPublicSubnetName = Codegen.ofNullable(customPublicSubnetName);
            return this;
        }
        public Builder customVirtualNetworkId(@Nullable Output<WorkspaceCustomStringParameterArgs> customVirtualNetworkId) {
            this.customVirtualNetworkId = customVirtualNetworkId;
            return this;
        }
        public Builder customVirtualNetworkId(@Nullable WorkspaceCustomStringParameterArgs customVirtualNetworkId) {
            this.customVirtualNetworkId = Codegen.ofNullable(customVirtualNetworkId);
            return this;
        }
        public Builder enableNoPublicIp(@Nullable Output<WorkspaceCustomBooleanParameterArgs> enableNoPublicIp) {
            this.enableNoPublicIp = enableNoPublicIp;
            return this;
        }
        public Builder enableNoPublicIp(@Nullable WorkspaceCustomBooleanParameterArgs enableNoPublicIp) {
            this.enableNoPublicIp = Codegen.ofNullable(enableNoPublicIp);
            return this;
        }
        public Builder encryption(@Nullable Output<WorkspaceEncryptionParameterArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable WorkspaceEncryptionParameterArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder loadBalancerBackendPoolName(@Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerBackendPoolName) {
            this.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
            return this;
        }
        public Builder loadBalancerBackendPoolName(@Nullable WorkspaceCustomStringParameterArgs loadBalancerBackendPoolName) {
            this.loadBalancerBackendPoolName = Codegen.ofNullable(loadBalancerBackendPoolName);
            return this;
        }
        public Builder loadBalancerId(@Nullable Output<WorkspaceCustomStringParameterArgs> loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public Builder loadBalancerId(@Nullable WorkspaceCustomStringParameterArgs loadBalancerId) {
            this.loadBalancerId = Codegen.ofNullable(loadBalancerId);
            return this;
        }
        public Builder natGatewayName(@Nullable Output<WorkspaceCustomStringParameterArgs> natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public Builder natGatewayName(@Nullable WorkspaceCustomStringParameterArgs natGatewayName) {
            this.natGatewayName = Codegen.ofNullable(natGatewayName);
            return this;
        }
        public Builder prepareEncryption(@Nullable Output<WorkspaceCustomBooleanParameterArgs> prepareEncryption) {
            this.prepareEncryption = prepareEncryption;
            return this;
        }
        public Builder prepareEncryption(@Nullable WorkspaceCustomBooleanParameterArgs prepareEncryption) {
            this.prepareEncryption = Codegen.ofNullable(prepareEncryption);
            return this;
        }
        public Builder publicIpName(@Nullable Output<WorkspaceCustomStringParameterArgs> publicIpName) {
            this.publicIpName = publicIpName;
            return this;
        }
        public Builder publicIpName(@Nullable WorkspaceCustomStringParameterArgs publicIpName) {
            this.publicIpName = Codegen.ofNullable(publicIpName);
            return this;
        }
        public Builder requireInfrastructureEncryption(@Nullable Output<WorkspaceCustomBooleanParameterArgs> requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }
        public Builder requireInfrastructureEncryption(@Nullable WorkspaceCustomBooleanParameterArgs requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = Codegen.ofNullable(requireInfrastructureEncryption);
            return this;
        }
        public Builder storageAccountName(@Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder storageAccountName(@Nullable WorkspaceCustomStringParameterArgs storageAccountName) {
            this.storageAccountName = Codegen.ofNullable(storageAccountName);
            return this;
        }
        public Builder storageAccountSkuName(@Nullable Output<WorkspaceCustomStringParameterArgs> storageAccountSkuName) {
            this.storageAccountSkuName = storageAccountSkuName;
            return this;
        }
        public Builder storageAccountSkuName(@Nullable WorkspaceCustomStringParameterArgs storageAccountSkuName) {
            this.storageAccountSkuName = Codegen.ofNullable(storageAccountSkuName);
            return this;
        }
        public Builder vnetAddressPrefix(@Nullable Output<WorkspaceCustomStringParameterArgs> vnetAddressPrefix) {
            this.vnetAddressPrefix = vnetAddressPrefix;
            return this;
        }
        public Builder vnetAddressPrefix(@Nullable WorkspaceCustomStringParameterArgs vnetAddressPrefix) {
            this.vnetAddressPrefix = Codegen.ofNullable(vnetAddressPrefix);
            return this;
        }        public WorkspaceCustomParametersArgs build() {
            return new WorkspaceCustomParametersArgs(amlWorkspaceId, customPrivateSubnetName, customPublicSubnetName, customVirtualNetworkId, enableNoPublicIp, encryption, loadBalancerBackendPoolName, loadBalancerId, natGatewayName, prepareEncryption, publicIpName, requireInfrastructureEncryption, storageAccountName, storageAccountSkuName, vnetAddressPrefix);
        }
    }
}
