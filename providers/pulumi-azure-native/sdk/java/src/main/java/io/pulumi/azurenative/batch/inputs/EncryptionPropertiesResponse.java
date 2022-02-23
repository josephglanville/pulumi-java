// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
 * 
 */
public final class EncryptionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

    /**
     * Type of the key source.
     * 
     */
    @InputImport(name="keySource")
      private final @Nullable String keySource;

    public Optional<String> getKeySource() {
        return this.keySource == null ? Optional.empty() : Optional.ofNullable(this.keySource);
    }

    /**
     * Additional details when using Microsoft.KeyVault
     * 
     */
    @InputImport(name="keyVaultProperties")
      private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    public EncryptionPropertiesResponse(
        @Nullable String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionPropertiesResponse() {
        this.keySource = null;
        this.keyVaultProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public EncryptionPropertiesResponse build() {
            return new EncryptionPropertiesResponse(keySource, keyVaultProperties);
        }
    }
}
