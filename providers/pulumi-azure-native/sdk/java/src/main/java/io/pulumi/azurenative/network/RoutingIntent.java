// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RoutingIntentArgs;
import io.pulumi.azurenative.network.outputs.RoutingPolicyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The routing intent child resource of a Virtual hub.
 * API Version: 2021-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:RoutingIntent Intent1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/routingIntent/Intent1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:RoutingIntent")
public class RoutingIntent extends io.pulumi.resources.CustomResource {
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the RoutingIntent resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the RoutingIntent resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of routing policies.
     * 
     */
    @OutputExport(name="routingPolicies", type=List.class, parameters={RoutingPolicyResponse.class})
    private Output</* @Nullable */ List<RoutingPolicyResponse>> routingPolicies;

    /**
     * @return List of routing policies.
     * 
     */
    public Output</* @Nullable */ List<RoutingPolicyResponse>> getRoutingPolicies() {
        return this.routingPolicies;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoutingIntent(String name) {
        this(name, RoutingIntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoutingIntent(String name, RoutingIntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoutingIntent(String name, RoutingIntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RoutingIntent", name, args == null ? RoutingIntentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RoutingIntent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RoutingIntent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20210501:RoutingIntent").build())
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
    public static RoutingIntent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoutingIntent(name, id, options);
    }
}
