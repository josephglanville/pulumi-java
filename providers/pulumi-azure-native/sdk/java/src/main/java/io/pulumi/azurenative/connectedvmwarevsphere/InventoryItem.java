// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.InventoryItemArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Defines the inventory item.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:InventoryItem testItem /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter/InventoryItems/testItem 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:InventoryItem")
public class InventoryItem extends io.pulumi.resources.CustomResource {
    /**
     * They inventory type.
     * 
     */
    @Export(name="inventoryType", type=String.class, parameters={})
    private Output<String> inventoryType;

    /**
     * @return They inventory type.
     * 
     */
    public Output<String> getInventoryType() {
        return this.inventoryType;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Gets or sets the tracked resource id corresponding to the inventory resource.
     * 
     */
    @Export(name="managedResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedResourceId;

    /**
     * @return Gets or sets the tracked resource id corresponding to the inventory resource.
     * 
     */
    public Output</* @Nullable */ String> getManagedResourceId() {
        return this.managedResourceId;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the inventory item.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output</* @Nullable */ String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the inventory item.
     * 
     */
    public Output</* @Nullable */ String> getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
     * 
     */
    public Output</* @Nullable */ String> getMoRefId() {
        return this.moRefId;
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
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
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

    public interface BuilderApplicator {
        public void apply(InventoryItemArgs.Builder a);
    }
    private static io.pulumi.azurenative.connectedvmwarevsphere.InventoryItemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.connectedvmwarevsphere.InventoryItemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InventoryItem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InventoryItem(String name) {
        this(name, InventoryItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InventoryItem(String name, InventoryItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InventoryItem(String name, InventoryItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:InventoryItem", name, args == null ? InventoryItemArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InventoryItem(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:InventoryItem", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:InventoryItem").build())
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
    public static InventoryItem get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InventoryItem(name, id, options);
    }
}
