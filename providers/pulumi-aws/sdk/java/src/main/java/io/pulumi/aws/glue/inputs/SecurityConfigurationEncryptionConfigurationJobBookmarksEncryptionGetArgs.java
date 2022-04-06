// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs Empty = new SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs();

    /**
     * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
     * 
     */
    @Import(name="jobBookmarksEncryptionMode")
      private final @Nullable Output<String> jobBookmarksEncryptionMode;

    public Output<String> getJobBookmarksEncryptionMode() {
        return this.jobBookmarksEncryptionMode == null ? Output.empty() : this.jobBookmarksEncryptionMode;
    }

    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    public SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs(
        @Nullable Output<String> jobBookmarksEncryptionMode,
        @Nullable Output<String> kmsKeyArn) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    private SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs() {
        this.jobBookmarksEncryptionMode = Output.empty();
        this.kmsKeyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> jobBookmarksEncryptionMode;
        private @Nullable Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobBookmarksEncryptionMode = defaults.jobBookmarksEncryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder jobBookmarksEncryptionMode(@Nullable Output<String> jobBookmarksEncryptionMode) {
            this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
            return this;
        }
        public Builder jobBookmarksEncryptionMode(@Nullable String jobBookmarksEncryptionMode) {
            this.jobBookmarksEncryptionMode = Output.ofNullable(jobBookmarksEncryptionMode);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }        public SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs build() {
            return new SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs(jobBookmarksEncryptionMode, kmsKeyArn);
        }
    }
}