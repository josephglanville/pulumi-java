// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the endpoints used for the custom Open ID Connect provider.
 * 
 */
public final class OpenIdConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectConfigArgs Empty = new OpenIdConnectConfigArgs();

    /**
     * The endpoint to be used to make an authorization request.
     * 
     */
    @Import(name="authorizationEndpoint")
      private final @Nullable Output<String> authorizationEndpoint;

    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint == null ? Codegen.empty() : this.authorizationEndpoint;
    }

    /**
     * The endpoint that provides the keys necessary to validate the token.
     * 
     */
    @Import(name="certificationUri")
      private final @Nullable Output<String> certificationUri;

    public Output<String> getCertificationUri() {
        return this.certificationUri == null ? Codegen.empty() : this.certificationUri;
    }

    /**
     * The endpoint that issues the token.
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> getIssuer() {
        return this.issuer == null ? Codegen.empty() : this.issuer;
    }

    /**
     * The endpoint to be used to request a token.
     * 
     */
    @Import(name="tokenEndpoint")
      private final @Nullable Output<String> tokenEndpoint;

    public Output<String> getTokenEndpoint() {
        return this.tokenEndpoint == null ? Codegen.empty() : this.tokenEndpoint;
    }

    /**
     * The endpoint that contains all the configuration endpoints for the provider.
     * 
     */
    @Import(name="wellKnownOpenIdConfiguration")
      private final @Nullable Output<String> wellKnownOpenIdConfiguration;

    public Output<String> getWellKnownOpenIdConfiguration() {
        return this.wellKnownOpenIdConfiguration == null ? Codegen.empty() : this.wellKnownOpenIdConfiguration;
    }

    public OpenIdConnectConfigArgs(
        @Nullable Output<String> authorizationEndpoint,
        @Nullable Output<String> certificationUri,
        @Nullable Output<String> issuer,
        @Nullable Output<String> tokenEndpoint,
        @Nullable Output<String> wellKnownOpenIdConfiguration) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.certificationUri = certificationUri;
        this.issuer = issuer;
        this.tokenEndpoint = tokenEndpoint;
        this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
    }

    private OpenIdConnectConfigArgs() {
        this.authorizationEndpoint = Codegen.empty();
        this.certificationUri = Codegen.empty();
        this.issuer = Codegen.empty();
        this.tokenEndpoint = Codegen.empty();
        this.wellKnownOpenIdConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationEndpoint;
        private @Nullable Output<String> certificationUri;
        private @Nullable Output<String> issuer;
        private @Nullable Output<String> tokenEndpoint;
        private @Nullable Output<String> wellKnownOpenIdConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.certificationUri = defaults.certificationUri;
    	      this.issuer = defaults.issuer;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.wellKnownOpenIdConfiguration = defaults.wellKnownOpenIdConfiguration;
        }

        public Builder authorizationEndpoint(@Nullable Output<String> authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public Builder authorizationEndpoint(@Nullable String authorizationEndpoint) {
            this.authorizationEndpoint = Codegen.ofNullable(authorizationEndpoint);
            return this;
        }
        public Builder certificationUri(@Nullable Output<String> certificationUri) {
            this.certificationUri = certificationUri;
            return this;
        }
        public Builder certificationUri(@Nullable String certificationUri) {
            this.certificationUri = Codegen.ofNullable(certificationUri);
            return this;
        }
        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = Codegen.ofNullable(issuer);
            return this;
        }
        public Builder tokenEndpoint(@Nullable Output<String> tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public Builder tokenEndpoint(@Nullable String tokenEndpoint) {
            this.tokenEndpoint = Codegen.ofNullable(tokenEndpoint);
            return this;
        }
        public Builder wellKnownOpenIdConfiguration(@Nullable Output<String> wellKnownOpenIdConfiguration) {
            this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
            return this;
        }
        public Builder wellKnownOpenIdConfiguration(@Nullable String wellKnownOpenIdConfiguration) {
            this.wellKnownOpenIdConfiguration = Codegen.ofNullable(wellKnownOpenIdConfiguration);
            return this;
        }        public OpenIdConnectConfigArgs build() {
            return new OpenIdConnectConfigArgs(authorizationEndpoint, certificationUri, issuer, tokenEndpoint, wellKnownOpenIdConfiguration);
        }
    }
}
