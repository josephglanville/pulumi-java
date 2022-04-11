// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.BlobInventoryPolicyArgs;
import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicySchemaResponse;
import io.pulumi.azurenative.storage.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The storage account blob inventory policy.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:BlobInventoryPolicy DefaultInventoryPolicy /subscriptions/{subscription-id}/resourceGroups/res7687/providers/Microsoft.Storage/storageAccounts/sto9699/inventoryPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:BlobInventoryPolicy")
public class BlobInventoryPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Returns the last modified date and time of the blob inventory policy.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Returns the last modified date and time of the blob inventory policy.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
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
     * The storage account blob inventory policy object. It is composed of policy rules.
     * 
     */
    @Export(name="policy", type=BlobInventoryPolicySchemaResponse.class, parameters={})
    private Output<BlobInventoryPolicySchemaResponse> policy;

    /**
     * @return The storage account blob inventory policy object. It is composed of policy rules.
     * 
     */
    public Output<BlobInventoryPolicySchemaResponse> getPolicy() {
        return this.policy;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
    public BlobInventoryPolicy(String name) {
        this(name, BlobInventoryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobInventoryPolicy(String name, BlobInventoryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobInventoryPolicy(String name, BlobInventoryPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobInventoryPolicy", name, args == null ? BlobInventoryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BlobInventoryPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobInventoryPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:BlobInventoryPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:BlobInventoryPolicy").build())
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
    public static BlobInventoryPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlobInventoryPolicy(name, id, options);
    }
}
