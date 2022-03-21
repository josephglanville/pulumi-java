// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.PostgreSqlConnectionInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse {
    /**
     * Databases to migrate
     * 
     */
    private final List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse> selectedDatabases;
    /**
     * Connection information for source PostgreSQL
     * 
     */
    private final PostgreSqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for target Azure Database for PostgreSQL
     * 
     */
    private final PostgreSqlConnectionInfoResponse targetConnectionInfo;

    @CustomType.Constructor
    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse(
        @CustomType.Parameter("selectedDatabases") List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse> selectedDatabases,
        @CustomType.Parameter("sourceConnectionInfo") PostgreSqlConnectionInfoResponse sourceConnectionInfo,
        @CustomType.Parameter("targetConnectionInfo") PostgreSqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedDatabases = selectedDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * Databases to migrate
     * 
    */
    public List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Connection information for source PostgreSQL
     * 
    */
    public PostgreSqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for target Azure Database for PostgreSQL
     * 
    */
    public PostgreSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse> selectedDatabases;
        private PostgreSqlConnectionInfoResponse sourceConnectionInfo;
        private PostgreSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder selectedDatabases(List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }
        public Builder selectedDatabases(MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }
        public Builder sourceConnectionInfo(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(PostgreSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
