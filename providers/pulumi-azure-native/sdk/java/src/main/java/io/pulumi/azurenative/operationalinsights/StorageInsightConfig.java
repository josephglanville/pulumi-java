// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.StorageInsightConfigArgs;
import io.pulumi.azurenative.operationalinsights.outputs.StorageAccountResponse;
import io.pulumi.azurenative.operationalinsights.outputs.StorageInsightStatusResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The top level storage insight resource container.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:StorageInsightConfig AzTestSI1110 /subscriptions/00000000-0000-0000-0000-000000000005/resourcegroups/oiautorest6987/providers/microsoft.operationalinsights/workspaces/aztest5048/storageinsightconfigs/AzTestSI1110 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:StorageInsightConfig")
public class StorageInsightConfig extends io.pulumi.resources.CustomResource {
    /**
     * The names of the blob containers that the workspace should read
     * 
     */
    @Export(name="containers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> containers;

    /**
     * @return The names of the blob containers that the workspace should read
     * 
     */
    public Output</* @Nullable */ List<String>> getContainers() {
        return this.containers;
    }
    /**
     * The ETag of the storage insight.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return The ETag of the storage insight.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The status of the storage insight
     * 
     */
    @Export(name="status", type=StorageInsightStatusResponse.class, parameters={})
    private Output<StorageInsightStatusResponse> status;

    /**
     * @return The status of the storage insight
     * 
     */
    public Output<StorageInsightStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * The storage account connection details
     * 
     */
    @Export(name="storageAccount", type=StorageAccountResponse.class, parameters={})
    private Output<StorageAccountResponse> storageAccount;

    /**
     * @return The storage account connection details
     * 
     */
    public Output<StorageAccountResponse> getStorageAccount() {
        return this.storageAccount;
    }
    /**
     * The names of the Azure tables that the workspace should read
     * 
     */
    @Export(name="tables", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tables;

    /**
     * @return The names of the Azure tables that the workspace should read
     * 
     */
    public Output</* @Nullable */ List<String>> getTables() {
        return this.tables;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageInsightConfig(String name) {
        this(name, StorageInsightConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageInsightConfig(String name, StorageInsightConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageInsightConfig(String name, StorageInsightConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:StorageInsightConfig", name, args == null ? StorageInsightConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StorageInsightConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:StorageInsightConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20150320:StorageInsightConfig").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200301preview:StorageInsightConfig").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20200801:StorageInsightConfig").build())
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
    public static StorageInsightConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StorageInsightConfig(name, id, options);
    }
}
