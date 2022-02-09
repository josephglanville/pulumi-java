// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListOpenIdConnectProviderSecretsResult {
    private final @Nullable String clientSecret;

    @OutputCustomType.Constructor({"clientSecret"})
    private ListOpenIdConnectProviderSecretsResult(@Nullable String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListOpenIdConnectProviderSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ListOpenIdConnectProviderSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public ListOpenIdConnectProviderSecretsResult build() {
            return new ListOpenIdConnectProviderSecretsResult(clientSecret);
        }
    }
}
