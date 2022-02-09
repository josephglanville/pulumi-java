// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetUserTablesSqlSyncTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetUserTablesSqlSyncTaskInputResponse Empty = new GetUserTablesSqlSyncTaskInputResponse();

    @InputImport(name="selectedSourceDatabases", required=true)
    private final List<String> selectedSourceDatabases;

    public List<String> getSelectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    @InputImport(name="selectedTargetDatabases", required=true)
    private final List<String> selectedTargetDatabases;

    public List<String> getSelectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    @InputImport(name="sourceConnectionInfo", required=true)
    private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    @InputImport(name="targetConnectionInfo", required=true)
    private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public GetUserTablesSqlSyncTaskInputResponse(
        List<String> selectedSourceDatabases,
        List<String> selectedTargetDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases, "expected parameter 'selectedSourceDatabases' to be non-null");
        this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases, "expected parameter 'selectedTargetDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private GetUserTablesSqlSyncTaskInputResponse() {
        this.selectedSourceDatabases = List.of();
        this.selectedTargetDatabases = List.of();
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
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
