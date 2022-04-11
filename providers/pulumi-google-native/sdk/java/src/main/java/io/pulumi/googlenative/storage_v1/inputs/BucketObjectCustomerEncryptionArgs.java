// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
 * 
 */
public final class BucketObjectCustomerEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectCustomerEncryptionArgs Empty = new BucketObjectCustomerEncryptionArgs();

    /**
     * The encryption algorithm.
     * 
     */
    @Import(name="encryptionAlgorithm")
      private final @Nullable Output<String> encryptionAlgorithm;

    public Output<String> getEncryptionAlgorithm() {
        return this.encryptionAlgorithm == null ? Codegen.empty() : this.encryptionAlgorithm;
    }

    /**
     * SHA256 hash value of the encryption key.
     * 
     */
    @Import(name="keySha256")
      private final @Nullable Output<String> keySha256;

    public Output<String> getKeySha256() {
        return this.keySha256 == null ? Codegen.empty() : this.keySha256;
    }

    public BucketObjectCustomerEncryptionArgs(
        @Nullable Output<String> encryptionAlgorithm,
        @Nullable Output<String> keySha256) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.keySha256 = keySha256;
    }

    private BucketObjectCustomerEncryptionArgs() {
        this.encryptionAlgorithm = Codegen.empty();
        this.keySha256 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionAlgorithm;
        private @Nullable Output<String> keySha256;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.keySha256 = defaults.keySha256;
        }

        public Builder encryptionAlgorithm(@Nullable Output<String> encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public Builder encryptionAlgorithm(@Nullable String encryptionAlgorithm) {
            this.encryptionAlgorithm = Codegen.ofNullable(encryptionAlgorithm);
            return this;
        }
        public Builder keySha256(@Nullable Output<String> keySha256) {
            this.keySha256 = keySha256;
            return this;
        }
        public Builder keySha256(@Nullable String keySha256) {
            this.keySha256 = Codegen.ofNullable(keySha256);
            return this;
        }        public BucketObjectCustomerEncryptionArgs build() {
            return new BucketObjectCustomerEncryptionArgs(encryptionAlgorithm, keySha256);
        }
    }
}
