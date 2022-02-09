// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.CatalogCollationType;
import io.pulumi.azurenative.sql.enums.CreateMode;
import io.pulumi.azurenative.sql.enums.DatabaseLicenseType;
import io.pulumi.azurenative.sql.enums.DatabaseReadScale;
import io.pulumi.azurenative.sql.enums.RequestedBackupStorageRedundancy;
import io.pulumi.azurenative.sql.enums.SampleName;
import io.pulumi.azurenative.sql.enums.SecondaryType;
import io.pulumi.azurenative.sql.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    @InputImport(name="autoPauseDelay")
    private final @Nullable Input<Integer> autoPauseDelay;

    public Input<Integer> getAutoPauseDelay() {
        return this.autoPauseDelay == null ? Input.empty() : this.autoPauseDelay;
    }

    @InputImport(name="catalogCollation")
    private final @Nullable Input<Either<String,CatalogCollationType>> catalogCollation;

    public Input<Either<String,CatalogCollationType>> getCatalogCollation() {
        return this.catalogCollation == null ? Input.empty() : this.catalogCollation;
    }

    @InputImport(name="collation")
    private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    @InputImport(name="createMode")
    private final @Nullable Input<Either<String,CreateMode>> createMode;

    public Input<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    @InputImport(name="databaseName")
    private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    @InputImport(name="elasticPoolId")
    private final @Nullable Input<String> elasticPoolId;

    public Input<String> getElasticPoolId() {
        return this.elasticPoolId == null ? Input.empty() : this.elasticPoolId;
    }

    @InputImport(name="highAvailabilityReplicaCount")
    private final @Nullable Input<Integer> highAvailabilityReplicaCount;

    public Input<Integer> getHighAvailabilityReplicaCount() {
        return this.highAvailabilityReplicaCount == null ? Input.empty() : this.highAvailabilityReplicaCount;
    }

    @InputImport(name="licenseType")
    private final @Nullable Input<Either<String,DatabaseLicenseType>> licenseType;

    public Input<Either<String,DatabaseLicenseType>> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="longTermRetentionBackupResourceId")
    private final @Nullable Input<String> longTermRetentionBackupResourceId;

    public Input<String> getLongTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId == null ? Input.empty() : this.longTermRetentionBackupResourceId;
    }

    @InputImport(name="maintenanceConfigurationId")
    private final @Nullable Input<String> maintenanceConfigurationId;

    public Input<String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Input.empty() : this.maintenanceConfigurationId;
    }

    @InputImport(name="maxSizeBytes")
    private final @Nullable Input<Double> maxSizeBytes;

    public Input<Double> getMaxSizeBytes() {
        return this.maxSizeBytes == null ? Input.empty() : this.maxSizeBytes;
    }

    @InputImport(name="minCapacity")
    private final @Nullable Input<Double> minCapacity;

    public Input<Double> getMinCapacity() {
        return this.minCapacity == null ? Input.empty() : this.minCapacity;
    }

    @InputImport(name="readScale")
    private final @Nullable Input<Either<String,DatabaseReadScale>> readScale;

    public Input<Either<String,DatabaseReadScale>> getReadScale() {
        return this.readScale == null ? Input.empty() : this.readScale;
    }

    @InputImport(name="recoverableDatabaseId")
    private final @Nullable Input<String> recoverableDatabaseId;

    public Input<String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId == null ? Input.empty() : this.recoverableDatabaseId;
    }

    @InputImport(name="recoveryServicesRecoveryPointId")
    private final @Nullable Input<String> recoveryServicesRecoveryPointId;

    public Input<String> getRecoveryServicesRecoveryPointId() {
        return this.recoveryServicesRecoveryPointId == null ? Input.empty() : this.recoveryServicesRecoveryPointId;
    }

    @InputImport(name="requestedBackupStorageRedundancy")
    private final @Nullable Input<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy;

    public Input<Either<String,RequestedBackupStorageRedundancy>> getRequestedBackupStorageRedundancy() {
        return this.requestedBackupStorageRedundancy == null ? Input.empty() : this.requestedBackupStorageRedundancy;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="restorableDroppedDatabaseId")
    private final @Nullable Input<String> restorableDroppedDatabaseId;

    public Input<String> getRestorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId == null ? Input.empty() : this.restorableDroppedDatabaseId;
    }

    @InputImport(name="restorePointInTime")
    private final @Nullable Input<String> restorePointInTime;

    public Input<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Input.empty() : this.restorePointInTime;
    }

    @InputImport(name="sampleName")
    private final @Nullable Input<Either<String,SampleName>> sampleName;

    public Input<Either<String,SampleName>> getSampleName() {
        return this.sampleName == null ? Input.empty() : this.sampleName;
    }

    @InputImport(name="secondaryType")
    private final @Nullable Input<Either<String,SecondaryType>> secondaryType;

    public Input<Either<String,SecondaryType>> getSecondaryType() {
        return this.secondaryType == null ? Input.empty() : this.secondaryType;
    }

    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="sourceDatabaseDeletionDate")
    private final @Nullable Input<String> sourceDatabaseDeletionDate;

    public Input<String> getSourceDatabaseDeletionDate() {
        return this.sourceDatabaseDeletionDate == null ? Input.empty() : this.sourceDatabaseDeletionDate;
    }

    @InputImport(name="sourceDatabaseId")
    private final @Nullable Input<String> sourceDatabaseId;

    public Input<String> getSourceDatabaseId() {
        return this.sourceDatabaseId == null ? Input.empty() : this.sourceDatabaseId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="zoneRedundant")
    private final @Nullable Input<Boolean> zoneRedundant;

    public Input<Boolean> getZoneRedundant() {
        return this.zoneRedundant == null ? Input.empty() : this.zoneRedundant;
    }

    public DatabaseArgs(
        @Nullable Input<Integer> autoPauseDelay,
        @Nullable Input<Either<String,CatalogCollationType>> catalogCollation,
        @Nullable Input<String> collation,
        @Nullable Input<Either<String,CreateMode>> createMode,
        @Nullable Input<String> databaseName,
        @Nullable Input<String> elasticPoolId,
        @Nullable Input<Integer> highAvailabilityReplicaCount,
        @Nullable Input<Either<String,DatabaseLicenseType>> licenseType,
        @Nullable Input<String> location,
        @Nullable Input<String> longTermRetentionBackupResourceId,
        @Nullable Input<String> maintenanceConfigurationId,
        @Nullable Input<Double> maxSizeBytes,
        @Nullable Input<Double> minCapacity,
        @Nullable Input<Either<String,DatabaseReadScale>> readScale,
        @Nullable Input<String> recoverableDatabaseId,
        @Nullable Input<String> recoveryServicesRecoveryPointId,
        @Nullable Input<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy,
        Input<String> resourceGroupName,
        @Nullable Input<String> restorableDroppedDatabaseId,
        @Nullable Input<String> restorePointInTime,
        @Nullable Input<Either<String,SampleName>> sampleName,
        @Nullable Input<Either<String,SecondaryType>> secondaryType,
        Input<String> serverName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> sourceDatabaseDeletionDate,
        @Nullable Input<String> sourceDatabaseId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Boolean> zoneRedundant) {
        this.autoPauseDelay = autoPauseDelay;
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.createMode = createMode;
        this.databaseName = databaseName;
        this.elasticPoolId = elasticPoolId;
        this.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
        this.licenseType = licenseType;
        this.location = location;
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.maxSizeBytes = maxSizeBytes;
        this.minCapacity = minCapacity;
        this.readScale = readScale;
        this.recoverableDatabaseId = recoverableDatabaseId;
        this.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
        this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        this.restorePointInTime = restorePointInTime;
        this.sampleName = sampleName;
        this.secondaryType = secondaryType;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sku = sku;
        this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
        this.sourceDatabaseId = sourceDatabaseId;
        this.tags = tags;
        this.zoneRedundant = zoneRedundant;
    }

    private DatabaseArgs() {
        this.autoPauseDelay = Input.empty();
        this.catalogCollation = Input.empty();
        this.collation = Input.empty();
        this.createMode = Input.empty();
        this.databaseName = Input.empty();
        this.elasticPoolId = Input.empty();
        this.highAvailabilityReplicaCount = Input.empty();
        this.licenseType = Input.empty();
        this.location = Input.empty();
        this.longTermRetentionBackupResourceId = Input.empty();
        this.maintenanceConfigurationId = Input.empty();
        this.maxSizeBytes = Input.empty();
        this.minCapacity = Input.empty();
        this.readScale = Input.empty();
        this.recoverableDatabaseId = Input.empty();
        this.recoveryServicesRecoveryPointId = Input.empty();
        this.requestedBackupStorageRedundancy = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorableDroppedDatabaseId = Input.empty();
        this.restorePointInTime = Input.empty();
        this.sampleName = Input.empty();
        this.secondaryType = Input.empty();
        this.serverName = Input.empty();
        this.sku = Input.empty();
        this.sourceDatabaseDeletionDate = Input.empty();
        this.sourceDatabaseId = Input.empty();
        this.tags = Input.empty();
        this.zoneRedundant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> autoPauseDelay;
        private @Nullable Input<Either<String,CatalogCollationType>> catalogCollation;
        private @Nullable Input<String> collation;
        private @Nullable Input<Either<String,CreateMode>> createMode;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> elasticPoolId;
        private @Nullable Input<Integer> highAvailabilityReplicaCount;
        private @Nullable Input<Either<String,DatabaseLicenseType>> licenseType;
        private @Nullable Input<String> location;
        private @Nullable Input<String> longTermRetentionBackupResourceId;
        private @Nullable Input<String> maintenanceConfigurationId;
        private @Nullable Input<Double> maxSizeBytes;
        private @Nullable Input<Double> minCapacity;
        private @Nullable Input<Either<String,DatabaseReadScale>> readScale;
        private @Nullable Input<String> recoverableDatabaseId;
        private @Nullable Input<String> recoveryServicesRecoveryPointId;
        private @Nullable Input<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> restorableDroppedDatabaseId;
        private @Nullable Input<String> restorePointInTime;
        private @Nullable Input<Either<String,SampleName>> sampleName;
        private @Nullable Input<Either<String,SecondaryType>> secondaryType;
        private Input<String> serverName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> sourceDatabaseDeletionDate;
        private @Nullable Input<String> sourceDatabaseId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Boolean> zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPauseDelay = defaults.autoPauseDelay;
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.createMode = defaults.createMode;
    	      this.databaseName = defaults.databaseName;
    	      this.elasticPoolId = defaults.elasticPoolId;
    	      this.highAvailabilityReplicaCount = defaults.highAvailabilityReplicaCount;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.longTermRetentionBackupResourceId = defaults.longTermRetentionBackupResourceId;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.minCapacity = defaults.minCapacity;
    	      this.readScale = defaults.readScale;
    	      this.recoverableDatabaseId = defaults.recoverableDatabaseId;
    	      this.recoveryServicesRecoveryPointId = defaults.recoveryServicesRecoveryPointId;
    	      this.requestedBackupStorageRedundancy = defaults.requestedBackupStorageRedundancy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorableDroppedDatabaseId = defaults.restorableDroppedDatabaseId;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sampleName = defaults.sampleName;
    	      this.secondaryType = defaults.secondaryType;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.sourceDatabaseDeletionDate = defaults.sourceDatabaseDeletionDate;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
    	      this.tags = defaults.tags;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setAutoPauseDelay(@Nullable Input<Integer> autoPauseDelay) {
            this.autoPauseDelay = autoPauseDelay;
            return this;
        }

        public Builder setAutoPauseDelay(@Nullable Integer autoPauseDelay) {
            this.autoPauseDelay = Input.ofNullable(autoPauseDelay);
            return this;
        }

        public Builder setCatalogCollation(@Nullable Input<Either<String,CatalogCollationType>> catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }

        public Builder setCatalogCollation(@Nullable Either<String,CatalogCollationType> catalogCollation) {
            this.catalogCollation = Input.ofNullable(catalogCollation);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setElasticPoolId(@Nullable Input<String> elasticPoolId) {
            this.elasticPoolId = elasticPoolId;
            return this;
        }

        public Builder setElasticPoolId(@Nullable String elasticPoolId) {
            this.elasticPoolId = Input.ofNullable(elasticPoolId);
            return this;
        }

        public Builder setHighAvailabilityReplicaCount(@Nullable Input<Integer> highAvailabilityReplicaCount) {
            this.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
            return this;
        }

        public Builder setHighAvailabilityReplicaCount(@Nullable Integer highAvailabilityReplicaCount) {
            this.highAvailabilityReplicaCount = Input.ofNullable(highAvailabilityReplicaCount);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<Either<String,DatabaseLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable Either<String,DatabaseLicenseType> licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLongTermRetentionBackupResourceId(@Nullable Input<String> longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
            return this;
        }

        public Builder setLongTermRetentionBackupResourceId(@Nullable String longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = Input.ofNullable(longTermRetentionBackupResourceId);
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable Input<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Input.ofNullable(maintenanceConfigurationId);
            return this;
        }

        public Builder setMaxSizeBytes(@Nullable Input<Double> maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder setMaxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = Input.ofNullable(maxSizeBytes);
            return this;
        }

        public Builder setMinCapacity(@Nullable Input<Double> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Double minCapacity) {
            this.minCapacity = Input.ofNullable(minCapacity);
            return this;
        }

        public Builder setReadScale(@Nullable Input<Either<String,DatabaseReadScale>> readScale) {
            this.readScale = readScale;
            return this;
        }

        public Builder setReadScale(@Nullable Either<String,DatabaseReadScale> readScale) {
            this.readScale = Input.ofNullable(readScale);
            return this;
        }

        public Builder setRecoverableDatabaseId(@Nullable Input<String> recoverableDatabaseId) {
            this.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }

        public Builder setRecoverableDatabaseId(@Nullable String recoverableDatabaseId) {
            this.recoverableDatabaseId = Input.ofNullable(recoverableDatabaseId);
            return this;
        }

        public Builder setRecoveryServicesRecoveryPointId(@Nullable Input<String> recoveryServicesRecoveryPointId) {
            this.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
            return this;
        }

        public Builder setRecoveryServicesRecoveryPointId(@Nullable String recoveryServicesRecoveryPointId) {
            this.recoveryServicesRecoveryPointId = Input.ofNullable(recoveryServicesRecoveryPointId);
            return this;
        }

        public Builder setRequestedBackupStorageRedundancy(@Nullable Input<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy) {
            this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
            return this;
        }

        public Builder setRequestedBackupStorageRedundancy(@Nullable Either<String,RequestedBackupStorageRedundancy> requestedBackupStorageRedundancy) {
            this.requestedBackupStorageRedundancy = Input.ofNullable(requestedBackupStorageRedundancy);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRestorableDroppedDatabaseId(@Nullable Input<String> restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
            return this;
        }

        public Builder setRestorableDroppedDatabaseId(@Nullable String restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = Input.ofNullable(restorableDroppedDatabaseId);
            return this;
        }

        public Builder setRestorePointInTime(@Nullable Input<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }

        public Builder setRestorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Input.ofNullable(restorePointInTime);
            return this;
        }

        public Builder setSampleName(@Nullable Input<Either<String,SampleName>> sampleName) {
            this.sampleName = sampleName;
            return this;
        }

        public Builder setSampleName(@Nullable Either<String,SampleName> sampleName) {
            this.sampleName = Input.ofNullable(sampleName);
            return this;
        }

        public Builder setSecondaryType(@Nullable Input<Either<String,SecondaryType>> secondaryType) {
            this.secondaryType = secondaryType;
            return this;
        }

        public Builder setSecondaryType(@Nullable Either<String,SecondaryType> secondaryType) {
            this.secondaryType = Input.ofNullable(secondaryType);
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSourceDatabaseDeletionDate(@Nullable Input<String> sourceDatabaseDeletionDate) {
            this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
            return this;
        }

        public Builder setSourceDatabaseDeletionDate(@Nullable String sourceDatabaseDeletionDate) {
            this.sourceDatabaseDeletionDate = Input.ofNullable(sourceDatabaseDeletionDate);
            return this;
        }

        public Builder setSourceDatabaseId(@Nullable Input<String> sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }

        public Builder setSourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = Input.ofNullable(sourceDatabaseId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZoneRedundant(@Nullable Input<Boolean> zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public Builder setZoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = Input.ofNullable(zoneRedundant);
            return this;
        }

        public DatabaseArgs build() {
            return new DatabaseArgs(autoPauseDelay, catalogCollation, collation, createMode, databaseName, elasticPoolId, highAvailabilityReplicaCount, licenseType, location, longTermRetentionBackupResourceId, maintenanceConfigurationId, maxSizeBytes, minCapacity, readScale, recoverableDatabaseId, recoveryServicesRecoveryPointId, requestedBackupStorageRedundancy, resourceGroupName, restorableDroppedDatabaseId, restorePointInTime, sampleName, secondaryType, serverName, sku, sourceDatabaseDeletionDate, sourceDatabaseId, tags, zoneRedundant);
        }
    }
}
