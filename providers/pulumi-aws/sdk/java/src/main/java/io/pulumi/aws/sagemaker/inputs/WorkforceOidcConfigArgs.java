// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkforceOidcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkforceOidcConfigArgs Empty = new WorkforceOidcConfigArgs();

    /**
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
      private final Output<String> authorizationEndpoint;

    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * The OIDC IdP client secret used to configure your private workforce.
     * 
     */
    @Import(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret;
    }

    /**
     * The OIDC IdP issuer used to configure your private workforce.
     * 
     */
    @Import(name="issuer", required=true)
      private final Output<String> issuer;

    public Output<String> getIssuer() {
        return this.issuer;
    }

    /**
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * 
     */
    @Import(name="jwksUri", required=true)
      private final Output<String> jwksUri;

    public Output<String> getJwksUri() {
        return this.jwksUri;
    }

    /**
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * 
     */
    @Import(name="logoutEndpoint", required=true)
      private final Output<String> logoutEndpoint;

    public Output<String> getLogoutEndpoint() {
        return this.logoutEndpoint;
    }

    /**
     * The OIDC IdP token endpoint used to configure your private workforce.
     * 
     */
    @Import(name="tokenEndpoint", required=true)
      private final Output<String> tokenEndpoint;

    public Output<String> getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * 
     */
    @Import(name="userInfoEndpoint", required=true)
      private final Output<String> userInfoEndpoint;

    public Output<String> getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public WorkforceOidcConfigArgs(
        Output<String> authorizationEndpoint,
        Output<String> clientId,
        Output<String> clientSecret,
        Output<String> issuer,
        Output<String> jwksUri,
        Output<String> logoutEndpoint,
        Output<String> tokenEndpoint,
        Output<String> userInfoEndpoint) {
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.jwksUri = Objects.requireNonNull(jwksUri, "expected parameter 'jwksUri' to be non-null");
        this.logoutEndpoint = Objects.requireNonNull(logoutEndpoint, "expected parameter 'logoutEndpoint' to be non-null");
        this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
        this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
    }

    private WorkforceOidcConfigArgs() {
        this.authorizationEndpoint = Output.empty();
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
        this.issuer = Output.empty();
        this.jwksUri = Output.empty();
        this.logoutEndpoint = Output.empty();
        this.tokenEndpoint = Output.empty();
        this.userInfoEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceOidcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizationEndpoint;
        private Output<String> clientId;
        private Output<String> clientSecret;
        private Output<String> issuer;
        private Output<String> jwksUri;
        private Output<String> logoutEndpoint;
        private Output<String> tokenEndpoint;
        private Output<String> userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceOidcConfigArgs defaults) {
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
        public Builder jwksUri(Output<String> jwksUri) {
            this.jwksUri = Objects.requireNonNull(jwksUri);
            return this;
        }
        public Builder jwksUri(String jwksUri) {
            this.jwksUri = Output.of(Objects.requireNonNull(jwksUri));
            return this;
        }
        public Builder logoutEndpoint(Output<String> logoutEndpoint) {
            this.logoutEndpoint = Objects.requireNonNull(logoutEndpoint);
            return this;
        }
        public Builder logoutEndpoint(String logoutEndpoint) {
            this.logoutEndpoint = Output.of(Objects.requireNonNull(logoutEndpoint));
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
        }        public WorkforceOidcConfigArgs build() {
            return new WorkforceOidcConfigArgs(authorizationEndpoint, clientId, clientSecret, issuer, jwksUri, logoutEndpoint, tokenEndpoint, userInfoEndpoint);
        }
    }
}
