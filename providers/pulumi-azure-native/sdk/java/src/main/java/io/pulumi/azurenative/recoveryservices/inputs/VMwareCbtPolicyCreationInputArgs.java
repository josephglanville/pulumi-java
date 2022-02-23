// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMware Cbt policy creation input.
 * 
 */
public final class VMwareCbtPolicyCreationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final VMwareCbtPolicyCreationInputArgs Empty = new VMwareCbtPolicyCreationInputArgs();

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
     * The crash consistent snapshot frequency (in minutes).
     * 
     */
    @InputImport(name="crashConsistentFrequencyInMinutes")
      private final @Nullable Input<Integer> crashConsistentFrequencyInMinutes;

    public Input<Integer> getCrashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes == null ? Input.empty() : this.crashConsistentFrequencyInMinutes;
    }

    /**
     * The class type.
     * Expected value is 'VMwareCbt'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @InputImport(name="recoveryPointHistoryInMinutes")
      private final @Nullable Input<Integer> recoveryPointHistoryInMinutes;

    public Input<Integer> getRecoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes == null ? Input.empty() : this.recoveryPointHistoryInMinutes;
    }

    public VMwareCbtPolicyCreationInputArgs(
        @Nullable Input<Integer> appConsistentFrequencyInMinutes,
        @Nullable Input<Integer> crashConsistentFrequencyInMinutes,
        @Nullable Input<String> instanceType,
        @Nullable Input<Integer> recoveryPointHistoryInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
    }

    private VMwareCbtPolicyCreationInputArgs() {
        this.appConsistentFrequencyInMinutes = Input.empty();
        this.crashConsistentFrequencyInMinutes = Input.empty();
        this.instanceType = Input.empty();
        this.recoveryPointHistoryInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtPolicyCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> appConsistentFrequencyInMinutes;
        private @Nullable Input<Integer> crashConsistentFrequencyInMinutes;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<Integer> recoveryPointHistoryInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtPolicyCreationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.recoveryPointHistoryInMinutes = defaults.recoveryPointHistoryInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Input<Integer> appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Input.ofNullable(appConsistentFrequencyInMinutes);
            return this;
        }

        public Builder setCrashConsistentFrequencyInMinutes(@Nullable Input<Integer> crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setCrashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = Input.ofNullable(crashConsistentFrequencyInMinutes);
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

        public Builder setRecoveryPointHistoryInMinutes(@Nullable Input<Integer> recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
            return this;
        }

        public Builder setRecoveryPointHistoryInMinutes(@Nullable Integer recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = Input.ofNullable(recoveryPointHistoryInMinutes);
            return this;
        }
        public VMwareCbtPolicyCreationInputArgs build() {
            return new VMwareCbtPolicyCreationInputArgs(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, recoveryPointHistoryInMinutes);
        }
    }
}
