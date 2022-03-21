// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotSourceDiskEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotSourceDiskEncryptionKeyArgs Empty = new SnapshotSourceDiskEncryptionKeyArgs();

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    @Import(name="kmsKeyServiceAccount")
      private final @Nullable Output<String> kmsKeyServiceAccount;

    public Output<String> getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount == null ? Output.empty() : this.kmsKeyServiceAccount;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="rawKey")
      private final @Nullable Output<String> rawKey;

    public Output<String> getRawKey() {
        return this.rawKey == null ? Output.empty() : this.rawKey;
    }

    public SnapshotSourceDiskEncryptionKeyArgs(
        @Nullable Output<String> kmsKeyServiceAccount,
        @Nullable Output<String> rawKey) {
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
    }

    private SnapshotSourceDiskEncryptionKeyArgs() {
        this.kmsKeyServiceAccount = Output.empty();
        this.rawKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSourceDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyServiceAccount;
        private @Nullable Output<String> rawKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSourceDiskEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
        }

        public Builder kmsKeyServiceAccount(@Nullable Output<String> kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }
        public Builder kmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Output.ofNullable(kmsKeyServiceAccount);
            return this;
        }
        public Builder rawKey(@Nullable Output<String> rawKey) {
            this.rawKey = rawKey;
            return this;
        }
        public Builder rawKey(@Nullable String rawKey) {
            this.rawKey = Output.ofNullable(rawKey);
            return this;
        }        public SnapshotSourceDiskEncryptionKeyArgs build() {
            return new SnapshotSourceDiskEncryptionKeyArgs(kmsKeyServiceAccount, rawKey);
        }
    }
}
