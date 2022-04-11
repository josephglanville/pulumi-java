// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.BlobContainerDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Blob container data set mapping.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:BlobContainerDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:BlobContainerDataSetMapping")
public class BlobContainerDataSetMapping extends io.pulumi.resources.CustomResource {
    /**
     * BLOB Container name.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return BLOB Container name.
     * 
     */
    public Output<String> getContainerName() {
        return this.containerName;
    }
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'Container'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is 'Container'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource group of storage account.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account.
     * 
     */
    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set.
     * 
     */
    public Output<String> getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account.
     * 
     */
    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BlobContainerDataSetMapping(String name) {
        this(name, BlobContainerDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobContainerDataSetMapping(String name, BlobContainerDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobContainerDataSetMapping(String name, BlobContainerDataSetMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobContainerDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private BlobContainerDataSetMapping(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobContainerDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static BlobContainerDataSetMappingArgs makeArgs(BlobContainerDataSetMappingArgs args) {
        var builder = args == null ? BlobContainerDataSetMappingArgs.builder() : BlobContainerDataSetMappingArgs.builder(args);
        return builder
            .kind("Container")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:BlobContainerDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:BlobContainerDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:BlobContainerDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:BlobContainerDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:BlobContainerDataSetMapping").build())
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
    public static BlobContainerDataSetMapping get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlobContainerDataSetMapping(name, id, options);
    }
}
