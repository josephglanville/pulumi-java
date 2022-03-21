// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionAuthenticateOidcArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionAuthenticateOidcArgs Empty = new ListenerRuleActionAuthenticateOidcArgs();

    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @Import(name="authenticationRequestExtraParams")
      private final @Nullable Output<Map<String,String>> authenticationRequestExtraParams;

    public Output<Map<String,String>> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Output.empty() : this.authenticationRequestExtraParams;
    }

    /**
     * The authorization endpoint of the IdP.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
      private final Output<String> authorizationEndpoint;

    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * The OAuth 2.0 client identifier.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * The OAuth 2.0 client secret.
     * 
     */
    @Import(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret;
    }

    /**
     * The OIDC issuer identifier of the IdP.
     * 
     */
    @Import(name="issuer", required=true)
      private final Output<String> issuer;

    public Output<String> getIssuer() {
        return this.issuer;
    }

    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @Import(name="onUnauthenticatedRequest")
      private final @Nullable Output<String> onUnauthenticatedRequest;

    public Output<String> getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Output.empty() : this.onUnauthenticatedRequest;
    }

    /**
     * The set of user claims to be requested from the IdP.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * The name of the cookie used to maintain session information.
     * 
     */
    @Import(name="sessionCookieName")
      private final @Nullable Output<String> sessionCookieName;

    public Output<String> getSessionCookieName() {
        return this.sessionCookieName == null ? Output.empty() : this.sessionCookieName;
    }

    /**
     * The maximum duration of the authentication session, in seconds.
     * 
     */
    @Import(name="sessionTimeout")
      private final @Nullable Output<Integer> sessionTimeout;

    public Output<Integer> getSessionTimeout() {
        return this.sessionTimeout == null ? Output.empty() : this.sessionTimeout;
    }

    /**
     * The token endpoint of the IdP.
     * 
     */
    @Import(name="tokenEndpoint", required=true)
      private final Output<String> tokenEndpoint;

    public Output<String> getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * The user info endpoint of the IdP.
     * 
     */
    @Import(name="userInfoEndpoint", required=true)
      private final Output<String> userInfoEndpoint;

    public Output<String> getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public ListenerRuleActionAuthenticateOidcArgs(
        @Nullable Output<Map<String,String>> authenticationRequestExtraParams,
        Output<String> authorizationEndpoint,
        Output<String> clientId,
        Output<String> clientSecret,
        Output<String> issuer,
        @Nullable Output<String> onUnauthenticatedRequest,
        @Nullable Output<String> scope,
        @Nullable Output<String> sessionCookieName,
        @Nullable Output<Integer> sessionTimeout,
        Output<String> tokenEndpoint,
        Output<String> userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
        this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
    }

    private ListenerRuleActionAuthenticateOidcArgs() {
        this.authenticationRequestExtraParams = Output.empty();
        this.authorizationEndpoint = Output.empty();
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
        this.issuer = Output.empty();
        this.onUnauthenticatedRequest = Output.empty();
        this.scope = Output.empty();
        this.sessionCookieName = Output.empty();
        this.sessionTimeout = Output.empty();
        this.tokenEndpoint = Output.empty();
        this.userInfoEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionAuthenticateOidcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> authenticationRequestExtraParams;
        private Output<String> authorizationEndpoint;
        private Output<String> clientId;
        private Output<String> clientSecret;
        private Output<String> issuer;
        private @Nullable Output<String> onUnauthenticatedRequest;
        private @Nullable Output<String> scope;
        private @Nullable Output<String> sessionCookieName;
        private @Nullable Output<Integer> sessionTimeout;
        private Output<String> tokenEndpoint;
        private Output<String> userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionAuthenticateOidcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Output<Map<String,String>> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }
        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Output.ofNullable(authenticationRequestExtraParams);
            return this;
        }
        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Output.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder clientSecret(Output<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Output.of(Objects.requireNonNull(clientSecret));
            return this;
        }
        public Builder issuer(Output<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Output.of(Objects.requireNonNull(issuer));
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Output.ofNullable(onUnauthenticatedRequest);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }
        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Output.ofNullable(sessionCookieName);
            return this;
        }
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = Output.ofNullable(sessionTimeout);
            return this;
        }
        public Builder tokenEndpoint(Output<String> tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Output.of(Objects.requireNonNull(tokenEndpoint));
            return this;
        }
        public Builder userInfoEndpoint(Output<String> userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Output.of(Objects.requireNonNull(userInfoEndpoint));
            return this;
        }        public ListenerRuleActionAuthenticateOidcArgs build() {
            return new ListenerRuleActionAuthenticateOidcArgs(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
