// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceVaultAndSecretReferenceResponse {
    private final @Nullable String secretUrl;
    private final @Nullable SubResourceResponse sourceVault;

    @OutputCustomType.Constructor({"secretUrl","sourceVault"})
    private CloudServiceVaultAndSecretReferenceResponse(
        @Nullable String secretUrl,
        @Nullable SubResourceResponse sourceVault) {
        this.secretUrl = secretUrl;
        this.sourceVault = sourceVault;
    }

    public Optional<String> getSecretUrl() {
        return Optional.ofNullable(this.secretUrl);
    }
    public Optional<SubResourceResponse> getSourceVault() {
        return Optional.ofNullable(this.sourceVault);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultAndSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String secretUrl;
        private @Nullable SubResourceResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultAndSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(@Nullable String secretUrl) {
            this.secretUrl = secretUrl;
            return this;
        }

        public Builder setSourceVault(@Nullable SubResourceResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public CloudServiceVaultAndSecretReferenceResponse build() {
            return new CloudServiceVaultAndSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}
