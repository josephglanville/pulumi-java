// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hyper-V Replica Azure specific input for creating a protection profile.
 * 
 */
public final class HyperVReplicaAzurePolicyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVReplicaAzurePolicyInputArgs Empty = new HyperVReplicaAzurePolicyInputArgs();

    /**
     * The interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     * 
     */
    @InputImport(name="applicationConsistentSnapshotFrequencyInHours")
      private final @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours;

    public Output<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Output.empty() : this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * The class type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     * 
     */
    @InputImport(name="onlineReplicationStartTime")
      private final @Nullable Output<String> onlineReplicationStartTime;

    public Output<String> getOnlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Output.empty() : this.onlineReplicationStartTime;
    }

    /**
     * The duration (in hours) to which point the recovery history needs to be maintained.
     * 
     */
    @InputImport(name="recoveryPointHistoryDuration")
      private final @Nullable Output<Integer> recoveryPointHistoryDuration;

    public Output<Integer> getRecoveryPointHistoryDuration() {
        return this.recoveryPointHistoryDuration == null ? Output.empty() : this.recoveryPointHistoryDuration;
    }

    /**
     * The replication interval.
     * 
     */
    @InputImport(name="replicationInterval")
      private final @Nullable Output<Integer> replicationInterval;

    public Output<Integer> getReplicationInterval() {
        return this.replicationInterval == null ? Output.empty() : this.replicationInterval;
    }

    /**
     * The list of storage accounts to which the VMs in the primary cloud can replicate to.
     * 
     */
    @InputImport(name="storageAccounts")
      private final @Nullable Output<List<String>> storageAccounts;

    public Output<List<String>> getStorageAccounts() {
        return this.storageAccounts == null ? Output.empty() : this.storageAccounts;
    }

    public HyperVReplicaAzurePolicyInputArgs(
        @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> onlineReplicationStartTime,
        @Nullable Output<Integer> recoveryPointHistoryDuration,
        @Nullable Output<Integer> replicationInterval,
        @Nullable Output<List<String>> storageAccounts) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.instanceType = instanceType;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
        this.replicationInterval = replicationInterval;
        this.storageAccounts = storageAccounts;
    }

    private HyperVReplicaAzurePolicyInputArgs() {
        this.applicationConsistentSnapshotFrequencyInHours = Output.empty();
        this.instanceType = Output.empty();
        this.onlineReplicationStartTime = Output.empty();
        this.recoveryPointHistoryDuration = Output.empty();
        this.replicationInterval = Output.empty();
        this.storageAccounts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzurePolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> onlineReplicationStartTime;
        private @Nullable Output<Integer> recoveryPointHistoryDuration;
        private @Nullable Output<Integer> replicationInterval;
        private @Nullable Output<List<String>> storageAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzurePolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.instanceType = defaults.instanceType;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPointHistoryDuration = defaults.recoveryPointHistoryDuration;
    	      this.replicationInterval = defaults.replicationInterval;
    	      this.storageAccounts = defaults.storageAccounts;
        }

        public Builder applicationConsistentSnapshotFrequencyInHours(@Nullable Output<Integer> applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder applicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = Output.ofNullable(applicationConsistentSnapshotFrequencyInHours);
            return this;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder onlineReplicationStartTime(@Nullable Output<String> onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder onlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = Output.ofNullable(onlineReplicationStartTime);
            return this;
        }

        public Builder recoveryPointHistoryDuration(@Nullable Output<Integer> recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
            return this;
        }

        public Builder recoveryPointHistoryDuration(@Nullable Integer recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = Output.ofNullable(recoveryPointHistoryDuration);
            return this;
        }

        public Builder replicationInterval(@Nullable Output<Integer> replicationInterval) {
            this.replicationInterval = replicationInterval;
            return this;
        }

        public Builder replicationInterval(@Nullable Integer replicationInterval) {
            this.replicationInterval = Output.ofNullable(replicationInterval);
            return this;
        }

        public Builder storageAccounts(@Nullable Output<List<String>> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder storageAccounts(@Nullable List<String> storageAccounts) {
            this.storageAccounts = Output.ofNullable(storageAccounts);
            return this;
        }
        public HyperVReplicaAzurePolicyInputArgs build() {
            return new HyperVReplicaAzurePolicyInputArgs(applicationConsistentSnapshotFrequencyInHours, instanceType, onlineReplicationStartTime, recoveryPointHistoryDuration, replicationInterval, storageAccounts);
        }
    }
}
