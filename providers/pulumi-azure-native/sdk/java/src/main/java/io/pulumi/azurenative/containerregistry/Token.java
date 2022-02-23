// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.TokenArgs;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TokenCredentialsPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An object that represents a token for a container registry.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:Token myToken /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tokens/myToken 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:Token")
public class Token extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of scope map.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of scope map.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The credentials that can be used for authenticating the token.
     * 
     */
    @OutputExport(name="credentials", type=TokenCredentialsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TokenCredentialsPropertiesResponse> credentials;

    /**
     * @return The credentials that can be used for authenticating the token.
     * 
     */
    public Output</* @Nullable */ TokenCredentialsPropertiesResponse> getCredentials() {
        return this.credentials;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource ID of the scope map to which the token will be associated with.
     * 
     */
    @OutputExport(name="scopeMapId", type=String.class, parameters={})
    private Output</* @Nullable */ String> scopeMapId;

    /**
     * @return The resource ID of the scope map to which the token will be associated with.
     * 
     */
    public Output</* @Nullable */ String> getScopeMapId() {
        return this.scopeMapId;
    }
    /**
     * The status of the token example enabled or disabled.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the token example enabled or disabled.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Token(String name) {
        this(name, TokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Token(String name, TokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Token(String name, TokenArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Token", name, args == null ? TokenArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Token(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Token", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190501preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:Token").build())
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
    public static Token get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, options);
    }
}
