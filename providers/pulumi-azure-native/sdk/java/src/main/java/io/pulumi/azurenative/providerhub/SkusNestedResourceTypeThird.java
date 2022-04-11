// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.providerhub.SkusNestedResourceTypeThirdArgs;
import io.pulumi.azurenative.providerhub.outputs.SkuResourceResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2020-11-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:providerhub:SkusNestedResourceTypeThird Microsoft.Contoso/ /subscriptions/ab7a8701-f7ef-471a-a2f4-d0ebbf494f77providers/Microsoft.ProviderHub/providerRegistrations/Microsoft.Contoso/ 
 * ```
 * 
 */
@ResourceType(type="azure-native:providerhub:SkusNestedResourceTypeThird")
public class SkusNestedResourceTypeThird extends io.pulumi.resources.CustomResource {
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
    @Export(name="properties", type=SkuResourceResponseProperties.class, parameters={})
    private Output<SkuResourceResponseProperties> properties;

    public Output<SkuResourceResponseProperties> getProperties() {
        return this.properties;
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
    public SkusNestedResourceTypeThird(String name) {
        this(name, SkusNestedResourceTypeThirdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SkusNestedResourceTypeThird(String name, SkusNestedResourceTypeThirdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SkusNestedResourceTypeThird(String name, SkusNestedResourceTypeThirdArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:SkusNestedResourceTypeThird", name, args == null ? SkusNestedResourceTypeThirdArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SkusNestedResourceTypeThird(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:SkusNestedResourceTypeThird", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:providerhub/v20201120:SkusNestedResourceTypeThird").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210501preview:SkusNestedResourceTypeThird").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210601preview:SkusNestedResourceTypeThird").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210901preview:SkusNestedResourceTypeThird").build())
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
    public static SkusNestedResourceTypeThird get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SkusNestedResourceTypeThird(name, id, options);
    }
}
