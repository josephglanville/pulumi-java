// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.JitNetworkAccessPolicyArgs;
import io.pulumi.azurenative.security.outputs.JitNetworkAccessPolicyVirtualMachineResponse;
import io.pulumi.azurenative.security.outputs.JitNetworkAccessRequestResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:JitNetworkAccessPolicy default /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg1/providers/Microsoft.Security/locations/westeurope/jitNetworkAccessPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:JitNetworkAccessPolicy")
public class JitNetworkAccessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Kind of the resource
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Location where the resource is stored
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the provisioning state of the Just-in-Time policy.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets the provisioning state of the Just-in-Time policy.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="requests", type=List.class, parameters={JitNetworkAccessRequestResponse.class})
    private Output</* @Nullable */ List<JitNetworkAccessRequestResponse>> requests;

    public Output</* @Nullable */ List<JitNetworkAccessRequestResponse>> getRequests() {
        return this.requests;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
     */
    @OutputExport(name="virtualMachines", type=List.class, parameters={JitNetworkAccessPolicyVirtualMachineResponse.class})
    private Output<List<JitNetworkAccessPolicyVirtualMachineResponse>> virtualMachines;

    /**
     * @return Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
     */
    public Output<List<JitNetworkAccessPolicyVirtualMachineResponse>> getVirtualMachines() {
        return this.virtualMachines;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JitNetworkAccessPolicy(String name) {
        this(name, JitNetworkAccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JitNetworkAccessPolicy(String name, JitNetworkAccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JitNetworkAccessPolicy(String name, JitNetworkAccessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:JitNetworkAccessPolicy", name, args == null ? JitNetworkAccessPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JitNetworkAccessPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:JitNetworkAccessPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:security/v20150601preview:JitNetworkAccessPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:security/v20200101:JitNetworkAccessPolicy").build())
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
    public static JitNetworkAccessPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JitNetworkAccessPolicy(name, id, options);
    }
}
