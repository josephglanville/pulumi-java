// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.PostgreSqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Input for the task that validates connection to PostgreSQL and source server requirements
 * 
 */
public final class ConnectToSourcePostgreSqlSyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskInputArgs Empty = new ConnectToSourcePostgreSqlSyncTaskInputArgs();

    /**
     * Connection information for source PostgreSQL server
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
      private final Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<PostgreSqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    public ConnectToSourcePostgreSqlSyncTaskInputArgs(Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
    }

    private ConnectToSourcePostgreSqlSyncTaskInputArgs() {
        this.sourceConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
        }

        public Builder setSourceConnectionInfo(Input<PostgreSqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setSourceConnectionInfo(PostgreSqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }
        public ConnectToSourcePostgreSqlSyncTaskInputArgs build() {
            return new ConnectToSourcePostgreSqlSyncTaskInputArgs(sourceConnectionInfo);
        }
    }
}
