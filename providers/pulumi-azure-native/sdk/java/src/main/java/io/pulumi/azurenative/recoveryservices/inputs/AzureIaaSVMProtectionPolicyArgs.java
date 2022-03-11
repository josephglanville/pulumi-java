// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InstantRPAdditionalDetailsArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup policy.
 * 
 */
public final class AzureIaaSVMProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSVMProtectionPolicyArgs Empty = new AzureIaaSVMProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureIaasVM'.
     * 
     */
    @InputImport(name="backupManagementType", required=true)
      private final Output<String> backupManagementType;

    public Output<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    @InputImport(name="instantRPDetails")
      private final @Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails;

    public Output<InstantRPAdditionalDetailsArgs> getInstantRPDetails() {
        return this.instantRPDetails == null ? Output.empty() : this.instantRPDetails;
    }

    /**
     * Instant RP retention policy range in days
     * 
     */
    @InputImport(name="instantRpRetentionRangeInDays")
      private final @Nullable Output<Integer> instantRpRetentionRangeInDays;

    public Output<Integer> getInstantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays == null ? Output.empty() : this.instantRpRetentionRangeInDays;
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
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> getRetentionPolicy() {
        return this.retentionPolicy == null ? Output.empty() : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @InputImport(name="schedulePolicy")
      private final @Nullable Output<Object> schedulePolicy;

    public Output<Object> getSchedulePolicy() {
        return this.schedulePolicy == null ? Output.empty() : this.schedulePolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public AzureIaaSVMProtectionPolicyArgs(
        Output<String> backupManagementType,
        @Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails,
        @Nullable Output<Integer> instantRpRetentionRangeInDays,
        @Nullable Output<Integer> protectedItemsCount,
        @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy,
        @Nullable Output<Object> schedulePolicy,
        @Nullable Output<String> timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.instantRPDetails = instantRPDetails;
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
    }

    private AzureIaaSVMProtectionPolicyArgs() {
        this.backupManagementType = Output.empty();
        this.instantRPDetails = Output.empty();
        this.instantRpRetentionRangeInDays = Output.empty();
        this.protectedItemsCount = Output.empty();
        this.retentionPolicy = Output.empty();
        this.schedulePolicy = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupManagementType;
        private @Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails;
        private @Nullable Output<Integer> instantRpRetentionRangeInDays;
        private @Nullable Output<Integer> protectedItemsCount;
        private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;
        private @Nullable Output<Object> schedulePolicy;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.instantRPDetails = defaults.instantRPDetails;
    	      this.instantRpRetentionRangeInDays = defaults.instantRpRetentionRangeInDays;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder backupManagementType(Output<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Output.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder instantRPDetails(@Nullable Output<InstantRPAdditionalDetailsArgs> instantRPDetails) {
            this.instantRPDetails = instantRPDetails;
            return this;
        }

        public Builder instantRPDetails(@Nullable InstantRPAdditionalDetailsArgs instantRPDetails) {
            this.instantRPDetails = Output.ofNullable(instantRPDetails);
            return this;
        }

        public Builder instantRpRetentionRangeInDays(@Nullable Output<Integer> instantRpRetentionRangeInDays) {
            this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
            return this;
        }

        public Builder instantRpRetentionRangeInDays(@Nullable Integer instantRpRetentionRangeInDays) {
            this.instantRpRetentionRangeInDays = Output.ofNullable(instantRpRetentionRangeInDays);
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

        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = Output.ofNullable(schedulePolicy);
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public AzureIaaSVMProtectionPolicyArgs build() {
            return new AzureIaaSVMProtectionPolicyArgs(backupManagementType, instantRPDetails, instantRpRetentionRangeInDays, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone);
        }
    }
}
