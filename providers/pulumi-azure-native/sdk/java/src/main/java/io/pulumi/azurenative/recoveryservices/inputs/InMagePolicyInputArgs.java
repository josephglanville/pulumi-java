// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.SetMultiVmSyncStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMWare Azure specific protection profile Input.
 * 
 */
public final class InMagePolicyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMagePolicyInputArgs Empty = new InMagePolicyInputArgs();

    /**
     * The app consistent snapshot frequency (in minutes).
     * 
     */
    @InputImport(name="appConsistentFrequencyInMinutes")
      private final @Nullable Input<Integer> appConsistentFrequencyInMinutes;

    public Input<Integer> getAppConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Input.empty() : this.appConsistentFrequencyInMinutes;
    }

    /**
     * The class type.
     * Expected value is 'InMage'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'.
     * 
     */
    @InputImport(name="multiVmSyncStatus", required=true)
      private final Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;

    public Input<Either<String,SetMultiVmSyncStatus>> getMultiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @InputImport(name="recoveryPointHistory")
      private final @Nullable Input<Integer> recoveryPointHistory;

    public Input<Integer> getRecoveryPointHistory() {
        return this.recoveryPointHistory == null ? Input.empty() : this.recoveryPointHistory;
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @InputImport(name="recoveryPointThresholdInMinutes")
      private final @Nullable Input<Integer> recoveryPointThresholdInMinutes;

    public Input<Integer> getRecoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes == null ? Input.empty() : this.recoveryPointThresholdInMinutes;
    }

    public InMagePolicyInputArgs(
        @Nullable Input<Integer> appConsistentFrequencyInMinutes,
        @Nullable Input<String> instanceType,
        Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus,
        @Nullable Input<Integer> recoveryPointHistory,
        @Nullable Input<Integer> recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus, "expected parameter 'multiVmSyncStatus' to be non-null");
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    private InMagePolicyInputArgs() {
        this.appConsistentFrequencyInMinutes = Input.empty();
        this.instanceType = Input.empty();
        this.multiVmSyncStatus = Input.empty();
        this.recoveryPointHistory = Input.empty();
        this.recoveryPointThresholdInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMagePolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> appConsistentFrequencyInMinutes;
        private @Nullable Input<String> instanceType;
        private Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;
        private @Nullable Input<Integer> recoveryPointHistory;
        private @Nullable Input<Integer> recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMagePolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Input<Integer> appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Input.ofNullable(appConsistentFrequencyInMinutes);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setMultiVmSyncStatus(Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus) {
            this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus);
            return this;
        }

        public Builder setMultiVmSyncStatus(Either<String,SetMultiVmSyncStatus> multiVmSyncStatus) {
            this.multiVmSyncStatus = Input.of(Objects.requireNonNull(multiVmSyncStatus));
            return this;
        }

        public Builder setRecoveryPointHistory(@Nullable Input<Integer> recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder setRecoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = Input.ofNullable(recoveryPointHistory);
            return this;
        }

        public Builder setRecoveryPointThresholdInMinutes(@Nullable Input<Integer> recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }

        public Builder setRecoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = Input.ofNullable(recoveryPointThresholdInMinutes);
            return this;
        }
        public InMagePolicyInputArgs build() {
            return new InMagePolicyInputArgs(appConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
