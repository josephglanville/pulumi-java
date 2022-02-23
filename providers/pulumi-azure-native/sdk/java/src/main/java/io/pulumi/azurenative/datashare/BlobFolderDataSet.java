// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.BlobFolderDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure storage blob folder data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:BlobFolderDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:BlobFolderDataSet")
public class BlobFolderDataSet extends io.pulumi.resources.CustomResource {
    /**
     * Container that has the file path.
     * 
     */
    @OutputExport(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return Container that has the file path.
     * 
     */
    public Output<String> getContainerName() {
        return this.containerName;
    }
    /**
     * Unique id for identifying a data set resource
     * 
     */
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Kind of data set.
     * Expected value is 'BlobFolder'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is 'BlobFolder'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Prefix for blob folder
     * 
     */
    @OutputExport(name="prefix", type=String.class, parameters={})
    private Output<String> prefix;

    /**
     * @return Prefix for blob folder
     * 
     */
    public Output<String> getPrefix() {
        return this.prefix;
    }
    /**
     * Resource group of storage account
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account
     * 
     */
    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set
     * 
     */
    @OutputExport(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set
     * 
     */
    public Output<String> getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account
     * 
     */
    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
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
    @OutputExport(name="type", type=String.class, parameters={})
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
    public BlobFolderDataSet(String name) {
        this(name, BlobFolderDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobFolderDataSet(String name, BlobFolderDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobFolderDataSet(String name, BlobFolderDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobFolderDataSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private BlobFolderDataSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobFolderDataSet", name, null, makeResourceOptions(options, id));
    }

    private static BlobFolderDataSetArgs makeArgs(BlobFolderDataSetArgs args) {
        var builder = args == null ? BlobFolderDataSetArgs.builder() : BlobFolderDataSetArgs.builder(args);
        return builder
            .setKind("BlobFolder")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:BlobFolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:BlobFolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:BlobFolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:BlobFolderDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:BlobFolderDataSet").build())
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
    public static BlobFolderDataSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlobFolderDataSet(name, id, options);
    }
}
