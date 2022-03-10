// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
    /**
     * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
     * 
     */
    private final @Nullable String cloudwatchEncryptionMode;
    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    private final @Nullable String kmsKeyArn;

    @OutputCustomType.Constructor
    private SecurityConfigurationEncryptionConfigurationCloudwatchEncryption(
        @OutputCustomType.Parameter("cloudwatchEncryptionMode") @Nullable String cloudwatchEncryptionMode,
        @OutputCustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn) {
        this.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
     * 
    */
    public Optional<String> getCloudwatchEncryptionMode() {
        return Optional.ofNullable(this.cloudwatchEncryptionMode);
    }
    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudwatchEncryptionMode;
        private @Nullable String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryptionMode = defaults.cloudwatchEncryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setCloudwatchEncryptionMode(@Nullable String cloudwatchEncryptionMode) {
            this.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public SecurityConfigurationEncryptionConfigurationCloudwatchEncryption build() {
            return new SecurityConfigurationEncryptionConfigurationCloudwatchEncryption(cloudwatchEncryptionMode, kmsKeyArn);
        }
    }
}
