// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.IdentityProviderArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Identity Provider details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:IdentityProvider Facebook /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/identityProviders/Facebook 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:IdentityProvider")
public class IdentityProvider extends io.pulumi.resources.CustomResource {
    /**
     * List of Allowed Tenants when configuring Azure Active Directory login.
     * 
     */
    @OutputExport(name="allowedTenants", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedTenants;

    /**
     * @return List of Allowed Tenants when configuring Azure Active Directory login.
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedTenants() {
        return this.allowedTenants;
    }
    /**
     * OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     * 
     */
    @OutputExport(name="authority", type=String.class, parameters={})
    private Output</* @Nullable */ String> authority;

    /**
     * @return OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     * 
     */
    public Output</* @Nullable */ String> getAuthority() {
        return this.authority;
    }
    /**
     * Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft.
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft.
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @OutputExport(name="passwordResetPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> passwordResetPolicyName;

    /**
     * @return Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output</* @Nullable */ String> getPasswordResetPolicyName() {
        return this.passwordResetPolicyName;
    }
    /**
     * Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @OutputExport(name="profileEditingPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> profileEditingPolicyName;

    /**
     * @return Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output</* @Nullable */ String> getProfileEditingPolicyName() {
        return this.profileEditingPolicyName;
    }
    /**
     * Signin Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @OutputExport(name="signinPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinPolicyName;

    /**
     * @return Signin Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output</* @Nullable */ String> getSigninPolicyName() {
        return this.signinPolicyName;
    }
    /**
     * The TenantId to use instead of Common when logging into Active Directory
     * 
     */
    @OutputExport(name="signinTenant", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinTenant;

    /**
     * @return The TenantId to use instead of Common when logging into Active Directory
     * 
     */
    public Output</* @Nullable */ String> getSigninTenant() {
        return this.signinTenant;
    }
    /**
     * Signup Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @OutputExport(name="signupPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signupPolicyName;

    /**
     * @return Signup Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    public Output</* @Nullable */ String> getSignupPolicyName() {
        return this.signupPolicyName;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityProvider(String name) {
        this(name, IdentityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityProvider(String name, IdentityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityProvider(String name, IdentityProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, args == null ? IdentityProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:IdentityProvider").build())
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
    public static IdentityProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProvider(name, id, options);
    }
}
