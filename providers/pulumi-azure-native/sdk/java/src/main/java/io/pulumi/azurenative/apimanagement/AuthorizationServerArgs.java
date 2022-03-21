// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.AuthorizationMethod;
import io.pulumi.azurenative.apimanagement.enums.BearerTokenSendingMethod;
import io.pulumi.azurenative.apimanagement.enums.ClientAuthenticationMethod;
import io.pulumi.azurenative.apimanagement.enums.GrantType;
import io.pulumi.azurenative.apimanagement.inputs.TokenBodyParameterContractArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizationServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizationServerArgs Empty = new AuthorizationServerArgs();

    /**
     * OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
      private final Output<String> authorizationEndpoint;

    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     * 
     */
    @Import(name="authorizationMethods")
      private final @Nullable Output<List<AuthorizationMethod>> authorizationMethods;

    public Output<List<AuthorizationMethod>> getAuthorizationMethods() {
        return this.authorizationMethods == null ? Output.empty() : this.authorizationMethods;
    }

    /**
     * Identifier of the authorization server.
     * 
     */
    @Import(name="authsid")
      private final @Nullable Output<String> authsid;

    public Output<String> getAuthsid() {
        return this.authsid == null ? Output.empty() : this.authsid;
    }

    /**
     * Specifies the mechanism by which access token is passed to the API.
     * 
     */
    @Import(name="bearerTokenSendingMethods")
      private final @Nullable Output<List<Either<String,BearerTokenSendingMethod>>> bearerTokenSendingMethods;

    public Output<List<Either<String,BearerTokenSendingMethod>>> getBearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods == null ? Output.empty() : this.bearerTokenSendingMethods;
    }

    /**
     * Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     */
    @Import(name="clientAuthenticationMethod")
      private final @Nullable Output<List<Either<String,ClientAuthenticationMethod>>> clientAuthenticationMethod;

    public Output<List<Either<String,ClientAuthenticationMethod>>> getClientAuthenticationMethod() {
        return this.clientAuthenticationMethod == null ? Output.empty() : this.clientAuthenticationMethod;
    }

    /**
     * Client or app id registered with this authorization server.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     */
    @Import(name="clientRegistrationEndpoint", required=true)
      private final Output<String> clientRegistrationEndpoint;

    public Output<String> getClientRegistrationEndpoint() {
        return this.clientRegistrationEndpoint;
    }

    /**
     * Client or app secret registered with this authorization server. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret == null ? Output.empty() : this.clientSecret;
    }

    /**
     * Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     */
    @Import(name="defaultScope")
      private final @Nullable Output<String> defaultScope;

    public Output<String> getDefaultScope() {
        return this.defaultScope == null ? Output.empty() : this.defaultScope;
    }

    /**
     * Description of the authorization server. Can contain HTML formatting tags.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * User-friendly authorization server name.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Form of an authorization grant, which the client uses to request the access token.
     * 
     */
    @Import(name="grantTypes", required=true)
      private final Output<List<Either<String,GrantType>>> grantTypes;

    public Output<List<Either<String,GrantType>>> getGrantTypes() {
        return this.grantTypes;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    @Import(name="resourceOwnerPassword")
      private final @Nullable Output<String> resourceOwnerPassword;

    public Output<String> getResourceOwnerPassword() {
        return this.resourceOwnerPassword == null ? Output.empty() : this.resourceOwnerPassword;
    }

    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    @Import(name="resourceOwnerUsername")
      private final @Nullable Output<String> resourceOwnerUsername;

    public Output<String> getResourceOwnerUsername() {
        return this.resourceOwnerUsername == null ? Output.empty() : this.resourceOwnerUsername;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     * 
     */
    @Import(name="supportState")
      private final @Nullable Output<Boolean> supportState;

    public Output<Boolean> getSupportState() {
        return this.supportState == null ? Output.empty() : this.supportState;
    }

    /**
     * Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     * 
     */
    @Import(name="tokenBodyParameters")
      private final @Nullable Output<List<TokenBodyParameterContractArgs>> tokenBodyParameters;

    public Output<List<TokenBodyParameterContractArgs>> getTokenBodyParameters() {
        return this.tokenBodyParameters == null ? Output.empty() : this.tokenBodyParameters;
    }

    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     */
    @Import(name="tokenEndpoint")
      private final @Nullable Output<String> tokenEndpoint;

    public Output<String> getTokenEndpoint() {
        return this.tokenEndpoint == null ? Output.empty() : this.tokenEndpoint;
    }

    public AuthorizationServerArgs(
        Output<String> authorizationEndpoint,
        @Nullable Output<List<AuthorizationMethod>> authorizationMethods,
        @Nullable Output<String> authsid,
        @Nullable Output<List<Either<String,BearerTokenSendingMethod>>> bearerTokenSendingMethods,
        @Nullable Output<List<Either<String,ClientAuthenticationMethod>>> clientAuthenticationMethod,
        Output<String> clientId,
        Output<String> clientRegistrationEndpoint,
        @Nullable Output<String> clientSecret,
        @Nullable Output<String> defaultScope,
        @Nullable Output<String> description,
        Output<String> displayName,
        Output<List<Either<String,GrantType>>> grantTypes,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceOwnerPassword,
        @Nullable Output<String> resourceOwnerUsername,
        Output<String> serviceName,
        @Nullable Output<Boolean> supportState,
        @Nullable Output<List<TokenBodyParameterContractArgs>> tokenBodyParameters,
        @Nullable Output<String> tokenEndpoint) {
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.authorizationMethods = authorizationMethods;
        this.authsid = authsid;
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        this.clientAuthenticationMethod = clientAuthenticationMethod;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientRegistrationEndpoint = Objects.requireNonNull(clientRegistrationEndpoint, "expected parameter 'clientRegistrationEndpoint' to be non-null");
        this.clientSecret = clientSecret;
        this.defaultScope = defaultScope;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.grantTypes = Objects.requireNonNull(grantTypes, "expected parameter 'grantTypes' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceOwnerPassword = resourceOwnerPassword;
        this.resourceOwnerUsername = resourceOwnerUsername;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.supportState = supportState;
        this.tokenBodyParameters = tokenBodyParameters;
        this.tokenEndpoint = tokenEndpoint;
    }

    private AuthorizationServerArgs() {
        this.authorizationEndpoint = Output.empty();
        this.authorizationMethods = Output.empty();
        this.authsid = Output.empty();
        this.bearerTokenSendingMethods = Output.empty();
        this.clientAuthenticationMethod = Output.empty();
        this.clientId = Output.empty();
        this.clientRegistrationEndpoint = Output.empty();
        this.clientSecret = Output.empty();
        this.defaultScope = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.grantTypes = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceOwnerPassword = Output.empty();
        this.resourceOwnerUsername = Output.empty();
        this.serviceName = Output.empty();
        this.supportState = Output.empty();
        this.tokenBodyParameters = Output.empty();
        this.tokenEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizationEndpoint;
        private @Nullable Output<List<AuthorizationMethod>> authorizationMethods;
        private @Nullable Output<String> authsid;
        private @Nullable Output<List<Either<String,BearerTokenSendingMethod>>> bearerTokenSendingMethods;
        private @Nullable Output<List<Either<String,ClientAuthenticationMethod>>> clientAuthenticationMethod;
        private Output<String> clientId;
        private Output<String> clientRegistrationEndpoint;
        private @Nullable Output<String> clientSecret;
        private @Nullable Output<String> defaultScope;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private Output<List<Either<String,GrantType>>> grantTypes;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceOwnerPassword;
        private @Nullable Output<String> resourceOwnerUsername;
        private Output<String> serviceName;
        private @Nullable Output<Boolean> supportState;
        private @Nullable Output<List<TokenBodyParameterContractArgs>> tokenBodyParameters;
        private @Nullable Output<String> tokenEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.authorizationMethods = defaults.authorizationMethods;
    	      this.authsid = defaults.authsid;
    	      this.bearerTokenSendingMethods = defaults.bearerTokenSendingMethods;
    	      this.clientAuthenticationMethod = defaults.clientAuthenticationMethod;
    	      this.clientId = defaults.clientId;
    	      this.clientRegistrationEndpoint = defaults.clientRegistrationEndpoint;
    	      this.clientSecret = defaults.clientSecret;
    	      this.defaultScope = defaults.defaultScope;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.grantTypes = defaults.grantTypes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceOwnerPassword = defaults.resourceOwnerPassword;
    	      this.resourceOwnerUsername = defaults.resourceOwnerUsername;
    	      this.serviceName = defaults.serviceName;
    	      this.supportState = defaults.supportState;
    	      this.tokenBodyParameters = defaults.tokenBodyParameters;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
        }

        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Output.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }
        public Builder authorizationMethods(@Nullable Output<List<AuthorizationMethod>> authorizationMethods) {
            this.authorizationMethods = authorizationMethods;
            return this;
        }
        public Builder authorizationMethods(@Nullable List<AuthorizationMethod> authorizationMethods) {
            this.authorizationMethods = Output.ofNullable(authorizationMethods);
            return this;
        }
        public Builder authorizationMethods(AuthorizationMethod... authorizationMethods) {
            return authorizationMethods(List.of(authorizationMethods));
        }
        public Builder authsid(@Nullable Output<String> authsid) {
            this.authsid = authsid;
            return this;
        }
        public Builder authsid(@Nullable String authsid) {
            this.authsid = Output.ofNullable(authsid);
            return this;
        }
        public Builder bearerTokenSendingMethods(@Nullable Output<List<Either<String,BearerTokenSendingMethod>>> bearerTokenSendingMethods) {
            this.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }
        public Builder bearerTokenSendingMethods(@Nullable List<Either<String,BearerTokenSendingMethod>> bearerTokenSendingMethods) {
            this.bearerTokenSendingMethods = Output.ofNullable(bearerTokenSendingMethods);
            return this;
        }
        public Builder bearerTokenSendingMethods(Either<String,BearerTokenSendingMethod>... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }
        public Builder clientAuthenticationMethod(@Nullable Output<List<Either<String,ClientAuthenticationMethod>>> clientAuthenticationMethod) {
            this.clientAuthenticationMethod = clientAuthenticationMethod;
            return this;
        }
        public Builder clientAuthenticationMethod(@Nullable List<Either<String,ClientAuthenticationMethod>> clientAuthenticationMethod) {
            this.clientAuthenticationMethod = Output.ofNullable(clientAuthenticationMethod);
            return this;
        }
        public Builder clientAuthenticationMethod(Either<String,ClientAuthenticationMethod>... clientAuthenticationMethod) {
            return clientAuthenticationMethod(List.of(clientAuthenticationMethod));
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder clientRegistrationEndpoint(Output<String> clientRegistrationEndpoint) {
            this.clientRegistrationEndpoint = Objects.requireNonNull(clientRegistrationEndpoint);
            return this;
        }
        public Builder clientRegistrationEndpoint(String clientRegistrationEndpoint) {
            this.clientRegistrationEndpoint = Output.of(Objects.requireNonNull(clientRegistrationEndpoint));
            return this;
        }
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret);
            return this;
        }
        public Builder defaultScope(@Nullable Output<String> defaultScope) {
            this.defaultScope = defaultScope;
            return this;
        }
        public Builder defaultScope(@Nullable String defaultScope) {
            this.defaultScope = Output.ofNullable(defaultScope);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder grantTypes(Output<List<Either<String,GrantType>>> grantTypes) {
            this.grantTypes = Objects.requireNonNull(grantTypes);
            return this;
        }
        public Builder grantTypes(List<Either<String,GrantType>> grantTypes) {
            this.grantTypes = Output.of(Objects.requireNonNull(grantTypes));
            return this;
        }
        public Builder grantTypes(Either<String,GrantType>... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceOwnerPassword(@Nullable Output<String> resourceOwnerPassword) {
            this.resourceOwnerPassword = resourceOwnerPassword;
            return this;
        }
        public Builder resourceOwnerPassword(@Nullable String resourceOwnerPassword) {
            this.resourceOwnerPassword = Output.ofNullable(resourceOwnerPassword);
            return this;
        }
        public Builder resourceOwnerUsername(@Nullable Output<String> resourceOwnerUsername) {
            this.resourceOwnerUsername = resourceOwnerUsername;
            return this;
        }
        public Builder resourceOwnerUsername(@Nullable String resourceOwnerUsername) {
            this.resourceOwnerUsername = Output.ofNullable(resourceOwnerUsername);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder supportState(@Nullable Output<Boolean> supportState) {
            this.supportState = supportState;
            return this;
        }
        public Builder supportState(@Nullable Boolean supportState) {
            this.supportState = Output.ofNullable(supportState);
            return this;
        }
        public Builder tokenBodyParameters(@Nullable Output<List<TokenBodyParameterContractArgs>> tokenBodyParameters) {
            this.tokenBodyParameters = tokenBodyParameters;
            return this;
        }
        public Builder tokenBodyParameters(@Nullable List<TokenBodyParameterContractArgs> tokenBodyParameters) {
            this.tokenBodyParameters = Output.ofNullable(tokenBodyParameters);
            return this;
        }
        public Builder tokenBodyParameters(TokenBodyParameterContractArgs... tokenBodyParameters) {
            return tokenBodyParameters(List.of(tokenBodyParameters));
        }
        public Builder tokenEndpoint(@Nullable Output<String> tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public Builder tokenEndpoint(@Nullable String tokenEndpoint) {
            this.tokenEndpoint = Output.ofNullable(tokenEndpoint);
            return this;
        }        public AuthorizationServerArgs build() {
            return new AuthorizationServerArgs(authorizationEndpoint, authorizationMethods, authsid, bearerTokenSendingMethods, clientAuthenticationMethod, clientId, clientRegistrationEndpoint, clientSecret, defaultScope, description, displayName, grantTypes, resourceGroupName, resourceOwnerPassword, resourceOwnerUsername, serviceName, supportState, tokenBodyParameters, tokenEndpoint);
        }
    }
}
