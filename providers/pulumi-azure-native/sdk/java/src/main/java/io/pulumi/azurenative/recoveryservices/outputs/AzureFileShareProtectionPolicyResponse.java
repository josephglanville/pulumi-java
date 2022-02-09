// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.LogSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.LongTermRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.LongTermSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SimpleRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SimpleSchedulePolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFileShareProtectionPolicyResponse {
    private final String backupManagementType;
    private final @Nullable Integer protectedItemsCount;
    private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
    private final @Nullable Object schedulePolicy;
    private final @Nullable String timeZone;
    private final @Nullable String workLoadType;

    @OutputCustomType.Constructor({"backupManagementType","protectedItemsCount","retentionPolicy","schedulePolicy","timeZone","workLoadType"})
    private AzureFileShareProtectionPolicyResponse(
        String backupManagementType,
        @Nullable Integer protectedItemsCount,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy,
        @Nullable String timeZone,
        @Nullable String workLoadType) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType);
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
        this.workLoadType = workLoadType;
    }

    public String getBackupManagementType() {
        return this.backupManagementType;
    }
    public Optional<Integer> getProtectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    public Optional<Object> getSchedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    public Optional<String> getWorkLoadType() {
        return Optional.ofNullable(this.workLoadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;
        private @Nullable String timeZone;
        private @Nullable String workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder setBackupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setSchedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setWorkLoadType(@Nullable String workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }

        public AzureFileShareProtectionPolicyResponse build() {
            return new AzureFileShareProtectionPolicyResponse(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone, workLoadType);
        }
    }
}
