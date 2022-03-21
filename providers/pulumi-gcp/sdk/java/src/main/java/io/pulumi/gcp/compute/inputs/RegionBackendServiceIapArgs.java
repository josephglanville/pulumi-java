// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceIapArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceIapArgs Empty = new RegionBackendServiceIapArgs();

    /**
     * OAuth2 Client ID for IAP
     * 
     */
    @Import(name="oauth2ClientId", required=true)
      private final Output<String> oauth2ClientId;

    public Output<String> getOauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecret", required=true)
      private final Output<String> oauth2ClientSecret;

    public Output<String> getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * - 
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecretSha256")
      private final @Nullable Output<String> oauth2ClientSecretSha256;

    public Output<String> getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256 == null ? Output.empty() : this.oauth2ClientSecretSha256;
    }

    public RegionBackendServiceIapArgs(
        Output<String> oauth2ClientId,
        Output<String> oauth2ClientSecret,
        @Nullable Output<String> oauth2ClientSecretSha256) {
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
        this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    private RegionBackendServiceIapArgs() {
        this.oauth2ClientId = Output.empty();
        this.oauth2ClientSecret = Output.empty();
        this.oauth2ClientSecretSha256 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceIapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> oauth2ClientId;
        private Output<String> oauth2ClientSecret;
        private @Nullable Output<String> oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceIapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder oauth2ClientId(Output<String> oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }
        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Output.of(Objects.requireNonNull(oauth2ClientId));
            return this;
        }
        public Builder oauth2ClientSecret(Output<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Output.of(Objects.requireNonNull(oauth2ClientSecret));
            return this;
        }
        public Builder oauth2ClientSecretSha256(@Nullable Output<String> oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }
        public Builder oauth2ClientSecretSha256(@Nullable String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Output.ofNullable(oauth2ClientSecretSha256);
            return this;
        }        public RegionBackendServiceIapArgs build() {
            return new RegionBackendServiceIapArgs(oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
