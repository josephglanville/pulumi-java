// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.MigrationValidationOptionsArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbTaskInputArgs Empty = new MigrateSqlServerSqlDbTaskInputArgs();

    /**
     * Databases to migrate
     * 
     */
    @InputImport(name="selectedDatabases", required=true)
      private final Output<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases;

    public Output<List<MigrateSqlServerSqlDbDatabaseInputArgs>> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Information for connecting to source
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> targetConnectionInfo;

    public Output<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Options for enabling various post migration validations. Available options,
     *  1.) Data Integrity Check: Performs a checksum based comparison on source and target tables after the migration to ensure the correctness of the data.
     *  2.) Schema Validation: Performs a thorough schema comparison between the source and target tables and provides a list of differences between the source and target database, 3.) Query Analysis: Executes a set of queries picked up automatically either from the Query Plan Cache or Query Store and execute them and compares the execution time between the source and target database.
     * 
     */
    @InputImport(name="validationOptions")
      private final @Nullable Output<MigrationValidationOptionsArgs> validationOptions;

    public Output<MigrationValidationOptionsArgs> getValidationOptions() {
        return this.validationOptions == null ? Output.empty() : this.validationOptions;
    }

    public MigrateSqlServerSqlDbTaskInputArgs(
        Output<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases,
        Output<SqlConnectionInfoArgs> sourceConnectionInfo,
        Output<SqlConnectionInfoArgs> targetConnectionInfo,
        @Nullable Output<MigrationValidationOptionsArgs> validationOptions) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
        this.validationOptions = validationOptions;
    }

    private MigrateSqlServerSqlDbTaskInputArgs() {
        this.selectedDatabases = Output.empty();
        this.sourceConnectionInfo = Output.empty();
        this.targetConnectionInfo = Output.empty();
        this.validationOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases;
        private Output<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Output<SqlConnectionInfoArgs> targetConnectionInfo;
        private @Nullable Output<MigrationValidationOptionsArgs> validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder selectedDatabases(Output<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlDbDatabaseInputArgs> selectedDatabases) {
            this.selectedDatabases = Output.of(Objects.requireNonNull(selectedDatabases));
            return this;
        }

        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Output.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder targetConnectionInfo(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Output.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }

        public Builder validationOptions(@Nullable Output<MigrationValidationOptionsArgs> validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public Builder validationOptions(@Nullable MigrationValidationOptionsArgs validationOptions) {
            this.validationOptions = Output.ofNullable(validationOptions);
            return this;
        }
        public MigrateSqlServerSqlDbTaskInputArgs build() {
            return new MigrateSqlServerSqlDbTaskInputArgs(selectedDatabases, sourceConnectionInfo, targetConnectionInfo, validationOptions);
        }
    }
}
