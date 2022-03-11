// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure SQL workload-specific backup policy.
 * 
 */
public final class AzureSqlProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlProtectionPolicyArgs Empty = new AzureSqlProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureSql'.
     * 
     */
    @InputImport(name="backupManagementType", required=true)
      private final Output<String> backupManagementType;

    public Output<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @InputImport(name="protectedItemsCount")
      private final @Nullable Output<Integer> protectedItemsCount;

    public Output<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Output.empty() : this.protectedItemsCount;
    }

    /**
     * Retention policy details.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> getRetentionPolicy() {
        return this.retentionPolicy == null ? Output.empty() : this.retentionPolicy;
    }

    public AzureSqlProtectionPolicyArgs(
        Output<String> backupManagementType,
        @Nullable Output<Integer> protectedItemsCount,
        @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
    }

    private AzureSqlProtectionPolicyArgs() {
        this.backupManagementType = Output.empty();
        this.protectedItemsCount = Output.empty();
        this.retentionPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupManagementType;
        private @Nullable Output<Integer> protectedItemsCount;
        private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder backupManagementType(Output<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Output.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder protectedItemsCount(@Nullable Output<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Output.ofNullable(protectedItemsCount);
            return this;
        }

        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Output.ofNullable(retentionPolicy);
            return this;
        }
        public AzureSqlProtectionPolicyArgs build() {
            return new AzureSqlProtectionPolicyArgs(backupManagementType, protectedItemsCount, retentionPolicy);
        }
    }
}
