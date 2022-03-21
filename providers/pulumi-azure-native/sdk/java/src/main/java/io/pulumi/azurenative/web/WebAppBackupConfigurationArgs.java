// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.BackupScheduleArgs;
import io.pulumi.azurenative.web.inputs.DatabaseBackupSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppBackupConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppBackupConfigurationArgs Empty = new WebAppBackupConfigurationArgs();

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backupName")
      private final @Nullable Output<String> backupName;

    public Output<String> getBackupName() {
        return this.backupName == null ? Output.empty() : this.backupName;
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Import(name="backupSchedule")
      private final @Nullable Output<BackupScheduleArgs> backupSchedule;

    public Output<BackupScheduleArgs> getBackupSchedule() {
        return this.backupSchedule == null ? Output.empty() : this.backupSchedule;
    }

    /**
     * Databases included in the backup.
     * 
     */
    @Import(name="databases")
      private final @Nullable Output<List<DatabaseBackupSettingArgs>> databases;

    public Output<List<DatabaseBackupSettingArgs>> getDatabases() {
        return this.databases == null ? Output.empty() : this.databases;
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
      private final Output<String> storageAccountUrl;

    public Output<String> getStorageAccountUrl() {
        return this.storageAccountUrl;
    }

    public WebAppBackupConfigurationArgs(
        @Nullable Output<String> backupName,
        @Nullable Output<BackupScheduleArgs> backupSchedule,
        @Nullable Output<List<DatabaseBackupSettingArgs>> databases,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        Output<String> storageAccountUrl) {
        this.backupName = backupName;
        this.backupSchedule = backupSchedule;
        this.databases = databases;
        this.enabled = enabled;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
    }

    private WebAppBackupConfigurationArgs() {
        this.backupName = Output.empty();
        this.backupSchedule = Output.empty();
        this.databases = Output.empty();
        this.enabled = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.storageAccountUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppBackupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backupName;
        private @Nullable Output<BackupScheduleArgs> backupSchedule;
        private @Nullable Output<List<DatabaseBackupSettingArgs>> databases;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private Output<String> storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppBackupConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupName = defaults.backupName;
    	      this.backupSchedule = defaults.backupSchedule;
    	      this.databases = defaults.databases;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder backupName(@Nullable Output<String> backupName) {
            this.backupName = backupName;
            return this;
        }
        public Builder backupName(@Nullable String backupName) {
            this.backupName = Output.ofNullable(backupName);
            return this;
        }
        public Builder backupSchedule(@Nullable Output<BackupScheduleArgs> backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }
        public Builder backupSchedule(@Nullable BackupScheduleArgs backupSchedule) {
            this.backupSchedule = Output.ofNullable(backupSchedule);
            return this;
        }
        public Builder databases(@Nullable Output<List<DatabaseBackupSettingArgs>> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(@Nullable List<DatabaseBackupSettingArgs> databases) {
            this.databases = Output.ofNullable(databases);
            return this;
        }
        public Builder databases(DatabaseBackupSettingArgs... databases) {
            return databases(List.of(databases));
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public Builder storageAccountUrl(Output<String> storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Output.of(Objects.requireNonNull(storageAccountUrl));
            return this;
        }        public WebAppBackupConfigurationArgs build() {
            return new WebAppBackupConfigurationArgs(backupName, backupSchedule, databases, enabled, kind, name, resourceGroupName, storageAccountUrl);
        }
    }
}
