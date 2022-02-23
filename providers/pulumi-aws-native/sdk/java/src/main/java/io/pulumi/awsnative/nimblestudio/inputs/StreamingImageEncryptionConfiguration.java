// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.StreamingImageEncryptionConfigurationKeyType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>TODO</p>
 * 
 */
public final class StreamingImageEncryptionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StreamingImageEncryptionConfiguration Empty = new StreamingImageEncryptionConfiguration();

    /**
     * <p>The ARN for a KMS key that is used to encrypt studio data.</p>
     * 
     */
    @InputImport(name="keyArn")
      private final @Nullable String keyArn;

    public Optional<String> getKeyArn() {
        return this.keyArn == null ? Optional.empty() : Optional.ofNullable(this.keyArn);
    }

    @InputImport(name="keyType", required=true)
      private final StreamingImageEncryptionConfigurationKeyType keyType;

    public StreamingImageEncryptionConfigurationKeyType getKeyType() {
        return this.keyType;
    }

    public StreamingImageEncryptionConfiguration(
        @Nullable String keyArn,
        StreamingImageEncryptionConfigurationKeyType keyType) {
        this.keyArn = keyArn;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private StreamingImageEncryptionConfiguration() {
        this.keyArn = null;
        this.keyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingImageEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyArn;
        private StreamingImageEncryptionConfigurationKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingImageEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder setKeyArn(@Nullable String keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder setKeyType(StreamingImageEncryptionConfigurationKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public StreamingImageEncryptionConfiguration build() {
            return new StreamingImageEncryptionConfiguration(keyArn, keyType);
        }
    }
}
