// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HyperVReplicaPolicyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVReplicaPolicyInputArgs Empty = new HyperVReplicaPolicyInputArgs();

    @InputImport(name="allowedAuthenticationType")
    private final @Nullable Input<Integer> allowedAuthenticationType;

    public Input<Integer> getAllowedAuthenticationType() {
        return this.allowedAuthenticationType == null ? Input.empty() : this.allowedAuthenticationType;
    }

    @InputImport(name="applicationConsistentSnapshotFrequencyInHours")
    private final @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours;

    public Input<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Input.empty() : this.applicationConsistentSnapshotFrequencyInHours;
    }

    @InputImport(name="compression")
    private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    @InputImport(name="initialReplicationMethod")
    private final @Nullable Input<String> initialReplicationMethod;

    public Input<String> getInitialReplicationMethod() {
        return this.initialReplicationMethod == null ? Input.empty() : this.initialReplicationMethod;
    }

    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="offlineReplicationExportPath")
    private final @Nullable Input<String> offlineReplicationExportPath;

    public Input<String> getOfflineReplicationExportPath() {
        return this.offlineReplicationExportPath == null ? Input.empty() : this.offlineReplicationExportPath;
    }

    @InputImport(name="offlineReplicationImportPath")
    private final @Nullable Input<String> offlineReplicationImportPath;

    public Input<String> getOfflineReplicationImportPath() {
        return this.offlineReplicationImportPath == null ? Input.empty() : this.offlineReplicationImportPath;
    }

    @InputImport(name="onlineReplicationStartTime")
    private final @Nullable Input<String> onlineReplicationStartTime;

    public Input<String> getOnlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Input.empty() : this.onlineReplicationStartTime;
    }

    @InputImport(name="recoveryPoints")
    private final @Nullable Input<Integer> recoveryPoints;

    public Input<Integer> getRecoveryPoints() {
        return this.recoveryPoints == null ? Input.empty() : this.recoveryPoints;
    }

    @InputImport(name="replicaDeletion")
    private final @Nullable Input<String> replicaDeletion;

    public Input<String> getReplicaDeletion() {
        return this.replicaDeletion == null ? Input.empty() : this.replicaDeletion;
    }

    @InputImport(name="replicationPort")
    private final @Nullable Input<Integer> replicationPort;

    public Input<Integer> getReplicationPort() {
        return this.replicationPort == null ? Input.empty() : this.replicationPort;
    }

    public HyperVReplicaPolicyInputArgs(
        @Nullable Input<Integer> allowedAuthenticationType,
        @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours,
        @Nullable Input<String> compression,
        @Nullable Input<String> initialReplicationMethod,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> offlineReplicationExportPath,
        @Nullable Input<String> offlineReplicationImportPath,
        @Nullable Input<String> onlineReplicationStartTime,
        @Nullable Input<Integer> recoveryPoints,
        @Nullable Input<String> replicaDeletion,
        @Nullable Input<Integer> replicationPort) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.compression = compression;
        this.initialReplicationMethod = initialReplicationMethod;
        this.instanceType = instanceType;
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPoints = recoveryPoints;
        this.replicaDeletion = replicaDeletion;
        this.replicationPort = replicationPort;
    }

    private HyperVReplicaPolicyInputArgs() {
        this.allowedAuthenticationType = Input.empty();
        this.applicationConsistentSnapshotFrequencyInHours = Input.empty();
        this.compression = Input.empty();
        this.initialReplicationMethod = Input.empty();
        this.instanceType = Input.empty();
        this.offlineReplicationExportPath = Input.empty();
        this.offlineReplicationImportPath = Input.empty();
        this.onlineReplicationStartTime = Input.empty();
        this.recoveryPoints = Input.empty();
        this.replicaDeletion = Input.empty();
        this.replicationPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaPolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> allowedAuthenticationType;
        private @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours;
        private @Nullable Input<String> compression;
        private @Nullable Input<String> initialReplicationMethod;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> offlineReplicationExportPath;
        private @Nullable Input<String> offlineReplicationImportPath;
        private @Nullable Input<String> onlineReplicationStartTime;
        private @Nullable Input<Integer> recoveryPoints;
        private @Nullable Input<String> replicaDeletion;
        private @Nullable Input<Integer> replicationPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaPolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAuthenticationType = defaults.allowedAuthenticationType;
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.compression = defaults.compression;
    	      this.initialReplicationMethod = defaults.initialReplicationMethod;
    	      this.instanceType = defaults.instanceType;
    	      this.offlineReplicationExportPath = defaults.offlineReplicationExportPath;
    	      this.offlineReplicationImportPath = defaults.offlineReplicationImportPath;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPoints = defaults.recoveryPoints;
    	      this.replicaDeletion = defaults.replicaDeletion;
    	      this.replicationPort = defaults.replicationPort;
        }

        public Builder setAllowedAuthenticationType(@Nullable Input<Integer> allowedAuthenticationType) {
            this.allowedAuthenticationType = allowedAuthenticationType;
            return this;
        }

        public Builder setAllowedAuthenticationType(@Nullable Integer allowedAuthenticationType) {
            this.allowedAuthenticationType = Input.ofNullable(allowedAuthenticationType);
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = Input.ofNullable(applicationConsistentSnapshotFrequencyInHours);
            return this;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setInitialReplicationMethod(@Nullable Input<String> initialReplicationMethod) {
            this.initialReplicationMethod = initialReplicationMethod;
            return this;
        }

        public Builder setInitialReplicationMethod(@Nullable String initialReplicationMethod) {
            this.initialReplicationMethod = Input.ofNullable(initialReplicationMethod);
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

        public Builder setOfflineReplicationExportPath(@Nullable Input<String> offlineReplicationExportPath) {
            this.offlineReplicationExportPath = offlineReplicationExportPath;
            return this;
        }

        public Builder setOfflineReplicationExportPath(@Nullable String offlineReplicationExportPath) {
            this.offlineReplicationExportPath = Input.ofNullable(offlineReplicationExportPath);
            return this;
        }

        public Builder setOfflineReplicationImportPath(@Nullable Input<String> offlineReplicationImportPath) {
            this.offlineReplicationImportPath = offlineReplicationImportPath;
            return this;
        }

        public Builder setOfflineReplicationImportPath(@Nullable String offlineReplicationImportPath) {
            this.offlineReplicationImportPath = Input.ofNullable(offlineReplicationImportPath);
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable Input<String> onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = Input.ofNullable(onlineReplicationStartTime);
            return this;
        }

        public Builder setRecoveryPoints(@Nullable Input<Integer> recoveryPoints) {
            this.recoveryPoints = recoveryPoints;
            return this;
        }

        public Builder setRecoveryPoints(@Nullable Integer recoveryPoints) {
            this.recoveryPoints = Input.ofNullable(recoveryPoints);
            return this;
        }

        public Builder setReplicaDeletion(@Nullable Input<String> replicaDeletion) {
            this.replicaDeletion = replicaDeletion;
            return this;
        }

        public Builder setReplicaDeletion(@Nullable String replicaDeletion) {
            this.replicaDeletion = Input.ofNullable(replicaDeletion);
            return this;
        }

        public Builder setReplicationPort(@Nullable Input<Integer> replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }

        public Builder setReplicationPort(@Nullable Integer replicationPort) {
            this.replicationPort = Input.ofNullable(replicationPort);
            return this;
        }

        public HyperVReplicaPolicyInputArgs build() {
            return new HyperVReplicaPolicyInputArgs(allowedAuthenticationType, applicationConsistentSnapshotFrequencyInHours, compression, initialReplicationMethod, instanceType, offlineReplicationExportPath, offlineReplicationImportPath, onlineReplicationStartTime, recoveryPoints, replicaDeletion, replicationPort);
        }
    }
}