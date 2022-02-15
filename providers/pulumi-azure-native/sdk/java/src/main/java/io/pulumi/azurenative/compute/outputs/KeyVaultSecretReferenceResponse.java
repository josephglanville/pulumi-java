// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultSecretReferenceResponse {
    private final String secretUrl;
    private final SubResourceResponse sourceVault;

    @OutputCustomType.Constructor({"secretUrl","sourceVault"})
    private KeyVaultSecretReferenceResponse(
        String secretUrl,
        SubResourceResponse sourceVault) {
        this.secretUrl = Objects.requireNonNull(secretUrl);
        this.sourceVault = Objects.requireNonNull(sourceVault);
    }

    public String getSecretUrl() {
        return this.secretUrl;
    }
    public SubResourceResponse getSourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretUrl;
        private SubResourceResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(String secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }

        public Builder setSourceVault(SubResourceResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public KeyVaultSecretReferenceResponse build() {
            return new KeyVaultSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}