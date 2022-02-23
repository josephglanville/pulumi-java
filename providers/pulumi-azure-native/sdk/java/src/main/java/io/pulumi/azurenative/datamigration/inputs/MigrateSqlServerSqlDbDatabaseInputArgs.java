// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database specific information for SQL to Azure SQL DB migration task inputs
 * 
 */
public final class MigrateSqlServerSqlDbDatabaseInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbDatabaseInputArgs Empty = new MigrateSqlServerSqlDbDatabaseInputArgs();

    /**
     * Whether to set database read only before migration
     * 
     */
    @InputImport(name="makeSourceDbReadOnly")
      private final @Nullable Input<Boolean> makeSourceDbReadOnly;

    public Input<Boolean> getMakeSourceDbReadOnly() {
        return this.makeSourceDbReadOnly == null ? Input.empty() : this.makeSourceDbReadOnly;
    }

    /**
     * Name of the database
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Mapping of source to target tables
     * 
     */
    @InputImport(name="tableMap")
      private final @Nullable Input<Map<String,String>> tableMap;

    public Input<Map<String,String>> getTableMap() {
        return this.tableMap == null ? Input.empty() : this.tableMap;
    }

    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    @InputImport(name="targetDatabaseName")
      private final @Nullable Input<String> targetDatabaseName;

    public Input<String> getTargetDatabaseName() {
        return this.targetDatabaseName == null ? Input.empty() : this.targetDatabaseName;
    }

    public MigrateSqlServerSqlDbDatabaseInputArgs(
        @Nullable Input<Boolean> makeSourceDbReadOnly,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tableMap,
        @Nullable Input<String> targetDatabaseName) {
        this.makeSourceDbReadOnly = makeSourceDbReadOnly;
        this.name = name;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
    }

    private MigrateSqlServerSqlDbDatabaseInputArgs() {
        this.makeSourceDbReadOnly = Input.empty();
        this.name = Input.empty();
        this.tableMap = Input.empty();
        this.targetDatabaseName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbDatabaseInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> makeSourceDbReadOnly;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tableMap;
        private @Nullable Input<String> targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbDatabaseInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.makeSourceDbReadOnly = defaults.makeSourceDbReadOnly;
    	      this.name = defaults.name;
    	      this.tableMap = defaults.tableMap;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder setMakeSourceDbReadOnly(@Nullable Input<Boolean> makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = makeSourceDbReadOnly;
            return this;
        }

        public Builder setMakeSourceDbReadOnly(@Nullable Boolean makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = Input.ofNullable(makeSourceDbReadOnly);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTableMap(@Nullable Input<Map<String,String>> tableMap) {
            this.tableMap = tableMap;
            return this;
        }

        public Builder setTableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = Input.ofNullable(tableMap);
            return this;
        }

        public Builder setTargetDatabaseName(@Nullable Input<String> targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public Builder setTargetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = Input.ofNullable(targetDatabaseName);
            return this;
        }
        public MigrateSqlServerSqlDbDatabaseInputArgs build() {
            return new MigrateSqlServerSqlDbDatabaseInputArgs(makeSourceDbReadOnly, name, tableMap, targetDatabaseName);
        }
    }
}
