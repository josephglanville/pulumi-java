// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.BackupSchedule;
import io.pulumi.azurenative.web.inputs.DatabaseBackupSetting;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWebAppBackupStatusSecretsSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWebAppBackupStatusSecretsSlotArgs Empty = new ListWebAppBackupStatusSecretsSlotArgs();

    /**
     * ID of backup.
     * 
     */
    @Import(name="backupId", required=true)
      private final String backupId;

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backupName")
      private final @Nullable String backupName;

    public Optional<String> getBackupName() {
        return this.backupName == null ? Optional.empty() : Optional.ofNullable(this.backupName);
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Import(name="backupSchedule")
      private final @Nullable BackupSchedule backupSchedule;

    public Optional<BackupSchedule> getBackupSchedule() {
        return this.backupSchedule == null ? Optional.empty() : Optional.ofNullable(this.backupSchedule);
    }

    /**
     * Databases included in the backup.
     * 
     */
    @Import(name="databases")
      private final @Nullable List<DatabaseBackupSetting> databases;

    public List<DatabaseBackupSetting> getDatabases() {
        return this.databases == null ? List.of() : this.databases;
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Name of web app.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of web app slot. If not specified then will default to production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
      private final String storageAccountUrl;

    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }

    public ListWebAppBackupStatusSecretsSlotArgs(
        String backupId,
        @Nullable String backupName,
        @Nullable BackupSchedule backupSchedule,
        @Nullable List<DatabaseBackupSetting> databases,
        @Nullable Boolean enabled,
        @Nullable String kind,
        String name,
        String resourceGroupName,
        String slot,
        String storageAccountUrl) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.backupName = backupName;
        this.backupSchedule = backupSchedule;
        this.databases = databases;
        this.enabled = enabled;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
    }

    private ListWebAppBackupStatusSecretsSlotArgs() {
        this.backupId = null;
        this.backupName = null;
        this.backupSchedule = null;
        this.databases = List.of();
        this.enabled = null;
        this.kind = null;
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
        this.storageAccountUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppBackupStatusSecretsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private @Nullable String backupName;
        private @Nullable BackupSchedule backupSchedule;
        private @Nullable List<DatabaseBackupSetting> databases;
        private @Nullable Boolean enabled;
        private @Nullable String kind;
        private String name;
        private String resourceGroupName;
        private String slot;
        private String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppBackupStatusSecretsSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.backupName = defaults.backupName;
    	      this.backupSchedule = defaults.backupSchedule;
    	      this.databases = defaults.databases;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder backupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupName(@Nullable String backupName) {
            this.backupName = backupName;
            return this;
        }
        public Builder backupSchedule(@Nullable BackupSchedule backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }
        public Builder databases(@Nullable List<DatabaseBackupSetting> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(DatabaseBackupSetting... databases) {
            return databases(List.of(databases));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }        public ListWebAppBackupStatusSecretsSlotArgs build() {
            return new ListWebAppBackupStatusSecretsSlotArgs(backupId, backupName, backupSchedule, databases, enabled, kind, name, resourceGroupName, slot, storageAccountUrl);
        }
    }
}
