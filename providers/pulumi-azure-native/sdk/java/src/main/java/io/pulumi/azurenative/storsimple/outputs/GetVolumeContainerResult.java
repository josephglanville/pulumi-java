// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVolumeContainerResult {
    private final @Nullable Integer bandWidthRateInMbps;
    private final @Nullable String bandwidthSettingId;
    private final @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
    private final String encryptionStatus;
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final String ownerShipStatus;
    private final String storageAccountCredentialId;
    private final Double totalCloudStorageUsageInBytes;
    private final String type;
    private final Integer volumeCount;

    @OutputCustomType.Constructor({"bandWidthRateInMbps","bandwidthSettingId","encryptionKey","encryptionStatus","id","kind","name","ownerShipStatus","storageAccountCredentialId","totalCloudStorageUsageInBytes","type","volumeCount"})
    private GetVolumeContainerResult(
        @Nullable Integer bandWidthRateInMbps,
        @Nullable String bandwidthSettingId,
        @Nullable AsymmetricEncryptedSecretResponse encryptionKey,
        String encryptionStatus,
        String id,
        @Nullable String kind,
        String name,
        String ownerShipStatus,
        String storageAccountCredentialId,
        Double totalCloudStorageUsageInBytes,
        String type,
        Integer volumeCount) {
        this.bandWidthRateInMbps = bandWidthRateInMbps;
        this.bandwidthSettingId = bandwidthSettingId;
        this.encryptionKey = encryptionKey;
        this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.ownerShipStatus = Objects.requireNonNull(ownerShipStatus);
        this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
        this.totalCloudStorageUsageInBytes = Objects.requireNonNull(totalCloudStorageUsageInBytes);
        this.type = Objects.requireNonNull(type);
        this.volumeCount = Objects.requireNonNull(volumeCount);
    }

    public Optional<Integer> getBandWidthRateInMbps() {
        return Optional.ofNullable(this.bandWidthRateInMbps);
    }
    public Optional<String> getBandwidthSettingId() {
        return Optional.ofNullable(this.bandwidthSettingId);
    }
    public Optional<AsymmetricEncryptedSecretResponse> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public String getOwnerShipStatus() {
        return this.ownerShipStatus;
    }
    public String getStorageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }
    public Double getTotalCloudStorageUsageInBytes() {
        return this.totalCloudStorageUsageInBytes;
    }
    public String getType() {
        return this.type;
    }
    public Integer getVolumeCount() {
        return this.volumeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandWidthRateInMbps;
        private @Nullable String bandwidthSettingId;
        private @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
        private String encryptionStatus;
        private String id;
        private @Nullable String kind;
        private String name;
        private String ownerShipStatus;
        private String storageAccountCredentialId;
        private Double totalCloudStorageUsageInBytes;
        private String type;
        private Integer volumeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandWidthRateInMbps = defaults.bandWidthRateInMbps;
    	      this.bandwidthSettingId = defaults.bandwidthSettingId;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionStatus = defaults.encryptionStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.ownerShipStatus = defaults.ownerShipStatus;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
    	      this.totalCloudStorageUsageInBytes = defaults.totalCloudStorageUsageInBytes;
    	      this.type = defaults.type;
    	      this.volumeCount = defaults.volumeCount;
        }

        public Builder setBandWidthRateInMbps(@Nullable Integer bandWidthRateInMbps) {
            this.bandWidthRateInMbps = bandWidthRateInMbps;
            return this;
        }

        public Builder setBandwidthSettingId(@Nullable String bandwidthSettingId) {
            this.bandwidthSettingId = bandwidthSettingId;
            return this;
        }

        public Builder setEncryptionKey(@Nullable AsymmetricEncryptedSecretResponse encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionStatus(String encryptionStatus) {
            this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerShipStatus(String ownerShipStatus) {
            this.ownerShipStatus = Objects.requireNonNull(ownerShipStatus);
            return this;
        }

        public Builder setStorageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }

        public Builder setTotalCloudStorageUsageInBytes(Double totalCloudStorageUsageInBytes) {
            this.totalCloudStorageUsageInBytes = Objects.requireNonNull(totalCloudStorageUsageInBytes);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumeCount(Integer volumeCount) {
            this.volumeCount = Objects.requireNonNull(volumeCount);
            return this;
        }

        public GetVolumeContainerResult build() {
            return new GetVolumeContainerResult(bandWidthRateInMbps, bandwidthSettingId, encryptionKey, encryptionStatus, id, kind, name, ownerShipStatus, storageAccountCredentialId, totalCloudStorageUsageInBytes, type, volumeCount);
        }
    }
}