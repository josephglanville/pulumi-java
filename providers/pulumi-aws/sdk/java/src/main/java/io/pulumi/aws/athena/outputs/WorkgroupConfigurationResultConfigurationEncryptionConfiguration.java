// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
    /**
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
     * 
     */
    private final @Nullable String encryptionOption;
    /**
     * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String kmsKeyArn;

    @OutputCustomType.Constructor
    private WorkgroupConfigurationResultConfigurationEncryptionConfiguration(
        @OutputCustomType.Parameter("encryptionOption") @Nullable String encryptionOption,
        @OutputCustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn) {
        this.encryptionOption = encryptionOption;
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
     * 
    */
    public Optional<String> getEncryptionOption() {
        return Optional.ofNullable(this.encryptionOption);
    }
    /**
     * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationResultConfigurationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionOption;
        private @Nullable String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationResultConfigurationEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setEncryptionOption(@Nullable String encryptionOption) {
            this.encryptionOption = encryptionOption;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public WorkgroupConfigurationResultConfigurationEncryptionConfiguration build() {
            return new WorkgroupConfigurationResultConfigurationEncryptionConfiguration(encryptionOption, kmsKeyArn);
        }
    }
}
