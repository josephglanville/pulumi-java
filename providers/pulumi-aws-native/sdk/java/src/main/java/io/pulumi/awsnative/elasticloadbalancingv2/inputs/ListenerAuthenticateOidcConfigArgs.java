// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerAuthenticateOidcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerAuthenticateOidcConfigArgs Empty = new ListenerAuthenticateOidcConfigArgs();

    @InputImport(name="authenticationRequestExtraParams")
      private final @Nullable Input<Object> authenticationRequestExtraParams;

    public Input<Object> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Input.empty() : this.authenticationRequestExtraParams;
    }

    @InputImport(name="authorizationEndpoint", required=true)
      private final Input<String> authorizationEndpoint;

    public Input<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @InputImport(name="clientId", required=true)
      private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    @InputImport(name="clientSecret", required=true)
      private final Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret;
    }

    @InputImport(name="issuer", required=true)
      private final Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer;
    }

    @InputImport(name="onUnauthenticatedRequest")
      private final @Nullable Input<String> onUnauthenticatedRequest;

    public Input<String> getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Input.empty() : this.onUnauthenticatedRequest;
    }

    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    @InputImport(name="sessionCookieName")
      private final @Nullable Input<String> sessionCookieName;

    public Input<String> getSessionCookieName() {
        return this.sessionCookieName == null ? Input.empty() : this.sessionCookieName;
    }

    @InputImport(name="sessionTimeout")
      private final @Nullable Input<String> sessionTimeout;

    public Input<String> getSessionTimeout() {
        return this.sessionTimeout == null ? Input.empty() : this.sessionTimeout;
    }

    @InputImport(name="tokenEndpoint", required=true)
      private final Input<String> tokenEndpoint;

    public Input<String> getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    @InputImport(name="userInfoEndpoint", required=true)
      private final Input<String> userInfoEndpoint;

    public Input<String> getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public ListenerAuthenticateOidcConfigArgs(
        @Nullable Input<Object> authenticationRequestExtraParams,
        Input<String> authorizationEndpoint,
        Input<String> clientId,
        Input<String> clientSecret,
        Input<String> issuer,
        @Nullable Input<String> onUnauthenticatedRequest,
        @Nullable Input<String> scope,
        @Nullable Input<String> sessionCookieName,
        @Nullable Input<String> sessionTimeout,
        Input<String> tokenEndpoint,
        Input<String> userInfoEndpoint) {
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

    private ListenerAuthenticateOidcConfigArgs() {
        this.authenticationRequestExtraParams = Input.empty();
        this.authorizationEndpoint = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.issuer = Input.empty();
        this.onUnauthenticatedRequest = Input.empty();
        this.scope = Input.empty();
        this.sessionCookieName = Input.empty();
        this.sessionTimeout = Input.empty();
        this.tokenEndpoint = Input.empty();
        this.userInfoEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAuthenticateOidcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> authenticationRequestExtraParams;
        private Input<String> authorizationEndpoint;
        private Input<String> clientId;
        private Input<String> clientSecret;
        private Input<String> issuer;
        private @Nullable Input<String> onUnauthenticatedRequest;
        private @Nullable Input<String> scope;
        private @Nullable Input<String> sessionCookieName;
        private @Nullable Input<String> sessionTimeout;
        private Input<String> tokenEndpoint;
        private Input<String> userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAuthenticateOidcConfigArgs defaults) {
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

        public Builder setAuthenticationRequestExtraParams(@Nullable Input<Object> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder setAuthenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Input.ofNullable(authenticationRequestExtraParams);
            return this;
        }

        public Builder setAuthorizationEndpoint(Input<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }

        public Builder setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Input.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setClientSecret(Input<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Input.of(Objects.requireNonNull(clientSecret));
            return this;
        }

        public Builder setIssuer(Input<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Input.of(Objects.requireNonNull(issuer));
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable Input<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Input.ofNullable(onUnauthenticatedRequest);
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setSessionCookieName(@Nullable Input<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder setSessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Input.ofNullable(sessionCookieName);
            return this;
        }

        public Builder setSessionTimeout(@Nullable Input<String> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder setSessionTimeout(@Nullable String sessionTimeout) {
            this.sessionTimeout = Input.ofNullable(sessionTimeout);
            return this;
        }

        public Builder setTokenEndpoint(Input<String> tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }

        public Builder setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Input.of(Objects.requireNonNull(tokenEndpoint));
            return this;
        }

        public Builder setUserInfoEndpoint(Input<String> userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }

        public Builder setUserInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Input.of(Objects.requireNonNull(userInfoEndpoint));
            return this;
        }
        public ListenerAuthenticateOidcConfigArgs build() {
            return new ListenerAuthenticateOidcConfigArgs(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
