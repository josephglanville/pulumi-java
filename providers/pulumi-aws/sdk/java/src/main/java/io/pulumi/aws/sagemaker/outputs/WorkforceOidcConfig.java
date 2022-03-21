// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkforceOidcConfig {
    /**
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * 
     */
    private final String authorizationEndpoint;
    /**
     * The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    private final String clientId;
    /**
     * The OIDC IdP client secret used to configure your private workforce.
     * 
     */
    private final String clientSecret;
    /**
     * The OIDC IdP issuer used to configure your private workforce.
     * 
     */
    private final String issuer;
    /**
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * 
     */
    private final String jwksUri;
    /**
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * 
     */
    private final String logoutEndpoint;
    /**
     * The OIDC IdP token endpoint used to configure your private workforce.
     * 
     */
    private final String tokenEndpoint;
    /**
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * 
     */
    private final String userInfoEndpoint;

    @CustomType.Constructor
    private WorkforceOidcConfig(
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("jwksUri") String jwksUri,
        @CustomType.Parameter("logoutEndpoint") String logoutEndpoint,
        @CustomType.Parameter("tokenEndpoint") String tokenEndpoint,
        @CustomType.Parameter("userInfoEndpoint") String userInfoEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.logoutEndpoint = logoutEndpoint;
        this.tokenEndpoint = tokenEndpoint;
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * 
    */
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * The OIDC IdP client ID used to configure your private workforce.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The OIDC IdP client secret used to configure your private workforce.
     * 
    */
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The OIDC IdP issuer used to configure your private workforce.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * 
    */
    public String getJwksUri() {
        return this.jwksUri;
    }
    /**
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * 
    */
    public String getLogoutEndpoint() {
        return this.logoutEndpoint;
    }
    /**
     * The OIDC IdP token endpoint used to configure your private workforce.
     * 
    */
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }
    /**
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * 
    */
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceOidcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private String jwksUri;
        private String logoutEndpoint;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceOidcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.jwksUri = defaults.jwksUri;
    	      this.logoutEndpoint = defaults.logoutEndpoint;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
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
        public Builder jwksUri(String jwksUri) {
            this.jwksUri = Objects.requireNonNull(jwksUri);
            return this;
        }
        public Builder logoutEndpoint(String logoutEndpoint) {
            this.logoutEndpoint = Objects.requireNonNull(logoutEndpoint);
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }        public WorkforceOidcConfig build() {
            return new WorkforceOidcConfig(authorizationEndpoint, clientId, clientSecret, issuer, jwksUri, logoutEndpoint, tokenEndpoint, userInfoEndpoint);
        }
    }
}
