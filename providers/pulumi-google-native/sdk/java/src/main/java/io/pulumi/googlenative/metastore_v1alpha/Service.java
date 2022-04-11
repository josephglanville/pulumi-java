// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.metastore_v1alpha.ServiceArgs;
import io.pulumi.googlenative.metastore_v1alpha.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.HiveMetastoreConfigResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MaintenanceWindowResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MetadataIntegrationResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MetadataManagementActivityResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.NetworkConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a metastore service in a project and location.
 * 
 */
@ResourceType(type="google-native:metastore/v1alpha:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    @Export(name="artifactGcsUri", type=String.class, parameters={})
    private Output<String> artifactGcsUri;

    /**
     * @return A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    public Output<String> getArtifactGcsUri() {
        return this.artifactGcsUri;
    }
    /**
     * The time when the metastore service was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the metastore service was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    @Export(name="databaseType", type=String.class, parameters={})
    private Output<String> databaseType;

    /**
     * @return Immutable. The database type that the Metastore service stores its data.
     * 
     */
    public Output<String> getDatabaseType() {
        return this.databaseType;
    }
    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    @Export(name="encryptionConfig", type=EncryptionConfigResponse.class, parameters={})
    private Output<EncryptionConfigResponse> encryptionConfig;

    /**
     * @return Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    public Output<EncryptionConfigResponse> getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    @Export(name="endpointUri", type=String.class, parameters={})
    private Output<String> endpointUri;

    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    public Output<String> getEndpointUri() {
        return this.endpointUri;
    }
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    @Export(name="hiveMetastoreConfig", type=HiveMetastoreConfigResponse.class, parameters={})
    private Output<HiveMetastoreConfigResponse> hiveMetastoreConfig;

    /**
     * @return Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    public Output<HiveMetastoreConfigResponse> getHiveMetastoreConfig() {
        return this.hiveMetastoreConfig;
    }
    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the metastore service.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    @Export(name="maintenanceWindow", type=MaintenanceWindowResponse.class, parameters={})
    private Output<MaintenanceWindowResponse> maintenanceWindow;

    /**
     * @return The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    public Output<MaintenanceWindowResponse> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    @Export(name="metadataIntegration", type=MetadataIntegrationResponse.class, parameters={})
    private Output<MetadataIntegrationResponse> metadataIntegration;

    /**
     * @return The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    public Output<MetadataIntegrationResponse> getMetadataIntegration() {
        return this.metadataIntegration;
    }
    /**
     * The metadata management activities of the metastore service.
     * 
     */
    @Export(name="metadataManagementActivity", type=MetadataManagementActivityResponse.class, parameters={})
    private Output<MetadataManagementActivityResponse> metadataManagementActivity;

    /**
     * @return The metadata management activities of the metastore service.
     * 
     */
    public Output<MetadataManagementActivityResponse> getMetadataManagementActivity() {
        return this.metadataManagementActivity;
    }
    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    @Export(name="networkConfig", type=NetworkConfigResponse.class, parameters={})
    private Output<NetworkConfigResponse> networkConfig;

    /**
     * @return Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    public Output<NetworkConfigResponse> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    @Export(name="releaseChannel", type=String.class, parameters={})
    private Output<String> releaseChannel;

    /**
     * @return Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    public Output<String> getReleaseChannel() {
        return this.releaseChannel;
    }
    /**
     * The current state of the metastore service.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the metastore service.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return Additional information about the current state of the metastore service, if available.
     * 
     */
    public Output<String> getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The tier of the service.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The tier of the service.
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }
    /**
     * The globally unique resource identifier of the metastore service.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return The globally unique resource identifier of the metastore service.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * The time when the metastore service was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the metastore service was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Service get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
