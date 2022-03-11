// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbSyncTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database for online migrations
 * 
 */
public final class MigrateSqlServerSqlDbSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbSyncTaskPropertiesArgs Empty = new MigrateSqlServerSqlDbSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Output<MigrateSqlServerSqlDbSyncTaskInputArgs> input;

    public Output<MigrateSqlServerSqlDbSyncTaskInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.AzureSqlDb.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlDbSyncTaskPropertiesArgs(
        @Nullable Output<MigrateSqlServerSqlDbSyncTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateSqlServerSqlDbSyncTaskPropertiesArgs() {
        this.input = Output.empty();
        this.taskType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MigrateSqlServerSqlDbSyncTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<MigrateSqlServerSqlDbSyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable MigrateSqlServerSqlDbSyncTaskInputArgs input) {
            this.input = Output.ofNullable(input);
            return this;
        }

        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }
        public MigrateSqlServerSqlDbSyncTaskPropertiesArgs build() {
            return new MigrateSqlServerSqlDbSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
