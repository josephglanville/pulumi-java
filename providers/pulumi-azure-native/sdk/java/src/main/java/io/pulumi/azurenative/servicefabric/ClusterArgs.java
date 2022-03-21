// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.servicefabric.inputs.ApplicationTypeVersionsCleanupPolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.AzureActiveDirectoryArgs;
import io.pulumi.azurenative.servicefabric.inputs.CertificateDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClientCertificateCommonNameArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClientCertificateThumbprintArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClusterUpgradePolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.DiagnosticsStorageAccountConfigArgs;
import io.pulumi.azurenative.servicefabric.inputs.NodeTypeDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ServerCertificateCommonNamesArgs;
import io.pulumi.azurenative.servicefabric.inputs.SettingsSectionDescriptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    @Import(name="addOnFeatures")
      private final @Nullable Output<List<String>> addOnFeatures;

    public Output<List<String>> getAddOnFeatures() {
        return this.addOnFeatures == null ? Output.empty() : this.addOnFeatures;
    }

    /**
     * The policy used to clean up unused versions.
     * 
     */
    @Import(name="applicationTypeVersionsCleanupPolicy")
      private final @Nullable Output<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy;

    public Output<ApplicationTypeVersionsCleanupPolicyArgs> getApplicationTypeVersionsCleanupPolicy() {
        return this.applicationTypeVersionsCleanupPolicy == null ? Output.empty() : this.applicationTypeVersionsCleanupPolicy;
    }

    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    @Import(name="azureActiveDirectory")
      private final @Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory;

    public Output<AzureActiveDirectoryArgs> getAzureActiveDirectory() {
        return this.azureActiveDirectory == null ? Output.empty() : this.azureActiveDirectory;
    }

    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<CertificateDescriptionArgs> certificate;

    public Output<CertificateDescriptionArgs> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Import(name="certificateCommonNames")
      private final @Nullable Output<ServerCertificateCommonNamesArgs> certificateCommonNames;

    public Output<ServerCertificateCommonNamesArgs> getCertificateCommonNames() {
        return this.certificateCommonNames == null ? Output.empty() : this.certificateCommonNames;
    }

    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    @Import(name="clientCertificateCommonNames")
      private final @Nullable Output<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames;

    public Output<List<ClientCertificateCommonNameArgs>> getClientCertificateCommonNames() {
        return this.clientCertificateCommonNames == null ? Output.empty() : this.clientCertificateCommonNames;
    }

    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    @Import(name="clientCertificateThumbprints")
      private final @Nullable Output<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints;

    public Output<List<ClientCertificateThumbprintArgs>> getClientCertificateThumbprints() {
        return this.clientCertificateThumbprints == null ? Output.empty() : this.clientCertificateThumbprints;
    }

    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @Import(name="clusterCodeVersion")
      private final @Nullable Output<String> clusterCodeVersion;

    public Output<String> getClusterCodeVersion() {
        return this.clusterCodeVersion == null ? Output.empty() : this.clusterCodeVersion;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    @Import(name="diagnosticsStorageAccountConfig")
      private final @Nullable Output<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig;

    public Output<DiagnosticsStorageAccountConfigArgs> getDiagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig == null ? Output.empty() : this.diagnosticsStorageAccountConfig;
    }

    /**
     * Indicates if the event store service is enabled.
     * 
     */
    @Import(name="eventStoreServiceEnabled")
      private final @Nullable Output<Boolean> eventStoreServiceEnabled;

    public Output<Boolean> getEventStoreServiceEnabled() {
        return this.eventStoreServiceEnabled == null ? Output.empty() : this.eventStoreServiceEnabled;
    }

    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @Import(name="fabricSettings")
      private final @Nullable Output<List<SettingsSectionDescriptionArgs>> fabricSettings;

    public Output<List<SettingsSectionDescriptionArgs>> getFabricSettings() {
        return this.fabricSettings == null ? Output.empty() : this.fabricSettings;
    }

    /**
     * Azure resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The http management endpoint of the cluster.
     * 
     */
    @Import(name="managementEndpoint", required=true)
      private final Output<String> managementEndpoint;

    public Output<String> getManagementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * The list of node types in the cluster.
     * 
     */
    @Import(name="nodeTypes", required=true)
      private final Output<List<NodeTypeDescriptionArgs>> nodeTypes;

    public Output<List<NodeTypeDescriptionArgs>> getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    @Import(name="reliabilityLevel")
      private final @Nullable Output<String> reliabilityLevel;

    public Output<String> getReliabilityLevel() {
        return this.reliabilityLevel == null ? Output.empty() : this.reliabilityLevel;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The server certificate used by reverse proxy.
     * 
     */
    @Import(name="reverseProxyCertificate")
      private final @Nullable Output<CertificateDescriptionArgs> reverseProxyCertificate;

    public Output<CertificateDescriptionArgs> getReverseProxyCertificate() {
        return this.reverseProxyCertificate == null ? Output.empty() : this.reverseProxyCertificate;
    }

    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Import(name="reverseProxyCertificateCommonNames")
      private final @Nullable Output<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames;

    public Output<ServerCertificateCommonNamesArgs> getReverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames == null ? Output.empty() : this.reverseProxyCertificateCommonNames;
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    @Import(name="upgradeDescription")
      private final @Nullable Output<ClusterUpgradePolicyArgs> upgradeDescription;

    public Output<ClusterUpgradePolicyArgs> getUpgradeDescription() {
        return this.upgradeDescription == null ? Output.empty() : this.upgradeDescription;
    }

    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    @Import(name="upgradeMode")
      private final @Nullable Output<String> upgradeMode;

    public Output<String> getUpgradeMode() {
        return this.upgradeMode == null ? Output.empty() : this.upgradeMode;
    }

    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    @Import(name="vmImage")
      private final @Nullable Output<String> vmImage;

    public Output<String> getVmImage() {
        return this.vmImage == null ? Output.empty() : this.vmImage;
    }

    public ClusterArgs(
        @Nullable Output<List<String>> addOnFeatures,
        @Nullable Output<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy,
        @Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory,
        @Nullable Output<CertificateDescriptionArgs> certificate,
        @Nullable Output<ServerCertificateCommonNamesArgs> certificateCommonNames,
        @Nullable Output<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames,
        @Nullable Output<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints,
        @Nullable Output<String> clusterCodeVersion,
        @Nullable Output<String> clusterName,
        @Nullable Output<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig,
        @Nullable Output<Boolean> eventStoreServiceEnabled,
        @Nullable Output<List<SettingsSectionDescriptionArgs>> fabricSettings,
        @Nullable Output<String> location,
        Output<String> managementEndpoint,
        Output<List<NodeTypeDescriptionArgs>> nodeTypes,
        @Nullable Output<String> reliabilityLevel,
        Output<String> resourceGroupName,
        @Nullable Output<CertificateDescriptionArgs> reverseProxyCertificate,
        @Nullable Output<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<ClusterUpgradePolicyArgs> upgradeDescription,
        @Nullable Output<String> upgradeMode,
        @Nullable Output<String> vmImage) {
        this.addOnFeatures = addOnFeatures;
        this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
        this.azureActiveDirectory = azureActiveDirectory;
        this.certificate = certificate;
        this.certificateCommonNames = certificateCommonNames;
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterName = clusterName;
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        this.fabricSettings = fabricSettings;
        this.location = location;
        this.managementEndpoint = Objects.requireNonNull(managementEndpoint, "expected parameter 'managementEndpoint' to be non-null");
        this.nodeTypes = Objects.requireNonNull(nodeTypes, "expected parameter 'nodeTypes' to be non-null");
        this.reliabilityLevel = reliabilityLevel;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.reverseProxyCertificate = reverseProxyCertificate;
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        this.tags = tags;
        this.upgradeDescription = upgradeDescription;
        this.upgradeMode = upgradeMode;
        this.vmImage = vmImage;
    }

    private ClusterArgs() {
        this.addOnFeatures = Output.empty();
        this.applicationTypeVersionsCleanupPolicy = Output.empty();
        this.azureActiveDirectory = Output.empty();
        this.certificate = Output.empty();
        this.certificateCommonNames = Output.empty();
        this.clientCertificateCommonNames = Output.empty();
        this.clientCertificateThumbprints = Output.empty();
        this.clusterCodeVersion = Output.empty();
        this.clusterName = Output.empty();
        this.diagnosticsStorageAccountConfig = Output.empty();
        this.eventStoreServiceEnabled = Output.empty();
        this.fabricSettings = Output.empty();
        this.location = Output.empty();
        this.managementEndpoint = Output.empty();
        this.nodeTypes = Output.empty();
        this.reliabilityLevel = Output.empty();
        this.resourceGroupName = Output.empty();
        this.reverseProxyCertificate = Output.empty();
        this.reverseProxyCertificateCommonNames = Output.empty();
        this.tags = Output.empty();
        this.upgradeDescription = Output.empty();
        this.upgradeMode = Output.empty();
        this.vmImage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addOnFeatures;
        private @Nullable Output<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy;
        private @Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory;
        private @Nullable Output<CertificateDescriptionArgs> certificate;
        private @Nullable Output<ServerCertificateCommonNamesArgs> certificateCommonNames;
        private @Nullable Output<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames;
        private @Nullable Output<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints;
        private @Nullable Output<String> clusterCodeVersion;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig;
        private @Nullable Output<Boolean> eventStoreServiceEnabled;
        private @Nullable Output<List<SettingsSectionDescriptionArgs>> fabricSettings;
        private @Nullable Output<String> location;
        private Output<String> managementEndpoint;
        private Output<List<NodeTypeDescriptionArgs>> nodeTypes;
        private @Nullable Output<String> reliabilityLevel;
        private Output<String> resourceGroupName;
        private @Nullable Output<CertificateDescriptionArgs> reverseProxyCertificate;
        private @Nullable Output<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<ClusterUpgradePolicyArgs> upgradeDescription;
        private @Nullable Output<String> upgradeMode;
        private @Nullable Output<String> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnFeatures = defaults.addOnFeatures;
    	      this.applicationTypeVersionsCleanupPolicy = defaults.applicationTypeVersionsCleanupPolicy;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.certificate = defaults.certificate;
    	      this.certificateCommonNames = defaults.certificateCommonNames;
    	      this.clientCertificateCommonNames = defaults.clientCertificateCommonNames;
    	      this.clientCertificateThumbprints = defaults.clientCertificateThumbprints;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.diagnosticsStorageAccountConfig = defaults.diagnosticsStorageAccountConfig;
    	      this.eventStoreServiceEnabled = defaults.eventStoreServiceEnabled;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.location = defaults.location;
    	      this.managementEndpoint = defaults.managementEndpoint;
    	      this.nodeTypes = defaults.nodeTypes;
    	      this.reliabilityLevel = defaults.reliabilityLevel;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.reverseProxyCertificate = defaults.reverseProxyCertificate;
    	      this.reverseProxyCertificateCommonNames = defaults.reverseProxyCertificateCommonNames;
    	      this.tags = defaults.tags;
    	      this.upgradeDescription = defaults.upgradeDescription;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder addOnFeatures(@Nullable Output<List<String>> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            return this;
        }
        public Builder addOnFeatures(@Nullable List<String> addOnFeatures) {
            this.addOnFeatures = Output.ofNullable(addOnFeatures);
            return this;
        }
        public Builder addOnFeatures(String... addOnFeatures) {
            return addOnFeatures(List.of(addOnFeatures));
        }
        public Builder applicationTypeVersionsCleanupPolicy(@Nullable Output<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
            return this;
        }
        public Builder applicationTypeVersionsCleanupPolicy(@Nullable ApplicationTypeVersionsCleanupPolicyArgs applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = Output.ofNullable(applicationTypeVersionsCleanupPolicy);
            return this;
        }
        public Builder azureActiveDirectory(@Nullable Output<AzureActiveDirectoryArgs> azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }
        public Builder azureActiveDirectory(@Nullable AzureActiveDirectoryArgs azureActiveDirectory) {
            this.azureActiveDirectory = Output.ofNullable(azureActiveDirectory);
            return this;
        }
        public Builder certificate(@Nullable Output<CertificateDescriptionArgs> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(@Nullable CertificateDescriptionArgs certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }
        public Builder certificateCommonNames(@Nullable Output<ServerCertificateCommonNamesArgs> certificateCommonNames) {
            this.certificateCommonNames = certificateCommonNames;
            return this;
        }
        public Builder certificateCommonNames(@Nullable ServerCertificateCommonNamesArgs certificateCommonNames) {
            this.certificateCommonNames = Output.ofNullable(certificateCommonNames);
            return this;
        }
        public Builder clientCertificateCommonNames(@Nullable Output<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = clientCertificateCommonNames;
            return this;
        }
        public Builder clientCertificateCommonNames(@Nullable List<ClientCertificateCommonNameArgs> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = Output.ofNullable(clientCertificateCommonNames);
            return this;
        }
        public Builder clientCertificateCommonNames(ClientCertificateCommonNameArgs... clientCertificateCommonNames) {
            return clientCertificateCommonNames(List.of(clientCertificateCommonNames));
        }
        public Builder clientCertificateThumbprints(@Nullable Output<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = clientCertificateThumbprints;
            return this;
        }
        public Builder clientCertificateThumbprints(@Nullable List<ClientCertificateThumbprintArgs> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = Output.ofNullable(clientCertificateThumbprints);
            return this;
        }
        public Builder clientCertificateThumbprints(ClientCertificateThumbprintArgs... clientCertificateThumbprints) {
            return clientCertificateThumbprints(List.of(clientCertificateThumbprints));
        }
        public Builder clusterCodeVersion(@Nullable Output<String> clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }
        public Builder clusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = Output.ofNullable(clusterCodeVersion);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }
        public Builder diagnosticsStorageAccountConfig(@Nullable Output<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
            return this;
        }
        public Builder diagnosticsStorageAccountConfig(@Nullable DiagnosticsStorageAccountConfigArgs diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = Output.ofNullable(diagnosticsStorageAccountConfig);
            return this;
        }
        public Builder eventStoreServiceEnabled(@Nullable Output<Boolean> eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = eventStoreServiceEnabled;
            return this;
        }
        public Builder eventStoreServiceEnabled(@Nullable Boolean eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = Output.ofNullable(eventStoreServiceEnabled);
            return this;
        }
        public Builder fabricSettings(@Nullable Output<List<SettingsSectionDescriptionArgs>> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }
        public Builder fabricSettings(@Nullable List<SettingsSectionDescriptionArgs> fabricSettings) {
            this.fabricSettings = Output.ofNullable(fabricSettings);
            return this;
        }
        public Builder fabricSettings(SettingsSectionDescriptionArgs... fabricSettings) {
            return fabricSettings(List.of(fabricSettings));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder managementEndpoint(Output<String> managementEndpoint) {
            this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
            return this;
        }
        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = Output.of(Objects.requireNonNull(managementEndpoint));
            return this;
        }
        public Builder nodeTypes(Output<List<NodeTypeDescriptionArgs>> nodeTypes) {
            this.nodeTypes = Objects.requireNonNull(nodeTypes);
            return this;
        }
        public Builder nodeTypes(List<NodeTypeDescriptionArgs> nodeTypes) {
            this.nodeTypes = Output.of(Objects.requireNonNull(nodeTypes));
            return this;
        }
        public Builder nodeTypes(NodeTypeDescriptionArgs... nodeTypes) {
            return nodeTypes(List.of(nodeTypes));
        }
        public Builder reliabilityLevel(@Nullable Output<String> reliabilityLevel) {
            this.reliabilityLevel = reliabilityLevel;
            return this;
        }
        public Builder reliabilityLevel(@Nullable String reliabilityLevel) {
            this.reliabilityLevel = Output.ofNullable(reliabilityLevel);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder reverseProxyCertificate(@Nullable Output<CertificateDescriptionArgs> reverseProxyCertificate) {
            this.reverseProxyCertificate = reverseProxyCertificate;
            return this;
        }
        public Builder reverseProxyCertificate(@Nullable CertificateDescriptionArgs reverseProxyCertificate) {
            this.reverseProxyCertificate = Output.ofNullable(reverseProxyCertificate);
            return this;
        }
        public Builder reverseProxyCertificateCommonNames(@Nullable Output<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
            return this;
        }
        public Builder reverseProxyCertificateCommonNames(@Nullable ServerCertificateCommonNamesArgs reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = Output.ofNullable(reverseProxyCertificateCommonNames);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder upgradeDescription(@Nullable Output<ClusterUpgradePolicyArgs> upgradeDescription) {
            this.upgradeDescription = upgradeDescription;
            return this;
        }
        public Builder upgradeDescription(@Nullable ClusterUpgradePolicyArgs upgradeDescription) {
            this.upgradeDescription = Output.ofNullable(upgradeDescription);
            return this;
        }
        public Builder upgradeMode(@Nullable Output<String> upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public Builder upgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = Output.ofNullable(upgradeMode);
            return this;
        }
        public Builder vmImage(@Nullable Output<String> vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public Builder vmImage(@Nullable String vmImage) {
            this.vmImage = Output.ofNullable(vmImage);
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(addOnFeatures, applicationTypeVersionsCleanupPolicy, azureActiveDirectory, certificate, certificateCommonNames, clientCertificateCommonNames, clientCertificateThumbprints, clusterCodeVersion, clusterName, diagnosticsStorageAccountConfig, eventStoreServiceEnabled, fabricSettings, location, managementEndpoint, nodeTypes, reliabilityLevel, resourceGroupName, reverseProxyCertificate, reverseProxyCertificateCommonNames, tags, upgradeDescription, upgradeMode, vmImage);
        }
    }
}
