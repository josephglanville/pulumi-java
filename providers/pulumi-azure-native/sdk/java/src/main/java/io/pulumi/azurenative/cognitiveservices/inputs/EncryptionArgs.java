// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.enums.KeySource;
import io.pulumi.azurenative.cognitiveservices.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties to configure Encryption
 * 
 */
public final class EncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionArgs Empty = new EncryptionArgs();

    /**
     * Enumerates the possible value of keySource for Encryption
     * 
     */
    @InputImport(name="keySource")
      private final @Nullable Input<Either<String,KeySource>> keySource;

    public Input<Either<String,KeySource>> getKeySource() {
        return this.keySource == null ? Input.empty() : this.keySource;
    }

    /**
     * Properties of KeyVault
     * 
     */
    @InputImport(name="keyVaultProperties")
      private final @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    public EncryptionArgs(
        @Nullable Input<Either<String,KeySource>> keySource,
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
        this.keySource = keySource == null ? Input.ofLeft("Microsoft.KeyVault") : keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionArgs() {
        this.keySource = Input.empty();
        this.keyVaultProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,KeySource>> keySource;
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setKeySource(@Nullable Input<Either<String,KeySource>> keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeySource(@Nullable Either<String,KeySource> keySource) {
            this.keySource = Input.ofNullable(keySource);
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }
        public EncryptionArgs build() {
            return new EncryptionArgs(keySource, keyVaultProperties);
        }
    }
}
