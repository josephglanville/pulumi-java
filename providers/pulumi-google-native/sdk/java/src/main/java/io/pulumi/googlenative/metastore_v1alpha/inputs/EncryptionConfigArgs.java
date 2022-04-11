// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings for the service.
 * 
 */
public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    public EncryptionConfigArgs(@Nullable Output<String> kmsKey) {
        this.kmsKey = kmsKey;
    }

    private EncryptionConfigArgs() {
        this.kmsKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
            return this;
        }        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(kmsKey);
        }
    }
}
