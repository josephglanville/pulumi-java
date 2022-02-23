// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database specific information for SQL to Azure SQL DB sync migration task inputs
 * 
 */
public final class MigrateSqlServerSqlDbSyncDatabaseInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbSyncDatabaseInputResponse Empty = new MigrateSqlServerSqlDbSyncDatabaseInputResponse();

    /**
     * Unique identifier for database
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Migration settings which tune the migration behavior
     * 
     */
    @InputImport(name="migrationSetting")
      private final @Nullable Map<String,String> migrationSetting;

    public Map<String,String> getMigrationSetting() {
        return this.migrationSetting == null ? Map.of() : this.migrationSetting;
    }

    /**
     * Name of database
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Schema name to be migrated
     * 
     */
    @InputImport(name="schemaName")
      private final @Nullable String schemaName;

    public Optional<String> getSchemaName() {
        return this.schemaName == null ? Optional.empty() : Optional.ofNullable(this.schemaName);
    }

    /**
     * Source settings to tune source endpoint migration behavior
     * 
     */
    @InputImport(name="sourceSetting")
      private final @Nullable Map<String,String> sourceSetting;

    public Map<String,String> getSourceSetting() {
        return this.sourceSetting == null ? Map.of() : this.sourceSetting;
    }

    /**
     * Mapping of source to target tables
     * 
     */
    @InputImport(name="tableMap")
      private final @Nullable Map<String,String> tableMap;

    public Map<String,String> getTableMap() {
        return this.tableMap == null ? Map.of() : this.tableMap;
    }

    /**
     * Target database name
     * 
     */
    @InputImport(name="targetDatabaseName")
      private final @Nullable String targetDatabaseName;

    public Optional<String> getTargetDatabaseName() {
        return this.targetDatabaseName == null ? Optional.empty() : Optional.ofNullable(this.targetDatabaseName);
    }

    /**
     * Target settings to tune target endpoint migration behavior
     * 
     */
    @InputImport(name="targetSetting")
      private final @Nullable Map<String,String> targetSetting;

    public Map<String,String> getTargetSetting() {
        return this.targetSetting == null ? Map.of() : this.targetSetting;
    }

    public MigrateSqlServerSqlDbSyncDatabaseInputResponse(
        @Nullable String id,
        @Nullable Map<String,String> migrationSetting,
        @Nullable String name,
        @Nullable String schemaName,
        @Nullable Map<String,String> sourceSetting,
        @Nullable Map<String,String> tableMap,
        @Nullable String targetDatabaseName,
        @Nullable Map<String,String> targetSetting) {
        this.id = id;
        this.migrationSetting = migrationSetting;
        this.name = name;
        this.schemaName = schemaName;
        this.sourceSetting = sourceSetting;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
        this.targetSetting = targetSetting;
    }

    private MigrateSqlServerSqlDbSyncDatabaseInputResponse() {
        this.id = null;
        this.migrationSetting = Map.of();
        this.name = null;
        this.schemaName = null;
        this.sourceSetting = Map.of();
        this.tableMap = Map.of();
        this.targetDatabaseName = null;
        this.targetSetting = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,String> migrationSetting;
        private @Nullable String name;
        private @Nullable String schemaName;
        private @Nullable Map<String,String> sourceSetting;
        private @Nullable Map<String,String> tableMap;
        private @Nullable String targetDatabaseName;
        private @Nullable Map<String,String> targetSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncDatabaseInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.migrationSetting = defaults.migrationSetting;
    	      this.name = defaults.name;
    	      this.schemaName = defaults.schemaName;
    	      this.sourceSetting = defaults.sourceSetting;
    	      this.tableMap = defaults.tableMap;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
    	      this.targetSetting = defaults.targetSetting;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMigrationSetting(@Nullable Map<String,String> migrationSetting) {
            this.migrationSetting = migrationSetting;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSchemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        public Builder setSourceSetting(@Nullable Map<String,String> sourceSetting) {
            this.sourceSetting = sourceSetting;
            return this;
        }

        public Builder setTableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = tableMap;
            return this;
        }

        public Builder setTargetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public Builder setTargetSetting(@Nullable Map<String,String> targetSetting) {
            this.targetSetting = targetSetting;
            return this;
        }
        public MigrateSqlServerSqlDbSyncDatabaseInputResponse build() {
            return new MigrateSqlServerSqlDbSyncDatabaseInputResponse(id, migrationSetting, name, schemaName, sourceSetting, tableMap, targetDatabaseName, targetSetting);
        }
    }
}
