// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.MySqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MigrateMySqlAzureDbForMySqlSyncTaskInputResponse {
    private final List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases;
    private final MySqlConnectionInfoResponse sourceConnectionInfo;
    private final MySqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"selectedDatabases","sourceConnectionInfo","targetConnectionInfo"})
    private MigrateMySqlAzureDbForMySqlSyncTaskInputResponse(
        List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases,
        MySqlConnectionInfoResponse sourceConnectionInfo,
        MySqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    public List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    public MySqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    public MySqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases;
        private MySqlConnectionInfoResponse sourceConnectionInfo;
        private MySqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedDatabases(List<MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(MySqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(MySqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskInputResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}