// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ClusterArgs;
import io.pulumi.azurenative.kusto.outputs.AzureSkuResponse;
import io.pulumi.azurenative.kusto.outputs.IdentityResponse;
import io.pulumi.azurenative.kusto.outputs.KeyVaultPropertiesResponse;
import io.pulumi.azurenative.kusto.outputs.LanguageExtensionsListResponse;
import io.pulumi.azurenative.kusto.outputs.OptimizedAutoscaleResponse;
import io.pulumi.azurenative.kusto.outputs.TrustedExternalTenantResponse;
import io.pulumi.azurenative.kusto.outputs.VirtualNetworkConfigurationResponse;
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
 * Class representing a Kusto cluster.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:Cluster KustoClusterRPTest4 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The cluster data ingestion URI.
     * 
     */
    @OutputExport(name="dataIngestionUri", type=String.class, parameters={})
    private Output<String> dataIngestionUri;

    /**
     * @return The cluster data ingestion URI.
     * 
     */
    public Output<String> getDataIngestionUri() {
        return this.dataIngestionUri;
    }
    /**
     * A boolean value that indicates if the cluster's disks are encrypted.
     * 
     */
    @OutputExport(name="enableDiskEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDiskEncryption;

    /**
     * @return A boolean value that indicates if the cluster's disks are encrypted.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDiskEncryption() {
        return this.enableDiskEncryption;
    }
    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
     */
    @OutputExport(name="enableDoubleEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDoubleEncryption;

    /**
     * @return A boolean value that indicates if double encryption is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDoubleEncryption() {
        return this.enableDoubleEncryption;
    }
    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
     */
    @OutputExport(name="enablePurge", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePurge;

    /**
     * @return A boolean value that indicates if the purge operations are enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnablePurge() {
        return this.enablePurge;
    }
    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    @OutputExport(name="enableStreamingIngest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStreamingIngest;

    /**
     * @return A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableStreamingIngest() {
        return this.enableStreamingIngest;
    }
    /**
     * The engine type
     * 
     */
    @OutputExport(name="engineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineType;

    /**
     * @return The engine type
     * 
     */
    public Output</* @Nullable */ String> getEngineType() {
        return this.engineType;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The identity of the cluster, if configured.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the cluster, if configured.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * KeyVault properties for the cluster encryption.
     * 
     */
    @OutputExport(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    /**
     * @return KeyVault properties for the cluster encryption.
     * 
     */
    public Output</* @Nullable */ KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    /**
     * List of the cluster's language extensions.
     * 
     */
    @OutputExport(name="languageExtensions", type=LanguageExtensionsListResponse.class, parameters={})
    private Output<LanguageExtensionsListResponse> languageExtensions;

    /**
     * @return List of the cluster's language extensions.
     * 
     */
    public Output<LanguageExtensionsListResponse> getLanguageExtensions() {
        return this.languageExtensions;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optimized auto scale definition.
     * 
     */
    @OutputExport(name="optimizedAutoscale", type=OptimizedAutoscaleResponse.class, parameters={})
    private Output</* @Nullable */ OptimizedAutoscaleResponse> optimizedAutoscale;

    /**
     * @return Optimized auto scale definition.
     * 
     */
    public Output</* @Nullable */ OptimizedAutoscaleResponse> getOptimizedAutoscale() {
        return this.optimizedAutoscale;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the cluster.
     * 
     */
    @OutputExport(name="sku", type=AzureSkuResponse.class, parameters={})
    private Output<AzureSkuResponse> sku;

    /**
     * @return The SKU of the cluster.
     * 
     */
    public Output<AzureSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The state of the resource.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the resource.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The reason for the cluster's current state.
     * 
     */
    @OutputExport(name="stateReason", type=String.class, parameters={})
    private Output<String> stateReason;

    /**
     * @return The reason for the cluster's current state.
     * 
     */
    public Output<String> getStateReason() {
        return this.stateReason;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The cluster's external tenants.
     * 
     */
    @OutputExport(name="trustedExternalTenants", type=List.class, parameters={TrustedExternalTenantResponse.class})
    private Output</* @Nullable */ List<TrustedExternalTenantResponse>> trustedExternalTenants;

    /**
     * @return The cluster's external tenants.
     * 
     */
    public Output</* @Nullable */ List<TrustedExternalTenantResponse>> getTrustedExternalTenants() {
        return this.trustedExternalTenants;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The cluster URI.
     * 
     */
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The cluster URI.
     * 
     */
    public Output<String> getUri() {
        return this.uri;
    }
    /**
     * Virtual network definition.
     * 
     */
    @OutputExport(name="virtualNetworkConfiguration", type=VirtualNetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkConfigurationResponse> virtualNetworkConfiguration;

    /**
     * @return Virtual network definition.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }
    /**
     * The availability zones of the cluster.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The availability zones of the cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
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
        super("azure-native:kusto:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20170907privatepreview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20180907preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:Cluster").build())
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
