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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    @Import(name="autoPauseDelay")
      private final @Nullable Output<Integer> autoPauseDelay;

    public Output<Integer> getAutoPauseDelay() {
        return this.autoPauseDelay == null ? Output.empty() : this.autoPauseDelay;
    }

    /**
     * Collation of the metadata catalog.
     * 
     */
    @Import(name="catalogCollation")
      private final @Nullable Output<Either<String,CatalogCollationType>> catalogCollation;

    public Output<Either<String,CatalogCollationType>> getCatalogCollation() {
        return this.catalogCollation == null ? Output.empty() : this.catalogCollation;
    }

    /**
     * The collation of the database.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> getCollation() {
        return this.collation == null ? Output.empty() : this.collation;
    }

    /**
     * Specifies the mode of database creation.
     * 
     * Default: regular database creation.
     * 
     * Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource ID of the source database.
     * 
     * Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be specified as the resource ID of the existing primary database.
     * 
     * PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database. sourceDatabaseId must be specified as the resource ID of the existing database, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the recoverable database resource ID to restore.
     * 
     * Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified. If sourceDatabaseId is the database's original resource ID, then sourceDatabaseDeletionDate must be specified. Otherwise sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is ignored. restorePointInTime may also be specified to restore from an earlier point in time.
     * 
     * RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault. recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
     * 
     * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<Either<String,CreateMode>> createMode;

    public Output<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Output.empty() : this.createMode;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * The resource identifier of the elastic pool containing this database.
     * 
     */
    @Import(name="elasticPoolId")
      private final @Nullable Output<String> elasticPoolId;

    public Output<String> getElasticPoolId() {
        return this.elasticPoolId == null ? Output.empty() : this.elasticPoolId;
    }

    /**
     * The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    @Import(name="highAvailabilityReplicaCount")
      private final @Nullable Output<Integer> highAvailabilityReplicaCount;

    public Output<Integer> getHighAvailabilityReplicaCount() {
        return this.highAvailabilityReplicaCount == null ? Output.empty() : this.highAvailabilityReplicaCount;
    }

    /**
     * The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable Output<Either<String,DatabaseLicenseType>> licenseType;

    public Output<Either<String,DatabaseLicenseType>> getLicenseType() {
        return this.licenseType == null ? Output.empty() : this.licenseType;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource identifier of the long term retention backup associated with create operation of this database.
     * 
     */
    @Import(name="longTermRetentionBackupResourceId")
      private final @Nullable Output<String> longTermRetentionBackupResourceId;

    public Output<String> getLongTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId == null ? Output.empty() : this.longTermRetentionBackupResourceId;
    }

    /**
     * Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    @Import(name="maintenanceConfigurationId")
      private final @Nullable Output<String> maintenanceConfigurationId;

    public Output<String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Output.empty() : this.maintenanceConfigurationId;
    }

    /**
     * The max size of the database expressed in bytes.
     * 
     */
    @Import(name="maxSizeBytes")
      private final @Nullable Output<Double> maxSizeBytes;

    public Output<Double> getMaxSizeBytes() {
        return this.maxSizeBytes == null ? Output.empty() : this.maxSizeBytes;
    }

    /**
     * Minimal capacity that database will always have allocated, if not paused
     * 
     */
    @Import(name="minCapacity")
      private final @Nullable Output<Double> minCapacity;

    public Output<Double> getMinCapacity() {
        return this.minCapacity == null ? Output.empty() : this.minCapacity;
    }

    /**
     * The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    @Import(name="readScale")
      private final @Nullable Output<Either<String,DatabaseReadScale>> readScale;

    public Output<Either<String,DatabaseReadScale>> getReadScale() {
        return this.readScale == null ? Output.empty() : this.readScale;
    }

    /**
     * The resource identifier of the recoverable database associated with create operation of this database.
     * 
     */
    @Import(name="recoverableDatabaseId")
      private final @Nullable Output<String> recoverableDatabaseId;

    public Output<String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId == null ? Output.empty() : this.recoverableDatabaseId;
    }

    /**
     * The resource identifier of the recovery point associated with create operation of this database.
     * 
     */
    @Import(name="recoveryServicesRecoveryPointId")
      private final @Nullable Output<String> recoveryServicesRecoveryPointId;

    public Output<String> getRecoveryServicesRecoveryPointId() {
        return this.recoveryServicesRecoveryPointId == null ? Output.empty() : this.recoveryServicesRecoveryPointId;
    }

    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    @Import(name="requestedBackupStorageRedundancy")
      private final @Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy;

    public Output<Either<String,RequestedBackupStorageRedundancy>> getRequestedBackupStorageRedundancy() {
        return this.requestedBackupStorageRedundancy == null ? Output.empty() : this.requestedBackupStorageRedundancy;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource identifier of the restorable dropped database associated with create operation of this database.
     * 
     */
    @Import(name="restorableDroppedDatabaseId")
      private final @Nullable Output<String> restorableDroppedDatabaseId;

    public Output<String> getRestorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId == null ? Output.empty() : this.restorableDroppedDatabaseId;
    }

    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @Import(name="restorePointInTime")
      private final @Nullable Output<String> restorePointInTime;

    public Output<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Output.empty() : this.restorePointInTime;
    }

    /**
     * The name of the sample schema to apply when creating this database.
     * 
     */
    @Import(name="sampleName")
      private final @Nullable Output<Either<String,SampleName>> sampleName;

    public Output<Either<String,SampleName>> getSampleName() {
        return this.sampleName == null ? Output.empty() : this.sampleName;
    }

    /**
     * The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    @Import(name="secondaryType")
      private final @Nullable Output<Either<String,SecondaryType>> secondaryType;

    public Output<Either<String,SecondaryType>> getSecondaryType() {
        return this.secondaryType == null ? Output.empty() : this.secondaryType;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Specifies the time that the database was deleted.
     * 
     */
    @Import(name="sourceDatabaseDeletionDate")
      private final @Nullable Output<String> sourceDatabaseDeletionDate;

    public Output<String> getSourceDatabaseDeletionDate() {
        return this.sourceDatabaseDeletionDate == null ? Output.empty() : this.sourceDatabaseDeletionDate;
    }

    /**
     * The resource identifier of the source database associated with create operation of this database.
     * 
     */
    @Import(name="sourceDatabaseId")
      private final @Nullable Output<String> sourceDatabaseId;

    public Output<String> getSourceDatabaseId() {
        return this.sourceDatabaseId == null ? Output.empty() : this.sourceDatabaseId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    @Import(name="zoneRedundant")
      private final @Nullable Output<Boolean> zoneRedundant;

    public Output<Boolean> getZoneRedundant() {
        return this.zoneRedundant == null ? Output.empty() : this.zoneRedundant;
    }

    public DatabaseArgs(
        @Nullable Output<Integer> autoPauseDelay,
        @Nullable Output<Either<String,CatalogCollationType>> catalogCollation,
        @Nullable Output<String> collation,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> elasticPoolId,
        @Nullable Output<Integer> highAvailabilityReplicaCount,
        @Nullable Output<Either<String,DatabaseLicenseType>> licenseType,
        @Nullable Output<String> location,
        @Nullable Output<String> longTermRetentionBackupResourceId,
        @Nullable Output<String> maintenanceConfigurationId,
        @Nullable Output<Double> maxSizeBytes,
        @Nullable Output<Double> minCapacity,
        @Nullable Output<Either<String,DatabaseReadScale>> readScale,
        @Nullable Output<String> recoverableDatabaseId,
        @Nullable Output<String> recoveryServicesRecoveryPointId,
        @Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy,
        Output<String> resourceGroupName,
        @Nullable Output<String> restorableDroppedDatabaseId,
        @Nullable Output<String> restorePointInTime,
        @Nullable Output<Either<String,SampleName>> sampleName,
        @Nullable Output<Either<String,SecondaryType>> secondaryType,
        Output<String> serverName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<String> sourceDatabaseDeletionDate,
        @Nullable Output<String> sourceDatabaseId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Boolean> zoneRedundant) {
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
        this.autoPauseDelay = Output.empty();
        this.catalogCollation = Output.empty();
        this.collation = Output.empty();
        this.createMode = Output.empty();
        this.databaseName = Output.empty();
        this.elasticPoolId = Output.empty();
        this.highAvailabilityReplicaCount = Output.empty();
        this.licenseType = Output.empty();
        this.location = Output.empty();
        this.longTermRetentionBackupResourceId = Output.empty();
        this.maintenanceConfigurationId = Output.empty();
        this.maxSizeBytes = Output.empty();
        this.minCapacity = Output.empty();
        this.readScale = Output.empty();
        this.recoverableDatabaseId = Output.empty();
        this.recoveryServicesRecoveryPointId = Output.empty();
        this.requestedBackupStorageRedundancy = Output.empty();
        this.resourceGroupName = Output.empty();
        this.restorableDroppedDatabaseId = Output.empty();
        this.restorePointInTime = Output.empty();
        this.sampleName = Output.empty();
        this.secondaryType = Output.empty();
        this.serverName = Output.empty();
        this.sku = Output.empty();
        this.sourceDatabaseDeletionDate = Output.empty();
        this.sourceDatabaseId = Output.empty();
        this.tags = Output.empty();
        this.zoneRedundant = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> autoPauseDelay;
        private @Nullable Output<Either<String,CatalogCollationType>> catalogCollation;
        private @Nullable Output<String> collation;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> elasticPoolId;
        private @Nullable Output<Integer> highAvailabilityReplicaCount;
        private @Nullable Output<Either<String,DatabaseLicenseType>> licenseType;
        private @Nullable Output<String> location;
        private @Nullable Output<String> longTermRetentionBackupResourceId;
        private @Nullable Output<String> maintenanceConfigurationId;
        private @Nullable Output<Double> maxSizeBytes;
        private @Nullable Output<Double> minCapacity;
        private @Nullable Output<Either<String,DatabaseReadScale>> readScale;
        private @Nullable Output<String> recoverableDatabaseId;
        private @Nullable Output<String> recoveryServicesRecoveryPointId;
        private @Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> restorableDroppedDatabaseId;
        private @Nullable Output<String> restorePointInTime;
        private @Nullable Output<Either<String,SampleName>> sampleName;
        private @Nullable Output<Either<String,SecondaryType>> secondaryType;
        private Output<String> serverName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<String> sourceDatabaseDeletionDate;
        private @Nullable Output<String> sourceDatabaseId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Boolean> zoneRedundant;

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

        public Builder autoPauseDelay(@Nullable Output<Integer> autoPauseDelay) {
            this.autoPauseDelay = autoPauseDelay;
            return this;
        }
        public Builder autoPauseDelay(@Nullable Integer autoPauseDelay) {
            this.autoPauseDelay = Output.ofNullable(autoPauseDelay);
            return this;
        }
        public Builder catalogCollation(@Nullable Output<Either<String,CatalogCollationType>> catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }
        public Builder catalogCollation(@Nullable Either<String,CatalogCollationType> catalogCollation) {
            this.catalogCollation = Output.ofNullable(catalogCollation);
            return this;
        }
        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = Output.ofNullable(collation);
            return this;
        }
        public Builder createMode(@Nullable Output<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder createMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Output.ofNullable(createMode);
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }
        public Builder elasticPoolId(@Nullable Output<String> elasticPoolId) {
            this.elasticPoolId = elasticPoolId;
            return this;
        }
        public Builder elasticPoolId(@Nullable String elasticPoolId) {
            this.elasticPoolId = Output.ofNullable(elasticPoolId);
            return this;
        }
        public Builder highAvailabilityReplicaCount(@Nullable Output<Integer> highAvailabilityReplicaCount) {
            this.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
            return this;
        }
        public Builder highAvailabilityReplicaCount(@Nullable Integer highAvailabilityReplicaCount) {
            this.highAvailabilityReplicaCount = Output.ofNullable(highAvailabilityReplicaCount);
            return this;
        }
        public Builder licenseType(@Nullable Output<Either<String,DatabaseLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable Either<String,DatabaseLicenseType> licenseType) {
            this.licenseType = Output.ofNullable(licenseType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder longTermRetentionBackupResourceId(@Nullable Output<String> longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
            return this;
        }
        public Builder longTermRetentionBackupResourceId(@Nullable String longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = Output.ofNullable(longTermRetentionBackupResourceId);
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable Output<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Output.ofNullable(maintenanceConfigurationId);
            return this;
        }
        public Builder maxSizeBytes(@Nullable Output<Double> maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }
        public Builder maxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = Output.ofNullable(maxSizeBytes);
            return this;
        }
        public Builder minCapacity(@Nullable Output<Double> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Builder minCapacity(@Nullable Double minCapacity) {
            this.minCapacity = Output.ofNullable(minCapacity);
            return this;
        }
        public Builder readScale(@Nullable Output<Either<String,DatabaseReadScale>> readScale) {
            this.readScale = readScale;
            return this;
        }
        public Builder readScale(@Nullable Either<String,DatabaseReadScale> readScale) {
            this.readScale = Output.ofNullable(readScale);
            return this;
        }
        public Builder recoverableDatabaseId(@Nullable Output<String> recoverableDatabaseId) {
            this.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }
        public Builder recoverableDatabaseId(@Nullable String recoverableDatabaseId) {
            this.recoverableDatabaseId = Output.ofNullable(recoverableDatabaseId);
            return this;
        }
        public Builder recoveryServicesRecoveryPointId(@Nullable Output<String> recoveryServicesRecoveryPointId) {
            this.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
            return this;
        }
        public Builder recoveryServicesRecoveryPointId(@Nullable String recoveryServicesRecoveryPointId) {
            this.recoveryServicesRecoveryPointId = Output.ofNullable(recoveryServicesRecoveryPointId);
            return this;
        }
        public Builder requestedBackupStorageRedundancy(@Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy) {
            this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
            return this;
        }
        public Builder requestedBackupStorageRedundancy(@Nullable Either<String,RequestedBackupStorageRedundancy> requestedBackupStorageRedundancy) {
            this.requestedBackupStorageRedundancy = Output.ofNullable(requestedBackupStorageRedundancy);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder restorableDroppedDatabaseId(@Nullable Output<String> restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
            return this;
        }
        public Builder restorableDroppedDatabaseId(@Nullable String restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = Output.ofNullable(restorableDroppedDatabaseId);
            return this;
        }
        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }
        public Builder restorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Output.ofNullable(restorePointInTime);
            return this;
        }
        public Builder sampleName(@Nullable Output<Either<String,SampleName>> sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public Builder sampleName(@Nullable Either<String,SampleName> sampleName) {
            this.sampleName = Output.ofNullable(sampleName);
            return this;
        }
        public Builder secondaryType(@Nullable Output<Either<String,SecondaryType>> secondaryType) {
            this.secondaryType = secondaryType;
            return this;
        }
        public Builder secondaryType(@Nullable Either<String,SecondaryType> secondaryType) {
            this.secondaryType = Output.ofNullable(secondaryType);
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public Builder sourceDatabaseDeletionDate(@Nullable Output<String> sourceDatabaseDeletionDate) {
            this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
            return this;
        }
        public Builder sourceDatabaseDeletionDate(@Nullable String sourceDatabaseDeletionDate) {
            this.sourceDatabaseDeletionDate = Output.ofNullable(sourceDatabaseDeletionDate);
            return this;
        }
        public Builder sourceDatabaseId(@Nullable Output<String> sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }
        public Builder sourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = Output.ofNullable(sourceDatabaseId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }
        public Builder zoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = Output.ofNullable(zoneRedundant);
            return this;
        }        public DatabaseArgs build() {
            return new DatabaseArgs(autoPauseDelay, catalogCollation, collation, createMode, databaseName, elasticPoolId, highAvailabilityReplicaCount, licenseType, location, longTermRetentionBackupResourceId, maintenanceConfigurationId, maxSizeBytes, minCapacity, readScale, recoverableDatabaseId, recoveryServicesRecoveryPointId, requestedBackupStorageRedundancy, resourceGroupName, restorableDroppedDatabaseId, restorePointInTime, sampleName, secondaryType, serverName, sku, sourceDatabaseDeletionDate, sourceDatabaseId, tags, zoneRedundant);
        }
    }
}
