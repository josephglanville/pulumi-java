// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.AccessPolicyArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.JwtAuthenticationResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Policy that determines how a video can be accessed.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:AccessPolicy accessPolicyName1 /subscriptions/591e76c3-3e97-44db-879c-3e2b12961b62/resourceGroups/testrg/providers/Microsoft.Media/videoAnalyzers/testaccount2/accesspolicies/accessPolicyName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:AccessPolicy")
public class AccessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Authentication method to be used when validating client API access.
     * 
     */
    @Export(name="authentication", type=JwtAuthenticationResponse.class, parameters={})
    private Output</* @Nullable */ JwtAuthenticationResponse> authentication;

    /**
     * @return Authentication method to be used when validating client API access.
     * 
     */
    public Output</* @Nullable */ JwtAuthenticationResponse> getAuthentication() {
        return this.authentication;
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
     * Defines the access level granted by this policy.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return Defines the access level granted by this policy.
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
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
    public AccessPolicy(String name) {
        this(name, AccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPolicy(String name, AccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPolicy(String name, AccessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:AccessPolicy", name, args == null ? AccessPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:AccessPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20210501preview:AccessPolicy").build()),
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20211101preview:AccessPolicy").build())
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
    public static AccessPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPolicy(name, id, options);
    }
}
