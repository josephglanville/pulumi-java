// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure SQL DB and target server requirements
 * 
 */
public final class ConnectToTargetSqlSqlDbSyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlSqlDbSyncTaskInputArgs Empty = new ConnectToTargetSqlSqlDbSyncTaskInputArgs();

    /**
     * Connection information for source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target SQL DB
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> targetConnectionInfo;

    public Output<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlSqlDbSyncTaskInputArgs(
        Output<SqlConnectionInfoArgs> sourceConnectionInfo,
        Output<SqlConnectionInfoArgs> targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlSqlDbSyncTaskInputArgs() {
        this.sourceConnectionInfo = Output.empty();
        this.targetConnectionInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlSqlDbSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Output<SqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlSqlDbSyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
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
        }        public ConnectToTargetSqlSqlDbSyncTaskInputArgs build() {
            return new ConnectToTargetSqlSqlDbSyncTaskInputArgs(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
