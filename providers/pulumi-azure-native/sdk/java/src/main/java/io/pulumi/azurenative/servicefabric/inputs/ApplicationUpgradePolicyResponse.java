// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ArmApplicationHealthPolicyResponse;
import io.pulumi.azurenative.servicefabric.inputs.ArmRollingUpgradeMonitoringPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the policy for a monitored application upgrade.
 * 
 */
public final class ApplicationUpgradePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationUpgradePolicyResponse Empty = new ApplicationUpgradePolicyResponse();

    /**
     * Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    @InputImport(name="applicationHealthPolicy")
      private final @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy;

    public Optional<ArmApplicationHealthPolicyResponse> getApplicationHealthPolicy() {
        return this.applicationHealthPolicy == null ? Optional.empty() : Optional.ofNullable(this.applicationHealthPolicy);
    }

    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    @InputImport(name="forceRestart")
      private final @Nullable Boolean forceRestart;

    public Optional<Boolean> getForceRestart() {
        return this.forceRestart == null ? Optional.empty() : Optional.ofNullable(this.forceRestart);
    }

    /**
     * Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    @InputImport(name="recreateApplication")
      private final @Nullable Boolean recreateApplication;

    public Optional<Boolean> getRecreateApplication() {
        return this.recreateApplication == null ? Optional.empty() : Optional.ofNullable(this.recreateApplication);
    }

    /**
     * The policy used for monitoring the application upgrade
     * 
     */
    @InputImport(name="rollingUpgradeMonitoringPolicy")
      private final @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy;

    public Optional<ArmRollingUpgradeMonitoringPolicyResponse> getRollingUpgradeMonitoringPolicy() {
        return this.rollingUpgradeMonitoringPolicy == null ? Optional.empty() : Optional.ofNullable(this.rollingUpgradeMonitoringPolicy);
    }

    /**
     * The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    @InputImport(name="upgradeMode")
      private final @Nullable String upgradeMode;

    public Optional<String> getUpgradeMode() {
        return this.upgradeMode == null ? Optional.empty() : Optional.ofNullable(this.upgradeMode);
    }

    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    @InputImport(name="upgradeReplicaSetCheckTimeout")
      private final @Nullable String upgradeReplicaSetCheckTimeout;

    public Optional<String> getUpgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout == null ? Optional.empty() : Optional.ofNullable(this.upgradeReplicaSetCheckTimeout);
    }

    public ApplicationUpgradePolicyResponse(
        @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy,
        @Nullable Boolean forceRestart,
        @Nullable Boolean recreateApplication,
        @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy,
        @Nullable String upgradeMode,
        @Nullable String upgradeReplicaSetCheckTimeout) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        this.forceRestart = forceRestart;
        this.recreateApplication = recreateApplication;
        this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
        this.upgradeMode = upgradeMode;
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
    }

    private ApplicationUpgradePolicyResponse() {
        this.applicationHealthPolicy = null;
        this.forceRestart = null;
        this.recreateApplication = null;
        this.rollingUpgradeMonitoringPolicy = null;
        this.upgradeMode = null;
        this.upgradeReplicaSetCheckTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy;
        private @Nullable Boolean forceRestart;
        private @Nullable Boolean recreateApplication;
        private @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy;
        private @Nullable String upgradeMode;
        private @Nullable String upgradeReplicaSetCheckTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicy = defaults.applicationHealthPolicy;
    	      this.forceRestart = defaults.forceRestart;
    	      this.recreateApplication = defaults.recreateApplication;
    	      this.rollingUpgradeMonitoringPolicy = defaults.rollingUpgradeMonitoringPolicy;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.upgradeReplicaSetCheckTimeout = defaults.upgradeReplicaSetCheckTimeout;
        }

        public Builder setApplicationHealthPolicy(@Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy) {
            this.applicationHealthPolicy = applicationHealthPolicy;
            return this;
        }

        public Builder setForceRestart(@Nullable Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }

        public Builder setRecreateApplication(@Nullable Boolean recreateApplication) {
            this.recreateApplication = recreateApplication;
            return this;
        }

        public Builder setRollingUpgradeMonitoringPolicy(@Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy) {
            this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
            return this;
        }

        public Builder setUpgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(@Nullable String upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
            return this;
        }
        public ApplicationUpgradePolicyResponse build() {
            return new ApplicationUpgradePolicyResponse(applicationHealthPolicy, forceRestart, recreateApplication, rollingUpgradeMonitoringPolicy, upgradeMode, upgradeReplicaSetCheckTimeout);
        }
    }
}
