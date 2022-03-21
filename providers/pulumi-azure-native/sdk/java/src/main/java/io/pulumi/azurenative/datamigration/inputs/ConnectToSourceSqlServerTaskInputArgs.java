// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.enums.ServerLevelPermissionsGroup;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToSourceSqlServerTaskInputArgs Empty = new ConnectToSourceSqlServerTaskInputArgs();

    /**
     * Permission group for validations
     * 
     */
    @Import(name="checkPermissionsGroup")
      private final @Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup;

    public Output<Either<String,ServerLevelPermissionsGroup>> getCheckPermissionsGroup() {
        return this.checkPermissionsGroup == null ? Output.empty() : this.checkPermissionsGroup;
    }

    /**
     * Flag for whether to collect agent jobs from source server.
     * 
     */
    @Import(name="collectAgentJobs")
      private final @Nullable Output<Boolean> collectAgentJobs;

    public Output<Boolean> getCollectAgentJobs() {
        return this.collectAgentJobs == null ? Output.empty() : this.collectAgentJobs;
    }

    /**
     * Flag for whether to collect logins from source server.
     * 
     */
    @Import(name="collectLogins")
      private final @Nullable Output<Boolean> collectLogins;

    public Output<Boolean> getCollectLogins() {
        return this.collectLogins == null ? Output.empty() : this.collectLogins;
    }

    /**
     * Connection information for Source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    public ConnectToSourceSqlServerTaskInputArgs(
        @Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup,
        @Nullable Output<Boolean> collectAgentJobs,
        @Nullable Output<Boolean> collectLogins,
        Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
        this.checkPermissionsGroup = checkPermissionsGroup;
        this.collectAgentJobs = collectAgentJobs == null ? Output.ofNullable(false) : collectAgentJobs;
        this.collectLogins = collectLogins == null ? Output.ofNullable(false) : collectLogins;
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
    }

    private ConnectToSourceSqlServerTaskInputArgs() {
        this.checkPermissionsGroup = Output.empty();
        this.collectAgentJobs = Output.empty();
        this.collectLogins = Output.empty();
        this.sourceConnectionInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup;
        private @Nullable Output<Boolean> collectAgentJobs;
        private @Nullable Output<Boolean> collectLogins;
        private Output<SqlConnectionInfoArgs> sourceConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkPermissionsGroup = defaults.checkPermissionsGroup;
    	      this.collectAgentJobs = defaults.collectAgentJobs;
    	      this.collectLogins = defaults.collectLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
        }

        public Builder checkPermissionsGroup(@Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup) {
            this.checkPermissionsGroup = checkPermissionsGroup;
            return this;
        }
        public Builder checkPermissionsGroup(@Nullable Either<String,ServerLevelPermissionsGroup> checkPermissionsGroup) {
            this.checkPermissionsGroup = Output.ofNullable(checkPermissionsGroup);
            return this;
        }
        public Builder collectAgentJobs(@Nullable Output<Boolean> collectAgentJobs) {
            this.collectAgentJobs = collectAgentJobs;
            return this;
        }
        public Builder collectAgentJobs(@Nullable Boolean collectAgentJobs) {
            this.collectAgentJobs = Output.ofNullable(collectAgentJobs);
            return this;
        }
        public Builder collectLogins(@Nullable Output<Boolean> collectLogins) {
            this.collectLogins = collectLogins;
            return this;
        }
        public Builder collectLogins(@Nullable Boolean collectLogins) {
            this.collectLogins = Output.ofNullable(collectLogins);
            return this;
        }
        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Output.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }        public ConnectToSourceSqlServerTaskInputArgs build() {
            return new ConnectToSourceSqlServerTaskInputArgs(checkPermissionsGroup, collectAgentJobs, collectLogins, sourceConnectionInfo);
        }
    }
}
