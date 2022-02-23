// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The details for accessing the encryption keys in Key Vault.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * The current key used to encrypt Video Analyzer account, including the key version.
     * 
     */
    @InputImport(name="currentKeyIdentifier", required=true)
      private final String currentKeyIdentifier;

    public String getCurrentKeyIdentifier() {
        return this.currentKeyIdentifier;
    }

    /**
     * The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    @InputImport(name="keyIdentifier", required=true)
      private final String keyIdentifier;

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public KeyVaultPropertiesResponse(
        String currentKeyIdentifier,
        String keyIdentifier) {
        this.currentKeyIdentifier = Objects.requireNonNull(currentKeyIdentifier, "expected parameter 'currentKeyIdentifier' to be non-null");
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier, "expected parameter 'keyIdentifier' to be non-null");
    }

    private KeyVaultPropertiesResponse() {
        this.currentKeyIdentifier = null;
        this.keyIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentKeyIdentifier;
        private String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentKeyIdentifier = defaults.currentKeyIdentifier;
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setCurrentKeyIdentifier(String currentKeyIdentifier) {
            this.currentKeyIdentifier = Objects.requireNonNull(currentKeyIdentifier);
            return this;
        }

        public Builder setKeyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(currentKeyIdentifier, keyIdentifier);
        }
    }
}
