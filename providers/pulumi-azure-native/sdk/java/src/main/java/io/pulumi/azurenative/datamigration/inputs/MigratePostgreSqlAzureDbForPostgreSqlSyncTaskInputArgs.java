// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.PostgreSqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that migrates PostgreSQL databases to Azure Database for PostgreSQL for online migrations
 * 
 */
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs();

    /**
     * Databases to migrate
     * 
     */
    @InputImport(name="selectedDatabases", required=true)
      private final Input<List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs>> selectedDatabases;

    public Input<List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs>> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source PostgreSQL
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
      private final Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<PostgreSqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target Azure Database for PostgreSQL
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
      private final Input<PostgreSqlConnectionInfoArgs> targetConnectionInfo;

    public Input<PostgreSqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs(
        Input<List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs>> selectedDatabases,
        Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo,
        Input<PostgreSqlConnectionInfoArgs> targetConnectionInfo) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs() {
        this.selectedDatabases = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs>> selectedDatabases;
        private Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<PostgreSqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedDatabases(Input<List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs>> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSelectedDatabases(List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputArgs> selectedDatabases) {
            this.selectedDatabases = Input.of(Objects.requireNonNull(selectedDatabases));
            return this;
        }

        public Builder setSourceConnectionInfo(Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setSourceConnectionInfo(PostgreSqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder setTargetConnectionInfo(Input<PostgreSqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(PostgreSqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
