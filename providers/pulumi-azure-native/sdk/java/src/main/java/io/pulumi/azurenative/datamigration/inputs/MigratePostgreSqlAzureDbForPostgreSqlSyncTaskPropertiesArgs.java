// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates PostgreSQL databases to Azure Database for PostgreSQL for online migrations
 * 
 */
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input;

    public Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.PostgreSql.AzureDbForPostgreSql.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs(
        @Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs() {
        this.input = Output.empty();
        this.taskType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs input) {
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
        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
