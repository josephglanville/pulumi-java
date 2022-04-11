// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.UserPoolClientArgs;
import io.pulumi.aws.cognito.inputs.UserPoolClientState;
import io.pulumi.aws.cognito.outputs.UserPoolClientAnalyticsConfiguration;
import io.pulumi.aws.cognito.outputs.UserPoolClientTokenValidityUnits;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Cognito User Pool Client resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cognito User Pool Clients can be imported using the `id` of the Cognito User Pool, and the `id` of the Cognito User Pool Client, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/userPoolClient:UserPoolClient client <user_pool_id>/<user_pool_client_id>
 * ```
 * 
 */
@ResourceType(type="aws:cognito/userPoolClient:UserPoolClient")
public class UserPoolClient extends io.pulumi.resources.CustomResource {
    /**
     * Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    @Export(name="accessTokenValidity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> accessTokenValidity;

    /**
     * @return Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    public Output</* @Nullable */ Integer> getAccessTokenValidity() {
        return this.accessTokenValidity;
    }
    /**
     * List of allowed OAuth flows (code, implicit, client_credentials).
     * 
     */
    @Export(name="allowedOauthFlows", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedOauthFlows;

    /**
     * @return List of allowed OAuth flows (code, implicit, client_credentials).
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedOauthFlows() {
        return this.allowedOauthFlows;
    }
    /**
     * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     * 
     */
    @Export(name="allowedOauthFlowsUserPoolClient", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowedOauthFlowsUserPoolClient;

    /**
     * @return Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowedOauthFlowsUserPoolClient() {
        return this.allowedOauthFlowsUserPoolClient;
    }
    /**
     * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     * 
     */
    @Export(name="allowedOauthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedOauthScopes;

    /**
     * @return List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedOauthScopes() {
        return this.allowedOauthScopes;
    }
    /**
     * Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     * 
     */
    @Export(name="analyticsConfiguration", type=UserPoolClientAnalyticsConfiguration.class, parameters={})
    private Output</* @Nullable */ UserPoolClientAnalyticsConfiguration> analyticsConfiguration;

    /**
     * @return Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     * 
     */
    public Output</* @Nullable */ UserPoolClientAnalyticsConfiguration> getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }
    /**
     * List of allowed callback URLs for the identity providers.
     * 
     */
    @Export(name="callbackUrls", type=List.class, parameters={String.class})
    private Output<List<String>> callbackUrls;

    /**
     * @return List of allowed callback URLs for the identity providers.
     * 
     */
    public Output<List<String>> getCallbackUrls() {
        return this.callbackUrls;
    }
    /**
     * Client secret of the user pool client.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return Client secret of the user pool client.
     * 
     */
    public Output<String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Default redirect URI. Must be in the list of callback URLs.
     * 
     */
    @Export(name="defaultRedirectUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRedirectUri;

    /**
     * @return Default redirect URI. Must be in the list of callback URLs.
     * 
     */
    public Output</* @Nullable */ String> getDefaultRedirectUri() {
        return this.defaultRedirectUri;
    }
    /**
     * Enables or disables token revocation.
     * 
     */
    @Export(name="enableTokenRevocation", type=Boolean.class, parameters={})
    private Output<Boolean> enableTokenRevocation;

    /**
     * @return Enables or disables token revocation.
     * 
     */
    public Output<Boolean> getEnableTokenRevocation() {
        return this.enableTokenRevocation;
    }
    /**
     * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     * 
     */
    @Export(name="explicitAuthFlows", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> explicitAuthFlows;

    /**
     * @return List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     * 
     */
    public Output</* @Nullable */ List<String>> getExplicitAuthFlows() {
        return this.explicitAuthFlows;
    }
    /**
     * Should an application secret be generated.
     * 
     */
    @Export(name="generateSecret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> generateSecret;

    /**
     * @return Should an application secret be generated.
     * 
     */
    public Output</* @Nullable */ Boolean> getGenerateSecret() {
        return this.generateSecret;
    }
    /**
     * Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    @Export(name="idTokenValidity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idTokenValidity;

    /**
     * @return Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    public Output</* @Nullable */ Integer> getIdTokenValidity() {
        return this.idTokenValidity;
    }
    /**
     * List of allowed logout URLs for the identity providers.
     * 
     */
    @Export(name="logoutUrls", type=List.class, parameters={String.class})
    private Output<List<String>> logoutUrls;

    /**
     * @return List of allowed logout URLs for the identity providers.
     * 
     */
    public Output<List<String>> getLogoutUrls() {
        return this.logoutUrls;
    }
    /**
     * Name of the application client.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the application client.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     * 
     */
    @Export(name="preventUserExistenceErrors", type=String.class, parameters={})
    private Output<String> preventUserExistenceErrors;

    /**
     * @return Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     * 
     */
    public Output<String> getPreventUserExistenceErrors() {
        return this.preventUserExistenceErrors;
    }
    /**
     * List of user pool attributes the application client can read from.
     * 
     */
    @Export(name="readAttributes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> readAttributes;

    /**
     * @return List of user pool attributes the application client can read from.
     * 
     */
    public Output</* @Nullable */ List<String>> getReadAttributes() {
        return this.readAttributes;
    }
    /**
     * Time limit in days refresh tokens are valid for.
     * 
     */
    @Export(name="refreshTokenValidity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> refreshTokenValidity;

    /**
     * @return Time limit in days refresh tokens are valid for.
     * 
     */
    public Output</* @Nullable */ Integer> getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }
    /**
     * List of provider names for the identity providers that are supported on this client. Uses the `provider_name` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     * 
     */
    @Export(name="supportedIdentityProviders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedIdentityProviders;

    /**
     * @return List of provider names for the identity providers that are supported on this client. Uses the `provider_name` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportedIdentityProviders() {
        return this.supportedIdentityProviders;
    }
    /**
     * Configuration block for units in which the validity times are represented in. Detailed below.
     * 
     */
    @Export(name="tokenValidityUnits", type=UserPoolClientTokenValidityUnits.class, parameters={})
    private Output</* @Nullable */ UserPoolClientTokenValidityUnits> tokenValidityUnits;

    /**
     * @return Configuration block for units in which the validity times are represented in. Detailed below.
     * 
     */
    public Output</* @Nullable */ UserPoolClientTokenValidityUnits> getTokenValidityUnits() {
        return this.tokenValidityUnits;
    }
    /**
     * User pool the client belongs to.
     * 
     */
    @Export(name="userPoolId", type=String.class, parameters={})
    private Output<String> userPoolId;

    /**
     * @return User pool the client belongs to.
     * 
     */
    public Output<String> getUserPoolId() {
        return this.userPoolId;
    }
    /**
     * List of user pool attributes the application client can write to.
     * 
     */
    @Export(name="writeAttributes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> writeAttributes;

    /**
     * @return List of user pool attributes the application client can write to.
     * 
     */
    public Output</* @Nullable */ List<String>> getWriteAttributes() {
        return this.writeAttributes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPoolClient(String name) {
        this(name, UserPoolClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPoolClient(String name, UserPoolClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPoolClient(String name, UserPoolClientArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolClient:UserPoolClient", name, args == null ? UserPoolClientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPoolClient(String name, Output<String> id, @Nullable UserPoolClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolClient:UserPoolClient", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserPoolClient get(String name, Output<String> id, @Nullable UserPoolClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserPoolClient(name, id, state, options);
    }
}
