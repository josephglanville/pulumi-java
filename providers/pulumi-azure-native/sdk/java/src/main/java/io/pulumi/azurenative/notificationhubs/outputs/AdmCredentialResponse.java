// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdmCredentialResponse {
    private final @Nullable String authTokenUrl;
    private final @Nullable String clientId;
    private final @Nullable String clientSecret;

    @OutputCustomType.Constructor({"authTokenUrl","clientId","clientSecret"})
    private AdmCredentialResponse(
        @Nullable String authTokenUrl,
        @Nullable String clientId,
        @Nullable String clientSecret) {
        this.authTokenUrl = authTokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public Optional<String> getAuthTokenUrl() {
        return Optional.ofNullable(this.authTokenUrl);
    }
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdmCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authTokenUrl;
        private @Nullable String clientId;
        private @Nullable String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(AdmCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTokenUrl = defaults.authTokenUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setAuthTokenUrl(@Nullable String authTokenUrl) {
            this.authTokenUrl = authTokenUrl;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public AdmCredentialResponse build() {
            return new AdmCredentialResponse(authTokenUrl, clientId, clientSecret);
        }
    }
}
