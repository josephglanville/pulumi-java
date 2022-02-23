// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
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
      private final Input<String> backupManagementType;

    public Input<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @InputImport(name="protectedItemsCount")
      private final @Nullable Input<Integer> protectedItemsCount;

    public Input<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Input.empty() : this.protectedItemsCount;
    }

    /**
     * Retention policy details.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    public AzureSqlProtectionPolicyArgs(
        Input<String> backupManagementType,
        @Nullable Input<Integer> protectedItemsCount,
        @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
    }

    private AzureSqlProtectionPolicyArgs() {
        this.backupManagementType = Input.empty();
        this.protectedItemsCount = Input.empty();
        this.retentionPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupManagementType;
        private @Nullable Input<Integer> protectedItemsCount;
        private @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder setBackupManagementType(Input<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder setBackupManagementType(String backupManagementType) {
            this.backupManagementType = Input.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Input<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Input.ofNullable(protectedItemsCount);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }
        public AzureSqlProtectionPolicyArgs build() {
            return new AzureSqlProtectionPolicyArgs(backupManagementType, protectedItemsCount, retentionPolicy);
        }
    }
}
