// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.ClusterArgs;
import io.pulumi.azurenative.servicefabric.outputs.ApplicationTypeVersionsCleanupPolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.AzureActiveDirectoryResponse;
import io.pulumi.azurenative.servicefabric.outputs.CertificateDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateCommonNameResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateThumbprintResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClusterUpgradePolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClusterVersionDetailsResponse;
import io.pulumi.azurenative.servicefabric.outputs.DiagnosticsStorageAccountConfigResponse;
import io.pulumi.azurenative.servicefabric.outputs.NodeTypeDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.ServerCertificateCommonNamesResponse;
import io.pulumi.azurenative.servicefabric.outputs.SettingsSectionDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The cluster resource
 * 
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:Cluster myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/clusters/myCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    @OutputExport(name="addOnFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addOnFeatures;

    /**
     * @return The list of add-on features to enable in the cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getAddOnFeatures() {
        return this.addOnFeatures;
    }
    /**
     * The policy used to clean up unused versions.
     * 
     */
    @OutputExport(name="applicationTypeVersionsCleanupPolicy", type=ApplicationTypeVersionsCleanupPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationTypeVersionsCleanupPolicyResponse> applicationTypeVersionsCleanupPolicy;

    /**
     * @return The policy used to clean up unused versions.
     * 
     */
    public Output</* @Nullable */ ApplicationTypeVersionsCleanupPolicyResponse> getApplicationTypeVersionsCleanupPolicy() {
        return this.applicationTypeVersionsCleanupPolicy;
    }
    /**
     * The Service Fabric runtime versions available for this cluster.
     * 
     */
    @OutputExport(name="availableClusterVersions", type=List.class, parameters={ClusterVersionDetailsResponse.class})
    private Output<List<ClusterVersionDetailsResponse>> availableClusterVersions;

    /**
     * @return The Service Fabric runtime versions available for this cluster.
     * 
     */
    public Output<List<ClusterVersionDetailsResponse>> getAvailableClusterVersions() {
        return this.availableClusterVersions;
    }
    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    @OutputExport(name="azureActiveDirectory", type=AzureActiveDirectoryResponse.class, parameters={})
    private Output</* @Nullable */ AzureActiveDirectoryResponse> azureActiveDirectory;

    /**
     * @return The AAD authentication settings of the cluster.
     * 
     */
    public Output</* @Nullable */ AzureActiveDirectoryResponse> getAzureActiveDirectory() {
        return this.azureActiveDirectory;
    }
    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    @OutputExport(name="certificate", type=CertificateDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ CertificateDescriptionResponse> certificate;

    /**
     * @return The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    public Output</* @Nullable */ CertificateDescriptionResponse> getCertificate() {
        return this.certificate;
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @OutputExport(name="certificateCommonNames", type=ServerCertificateCommonNamesResponse.class, parameters={})
    private Output</* @Nullable */ ServerCertificateCommonNamesResponse> certificateCommonNames;

    /**
     * @return Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    public Output</* @Nullable */ ServerCertificateCommonNamesResponse> getCertificateCommonNames() {
        return this.certificateCommonNames;
    }
    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    @OutputExport(name="clientCertificateCommonNames", type=List.class, parameters={ClientCertificateCommonNameResponse.class})
    private Output</* @Nullable */ List<ClientCertificateCommonNameResponse>> clientCertificateCommonNames;

    /**
     * @return The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    public Output</* @Nullable */ List<ClientCertificateCommonNameResponse>> getClientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }
    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    @OutputExport(name="clientCertificateThumbprints", type=List.class, parameters={ClientCertificateThumbprintResponse.class})
    private Output</* @Nullable */ List<ClientCertificateThumbprintResponse>> clientCertificateThumbprints;

    /**
     * @return The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    public Output</* @Nullable */ List<ClientCertificateThumbprintResponse>> getClientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }
    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @OutputExport(name="clusterCodeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterCodeVersion;

    /**
     * @return The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    public Output</* @Nullable */ String> getClusterCodeVersion() {
        return this.clusterCodeVersion;
    }
    /**
     * The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    @OutputExport(name="clusterEndpoint", type=String.class, parameters={})
    private Output<String> clusterEndpoint;

    /**
     * @return The Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     * 
     */
    public Output<String> getClusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * A service generated unique identifier for the cluster resource.
     * 
     */
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return A service generated unique identifier for the cluster resource.
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to 'Automatic'.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
     */
    @OutputExport(name="clusterState", type=String.class, parameters={})
    private Output<String> clusterState;

    /**
     * @return The current state of the cluster.
     * 
     *   - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
     *   - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
     *   - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
     *   - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
     *   - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
     *   - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to 'Automatic'.
     *   - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
     *   - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
     *   - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
     *   - Ready - Indicates that the cluster is in a stable state.
     * 
     */
    public Output<String> getClusterState() {
        return this.clusterState;
    }
    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    @OutputExport(name="diagnosticsStorageAccountConfig", type=DiagnosticsStorageAccountConfigResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsStorageAccountConfigResponse> diagnosticsStorageAccountConfig;

    /**
     * @return The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    public Output</* @Nullable */ DiagnosticsStorageAccountConfigResponse> getDiagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig;
    }
    /**
     * Azure resource etag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Azure resource etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Indicates if the event store service is enabled.
     * 
     */
    @OutputExport(name="eventStoreServiceEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventStoreServiceEnabled;

    /**
     * @return Indicates if the event store service is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEventStoreServiceEnabled() {
        return this.eventStoreServiceEnabled;
    }
    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @OutputExport(name="fabricSettings", type=List.class, parameters={SettingsSectionDescriptionResponse.class})
    private Output</* @Nullable */ List<SettingsSectionDescriptionResponse>> fabricSettings;

    /**
     * @return The list of custom fabric settings to configure the cluster.
     * 
     */
    public Output</* @Nullable */ List<SettingsSectionDescriptionResponse>> getFabricSettings() {
        return this.fabricSettings;
    }
    /**
     * Azure resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The http management endpoint of the cluster.
     * 
     */
    @OutputExport(name="managementEndpoint", type=String.class, parameters={})
    private Output<String> managementEndpoint;

    /**
     * @return The http management endpoint of the cluster.
     * 
     */
    public Output<String> getManagementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * Azure resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of node types in the cluster.
     * 
     */
    @OutputExport(name="nodeTypes", type=List.class, parameters={NodeTypeDescriptionResponse.class})
    private Output<List<NodeTypeDescriptionResponse>> nodeTypes;

    /**
     * @return The list of node types in the cluster.
     * 
     */
    public Output<List<NodeTypeDescriptionResponse>> getNodeTypes() {
        return this.nodeTypes;
    }
    /**
     * The provisioning state of the cluster resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the cluster resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    @OutputExport(name="reliabilityLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> reliabilityLevel;

    /**
     * @return The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    public Output</* @Nullable */ String> getReliabilityLevel() {
        return this.reliabilityLevel;
    }
    /**
     * The server certificate used by reverse proxy.
     * 
     */
    @OutputExport(name="reverseProxyCertificate", type=CertificateDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ CertificateDescriptionResponse> reverseProxyCertificate;

    /**
     * @return The server certificate used by reverse proxy.
     * 
     */
    public Output</* @Nullable */ CertificateDescriptionResponse> getReverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }
    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @OutputExport(name="reverseProxyCertificateCommonNames", type=ServerCertificateCommonNamesResponse.class, parameters={})
    private Output</* @Nullable */ ServerCertificateCommonNamesResponse> reverseProxyCertificateCommonNames;

    /**
     * @return Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    public Output</* @Nullable */ ServerCertificateCommonNamesResponse> getReverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames;
    }
    /**
     * Azure resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    @OutputExport(name="upgradeDescription", type=ClusterUpgradePolicyResponse.class, parameters={})
    private Output</* @Nullable */ ClusterUpgradePolicyResponse> upgradeDescription;

    /**
     * @return The policy to use when upgrading the cluster.
     * 
     */
    public Output</* @Nullable */ ClusterUpgradePolicyResponse> getUpgradeDescription() {
        return this.upgradeDescription;
    }
    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    @OutputExport(name="upgradeMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> upgradeMode;

    /**
     * @return The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    public Output</* @Nullable */ String> getUpgradeMode() {
        return this.upgradeMode;
    }
    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    @OutputExport(name="vmImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImage;

    /**
     * @return The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    public Output</* @Nullable */ String> getVmImage() {
        return this.vmImage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20160901:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20170701preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20180201:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190301:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190301preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20190601preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20191101preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20200301:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20201201preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210601:Cluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
