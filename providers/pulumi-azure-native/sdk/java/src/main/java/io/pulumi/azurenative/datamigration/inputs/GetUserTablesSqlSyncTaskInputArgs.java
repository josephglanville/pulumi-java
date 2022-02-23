// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlSyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GetUserTablesSqlSyncTaskInputArgs Empty = new GetUserTablesSqlSyncTaskInputArgs();

    /**
     * List of source database names to collect tables for
     * 
     */
    @InputImport(name="selectedSourceDatabases", required=true)
      private final Input<List<String>> selectedSourceDatabases;

    public Input<List<String>> getSelectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    /**
     * List of target database names to collect tables for
     * 
     */
    @InputImport(name="selectedTargetDatabases", required=true)
      private final Input<List<String>> selectedTargetDatabases;

    public Input<List<String>> getSelectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    /**
     * Connection information for SQL Server
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
      private final Input<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for SQL DB
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
      private final Input<SqlConnectionInfoArgs> targetConnectionInfo;

    public Input<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public GetUserTablesSqlSyncTaskInputArgs(
        Input<List<String>> selectedSourceDatabases,
        Input<List<String>> selectedTargetDatabases,
        Input<SqlConnectionInfoArgs> sourceConnectionInfo,
        Input<SqlConnectionInfoArgs> targetConnectionInfo) {
        this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases, "expected parameter 'selectedSourceDatabases' to be non-null");
        this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases, "expected parameter 'selectedTargetDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private GetUserTablesSqlSyncTaskInputArgs() {
        this.selectedSourceDatabases = Input.empty();
        this.selectedTargetDatabases = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> selectedSourceDatabases;
        private Input<List<String>> selectedTargetDatabases;
        private Input<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<SqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedSourceDatabases = defaults.selectedSourceDatabases;
    	      this.selectedTargetDatabases = defaults.selectedTargetDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedSourceDatabases(Input<List<String>> selectedSourceDatabases) {
            this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases);
            return this;
        }

        public Builder setSelectedSourceDatabases(List<String> selectedSourceDatabases) {
            this.selectedSourceDatabases = Input.of(Objects.requireNonNull(selectedSourceDatabases));
            return this;
        }

        public Builder setSelectedTargetDatabases(Input<List<String>> selectedTargetDatabases) {
            this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases);
            return this;
        }

        public Builder setSelectedTargetDatabases(List<String> selectedTargetDatabases) {
            this.selectedTargetDatabases = Input.of(Objects.requireNonNull(selectedTargetDatabases));
            return this;
        }

        public Builder setSourceConnectionInfo(Input<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder setTargetConnectionInfo(Input<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public GetUserTablesSqlSyncTaskInputArgs build() {
            return new GetUserTablesSqlSyncTaskInputArgs(selectedSourceDatabases, selectedTargetDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
