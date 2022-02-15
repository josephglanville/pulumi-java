// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.ClusterDefinitionResponse;
import io.pulumi.azurenative.hdinsight.outputs.ComputeIsolationPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.ComputeProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.ConnectivityEndpointResponse;
import io.pulumi.azurenative.hdinsight.outputs.DiskEncryptionPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.EncryptionInTransitPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.ErrorsResponse;
import io.pulumi.azurenative.hdinsight.outputs.ExcludedServicesConfigResponse;
import io.pulumi.azurenative.hdinsight.outputs.KafkaRestPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.NetworkPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.QuotaInfoResponse;
import io.pulumi.azurenative.hdinsight.outputs.SecurityProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.StorageProfileResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterGetPropertiesResponse {
    private final ClusterDefinitionResponse clusterDefinition;
    private final @Nullable String clusterHdpVersion;
    private final @Nullable String clusterId;
    private final @Nullable String clusterState;
    private final @Nullable String clusterVersion;
    private final @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;
    private final @Nullable ComputeProfileResponse computeProfile;
    private final @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;
    private final @Nullable String createdDate;
    private final @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;
    private final @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;
    private final @Nullable List<ErrorsResponse> errors;
    private final @Nullable ExcludedServicesConfigResponse excludedServicesConfig;
    private final @Nullable KafkaRestPropertiesResponse kafkaRestProperties;
    private final @Nullable String minSupportedTlsVersion;
    private final @Nullable NetworkPropertiesResponse networkProperties;
    private final @Nullable String osType;
    private final @Nullable String provisioningState;
    private final @Nullable QuotaInfoResponse quotaInfo;
    private final @Nullable SecurityProfileResponse securityProfile;
    private final @Nullable StorageProfileResponse storageProfile;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"clusterDefinition","clusterHdpVersion","clusterId","clusterState","clusterVersion","computeIsolationProperties","computeProfile","connectivityEndpoints","createdDate","diskEncryptionProperties","encryptionInTransitProperties","errors","excludedServicesConfig","kafkaRestProperties","minSupportedTlsVersion","networkProperties","osType","provisioningState","quotaInfo","securityProfile","storageProfile","tier"})
    private ClusterGetPropertiesResponse(
        ClusterDefinitionResponse clusterDefinition,
        @Nullable String clusterHdpVersion,
        @Nullable String clusterId,
        @Nullable String clusterState,
        @Nullable String clusterVersion,
        @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties,
        @Nullable ComputeProfileResponse computeProfile,
        @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints,
        @Nullable String createdDate,
        @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties,
        @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties,
        @Nullable List<ErrorsResponse> errors,
        @Nullable ExcludedServicesConfigResponse excludedServicesConfig,
        @Nullable KafkaRestPropertiesResponse kafkaRestProperties,
        @Nullable String minSupportedTlsVersion,
        @Nullable NetworkPropertiesResponse networkProperties,
        @Nullable String osType,
        @Nullable String provisioningState,
        @Nullable QuotaInfoResponse quotaInfo,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable StorageProfileResponse storageProfile,
        @Nullable String tier) {
        this.clusterDefinition = Objects.requireNonNull(clusterDefinition);
        this.clusterHdpVersion = clusterHdpVersion;
        this.clusterId = clusterId;
        this.clusterState = clusterState;
        this.clusterVersion = clusterVersion;
        this.computeIsolationProperties = computeIsolationProperties;
        this.computeProfile = computeProfile;
        this.connectivityEndpoints = connectivityEndpoints;
        this.createdDate = createdDate;
        this.diskEncryptionProperties = diskEncryptionProperties;
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        this.errors = errors;
        this.excludedServicesConfig = excludedServicesConfig;
        this.kafkaRestProperties = kafkaRestProperties;
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        this.networkProperties = networkProperties;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.quotaInfo = quotaInfo;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tier = tier;
    }

    public ClusterDefinitionResponse getClusterDefinition() {
        return this.clusterDefinition;
    }
    public Optional<String> getClusterHdpVersion() {
        return Optional.ofNullable(this.clusterHdpVersion);
    }
    public Optional<String> getClusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<String> getClusterState() {
        return Optional.ofNullable(this.clusterState);
    }
    public Optional<String> getClusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }
    public Optional<ComputeIsolationPropertiesResponse> getComputeIsolationProperties() {
        return Optional.ofNullable(this.computeIsolationProperties);
    }
    public Optional<ComputeProfileResponse> getComputeProfile() {
        return Optional.ofNullable(this.computeProfile);
    }
    public List<ConnectivityEndpointResponse> getConnectivityEndpoints() {
        return this.connectivityEndpoints == null ? List.of() : this.connectivityEndpoints;
    }
    public Optional<String> getCreatedDate() {
        return Optional.ofNullable(this.createdDate);
    }
    public Optional<DiskEncryptionPropertiesResponse> getDiskEncryptionProperties() {
        return Optional.ofNullable(this.diskEncryptionProperties);
    }
    public Optional<EncryptionInTransitPropertiesResponse> getEncryptionInTransitProperties() {
        return Optional.ofNullable(this.encryptionInTransitProperties);
    }
    public List<ErrorsResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    public Optional<ExcludedServicesConfigResponse> getExcludedServicesConfig() {
        return Optional.ofNullable(this.excludedServicesConfig);
    }
    public Optional<KafkaRestPropertiesResponse> getKafkaRestProperties() {
        return Optional.ofNullable(this.kafkaRestProperties);
    }
    public Optional<String> getMinSupportedTlsVersion() {
        return Optional.ofNullable(this.minSupportedTlsVersion);
    }
    public Optional<NetworkPropertiesResponse> getNetworkProperties() {
        return Optional.ofNullable(this.networkProperties);
    }
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<QuotaInfoResponse> getQuotaInfo() {
        return Optional.ofNullable(this.quotaInfo);
    }
    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefinitionResponse clusterDefinition;
        private @Nullable String clusterHdpVersion;
        private @Nullable String clusterId;
        private @Nullable String clusterState;
        private @Nullable String clusterVersion;
        private @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;
        private @Nullable ComputeProfileResponse computeProfile;
        private @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;
        private @Nullable String createdDate;
        private @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;
        private @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;
        private @Nullable List<ErrorsResponse> errors;
        private @Nullable ExcludedServicesConfigResponse excludedServicesConfig;
        private @Nullable KafkaRestPropertiesResponse kafkaRestProperties;
        private @Nullable String minSupportedTlsVersion;
        private @Nullable NetworkPropertiesResponse networkProperties;
        private @Nullable String osType;
        private @Nullable String provisioningState;
        private @Nullable QuotaInfoResponse quotaInfo;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterGetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDefinition = defaults.clusterDefinition;
    	      this.clusterHdpVersion = defaults.clusterHdpVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.computeIsolationProperties = defaults.computeIsolationProperties;
    	      this.computeProfile = defaults.computeProfile;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.createdDate = defaults.createdDate;
    	      this.diskEncryptionProperties = defaults.diskEncryptionProperties;
    	      this.encryptionInTransitProperties = defaults.encryptionInTransitProperties;
    	      this.errors = defaults.errors;
    	      this.excludedServicesConfig = defaults.excludedServicesConfig;
    	      this.kafkaRestProperties = defaults.kafkaRestProperties;
    	      this.minSupportedTlsVersion = defaults.minSupportedTlsVersion;
    	      this.networkProperties = defaults.networkProperties;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.quotaInfo = defaults.quotaInfo;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tier = defaults.tier;
        }

        public Builder setClusterDefinition(ClusterDefinitionResponse clusterDefinition) {
            this.clusterDefinition = Objects.requireNonNull(clusterDefinition);
            return this;
        }

        public Builder setClusterHdpVersion(@Nullable String clusterHdpVersion) {
            this.clusterHdpVersion = clusterHdpVersion;
            return this;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setClusterState(@Nullable String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        public Builder setClusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }

        public Builder setComputeIsolationProperties(@Nullable ComputeIsolationPropertiesResponse computeIsolationProperties) {
            this.computeIsolationProperties = computeIsolationProperties;
            return this;
        }

        public Builder setComputeProfile(@Nullable ComputeProfileResponse computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }

        public Builder setConnectivityEndpoints(@Nullable List<ConnectivityEndpointResponse> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setDiskEncryptionProperties(@Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties) {
            this.diskEncryptionProperties = diskEncryptionProperties;
            return this;
        }

        public Builder setEncryptionInTransitProperties(@Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties) {
            this.encryptionInTransitProperties = encryptionInTransitProperties;
            return this;
        }

        public Builder setErrors(@Nullable List<ErrorsResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setExcludedServicesConfig(@Nullable ExcludedServicesConfigResponse excludedServicesConfig) {
            this.excludedServicesConfig = excludedServicesConfig;
            return this;
        }

        public Builder setKafkaRestProperties(@Nullable KafkaRestPropertiesResponse kafkaRestProperties) {
            this.kafkaRestProperties = kafkaRestProperties;
            return this;
        }

        public Builder setMinSupportedTlsVersion(@Nullable String minSupportedTlsVersion) {
            this.minSupportedTlsVersion = minSupportedTlsVersion;
            return this;
        }

        public Builder setNetworkProperties(@Nullable NetworkPropertiesResponse networkProperties) {
            this.networkProperties = networkProperties;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setQuotaInfo(@Nullable QuotaInfoResponse quotaInfo) {
            this.quotaInfo = quotaInfo;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public ClusterGetPropertiesResponse build() {
            return new ClusterGetPropertiesResponse(clusterDefinition, clusterHdpVersion, clusterId, clusterState, clusterVersion, computeIsolationProperties, computeProfile, connectivityEndpoints, createdDate, diskEncryptionProperties, encryptionInTransitProperties, errors, excludedServicesConfig, kafkaRestProperties, minSupportedTlsVersion, networkProperties, osType, provisioningState, quotaInfo, securityProfile, storageProfile, tier);
        }
    }
}