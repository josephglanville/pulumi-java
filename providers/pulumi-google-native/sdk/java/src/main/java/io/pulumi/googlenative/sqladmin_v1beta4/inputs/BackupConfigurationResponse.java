// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance backup configuration.
 * 
 */
public final class BackupConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupConfigurationResponse Empty = new BackupConfigurationResponse();

    /**
     * Backup retention settings.
     * 
     */
    @Import(name="backupRetentionSettings", required=true)
      private final BackupRetentionSettingsResponse backupRetentionSettings;

    public BackupRetentionSettingsResponse getBackupRetentionSettings() {
        return this.backupRetentionSettings;
    }

    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    @Import(name="binaryLogEnabled", required=true)
      private final Boolean binaryLogEnabled;

    public Boolean getBinaryLogEnabled() {
        return this.binaryLogEnabled;
    }

    /**
     * Whether this configuration is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * This is always `sql#backupConfiguration`.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Location of the backup
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    @Import(name="pointInTimeRecoveryEnabled", required=true)
      private final Boolean pointInTimeRecoveryEnabled;

    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    /**
     * Reserved for future use.
     * 
     */
    @Import(name="replicationLogArchivingEnabled", required=true)
      private final Boolean replicationLogArchivingEnabled;

    public Boolean getReplicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }

    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    @Import(name="transactionLogRetentionDays", required=true)
      private final Integer transactionLogRetentionDays;

    public Integer getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    public BackupConfigurationResponse(
        BackupRetentionSettingsResponse backupRetentionSettings,
        Boolean binaryLogEnabled,
        Boolean enabled,
        String kind,
        String location,
        Boolean pointInTimeRecoveryEnabled,
        Boolean replicationLogArchivingEnabled,
        String startTime,
        Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings, "expected parameter 'backupRetentionSettings' to be non-null");
        this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled, "expected parameter 'binaryLogEnabled' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled, "expected parameter 'pointInTimeRecoveryEnabled' to be non-null");
        this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled, "expected parameter 'replicationLogArchivingEnabled' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays, "expected parameter 'transactionLogRetentionDays' to be non-null");
    }

    private BackupConfigurationResponse() {
        this.backupRetentionSettings = null;
        this.binaryLogEnabled = null;
        this.enabled = null;
        this.kind = null;
        this.location = null;
        this.pointInTimeRecoveryEnabled = null;
        this.replicationLogArchivingEnabled = null;
        this.startTime = null;
        this.transactionLogRetentionDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupRetentionSettingsResponse backupRetentionSettings;
        private Boolean binaryLogEnabled;
        private Boolean enabled;
        private String kind;
        private String location;
        private Boolean pointInTimeRecoveryEnabled;
        private Boolean replicationLogArchivingEnabled;
        private String startTime;
        private Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.replicationLogArchivingEnabled = defaults.replicationLogArchivingEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder backupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }
        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }
        public Builder replicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }        public BackupConfigurationResponse build() {
            return new BackupConfigurationResponse(backupRetentionSettings, binaryLogEnabled, enabled, kind, location, pointInTimeRecoveryEnabled, replicationLogArchivingEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
