// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ClusterHealthPolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClusterUpgradeDeltaHealthPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the policy used when upgrading the cluster.
 * 
 */
public final class ClusterUpgradePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradePolicyArgs Empty = new ClusterUpgradePolicyArgs();

    /**
     * The cluster delta health policy used when upgrading the cluster.
     * 
     */
    @InputImport(name="deltaHealthPolicy")
      private final @Nullable Input<ClusterUpgradeDeltaHealthPolicyArgs> deltaHealthPolicy;

    public Input<ClusterUpgradeDeltaHealthPolicyArgs> getDeltaHealthPolicy() {
        return this.deltaHealthPolicy == null ? Input.empty() : this.deltaHealthPolicy;
    }

    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    @InputImport(name="forceRestart")
      private final @Nullable Input<Boolean> forceRestart;

    public Input<Boolean> getForceRestart() {
        return this.forceRestart == null ? Input.empty() : this.forceRestart;
    }

    /**
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="healthCheckRetryTimeout", required=true)
      private final Input<String> healthCheckRetryTimeout;

    public Input<String> getHealthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout;
    }

    /**
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="healthCheckStableDuration", required=true)
      private final Input<String> healthCheckStableDuration;

    public Input<String> getHealthCheckStableDuration() {
        return this.healthCheckStableDuration;
    }

    /**
     * The length of time to wait after completing an upgrade domain before performing health checks. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="healthCheckWaitDuration", required=true)
      private final Input<String> healthCheckWaitDuration;

    public Input<String> getHealthCheckWaitDuration() {
        return this.healthCheckWaitDuration;
    }

    /**
     * The cluster health policy used when upgrading the cluster.
     * 
     */
    @InputImport(name="healthPolicy", required=true)
      private final Input<ClusterHealthPolicyArgs> healthPolicy;

    public Input<ClusterHealthPolicyArgs> getHealthPolicy() {
        return this.healthPolicy;
    }

    /**
     * The amount of time each upgrade domain has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="upgradeDomainTimeout", required=true)
      private final Input<String> upgradeDomainTimeout;

    public Input<String> getUpgradeDomainTimeout() {
        return this.upgradeDomainTimeout;
    }

    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="upgradeReplicaSetCheckTimeout", required=true)
      private final Input<String> upgradeReplicaSetCheckTimeout;

    public Input<String> getUpgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout;
    }

    /**
     * The amount of time the overall upgrade has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    @InputImport(name="upgradeTimeout", required=true)
      private final Input<String> upgradeTimeout;

    public Input<String> getUpgradeTimeout() {
        return this.upgradeTimeout;
    }

    public ClusterUpgradePolicyArgs(
        @Nullable Input<ClusterUpgradeDeltaHealthPolicyArgs> deltaHealthPolicy,
        @Nullable Input<Boolean> forceRestart,
        Input<String> healthCheckRetryTimeout,
        Input<String> healthCheckStableDuration,
        Input<String> healthCheckWaitDuration,
        Input<ClusterHealthPolicyArgs> healthPolicy,
        Input<String> upgradeDomainTimeout,
        Input<String> upgradeReplicaSetCheckTimeout,
        Input<String> upgradeTimeout) {
        this.deltaHealthPolicy = deltaHealthPolicy;
        this.forceRestart = forceRestart;
        this.healthCheckRetryTimeout = Objects.requireNonNull(healthCheckRetryTimeout, "expected parameter 'healthCheckRetryTimeout' to be non-null");
        this.healthCheckStableDuration = Objects.requireNonNull(healthCheckStableDuration, "expected parameter 'healthCheckStableDuration' to be non-null");
        this.healthCheckWaitDuration = Objects.requireNonNull(healthCheckWaitDuration, "expected parameter 'healthCheckWaitDuration' to be non-null");
        this.healthPolicy = Objects.requireNonNull(healthPolicy, "expected parameter 'healthPolicy' to be non-null");
        this.upgradeDomainTimeout = Objects.requireNonNull(upgradeDomainTimeout, "expected parameter 'upgradeDomainTimeout' to be non-null");
        this.upgradeReplicaSetCheckTimeout = Objects.requireNonNull(upgradeReplicaSetCheckTimeout, "expected parameter 'upgradeReplicaSetCheckTimeout' to be non-null");
        this.upgradeTimeout = Objects.requireNonNull(upgradeTimeout, "expected parameter 'upgradeTimeout' to be non-null");
    }

    private ClusterUpgradePolicyArgs() {
        this.deltaHealthPolicy = Input.empty();
        this.forceRestart = Input.empty();
        this.healthCheckRetryTimeout = Input.empty();
        this.healthCheckStableDuration = Input.empty();
        this.healthCheckWaitDuration = Input.empty();
        this.healthPolicy = Input.empty();
        this.upgradeDomainTimeout = Input.empty();
        this.upgradeReplicaSetCheckTimeout = Input.empty();
        this.upgradeTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterUpgradeDeltaHealthPolicyArgs> deltaHealthPolicy;
        private @Nullable Input<Boolean> forceRestart;
        private Input<String> healthCheckRetryTimeout;
        private Input<String> healthCheckStableDuration;
        private Input<String> healthCheckWaitDuration;
        private Input<ClusterHealthPolicyArgs> healthPolicy;
        private Input<String> upgradeDomainTimeout;
        private Input<String> upgradeReplicaSetCheckTimeout;
        private Input<String> upgradeTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterUpgradePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaHealthPolicy = defaults.deltaHealthPolicy;
    	      this.forceRestart = defaults.forceRestart;
    	      this.healthCheckRetryTimeout = defaults.healthCheckRetryTimeout;
    	      this.healthCheckStableDuration = defaults.healthCheckStableDuration;
    	      this.healthCheckWaitDuration = defaults.healthCheckWaitDuration;
    	      this.healthPolicy = defaults.healthPolicy;
    	      this.upgradeDomainTimeout = defaults.upgradeDomainTimeout;
    	      this.upgradeReplicaSetCheckTimeout = defaults.upgradeReplicaSetCheckTimeout;
    	      this.upgradeTimeout = defaults.upgradeTimeout;
        }

        public Builder setDeltaHealthPolicy(@Nullable Input<ClusterUpgradeDeltaHealthPolicyArgs> deltaHealthPolicy) {
            this.deltaHealthPolicy = deltaHealthPolicy;
            return this;
        }

        public Builder setDeltaHealthPolicy(@Nullable ClusterUpgradeDeltaHealthPolicyArgs deltaHealthPolicy) {
            this.deltaHealthPolicy = Input.ofNullable(deltaHealthPolicy);
            return this;
        }

        public Builder setForceRestart(@Nullable Input<Boolean> forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }

        public Builder setForceRestart(@Nullable Boolean forceRestart) {
            this.forceRestart = Input.ofNullable(forceRestart);
            return this;
        }

        public Builder setHealthCheckRetryTimeout(Input<String> healthCheckRetryTimeout) {
            this.healthCheckRetryTimeout = Objects.requireNonNull(healthCheckRetryTimeout);
            return this;
        }

        public Builder setHealthCheckRetryTimeout(String healthCheckRetryTimeout) {
            this.healthCheckRetryTimeout = Input.of(Objects.requireNonNull(healthCheckRetryTimeout));
            return this;
        }

        public Builder setHealthCheckStableDuration(Input<String> healthCheckStableDuration) {
            this.healthCheckStableDuration = Objects.requireNonNull(healthCheckStableDuration);
            return this;
        }

        public Builder setHealthCheckStableDuration(String healthCheckStableDuration) {
            this.healthCheckStableDuration = Input.of(Objects.requireNonNull(healthCheckStableDuration));
            return this;
        }

        public Builder setHealthCheckWaitDuration(Input<String> healthCheckWaitDuration) {
            this.healthCheckWaitDuration = Objects.requireNonNull(healthCheckWaitDuration);
            return this;
        }

        public Builder setHealthCheckWaitDuration(String healthCheckWaitDuration) {
            this.healthCheckWaitDuration = Input.of(Objects.requireNonNull(healthCheckWaitDuration));
            return this;
        }

        public Builder setHealthPolicy(Input<ClusterHealthPolicyArgs> healthPolicy) {
            this.healthPolicy = Objects.requireNonNull(healthPolicy);
            return this;
        }

        public Builder setHealthPolicy(ClusterHealthPolicyArgs healthPolicy) {
            this.healthPolicy = Input.of(Objects.requireNonNull(healthPolicy));
            return this;
        }

        public Builder setUpgradeDomainTimeout(Input<String> upgradeDomainTimeout) {
            this.upgradeDomainTimeout = Objects.requireNonNull(upgradeDomainTimeout);
            return this;
        }

        public Builder setUpgradeDomainTimeout(String upgradeDomainTimeout) {
            this.upgradeDomainTimeout = Input.of(Objects.requireNonNull(upgradeDomainTimeout));
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(Input<String> upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = Objects.requireNonNull(upgradeReplicaSetCheckTimeout);
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(String upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = Input.of(Objects.requireNonNull(upgradeReplicaSetCheckTimeout));
            return this;
        }

        public Builder setUpgradeTimeout(Input<String> upgradeTimeout) {
            this.upgradeTimeout = Objects.requireNonNull(upgradeTimeout);
            return this;
        }

        public Builder setUpgradeTimeout(String upgradeTimeout) {
            this.upgradeTimeout = Input.of(Objects.requireNonNull(upgradeTimeout));
            return this;
        }
        public ClusterUpgradePolicyArgs build() {
            return new ClusterUpgradePolicyArgs(deltaHealthPolicy, forceRestart, healthCheckRetryTimeout, healthCheckStableDuration, healthCheckWaitDuration, healthPolicy, upgradeDomainTimeout, upgradeReplicaSetCheckTimeout, upgradeTimeout);
        }
    }
}
