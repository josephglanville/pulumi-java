// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.SettingsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SubProtectionPolicyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureVmWorkloadProtectionPolicyResponse {
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureWorkload'.
     * 
     */
    private final String backupManagementType;
    /**
     * Fix the policy inconsistency
     * 
     */
    private final @Nullable Boolean makePolicyConsistent;
    /**
     * Number of items associated with this policy.
     * 
     */
    private final @Nullable Integer protectedItemsCount;
    /**
     * Common settings for the backup management
     * 
     */
    private final @Nullable SettingsResponse settings;
    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    private final @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
    /**
     * Type of workload for the backup management
     * 
     */
    private final @Nullable String workLoadType;

    @CustomType.Constructor
    private AzureVmWorkloadProtectionPolicyResponse(
        @CustomType.Parameter("backupManagementType") String backupManagementType,
        @CustomType.Parameter("makePolicyConsistent") @Nullable Boolean makePolicyConsistent,
        @CustomType.Parameter("protectedItemsCount") @Nullable Integer protectedItemsCount,
        @CustomType.Parameter("settings") @Nullable SettingsResponse settings,
        @CustomType.Parameter("subProtectionPolicy") @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy,
        @CustomType.Parameter("workLoadType") @Nullable String workLoadType) {
        this.backupManagementType = backupManagementType;
        this.makePolicyConsistent = makePolicyConsistent;
        this.protectedItemsCount = protectedItemsCount;
        this.settings = settings;
        this.subProtectionPolicy = subProtectionPolicy;
        this.workLoadType = workLoadType;
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureWorkload'.
     * 
    */
    public String getBackupManagementType() {
        return this.backupManagementType;
    }
    /**
     * Fix the policy inconsistency
     * 
    */
    public Optional<Boolean> getMakePolicyConsistent() {
        return Optional.ofNullable(this.makePolicyConsistent);
    }
    /**
     * Number of items associated with this policy.
     * 
    */
    public Optional<Integer> getProtectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }
    /**
     * Common settings for the backup management
     * 
    */
    public Optional<SettingsResponse> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * List of sub-protection policies which includes schedule and retention
     * 
    */
    public List<SubProtectionPolicyResponse> getSubProtectionPolicy() {
        return this.subProtectionPolicy == null ? List.of() : this.subProtectionPolicy;
    }
    /**
     * Type of workload for the backup management
     * 
    */
    public Optional<String> getWorkLoadType() {
        return Optional.ofNullable(this.workLoadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Boolean makePolicyConsistent;
        private @Nullable Integer protectedItemsCount;
        private @Nullable SettingsResponse settings;
        private @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
        private @Nullable String workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.makePolicyConsistent = defaults.makePolicyConsistent;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.settings = defaults.settings;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder makePolicyConsistent(@Nullable Boolean makePolicyConsistent) {
            this.makePolicyConsistent = makePolicyConsistent;
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder settings(@Nullable SettingsResponse settings) {
            this.settings = settings;
            return this;
        }
        public Builder subProtectionPolicy(@Nullable List<SubProtectionPolicyResponse> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }
        public Builder subProtectionPolicy(SubProtectionPolicyResponse... subProtectionPolicy) {
            return subProtectionPolicy(List.of(subProtectionPolicy));
        }
        public Builder workLoadType(@Nullable String workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }        public AzureVmWorkloadProtectionPolicyResponse build() {
            return new AzureVmWorkloadProtectionPolicyResponse(backupManagementType, makePolicyConsistent, protectedItemsCount, settings, subProtectionPolicy, workLoadType);
        }
    }
}
