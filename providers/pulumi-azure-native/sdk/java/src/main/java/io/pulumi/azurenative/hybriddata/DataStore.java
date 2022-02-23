// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybriddata.DataStoreArgs;
import io.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Data store.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybriddata:DataStore TestStorSimpleSource1 /subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStores/TestStorSimpleSource1 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybriddata:DataStore")
public class DataStore extends io.pulumi.resources.CustomResource {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @OutputExport(name="customerSecrets", type=List.class, parameters={CustomerSecretResponse.class})
    private Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets;

    /**
     * @return List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    public Output</* @Nullable */ List<CustomerSecretResponse>> getCustomerSecrets() {
        return this.customerSecrets;
    }
    /**
     * The arm id of the data store type.
     * 
     */
    @OutputExport(name="dataStoreTypeId", type=String.class, parameters={})
    private Output<String> dataStoreTypeId;

    /**
     * @return The arm id of the data store type.
     * 
     */
    public Output<String> getDataStoreTypeId() {
        return this.dataStoreTypeId;
    }
    /**
     * A generic json used differently by each data source type.
     * 
     */
    @OutputExport(name="extendedProperties", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> extendedProperties;

    /**
     * @return A generic json used differently by each data source type.
     * 
     */
    public Output</* @Nullable */ Object> getExtendedProperties() {
        return this.extendedProperties;
    }
    /**
     * Name of the object.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    @OutputExport(name="repositoryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryId;

    /**
     * @return Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    public Output</* @Nullable */ String> getRepositoryId() {
        return this.repositoryId;
    }
    /**
     * State of the data source.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the data source.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataStore(String name) {
        this(name, DataStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataStore(String name, DataStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataStore(String name, DataStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:DataStore", name, args == null ? DataStoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataStore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:DataStore", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybriddata/v20160601:DataStore").build()),
                Input.of(Alias.builder().setType("azure-native:hybriddata/v20190601:DataStore").build())
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
    public static DataStore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataStore(name, id, options);
    }
}
