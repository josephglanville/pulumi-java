// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MobilityServiceUpdateResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProcessServerResponse {
    private final @Nullable String agentExpiryDate;
    private final @Nullable String agentVersion;
    private final @Nullable VersionDetailsResponse agentVersionDetails;
    private final @Nullable Double availableMemoryInBytes;
    private final @Nullable Double availableSpaceInBytes;
    private final @Nullable String cpuLoad;
    private final @Nullable String cpuLoadStatus;
    private final @Nullable String friendlyName;
    private final String health;
    private final @Nullable List<HealthErrorResponse> healthErrors;
    private final @Nullable String hostId;
    private final @Nullable String id;
    private final @Nullable String ipAddress;
    private final @Nullable String lastHeartbeat;
    private final @Nullable String machineCount;
    private final String marsCommunicationStatus;
    private final String marsRegistrationStatus;
    private final @Nullable String memoryUsageStatus;
    private final @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
    private final @Nullable String osType;
    private final @Nullable String osVersion;
    private final @Nullable String psServiceStatus;
    private final String psStatsRefreshTime;
    private final @Nullable String replicationPairCount;
    private final @Nullable String spaceUsageStatus;
    private final @Nullable String sslCertExpiryDate;
    private final @Nullable Integer sslCertExpiryRemainingDays;
    private final @Nullable String systemLoad;
    private final @Nullable String systemLoadStatus;
    private final Double throughputInBytes;
    private final Double throughputInMBps;
    private final String throughputStatus;
    private final Double throughputUploadPendingDataInBytes;
    private final @Nullable Double totalMemoryInBytes;
    private final @Nullable Double totalSpaceInBytes;
    private final @Nullable String versionStatus;

    @OutputCustomType.Constructor({"agentExpiryDate","agentVersion","agentVersionDetails","availableMemoryInBytes","availableSpaceInBytes","cpuLoad","cpuLoadStatus","friendlyName","health","healthErrors","hostId","id","ipAddress","lastHeartbeat","machineCount","marsCommunicationStatus","marsRegistrationStatus","memoryUsageStatus","mobilityServiceUpdates","osType","osVersion","psServiceStatus","psStatsRefreshTime","replicationPairCount","spaceUsageStatus","sslCertExpiryDate","sslCertExpiryRemainingDays","systemLoad","systemLoadStatus","throughputInBytes","throughputInMBps","throughputStatus","throughputUploadPendingDataInBytes","totalMemoryInBytes","totalSpaceInBytes","versionStatus"})
    private ProcessServerResponse(
        @Nullable String agentExpiryDate,
        @Nullable String agentVersion,
        @Nullable VersionDetailsResponse agentVersionDetails,
        @Nullable Double availableMemoryInBytes,
        @Nullable Double availableSpaceInBytes,
        @Nullable String cpuLoad,
        @Nullable String cpuLoadStatus,
        @Nullable String friendlyName,
        String health,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String hostId,
        @Nullable String id,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable String machineCount,
        String marsCommunicationStatus,
        String marsRegistrationStatus,
        @Nullable String memoryUsageStatus,
        @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates,
        @Nullable String osType,
        @Nullable String osVersion,
        @Nullable String psServiceStatus,
        String psStatsRefreshTime,
        @Nullable String replicationPairCount,
        @Nullable String spaceUsageStatus,
        @Nullable String sslCertExpiryDate,
        @Nullable Integer sslCertExpiryRemainingDays,
        @Nullable String systemLoad,
        @Nullable String systemLoadStatus,
        Double throughputInBytes,
        Double throughputInMBps,
        String throughputStatus,
        Double throughputUploadPendingDataInBytes,
        @Nullable Double totalMemoryInBytes,
        @Nullable Double totalSpaceInBytes,
        @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.friendlyName = friendlyName;
        this.health = Objects.requireNonNull(health);
        this.healthErrors = healthErrors;
        this.hostId = hostId;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.machineCount = machineCount;
        this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
        this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
        this.memoryUsageStatus = memoryUsageStatus;
        this.mobilityServiceUpdates = mobilityServiceUpdates;
        this.osType = osType;
        this.osVersion = osVersion;
        this.psServiceStatus = psServiceStatus;
        this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
        this.replicationPairCount = replicationPairCount;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
        this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
        this.throughputStatus = Objects.requireNonNull(throughputStatus);
        this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
    }

    public Optional<String> getAgentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }
    public Optional<Double> getAvailableMemoryInBytes() {
        return Optional.ofNullable(this.availableMemoryInBytes);
    }
    public Optional<Double> getAvailableSpaceInBytes() {
        return Optional.ofNullable(this.availableSpaceInBytes);
    }
    public Optional<String> getCpuLoad() {
        return Optional.ofNullable(this.cpuLoad);
    }
    public Optional<String> getCpuLoadStatus() {
        return Optional.ofNullable(this.cpuLoadStatus);
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public String getHealth() {
        return this.health;
    }
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    public Optional<String> getHostId() {
        return Optional.ofNullable(this.hostId);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    public Optional<String> getMachineCount() {
        return Optional.ofNullable(this.machineCount);
    }
    public String getMarsCommunicationStatus() {
        return this.marsCommunicationStatus;
    }
    public String getMarsRegistrationStatus() {
        return this.marsRegistrationStatus;
    }
    public Optional<String> getMemoryUsageStatus() {
        return Optional.ofNullable(this.memoryUsageStatus);
    }
    public List<MobilityServiceUpdateResponse> getMobilityServiceUpdates() {
        return this.mobilityServiceUpdates == null ? List.of() : this.mobilityServiceUpdates;
    }
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    public Optional<String> getPsServiceStatus() {
        return Optional.ofNullable(this.psServiceStatus);
    }
    public String getPsStatsRefreshTime() {
        return this.psStatsRefreshTime;
    }
    public Optional<String> getReplicationPairCount() {
        return Optional.ofNullable(this.replicationPairCount);
    }
    public Optional<String> getSpaceUsageStatus() {
        return Optional.ofNullable(this.spaceUsageStatus);
    }
    public Optional<String> getSslCertExpiryDate() {
        return Optional.ofNullable(this.sslCertExpiryDate);
    }
    public Optional<Integer> getSslCertExpiryRemainingDays() {
        return Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }
    public Optional<String> getSystemLoad() {
        return Optional.ofNullable(this.systemLoad);
    }
    public Optional<String> getSystemLoadStatus() {
        return Optional.ofNullable(this.systemLoadStatus);
    }
    public Double getThroughputInBytes() {
        return this.throughputInBytes;
    }
    public Double getThroughputInMBps() {
        return this.throughputInMBps;
    }
    public String getThroughputStatus() {
        return this.throughputStatus;
    }
    public Double getThroughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }
    public Optional<Double> getTotalMemoryInBytes() {
        return Optional.ofNullable(this.totalMemoryInBytes);
    }
    public Optional<Double> getTotalSpaceInBytes() {
        return Optional.ofNullable(this.totalSpaceInBytes);
    }
    public Optional<String> getVersionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String friendlyName;
        private String health;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String hostId;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String machineCount;
        private String marsCommunicationStatus;
        private String marsRegistrationStatus;
        private @Nullable String memoryUsageStatus;
        private @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable String psServiceStatus;
        private String psStatsRefreshTime;
        private @Nullable String replicationPairCount;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private Double throughputInBytes;
        private Double throughputInMBps;
        private String throughputStatus;
        private Double throughputUploadPendingDataInBytes;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.friendlyName = defaults.friendlyName;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.hostId = defaults.hostId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.machineCount = defaults.machineCount;
    	      this.marsCommunicationStatus = defaults.marsCommunicationStatus;
    	      this.marsRegistrationStatus = defaults.marsRegistrationStatus;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.mobilityServiceUpdates = defaults.mobilityServiceUpdates;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.psServiceStatus = defaults.psServiceStatus;
    	      this.psStatsRefreshTime = defaults.psStatsRefreshTime;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputInMBps = defaults.throughputInMBps;
    	      this.throughputStatus = defaults.throughputStatus;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder setAgentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setAgentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder setAvailableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder setAvailableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder setCpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }

        public Builder setCpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder setMachineCount(@Nullable String machineCount) {
            this.machineCount = machineCount;
            return this;
        }

        public Builder setMarsCommunicationStatus(String marsCommunicationStatus) {
            this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
            return this;
        }

        public Builder setMarsRegistrationStatus(String marsRegistrationStatus) {
            this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
            return this;
        }

        public Builder setMemoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder setMobilityServiceUpdates(@Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates) {
            this.mobilityServiceUpdates = mobilityServiceUpdates;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder setPsServiceStatus(@Nullable String psServiceStatus) {
            this.psServiceStatus = psServiceStatus;
            return this;
        }

        public Builder setPsStatsRefreshTime(String psStatsRefreshTime) {
            this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
            return this;
        }

        public Builder setReplicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder setSpaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder setSslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder setSslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder setSystemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }

        public Builder setSystemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder setThroughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }

        public Builder setThroughputInMBps(Double throughputInMBps) {
            this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
            return this;
        }

        public Builder setThroughputStatus(String throughputStatus) {
            this.throughputStatus = Objects.requireNonNull(throughputStatus);
            return this;
        }

        public Builder setThroughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }

        public Builder setTotalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder setTotalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder setVersionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public ProcessServerResponse build() {
            return new ProcessServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, friendlyName, health, healthErrors, hostId, id, ipAddress, lastHeartbeat, machineCount, marsCommunicationStatus, marsRegistrationStatus, memoryUsageStatus, mobilityServiceUpdates, osType, osVersion, psServiceStatus, psStatsRefreshTime, replicationPairCount, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, throughputInBytes, throughputInMBps, throughputStatus, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, versionStatus);
        }
    }
}
