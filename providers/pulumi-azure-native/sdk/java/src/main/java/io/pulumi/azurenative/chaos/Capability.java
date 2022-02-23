// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.chaos.CapabilityArgs;
import io.pulumi.azurenative.chaos.outputs.CapabilityPropertiesResponse;
import io.pulumi.azurenative.chaos.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Model that represents a Capability resource.
 * API Version: 2021-09-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:chaos:Capability Shutdown-1.0 /subscriptions/6b052e15-03d3-4f17-b2e1-be7f07588291/resourceGroups/exampleRG/providers/Microsoft.Compute/virtualMachines/exampleVM/providers/Microsoft.Chaos/targets/Microsoft-VirtualMachine/capabilities/Shutdown-1.0 
 * ```
 * 
 */
@ResourceType(type="azure-native:chaos:Capability")
public class Capability extends io.pulumi.resources.CustomResource {
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
     * The properties of a capability resource.
     * 
     */
    @OutputExport(name="properties", type=CapabilityPropertiesResponse.class, parameters={})
    private Output<CapabilityPropertiesResponse> properties;

    /**
     * @return The properties of a capability resource.
     * 
     */
    public Output<CapabilityPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The standard system metadata of a resource type.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The standard system metadata of a resource type.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Capability(String name) {
        this(name, CapabilityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Capability(String name, CapabilityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Capability(String name, CapabilityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:chaos:Capability", name, args == null ? CapabilityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Capability(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:chaos:Capability", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:chaos/v20210915preview:Capability").build())
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
    public static Capability get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Capability(name, id, options);
    }
}
