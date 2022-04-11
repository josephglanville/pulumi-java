// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.CatalogCollationType;
import io.pulumi.azurenative.sql.enums.ManagedDatabaseCreateMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseArgs Empty = new ManagedDatabaseArgs();

    /**
     * Whether to auto complete restore of this managed database.
     * 
     */
    @Import(name="autoCompleteRestore")
      private final @Nullable Output<Boolean> autoCompleteRestore;

    public Output<Boolean> getAutoCompleteRestore() {
        return this.autoCompleteRestore == null ? Codegen.empty() : this.autoCompleteRestore;
    }

    /**
     * Collation of the metadata catalog.
     * 
     */
    @Import(name="catalogCollation")
      private final @Nullable Output<Either<String,CatalogCollationType>> catalogCollation;

    public Output<Either<String,CatalogCollationType>> getCatalogCollation() {
        return this.catalogCollation == null ? Codegen.empty() : this.catalogCollation;
    }

    /**
     * Collation of the managed database.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> getCollation() {
        return this.collation == null ? Codegen.empty() : this.collation;
    }

    /**
     * Managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup (longTermRetentionBackupResourceId required).
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<Either<String,ManagedDatabaseCreateMode>> createMode;

    public Output<Either<String,ManagedDatabaseCreateMode>> getCreateMode() {
        return this.createMode == null ? Codegen.empty() : this.createMode;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * Last backup file name for restore of this managed database.
     * 
     */
    @Import(name="lastBackupName")
      private final @Nullable Output<String> lastBackupName;

    public Output<String> getLastBackupName() {
        return this.lastBackupName == null ? Codegen.empty() : this.lastBackupName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the Long Term Retention backup to be used for restore of this managed database.
     * 
     */
    @Import(name="longTermRetentionBackupResourceId")
      private final @Nullable Output<String> longTermRetentionBackupResourceId;

    public Output<String> getLongTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId == null ? Codegen.empty() : this.longTermRetentionBackupResourceId;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
      private final Output<String> managedInstanceName;

    public Output<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The resource identifier of the recoverable database associated with create operation of this database.
     * 
     */
    @Import(name="recoverableDatabaseId")
      private final @Nullable Output<String> recoverableDatabaseId;

    public Output<String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId == null ? Codegen.empty() : this.recoverableDatabaseId;
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
     * The restorable dropped database resource id to restore when creating this database.
     * 
     */
    @Import(name="restorableDroppedDatabaseId")
      private final @Nullable Output<String> restorableDroppedDatabaseId;

    public Output<String> getRestorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId == null ? Codegen.empty() : this.restorableDroppedDatabaseId;
    }

    /**
     * Conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @Import(name="restorePointInTime")
      private final @Nullable Output<String> restorePointInTime;

    public Output<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Codegen.empty() : this.restorePointInTime;
    }

    /**
     * The resource identifier of the source database associated with create operation of this database.
     * 
     */
    @Import(name="sourceDatabaseId")
      private final @Nullable Output<String> sourceDatabaseId;

    public Output<String> getSourceDatabaseId() {
        return this.sourceDatabaseId == null ? Codegen.empty() : this.sourceDatabaseId;
    }

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token.
     * 
     */
    @Import(name="storageContainerSasToken")
      private final @Nullable Output<String> storageContainerSasToken;

    public Output<String> getStorageContainerSasToken() {
        return this.storageContainerSasToken == null ? Codegen.empty() : this.storageContainerSasToken;
    }

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored.
     * 
     */
    @Import(name="storageContainerUri")
      private final @Nullable Output<String> storageContainerUri;

    public Output<String> getStorageContainerUri() {
        return this.storageContainerUri == null ? Codegen.empty() : this.storageContainerUri;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ManagedDatabaseArgs(
        @Nullable Output<Boolean> autoCompleteRestore,
        @Nullable Output<Either<String,CatalogCollationType>> catalogCollation,
        @Nullable Output<String> collation,
        @Nullable Output<Either<String,ManagedDatabaseCreateMode>> createMode,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> lastBackupName,
        @Nullable Output<String> location,
        @Nullable Output<String> longTermRetentionBackupResourceId,
        Output<String> managedInstanceName,
        @Nullable Output<String> recoverableDatabaseId,
        Output<String> resourceGroupName,
        @Nullable Output<String> restorableDroppedDatabaseId,
        @Nullable Output<String> restorePointInTime,
        @Nullable Output<String> sourceDatabaseId,
        @Nullable Output<String> storageContainerSasToken,
        @Nullable Output<String> storageContainerUri,
        @Nullable Output<Map<String,String>> tags) {
        this.autoCompleteRestore = autoCompleteRestore;
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.createMode = createMode;
        this.databaseName = databaseName;
        this.lastBackupName = lastBackupName;
        this.location = location;
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.recoverableDatabaseId = recoverableDatabaseId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        this.restorePointInTime = restorePointInTime;
        this.sourceDatabaseId = sourceDatabaseId;
        this.storageContainerSasToken = storageContainerSasToken;
        this.storageContainerUri = storageContainerUri;
        this.tags = tags;
    }

    private ManagedDatabaseArgs() {
        this.autoCompleteRestore = Codegen.empty();
        this.catalogCollation = Codegen.empty();
        this.collation = Codegen.empty();
        this.createMode = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.lastBackupName = Codegen.empty();
        this.location = Codegen.empty();
        this.longTermRetentionBackupResourceId = Codegen.empty();
        this.managedInstanceName = Codegen.empty();
        this.recoverableDatabaseId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.restorableDroppedDatabaseId = Codegen.empty();
        this.restorePointInTime = Codegen.empty();
        this.sourceDatabaseId = Codegen.empty();
        this.storageContainerSasToken = Codegen.empty();
        this.storageContainerUri = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoCompleteRestore;
        private @Nullable Output<Either<String,CatalogCollationType>> catalogCollation;
        private @Nullable Output<String> collation;
        private @Nullable Output<Either<String,ManagedDatabaseCreateMode>> createMode;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> lastBackupName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> longTermRetentionBackupResourceId;
        private Output<String> managedInstanceName;
        private @Nullable Output<String> recoverableDatabaseId;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> restorableDroppedDatabaseId;
        private @Nullable Output<String> restorePointInTime;
        private @Nullable Output<String> sourceDatabaseId;
        private @Nullable Output<String> storageContainerSasToken;
        private @Nullable Output<String> storageContainerUri;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCompleteRestore = defaults.autoCompleteRestore;
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.createMode = defaults.createMode;
    	      this.databaseName = defaults.databaseName;
    	      this.lastBackupName = defaults.lastBackupName;
    	      this.location = defaults.location;
    	      this.longTermRetentionBackupResourceId = defaults.longTermRetentionBackupResourceId;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.recoverableDatabaseId = defaults.recoverableDatabaseId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorableDroppedDatabaseId = defaults.restorableDroppedDatabaseId;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
    	      this.storageContainerSasToken = defaults.storageContainerSasToken;
    	      this.storageContainerUri = defaults.storageContainerUri;
    	      this.tags = defaults.tags;
        }

        public Builder autoCompleteRestore(@Nullable Output<Boolean> autoCompleteRestore) {
            this.autoCompleteRestore = autoCompleteRestore;
            return this;
        }
        public Builder autoCompleteRestore(@Nullable Boolean autoCompleteRestore) {
            this.autoCompleteRestore = Codegen.ofNullable(autoCompleteRestore);
            return this;
        }
        public Builder catalogCollation(@Nullable Output<Either<String,CatalogCollationType>> catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }
        public Builder catalogCollation(@Nullable Either<String,CatalogCollationType> catalogCollation) {
            this.catalogCollation = Codegen.ofNullable(catalogCollation);
            return this;
        }
        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = Codegen.ofNullable(collation);
            return this;
        }
        public Builder createMode(@Nullable Output<Either<String,ManagedDatabaseCreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder createMode(@Nullable Either<String,ManagedDatabaseCreateMode> createMode) {
            this.createMode = Codegen.ofNullable(createMode);
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder lastBackupName(@Nullable Output<String> lastBackupName) {
            this.lastBackupName = lastBackupName;
            return this;
        }
        public Builder lastBackupName(@Nullable String lastBackupName) {
            this.lastBackupName = Codegen.ofNullable(lastBackupName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder longTermRetentionBackupResourceId(@Nullable Output<String> longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
            return this;
        }
        public Builder longTermRetentionBackupResourceId(@Nullable String longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = Codegen.ofNullable(longTermRetentionBackupResourceId);
            return this;
        }
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }
        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Output.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }
        public Builder recoverableDatabaseId(@Nullable Output<String> recoverableDatabaseId) {
            this.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }
        public Builder recoverableDatabaseId(@Nullable String recoverableDatabaseId) {
            this.recoverableDatabaseId = Codegen.ofNullable(recoverableDatabaseId);
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
            this.restorableDroppedDatabaseId = Codegen.ofNullable(restorableDroppedDatabaseId);
            return this;
        }
        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }
        public Builder restorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Codegen.ofNullable(restorePointInTime);
            return this;
        }
        public Builder sourceDatabaseId(@Nullable Output<String> sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }
        public Builder sourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = Codegen.ofNullable(sourceDatabaseId);
            return this;
        }
        public Builder storageContainerSasToken(@Nullable Output<String> storageContainerSasToken) {
            this.storageContainerSasToken = storageContainerSasToken;
            return this;
        }
        public Builder storageContainerSasToken(@Nullable String storageContainerSasToken) {
            this.storageContainerSasToken = Codegen.ofNullable(storageContainerSasToken);
            return this;
        }
        public Builder storageContainerUri(@Nullable Output<String> storageContainerUri) {
            this.storageContainerUri = storageContainerUri;
            return this;
        }
        public Builder storageContainerUri(@Nullable String storageContainerUri) {
            this.storageContainerUri = Codegen.ofNullable(storageContainerUri);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ManagedDatabaseArgs build() {
            return new ManagedDatabaseArgs(autoCompleteRestore, catalogCollation, collation, createMode, databaseName, lastBackupName, location, longTermRetentionBackupResourceId, managedInstanceName, recoverableDatabaseId, resourceGroupName, restorableDroppedDatabaseId, restorePointInTime, sourceDatabaseId, storageContainerSasToken, storageContainerUri, tags);
        }
    }
}
