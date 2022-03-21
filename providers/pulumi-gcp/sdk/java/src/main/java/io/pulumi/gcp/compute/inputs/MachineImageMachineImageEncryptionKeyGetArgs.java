// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageMachineImageEncryptionKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageMachineImageEncryptionKeyGetArgs Empty = new MachineImageMachineImageEncryptionKeyGetArgs();

    /**
     * The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

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
     * 
     */
    @Import(name="rawKey")
      private final @Nullable Output<String> rawKey;

    public Output<String> getRawKey() {
        return this.rawKey == null ? Output.empty() : this.rawKey;
    }

    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the
     * customer-supplied encryption key that protects this resource.
     * 
     */
    @Import(name="sha256")
      private final @Nullable Output<String> sha256;

    public Output<String> getSha256() {
        return this.sha256 == null ? Output.empty() : this.sha256;
    }

    public MachineImageMachineImageEncryptionKeyGetArgs(
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<String> kmsKeyServiceAccount,
        @Nullable Output<String> rawKey,
        @Nullable Output<String> sha256) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    private MachineImageMachineImageEncryptionKeyGetArgs() {
        this.kmsKeyName = Output.empty();
        this.kmsKeyServiceAccount = Output.empty();
        this.rawKey = Output.empty();
        this.sha256 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageMachineImageEncryptionKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<String> kmsKeyServiceAccount;
        private @Nullable Output<String> rawKey;
        private @Nullable Output<String> sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageMachineImageEncryptionKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
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
        }
        public Builder sha256(@Nullable Output<String> sha256) {
            this.sha256 = sha256;
            return this;
        }
        public Builder sha256(@Nullable String sha256) {
            this.sha256 = Output.ofNullable(sha256);
            return this;
        }        public MachineImageMachineImageEncryptionKeyGetArgs build() {
            return new MachineImageMachineImageEncryptionKeyGetArgs(kmsKeyName, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}
