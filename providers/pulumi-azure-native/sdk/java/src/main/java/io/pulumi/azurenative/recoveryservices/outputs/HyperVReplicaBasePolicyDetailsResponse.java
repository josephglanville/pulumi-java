// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HyperVReplicaBasePolicyDetailsResponse {
    private final @Nullable Integer allowedAuthenticationType;
    private final @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
    private final @Nullable String compression;
    private final @Nullable String initialReplicationMethod;
    private final String instanceType;
    private final @Nullable String offlineReplicationExportPath;
    private final @Nullable String offlineReplicationImportPath;
    private final @Nullable String onlineReplicationStartTime;
    private final @Nullable Integer recoveryPoints;
    private final @Nullable String replicaDeletionOption;
    private final @Nullable Integer replicationPort;

    @OutputCustomType.Constructor({"allowedAuthenticationType","applicationConsistentSnapshotFrequencyInHours","compression","initialReplicationMethod","instanceType","offlineReplicationExportPath","offlineReplicationImportPath","onlineReplicationStartTime","recoveryPoints","replicaDeletionOption","replicationPort"})
    private HyperVReplicaBasePolicyDetailsResponse(
        @Nullable Integer allowedAuthenticationType,
        @Nullable Integer applicationConsistentSnapshotFrequencyInHours,
        @Nullable String compression,
        @Nullable String initialReplicationMethod,
        String instanceType,
        @Nullable String offlineReplicationExportPath,
        @Nullable String offlineReplicationImportPath,
        @Nullable String onlineReplicationStartTime,
        @Nullable Integer recoveryPoints,
        @Nullable String replicaDeletionOption,
        @Nullable Integer replicationPort) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.compression = compression;
        this.initialReplicationMethod = initialReplicationMethod;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPoints = recoveryPoints;
        this.replicaDeletionOption = replicaDeletionOption;
        this.replicationPort = replicationPort;
    }

    public Optional<Integer> getAllowedAuthenticationType() {
        return Optional.ofNullable(this.allowedAuthenticationType);
    }
    public Optional<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return Optional.ofNullable(this.applicationConsistentSnapshotFrequencyInHours);
    }
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    public Optional<String> getInitialReplicationMethod() {
        return Optional.ofNullable(this.initialReplicationMethod);
    }
    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getOfflineReplicationExportPath() {
        return Optional.ofNullable(this.offlineReplicationExportPath);
    }
    public Optional<String> getOfflineReplicationImportPath() {
        return Optional.ofNullable(this.offlineReplicationImportPath);
    }
    public Optional<String> getOnlineReplicationStartTime() {
        return Optional.ofNullable(this.onlineReplicationStartTime);
    }
    public Optional<Integer> getRecoveryPoints() {
        return Optional.ofNullable(this.recoveryPoints);
    }
    public Optional<String> getReplicaDeletionOption() {
        return Optional.ofNullable(this.replicaDeletionOption);
    }
    public Optional<Integer> getReplicationPort() {
        return Optional.ofNullable(this.replicationPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allowedAuthenticationType;
        private @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
        private @Nullable String compression;
        private @Nullable String initialReplicationMethod;
        private String instanceType;
        private @Nullable String offlineReplicationExportPath;
        private @Nullable String offlineReplicationImportPath;
        private @Nullable String onlineReplicationStartTime;
        private @Nullable Integer recoveryPoints;
        private @Nullable String replicaDeletionOption;
        private @Nullable Integer replicationPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
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
    	      this.replicaDeletionOption = defaults.replicaDeletionOption;
    	      this.replicationPort = defaults.replicationPort;
        }

        public Builder setAllowedAuthenticationType(@Nullable Integer allowedAuthenticationType) {
            this.allowedAuthenticationType = allowedAuthenticationType;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setInitialReplicationMethod(@Nullable String initialReplicationMethod) {
            this.initialReplicationMethod = initialReplicationMethod;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setOfflineReplicationExportPath(@Nullable String offlineReplicationExportPath) {
            this.offlineReplicationExportPath = offlineReplicationExportPath;
            return this;
        }

        public Builder setOfflineReplicationImportPath(@Nullable String offlineReplicationImportPath) {
            this.offlineReplicationImportPath = offlineReplicationImportPath;
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setRecoveryPoints(@Nullable Integer recoveryPoints) {
            this.recoveryPoints = recoveryPoints;
            return this;
        }

        public Builder setReplicaDeletionOption(@Nullable String replicaDeletionOption) {
            this.replicaDeletionOption = replicaDeletionOption;
            return this;
        }

        public Builder setReplicationPort(@Nullable Integer replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }

        public HyperVReplicaBasePolicyDetailsResponse build() {
            return new HyperVReplicaBasePolicyDetailsResponse(allowedAuthenticationType, applicationConsistentSnapshotFrequencyInHours, compression, initialReplicationMethod, instanceType, offlineReplicationExportPath, offlineReplicationImportPath, onlineReplicationStartTime, recoveryPoints, replicaDeletionOption, replicationPort);
        }
    }
}
