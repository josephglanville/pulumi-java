// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUserTablesSqlSyncTaskInputResponse {
    private final List<String> selectedSourceDatabases;
    private final List<String> selectedTargetDatabases;
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"selectedSourceDatabases","selectedTargetDatabases","sourceConnectionInfo","targetConnectionInfo"})
    private GetUserTablesSqlSyncTaskInputResponse(
        List<String> selectedSourceDatabases,
        List<String> selectedTargetDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases);
        this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases);
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    public List<String> getSelectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }
    public List<String> getSelectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> selectedSourceDatabases;
        private List<String> selectedTargetDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedSourceDatabases = defaults.selectedSourceDatabases;
    	      this.selectedTargetDatabases = defaults.selectedTargetDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedSourceDatabases(List<String> selectedSourceDatabases) {
            this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases);
            return this;
        }

        public Builder setSelectedTargetDatabases(List<String> selectedTargetDatabases) {
            this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public GetUserTablesSqlSyncTaskInputResponse build() {
            return new GetUserTablesSqlSyncTaskInputResponse(selectedSourceDatabases, selectedTargetDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}