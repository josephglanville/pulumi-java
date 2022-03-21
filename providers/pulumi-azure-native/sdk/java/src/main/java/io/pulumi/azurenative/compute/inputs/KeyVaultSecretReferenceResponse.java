// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Secret
 * 
 */
public final class KeyVaultSecretReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultSecretReferenceResponse Empty = new KeyVaultSecretReferenceResponse();

    /**
     * The URL referencing a secret in a Key Vault.
     * 
     */
    @Import(name="secretUrl", required=true)
      private final String secretUrl;

    public String getSecretUrl() {
        return this.secretUrl;
    }

    /**
     * The relative URL of the Key Vault containing the secret.
     * 
     */
    @Import(name="sourceVault", required=true)
      private final SubResourceResponse sourceVault;

    public SubResourceResponse getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultSecretReferenceResponse(
        String secretUrl,
        SubResourceResponse sourceVault) {
        this.secretUrl = Objects.requireNonNull(secretUrl, "expected parameter 'secretUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultSecretReferenceResponse() {
        this.secretUrl = null;
        this.sourceVault = null;
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

        public Builder secretUrl(String secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }
        public Builder sourceVault(SubResourceResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }        public KeyVaultSecretReferenceResponse build() {
            return new KeyVaultSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}
