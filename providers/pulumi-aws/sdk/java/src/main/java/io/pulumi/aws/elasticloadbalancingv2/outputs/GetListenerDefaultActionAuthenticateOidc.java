// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionAuthenticateOidc {
    private final Map<String,String> authenticationRequestExtraParams;
    private final String authorizationEndpoint;
    private final String clientId;
    private final String clientSecret;
    private final String issuer;
    private final String onUnauthenticatedRequest;
    private final String scope;
    private final String sessionCookieName;
    private final Integer sessionTimeout;
    private final String tokenEndpoint;
    private final String userInfoEndpoint;

    @CustomType.Constructor
    private GetListenerDefaultActionAuthenticateOidc(
        @CustomType.Parameter("authenticationRequestExtraParams") Map<String,String> authenticationRequestExtraParams,
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("onUnauthenticatedRequest") String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("sessionCookieName") String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") Integer sessionTimeout,
        @CustomType.Parameter("tokenEndpoint") String tokenEndpoint,
        @CustomType.Parameter("userInfoEndpoint") String userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuer = issuer;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = tokenEndpoint;
        this.userInfoEndpoint = userInfoEndpoint;
    }

    public Map<String,String> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }
    public String getIssuer() {
        return this.issuer;
    }
    public String getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }
    public String getScope() {
        return this.scope;
    }
    public String getSessionCookieName() {
        return this.sessionCookieName;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionAuthenticateOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private String onUnauthenticatedRequest;
        private String scope;
        private String sessionCookieName;
        private Integer sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionAuthenticateOidc defaults) {
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

        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams);
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder sessionCookieName(String sessionCookieName) {
            this.sessionCookieName = Objects.requireNonNull(sessionCookieName);
            return this;
        }
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = Objects.requireNonNull(sessionTimeout);
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }        public GetListenerDefaultActionAuthenticateOidc build() {
            return new GetListenerDefaultActionAuthenticateOidc(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
