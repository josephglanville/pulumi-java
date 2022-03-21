// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties to configure Encryption
 * 
 */
public final class EncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

    /**
     * Enumerates the possible value of keySource for Encryption
     * 
     */
    @Import(name="keySource")
      private final @Nullable String keySource;

    public Optional<String> getKeySource() {
        return this.keySource == null ? Optional.empty() : Optional.ofNullable(this.keySource);
    }

    /**
     * Properties of KeyVault
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    public EncryptionResponse(
        @Nullable String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.keySource = keySource == null ? "Microsoft.KeyVault" : keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionResponse() {
        this.keySource = null;
        this.keyVaultProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }        public EncryptionResponse build() {
            return new EncryptionResponse(keySource, keyVaultProperties);
        }
    }
}
