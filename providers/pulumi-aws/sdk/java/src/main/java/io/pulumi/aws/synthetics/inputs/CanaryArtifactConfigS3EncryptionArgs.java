// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryArtifactConfigS3EncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryArtifactConfigS3EncryptionArgs Empty = new CanaryArtifactConfigS3EncryptionArgs();

    /**
     * The encryption method to use for artifacts created by this canary. Valid values are: `SSE-S3` and `SSE-KMS`.
     * 
     */
    @Import(name="encryptionMode")
      private final @Nullable Output<String> encryptionMode;

    public Output<String> getEncryptionMode() {
        return this.encryptionMode == null ? Output.empty() : this.encryptionMode;
    }

    /**
     * The ARN of the customer-managed KMS key to use, if you specify `SSE-KMS` for `encryption_mode`.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    public CanaryArtifactConfigS3EncryptionArgs(
        @Nullable Output<String> encryptionMode,
        @Nullable Output<String> kmsKeyArn) {
        this.encryptionMode = encryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    private CanaryArtifactConfigS3EncryptionArgs() {
        this.encryptionMode = Output.empty();
        this.kmsKeyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArtifactConfigS3EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionMode;
        private @Nullable Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArtifactConfigS3EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionMode = defaults.encryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder encryptionMode(@Nullable Output<String> encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }
        public Builder encryptionMode(@Nullable String encryptionMode) {
            this.encryptionMode = Output.ofNullable(encryptionMode);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }        public CanaryArtifactConfigS3EncryptionArgs build() {
            return new CanaryArtifactConfigS3EncryptionArgs(encryptionMode, kmsKeyArn);
        }
    }
}
